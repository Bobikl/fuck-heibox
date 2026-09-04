package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/y;", androidx.exifinterface.media.a.S4, "", "value", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "otherOp", "Lkotlinx/coroutines/internal/o0;", "n", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;)Lkotlinx/coroutines/internal/o0;", "Lkotlin/b2;", "e", "(Ljava/lang/Object;)V", ak.av, "()Ljava/lang/Object;", "offerResult", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface y<E> {
    @dl.d
    Object a();

    void e(E value);

    @dl.e
    o0 n(E value, @dl.e LockFreeLinkedListNode.PrepareOp otherOp);
}
