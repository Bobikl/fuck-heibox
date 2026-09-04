package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: compiled from: EncryptHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f105031a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f105032b = "umeng+";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f105033c = "ek__id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f105034d = "ek_key";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f105035e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f105036f = "umeng_subprocess_info";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f105037g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f105038h;

    private a() {
    }

    public static a a() {
        if (f105038h == null) {
            synchronized (a.class) {
                if (f105038h == null) {
                    f105038h = new a();
                }
            }
        }
        return f105038h;
    }

    private String c(String str) {
        String string = "";
        try {
            String strSubstring = str.substring(1, 9);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < strSubstring.length(); i10++) {
                char cCharAt = strSubstring.charAt(i10);
                if (!Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                    sb2.append(0);
                } else {
                    sb2.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                }
            }
            string = sb2.toString();
            return string + new StringBuilder(string).reverse().toString();
        } catch (Throwable unused) {
            return string;
        }
    }

    public String a(String str) {
        try {
            return TextUtils.isEmpty(f105031a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f105031a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(Context context) {
        try {
            if (TextUtils.isEmpty(f105031a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, f105033c);
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f105035e = c(multiProcessSP);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f105035e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f105036f, 0);
                if (sharedPreferences != null) {
                    f105037g = sharedPreferences.getString(f105033c, null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f105037g);
                }
                f105031a = c(UMUtils.genId());
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f105031a);
            }
        } catch (Throwable unused) {
        }
    }

    public String b(String str) {
        String str2 = null;
        try {
            if (!TextUtils.isEmpty(f105031a)) {
                str = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f105031a.getBytes()));
            }
            return str;
        } catch (Exception unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            if (TextUtils.isEmpty(f105035e)) {
                return null;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                String str3 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f105035e.getBytes()));
                try {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                    return str3;
                } catch (Exception unused2) {
                    str2 = str3;
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                    try {
                        String str4 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f105037g.getBytes()));
                        try {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                            return str4;
                        } catch (Throwable unused3) {
                            str2 = str4;
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                            return str2;
                        }
                    } catch (Throwable unused4) {
                    }
                }
            } catch (Exception unused5) {
            }
        }
    }
}
