package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentActivity;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterFragmentActivity extends FragmentActivity implements FlutterEngineProvider, FlutterEngineConfigurator {
    public static final int FRAGMENT_CONTAINER_ID = View.generateViewId();
    private static final String TAG = "FlutterFragmentActivity";
    private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";

    @p0
    private FlutterFragment flutterFragment;

    public static class CachedEngineIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public CachedEngineIntentBuilder(@n0 Class<? extends FlutterFragmentActivity> cls, @n0 String str) {
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
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private final String cachedEngineGroupId;
        private String dartEntrypoint = "main";
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineInGroupIntentBuilder(@n0 Class<? extends FlutterFragmentActivity> cls, @n0 String str) {
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
        private final Class<? extends FlutterFragmentActivity> activityClass;

        @p0
        private List<String> dartEntrypointArgs;
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineIntentBuilder(@n0 Class<? extends FlutterFragmentActivity> cls) {
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
    private View createFragmentContainer() {
        FrameLayout frameLayoutProvideRootLayout = provideRootLayout(this);
        frameLayoutProvideRootLayout.setId(FRAGMENT_CONTAINER_ID);
        frameLayoutProvideRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayoutProvideRootLayout;
    }

    private void ensureFlutterFragmentCreated() {
        if (this.flutterFragment == null) {
            this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (this.flutterFragment == null) {
            this.flutterFragment = createFlutterFragment();
            getSupportFragmentManager().u().c(FRAGMENT_CONTAINER_ID, this.flutterFragment, TAG_FLUTTER_FRAGMENT).m();
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
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
            Log.e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    @n0
    public static CachedEngineIntentBuilder withCachedEngine(@n0 String str) {
        return new CachedEngineIntentBuilder(FlutterFragmentActivity.class, str);
    }

    @n0
    public static NewEngineIntentBuilder withNewEngine() {
        return new NewEngineIntentBuilder(FlutterFragmentActivity.class);
    }

    public static NewEngineInGroupIntentBuilder withNewEngineInGroup(@n0 String str) {
        return new NewEngineInGroupIntentBuilder(FlutterFragmentActivity.class, str);
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(@n0 FlutterEngine flutterEngine) {
    }

    public void configureFlutterEngine(@n0 FlutterEngine flutterEngine) {
        FlutterFragment flutterFragment = this.flutterFragment;
        if (flutterFragment == null || !flutterFragment.isFlutterEngineInjected()) {
            GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
        }
    }

    @n0
    protected FlutterFragment createFlutterFragment() {
        FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
        RenderMode renderMode = getRenderMode();
        TransparencyMode transparencyMode = backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
        boolean z10 = renderMode == RenderMode.surface;
        if (getCachedEngineId() != null) {
            Log.v(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + getCachedEngineId() + "\nWill destroy engine when Activity is destroyed: " + shouldDestroyEngineWithHost() + "\nBackground transparency mode: " + backgroundMode + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
            return FlutterFragment.withCachedEngine(getCachedEngineId()).renderMode(renderMode).transparencyMode(transparencyMode).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(z10).build();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating FlutterFragment with new engine:\nCached engine group ID: ");
        sb2.append(getCachedEngineGroupId());
        sb2.append("\nBackground transparency mode: ");
        sb2.append(backgroundMode);
        sb2.append("\nDart entrypoint: ");
        sb2.append(getDartEntrypointFunctionName());
        sb2.append("\nDart entrypoint library uri: ");
        sb2.append(getDartEntrypointLibraryUri() != null ? getDartEntrypointLibraryUri() : "\"\"");
        sb2.append("\nInitial route: ");
        sb2.append(getInitialRoute());
        sb2.append("\nApp bundle path: ");
        sb2.append(getAppBundlePath());
        sb2.append("\nWill attach FlutterEngine to Activity: ");
        sb2.append(shouldAttachEngineToActivity());
        Log.v(TAG, sb2.toString());
        return getCachedEngineGroupId() != null ? FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId()).dartEntrypoint(getDartEntrypointFunctionName()).initialRoute(getInitialRoute()).handleDeeplinking(shouldHandleDeeplinking()).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z10).build() : FlutterFragment.withNewEngine().dartEntrypoint(getDartEntrypointFunctionName()).dartLibraryUri(getDartEntrypointLibraryUri()).dartEntrypointArgs(getDartEntrypointArgs()).initialRoute(getInitialRoute()).appBundlePath(getAppBundlePath()).flutterShellArgs(FlutterShellArgs.fromIntent(getIntent())).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z10).build();
    }

    @n0
    protected String getAppBundlePath() {
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

    @p0
    protected String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @p0
    protected String getCachedEngineId() {
        return getIntent().getStringExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_CACHED_ENGINE_ID);
    }

    @p0
    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @n0
    public String getDartEntrypointFunctionName() {
        try {
            Bundle metaData = getMetaData();
            String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

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

    @p0
    protected FlutterEngine getFlutterEngine() {
        return this.flutterFragment.getFlutterEngine();
    }

    protected String getInitialRoute() {
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

    @p0
    protected Bundle getMetaData() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @n0
    protected RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.flutterFragment.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.flutterFragment.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@p0 Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        super.onCreate(bundle);
        configureWindowForTransparency();
        setContentView(createFragmentContainer());
        configureStatusBarForFullscreenFlutterExperience();
        ensureFlutterFragmentCreated();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(@n0 Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.flutterFragment.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        this.flutterFragment.onTrimMemory(i10);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @Override // io.flutter.embedding.android.FlutterEngineProvider
    @p0
    public FlutterEngine provideFlutterEngine(@n0 Context context) {
        return null;
    }

    @n0
    protected FrameLayout provideRootLayout(Context context) {
        return new FrameLayout(context);
    }

    @j1
    FlutterFragment retrieveExistingFlutterFragmentIfPossible() {
        return (FlutterFragment) getSupportFragmentManager().s0(TAG_FLUTTER_FRAGMENT);
    }

    protected boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        return getIntent().getBooleanExtra(com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, false);
    }

    @j1
    protected boolean shouldHandleDeeplinking() {
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
}
