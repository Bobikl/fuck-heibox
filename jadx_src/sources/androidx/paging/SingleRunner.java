package androidx.paging;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u000b\u0014B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/paging/SingleRunner;", "", "", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "block", "b", "(ILyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/SingleRunner$Holder;", ak.av, "Landroidx/paging/SingleRunner$Holder;", "holder", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", ak.aF, "CancelIsolatedRunnerException", "Holder", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SingleRunner {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26316b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Holder holder;

    /* JADX INFO: compiled from: SingleRunner.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Landroidx/paging/SingleRunner;", "b", "Landroidx/paging/SingleRunner;", ak.av, "()Landroidx/paging/SingleRunner;", "runner", "<init>", "(Landroidx/paging/SingleRunner;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class CancelIsolatedRunnerException extends CancellationException {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(@dl.d SingleRunner runner) {
            kotlin.jvm.internal.f0.p(runner, "runner");
            this.runner = runner;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    /* JADX INFO: compiled from: SingleRunner.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "", "priority", "Lkotlinx/coroutines/d2;", "job", "", "b", "(ILkotlinx/coroutines/d2;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/d2;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/sync/c;", "mutex", "Lkotlinx/coroutines/d2;", "previous", ak.aF, "I", "previousPriority", "Landroidx/paging/SingleRunner;", "d", "Landroidx/paging/SingleRunner;", "singleRunner", "e", "Z", "cancelPreviousInEqualPriority", "<init>", "(Landroidx/paging/SingleRunner;Z)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Holder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kotlinx.coroutines.sync.c mutex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private d2 previous;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int previousPriority;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final SingleRunner singleRunner;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean cancelPreviousInEqualPriority;

        public Holder(@dl.d SingleRunner singleRunner, boolean z10) {
            kotlin.jvm.internal.f0.p(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z10;
            this.mutex = MutexKt.b(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @dl.e
        public final Object a(@dl.d d2 d2Var, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
            kotlinx.coroutines.sync.c cVar2;
            Holder holder;
            if (cVar instanceof SingleRunner$Holder$onFinish$1) {
                singleRunner$Holder$onFinish$1 = (SingleRunner$Holder$onFinish$1) cVar;
                int i10 = singleRunner$Holder$onFinish$1.f26326c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$onFinish$1.f26326c = i10 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, cVar);
                }
            } else {
                singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, cVar);
            }
            Object obj = singleRunner$Holder$onFinish$1.f26325b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = singleRunner$Holder$onFinish$1.f26326c;
            if (i11 == 0) {
                kotlin.t0.n(obj);
                cVar2 = this.mutex;
                singleRunner$Holder$onFinish$1.f26328e = this;
                singleRunner$Holder$onFinish$1.f26329f = d2Var;
                singleRunner$Holder$onFinish$1.f26330g = cVar2;
                singleRunner$Holder$onFinish$1.f26326c = 1;
                if (cVar2.e(null, singleRunner$Holder$onFinish$1) == objH) {
                    return objH;
                }
                holder = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) singleRunner$Holder$onFinish$1.f26330g;
                d2 d2Var2 = (d2) singleRunner$Holder$onFinish$1.f26329f;
                holder = (Holder) singleRunner$Holder$onFinish$1.f26328e;
                kotlin.t0.n(obj);
                cVar2 = cVar3;
                d2Var = d2Var2;
            }
            try {
                if (d2Var == holder.previous) {
                    holder.previous = null;
                }
                return b2.f124493a;
            } finally {
                cVar2.f(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.d2] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.c] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.c] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.d2] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @dl.e
        public final Object b(int i10, @dl.d d2 d2Var, @dl.d kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
            SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
            Holder holder;
            ?? r10;
            kotlinx.coroutines.sync.c cVar2;
            ?? r11;
            Holder holder2;
            int i11;
            if (cVar instanceof SingleRunner$Holder$tryEnqueue$1) {
                singleRunner$Holder$tryEnqueue$1 = (SingleRunner$Holder$tryEnqueue$1) cVar;
                int i12 = singleRunner$Holder$tryEnqueue$1.f26332c;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$tryEnqueue$1.f26332c = i12 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, cVar);
                }
            } else {
                singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, cVar);
            }
            Object obj = singleRunner$Holder$tryEnqueue$1.f26331b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i13 = singleRunner$Holder$tryEnqueue$1.f26332c;
            boolean z10 = true;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        i10 = singleRunner$Holder$tryEnqueue$1.f26337h;
                        kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) singleRunner$Holder$tryEnqueue$1.f26336g;
                        d2 d2Var2 = (d2) singleRunner$Holder$tryEnqueue$1.f26335f;
                        holder = (Holder) singleRunner$Holder$tryEnqueue$1.f26334e;
                        kotlin.t0.n(obj);
                        r10 = d2Var2;
                        cVar2 = cVar3;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = singleRunner$Holder$tryEnqueue$1.f26337h;
                        kotlinx.coroutines.sync.c cVar4 = (kotlinx.coroutines.sync.c) singleRunner$Holder$tryEnqueue$1.f26336g;
                        d2 d2Var3 = (d2) singleRunner$Holder$tryEnqueue$1.f26335f;
                        holder2 = (Holder) singleRunner$Holder$tryEnqueue$1.f26334e;
                        kotlin.t0.n(obj);
                        r11 = d2Var3;
                        cVar2 = cVar4;
                    }
                    holder = holder2;
                    r10 = r11;
                    holder.previous = r10;
                    holder.previousPriority = i10;
                    d2Var = cVar2;
                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(z10);
                    d2Var.f(null);
                    return boolA;
                }
                kotlin.t0.n(obj);
                kotlinx.coroutines.sync.c cVar5 = this.mutex;
                singleRunner$Holder$tryEnqueue$1.f26334e = this;
                singleRunner$Holder$tryEnqueue$1.f26335f = d2Var;
                singleRunner$Holder$tryEnqueue$1.f26336g = cVar5;
                singleRunner$Holder$tryEnqueue$1.f26337h = i10;
                singleRunner$Holder$tryEnqueue$1.f26332c = 1;
                if (cVar5.e(null, singleRunner$Holder$tryEnqueue$1) == objH) {
                    return objH;
                }
                holder = this;
                r10 = d2Var;
                cVar2 = cVar5;
                d2 d2Var4 = holder.previous;
                if (d2Var4 == null || !d2Var4.isActive() || (i11 = holder.previousPriority) < i10 || (i11 == i10 && holder.cancelPreviousInEqualPriority)) {
                    if (d2Var4 != null) {
                        d2Var4.e(new CancelIsolatedRunnerException(holder.singleRunner));
                    }
                    if (d2Var4 != null) {
                        singleRunner$Holder$tryEnqueue$1.f26334e = holder;
                        singleRunner$Holder$tryEnqueue$1.f26335f = r10;
                        singleRunner$Holder$tryEnqueue$1.f26336g = cVar2;
                        singleRunner$Holder$tryEnqueue$1.f26337h = i10;
                        singleRunner$Holder$tryEnqueue$1.f26332c = 2;
                        if (d2Var4.g0(singleRunner$Holder$tryEnqueue$1) == objH) {
                            return objH;
                        }
                        r11 = r10;
                        holder2 = holder;
                        cVar2 = cVar2;
                        holder = holder2;
                        r10 = r11;
                    }
                    holder.previous = r10;
                    holder.previousPriority = i10;
                    d2Var = cVar2;
                } else {
                    z10 = false;
                    d2Var = cVar2;
                }
                Boolean boolA2 = kotlin.coroutines.jvm.internal.a.a(z10);
                d2Var.f(null);
                return boolA2;
            } catch (Throwable th2) {
                d2Var.f(null);
                throw th2;
            }
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public SingleRunner(boolean z10) {
        this.holder = new Holder(this, z10);
    }

    public /* synthetic */ SingleRunner(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public static /* synthetic */ Object c(SingleRunner singleRunner, int i10, yh.l lVar, kotlin.coroutines.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return singleRunner.b(i10, lVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object b(int i10, @dl.d yh.l<? super kotlin.coroutines.c<? super b2>, ? extends Object> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SingleRunner$runInIsolation$1 singleRunner$runInIsolation$1;
        SingleRunner singleRunner;
        if (cVar instanceof SingleRunner$runInIsolation$1) {
            singleRunner$runInIsolation$1 = (SingleRunner$runInIsolation$1) cVar;
            int i11 = singleRunner$runInIsolation$1.f26339c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleRunner$runInIsolation$1.f26339c = i11 - Integer.MIN_VALUE;
            } else {
                singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(this, cVar);
            }
        } else {
            singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(this, cVar);
        }
        Object obj = singleRunner$runInIsolation$1.f26338b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i12 = singleRunner$runInIsolation$1.f26339c;
        if (i12 == 0) {
            kotlin.t0.n(obj);
            try {
                SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this, i10, lVar, null);
                singleRunner$runInIsolation$1.f26341e = this;
                singleRunner$runInIsolation$1.f26339c = 1;
                if (kotlinx.coroutines.r0.g(singleRunner$runInIsolation$2, singleRunner$runInIsolation$1) == objH) {
                    return objH;
                }
            } catch (CancelIsolatedRunnerException e10) {
                e = e10;
                singleRunner = this;
                if (e.getRunner() != singleRunner) {
                    throw e;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleRunner = (SingleRunner) singleRunner$runInIsolation$1.f26341e;
            try {
                kotlin.t0.n(obj);
            } catch (CancelIsolatedRunnerException e11) {
                e = e11;
                if (e.getRunner() != singleRunner) {
                    throw e;
                }
            }
        }
        return b2.f124493a;
    }
}
