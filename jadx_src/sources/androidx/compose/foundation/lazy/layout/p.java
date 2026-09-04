package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0017\u0019B'\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b;\u0010<J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010.R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010.R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00108\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/runtime/t1;", "Landroidx/compose/foundation/lazy/layout/o$b;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "", "now", "nextFrame", "average", "", RXScreenCaptureService.KEY_HEIGHT, "new", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "g", "Lkotlin/b2;", "run", "frameTimeNanos", "doFrame", "", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/o$a;", ak.av, "(IJ)Landroidx/compose/foundation/lazy/layout/o$a;", "b", "d", ak.aF, "Landroidx/compose/foundation/lazy/layout/o;", "Landroidx/compose/foundation/lazy/layout/o;", "prefetchState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroid/view/View;", "e", "Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/foundation/lazy/layout/p$b;", "f", "Landroidx/compose/runtime/collection/e;", "prefetchRequests", "J", "averagePrecomposeTimeNs", "averagePremeasureTimeNs", "i", "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "j", "Landroid/view/Choreographer;", "choreographer", "k", "isActive", "<init>", "(Landroidx/compose/foundation/lazy/layout/o;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "l", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class p implements t1, o.b, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f7146m;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o prefetchState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SubcomposeLayoutState subcomposeLayoutState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyLayoutItemContentFactory itemContentFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<b> prefetchRequests;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long averagePrecomposeTimeNs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long averagePremeasureTimeNs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchScheduled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isActive;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.p$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p$a;", "", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", "b", "", "frameIntervalNs", "J", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(View view) {
            if (p.f7146m == 0) {
                Display display = view.getDisplay();
                float f10 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                p.f7146m = (long) (1000000000 / f10);
            }
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001d\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p$b;", "Landroidx/compose/foundation/lazy/layout/o$a;", "Lkotlin/b2;", "cancel", "", ak.av, "I", ak.aF, "()I", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "b", "J", "()J", "constraints", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "e", "()Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/layout/SubcomposeLayoutState$a;)V", "precomposeHandle", "", "d", "Z", "()Z", "f", "(Z)V", qb.a.f138642e, "g", "measured", "<init>", "(IJLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long constraints;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private SubcomposeLayoutState.a precomposeHandle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean canceled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean measured;

        private b(int i10, long j10) {
            this.index = i10;
            this.constraints = j10;
        }

        public /* synthetic */ b(int i10, long j10, u uVar) {
            this(i10, j10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanceled() {
            return this.canceled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @Override // androidx.compose.foundation.lazy.layout.o.a
        public void cancel() {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            SubcomposeLayoutState.a aVar = this.precomposeHandle;
            if (aVar != null) {
                aVar.dispose();
            }
            this.precomposeHandle = null;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getMeasured() {
            return this.measured;
        }

        @dl.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final SubcomposeLayoutState.a getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void f(boolean z10) {
            this.canceled = z10;
        }

        public final void g(boolean z10) {
            this.measured = z10;
        }

        public final void h(@dl.e SubcomposeLayoutState.a aVar) {
            this.precomposeHandle = aVar;
        }
    }

    public p(@dl.d o prefetchState, @dl.d SubcomposeLayoutState subcomposeLayoutState, @dl.d LazyLayoutItemContentFactory itemContentFactory, @dl.d View view) {
        f0.p(prefetchState, "prefetchState");
        f0.p(subcomposeLayoutState, "subcomposeLayoutState");
        f0.p(itemContentFactory, "itemContentFactory");
        f0.p(view, "view");
        this.prefetchState = prefetchState;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.itemContentFactory = itemContentFactory;
        this.view = view;
        this.prefetchRequests = new androidx.compose.runtime.collection.e<>(new b[16], 0);
        this.choreographer = Choreographer.getInstance();
        INSTANCE.b(view);
    }

    private final long g(long j10, long current) {
        if (current == 0) {
            return j10;
        }
        long j11 = 4;
        return (j10 / j11) + ((current / j11) * ((long) 3));
    }

    private final boolean h(long now, long nextFrame, long average) {
        return now > nextFrame || now + average < nextFrame;
    }

    @Override // androidx.compose.foundation.lazy.layout.o.b
    @dl.d
    public o.a a(int index, long constraints) {
        b bVar = new b(index, constraints, null);
        this.prefetchRequests.b(bVar);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return bVar;
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
        this.prefetchState.c(this);
        this.isActive = true;
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        this.isActive = false;
        this.prefetchState.c(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.P() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + f7146m;
        boolean z10 = false;
        while (this.prefetchRequests.Q() && !z10) {
            b bVar = this.prefetchRequests.G()[0];
            i iVarInvoke = this.itemContentFactory.d().invoke();
            if (!bVar.getCanceled()) {
                int iA = iVarInvoke.a();
                int index = bVar.getIndex();
                if (index >= 0 && index < iA) {
                    if (bVar.getPrecomposeHandle() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long jNanoTime = System.nanoTime();
                            if (h(jNanoTime, nanos, this.averagePrecomposeTimeNs)) {
                                Object objE = iVarInvoke.e(bVar.getIndex());
                                bVar.h(this.subcomposeLayoutState.j(objE, this.itemContentFactory.b(bVar.getIndex(), objE)));
                                this.averagePrecomposeTimeNs = g(System.nanoTime() - jNanoTime, this.averagePrecomposeTimeNs);
                            } else {
                                z10 = true;
                            }
                            b2 b2Var = b2.f124493a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        if (!(!bVar.getMeasured())) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long jNanoTime2 = System.nanoTime();
                            if (h(jNanoTime2, nanos, this.averagePremeasureTimeNs)) {
                                SubcomposeLayoutState.a precomposeHandle = bVar.getPrecomposeHandle();
                                f0.m(precomposeHandle);
                                int iA2 = precomposeHandle.a();
                                for (int i10 = 0; i10 < iA2; i10++) {
                                    precomposeHandle.b(i10, bVar.getConstraints());
                                }
                                this.averagePremeasureTimeNs = g(System.nanoTime() - jNanoTime2, this.averagePremeasureTimeNs);
                                this.prefetchRequests.g0(0);
                            } else {
                                b2 b2Var2 = b2.f124493a;
                                z10 = true;
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
            }
            this.prefetchRequests.g0(0);
        }
        if (z10) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }
}
