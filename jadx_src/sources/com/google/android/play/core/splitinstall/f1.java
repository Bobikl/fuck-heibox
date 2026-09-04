package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.p1;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p1 f56236c = new p1("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f56237d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f56239b;

    f1(Context context) {
        this.f56238a = context;
        this.f56239b = context.getPackageName();
    }

    public f1(Context context, String str) {
        this.f56238a = context;
        this.f56239b = str;
    }

    public static String b(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean e(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set f(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : h(packageInfo)) {
            if (!e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    @androidx.annotation.p0
    private final PackageInfo g() {
        try {
            return this.f56238a.getPackageManager().getPackageInfo(this.f56239b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f56236c.b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    private static final Set h(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f56236c.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1));
                hashSet.remove("");
                hashSet.remove(com.google.android.exoplayer2.text.ttml.d.X);
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f56236c.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f56236c.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        d1 d1VarA = e1.a();
        if (d1VarA != null) {
            hashSet.addAll(d1VarA.zza());
        }
        return hashSet;
    }

    @androidx.annotation.p0
    public final y0 a(@androidx.annotation.p0 Bundle bundle) {
        if (bundle == null) {
            f56236c.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i10 = bundle.getInt("com.android.vending.splits");
        if (i10 == 0) {
            f56236c.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            y0 y0VarA = p0.a(this.f56238a.getResources().getXml(i10), new w0());
            if (y0VarA == null) {
                f56236c.e("Can't parse languages metadata.", new Object[0]);
            }
            return y0VarA;
        } catch (Resources.NotFoundException unused) {
            f56236c.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set c() {
        PackageInfo packageInfoG = g();
        return (packageInfoG == null || packageInfoG.applicationInfo == null) ? new HashSet() : f(packageInfoG);
    }

    @androidx.annotation.p0
    public final Set d() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoG = g();
        HashSet hashSet = null;
        if (packageInfoG != null && (applicationInfo = packageInfoG.applicationInfo) != null) {
            y0 y0VarA = a(applicationInfo.metaData);
            if (y0VarA == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setH = h(packageInfoG);
            setH.add("");
            Set setF = f(packageInfoG);
            setF.add("");
            for (Map.Entry entry : y0VarA.a(setF).entrySet()) {
                if (setH.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
