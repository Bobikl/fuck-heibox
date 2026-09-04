package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {41, 44, 49}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class ForEachGestureKt$forEachGesture$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f5486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5487f;

    ForEachGestureKt$forEachGesture$1(kotlin.coroutines.c<? super ForEachGestureKt$forEachGesture$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5486e = obj;
        this.f5487f |= Integer.MIN_VALUE;
        return ForEachGestureKt.d(null, null, this);
    }
}
