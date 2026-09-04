package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: WebViewFeature.java */
/* JADX INFO: loaded from: classes6.dex */
public class k0 {
    public static final String A = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";
    public static final String B = "CREATE_WEB_MESSAGE_CHANNEL";
    public static final String C = "POST_WEB_MESSAGE";
    public static final String D = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";
    public static final String E = "GET_WEB_VIEW_CLIENT";
    public static final String F = "GET_WEB_CHROME_CLIENT";
    public static final String G = "GET_WEB_VIEW_RENDERER";
    public static final String H = "WEB_VIEW_RENDERER_TERMINATE";
    public static final String I = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";
    public static final String J = "PROXY_OVERRIDE";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String K = "SUPPRESS_ERROR_PAGE";
    public static final String L = "MULTI_PROCESS";
    public static final String M = "FORCE_DARK";
    public static final String N = "FORCE_DARK_STRATEGY";
    public static final String O = "WEB_MESSAGE_LISTENER";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String P = "DOCUMENT_START_SCRIPT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28419a = "VISUAL_STATE_CALLBACK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28420b = "OFF_SCREEN_PRERASTER";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28421c = "SAFE_BROWSING_ENABLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28422d = "DISABLED_ACTION_MODE_MENU_ITEMS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28423e = "START_SAFE_BROWSING";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28424f = "SAFE_BROWSING_WHITELIST";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f28425g = "SAFE_BROWSING_PRIVACY_POLICY_URL";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28426h = "SERVICE_WORKER_BASIC_USAGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28427i = "SERVICE_WORKER_CACHE_MODE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f28428j = "SERVICE_WORKER_CONTENT_ACCESS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28429k = "SERVICE_WORKER_FILE_ACCESS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f28430l = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28431m = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28432n = "RECEIVE_WEB_RESOURCE_ERROR";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28433o = "RECEIVE_HTTP_ERROR";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f28434p = "SHOULD_OVERRIDE_WITH_REDIRECTS";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f28435q = "SAFE_BROWSING_HIT";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f28436r = "TRACING_CONTROLLER_BASIC_USAGE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f28437s = "WEB_RESOURCE_REQUEST_IS_REDIRECT";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f28438t = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f28439u = "WEB_RESOURCE_ERROR_GET_CODE";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f28440v = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f28441w = "SAFE_BROWSING_RESPONSE_PROCEED";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f28442x = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f28443y = "WEB_MESSAGE_PORT_POST_MESSAGE";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f28444z = "WEB_MESSAGE_PORT_CLOSE";

    /* JADX INFO: compiled from: WebViewFeature.java */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    private k0() {
    }

    public static boolean a(@n0 String str) {
        WebViewFeatureInternal feature = WebViewFeatureInternal.getFeature(str);
        return feature.isSupportedByFramework() || feature.isSupportedByWebView();
    }
}
