package com.max.xiaoheihe.module.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.RouterActivity;
import com.max.xiaoheihe.UpushNotifyClickActivity;
import com.max.xiaoheihe.bean.AdsInfosObj;
import com.max.xiaoheihe.module.gamesdk.HeyboxSSOActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AdsUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f79472a = "ad_cache";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static AdsInfosObj a() {
        AdsInfosObj adsInfosObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25595, new Class[0], AdsInfosObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AdsInfosObj) patchProxyResultProxy.result;
        }
        String string = com.max.hbcache.c.n(com.max.hbcache.c.f66114c).getString(f79472a, "");
        return (TextUtils.isEmpty(string) || (adsInfosObj = (AdsInfosObj) k.a(string, AdsInfosObj.class)) == null) ? new AdsInfosObj() : adsInfosObj;
    }

    public static boolean b(Activity activity) {
        return (activity instanceof AdsActivity) || (activity instanceof RouterActivity) || (activity instanceof UpushNotifyClickActivity) || (activity instanceof HeyboxSSOActivity);
    }

    public static void c(AdsInfosObj adsInfosObj) {
        if (PatchProxy.proxy(new Object[]{adsInfosObj}, null, changeQuickRedirect, true, 25596, new Class[]{AdsInfosObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.n(com.max.hbcache.c.f66114c).edit().putString(f79472a, k.p(adsInfosObj)).apply();
    }
}
