package com.max.hbminiprogram;

import androidx.fragment.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: LittleProgramFragmentManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f71246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, d> f71247b = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    private e() {
        for (d dVar : ServiceLoader.load(d.class)) {
            if (!f71247b.containsKey(dVar.getClass().getName())) {
                f71247b.put(dVar.getClass().getName(), dVar);
            }
        }
    }

    public static e b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.Hi, new Class[0], e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        if (f71246a == null) {
            synchronized (e.class) {
                f71246a = new e();
            }
        }
        return f71246a;
    }

    public Fragment a(String str, Map<String, Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, bb.c.g.Ii, new Class[]{String.class, Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        d dVar = f71247b.get(str);
        if (dVar != null) {
            return dVar.a2(map);
        }
        return null;
    }
}
