package com.introjava_jana.mod_minecraft.entities.render;

import com.introjava_jana.mod_minecraft.ModMinecraft;
import com.introjava_jana.mod_minecraft.entities.custom.KangarooEntity;
import com.introjava_jana.mod_minecraft.entities.model.KangarooModel;

import net.minecraft.resources.ResourceLocation;

public class KangarooRenderer extends MobRenderer<KangarooEntity, KangarooModel<KangarooModel>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ModMinecraft.MOD_ID, "textures/entity/kangaroo.png");

    public KangarooRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new KangarooModel<>(), 0.2F);
    }


    @Override
    public ResourceLocation getTextureLocation(KangarooEntity entity) {
        return TEXTURE;
    }
}

