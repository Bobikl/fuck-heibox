package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/material3/c1;", "", "Landroidx/compose/ui/graphics/l0;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "Landroidx/compose/material3/b1;", ak.av, "(JJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/b1;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c1 f11814a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11815b = 0;

    private c1() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final b1 a(long j10, long j11, long j12, long j13, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-351083046);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.p0.f140201a.f(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.p0.f140201a.k(), pVar, 6) : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.p0.f140201a.a(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jW2 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.p0.f140201a.b(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-351083046, i10, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:144)");
        }
        b1 b1Var = new b1(jK, jK2, jW, jW2, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return b1Var;
    }
}
