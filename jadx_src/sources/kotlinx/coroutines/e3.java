package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/e3;", "Lkotlinx/coroutines/f2;", "", "cause", "", "A0", "Lkotlinx/coroutines/d2;", "parent", "<init>", "(Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e3 extends f2 {
    public e3(@dl.e d2 d2Var) {
        super(d2Var);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean A0(@dl.d Throwable cause) {
        return false;
    }
}
