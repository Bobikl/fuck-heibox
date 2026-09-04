package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.internal.h;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u001b\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\u001f\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/h;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lyh/a;)Lkotlinx/coroutines/internal/h;", "value", "", "m", "(Lkotlinx/coroutines/internal/h;)Z", "Lkotlin/b2;", "b", "()V", "j", "()Z", "l", "e", "()Ljava/lang/Object;", "nextOrClosed", ak.aF, "()Lkotlinx/coroutines/internal/h;", "leftmostAliveNode", RXScreenCaptureService.KEY_HEIGHT, "rightmostAliveNode", "d", "next", "i", "isTail", "f", "prev", "g", "removed", "<init>", "(Lkotlinx/coroutines/internal/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class h<N extends h<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130168a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130169b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");

    @dl.d
    private volatile /* synthetic */ Object _next = null;

    @dl.d
    private volatile /* synthetic */ Object _prev;

    public h(@dl.e N n10) {
        this._prev = n10;
    }

    private final N c() {
        N n10 = (N) f();
        while (n10 != null && n10.g()) {
            n10 = (N) n10._prev;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object get_next() {
        return this._next;
    }

    private final N h() {
        N n10 = (N) d();
        kotlin.jvm.internal.f0.m(n10);
        while (n10.g()) {
            n10 = (N) n10.d();
            kotlin.jvm.internal.f0.m(n10);
        }
        return n10;
    }

    public final void b() {
        f130169b.lazySet(this, null);
    }

    @dl.e
    public final N d() {
        Object obj = get_next();
        if (obj == g.f130167b) {
            return null;
        }
        return (N) obj;
    }

    @dl.e
    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final boolean i() {
        return d() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.a.a(f130168a, this, null, g.f130167b);
    }

    @dl.e
    public final N k(@dl.d yh.a onClosedAction) {
        Object obj = get_next();
        if (obj != g.f130167b) {
            return (N) obj;
        }
        onClosedAction.invoke();
        throw new KotlinNothingValueException();
    }

    public final void l() {
        while (true) {
            h hVarC = c();
            h hVarH = h();
            hVarH._prev = hVarC;
            if (hVarC != null) {
                hVarC._next = hVarH;
            }
            if (!hVarH.g() && (hVarC == null || !hVarC.g())) {
                return;
            }
        }
    }

    public final boolean m(@dl.d N value) {
        return androidx.concurrent.futures.a.a(f130168a, this, null, value);
    }
}
