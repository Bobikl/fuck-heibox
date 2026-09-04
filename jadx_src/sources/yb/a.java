package yb;

import android.graphics.PointF;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: UnitBezier.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final C1282a f141628g = new C1282a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f141629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f141630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f141631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f141632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f141633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f141634f;

    /* JADX INFO: renamed from: yb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UnitBezier.kt */
    public static final class C1282a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C1282a() {
        }

        public /* synthetic */ C1282a(u uVar) {
            this();
        }

        public final float a(float f10) {
            return 1.0f / (f10 * 200.0f);
        }
    }

    public a(@d PointF controlPoint1, @d PointF controlPoint2) {
        f0.p(controlPoint1, "controlPoint1");
        f0.p(controlPoint2, "controlPoint2");
        float f10 = controlPoint1.x;
        float f11 = f10 * 3.0f;
        this.f141631c = f11;
        float f12 = ((controlPoint2.x - f10) * 3.0f) - f11;
        this.f141630b = f12;
        this.f141629a = (1.0f - f11) - f12;
        float f13 = controlPoint1.y;
        float f14 = f13 * 3.0f;
        this.f141634f = f14;
        float f15 = ((controlPoint2.y - f13) * 3.0f) - f14;
        this.f141633e = f15;
        this.f141632d = (1.0f - f14) - f15;
    }

    public final float a(float f10) {
        return (((this.f141629a * 3.0f * f10) + (this.f141630b * 2.0f)) * f10) + this.f141631c;
    }

    public final float b(float f10) {
        return ((((this.f141629a * f10) + this.f141630b) * f10) + this.f141631c) * f10;
    }

    public final float c(float f10) {
        return ((((this.f141632d * f10) + this.f141633e) * f10) + this.f141634f) * f10;
    }

    public final float d(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Fh, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f12 = f10;
        for (int i10 = 0; i10 < 8; i10++) {
            float fB = b(f12) - f10;
            if (Math.abs(fB) < f11) {
                return f12;
            }
            float fA = a(f12);
            if (Math.abs(fA) < 1.0E-6d) {
                break;
            }
            f12 -= fB / fA;
        }
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        float f15 = f10;
        while (f13 < f14) {
            float fB2 = b(f15);
            if (Math.abs(fB2 - f10) < f11) {
                return f15;
            }
            if (f10 > fB2) {
                f13 = f15;
            } else {
                f14 = f15;
            }
            f15 = ((f14 - f13) * 0.5f) + f13;
        }
        return f15;
    }

    public final float e(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Dh, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : c(d(f10, f141628g.a(1.0f)));
    }

    public final float f(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Eh, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : c(d(f10, f11));
    }
}
