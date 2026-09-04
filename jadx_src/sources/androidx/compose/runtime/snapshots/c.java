package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/c;", "Landroidx/compose/runtime/snapshots/b;", "Lkotlin/b2;", "b0", "d", "Landroidx/compose/runtime/snapshots/g;", "J", "o", "Landroidx/compose/runtime/snapshots/b;", "c0", "()Landroidx/compose/runtime/snapshots/b;", "parent", "", "p", "Z", "deactivated", "Landroidx/compose/runtime/snapshots/f;", "l", "()Landroidx/compose/runtime/snapshots/f;", "root", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lyh/l;Lyh/l;Landroidx/compose/runtime/snapshots/b;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b parent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean deactivated;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, @dl.d SnapshotIdSet invalid, @dl.e yh.l<Object, b2> lVar, @dl.e yh.l<Object, b2> lVar2, @dl.d b parent) {
        super(i10, invalid, lVar, lVar2);
        kotlin.jvm.internal.f0.p(invalid, "invalid");
        kotlin.jvm.internal.f0.p(parent, "parent");
        this.parent = parent;
        parent.q(this);
    }

    private final void b0() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.r(this);
    }

    @Override // androidx.compose.runtime.snapshots.b
    @dl.d
    public g J() {
        Map<c0, ? extends c0> mapN;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new g.a(this);
        }
        Set<b0> setI = i();
        int id2 = getId();
        if (setI != null) {
            b bVar = this.parent;
            mapN = SnapshotKt.N(bVar, this, bVar.getInvalid());
        } else {
            mapN = null;
        }
        synchronized (SnapshotKt.D()) {
            SnapshotKt.d0(this);
            if (setI == null || setI.size() == 0) {
                b();
            } else {
                g gVarN = N(this.parent.getId(), mapN, this.parent.getInvalid());
                if (!kotlin.jvm.internal.f0.g(gVarN, g.b.f13259b)) {
                    return gVarN;
                }
                Set<b0> setI2 = this.parent.i();
                if (setI2 == null) {
                    setI2 = new HashSet<>();
                    this.parent.U(setI2);
                }
                setI2.addAll(setI);
            }
            if (this.parent.getId() < id2) {
                this.parent.I();
            }
            b bVar2 = this.parent;
            bVar2.z(bVar2.getInvalid().l(id2).j(getPreviousIds()));
            this.parent.O(id2);
            this.parent.Q(C());
            this.parent.P(getPreviousIds());
            this.parent.R(getPreviousPinnedSnapshots());
            b2 b2Var = b2.f124493a;
            T(true);
            b0();
            return g.b.f13259b;
        }
    }

    @dl.d
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final b getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        b0();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    public f l() {
        return this.parent.l();
    }
}
