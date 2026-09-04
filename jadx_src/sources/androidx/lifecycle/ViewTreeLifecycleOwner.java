package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {
    @xh.h(name = "get")
    @dl.e
    public static final y a(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        return (y) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(view, new yh.l<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(@dl.d View currentView) {
                kotlin.jvm.internal.f0.p(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new yh.l<View, y>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y invoke(@dl.d View viewParent) {
                kotlin.jvm.internal.f0.p(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof y) {
                    return (y) tag;
                }
                return null;
            }
        }));
    }

    @xh.h(name = "set")
    public static final void b(@dl.d View view, @dl.e y yVar) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, yVar);
    }
}
