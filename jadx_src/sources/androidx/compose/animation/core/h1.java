package androidx.compose.animation.core;

import androidx.compose.animation.core.p;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1<V extends p> {
    @dl.d
    public static p a(i1 i1Var, @dl.d p initialValue, @dl.d p targetValue, @dl.d p initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return i1Var.d(i1Var.b(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }
}
