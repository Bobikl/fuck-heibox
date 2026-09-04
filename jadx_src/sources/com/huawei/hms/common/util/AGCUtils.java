package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class AGCUtils {
    private static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get(Constants.HUAWEI_HMS_CLIENT_APPID)) == null) {
                HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("appid=") ? strValueOf.substring(6) : strValueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e10) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e10);
            return "";
        }
    }

    private static String a(Context context, String str) {
        String string;
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    AGConnectOptionsBuilder aGConnectOptionsBuilder = new AGConnectOptionsBuilder();
                    inputStreamOpen = context.getResources().getAssets().open("agconnect-services.json");
                    aGConnectOptionsBuilder.setInputStream(inputStreamOpen);
                    string = aGConnectOptionsBuilder.build(context).getString(str);
                } catch (IOException e10) {
                    HMSLog.e("AGCUtils", "Get " + str + " failed: " + e10);
                    string = "";
                }
            } catch (NullPointerException e11) {
                HMSLog.e("AGCUtils", "Get " + str + " with AGConnectServicesConfig failed: " + e11);
                string = "";
            }
            IOUtils.closeQuietly(inputStreamOpen);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            HMSLog.e("AGCUtils", "The " + str + " is null.");
            return "";
        } catch (Throwable th2) {
            IOUtils.closeQuietly(inputStreamOpen);
            throw th2;
        }
    }

    private static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("cpid=") ? strValueOf.substring(5) : strValueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e10) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e10);
            return "";
        }
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) {
        String string;
        if (c(context)) {
            string = a(context, AgConnectInfo.AgConnectKey.APPLICATION_ID);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        } else {
            string = null;
        }
        try {
            AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
            if (aGConnectInstance.getContext() != context) {
                aGConnectInstance = AGConnectInstance.buildInstance(new AGConnectOptionsBuilder().build(context));
            }
            string = aGConnectInstance.getOptions().getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strA = a(context);
        return !TextUtils.isEmpty(strA) ? strA : a(context, AgConnectInfo.AgConnectKey.APPLICATION_ID);
    }

    public static String getCpId(Context context) {
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        String string = null;
        try {
            AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
            if (aGConnectInstance.getContext() != context) {
                aGConnectInstance = AGConnectInstance.buildInstance(new AGConnectOptionsBuilder().build(context));
            }
            string = aGConnectInstance.getOptions().getString("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strB = b(context);
        return !TextUtils.isEmpty(strB) ? strB : a(context, "client/cp_id");
    }
}
