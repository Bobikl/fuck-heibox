package androidx.compose.animation.core;

import androidx.compose.animation.core.p;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1<V extends p> {
    public static long a(m1 m1Var, @dl.d p initialValue, @dl.d p targetValue, @dl.d p initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return ((long) (m1Var.f() + m1Var.g())) * 1000000;
    }
}
