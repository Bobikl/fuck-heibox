package com.ss.bytertc.engine.utils;

import android.content.Context;
import com.apm.lite.MonitorCrash;
import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.base.utils.RtcContextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CrashInfoUtilToB {
    private static final String TAG = "CrashInfoUtilToB";
    private static final Context context = RtcContextUtils.getApplicationContext();
    private static MonitorCrash sdk = null;
    private static final String token = "d7271e1eac254529abcffc63e36b02c3";

    @CalledByNative
    public static void addTagsReport(String str) {
        LogUtil.d(TAG, "addTagsReport...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                sdk.addTags(next, jSONObject.getString(next));
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "addTagsReport catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public static void initApm(String str, final String str2) {
        LogUtil.d(TAG, "initApm...");
        try {
            sdk = MonitorCrash.initSDK(context, MonitorCrash.Config.sdk("432410").token(token).versionName("1。0").versionCode(1L).dynamicParams(new MonitorCrash.Config.IDynamicParams() { // from class: com.ss.bytertc.engine.utils.CrashInfoUtilToB.1
                @Override // com.apm.lite.MonitorCrash.Config.IDynamicParams
                public String getDid() {
                    return str2;
                }

                @Override // com.apm.lite.MonitorCrash.Config.IDynamicParams
                public String getUserId() {
                    return null;
                }
            }).channel("rtc_sdk").keyWords("bytertc", "com.ss.video.rtc.oner", "com.bytedance.ttgame.module.rtc.RtcService").soList("libbyteaudio.so", "libbytertc.so", "libagora.so", "libonerrtc.so", "libvolcenginertc.so", "libulien_audio.so").build());
        } catch (Exception e10) {
            LogUtil.e(TAG, "initApm catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public static void onEventV3Report(String str) {
        LogUtil.d(TAG, "onEventV3Report...");
        boolean z10 = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                sdk.addPageViewTags(next, string);
                if (next.equals("rtc_room_id") && !string.equals("")) {
                    z10 = true;
                }
            }
            if (z10) {
                sdk.addPageViewTags("rtc_session_type", "joinRoom");
            } else {
                sdk.addPageViewTags("rtc_session_type", "createEngine");
            }
            sdk.reportPageView(null);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onEventV3Report catch exception.\n" + e10.getMessage());
        }
    }
}
