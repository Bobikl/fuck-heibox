package androidx.savedstate;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    @k(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @s0(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ d a(View view) {
        f0.p(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.a(view);
    }
}
