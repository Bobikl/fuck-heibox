package com.tencent.qmsp.sdk.g.b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.f;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.qmsp.sdk.base.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f101963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IVendorCallback f101964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f101965c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f101966d = false;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.tencent.qmsp.sdk.g.b.a.C0998a c0998aA = com.tencent.qmsp.sdk.g.b.a.a(c.this.f101963a);
                c.this.f101965c = c0998aA.a();
                c0998aA.b();
                if (!TextUtils.isEmpty(c.this.f101965c)) {
                    c.this.f101966d = true;
                }
                if (c.this.f101964b != null) {
                    IVendorCallback iVendorCallback = c.this.f101964b;
                    boolean z10 = c.this.f101966d;
                    c cVar = c.this;
                    iVendorCallback.onResult(z10, cVar.a(f.a(cVar.f101963a)), c.this.f101965c);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (TextUtils.isEmpty(c.this.f101965c)) {
                    c.this.f101966d = false;
                }
                if (c.this.f101964b != null) {
                    IVendorCallback iVendorCallback2 = c.this.f101964b;
                    boolean z11 = c.this.f101966d;
                    c cVar2 = c.this;
                    iVendorCallback2.onResult(z11, cVar2.a(f.a(cVar2.f101963a)), c.this.f101965c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0x1008611");
            sb2.append(str);
            sb2.append("0xdzfdweiwu");
            return b(sb2.toString());
        } catch (Exception unused) {
            return "";
        }
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b10 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("0");
                    sb2.append(hexString);
                    hexString = sb2.toString();
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        return this.f101965c;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101963a = context;
        this.f101964b = iVendorCallback;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        return a(f.a(this.f101963a));
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
        new Thread(new a()).start();
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
    }
}
