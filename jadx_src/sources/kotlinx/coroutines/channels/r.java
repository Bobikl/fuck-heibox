package kotlinx.coroutines.channels;

import com.max.hblogistics.AddressListActivity;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: ConflatedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010.\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010,j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`-¢\u0006\u0004\b/\u00100J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, d2 = {"Lkotlinx/coroutines/channels/r;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/AbstractChannel;", "", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "t0", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "K", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "n0", "o0", "", "wasClosed", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/channels/x;", "receive", "d0", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "f", "Ljava/lang/Object;", "value", "g0", "()Z", "isBufferAlwaysEmpty", "h0", "isBufferEmpty", "C", "isBufferAlwaysFull", "D", "isBufferFull", "isEmpty", "", "n", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class r<E> extends AbstractChannel<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object value;

    public r(@dl.e yh.l<? super E, b2> lVar) {
        super(lVar);
        this.lock = new ReentrantLock();
        this.value = a.f129023c;
    }

    private final UndeliveredElementException t0(Object element) {
        yh.l<E, b2> lVar;
        Object obj = this.value;
        UndeliveredElementException undeliveredElementExceptionD = null;
        if (obj != a.f129023c && (lVar = this.f129030b) != null) {
            undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, obj, null, 2, null);
        }
        this.value = element;
        return undeliveredElementExceptionD;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object I(E element) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            p<?> pVarP = p();
            if (pVarP != null) {
                reentrantLock.unlock();
                return pVarP;
            }
            if (this.value == a.f129023c) {
                while (true) {
                    y<E> yVarQ = Q();
                    if (yVarQ == null) {
                        break;
                    }
                    if (yVarQ instanceof p) {
                        reentrantLock.unlock();
                        return yVarQ;
                    }
                    f0.m(yVarQ);
                    if (yVarQ.n(element, null) != null) {
                        b2 b2Var = b2.f124493a;
                        reentrantLock.unlock();
                        yVarQ.e(element);
                        return yVarQ.a();
                    }
                }
            }
            UndeliveredElementException undeliveredElementExceptionT0 = t0(element);
            if (undeliveredElementExceptionT0 != null) {
                throw undeliveredElementExceptionT0;
            }
            o0 o0Var = a.f129024d;
            reentrantLock.unlock();
            return o0Var;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object K(E element, @dl.d kotlinx.coroutines.selects.f<?> select) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            p<?> pVarP = p();
            if (pVarP != null) {
                reentrantLock.unlock();
                return pVarP;
            }
            if (this.value == a.f129023c) {
                while (true) {
                    b.d<E> dVarK = k(element);
                    Object objM = select.m(dVarK);
                    if (objM != null) {
                        if (objM == a.f129025e) {
                            break;
                        }
                        if (objM != kotlinx.coroutines.internal.c.f130153b) {
                            if (objM != kotlinx.coroutines.selects.g.d() && !(objM instanceof p)) {
                                throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objM).toString());
                            }
                            reentrantLock.unlock();
                            return objM;
                        }
                    } else {
                        y<? super E> yVarO = dVarK.o();
                        b2 b2Var = b2.f124493a;
                        reentrantLock.unlock();
                        f0.m(yVarO);
                        y<? super E> yVar = yVarO;
                        yVar.e(element);
                        return yVar.a();
                    }
                }
            }
            if (!select.q()) {
                Object objD = kotlinx.coroutines.selects.g.d();
                reentrantLock.unlock();
                return objD;
            }
            UndeliveredElementException undeliveredElementExceptionT0 = t0(element);
            if (undeliveredElementExceptionT0 != null) {
                throw undeliveredElementExceptionT0;
            }
            o0 o0Var = a.f129024d;
            reentrantLock.unlock();
            return o0Var;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected boolean d0(@dl.d x<? super E> receive) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.d0(receive);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean g0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean h0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.value == a.f129023c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return i0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void j0(boolean z10) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            UndeliveredElementException undeliveredElementExceptionT0 = t0(a.f129023c);
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            super.j0(z10);
            if (undeliveredElementExceptionT0 != null) {
                throw undeliveredElementExceptionT0;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected String n() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return "(value=" + this.value + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @dl.e
    protected Object n0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object obj = this.value;
            o0 o0Var = a.f129023c;
            if (obj != o0Var) {
                this.value = o0Var;
                b2 b2Var = b2.f124493a;
                return obj;
            }
            Object objP = p();
            if (objP == null) {
                objP = a.f129026f;
            }
            return objP;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @dl.e
    protected Object o0(@dl.d kotlinx.coroutines.selects.f<?> select) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object obj = this.value;
            o0 o0Var = a.f129023c;
            if (obj == o0Var) {
                Object objP = p();
                if (objP == null) {
                    objP = a.f129026f;
                }
                return objP;
            }
            if (!select.q()) {
                return kotlinx.coroutines.selects.g.d();
            }
            Object obj2 = this.value;
            this.value = o0Var;
            b2 b2Var = b2.f124493a;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
