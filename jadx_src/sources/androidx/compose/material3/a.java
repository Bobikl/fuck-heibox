package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.g2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/a;", "", "Ls1/h;", "b", "F", "f", "()F", "TonalElevation", "Landroidx/compose/ui/graphics/g2;", ak.aF, "(Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "containerColor", "iconContentColor", "e", "titleContentColor", "d", "textContentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f11748a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = t0.h.f139804a.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11750c = 0;

    private a() {
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-285850401);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-285850401, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AndroidAlertDialog.android.kt:133)");
        }
        long jK = ColorSchemeKt.k(t0.h.f139804a.f(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getIconContentColor")
    @androidx.compose.runtime.h
    public final long b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1074292351);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1074292351, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AndroidAlertDialog.android.kt:136)");
        }
        long jK = ColorSchemeKt.k(t0.h.f139804a.l(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @dl.d
    @xh.h(name = "getShape")
    @androidx.compose.runtime.h
    public final g2 c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-331760525);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-331760525, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AndroidAlertDialog.android.kt:130)");
        }
        g2 g2VarD = ShapesKt.d(t0.h.f139804a.h(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return g2VarD;
    }

    @xh.h(name = "getTextContentColor")
    @androidx.compose.runtime.h
    public final long d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1352479489);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1352479489, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AndroidAlertDialog.android.kt:142)");
        }
        long jK = ColorSchemeKt.k(t0.h.f139804a.n(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getTitleContentColor")
    @androidx.compose.runtime.h
    public final long e(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(11981687);
        if (ComposerKt.g0()) {
            ComposerKt.w0(11981687, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AndroidAlertDialog.android.kt:139)");
        }
        long jK = ColorSchemeKt.k(t0.h.f139804a.j(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float f() {
        return TonalElevation;
    }
}
