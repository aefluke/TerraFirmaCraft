/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.client.model.animal;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.dries007.tfc.objects.entity.animal.EntityGrouseTFC;

@SideOnly(Side.CLIENT)
@ParametersAreNonnullByDefault
public class ModelGrouseTFC extends ModelBase
{
    public ModelRenderer tails5;
    public ModelRenderer tails6;
    public ModelRenderer tails3;
    public ModelRenderer tails4;
    public ModelRenderer legL;
    public ModelRenderer body;
    public ModelRenderer tails7;
    public ModelRenderer tails8;
    public ModelRenderer head;
    public ModelRenderer tails1;
    public ModelRenderer bodyTop;
    public ModelRenderer tails2;
    public ModelRenderer legR;
    public ModelRenderer wingR;
    public ModelRenderer wingL;
    public ModelRenderer tails9;
    public ModelRenderer tailBase;
    public ModelRenderer tailFTip;
    public ModelRenderer bill;
    public ModelRenderer maleL;
    public ModelRenderer maleR;
    public ModelRenderer wingRChild;
    public ModelRenderer wingLChild;

    public ModelGrouseTFC()
    {
        textureWidth = 64;
        textureHeight = 32;

        tails9 = new ModelRenderer(this, 54, 22);
        tails9.setRotationPoint(0.4F, 15.0F, 6.1F);
        tails9.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails9, -0.3490658503988659F, 0.13962634015954636F, 1.3962634015954636F);
        wingRChild = new ModelRenderer(this, 18, 20);
        wingRChild.setRotationPoint(0.0F, 0.0F, 2.0F);
        wingRChild.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        tails7 = new ModelRenderer(this, 54, 22);
        tails7.setRotationPoint(0.2F, 15.0F, 5.9F);
        tails7.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails7, -0.3490658503988659F, 0.06981317007977318F, 0.6981317007977318F);
        legR = new ModelRenderer(this, 0, 25);
        legR.setRotationPoint(-2.0F, 20.0F, 2.0F);
        legR.addBox(-1.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
        body = new ModelRenderer(this, 28, 18);
        body.setRotationPoint(0.0F, 17.0F, 1.0F);
        body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        setRotateAngle(body, 1.3962634015954636F, 0.0F, 0.0F);
        tails1 = new ModelRenderer(this, 54, 22);
        tails1.setRotationPoint(-0.4F, 15.0F, 6.1F);
        tails1.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails1, -0.3490658503988659F, -0.13962634015954636F, -1.3962634015954636F);
        legL = new ModelRenderer(this, 0, 25);
        legL.setRotationPoint(1.0F, 20.0F, 2.0F);
        legL.addBox(-1.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
        wingL = new ModelRenderer(this, 14, 23);
        wingL.setRotationPoint(4.0F, 14.5F, 1.0F);
        wingL.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 5, 0.0F);
        wingLChild = new ModelRenderer(this, 18, 20);
        wingLChild.setRotationPoint(-1.0F, 0.0F, 2.0F);
        wingLChild.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        tails3 = new ModelRenderer(this, 54, 22);
        tails3.setRotationPoint(-0.2F, 15.0F, 5.9F);
        tails3.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails3, -0.3490658503988659F, -0.06981317007977318F, -0.6981317007977318F);
        wingR = new ModelRenderer(this, 14, 23);
        wingR.setRotationPoint(-4.0F, 14.5F, 1.0F);
        wingR.addBox(0.0F, 0.0F, -3.0F, 1, 4, 5, 0.0F);
        bill = new ModelRenderer(this, 3, 2);
        bill.setRotationPoint(1.0F, -4.0F, -3.0F);
        bill.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        tailFTip = new ModelRenderer(this, 53, 9);
        tailFTip.setRotationPoint(-0.5F, 0.0F, 0.0F);
        tailFTip.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        maleL = new ModelRenderer(this, 52, 12);
        maleL.setRotationPoint(2.1F, -2.0F, 0.5F);
        maleL.addBox(0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F);
        bodyTop = new ModelRenderer(this, 31, 10);
        bodyTop.setRotationPoint(0.0F, 16.0F, -3.1F);
        bodyTop.addBox(-2.5F, -2.0F, -1.5F, 5, 4, 4, 0.0F);
        setRotateAngle(bodyTop, 0.6108652381980153F, 0.0F, 0.0F);
        tails5 = new ModelRenderer(this, 54, 22);
        tails5.setRotationPoint(0.0F, 15.0F, 5.7F);
        tails5.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails5, -0.3490658503988659F, 0.0F, 0.0F);
        tails6 = new ModelRenderer(this, 54, 22);
        tails6.setRotationPoint(0.1F, 15.0F, 5.8F);
        tails6.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails6, -0.3490658503988659F, 0.03490658503988659F, 0.3490658503988659F);
        maleR = new ModelRenderer(this, 52, 12);
        maleR.setRotationPoint(-2.1F, -2.0F, 0.5F);
        maleR.addBox(0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F);
        tails4 = new ModelRenderer(this, 54, 22);
        tails4.setRotationPoint(-0.1F, 15.0F, 5.8F);
        tails4.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails4, -0.3490658503988659F, -0.03490658503988659F, -0.3490658503988659F);
        tailBase = new ModelRenderer(this, 32, 4);
        tailBase.setRotationPoint(-0.5F, 5.6F, 0.6F);
        tailBase.addBox(-1.5F, -2.0F, -2.0F, 4, 2, 4, 0.0F);
        setRotateAngle(tailBase, -0.1647590813882647F, 0.0F, 0.0F);
        head = new ModelRenderer(this, 0, 6);
        head.setRotationPoint(0.0F, 15.0F, -3.2F);
        head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        tails2 = new ModelRenderer(this, 54, 22);
        tails2.setRotationPoint(-0.3F, 15.0F, 6.0F);
        tails2.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails2, -0.3490658503988659F, -0.10471975511965977F, -1.0471975511965976F);
        tails8 = new ModelRenderer(this, 54, 22);
        tails8.setRotationPoint(0.3F, 15.0F, 6.0F);
        tails8.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 0, 0.0F);
        setRotateAngle(tails8, -0.3490658503988659F, 0.10471975511965977F, 1.0471975511965976F);

        wingR.addChild(wingRChild);
        wingL.addChild(wingLChild);
        head.addChild(bill);
        tailBase.addChild(tailFTip);
        bodyTop.addChild(maleL);
        bodyTop.addChild(maleR);
        body.addChild(tailBase);
    }

    @Override
    public void render(@Nonnull Entity entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, entity);

        EntityGrouseTFC grouse = ((EntityGrouseTFC) entity);

        float percent = (float) grouse.getPercentToAdulthood();
        float ageScale = 2.0F - percent;

        GlStateManager.pushMatrix();
        GlStateManager.scale(1 / ageScale, 1 / ageScale, 1 / ageScale);
        GlStateManager.translate(0.0F, 1.5f - (1.5f * percent), 0f);

        head.render(par7);
        body.render(par7);
        bodyTop.render(par7);
        legL.render(par7);
        legR.render(par7);
        wingR.render(par7);
        wingL.render(par7);
        tails1.render(par7);
        tails2.render(par7);
        tails3.render(par7);
        tails4.render(par7);
        tails5.render(par7);
        tails6.render(par7);
        tails7.render(par7);
        tails8.render(par7);
        tails9.render(par7);
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity ent)
    {
        this.head.rotateAngleX = -(par5 / (180F / (float) Math.PI));
        this.head.rotateAngleY = par4 / (180F / (float) Math.PI);

        legL.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        legR.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
        wingR.rotateAngleZ = par3;
        wingL.rotateAngleZ = -par3;
        wingR.rotateAngleX = 0;
        wingL.rotateAngleX = 0;
        //rightWing.setRotationPoint(-4.0F, 13, 0.0F);
        //leftWing.setRotationPoint(4.0F, 13, 0.0F);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}