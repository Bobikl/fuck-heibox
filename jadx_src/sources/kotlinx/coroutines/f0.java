package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: CompletionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H¦\u0002¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/f0;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "Lkotlinx/coroutines/CompletionHandler;", "j0", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class f0 extends LockFreeLinkedListNode implements yh.l<Throwable, kotlin.b2> {
    public abstract void j0(@dl.e Throwable th2);
}
