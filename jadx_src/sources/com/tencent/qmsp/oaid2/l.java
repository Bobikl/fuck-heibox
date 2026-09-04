package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IVendorCallback f101627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101628c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f101629d = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a aVarA = j.a(l.this.f101626a);
                l.this.f101628c = aVarA.a();
                aVarA.b();
                if (!TextUtils.isEmpty(l.this.f101628c)) {
                    l.this.f101629d = true;
                }
                if (l.this.f101627b != null) {
                    IVendorCallback iVendorCallback = l.this.f101627b;
                    boolean z10 = l.this.f101629d;
                    l lVar = l.this;
                    iVendorCallback.onResult(z10, lVar.a(e.a(lVar.f101626a)), l.this.f101628c);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (TextUtils.isEmpty(l.this.f101628c)) {
                    l.this.f101629d = false;
                }
                if (l.this.f101627b != null) {
                    IVendorCallback iVendorCallback2 = l.this.f101627b;
                    boolean z11 = l.this.f101629d;
                    l lVar2 = l.this;
                    iVendorCallback2.onResult(z11, lVar2.a(e.a(lVar2.f101626a)), l.this.f101628c);
                }
            }
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        return this.f101628c;
    }

    public final String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return b("0x1008611" + str + "0xdzfdweiwu");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101626a = context;
        this.f101627b = iVendorCallback;
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b10 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        return a(e.a(this.f101626a));
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
        new Thread(new a()).start();
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
    }
}
