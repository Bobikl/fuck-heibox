package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ImageCropState.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageCropState implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private float[] matrix;
    private float ratio;
    private float rotateAngle;
    private float scale;

    public ImageCropState() {
        this(0.0f, 0.0f, 0.0f, null, 15, null);
    }

    public ImageCropState(float f10, float f11, float f12, @d float[] matrix) {
        f0.p(matrix, "matrix");
        this.rotateAngle = f10;
        this.scale = f11;
        this.ratio = f12;
        this.matrix = matrix;
    }

    public /* synthetic */ ImageCropState(float f10, float f11, float f12, float[] fArr, int i10, u uVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? new float[9] : fArr);
    }

    public static /* synthetic */ ImageCropState copy$default(ImageCropState imageCropState, float f10, float f11, float f12, float[] fArr, int i10, Object obj) {
        float f13 = f10;
        float f14 = f11;
        float f15 = f12;
        Object[] objArr = {imageCropState, new Float(f13), new Float(f14), new Float(f15), fArr, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50069, new Class[]{ImageCropState.class, cls, cls, cls, float[].class, Integer.TYPE, Object.class}, ImageCropState.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageCropState) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            f13 = imageCropState.rotateAngle;
        }
        if ((i10 & 2) != 0) {
            f14 = imageCropState.scale;
        }
        if ((i10 & 4) != 0) {
            f15 = imageCropState.ratio;
        }
        return imageCropState.copy(f13, f14, f15, (i10 & 8) != 0 ? imageCropState.matrix : fArr);
    }

    public final float component1() {
        return this.rotateAngle;
    }

    public final float component2() {
        return this.scale;
    }

    public final float component3() {
        return this.ratio;
    }

    @d
    public final float[] component4() {
        return this.matrix;
    }

    @d
    public final ImageCropState copy(float f10, float f11, float f12, @d float[] matrix) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50068, new Class[]{cls, cls, cls, float[].class}, ImageCropState.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageCropState) patchProxyResultProxy.result;
        }
        f0.p(matrix, "matrix");
        return new ImageCropState(f10, f11, f12, matrix);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50067, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCropState)) {
            return false;
        }
        ImageCropState imageCropState = (ImageCropState) obj;
        if (!(imageCropState.rotateAngle == this.rotateAngle)) {
            return false;
        }
        if (imageCropState.scale == this.scale) {
            return ((imageCropState.ratio > this.ratio ? 1 : (imageCropState.ratio == this.ratio ? 0 : -1)) == 0) && Arrays.equals(imageCropState.matrix, this.matrix);
        }
        return false;
    }

    @d
    public final float[] getMatrix() {
        return this.matrix;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final float getRotateAngle() {
        return this.rotateAngle;
    }

    public final float getScale() {
        return this.scale;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50071, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((Float.floatToIntBits(this.rotateAngle) * 31) + Float.floatToIntBits(this.scale)) * 31) + Float.floatToIntBits(this.ratio)) * 31) + Arrays.hashCode(this.matrix);
    }

    public final void setMatrix(@d float[] fArr) {
        if (PatchProxy.proxy(new Object[]{fArr}, this, changeQuickRedirect, false, 50066, new Class[]{float[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fArr, "<set-?>");
        this.matrix = fArr;
    }

    public final void setRatio(float f10) {
        this.ratio = f10;
    }

    public final void setRotateAngle(float f10) {
        this.rotateAngle = f10;
    }

    public final void setScale(float f10) {
        this.scale = f10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50070, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageCropState(rotateAngle=" + this.rotateAngle + ", scale=" + this.scale + ", ratio=" + this.ratio + ", matrix=" + Arrays.toString(this.matrix) + ')';
    }
}
