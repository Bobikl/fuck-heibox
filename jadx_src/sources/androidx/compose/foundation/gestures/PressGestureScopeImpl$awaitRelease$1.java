package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {bb.c.b.f30965u3}, m = "awaitRelease", n = {}, s = {})
public final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f5493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f5494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.c<? super PressGestureScopeImpl$awaitRelease$1> cVar) {
        super(cVar);
        this.f5494c = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5493b = obj;
        this.f5495d |= Integer.MIN_VALUE;
        return this.f5494c.x1(this);
    }
}
