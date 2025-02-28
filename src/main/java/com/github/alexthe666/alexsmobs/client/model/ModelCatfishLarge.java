package com.github.alexthe666.alexsmobs.client.model;

import com.github.alexthe666.alexsmobs.entity.EntityCatfish;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.google.common.collect.ImmutableList;

public class ModelCatfishLarge extends AdvancedEntityModel<EntityCatfish> {
    private final AdvancedModelBox root;
    private final AdvancedModelBox body;
    private final AdvancedModelBox left_fin;
    private final AdvancedModelBox right_fin;
    private final AdvancedModelBox dorsal_fin;
    private final AdvancedModelBox tail;
    private final AdvancedModelBox tail_fin;
    private final AdvancedModelBox head;
    private final AdvancedModelBox left_BigWhisker;
    private final AdvancedModelBox right_BigWhisker;
    private final AdvancedModelBox left_SmallWhisker;
    private final AdvancedModelBox right_SmallWhisker;

    public ModelCatfishLarge() {
        texWidth = 128;
        texHeight = 128;

        root = new AdvancedModelBox(this);
        root.setRotationPoint(0.0F, 24.0F, 0.0F);


        body = new AdvancedModelBox(this);
        body.setRotationPoint(0.0F, -8.0F, 0.0F);
        root.addChild(body);
        body.setTextureOffset(0, 0).addBox(-10.0F, -7.0F, -14.0F, 20.0F, 15.0F, 26.0F, 0.0F, false);

        left_fin = new AdvancedModelBox(this);
        left_fin.setRotationPoint(10.0F, 5.0F, -5.0F);
        body.addChild(left_fin);
        setRotationAngle(left_fin, 0.0F, 0.0F, 0.6981F);
        left_fin.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -2.0F, 5.0F, 0.0F, 8.0F, 0.0F, false);

