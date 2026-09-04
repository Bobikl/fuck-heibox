package com.tencent.qimei.m;

import android.content.Context;
import com.tencent.qimei.beaconid.U;

/* JADX INFO: compiled from: LocalStorage.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101285a;

    /* JADX INFO: compiled from: LocalStorage.java */
    public interface a {
        void a(byte b10);
    }

    /* JADX INFO: renamed from: com.tencent.qimei.m.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalStorage.java */
    public static final class C0980b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f101286a = new b();
    }

    public b() {
    }

    public static b b() {
        return C0980b.f101286a;
    }

    public String a(a aVar) {
        byte[] bArrA;
        if (this.f101285a && (bArrA = U.a(System.currentTimeMillis())) != null) {
            if (bArrA.length > 1) {
                byte b10 = bArrA[0];
                if (b10 != 0) {
                    if (aVar != null) {
                        aVar.a(b10);
                    }
                    return "";
                }
                byte[] bArr = new byte[bArrA.length - 1];
                for (int i10 = 1; i10 < bArrA.length; i10++) {
                    bArr[i10 - 1] = bArrA[i10];
                }
                return new String(bArr);
            }
        }
        return "";
    }

    public final void a() {
        if (!this.f101285a) {
            throw new RuntimeException("LocalStorage has not been initiated.");
        }
    }

    public boolean a(Context context, String str) {
        if (this.f101285a) {
            return true;
        }
        boolean zA = U.a(context, str);
        this.f101285a = zA;
        com.tencent.qimei.n.a.b("SDK_INIT ｜ 本地加密", " 初始化完成（%b）,文件名:%s ", Boolean.valueOf(zA), str);
        return this.f101285a;
    }

    public boolean a(String str) {
        a();
        return U.a(str, System.currentTimeMillis()) == 0;
    }
}
