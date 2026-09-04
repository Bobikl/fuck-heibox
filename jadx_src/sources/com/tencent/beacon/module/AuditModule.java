package com.tencent.beacon.module;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public class AuditModule implements BeaconModule, d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f99207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f99208d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f99210f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f99205a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99206b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99209e = 2;

    public static String a() {
        ArrayList<String> arrayListA = b.a(new String[]{"/system/bin/sh", "-c", "getprop ro.build.fingerprint"});
        return (arrayListA == null || arrayListA.size() <= 0) ? "" : arrayListA.get(0);
    }

    private String a(String str) {
        if (str == null) {
            return "";
        }
        String strReplace = str.replace(ContainerUtils.KEY_VALUE_DELIMITER, "%3D").replace("/", "%2F").replace("+", "%2B");
        if (strReplace.length() <= 1024) {
            return strReplace;
        }
        return strReplace + ";";
    }

    @SuppressLint({"NewApi"})
    public static String b(Context context) {
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                c.b("[audit] Api level < 9,return null!", new Object[0]);
                return "";
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[audit] get app_first_installed_time:");
            sb2.append(String.valueOf(packageInfo.firstInstallTime));
            c.a(sb2.toString(), new Object[0]);
            return String.valueOf(packageInfo.firstInstallTime);
        } catch (Throwable th2) {
            c.a(th2);
            return "";
        }
    }

    private String c() {
        String str;
        return (com.tencent.beacon.e.b.a() == null || (str = this.f99207c) == null) ? "" : str;
    }

    private Activity d() {
        SparseArray<WeakReference<Activity>> sparseArrayA;
        if (Integer.valueOf(Build.VERSION.SDK).intValue() < 16) {
            return null;
        }
        try {
            String strE = e();
            if (strE == null || (sparseArrayA = com.tencent.beacon.d.a.c.a()) == null) {
                return null;
            }
            for (int i10 = 0; i10 < sparseArrayA.size(); i10++) {
                WeakReference<Activity> weakReference = sparseArrayA.get(sparseArrayA.keyAt(i10));
                if (weakReference != null && weakReference.get() != null) {
                    Activity activity = weakReference.get();
                    if (activity.getClass().getName().equals(strE)) {
                        return activity;
                    }
                }
            }
        } catch (Exception e10) {
            c.a(e10);
        }
        return null;
    }

    private String e() {
        Intent launchIntentForPackage = this.f99210f.getPackageManager().getLaunchIntentForPackage(this.f99210f.getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage.getComponent().getClassName();
        }
        return null;
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        this.f99210f = context;
        com.tencent.beacon.a.a.b.a().a(2, this);
        com.tencent.beacon.a.a.b.a().a(10, this);
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        boolean z10;
        int i10 = cVar.f98739a;
        boolean z11 = false;
        if (i10 != 2) {
            if (i10 != 10) {
                return;
            }
            c.d("[module] native audit module > %s", Boolean.valueOf(this.f99206b));
            if (this.f99206b && com.tencent.beacon.e.b.a().d()) {
                b();
                return;
            }
            return;
        }
        Map map = (Map) cVar.f98740b.get("d_m");
        if (map == null) {
            return;
        }
        this.f99205a = b.a((String) map.get("upAc"), this.f99205a);
        this.f99209e = b.a((String) map.get("deleteSoCrashTime"), this.f99209e, 1, 10);
        this.f99207c = (String) map.get("appendXMeths");
        String str = (String) map.get("auditIgnore");
        if (!TextUtils.isEmpty(str)) {
            this.f99208d = new HashSet(Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        if (this.f99208d != null) {
            z10 = !this.f99208d.contains((f.e().h() + a.f131412e + Build.VERSION.SDK).replaceAll(" ", ""));
        } else {
            z10 = true;
        }
        if (this.f99205a && z10) {
            z11 = true;
        }
        this.f99206b = z11;
    }

    public void b() {
        Context context = this.f99210f;
        if (context != null && com.tencent.beacon.a.c.b.g(context)) {
            c.a("[audit] start upload ac event", new Object[0]);
            e eVarL = e.l();
            HashMap map = new HashMap();
            map.put("A19", eVarL.q());
            map.put("A58", eVarL.m() ? "Y" : "N");
            map.put("A82", a());
            map.put("A85", com.tencent.beacon.a.c.b.f98782d ? "Y" : "N");
            map.put("A88", b(this.f99210f));
            map.put("A89", eVarL.a(this.f99210f));
            map.put("A90", "");
            map.put("A91", "");
            map.put("A92", "");
            map.put("B13", a(com.tencent.beacon.c.a.a(this.f99210f, Integer.valueOf(Build.VERSION.SDK).intValue(), d(), c(), this.f99209e)));
            map.put("A31", "" + eVarL.p());
            ((StatModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STAT)).a(map);
        }
    }
}
