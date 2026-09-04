package com.max.mediaselector.lib.photoview;

import android.widget.ImageView;
import androidx.core.view.q0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
public class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: Util.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f75390a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f75390a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    l() {
    }

    static void a(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.M4, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    static int b(int i10) {
        return (i10 & q0.f21790f) >> 8;
    }

    static boolean c(ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, null, changeQuickRedirect, true, bb.c.m.N4, new Class[]{ImageView.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return imageView.getDrawable() != null;
    }

    static boolean d(ImageView.ScaleType scaleType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{scaleType}, null, changeQuickRedirect, true, bb.c.m.O4, new Class[]{ImageView.ScaleType.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (scaleType == null) {
            return false;
        }
        if (a.f75390a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
