package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/o0;", "", "Landroidx/compose/material3/o;", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/material3/o;", "colorScheme", "Landroidx/compose/material3/e2;", ak.aF, "(Landroidx/compose/runtime/p;I)Landroidx/compose/material3/e2;", "typography", "Landroidx/compose/material3/i1;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/material3/i1;", "shapes", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o0 f12059a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12060b = 0;

    private o0() {
    }

    @dl.d
    @androidx.compose.runtime.m1
    @xh.h(name = "getColorScheme")
    @androidx.compose.runtime.h
    public final ColorScheme a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(-561618718, i10, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:95)");
        }
        ColorScheme colorScheme = (ColorScheme) pVar.K(ColorSchemeKt.g());
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return colorScheme;
    }

    @dl.d
    @androidx.compose.runtime.m1
    @xh.h(name = "getShapes")
    @androidx.compose.runtime.h
    public final Shapes b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(419509830, i10, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:111)");
        }
        Shapes shapes = (Shapes) pVar.K(ShapesKt.c());
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return shapes;
    }

    @dl.d
    @androidx.compose.runtime.m1
    @xh.h(name = "getTypography")
    @androidx.compose.runtime.h
    public final Typography c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(-942794935, i10, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:103)");
        }
        Typography e2Var = (Typography) pVar.K(TypographyKt.b());
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return e2Var;
    }
}
