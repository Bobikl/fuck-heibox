package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", androidx.core.app.o0.I0, "Lkotlin/coroutines/c;", "", "continuation", "send"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.TemporaryDownstream", f = "CachedPageEventFlow.kt", i = {}, l = {149}, m = "send", n = {}, s = {})
public final class TemporaryDownstream$send$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TemporaryDownstream f26354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TemporaryDownstream$send$1(TemporaryDownstream temporaryDownstream, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26354d = temporaryDownstream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26352b = obj;
        this.f26353c |= Integer.MIN_VALUE;
        return this.f26354d.c(null, this);
    }
}
