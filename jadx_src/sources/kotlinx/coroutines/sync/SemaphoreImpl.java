package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.r1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.l0;
import kotlinx.coroutines.internal.m0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s;
import yh.l;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/d;", "Lkotlin/b2;", "g", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "cont", "", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlinx/coroutines/p;)Z", "j", "()Z", "i", ak.av, ak.aF, "release", "()V", "", "I", "permits", "b", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class SemaphoreImpl implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130467c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f130468d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130469e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f130470f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f130471g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    @dl.d
    volatile /* synthetic */ int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int permits;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final l<Throwable, b2> f130473b;

    @dl.d
    private volatile /* synthetic */ long deqIdx = 0;

    @dl.d
    private volatile /* synthetic */ long enqIdx = 0;

    @dl.d
    private volatile /* synthetic */ Object head;

    @dl.d
    private volatile /* synthetic */ Object tail;

    public SemaphoreImpl(int i10, int i11) {
        this.permits = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        e eVar = new e(0L, null, 2);
        this.head = eVar;
        this.tail = eVar;
        this._availablePermits = i10 - i11;
        this.f130473b = new l<Throwable, b2>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
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
                this.f130474b.release();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(kotlin.coroutines.c<? super b2> cVar) {
        q qVarB = s.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        while (!h(qVarB)) {
            if (f130471g.getAndDecrement(this) > 0) {
                qVarB.I0(b2.f124493a, this.f130473b);
                break;
            }
        }
        Object objT = qVarB.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(p<? super b2> cont) {
        Object objB;
        boolean z10;
        e eVar = (e) this.tail;
        long andIncrement = f130470f.getAndIncrement(this);
        long j10 = andIncrement / ((long) SemaphoreKt.f130480f);
        do {
            l0 l0Var = eVar;
            while (true) {
                if (l0Var.getId() >= j10 && !l0Var.g()) {
                    objB = m0.b(l0Var);
                    break;
                }
                Object obj = l0Var.get_next();
                if (obj == g.f130167b) {
                    objB = m0.b(g.f130167b);
                    break;
                }
                l0 l0VarJ = (l0) ((h) obj);
                if (l0VarJ == null) {
                    l0VarJ = SemaphoreKt.j(l0Var.getId() + 1, (e) l0Var);
                    if (l0Var.m(l0VarJ)) {
                        if (l0Var.g()) {
                            l0Var.l();
                        }
                    }
                }
                l0Var = l0VarJ;
            }
            if (!m0.h(objB)) {
                l0 l0VarF = m0.f(objB);
                while (true) {
                    l0 l0Var2 = (l0) this.tail;
                    if (l0Var2.getId() < l0VarF.getId()) {
                        if (!l0VarF.r()) {
                            z10 = false;
                            break;
                        }
                        if (androidx.concurrent.futures.a.a(f130469e, this, l0Var2, l0VarF)) {
                            if (l0Var2.n()) {
                                l0Var2.l();
                            }
                        } else if (l0VarF.n()) {
                            l0VarF.l();
                        }
                    }
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        } while (!z10);
        e eVar2 = (e) m0.f(objB);
        int i10 = (int) (andIncrement % ((long) SemaphoreKt.f130480f));
        if (r1.a(eVar2.f130488e, i10, null, cont)) {
            cont.L(new a(eVar2, i10));
            return true;
        }
        if (!r1.a(eVar2.f130488e, i10, SemaphoreKt.f130476b, SemaphoreKt.f130477c)) {
            return false;
        }
        cont.I0(b2.f124493a, this.f130473b);
        return true;
    }

    private final boolean i(p<? super b2> pVar) {
        Object objD = pVar.D(b2.f124493a, null, this.f130473b);
        if (objD == null) {
            return false;
        }
        pVar.V(objD);
        return true;
    }

    private final boolean j() {
        Object objB;
        int i10;
        boolean z10;
        e eVar = (e) this.head;
        long andIncrement = f130468d.getAndIncrement(this);
        long j10 = andIncrement / ((long) SemaphoreKt.f130480f);
        do {
            l0 l0Var = eVar;
            while (true) {
                if (l0Var.getId() >= j10 && !l0Var.g()) {
                    objB = m0.b(l0Var);
                    break;
                }
                Object obj = l0Var.get_next();
                if (obj == g.f130167b) {
                    objB = m0.b(g.f130167b);
                    break;
                }
                l0 l0VarJ = (l0) ((h) obj);
                if (l0VarJ == null) {
                    l0VarJ = SemaphoreKt.j(l0Var.getId() + 1, (e) l0Var);
                    if (l0Var.m(l0VarJ)) {
                        if (l0Var.g()) {
                            l0Var.l();
                        }
                    }
                }
                l0Var = l0VarJ;
            }
            if (m0.h(objB)) {
                break;
            }
            l0 l0VarF = m0.f(objB);
            while (true) {
                l0 l0Var2 = (l0) this.head;
                if (l0Var2.getId() < l0VarF.getId()) {
                    if (!l0VarF.r()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(f130467c, this, l0Var2, l0VarF)) {
                        if (l0Var2.n()) {
                            l0Var2.l();
                        }
                    } else if (l0VarF.n()) {
                        l0VarF.l();
                    }
                }
                z10 = true;
                break;
            }
        } while (!z10);
        e eVar2 = (e) m0.f(objB);
        eVar2.b();
        if (eVar2.getId() > j10) {
            return false;
        }
        int i11 = (int) (andIncrement % ((long) SemaphoreKt.f130480f));
        Object andSet = eVar2.f130488e.getAndSet(i11, SemaphoreKt.f130476b);
        if (andSet != null) {
            if (andSet == SemaphoreKt.f130479e) {
                return false;
            }
            return i((p) andSet);
        }
        int i12 = SemaphoreKt.f130475a;
        for (i10 = 0; i10 < i12; i10++) {
            if (eVar2.f130488e.get(i11) == SemaphoreKt.f130477c) {
                return true;
            }
        }
        return !r1.a(eVar2.f130488e, i11, SemaphoreKt.f130476b, SemaphoreKt.f130478d);
    }

    @Override // kotlinx.coroutines.sync.d
    public boolean a() {
        int i10;
        do {
            i10 = this._availablePermits;
            if (i10 <= 0) {
                return false;
            }
        } while (!f130471g.compareAndSet(this, i10, i10 - 1));
        return true;
    }

    @Override // kotlinx.coroutines.sync.d
    public int b() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.d
    @dl.e
    public Object c(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG;
        return (f130471g.getAndDecrement(this) <= 0 && (objG = g(cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objG : b2.f124493a;
    }

    @Override // kotlinx.coroutines.sync.d
    public void release() {
        while (true) {
            int i10 = this._availablePermits;
            if (!(i10 < this.permits)) {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (f130471g.compareAndSet(this, i10, i10 + 1) && (i10 >= 0 || j())) {
                return;
            }
        }
    }
}
