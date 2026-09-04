package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.r0;
import kotlin.s0;
import kotlinx.coroutines.s2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f129069a = "Channel was closed";

    @dl.d
    @r0
    public static final <E, R> ReceiveChannel<R> J(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.E(receiveChannel, coroutineContext, pVar);
    }

    @dl.d
    @r0
    public static final <E, R> ReceiveChannel<R> L(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.q<? super Integer, ? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return ChannelsKt__DeprecatedKt.G(receiveChannel, coroutineContext, qVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.d<E> U(@dl.d ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__Channels_commonKt.h(receiveChannel);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
    @dl.e
    public static final <E> Object V(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d kotlin.coroutines.c<? super E> cVar) {
        return ChannelsKt__Channels_commonKt.i(receiveChannel, cVar);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @s0(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@dl.d b0<? super E> b0Var, E e10) {
        ChannelsKt__ChannelsKt.a(b0Var, e10);
    }

    @r0
    public static final void b(@dl.d ReceiveChannel<?> receiveChannel, @dl.e Throwable th2) {
        ChannelsKt__Channels_commonKt.a(receiveChannel, th2);
    }

    @s2
    public static final <E, R> R c(@dl.d h<E> hVar, @dl.d yh.l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        return (R) ChannelsKt__Channels_commonKt.b(hVar, lVar);
    }

    public static final <E, R> R d(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d yh.l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        return (R) ChannelsKt__Channels_commonKt.c(receiveChannel, lVar);
    }

    @s2
    @dl.e
    public static final <E> Object e(@dl.d h<E> hVar, @dl.d yh.l<? super E, b2> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return ChannelsKt__Channels_commonKt.d(hVar, lVar, cVar);
    }

    @r0
    @dl.e
    public static final <E, C extends b0<? super E>> Object e0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d C c10, @dl.d kotlin.coroutines.c<? super C> cVar) {
        return ChannelsKt__DeprecatedKt.W(receiveChannel, c10, cVar);
    }

    @dl.e
    public static final <E> Object f(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d yh.l<? super E, b2> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return ChannelsKt__Channels_commonKt.e(receiveChannel, lVar, cVar);
    }

    @r0
    @dl.e
    public static final <E, C extends Collection<? super E>> Object f0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d C c10, @dl.d kotlin.coroutines.c<? super C> cVar) {
        return ChannelsKt__DeprecatedKt.X(receiveChannel, c10, cVar);
    }

    @dl.d
    @r0
    public static final yh.l<Throwable, b2> g(@dl.d ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.b(receiveChannel);
    }

    @dl.e
    public static final <E> Object g0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d kotlin.coroutines.c<? super List<? extends E>> cVar) {
        return ChannelsKt__Channels_commonKt.j(receiveChannel, cVar);
    }

    @dl.d
    @r0
    public static final yh.l<Throwable, b2> h(@dl.d ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.c(receiveChannelArr);
    }

    @r0
    @dl.e
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@dl.d ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, @dl.d M m10, @dl.d kotlin.coroutines.c<? super M> cVar) {
        return ChannelsKt__DeprecatedKt.Y(receiveChannel, m10, cVar);
    }

    @dl.d
    @r0
    public static final <E, K> ReceiveChannel<E> k(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super K>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.f(receiveChannel, coroutineContext, pVar);
    }

    @r0
    @dl.e
    public static final <E> Object k0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d kotlin.coroutines.c<? super Set<E>> cVar) {
        return ChannelsKt__DeprecatedKt.b0(receiveChannel, cVar);
    }

    @dl.d
    public static final <E> Object m0(@dl.d b0<? super E> b0Var, E e10) {
        return ChannelsKt__ChannelsKt.b(b0Var, e10);
    }

    @dl.d
    @r0
    public static final <E, R, V> ReceiveChannel<V> q0(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d ReceiveChannel<? extends R> receiveChannel2, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super R, ? extends V> pVar) {
        return ChannelsKt__DeprecatedKt.g0(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }

    @dl.d
    @r0
    public static final <E> ReceiveChannel<E> s(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.n(receiveChannel, coroutineContext, pVar);
    }

    @dl.d
    @r0
    public static final <E> ReceiveChannel<E> y(@dl.d ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.t(receiveChannel);
    }
}
