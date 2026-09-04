package com.umeng.message;

import android.content.Context;
import com.taobao.accs.utl.ALog;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.api.UPushApi;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.api.UPushRegisterCallback;
import com.umeng.message.api.UPushSettingCallback;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.aw;
import com.umeng.message.proguard.d;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.i;
import com.umeng.message.proguard.o;
import com.umeng.message.proguard.t;
import com.umeng.message.proguard.u;
import com.umeng.message.proguard.x;
import com.umeng.message.tag.TagManager;
import org.android.spdy.SpdyAgent;

/* JADX INFO: loaded from: classes4.dex */
public class PushAgent {
    private static final String TAG = "PushAgent";
    private static boolean sInit = false;
    private static volatile PushAgent sInstance;
    private UPushApi api;
    public boolean isZyb = true;

    static {
        try {
            o oVar = new o();
            ALog.setLog(oVar);
            anet.channel.util.ALog.setLog(oVar);
        } catch (Throwable th2) {
            UPLog.e(TAG, th2);
        }
    }

    private PushAgent() {
    }

    private PushAgent(Context context) {
        if (context == null) {
            try {
                context = x.a();
            } catch (Throwable th2) {
                UPLog.e(TAG, th2);
            }
        }
        x.a(context);
        t.a();
        this.api = u.a();
    }

    public static PushAgent getInstance(Context context) {
        if (sInstance == null) {
            synchronized (PushAgent.class) {
                if (sInstance == null) {
                    sInstance = new PushAgent(context);
                }
            }
        }
        return sInstance;
    }

    private static void init(Context context) {
        if (sInit) {
            return;
        }
        f.c();
        sInit = true;
    }

    public static void setup(Context context, String str, String str2) {
        UPLog.d("Core", "setup appkey:", str, "appSecret:", str2);
        x.a(context);
        t.a();
    }

