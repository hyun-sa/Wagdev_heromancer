package com.wagdev.heromancer.object;

import com.wagdev.heromancer.object.data.Damage;

public class subplayer extends Player{
    public subplayer(){
        super();
        MaxHP=100;     //최대hp
        MaxMP=100;     //최대 mp
        HP=MaxHP;      //현재 hp
        MP=MaxMP;      //현재 mp
        Atk=45;       //공격력
        Mag=30;       //마력
        Def=20;       //방어력
        MRt=15;       //마법 저항력
        subplayer_kind=0;//몹종류
    }

    public subplayer(int[] stat){
        super();
        MaxHP=stat[0];     //최대hp
        MaxMP=stat[1];     //최대 mp
        HP=MaxHP;      //현재 hp
        MP=MaxMP;      //현재 mp
        Atk=stat[2];       //공격력
        Mag=stat[3];       //마력
        Def=stat[4];       //방어력
        MRt=stat[5];       //마법 저항력
        subplayer_kind=stat[6];//몹종류
    }

    @Override
    public Damage Attack() {
        return new Damage(Atk,0,0);//임시등록
    }



    @Override
    public void Die() {
        live=false;
    }
}
