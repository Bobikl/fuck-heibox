package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0005B\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "", "Lkotlin/b2;", ak.av, "", "b", "()Z", "succeeded", "<init>", "()V", "Landroidx/compose/runtime/snapshots/g$a;", "Landroidx/compose/runtime/snapshots/g$b;", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13256a = 0;

    /* JADX INFO: compiled from: Snapshot.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/snapshots/g$a;", "Landroidx/compose/runtime/snapshots/g;", "Lkotlin/b2;", ak.av, "Landroidx/compose/runtime/snapshots/f;", "b", "Landroidx/compose/runtime/snapshots/f;", ak.aF, "()Landroidx/compose/runtime/snapshots/f;", "snapshot", "", "()Z", "succeeded", "<init>", "(Landroidx/compose/runtime/snapshots/f;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f13257c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d f snapshot) {
            super(null);
            kotlin.jvm.internal.f0.p(snapshot, "snapshot");
            this.snapshot = snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.g
        public void a() throws SnapshotApplyConflictException {
            this.snapshot.d();
            throw new SnapshotApplyConflictException(this.snapshot);
        }

        @Override // androidx.compose.runtime.snapshots.g
        public boolean b() {
            return false;
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final f getSnapshot() {
            return this.snapshot;
        }
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/snapshots/g$b;", "Landroidx/compose/runtime/snapshots/g;", "Lkotlin/b2;", ak.av, "", "b", "()Z", "succeeded", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f13259b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f13260c = 0;

        private b() {
            super(null);
        }

        @Override // androidx.compose.runtime.snapshots.g
        public void a() {
        }

        @Override // androidx.compose.runtime.snapshots.g
        public boolean b() {
            return true;
        }
    }

    private g() {
    }

    public /* synthetic */ g(kotlin.jvm.internal.u uVar) {
        this();
    }

    public abstract void a();

    public abstract boolean b();
}
