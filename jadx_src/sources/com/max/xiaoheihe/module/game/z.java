package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GameDetailsActivity.java */
/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f88580a = "prefer_bbs";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f88581b = "prefer_data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f88582c = "prefer_wiki";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameDetailsActivity.java */
    public interface a {
        void T2();
    }

    private static String a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32998, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (f88581b.equals(str)) {
            return "game_data";
        }
        if (f88582c.equals(str)) {
            return "wiki";
        }
        return f88580a.equals(str) ? "link" : "game";
    }

    public static Intent b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, 32997, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : ChannelsDetailActivity.l3(context, str, null, str2, str3, str6, str5, str4, str7, "game");
    }
}
