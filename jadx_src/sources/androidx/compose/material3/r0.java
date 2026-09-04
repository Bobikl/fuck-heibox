package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00078Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/r0;", "", "Ls1/h;", "b", "F", "()F", "Elevation", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "containerColor", "Landroidx/compose/foundation/layout/h1;", ak.aF, "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r0 f12097a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = t0.f0.f139726a.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12099c = 0;

    private r0() {
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1528098623);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1528098623, i10, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:265)");
        }
        long jK = ColorSchemeKt.k(t0.f0.f139726a.m(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float b() {
        return Elevation;
    }

    @dl.d
    @xh.h(name = "getWindowInsets")
    @androidx.compose.runtime.h
    public final androidx.compose.foundation.layout.h1 c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1938678202);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1938678202, i10, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:272)");
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
