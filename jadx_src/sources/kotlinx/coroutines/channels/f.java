package kotlinx.coroutines.channels;

import com.max.hblogistics.AddressListActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001QB\u000f\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bP\u0010EJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001e\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00028\u00002\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0014¢\u0006\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b)\u0010*R\u0018\u00100\u001a\u00060,j\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R6\u0010:\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f05j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`68\u0002X\u0082\u0004¢\u0006\f\n\u0004\b7\u00108\u0012\u0004\b9\u0010\u000bR$\u0010?\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010>R$\u0010B\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u0010>R$\u0010F\u001a\u00020(2\u0006\u0010;\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bC\u0010*\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lkotlinx/coroutines/channels/f;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/b;", "Lkotlinx/coroutines/channels/h;", "", "cause", "", "Y", "(Ljava/lang/Throwable;)Z", "Lkotlin/b2;", "Z", "()V", "Lkotlinx/coroutines/channels/f$a;", "addSub", "removeSub", "k0", "(Lkotlinx/coroutines/channels/f$a;Lkotlinx/coroutines/channels/f$a;)V", "", "a0", "()J", UCropPlusActivity.ARG_INDEX, "b0", "(J)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", ak.aG, "()Lkotlinx/coroutines/channels/ReceiveChannel;", "U", "b", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "I", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "K", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "", "c0", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "f", "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "g", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", RXScreenCaptureService.KEY_HEIGHT, "Ljava/util/List;", "getSubscribers$annotations", "subscribers", "value", "d0", "h0", "(J)V", "head", "g0", "j0", "tail", "e0", "i0", "(I)V", UiKitSpanObj.TYPE_SIZE, "C", "()Z", "isBufferAlwaysFull", "D", "isBufferFull", "", "n", "()Ljava/lang/String;", "bufferDebugString", "<init>", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f<E> extends b<E> implements h<E> {

    @dl.d
    private volatile /* synthetic */ long _head;

    @dl.d
    private volatile /* synthetic */ int _size;

    @dl.d
    private volatile /* synthetic */ long _tail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ReentrantLock bufferLock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] buffer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<a<E>> subscribers;

    /* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006¨\u0006."}, d2 = {"Lkotlinx/coroutines/channels/f$a;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "v0", "()Z", "", "w0", "()Ljava/lang/Object;", "", "cause", "U", "(Ljava/lang/Throwable;)Z", "t0", "n0", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "o0", "(Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f;", "e", "Lkotlinx/coroutines/channels/f;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "f", "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "u0", "()J", "x0", "(J)V", "subHead", "g0", "isBufferAlwaysEmpty", "h0", "isBufferEmpty", "C", "isBufferAlwaysFull", "D", "isBufferFull", "<init>", "(Lkotlinx/coroutines/channels/f;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<E> extends AbstractChannel<E> implements ReceiveChannel<E> {

        @dl.d
        private volatile /* synthetic */ long _subHead;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f<E> broadcastChannel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ReentrantLock subLock;

        public a(@dl.d f<E> fVar) {
            super(null);
            this.broadcastChannel = fVar;
            this.subLock = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean v0() {
            if (o() != null) {
                return false;
            }
            return (h0() && this.broadcastChannel.o() == null) ? false : true;
        }

        private final Object w0() {
            long j10 = get_subHead();
            p<?> pVarO = this.broadcastChannel.o();
            if (j10 < this.broadcastChannel.get_tail()) {
                Object objB0 = this.broadcastChannel.b0(j10);
                p<?> pVarO2 = o();
                return pVarO2 != null ? pVarO2 : objB0;
            }
            if (pVarO != null) {
                return pVarO;
            }
            p<?> pVarO3 = o();
            return pVarO3 == null ? kotlinx.coroutines.channels.a.f129026f : pVarO3;
        }

        @Override // kotlinx.coroutines.channels.b
        protected boolean C() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.b
        protected boolean D() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.b0
        public boolean U(@dl.e Throwable cause) {
            boolean zU = super.U(cause);
            if (zU) {
                f.l0(this.broadcastChannel, null, this, 1, null);
                ReentrantLock reentrantLock = this.subLock;
                reentrantLock.lock();
                try {
                    x0(this.broadcastChannel.get_tail());
                    b2 b2Var = b2.f124493a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return zU;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean g0() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean h0() {
            return get_subHead() >= this.broadcastChannel.get_tail();
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @dl.e
        protected Object n0() {
            boolean z10;
            ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                Object objW0 = w0();
                if ((objW0 instanceof p) || objW0 == kotlinx.coroutines.channels.a.f129026f) {
                    z10 = false;
                } else {
                    x0(get_subHead() + 1);
                    z10 = true;
                }
                reentrantLock.unlock();
                p pVar = objW0 instanceof p ? (p) objW0 : null;
                if (pVar != null) {
                    U(pVar.closeCause);
                }
                if (t0() ? true : z10) {
                    f.l0(this.broadcastChannel, null, null, 3, null);
                }
                return objW0;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @dl.e
        protected Object o0(@dl.d kotlinx.coroutines.selects.f<?> select) {
            ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                Object objW0 = w0();
                boolean z10 = false;
                if (!(objW0 instanceof p) && objW0 != kotlinx.coroutines.channels.a.f129026f) {
                    if (select.q()) {
                        x0(get_subHead() + 1);
                        z10 = true;
                    } else {
                        objW0 = kotlinx.coroutines.selects.g.d();
                    }
                }
                reentrantLock.unlock();
                p pVar = objW0 instanceof p ? (p) objW0 : null;
                if (pVar != null) {
                    U(pVar.closeCause);
                }
                if (t0() ? true : z10) {
                    f.l0(this.broadcastChannel, null, null, 3, null);
                }
                return objW0;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean t0() {
            p pVar;
            boolean z10 = false;
            while (true) {
                pVar = null;
                if (!v0() || !this.subLock.tryLock()) {
                    break;
                }
                try {
                    Object objW0 = w0();
                    if (objW0 != kotlinx.coroutines.channels.a.f129026f) {
                        if (objW0 instanceof p) {
                            pVar = (p) objW0;
                        } else {
                            y<E> yVarQ = Q();
                            if (yVarQ != 0 && !(yVarQ instanceof p)) {
                                if (yVarQ.n(objW0, null) != null) {
                                    x0(get_subHead() + 1);
                                    z10 = true;
                                    this.subLock.unlock();
                                    yVarQ.e(objW0);
                                }
                            }
                        }
                        this.subLock.unlock();
                        break;
                    }
                    this.subLock.unlock();
                } catch (Throwable th2) {
                    this.subLock.unlock();
                    throw th2;
                }
            }
            if (pVar != null) {
                U(pVar.closeCause);
            }
            return z10;
        }

        /* JADX INFO: renamed from: u0, reason: from getter */
        public final long get_subHead() {
            return this._subHead;
        }

        public final void x0(long j10) {
            this._subHead = j10;
        }
    }

    public f(int i10) {
        super(null);
        this.capacity = i10;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        this.bufferLock = new ReentrantLock();
        this.buffer = new Object[i10];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.subscribers = kotlinx.coroutines.internal.f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.channels.h
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final boolean b(Throwable cause) {
        boolean zU = U(cause);
        Iterator<a<E>> it = this.subscribers.iterator();
        while (it.hasNext()) {
            it.next().b(cause);
        }
        return zU;
    }

    private final void Z() {
        boolean z10;
        Iterator<a<E>> it = this.subscribers.iterator();
        boolean z11 = false;
        loop0: while (true) {
            z10 = z11;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else if (it.next().t0()) {
                    break;
                } else {
                    z10 = true;
                }
            }
            z11 = true;
        }
        if (z11 || !z10) {
            l0(this, null, null, 3, null);
        }
    }

    private final long a0() {
        Iterator<a<E>> it = this.subscribers.iterator();
        long jC = Long.MAX_VALUE;
        while (it.hasNext()) {
            jC = fi.u.C(jC, it.next().get_subHead());
        }
        return jC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E b0(long index) {
        return (E) this.buffer[(int) (index % ((long) this.capacity))];
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    private final long get_head() {
        return this._head;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    private final int get_size() {
        return this._size;
    }

    private static /* synthetic */ void f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0, reason: from getter */
    public final long get_tail() {
        return this._tail;
    }

    private final void h0(long j10) {
        this._head = j10;
    }

    private final void i0(int i10) {
        this._size = i10;
    }

    private final void j0(long j10) {
        this._tail = j10;
    }

    private final void k0(a<E> addSub, a<E> removeSub) {
        a0 a0VarS;
        while (true) {
            ReentrantLock reentrantLock = this.bufferLock;
            reentrantLock.lock();
            if (addSub != null) {
                try {
                    addSub.x0(get_tail());
                    boolean zIsEmpty = this.subscribers.isEmpty();
                    this.subscribers.add(addSub);
                    if (!zIsEmpty) {
                        reentrantLock.unlock();
                        return;
                    }
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            if (removeSub != null) {
                this.subscribers.remove(removeSub);
                if (get_head() != removeSub.get_subHead()) {
                    reentrantLock.unlock();
                    return;
                }
            }
            long jA0 = a0();
            long j10 = get_tail();
            long j11 = get_head();
            long jC = fi.u.C(jA0, j10);
            if (jC <= j11) {
                reentrantLock.unlock();
                return;
            }
            int i10 = get_size();
            while (true) {
                if (j11 >= jC) {
                    reentrantLock.unlock();
                    return;
                }
                Object[] objArr = this.buffer;
                int i11 = this.capacity;
                objArr[(int) (j11 % ((long) i11))] = null;
                boolean z10 = i10 >= i11;
                j11++;
                h0(j11);
                i10--;
                i0(i10);
                if (z10) {
                    while (true) {
                        a0VarS = S();
                        if (a0VarS != null && !(a0VarS instanceof p)) {
                            f0.m(a0VarS);
                            if (a0VarS.o0(null) != null) {
                                break;
                            }
                        }
                    }
                }
            }
            this.buffer[(int) (j10 % ((long) this.capacity))] = a0VarS.getElement();
            i0(i10 + 1);
            j0(j10 + 1);
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            a0VarS.j0();
            Z();
            addSub = null;
            removeSub = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l0(f fVar, a aVar, a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        fVar.k0(aVar, aVar2);
    }

    @Override // kotlinx.coroutines.channels.b
    protected boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.b
    protected boolean D() {
        return get_size() >= this.capacity;
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object I(E element) {
        ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            p<?> pVarP = p();
            if (pVarP != null) {
                reentrantLock.unlock();
                return pVarP;
            }
            int i10 = get_size();
            if (i10 >= this.capacity) {
                o0 o0Var = kotlinx.coroutines.channels.a.f129025e;
                reentrantLock.unlock();
                return o0Var;
            }
            long j10 = get_tail();
            this.buffer[(int) (j10 % ((long) this.capacity))] = element;
            i0(i10 + 1);
            j0(j10 + 1);
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            Z();
            return kotlinx.coroutines.channels.a.f129024d;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected Object K(E element, @dl.d kotlinx.coroutines.selects.f<?> select) {
        ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            p<?> pVarP = p();
            if (pVarP != null) {
                reentrantLock.unlock();
                return pVarP;
            }
            int i10 = get_size();
            if (i10 >= this.capacity) {
                o0 o0Var = kotlinx.coroutines.channels.a.f129025e;
                reentrantLock.unlock();
                return o0Var;
            }
            if (!select.q()) {
                Object objD = kotlinx.coroutines.selects.g.d();
                reentrantLock.unlock();
                return objD;
            }
            long j10 = get_tail();
            this.buffer[(int) (j10 % ((long) this.capacity))] = element;
            i0(i10 + 1);
            j0(j10 + 1);
            b2 b2Var = b2.f124493a;
            reentrantLock.unlock();
            Z();
            return kotlinx.coroutines.channels.a.f129024d;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.b0
    public boolean U(@dl.e Throwable cause) {
        if (!super.U(cause)) {
            return false;
        }
        Z();
        return true;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // kotlinx.coroutines.channels.h
    public void e(@dl.e CancellationException cause) {
        b(cause);
    }

    @Override // kotlinx.coroutines.channels.b
    @dl.d
    protected String n() {
        return "(buffer:capacity=" + this.buffer.length + ",size=" + get_size() + ')';
    }

    @Override // kotlinx.coroutines.channels.h
    @dl.d
    public ReceiveChannel<E> u() {
        a aVar = new a(this);
        l0(this, aVar, null, 2, null);
        return aVar;
    }
}
