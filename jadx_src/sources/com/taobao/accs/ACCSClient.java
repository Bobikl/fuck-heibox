package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.v;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class ACCSClient {
    private static String TAG = "ACCSClient";
    public static Map<String, ACCSClient> mACCSClients = new ConcurrentHashMap(2);
    private static Context mContext;
    private String OTAG = TAG;
    protected b mAccsManager;
    private AccsClientConfig mConfig;

    public ACCSClient(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        this.OTAG += accsClientConfig.getTag();
        if (mContext == null) {
            mContext = GlobalClientInfo.f98171a;
        }
        this.mAccsManager = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
    }

    public static ACCSClient getAccsClient() throws AccsException {
        return getAccsClient(null);
    }

    public static synchronized ACCSClient getAccsClient(String str) throws AccsException {
        if (TextUtils.isEmpty(str)) {
            str = "default";
            ALog.w(TAG, "getAccsClient", "configTag is null, use default!");
        }
        ALog.i(TAG, "getAccsClient", Constants.KEY_CONFIG_TAG, str);
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            ALog.e(TAG, "getAccsClient", "configTag not exist, please init first!!");
            throw new AccsException("configTag not exist");
        }
        ACCSClient aCCSClient = mACCSClients.get(str);
        if (aCCSClient == null) {
            ALog.d(TAG, "getAccsClient create client", new Object[0]);
            ACCSClient aCCSClient2 = new ACCSClient(configByTag);
            mACCSClients.put(str, aCCSClient2);
            aCCSClient2.updateConfig(configByTag);
            return aCCSClient2;
        }
        if (configByTag.equals(aCCSClient.mConfig)) {
            ALog.i(TAG, "getAccsClient exists", new Object[0]);
        } else {
            ALog.i(TAG, "getAccsClient update config", "old config", aCCSClient.mConfig.getTag(), "new config", configByTag.getTag());
            aCCSClient.updateConfig(configByTag);
        }
        return aCCSClient;
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) throws AccsException {
        try {
            if (context == null || accsClientConfig == null) {
                throw new AccsException("init AccsClient params error");
            }
            mContext = context.getApplicationContext();
            GlobalClientInfo.f98171a = context.getApplicationContext();
            ALog.d(TAG, lg.a.f131415h, "config", accsClientConfig);
        } catch (Throwable th2) {
            throw th2;
        }
        return accsClientConfig.getTag();
    }

    public static synchronized String init(Context context, String str) throws AccsException {
        AccsClientConfig configByTag;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                configByTag = AccsClientConfig.getConfigByTag(str);
                if (!AccsClientConfig.loadedStaticConfig) {
                    configByTag = new AccsClientConfig.Builder().setAppKey(str).build();
                    ALog.i(TAG, lg.a.f131415h, "create config, appkey as tag");
                }
            }
        }
        throw new AccsException("params error");
        return init(context, configByTag);
    }

    public static synchronized void setEnvironment(Context context, @AccsClientConfig.ENV int i10) {
        if (i10 < 0 || i10 > 2) {
            try {
                try {
                    ALog.e(TAG, "env error", "env", Integer.valueOf(i10));
                    i10 = 0;
                } catch (Throwable th2) {
                    try {
                        ALog.e(TAG, "setEnvironment", th2, new Object[0]);
                        v.a(context, i10);
                    } catch (Throwable th3) {
                        v.a(context, i10);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        int i11 = AccsClientConfig.mEnv;
        AccsClientConfig.mEnv = i10;
        if (i11 != i10 && v.e(context)) {
            ALog.i(TAG, "setEnvironment", "preEnv", Integer.valueOf(i11), "toEnv", Integer.valueOf(i10));
            v.c(context);
            v.f(context);
            v.d(context);
            if (i10 == 2) {
                SessionCenter.switchEnvironment(ENV.TEST);
            } else if (i10 == 1) {
                SessionCenter.switchEnvironment(ENV.PREPARE);
            }
            Iterator<Map.Entry<String, ACCSClient>> it = mACCSClients.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    getAccsClient(it.next().getKey());
                } catch (AccsException e10) {
                    ALog.e(TAG, "setEnvironment update client", e10, new Object[0]);
                }
            }
        }
        v.a(context, i10);
    }

    private void updateConfig(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        b accsInstance = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
        this.mAccsManager = accsInstance;
        if (accsInstance != null) {
            accsInstance.a(accsClientConfig);
        }
    }

    public void bindApp(String str, IAppReceiver iAppReceiver) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "bindApp mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void bindService(String str) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "bindService mAccsManager null", new Object[0]);
        } else {
            bVar.b(mContext, str);
        }
    }

    public void bindUser(String str) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext, str);
        }
    }

    public void bindUser(String str, boolean z10) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext, str, z10);
        }
    }

    public boolean cancel(String str) {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.a(str);
        }
        ALog.e(this.OTAG, "cancel mAccsManager null", new Object[0]);
        return false;
    }

    public void clearLoginInfo() {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "clearLoginInfo mAccsManager null", new Object[0]);
        } else {
            bVar.e(mContext);
        }
    }

    public void forceDisableService() {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "forceDisableService mAccsManager null", new Object[0]);
        } else {
            bVar.c(mContext);
        }
    }

    public void forceEnableService() {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "forceEnableService mAccsManager null", new Object[0]);
        } else {
            bVar.d(mContext);
        }
    }

    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.c();
        }
        ALog.e(this.OTAG, "forceReConnectChannel mAccsManager null", new Object[0]);
        return null;
    }

    public Map<String, Boolean> getChannelState() throws Exception {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.b();
        }
        ALog.e(this.OTAG, "getChannelState mAccsManager null", new Object[0]);
        return null;
    }

    @Deprecated
    public String getUserUnit() {
        return null;
    }

    public boolean isAccsConnected() {
        b bVar = this.mAccsManager;
        return bVar != null && bVar.a();
    }

    public boolean isChannelError(int i10) {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.a(i10);
        }
        ALog.e(this.OTAG, "isChannelError mAccsManager null", new Object[0]);
        return true;
    }

    public boolean isNetworkReachable() {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.b(mContext);
        }
        ALog.e(this.OTAG, "isNetworkReachable mAccsManager null", new Object[0]);
        return false;
    }

    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "registerConnectStateListener mAccsManager null", new Object[0]);
        } else {
            bVar.a(accsConnectStateListener);
        }
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "registerDataListener mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext, str, accsAbstractDataListener);
        }
    }

    public void registerSerivce(String str, String str2) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "registerSerivce mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext, str, str2);
        }
    }

    public void sendBusinessAck(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "sendBusinessAck mAccsManager null", new Object[0]);
        } else {
            bVar.a(str, str2, str3, s10, str4, map);
        }
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.a(mContext, accsRequest);
        }
        ALog.e(this.OTAG, "sendData mAccsManager null", new Object[0]);
        return null;
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.a(mContext, accsRequest, extraInfo);
        }
        ALog.e(this.OTAG, "sendPushResponse mAccsManager null", new Object[0]);
        return null;
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        b bVar = this.mAccsManager;
        if (bVar != null) {
            return bVar.b(mContext, accsRequest);
        }
        ALog.e(this.OTAG, "sendRequest mAccsManager null", new Object[0]);
        return null;
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "setLoginInfo mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext, iLoginInfo);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "startInAppConnection mAccsManager null", new Object[0]);
            return;
        }
        Context context = mContext;
        String appKey = this.mConfig.getAppKey();
        this.mConfig.getAppSecret();
        bVar.a(context, appKey, str, iAppReceiver);
    }

    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "unRegisterConnectStateListener mAccsManager null", new Object[0]);
        } else {
            bVar.b(accsConnectStateListener);
        }
    }

    public void unRegisterDataListener(String str) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "unRegisterDataListener mAccsManager null", new Object[0]);
        } else {
            bVar.e(mContext, str);
        }
    }

    public void unRegisterSerivce(String str) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "unRegisterSerivce mAccsManager null", new Object[0]);
        } else {
            bVar.d(mContext, str);
        }
    }

    public void unbindService(String str) {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "unbindService mAccsManager null", new Object[0]);
        } else {
            bVar.c(mContext, str);
        }
    }

    public void unbindUser() {
        b bVar = this.mAccsManager;
        if (bVar == null) {
            ALog.e(this.OTAG, "unbindUser mAccsManager null", new Object[0]);
        } else {
            bVar.a(mContext);
        }
    }
}
