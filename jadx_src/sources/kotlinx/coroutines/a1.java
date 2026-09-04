package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/a1;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/k0;", "", "N1", "()Z", "M1", "", "state", "Lkotlin/b2;", "q0", "(Ljava/lang/Object;)V", "F1", "L1", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlin/coroutines/c;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a1<T> extends kotlinx.coroutines.internal.k0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f128718e = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_decision");

    @dl.d
    private volatile /* synthetic */ int _decision;

    public a1(@dl.d CoroutineContext coroutineContext, @dl.d kotlin.coroutines.c<? super T> cVar) {
        super(coroutineContext, cVar);
        this._decision = 0;
    }

    private final boolean M1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f128718e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean N1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f128718e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.k0, kotlinx.coroutines.a
    protected void F1(@dl.e Object state) {
        if (M1()) {
            return;
        }
        kotlinx.coroutines.internal.m.g(IntrinsicsKt__IntrinsicsJvmKt.d(this.uCont), i0.a(state, this.uCont), null, 2, null);
    }

    @dl.e
    public final Object L1() {
        if (N1()) {
            return kotlin.coroutines.intrinsics.b.h();
        }
        Object objO = k2.o(T0());
        if (objO instanceof d0) {
            throw ((d0) objO).cause;
        }
        return objO;
    }

    @Override // kotlinx.coroutines.internal.k0, kotlinx.coroutines.JobSupport
    protected void q0(@dl.e Object state) {
        F1(state);
    }
}
