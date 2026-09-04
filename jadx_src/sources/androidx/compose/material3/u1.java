package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJµ\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/u1;", "", "Landroidx/compose/ui/graphics/l0;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "Landroidx/compose/material3/t1;", ak.av, "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/p;III)Landroidx/compose/material3/t1;", "Ls1/h;", "b", "F", "()F", "IconSize", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u1 f12138a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = s1.h.g(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12140c = 0;

    private u1() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final t1 a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, @dl.e androidx.compose.runtime.p pVar, int i10, int i11, int i12) {
        pVar.T(1937926421);
        long jK = (i12 & 1) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.p(), pVar, 6) : j10;
        long jK2 = (i12 & 2) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.A(), pVar, 6) : j11;
        long jS = (i12 & 4) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j12;
        long jK3 = (i12 & 8) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.v(), pVar, 6) : j13;
        long jK4 = (i12 & 16) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.L(), pVar, 6) : j14;
        long jK5 = (i12 & 32) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.Y(), pVar, 6) : j15;
        long jK6 = (i12 & 64) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.K(), pVar, 6) : j16;
        long jK7 = (i12 & 128) != 0 ? ColorSchemeKt.k(t0.w0.f140501a.S(), pVar, 6) : j17;
        long jI = (i12 & 256) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.a(), pVar, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j18;
        long jI2 = (i12 & 512) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.c(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j19;
        long jS2 = (i12 & 1024) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.s() : j20;
        long jI3 = (i12 & 2048) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.b(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j21;
        long jI4 = (i12 & 4096) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.d(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j22;
        long jI5 = (i12 & 8192) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.f(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j23;
        long jI6 = (i12 & 16384) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.g(), pVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j24;
        long jI7 = (i12 & 32768) != 0 ? androidx.compose.ui.graphics.n0.i(androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.w0.f140501a.e(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o0.f12059a.a(pVar, 6).A()) : j25;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1937926421, i10, i11, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:279)");
        }
        t1 t1Var = new t1(jK, jK2, jS, jK3, jK4, jK5, jK6, jK7, jI, jI2, jS2, jI3, jI4, jI5, jI6, jI7, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return t1Var;
    }

    public final float b() {
        return IconSize;
    }
}
