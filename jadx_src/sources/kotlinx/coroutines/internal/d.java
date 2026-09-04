package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/d;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/g0;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "Lkotlin/b2;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", ak.aF, "f", "()Ljava/lang/Object;", "consensus", "", RXScreenCaptureService.KEY_HEIGHT, "()Z", "isDecided", "", "g", "()J", "opSequence", ak.av, "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class d<T> extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130157a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");

    @dl.d
    private volatile /* synthetic */ Object _consensus = c.f130152a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.g0
    @dl.d
    public d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.g0
    @dl.e
    public final Object c(@dl.e Object affected) {
        Object objE = this._consensus;
        if (objE == c.f130152a) {
            objE = e(i(affected));
        }
        d(affected, objE);
        return objE;
    }

    public abstract void d(T affected, @dl.e Object failure);

    @dl.e
    public final Object e(@dl.e Object decision) {
        Object obj = this._consensus;
        Object obj2 = c.f130152a;
        if (obj != obj2) {
            return obj;
        }
        return androidx.concurrent.futures.a.a(f130157a, this, obj2, decision) ? decision : this._consensus;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object get_consensus() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != c.f130152a;
    }

    @dl.e
    public abstract Object i(T affected);
}
