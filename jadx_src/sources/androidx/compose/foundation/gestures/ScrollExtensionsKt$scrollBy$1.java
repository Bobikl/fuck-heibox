package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {61}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
public final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5518d;

    ScrollExtensionsKt$scrollBy$1(kotlin.coroutines.c<? super ScrollExtensionsKt$scrollBy$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5517c = obj;
        this.f5518d |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.c(null, 0.0f, this);
    }
}
