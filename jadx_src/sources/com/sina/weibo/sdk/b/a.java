package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.sina.weibo.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: com.sina.weibo.sdk.b.a$a, reason: collision with other inner class name */
    public static final class C0922a {

        /* JADX INFO: renamed from: ah, reason: collision with root package name */
        public int f96817ah;
        public String packageName = BuildConfig.APPLICATION_ID;

        /* JADX INFO: renamed from: ag, reason: collision with root package name */
        public String f96816ag = "com.sina.weibo.SSOActivity";
    }

    private static C0922a a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamOpen = context.createPackageContext(str, 2).getAssets().open("weibo_for_sdk.json");
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[4096];
            while (true) {
                int i10 = inputStreamOpen.read(bArr, 0, 4096);
                if (i10 == -1) {
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    C0922a c0922a = new C0922a();
                    c0922a.f96817ah = jSONObject.optInt("support_api", -1);
                    c0922a.f96816ag = jSONObject.optString("authActivityName", null);
                    c0922a.packageName = str;
                    return c0922a;
                }
                sb2.append(new String(bArr, 0, i10));
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (JSONException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager;
        ResolveInfo resolveInfoResolveActivity;
        if (context == null || (packageManager = context.getPackageManager()) == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveInfoResolveActivity.activityInfo.packageName, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            for (Signature signature : signatureArr) {
                if ("18da2bf10352443a00a5e046d9fca6bd".equals(d.a(signature.toByteArray()))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static C0922a c(Context context) {
        return e(context);
    }

    public static boolean d(Context context) {
        C0922a c0922aE = e(context);
        return c0922aE != null && c0922aE.f96817ah >= 10791;
    }

    public static C0922a e(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        C0922a c0922aA;
        String[] strArr = {BuildConfig.APPLICATION_ID, "com.sina.weibog3"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !listQueryIntentServices.isEmpty()) {
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && serviceInfo.applicationInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                        String str2 = resolveInfo.serviceInfo.packageName;
                        if (TextUtils.equals(str, str2) && (c0922aA = a(context, str2)) != null) {
                            return c0922aA;
                        }
                    }
                }
            }
        }
        return null;
    }
}
