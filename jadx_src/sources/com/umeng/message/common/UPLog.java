package com.umeng.message.common;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import bb.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.b;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.p;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UPLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f105570a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f105571b = new p();

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "UPush";
        }
        return (str.startsWith("NAccs") || str.startsWith("awcn") || str.startsWith("anet")) ? str : "UPush.".concat(str);
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(objArr[0]);
        for (int i10 = 1; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                sb2.append(" ");
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    private static void a(int i10, String str, String str2) {
        if (str2 == null) {
            return;
        }
        while (str2.length() > 3072) {
            b(i10, str, str2.substring(0, c.d.f31193dj));
            str2 = str2.substring(c.d.f31193dj);
        }
        if (str2.length() > 0) {
            b(i10, str, str2);
        }
    }

    private static void b(int i10, String str, String str2) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Log.println(i10, a(str), str2);
                break;
        }
    }

    public static void d(String str, Object... objArr) {
        if (isEnable()) {
            a(3, str, a(objArr));
        }
    }

    public static void e(String str, Throwable th2) {
        if (isEnable()) {
            e(str, th2.getMessage() + "\n" + getStackTrace(th2));
        }
    }

    public static void e(String str, Object... objArr) {
        if (isEnable()) {
            a(6, str, a(objArr));
        }
        p pVar = f105571b;
        if (pVar.a()) {
            pVar.a(6, a(str), a(objArr));
        }
    }

    public static String getStackTrace(Throwable th2) {
        return Log.getStackTraceString(th2);
    }

    public static void i(String str, Object... objArr) {
        if (isEnable()) {
            a(4, str, a(objArr));
        }
        p pVar = f105571b;
        if (pVar.a()) {
            pVar.a(4, a(str), a(objArr));
        }
    }

    public static boolean isEnable() {
        return f105570a;
    }

    public static void setEnable(boolean z10) {
        f105570a = z10;
    }

    public static void upload() {
        if (f.f105796b) {
            final p pVar = f105571b;
            if (pVar.f105833b) {
                return;
            }
            final p.b bVar = new p.b();
            b.b(new Runnable() { // from class: com.umeng.message.proguard.p.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    Application applicationA = x.a();
                    if (UMUtils.isMainProgress(applicationA)) {
                        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA);
                        String strC = messageSharedPrefs.c();
                        if (TextUtils.isEmpty(strC)) {
                            UPLog.d("Log", "init skipped.");
                            return;
                        }
                        String strK = messageSharedPrefs.k();
                        String strE = d.e(applicationA);
                        if (TextUtils.isEmpty(strK) && TextUtils.isEmpty(strE)) {
                            UPLog.d("Log", "id skipped.");
                            return;
                        }
                        if (!messageSharedPrefs.a("l_u_q")) {
                            UPLog.d("Log", "req skipped.");
                            return;
                        }
                        JSONObject jSONObjectA = b.a(strC, strK, strE);
                        long jMax = 86400;
                        if (jSONObjectA != null) {
                            zOptBoolean = jSONObjectA.optBoolean("enable");
                            jMax = Math.max(60L, jSONObjectA.optLong(com.umeng.analytics.pro.ak.aT, 86400L));
                        } else {
                            zOptBoolean = false;
                        }
                        boolean zL = messageSharedPrefs.l();
                        messageSharedPrefs.f105562b.a("l_u_e", zOptBoolean);
                        messageSharedPrefs.a("l_u_q", jMax);
                        if (zOptBoolean) {
                            com.umeng.message.proguard.b.a(new Runnable() { // from class: com.umeng.message.proguard.p.b.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        b bVar2 = b.this;
                                        Application applicationA2 = x.a();
                                        File file = new File(applicationA2.getFilesDir(), ".upush_log");
                                        File file2 = new File(file, new SimpleDateFormat("yyMMddHHmmssSSS", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
                                        try {
                                            bVar2.a(file, file2);
                                            if (file2.length() < 512) {
                                                UPLog.d("Log", "len small skipped! ", Long.valueOf(file2.length()));
                                                az.a(file2.getPath());
                                                return;
                                            }
                                            if (file2.length() > 1048576) {
                                                UPLog.d("Log", "len large skipped! ", Long.valueOf(file2.length()));
                                                az.a(file2.getPath());
                                                return;
                                            }
                                            String messageAppkey = PushAgent.getInstance(applicationA2).getMessageAppkey();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("appkey", messageAppkey);
                                            jSONObject.put("utdid", d.o(applicationA2));
                                            jSONObject.put("umid", d.k(applicationA2));
                                            jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, PushAgent.getInstance(applicationA2).getRegistrationId());
                                            jSONObject.put("md5", UMUtils.getFileMD5(file2));
                                            jSONObject.put("ts", System.currentTimeMillis());
                                            jSONObject.put("app_v", d.b(applicationA2));
                                            jSONObject.put("sdk_v", MsgConstant.SDK_VERSION);
                                            jSONObject.put("os_v", Build.VERSION.RELEASE);
                                            jSONObject.put("brand", d.f());
                                            jSONObject.put(Constants.KEY_MODEL, d.d());
                                            jSONObject.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, d.e(applicationA2));
                                            jSONObject.put(com.umeng.analytics.pro.ak.f104429al, UMUtils.getZid(applicationA2));
                                            jSONObject.put("os_i", Build.VERSION.SDK_INT);
                                            g.a(jSONObject, "https://offmsg.umeng.com/log/upload", messageAppkey, file2);
                                            az.a(file2.getPath());
                                        } catch (Throwable th2) {
                                            try {
                                                UPLog.d("Log", UPLog.getStackTrace(th2));
                                            } finally {
                                                az.a(file2.getPath());
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        UPLog.d("Log", UPLog.getStackTrace(th3));
                                    }
                                }
                            }, zL ? 0L : 1L, TimeUnit.MINUTES);
                        } else {
                            UPLog.d("Log", "enable skipped.");
                        }
                        pVar.f105832a = Boolean.valueOf(zOptBoolean);
                    }
                }
            });
            pVar.f105833b = true;
        }
    }

    public static void w(String str, Throwable th2) {
        if (isEnable()) {
            w(str, th2.getMessage() + "\n" + getStackTrace(th2));
        }
    }

    public static void w(String str, Object... objArr) {
        if (isEnable()) {
            a(5, str, a(objArr));
        }
        p pVar = f105571b;
        if (pVar.a()) {
            pVar.a(5, a(str), a(objArr));
        }
    }
}
