package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "ViewTreeViewModelStoreOwner")
public final class ViewTreeViewModelStoreOwner {
    @xh.h(name = "get")
    @dl.e
    public static final c1 a(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return (c1) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(view, new yh.l<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(@dl.d View view2) {
                kotlin.jvm.internal.f0.p(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new yh.l<View, c1>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c1 invoke(@dl.d View view2) {
                kotlin.jvm.internal.f0.p(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof c1) {
                    return (c1) tag;
                }
                return null;
            }
        }));
    }

    @xh.h(name = "set")
    public static final void b(@dl.d View view, @dl.e c1 c1Var) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, c1Var);
    }
}
