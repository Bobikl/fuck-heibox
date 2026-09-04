package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/t;", "Lkotlinx/coroutines/d0;", "", ak.aF, "()Z", "Lkotlin/coroutines/c;", "continuation", "", "cause", "handled", "<init>", "(Lkotlin/coroutines/c;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class t extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130489c = AtomicIntegerFieldUpdater.newUpdater(t.class, "_resumed");

    @dl.d
    private volatile /* synthetic */ int _resumed;

    public t(@dl.d kotlin.coroutines.c<?> cVar, @dl.e Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + cVar + " was cancelled normally");
        }
        super(th2, z10);
        this._resumed = 0;
    }

    public final boolean c() {
        return f130489c.compareAndSet(this, 0, 1);
    }
}
