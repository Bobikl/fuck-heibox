package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/channels/b0;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "channel", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "doRemove"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.ChannelManager$Actor", f = "ChannelManager.kt", i = {}, l = {206}, m = "doRemove", n = {}, s = {})
public final class ChannelManager$Actor$doRemove$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChannelManager.Actor f26499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelManager$Actor$doRemove$1(ChannelManager.Actor actor, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26499d = actor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26497b = obj;
        this.f26498c |= Integer.MIN_VALUE;
        return this.f26499d.n(null, this);
    }
}
