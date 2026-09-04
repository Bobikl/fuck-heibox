package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016J4\u0010\u0012\u001a\u00020\u00012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016J\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010#\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R$\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020*8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00106\u001a\u0002012\u0006\u0010+\u001a\u0002018P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R4\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001072\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001078P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/runtime/snapshots/e0;", "Landroidx/compose/runtime/snapshots/b;", "Lkotlin/b2;", "d", "", "n", "Landroidx/compose/runtime/snapshots/g;", "J", "Landroidx/compose/runtime/snapshots/b0;", "state", "t", "(Landroidx/compose/runtime/snapshots/b0;)V", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/f;", androidx.exifinterface.media.a.W4, "writeObserver", "X", ak.aB, "()V", "snapshot", "", "e0", "(Landroidx/compose/runtime/snapshots/f;)Ljava/lang/Void;", "f0", "o", "Landroidx/compose/runtime/snapshots/b;", "previousSnapshot", "r", "Z", "mergeParentObservers", "ownsPreviousSnapshot", "b0", "()Landroidx/compose/runtime/snapshots/b;", "currentSnapshot", "specifiedReadObserver", "Lyh/l;", "c0", "()Lyh/l;", "specifiedWriteObserver", "d0", "", "value", "g", "()I", "y", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", ak.aD, "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "", "i", "()Ljava/util/Set;", "U", "(Ljava/util/Set;)V", org.apache.tools.ant.taskdefs.optional.vss.g.I2, "k", "()Z", "readOnly", "<init>", "(Landroidx/compose/runtime/snapshots/b;Lyh/l;Lyh/l;ZZ)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e0 extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final b previousSnapshot;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsPreviousSnapshot;

    public e0(@dl.e b bVar, @dl.e yh.l<Object, b2> lVar, @dl.e yh.l<Object, b2> lVar2, boolean z10, boolean z11) {
        yh.l<Object, b2> lVarM;
        yh.l<Object, b2> lVarJ;
        super(0, SnapshotIdSet.INSTANCE.a(), SnapshotKt.H(lVar, (bVar == null || (lVarJ = bVar.j()) == null) ? ((GlobalSnapshot) SnapshotKt.f13174j.get()).j() : lVarJ, z10), SnapshotKt.J(lVar2, (bVar == null || (lVarM = bVar.m()) == null) ? ((GlobalSnapshot) SnapshotKt.f13174j.get()).m() : lVarM));
        this.previousSnapshot = bVar;
        this.f13238p = lVar;
        this.f13239q = lVar2;
        this.mergeParentObservers = z10;
        this.ownsPreviousSnapshot = z11;
    }

    private final b b0() {
        b bVar = this.previousSnapshot;
        if (bVar != null) {
            return bVar;
        }
        Object obj = SnapshotKt.f13174j.get();
        kotlin.jvm.internal.f0.o(obj, "currentGlobalSnapshot.get()");
        return (b) obj;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    public f A(@dl.e yh.l<Object, b2> lVar) {
        yh.l<Object, b2> lVarI = SnapshotKt.I(lVar, j(), false, 4, null);
        return !this.mergeParentObservers ? SnapshotKt.y(b0().A(null), lVarI, true) : b0().A(lVarI);
    }

    @Override // androidx.compose.runtime.snapshots.b
    @dl.d
    public g J() {
        return b0().J();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public void U(@dl.e Set<b0> set) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b
    @dl.d
    public b X(@dl.e yh.l<Object, b2> lVar, @dl.e yh.l<Object, b2> lVar2) {
        yh.l<Object, b2> lVarI = SnapshotKt.I(lVar, j(), false, 4, null);
        yh.l<Object, b2> lVarJ = SnapshotKt.J(lVar2, m());
        return !this.mergeParentObservers ? new e0(b0().X(null, lVarJ), lVarI, lVarJ, false, true) : b0().X(lVarI, lVarJ);
    }

    @dl.e
    public final yh.l<Object, b2> c0() {
        return this.f13238p;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public void d() {
        b bVar;
        x(true);
        if (!this.ownsPreviousSnapshot || (bVar = this.previousSnapshot) == null) {
            return;
        }
        bVar.d();
    }

    @dl.e
    public final yh.l<Object, b2> d0() {
        return this.f13239q;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public Void q(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public Void r(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    /* JADX INFO: renamed from: g */
    public int getId() {
        return b0().getId();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: h */
    public SnapshotIdSet getInvalid() {
        return b0().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.e
    public Set<b0> i() {
        return b0().i();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public boolean k() {
        return b0().k();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public boolean n() {
        return b0().n();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public void s() {
        b0().s();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public void t(@dl.d b0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        b0().t(state);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void y(int i10) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void z(@dl.d SnapshotIdSet value) {
        kotlin.jvm.internal.f0.p(value, "value");
        u.b();
        throw new KotlinNothingValueException();
    }
}
