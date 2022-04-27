package de.introjava.mod_minecraft;

import de.introjava.mod_minecraft.core.init.ModEntityInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModMinecraft.MOD_ID)
public class ModMinecraft {

    public static final String MOD_ID = "modjavakangaroo";

    public ModMinecraft() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntityInit.ENTITIES.register(bus);

    }
}
