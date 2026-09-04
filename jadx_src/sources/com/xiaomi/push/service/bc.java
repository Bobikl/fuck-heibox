package com.xiaomi.push.service;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f107907a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f1032a = "";

    public static String a() {
        if (TextUtils.isEmpty(f1032a)) {
            f1032a = com.xiaomi.push.bp.a(4);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f1032a);
        long j10 = f107907a;
        f107907a = 1 + j10;
        sb2.append(j10);
        return sb2.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("Exception occurred when filtering registration packet id for log. " + e10);
            return "UnexpectedId";
        }
    }

    public static String b() {
        return com.xiaomi.push.bp.a(32);
    }
}
