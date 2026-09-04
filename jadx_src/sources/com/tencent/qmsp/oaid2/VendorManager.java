package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class VendorManager implements IVendorCallback {
    public b vendorInfo = null;
    public IVendorCallback userCallback = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101554a;

        static {
            int[] iArr = new int[d.values().length];
            f101554a = iArr;
            try {
                iArr[d.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101554a[d.BLACKSHARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101554a[d.VIVO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101554a[d.HUA_WEI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101554a[d.OPPO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101554a[d.ONEPLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101554a[d.MOTO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101554a[d.LENOVO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f101554a[d.ASUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f101554a[d.SAMSUNG.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f101554a[d.MEIZU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f101554a[d.ALPS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f101554a[d.NUBIA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f101554a[d.ZTE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f101554a[d.FREEMEOS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f101554a[d.SSUIOS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public int getVendorInfo(Context context, IVendorCallback iVendorCallback) {
        this.userCallback = iVendorCallback;
        d dVarA = d.a(Build.MANUFACTURER);
        if (dVarA == d.UNSUPPORT) {
            onResult(false, "null", "null");
            return com.tencent.qmsp.oaid2.a.f101555a;
        }
        switch (a.f101554a[dVarA.ordinal()]) {
            case 1:
            case 2:
                this.vendorInfo = new n0();
                break;
            case 3:
                this.vendorInfo = new m0();
                break;
            case 4:
                this.vendorInfo = new l();
                break;
            case 5:
            case 6:
                this.vendorInfo = new f0();
                break;
            case 7:
            case 8:
                this.vendorInfo = new o();
                break;
            case 9:
                this.vendorInfo = new h();
                break;
            case 10:
                this.vendorInfo = new k0();
                break;
            case 11:
            case 12:
                this.vendorInfo = new a0();
                break;
            case 13:
                this.vendorInfo = new b0();
                break;
            case 14:
            case 15:
            case 16:
                this.vendorInfo = new u();
                break;
        }
        if (this.vendorInfo == null) {
            onResult(false, "null", "null");
            return com.tencent.qmsp.oaid2.a.f101556b;
        }
        c.b(lg.a.f131415h);
        try {
            this.vendorInfo.a(context, this);
            if (this.vendorInfo.k()) {
                c.b("sync");
                try {
                    onResult(this.vendorInfo.e(), this.vendorInfo.d(), this.vendorInfo.a());
                } catch (Exception unused) {
                    onResult(false, "null", "null");
                }
            } else {
                try {
                    this.vendorInfo.j();
                } catch (Exception unused2) {
                    onResult(false, "null", "null");
                    return com.tencent.qmsp.oaid2.a.f101557c;
                }
            }
            return 0;
        } catch (Exception unused3) {
            onResult(false, "null", "null");
            return com.tencent.qmsp.oaid2.a.f101557c;
        }
    }

    @Override // com.tencent.qmsp.oaid2.IVendorCallback
    public void onResult(boolean z10, String str, String str2) {
        c.c("vm onResult " + z10);
        IVendorCallback iVendorCallback = this.userCallback;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(z10, str, str2);
        }
        b bVar = this.vendorInfo;
        if (bVar != null) {
            bVar.l();
        }
    }
}
