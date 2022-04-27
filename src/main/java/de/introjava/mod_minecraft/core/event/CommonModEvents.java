package de.introjava.mod_minecraft.core.event;


import de.introjava.mod_minecraft.ModMinecraft;
import de.introjava.mod_minecraft.common.entity.KangarooEntity;
import de.introjava.mod_minecraft.core.init.ModEntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = ModMinecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityInit.KANGAROO.get(), KangarooEntity.createAttributes().build());

    }
}
