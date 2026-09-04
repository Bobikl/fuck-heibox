package kotlinx.coroutines;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006<"}, d2 = {"Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/y0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "X0", "(Ljava/lang/Runnable;)Z", "R0", "()Ljava/lang/Runnable;", "Lkotlin/b2;", "M0", "()V", "Lkotlinx/coroutines/m1$c;", "f1", "(Lkotlinx/coroutines/m1$c;)Z", "", "now", "delayedTask", "", "b1", "(JLkotlinx/coroutines/m1$c;)I", "Y0", "shutdown", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "o", "(JLkotlinx/coroutines/p;)V", "block", "Lkotlinx/coroutines/h1;", "d1", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/h1;", "D0", "()J", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "O", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "W0", "(Ljava/lang/Runnable;)V", "a1", "(JLkotlinx/coroutines/m1$c;)V", "Z0", "value", "x", "()Z", "e1", "(Z)V", "isCompleted", "z0", "isEmpty", "v0", "nextTime", "<init>", ak.av, "b", ak.aF, "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class m1 extends n1 implements y0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130272g = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_queue");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130273h = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_delayed");

    @dl.d
    private volatile /* synthetic */ Object _queue = null;

    @dl.d
    private volatile /* synthetic */ Object _delayed = null;

    @dl.d
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/m1$a;", "Lkotlinx/coroutines/m1$c;", "Lkotlin/b2;", "run", "", "toString", "Lkotlinx/coroutines/p;", "d", "Lkotlinx/coroutines/p;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/m1;JLkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final p<kotlin.b2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d long j10, p<? super kotlin.b2> pVar) {
            super(j10);
            this.cont = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.s0(m1.this, kotlin.b2.f124493a);
        }

        @Override // kotlinx.coroutines.m1.c
        @dl.d
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/m1$b;", "Lkotlinx/coroutines/m1$c;", "Lkotlin/b2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "d", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Runnable block;

        public b(long j10, @dl.d Runnable runnable) {
            super(j10);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.m1.c
        @dl.d
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lkotlinx/coroutines/m1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/internal/x0;", "other", "", "d", "", "now", "", "f", "Lkotlinx/coroutines/m1$d;", "delayed", "Lkotlinx/coroutines/m1;", "eventLoop", "e", "Lkotlin/b2;", "dispose", "", "toString", "b", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", ak.aF, "I", "getIndex", "()I", "setIndex", "(I)V", UCropPlusActivity.ARG_INDEX, "Lkotlinx/coroutines/internal/w0;", "value", "()Lkotlinx/coroutines/internal/w0;", ak.av, "(Lkotlinx/coroutines/internal/w0;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class c implements Runnable, Comparable<c>, h1, kotlinx.coroutines.internal.x0 {

        @dl.e
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long nanoTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        public c(long j10) {
            this.nanoTime = j10;
        }

        @Override // kotlinx.coroutines.internal.x0
        public void a(@dl.e kotlinx.coroutines.internal.w0<?> w0Var) {
            if (!(this._heap != p1.f130289a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = w0Var;
        }

        @Override // kotlinx.coroutines.internal.x0
        @dl.e
        public kotlinx.coroutines.internal.w0<?> b() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.w0) {
                return (kotlinx.coroutines.internal.w0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(@dl.d c other) {
            long j10 = this.nanoTime - other.nanoTime;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.h1
        public final synchronized void dispose() {
            Object obj = this._heap;
            if (obj == p1.f130289a) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.k(this);
            }
            this._heap = p1.f130289a;
        }

        public final synchronized int e(long now, @dl.d d delayed, @dl.d m1 eventLoop) {
            if (this._heap == p1.f130289a) {
                return 2;
            }
            synchronized (delayed) {
                c cVarF = delayed.f();
                if (eventLoop.x()) {
                    return 1;
                }
                if (cVarF == null) {
                    delayed.timeNow = now;
                } else {
                    long j10 = cVarF.nanoTime;
                    if (j10 - now < 0) {
                        now = j10;
                    }
                    if (now - delayed.timeNow > 0) {
                        delayed.timeNow = now;
                    }
                }
                long j11 = this.nanoTime;
                long j12 = delayed.timeNow;
                if (j11 - j12 < 0) {
                    this.nanoTime = j12;
                }
                delayed.a(this);
                return 0;
            }
        }

        public final boolean f(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // kotlinx.coroutines.internal.x0
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.x0
        public void setIndex(int i10) {
            this.index = i10;
        }

        @dl.d
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/m1$d;", "Lkotlinx/coroutines/internal/w0;", "Lkotlinx/coroutines/m1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends kotlinx.coroutines.internal.w0<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long timeNow;

        public d(long j10) {
            this.timeNow = j10;
        }
    }

    private final void M0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f130272g, this, null, p1.f130296h)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.z) {
                ((kotlinx.coroutines.internal.z) obj).d();
                return;
            } else {
                if (obj == p1.f130296h) {
                    return;
                }
                kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(8, true);
                zVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f130272g, this, obj, zVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable R0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.z) {
                kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) obj;
                Object objL = zVar.l();
                if (objL != kotlinx.coroutines.internal.z.f130229t) {
                    return (Runnable) objL;
                }
                androidx.concurrent.futures.a.a(f130272g, this, obj, zVar.k());
            } else {
                if (obj == p1.f130296h) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f130272g, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean X0(Runnable task) {
        while (true) {
            Object obj = this._queue;
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f130272g, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.z) {
                kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) obj;
                int iA = zVar.a(task);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.a.a(f130272g, this, obj, zVar.k());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == p1.f130296h) {
                    return false;
                }
                kotlinx.coroutines.internal.z zVar2 = new kotlinx.coroutines.internal.z(8, true);
                zVar2.a((Runnable) obj);
                zVar2.a(task);
                if (androidx.concurrent.futures.a.a(f130272g, this, obj, zVar2)) {
                    return true;
                }
            }
        }
    }

    private final void Y0() {
        c cVarN;
        kotlinx.coroutines.b bVarB = kotlinx.coroutines.c.b();
        long jB = bVarB != null ? bVarB.b() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (cVarN = dVar.n()) == null) {
                return;
            } else {
                I0(jB, cVarN);
            }
        }
    }

    private final int b1(long now, c delayedTask) {
        if (x()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f130273h, this, null, new d(now));
            Object obj = this._delayed;
            kotlin.jvm.internal.f0.m(obj);
            dVar = (d) obj;
        }
        return delayedTask.e(now, dVar, this);
    }

    private final void e1(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    private final boolean f1(c task) {
        d dVar = (d) this._delayed;
        return (dVar != null ? dVar.i() : null) == task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean x() {
        return this._isCompleted;
    }

    @Override // kotlinx.coroutines.l1
    public long D0() {
        c cVarL;
        if (E0()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            kotlinx.coroutines.b bVarB = kotlinx.coroutines.c.b();
            long jB = bVarB != null ? bVarB.b() : System.nanoTime();
            do {
                synchronized (dVar) {
                    c cVarF = dVar.f();
                    cVarL = null;
                    if (cVarF != null) {
                        c cVar = cVarF;
                        cVarL = cVar.f(jB) ? X0(cVar) : false ? dVar.l(0) : null;
                    }
                }
            } while (cVarL != null);
        }
        Runnable runnableR0 = R0();
        if (runnableR0 == null) {
            return v0();
        }
        runnableR0.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.y0
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @dl.e
    public Object N(long j10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return y0.a.a(this, j10, cVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void O(@dl.d CoroutineContext context, @dl.d Runnable block) {
        W0(block);
    }

    public void W0(@dl.d Runnable task) {
        if (X0(task)) {
            J0();
        } else {
            u0.f130491i.W0(task);
        }
    }

    protected final void Z0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void a1(long now, @dl.d c delayedTask) {
        int iB1 = b1(now, delayedTask);
        if (iB1 == 0) {
            if (f1(delayedTask)) {
                J0();
            }
        } else if (iB1 == 1) {
            I0(now, delayedTask);
        } else if (iB1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @dl.d
    protected final h1 d1(long timeMillis, @dl.d Runnable block) {
        long jD = p1.d(timeMillis);
        if (jD >= kotlin.time.g.f128637c) {
            return q2.f130305b;
        }
        kotlinx.coroutines.b bVarB = kotlinx.coroutines.c.b();
        long jB = bVarB != null ? bVarB.b() : System.nanoTime();
        b bVar = new b(jD + jB, block);
        a1(jB, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.y0
    public void o(long timeMillis, @dl.d p<? super kotlin.b2> continuation) {
        long jD = p1.d(timeMillis);
        if (jD < kotlin.time.g.f128637c) {
            kotlinx.coroutines.b bVarB = kotlinx.coroutines.c.b();
            long jB = bVarB != null ? bVarB.b() : System.nanoTime();
            a aVar = new a(jD + jB, continuation);
            a1(jB, aVar);
            s.a(continuation, aVar);
        }
    }

    @Override // kotlinx.coroutines.y0
    @dl.d
    public h1 r(long j10, @dl.d Runnable runnable, @dl.d CoroutineContext coroutineContext) {
        return y0.a.b(this, j10, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.l1
    public void shutdown() {
        i3.f130113a.c();
        e1(true);
        M0();
        while (D0() <= 0) {
        }
        Y0();
    }

    @Override // kotlinx.coroutines.l1
    protected long v0() {
        c cVarI;
        if (super.v0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                return obj == p1.f130296h ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.z) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (cVarI = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarI.nanoTime;
        kotlinx.coroutines.b bVarB = kotlinx.coroutines.c.b();
        return fi.u.v(j10 - (bVarB != null ? bVarB.b() : System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.l1
    protected boolean z0() {
        if (!C0()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.z) {
                return ((kotlinx.coroutines.internal.z) obj).h();
            }
            if (obj != p1.f130296h) {
                return false;
            }
        }
        return true;
    }
}
