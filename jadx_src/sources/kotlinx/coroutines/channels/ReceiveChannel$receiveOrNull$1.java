package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {bb.c.b.Q3}, m = "receiveOrNull", n = {}, s = {})
public final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f129004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f129005c;

    ReceiveChannel$receiveOrNull$1(kotlin.coroutines.c<? super ReceiveChannel$receiveOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129004b = obj;
        this.f129005c |= Integer.MIN_VALUE;
        return ReceiveChannel.DefaultImpls.i(null, this);
    }
}
