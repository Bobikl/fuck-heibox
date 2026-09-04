package com.huawei.hms.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes7.dex */
public class q {
    public static int a(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt(str);
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.w("ResourceLoader", "load meta data resource failed.");
            return 0;
        }
    }

    public static int a(Context context, String str, String str2) {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier == 0) {
                Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
                identifier = Integer.parseInt(field.get(field.getName()).toString());
                if (identifier == 0) {
                    HMSLog.i("ResourceLoader", "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + identifier);
                }
            }
            return identifier;
        } catch (ClassNotFoundException e10) {
            HMSLog.e("ResourceLoader", "!!!! ResourceLoader: ClassNotFoundException-resourceType=" + str + "--resourceName=" + str2, e10);
            return 0;
        } catch (IllegalAccessException e11) {
            HMSLog.e("ResourceLoader", "!!!! ResourceLoader: IllegalAccessException-resourceType=" + str + "--resourceName=" + str2, e11);
            return 0;
        } catch (NoSuchFieldException e12) {
            HMSLog.e("ResourceLoader", "!!!! ResourceLoader: NoSuchFieldException-resourceType=" + str + "--resourceName=" + str2, e12);
            return 0;
        } catch (NumberFormatException e13) {
            HMSLog.e("ResourceLoader", "!!!! ResourceLoader: NumberFormatException-resourceType=" + str + "--resourceName=" + str2, e13);
            return 0;
        } catch (IllegalArgumentException e14) {
            HMSLog.e("ResourceLoader", "!!!! ResourceLoader: IllegalArgumentException-resourceType=" + str + "--resourceName=" + str2, e14);
            return 0;
        }
    }
}
