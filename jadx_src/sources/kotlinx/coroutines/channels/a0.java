package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0014\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH&J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "o0", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "p0", "", "k0", "()Ljava/lang/Object;", "pollResult", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class a0 extends LockFreeLinkedListNode {
    public abstract void j0();

    @dl.e
    public abstract Object k0();

    public abstract void m0(@dl.d p<?> pVar);

    @dl.e
    public abstract o0 o0(@dl.e LockFreeLinkedListNode.PrepareOp otherOp);

    public void p0() {
    }
}
