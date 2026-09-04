package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/f0;", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/x1;", "Lkotlin/b2;", "dispose", "", "toString", "Lkotlinx/coroutines/JobSupport;", "e", "Lkotlinx/coroutines/JobSupport;", "k0", "()Lkotlinx/coroutines/JobSupport;", "m0", "(Lkotlinx/coroutines/JobSupport;)V", "job", "", "isActive", "()Z", "Lkotlinx/coroutines/o2;", "d", "()Lkotlinx/coroutines/o2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class j2 extends f0 implements h1, x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public JobSupport job;

    @Override // kotlinx.coroutines.x1
    @dl.e
    /* JADX INFO: renamed from: d */
    public o2 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.h1
    public void dispose() {
        k0().s1(this);
    }

    @Override // kotlinx.coroutines.x1
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return true;
    }

    @dl.d
    public final JobSupport k0() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        kotlin.jvm.internal.f0.S("job");
        return null;
    }

    public final void m0(@dl.d JobSupport jobSupport) {
        this.job = jobSupport;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @dl.d
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + "[job@" + t0.b(k0()) + ']';
    }
}
