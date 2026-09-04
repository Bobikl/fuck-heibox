package com.umeng.message.proguard;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f105662b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f105663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f105664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<?> f105665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Class<?> f105666e;

    private a() {
        Application applicationA = x.a();
        String resourcePackageName = PushAgent.getInstance(applicationA).getResourcePackageName();
        resourcePackageName = TextUtils.isEmpty(resourcePackageName) ? applicationA.getPackageName() : resourcePackageName;
        UPLog.d("R2", "resPackageName:", resourcePackageName);
        try {
            this.f105665d = Class.forName(resourcePackageName + ".R$drawable");
        } catch (ClassNotFoundException e10) {
            UPLog.d("R2", UPLog.getStackTrace(e10));
            UMLog.aq(ab.f105668b, 0, "\\|");
        }
        try {
            this.f105663a = Class.forName(resourcePackageName + ".R$layout");
        } catch (ClassNotFoundException e11) {
            UPLog.d("R2", UPLog.getStackTrace(e11));
        }
        try {
            this.f105664c = Class.forName(resourcePackageName + ".R$id");
        } catch (ClassNotFoundException e12) {
            UPLog.d("R2", UPLog.getStackTrace(e12));
        }
        try {
            this.f105666e = Class.forName(resourcePackageName + ".R$raw");
        } catch (ClassNotFoundException e13) {
            UPLog.d("R2", UPLog.getStackTrace(e13));
        }
    }

    public static int a(Class<?> cls, String str) {
        if (cls != null) {
            try {
                return cls.getField(str).getInt(str);
            } catch (Throwable unused) {
                throw new Resources.NotFoundException(cls.getName() + " field:" + str + " not exist.");
            }
        }
        UPLog.e("R2", "getRes(null,", str, ")");
        throw new Resources.NotFoundException(x.a().getPackageName() + ".R$* field=" + str + " not exist.");
    }

    public static int a(String str) {
        return a(a().f105664c, str);
    }

    public static a a() {
        if (f105662b == null) {
            f105662b = new a();
        }
        return f105662b;
    }

    public final int b(String str) {
        return a(this.f105665d, str);
    }

    public final int c(String str) {
        return a(this.f105666e, str);
    }
}
