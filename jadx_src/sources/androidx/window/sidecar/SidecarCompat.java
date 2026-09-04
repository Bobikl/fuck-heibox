package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.window.core.Version;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SidecarCompat.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0005\t\u0012(\f)B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0017R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006*"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/j;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Lkotlin/b2;", "k", "l", "Landroidx/window/layout/j$a;", "extensionCallback", ak.av, "Landroidx/window/layout/v;", "i", ak.aF, "Landroid/os/IBinder;", "windowToken", "j", "d", "", "b", "Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/sidecar/SidecarInterface;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/SidecarAdapter;", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "", "Ljava/util/Map;", "windowListenerRegisteredContexts", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "e", "Landroidx/window/layout/j$a;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "(Landroid/content/Context;)V", "f", "DistinctSidecarElementCallback", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SidecarCompat implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f28587g = "SidecarCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @e
    private final SidecarInterface sidecar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SidecarAdapter sidecarAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @e
    private j.a extensionCallback;

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/b2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/SidecarAdapter;", ak.av, "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "b", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", ak.aF, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "d", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "e", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final SidecarAdapter sidecarAdapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final SidecarInterface.SidecarCallback callbackInterface;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ReentrantLock lock;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @b0("lock")
        @e
        private SidecarDeviceState lastDeviceState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @b0("mLock")
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;

        public DistinctSidecarElementCallback(@dl.d SidecarAdapter sidecarAdapter, @dl.d SidecarInterface.SidecarCallback callbackInterface) {
            f0.p(sidecarAdapter, "sidecarAdapter");
            f0.p(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@dl.d SidecarDeviceState newDeviceState) {
            f0.p(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.a(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                b2 b2Var = b2.f124493a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@dl.d IBinder token, @dl.d SidecarWindowLayoutInfo newLayout) {
            f0.p(token, "token");
            f0.p(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.d(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/b2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SidecarCompat f28598a;

        public TranslatingCallback(SidecarCompat this$0) {
            f0.p(this$0, "this$0");
            this.f28598a = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@dl.d SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            f0.p(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f28598a.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.f28598a;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.INSTANCE.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    windowLayoutInfo = sidecar.getWindowLayoutInfo(iBinderA);
                }
                j.a aVar = sidecarCompat.extensionCallback;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.sidecarAdapter.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@dl.d IBinder windowToken, @dl.d SidecarWindowLayoutInfo newLayout) {
            f0.p(windowToken, "windowToken");
            f0.p(newLayout, "newLayout");
            Activity activity = (Activity) this.f28598a.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.f28587g, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter = this.f28598a.sidecarAdapter;
            SidecarInterface sidecar = this.f28598a.getSidecar();
            SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            v vVarE = sidecarAdapter.e(newLayout, deviceState);
            j.a aVar = this.f28598a.extensionCallback;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, vVarE);
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SidecarCompat$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/window/sidecar/SidecarInterface;", "b", "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroid/os/IBinder;", ak.av, "(Landroid/app/Activity;)Landroid/os/IBinder;", "Landroidx/window/core/Version;", ak.aF, "()Landroidx/window/core/Version;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @e
        public final IBinder a(@e Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @e
        public final SidecarInterface b(@dl.d Context context) {
            f0.p(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @e
        public final Version c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.INSTANCE.e(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$b;", "Landroidx/window/layout/j$a;", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "Landroidx/window/layout/v;", "newLayout", "Lkotlin/b2;", ak.av, "Landroidx/window/layout/j$a;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "b", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/WeakHashMap;", ak.aF, "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/j$a;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final j.a callbackInterface;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ReentrantLock lock;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @b0("mLock")
        private final WeakHashMap<Activity, v> activityWindowLayoutInfo;

        public b(@dl.d j.a callbackInterface) {
            f0.p(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.j.a
        public void a(@dl.d Activity activity, @dl.d v newLayout) {
            f0.p(activity, "activity");
            f0.p(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (f0.g(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.a(activity, newLayout);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$c;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/window/layout/SidecarCompat;", "b", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", ak.aF, "Ljava/lang/ref/WeakReference;", "activityWeakReference", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "<init>", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final SidecarCompat sidecarCompat;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final WeakReference<Activity> activityWeakReference;

        public c(@dl.d SidecarCompat sidecarCompat, @dl.d Activity activity) {
            f0.p(sidecarCompat, "sidecarCompat");
            f0.p(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View view) {
            f0.p(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder iBinderA = SidecarCompat.INSTANCE.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.sidecarCompat.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View view) {
            f0.p(view, "view");
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"androidx/window/layout/SidecarCompat$d", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lkotlin/b2;", "onConfigurationChanged", "onLowMemory", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class d implements ComponentCallbacks {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f28605c;

        d(Activity activity) {
            this.f28605c = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@dl.d Configuration newConfig) {
            f0.p(newConfig, "newConfig");
            j.a aVar = SidecarCompat.this.extensionCallback;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f28605c;
            aVar.a(activity, SidecarCompat.this.i(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@dl.d Context context) {
        this(INSTANCE.b(context), new SidecarAdapter(null, 1, null));
        f0.p(context, "context");
    }

    @j1
    public SidecarCompat(@j1 @e SidecarInterface sidecarInterface, @dl.d SidecarAdapter sidecarAdapter) {
        f0.p(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void k(Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            d dVar = new d(activity);
            this.componentCallbackMap.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void l(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    @Override // androidx.window.sidecar.j
    public void a(@dl.d j.a extensionCallback) {
        f0.p(extensionCallback, "extensionCallback");
        this.extensionCallback = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    @Override // androidx.window.sidecar.j
    @SuppressLint({"BanUncheckedReflection"})
    public boolean b() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.sidecar;
            Class<?> returnType = null;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType2 = method == null ? null : method.getReturnType();
            if (!f0.g(returnType2, Void.TYPE)) {
                throw new NoSuchMethodException(f0.C("Illegal return type for 'setSidecarCallback': ", returnType2));
            }
            SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.sidecar;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.sidecar;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType3 = method2 == null ? null : method2.getReturnType();
            if (!f0.g(returnType3, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(f0.C("Illegal return type for 'getWindowLayoutInfo': ", returnType3));
            }
            SidecarInterface sidecarInterface5 = this.sidecar;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType4 = method3 == null ? null : method3.getReturnType();
            if (!f0.g(returnType4, Void.TYPE)) {
                throw new NoSuchMethodException(f0.C("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType4));
            }
            SidecarInterface sidecarInterface6 = this.sidecar;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            if (method4 != null) {
                returnType = method4.getReturnType();
            }
            if (!f0.g(returnType, Void.TYPE)) {
                throw new NoSuchMethodException(f0.C("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            f0.o(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (f0.g(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    @Override // androidx.window.sidecar.j
    public void c(@dl.d Activity activity) {
        f0.p(activity, "activity");
        IBinder iBinderA = INSTANCE.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.sidecar.j
    public void d(@dl.d Activity activity) {
        SidecarInterface sidecarInterface;
        f0.p(activity, "activity");
        IBinder iBinderA = INSTANCE.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        l(activity);
        boolean z10 = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @e
    /* JADX INFO: renamed from: h, reason: from getter */
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @j1
    @dl.d
    public final v i(@dl.d Activity activity) {
        f0.p(activity, "activity");
        IBinder iBinderA = INSTANCE.a(activity);
        if (iBinderA == null) {
            return new v(CollectionsKt__CollectionsKt.E());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderA);
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.e(windowLayoutInfo, deviceState);
    }

    public final void j(@dl.d IBinder windowToken, @dl.d Activity activity) {
        SidecarInterface sidecarInterface;
        f0.p(windowToken, "windowToken");
        f0.p(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        j.a aVar = this.extensionCallback;
        if (aVar != null) {
            aVar.a(activity, i(activity));
        }
        k(activity);
    }
}
