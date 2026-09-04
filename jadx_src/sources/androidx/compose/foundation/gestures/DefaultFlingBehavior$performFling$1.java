package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", i = {0}, l = {bb.c.b.J7}, m = "performFling", n = {"velocityLeft"}, s = {"L$0"})
public final class DefaultFlingBehavior$performFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DefaultFlingBehavior f5144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$1(DefaultFlingBehavior defaultFlingBehavior, kotlin.coroutines.c<? super DefaultFlingBehavior$performFling$1> cVar) {
        super(cVar);
        this.f5144d = defaultFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5143c = obj;
        this.f5145e |= Integer.MIN_VALUE;
        return this.f5144d.a(null, 0.0f, this);
    }
}
