package gd;

import android.graphics.Color;
import com.max.hbresource.color.ColorUsage;
import com.max.hbresource.colorspace.LabColor;
import com.max.hbresource.colorspace.SRGBColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DarkColorTransformer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements gd.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DarkColorTransformer.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119015a;

        static {
            int[] iArr = new int[ColorUsage.valuesCustom().length];
            try {
                iArr[ColorUsage.Foreground.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorUsage.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorUsage.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorUsage.Other.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f119015a = iArr;
        }
    }

    private final int b(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33699m1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iAlpha = Color.alpha(i10);
        LabColor labColorG = hd.b.g(hd.b.f(new SRGBColor(i10)));
        double dMin = Math.min(110.0d - labColorG.c(), 100.0d);
        if (dMin >= labColorG.c()) {
            return i10;
        }
        SRGBColor sRGBColorH = hd.b.f119162a.h(hd.b.b(new LabColor(dMin, labColorG.a(), labColorG.b())));
        sRGBColorH.e(iAlpha);
        return sRGBColorH.f();
    }

    private final int c(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33722n1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iAlpha = Color.alpha(i10);
        LabColor labColorG = hd.b.g(hd.b.f(new SRGBColor(i10)));
        double dMin = Math.min(110.0d - labColorG.c(), 100.0d);
        if (dMin <= labColorG.c()) {
            return i10;
        }
        SRGBColor sRGBColorH = hd.b.f119162a.h(hd.b.b(new LabColor(dMin, labColorG.a(), labColorG.b())));
        sRGBColorH.e(iAlpha);
        return sRGBColorH.f();
    }

    private final int d(int i10) {
        return i10;
    }

    private final int e(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33676l1, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (255 - Color.blue(i10)) | (Color.alpha(i10) << 24) | ((255 - Color.red(i10)) << 16) | ((255 - Color.green(i10)) << 8);
    }

    @Override // gd.a
    public int a(@d ColorUsage usage, int i10) {
        Object[] objArr = {usage, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33653k1, new Class[]{ColorUsage.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(usage, "usage");
        int i11 = a.f119015a[usage.ordinal()];
        if (i11 == 1) {
            return c(i10);
        }
        if (i11 == 2) {
            return b(i10);
        }
        if (i11 == 3) {
            return d(i10);
        }
        if (i11 == 4) {
            return e(i10);
        }
        throw new NoWhenBranchMatchedException();
    }
}
