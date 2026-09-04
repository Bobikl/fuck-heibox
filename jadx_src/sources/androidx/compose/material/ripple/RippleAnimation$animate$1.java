package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {80, 82, 83}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class RippleAnimation$animate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f8457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f8458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RippleAnimation f8459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f8460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super RippleAnimation$animate$1> cVar) {
        super(cVar);
        this.f8459d = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f8458c = obj;
        this.f8460e |= Integer.MIN_VALUE;
        return this.f8459d.f(this);
    }
}
