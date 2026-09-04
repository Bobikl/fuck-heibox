package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.HashSet;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010+\u001a\u00020\u0014\u0012\u0006\u0010-\u001a\u00020,\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aRL\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010#j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`$2\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010#j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`$8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00060"}, d2 = {"Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/f;", "", "n", "Lkotlin/Function1;", "", "Lkotlin/b2;", "readObserver", androidx.exifinterface.media.a.W4, ak.aB, "()V", "d", "snapshot", "q", "(Landroidx/compose/runtime/snapshots/f;)V", "r", "Landroidx/compose/runtime/snapshots/b0;", "state", "t", "(Landroidx/compose/runtime/snapshots/b0;)V", "", RXScreenCaptureService.KEY_HEIGHT, "I", "snapshots", "Lyh/l;", "j", "()Lyh/l;", "k", "()Z", "readOnly", "l", "()Landroidx/compose/runtime/snapshots/f;", "root", "m", "writeObserver", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "value", "G", "()Ljava/util/HashSet;", "H", "(Ljava/util/HashSet;)V", org.apache.tools.ant.taskdefs.optional.vss.g.I2, "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lyh/l;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final yh.l<Object, b2> f13235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, @dl.d SnapshotIdSet invalid, @dl.e yh.l<Object, b2> lVar) {
        super(i10, invalid, null);
        kotlin.jvm.internal.f0.p(invalid, "invalid");
        this.f13235g = lVar;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    public f A(@dl.e yh.l<Object, b2> lVar) {
        SnapshotKt.d0(this);
        return new NestedReadonlySnapshot(getId(), getInvalid(), lVar, this);
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public HashSet<b0> i() {
        return null;
    }

    public void H(@dl.e HashSet<b0> hashSet) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void d() {
        if (getDisposed()) {
            return;
        }
        r(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.e
    public yh.l<Object, b2> j() {
        return this.f13235g;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean k() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.f
    @dl.d
    public f l() {
        return this;
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
    public void q(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void r(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        int i10 = this.snapshots - 1;
        this.snapshots = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void s() {
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void t(@dl.d b0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        SnapshotKt.V();
        throw new KotlinNothingValueException();
    }
}
