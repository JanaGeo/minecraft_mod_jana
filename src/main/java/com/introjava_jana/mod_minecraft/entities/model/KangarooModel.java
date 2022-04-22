package com.introjava_jana.mod_minecraft.entities.model;

import com.introjava_jana.mod_minecraft.entities.custom.KangarooEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class KangarooModel<T extends KangarooEntity> extends EntityModel<T> {

        public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
        private final ModelPart Head;
        private final ModelPart Body;
        private final ModelPart right_leg;
        private final ModelPart left_leg;
        private final ModelPart tail;
        private final ModelPart right_arm;
        private final ModelPart left_arm;

        public KangarooModel (ModelPart root) {
            Head = root.getChild("Head");
            this.Body = root.getChild("Body");
            this.right_leg = root.getChild("right_leg");
            this.left_leg = root.getChild("left_leg");
            this.tail = root.getChild("tail");
            this.right_arm = root.getChild("right_arm");
            this.left_arm = root.getChild("left_arm");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -1.5113F, -0.6928F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(9, 10).addBox(-1.5F, -2.5113F, -0.6678F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 4).addBox(-1.5F, -0.5113F, 2.0572F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 15.5F, 5.0F, -0.0873F, 0.0F, 0.0F));

            PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 18.5F, 2.0F));

            PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 12).addBox(-2.5F, -3.4F, 7.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, 0.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.3491F, 0.0F, 0.0F));

            PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(16, 6).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 22.0F, 0.0F));

            PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 20).addBox(-4.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.0F, 0.0F, -0.48F, 0.0F, 0.0F));

            PartDefinition cube_r4 = right_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 11).addBox(-3.75F, -5.0F, -2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

            PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 22.0F, 0.0F));

            PartDefinition cube_r5 = left_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -5.0F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(10, 20).addBox(-3.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.0F, 0.0F, -0.48F, 0.0F, 0.0F));

            PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-0.5F, 21.0F, -4.0F));

            PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 16).addBox(-1.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 0.2182F, 0.0F, 0.0F));

            PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 17).addBox(-1.5F, -5.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 0.48F, 0.0F, 0.0F));

            PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -3.05F, -7.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 0.0436F, 0.0F, 0.0F));

            PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 0.5236F, 0.0F, 0.0F));

            PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(14, 21).addBox(-3.0F, -7.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                    .texOffs(19, 15).addBox(-3.0F, -4.75F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(16, 18).addBox(-3.0F, -4.75F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 15).addBox(-3.0F, -7.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 24.0F, 0.0F));

            return LayerDefinition.create(meshdefinition, 16, 16);
        }

        @Override
        public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            Head.render(poseStack, buffer, packedLight, packedOverlay);
            Body.render(poseStack, buffer, packedLight, packedOverlay);
            right_leg.render(poseStack, buffer, packedLight, packedOverlay);
            left_leg.render(poseStack, buffer, packedLight, packedOverlay);
            tail.render(poseStack, buffer, packedLight, packedOverlay);
            right_arm.render(poseStack, buffer, packedLight, packedOverlay);
            left_arm.render(poseStack, buffer, packedLight, packedOverlay);
        }
    }


