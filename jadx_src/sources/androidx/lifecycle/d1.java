package androidx.lifecycle;

import android.view.View;
import kotlin.DeprecationLevel;

/* JADX INFO: compiled from: ViewTreeViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d1 {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @kotlin.s0(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final /* synthetic */ c1 a(View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        return ViewTreeViewModelStoreOwner.a(view);
    }
}
