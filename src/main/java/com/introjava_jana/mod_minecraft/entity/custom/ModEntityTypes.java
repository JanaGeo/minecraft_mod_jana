package com.introjava_jana.mod_minecraft.entity.custom;

import com.introjava_jana.mod_minecraft.ModMinecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ModMinecraft.MOD_ID);

    public static final RegistryObject <EntityType<KangarooEntity>> KANGAROO =
            ENTITY_TYPES.register("kangaroo", () ->  EntityType.Builder.of(KangarooEntity::new, MobCategory.CREATURE)
                    .sized(1f,3f)
                    .build(new ResourceLocation(ModMinecraft.MOD_ID, "kangaroo").toString()));




    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
