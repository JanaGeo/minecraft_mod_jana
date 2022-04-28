package de.introjava.mod_minecraft.client.renderer;

import de.introjava.mod_minecraft.ModMinecraft;
import de.introjava.mod_minecraft.client.renderer.model.KangarooModel;
import de.introjava.mod_minecraft.common.entity.KangarooEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;




public class KangarooRenderer<Type extends KangarooEntity> extends MobRenderer<Type, KangarooModel<Type>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(ModMinecraft.MOD_ID, "textures/entities/kangaroo.png");


    public KangarooRenderer(Context context) {
       super(context, new KangarooModel<>(context.bakeLayer(KangarooModel.LAYER_LOCATION)), 0.5f);
   }


    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
