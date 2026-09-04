package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/x1;", "", "toString", "Lkotlinx/coroutines/o2;", "b", "Lkotlinx/coroutines/o2;", "d", "()Lkotlinx/coroutines/o2;", "list", "", "isActive", "()Z", "<init>", "(Lkotlinx/coroutines/o2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class w1 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o2 list;

    public w1(@dl.d o2 o2Var) {
        this.list = o2Var;
    }

    @Override // kotlinx.coroutines.x1
    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public o2 getList() {
        return this.list;
    }

    @Override // kotlinx.coroutines.x1
    public boolean isActive() {
        return false;
    }

    @dl.d
    public String toString() {
        return super.toString();
    }
}
