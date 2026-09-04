package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJG\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/material3/y0;", "", "Landroidx/compose/ui/graphics/l0;", "selectedIconColor", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "Landroidx/compose/material3/x0;", ak.av, "(JJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/x0;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final y0 f12186a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12187b = 0;

    private y0() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final x0 a(long j10, long j11, long j12, long j13, long j14, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(1621601574);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.h0.f139820a.e(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.h0.f139820a.j(), pVar, 6) : j11;
        long jK3 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.h0.f139820a.f(), pVar, 6) : j12;
        long jK4 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.h0.f139820a.v(), pVar, 6) : j13;
        long jK5 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.h0.f139820a.w(), pVar, 6) : j14;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1621601574, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:288)");
        }
        x0 x0Var = new x0(jK, jK2, jK3, jK4, jK5, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return x0Var;
    }
}
