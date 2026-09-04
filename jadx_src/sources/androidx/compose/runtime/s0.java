package androidx.compose.runtime;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/s0;", "", "", ak.av, "I", "b", "()I", "key", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "objectKey", ak.aF, "location", "d", "nodes", UCropPlusActivity.ARG_INDEX, "<init>", "(ILjava/lang/Object;III)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object objectKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int nodes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int index;

    public s0(int i10, @dl.e Object obj, int i11, int i12, int i13) {
        this.key = i10;
        this.objectKey = obj;
        this.location = i11;
        this.nodes = i12;
        this.index = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getNodes() {
        return this.nodes;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getObjectKey() {
        return this.objectKey;
    }
}
