package qe;

import bb.c;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: SelectedManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f138651a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f138652b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f138653c = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f138654d = 200;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ArrayList<LocalMedia> f138655e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ArrayList<LocalMedia> f138656f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static LocalMediaFolder f138657g;

    public static synchronized void a(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, c.m.C2, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f138655e.addAll(arrayList);
    }

    public static synchronized void b(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, null, changeQuickRedirect, true, c.m.B2, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        f138655e.add(localMedia);
    }

    public static void c(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, c.m.G2, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        d();
        f138656f.addAll(arrayList);
    }

    public static void d() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.H2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<LocalMedia> arrayList = f138656f;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static synchronized void e() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.F2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<LocalMedia> arrayList = f138655e;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static LocalMediaFolder f() {
        return f138657g;
    }

    public static int g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.D2, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : f138655e.size();
    }

    public static ArrayList<LocalMedia> h() {
        return f138656f;
    }

    public static synchronized ArrayList<LocalMedia> i() {
        return f138655e;
    }

    public static String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.E2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        ArrayList<LocalMedia> arrayList = f138655e;
        return arrayList.size() > 0 ? arrayList.get(0).A() : "";
    }

    public static void k(LocalMediaFolder localMediaFolder) {
        f138657g = localMediaFolder;
    }
}
