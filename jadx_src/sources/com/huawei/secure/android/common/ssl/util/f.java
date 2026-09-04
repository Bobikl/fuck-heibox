package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63055a = "f";

    public static String a(String str) {
        Context contextUtil = ContextUtil.getInstance();
        if (contextUtil == null) {
            return "";
        }
        try {
            return contextUtil.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e.b(f63055a, "getVersion NameNotFoundException : " + e10.getMessage());
            return "";
        } catch (Exception e11) {
            e.b(f63055a, "getVersion: " + e11.getMessage());
            return "";
        } catch (Throwable unused) {
            e.b(f63055a, "throwable");
            return "";
        }
    }

    public static int b(String str) {
        Context contextUtil = ContextUtil.getInstance();
        if (contextUtil == null) {
            return 0;
        }
        try {
            return contextUtil.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            e.b(f63055a, "getVersion NameNotFoundException");
            return 0;
        } catch (Exception e10) {
            e.b(f63055a, "getVersion: " + e10.getMessage());
            return 0;
        }
    }
}
