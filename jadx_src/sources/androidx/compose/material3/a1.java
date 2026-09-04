package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/a1;", "", "Ls1/h;", "b", "F", "()F", "CircularStrokeWidth", "Landroidx/compose/animation/core/z0;", "", ak.aF, "Landroidx/compose/animation/core/z0;", "e", "()Landroidx/compose/animation/core/z0;", "ProgressAnimationSpec", "Landroidx/compose/ui/graphics/l0;", "(Landroidx/compose/runtime/p;I)J", "linearColor", ak.av, "circularColor", "d", "linearTrackColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a1 f11753a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float CircularStrokeWidth = t0.e.f139649a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.animation.core.z0<Float> ProgressAnimationSpec = new androidx.compose.animation.core.z0<>(1.0f, 50.0f, Float.valueOf(0.001f));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11756d = 0;

    private a1() {
    }

    @xh.h(name = "getCircularColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1803349725);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:400)");
        }
        long jK = ColorSchemeKt.k(t0.e.f139649a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float b() {
        return CircularStrokeWidth;
    }

    @xh.h(name = "getLinearColor")
    @androidx.compose.runtime.h
    public final long c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-914312983);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-914312983, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:396)");
        }
        long jK = ColorSchemeKt.k(t0.b0.f139485a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getLinearTrackColor")
    @androidx.compose.runtime.h
    public final long d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1677541593);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1677541593, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:404)");
        }
        long jK = ColorSchemeKt.k(t0.b0.f139485a.h(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @dl.d
    public final androidx.compose.animation.core.z0<Float> e() {
        return ProgressAnimationSpec;
    }
}
