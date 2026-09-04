package androidx.lifecycle;

import android.view.View;
import kotlin.DeprecationLevel;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class v0 {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @kotlin.s0(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final /* synthetic */ y a(View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return ViewTreeLifecycleOwner.a(view);
    }
}
