package com.heytap.msp.push;

import android.content.Context;
import com.heytap.mcssdk.d;
import com.heytap.mcssdk.utils.g;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.notification.PushNotificationManager;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class HeytapPushManager {
    public static void cancelNotification(JSONObject jSONObject) {
        d.P().o(jSONObject);
    }

    public static void clearNotificationType() {
        clearNotificationType(null);
    }

    public static void clearNotificationType(JSONObject jSONObject) {
        d.P().u(jSONObject);
    }

    public static void clearNotifications() {
        clearNotifications(null);
    }

    public static void clearNotifications(JSONObject jSONObject) {
        d.P().n(jSONObject);
    }

    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        d.P().v(iSetAppNotificationCallBackService);
    }

    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        d.P().z(iSetAppNotificationCallBackService);
    }

    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        d.P().q(iGetAppNotificationCallBackService);
    }

    public static String getMcsPackageName(Context context) {
        return d.P().R(context);
    }

    public static void getNotificationStatus() {
        getNotificationStatus(null);
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
        d.P().a(jSONObject);
    }

    public static ICallBackResultService getPushCallback() {
        return d.P().V();
    }

    public static PushNotificationManager getPushNotificationManager() {
        return PushNotificationManager.getInstance();
    }

    public static void getPushStatus() {
        d.P().Y();
    }

    public static int getPushVersionCode() {
        return d.P().Z();
    }

    public static String getPushVersionName() {
        return d.P().a0();
    }

    public static String getReceiveSdkAction(Context context) {
        return d.P().b0(context);
    }

    public static void getRegister() {
        getRegister(null);
    }

    public static void getRegister(JSONObject jSONObject) {
        d.P().j(jSONObject);
    }

    public static String getRegisterID() {
        return d.P().b();
    }

    public static int getSDKVersionCode() {
        return d.c0();
    }

    public static String getSDKVersionName() {
        return d.d0();
    }

    public static void init(Context context, boolean z10) {
        d.P().e0(context, z10);
    }

    public static boolean isSupportPush(Context context) {
        return d.P().g0(context);
    }

    public static void openNotificationSettings() {
        openNotificationSettings(null);
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
        d.P().h(jSONObject);
    }

    public static void pausePush() {
        pausePush(null);
    }

    public static void pausePush(JSONObject jSONObject) {
        d.P().r(jSONObject);
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        d.P().t(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void requestNotificationPermission() {
        d.P().c();
    }

    public static void resumePush() {
        resumePush(null);
    }

    public static void resumePush(JSONObject jSONObject) {
        d.P().w(jSONObject);
    }

    public static void setAppKeySecret(String str, String str2) {
        d.P().j0(str, str2);
    }

    public static void setNotificationType(int i10) {
        setNotificationType(i10, null);
    }

    public static void setNotificationType(int i10, JSONObject jSONObject) {
        d.P().f(i10, jSONObject);
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
        d.P().k0(iCallBackResultService);
    }

    public static void setPushTime(List<Integer> list, int i10, int i11, int i12, int i13) {
        setPushTime(list, i10, i11, i12, i13, null);
    }

    public static void setPushTime(List<Integer> list, int i10, int i11, int i12, int i13, JSONObject jSONObject) throws IllegalArgumentException {
        d.P().m(list, i10, i11, i12, i13, jSONObject);
    }

    public static void setRegisterID(String str) {
        d.P().y(str);
    }

    public static void statisticEvent(Context context, String str, DataMessage dataMessage) {
        StatisticUtils.statisticEvent(context, str, dataMessage);
    }

    @Deprecated
    public static void statisticMessage(Context context, MessageStat messageStat) {
        g.b(context, messageStat);
    }

    @Deprecated
    public static void statisticMessage(Context context, List<MessageStat> list) {
        g.c(context, list);
    }

    public static void unRegister() {
        unRegister(null);
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        d.P().n0(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void unRegister(JSONObject jSONObject) {
        d.P().e(jSONObject);
    }
}
