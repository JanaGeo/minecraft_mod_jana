package de.introjava.mod_minecraft.core.init;

import de.introjava.mod_minecraft.ModMinecraft;
import de.introjava.mod_minecraft.common.entity.KangarooEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModEntityInit {

    private ModEntityInit() {}

    public static DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ModMinecraft.MOD_ID);

    public static final RegistryObject<EntityType<KangarooEntity>> KANGAROO =
            ENTITIES.register("kangaroo", () -> EntityType.Builder.of(KangarooEntity::new, MobCategory.CREATURE)
                    .sized(3f, 4f)
                    .build(new ResourceLocation(ModMinecraft.MOD_ID, "kangaroo").toString()));

}

