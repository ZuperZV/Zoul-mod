package net.mcreator.soulkiller.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelelytra_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("soul_killer", "modelelytra_converted"),
			"main");
	public final ModelPart wingsflying;
	public final ModelPart Lw;
	public final ModelPart Rw;

	public Modelelytra_Converted(ModelPart root) {
		this.wingsflying = root.getChild("wingsflying");
		this.Lw = root.getChild("Lw");
		this.Rw = root.getChild("Rw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition wingsflying = partdefinition.addOrReplaceChild("wingsflying", CubeListBuilder.create(), PartPose.offset(20.0F, 1.0F, 3.0F));
		PartDefinition right_r1 = wingsflying.addOrReplaceChild("right_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(8.0F, 0.0F, -1.0F, 10.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-36.0F, 4.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition left_r1 = wingsflying.addOrReplaceChild("left_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-34.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Lw = partdefinition.addOrReplaceChild("Lw",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, 5.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition Rw = partdefinition.addOrReplaceChild("Rw",
				CubeListBuilder.create().texOffs(0, 0).addBox(-19.0F, -2.0F, 5.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		wingsflying.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Rw.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Lw.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
