package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DarkTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", ak.av, "(Landroidx/compose/runtime/p;I)Z", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    @m1
    @androidx.compose.runtime.h
    public static final boolean a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1100791446, i10, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:40)");
        }
        boolean zA = l.a(pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return zA;
    }
}
