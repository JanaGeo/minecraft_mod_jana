package com.introjava_jana.mod_minecraft;

import com.introjava_jana.mod_minecraft.entity.custom.KangarooEntity;
import com.introjava_jana.mod_minecraft.entity.model.KangarooModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ModMinecraft.MOD_ID);

        public static final RegistryObject <EntityType<KangarooEntity>> KANGAROO =
            ENTITY_TYPES.register("kangaroo", () ->  EntityType.Builder.<KangarooEntity>of(KangarooEntity::new, MobCategory.CREATURE)
                    .sized(1f,3f)
                    .build(new ResourceLocation(ModMinecraft.MOD_ID, "kangaroo").toString()));




    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
