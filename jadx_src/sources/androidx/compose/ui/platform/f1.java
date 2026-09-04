package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.ComposerKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NestedScrollInteropConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0003H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a%\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0003*\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\t8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"", "e", androidx.constraintlayout.core.motion.utils.w.c.R, "", "f", "i", "l", "", "consumed", "Lb1/f;", "available", "j", "([IJ)J", "Landroidx/compose/ui/input/nestedscroll/c;", "k", "(I)I", "Landroidx/compose/ui/input/nestedscroll/b;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/input/nestedscroll/b;", ak.av, "F", "ScrollingAxesThreshold", "g", "(J)I", "scrollAxes", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f15855a = 0.5f;

    private static final float e(float f10) {
        return (float) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }

    public static final int f(float f10) {
        return ((int) e(f10)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(long j10) {
        int i10 = Math.abs(b1.f.p(j10)) >= 0.5f ? 1 : 0;
        return Math.abs(b1.f.r(j10)) >= 0.5f ? i10 | 2 : i10;
    }

    @androidx.compose.ui.g
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.input.nestedscroll.b h(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1471602047);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1471602047, i10, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
        pVar.T(1157296644);
        boolean zS = pVar.s(view);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new e1(view);
            pVar.N(objU);
        }
        pVar.c0();
        e1 e1Var = (e1) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return e1Var;
    }

    private static final float i(int i10) {
        return i10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(int[] iArr, long j10) {
        return b1.g.a(b1.f.p(j10) >= 0.0f ? fi.u.A(i(iArr[0]), b1.f.p(j10)) : fi.u.t(i(iArr[0]), b1.f.p(j10)), b1.f.r(j10) >= 0.0f ? fi.u.A(i(iArr[1]), b1.f.r(j10)) : fi.u.t(i(iArr[1]), b1.f.r(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i10) {
        return !androidx.compose.ui.input.nestedscroll.c.g(i10, androidx.compose.ui.input.nestedscroll.c.INSTANCE.a()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f10) {
        return f10 * (-1.0f);
    }
}
