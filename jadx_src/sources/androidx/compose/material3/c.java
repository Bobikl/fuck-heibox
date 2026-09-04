package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00028Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/material3/c;", "", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "containerColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f11808a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11809b = 0;

    private c() {
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-867931977);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-867931977, i10, -1, "androidx.compose.material3.BadgeDefaults.<get-containerColor> (Badge.kt:190)");
        }
        long jK = ColorSchemeKt.k(t0.b.f139476a.a(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }
}
