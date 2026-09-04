package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.t0;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/c;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/channels/e;", "", "cause", "Lkotlin/b2;", "m1", "exception", "", "U0", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/k;", "channel", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/k;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class c<E> extends l<E> implements e<E> {
    public c(@dl.d CoroutineContext coroutineContext, @dl.d k<E> kVar, boolean z10) {
        super(coroutineContext, kVar, false, z10);
        W0((d2) coroutineContext.f(d2.INSTANCE));
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean U0(@dl.d Throwable exception) {
        n0.b(getCom.umeng.analytics.pro.d.R java.lang.String(), exception);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void m1(@dl.e Throwable th2) {
        k<E> kVarK1 = K1();
        CancellationException cancellationExceptionA = null;
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = q1.a(t0.a(this) + " was cancelled", th2);
            }
        }
        kVarK1.e(cancellationExceptionA);
    }
}
