package com.max.xiaoheihe.module.game;

import android.webkit.CookieManager;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;

/* JADX INFO: compiled from: SteamCookieJarImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class b2 implements okhttp3.l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ka.d f86538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f86539d;

    public b2(ka.d dVar) {
        if (dVar == null) {
            new IllegalArgumentException("cookieStore can not be null.");
        }
        this.f86538c = dVar;
    }

    @Override // okhttp3.l
    public synchronized List<Cookie> a(okhttp3.t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 35173, new Class[]{okhttp3.t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<Cookie> listE = ad.a.a(ad.a.f1217x, false) ? this.f86538c.e(tVar) : new ArrayList<>();
        String host = tVar.getHost();
        if (!com.max.hbcommon.utils.c.u(this.f86539d)) {
            listE.add(new Cookie.a().b(host).g("Steam_Language").j(this.f86539d).a());
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "loadForRequest111==" + listE.toString());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String cookie = cookieManager.getCookie(tVar.getUrl());
        ArrayList arrayList = new ArrayList();
        if (!com.max.hbcommon.utils.c.u(cookie)) {
            for (String str : cookie.split(";")) {
                String strTrim = str.trim();
                if (!strTrim.startsWith("Domain") && !strTrim.startsWith("Path")) {
                    String[] strArrSplit = strTrim.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                    arrayList.add(new Cookie.a().b(host).g(strArrSplit[0]).j(strArrSplit.length < 2 ? "" : strArrSplit[1]).a());
                }
            }
            listE.addAll(arrayList);
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "loadForRequest222==" + listE.toString());
        return listE;
    }

    @Override // okhttp3.l
    public synchronized void b(okhttp3.t tVar, List<Cookie> list) {
        if (PatchProxy.proxy(new Object[]{tVar, list}, this, changeQuickRedirect, false, 35172, new Class[]{okhttp3.t.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("saveFromResponse url: " + tVar.a0().toString() + "  cookies: " + list);
        this.f86538c.f(tVar, list);
        if (!com.max.hbcommon.utils.c.w(list)) {
            for (Cookie cookie : list) {
                if ("Steam_Language".equals(cookie.name())) {
                    this.f86539d = cookie.value();
                }
            }
        }
    }
}
