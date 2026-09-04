package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import java.util.HashSet;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R(\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\"j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`#8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!¨\u0006/"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/f;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "readObserver", "L", ak.aB, "()V", "", "n", "d", "Landroidx/compose/runtime/snapshots/b0;", "state", "", "K", "(Landroidx/compose/runtime/snapshots/b0;)Ljava/lang/Void;", "snapshot", "J", "(Landroidx/compose/runtime/snapshots/f;)Ljava/lang/Void;", "I", "g", "Landroidx/compose/runtime/snapshots/f;", "H", "()Landroidx/compose/runtime/snapshots/f;", "parent", "k", "()Z", "readOnly", "l", "root", "Lyh/l;", "j", "()Lyh/l;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "G", "()Ljava/util/HashSet;", org.apache.tools.ant.taskdefs.optional.vss.g.I2, "m", "writeObserver", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lyh/l;Landroidx/compose/runtime/snapshots/f;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class NestedReadonlySnapshot extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f parent;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13148h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i10, @dl.d SnapshotIdSet invalid, @dl.e final yh.l<Object, b2> lVar, @dl.d f parent) {
        super(i10, invalid, null);
        kotlin.jvm.internal.f0.p(invalid, "invalid");
        kotlin.jvm.internal.f0.p(parent, "parent");
        this.parent = parent;
        parent.q(this);
        if (lVar != null) {
            final yh.l<Object, b2> lVarJ = parent.j();
            if (lVarJ != null) {
                lVar = new yh.l<Object, b2>() { // from class: androidx.compose.runtime.snapshots.NestedReadonlySnapshot$readObserver$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                        invoke2(obj);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.d Object state) {
                        kotlin.jvm.internal.f0.p(state, "state");
                        lVar.invoke(state);
                        lVarJ.invoke(state);
                    }
                };
            }
        } else {
            lVar = parent.j();
        }
        this.f13148h = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public HashSet<b0> i() {
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public final f getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Void q(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Void r(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Void t(@dl.d b0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        SnapshotKt.V();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public NestedReadonlySnapshot A(@dl.e yh.l<Object, b2> lVar) {
        return new NestedReadonlySnapshot(getId(), getInvalid(), lVar, this.parent);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void d() {
        if (getDisposed()) {
            return;
        }
        if (getId() != this.parent.getId()) {
            b();
        }
        this.parent.r(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> j() {
        return this.f13148h;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean k() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    public f l() {
        return this.parent.l();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> m() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean n() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void s() {
    }
}
