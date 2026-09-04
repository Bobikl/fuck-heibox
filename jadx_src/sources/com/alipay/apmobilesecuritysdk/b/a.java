package com.alipay.apmobilesecuritysdk.b;

import u4.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f38168b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38169a = 0;

    public static a a() {
        return f38168b;
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    public final void a(int i10) {
        this.f38169a = i10;
    }

    public final int b() {
        return this.f38169a;
    }

    public final String c() {
        String str;
        String strA = d.a();
        if (e6.a.f(strA)) {
            return strA;
        }
        int i10 = this.f38169a;
        if (i10 == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i10 == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i10 == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i10 != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }
}
