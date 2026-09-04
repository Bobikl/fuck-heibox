package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroidx/compose/runtime/snapshots/f;", "b", "Landroidx/compose/runtime/snapshots/f;", ak.av, "()Landroidx/compose/runtime/snapshots/f;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/f;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class SnapshotApplyConflictException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13151c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f snapshot;

    public SnapshotApplyConflictException(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getSnapshot() {
        return this.snapshot;
    }
}
