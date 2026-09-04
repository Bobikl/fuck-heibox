package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f60777b = "c";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, PLSharedPreferences> f60778c = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f60779a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(f60777b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = f60778c;
        if (map.containsKey(str + packageName)) {
            this.f60779a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, str + packageName);
            this.f60779a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        a(context);
    }

    private void a(Context context) {
        String str = f60777b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String strA = a("version", "");
            if (string.equals(strA)) {
                return;
            }
            Logger.i(str, "app version changed! old version{%s} and new version{%s}", strA, string);
            b();
            b("version", string);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w(f60777b, "get app version failed and catch NameNotFoundException");
        }
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f60779a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f60779a.getString(str, str2);
        }
        return string;
    }

    public Map<String, ?> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f60779a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f60779a.getAll();
        }
        return all;
    }

    public void a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f60779a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f60779a.remove(str);
        }
    }

    public void b() {
        PLSharedPreferences pLSharedPreferences = this.f60779a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f60779a.clear();
        }
    }

    public void b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f60779a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f60779a.putString(str, str2);
        }
    }
}
