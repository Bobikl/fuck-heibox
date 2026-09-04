package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
public final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5508d;

    ScrollExtensionsKt$animateScrollBy$1(kotlin.coroutines.c<? super ScrollExtensionsKt$animateScrollBy$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5507c = obj;
        this.f5508d |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.a(null, 0.0f, null, this);
    }
}
