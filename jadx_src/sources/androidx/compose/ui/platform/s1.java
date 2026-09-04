package androidx.compose.ui.platform;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ShapeContainingUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\f\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002\u001a=\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a4\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/f1;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/l1;", "tmpTouchPointPath", "tmpOpPath", "", "b", "Lb1/i;", "rect", "e", "Landroidx/compose/ui/graphics/f1$c;", "touchPointPath", "opPath", "f", "Lb1/k;", ak.av, "Lb1/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", FlutterActivityLaunchConfigs.EXTRA_PATH, "d", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class s1 {
    private static final boolean a(b1.k kVar) {
        return b1.a.m(kVar.t()) + b1.a.m(kVar.u()) <= kVar.v() && b1.a.m(kVar.n()) + b1.a.m(kVar.o()) <= kVar.v() && b1.a.o(kVar.t()) + b1.a.o(kVar.n()) <= kVar.p() && b1.a.o(kVar.u()) + b1.a.o(kVar.o()) <= kVar.p();
    }

    public static final boolean b(@dl.d androidx.compose.ui.graphics.f1 outline, float f10, float f11, @dl.e androidx.compose.ui.graphics.l1 l1Var, @dl.e androidx.compose.ui.graphics.l1 l1Var2) {
        kotlin.jvm.internal.f0.p(outline, "outline");
        if (outline instanceof androidx.compose.ui.graphics.f1.b) {
            return e(((androidx.compose.ui.graphics.f1.b) outline).b(), f10, f11);
        }
        if (outline instanceof androidx.compose.ui.graphics.f1.c) {
            return f((androidx.compose.ui.graphics.f1.c) outline, f10, f11, l1Var, l1Var2);
        }
        if (outline instanceof androidx.compose.ui.graphics.f1.a) {
            return d(((androidx.compose.ui.graphics.f1.a) outline).getPath(), f10, f11, l1Var, l1Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(androidx.compose.ui.graphics.f1 f1Var, float f10, float f11, androidx.compose.ui.graphics.l1 l1Var, androidx.compose.ui.graphics.l1 l1Var2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l1Var = null;
        }
        if ((i10 & 16) != 0) {
            l1Var2 = null;
        }
        return b(f1Var, f10, f11, l1Var, l1Var2);
    }

    private static final boolean d(androidx.compose.ui.graphics.l1 l1Var, float f10, float f11, androidx.compose.ui.graphics.l1 l1Var2, androidx.compose.ui.graphics.l1 l1Var3) {
        b1.i iVar = new b1.i(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (l1Var2 == null) {
            l1Var2 = androidx.compose.ui.graphics.o.a();
        }
        l1Var2.m(iVar);
        if (l1Var3 == null) {
            l1Var3 = androidx.compose.ui.graphics.o.a();
        }
        l1Var3.s(l1Var, l1Var2, androidx.compose.ui.graphics.q1.INSTANCE.b());
        boolean zIsEmpty = l1Var3.isEmpty();
        l1Var3.reset();
        l1Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean e(b1.i iVar, float f10, float f11) {
        return iVar.t() <= f10 && f10 < iVar.x() && iVar.getF30372b() <= f11 && f11 < iVar.j();
    }

    private static final boolean f(androidx.compose.ui.graphics.f1.c cVar, float f10, float f11, androidx.compose.ui.graphics.l1 l1Var, androidx.compose.ui.graphics.l1 l1Var2) {
        b1.k f13848a = cVar.getF13848a();
        if (f10 < f13848a.q() || f10 >= f13848a.r() || f11 < f13848a.s() || f11 >= f13848a.m()) {
            return false;
        }
        if (!a(f13848a)) {
            androidx.compose.ui.graphics.l1 l1VarA = l1Var2 == null ? androidx.compose.ui.graphics.o.a() : l1Var2;
            l1VarA.p(f13848a);
            return d(l1VarA, f10, f11, l1Var, l1Var2);
        }
        float fM = b1.a.m(f13848a.t()) + f13848a.q();
        float fO = b1.a.o(f13848a.t()) + f13848a.s();
        float fR = f13848a.r() - b1.a.m(f13848a.u());
        float fO2 = b1.a.o(f13848a.u()) + f13848a.s();
        float fR2 = f13848a.r() - b1.a.m(f13848a.o());
        float fM2 = f13848a.m() - b1.a.o(f13848a.o());
        float fM3 = f13848a.m() - b1.a.o(f13848a.n());
        float fM4 = b1.a.m(f13848a.n()) + f13848a.q();
        if (f10 < fM && f11 < fO) {
            return g(f10, f11, f13848a.t(), fM, fO);
        }
        if (f10 < fM4 && f11 > fM3) {
            return g(f10, f11, f13848a.n(), fM4, fM3);
        }
        if (f10 > fR && f11 < fO2) {
            return g(f10, f11, f13848a.u(), fR, fO2);
        }
        if (f10 <= fR2 || f11 <= fM2) {
            return true;
        }
        return g(f10, f11, f13848a.o(), fR2, fM2);
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fM = b1.a.m(j10);
        float fO = b1.a.o(j10);
        return ((f14 * f14) / (fM * fM)) + ((f15 * f15) / (fO * fO)) <= 1.0f;
    }
}
