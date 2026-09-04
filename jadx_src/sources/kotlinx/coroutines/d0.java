package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/d0;", "", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", ak.av, "Ljava/lang/Throwable;", "cause", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f129088b = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_handled");

    @dl.d
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Throwable cause;

    public d0(@dl.d Throwable th2, boolean z10) {
        this.cause = th2;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ d0(Throwable th2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f129088b.compareAndSet(this, 0, 1);
    }

    @dl.d
    public String toString() {
        return t0.a(this) + '[' + this.cause + ']';
    }
}