    public void addAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        this.api.addAlias(str, str2, uPushAliasCallback);
    }

    public void changeBadgeNum(int i10) {
        aw.b(x.a(), i10);
    }

    public void deleteAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        this.api.deleteAlias(str, str2, uPushAliasCallback);
    }

    public void disable(UPushSettingCallback uPushSettingCallback) {
        this.api.disable(uPushSettingCallback);
    }

    public void enable(UPushSettingCallback uPushSettingCallback) {
        this.api.enable(uPushSettingCallback);
    }

    public UPushSettingCallback getCallback() {
        return this.api.getSettingCallback();
    }

    public int getDisplayNotificationNumber() {
        return this.api.getDisplayNotificationNumber();
    }

    public String getMessageAppkey() {
        return this.api.getMessageAppkey();
    }

    public String getMessageChannel() {
        return this.api.getMessageChannel();
    }

    public UPushMessageHandler getMessageHandler() {
        return this.api.getMessageHandler();
    }

    public UPushMessageNotifyApi getMessageNotifyApi() {
        return this.api.getMessageNotifyApi();
    }

    public String getMessageSecret() {
        return this.api.getMessageSecret();
    }

    public int getMuteDurationSeconds() {
        return this.api.getMuteDurationSeconds();
    }

    public int getNoDisturbEndHour() {
        return this.api.getNoDisturbEndHour();
    }

    public int getNoDisturbEndMinute() {
        return this.api.getNoDisturbEndMinute();
    }

    public int getNoDisturbStartHour() {
        return this.api.getNoDisturbStartHour();
    }

    public int getNoDisturbStartMinute() {
        return this.api.getNoDisturbStartMinute();
    }

    public String getNotificationChannelName() {
        return this.api.getNotificationChannelName();
    }

    public UPushMessageHandler getNotificationClickHandler() {
        return this.api.getNotificationClickHandler();
    }

    public boolean getNotificationOnForeground() {
        return this.api.getNotificationOnForeground();
    }

    public int getNotificationPlayLights() {
        return this.api.getNotificationPlayLights();
    }

    public int getNotificationPlaySound() {
        return this.api.getNotificationPlaySound();
    }

    public int getNotificationPlayVibrate() {
        return this.api.getNotificationPlayVibrate();
    }

    public String getNotificationSilenceChannelName() {
        return this.api.getNotificationSilenceChannelName();
    }

    public String getPushIntentServiceClass() {
        return this.api.getPushIntentServiceClass();
    }

    public UPushRegisterCallback getRegisterCallback() {
        return this.api.getRegisterCallback();
    }

    public String getRegistrationId() {
        return this.api.getRegistrationId();
    }

    public String getResourcePackageName() {
        return this.api.getResourcePackageName();
    }

    public TagManager getTagManager() {
        return this.api.getTagManager();
    }

    public boolean isNotificationEnabled() {
        return d.q(x.a()) == 1;
    }

    public boolean isPushCheck() {
        return this.api.isPushCheck();
    }

    public void keepLowPowerMode(boolean z10) {
        this.api.keepLowPowerMode(z10);
    }

    public void onAppStart() {
        this.api.onAppStart();
    }

    public boolean openNotificationSettings() {
        return d.r(x.a());
    }

    public void register(UPushRegisterCallback uPushRegisterCallback) {
        this.api.register(uPushRegisterCallback);
    }

    public void setAccsHeartbeatEnable(boolean z10) {
        this.api.setAccsHeartbeatEnable(z10);
    }

    public void setAlias(String str, String str2, UPushAliasCallback uPushAliasCallback) {
        this.api.setAlias(str, str2, uPushAliasCallback);
    }

    public void setBadgeNum(int i10) {
        aw.a(x.a(), i10);
    }

    public void setCallback(UPushSettingCallback uPushSettingCallback) {
        this.api.setSettingCallback(uPushSettingCallback);
    }

    public void setDebugMode(boolean z10) {
        UPLog.setEnable(z10);
        try {
            SpdyAgent.enableDebug = z10;
        } catch (Throwable th2) {
            UPLog.e(TAG, th2);
        }
    }

    public void setDisplayNotificationNumber(int i10) {
        this.api.setDisplayNotificationNumber(i10);
    }

    public void setEnableAlarmHeartbeat(boolean z10) {
        this.api.setEnableAlarmHeartbeat(z10);
    }

    public void setEnableForeground(Context context, boolean z10) {
        this.api.setEnableForeground(z10);
    }

    public void setEnableJobHeartbeat(boolean z10) {
        this.api.setEnableJobHeartbeat(z10);
    }

    public void setLogUploadEnable(boolean z10) {
        f.f105796b = z10;
    }

    public void setMessageHandler(UPushMessageHandler uPushMessageHandler) {
        this.api.setMessageHandler(uPushMessageHandler);
    }

    public void setMuteDurationSeconds(int i10) {
        this.api.setMuteDurationSeconds(i10);
    }

    public void setNoDisturbMode(int i10, int i11, int i12, int i13) {
        this.api.setNoDisturbMode(i10, i11, i12, i13);
    }

    public void setNotificationChannelName(String str) {
        this.api.setNotificationChannelName(str);
    }

    public void setNotificationClickHandler(UPushMessageHandler uPushMessageHandler) {
        this.api.setNotificationClickHandler(uPushMessageHandler);
    }

    public void setNotificationOnForeground(boolean z10) {
        this.api.setNotificationOnForeground(z10);
    }

    public void setNotificationPlayLights(int i10) {
        this.api.setNotificationPlayLights(i10);
    }

    public void setNotificationPlaySound(int i10) {
        this.api.setNotificationPlaySound(i10);
    }

    public void setNotificationPlayVibrate(int i10) {
        this.api.setNotificationPlayVibrate(i10);
    }

    public void setNotificationSilenceChannelName(String str) {
        this.api.setNotificationSilenceChannelName(str);
    }

    public void setPackageListenerEnable(boolean z10) {
        i.a(z10);
    }

    public void setPullUpEnable(boolean z10) {
        this.api.setPullUpEnable(z10);
    }

    public void setPushCheck(boolean z10) {
        this.api.setPushCheck(z10);
    }

    public <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        this.api.setPushIntentServiceClass(cls);
    }

    public void setRegisterCallback(UPushRegisterCallback uPushRegisterCallback) {
        this.api.setRegisterCallback(uPushRegisterCallback);
    }

    public void setResourcePackageName(String str) {
        this.api.setResourcePackageName(str);
    }

    public void setSmartEnable(boolean z10) {
        f.f105795a = z10;
    }

    public void setThirdTokenCallback(UPushThirdTokenCallback uPushThirdTokenCallback) {
        this.api.setThirdTokenCallback(uPushThirdTokenCallback);
    }
}
