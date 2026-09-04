package io.flutter.embedding.android;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.o;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
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
    public static final int FLUTTER_VIEW_ID = View.generateViewId();
    private static final String TAG = "FlutterFragment";

    @j1
    @p0
    FlutterActivityAndFragmentDelegate delegate;
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.flutter.embedding.android.FlutterFragment.1
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z10) {
            if (FlutterFragment.this.stillAttachedForEvent("onWindowFocusChanged")) {
                FlutterFragment.this.delegate.onWindowFocusChanged(z10);
            }
        }
    };

    @n0
    private FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory = this;
    private final o onBackPressedCallback = new o(true) { // from class: io.flutter.embedding.android.FlutterFragment.2
        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            FlutterFragment.this.onBackPressed();
        }
    };

    public @interface ActivityCallThrough {
    }

    public static class CachedEngineFragmentBuilder {
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
        protected Bundle createArgs() {
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
        protected Bundle createArgs() {
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
        protected Bundle createArgs() {
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
        return new NewEngineFragmentBuilder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean stillAttachedForEvent(String str) {
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
        return new CachedEngineFragmentBuilder(str);
    }

    @n0
    public static NewEngineFragmentBuilder withNewEngine() {
        return new NewEngineFragmentBuilder();
    }

    @n0
    public static NewEngineInGroupFragmentBuilder withNewEngineInGroup(@n0 String str) {
        return new NewEngineInGroupFragmentBuilder(str);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(@n0 FlutterEngine flutterEngine) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).cleanUpFlutterEngine(flutterEngine);
        }
    }

    public void configureFlutterEngine(@n0 FlutterEngine flutterEngine) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).configureFlutterEngine(flutterEngine);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.DelegateFactory
    public FlutterActivityAndFragmentDelegate createDelegate(FlutterActivityAndFragmentDelegate.Host host) {
        return new FlutterActivityAndFragmentDelegate(host);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void detachFromFlutterEngine() {
        Log.w(TAG, "FlutterFragment " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public String getAppBundlePath() {
        return getArguments().getString(ARG_APP_BUNDLE_PATH);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getCachedEngineGroupId() {
        return getArguments().getString(ARG_CACHED_ENGINE_GROUP_ID, null);
    }

    @p0
    public String getCachedEngineId() {
        return getArguments().getString("cached_engine_id", null);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public List<String> getDartEntrypointArgs() {
        return getArguments().getStringArrayList(ARG_DART_ENTRYPOINT_ARGS);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public String getDartEntrypointFunctionName() {
        return getArguments().getString(ARG_DART_ENTRYPOINT, "main");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getDartEntrypointLibraryUri() {
        return getArguments().getString(ARG_DART_ENTRYPOINT_URI);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public ExclusiveAppComponent<Activity> getExclusiveAppComponent() {
        return this.delegate;
    }

    @p0
    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public FlutterShellArgs getFlutterShellArgs() {
        String[] stringArray = getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return new FlutterShellArgs(stringArray);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public String getInitialRoute() {
        return getArguments().getString(ARG_INITIAL_ROUTE);
    }

    @n0
    public RenderMode getRenderMode() {
        return RenderMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, RenderMode.surface.name()));
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @n0
    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, TransparencyMode.transparent.name()));
    }

    boolean isFlutterEngineInjected() {
        return this.delegate.isFlutterEngineFromHost();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@n0 Context context) {
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
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        this.delegate.onRestoreInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        return this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        if (stillAttachedForEvent("onDestroyView")) {
            this.delegate.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
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

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterSurfaceViewCreated(@n0 FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterTextureViewCreated(@n0 FlutterTextureView flutterTextureView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiDisplayed() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiDisplayed();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiNoLongerDisplayed() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    @ActivityCallThrough
    public void onNewIntent(@n0 Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
    }

    @ActivityCallThrough
    public void onPostResume() {
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @ActivityCallThrough
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i10);
        }
    }

    @ActivityCallThrough
    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public boolean popSystemNavigator() {
        FragmentActivity activity;
        if (!getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false) || (activity = getActivity()) == null) {
            return false;
        }
        this.onBackPressedCallback.setEnabled(false);
        activity.getOnBackPressedDispatcher().f();
        this.onBackPressedCallback.setEnabled(true);
        return true;
    }

    @p0
    public FlutterEngine provideFlutterEngine(@n0 Context context) {
        LayoutInflater.Factory activity = getActivity();
        if (!(activity instanceof FlutterEngineProvider)) {
            return null;
        }
        Log.v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
        return ((FlutterEngineProvider) activity).provideFlutterEngine(getContext());
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @p0
    public PlatformPlugin providePlatformPlugin(@p0 Activity activity, @n0 FlutterEngine flutterEngine) {
        if (activity != null) {
            return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
        }
        return null;
    }

    @j1
    void setDelegateFactory(@n0 FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory) {
        this.delegateFactory = delegateFactory;
        this.delegate = delegateFactory.createDelegate(this);
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public /* synthetic */ void setFrameworkHandlesBack(boolean z10) {
        io.flutter.plugin.platform.e.a(this, z10);
    }

    public boolean shouldAttachEngineToActivity() {
        return getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
    }

    @j1
    @n0
    boolean shouldDelayFirstAndroidViewDraw() {
        return getArguments().getBoolean(ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW);
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean z10 = getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? z10 : getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldHandleDeeplinking() {
        return getArguments().getBoolean(ARG_HANDLE_DEEPLINKING);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        if (getArguments().containsKey("enable_state_restoration")) {
            return getArguments().getBoolean("enable_state_restoration");
        }
        return getCachedEngineId() == null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void updateSystemUiOverlays() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }
}
