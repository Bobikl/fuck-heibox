package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w f108044a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f1116a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<String> f1117a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f108045b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f108046c = new ArrayList();

    private w(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1116a = applicationContext;
        if (applicationContext == null) {
            this.f1116a = context;
        }
        SharedPreferences sharedPreferences = this.f1116a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (TextUtils.isEmpty(str)) {
                this.f1117a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f108045b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f108046c.add(str3);
            }
        }
    }

    public static w a(Context context) {
        if (f108044a == null) {
            f108044a = new w(context);
        }
        return f108044a;
    }

    public void a(String str) {
        synchronized (this.f1117a) {
            if (!this.f1117a.contains(str)) {
                this.f1117a.add(str);
                this.f1116a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bp.a(this.f1117a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m777a(String str) {
        boolean zContains;
        synchronized (this.f1117a) {
            zContains = this.f1117a.contains(str);
        }
        return zContains;
    }

    public void b(String str) {
        synchronized (this.f108045b) {
            if (!this.f108045b.contains(str)) {
                this.f108045b.add(str);
                this.f1116a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bp.a(this.f108045b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m778b(String str) {
        boolean zContains;
        synchronized (this.f108045b) {
            zContains = this.f108045b.contains(str);
        }
        return zContains;
    }

    public void c(String str) {
        synchronized (this.f108046c) {
            if (!this.f108046c.contains(str)) {
                this.f108046c.add(str);
                this.f1116a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bp.a(this.f108046c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m779c(String str) {
        boolean zContains;
        synchronized (this.f108046c) {
            zContains = this.f108046c.contains(str);
        }
        return zContains;
    }

    public void d(String str) {
        synchronized (this.f1117a) {
            if (this.f1117a.contains(str)) {
                this.f1117a.remove(str);
                this.f1116a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bp.a(this.f1117a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    public void e(String str) {
        synchronized (this.f108045b) {
            if (this.f108045b.contains(str)) {
                this.f108045b.remove(str);
                this.f1116a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bp.a(this.f108045b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    public void f(String str) {
        synchronized (this.f108046c) {
            if (this.f108046c.contains(str)) {
                this.f108046c.remove(str);
                this.f1116a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bp.a(this.f108046c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }
}
