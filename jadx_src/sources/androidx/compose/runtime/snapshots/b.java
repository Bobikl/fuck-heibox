package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\"\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010(\u001a\u00020\u0019\u0012\u0006\u0010W\u001a\u00020\u001e\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J8\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0014J5\u0010 \u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010\u0014J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0019H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0019H\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b0\u0010\u0014J\u0017\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u001eH\u0000¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0010¢\u0006\u0004\b6\u00107R:\u0010?\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001082\u000e\u00109\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001088\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u00103R\"\u0010K\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010/R\u0016\u00101\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010'R\"\u0010Q\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0017\u001a\u0004\bN\u0010O\"\u0004\b\"\u0010PR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\b@\u0010SR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bM\u0010SR\u0014\u0010T\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010OR\u0014\u0010V\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010U\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/f;", "Lkotlin/b2;", "G", "", "n", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "X", "Landroidx/compose/runtime/snapshots/g;", "J", "d", androidx.exifinterface.media.a.W4, "snapshot", "q", "(Landroidx/compose/runtime/snapshots/f;)V", "r", ak.aB, "()V", ak.aF, "v", "Z", "a0", "", "snapshotId", "", "Landroidx/compose/runtime/snapshots/c0;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "N", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/g;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "block", "H", "(Lyh/a;)Ljava/lang/Object;", "I", "id", "O", "(I)V", "Q", "", "handles", "R", "([I)V", androidx.exifinterface.media.a.R4, "snapshots", "P", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Landroidx/compose/runtime/snapshots/b0;", "state", "t", "(Landroidx/compose/runtime/snapshots/b0;)V", "", "<set-?>", "i", "Ljava/util/Set;", "()Ljava/util/Set;", "U", "(Ljava/util/Set;)V", org.apache.tools.ant.taskdefs.optional.vss.g.I2, "j", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "L", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", androidx.exifinterface.media.a.X4, "previousIds", "k", "[I", "M", "()[I", androidx.exifinterface.media.a.T4, "previousPinnedSnapshots", "l", "m", "K", "()Z", "(Z)V", "applied", "Lyh/l;", "()Lyh/l;", "readOnly", "()Landroidx/compose/runtime/snapshots/f;", "root", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lyh/l;Lyh/l;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class b extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13216n = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Set<b0> modified;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private SnapshotIdSet previousIds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean applied;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, @dl.d SnapshotIdSet invalid, @dl.e yh.l<Object, b2> lVar, @dl.e yh.l<Object, b2> lVar2) {
        super(i10, invalid, null);
        kotlin.jvm.internal.f0.p(invalid, "invalid");
        this.f13217g = lVar;
        this.f13218h = lVar2;
        this.previousIds = SnapshotIdSet.INSTANCE.a();
        this.previousPinnedSnapshots = new int[0];
        this.snapshots = 1;
    }

    private final void G() {
        Set<b0> setI = i();
        if (setI != null) {
            Z();
            U(null);
            int id2 = getId();
            Iterator<b0> it = setI.iterator();
            while (it.hasNext()) {
                for (c0 firstStateRecord = it.next().getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                    if (firstStateRecord.getSnapshotId() == id2 || CollectionsKt___CollectionsKt.R1(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                        firstStateRecord.f(0);
                    }
                }
            }
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b Y(b bVar, yh.l lVar, yh.l lVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        return bVar.X(lVar, lVar2);
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    public f A(@dl.e yh.l<Object, b2> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        F();
        a0();
        int id2 = getId();
        O(getId());
        synchronized (SnapshotKt.D()) {
            int i10 = SnapshotKt.f13170f;
            SnapshotKt.f13170f = i10 + 1;
            SnapshotKt.f13169e = SnapshotKt.f13169e.w(i10);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i10, SnapshotKt.v(getInvalid(), id2 + 1, i10), lVar, this);
        }
        if (!getApplied() && !getDisposed()) {
            int id3 = getId();
            synchronized (SnapshotKt.D()) {
                int i11 = SnapshotKt.f13170f;
                SnapshotKt.f13170f = i11 + 1;
                y(i11);
                SnapshotKt.f13169e = SnapshotKt.f13169e.w(getId());
                b2 b2Var = b2.f124493a;
            }
            z(SnapshotKt.v(getInvalid(), id3 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final <T> T H(@dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        O(getId());
        T tInvoke = block.invoke();
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.D()) {
                try {
                    int i10 = SnapshotKt.f13170f;
                    SnapshotKt.f13170f = i10 + 1;
                    y(i10);
                    SnapshotKt.f13169e = SnapshotKt.f13169e.w(getId());
                    b2 b2Var = b2.f124493a;
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.c0.c(1);
            z(SnapshotKt.v(getInvalid(), id2 + 1, getId()));
        }
        return tInvoke;
    }

    public final void I() {
        O(getId());
        b2 b2Var = b2.f124493a;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id2 = getId();
        synchronized (SnapshotKt.D()) {
            int i10 = SnapshotKt.f13170f;
            SnapshotKt.f13170f = i10 + 1;
            y(i10);
            SnapshotKt.f13169e = SnapshotKt.f13169e.w(getId());
        }
        z(SnapshotKt.v(getInvalid(), id2 + 1, getId()));
    }

    @dl.d
    public g J() {
        Map<c0, ? extends c0> mapN;
        Pair pairA;
        Set<b0> setI = i();
        if (setI != null) {
            Object obj = SnapshotKt.f13174j.get();
            kotlin.jvm.internal.f0.o(obj, "currentGlobalSnapshot.get()");
            mapN = SnapshotKt.N((b) obj, this, SnapshotKt.f13169e.l(((GlobalSnapshot) SnapshotKt.f13174j.get()).getId()));
        } else {
            mapN = null;
        }
        synchronized (SnapshotKt.D()) {
            SnapshotKt.d0(this);
            if (setI == null || setI.size() == 0) {
                c();
                GlobalSnapshot previousGlobalSnapshot = (GlobalSnapshot) SnapshotKt.f13174j.get();
                kotlin.jvm.internal.f0.o(previousGlobalSnapshot, "previousGlobalSnapshot");
                SnapshotKt.X(previousGlobalSnapshot, SnapshotKt.f13165a);
                Set<b0> setI2 = previousGlobalSnapshot.i();
                pairA = (setI2 == null || !(setI2.isEmpty() ^ true)) ? c1.a(CollectionsKt__CollectionsKt.E(), null) : c1.a(CollectionsKt___CollectionsKt.T5(SnapshotKt.f13172h), setI2);
            } else {
                GlobalSnapshot previousGlobalSnapshot2 = (GlobalSnapshot) SnapshotKt.f13174j.get();
                g gVarN = N(SnapshotKt.f13170f, mapN, SnapshotKt.f13169e.l(previousGlobalSnapshot2.getId()));
                if (!kotlin.jvm.internal.f0.g(gVarN, g.b.f13259b)) {
                    return gVarN;
                }
                c();
                kotlin.jvm.internal.f0.o(previousGlobalSnapshot2, "previousGlobalSnapshot");
                SnapshotKt.X(previousGlobalSnapshot2, SnapshotKt.f13165a);
                Set<b0> setI3 = previousGlobalSnapshot2.i();
                U(null);
                previousGlobalSnapshot2.U(null);
                pairA = c1.a(CollectionsKt___CollectionsKt.T5(SnapshotKt.f13172h), setI3);
            }
            List list = (List) pairA.a();
            Set set = (Set) pairA.b();
            this.applied = true;
            if (set != null && (!set.isEmpty())) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((yh.p) list.get(i10)).invoke(set, this);
                }
            }
            if (setI != null && (!setI.isEmpty())) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((yh.p) list.get(i11)).invoke(setI, this);
                }
            }
            synchronized (SnapshotKt.D()) {
                v();
                b2 b2Var = b2.f124493a;
            }
            return g.b.f13259b;
        }
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @dl.d
    /* JADX INFO: renamed from: L, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    @dl.d
    /* JADX INFO: renamed from: M, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @dl.d
    public final g N(int snapshotId, @dl.e Map<c0, ? extends c0> optimisticMerges, @dl.d SnapshotIdSet invalidSnapshots) {
        c0 c0VarR;
        c0 c0VarJ;
        kotlin.jvm.internal.f0.p(invalidSnapshots, "invalidSnapshots");
        SnapshotIdSet snapshotIdSetV = getInvalid().w(getId()).v(this.previousIds);
        Set<b0> setI = i();
        kotlin.jvm.internal.f0.m(setI);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (b0 b0Var : setI) {
            c0 firstStateRecord = b0Var.getFirstStateRecord();
            c0 c0VarR2 = SnapshotKt.R(firstStateRecord, snapshotId, invalidSnapshots);
            if (c0VarR2 != null && (c0VarR = SnapshotKt.R(firstStateRecord, getId(), snapshotIdSetV)) != null && !kotlin.jvm.internal.f0.g(c0VarR2, c0VarR)) {
                c0 c0VarR3 = SnapshotKt.R(firstStateRecord, getId(), getInvalid());
                if (c0VarR3 == null) {
                    SnapshotKt.Q();
                    throw new KotlinNothingValueException();
                }
                if (optimisticMerges == null || (c0VarJ = optimisticMerges.get(c0VarR2)) == null) {
                    c0VarJ = b0Var.j(c0VarR, c0VarR2, c0VarR3);
                }
                if (c0VarJ == null) {
                    return new g.a(this);
                }
                if (!kotlin.jvm.internal.f0.g(c0VarJ, c0VarR3)) {
                    if (kotlin.jvm.internal.f0.g(c0VarJ, c0VarR2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c1.a(b0Var, c0VarR2.b()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(b0Var);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!kotlin.jvm.internal.f0.g(c0VarJ, c0VarR) ? c1.a(b0Var, c0VarJ) : c1.a(b0Var, c0VarR.b()));
                    }
                }
            }
        }
        if (arrayList != null) {
            I();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) arrayList.get(i10);
                b0 b0Var2 = (b0) pair.a();
                c0 c0Var = (c0) pair.b();
                c0Var.f(getId());
                synchronized (SnapshotKt.D()) {
                    c0Var.e(b0Var2.getFirstStateRecord());
                    b0Var2.h(c0Var);
                    b2 b2Var = b2.f124493a;
                }
            }
        }
        if (arrayList2 != null) {
            setI.removeAll(arrayList2);
        }
        return g.b.f13259b;
    }

    public final void O(int id2) {
        synchronized (SnapshotKt.D()) {
            this.previousIds = this.previousIds.w(id2);
            b2 b2Var = b2.f124493a;
        }
    }

    public final void P(@dl.d SnapshotIdSet snapshots) {
        kotlin.jvm.internal.f0.p(snapshots, "snapshots");
        synchronized (SnapshotKt.D()) {
            this.previousIds = this.previousIds.v(snapshots);
            b2 b2Var = b2.f124493a;
        }
    }

    public final void Q(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = kotlin.collections.m.R3(this.previousPinnedSnapshots, id2);
        }
    }

    public final void R(@dl.d int[] handles) {
        kotlin.jvm.internal.f0.p(handles, "handles");
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length == 0) {
            this.previousPinnedSnapshots = handles;
        } else {
            this.previousPinnedSnapshots = kotlin.collections.m.T3(iArr, handles);
        }
    }

    public final void S() {
        int length = this.previousPinnedSnapshots.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.U(this.previousPinnedSnapshots[i10]);
        }
    }

    public final void T(boolean z10) {
        this.applied = z10;
    }

    public void U(@dl.e Set<b0> set) {
        this.modified = set;
    }

    public final void V(@dl.d SnapshotIdSet snapshotIdSet) {
        kotlin.jvm.internal.f0.p(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    public final void W(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<set-?>");
        this.previousPinnedSnapshots = iArr;
    }

    @dl.d
    public b X(@dl.e yh.l<Object, b2> lVar, @dl.e yh.l<Object, b2> lVar2) {
        c cVar;
        F();
        a0();
        O(getId());
        synchronized (SnapshotKt.D()) {
            int i10 = SnapshotKt.f13170f;
            SnapshotKt.f13170f = i10 + 1;
            SnapshotKt.f13169e = SnapshotKt.f13169e.w(i10);
            SnapshotIdSet invalid = getInvalid();
            z(invalid.w(i10));
            cVar = new c(i10, SnapshotKt.v(invalid, getId() + 1, i10), SnapshotKt.I(lVar, j(), false, 4, null), SnapshotKt.J(lVar2, m()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.D()) {
                int i11 = SnapshotKt.f13170f;
                SnapshotKt.f13170f = i11 + 1;
                y(i11);
                SnapshotKt.f13169e = SnapshotKt.f13169e.w(getId());
                b2 b2Var = b2.f124493a;
            }
            z(SnapshotKt.v(getInvalid(), id2 + 1, getId()));
        }
        return cVar;
    }

    public final void Z() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final void a0() {
        boolean z10;
        if (this.applied) {
            z10 = ((f) this).pinningTrackingHandle >= 0;
        }
        if (!z10) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void c() {
        SnapshotKt.f13169e = SnapshotKt.f13169e.l(getId()).j(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        r(this);
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public Set<b0> i() {
        return this.modified;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> j() {
        return this.f13217g;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean k() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    public f l() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> m() {
        return this.f13218h;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean n() {
        Set<b0> setI = i();
        return setI != null && (setI.isEmpty() ^ true);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void q(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void r(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        int i10 = this.snapshots;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i11 = i10 - 1;
        this.snapshots = i11;
        if (i11 != 0 || this.applied) {
            return;
        }
        G();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void s() {
        if (this.applied || getDisposed()) {
            return;
        }
        I();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void t(@dl.d b0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        Set<b0> setI = i();
        if (setI == null) {
            setI = new HashSet<>();
            U(setI);
        }
        setI.add(state);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void v() {
        S();
        super.v();
    }
}
