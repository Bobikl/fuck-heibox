package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {79}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
public final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5482d;

    ForEachGestureKt$awaitAllPointersUp$3(kotlin.coroutines.c<? super ForEachGestureKt$awaitAllPointersUp$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5481c = obj;
        this.f5482d |= Integer.MIN_VALUE;
        return ForEachGestureKt.b(null, this);
    }
}
