package com.max.hbcommon.utils;

import android.content.pm.PackageManager;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AppUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.If, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return BaseApplication.a().getPackageManager().getPackageInfo(BaseApplication.a().getPackageName(), 0).versionName.replace(" ", "");
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
