package com.max.xiaoheihe.accelworld;

import android.content.Context;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyItemObj;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AccelWorldProxy.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorldProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldProxy.kt\ncom/max/xiaoheihe/accelworld/AccelWorldProxyKt\n+ 2 AccelWorld.kt\ncom/max/xiaoheihe/accelworld/AccelWorldKt\n*L\n1#1,52:1\n337#2:53\n*S KotlinDebug\n*F\n+ 1 AccelWorldProxy.kt\ncom/max/xiaoheihe/accelworld/AccelWorldProxyKt\n*L\n14#1:53\n*E\n"})
public final class p {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldProxy.kt */
    public static final class a implements ProxyManager.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SteamWalletJsObj f76769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SteamWalletJsObj f76770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProxyManager f76771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f76772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f76773e;

        a(SteamWalletJsObj steamWalletJsObj, SteamWalletJsObj steamWalletJsObj2, ProxyManager proxyManager, Context context, Integer num) {
            this.f76769a = steamWalletJsObj;
            this.f76770b = steamWalletJsObj2;
            this.f76771c = proxyManager;
            this.f76772d = context;
            this.f76773e = num;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0095  */
        @Override // com.max.xiaoheihe.module.proxy.ProxyManager.a
        public void a(@dl.e ProxyItemObj proxyItemObj) {
            SteamAcceptGameParams loadcookie;
            if (PatchProxy.proxy(new Object[]{proxyItemObj}, this, changeQuickRedirect, false, bb.c.m.qx, new Class[]{ProxyItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (proxyItemObj != null) {
                this.f76769a.setAcc_proxy(proxyItemObj.getAcc_proxy());
                this.f76769a.setHost(proxyItemObj.getFilter_hosts());
                if (f0.g(ProxyManager.ProxyType.r_proxy.getKey(), proxyItemObj.getKey()) || f0.g(ProxyManager.ProxyType.web_proxy.getKey(), proxyItemObj.getKey())) {
                    KeyDescObj r_proxy = this.f76770b.getR_proxy();
                    if (com.max.hbcommon.utils.c.x(r_proxy != null ? r_proxy.getEnable() : null)) {
                        SteamAcceptGameParams loadcookie2 = this.f76769a.getLoadcookie();
                        if (loadcookie2 != null) {
                            loadcookie2.setR_url(proxyItemObj.getUrl());
                        }
                        SteamWalletJsObj steamWalletJsObj = this.f76769a;
                        KeyDescObj r_proxy2 = steamWalletJsObj.getR_proxy();
                        if (r_proxy2 == null) {
                            r_proxy2 = new KeyDescObj();
                        }
                        r_proxy2.setEnable("1");
                        steamWalletJsObj.setR_proxy(r_proxy2);
                    } else {
                        loadcookie = this.f76769a.getLoadcookie();
                        if (loadcookie != null) {
                            loadcookie.setUrl(proxyItemObj.getUrl());
                        }
                        this.f76769a.setR_proxy(null);
                    }
                } else {
                    loadcookie = this.f76769a.getLoadcookie();
                    if (loadcookie != null) {
                        loadcookie.setUrl(proxyItemObj.getUrl());
                    }
                    this.f76769a.setR_proxy(null);
                }
            }
            p.a(this.f76772d, this.f76769a, this.f76773e, this.f76771c.f());
        }
    }

    public static final /* synthetic */ void a(Context context, SteamWalletJsObj steamWalletJsObj, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{context, steamWalletJsObj, num, str}, null, changeQuickRedirect, true, bb.c.m.px, new Class[]{Context.class, SteamWalletJsObj.class, Integer.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        e(context, steamWalletJsObj, num, str);
    }

    @xh.i
    public static final void b(@dl.d Context context, @dl.d SteamWalletJsObj dataSource) {
        if (PatchProxy.proxy(new Object[]{context, dataSource}, null, changeQuickRedirect, true, bb.c.m.mx, new Class[]{Context.class, SteamWalletJsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(dataSource, "dataSource");
        d(context, dataSource, null, 4, null);
    }

    @xh.i
    public static final void c(@dl.d Context context, @dl.d SteamWalletJsObj dataSource, @dl.e Integer num) {
        SteamAcceptGameParams loadcookie;
        String url;
        if (PatchProxy.proxy(new Object[]{context, dataSource, num}, null, changeQuickRedirect, true, bb.c.m.kx, new Class[]{Context.class, SteamWalletJsObj.class, Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(dataSource, "dataSource");
        SteamWalletJsObj steamWalletJsObj = (SteamWalletJsObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(dataSource), SteamWalletJsObj.class);
        if (steamWalletJsObj == null || (loadcookie = steamWalletJsObj.getLoadcookie()) == null || (url = loadcookie.getUrl()) == null) {
            return;
        }
        SteamAcceptGameParams loadcookie2 = steamWalletJsObj.getLoadcookie();
        if (com.max.hbcommon.utils.c.u(loadcookie2 != null ? loadcookie2.getProxy_type() : null)) {
            f(context, steamWalletJsObj, num, null, 8, null);
            return;
        }
        SteamAcceptGameParams loadcookie3 = steamWalletJsObj.getLoadcookie();
        ProxyManager proxyManager = new ProxyManager(loadcookie3 != null ? loadcookie3.getProxy_type() : null, url, null);
        proxyManager.q(new a(steamWalletJsObj, dataSource, proxyManager, context, num));
    }

    public static /* synthetic */ void d(Context context, SteamWalletJsObj steamWalletJsObj, Integer num, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, steamWalletJsObj, num, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.lx, new Class[]{Context.class, SteamWalletJsObj.class, Integer.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        c(context, steamWalletJsObj, num);
    }

    private static final void e(Context context, SteamWalletJsObj steamWalletJsObj, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{context, steamWalletJsObj, num, str}, null, changeQuickRedirect, true, bb.c.m.nx, new Class[]{Context.class, SteamWalletJsObj.class, Integer.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.sankuai.waimai.router.common.c cVarH = com.max.xiaoheihe.base.router.b.H(context, steamWalletJsObj);
        if (str != null) {
            cVarH.U(com.max.xiaoheihe.module.proxy.a.f91563d, str);
        }
        if (num != null) {
            num.intValue();
            cVarH.C(num.intValue());
        }
        cVarH.A();
    }

    static /* synthetic */ void f(Context context, SteamWalletJsObj steamWalletJsObj, Integer num, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{context, steamWalletJsObj, num, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.ox, new Class[]{Context.class, SteamWalletJsObj.class, Integer.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        e(context, steamWalletJsObj, num, str);
    }
}
