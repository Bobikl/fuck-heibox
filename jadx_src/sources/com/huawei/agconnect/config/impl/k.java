package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f60148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f60149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f60150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f60152e;

    k(Context context, String str) {
        super(context, str);
        this.f60148a = new HashMap();
        this.f60149b = new Object();
        this.f60151d = true;
        this.f60152e = str;
        try {
            String strA = a("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138");
            String strA2 = a("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C");
            String strA3 = a("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B");
            String strA4 = a("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD");
            if (strA == null || strA2 == null || strA3 == null || strA4 == null) {
                this.f60151d = false;
            } else {
                this.f60150c = new f(strA, strA2, strA3, strA4);
            }
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("SecurityResourcesReader", "Exception when reading the 'K&I' for 'Config'.");
            this.f60150c = null;
        }
    }

    private String a(String str) {
        return super.a(str, null);
    }

    @Override // com.huawei.agconnect.config.impl.j, com.huawei.agconnect.config.impl.d
    public String a(String str, String str2) {
        if (!this.f60151d) {
            String strA = a(str);
            return strA != null ? strA : str2;
        }
        if (this.f60150c == null) {
            Log.e("SecurityResourcesReader", "KEY is null return def directly");
            return str2;
        }
        synchronized (this.f60149b) {
            String str3 = this.f60148a.get(str);
            if (str3 != null) {
                return str3;
            }
            String strA2 = a(str);
            if (strA2 == null) {
                return str2;
            }
            String strA3 = this.f60150c.a(strA2, str2);
            this.f60148a.put(str, strA3);
            return strA3;
        }
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=" + this.f60151d + '}';
    }
}
