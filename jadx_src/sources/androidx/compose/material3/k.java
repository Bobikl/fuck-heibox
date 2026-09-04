package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJQ\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/k;", "", "Landroidx/compose/ui/graphics/l0;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "Landroidx/compose/material3/j;", ak.av, "(JJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/j;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k f11997a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11998b = 0;

    private k() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final j a(long j10, long j11, long j12, long j13, long j14, long j15, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-89536160);
        long jF = (i11 & 1) != 0 ? ColorSchemeKt.f(o0.f12059a.a(pVar, 6), t0.d.f139591a.e()) : j10;
        long jF2 = (i11 & 2) != 0 ? ColorSchemeKt.f(o0.f12059a.a(pVar, 6), t0.d.f139591a.T()) : j11;
        long jF3 = (i11 & 4) != 0 ? ColorSchemeKt.f(o0.f12059a.a(pVar, 6), t0.d.f139591a.z()) : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.f(o0.f12059a.a(pVar, 6), t0.d.f139591a.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jW2 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.f(o0.f12059a.a(pVar, 6), t0.d.f139591a.G()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long j16 = (i11 & 32) != 0 ? jW : j15;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-89536160, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:195)");
        }
        j jVar = new j(jF3, androidx.compose.ui.graphics.l0.w(jF3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jF, androidx.compose.ui.graphics.l0.w(jF, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jW, androidx.compose.ui.graphics.l0.w(jW2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j16, jF, jF2, jW, j16, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jVar;
    }
}
