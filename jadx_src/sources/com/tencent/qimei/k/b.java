package com.tencent.qimei.k;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: BeaconSharedPrefs.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f101259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f101260b = {33, 94, org.apache.tools.tar.c.Q, 74, 111, 43, 35};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f101261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f101262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lock f101263e = new ReentrantLock();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f101264f = new a(this);

    public b() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        if (contextF != null) {
            this.f101261c = contextF.getSharedPreferences("DENGTA_META", 0);
        }
    }

    public static String a(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        int length = 0;
        for (int i10 = 0; i10 < bArrDecode.length; i10++) {
            byte b10 = bArrDecode[i10];
            byte[] bArr = f101260b;
            bArrDecode[i10] = (byte) (b10 ^ bArr[length]);
            length = (length + 1) % bArr.length;
        }
        return new String(bArrDecode, Charset.defaultCharset());
    }

    public static synchronized b b() {
        if (f101259a == null) {
            f101259a = new b();
        }
        return f101259a;
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = 0;
        for (int i10 = 0; i10 < bytes.length; i10++) {
            byte b10 = bytes[i10];
            byte[] bArr = f101260b;
            bytes[i10] = (byte) (b10 ^ bArr[length]);
            length = (length + 1) % bArr.length;
        }
        return Base64.encodeToString(bytes, 2);
    }

    public synchronized String a(String str, String str2) {
        return this.f101261c.getString(str, str2);
    }

    public synchronized String a(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = this.f101261c;
        String string = sharedPreferences.getString(str, "");
        if (string != null && !string.trim().equals("")) {
            sharedPreferences.edit().remove(str).putString(str2, b(string)).commit();
            return string;
        }
        String string2 = sharedPreferences.getString(str2, "");
        if (string2 == null || string2.trim().equals("")) {
            return str3;
        }
        return a(string2);
    }

    public final synchronized void a() {
        if (this.f101263e.tryLock()) {
            this.f101262d.commit();
            this.f101263e.unlock();
        }
    }
}
