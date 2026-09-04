package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {256}, m = "awaitFirstDownOnPass", n = {"$this$awaitFirstDownOnPass", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
public final class TapGestureDetectorKt$awaitFirstDownOnPass$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f5601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f5602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5603f;

    TapGestureDetectorKt$awaitFirstDownOnPass$1(kotlin.coroutines.c<? super TapGestureDetectorKt$awaitFirstDownOnPass$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5602e = obj;
        this.f5603f |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.f(null, null, false, this);
    }
}