        right_fin = new AdvancedModelBox(this);
        right_fin.setRotationPoint(-10.0F, 5.0F, -5.0F);
        body.addChild(right_fin);
        setRotationAngle(right_fin, 0.0F, 0.0F, -0.6981F);
        right_fin.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 0.0F, 8.0F, 0.0F, true);

        dorsal_fin = new AdvancedModelBox(this);
        dorsal_fin.setRotationPoint(0.0F, -7.0F, -5.0F);
        body.addChild(dorsal_fin);
        setRotationAngle(dorsal_fin, -0.0873F, 0.0F, 0.0F);
        dorsal_fin.setTextureOffset(0, 0).addBox(0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 8.0F, 0.0F, false);

        tail = new AdvancedModelBox(this);
        tail.setRotationPoint(0.0F, -2.0F, 13.0F);
        body.addChild(tail);
        tail.setTextureOffset(0, 41).addBox(-6.0F, -5.0F, -1.0F, 12.0F, 11.0F, 20.0F, 0.0F, false);
        tail.setTextureOffset(0, 56).addBox(0.0F, 6.0F, -1.0F, 0.0F, 4.0F, 16.0F, 0.0F, false);
        tail.setTextureOffset(16, 18).addBox(0.0F, -7.0F, 4.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);

        tail_fin = new AdvancedModelBox(this);
        tail_fin.setRotationPoint(0.0F, 0.0F, 17.0F);
        tail.addChild(tail_fin);
        tail_fin.setTextureOffset(44, 18).addBox(0.0F, -10.0F, -5.0F, 0.0F, 17.0F, 23.0F, 0.0F, false);

        head = new AdvancedModelBox(this);
        head.setRotationPoint(0.0F, -5.0F, -15.0F);
        body.addChild(head);
        head.setTextureOffset(56, 64).addBox(-9.5F, -2.0F, -7.0F, 19.0F, 13.0F, 8.0F, 0.0F, false);

        left_BigWhisker = new AdvancedModelBox(this);
        left_BigWhisker.setRotationPoint(9.5F, 6.0F, -5.0F);
        head.addChild(left_BigWhisker);
        setRotationAngle(left_BigWhisker, 0.0F, -0.4363F, 0.2618F);
        left_BigWhisker.setTextureOffset(66, 0).addBox(0.0F, 0.0F, 0.0F, 15.0F, 8.0F, 0.0F, 0.0F, false);

        right_BigWhisker = new AdvancedModelBox(this);
        right_BigWhisker.setRotationPoint(-9.5F, 6.0F, -5.0F);
        head.addChild(right_BigWhisker);
        setRotationAngle(right_BigWhisker, 0.0F, 0.4363F, -0.2618F);
        right_BigWhisker.setTextureOffset(66, 0).addBox(-15.0F, 0.0F, 0.0F, 15.0F, 8.0F, 0.0F, 0.0F, true);

        left_SmallWhisker = new AdvancedModelBox(this);
        left_SmallWhisker.setRotationPoint(9.5F, 8.0F, -6.0F);
        head.addChild(left_SmallWhisker);
        setRotationAngle(left_SmallWhisker, 0.0F, 0.0436F, 0.3054F);
        left_SmallWhisker.setTextureOffset(0, 15).addBox(0.0F, 0.0F, 0.0F, 7.0F, 6.0F, 0.0F, 0.0F, false);

        right_SmallWhisker = new AdvancedModelBox(this);
        right_SmallWhisker.setRotationPoint(-9.5F, 8.0F, -6.0F);
        head.addChild(right_SmallWhisker);
        setRotationAngle(right_SmallWhisker, 0.0F, -0.0436F, -0.3054F);
        right_SmallWhisker.setTextureOffset(0, 15).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 6.0F, 0.0F, 0.0F, true);
        this.updateDefaultPose();
    }

    @Override
    public void setupAnim(EntityCatfish entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.resetToDefaultPose();
        float idleSpeed = 0.2F;
        float idleDegree = 0.25F;
        float swimSpeed = 0.55F;
        float swimDegree = 0.75F;
        AdvancedModelBox[] tailBoxes = new AdvancedModelBox[]{body, tail, tail_fin};
        this.chainSwing(tailBoxes, swimSpeed, swimDegree * 0.9F, -2.5F, limbSwing, limbSwingAmount);
        this.swing(head, swimSpeed, swimDegree * 0.2F, true, 2F, 0, limbSwing, limbSwingAmount);
        this.flap(left_fin, swimSpeed, swimDegree, false, 4, -0.6F, limbSwing, limbSwingAmount);
        this.flap(right_fin, swimSpeed, swimDegree, true, 4, -0.6F, limbSwing, limbSwingAmount);
        this.bob(body, idleSpeed, idleDegree, false, ageInTicks, 1);
        this.flap(left_fin, idleSpeed, idleDegree, false, 4, -0.1F, ageInTicks, 1);
        this.flap(right_fin, idleSpeed, idleDegree, true, 4, -0.1F, ageInTicks, 1);
        this.swing(left_BigWhisker, idleSpeed, idleDegree, false, 2, 0.1F, ageInTicks, 1);
        this.swing(right_BigWhisker, idleSpeed, idleDegree, true, 2, 0.1F, ageInTicks, 1);
        this.swing(left_SmallWhisker, idleSpeed, idleDegree, false, 3, 0.1F, ageInTicks, 1);
        this.swing(right_SmallWhisker, idleSpeed, idleDegree, true, 3, 0.1F, ageInTicks, 1);
        this.chainSwing(tailBoxes, idleSpeed, idleDegree * 0.1F, -2.5F, ageInTicks, 1);  }

    @Override
    public Iterable<BasicModelPart> parts() {
        return ImmutableList.of(root);
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(root, head, body, dorsal_fin, tail, left_fin, right_fin, left_BigWhisker, right_BigWhisker, left_SmallWhisker, right_SmallWhisker, tail_fin);
    }

    public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
        AdvancedModelBox.rotateAngleX = x;
        AdvancedModelBox.rotateAngleY = y;
        AdvancedModelBox.rotateAngleZ = z;
    }
}
