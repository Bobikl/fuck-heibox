package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0}, l = {162}, m = "awaitTwoDowns", n = {"$this$awaitTwoDowns", "firstDown", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
public final class TransformableKt$awaitTwoDowns$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f5694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f5695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5696f;

    TransformableKt$awaitTwoDowns$1(kotlin.coroutines.c<? super TransformableKt$awaitTwoDowns$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5695e = obj;
        this.f5696f |= Integer.MIN_VALUE;
        return TransformableKt.c(null, false, this);
    }
}
