package com.GEECTECH;

public class Warrior extends  Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getSimpleName() + " применил супер удар " + superAbilityType);
    }


}
