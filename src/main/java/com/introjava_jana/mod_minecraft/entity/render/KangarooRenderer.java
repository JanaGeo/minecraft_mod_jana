package com.introjava_jana.mod_minecraft.entity.render;

import com.introjava_jana.mod_minecraft.entity.custom.KangarooEntity;
import net.minecraft.resources.ResourceLocation;

public class KangarooRenderer extends MobRenderer<KangarooEntity, KangarooModel<KangarooEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/pigeon.png");

    public KangarooRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new KangarooModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(KangarooEntity entity) {
        return TEXTURE;
    }
}{
}
