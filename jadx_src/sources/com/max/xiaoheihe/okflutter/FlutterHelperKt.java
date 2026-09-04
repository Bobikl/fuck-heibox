package com.max.xiaoheihe.okflutter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FlutterHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"OK_FLUTTER_ENGINE_GROUP__DEFAULT_ID", "", "getOK_FLUTTER_ENGINE_GROUP__DEFAULT_ID", "()Ljava/lang/String;", "OK_FLUTTER_ENGINE__DEFAULT_ID", "getOK_FLUTTER_ENGINE__DEFAULT_ID", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "(Ljava/lang/String;)Lorg/json/JSONObject;", "heybox_okflutter_android_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class FlutterHelperKt {

    @d
    private static final String OK_FLUTTER_ENGINE_GROUP__DEFAULT_ID = "ok_flutter_engine_group_default_id";

    @d
    private static final String OK_FLUTTER_ENGINE__DEFAULT_ID = "ok_flutter_engine_default_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    public static final JSONObject getJsonObject(@d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47730, new Class[]{String.class}, JSONObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JSONObject) patchProxyResultProxy.result;
        }
        f0.p(str, "<this>");
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @d
    public static final String getOK_FLUTTER_ENGINE_GROUP__DEFAULT_ID() {
        return OK_FLUTTER_ENGINE_GROUP__DEFAULT_ID;
    }

    @d
    public static final String getOK_FLUTTER_ENGINE__DEFAULT_ID() {
        return OK_FLUTTER_ENGINE__DEFAULT_ID;
    }
}
