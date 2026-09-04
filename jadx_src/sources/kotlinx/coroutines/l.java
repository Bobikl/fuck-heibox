package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.Future;
import kotlin.Metadata;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/n;", "", "cause", "Lkotlin/b2;", ak.av, "", "toString", "Ljava/util/concurrent/Future;", "b", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Future<?> future;

    public l(@dl.d Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.o
    public void a(@dl.e Throwable th2) {
        if (th2 != null) {
            this.future.cancel(false);
        }
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        a(th2);
        return kotlin.b2.f124493a;
    }

    @dl.d
    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }
}
