package tallestegg.guardvillagers.client.models;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import tallestegg.guardvillagers.entities.Guard;
import tallestegg.guardvillagers.client.models.GuardModel;

public class GuardArmorModel extends HumanoidModel<Guard> {
    public GuardArmorModel(ModelPart part) {
        super(part);
    }

    public static LayerDefinition createOuterArmorLayer() {
        MeshDefinition meshdefinition = GuardModel.createMesh(new CubeDeformation(1.0F), 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head",
                CubeListBuilder.create().texOffs(0, 0).addBox(-3F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
                PartPose.offset(0.0F, 1.0F, 0.0F));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -0.5F, -1.5F, 8.0F, 8.0F, 4.0F, new CubeDeformation(2F))
                .texOffs(16, 16).addBox(-4.0F, -1.5F, 0.5F, 8.0F, 8.0F, 4.0F, new CubeDeformation(1.75F))
                .texOffs(16, 16).addBox(-4.0F, 2.8F, -3.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(2.2F))
                .texOffs(16, 16).addBox(-4.0F, 5.8F, -0.05F, 8.0F, 6.0F, 4.0F, new CubeDeformation(2.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.4F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.5F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-3.6F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.5F)).mirror(false), PartPose.offset(-1.9F, 12.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.5F, -2.5F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-0.5F, -2.5F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.25F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
    public static LayerDefinition createInnerArmorLayer() {
        MeshDefinition meshdefinition = GuardModel.createMesh(new CubeDeformation(0.5F), 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.4F, 0.0F, -2.1F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.1F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-3.6F, 0.0F, -2.1F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.1F)).mirror(false), PartPose.offset(-1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
