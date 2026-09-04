package com.tencent.liteav.txcplayer.ext.host;

import android.content.Context;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.common.c;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class HostEngine {
    public static final String TAG = "HostEngine";
    private static HostEngine mInstance;
    private Context mAppContext;
    private boolean mIsInit = false;

    private HostEngine() {
    }

    public static HostEngine getInstance() {
        if (mInstance == null) {
            synchronized (HostEngine.class) {
                if (mInstance == null) {
                    mInstance = new HostEngine();
                }
            }
        }
        return mInstance;
    }

    public boolean checkAndLoadPlugin(int i10) {
        LiteavLog.i(TAG, "[checkAndLoadPlugin], pluginId=".concat(String.valueOf(i10)));
        return PluginManager.getInstance().checkAndLoadPlugin(i10);
    }

    public Context getAppContext() {
        return this.mAppContext;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f A[PHI: r0
  0x004f: PHI (r0v12 com.tencent.liteav.sdk.common.LicenseChecker$a) = 
  (r0v6 com.tencent.liteav.sdk.common.LicenseChecker$a)
  (r0v7 com.tencent.liteav.sdk.common.LicenseChecker$a)
  (r0v8 com.tencent.liteav.sdk.common.LicenseChecker$a)
  (r0v9 com.tencent.liteav.sdk.common.LicenseChecker$a)
  (r0v10 com.tencent.liteav.sdk.common.LicenseChecker$a)
 binds: [B:18:0x004d, B:21:0x0055, B:24:0x005c, B:27:0x0063, B:30:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public void handleSyncRequestHandleByHost(int i10, Map<String, Object> map, Map<String, Object> map2) {
        LicenseChecker.a aVar;
        LiteavLog.w(TAG, "[handleSyncRequestHandleByHost], functionId=" + i10 + " ,inParams=" + map + " ,outParams=" + map2);
        if (i10 == 1) {
            int vodLicenseFeature = RenderProcessService.getInstance().getVodLicenseFeature();
            if (map2 != null) {
                map2.put("KEY_RET_PARAM1", Integer.valueOf(vodLicenseFeature));
                return;
            }
            return;
        }
        if (i10 == 2 || i10 != 3 || map == null || map2 == null) {
            return;
        }
        int iIntValue = 0;
        Object obj = map.get(EngineConst.ArgsKey.KEY_PARAM1);
        if (obj != null && (obj instanceof Integer)) {
            iIntValue = ((Integer) obj).intValue();
        }
        LicenseChecker.a aVar2 = LicenseChecker.a.PLAYER_STANDARD;
        if (iIntValue != aVar2.value) {
            aVar2 = LicenseChecker.a.PLAYER_MONET;
            if (iIntValue != aVar2.value) {
                aVar2 = LicenseChecker.a.PLAYER_PREMIUM;
                if (iIntValue != aVar2.value) {
                    aVar2 = LicenseChecker.a.PLAYER_ENTERPRISE;
                    if (iIntValue != aVar2.value) {
                        aVar2 = LicenseChecker.a.PLAYER_PROJECTION;
                        aVar = iIntValue == aVar2.value ? aVar2 : null;
                    }
                }
            }
        }
        boolean zA = c.a(aVar);
        LiteavLog.i(TAG, "[CHECK_FEATURE_AUTH], feature=" + iIntValue + " ,functionType=" + aVar + " ,result=" + zA);
        map2.put("KEY_RET_PARAM1", Boolean.valueOf(zA));
    }

    public synchronized void init(Context context) {
        LiteavLog.d(TAG, "[init], appContext=" + context + " ,mIsInit=" + this.mIsInit);
        if (this.mIsInit) {
            return;
        }
        this.mAppContext = context;
        onCreate();
        this.mIsInit = true;
    }

    public void onCreate() {
        LiteavLog.d(TAG, "[onCreate]");
        PluginManager.getInstance().loadPlugin();
    }

    public void onDestroy() {
        LiteavLog.d(TAG, "[onDestroy]");
        PluginManager.getInstance().unLoadPlugin();
    }

    public void sendAsyncRequestToPlugin(int i10, int i11, Map<String, Object> map, PluginCallback pluginCallback) {
        IPluginBase pluginInstance = PluginManager.getInstance().getPluginInstance(i10);
        if (pluginInstance != null) {
            pluginInstance.handleAsyncRequest(i10, i11, map, pluginCallback);
            return;
        }
        LiteavLog.w(TAG, "[sendAsyncRequestToPlugin], destPluginId=" + i10 + " is not loaded");
    }

    public void sendSyncRequestHandleByHost(int i10, Map<String, Object> map, Map<String, Object> map2) {
        handleSyncRequestHandleByHost(i10, map, map2);
    }

    public void sendSyncRequestToPlugin(int i10, int i11, Map<String, Object> map, Map<String, Object> map2) {
        IPluginBase pluginInstance = PluginManager.getInstance().getPluginInstance(i10);
        if (pluginInstance != null) {
            pluginInstance.handleSyncRequest(i10, i11, map, map2);
            return;
        }
        LiteavLog.w(TAG, "[sendSyncRequestToPlugin], destPluginId=" + i10 + " is not loaded");
    }
}
