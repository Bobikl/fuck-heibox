package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.bean.RemoteServiceBean;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public class b {
    public static RequestHeader a() throws ApiException {
        String string;
        Context contextA = l.f60050e.a();
        String strValueOf = null;
        try {
            Object obj = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData.get("com.hihonor.push.app_id");
            if (obj != null) {
                strValueOf = String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            c.a("ConfigUtils", "getPushAppId", e10);
        }
        if (TextUtils.isEmpty(strValueOf)) {
            c.a("checkPushConfig Parameter is missing");
            throw HonorPushErrorEnum.ERROR_NO_APPID.toApiException();
        }
        String strA = a(contextA, contextA.getPackageName());
        if (TextUtils.isEmpty(strA)) {
            c.a("checkPushConfig Parameter is missing.");
            throw HonorPushErrorEnum.ERROR_CERT_FINGERPRINT_EMPTY.toApiException();
        }
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setPackageName(contextA.getPackageName());
        requestHeader.setAppId(strValueOf);
        requestHeader.setCertificateFingerprint(strA);
        d dVar = d.f60011b;
        requestHeader.setPushToken(dVar.b(contextA));
        synchronized (dVar) {
            dVar.a(contextA);
            SharedPreferences sharedPreferences = d.f60010a.f60041a;
            string = sharedPreferences != null ? sharedPreferences.getString("key_aaid", "") : "";
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                d.f60010a.a("key_aaid", string);
            }
        }
        requestHeader.setAAID(string);
        requestHeader.setSdkVersion(70061303);
        return requestHeader;
    }

    public static <TResult> a1<TResult> a(Callable<TResult> callable) {
        ExecutorService executorService = o0.f60063c.f60065b;
        n0 n0Var = new n0();
        try {
            executorService.execute(new z0(n0Var, callable));
        } catch (Exception e10) {
            n0Var.a(e10);
        }
        return n0Var.f60061a;
    }

    public static RemoteServiceBean a(Context context) {
        RemoteServiceBean remoteServiceBean = new RemoteServiceBean();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("android", "com.hihonor.android.pushagentproxy.HiPushService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (listQueryIntentServices.size() > 0) {
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                String str = next.serviceInfo.applicationInfo.packageName;
                String strA = a(context, str);
                remoteServiceBean.setPackageName(str);
                remoteServiceBean.setPackageServiceName(next.serviceInfo.name);
                remoteServiceBean.setPackageSignature(strA);
            }
        }
        return remoteServiceBean;
    }

    public static ApiException a(Exception exc) {
        if (exc.getCause() instanceof ApiException) {
            return (ApiException) exc.getCause();
        }
        return exc instanceof ApiException ? (ApiException) exc : new ApiException(-1, exc.getMessage());
    }

    public static <TResult> TResult a(a1<TResult> a1Var) throws ExecutionException, InterruptedException {
        boolean z10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        synchronized (a1Var.f60000a) {
            z10 = a1Var.f60001b;
        }
        if (!z10) {
            y0 y0Var = new y0();
            o0 o0Var = o0.f60063c;
            a1Var.a(new x0(o0Var.f60064a, y0Var)).a(new v0(o0Var.f60064a, y0Var)).a(new r0(o0Var.f60064a, y0Var));
            y0Var.f60107a.await();
        }
        if (a1Var.e()) {
            return a1Var.c();
        }
        throw new ExecutionException(a1Var.b());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0037 -> B:18:0x0038). Please report as a decompilation issue!!! */
    public static String a(Context context, String str) {
        Signature[] apkContentsSigners;
        String string;
        SigningInfo signingInfo;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo == null || (signingInfo = packageInfo.signingInfo) == null) {
                    apkContentsSigners = null;
                } else {
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                }
            } else {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
                if (packageInfo2 != null) {
                    apkContentsSigners = packageInfo2.signatures;
                } else {
                    apkContentsSigners = null;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (apkContentsSigners != null && apkContentsSigners.length > 0) {
            for (Signature signature : apkContentsSigners) {
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : bArrDigest) {
                        String upperCase = Integer.toHexString(b10 & 255).toUpperCase(Locale.ENGLISH);
                        if (upperCase.length() == 1) {
                            sb2.append("0");
                        }
                        sb2.append(upperCase);
                    }
                    string = sb2.toString();
                } catch (NoSuchAlgorithmException unused2) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    public static String a(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static void a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e10) {
            c.a("DeflateUtil", "close", e10);
        }
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(StandardCharsets.UTF_8);
            for (int i10 = 0; i10 < length; i10++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                int i11 = i10 * 2;
                sb2.append(new String(new byte[]{bytes[i11]}, StandardCharsets.UTF_8));
                bArr[i10] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i11 + 1]}, StandardCharsets.UTF_8)).byteValue());
            }
        } catch (NumberFormatException e10) {
            e10.getMessage();
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, int i10) {
        if (bArr == null) {
            return bArr;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (i10 < 0) {
                bArr[i11] = (byte) (bArr[i11] << (-i10));
            } else {
                bArr[i11] = (byte) (bArr[i11] >> i10);
            }
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (bArr != null) {
            int length = bArr.length;
            if (bArr2.length != length) {
                return null;
            }
            bArr3 = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            }
        }
        return bArr3;
    }

    public static int b(Context context) {
        HonorApiAvailability$PackageStates honorApiAvailability$PackageStates;
        if (context == null) {
            throw new NullPointerException("context must not be null.");
        }
        RemoteServiceBean remoteServiceBeanA = a(context);
        String packageName = remoteServiceBeanA.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            honorApiAvailability$PackageStates = HonorApiAvailability$PackageStates.NOT_INSTALLED;
        } else {
            try {
                honorApiAvailability$PackageStates = context.getPackageManager().getApplicationInfo(packageName, 0).enabled ? HonorApiAvailability$PackageStates.ENABLED : HonorApiAvailability$PackageStates.DISABLED;
            } catch (PackageManager.NameNotFoundException unused) {
                honorApiAvailability$PackageStates = HonorApiAvailability$PackageStates.NOT_INSTALLED;
            }
        }
        if (HonorApiAvailability$PackageStates.NOT_INSTALLED.equals(honorApiAvailability$PackageStates)) {
            Log.i("HonorApiAvailability", "push service is not installed");
            return 8002008;
        }
        if (HonorApiAvailability$PackageStates.DISABLED.equals(honorApiAvailability$PackageStates)) {
            Log.i("HonorApiAvailability", "push service is disabled");
            return 8002007;
        }
        if (!TextUtils.equals(packageName, "android") || TextUtils.isEmpty(remoteServiceBeanA.getPackageSignature())) {
            return 8002006;
        }
        return HonorPushErrorEnum.SUCCESS.statusCode;
    }
}
