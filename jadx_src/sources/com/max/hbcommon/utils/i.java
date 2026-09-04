package com.max.hbcommon.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: NetworkUtils.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f68241b;

        a(c cVar) {
            this.f68241b = cVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.T0, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f68241b.b();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: NetworkUtils.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f68242b;

        b(c cVar) {
            this.f68242b = cVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.U0, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f68242b.a();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: NetworkUtils.java */
    public interface c {
        void a();

        void b();
    }

    public static void a(Context context, c cVar) {
        if (PatchProxy.proxy(new Object[]{context, cVar}, null, changeQuickRedirect, true, bb.c.f.O0, new Class[]{Context.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        if (e(context)) {
            cVar.a();
        } else {
            new com.max.hbcommon.view.a.f(context).x(R.string.prompt).k(R.string.no_wifi_download_notify).t(R.string.download, new b(cVar)).n(R.string.cancel, new a(cVar)).F();
        }
    }

    public static String b(Context context) {
        NetworkInfo activeNetworkInfo;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.f.R0, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? "" : "WiFi";
        }
        if (activeNetworkInfo.getSubtype() == 1 || activeNetworkInfo.getSubtype() == 2 || activeNetworkInfo.getSubtype() == 4 || activeNetworkInfo.getSubtype() == 7 || activeNetworkInfo.getSubtype() == 11) {
            return d4.d.f108135c;
        }
        if (activeNetworkInfo.getSubtype() == 3 || activeNetworkInfo.getSubtype() == 5 || activeNetworkInfo.getSubtype() == 6 || activeNetworkInfo.getSubtype() == 8 || activeNetworkInfo.getSubtype() == 9 || activeNetworkInfo.getSubtype() == 10 || activeNetworkInfo.getSubtype() == 12 || activeNetworkInfo.getSubtype() == 14 || activeNetworkInfo.getSubtype() == 15) {
            return d4.d.f108136d;
        }
        if (activeNetworkInfo.getSubtype() == 13 || activeNetworkInfo.getSubtype() == 19) {
            return d4.d.f108137e;
        }
        return activeNetworkInfo.getSubtype() == 20 ? "5G" : "Unknown";
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.f.P0, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }

    public static boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.S0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                    if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return false;
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.f.Q0, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return context != null && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }
}
