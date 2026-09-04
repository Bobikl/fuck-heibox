package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.s0;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.t1;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010?\u001a\u00020>\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010A\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0001\u0010\u0014J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010\"\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170/8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b3\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00101R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lkotlinx/coroutines/channels/l;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/a;", "Lkotlin/b2;", "Lkotlinx/coroutines/channels/k;", "", "cause", "", "U", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "handler", "J", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "H", "G", "X", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "b", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "w0", "d", "Lkotlinx/coroutines/channels/k;", "K1", "()Lkotlinx/coroutines/channels/k;", "_channel", "R", "()Z", "isClosedForReceive", "O", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/d;", androidx.exifinterface.media.a.f23244d5, "()Lkotlinx/coroutines/selects/d;", "onReceive", "y", "onReceiveCatching", "B", "onReceiveOrNull", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/b0;", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", ak.aF, "channel", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/k;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class l<E> extends kotlinx.coroutines.a<b2> implements k<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final k<E> _channel;

    public l(@dl.d CoroutineContext coroutineContext, @dl.d k<E> kVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this._channel = kVar;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public kotlinx.coroutines.selects.d<E> B() {
        return this._channel.B();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public Object E() {
        return this._channel.E();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
    @sh.h
    @dl.e
    public Object G(@dl.d kotlin.coroutines.c<? super E> cVar) {
        return this._channel.G(cVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.e
    public Object H(@dl.d kotlin.coroutines.c<? super n<? extends E>> cVar) {
        Object objH = this._channel.H(cVar);
        kotlin.coroutines.intrinsics.b.h();
        return objH;
    }

    @Override // kotlinx.coroutines.channels.b0
    @t1
    public void J(@dl.d yh.l<? super Throwable, b2> lVar) {
        this._channel.J(lVar);
    }

    @dl.d
    protected final k<E> K1() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean O() {
        return this._channel.O();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean R() {
        return this._channel.R();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public kotlinx.coroutines.selects.d<E> T() {
        return this._channel.T();
    }

    @Override // kotlinx.coroutines.channels.b0
    /* JADX INFO: renamed from: U */
    public boolean b(@dl.e Throwable cause) {
        return this._channel.b(cause);
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.e
    public Object X(E e10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return this._channel.X(e10, cVar);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean b(Throwable cause) {
        w0(new JobCancellationException(z0(), null, this));
        return true;
    }

    @dl.d
    public final k<E> c() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    public /* synthetic */ void cancel() {
        w0(new JobCancellationException(z0(), null, this));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    public final void e(@dl.e CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(z0(), null, this);
        }
        w0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.e
    public Object h(@dl.d kotlin.coroutines.c<? super E> cVar) {
        return this._channel.h(cVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public kotlinx.coroutines.selects.e<E, b0<E>> l() {
        return this._channel.l();
    }

    @Override // kotlinx.coroutines.channels.b0
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @s0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @s0(expression = "tryReceive().getOrNull()", imports = {}))
    @dl.e
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public Object v(E element) {
        return this._channel.v(element);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void w0(@dl.d Throwable th2) {
        CancellationException cancellationExceptionY1 = JobSupport.y1(this, th2, null, 1, null);
        this._channel.e(cancellationExceptionY1);
        u0(cancellationExceptionY1);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @dl.d
    public kotlinx.coroutines.selects.d<n<E>> y() {
        return this._channel.y();
    }
}
