package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.internal.ACCSManagerImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.v;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ACCSManager {
    private static final String TAG = "ACCSManager";
    public static Map<String, b> mAccsInstances = new ConcurrentHashMap(2);
    public static Context mContext = null;
    public static String mDefaultAppkey = null;
    public static String mDefaultConfigTag = "default";
    public static int mEnv;

    /* JADX INFO: compiled from: Taobao */
    public static class AccsRequest implements Serializable {
        public String businessId;
        public byte[] data;
        public String dataId;
        public URL host;
        public boolean isUnitBusiness = false;
        public String serviceId;
        public String tag;
        public String target;
        public String targetServiceName;
        public int timeout;
        public String userId;

        public AccsRequest(String str, String str2, byte[] bArr, String str3) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3, String str4, URL url, String str5) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
            this.target = str4;
            this.host = url;
            this.businessId = str5;
        }

        public void setBusinessId(String str) {
            this.businessId = str;
        }

        public void setHost(URL url) {
            this.host = url;
        }

        public void setIsUnitBusiness(boolean z10) {
            this.isUnitBusiness = z10;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTarget(String str) {
            this.target = str;
        }

        public void setTargetServiceName(String str) {
            this.targetServiceName = str;
        }

        public void setTimeOut(int i10) {
            this.timeout = i10;
        }
    }

    private ACCSManager() {
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        bindApp(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
        }
        v.a();
        getManagerImpl(context).a(context, mDefaultAppkey, str2, str3, iAppReceiver);
    }

    @Deprecated
    public static void bindService(Context context, String str) {
        getManagerImpl(context).b(context, str);
    }

    @Deprecated
    public static void bindUser(Context context, String str) {
        bindUser(context, str, false);
    }

    @Deprecated
    public static void bindUser(Context context, String str, boolean z10) {
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
        }
        getManagerImpl(context).a(context, str, z10);
    }

    @Deprecated
    public static void clearLoginInfoImpl(Context context) {
        getManagerImpl(context).e(context);
    }

    protected static b createAccsInstance(Context context, String str) {
        return new ACCSManagerImpl(context, str);
    }

    public static void forceDisableService(Context context) {
        getManagerImpl(context).c(context);
    }

    public static void forceEnableService(Context context) {
        getManagerImpl(context).d(context);
    }

    @Deprecated
    public static Map<String, Boolean> forceReConnectChannel(Context context) throws Exception {
        return getManagerImpl(context).c();
    }

    public static b getAccsInstance(Context context, String str, String str2) {
        b bVarCreateAccsInstance;
        if (context == null || TextUtils.isEmpty(str2)) {
            ALog.e(TAG, "getAccsInstance param null", Constants.KEY_CONFIG_TAG, str2);
            return null;
        }
        String str3 = str2 + "|" + AccsClientConfig.mEnv;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(TAG, "getAccsInstance", "key", str3);
        }
        synchronized (ACCSManager.class) {
            bVarCreateAccsInstance = mAccsInstances.get(str3);
            if (bVarCreateAccsInstance == null) {
                try {
                    bVarCreateAccsInstance = createAccsInstance(context, str2);
                } catch (Exception e10) {
                    ALog.e(TAG, "createAccsInstance error", e10.getMessage());
                }
                if (bVarCreateAccsInstance != null) {
                    mAccsInstances.put(str3, bVarCreateAccsInstance);
                }
            }
        }
        return bVarCreateAccsInstance;
    }

    @Deprecated
    public static Map<String, Boolean> getChannelState(Context context) throws Exception {
        return getManagerImpl(context).b();
    }

    @Deprecated
    public static String getDefaultAppkey(Context context) {
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            ALog.e(TAG, "old interface!!, please AccsManager.setAppkey() first!", new Object[0]);
            String strA = v.a(context, Constants.SP_KEY_DEFAULT_APPKEY, null);
            mDefaultAppkey = strA;
            if (TextUtils.isEmpty(strA)) {
                mDefaultAppkey = "0";
            }
        }
        return mDefaultAppkey;
    }

    public static String getDefaultConfig(Context context) {
        return mDefaultConfigTag;
    }

    private static synchronized b getManagerImpl(Context context) {
        return getAccsInstance(context, null, getDefaultConfig(context));
    }

    @Deprecated
    public static String getUserUnit(Context context) {
        return null;
    }

    @Deprecated
    public static boolean isAccsConnected(Context context) {
        return getManagerImpl(context).a();
    }

    @Deprecated
    public static boolean isChannelError(Context context, int i10) {
        return getManagerImpl(context).a(i10);
    }

    @Deprecated
    public static boolean isNetworkReachable(Context context) {
        return getManagerImpl(context).b(context);
    }

    @Deprecated
    public static void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    @Deprecated
    public static void registerSerivce(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    @Deprecated
    public static String sendData(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).a(context, accsRequest);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        return getManagerImpl(context).a(context, str, str2, bArr, str3);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).a(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).a(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendPushResponse(Context context, AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        return getManagerImpl(context).a(context, accsRequest, extraInfo);
    }

    @Deprecated
    public static String sendRequest(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).b(context, accsRequest);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3) {
        return sendRequest(context, str, str2, bArr, str3, null);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).b(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).b(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static void setAppkey(Context context, String str, @AccsClientConfig.ENV int i10) {
    }

    @Deprecated
    public static void setDefaultConfig(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ALog.i(TAG, "setDefaultConfig", Constants.KEY_CONFIG_TAG, str);
        mDefaultConfigTag = str;
    }

    @Deprecated
    public static void setLoginInfoImpl(Context context, ILoginInfo iLoginInfo) {
        getManagerImpl(context).a(context, iLoginInfo);
    }

    @Deprecated
    public static void setMode(Context context, int i10) {
        mEnv = i10;
        getManagerImpl(context).a(context, i10);
    }

    @Deprecated
    public static void setProxy(Context context, String str, int i10) {
        getManagerImpl(context).a(context, str, i10);
    }

    @Deprecated
    public static void setServiceListener(Context context, String str, IServiceReceiver iServiceReceiver) {
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        startInAppConnection(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        v.a();
        getManagerImpl(context).a(context, mDefaultAppkey, str3, iAppReceiver);
    }

    @Deprecated
    public static void unRegisterDataListener(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }

    @Deprecated
    public static void unbindApp(Context context) {
    }

    @Deprecated
    public static void unbindService(Context context, String str) {
        getManagerImpl(context).c(context, str);
    }

    @Deprecated
    public static void unbindUser(Context context) {
        getManagerImpl(context).a(context);
    }

    @Deprecated
    public static void unregisterService(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }
}
