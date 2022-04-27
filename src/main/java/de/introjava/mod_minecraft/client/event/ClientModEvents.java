package de.introjava.mod_minecraft.client.event;


import de.introjava.mod_minecraft.ModMinecraft;
import de.introjava.mod_minecraft.client.renderer.KangarooRenderer;
import de.introjava.mod_minecraft.client.renderer.model.KangarooModel;
import de.introjava.mod_minecraft.core.init.ModEntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModMinecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    private ClientModEvents () {}

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(KangarooModel.LAYER_LOCATION, KangarooModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntityInit.KANGAROO.get(), KangarooRenderer::new);
    }

}
