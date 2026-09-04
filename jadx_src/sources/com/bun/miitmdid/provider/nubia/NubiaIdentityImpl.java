package com.bun.miitmdid.provider.nubia;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.p0;
import com.bun.miitmdid.l0;

/* JADX INFO: loaded from: classes6.dex */
public class NubiaIdentityImpl {
    private static final String TAG = "NubiaIdentityImpl";
    private static Uri uri = Uri.parse("content://cn.nubia.identity/identity");

    private static Object generalMethod(Context context, String str, @p0 String str2, String str3, Class<?> cls) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri);
            if (contentProviderClientAcquireContentProviderClient == null) {
                l0.d(TAG, "generalMethod: contentResolver is null");
                return null;
            }
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call(str, str2, null);
            if (i10 >= 24) {
                contentProviderClientAcquireContentProviderClient.close();
            } else {
                contentProviderClientAcquireContentProviderClient.release();
            }
            if (bundleCall == null) {
                l0.d(TAG, "generalMethod: bundle is null");
                return null;
            }
            if (bundleCall.getInt("code", -1) == 0) {
                l0.c(TAG, "generalMethod: success");
                if (cls == Boolean.class) {
                    return Boolean.valueOf(bundleCall.getBoolean(str3, false));
                }
                if (cls == String.class) {
                    return bundleCall.getString(str3, "");
                }
                return null;
            }
            l0.d(TAG, "generalMethod: failed:" + bundleCall.getString("message"));
            return null;
        } catch (Exception e10) {
            l0.d(TAG, "generalMethod: Exception: " + e10.getMessage());
            return null;
        }
    }

    public static String getAAID(Context context, String str) {
        Object objGeneralMethod = generalMethod(context, "getAAID", str, "id", String.class);
        return objGeneralMethod == null ? "" : (String) objGeneralMethod;
    }

    public static String getOAID(Context context) {
        Object objGeneralMethod = generalMethod(context, "getOAID", null, "id", String.class);
        return objGeneralMethod == null ? "" : (String) objGeneralMethod;
    }

    public static String getVAID(Context context, String str) {
        Object objGeneralMethod = generalMethod(context, "getVAID", str, "id", String.class);
        return objGeneralMethod == null ? "" : (String) objGeneralMethod;
    }

    public static boolean isSupported(Context context) {
        Object objGeneralMethod = generalMethod(context, "isSupport", null, "issupport", Boolean.class);
        if (objGeneralMethod == null) {
            return false;
        }
        return ((Boolean) objGeneralMethod).booleanValue();
    }
}
