package androidx.lifecycle;

import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f24286a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @dl.d
    public static final kotlinx.coroutines.q0 a(@dl.d w0 w0Var) {
        kotlin.jvm.internal.f0.p(w0Var, "<this>");
        kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) w0Var.getTag(f24286a);
        if (q0Var != null) {
            return q0Var;
        }
        Object tagIfAbsent = w0Var.setTagIfAbsent(f24286a, new e(f3.c(null, 1, null).I(e1.e().t0())));
        kotlin.jvm.internal.f0.o(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (kotlinx.coroutines.q0) tagIfAbsent;
    }
}
