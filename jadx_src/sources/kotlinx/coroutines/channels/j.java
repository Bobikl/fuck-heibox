package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.s0;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.t1;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00105\u001a\u000204\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00106\u001a\u00020\u000e¢\u0006\u0004\b7\u00108J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0097\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010)R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lkotlinx/coroutines/channels/j;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/a;", "Lkotlin/b2;", "Lkotlinx/coroutines/channels/w;", "Lkotlinx/coroutines/channels/h;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "handler", "J", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ReceiveChannel;", ak.aG, "X", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "w0", "value", "L1", "(Lkotlin/b2;)V", "handled", "H1", "U", "d", "Lkotlinx/coroutines/channels/h;", "K1", "()Lkotlinx/coroutines/channels/h;", "_channel", "O", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/b0;", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", "isActive", ak.aF, "()Lkotlinx/coroutines/channels/b0;", "channel", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/h;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class j<E> extends kotlinx.coroutines.a<b2> implements w<E>, h<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h<E> _channel;

    public j(@dl.d CoroutineContext coroutineContext, @dl.d h<E> hVar, boolean z10) {
        super(coroutineContext, false, z10);
        this._channel = hVar;
        W0((d2) coroutineContext.f(d2.INSTANCE));
    }

    @Override // kotlinx.coroutines.a
    protected void H1(@dl.d Throwable th2, boolean z10) {
        if (this._channel.b(th2) || z10) {
            return;
        }
        n0.b(getCom.umeng.analytics.pro.d.R java.lang.String(), th2);
    }

    @Override // kotlinx.coroutines.channels.b0
    @t1
    public void J(@dl.d yh.l<? super Throwable, b2> lVar) {
        this._channel.J(lVar);
    }

    @dl.d
    protected final h<E> K1() {
        return this._channel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void I1(@dl.d b2 value) {
        b0.a.a(this._channel, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean O() {
        return this._channel.O();
    }

    @Override // kotlinx.coroutines.channels.b0
    /* JADX INFO: renamed from: U */
    public boolean b(@dl.e Throwable cause) {
        boolean zB = this._channel.b(cause);
        start();
        return zB;
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.e
    public Object X(E e10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return this._channel.X(e10, cVar);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean b(Throwable cause) {
        if (cause == null) {
            cause = new JobCancellationException(z0(), null, this);
        }
        w0(cause);
        return true;
    }

    @Override // kotlinx.coroutines.channels.w
    @dl.d
    public b0<E> c() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    public final void e(@dl.e CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(z0(), null, this);
        }
        w0(cancellationException);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    public boolean isActive() {
        return super.isActive();
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

    @Override // kotlinx.coroutines.channels.h
    @dl.d
    public ReceiveChannel<E> u() {
        return this._channel.u();
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
}
