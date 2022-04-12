package com.introjava_jana.mod_minecraft.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;


import javax.annotation.Nullable;

public class KangarooEntity extends TamableAnimal {
    protected KangarooEntity(EntityType<? extends TamableAnimal> p_21803_, Level p_21804_) {
        super(p_21803_, p_21804_);

    }


    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    @Override
    public boolean alwaysAccepts() {
        return super.alwaysAccepts();
    }


    @Override
    public boolean shouldRiderSit() {
        return super.shouldRiderSit();
    }
}




