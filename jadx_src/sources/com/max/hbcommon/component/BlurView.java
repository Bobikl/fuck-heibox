package com.max.hbcommon.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: BlurView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BlurView extends AppCompatImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f66948b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurView(@dl.d Context context) {
        this(context, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f66948b = kotlinx.coroutines.r0.a(e1.e());
    }

    public final void d(@dl.d Bitmap bitmap, int i10, int i11, float f10) {
        Object[] objArr = {bitmap, new Integer(i10), new Integer(i11), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31156c6, new Class[]{Bitmap.class, cls, cls, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        kotlinx.coroutines.k.f(this.f66948b, null, null, new BlurView$blur$1(bitmap, i11, i10, this, f10, null), 3, null);
    }

    public final float g(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31203e6, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) (((double) f11) * (((double) 1) - Math.pow(1 - (Math.min(f10, f11) / f11), 1.2d)));
    }

    @dl.e
    public final Bitmap h(@dl.d Bitmap sourceImg, float f10, float f11) {
        Object[] objArr = {sourceImg, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31180d6, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(sourceImg, "sourceImg");
        int[] iArr = new int[sourceImg.getWidth() * sourceImg.getHeight()];
        sourceImg.getPixels(iArr, 0, sourceImg.getWidth(), 0, 0, sourceImg.getWidth(), sourceImg.getHeight());
        int height = (int) (sourceImg.getHeight() * f11);
        float f12 = f10 / height;
        int width = sourceImg.getWidth() * height;
        float f13 = 0.0f;
        float fG = 0.0f;
        for (int i10 = 0; i10 < width; i10++) {
            if (i10 % sourceImg.getWidth() == 0) {
                f13 += f12;
                fG = (g(f13, f10) * (iArr[i10] >>> 24)) / 255.0f;
            }
            iArr[i10] = (((int) Math.max(0.0d, Math.min(255.0d, Math.ceil(fG)))) << 24) | (iArr[i10] & 16777215);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, sourceImg.getWidth(), sourceImg.getHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
