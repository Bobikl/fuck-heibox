package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {bb.c.b.F1, bb.c.b.f30920s2}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
public final class SuspendAnimationKt$animate$4<T, V extends p> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f4235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f4236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f4237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f4238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f4239g;

    SuspendAnimationKt$animate$4(kotlin.coroutines.c<? super SuspendAnimationKt$animate$4> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f4238f = obj;
        this.f4239g |= Integer.MIN_VALUE;
        return SuspendAnimationKt.d(null, null, 0L, null, this);
    }
}
