package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/x1;", "", "toString", "", "b", "Z", "isActive", "()Z", "Lkotlinx/coroutines/o2;", "d", "()Lkotlinx/coroutines/o2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class k1 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    public k1(boolean z10) {
        this.isActive = z10;
    }

    @Override // kotlinx.coroutines.x1
    @dl.e
    /* JADX INFO: renamed from: d */
    public o2 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.x1
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(getIsActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
