package com.max.xiaoheihe.module.game;

import android.util.Log;
import android.webkit.CookieManager;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;

/* JADX INFO: compiled from: EpicCookieJarImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class j implements okhttp3.l {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f87763d = "https://www.epicgames.com/account/v2/security/settings/ajaxCheckAccountVerification";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ka.d f87764c;

    public j(ka.d dVar) {
        if (dVar == null) {
            new IllegalArgumentException("cookieStore can not be null.");
        }
        this.f87764c = dVar;
    }

    @Override // okhttp3.l
    public synchronized List<Cookie> a(okhttp3.t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 32424, new Class[]{okhttp3.t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        com.max.hbcommon.utils.d.b("zzzzgifttest", "url " + tVar.a0().toString());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String cookie = cookieManager.getCookie(tVar.a0().toString());
        if (com.max.hbcommon.utils.c.u(cookie)) {
            cookie = cookieManager.getCookie(f87763d);
        }
        ArrayList arrayList2 = new ArrayList();
        if (!com.max.hbcommon.utils.c.u(cookie)) {
            for (String str : cookie.split(";")) {
                String strTrim = str.trim();
                if (!strTrim.startsWith("Domain") && !strTrim.startsWith("Path")) {
                    String[] strArrSplit = strTrim.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                    arrayList2.add(new Cookie.a().b(tVar.getHost()).g(strArrSplit[0]).j(strArrSplit.length < 2 ? "" : strArrSplit[1]).a());
                }
            }
            arrayList.addAll(arrayList2);
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "loadForRequest222==" + arrayList.toString());
        return arrayList;
    }

    @Override // okhttp3.l
    public synchronized void b(okhttp3.t tVar, List<Cookie> list) {
        if (PatchProxy.proxy(new Object[]{tVar, list}, this, changeQuickRedirect, false, 32423, new Class[]{okhttp3.t.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f87764c.f(tVar, list);
        Log.d("saveFromResponse", "saveFromResponse" + tVar.a0().toString() + "cookies" + list.toString());
    }
}
