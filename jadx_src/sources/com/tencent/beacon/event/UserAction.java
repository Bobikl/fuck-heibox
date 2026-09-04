package com.tencent.beacon.event;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.beacon.a.c.j;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.open.BeaconConfig;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.upload.InitHandleListener;
import com.tencent.beacon.upload.TunnelInfo;
import com.tencent.beacon.upload.UploadHandleListener;
import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class UserAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f99039a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f99041c;
    public static Context mContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BeaconConfig.Builder f99040b = BeaconConfig.builder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f99042d = true;

    @Deprecated
    public static void closeUseInfoEvent() {
    }

    public static void doUploadRecords() {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
        if (eventModule != null) {
            eventModule.a(false);
        }
    }

    public static void flushObjectsToDB(boolean z10) {
    }

    public static Map<String, String> getAdditionalInfo() {
        return getAdditionalInfo(null);
    }

    public static Map<String, String> getAdditionalInfo(String str) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
        if (eventModule != null) {
            return eventModule.a(str);
        }
        return null;
    }

    public static String getAppKey() {
        return f99039a;
    }

    public static String getCloudParas(String str) {
        return "";
    }

    public static BeaconPubParams getCommonParams() {
        return BeaconReport.getInstance().getCommonParams(mContext);
    }

    public static String getEventDomain() {
        return com.tencent.beacon.base.net.c.b.f98921c;
    }

    public static String getOpenID(String str) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
        return eventModule != null ? eventModule.b(str) : "";
    }

    public static String getQIMEI() {
        Qimei qimeiB = j.b();
        return qimeiB == null ? "" : qimeiB.getQimei16();
    }

    public static void getQimei(IAsyncQimeiListener iAsyncQimeiListener) throws NullPointerException {
        j.a(iAsyncQimeiListener);
    }

    public static String getQimeiByKey(String str) {
        Qimei qimeiB;
        if (TextUtils.isEmpty(str) || (qimeiB = j.b()) == null) {
            return "";
        }
        if (str.equals("A3")) {
            return qimeiB.getQimei16();
        }
        return str.equals("A153") ? qimeiB.getQimei36() : "";
    }

    public static String getQimeiNew() {
        Qimei qimeiB = j.b();
        return qimeiB == null ? "" : qimeiB.getQimei36();
    }

    @Deprecated
    public static String getRtQIMEI(Context context) {
        Qimei qimeiA = j.a(context);
        return qimeiA == null ? "" : qimeiA.getQimei16();
    }

    public static String getSDKVersion() {
        return BeaconReport.getInstance().getSDKVersion();
    }

    public static String getStrategyDomain() {
        return com.tencent.beacon.base.net.c.b.f98922d;
    }

    public static String getUserID(String str) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
        return eventModule != null ? eventModule.c(str) : "";
    }

    public static void initUserAction(Context context) {
        initUserAction(context, true);
    }

    public static void initUserAction(Context context, boolean z10) {
        initUserAction(context, z10, 0L);
    }

    public static void initUserAction(Context context, boolean z10, long j10) {
        initUserAction(context, z10, j10, null, null);
    }

    @TargetApi(14)
    public static void initUserAction(Context context, boolean z10, long j10, InitHandleListener initHandleListener, UploadHandleListener uploadHandleListener) {
        if (!f99042d) {
            Log.e("beacon", "UserAction.initUserAction is not available");
        } else {
            mContext = context;
            BeaconReport.getInstance().start(context, f99039a, f99040b.build());
        }
    }

    public static boolean loginEvent(boolean z10, long j10, Map<String, String> map) {
        if (mContext != null) {
            map.put("A19", com.tencent.beacon.a.c.e.l().q());
        }
        return onUserAction("rqd_wgLogin", z10, j10, 0L, map, true);
    }

    public static boolean onDTUserAction(Context context, String str, boolean z10, long j10, long j11, Map<String, String> map, boolean z11, boolean z12) {
        if (context == null) {
            return false;
        }
        if (map == null) {
            return onUserAction(str, z10, j10, j11, null, z11, z12);
        }
        com.tencent.beacon.a.c.c.d().a(context);
        com.tencent.beacon.a.c.e eVarL = com.tencent.beacon.a.c.e.l();
        com.tencent.beacon.a.c.f fVarE = com.tencent.beacon.a.c.f.e();
        HashMap map2 = new HashMap(map);
        map2.put("dt_imei2", "" + fVarE.c());
        map2.put("dt_meid", "" + fVarE.g());
        map2.put("dt_mf", "" + eVarL.o());
        return onUserAction(str, z10, j10, j11, map2, z11, z12);
    }

    public static boolean onDTUserActionToTunnel(Context context, String str, String str2, Map<String, String> map, boolean z10, boolean z11) {
        if (context == null) {
            return false;
        }
        if (map == null) {
            return onUserActionToTunnel(str, str2, null, z10, z11);
        }
        com.tencent.beacon.a.c.c.d().a(context);
        com.tencent.beacon.a.c.e eVarL = com.tencent.beacon.a.c.e.l();
        com.tencent.beacon.a.c.f fVarE = com.tencent.beacon.a.c.f.e();
        HashMap map2 = new HashMap(map);
        map2.put("dt_imei2", "" + fVarE.c());
        map2.put("dt_meid", "" + fVarE.g());
        map2.put("dt_mf", "" + eVarL.o());
        return onUserActionToTunnel(str, str2, map2, z10, z11);
    }

    public static void onPageIn(String str) {
        com.tencent.beacon.d.a.a(com.tencent.beacon.event.c.d.d(str));
    }

    public static void onPageOut(String str) {
        com.tencent.beacon.d.a.b(com.tencent.beacon.event.c.d.d(str));
    }

    public static boolean onUserAction(String str, Map<String, String> map, boolean z10, boolean z11) {
        return onUserAction(str, true, -1L, -1L, map, z10, z11);
    }

    public static boolean onUserAction(String str, boolean z10, long j10, long j11, Map<String, String> map, boolean z11) {
        return onUserAction(str, z10, j10, j11, map, z11, false);
    }

    public static boolean onUserAction(String str, boolean z10, long j10, long j11, Map<String, String> map, boolean z11, boolean z12) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str).withType(z11 ? EventType.REALTIME : EventType.NORMAL).withParams(map).withAppKey(f99039a).withIsSucceed(z10).build()).isSuccess();
    }

    public static boolean onUserActionToTunnel(String str, String str2, Map<String, String> map, boolean z10, boolean z11) {
        return onUserActionToTunnel(str, str2, true, -1L, -1L, map, z10, z11);
    }

    public static boolean onUserActionToTunnel(String str, String str2, boolean z10, long j10, long j11, Map<String, String> map, boolean z11, boolean z12) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str2).withType(z11 ? EventType.REALTIME : EventType.NORMAL).withParams(map).withAppKey(str).withIsSucceed(z10).build()).isSuccess();
    }

    public static void registerTunnel(TunnelInfo tunnelInfo) {
    }

    public static void setAdditionalInfo(String str, Map<String, String> map) {
        BeaconReport.getInstance().setAdditionalParams(str, map);
    }

    public static void setAdditionalInfo(Map<String, String> map) {
        setAdditionalInfo(null, map);
    }

    public static void setAppKey(String str) {
        f99039a = str;
    }

    public static void setAppVersion(String str) {
        f99041c = str;
    }

    @Deprecated
    public static void setAutoLaunchEventUsable(boolean z10) {
    }

    public static void setChannelID(String str) {
        BeaconReport.getInstance().setChannelID(str);
    }

    public static void setJsClientId(String str) {
    }

    public static void setLogAble(boolean z10, boolean z11) {
        com.tencent.beacon.base.util.c.a(z10);
        com.tencent.beacon.base.util.c.b(z10);
    }

    public static void setOAID(String str) {
        BeaconReport.getInstance().setOAID(str);
    }

    @Deprecated
    public static void setOldInitMethodEnable(boolean z10) {
        f99042d = z10;
    }

    public static void setOmgId(String str) {
        BeaconReport.getInstance().setOmgID(str);
    }

    public static void setOpenID(String str) {
        BeaconReport.getInstance().setOpenID(null, str);
    }

    public static void setQQ(String str) {
        BeaconReport.getInstance().setQQ(str);
    }

    public static void setReportDomain(String str, String str2) {
        com.tencent.beacon.base.net.c.b.a(str, str2);
    }

    public static void setReportIP(String str, String str2) {
        com.tencent.beacon.base.net.c.b.b(str, str2);
    }

    public static void setScheduledService(ScheduledExecutorService scheduledExecutorService) {
        f99040b.setExecutorService(scheduledExecutorService);
    }

    public static void setStrictMode(boolean z10) {
        BeaconReport.getInstance().setStrictMode(z10);
    }

    public static void setUploadMode(boolean z10) {
        EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
        if (eventModule != null) {
            eventModule.b(z10);
        } else {
            f99040b.eventReportEnable(z10);
        }
    }

    public static void setUserID(String str) {
        setUserID(null, str);
    }

    public static void setUserID(String str, String str2) {
        BeaconReport.getInstance().setUserID(str, str2);
    }
}
