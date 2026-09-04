package androidx.compose.foundation.relocation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {121}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f7458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f7460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f7461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ BringIntoViewRequesterImpl f7462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f7463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, kotlin.coroutines.c<? super BringIntoViewRequesterImpl$bringIntoView$1> cVar) {
        super(cVar);
        this.f7462g = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f7461f = obj;
        this.f7463h |= Integer.MIN_VALUE;
        return this.f7462g.a(null, this);
    }
}
