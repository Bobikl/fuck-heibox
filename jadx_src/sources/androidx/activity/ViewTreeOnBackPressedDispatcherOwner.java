package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@xh.h(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class ViewTreeOnBackPressedDispatcherOwner {
    @xh.h(name = "get")
    @dl.e
    public static final s a(@dl.d View view) {
        f0.p(view, "<this>");
        return (s) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(view, new yh.l<View, View>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(@dl.d View it) {
                f0.p(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new yh.l<View, s>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s invoke(@dl.d View it) {
                f0.p(it, "it");
                Object tag = it.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof s) {
                    return (s) tag;
                }
                return null;
            }
        }));
    }

    @xh.h(name = "set")
    public static final void b(@dl.d View view, @dl.d s onBackPressedDispatcherOwner) {
        f0.p(view, "<this>");
        f0.p(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
