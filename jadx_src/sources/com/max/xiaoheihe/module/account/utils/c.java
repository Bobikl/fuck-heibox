package com.max.xiaoheihe.module.account.utils;

import android.text.TextUtils;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: IdentityCheck.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f79294a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79295b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79296c = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: IdentityCheck.java */
    public @interface a {
    }

    public static int a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25392, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getApex_account_info() == null || !str.equals(i0.o().getApex_account_info().getId())) ? 2 : 1;
    }

    public static int b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25394, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getDestiny2_account_info() == null || !str.equals(i0.o().getDestiny2_account_info().getPlayer_id())) ? 2 : 1;
    }

    @a
    public static int c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25386, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getAccount_detail() == null || !str.equals(i0.o().getAccount_detail().getUserid())) ? 2 : 1;
    }

    public static int d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25393, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getOw_account_info() == null || !str.equals(i0.o().getOw_account_info().getPlayer_id())) ? 2 : 1;
    }

    public static int e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25388, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getPubg_account_info() == null || i0.o().getPubg_account_info().getPlayer_info() == null || !str.equals(i0.o().getPubg_account_info().getPlayer_info().getNickname())) ? 2 : 1;
    }

    public static int f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25389, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getPubg_account_info() == null || i0.o().getPubg_account_info().getPlayer_info() == null || !str.equals(i0.o().getPubg_account_info().getPlayer_info().getPlayer_id())) ? 2 : 1;
    }

    public static int g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25391, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getR6_account_info() == null || !str.equals(i0.o().getR6_account_info().getId())) ? 2 : 1;
    }

    public static int h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25387, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return 0;
        }
        return (i0.o() == null || i0.o().getSteam_id_info() == null || !str.equals(i0.o().getSteam_id_info().getSteamid())) ? 2 : 1;
    }

    public static String i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25397, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i0.o() == null || i0.o().getAccount_detail() == null) {
            return null;
        }
        return i0.o().getAccount_detail().getUserid();
    }

    public static String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25390, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i0.o() == null || i0.o().getPubg_account_info() == null || i0.o().getPubg_account_info().getPlayer_info() == null) {
            return null;
        }
        return i0.o().getPubg_account_info().getPlayer_info().getNickname();
    }

    public static String k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25395, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i0.o() == null || i0.o().getR6_account_info() == null) {
            return null;
        }
        return i0.o().getR6_account_info().getId();
    }

    public static String l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25396, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i0.o() == null || i0.o().getSteam_id_info() == null) {
            return null;
        }
        return i0.o().getSteam_id_info().getSteamid();
    }
}
