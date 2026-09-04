package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import kotlin.t0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0001\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH&J\b\u0010\u000f\u001a\u00020\rH\u0017J\u0014\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0010H'J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001c8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", androidx.exifinterface.media.a.S4, "", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "H", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/b2;", "e", "cancel", "", "", "b", "poll", "G", "R", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/d;", androidx.exifinterface.media.a.f23244d5, "()Lkotlinx/coroutines/selects/d;", "onReceive", "y", "onReceiveCatching", "B", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface ReceiveChannel<E> {

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void b(ReceiveChannel receiveChannel, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.e(cancellationException);
        }

        public static /* synthetic */ boolean c(ReceiveChannel receiveChannel, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return receiveChannel.b(th2);
        }

        @dl.d
        public static <E> kotlinx.coroutines.selects.d<E> d(@dl.d final ReceiveChannel<? extends E> receiveChannel) {
            return new kotlinx.coroutines.selects.d<E>() { // from class: kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1
                @Override // kotlinx.coroutines.selects.d
                @z1
                public <R> void F(@dl.d kotlinx.coroutines.selects.f<? super R> select, @dl.d yh.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
                    receiveChannel.y().F(select, new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(block, null));
                }
            };
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @s0(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @t1
        public static /* synthetic */ void f() {
        }

        @t1
        public static /* synthetic */ void g() {
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @s0(expression = "tryReceive().getOrNull()", imports = {}))
        @dl.e
        public static <E> E h(@dl.d ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objE = receiveChannel.E();
            if (n.m(objE)) {
                return (E) n.i(objE);
            }
            Throwable thF = n.f(objE);
            if (thF == null) {
                return null;
            }
            throw n0.p(thF);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
        @sh.h
        @dl.e
        public static <E> Object i(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d kotlin.coroutines.c<? super E> cVar) throws Throwable {
            ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            Object objH;
            if (cVar instanceof ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (ReceiveChannel$receiveOrNull$1) cVar;
                int i10 = receiveChannel$receiveOrNull$1.f129005c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.f129005c = i10 - Integer.MIN_VALUE;
                } else {
                    receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(cVar);
                }
            } else {
                receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(cVar);
            }
            Object obj = receiveChannel$receiveOrNull$1.f129004b;
            Object objH2 = kotlin.coroutines.intrinsics.b.h();
            int i11 = receiveChannel$receiveOrNull$1.f129005c;
            if (i11 == 0) {
                t0.n(obj);
                receiveChannel$receiveOrNull$1.f129005c = 1;
                objH = receiveChannel.H(receiveChannel$receiveOrNull$1);
                if (objH == objH2) {
                    return objH2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
                objH = ((n) obj).getHolder();
            }
            return n.h(objH);
        }
    }

    @dl.d
    kotlinx.coroutines.selects.d<E> B();

    @dl.d
    Object E();

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
    @sh.h
    @dl.e
    Object G(@dl.d kotlin.coroutines.c<? super E> cVar);

    @dl.e
    Object H(@dl.d kotlin.coroutines.c<? super n<? extends E>> cVar);

    boolean R();

    @dl.d
    kotlinx.coroutines.selects.d<E> T();

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean b(Throwable cause);

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void e(@dl.e CancellationException cancellationException);

    @dl.e
    Object h(@dl.d kotlin.coroutines.c<? super E> cVar);

    boolean isEmpty();

    @dl.d
    ChannelIterator<E> iterator();

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @s0(expression = "tryReceive().getOrNull()", imports = {}))
    @dl.e
    E poll();

    @dl.d
    kotlinx.coroutines.selects.d<n<E>> y();
}
