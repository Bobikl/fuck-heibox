package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJo\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00028Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/m0;", "", "Landroidx/compose/ui/graphics/l0;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/l0;", ak.av, "(JJJJJJJJJLandroidx/compose/runtime/p;II)Landroidx/compose/material3/l0;", "Ls1/h;", "b", "F", "d", "()F", "Elevation", "Landroidx/compose/ui/graphics/g2;", "e", "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "(Landroidx/compose/runtime/p;I)J", ak.aF, "contentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m0 f12026a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = t0.c0.f139515a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12028c = 0;

    private m0() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final l0 a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-352515689);
        long jK = (i11 & 1) != 0 ? ColorSchemeKt.k(t0.c0.f139515a.a(), pVar, 6) : j10;
        long jK2 = (i11 & 2) != 0 ? ColorSchemeKt.k(t0.c0.f139515a.r(), pVar, 6) : j11;
        long jK3 = (i11 & 4) != 0 ? ColorSchemeKt.k(t0.c0.f139515a.z(), pVar, 6) : j12;
        long jK4 = (i11 & 8) != 0 ? ColorSchemeKt.k(t0.c0.f139515a.G(), pVar, 6) : j13;
        long jK5 = (i11 & 16) != 0 ? ColorSchemeKt.k(t0.c0.f139515a.N(), pVar, 6) : j14;
        long jK6 = (i11 & 32) != 0 ? ColorSchemeKt.k(t0.c0.f139515a.P(), pVar, 6) : j15;
        long jW = (i11 & 64) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.c0.f139515a.e(), pVar, 6), 0.3f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jW2 = (i11 & 128) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.c0.f139515a.f(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jW3 = (i11 & 256) != 0 ? androidx.compose.ui.graphics.l0.w(ColorSchemeKt.k(t0.c0.f139515a.g(), pVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-352515689, i10, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:400)");
        }
        l0 l0Var = new l0(jK, jK2, jK3, jK4, jK5, jK6, jW, jW2, jW3, null);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return l0Var;
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1253579929);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1253579929, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:377)");
        }
        long jK = ColorSchemeKt.k(t0.c0.f139515a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getContentColor")
    @androidx.compose.runtime.h
    public final long c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1076068327);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1076068327, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:380)");
        }
        long jK = ColorSchemeKt.k(t0.c0.f139515a.r(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float d() {
        return Elevation;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-496871597);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-496871597, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:374)");
        }
        g2 g2VarD = ShapesKt.d(t0.c0.f139515a.d(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }
}
