package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014Je\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/v0;", "", "Landroidx/compose/ui/graphics/l0;", "selectedContainerColor", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "Landroidx/compose/material3/u0;", ak.av, "(JJJJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/u0;", "Landroidx/compose/foundation/layout/m0;", "b", "Landroidx/compose/foundation/layout/m0;", "()Landroidx/compose/foundation/layout/m0;", "ItemPadding", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final v0 f12145a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 ItemPadding = PaddingKt.c(s1.h.g(12), 0.0f, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12147c = 0;

    private v0() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final u0 a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1574983348);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.g0.f139778a.f(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.g0.f139778a.n(), pVar, 6) : j11;
        long jK3 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.g0.f139778a.e(), pVar, 6) : j12;
        long jK4 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.g0.f139778a.y(), pVar, 6) : j13;
        long jK5 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.g0.f139778a.j(), pVar, 6) : j14;
        long jK6 = (i11 & 32) != 0 ? ColorSchemeKt.k(t0.g0.f139778a.z(), pVar, 6) : j15;
        long j18 = (i11 & 64) != 0 ? jK5 : j16;
        long j19 = (i11 & 128) != 0 ? jK6 : j17;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1574983348, i10, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:759)");
        }
        p pVar2 = new p(jK3, jK4, jK5, jK6, jK, jK2, j18, j19, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 b() {
        return ItemPadding;
    }
}
