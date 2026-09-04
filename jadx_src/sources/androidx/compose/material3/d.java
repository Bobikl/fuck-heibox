package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\r8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\r8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/d;", "", "Ls1/h;", "b", "F", ak.aF, "()F", "ContainerElevation", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", "d", "()Landroidx/compose/foundation/layout/m0;", "ContentPadding", "Landroidx/compose/ui/graphics/l0;", "(Landroidx/compose/runtime/p;I)J", "containerColor", "Landroidx/compose/foundation/layout/h1;", "e", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "windowInsets", ak.av, "bottomAppBarFabColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f11821a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation = t0.c.f139509a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 ContentPadding = PaddingKt.e(AppBarKt.f8656a, AppBarKt.u(), AppBarKt.f8656a, 0.0f, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11824d = 0;

    private d() {
    }

    @xh.h(name = "getBottomAppBarFabColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1464561486);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1464561486, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:959)");
        }
        long jK = ColorSchemeKt.k(t0.q.f140216a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-368340078);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-368340078, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:932)");
        }
        long jK = ColorSchemeKt.k(t0.c.f139509a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float c() {
        return ContainerElevation;
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 d() {
        return ContentPadding;
    }

    @dl.d
    @xh.h(name = "getWindowInsets")
    @androidx.compose.runtime.h
    public final androidx.compose.foundation.layout.h1 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(688896409);
        if (ComposerKt.g0()) {
            ComposerKt.w0(688896409, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:952)");
        }
        androidx.compose.foundation.layout.h1 h1VarA = v1.a(androidx.compose.foundation.layout.h1.INSTANCE, pVar, 8);
        androidx.compose.foundation.layout.k1.Companion companion = androidx.compose.foundation.layout.k1.INSTANCE;
        androidx.compose.foundation.layout.h1 h1VarJ = androidx.compose.foundation.layout.i1.j(h1VarA, androidx.compose.foundation.layout.k1.s(companion.g(), companion.e()));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarJ;
    }
}
