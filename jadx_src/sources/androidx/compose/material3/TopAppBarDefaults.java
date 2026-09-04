package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#JG\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJG\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\nJG\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJG\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\nJ)\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "Landroidx/compose/material3/c2;", RXScreenCaptureService.KEY_HEIGHT, "(JJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/c2;", ak.av, "f", "e", "Landroidx/compose/material3/TopAppBarState;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/material3/d2;", "g", "(Landroidx/compose/material3/TopAppBarState;Lyh/a;Landroidx/compose/runtime/p;II)Landroidx/compose/material3/d2;", "Landroidx/compose/animation/core/h;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/x;", "flingAnimationSpec", "b", "(Landroidx/compose/material3/TopAppBarState;Lyh/a;Landroidx/compose/animation/core/h;Landroidx/compose/animation/core/x;Landroidx/compose/runtime/p;II)Landroidx/compose/material3/d2;", ak.aF, "Landroidx/compose/foundation/layout/h1;", "d", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TopAppBarDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TopAppBarDefaults f11730a = new TopAppBarDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11731b = 0;

    private TopAppBarDefaults() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final c2 a(long j10, long j11, long j12, long j13, long j14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1896017784);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.a1.f139461a.c(), pVar, 6) : j10;
        long jA = (i11 & 2) != 0 ? ColorSchemeKt.a(o0.f12059a.a(pVar, 6), jK, t0.b1.f139496a.j()) : j11;
        long jK2 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.a1.f139461a.j(), pVar, 6) : j12;
        long jK3 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.a1.f139461a.h(), pVar, 6) : j13;
        long jK4 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.a1.f139461a.m(), pVar, 6) : j14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1896017784, i10, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:582)");
        }
        c2 c2Var = new c2(jK, jA, jK2, jK3, jK4, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return c2Var;
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public final d2 b(@dl.e TopAppBarState topAppBarState, @dl.e yh.a<Boolean> aVar, @dl.e androidx.compose.animation.core.h<Float> hVar, @dl.e androidx.compose.animation.core.x<Float> xVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(959086674);
        if ((i11 & 1) != 0) {
            topAppBarState = AppBarKt.w(0.0f, 0.0f, 0.0f, pVar, 0, 7);
        }
        if ((i11 & 2) != 0) {
            aVar = new yh.a<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults$enterAlwaysScrollBehavior$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i11 & 4) != 0) {
            hVar = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 8) != 0) {
            xVar = androidx.compose.animation.w.b(pVar, 0);
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(959086674, i10, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:695)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, hVar, xVar, aVar);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return enterAlwaysScrollBehavior;
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public final d2 c(@dl.e TopAppBarState topAppBarState, @dl.e yh.a<Boolean> aVar, @dl.e androidx.compose.animation.core.h<Float> hVar, @dl.e androidx.compose.animation.core.x<Float> xVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1757023234);
        if ((i11 & 1) != 0) {
            topAppBarState = AppBarKt.w(0.0f, 0.0f, 0.0f, pVar, 0, 7);
        }
        if ((i11 & 2) != 0) {
            aVar = new yh.a<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults$exitUntilCollapsedScrollBehavior$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i11 & 4) != 0) {
            hVar = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 8) != 0) {
            xVar = androidx.compose.animation.w.b(pVar, 0);
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1757023234, i10, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:728)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, hVar, xVar, aVar);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return exitUntilCollapsedScrollBehavior;
    }

    @dl.d
    @xh.h(name = "getWindowInsets")
    @androidx.compose.runtime.h
    public final androidx.compose.foundation.layout.h1 d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(2143182847);
        if (ComposerKt.g0()) {
            ComposerKt.w0(2143182847, i10, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:567)");
        }
        androidx.compose.foundation.layout.h1 h1VarA = v1.a(androidx.compose.foundation.layout.h1.INSTANCE, pVar, 8);
        androidx.compose.foundation.layout.k1.Companion companion = androidx.compose.foundation.layout.k1.INSTANCE;
        androidx.compose.foundation.layout.h1 h1VarJ = androidx.compose.foundation.layout.i1.j(h1VarA, androidx.compose.foundation.layout.k1.s(companion.g(), companion.k()));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarJ;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final c2 e(long j10, long j11, long j12, long j13, long j14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1471507700);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.y0.f140603a.a(), pVar, 6) : j10;
        long jA = (i11 & 2) != 0 ? ColorSchemeKt.a(o0.f12059a.a(pVar, 6), jK, t0.b1.f139496a.j()) : j11;
        long jK2 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.y0.f140603a.h(), pVar, 6) : j12;
        long jK3 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.y0.f140603a.f(), pVar, 6) : j13;
        long jK4 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.y0.f140603a.j(), pVar, 6) : j14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1471507700, i10, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:644)");
        }
        c2 c2Var = new c2(jK, jA, jK2, jK3, jK4, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return c2Var;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final c2 f(long j10, long j11, long j12, long j13, long j14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-582474442);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.z0.f140629a.a(), pVar, 6) : j10;
        long jA = (i11 & 2) != 0 ? ColorSchemeKt.a(o0.f12059a.a(pVar, 6), jK, t0.b1.f139496a.j()) : j11;
        long jK2 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.z0.f140629a.h(), pVar, 6) : j12;
        long jK3 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.z0.f140629a.f(), pVar, 6) : j13;
        long jK4 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.z0.f140629a.j(), pVar, 6) : j14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-582474442, i10, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:613)");
        }
        c2 c2Var = new c2(jK, jA, jK2, jK3, jK4, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return c2Var;
    }

    @w
    @dl.d
    @androidx.compose.runtime.h
    public final d2 g(@dl.e TopAppBarState topAppBarState, @dl.e yh.a<Boolean> aVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(286497075);
        if ((i11 & 1) != 0) {
            topAppBarState = AppBarKt.w(0.0f, 0.0f, 0.0f, pVar, 0, 7);
        }
        if ((i11 & 2) != 0) {
            aVar = new yh.a<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults$pinnedScrollBehavior$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(286497075, i10, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:673)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, aVar);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pinnedScrollBehavior;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final c2 h(long j10, long j11, long j12, long j13, long j14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1717201472);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.b1.f139496a.a(), pVar, 6) : j10;
        long jA = (i11 & 2) != 0 ? ColorSchemeKt.a(o0.f12059a.a(pVar, 6), jK, t0.b1.f139496a.j()) : j11;
        long jK2 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.b1.f139496a.h(), pVar, 6) : j12;
        long jK3 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.b1.f139496a.f(), pVar, 6) : j13;
        long jK4 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.b1.f139496a.k(), pVar, 6) : j14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1717201472, i10, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:544)");
        }
        c2 c2Var = new c2(jK, jA, jK2, jK3, jK4, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return c2Var;
    }
}
