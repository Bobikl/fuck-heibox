package com.tencent.connect.auth;

import com.tencent.tauth.IUiListener;
import java.util.HashMap;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f99347a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f99348d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f99349e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, a> f99350b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99351c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /* JADX INFO: compiled from: ProGuard */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IUiListener f99352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.tencent.connect.auth.a f99353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f99354c;
    }

    public static b a() {
        if (f99347a == null) {
            f99347a = new b();
        }
        return f99347a;
    }

    public static int b() {
        int i10 = f99349e + 1;
        f99349e = i10;
        return i10;
    }

    public String a(a aVar) {
        int iB = b();
        try {
            this.f99350b.put("" + iB, aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return "" + iB;
    }

    public String c() {
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < iCeil; i10++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        return stringBuffer.toString();
    }
}
