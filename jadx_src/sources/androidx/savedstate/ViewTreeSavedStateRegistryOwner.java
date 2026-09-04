package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* JADX INFO: loaded from: classes6.dex */
@h(name = "ViewTreeSavedStateRegistryOwner")
public final class ViewTreeSavedStateRegistryOwner {
    @h(name = "get")
    @dl.e
    public static final d a(@dl.d View view) {
        f0.p(view, "<this>");
        return (d) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(view, new l<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(@dl.d View view2) {
                f0.p(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, d>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(@dl.d View view2) {
                f0.p(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof d) {
                    return (d) tag;
                }
                return null;
            }
        }));
    }

    @h(name = "set")
    public static final void b(@dl.d View view, @dl.e d dVar) {
        f0.p(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, dVar);
    }
}
