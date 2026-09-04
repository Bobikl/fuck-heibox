package com.max.xiaoheihe.utils;

import android.content.Context;
import android.util.Log;
import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: OaidHelper.java */
/* JADX INFO: loaded from: classes13.dex */
public class t implements IIdentifierListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f95744g = "OaidHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f95745h = "msaoaidsec";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f95746i = "com.max.xiaoheihe.cert.pem";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f95747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f95748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f95749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95750d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95751e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f95752f = false;

    /* JADX INFO: compiled from: OaidHelper.java */
    public interface a {
        void a(String str);
    }

    public t(a aVar) {
        e(f95745h);
        this.f95749c = aVar;
    }

    public static String f(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48788, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (IOException unused) {
            Log.e(f95744g, "loadPemFromAssetFile failed");
            return "";
        }
    }

    public void a(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48785, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        b(context, true, false, false);
        this.f95748b = System.nanoTime();
    }

    public void b(Context context, boolean z10, boolean z11, boolean z12) {
        long j10;
        StringBuilder sb2;
        int iInitSdk = 0;
        Object[] objArr = {context, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48786, new Class[]{Context.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f95750d) {
            try {
                this.f95747a = System.nanoTime();
                String strC = com.max.xiaoheihe.module.cert.a.c();
                if (com.max.hbcommon.utils.c.u(strC)) {
                    com.max.heybox.hblog.g.W("[OAID] 未获取到服务端证书，从本地获取");
                    strC = f(context, f95746i);
                }
                Log.w(f95744g, "cert==" + strC);
                this.f95750d = MdidSdkHelper.InitCert(context, strC);
            } catch (Error e10) {
                e10.printStackTrace();
            }
            if (!this.f95750d) {
                Log.w(f95744g, "getDeviceIds: cert init failed");
            }
        }
        try {
            MdidSdkHelper.setGlobalTimeout(5000L);
        } catch (Error e11) {
            e11.printStackTrace();
        }
        try {
            try {
                iInitSdk = MdidSdkHelper.InitSdk(context, this.f95752f, z10, z11, z12, this);
                j10 = this.f95748b - this.f95747a;
                sb2 = new StringBuilder();
            } catch (Error e12) {
                e12.printStackTrace();
                j10 = this.f95748b - this.f95747a;
                sb2 = new StringBuilder();
            }
            sb2.append("Time Consume:");
            sb2.append(j10);
            Log.d(f95744g, sb2.toString());
            if (iInitSdk == 1008616) {
                Log.w(f95744g, "cert not init or check not pass");
                return;
            }
            if (iInitSdk == 1008612) {
                Log.w(f95744g, "device not supported");
                return;
            }
            if (iInitSdk == 1008613) {
                Log.w(f95744g, "failed to load config file");
                return;
            }
            if (iInitSdk == 1008611) {
                Log.w(f95744g, "manufacturer not supported");
                return;
            }
            if (iInitSdk == 1008615) {
                Log.w(f95744g, "sdk call error");
                return;
            }
            if (iInitSdk == 1008614) {
                Log.i(f95744g, "result delay (async)");
                return;
            }
            if (iInitSdk == 1008610) {
                Log.i(f95744g, "result ok (sync)");
                return;
            }
            Log.w(f95744g, "getDeviceIds: unknown code: " + iInitSdk);
        } catch (Throwable th2) {
            Log.d(f95744g, "Time Consume:" + (this.f95748b - this.f95747a));
            throw th2;
        }
    }

    public long c() {
        return this.f95748b - this.f95747a;
    }

    public boolean d() {
        return this.f95751e;
    }

    public String e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48789, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.product.cpu.abi", "")).contains("x86")) {
                this.f95751e = false;
            } else {
                this.f95751e = true;
                System.loadLibrary(str);
            }
        } catch (Throwable unused) {
        }
        return !this.f95751e ? "Arch: x86\n" : "Arch: Not x86";
    }

    @Override // com.bun.miitmdid.interfaces.IIdentifierListener
    public void onSupport(IdSupplier idSupplier) {
        String aaid;
        String vaid;
        boolean zIsLimited;
        boolean zIsSupported = false;
        if (PatchProxy.proxy(new Object[]{idSupplier}, this, changeQuickRedirect, false, 48787, new Class[]{IdSupplier.class}, Void.TYPE).isSupported) {
            return;
        }
        if (idSupplier == null) {
            Log.w(f95744g, "onSupport: supplier is null");
            return;
        }
        if (this.f95749c == null) {
            Log.w(f95744g, "onSupport: callbackListener is null");
            return;
        }
        String oaid = null;
        if (this.f95751e) {
            zIsSupported = idSupplier.isSupported();
            zIsLimited = idSupplier.isLimited();
            oaid = idSupplier.getOAID();
            vaid = idSupplier.getVAID();
            aaid = idSupplier.getAAID();
        } else {
            aaid = null;
            vaid = null;
            zIsLimited = false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("support: ");
        sb2.append(zIsSupported ? "true" : "false");
        sb2.append("\nlimit: ");
        sb2.append(zIsLimited ? "true" : "false");
        sb2.append("\nIs arch Support: ");
        sb2.append(this.f95751e ? "true" : "false");
        sb2.append("\nOAID: ");
        sb2.append(oaid);
        sb2.append("\nVAID: ");
        sb2.append(vaid);
        sb2.append("\nAAID: ");
        sb2.append(aaid);
        sb2.append("\ntime");
        sb2.append(c());
        com.max.hbcommon.utils.d.b(f95744g, "onSupport: ids: \n" + sb2.toString());
        this.f95749c.a(oaid);
        this.f95748b = System.nanoTime();
    }
}
