package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.t0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010!J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/p;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/channels/y;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "o0", "Lkotlin/b2;", "j0", "value", "n", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)Lkotlinx/coroutines/internal/o0;", "e", "(Ljava/lang/Object;)V", "closed", "m0", "", "toString", "", "Ljava/lang/Throwable;", "closeCause", "w0", "()Ljava/lang/Throwable;", "sendException", "t0", "receiveException", "q0", "()Lkotlinx/coroutines/channels/p;", "offerResult", "r0", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class p<E> extends a0 implements y<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final Throwable closeCause;

    public p(@dl.e Throwable th2) {
        this.closeCause = th2;
    }

    @Override // kotlinx.coroutines.channels.y
    public void e(E value) {
    }

    @Override // kotlinx.coroutines.channels.a0
    public void j0() {
    }

    @Override // kotlinx.coroutines.channels.a0
    public void m0(@dl.d p<?> pVar) {
    }

    @Override // kotlinx.coroutines.channels.y
    @dl.d
    public o0 n(E value, @dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
        o0 o0Var = kotlinx.coroutines.r.f130311d;
        if (otherOp != null) {
            otherOp.d();
        }
        return o0Var;
    }

    @Override // kotlinx.coroutines.channels.a0
    @dl.d
    public o0 o0(@dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
        o0 o0Var = kotlinx.coroutines.r.f130311d;
        if (otherOp != null) {
            otherOp.d();
        }
        return o0Var;
    }

    @Override // kotlinx.coroutines.channels.y
    @dl.d
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public p<E> a() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.a0
    @dl.d
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public p<E> k0() {
        return this;
    }

    @dl.d
    public final Throwable t0() {
        Throwable th2 = this.closeCause;
        return th2 == null ? new ClosedReceiveChannelException(o.f129069a) : th2;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @dl.d
    public String toString() {
        return "Closed@" + t0.b(this) + '[' + this.closeCause + ']';
    }

    @dl.d
    public final Throwable w0() {
        Throwable th2 = this.closeCause;
        return th2 == null ? new ClosedSendChannelException(o.f129069a) : th2;
    }
}
