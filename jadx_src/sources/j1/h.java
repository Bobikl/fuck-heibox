package j1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Resources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/res/Resources;", ak.av, "(Landroidx/compose/runtime/p;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    @m1
    @dl.d
    @androidx.compose.runtime.h
    public static final Resources a(@dl.e p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        pVar.K(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) pVar.K(AndroidCompositionLocals_androidKt.g())).getResources();
        f0.o(resources, "LocalContext.current.resources");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return resources;
    }
}
