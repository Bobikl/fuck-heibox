package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/material3/e1;", "", "Landroidx/compose/foundation/layout/h1;", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "contentWindowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e1 f11836a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11837b = 0;

    private e1() {
    }

    @dl.d
    @xh.h(name = "getContentWindowInsets")
    @androidx.compose.runtime.h
    public final androidx.compose.foundation.layout.h1 a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(757124140);
        if (ComposerKt.g0()) {
            ComposerKt.w0(757124140, i10, -1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:282)");
        }
        androidx.compose.foundation.layout.h1 h1VarA = v1.a(androidx.compose.foundation.layout.h1.INSTANCE, pVar, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarA;
    }
}
