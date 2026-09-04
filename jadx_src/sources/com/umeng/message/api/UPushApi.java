package com.umeng.message.api;

import com.umeng.message.UmengMessageService;
import com.umeng.message.tag.TagManager;

/* JADX INFO: loaded from: classes4.dex */
public interface UPushApi {
    void addAlias(String str, String str2, UPushAliasCallback uPushAliasCallback);

    void deleteAlias(String str, String str2, UPushAliasCallback uPushAliasCallback);

    void disable(UPushSettingCallback uPushSettingCallback);

    void enable(UPushSettingCallback uPushSettingCallback);

    int getDisplayNotificationNumber();

    String getMessageAppkey();

    String getMessageChannel();

    UPushMessageHandler getMessageHandler();

    UPushMessageNotifyApi getMessageNotifyApi();

    String getMessageSecret();

    int getMuteDurationSeconds();

    int getNoDisturbEndHour();

    int getNoDisturbEndMinute();

    int getNoDisturbStartHour();

    int getNoDisturbStartMinute();

    String getNotificationChannelName();

    UPushMessageHandler getNotificationClickHandler();

    boolean getNotificationOnForeground();

    int getNotificationPlayLights();

    int getNotificationPlaySound();

    int getNotificationPlayVibrate();

    String getNotificationSilenceChannelName();

    String getPushIntentServiceClass();

    UPushRegisterCallback getRegisterCallback();

    String getRegistrationId();

    String getResourcePackageName();

    UPushSettingCallback getSettingCallback();

    TagManager getTagManager();

    UPushThirdTokenCallback getThirdTokenCallback();

    boolean isPushCheck();

    void keepLowPowerMode(boolean z10);

    void onAppStart();

    void register(UPushRegisterCallback uPushRegisterCallback);

    void setAccsHeartbeatEnable(boolean z10);

    void setAlias(String str, String str2, UPushAliasCallback uPushAliasCallback);

    void setDisplayNotificationNumber(int i10);

    void setEnableAlarmHeartbeat(boolean z10);

    void setEnableForeground(boolean z10);

    void setEnableJobHeartbeat(boolean z10);

    void setMessageHandler(UPushMessageHandler uPushMessageHandler);

    void setMuteDurationSeconds(int i10);

    void setNoDisturbMode(int i10, int i11, int i12, int i13);

    void setNotificationChannelName(String str);

    void setNotificationClickHandler(UPushMessageHandler uPushMessageHandler);

    void setNotificationOnForeground(boolean z10);

    void setNotificationPlayLights(int i10);

    void setNotificationPlaySound(int i10);

    void setNotificationPlayVibrate(int i10);

    void setNotificationSilenceChannelName(String str);

    void setPullUpEnable(boolean z10);

    void setPushCheck(boolean z10);

    <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls);

    void setRegisterCallback(UPushRegisterCallback uPushRegisterCallback);

    void setResourcePackageName(String str);

    void setSettingCallback(UPushSettingCallback uPushSettingCallback);

    void setThirdTokenCallback(UPushThirdTokenCallback uPushThirdTokenCallback);
}
