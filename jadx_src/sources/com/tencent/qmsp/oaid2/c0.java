package com.tencent.qmsp.oaid2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f101562a = Uri.parse("content://cn.nubia.identity/identity");

    public static String a(Context context, String str) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f101562a);
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getAAID", str, null);
            if (i10 >= 24) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } else {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
            if (bundleCall.getInt("code", -1) == 0) {
                String string = bundleCall.getString("id");
                c.c("NubiaLog succeed:" + string);
                return string;
            }
            String string2 = bundleCall.getString("message");
            c.c("NubiaLog failed:" + string2);
            return string2;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean a(Context context) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f101562a);
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("isSupport", null, null);
            if (i10 >= 24) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } else {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
            if (bundleCall.getInt("code", -1) == 0) {
                c.c("NubiaLog succeed");
                return bundleCall.getBoolean("issupport", true);
            }
            c.c("NubiaLog failed:" + bundleCall.getString("message"));
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static String b(Context context) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f101562a);
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getOAID", null, null);
            if (i10 >= 24) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } else {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
            if (bundleCall.getInt("code", -1) == 0) {
                String string = bundleCall.getString("id");
                c.c("NubiaLog succeed:" + string);
                return string;
            }
            String string2 = bundleCall.getString("message");
            c.c("NubiaLog failed:" + string2);
            return string2;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
