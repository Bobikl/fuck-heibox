package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {bb.c.b.f30790m8}, m = "next", n = {"this"}, s = {"L$0"})
public final class ChannelIterator$next0$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128779d;

    ChannelIterator$next0$1(kotlin.coroutines.c<? super ChannelIterator$next0$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128778c = obj;
        this.f128779d |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.a(null, this);
    }
}
