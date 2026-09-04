package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/v;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Lkotlin/b2;", "block", "j0", "", "m0", "X", "o0", "()V", "", "k0", "()Z", "isEmpty", androidx.exifinterface.media.a.R4, "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class v extends LockFreeLinkedListNode {
    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean S() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @dl.e
    protected LockFreeLinkedListNode X() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public /* bridge */ /* synthetic */ boolean Z() {
        return ((Boolean) m0()).booleanValue();
    }

    public final /* synthetic */ <T extends LockFreeLinkedListNode> void j0(yh.l<? super T, b2> lVar) {
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) N(); !kotlin.jvm.internal.f0.g(lockFreeLinkedListNodeO, this); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.O()) {
            kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
            if (lockFreeLinkedListNodeO instanceof LockFreeLinkedListNode) {
                lVar.invoke(lockFreeLinkedListNodeO);
            }
        }
    }

    public final boolean k0() {
        return N() == this;
    }

    @dl.d
    public final Void m0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void o0() {
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) N();
        LockFreeLinkedListNode lockFreeLinkedListNode2 = this;
        while (!kotlin.jvm.internal.f0.g(lockFreeLinkedListNode, this)) {
            LockFreeLinkedListNode lockFreeLinkedListNodeO = lockFreeLinkedListNode.O();
            lockFreeLinkedListNode.i0(lockFreeLinkedListNode2, lockFreeLinkedListNodeO);
            lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            lockFreeLinkedListNode = lockFreeLinkedListNodeO;
        }
        i0(lockFreeLinkedListNode2, (LockFreeLinkedListNode) N());
    }
}
