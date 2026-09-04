package kotlinx.coroutines.internal;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0017\u0013B\u0017\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J3\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010'\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0011\u0010*\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/z;", "", androidx.exifinterface.media.a.S4, "", UCropPlusActivity.ARG_INDEX, "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/z;", "oldHead", "newHead", "m", "(II)Lkotlinx/coroutines/internal/z;", "", "j", "()J", "state", ak.aF, "(J)Lkotlinx/coroutines/internal/z;", "b", "", "d", "()Z", ak.av, "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lkotlinx/coroutines/internal/z;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Lyh/l;)Ljava/util/List;", "g", "I", "capacity", "Z", "singleConsumer", "mask", RXScreenCaptureService.KEY_HEIGHT, "isEmpty", "f", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class z<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f130217h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f130218i = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f130219j = 1073741823;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f130220k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f130221l = 1073741823;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f130222m = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f130223n = 1152921503533105152L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f130224o = 60;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f130225p = 1152921504606846976L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f130226q = 61;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f130227r = 2305843009213693952L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f130228s = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f130230u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f130231v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f130232w = 2;

    @dl.d
    private volatile /* synthetic */ Object _next = null;

    @dl.d
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleConsumer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private /* synthetic */ AtomicReferenceArray f130236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f130229t = new o0("REMOVE_FROZEN");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130215f = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_next");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f130216g = AtomicLongFieldUpdater.newUpdater(z.class, "_state");

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/z$a;", "", "", "other", "e", "", "newHead", "b", "newTail", ak.aF, androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlin/m0;", "name", "head", "tail", "block", "d", "(JLyh/p;)Ljava/lang/Object;", ak.av, "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/o0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/o0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & z.f130227r) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return e(j10, z.f130221l) | (((long) i10) << 0);
        }

        public final long c(long j10, int i10) {
            return e(j10, z.f130223n) | (((long) i10) << 30);
        }

        public final <T> T d(long j10, @dl.d yh.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) ((z.f130221l & j10) >> 0)), Integer.valueOf((int) ((j10 & z.f130223n) >> 30)));
        }

        public final long e(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/z$b;", "", "", ak.av, "I", UCropPlusActivity.ARG_INDEX, "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int index;

        public b(int i10) {
            this.index = i10;
        }
    }

    public z(int i10, boolean z10) {
        this.capacity = i10;
        this.singleConsumer = z10;
        int i11 = i10 - 1;
        this.mask = i11;
        this.f130236d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final z<E> b(long state) {
        z<E> zVar = new z<>(this.capacity * 2, this.singleConsumer);
        int i10 = (int) ((f130221l & state) >> 0);
        int i11 = (int) ((f130223n & state) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i11 & i12)) {
                zVar._state = INSTANCE.e(state, f130225p);
                return zVar;
            }
            Object bVar = this.f130236d.get(i12 & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            zVar.f130236d.set(zVar.mask & i10, bVar);
            i10++;
        }
    }

    private final z<E> c(long state) {
        while (true) {
            z<E> zVar = (z) this._next;
            if (zVar != null) {
                return zVar;
            }
            androidx.concurrent.futures.a.a(f130215f, this, null, b(state));
        }
    }

    private final z<E> e(int index, E element) {
        Object obj = this.f130236d.get(this.mask & index);
        if (!(obj instanceof b) || ((b) obj).index != index) {
            return null;
        }
        this.f130236d.set(index & this.mask, element);
        return this;
    }

    private final long j() {
        long j10;
        long j11;
        do {
            j10 = this._state;
            if ((j10 & f130225p) != 0) {
                return j10;
            }
            j11 = j10 | f130225p;
        } while (!f130216g.compareAndSet(this, j10, j11));
        return j11;
    }

    private final z<E> m(int oldHead, int newHead) {
        long j10;
        int i10;
        do {
            j10 = this._state;
            i10 = (int) ((f130221l & j10) >> 0);
            if ((f130225p & j10) != 0) {
                return k();
            }
        } while (!f130216g.compareAndSet(this, j10, INSTANCE.b(j10, newHead)));
        this.f130236d.set(i10 & this.mask, null);
        return null;
    }

    public final int a(@dl.d E element) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return INSTANCE.a(j10);
            }
            int i10 = (int) ((f130221l & j10) >> 0);
            int i11 = (int) ((f130223n & j10) >> 30);
            int i12 = this.mask;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.singleConsumer && this.f130236d.get(i11 & i12) != null) {
                int i13 = this.capacity;
                if (i13 < 1024 || ((i11 - i10) & f130219j) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f130216g.compareAndSet(this, j10, INSTANCE.c(j10, (i11 + 1) & f130219j))) {
                this.f130236d.set(i11 & i12, element);
                z<E> zVarE = this;
                while ((zVarE._state & f130225p) != 0 && (zVarE = zVarE.k().e(i11, element)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & f130227r) != 0) {
                return true;
            }
            if ((f130225p & j10) != 0) {
                return false;
            }
        } while (!f130216g.compareAndSet(this, j10, j10 | f130227r));
        return true;
    }

    public final int f() {
        long j10 = this._state;
        return (((int) ((j10 & f130223n) >> 30)) - ((int) ((f130221l & j10) >> 0))) & f130219j;
    }

    public final boolean g() {
        return (this._state & f130227r) != 0;
    }

    public final boolean h() {
        long j10 = this._state;
        return ((int) ((f130221l & j10) >> 0)) == ((int) ((j10 & f130223n) >> 30));
    }

    @dl.d
    public final <R> List<R> i(@dl.d yh.l<? super E, ? extends R> transform) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j10 = this._state;
        int i10 = (int) ((f130221l & j10) >> 0);
        int i11 = (int) ((j10 & f130223n) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i11 & i12)) {
                return arrayList;
            }
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) this.f130236d.get(i12 & i10);
            if (aVar != null && !(aVar instanceof b)) {
                arrayList.add(transform.invoke(aVar));
            }
            i10++;
        }
    }

    @dl.d
    public final z<E> k() {
        return c(j());
    }

    @dl.e
    public final Object l() {
        while (true) {
            long j10 = this._state;
            if ((f130225p & j10) != 0) {
                return f130229t;
            }
            int i10 = (int) ((f130221l & j10) >> 0);
            int i11 = (int) ((f130223n & j10) >> 30);
            int i12 = this.mask;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f130236d.get(i12 & i10);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & f130219j;
                if (f130216g.compareAndSet(this, j10, INSTANCE.b(j10, i13))) {
                    this.f130236d.set(this.mask & i10, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    z<E> zVarM = this;
                    do {
                        zVarM = zVarM.m(i10, i13);
                    } while (zVarM != null);
                    return obj;
                }
            }
        }
    }
}
