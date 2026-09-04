package com.max.xiaoheihe.okflutter.embedding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.android.FlutterEngineConfigurator;
import io.flutter.embedding.android.FlutterEngineProvider;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.FlutterEngineGroupCache;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FlutterActivityAndFragmentDelegate implements ExclusiveAppComponent<Activity> {
    private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
    private static final String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
    private static final String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
    private static final String TAG = "FlutterActivityAndFragmentDelegate";
    public static ChangeQuickRedirect changeQuickRedirect;

    @j1
    @p0
    ViewTreeObserver.OnPreDrawListener activePreDrawListener;

    @p0
    private FlutterEngineGroup engineGroup;

    @p0
    private FlutterEngine flutterEngine;

    @n0
    private final FlutterUiDisplayListener flutterUiDisplayListener;

    @j1
    @p0
    FlutterView flutterView;

    @n0
    private Host host;
    private boolean isAttached;
    private boolean isFirstFrameRendered;
    private boolean isFlutterEngineFromHost;
    private boolean isFlutterUiDisplayed;

    @p0
    private PlatformPlugin platformPlugin;
    private Integer previousVisibility;

    public interface DelegateFactory {
        FlutterActivityAndFragmentDelegate createDelegate(Host host);
    }

    public interface Host extends FlutterEngineProvider, FlutterEngineConfigurator, PlatformPlugin.PlatformPluginDelegate {
        boolean attachToEngineAutomatically();

        @Override // io.flutter.embedding.android.FlutterEngineConfigurator
        void cleanUpFlutterEngine(@n0 FlutterEngine flutterEngine);

        @Override // io.flutter.embedding.android.FlutterEngineConfigurator
        void configureFlutterEngine(@n0 FlutterEngine flutterEngine);

        void detachFromFlutterEngine();

        @p0
        Activity getActivity();

        @n0
        String getAppBundlePath();

        @p0
        String getCachedEngineGroupId();

        @p0
        String getCachedEngineId();

        @n0
        Context getContext();

        @p0
        List<String> getDartEntrypointArgs();

        @n0
        String getDartEntrypointFunctionName();

        @p0
        String getDartEntrypointLibraryUri();

        ExclusiveAppComponent<Activity> getExclusiveAppComponent();

        @n0
        FlutterShellArgs getFlutterShellArgs();

        @p0
        String getInitialRoute();

        @n0
        Lifecycle getLifecycle();

        @n0
        RenderMode getRenderMode();

        @n0
        TransparencyMode getTransparencyMode();

        void onFlutterSurfaceViewCreated(@n0 FlutterSurfaceView flutterSurfaceView);

        void onFlutterTextureViewCreated(@n0 FlutterTextureView flutterTextureView);

        void onFlutterUiDisplayed();

        void onFlutterUiNoLongerDisplayed();

        @Override // io.flutter.embedding.android.FlutterEngineProvider
        @p0
        FlutterEngine provideFlutterEngine(@n0 Context context);

        @p0
        PlatformPlugin providePlatformPlugin(@p0 Activity activity, @n0 FlutterEngine flutterEngine);

        boolean shouldAttachEngineToActivity();

        boolean shouldDestroyEngineWithHost();

        boolean shouldDispatchAppLifecycleState();

        @p0
        boolean shouldHandleDeeplinking();

        boolean shouldRestoreAndSaveState();

        void updateSystemUiOverlays();
    }

    FlutterActivityAndFragmentDelegate(@n0 Host host) {
        this(host, null);
    }

    FlutterActivityAndFragmentDelegate(@n0 Host host, @p0 FlutterEngineGroup flutterEngineGroup) {
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47864, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                FlutterActivityAndFragmentDelegate.this.host.onFlutterUiDisplayed();
                FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = true;
                FlutterActivityAndFragmentDelegate.this.isFirstFrameRendered = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47865, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                FlutterActivityAndFragmentDelegate.this.host.onFlutterUiNoLongerDisplayed();
                FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = false;
            }
        };
        this.host = host;
        this.isFirstFrameRendered = false;
        this.engineGroup = flutterEngineGroup;
    }

    private FlutterEngineGroup.Options addEntrypointOptions(FlutterEngineGroup.Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{options}, this, changeQuickRedirect, false, 47839, new Class[]{FlutterEngineGroup.Options.class}, FlutterEngineGroup.Options.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngineGroup.Options) patchProxyResultProxy.result;
        }
        String appBundlePath = this.host.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
        }
        DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName());
        String initialRoute = this.host.getInitialRoute();
        if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
            initialRoute = "/";
        }
        return options.setDartEntrypoint(dartEntrypoint).setInitialRoute(initialRoute).setDartEntrypointArgs(this.host.getDartEntrypointArgs());
    }

    private void delayFirstAndroidViewDraw(final FlutterView flutterView) {
        if (PatchProxy.proxy(new Object[]{flutterView}, this, changeQuickRedirect, false, 47846, new Class[]{FlutterView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.host.getRenderMode() != RenderMode.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.activePreDrawListener != null) {
            flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
        }
        this.activePreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47866, new Class[0], Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed && FlutterActivityAndFragmentDelegate.this.activePreDrawListener != null) {
                    flutterView.getViewTreeObserver().removeOnPreDrawListener(this);
                    FlutterActivityAndFragmentDelegate.this.activePreDrawListener = null;
                }
                return FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed;
            }
        };
        flutterView.getViewTreeObserver().addOnPreDrawListener(this.activePreDrawListener);
    }

    private void doInitialFlutterViewRun() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47844, new Class[0], Void.TYPE).isSupported || this.host.getCachedEngineId() != null || this.flutterEngine.getDartExecutor().isExecutingDart()) {
            return;
        }
        String initialRoute = this.host.getInitialRoute();
        if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
            initialRoute = "/";
        }
        String dartEntrypointLibraryUri = this.host.getDartEntrypointLibraryUri();
        if (("Executing Dart entrypoint: " + this.host.getDartEntrypointFunctionName() + ", library uri: " + dartEntrypointLibraryUri) == null) {
            str = "\"\"";
        } else {
            str = dartEntrypointLibraryUri + ", and sending initial route: " + initialRoute;
        }
        Log.v(TAG, str);
        this.flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
        String appBundlePath = this.host.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
        }
        this.flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypointLibraryUri == null ? new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName()) : new DartExecutor.DartEntrypoint(appBundlePath, dartEntrypointLibraryUri, this.host.getDartEntrypointFunctionName()), this.host.getDartEntrypointArgs());
    }

    private void ensureAlive() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47862, new Class[0], Void.TYPE).isSupported && this.host == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String maybeGetInitialRouteFromIntent(Intent intent) {
        Uri data;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 47845, new Class[]{Intent.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!this.host.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    public void detachFromFlutterEngine() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47854, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.host.shouldDestroyEngineWithHost()) {
            this.host.detachFromFlutterEngine();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.host + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    @n0
    public Activity getAppComponent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47838, new Class[0], Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        Activity activity = this.host.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, java.lang.Object] */
    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    @n0
    public /* bridge */ /* synthetic */ Activity getAppComponent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47863, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : getAppComponent();
    }

    @p0
    FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    boolean isAttached() {
        return this.isAttached;
    }

    boolean isFlutterEngineFromHost() {
        return this.isFlutterEngineFromHost;
    }

    void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47859, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Log.v(TAG, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
        this.flutterEngine.getActivityControlSurface().onActivityResult(i10, i11, intent);
    }

    void onAttach(@n0 Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47837, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        if (this.flutterEngine == null) {
            setUpFlutterEngine();
        }
        if (this.host.shouldAttachEngineToActivity()) {
            Log.v(TAG, "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.flutterEngine.getActivityControlSurface().attachToActivity(this, this.host.getLifecycle());
        }
        Host host = this.host;
        this.platformPlugin = host.providePlatformPlugin(host.getActivity(), this.flutterEngine);
        this.host.configureFlutterEngine(this.flutterEngine);
        this.isAttached = true;
    }

    void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47856, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            Log.v(TAG, "Forwarding onBackPressed() to FlutterEngine.");
            this.flutterEngine.getNavigationChannel().popRoute();
        }
    }

    @n0
    View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle, int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47841, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class, Integer.TYPE, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Log.v(TAG, "Creating FlutterView.");
        ensureAlive();
        if (this.host.getRenderMode() == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(this.host.getContext(), this.host.getTransparencyMode() == TransparencyMode.transparent);
            this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView(this.host.getContext());
            flutterTextureView.setOpaque(this.host.getTransparencyMode() == TransparencyMode.opaque);
            this.host.onFlutterTextureViewCreated(flutterTextureView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterTextureView);
        }
        this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        if (this.host.attachToEngineAutomatically()) {
            Log.v(TAG, "Attaching FlutterEngine to FlutterView.");
            this.flutterView.attachToFlutterEngine(this.flutterEngine);
        }
        this.flutterView.setId(i10);
        if (z10) {
            delayFirstAndroidViewDraw(this.flutterView);
        }
        return this.flutterView;
    }

    void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47852, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onDestroyView()");
        ensureAlive();
        if (this.activePreDrawListener != null) {
            this.flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            this.activePreDrawListener = null;
        }
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.detachFromFlutterEngine();
            this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        }
    }

    void onDetach() {
        FlutterEngine flutterEngine;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47855, new Class[0], Void.TYPE).isSupported && this.isAttached) {
            Log.v(TAG, "onDetach()");
            ensureAlive();
            this.host.cleanUpFlutterEngine(this.flutterEngine);
            if (this.host.shouldAttachEngineToActivity()) {
                Log.v(TAG, "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.host.getActivity().isChangingConfigurations()) {
                    this.flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
                } else {
                    this.flutterEngine.getActivityControlSurface().detachFromActivity();
                }
            }
            PlatformPlugin platformPlugin = this.platformPlugin;
            if (platformPlugin != null) {
                platformPlugin.destroy();
                this.platformPlugin = null;
            }
            if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
                flutterEngine.getLifecycleChannel().appIsDetached();
            }
            if (this.host.shouldDestroyEngineWithHost()) {
                this.flutterEngine.destroy();
                if (this.host.getCachedEngineId() != null) {
                    FlutterEngineCache.getInstance().remove(this.host.getCachedEngineId());
                }
                this.flutterEngine = null;
            }
            this.isAttached = false;
        }
    }

    void onNewIntent(@n0 Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 47858, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Log.v(TAG, "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.flutterEngine.getActivityControlSurface().onNewIntent(intent);
        String strMaybeGetInitialRouteFromIntent = maybeGetInitialRouteFromIntent(intent);
        if (strMaybeGetInitialRouteFromIntent == null || strMaybeGetInitialRouteFromIntent.isEmpty()) {
            return;
        }
        this.flutterEngine.getNavigationChannel().pushRouteInformation(strMaybeGetInitialRouteFromIntent);
    }

    void onPause() {
        FlutterEngine flutterEngine;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47850, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onPause()");
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.getLifecycleChannel().appIsInactive();
    }

    void onPostResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47848, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onPostResume()");
        ensureAlive();
        if (this.flutterEngine != null) {
            updateSystemUiOverlays();
        } else {
            Log.w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), strArr, iArr}, this, changeQuickRedirect, false, 47857, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Log.v(TAG, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i10, strArr, iArr);
    }

    void onRestoreInstanceState(@p0 Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 47842, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        ensureAlive();
        byte[] byteArray = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle(PLUGINS_RESTORATION_BUNDLE_KEY);
            byteArray = bundle.getByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY);
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.host.shouldRestoreAndSaveState()) {
            this.flutterEngine.getRestorationChannel().setRestorationData(byteArray);
        }
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().onRestoreInstanceState(bundle2);
        }
    }

    void onResume() {
        FlutterEngine flutterEngine;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47847, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onResume()");
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.getLifecycleChannel().appIsResumed();
    }

    void onSaveInstanceState(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 47853, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        ensureAlive();
        if (this.host.shouldRestoreAndSaveState()) {
            bundle.putByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY, this.flutterEngine.getRestorationChannel().getRestorationData());
        }
        if (this.host.shouldAttachEngineToActivity()) {
            Bundle bundle2 = new Bundle();
            this.flutterEngine.getActivityControlSurface().onSaveInstanceState(bundle2);
            bundle.putBundle(PLUGINS_RESTORATION_BUNDLE_KEY, bundle2);
        }
    }

    void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47843, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onStart()");
        ensureAlive();
        doInitialFlutterViewRun();
        Integer num = this.previousVisibility;
        if (num != null) {
            this.flutterView.setVisibility(num.intValue());
        }
    }

    void onStop() {
        FlutterEngine flutterEngine;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47851, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "onStop()");
        ensureAlive();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
            flutterEngine.getLifecycleChannel().appIsPaused();
        }
        this.previousVisibility = Integer.valueOf(this.flutterView.getVisibility());
    }

    void onTrimMemory(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47861, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            if (this.isFirstFrameRendered && i10 >= 10) {
                flutterEngine.getDartExecutor().notifyLowMemoryWarning();
                this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
            }
            this.flutterEngine.getRenderer().onTrimMemory(i10);
        }
    }

    void onUserLeaveHint() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47860, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            Log.v(TAG, "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.flutterEngine.getActivityControlSurface().onUserLeaveHint();
        }
    }

    void release() {
        this.host = null;
        this.flutterEngine = null;
        this.flutterView = null;
        this.platformPlugin = null;
    }

    @j1
    void setUpFlutterEngine() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47840, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(TAG, "Setting up FlutterEngine.");
        String cachedEngineId = this.host.getCachedEngineId();
        if (cachedEngineId != null) {
            FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(cachedEngineId);
            this.flutterEngine = flutterEngine;
            this.isFlutterEngineFromHost = true;
            if (flutterEngine != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + cachedEngineId + "'");
        }
        Host host = this.host;
        FlutterEngine flutterEngineProvideFlutterEngine = host.provideFlutterEngine(host.getContext());
        this.flutterEngine = flutterEngineProvideFlutterEngine;
        if (flutterEngineProvideFlutterEngine != null) {
            this.isFlutterEngineFromHost = true;
            return;
        }
        String cachedEngineGroupId = this.host.getCachedEngineGroupId();
        if (cachedEngineGroupId == null) {
            Log.v(TAG, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            FlutterEngineGroup flutterEngineGroup = this.engineGroup;
            if (flutterEngineGroup == null) {
                flutterEngineGroup = new FlutterEngineGroup(this.host.getContext(), this.host.getFlutterShellArgs().toArray());
            }
            this.flutterEngine = flutterEngineGroup.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext()).setAutomaticallyRegisterPlugins(false).setWaitForRestorationData(this.host.shouldRestoreAndSaveState())));
            this.isFlutterEngineFromHost = false;
            return;
        }
        FlutterEngineGroup flutterEngineGroup2 = FlutterEngineGroupCache.getInstance().get(cachedEngineGroupId);
        if (flutterEngineGroup2 != null) {
            this.flutterEngine = flutterEngineGroup2.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext())));
            this.isFlutterEngineFromHost = false;
        } else {
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + cachedEngineGroupId + "'");
        }
    }

    void updateSystemUiOverlays() {
        PlatformPlugin platformPlugin;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47849, new Class[0], Void.TYPE).isSupported || (platformPlugin = this.platformPlugin) == null) {
            return;
        }
        platformPlugin.updateSystemUiOverlays();
    }
}
