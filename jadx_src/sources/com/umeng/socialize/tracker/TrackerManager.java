package com.umeng.socialize.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.utils.CommonUtil;
import com.umeng.socialize.utils.DeviceConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TrackerManager {
    private static final String APPKEY_IS_EMPTY = "appkey参数不能为null或者空字符串。";
    private static final String ATTRIBUTES_EXCEED_LIMIT = "SDK仅支持10个自定义属性。";
    private static final String CALLBACK_IS_NULL = "callback参数不能为null。";
    private static final String CONTEXT_IS_NULL = "context参数不能为null。";
    private static final String TAG = "TrackerManager";
    private static final String UMID_IS_EMPTY = "umid参数不能为null或者空字符串。";
    private static final String URL_IS_EMPTY = "url参数不能为null或者空字符串。";

    private TrackerManager() {
    }

    public static String getUMID(Context context) {
        return UMConfigure.getUMIDString(context);
    }

    public static void requestTrackerCode(Context context, String str, String str2, String str3, String str4, Map<String, String> map, TrackerResultHandler trackerResultHandler) {
        if (CommonUtil.isSilentMode(context)) {
            return;
        }
        if (context == null) {
            Log.e(TAG, CONTEXT_IS_NULL);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, APPKEY_IS_EMPTY);
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            Log.e(TAG, UMID_IS_EMPTY);
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            Log.e(TAG, URL_IS_EMPTY);
            return;
        }
        if (trackerResultHandler == null) {
            Log.e(TAG, CALLBACK_IS_NULL);
            return;
        }
        if (map != null && map.size() > 10) {
            Log.e(TAG, ATTRIBUTES_EXCEED_LIMIT);
        } else if (DeviceConfig.isNetworkAvailable(context)) {
            b.a().a(context, str, str2, str3, str4, map, 0, trackerResultHandler);
        } else {
            trackerResultHandler.codeGenerateFailed(new Throwable(com.umeng.socialize.tracker.utils.a.NetworkUnavailable.a()));
        }
    }
}
