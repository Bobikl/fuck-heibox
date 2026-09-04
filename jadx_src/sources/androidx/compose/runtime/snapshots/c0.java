package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H&J\b\u0010\u0005\u001a\u00020\u0000H&R\"\u0010\f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/snapshots/c0;", "", "value", "Lkotlin/b2;", ak.av, "b", "", "I", "d", "()I", "f", "(I)V", "snapshotId", "Landroidx/compose/runtime/snapshots/c0;", ak.aF, "()Landroidx/compose/runtime/snapshots/c0;", "e", "(Landroidx/compose/runtime/snapshots/c0;)V", "next", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13226c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int snapshotId = SnapshotKt.C().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c0 next;

    public abstract void a(@dl.d c0 c0Var);

    @dl.d
    public abstract c0 b();

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSnapshotId() {
        return this.snapshotId;
    }

    public final void e(@dl.e c0 c0Var) {
        this.next = c0Var;
    }

    public final void f(int i10) {
        this.snapshotId = i10;
    }
}
