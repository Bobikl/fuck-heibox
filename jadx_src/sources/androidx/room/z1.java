package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: RoomTrackingLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u000e\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020807¢\u0006\u0004\b:\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010+\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010/R\u0017\u00102\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b1\u0010/R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006<"}, d2 = {"Landroidx/room/z1;", androidx.exifinterface.media.a.f23244d5, "Landroidx/lifecycle/LiveData;", "Lkotlin/b2;", "m", "n", "Landroidx/room/RoomDatabase;", "Landroidx/room/RoomDatabase;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/room/RoomDatabase;", "database", "Landroidx/room/d0;", "Landroidx/room/d0;", com.google.android.exoplayer2.text.ttml.d.W, "", "o", "Z", "x", "()Z", com.tekartik.sqflite.b.f98597p, "Ljava/util/concurrent/Callable;", "p", "Ljava/util/concurrent/Callable;", ak.aG, "()Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/room/f0$c;", "q", "Landroidx/room/f0$c;", androidx.exifinterface.media.a.W4, "()Landroidx/room/f0$c;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "r", "Ljava/util/concurrent/atomic/AtomicBoolean;", "y", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", ak.aB, "v", "computing", "t", "D", "registeredObserver", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "C", "()Ljava/lang/Runnable;", "refreshRunnable", ak.aD, "invalidationRunnable", "Ljava/util/concurrent/Executor;", "B", "()Ljava/util/concurrent/Executor;", "queryExecutor", "", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/d0;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"RestrictedApi"})
public final class z1<T> extends LiveData<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase database;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d0 container;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean inTransaction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Callable<T> computeFunction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f0.c observer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicBoolean invalid;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicBoolean computing;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicBoolean registeredObserver;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable refreshRunnable;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Runnable invalidationRunnable;

    /* JADX INFO: compiled from: RoomTrackingLiveData.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/room/z1$a", "Landroidx/room/f0$c;", "", "", "tables", "Lkotlin/b2;", ak.aF, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends f0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<T> f27380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, z1<T> z1Var) {
            super(strArr);
            this.f27380b = z1Var;
        }

        @Override // androidx.room.f0.c
        public void c(@dl.d Set<String> tables) {
            kotlin.jvm.internal.f0.p(tables, "tables");
            androidx.arch.core.executor.c.h().b(this.f27380b.getInvalidationRunnable());
        }
    }

    public z1(@dl.d RoomDatabase database, @dl.d d0 container, boolean z10, @dl.d Callable<T> computeFunction, @dl.d String[] tableNames) {
        kotlin.jvm.internal.f0.p(database, "database");
        kotlin.jvm.internal.f0.p(container, "container");
        kotlin.jvm.internal.f0.p(computeFunction, "computeFunction");
        kotlin.jvm.internal.f0.p(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z10;
        this.computeFunction = computeFunction;
        this.observer = new a(tableNames, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.room.x1
            @Override // java.lang.Runnable
            public final void run() {
                z1.F(this.f27361b);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.room.y1
            @Override // java.lang.Runnable
            public final void run() {
                z1.E(this.f27365b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(z1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        boolean zH = this$0.h();
        if (this$0.invalid.compareAndSet(false, true) && zH) {
            this$0.B().execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0048 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(androidx.room.z1 r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.f0.p(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.registeredObserver
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1a
            androidx.room.RoomDatabase r0 = r5.database
            androidx.room.f0 r0 = r0.getInvalidationTracker()
            androidx.room.f0$c r3 = r5.observer
            r0.c(r3)
        L1a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L4f
            r0 = 0
            r3 = r1
        L24:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.invalid     // Catch: java.lang.Throwable -> L48
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L3d
            java.util.concurrent.Callable<T> r0 = r5.computeFunction     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L48
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L48
            r3 = r2
            goto L24
        L34:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Exception while computing database live data."
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L3d:
            if (r3 == 0) goto L42
            r5.o(r0)     // Catch: java.lang.Throwable -> L48
        L42:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r1)
            goto L50
        L48:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.computing
            r5.set(r1)
            throw r0
        L4f:
            r3 = r1
        L50:
            if (r3 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.invalid
            boolean r0 = r0.get()
            if (r0 != 0) goto L1a
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.z1.F(androidx.room.z1):void");
    }

    @dl.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public final f0.c getObserver() {
        return this.observer;
    }

    @dl.d
    public final Executor B() {
        return this.inTransaction ? this.database.x() : this.database.t();
    }

    @dl.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    @dl.d
    /* JADX INFO: renamed from: D, reason: from getter */
    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    @Override // androidx.lifecycle.LiveData
    protected void m() {
        super.m();
        d0 d0Var = this.container;
        kotlin.jvm.internal.f0.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        d0Var.c(this);
        B().execute(this.refreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    protected void n() {
        super.n();
        d0 d0Var = this.container;
        kotlin.jvm.internal.f0.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        d0Var.d(this);
    }

    @dl.d
    public final Callable<T> u() {
        return this.computeFunction;
    }

    @dl.d
    /* JADX INFO: renamed from: v, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @dl.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @dl.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @dl.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }
}
