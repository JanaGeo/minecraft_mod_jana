package com.introjava_jana.mod_minecraft.entity.model;// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.introjava_jana.mod_minecraft.entity.custom.KangarooEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;

public class KangarooModel<K extends TamableAnimal> extends EntityModel {
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer right_leg;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_leg;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer right_arm;
    private final ModelRenderer left_arm;
    private Math MathHelper;


    public KangarooModel() {
        int textureWidth = 16;
        int textureHeight = 16;

        head = new ModelRenderer(this);
        head.setRotationPoint(-0.55F, 15.5F, 5.0F);
        setRotationAngle(head, -0.0873F, 0.0F, 0.0F);
        head.setTextureOffset(14, 0);
                head.addBox(-1.5F, -1.5113F, -0.6928F, 2.0F, 2.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(9, 10);
                head.addBox(-1.5F, -2.5113F, -0.6678F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 4);
                head.addBox(-1.5F, -0.5113F, 2.0572F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 18.5F, 2.0F);


        ModelRenderer cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 6.0F, -2.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.829F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(9, 12);
            cube_r1.addBox(-2.5F, -3.4F, 7.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        ModelRenderer cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 6.0F, -2.0F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 0);
                cube_r2.addBox(-3.0F, -7.0F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(-4.0F, 22.0F, 0.0F);
        right_leg.setTextureOffset(16, 6);
            right_leg.addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(4.0F, 2.0F, 0.0F);
        right_leg.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(6, 20);
            cube_r3.addBox(-4.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(4.0F, 2.0F, 0.0F);
        right_leg.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(18, 11);
            cube_r4.addBox(-3.75F, -5.0F, -2.1F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(2.0F, 22.0F, 0.0F);
        left_leg.setTextureOffset(0, 15);
            left_leg.addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(2.5F, 2.0F, 0.0F);
        left_leg.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.48F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(0, 0);
            cube_r5.addBox(-3.75F, -5.0F, -1.7F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r5.setTextureOffset(10, 20);
            cube_r5.addBox(-3.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(-0.5F, 21.0F, -4.0F);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, 3.0F, 4.0F);
        tail.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(6, 16);
            cube_r6.addBox(-1.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 3.0F, 4.0F);
        tail.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.48F, 0.0F, 0.0F);
        cube_r7.setTextureOffset(10, 17);
                cube_r7.addBox(-1.5F, -5.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, 3.0F, 4.0F);
        tail.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(0, 20);
            cube_r8.addBox(-1.0F, -3.05F, -7.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(0.0F, 3.0F, 4.0F);
        tail.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(0, 10);
                cube_r9.addBox(-2.0F, -6.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
        right_arm.setTextureOffset(14, 21);
            right_arm.addBox(-3.0F, -7.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        right_arm.setTextureOffset(19, 15);
            right_arm.addBox(-3.0F, -4.75F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(3.0F, 24.0F, 0.0F);
        left_arm.setTextureOffset(16, 18);
            left_arm.addBox(-3.0F, -4.75F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        left_arm.setTextureOffset(0, 15);
            left_arm.addBox(-3.0F, -7.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
    }

    public KangarooModel(EntityType<KangarooEntity> kangarooEntityEntityType, Level level, ModelRenderer head) {
        this.head = head;
    }

    /**
     * Sets this entity's model rotation angles
     *
     * @param pEntity
     * @param pLimbSwing
     * @param pLimbSwingAmount
     * @param pAgeInTicks
     * @param pNetHeadYaw
     * @param pHeadPitch
     */
    @Override
    public void setupAnim(Entity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

    }

    /**
     * Sets this entity's model rotation angles
     *
     * @param KangarooEntity
     * @param pLimbSwing
     * @param pLimbSwingAmount
     * @param pAgeInTicks
     * @param pNetHeadYaw
     * @param pHeadPitch
     */
    @Override
    public void setupAnim(T KangarooEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

    }

    // @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.head.rotateAngleX = (float) (headPitch * (Math.PI / 188F));
        this.head.rotateAngleY = (float) ((headPitch) * (Math.PI / 180F)));
        this.right_leg.rotateAngleY = (float) (MathHelper.cos(limbSwing * 2.6662F + (float)Math.PI) *2.4F * limbSwingAmount);

    }
        //previously the render function, render code was moved to a method below
    
    
   @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
        right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
        left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    @Override
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {

    }
}