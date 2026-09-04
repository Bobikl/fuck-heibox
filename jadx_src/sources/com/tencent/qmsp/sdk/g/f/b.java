package com.tencent.qmsp.sdk.g.f;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.qmsp.sdk.base.c;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f102007a = Uri.parse("content://cn.nubia.identity/identity");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static String a(Context context, String str) {
        Exception e10;
        ?? r10;
        ?? r11 = 0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f102007a);
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getAAID", str, null);
            if (i10 >= 24) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } else {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
            ?? r12 = bundleCall.getInt("code", -1);
            try {
                if (r12 == 0) {
                    String string = bundleCall.getString("id");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("NubiaLog succeed:");
                    r12 = string;
                    r10 = sb2;
                } else {
                    String string2 = bundleCall.getString("message");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("NubiaLog failed:");
                    r12 = string2;
                    r10 = sb3;
                }
                r10.append(r12);
                c.c(r10.toString());
                return r12;
            } catch (Exception e11) {
                e10 = e11;
                r11 = r12;
                e10.printStackTrace();
                return r11;
            }
        } catch (Exception e12) {
            e10 = e12;
        }
    }

    public static boolean a(Context context) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f102007a);
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
            String string = bundleCall.getString("message");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NubiaLog failed:");
            sb2.append(string);
            c.c(sb2.toString());
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static String b(Context context) {
        Exception e10;
        ?? r10;
        ?? r11;
        ?? r12;
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f102007a);
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getOAID", null, null);
            if (i10 >= 24) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } else {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
            r10 = bundleCall.getInt("code", -1);
            try {
                if (r10 == 0) {
                    String string = bundleCall.getString("id");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("NubiaLog succeed:");
                    r12 = sb2;
                    r10 = string;
                } else {
                    String string2 = bundleCall.getString("message");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("NubiaLog failed:");
                    r12 = sb3;
                    r10 = string2;
                }
                r12.append(r10);
                c.c(r12.toString());
                r11 = r10;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                r11 = r10;
            }
        } catch (Exception e12) {
            e10 = e12;
            r10 = 0;
        }
        return r11;
    }
}
