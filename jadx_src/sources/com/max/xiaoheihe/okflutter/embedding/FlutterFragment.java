package com.max.xiaoheihe.okflutter.embedding;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.o;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.flutter.Log;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.android.FlutterEngineConfigurator;
import io.flutter.embedding.android.FlutterEngineProvider;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.e;
import io.flutter.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FlutterFragment extends Fragment implements FlutterActivityAndFragmentDelegate.Host, ComponentCallbacks2, FlutterActivityAndFragmentDelegate.DelegateFactory {
    protected static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
    protected static final String ARG_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
    protected static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
    protected static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
    protected static final String ARG_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
    protected static final String ARG_DART_ENTRYPOINT_URI = "dart_entrypoint_uri";
    protected static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
    protected static final String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    protected static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
    protected static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
    protected static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
    protected static final String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
    protected static final String ARG_INITIAL_ROUTE = "initial_route";
    protected static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
    protected static final String ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED = "should_automatically_handle_on_back_pressed";
    protected static final String ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW = "should_delay_first_android_view_draw";
    public static final int FLUTTER_VIEW_ID = ViewUtils.generateViewId(61938);
    private static final String TAG = "FlutterFragment";
    public static ChangeQuickRedirect changeQuickRedirect;

    @j1
    @p0
    FlutterActivityAndFragmentDelegate delegate;

    @n0
    private FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory = this;
    private final o onBackPressedCallback = new o(true) { // from class: com.max.xiaoheihe.okflutter.embedding.FlutterFragment.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47920, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FlutterFragment.this.onBackPressed();
        }
    };

    public @interface ActivityCallThrough {
    }

    public static class CachedEngineFragmentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean destroyEngineWithFragment;
        private final String engineId;
        private final Class<? extends FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private TransparencyMode transparencyMode;

        public CachedEngineFragmentBuilder(@n0 Class<? extends FlutterFragment> cls, @n0 String str) {
            this.destroyEngineWithFragment = false;
            this.handleDeeplinking = false;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
            this.engineId = str;
        }

        private CachedEngineFragmentBuilder(@n0 String str) {
            this((Class<? extends FlutterFragment>) FlutterFragment.class, str);
        }

        @n0
        public <T extends FlutterFragment> T build() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47923, new Class[0], FlutterFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            try {
                T t10 = (T) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e10);
            }
        }

        @n0
        public Bundle createArgs() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47922, new Class[0], Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_id", this.engineId);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, this.destroyEngineWithFragment);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            RenderMode renderMode = this.renderMode;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        @n0
        public CachedEngineFragmentBuilder destroyEngineWithFragment(boolean z10) {
            this.destroyEngineWithFragment = z10;
            return this;
        }

        @n0
        public CachedEngineFragmentBuilder handleDeeplinking(@n0 Boolean bool) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 47921, new Class[]{Boolean.class}, CachedEngineFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (CachedEngineFragmentBuilder) patchProxyResultProxy.result;
            }
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        @n0
        public CachedEngineFragmentBuilder renderMode(@n0 RenderMode renderMode) {
            this.renderMode = renderMode;
            return this;
        }

        @n0
        public CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean z10) {
            this.shouldAttachEngineToActivity = z10;
            return this;
        }

        @n0
        public CachedEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z10) {
            this.shouldAutomaticallyHandleOnBackPressed = z10;
            return this;
        }

        @n0
        public CachedEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(@n0 boolean z10) {
            this.shouldDelayFirstAndroidViewDraw = z10;
            return this;
        }

        @n0
        public CachedEngineFragmentBuilder transparencyMode(@n0 TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }
    }

    public static class NewEngineFragmentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String appBundlePath;
        private String dartEntrypoint;
        private List<String> dartEntrypointArgs;
        private String dartLibraryUri;
        private final Class<? extends FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private String initialRoute;
        private RenderMode renderMode;
        private FlutterShellArgs shellArgs;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private TransparencyMode transparencyMode;

        public NewEngineFragmentBuilder() {
            this.dartEntrypoint = "main";
            this.dartLibraryUri = null;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = FlutterFragment.class;
        }

        public NewEngineFragmentBuilder(@n0 Class<? extends FlutterFragment> cls) {
            this.dartEntrypoint = "main";
            this.dartLibraryUri = null;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
        }

        @n0
        public NewEngineFragmentBuilder appBundlePath(@n0 String str) {
            this.appBundlePath = str;
            return this;
        }

        @n0
        public <T extends FlutterFragment> T build() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47926, new Class[0], FlutterFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            try {
                T t10 = (T) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e10);
            }
        }

        @n0
        public Bundle createArgs() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47925, new Class[0], Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            bundle.putString(FlutterFragment.ARG_APP_BUNDLE_PATH, this.appBundlePath);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT_URI, this.dartLibraryUri);
            bundle.putStringArrayList(FlutterFragment.ARG_DART_ENTRYPOINT_ARGS, this.dartEntrypointArgs != null ? new ArrayList<>(this.dartEntrypointArgs) : null);
            FlutterShellArgs flutterShellArgs = this.shellArgs;
            if (flutterShellArgs != null) {
                bundle.putStringArray(FlutterFragment.ARG_FLUTTER_INITIALIZATION_ARGS, flutterShellArgs.toArray());
            }
            RenderMode renderMode = this.renderMode;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        @n0
        public NewEngineFragmentBuilder dartEntrypoint(@n0 String str) {
            this.dartEntrypoint = str;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder dartEntrypointArgs(@n0 List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder dartLibraryUri(@n0 String str) {
            this.dartLibraryUri = str;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder flutterShellArgs(@n0 FlutterShellArgs flutterShellArgs) {
            this.shellArgs = flutterShellArgs;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder handleDeeplinking(@n0 Boolean bool) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 47924, new Class[]{Boolean.class}, NewEngineFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (NewEngineFragmentBuilder) patchProxyResultProxy.result;
            }
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        @n0
        public NewEngineFragmentBuilder initialRoute(@n0 String str) {
            this.initialRoute = str;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder renderMode(@n0 RenderMode renderMode) {
            this.renderMode = renderMode;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean z10) {
            this.shouldAttachEngineToActivity = z10;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z10) {
            this.shouldAutomaticallyHandleOnBackPressed = z10;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z10) {
            this.shouldDelayFirstAndroidViewDraw = z10;
            return this;
        }

        @n0
        public NewEngineFragmentBuilder transparencyMode(@n0 TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }
    }

    public static class NewEngineInGroupFragmentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String cachedEngineGroupId;

        @n0
        private String dartEntrypoint;
        private final Class<? extends FlutterFragment> fragmentClass;

        @n0
        private boolean handleDeeplinking;

        @n0
        private String initialRoute;

        @n0
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;

        @n0
        private TransparencyMode transparencyMode;

        public NewEngineInGroupFragmentBuilder(@n0 Class<? extends FlutterFragment> cls, @n0 String str) {
            this.dartEntrypoint = "main";
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
            this.cachedEngineGroupId = str;
        }

        public NewEngineInGroupFragmentBuilder(@n0 String str) {
            this(FlutterFragment.class, str);
        }

        @n0
        public <T extends FlutterFragment> T build() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47928, new Class[0], FlutterFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            try {
                T t10 = (T) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e10);
            }
        }

        @n0
        public Bundle createArgs() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47927, new Class[0], Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(FlutterFragment.ARG_CACHED_ENGINE_GROUP_ID, this.cachedEngineGroupId);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
            bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            RenderMode renderMode = this.renderMode;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        @n0
        public NewEngineInGroupFragmentBuilder dartEntrypoint(@n0 String str) {
            this.dartEntrypoint = str;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder handleDeeplinking(@n0 boolean z10) {
            this.handleDeeplinking = z10;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder initialRoute(@n0 String str) {
            this.initialRoute = str;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder renderMode(@n0 RenderMode renderMode) {
            this.renderMode = renderMode;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder shouldAttachEngineToActivity(boolean z10) {
            this.shouldAttachEngineToActivity = z10;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z10) {
            this.shouldAutomaticallyHandleOnBackPressed = z10;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder shouldDelayFirstAndroidViewDraw(@n0 boolean z10) {
            this.shouldDelayFirstAndroidViewDraw = z10;
            return this;
        }

        @n0
        public NewEngineInGroupFragmentBuilder transparencyMode(@n0 TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }
    }

    public FlutterFragment() {
        setArguments(new Bundle());
    }

    @n0
    public static FlutterFragment createDefault() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47869, new Class[0], FlutterFragment.class);
        return patchProxyResultProxy.isSupported ? (FlutterFragment) patchProxyResultProxy.result : new NewEngineFragmentBuilder().build();
    }

    private boolean stillAttachedForEvent(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47918, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate == null) {
            Log.w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (flutterActivityAndFragmentDelegate.isAttached()) {
            return true;
        }
        Log.w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @n0
    public static CachedEngineFragmentBuilder withCachedEngine(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47871, new Class[]{String.class}, CachedEngineFragmentBuilder.class);
        return patchProxyResultProxy.isSupported ? (CachedEngineFragmentBuilder) patchProxyResultProxy.result : new CachedEngineFragmentBuilder(str);
    }

    @n0
    public static NewEngineFragmentBuilder withNewEngine() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47870, new Class[0], NewEngineFragmentBuilder.class);
        return patchProxyResultProxy.isSupported ? (NewEngineFragmentBuilder) patchProxyResultProxy.result : new NewEngineFragmentBuilder();
    }

    @n0
    public static NewEngineInGroupFragmentBuilder withNewEngineInGroup(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47872, new Class[]{String.class}, NewEngineInGroupFragmentBuilder.class);
        return patchProxyResultProxy.isSupported ? (NewEngineInGroupFragmentBuilder) patchProxyResultProxy.result : new NewEngineInGroupFragmentBuilder(str);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(@n0 FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 47909, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).cleanUpFlutterEngine(flutterEngine);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@n0 FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 47908, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).configureFlutterEngine(flutterEngine);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.DelegateFactory
    public FlutterActivityAndFragmentDelegate createDelegate(FlutterActivityAndFragmentDelegate.Host host) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{host}, this, changeQuickRedirect, false, 47873, new Class[]{FlutterActivityAndFragmentDelegate.Host.class}, FlutterActivityAndFragmentDelegate.class);
        return patchProxyResultProxy.isSupported ? (FlutterActivityAndFragmentDelegate) patchProxyResultProxy.result : new FlutterActivityAndFragmentDelegate(host);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public void detachFromFlutterEngine() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47885, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.w(TAG, "FlutterFragment " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public /* bridge */ /* synthetic */ Activity getActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47919, new Class[0], Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : super.getActivity();
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @n0
    public String getAppBundlePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47901, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getArguments().getString(ARG_APP_BUNDLE_PATH);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getCachedEngineGroupId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47895, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getArguments().getString(ARG_CACHED_ENGINE_GROUP_ID, null);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getCachedEngineId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47894, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getArguments().getString("cached_engine_id", null);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public List<String> getDartEntrypointArgs() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47899, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : getArguments().getStringArrayList(ARG_DART_ENTRYPOINT_ARGS);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @n0
    public String getDartEntrypointFunctionName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47898, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getArguments().getString(ARG_DART_ENTRYPOINT, "main");
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getDartEntrypointLibraryUri() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47900, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getArguments().getString(ARG_DART_ENTRYPOINT_URI);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public ExclusiveAppComponent<Activity> getExclusiveAppComponent() {
        return this.delegate;
    }

    @p0
    public FlutterEngine getFlutterEngine() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47906, new Class[0], FlutterEngine.class);
        return patchProxyResultProxy.isSupported ? (FlutterEngine) patchProxyResultProxy.result : this.delegate.getFlutterEngine();
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @n0
    public FlutterShellArgs getFlutterShellArgs() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47893, new Class[0], FlutterShellArgs.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterShellArgs) patchProxyResultProxy.result;
        }
        String[] stringArray = getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return new FlutterShellArgs(stringArray);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getInitialRoute() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47902, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getArguments().getString(ARG_INITIAL_ROUTE);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @n0
    public RenderMode getRenderMode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47903, new Class[0], RenderMode.class);
        return patchProxyResultProxy.isSupported ? (RenderMode) patchProxyResultProxy.result : RenderMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, RenderMode.surface.name()));
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @n0
    public TransparencyMode getTransparencyMode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47904, new Class[0], TransparencyMode.class);
        return patchProxyResultProxy.isSupported ? (TransparencyMode) patchProxyResultProxy.result : TransparencyMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, TransparencyMode.transparent.name()));
    }

    boolean isFlutterEngineInjected() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47896, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.delegate.isFlutterEngineFromHost();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47890, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported && stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@n0 Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47875, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegateCreateDelegate = this.delegateFactory.createDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegateCreateDelegate;
        flutterActivityAndFragmentDelegateCreateDelegate.onAttach(context);
        if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
            requireActivity().getOnBackPressedDispatcher().c(this, this.onBackPressedCallback);
        }
        context.registerComponentCallbacks(this);
    }

    @ActivityCallThrough
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47889, new Class[0], Void.TYPE).isSupported && stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 47876, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.delegate.onRestoreInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 47877, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        if (stillAttachedForEvent("onDestroyView")) {
            this.delegate.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47886, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDetach();
            this.delegate.release();
            this.delegate = null;
        } else {
            Log.v(TAG, "FlutterFragment " + this + " onDetach called after release.");
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterSurfaceViewCreated(@n0 FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterTextureViewCreated(@n0 FlutterTextureView flutterTextureView) {
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiDisplayed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47912, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiDisplayed();
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiNoLongerDisplayed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47913, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    @ActivityCallThrough
    public void onNewIntent(@n0 Intent intent) {
        if (!PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 47888, new Class[]{Intent.class}, Void.TYPE).isSupported && stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
    }

    @ActivityCallThrough
    public void onPostResume() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47880, new Class[0], Void.TYPE).isSupported && stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @ActivityCallThrough
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10), strArr, iArr}, this, changeQuickRedirect, false, 47887, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE).isSupported && stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47879, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 47884, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47892, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i10);
        }
    }

    @ActivityCallThrough
    public void onUserLeaveHint() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47891, new Class[0], Void.TYPE).isSupported && stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public boolean popSystemNavigator() {
        FragmentActivity activity;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47916, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false) || (activity = getActivity()) == null) {
            return false;
        }
        this.onBackPressedCallback.setEnabled(false);
        activity.getOnBackPressedDispatcher().f();
        this.onBackPressedCallback.setEnabled(true);
        return true;
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    @p0
    public FlutterEngine provideFlutterEngine(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47905, new Class[]{Context.class}, FlutterEngine.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngine) patchProxyResultProxy.result;
        }
        LayoutInflater.Factory activity = getActivity();
        if (!(activity instanceof FlutterEngineProvider)) {
            return null;
        }
        Log.v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
        return ((FlutterEngineProvider) activity).provideFlutterEngine(getContext());
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @p0
    public PlatformPlugin providePlatformPlugin(@p0 Activity activity, @n0 FlutterEngine flutterEngine) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, flutterEngine}, this, changeQuickRedirect, false, 47907, new Class[]{Activity.class, FlutterEngine.class}, PlatformPlugin.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformPlugin) patchProxyResultProxy.result;
        }
        if (activity != null) {
            return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
        }
        return null;
    }

    @j1
    void setDelegateFactory(@n0 FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory) {
        if (PatchProxy.proxy(new Object[]{delegateFactory}, this, changeQuickRedirect, false, 47874, new Class[]{FlutterActivityAndFragmentDelegate.DelegateFactory.class}, Void.TYPE).isSupported) {
            return;
        }
        this.delegateFactory = delegateFactory;
        this.delegate = delegateFactory.createDelegate(this);
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public /* synthetic */ void setFrameworkHandlesBack(boolean z10) {
        e.a(this, z10);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldAttachEngineToActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47910, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
    }

    @j1
    @n0
    boolean shouldDelayFirstAndroidViewDraw() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47917, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getArguments().getBoolean(ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47897, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean z10 = getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? z10 : getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldHandleDeeplinking() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47911, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getArguments().getBoolean(ARG_HANDLE_DEEPLINKING);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47914, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (getArguments().containsKey("enable_state_restoration")) {
            return getArguments().getBoolean("enable_state_restoration");
        }
        return getCachedEngineId() == null;
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public void updateSystemUiOverlays() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47915, new Class[0], Void.TYPE).isSupported || (flutterActivityAndFragmentDelegate = this.delegate) == null) {
            return;
        }
        flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
    }
}
