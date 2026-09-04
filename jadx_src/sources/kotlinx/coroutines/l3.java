package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/l3;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "Lkotlinx/coroutines/CompletionHandler;", "", "state", "", "b", "(I)Ljava/lang/Void;", "d", "()V", ak.av, ak.aF, "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/h1;", "cancelHandle", "<init>", "(Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l3 implements yh.l<Throwable, kotlin.b2> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130266e = AtomicIntegerFieldUpdater.newUpdater(l3.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d2 job;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h1 cancelHandle;

    @dl.d
    private volatile /* synthetic */ int _state = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Thread targetThread = Thread.currentThread();

    public l3(@dl.d d2 d2Var) {
        this.job = d2Var;
    }

    private final Void b(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    public final void a() {
        while (true) {
            int i10 = this._state;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f130266e.compareAndSet(this, i10, 1)) {
                h1 h1Var = this.cancelHandle;
                if (h1Var != null) {
                    h1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void c(@dl.e Throwable cause) {
        int i10;
        do {
            i10 = this._state;
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                b(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f130266e.compareAndSet(this, i10, 2));
        this.targetThread.interrupt();
        this._state = 3;
    }

    public final void d() {
        int i10;
        this.cancelHandle = this.job.i0(true, true, this);
        do {
            i10 = this._state;
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                b(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f130266e.compareAndSet(this, i10, 0));
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        c(th2);
        return kotlin.b2.f124493a;
    }
}
