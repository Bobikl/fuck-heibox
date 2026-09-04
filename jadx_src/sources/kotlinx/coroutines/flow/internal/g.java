package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.k0;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/g;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/k0;", "", "cause", "", "A0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlin/coroutines/c;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g<T> extends k0<T> {
    public g(@dl.d CoroutineContext coroutineContext, @dl.d kotlin.coroutines.c<? super T> cVar) {
        super(coroutineContext, cVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean A0(@dl.d Throwable cause) {
        if (cause instanceof ChildCancelledException) {
            return true;
        }
        return v0(cause);
    }
}
