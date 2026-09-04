package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Boolean f107779a;

    public static int a(Context context, jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        return a(context, jjVar.f751b, (jaVarM564a == null || jaVarM564a.m531a() == null) ? null : jaVarM564a.m531a().get("channel_id"));
    }

    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static int a(Context context, String str) {
        int i10;
        int iA;
        int i11 = 0;
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        g.b bVarA = g.a(context, str, true);
        if (bVarA == g.b.ALLOWED) {
            i11 = 1;
        } else if (bVarA == g.b.NOT_ALLOWED) {
            i11 = 2;
        }
        if (m633a()) {
            Bundle bundleM748a = com.xiaomi.push.service.f.m748a(str, (String) null);
            if (bundleM748a.containsKey("canShowBadge")) {
                i11 |= bundleM748a.getBoolean("canShowBadge") ? 4 : 8;
            }
            if (bundleM748a.containsKey("canShowOnKeyguard")) {
                i11 |= bundleM748a.getBoolean("canShowOnKeyguard") ? 16 : 32;
            }
            if (bundleM748a.containsKey("canShowFloat")) {
                i11 |= bundleM748a.getBoolean("canShowFloat") ? 64 : 128;
            }
            if (bundleM748a.containsKey("canSound")) {
                i11 |= bundleM748a.getBoolean("canSound") ? 256 : 512;
            }
            if (bundleM748a.containsKey("canVibrate")) {
                i11 |= bundleM748a.getBoolean("canVibrate") ? 1024 : 2048;
            }
            if (bundleM748a.containsKey("canShowOngoing")) {
                return (bundleM748a.getBoolean("canShowOngoing") ? 4096 : 8192) | i11;
            }
            return i11;
        }
        int iA2 = com.xiaomi.push.service.f.a(str, (String) null, 32);
        if (iA2 == 1) {
            i11 |= 4;
        } else if (iA2 == 0) {
            i11 |= 8;
        }
        int iA3 = com.xiaomi.push.service.f.a(str, (String) null, 16);
        if (iA3 == 1) {
            i11 |= 16;
        } else if (iA3 == 0) {
            i11 |= 32;
        }
        int iA4 = com.xiaomi.push.service.f.a(str, (String) null, 8);
        if (iA4 == 1) {
            i11 |= 64;
        } else if (iA4 == 0) {
            i11 |= 128;
        }
        int iA5 = com.xiaomi.push.service.f.a(str, (String) null, 1);
        if (iA5 == 1) {
            i11 |= 256;
        } else if (iA5 == 0) {
            i11 |= 512;
        }
        int iA6 = com.xiaomi.push.service.f.a(str, (String) null, 2);
        if (iA6 != 1) {
            if (iA6 == 0) {
                i10 = i11 | 2048;
            }
            iA = com.xiaomi.push.service.f.a(str, (String) null, 64);
            if (iA == 1) {
                return i11 | 4096;
            }
            if (iA == 0) {
                return i11 | 8192;
            }
            return i11;
        }
        i10 = i11 | 1024;
        i11 = i10;
        iA = com.xiaomi.push.service.f.a(str, (String) null, 64);
        if (iA == 1) {
            return i11 | 4096;
        }
        if (iA == 0) {
            return i11 | 8192;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    public static int a(Context context, String str, NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || notificationChannel == null) {
            return 0;
        }
        int i10 = (notificationChannel.getImportance() != 0 ? 1 : 2) | 0;
        if (m633a()) {
            Bundle bundleM748a = com.xiaomi.push.service.f.m748a(str, notificationChannel.getId());
            if (bundleM748a.containsKey("canShowFloat")) {
                i10 |= (!bundleM748a.getBoolean("canShowFloat") || notificationChannel.getImportance() < 4) ? 8 : 4;
            }
            if (bundleM748a.containsKey("canShowOnKeyguard")) {
                i10 |= bundleM748a.getBoolean("canShowOnKeyguard") ? 16 : 32;
            }
        } else {
            int iA = com.xiaomi.push.service.f.a(str, notificationChannel.getId(), 8);
            if (iA == 1) {
                if (notificationChannel.getImportance() >= 4) {
                    i10 |= 4;
                } else {
                    i10 |= 8;
                }
            } else if (iA == 0) {
                i10 |= 8;
            }
            int iA2 = com.xiaomi.push.service.f.a(str, notificationChannel.getId(), 16);
            if (iA2 == 1) {
                i10 |= 16;
            } else if (iA2 == 0) {
                i10 |= 32;
            }
        }
        return (notificationChannel.getSound() != null ? i10 | 64 : i10 | 128) | (notificationChannel.shouldVibrate() ? 256 : 512);
    }

    private static int a(Context context, String str, String str2) {
        com.xiaomi.push.service.aw awVarA;
        NotificationChannel notificationChannelM714a;
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || (awVarA = com.xiaomi.push.service.aw.a(context, str)) == null || (notificationChannelM714a = awVarA.m714a(awVarA.m717a(str2))) == null) {
            return 0;
        }
        int i10 = (notificationChannelM714a.getImportance() != 0 ? 1 : 2) + 0;
        int iA = com.xiaomi.push.service.f.a(str, notificationChannelM714a.getId(), 8);
        if (iA == 1) {
            i10 += 4;
        } else if (iA == 0) {
            i10 += 8;
        }
        int i11 = i10;
        int iA2 = com.xiaomi.push.service.f.a(str, notificationChannelM714a.getId(), 16);
        if (iA2 == 1) {
            return i11 + 16;
        }
        return iA2 == 0 ? i11 + 32 : i11;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static short m630a(Context context, jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        return m632a(context, jjVar.f751b, (jaVarM564a == null || jaVarM564a.m531a() == null) ? null : jaVarM564a.m531a().get("channel_id"));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static short m631a(Context context, String str) {
        return m632a(context, str, (String) null);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static short m632a(Context context, String str, String str2) {
        return (short) (g.a(context, str, false).a() + 0 + (ag.b(context) ? 4 : 0) + (ag.a(context) ? 8 : 0) + (com.xiaomi.push.service.aw.m712a(context) ? 16 : 0) + b(context, str, str2));
    }

    public static void a() {
        f107779a = null;
    }

    public static <T extends jy<T, ?>> void a(T t10, byte[] bArr) {
        if (bArr == null) {
            throw new kd("the message byte is empty.");
        }
        new kc(new kp.a(true, true, bArr.length)).a(t10, bArr);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m633a() {
        Bundle bundleM748a;
        if (f107779a == null) {
            if (Build.VERSION.SDK_INT < 30 || (bundleM748a = com.xiaomi.push.service.f.m748a("com.xiaomi.xmsf", (String) null)) == null || bundleM748a.isEmpty()) {
                f107779a = new Boolean(false);
            } else {
                f107779a = new Boolean(true);
            }
        }
        return f107779a.booleanValue();
    }

    public static <T extends jy<T, ?>> byte[] a(T t10) {
        if (t10 == null) {
            return null;
        }
        try {
            return new ke(new kf.a()).a(t10);
        } catch (kd e10) {
            com.xiaomi.channel.commonutils.logger.b.a("convertThriftObjectToBytes catch TException.", e10);
            return null;
        }
    }

    private static int b(Context context, String str, String str2) {
        com.xiaomi.push.service.aw awVarA;
        NotificationChannel notificationChannelM714a;
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || (awVarA = com.xiaomi.push.service.aw.a(context, str)) == null || (notificationChannelM714a = awVarA.m714a(awVarA.m717a(str2))) == null) {
            return 0;
        }
        return notificationChannelM714a.getImportance() != 0 ? 32 : 64;
    }
}
