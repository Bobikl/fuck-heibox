package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/w0;", "", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "ContainerColor", "Landroidx/compose/foundation/layout/h1;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w0 f12148a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12149b = 0;

    private w0() {
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1949394041);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1949394041, i10, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:263)");
        }
        long jK = ColorSchemeKt.k(t0.h0.f139820a.m(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @dl.d
    @xh.h(name = "getWindowInsets")
    @androidx.compose.runtime.h
    public final androidx.compose.foundation.layout.h1 b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1546379058);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1546379058, i10, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:270)");
        }
        androidx.compose.foundation.layout.h1 h1VarA = v1.a(androidx.compose.foundation.layout.h1.INSTANCE, pVar, 8);
        androidx.compose.foundation.layout.k1.Companion companion = androidx.compose.foundation.layout.k1.INSTANCE;
        androidx.compose.foundation.layout.h1 h1VarJ = androidx.compose.foundation.layout.i1.j(h1VarA, androidx.compose.foundation.layout.k1.s(companion.l(), companion.j()));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarJ;
    }
}
