package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@xh.h(name = "ViewTreeFullyDrawnReporterOwner")
public final class ViewTreeFullyDrawnReporterOwner {
    @xh.h(name = "get")
    @dl.e
    public static final n a(@dl.d View view) {
        f0.p(view, "<this>");
        return (n) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(view, new yh.l<View, View>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1
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
        }), new yh.l<View, n>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n invoke(@dl.d View it) {
                f0.p(it, "it");
                Object tag = it.getTag(R.id.report_drawn);
                if (tag instanceof n) {
                    return (n) tag;
                }
                return null;
            }
        }));
    }

    @xh.h(name = "set")
    public static final void b(@dl.d View view, @dl.d n fullyDrawnReporterOwner) {
        f0.p(view, "<this>");
        f0.p(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
