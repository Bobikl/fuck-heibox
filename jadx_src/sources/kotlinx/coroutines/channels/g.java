package kotlinx.coroutines.channels;

import com.lzy.okgo.model.Progress;
import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: ArrayChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020'\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Fj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000fR\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010/\u001a\u00060+j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u000fR\u0014\u00108\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0014\u0010?\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u0014\u0010A\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00107R\u0014\u0010E\u001a\u00020B8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006K"}, d2 = {"Lkotlinx/coroutines/channels/g;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/AbstractChannel;", "", Progress.I, "Lkotlinx/coroutines/internal/o0;", "v0", "(I)Lkotlinx/coroutines/internal/o0;", "element", "Lkotlin/b2;", "t0", "(ILjava/lang/Object;)V", "u0", "(I)V", "", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "K", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a0;", "send", "m", "(Lkotlinx/coroutines/channels/a0;)Ljava/lang/Object;", "n0", "()Ljava/lang/Object;", "o0", "(Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/x;", "receive", "", "d0", "(Lkotlinx/coroutines/channels/x;)Z", "wasClosed", "j0", "(Z)V", "e", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "f", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", RXScreenCaptureService.KEY_HEIGHT, "[Ljava/lang/Object;", "buffer", "i", "head", "g0", "()Z", "isBufferAlwaysEmpty", "h0", "isBufferEmpty", "C", "isBufferAlwaysFull", "D", "isBufferFull", "isEmpty", "R", "isClosedForReceive", "", "n", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class g<E> extends AbstractChannel<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] buffer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int head;

    @dl.d
    private volatile /* synthetic */ int size;

    /* JADX INFO: compiled from: ArrayChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129054a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f129054a = iArr;
        }
    }

    public g(int i10, @dl.d BufferOverflow bufferOverflow, @dl.e yh.l<? super E, b2> lVar) {
        super(lVar);
        this.capacity = i10;
        this.onBufferOverflow = bufferOverflow;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        this.lock = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i10, 8)];
        kotlin.collections.m.w2(objArr, kotlinx.coroutines.channels.a.f129023c, 0, 0, 6, null);
        this.buffer = objArr;
        this.size = 0;
    }

    private final void t0(int currentSize, E element) {
        if (currentSize < this.capacity) {
            u0(currentSize);
            Object[] objArr = this.buffer;
            objArr[(this.head + currentSize) % objArr.length] = element;
        } else {
            Object[] objArr2 = this.buffer;
            int i10 = this.head;
            objArr2[i10 % objArr2.length] = null;
            objArr2[(currentSize + i10) % objArr2.length] = element;
            this.head = (i10 + 1) % objArr2.length;
        }
    }

    private final void u0(int currentSize) {
        Object[] objArr = this.buffer;
        if (currentSize >= objArr.length) {
            int iMin = Math.min(objArr.length * 2, this.capacity);
            Object[] objArr2 = new Object[iMin];
            for (int i10 = 0; i10 < currentSize; i10++) {
                Object[] objArr3 = this.buffer;
                objArr2[i10] = objArr3[(this.head + i10) % objArr3.length];
            }
            kotlin.collections.m.n2(objArr2, kotlinx.coroutines.channels.a.f129023c, currentSize, iMin);
            this.buffer = objArr2;
            this.head = 0;
        }
    }

    private final o0 v0(int currentSize) {
        if (currentSize < this.capacity) {
            this.size = currentSize + 1;
            return null;
        }
        int i10 = a.f129054a[this.onBufferOverflow.ordinal()];
        if (i10 == 1) {
            return kotlinx.coroutines.channels.a.f129025e;
        }
        if (i10 == 2) {
            return kotlinx.coroutines.channels.a.f129024d;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean D() {
        return this.size == this.capacity && this.onBufferOverflow == BufferOverflow.SUSPEND;
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object I(E element) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            p<?> pVarP = p();
            if (pVarP != null) {
                reentrantLock.unlock();
                return pVarP;
            }
            o0 o0VarV0 = v0(i10);
            if (o0VarV0 != null) {
                reentrantLock.unlock();
                return o0VarV0;
            }
            if (i10 == 0) {
                while (true) {
                    y<E> yVarQ = Q();
                    if (yVarQ == null) {
                        break;
                    }
                    if (yVarQ instanceof p) {
                        this.size = i10;
                        reentrantLock.unlock();
                        return yVarQ;
                    }
                    f0.m(yVarQ);
                    if (yVarQ.n(element, null) != null) {
                        this.size = i10;
                        b2 b2Var = b2.f124493a;
                        reentrantLock.unlock();
                        yVarQ.e(element);
                        return yVarQ.a();
                    }
                }
            }
            t0(i10, element);
            o0 o0Var = kotlinx.coroutines.channels.a.f129024d;
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
            int i10 = this.size;
            p<?> pVarP = p();
            if (pVarP != null) {
                reentrantLock.unlock();
                return pVarP;
            }
            o0 o0VarV0 = v0(i10);
            if (o0VarV0 != null) {
                reentrantLock.unlock();
                return o0VarV0;
            }
            if (i10 == 0) {
                while (true) {
                    b.d<E> dVarK = k(element);
                    Object objM = select.m(dVarK);
                    if (objM != null) {
                        if (objM == kotlinx.coroutines.channels.a.f129025e) {
                            break;
                        }
                        if (objM != kotlinx.coroutines.internal.c.f130153b) {
                            if (objM != kotlinx.coroutines.selects.g.d() && !(objM instanceof p)) {
                                throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objM).toString());
                            }
                            this.size = i10;
                            reentrantLock.unlock();
                            return objM;
                        }
                    } else {
                        this.size = i10;
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
            if (select.q()) {
                t0(i10, element);
                o0 o0Var = kotlinx.coroutines.channels.a.f129024d;
                reentrantLock.unlock();
                return o0Var;
            }
            this.size = i10;
            Object objD = kotlinx.coroutines.selects.g.d();
            reentrantLock.unlock();
            return objD;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean R() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.R();
        } finally {
            reentrantLock.unlock();
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
        return this.size == 0;
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
    protected void j0(boolean wasClosed) {
        yh.l<E, b2> lVar = this.f129030b;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            UndeliveredElementException undeliveredElementExceptionC = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.buffer[this.head];
                if (lVar != null && obj != kotlinx.coroutines.channels.a.f129023c) {
                    undeliveredElementExceptionC = OnUndeliveredElementKt.c(lVar, obj, undeliveredElementExceptionC);
                }
                Object[] objArr = this.buffer;
                int i12 = this.head;
                objArr[i12] = kotlinx.coroutines.channels.a.f129023c;
                this.head = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            super.j0(wasClosed);
            if (undeliveredElementExceptionC != null) {
                throw undeliveredElementExceptionC;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.e
    protected Object m(@dl.d a0 send) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.m(send);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected String n() {
        return "(buffer:capacity=" + this.capacity + ",size=" + this.size + ')';
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @dl.e
    protected Object n0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object objP = p();
                if (objP == null) {
                    objP = kotlinx.coroutines.channels.a.f129026f;
                }
                reentrantLock.unlock();
                return objP;
            }
            Object[] objArr = this.buffer;
            int i11 = this.head;
            Object obj = objArr[i11];
            a0 a0Var = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object element = kotlinx.coroutines.channels.a.f129026f;
            boolean z10 = false;
            if (i10 == this.capacity) {
                a0 a0Var2 = null;
                while (true) {
                    a0 a0VarS = S();
                    if (a0VarS == null) {
                        a0Var = a0Var2;
                        break;
                    }
                    f0.m(a0VarS);
                    if (a0VarS.o0(null) != null) {
                        element = a0VarS.getElement();
                        z10 = true;
                        a0Var = a0VarS;
                        break;
                    }
                    a0VarS.p0();
                    a0Var2 = a0VarS;
                }
            }
            if (element != kotlinx.coroutines.channels.a.f129026f && !(element instanceof p)) {
                this.size = i10;
                Object[] objArr2 = this.buffer;
                objArr2[(this.head + i10) % objArr2.length] = element;
            }
            this.head = (this.head + 1) % this.buffer.length;
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            if (z10) {
                f0.m(a0Var);
                a0Var.j0();
            }
            return obj;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @dl.e
    protected Object o0(@dl.d kotlinx.coroutines.selects.f<?> select) {
        boolean z10;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object objP = p();
                if (objP == null) {
                    objP = kotlinx.coroutines.channels.a.f129026f;
                }
                reentrantLock.unlock();
                return objP;
            }
            Object[] objArr = this.buffer;
            int i11 = this.head;
            Object obj = objArr[i11];
            Object objO = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object element = kotlinx.coroutines.channels.a.f129026f;
            if (i10 != this.capacity) {
                z10 = false;
                break;
            }
            while (true) {
                AbstractChannel.g<E> gVarB0 = b0();
                Object objM = select.m(gVarB0);
                if (objM != null) {
                    if (objM == kotlinx.coroutines.channels.a.f129026f) {
                        z10 = false;
                        break;
                    }
                    if (objM != kotlinx.coroutines.internal.c.f130153b) {
                        if (objM == kotlinx.coroutines.selects.g.d()) {
                            this.size = i10;
                            this.buffer[this.head] = obj;
                            reentrantLock.unlock();
                            return objM;
                        }
                        if (objM instanceof p) {
                            z10 = true;
                            element = objM;
                            objO = element;
                            break;
                        }
                        throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objM).toString());
                    }
                } else {
                    objO = gVarB0.o();
                    f0.m(objO);
                    element = ((a0) objO).getElement();
                    z10 = true;
                    break;
                }
            }
            if (element != kotlinx.coroutines.channels.a.f129026f && !(element instanceof p)) {
                this.size = i10;
                Object[] objArr2 = this.buffer;
                objArr2[(this.head + i10) % objArr2.length] = element;
            } else if (!select.q()) {
                this.size = i10;
                this.buffer[this.head] = obj;
                Object objD = kotlinx.coroutines.selects.g.d();
                reentrantLock.unlock();
                return objD;
            }
            this.head = (this.head + 1) % this.buffer.length;
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            if (z10) {
                f0.m(objO);
                ((a0) objO).j0();
            }
            return obj;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
