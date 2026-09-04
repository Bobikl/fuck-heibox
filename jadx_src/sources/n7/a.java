package n7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f132019a = "AppUtil";

    public static String a(String str, String str2) {
        return str + "." + str2;
    }

    public static int b(Context context, String str, String str2) {
        String str3;
        StringBuilder sb2;
        String str4;
        String string;
        if (context == null) {
            string = "getPlatformSDKVersion: context is null";
        } else {
            if (TextUtils.isEmpty(str)) {
                sb2 = new StringBuilder();
                str4 = "getPlatformSDKVersion: platformPackageName is ";
            } else {
                if (c(context, str)) {
                    try {
                        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(str, a(str, str2)), 128);
                        if (activityInfo == null) {
                            str3 = "getPlatformSDKVersion: appInfo is null";
                        } else {
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null) {
                                return bundle.getInt(i7.a.f119235g, -1);
                            }
                            str3 = "getPlatformSDKVersion: appInfo.metaData is null";
                        }
                        b.e(f132019a, str3);
                    } catch (PackageManager.NameNotFoundException e10) {
                        b.f(f132019a, "getPlatformSDKVersion: fail to getActivityInfo", e10);
                    }
                    return -1;
                }
                sb2 = new StringBuilder();
                str4 = "getPlatformSDKVersion: app has not installed ";
            }
            sb2.append(str4);
            sb2.append(str);
            string = sb2.toString();
        }
        b.e(f132019a, string);
        return -1;
    }

    public static boolean c(Context context, String str) {
        String str2;
        if (context == null) {
            str2 = "isAppInstalled: context is null";
        } else {
            if (!TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                try {
                    if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                        return true;
                    }
                    b.e(f132019a, "isAppInstalled: packageInfo is null");
                    return false;
                } catch (Exception e10) {
                    b.f(f132019a, "isAppInstalled: fail to getPackageInfo", e10);
                    return false;
                }
            }
            str2 = "isAppInstalled: platformPackageName is " + str;
        }
        b.e(f132019a, str2);
        return false;
    }
}
