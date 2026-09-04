package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/j0;", "", "", ak.av, "I", ak.aF, "()I", "f", "(I)V", "slotIndex", "b", "e", "nodeIndex", "d", "nodeCount", "<init>", "(III)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int slotIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    public j0(int i10, int i11, int i12) {
        this.slotIndex = i10;
        this.nodeIndex = i11;
        this.nodeCount = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNodeCount() {
        return this.nodeCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void d(int i10) {
        this.nodeCount = i10;
    }

    public final void e(int i10) {
        this.nodeIndex = i10;
    }

    public final void f(int i10) {
        this.slotIndex = i10;
    }
}
