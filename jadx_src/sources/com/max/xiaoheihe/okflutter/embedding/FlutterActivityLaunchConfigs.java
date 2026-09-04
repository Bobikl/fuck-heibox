package com.max.xiaoheihe.okflutter.embedding;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes13.dex */
public class FlutterActivityLaunchConfigs {
    static final String DART_ENTRYPOINT_META_DATA_KEY = "io.flutter.Entrypoint";
    static final String DART_ENTRYPOINT_URI_META_DATA_KEY = "io.flutter.EntrypointUri";
    static final String DEFAULT_BACKGROUND_MODE = BackgroundMode.opaque.name();
    static final String DEFAULT_DART_ENTRYPOINT = "main";
    static final String DEFAULT_INITIAL_ROUTE = "/";
    static final String EXTRA_BACKGROUND_MODE = "background_mode";
    static final String EXTRA_CACHED_ENGINE_ID = "cached_engine_id";
    static final String EXTRA_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
    static final String EXTRA_DESTROY_ENGINE_WITH_ACTIVITY = "destroy_engine_with_activity";
    static final String EXTRA_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    static final String EXTRA_INITIAL_ROUTE = "route";
    static final String HANDLE_DEEPLINKING_META_DATA_KEY = "flutter_deeplinking_enabled";
    static final String INITIAL_ROUTE_META_DATA_KEY = "io.flutter.InitialRoute";
    public static final String NORMAL_THEME_META_DATA_KEY = "io.flutter.embedding.android.NormalTheme";
    public static final String SPLASH_SCREEN_META_DATA_KEY = "io.flutter.embedding.android.SplashScreenDrawable";

    public enum BackgroundMode {
        opaque,
        transparent;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static BackgroundMode valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47868, new Class[]{String.class}, BackgroundMode.class);
            return patchProxyResultProxy.isSupported ? (BackgroundMode) patchProxyResultProxy.result : (BackgroundMode) Enum.valueOf(BackgroundMode.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static BackgroundMode[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47867, new Class[0], BackgroundMode[].class);
            return patchProxyResultProxy.isSupported ? (BackgroundMode[]) patchProxyResultProxy.result : (BackgroundMode[]) values().clone();
        }
    }

    private FlutterActivityLaunchConfigs() {
    }
}
