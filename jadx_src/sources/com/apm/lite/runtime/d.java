package com.apm.lite.runtime;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.apm.lite.ICommonParams;
import com.apm.lite.k.v;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonParams f40177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICommonParams f40178c;

    public d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public d(Context context, ICommonParams iCommonParams, d dVar) {
        this.f40176a = context;
        this.f40177b = iCommonParams;
        this.f40178c = dVar == null ? null : dVar.f40177b;
    }

    public static String a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public static boolean c(Map<String, Object> map) {
        return map == null || map.isEmpty() || !((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code"));
    }

    public Map<String, Object> b() {
        Map<String, Object> mapD = d();
        if (a(mapD, CommonNetImpl.AID) == null) {
            mapD.put(CommonNetImpl.AID, Integer.valueOf(bb.c.f.Y));
        }
        return mapD;
    }

    public Map<String, Object> d() {
        Map<String, Object> map;
        Throwable th2;
        Map<String, Object> map2;
        try {
            ICommonParams iCommonParams = this.f40178c;
            map2 = iCommonParams != null ? iCommonParams.getCommonParams() : new HashMap<>();
            try {
                map2.putAll(this.f40177b.getCommonParams());
                th2 = null;
            } catch (Throwable th3) {
                map = map2;
                th = th3;
                Map<String, Object> map3 = map;
                th2 = th;
                map2 = map3;
            }
        } catch (Throwable th4) {
            th = th4;
            map = null;
        }
        if (map2 == null) {
            map2 = new HashMap<>(4);
            if (th2 != null) {
                try {
                    map2.put("err_info", v.b(th2));
                } catch (Throwable unused) {
                }
            }
        }
        if (c(map2)) {
            try {
                PackageInfo packageInfo = this.f40176a.getPackageManager().getPackageInfo(this.f40176a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    Object obj = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map2.put("version_name", com.apm.lite.k.a.n(this.f40176a));
                map2.put("version_code", Integer.valueOf(com.apm.lite.k.a.o(this.f40176a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = this.f40176a.getPackageManager().getPackageInfo(this.f40176a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f40176a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    public ICommonParams e() {
        return this.f40177b;
    }

    public String f() {
        try {
            return this.f40177b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String g() {
        try {
            return String.valueOf(this.f40177b.getCommonParams().get(CommonNetImpl.AID));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public long h() {
        try {
            return this.f40177b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
