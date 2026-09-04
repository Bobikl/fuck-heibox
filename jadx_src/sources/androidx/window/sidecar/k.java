package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.b0;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.s;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/k;", "Landroidx/window/layout/q;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/d;", "Landroidx/window/layout/v;", "callback", "Lkotlin/b2;", ak.av, "b", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "", "Landroidx/window/layout/k$a;", ak.aF, "Ljava/util/Map;", "activityToListeners", "d", "listenerToActivity", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final WindowLayoutComponent component;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final ReentrantLock extensionWindowBackendLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    @b0("lock")
    private final Map<Activity, a> activityToListeners;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    @b0("lock")
    private final Map<androidx.core.util.d<v>, Activity> listenerToActivity;

    /* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/k$a;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lkotlin/b2;", ak.av, "Landroidx/core/util/d;", "Landroidx/window/layout/v;", s.a.f52543a, "b", "d", "", ak.aF, "Landroid/app/Activity;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "Landroidx/window/layout/v;", "lastKnownValue", "", "e", "Ljava/util/Set;", "registeredListeners", "<init>", "(Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    @SuppressLint({"NewApi"})
    public static final class a implements Consumer<WindowLayoutInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d
        private final Activity activity;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d
        private final ReentrantLock multicastConsumerLock;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @b0("lock")
        @e
        private v lastKnownValue;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d
        @b0("lock")
        private final Set<androidx.core.util.d<v>> registeredListeners;

        public a(@d Activity activity) {
            f0.p(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@d WindowLayoutInfo value) {
            f0.p(value, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = l.f28634a.b(this.activity, value);
                Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.d) it.next()).accept(this.lastKnownValue);
                }
                b2 b2Var = b2.f124493a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(@d androidx.core.util.d<v> listener) {
            f0.p(listener, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                v vVar = this.lastKnownValue;
                if (vVar != null) {
                    listener.accept(vVar);
                }
                this.registeredListeners.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.registeredListeners.isEmpty();
        }

        public final void d(@d androidx.core.util.d<v> listener) {
            f0.p(listener, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public k(@d WindowLayoutComponent component) {
        f0.p(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.sidecar.q
    public void a(@d Activity activity, @d Executor executor, @d androidx.core.util.d<v> callback) {
        b2 b2Var;
        f0.p(activity, "activity");
        f0.p(executor, "executor");
        f0.p(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            a aVar = this.activityToListeners.get(activity);
            if (aVar == null) {
                b2Var = null;
            } else {
                aVar.b(callback);
                this.listenerToActivity.put(callback, activity);
                b2Var = b2.f124493a;
            }
            if (b2Var == null) {
                a aVar2 = new a(activity);
                this.activityToListeners.put(activity, aVar2);
                this.listenerToActivity.put(callback, activity);
                aVar2.b(callback);
                this.component.addWindowLayoutInfoListener(activity, aVar2);
            }
            b2 b2Var2 = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.sidecar.q
    public void b(@d androidx.core.util.d<v> callback) {
        f0.p(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(callback);
            if (activity == null) {
                return;
            }
            a aVar = this.activityToListeners.get(activity);
            if (aVar == null) {
                return;
            }
            aVar.d(callback);
            if (aVar.c()) {
                this.component.removeWindowLayoutInfoListener(aVar);
            }
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
