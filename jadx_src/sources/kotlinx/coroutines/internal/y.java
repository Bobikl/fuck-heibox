package kotlinx.coroutines.internal;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/y;", "", androidx.exifinterface.media.a.S4, "Lkotlin/b2;", "b", "()V", "element", "", ak.av, "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "f", "(Lyh/l;)Ljava/util/List;", "d", "()Z", "e", "isEmpty", "", ak.aF, "()I", UiKitSpanObj.TYPE_SIZE, "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class y<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130209a = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_cur");

    @dl.d
    private volatile /* synthetic */ Object _cur;

    public y(boolean z10) {
        this._cur = new z(8, z10);
    }

    public final boolean a(@dl.d E element) {
        while (true) {
            z zVar = (z) this._cur;
            int iA = zVar.a(element);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.a.a(f130209a, this, zVar, zVar.k());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            z zVar = (z) this._cur;
            if (zVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f130209a, this, zVar, zVar.k());
            }
        }
    }

    public final int c() {
        return ((z) this._cur).f();
    }

    public final boolean d() {
        return ((z) this._cur).g();
    }

    public final boolean e() {
        return ((z) this._cur).h();
    }

    @dl.d
    public final <R> List<R> f(@dl.d yh.l<? super E, ? extends R> transform) {
        return ((z) this._cur).i(transform);
    }

    @dl.e
    public final E g() {
        while (true) {
            z zVar = (z) this._cur;
            E e10 = (E) zVar.l();
            if (e10 != z.f130229t) {
                return e10;
            }
            androidx.concurrent.futures.a.a(f130209a, this, zVar, zVar.k());
        }
    }
}
