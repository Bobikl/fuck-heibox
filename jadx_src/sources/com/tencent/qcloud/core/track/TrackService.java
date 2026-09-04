package com.tencent.qcloud.core.track;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.beacon.event.open.BeaconConfig;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.event.open.EventType;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qimei.sdk.QimeiSDK;
import java.util.Map;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class TrackService {
    private static final String TAG = "TrackService";
    private static String beaconKey = null;
    private static boolean debug = false;
    private static TrackService instance;
    private Context context;

    private TrackService(Context context) {
        this.context = context.getApplicationContext();
    }

    public static TrackService getInstance() {
        return instance;
    }

    public static void init(Context context, String str, boolean z10) {
        synchronized (TrackService.class) {
            if (instance == null) {
                instance = new TrackService(context);
                beaconKey = str;
                debug = z10;
                if (isIncludeBeacon()) {
                    BeaconConfig beaconConfigBuild = BeaconConfig.builder().auditEnable(false).bidEnable(false).qmspEnable(false).pagePathEnable(false).setNormalPollingTime(30000L).build();
                    BeaconReport beaconReport = BeaconReport.getInstance();
                    beaconReport.setLogAble(z10);
                    try {
                        beaconReport.setCollectProcessInfo(false);
                    } catch (NoSuchMethodError unused) {
                    }
                    try {
                        QimeiSDK.getInstance(str).getStrategy().enableOAID(false).enableIMEI(false).enableIMSI(false).enableAndroidId(false).enableMAC(false).enableProcessInfo(false);
                        beaconReport.start(context, str, beaconConfigBuild);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    try {
                        beaconReport.setCollectProcessInfo(false);
                    } catch (NoSuchMethodError unused2) {
                    }
                }
            }
        }
    }

    private static boolean isIncludeBeacon() {
        return true;
    }

    public void track(String str, String str2, Map<String, String> map) {
        if (isIncludeBeacon()) {
            String str3 = beaconKey;
            if (str == null) {
                str = str3;
            }
            EventResult eventResultReport = BeaconReport.getInstance().report(BeaconEvent.builder().withAppKey(str).withCode(str2).withType(EventType.NORMAL).withParams(map).build());
            if (debug) {
                StringBuilder sb2 = new StringBuilder("{");
                for (String str4 : map.keySet()) {
                    sb2.append(str4 + ContainerUtils.KEY_VALUE_DELIMITER + map.get(str4) + ", ");
                }
                sb2.delete(sb2.length() - 2, sb2.length()).append(g.f141884d);
                QCloudLogger.i(TAG, "eventCode: %s, params: %s => result{ eventID: %s, errorCode: %d, errorMsg: %s}", str2, sb2, Long.valueOf(eventResultReport.eventID), Integer.valueOf(eventResultReport.errorCode), eventResultReport.errMsg);
            }
        }
    }
}
