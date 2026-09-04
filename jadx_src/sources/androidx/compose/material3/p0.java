package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/p0;", "", "Landroidx/compose/ui/graphics/l0;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/q0;", "b", "(JJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/q0;", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/m0;", ak.av, "()Landroidx/compose/foundation/layout/m0;", "DropdownMenuItemContentPadding", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final p0 f12081a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.layout.m0 DropdownMenuItemContentPadding = PaddingKt.b(MenuKt.f9770b, s1.h.g(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12083c = 0;

    private p0() {
    }

    @dl.d
    public final androidx.compose.foundation.layout.m0 a() {
        return DropdownMenuItemContentPadding;
    }

    @dl.d
    @androidx.compose.runtime.h
    public final q0 b(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1278543580);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.d0.f139617a.k(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.d0.f139617a.o(), pVar, 6) : j11;
        long jK3 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.d0.f139617a.v(), pVar, 6) : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.d0.f139617a.f(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jW2 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.d0.f139617a.g(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jW3 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.d0.f139617a.h(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1278543580, i10, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)");
        }
        q0 q0Var = new q0(jK, jK2, jK3, jW, jW2, jW3, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return q0Var;
    }
}
