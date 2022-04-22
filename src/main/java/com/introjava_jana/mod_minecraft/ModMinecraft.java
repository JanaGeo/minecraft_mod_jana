package com.introjava_jana.mod_minecraft;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModMinecraft.MOD_ID)
public class ModMinecraft {

    public static final String MOD_ID = "modjavakangaroo";

    private static final Logger LOGGER = LogManager.getLogger();

    public ModMinecraft() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntityTypes.ENTITY_TYPES.register(eventBus);

    }
}
