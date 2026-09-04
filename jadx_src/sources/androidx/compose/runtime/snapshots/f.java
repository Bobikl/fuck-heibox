package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.h0;
import androidx.compose.runtime.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.r0;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0001&B\u0019\b\u0004\u0012\u0006\u00102\u001a\u00020\"\u0012\u0006\u0010,\u001a\u00020%¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0007H&J'\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00102\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u0010$\"\u0004\b0\u00101R\"\u00108\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00109\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010<\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u00105R\u0015\u0010@\u001a\u00020\u00078À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00105R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bC\u0010BR\u001c\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010E8 X \u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0001\u0004KLMN\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006O"}, d2 = {"Landroidx/compose/runtime/snapshots/f;", "", "Lkotlin/b2;", "d", "Lkotlin/Function1;", "readObserver", androidx.exifinterface.media.a.W4, "", "n", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "block", "e", "(Lyh/a;)Ljava/lang/Object;", "p", "snapshot", RXScreenCaptureService.KEY_WIDTH, "D", "oldSnapshot", androidx.exifinterface.media.a.S4, "q", "(Landroidx/compose/runtime/snapshots/f;)V", "r", "Landroidx/compose/runtime/snapshots/b0;", "state", "t", "(Landroidx/compose/runtime/snapshots/b0;)V", ak.aB, "()V", "b", ak.aF, "v", "F", ak.aG, "", "C", "()I", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", ak.av, "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", ak.aD, "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "<set-?>", "I", "g", "y", "(I)V", "id", "Z", "f", "()Z", "x", "(Z)V", "disposed", "pinningTrackingHandle", "l", "()Landroidx/compose/runtime/snapshots/f;", "root", "k", "readOnly", "o", "isPinned", "j", "()Lyh/l;", "m", "writeObserver", "", "i", "()Ljava/util/Set;", org.apache.tools.ant.taskdefs.optional.vss.g.I2, "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/f0;", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13243f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private SnapshotIdSet invalid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinningTrackingHandle;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J6\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J'\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0005H\u0001J9\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0015\u0010\u000eJ&\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0016J\u001a\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\b\u0010\u001f\u001a\u00020\u001eH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\u0005H\u0001J\u0012\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0001R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Landroidx/compose/runtime/snapshots/f$a;", "", "Lkotlin/Function1;", "Lkotlin/b2;", "readObserver", "Landroidx/compose/runtime/snapshots/f;", "o", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "m", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "block", ak.aF, "(Lyh/a;)Ljava/lang/Object;", "R", "q", "e", "(Lyh/l;Lyh/l;Lyh/a;)Ljava/lang/Object;", ak.av, "Landroidx/compose/runtime/c0;", "r", "Lkotlin/Function2;", "", "observer", "Landroidx/compose/runtime/snapshots/d;", RXScreenCaptureService.KEY_HEIGHT, "i", "d", "l", "", "g", "j", "previous", "k", "b", "()Landroidx/compose/runtime/snapshots/f;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Snapshot.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C0078a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.p<Set<? extends Object>, f, b2> f13248a;

            /* JADX WARN: Multi-variable type inference failed */
            C0078a(yh.p<? super Set<? extends Object>, ? super f, b2> pVar) {
                this.f13248a = pVar;
            }

            @Override // androidx.compose.runtime.snapshots.d
            public final void dispose() {
                yh.p<Set<? extends Object>, f, b2> pVar = this.f13248a;
                synchronized (SnapshotKt.D()) {
                    SnapshotKt.f13172h.remove(pVar);
                    b2 b2Var = b2.f124493a;
                }
            }
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.f$a$b */
        /* JADX INFO: compiled from: Snapshot.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l<Object, b2> f13249a;

            b(yh.l<Object, b2> lVar) {
                this.f13249a = lVar;
            }

            @Override // androidx.compose.runtime.snapshots.d
            public final void dispose() {
                yh.l<Object, b2> lVar = this.f13249a;
                synchronized (SnapshotKt.D()) {
                    SnapshotKt.f13173i.remove(lVar);
                }
                SnapshotKt.x();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object f(Companion companion, yh.l lVar, yh.l lVar2, yh.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return companion.e(lVar, lVar2, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.snapshots.b n(Companion companion, yh.l lVar, yh.l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            if ((i10 & 2) != 0) {
                lVar2 = null;
            }
            return companion.m(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f p(Companion companion, yh.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            return companion.o(lVar);
        }

        @dl.d
        @r0
        public final f a() {
            return SnapshotKt.z((f) SnapshotKt.f13167c.a(), null, false, 6, null);
        }

        @dl.d
        public final f b() {
            return SnapshotKt.C();
        }

        public final <T> T c(@dl.d yh.a<? extends T> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            f fVarJ = j();
            T tInvoke = block.invoke();
            f.INSTANCE.k(fVarJ);
            return tInvoke;
        }

        public final void d() {
            SnapshotKt.C().s();
        }

        public final <T> T e(@dl.e yh.l<Object, b2> readObserver, @dl.e yh.l<Object, b2> writeObserver, @dl.d yh.a<? extends T> block) {
            f e0Var;
            kotlin.jvm.internal.f0.p(block, "block");
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            f fVar = (f) SnapshotKt.f13167c.a();
            if (fVar == null || (fVar instanceof androidx.compose.runtime.snapshots.b)) {
                e0Var = new e0(fVar instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                e0Var = fVar.A(readObserver);
            }
            try {
                f fVarP = e0Var.p();
                try {
                    T tInvoke = block.invoke();
                    e0Var.w(fVarP);
                    e0Var.d();
                    return tInvoke;
                } catch (Throwable th2) {
                    e0Var.w(fVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                e0Var.d();
                throw th3;
            }
        }

        @o0
        public final int g() {
            return CollectionsKt___CollectionsKt.Q5(SnapshotKt.f13169e).size();
        }

        @dl.d
        public final d h(@dl.d yh.p<? super Set<? extends Object>, ? super f, b2> observer) {
            kotlin.jvm.internal.f0.p(observer, "observer");
            SnapshotKt.w(SnapshotKt.f13165a);
            synchronized (SnapshotKt.D()) {
                SnapshotKt.f13172h.add(observer);
            }
            return new C0078a(observer);
        }

        @dl.d
        public final d i(@dl.d yh.l<Object, b2> observer) {
            kotlin.jvm.internal.f0.p(observer, "observer");
            synchronized (SnapshotKt.D()) {
                SnapshotKt.f13173i.add(observer);
            }
            SnapshotKt.x();
            return new b(observer);
        }

        @r0
        @dl.e
        public final f j() {
            f fVar = (f) SnapshotKt.f13167c.a();
            if (fVar != null) {
                SnapshotKt.f13167c.b(null);
            }
            return fVar;
        }

        @r0
        public final void k(@dl.e f fVar) {
            if (fVar != null) {
                SnapshotKt.f13167c.b(fVar);
            }
        }

        public final void l() {
            boolean z10;
            synchronized (SnapshotKt.D()) {
                Set<b0> setI = ((GlobalSnapshot) SnapshotKt.f13174j.get()).i();
                z10 = false;
                if (setI != null && (!setI.isEmpty())) {
                    z10 = true;
                }
            }
            if (z10) {
                SnapshotKt.x();
            }
        }

        @dl.d
        public final androidx.compose.runtime.snapshots.b m(@dl.e yh.l<Object, b2> lVar, @dl.e yh.l<Object, b2> lVar2) {
            androidx.compose.runtime.snapshots.b bVarX;
            f fVarC = SnapshotKt.C();
            androidx.compose.runtime.snapshots.b bVar = fVarC instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVarC : null;
            if (bVar == null || (bVarX = bVar.X(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return bVarX;
        }

        @dl.d
        public final f o(@dl.e yh.l<Object, b2> lVar) {
            return SnapshotKt.C().A(lVar);
        }

        public final <R> R q(@dl.d yh.a<? extends R> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            androidx.compose.runtime.snapshots.b bVarN = n(this, null, null, 3, null);
            try {
                f fVarP = bVarN.p();
                try {
                    R rInvoke = block.invoke();
                    kotlin.jvm.internal.c0.d(1);
                    bVarN.w(fVarP);
                    kotlin.jvm.internal.c0.c(1);
                    bVarN.J().a();
                    kotlin.jvm.internal.c0.d(1);
                    bVarN.d();
                    return rInvoke;
                } finally {
                    kotlin.jvm.internal.c0.d(1);
                    bVarN.w(fVarP);
                    kotlin.jvm.internal.c0.c(1);
                }
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                bVarN.d();
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }

        public final <T> T r(@dl.d yh.a<? extends T> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            f fVarA = a();
            try {
                f fVarP = fVarA.p();
                try {
                    T tInvoke = block.invoke();
                    kotlin.jvm.internal.c0.d(1);
                    fVarA.w(fVarP);
                    kotlin.jvm.internal.c0.c(1);
                    kotlin.jvm.internal.c0.d(1);
                    fVarA.d();
                    return tInvoke;
                } finally {
                    kotlin.jvm.internal.c0.d(1);
                    fVarA.w(fVarP);
                    kotlin.jvm.internal.c0.c(1);
                }
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                fVarA.d();
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
    }

    private f(int i10, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i10;
        this.pinningTrackingHandle = i10 != 0 ? SnapshotKt.Z(i10, getInvalid()) : -1;
    }

    public /* synthetic */ f(int i10, SnapshotIdSet snapshotIdSet, kotlin.jvm.internal.u uVar) {
        this(i10, snapshotIdSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f B(f fVar, yh.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return fVar.A(lVar);
    }

    @dl.d
    public abstract f A(@dl.e yh.l<Object, b2> lVar);

    public final int C() {
        int i10 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i10;
    }

    @h0
    @dl.e
    public final f D() {
        return p();
    }

    @h0
    public final void E(@dl.e f fVar) {
        if (SnapshotKt.f13167c.a() == this) {
            w(fVar);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void F() {
        if (!(!this.disposed)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    public final void b() {
        synchronized (SnapshotKt.D()) {
            c();
            v();
            b2 b2Var = b2.f124493a;
        }
    }

    public void c() {
        SnapshotKt.f13169e = SnapshotKt.f13169e.l(getId());
    }

    public void d() {
        this.disposed = true;
        synchronized (SnapshotKt.D()) {
            u();
            b2 b2Var = b2.f124493a;
        }
    }

    public final <T> T e(@dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        f fVarP = p();
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            w(fVarP);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public int getId() {
        return this.id;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    @dl.e
    public abstract Set<b0> i();

    @dl.e
    public abstract yh.l<Object, b2> j();

    public abstract boolean k();

    @dl.d
    public abstract f l();

    @dl.e
    public abstract yh.l<Object, b2> m();

    public abstract boolean n();

    public final boolean o() {
        return this.pinningTrackingHandle >= 0;
    }

    @r0
    @dl.e
    public f p() {
        f fVar = (f) SnapshotKt.f13167c.a();
        SnapshotKt.f13167c.b(this);
        return fVar;
    }

    public abstract void q(@dl.d f snapshot);

    public abstract void r(@dl.d f snapshot);

    public abstract void s();

    public abstract void t(@dl.d b0 state);

    public final void u() {
        int i10 = this.pinningTrackingHandle;
        if (i10 >= 0) {
            SnapshotKt.U(i10);
            this.pinningTrackingHandle = -1;
        }
    }

    public void v() {
        u();
    }

    @r0
    public void w(@dl.e f fVar) {
        SnapshotKt.f13167c.b(fVar);
    }

    public final void x(boolean z10) {
        this.disposed = z10;
    }

    public void y(int i10) {
        this.id = i10;
    }

    public void z(@dl.d SnapshotIdSet snapshotIdSet) {
        kotlin.jvm.internal.f0.p(snapshotIdSet, "<set-?>");
        this.invalid = snapshotIdSet;
    }
}
