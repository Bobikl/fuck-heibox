package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/internal/v;", "Lkotlinx/coroutines/x1;", "", "state", "p0", "toString", "", "isActive", "()Z", "d", "()Lkotlinx/coroutines/o2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o2 extends kotlinx.coroutines.internal.v implements x1 {
    @Override // kotlinx.coroutines.x1
    @dl.d
    public o2 d() {
        return this;
    }

    @Override // kotlinx.coroutines.x1
    public boolean isActive() {
        return true;
    }

    @dl.d
    public final String p0(@dl.d String state) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(state);
        sb2.append("}[");
        boolean z10 = true;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) N(); !kotlin.jvm.internal.f0.g(lockFreeLinkedListNodeO, this); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            if (lockFreeLinkedListNodeO instanceof j2) {
                j2 j2Var = (j2) lockFreeLinkedListNodeO;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(j2Var);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @dl.d
    public String toString() {
        return super.toString();
    }
}
