package hd;

import bb.c;
import com.max.hbresource.colorspace.LabColor;
import com.max.hbresource.colorspace.SRGBColor;
import com.max.hbresource.colorspace.XYZColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import fi.u;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: ColorSpaceTransformer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f119162a = new b();
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    private final double a(double d10) {
        Object[] objArr = {new Double(d10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.f33791q1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Double) patchProxyResultProxy.result).doubleValue();
        }
        return d10 <= 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
    }

    @d
    @m
    public static final XYZColor b(@d LabColor src) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{src}, null, changeQuickRedirect, true, c.k.f33901v1, new Class[]{LabColor.class}, XYZColor.class);
        if (patchProxyResultProxy.isSupported) {
            return (XYZColor) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        double dC = (src.c() + ((double) 16)) / ((double) 116);
        double dA = (src.a() / ((double) 500)) + dC;
        double dB = dC - (src.b() / ((double) 200));
        b bVar = f119162a;
        return new XYZColor(bVar.e(dA) * 0.95047d, bVar.e(dC) * 1.0d, bVar.e(dB) * 1.08883d);
    }

    private final int c(double d10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Double(d10)}, this, changeQuickRedirect, false, c.k.f33835s1, new Class[]{Double.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return u.B((int) (((d10 <= 0.0031308d ? d10 * 12.92d : (Math.pow(d10, 0.41666d) * ((double) 1.055f)) - ((double) 0.055f)) * ((double) 255)) + ((double) 0.5f)), 255);
    }

    private final double d(double d10) {
        Object[] objArr = {new Double(d10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.f33879u1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Double) patchProxyResultProxy.result).doubleValue();
        }
        return d10 > 0.008856d ? Math.pow(d10, 0.3333333333333333d) : (d10 * 7.797037d) + 0.09638554216d;
    }

    private final double e(double d10) {
        Object[] objArr = {new Double(d10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.f33923w1, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Double) patchProxyResultProxy.result).doubleValue();
        }
        return d10 > Math.pow(0.008856d, 3.0d) ? Math.pow(d10, 3.0d) : ((d10 * ((double) 116)) - ((double) 16)) / 903.3d;
    }

    @d
    @m
    public static final XYZColor f(@d SRGBColor src) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{src}, null, changeQuickRedirect, true, c.k.f33768p1, new Class[]{SRGBColor.class}, XYZColor.class);
        if (patchProxyResultProxy.isSupported) {
            return (XYZColor) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        b bVar = f119162a;
        double dA = bVar.a(((double) src.d()) / 255.0d);
        double dA2 = bVar.a(((double) src.c()) / 255.0d);
        double dA3 = bVar.a(((double) src.b()) / 255.0d);
        double[] dArr = {0.4124564d, 0.3575761d, 0.1804375d, 0.0d, 0.2126729d, 0.7151522d, 0.072175d, 0.0d, 0.0193339d, 0.119192d, 0.9503041d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d};
        return new XYZColor((dArr[0] * dA) + (dArr[1] * dA2) + (dArr[2] * dA3), (dArr[4] * dA) + (dArr[5] * dA2) + (dArr[6] * dA3), (dA * dArr[8]) + (dA2 * dArr[9]) + (dA3 * dArr[10]));
    }

    @d
    @m
    public static final LabColor g(@d XYZColor src) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{src}, null, changeQuickRedirect, true, c.k.f33857t1, new Class[]{XYZColor.class}, LabColor.class);
        if (patchProxyResultProxy.isSupported) {
            return (LabColor) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        b bVar = f119162a;
        double d10 = bVar.d(src.a() / 0.95047d);
        double d11 = bVar.d(src.b() / 1.0d);
        return new LabColor(u.s(0.0d, (((double) 116) * d11) - ((double) 16)), (d10 - d11) * ((double) 500.0f), (d11 - bVar.d(src.c() / 108.883d)) * ((double) 200.0f));
    }

    @d
    public final SRGBColor h(@d XYZColor src) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{src}, this, changeQuickRedirect, false, c.k.f33813r1, new Class[]{XYZColor.class}, SRGBColor.class);
        if (patchProxyResultProxy.isSupported) {
            return (SRGBColor) patchProxyResultProxy.result;
        }
        f0.p(src, "src");
        double dA = src.a() / 95.047d;
        double dB = src.b() / 100.0d;
        double dC = src.c() / 108.883d;
        return new SRGBColor(0, c((3.2406d * dA) + ((-1.5372d) * dB) + ((-0.4986d) * dC)), c(((-0.9689d) * dA) + (1.8758d * dB) + (0.0415d * dC)), c((dA * 0.0557d) + (dB * (-0.204d)) + (dC * 1.057d)), 1, null);
    }
}
