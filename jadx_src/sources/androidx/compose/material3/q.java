package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00078Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/material3/q;", "", "Ls1/h;", "b", "F", "()F", "Thickness", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "color", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final q f12084a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Thickness = t0.i.f139846a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12086c = 0;

    private q() {
    }

    @xh.h(name = "getColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(77461041);
        if (ComposerKt.g0()) {
            ComposerKt.w0(77461041, i10, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:67)");
        }
        long jK = ColorSchemeKt.k(t0.i.f139846a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    public final float b() {
        return Thickness;
    }
}
