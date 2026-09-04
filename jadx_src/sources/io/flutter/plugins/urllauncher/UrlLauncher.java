package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class UrlLauncher implements Messages.UrlLauncherApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "UrlLauncher";

    @p0
    private Activity activity;

    @n0
    private final Context applicationContext;

    @n0
    private final IntentResolver intentResolver;

    @j1
    public interface IntentResolver {
        String getHandlerComponentName(@n0 Intent intent);
    }

    UrlLauncher(@n0 final Context context) {
        this(context, new IntentResolver() { // from class: io.flutter.plugins.urllauncher.g
            @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
            public final String getHandlerComponentName(Intent intent) {
                return UrlLauncher.lambda$new$0(context, intent);
            }
        });
    }

    @j1
    UrlLauncher(@n0 Context context, @n0 IntentResolver intentResolver) {
        this.applicationContext = context;
        this.intentResolver = intentResolver;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean containsRestrictedHeader(Map<String, String> map) {
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            byte b10 = 0;
            if (!it.hasNext()) {
                return false;
            }
            String lowerCase = it.next().toLowerCase(Locale.US);
            lowerCase.hashCode();
            b10 = -1;
            switch (lowerCase.hashCode()) {
                case -1423461112:
                    if (!lowerCase.equals("accept")) {
                    }
                    break;
                case -1229727188:
                    if (lowerCase.equals("content-language")) {
                        b10 = 1;
                    }
                    break;
                case 785670158:
                    if (lowerCase.equals("content-type")) {
                        b10 = 2;
                    }
                    break;
                case 802785917:
                    if (lowerCase.equals("accept-language")) {
                        b10 = 3;
                    }
                    break;
                default:
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return true;
            }
        }
    }

    private void ensureActivity() {
        if (this.activity == null) {
            throw new Messages.FlutterError("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    @n0
    private static Bundle extractBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(Context context, Intent intent) {
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity == null) {
            return null;
        }
        return componentNameResolveActivity.toShortString();
    }

    private static boolean openCustomTab(@n0 Context context, @n0 Uri uri, @n0 Bundle bundle, @n0 Messages.BrowserOptions browserOptions) {
        androidx.browser.customtabs.d dVarD = new androidx.browser.customtabs.d.c().A(browserOptions.getShowTitle().booleanValue()).d();
        dVarD.f3223a.putExtra("com.android.browser.headers", bundle);
        try {
            dVarD.g(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @n0
    public Boolean canLaunchUrl(@n0 String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String handlerComponentName = this.intentResolver.getHandlerComponentName(intent);
        return handlerComponentName == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(handlerComponentName));
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    public void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @n0
    public Boolean launchUrl(@n0 String str, @n0 Map<String, String> map) {
        ensureActivity();
        try {
            this.activity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", extractBundle(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @n0
    public Boolean openUrlInApp(@n0 String str, @n0 Boolean bool, @n0 Messages.WebViewOptions webViewOptions, @n0 Messages.BrowserOptions browserOptions) {
        ensureActivity();
        Bundle bundleExtractBundle = extractBundle(webViewOptions.getHeaders());
        if (bool.booleanValue() && !containsRestrictedHeader(webViewOptions.getHeaders())) {
            if (openCustomTab(this.activity, Uri.parse(str), bundleExtractBundle, browserOptions)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.activity.startActivity(WebViewActivity.createIntent(this.activity, str, webViewOptions.getEnableJavaScript().booleanValue(), webViewOptions.getEnableDomStorage().booleanValue(), bundleExtractBundle));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    void setActivity(@p0 Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @n0
    public Boolean supportsCustomTabs() {
        return Boolean.valueOf(androidx.browser.customtabs.c.h(this.applicationContext, Collections.emptyList()) != null);
    }
}
