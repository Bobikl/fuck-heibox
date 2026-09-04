package kotlinx.coroutines.scheduling;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/l;", "Lkotlinx/coroutines/scheduling/k;", "Lkotlin/b2;", ak.aF, "", "b", "I", "L", "()I", "taskMode", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int taskMode;

    public l(int i10) {
        this.taskMode = i10;
    }

    @Override // kotlinx.coroutines.scheduling.k
    /* JADX INFO: renamed from: L, reason: from getter */
    public int getTaskMode() {
        return this.taskMode;
    }

    @Override // kotlinx.coroutines.scheduling.k
    public void c() {
    }
}
