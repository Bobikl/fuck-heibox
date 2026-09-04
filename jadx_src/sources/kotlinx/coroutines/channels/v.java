package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.n0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/v;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "value", "L1", "(Lkotlin/b2;)V", "", "cause", "", "handled", "H1", "isActive", "()Z", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/k;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/k;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class v<E> extends l<E> implements w<E> {
    public v(@dl.d CoroutineContext coroutineContext, @dl.d k<E> kVar) {
        super(coroutineContext, kVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    protected void H1(@dl.d Throwable th2, boolean z10) {
        if (K1().b(th2) || z10) {
            return;
        }
        n0.b(getContext(), th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void I1(@dl.d b2 value) {
        b0.a.a(K1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.w
    public /* bridge */ /* synthetic */ b0 c() {
        return c();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    public boolean isActive() {
        return super.isActive();
    }
}
