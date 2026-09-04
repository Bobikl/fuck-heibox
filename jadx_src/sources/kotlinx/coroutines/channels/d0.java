package kotlinx.coroutines.channels;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/channels/d0;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/c0;", "", "Z", "Lkotlin/b2;", "p0", "pollResult", "Lkotlinx/coroutines/p;", "cont", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/p;Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d0<E> extends c0<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public final yh.l<E, b2> f129042g;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(E e10, @dl.d kotlinx.coroutines.p<? super b2> pVar, @dl.d yh.l<? super E, b2> lVar) {
        super(e10, pVar);
        this.f129042g = lVar;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean Z() throws IllegalAccessException, InvocationTargetException {
        if (!super.Z()) {
            return false;
        }
        p0();
        return true;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void p0() throws IllegalAccessException, InvocationTargetException {
        OnUndeliveredElementKt.b(this.f129042g, getElement(), this.cont.getContext());
    }
}
