package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/v;", "Lkotlin/b2;", "dispose", "", "cause", "", ak.aF, "", "toString", "Lkotlinx/coroutines/d2;", "getParent", "()Lkotlinx/coroutines/d2;", "parent", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q2 implements h1, v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final q2 f130305b = new q2();

    private q2() {
    }

    @Override // kotlinx.coroutines.v
    public boolean c(@dl.d Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.h1
    public void dispose() {
    }

    @Override // kotlinx.coroutines.v
    @dl.e
    public d2 getParent() {
        return null;
    }

    @dl.d
    public String toString() {
        return "NonDisposableHandle";
    }
}
