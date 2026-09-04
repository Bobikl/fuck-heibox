package com.max.xiaoheihe.module.game.ow;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: OWUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f87960a = "https://account.bnet.163.com/battlenet/login?inner_client_id=ow&inner_redirect_uri=http://ow.blizzard.cn/battlenet/login?redirect_url=http%3A%2F%2Fow.blizzard.cn%2Fcareer%2F";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f87961b = "https://www.battlenet.com.cn/oauth/authorize?client_id=netease-hearthstone-site&response_type=code&scope=account.basic+account.full&redirect_uri=https%3A%2F%2Faccount.bnet.163.com%2Fbattlenet%2Flogin%3Finner_client_id%3Dow%26inner_redirect_uri%3Dhttp%253A%252F%252Fow.blizzard.cn%252Fbattlenet%252Flogin%253Fredirect_url%253Dhttp%253A%252F%252Fow.blizzard.cn%252Fcareer%252F";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f87962c = "http://ow.blizzard.cn/battlenet/login?redirect_url=http://ow.blizzard.cn/career/&inner_code=9PnRtpffdzpi2Rps";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f87963d = "ow.blizzard.cn/career/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f87964e = "http://ow.blizzard.cn/career/";

    private static SharedPreferences a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38074, new Class[0], SharedPreferences.class);
        if (patchProxyResultProxy.isSupported) {
            return (SharedPreferences) patchProxyResultProxy.result;
        }
        return HeyBoxApplication.C().getSharedPreferences("owlogincookies" + i0.o().getAccount_detail().getUserid(), 0);
    }

    public static String b(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38071, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            return d.K(context).getCookie(str);
        }
        com.max.hbcommon.utils.d.b("owlogin::", str + "::\n cookie::null");
        return null;
    }

    public static String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38073, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a().getString(str, "");
    }

    public static void d(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38070, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.max.hbcommon.utils.d.b("owlogin::", str + "::\n cookie::null");
            return;
        }
        String cookie = d.K(context).getCookie(str);
        Log.d("owlogin::", str + "::\ncookie::" + cookie);
        e(cookie, l0.s(str));
    }

    public static void e(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 38072, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString(str2, str);
        editorEdit.apply();
    }
}
