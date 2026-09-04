package androidx.compose.material3;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/o1;", androidx.constraintlayout.core.motion.utils.w.b.f17895e, "", ak.av, "(ILandroidx/compose/runtime/p;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class p1 {
    @dl.d
    @androidx.compose.runtime.h
    public static final String a(int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
        String string;
        pVar.T(-176762646);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-176762646, i11, -1, "androidx.compose.material3.getString (Strings.android.kt:24)");
        }
        pVar.K(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) pVar.K(AndroidCompositionLocals_androidKt.g())).getResources();
        o1.Companion companion = o1.INSTANCE;
        if (o1.n(i10, companion.h())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.string.navigation_menu)");
        } else if (o1.n(i10, companion.a())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.string.close_drawer)");
        } else if (o1.n(i10, companion.b())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.string.close_sheet)");
        } else if (o1.n(i10, companion.c())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (o1.n(i10, companion.e())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.string.dropdown_menu)");
        } else if (o1.n(i10, companion.j())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.string.range_start)");
        } else if (o1.n(i10, companion.i())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
            kotlin.jvm.internal.f0.o(string, "resources.getString(R.string.range_end)");
        } else if (o1.n(i10, companion.d())) {
            string = resources.getString(R.string.dialog);
            kotlin.jvm.internal.f0.o(string, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (o1.n(i10, companion.g())) {
            string = resources.getString(R.string.expanded);
            kotlin.jvm.internal.f0.o(string, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (o1.n(i10, companion.f())) {
            string = resources.getString(R.string.collapsed);
            kotlin.jvm.internal.f0.o(string, "resources.getString(andr…rial3.R.string.collapsed)");
        } else {
            string = "";
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return string;
    }
}
