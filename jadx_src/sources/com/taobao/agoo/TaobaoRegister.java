package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.xiaomi.mipush.sdk.MiPushClient;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes4.dex */
public final class TaobaoRegister {
    private static final int EVENT_ID = 66001;
    static final String PREFERENCES = "Agoo_AppStore";
    static final String PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND = "app_notification_custom_sound";
    static final String PROPERTY_APP_NOTIFICATION_ICON = "app_notification_icon";
    static final String PROPERTY_APP_NOTIFICATION_SOUND = "app_notification_sound";
    static final String PROPERTY_APP_NOTIFICATION_VIBRATE = "app_notification_vibrate";
    private static final String SERVICEID = "agooSend";
    protected static final String TAG = "TaobaoRegister";
    private static boolean isRegisterSuccess;
    private static com.taobao.agoo.a.b mRequestListener;

    private TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    public static void bindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, true);
        UTMini.getInstance().commitEvent(EVENT_ID, "bindAgoo", UtilityImpl.j(context));
    }

    @Deprecated
    public static void bindAgoo(Context context, String str, String str2, CallBack callBack) {
        bindAgoo(context, null);
    }

    public static void clickMessage(Context context, String str, String str2) {
        clickMessage(context, str, str2, 0, 0L);
    }

    public static void clickMessage(Context context, String str, String str2, int i10, long j10) {
        MsgDO msgDO;
        NotifManager notifManager = new NotifManager();
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "clickMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (TextUtils.isEmpty(str)) {
                ALog.d(TAG, "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.evokeAppStatus = 1;
                boolean z10 = (i10 & 1) == 1;
                boolean z11 = (i10 & 2) == 2;
                boolean z12 = (i10 & 4) == 4;
                boolean z13 = (i10 & 8) == 8;
                boolean z14 = z10 ^ z11;
                msgDO2.isGlobalClick = z14;
                if (z14) {
                    ALog.e(TAG, "clickMessage", "isLaunchByAgoo", Boolean.valueOf(z11), "isEvokeByAgoo", Boolean.valueOf(z10), "isComeFromBg", Boolean.valueOf(z12), "isSameDay", Boolean.valueOf(z13), "lastActiveTime", Long.valueOf(j10));
                    msgDO2.lastActiveTime = j10;
                    if ((z10 && z12) || z11) {
                        if (z13) {
                            msgDO2.evokeAppStatus = z11 ? 2 : 3;
                        } else {
                            msgDO2.evokeAppStatus = 4;
                        }
                    }
                }
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "8";
                AgooFactory agooFactory = new AgooFactory();
                agooFactory.init(context, notifManager, null);
                agooFactory.updateMsgStatus(str, "8");
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th2) {
                th = th2;
                msgDO = msgDO2;
                try {
                    ALog.e(TAG, "clickMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            msgDO = null;
        }
    }

    public static void dismissMessage(Context context, String str, String str2) {
        NotifManager notifManager = new NotifManager();
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "dismissMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (TextUtils.isEmpty(str)) {
                ALog.d(TAG, "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "9";
                AgooFactory agooFactory = new AgooFactory();
                agooFactory.init(context, notifManager, null);
                agooFactory.updateMsgStatus(str, "9");
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th2) {
                th = th2;
                msgDO = msgDO2;
                try {
                    ALog.e(TAG, "dismissMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void exposureMessage(Context context, String str, String str2) {
        NotifManager notifManager = new NotifManager();
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "exposureMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (TextUtils.isEmpty(str)) {
                ALog.d(TAG, "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "10";
                new AgooFactory().init(context, notifManager, null);
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th2) {
                th = th2;
                msgDO = msgDO2;
                try {
                    ALog.e(TAG, "exposureMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean isRegisterSuccess() {
        return isRegisterSuccess;
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i10) {
        NotifManager notifManager = new NotifManager();
        notifManager.init(context);
        notifManager.pingApp(str, str2, str3, i10);
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) throws AccsException {
        register(context, "default", str, str2, str3, iRegister);
    }

    public static synchronized void register(Context context, String str, String str2, String str3, String str4, IRegister iRegister) throws AccsException {
        if (context != null) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                ALog.i(TAG, "register", "appKey", str2, Constants.KEY_CONFIG_TAG, str);
                Context applicationContext = context.getApplicationContext();
                Config.f132807a = str;
                Config.setAgooAppKey(context, str2);
                Config.a(context, str3);
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (configByTag == null) {
                    new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str3).setTag(str).build();
                } else {
                    com.taobao.accs.client.a.f98186b = configByTag.getAuthCode();
                }
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                if (accsInstance != null) {
                    accsInstance.a(applicationContext, str2, str3, str4, new g(applicationContext, context, iRegister, str2, str4, accsInstance));
                    return;
                } else {
                    if (iRegister != null) {
                        iRegister.onFailure("503.2", "ACCSManager null");
                    }
                    return;
                }
            }
        }
        ALog.e(TAG, "register params null", "appkey", str2, Constants.KEY_CONFIG_TAG, str);
        if (iRegister != null) {
            iRegister.onFailure("503.2", "params null");
        }
    }

    public static synchronized void removeAlias(Context context, ICallback iCallback) {
        ALog.i(TAG, com.taobao.agoo.a.a.a.JSON_CMD_REMOVEALIAS, new Object[0]);
        try {
            String strG = Config.g(context);
            String strH = Config.h(context);
            String strA = Config.a(context);
            if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strG) && context != null && !TextUtils.isEmpty(strH)) {
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, strA, Config.c(context));
                if (mRequestListener == null) {
                    mRequestListener = new com.taobao.agoo.a.b(context.getApplicationContext());
                }
                GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                String strB = accsInstance.b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", com.taobao.agoo.a.a.a.b(strA, strG, strH), null));
                if (TextUtils.isEmpty(strB)) {
                    if (iCallback != null) {
                        iCallback.onFailure("504.1", "accs channel disabled!");
                    }
                } else if (iCallback != null) {
                    mRequestListener.f98554a.put(strB, iCallback);
                }
                return;
            }
            if (iCallback != null) {
                iCallback.onFailure("504.1", "input params null!!");
            }
            ALog.e(TAG, "setAlias param null", "appkey", strA, "deviceId", strG, com.taobao.agoo.a.a.a.JSON_PUSH_USER_TOKEN, strH, com.umeng.analytics.pro.d.R, context);
        } catch (Throwable th2) {
            ALog.e(TAG, com.taobao.agoo.a.a.a.JSON_CMD_REMOVEALIAS, th2, new Object[0]);
        }
    }

    public static synchronized void removeAlias(Context context, String str, ICallback iCallback) {
        ALog.i(TAG, com.taobao.agoo.a.a.a.JSON_CMD_REMOVEALIAS, new Object[0]);
        try {
            String strG = Config.g(context);
            String strA = Config.a(context);
            if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strG) && context != null && !TextUtils.isEmpty(str)) {
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, strA, Config.c(context));
                if (mRequestListener == null) {
                    mRequestListener = new com.taobao.agoo.a.b(context.getApplicationContext());
                }
                GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                String strB = accsInstance.b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", com.taobao.agoo.a.a.a.c(strA, strG, str), null));
                if (TextUtils.isEmpty(strB)) {
                    if (iCallback != null) {
                        iCallback.onFailure("504.1", "accs channel disabled!");
                    }
                } else if (iCallback != null) {
                    mRequestListener.f98554a.put(strB, iCallback);
                }
                return;
            }
            if (iCallback != null) {
                iCallback.onFailure("504.1", "input params null!!");
            }
            ALog.e(TAG, "setAlias param null", "appkey", strA, "deviceId", strG, "alias", str, com.umeng.analytics.pro.d.R, context);
        } catch (Throwable th2) {
            ALog.e(TAG, com.taobao.agoo.a.a.a.JSON_CMD_REMOVEALIAS, th2, new Object[0]);
        }
    }

    public static void removeAllAlias(Context context, ICallback iCallback) {
        ALog.i(TAG, "removeAllAlias", new Object[0]);
        try {
            String strG = Config.g(context);
            String strA = Config.a(context);
            if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strG) && context != null) {
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, strA, Config.c(context));
                if (mRequestListener == null) {
                    mRequestListener = new com.taobao.agoo.a.b(context.getApplicationContext());
                }
                GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                String strB = accsInstance.b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", com.taobao.agoo.a.a.a.a(strA, strG), null));
                if (TextUtils.isEmpty(strB)) {
                    if (iCallback != null) {
                        iCallback.onFailure("504.1", "accs channel disabled!");
                        return;
                    }
                    return;
                } else {
                    if (iCallback != null) {
                        mRequestListener.f98554a.put(strB, iCallback);
                        return;
                    }
                    return;
                }
            }
            if (iCallback != null) {
                iCallback.onFailure("504.1", "input params null!!");
            }
            ALog.e(TAG, "setAlias param null", "appkey", strA, "deviceId", strG, com.umeng.analytics.pro.d.R, context);
        } catch (Throwable th2) {
            ALog.e(TAG, "removeAllAlias", th2, new Object[0]);
        }
    }

    private static synchronized void sendSwitch(Context context, ICallback iCallback, boolean z10) {
        try {
            String strG = Config.g(context);
            String strA = Config.a(context);
            String strJ = UtilityImpl.j(context);
            if (!TextUtils.isEmpty(strA) && context != null && (!TextUtils.isEmpty(strG) || !TextUtils.isEmpty(strJ))) {
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, strA, Config.c(context));
                if (mRequestListener == null) {
                    mRequestListener = new com.taobao.agoo.a.b(context.getApplicationContext());
                }
                GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                String strB = accsInstance.b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", com.taobao.agoo.a.a.d.a(strA, strG, strJ, z10), null));
                if (TextUtils.isEmpty(strB)) {
                    if (iCallback != null) {
                        iCallback.onFailure("503.2", "accs channel disabled!");
                    }
                } else if (iCallback != null) {
                    mRequestListener.f98554a.put(strB, iCallback);
                }
                return;
            }
            if (iCallback != null) {
                iCallback.onFailure("503.3", "input params null!!");
            }
            ALog.e(TAG, "sendSwitch param null", "appkey", strA, "deviceId", strG, com.umeng.analytics.pro.d.R, context, com.taobao.agoo.a.a.d.JSON_CMD_ENABLEPUSH, Boolean.valueOf(z10));
        } catch (Throwable th2) {
            ALog.e(TAG, "sendSwitch", th2, new Object[0]);
        }
    }

    @Deprecated
    public static synchronized void setAccsConfigTag(Context context, String str) {
    }

    public static void setAgooMsgReceiveService(String str) {
        com.taobao.accs.client.a.f98185a = str;
    }

    public static synchronized void setAlias(Context context, String str, ICallback iCallback) {
        try {
            ALog.i(TAG, com.taobao.agoo.a.a.a.JSON_CMD_SETALIAS, "alias", str);
            String strG = Config.g(context);
            String strA = Config.a(context);
            if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strG) || context == null || TextUtils.isEmpty(str)) {
                if (iCallback != null) {
                    iCallback.onFailure("504.1", "input params null!!");
                }
                ALog.e(TAG, "setAlias param null", "appkey", strA, "deviceId", strG, "alias", str, com.umeng.analytics.pro.d.R, context);
                return;
            }
            try {
                if (mRequestListener == null) {
                    mRequestListener = new com.taobao.agoo.a.b(context.getApplicationContext());
                }
                if (com.taobao.agoo.a.b.f98553b.d(str)) {
                    ALog.i(TAG, "setAlias already set", "alias", str);
                    if (iCallback != null) {
                        iCallback.onSuccess();
                    }
                    return;
                }
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, strA, Config.c(context));
                if (com.taobao.agoo.a.b.f98553b.b(context.getPackageName())) {
                    GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                    String strB = accsInstance.b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", com.taobao.agoo.a.a.a.a(strA, strG, str), null));
                    if (TextUtils.isEmpty(strB)) {
                        if (iCallback != null) {
                            iCallback.onFailure("504.1", "accs channel disabled!");
                        }
                    } else if (iCallback != null) {
                        iCallback.extra = str;
                        mRequestListener.f98554a.put(strB, iCallback);
                    }
                } else if (iCallback != null) {
                    iCallback.onFailure("504.1", "bindApp first!!");
                }
            } catch (Throwable th2) {
                ALog.e(TAG, com.taobao.agoo.a.a.a.JSON_CMD_SETALIAS, th2, new Object[0]);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
    }

    public static void setEnv(Context context, @AccsClientConfig.ENV int i10) {
        ACCSClient.setEnvironment(context, i10);
    }

    public static void setIsRegisterSuccess(boolean z10) {
        isRegisterSuccess = z10;
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i10) {
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z10) {
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z10) {
    }

    @Deprecated
    public static void unBindAgoo(Context context, String str, String str2, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void unbindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, false);
        UTMini.getInstance().commitEvent(EVENT_ID, MiPushClient.COMMAND_UNREGISTER, UtilityImpl.j(context));
    }

    @Deprecated
    public static void unregister(Context context, CallBack callBack) {
        unbindAgoo(context, null);
    }
}
