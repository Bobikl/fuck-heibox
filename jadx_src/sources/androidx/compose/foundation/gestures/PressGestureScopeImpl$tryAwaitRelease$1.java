package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {bb.c.b.B3}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
public final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f5498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.c<? super PressGestureScopeImpl$tryAwaitRelease$1> cVar) {
        super(cVar);
        this.f5498d = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5497c = obj;
        this.f5499e |= Integer.MIN_VALUE;
        return this.f5498d.h1(this);
    }
}
