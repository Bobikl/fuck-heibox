package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R$\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010)\"\u0004\b*\u0010+R$\u00101\u001a\u00020-2\u0006\u0010(\u001a\u00020-8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010.\"\u0004\b/\u00100R4\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001022\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001028P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b\u001b\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Landroidx/compose/runtime/snapshots/f0;", "Landroidx/compose/runtime/snapshots/f;", "Lkotlin/b2;", "d", "", "n", "Landroidx/compose/runtime/snapshots/b0;", "state", "t", "(Landroidx/compose/runtime/snapshots/b0;)V", "Lkotlin/Function1;", "", "readObserver", androidx.exifinterface.media.a.W4, ak.aB, "()V", "snapshot", "", "H", "(Landroidx/compose/runtime/snapshots/f;)Ljava/lang/Void;", "I", "g", "Landroidx/compose/runtime/snapshots/f;", "previousSnapshot", RXScreenCaptureService.KEY_HEIGHT, "Z", "mergeParentObservers", "i", "ownsPreviousSnapshot", "l", "()Landroidx/compose/runtime/snapshots/f;", "root", "G", "currentSnapshot", "Lyh/l;", "j", "()Lyh/l;", "writeObserver", "m", "", "value", "()I", "y", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", ak.aD, "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "", "()Ljava/util/Set;", "J", "(Ljava/util/Set;)V", org.apache.tools.ant.taskdefs.optional.vss.g.I2, "k", "()Z", "readOnly", "specifiedReadObserver", "<init>", "(Landroidx/compose/runtime/snapshots/f;Lyh/l;ZZ)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f0 extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final f previousSnapshot;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsPreviousSnapshot;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f root;

    public f0(@dl.e f fVar, @dl.e yh.l<Object, b2> lVar, boolean z10, boolean z11) {
        yh.l<Object, b2> lVarJ;
        super(0, SnapshotIdSet.INSTANCE.a(), null);
        this.previousSnapshot = fVar;
        this.mergeParentObservers = z10;
        this.ownsPreviousSnapshot = z11;
        this.f13253j = SnapshotKt.H(lVar, (fVar == null || (lVarJ = fVar.j()) == null) ? ((GlobalSnapshot) SnapshotKt.f13174j.get()).j() : lVarJ, z10);
        this.root = this;
    }

    private final f G() {
        f fVar = this.previousSnapshot;
        if (fVar != null) {
            return fVar;
        }
        Object obj = SnapshotKt.f13174j.get();
        kotlin.jvm.internal.f0.o(obj, "currentGlobalSnapshot.get()");
        return (f) obj;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    public f A(@dl.e yh.l<Object, b2> lVar) {
        yh.l<Object, b2> lVarI = SnapshotKt.I(lVar, j(), false, 4, null);
        return !this.mergeParentObservers ? SnapshotKt.y(G().A(null), lVarI, true) : G().A(lVarI);
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Void q(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Void r(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    public void J(@dl.e Set<b0> set) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void d() {
        f fVar;
        x(true);
        if (!this.ownsPreviousSnapshot || (fVar = this.previousSnapshot) == null) {
            return;
        }
        fVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.f
    /* JADX INFO: renamed from: g */
    public int getId() {
        return G().getId();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: h */
    public SnapshotIdSet getInvalid() {
        return G().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public Set<b0> i() {
        return G().i();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> j() {
        return this.f13253j;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean k() {
        return G().k();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public f getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> m() {
        return this.f13254k;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean n() {
        return G().n();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void s() {
        G().s();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void t(@dl.d b0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        G().t(state);
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
