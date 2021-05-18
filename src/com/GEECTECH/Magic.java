package com.GEECTECH;

public class Magic extends  Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getSimpleName() + " применил магию " + superAbilityType);
    }
}

