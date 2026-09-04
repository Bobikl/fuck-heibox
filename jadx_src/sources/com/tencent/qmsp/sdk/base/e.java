package com.tencent.qmsp.sdk.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class e implements IVendorCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f101757c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f101758d = com.tencent.qmsp.sdk.c.b.f101769a + "b2FpZA";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f101759e = com.tencent.qmsp.sdk.c.b.f101769a + "b2FpZA";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f101760f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f101761a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IVendorCallback f101762b = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f101763a;

        static {
            int[] iArr = new int[d.values().length];
            f101763a = iArr;
            try {
                iArr[d.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101763a[d.BLACKSHARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101763a[d.VIVO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101763a[d.HUA_WEI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101763a[d.OPPO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101763a[d.ONEPLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101763a[d.MOTO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101763a[d.LENOVO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f101763a[d.ASUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f101763a[d.SAMSUNG.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f101763a[d.MEIZU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f101763a[d.ALPS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f101763a[d.NUBIA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f101763a[d.ZTE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f101763a[d.FREEMEOS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f101763a[d.SSUIOS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static String a(Context context, String str, int i10) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f101758d, 0);
            String string = sharedPreferences.getString(f101759e, null);
            String str3 = !TextUtils.isEmpty(string) ? new String(Base64.decode(string.getBytes("UTF-8"), 0)) : null;
            if (i10 == 1) {
                try {
                    if (f101757c) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(f101759e, TextUtils.isEmpty(str) ? null : Base64.encodeToString(str.getBytes("UTF-8"), 0));
                        editorEdit.commit();
                    }
                } catch (Exception e10) {
                    e = e10;
                    str2 = str3;
                    e.printStackTrace();
                    return str2;
                }
            }
            return str3;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                context.getSharedPreferences(f101758d, 0).edit().clear().commit();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(Context context, boolean z10, boolean z11) {
        f101757c = z10;
        f101760f = context;
        c.a(z11);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public int a(IVendorCallback iVendorCallback) {
        b aVar;
        this.f101762b = iVendorCallback;
        d dVarA = d.a(Build.MANUFACTURER);
        if (dVarA == d.UNSUPPORT) {
            onResult(false, null, null);
            return com.tencent.qmsp.sdk.base.a.f101733a;
        }
        switch (a.f101763a[dVarA.ordinal()]) {
            case 1:
            case 2:
                aVar = new com.tencent.qmsp.sdk.g.j.a();
                break;
            case 3:
                aVar = new com.tencent.qmsp.sdk.g.i.b();
                break;
            case 4:
                aVar = new com.tencent.qmsp.sdk.g.b.c();
                break;
            case 5:
            case 6:
                aVar = new com.tencent.qmsp.sdk.g.g.c();
                break;
            case 7:
            case 8:
                aVar = new com.tencent.qmsp.sdk.g.c.b();
                break;
            case 9:
                aVar = new com.tencent.qmsp.sdk.g.a.c();
                break;
            case 10:
                aVar = new com.tencent.qmsp.sdk.g.h.c();
                break;
            case 11:
            case 12:
                aVar = new com.tencent.qmsp.sdk.g.e.f();
                break;
            case 13:
                aVar = new com.tencent.qmsp.sdk.g.f.a();
                break;
            case 14:
            case 15:
            case 16:
                aVar = new com.tencent.qmsp.sdk.g.d.e();
                break;
            default:
                if (this.f101761a == null) {
                    c.b("vendorInfo == null");
                    onResult(false, null, null);
                    return com.tencent.qmsp.sdk.base.a.f101734b;
                }
                c.b(lg.a.f131415h);
                try {
                    this.f101761a.a(f101760f, this);
                    if (!this.f101761a.d()) {
                        try {
                            this.f101761a.c();
                        } catch (Exception unused) {
                            onResult(false, null, null);
                            return com.tencent.qmsp.sdk.base.a.f101735c;
                        }
                        break;
                    } else {
                        c.b("sync");
                        try {
                            onResult(this.f101761a.e(), this.f101761a.b(), this.f101761a.a());
                        } catch (Exception unused2) {
                            onResult(false, null, null);
                        }
                        break;
                    }
                    return 0;
                } catch (Exception unused3) {
                    onResult(false, null, null);
                    return com.tencent.qmsp.sdk.base.a.f101735c;
                }
        }
        this.f101761a = aVar;
        if (this.f101761a == null) {
            c.b("vendorInfo == null");
            onResult(false, null, null);
            return com.tencent.qmsp.sdk.base.a.f101734b;
        }
        c.b(lg.a.f131415h);
        this.f101761a.a(f101760f, this);
        if (!this.f101761a.d()) {
            this.f101761a.c();
        } else {
            c.b("sync");
            onResult(this.f101761a.e(), this.f101761a.b(), this.f101761a.a());
        }
        return 0;
    }

    @Override // com.tencent.qmsp.sdk.base.IVendorCallback
    public void onResult(boolean z10, String str, String str2) {
        c.c("vm onResult " + z10);
        if (TextUtils.isEmpty(str2)) {
            str2 = a(f101760f, (String) null, 0);
        } else {
            a(f101760f, str2, 1);
        }
        IVendorCallback iVendorCallback = this.f101762b;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(z10, str, str2);
        }
        b bVar = this.f101761a;
        if (bVar != null) {
            bVar.f();
        }
    }
}
