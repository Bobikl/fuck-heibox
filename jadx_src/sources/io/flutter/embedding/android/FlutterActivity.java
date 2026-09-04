package io.flutter.embedding.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.y;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterActivity extends Activity implements FlutterActivityAndFragmentDelegate.Host, y {
    public static final int FLUTTER_VIEW_ID = View.generateViewId();
    private static final String TAG = "FlutterActivity";

    @j1
    protected FlutterActivityAndFragmentDelegate delegate;
    private boolean hasRegisteredBackCallback = false;

    @n0
    private a0 lifecycle;
    private final OnBackInvokedCallback onBackInvokedCallback;

    public static class CachedEngineIntentBuilder {
        private final Class<? extends FlutterActivity> activityClass;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public CachedEngineIntentBuilder(@n0 Class<? extends FlutterActivity> cls, @n0 String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        @n0
        public CachedEngineIntentBuilder backgroundMode(@n0 FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        @n0
        public Intent build(@n0 Context context) {
            return new Intent(context, this.activityClass).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_CACHED_ENGINE_ID, this.cachedEngineId).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, this.destroyEngineWithActivity).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE, this.backgroundMode);
        }

        public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z10) {
            this.destroyEngineWithActivity = z10;
            return this;
        }
    }

    public static class NewEngineInGroupIntentBuilder {
        private final Class<? extends FlutterActivity> activityClass;
        private final String cachedEngineGroupId;
        private String dartEntrypoint = "main";
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineInGroupIntentBuilder(@n0 Class<? extends FlutterActivity> cls, @n0 String str) {
            this.activityClass = cls;
            this.cachedEngineGroupId = str;
        }

        @n0
        public NewEngineInGroupIntentBuilder backgroundMode(@n0 FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        @n0
        public Intent build(@n0 Context context) {
            return new Intent(context, this.activityClass).putExtra("dart_entrypoint", this.dartEntrypoint).putExtra("route", this.initialRoute).putExtra("cached_engine_group_id", this.cachedEngineGroupId).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE, this.backgroundMode).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, true);
        }

        @n0
        public NewEngineInGroupIntentBuilder dartEntrypoint(@n0 String str) {
            this.dartEntrypoint = str;
            return this;
        }

        @n0
        public NewEngineInGroupIntentBuilder initialRoute(@n0 String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public static class NewEngineIntentBuilder {
        private final Class<? extends FlutterActivity> activityClass;

        @p0
        private List<String> dartEntrypointArgs;
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineIntentBuilder(@n0 Class<? extends FlutterActivity> cls) {
            this.activityClass = cls;
        }

        @n0
        public NewEngineIntentBuilder backgroundMode(@n0 FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        @n0
        public Intent build(@n0 Context context) {
            Intent intentPutExtra = new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE, this.backgroundMode).putExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, true);
            if (this.dartEntrypointArgs != null) {
                intentPutExtra.putExtra("dart_entrypoint_args", new ArrayList(this.dartEntrypointArgs));
            }
            return intentPutExtra;
        }

        @n0
        public NewEngineIntentBuilder dartEntrypointArgs(@p0 List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        @n0
        public NewEngineIntentBuilder initialRoute(@n0 String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public FlutterActivity() {
        this.onBackInvokedCallback = Build.VERSION.SDK_INT < 33 ? null : createOnBackInvokedCallback();
        this.lifecycle = new a0(this);
    }

    private void configureStatusBarForFullscreenFlutterExperience() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @n0
    public static Intent createDefaultIntent(@n0 Context context) {
        return withNewEngine().build(context);
    }

    @n0
    private View createFlutterView() {
        return this.delegate.onCreateView(null, null, null, FLUTTER_VIEW_ID, getRenderMode() == RenderMode.surface);
    }

    @n0
    @w0(33)
    @TargetApi(33)
    private OnBackInvokedCallback createOnBackInvokedCallback() {
        return Build.VERSION.SDK_INT >= 34 ? new OnBackAnimationCallback() { // from class: io.flutter.embedding.android.FlutterActivity.1
            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                FlutterActivity.this.cancelBackGesture();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                FlutterActivity.this.commitBackGesture();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(@n0 BackEvent backEvent) {
                FlutterActivity.this.updateBackGestureProgress(backEvent);
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(@n0 BackEvent backEvent) {
                FlutterActivity.this.startBackGesture(backEvent);
            }
        } : new OnBackInvokedCallback() { // from class: io.flutter.embedding.android.a
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.f119409a.onBackPressed();
            }
        };
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean stillAttachedForEvent(String str) {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate == null) {
            Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (flutterActivityAndFragmentDelegate.isAttached()) {
            return true;
        }
        Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    private void switchLaunchThemeForNormalTheme() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                int i10 = metaData.getInt(com.max.xiaoheihe.okflutter.embedding.FlutterActivityLaunchConfigs.NORMAL_THEME_META_DATA_KEY, -1);
                if (i10 != -1) {
                    setTheme(i10);
                }
            } else {
                Log.v(TAG, "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public static CachedEngineIntentBuilder withCachedEngine(@n0 String str) {
        return new CachedEngineIntentBuilder(FlutterActivity.class, str);
    }

    @n0
    public static NewEngineIntentBuilder withNewEngine() {
        return new NewEngineIntentBuilder(FlutterActivity.class);
    }

    public static NewEngineInGroupIntentBuilder withNewEngineInGroup(@n0 String str) {
        return new NewEngineInGroupIntentBuilder(FlutterActivity.class, str);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean attachToEngineAutomatically() {
        return true;
    }

    @w0(34)
    @TargetApi(34)
    public void cancelBackGesture() {
        if (stillAttachedForEvent("cancelBackGesture")) {
            this.delegate.cancelBackGesture();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(@n0 FlutterEngine flutterEngine) {
    }

    @w0(34)
    @TargetApi(34)
    public void commitBackGesture() {
        if (stillAttachedForEvent("commitBackGesture")) {
            this.delegate.commitBackGesture();
        }
    }

    public void configureFlutterEngine(@n0 FlutterEngine flutterEngine) {
        if (this.delegate.isFlutterEngineFromHost()) {
            return;
        }
        GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void detachFromFlutterEngine() {
        Log.w(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public Activity getActivity() {
        return this;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public String getAppBundlePath() {
        String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @n0
    protected FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE) ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE)) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @p0
    public String getCachedEngineId() {
        return getIntent().getStringExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_CACHED_ENGINE_ID);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public String getDartEntrypointFunctionName() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle metaData = getMetaData();
            String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getDartEntrypointLibraryUri() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public ExclusiveAppComponent<Activity> getExclusiveAppComponent() {
        return this.delegate;
    }

    @p0
    protected FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public FlutterShellArgs getFlutterShellArgs() {
        return FlutterShellArgs.fromIntent(getIntent());
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, androidx.lifecycle.y
    @n0
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @p0
    protected Bundle getMetaData() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @j1
    protected OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@p0 Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new FlutterActivityAndFragmentDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegate;
        flutterActivityAndFragmentDelegate.onAttach(this);
        this.delegate.onRestoreInstanceState(bundle);
        this.lifecycle.l(Lifecycle.Event.ON_CREATE);
        configureWindowForTransparency();
        setContentView(createFlutterView());
        configureStatusBarForFullscreenFlutterExperience();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (stillAttachedForEvent("onDestroy")) {
            this.delegate.onDestroyView();
            this.delegate.onDetach();
        }
        release();
        this.lifecycle.l(Lifecycle.Event.ON_DESTROY);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterSurfaceViewCreated(@n0 FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterTextureViewCreated(@n0 FlutterTextureView flutterTextureView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiDisplayed() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiNoLongerDisplayed() {
    }

    @Override // android.app.Activity
    protected void onNewIntent(@n0 Intent intent) {
        super.onNewIntent(intent);
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
        this.lifecycle.l(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.lifecycle.l(Lifecycle.Event.ON_RESUME);
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.lifecycle.l(Lifecycle.Event.ON_START);
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
        this.lifecycle.l(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i10);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (stillAttachedForEvent("onWindowFocusChanged")) {
            this.delegate.onWindowFocusChanged(z10);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public boolean popSystemNavigator() {
        return false;
    }

    @p0
    public FlutterEngine provideFlutterEngine(@n0 Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public PlatformPlugin providePlatformPlugin(@p0 Activity activity, @n0 FlutterEngine flutterEngine) {
        return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
    }

    @j1
    public void registerOnBackInvokedCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = true;
        }
    }

    @j1
    public void release() {
        unregisterOnBackInvokedCallback();
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.release();
            this.delegate = null;
        }
    }

    @j1
    void setDelegate(@n0 FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public void setFrameworkHandlesBack(boolean z10) {
        if (z10 && !this.hasRegisteredBackCallback) {
            registerOnBackInvokedCallback();
        } else {
            if (z10 || !this.hasRegisteredBackCallback) {
                return;
            }
            unregisterOnBackInvokedCallback();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = getIntent().getBooleanExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? booleanExtra : getIntent().getBooleanExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, true);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldHandleDeeplinking() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        if (getIntent().hasExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_ENABLE_STATE_RESTORATION)) {
            return getIntent().getBooleanExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_ENABLE_STATE_RESTORATION, false);
        }
        return getCachedEngineId() == null;
    }

    @w0(34)
    @TargetApi(34)
    public void startBackGesture(@n0 BackEvent backEvent) {
        if (stillAttachedForEvent("startBackGesture")) {
            this.delegate.startBackGesture(backEvent);
        }
    }

    @j1
    public void unregisterOnBackInvokedCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = false;
        }
    }

    @w0(34)
    @TargetApi(34)
    public void updateBackGestureProgress(@n0 BackEvent backEvent) {
        if (stillAttachedForEvent("updateBackGestureProgress")) {
            this.delegate.updateBackGestureProgress(backEvent);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void updateSystemUiOverlays() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }
}
