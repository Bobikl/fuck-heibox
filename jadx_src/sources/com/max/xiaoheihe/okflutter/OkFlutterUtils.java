package com.max.xiaoheihe.okflutter;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.flutter.embedding.android.FlutterView;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class OkFlutterUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Map<String, Object> bundleToMap(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 47747, new Class[]{Bundle.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        if (bundle != null && !bundle.keySet().isEmpty()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    map.put(str, bundleToMap(bundle.getBundle(str)));
                } else if (obj != null) {
                    map.put(str, obj);
                }
            }
        }
        return map;
    }

    @p0
    public static JSONObject convertBundleToJson(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 47748, new Class[]{Bundle.class}, JSONObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JSONObject) patchProxyResultProxy.result;
        }
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                if (bundle.get(str) == null || !bundle.get(str).getClass().getName().equals("android.os.Bundle")) {
                    jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
                } else {
                    jSONObject.put(str, convertBundleToJson((Bundle) bundle.get(str)));
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static String createUniqueId(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47746, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return UUID.randomUUID().toString() + lg.a.f131412e + str;
    }

    public static FlutterView findFlutterView(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 47749, new Class[]{View.class}, FlutterView.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterView) patchProxyResultProxy.result;
        }
        if (view instanceof FlutterView) {
            return (FlutterView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            FlutterView flutterViewFindFlutterView = findFlutterView(viewGroup.getChildAt(i10));
            if (flutterViewFindFlutterView != null) {
                return flutterViewFindFlutterView;
            }
        }
        return null;
    }
}
