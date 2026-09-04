package com.tencent.open.b;

import com.tencent.open.utils.m;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static e f101051a;

    protected e() {
    }

    public static synchronized e a() {
        if (f101051a == null) {
            f101051a = new e();
        }
        return f101051a;
    }

    public void a(int i10, String str, String str2, String str3, String str4, Long l10, int i11, int i12, String str5) {
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        h.a().a(m.a(str, str3, str4, str5, str2, str6), str2, true);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        h.a().a(m.a(str, str4, str5, str3, str2, str6, "", str7, str8, "", "", ""), str2, false);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        h.a().a(m.a(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
