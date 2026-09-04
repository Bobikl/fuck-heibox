package androidx.window.java.layout;

import android.app.Activity;
import androidx.exifinterface.media.a;
import androidx.window.sidecar.s;
import androidx.window.sidecar.v;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s1;

/* JADX INFO: compiled from: WindowInfoTrackerCallbackAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R$\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;", "Landroidx/window/layout/s;", a.f23244d5, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "consumer", "Lkotlinx/coroutines/flow/e;", "flow", "Lkotlin/b2;", "b", "d", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/window/layout/v;", ak.av, ak.aF, "e", "Landroidx/window/layout/s;", "tracker", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "Lkotlinx/coroutines/d2;", "Ljava/util/Map;", "consumerToJobMap", "<init>", "(Landroidx/window/layout/s;)V", "window-java_release"}, k = 1, mv = {1, 5, 1})
public final class WindowInfoTrackerCallbackAdapter implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final s tracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<androidx.core.util.d<?>, d2> consumerToJobMap;

    public WindowInfoTrackerCallbackAdapter(@d s tracker) {
        f0.p(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void b(Executor executor, androidx.core.util.d<T> dVar, e<? extends T> eVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(dVar) == null) {
                this.consumerToJobMap.put(dVar, k.f(r0.a(s1.c(executor)), null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(eVar, dVar, null), 3, null));
            }
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void d(androidx.core.util.d<?> dVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            d2 d2Var = this.consumerToJobMap.get(dVar);
            if (d2Var != null) {
                d2.a.b(d2Var, null, 1, null);
            }
            this.consumerToJobMap.remove(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.sidecar.s
    @d
    public e<v> a(@d Activity activity) {
        f0.p(activity, "activity");
        return this.tracker.a(activity);
    }

    public final void c(@d Activity activity, @d Executor executor, @d androidx.core.util.d<v> consumer) {
        f0.p(activity, "activity");
        f0.p(executor, "executor");
        f0.p(consumer, "consumer");
        b(executor, consumer, this.tracker.a(activity));
    }

    public final void e(@d androidx.core.util.d<v> consumer) {
        f0.p(consumer, "consumer");
        d(consumer);
    }
}
