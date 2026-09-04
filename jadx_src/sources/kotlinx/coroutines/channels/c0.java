package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.t0;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/c0;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/a0;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "o0", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/channels/p;", "closed", "m0", "", "toString", "e", "Ljava/lang/Object;", "k0", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/p;", "f", "Lkotlinx/coroutines/p;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class c0<E> extends a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final E pollResult;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final kotlinx.coroutines.p<b2> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(E e10, @dl.d kotlinx.coroutines.p<? super b2> pVar) {
        this.pollResult = e10;
        this.cont = pVar;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void j0() {
        this.cont.V(kotlinx.coroutines.r.f130311d);
    }

    @Override // kotlinx.coroutines.channels.a0
    /* JADX INFO: renamed from: k0 */
    public E getElement() {
        return this.pollResult;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void m0(@dl.d p<?> pVar) {
        kotlinx.coroutines.p<b2> pVar2 = this.cont;
        Result.a aVar = Result.f124476c;
        pVar2.resumeWith(Result.b(t0.a(pVar.w0())));
    }

    @Override // kotlinx.coroutines.channels.a0
    @dl.e
    public o0 o0(@dl.e LockFreeLinkedListNode.PrepareOp otherOp) {
        if (this.cont.W(b2.f124493a, otherOp != null ? otherOp.desc : null) == null) {
            return null;
        }
        if (otherOp != null) {
            otherOp.d();
        }
        return kotlinx.coroutines.r.f130311d;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @dl.d
    public String toString() {
        return kotlinx.coroutines.t0.a(this) + '@' + kotlinx.coroutines.t0.b(this) + '(' + getElement() + ')';
    }
}
