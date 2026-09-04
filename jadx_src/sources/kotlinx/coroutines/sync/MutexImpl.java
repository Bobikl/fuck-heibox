package kotlinx.coroutines.sync;

import com.max.hblogistics.AddressListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r;
import kotlinx.coroutines.s;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.selects.g;
import yh.l;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006%&\t\u001a\u0014\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007JT\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/selects/e;", "", "owner", "Lkotlin/b2;", "i", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.av, "(Ljava/lang/Object;)Z", "e", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "block", "N", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", ak.aF, "f", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "b", "()Z", "isLocked", RXScreenCaptureService.KEY_HEIGHT, "isLockedEmptyQueueState", "d", "()Lkotlinx/coroutines/selects/e;", "onLock", "locked", "<init>", "(Z)V", "LockCont", "LockSelect", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class MutexImpl implements kotlinx.coroutines.sync.c, kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f130436b = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");

    @dl.d
    volatile /* synthetic */ Object _state;

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$a;", "Lkotlinx/coroutines/sync/MutexImpl;", "", "m0", "Lkotlin/b2;", "j0", "", "toString", "Lkotlinx/coroutines/p;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/p;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class LockCont extends a {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final p<b2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public LockCont(@dl.d Object obj, p<? super b2> pVar) {
            super(obj);
            this.cont = pVar;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public void j0() {
            this.cont.V(r.f130311d);
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public boolean m0() {
            if (!k0()) {
                return false;
            }
            p<b2> pVar = this.cont;
            b2 b2Var = b2.f124493a;
            final MutexImpl mutexImpl = MutexImpl.this;
            return pVar.D(b2Var, null, new l<Throwable, b2>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable th2) {
                    mutexImpl.f(this.owner);
                }
            }) != null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "LockCont[" + this.owner + ", " + this.cont + "] for " + MutexImpl.this;
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$a;", "Lkotlinx/coroutines/sync/MutexImpl;", "", "m0", "Lkotlin/b2;", "j0", "", "toString", "Lkotlinx/coroutines/selects/f;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, "", "owner", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/c;", "Lkotlin/coroutines/c;", "block", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/f;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class LockSelect<R> extends a {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final f<R> select;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        @xh.e
        public final yh.p<kotlinx.coroutines.sync.c, kotlin.coroutines.c<? super R>, Object> f130442i;

        /* JADX WARN: Multi-variable type inference failed */
        public LockSelect(@dl.d Object obj, @dl.d f<? super R> fVar, yh.p<? super kotlinx.coroutines.sync.c, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            super(obj);
            this.select = fVar;
            this.f130442i = pVar;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public void j0() throws Throwable {
            yh.p<kotlinx.coroutines.sync.c, kotlin.coroutines.c<? super R>, Object> pVar = this.f130442i;
            MutexImpl mutexImpl = MutexImpl.this;
            kotlin.coroutines.c<R> cVarR = this.select.r();
            final MutexImpl mutexImpl2 = MutexImpl.this;
            bj.a.e(pVar, mutexImpl, cVarR, new l<Throwable, b2>() { // from class: kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable th2) {
                    mutexImpl2.f(this.owner);
                }
            });
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.a
        public boolean m0() {
            return k0() && this.select.q();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "LockSelect[" + this.owner + ", " + this.select + "] for " + MutexImpl.this;
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/h1;", "", "k0", "()Z", "Lkotlin/b2;", "dispose", "()V", "m0", "j0", "", "e", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public abstract class a extends LockFreeLinkedListNode implements h1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f130446g = AtomicIntegerFieldUpdater.newUpdater(a.class, "isTaken");

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Object owner;

        @dl.d
        private volatile /* synthetic */ int isTaken = 0;

        public a(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.h1
        public final void dispose() {
            Z();
        }

        public abstract void j0();

        public final boolean k0() {
            return f130446g.compareAndSet(this, 0, 1);
        }

        public abstract boolean m0();
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$b;", "Lkotlinx/coroutines/internal/v;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b extends v {

        @dl.d
        @xh.e
        public volatile Object owner;

        public b(@dl.d Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @dl.d
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$c;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/d;", "op", "", ak.aF, "failure", "Lkotlin/b2;", ak.av, "Lkotlinx/coroutines/sync/MutexImpl;", "b", "Lkotlinx/coroutines/sync/MutexImpl;", "mutex", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c extends kotlinx.coroutines.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final MutexImpl mutex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Object owner;

        /* JADX INFO: compiled from: Mutex.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$c$a;", "Lkotlinx/coroutines/internal/g0;", "", "affected", ak.aF, "Lkotlinx/coroutines/internal/d;", ak.av, "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl$c;Lkotlinx/coroutines/internal/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        public final class a extends g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final kotlinx.coroutines.internal.d<?> atomicOp;

            public a(kotlinx.coroutines.internal.d<?> dVar) {
                this.atomicOp = dVar;
            }

            @Override // kotlinx.coroutines.internal.g0
            @dl.d
            public kotlinx.coroutines.internal.d<?> a() {
                return this.atomicOp;
            }

            @Override // kotlinx.coroutines.internal.g0
            @dl.e
            public Object c(@dl.e Object affected) {
                Object objA = a().h() ? MutexKt.f130461f : a();
                if (affected == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                }
                androidx.concurrent.futures.a.a(MutexImpl.f130436b, (MutexImpl) affected, this, objA);
                return null;
            }
        }

        public c(@dl.d MutexImpl mutexImpl, @dl.e Object obj) {
            this.mutex = mutexImpl;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        public void a(@dl.d kotlinx.coroutines.internal.d<?> dVar, @dl.e Object obj) {
            kotlinx.coroutines.sync.b bVar;
            if (obj != null) {
                bVar = MutexKt.f130461f;
            } else {
                Object obj2 = this.owner;
                bVar = obj2 == null ? MutexKt.f130460e : new kotlinx.coroutines.sync.b(obj2);
            }
            androidx.concurrent.futures.a.a(MutexImpl.f130436b, this.mutex, dVar, bVar);
        }

        @Override // kotlinx.coroutines.internal.b
        @dl.e
        public Object c(@dl.d kotlinx.coroutines.internal.d<?> op) {
            a aVar = new a(op);
            return !androidx.concurrent.futures.a.a(MutexImpl.f130436b, this.mutex, MutexKt.f130461f, aVar) ? MutexKt.f130456a : aVar.c(this.mutex);
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$d;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/sync/MutexImpl;", "affected", "", "k", "failure", "Lkotlin/b2;", "j", "Lkotlinx/coroutines/sync/MutexImpl$b;", "b", "Lkotlinx/coroutines/sync/MutexImpl$b;", "queue", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl$b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends kotlinx.coroutines.internal.d<MutexImpl> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final b queue;

        public d(@dl.d b bVar) {
            this.queue = bVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(@dl.d MutexImpl mutexImpl, @dl.e Object obj) {
            androidx.concurrent.futures.a.a(MutexImpl.f130436b, mutexImpl, this, obj == null ? MutexKt.f130461f : this.queue);
        }

        @Override // kotlinx.coroutines.internal.d
        @dl.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@dl.d MutexImpl affected) {
            if (this.queue.k0()) {
                return null;
            }
            return MutexKt.f130457b;
        }
    }

    public MutexImpl(boolean z10) {
        this._state = z10 ? MutexKt.f130460e : MutexKt.f130461f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(final Object obj, kotlin.coroutines.c<? super b2> cVar) {
        q qVarB = s.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        LockCont lockCont = new LockCont(obj, qVarB);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                if (bVar.locked != MutexKt.f130459d) {
                    androidx.concurrent.futures.a.a(f130436b, this, obj2, new b(bVar.locked));
                } else {
                    if (androidx.concurrent.futures.a.a(f130436b, this, obj2, obj == null ? MutexKt.f130460e : new kotlinx.coroutines.sync.b(obj))) {
                        qVarB.I0(b2.f124493a, new l<Throwable, b2>() { // from class: kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                                invoke2(th2);
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@dl.d Throwable th2) {
                                this.f130454b.f(obj);
                            }
                        });
                        break;
                    }
                }
            } else if (obj2 instanceof b) {
                b bVar2 = (b) obj2;
                if (!(bVar2.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                bVar2.y(lockCont);
                if (this._state == obj2 || !lockCont.k0()) {
                    s.c(qVarB, lockCont);
                    break;
                }
                lockCont = new LockCont(obj, qVarB);
            } else {
                if (!(obj2 instanceof g0)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((g0) obj2).c(this);
            }
        }
        Object objT = qVarB.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2.f124493a;
    }

    @Override // kotlinx.coroutines.selects.e
    public <R> void N(@dl.d f<? super R> select, @dl.e Object owner, @dl.d yh.p<? super kotlinx.coroutines.sync.c, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        while (!select.o()) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj;
                if (bVar.locked != MutexKt.f130459d) {
                    androidx.concurrent.futures.a.a(f130436b, this, obj, new b(bVar.locked));
                } else {
                    Object objM = select.m(new c(this, owner));
                    if (objM == null) {
                        bj.b.d(block, this, select.r());
                        return;
                    }
                    if (objM == g.d()) {
                        return;
                    }
                    if (objM != MutexKt.f130456a && objM != kotlinx.coroutines.internal.c.f130153b) {
                        throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + objM).toString());
                    }
                }
            } else if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (!(bVar2.owner != owner)) {
                    throw new IllegalStateException(("Already locked by " + owner).toString());
                }
                LockSelect lockSelect = new LockSelect(owner, select, block);
                bVar2.y(lockSelect);
                if (this._state == obj || !lockSelect.k0()) {
                    select.p(lockSelect);
                    return;
                }
            } else {
                if (!(obj instanceof g0)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                ((g0) obj).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean a(@dl.e Object owner) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                if (((kotlinx.coroutines.sync.b) obj).locked != MutexKt.f130459d) {
                    return false;
                }
                if (androidx.concurrent.futures.a.a(f130436b, this, obj, owner == null ? MutexKt.f130460e : new kotlinx.coroutines.sync.b(owner))) {
                    return true;
                }
            } else {
                if (obj instanceof b) {
                    if (((b) obj).owner != owner) {
                        return false;
                    }
                    throw new IllegalStateException(("Already locked by " + owner).toString());
                }
                if (!(obj instanceof g0)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                ((g0) obj).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean b() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return ((kotlinx.coroutines.sync.b) obj).locked != MutexKt.f130459d;
            }
            if (obj instanceof b) {
                return true;
            }
            if (!(obj instanceof g0)) {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
            ((g0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean c(@dl.d Object owner) {
        Object obj = this._state;
        if (obj instanceof kotlinx.coroutines.sync.b) {
            if (((kotlinx.coroutines.sync.b) obj).locked == owner) {
                return true;
            }
        } else if ((obj instanceof b) && ((b) obj).owner == owner) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.c
    @dl.d
    public kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> d() {
        return this;
    }

    @Override // kotlinx.coroutines.sync.c
    @dl.e
    public Object e(@dl.e Object obj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objI;
        return (!a(obj) && (objI = i(obj, cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objI : b2.f124493a;
    }

    @Override // kotlinx.coroutines.sync.c
    public void f(@dl.e Object owner) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                if (owner == null) {
                    if (!(((kotlinx.coroutines.sync.b) obj).locked != MutexKt.f130459d)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj;
                    if (!(bVar.locked == owner)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.locked + " but expected " + owner).toString());
                    }
                }
                if (androidx.concurrent.futures.a.a(f130436b, this, obj, MutexKt.f130461f)) {
                    return;
                }
            } else if (obj instanceof g0) {
                ((g0) obj).c(this);
            } else {
                if (!(obj instanceof b)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                if (owner != null) {
                    b bVar2 = (b) obj;
                    if (!(bVar2.owner == owner)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.owner + " but expected " + owner).toString());
                    }
                }
                b bVar3 = (b) obj;
                LockFreeLinkedListNode lockFreeLinkedListNodeB0 = bVar3.b0();
                if (lockFreeLinkedListNodeB0 == null) {
                    d dVar = new d(bVar3);
                    if (androidx.concurrent.futures.a.a(f130436b, this, obj, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    a aVar = (a) lockFreeLinkedListNodeB0;
                    if (aVar.m0()) {
                        Object obj2 = aVar.owner;
                        if (obj2 == null) {
                            obj2 = MutexKt.f130458c;
                        }
                        bVar3.owner = obj2;
                        aVar.j0();
                        return;
                    }
                }
            }
        }
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof b) && ((b) obj).k0();
    }

    @dl.d
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return "Mutex[" + ((kotlinx.coroutines.sync.b) obj).locked + ']';
            }
            if (!(obj instanceof g0)) {
                if (!(obj instanceof b)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((b) obj).owner + ']';
            }
            ((g0) obj).c(this);
        }
    }
}
