package ue;

import android.graphics.Path;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import fi.u;

/* JADX INFO: compiled from: ShapeUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f140794a = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    @d
    public final Path a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15), new Float(f16), new Float(f17)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Sh, new Class[]{cls, cls, cls, cls, cls, cls, cls, cls}, Path.class);
        if (patchProxyResultProxy.isSupported) {
            return (Path) patchProxyResultProxy.result;
        }
        float f18 = f12 - f10;
        float f19 = f13 - f11;
        float fA = u.A(f18, f19);
        float f20 = fA / 2.0f;
        float fA2 = u.A(u.t(f14, 0.0f), f20);
        float fA3 = u.A(u.t(f15, 0.0f), f20);
        float fA4 = u.A(u.t(f16, 0.0f), f20);
        float fA5 = u.A(u.t(f17, 0.0f), f20);
        Path path = new Path();
        if (fA2 == fA3) {
            if (fA3 == fA4) {
                if (fA4 == fA5) {
                    if (fA2 == fA / ((float) 2)) {
                        path.addCircle(f10 + f20, f11 + f20, f20, Path.Direction.CW);
                        return path;
                    }
                }
            }
        }
        path.moveTo(f12, f11 + fA3);
        if (fA3 > 0.0f) {
            float f21 = -fA3;
            path.rQuadTo(0.0f, f21, f21, f21);
        } else {
            float f22 = -fA3;
            path.rLineTo(0.0f, f22);
            path.rLineTo(f22, 0.0f);
        }
        path.rLineTo(-((f18 - fA3) - fA2), 0.0f);
        if (fA2 > 0.0f) {
            float f23 = -fA2;
            path.rQuadTo(f23, 0.0f, f23, fA2);
        } else {
            path.rLineTo(-fA2, 0.0f);
            path.rLineTo(0.0f, fA2);
        }
        path.rLineTo(0.0f, (f19 - fA2) - fA5);
        if (fA5 > 0.0f) {
            path.rQuadTo(0.0f, fA5, fA5, fA5);
        } else {
            path.rLineTo(0.0f, fA5);
            path.rLineTo(fA5, 0.0f);
        }
        path.rLineTo((f18 - fA5) - fA4, 0.0f);
        if (fA4 > 0.0f) {
            path.rQuadTo(fA4, 0.0f, fA4, -fA4);
        } else {
            path.rLineTo(fA4, 0.0f);
            path.rLineTo(0.0f, -fA4);
        }
        path.rLineTo(0.0f, -((f19 - fA4) - fA3));
        path.close();
        return path;
    }
}
