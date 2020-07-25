// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer Backleg1;
	private final ModelRenderer Backleg2;
	private final ModelRenderer Frontleg1;
	private final ModelRenderer Frontleg2;
	private final ModelRenderer Body;
	private final ModelRenderer Head;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Backleg1 = new ModelRenderer(this);
		Backleg1.setRotationPoint(-1.0F, 24.0F, 1.0F);
		Backleg1.setTextureOffset(20, 11).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Backleg2 = new ModelRenderer(this);
		Backleg2.setRotationPoint(4.0F, 24.0F, 1.0F);
		Backleg2.setTextureOffset(0, 15).addBox(-3.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Frontleg1 = new ModelRenderer(this);
		Frontleg1.setRotationPoint(-1.0F, 24.0F, -4.0F);
		Frontleg1.setTextureOffset(0, 11).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Frontleg2 = new ModelRenderer(this);
		Frontleg2.setRotationPoint(3.0F, 24.0F, -4.0F);
		Frontleg2.setTextureOffset(0, 4).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(3.0F, 21.0F, -4.0F);
		Body.setTextureOffset(0, 0).addBox(-7.0F, 0.0F, -1.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
		Body.setTextureOffset(0, 11).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(1.0F, 21.0F, -6.0F);
		Head.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Backleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		Backleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		Frontleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		Frontleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Frontleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Frontleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Backleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Backleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}