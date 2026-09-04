package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {181}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
public final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5610d;

    TapGestureDetectorKt$consumeUntilUp$1(kotlin.coroutines.c<? super TapGestureDetectorKt$consumeUntilUp$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5609c = obj;
        this.f5610d |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.h(null, this);
    }
}
