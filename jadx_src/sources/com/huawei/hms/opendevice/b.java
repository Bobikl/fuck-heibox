package com.huawei.hms.opendevice;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.UUID;

/* JADX INFO: compiled from: AaidUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public static DeleteTokenReq a(Context context, String str) {
        return a(context, null, null, str, null);
    }

    public static DeleteTokenReq a(Context context, String str, String str2) {
        return a(context, str, null, null, str2);
    }

    public static DeleteTokenReq a(Context context, String str, String str2, String str3, String str4) {
        DeleteTokenReq deleteTokenReq = new DeleteTokenReq();
        deleteTokenReq.setAppId(str);
        deleteTokenReq.setScope(str4);
        deleteTokenReq.setProjectId(str2);
        deleteTokenReq.setPkgName(context.getPackageName());
        deleteTokenReq.setSubjectId(str3);
        if (TextUtils.isEmpty(str)) {
            deleteTokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str4)) {
            deleteTokenReq.setScope(HmsMessaging.DEFAULT_TOKEN_SCOPE);
        }
        if (TextUtils.isEmpty(str2)) {
            deleteTokenReq.setProjectId(d(context));
        }
        return deleteTokenReq;
    }

    public static String a(Context context) {
        PushPreferences pushPreferences = new PushPreferences(context, "aaid");
        if (pushPreferences.containsKey("aaid")) {
            return pushPreferences.getString("aaid");
        }
        return null;
    }

    public static DeleteTokenReq b(Context context) {
        return a(context, null, null, null, null);
    }

    public static TokenReq b(Context context, String str) {
        return b(context, null, null, str, null);
    }

    public static TokenReq b(Context context, String str, String str2) {
        return b(context, str, null, null, str2);
    }

    public static TokenReq b(Context context, String str, String str2, String str3, String str4) {
        TokenReq tokenReq = new TokenReq();
        tokenReq.setPackageName(context.getPackageName());
        tokenReq.setAppId(str);
        tokenReq.setScope(str4);
        tokenReq.setProjectId(str2);
        tokenReq.setSubjectId(str3);
        tokenReq.setMultiSender(false);
        if (TextUtils.isEmpty(str)) {
            tokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str2)) {
            tokenReq.setProjectId(d(context));
        }
        if (TextUtils.isEmpty(str4)) {
            tokenReq.setScope(HmsMessaging.DEFAULT_TOKEN_SCOPE);
        }
        i iVarA = i.a(context);
        if (iVarA.getBoolean("hasRequestAgreement")) {
            tokenReq.setFirstTime(false);
        } else {
            tokenReq.setFirstTime(true);
            iVarA.saveBoolean("hasRequestAgreement", true);
        }
        return tokenReq;
    }

    public static synchronized String c(Context context) {
        String string;
        PushPreferences pushPreferences = new PushPreferences(context, "aaid");
        if (pushPreferences.containsKey("aaid")) {
            string = pushPreferences.getString("aaid");
        } else {
            string = UUID.randomUUID().toString();
            pushPreferences.saveString("aaid", string);
            pushPreferences.saveLong("creationTime", Long.valueOf(System.currentTimeMillis()));
        }
        return string;
    }

    public static String d(Context context) {
        return AGConnectServicesConfig.fromContext(context).getString(AgConnectInfo.AgConnectKey.PROJECT_ID);
    }

    public static boolean e(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null || TextUtils.isEmpty(bundle.getString("com.huawei.hms.client.service.name:base"))) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(HmsInstanceId.TAG, "isIntegratedBaseSdk failed.");
            return true;
        }
    }
}
