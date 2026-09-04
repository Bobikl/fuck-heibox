package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class fe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static fe f36469b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36470a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f36471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PackageManager f36472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f36473e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f36474f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f36475g = new ConcurrentHashMap<>();

    private fe(Context context) {
        this.f36470a = context;
    }

    public static fe a(Context context) {
        if (f36469b == null) {
            synchronized (fe.class) {
                if (f36469b == null) {
                    f36469b = new fe(context);
                }
            }
        }
        return f36469b;
    }

    public ApplicationInfo a(String str, int i10) throws PackageManager.NameNotFoundException {
        if (this.f36472d == null) {
            this.f36472d = this.f36470a.getPackageManager();
        }
        if (TextUtils.equals(str, this.f36470a.getPackageName()) || dt.b()) {
            return this.f36472d.getApplicationInfo(str, i10);
        }
        return null;
    }

    public Object a(String str, int i10, boolean z10) throws Throwable {
        if (this.f36472d == null) {
            this.f36472d = this.f36470a.getPackageManager();
        }
        if (z10) {
            return fz.d.a(this.f36472d, bq.a("0146fk@gj1hm;edUfiZe]fkOg*ff(f!fgel"), new Object[]{str, Integer.valueOf(i10)}, new Class[]{String.class, Integer.TYPE});
        }
        boolean zEquals = str.equals(fz.d.c());
        if (zEquals || dt.b()) {
            return (Build.VERSION.SDK_INT <= 25 || zEquals) ? fz.d.a(this.f36472d, bq.a("014^fkTgj<hmFedBfiIeIfk+gSff4f fgel"), new Object[]{str, Integer.valueOf(i10)}, new Class[]{String.class, Integer.TYPE}) : fj.a(this.f36470a, str, i10);
        }
        return null;
    }

    public String a(String str) {
        return a(str, "");
    }

    public String a(String str, String str2) {
        Object objA = gi.a(gi.a(bq.a("027ef+edekelejedemelgjemfmfdgj3jg<eghmekelEkgBek$j@ej)g=gj"), (String) null), bq.a("0033fk.gj"), str2, str);
        return objA != null ? String.valueOf(objA) : str2;
    }

    public Enumeration<NetworkInterface> a() {
        try {
            return NetworkInterface.getNetworkInterfaces();
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public Enumeration<InetAddress> a(NetworkInterface networkInterface) {
        return (Enumeration) gi.a(networkInterface, bq.a("0164fkYgj7ff[fgj:geededek?g.gjgjBgNgj"), (Object) null, new Object[0]);
    }

    public List<ResolveInfo> a(Intent intent, int i10) {
        if (dt.b()) {
            return (List) gi.a(this.f36470a.getPackageManager(), bq.a("019OefehGgTekfdff4fjgfj5fm-g'ekeeejUdg3gj"), new Object[]{intent, Integer.valueOf(i10)}, (Class<?>[]) new Class[]{Intent.class, Integer.TYPE}, (Object) null);
        }
        return null;
    }

    public void a(String str, long j10, float f10, Object obj) {
        if (dt.e()) {
            try {
                if (gr.a().a(str)) {
                    Object objA = fz.d.a(bq.a("008hKel9dejWejelGf"));
                    Class<?> cls = Class.forName(bq.a("033ef'edekelejedemQh_el!dejYejelSf=emgfel<dej?ejel^fVgfejgjIjgfgUek"));
                    if (objA != null) {
                        gi.a(objA, bq.a("022Uek)gKefeh0gBgj$j-gfelGdejCejel2f-fl-k)edQejg3gj"), new Object[]{str, Long.valueOf(j10), Float.valueOf(f10), obj, bq.a().c()}, (Class<?>[]) new Class[]{String.class, Long.TYPE, Float.TYPE, cls, Looper.class});
                    }
                }
            } catch (Throwable th2) {
                es.a().b(th2);
            }
        }
    }

    public int b() {
        if (!fc.a(this.f36470a).d().e(bq.a("035ef^edekelejedem-kgVekegejgjgjejel%fLemhkhjgegmeihmglhifhhjeifmgdgegdhj"))) {
            return -1;
        }
        if (!az.a().i()) {
            return az.a().w();
        }
        if (this.f36471c == null) {
            this.f36471c = fz.d.a(bq.a("005ki elVfg"));
        }
        return ((Integer) gi.a(this.f36471c, bq.a("014Hfk[gj(fhSgj*ghelekfigdfd8kg"), -1, new Object[0])).intValue();
    }

    public ResolveInfo b(Intent intent, int i10) {
        if (dt.b()) {
            return (ResolveInfo) gi.a(this.f36470a.getPackageManager(), bq.a("015<ek0g+gjelXh1eeSgVge1dj@ejeeejZjZfd"), new Object[]{intent, Integer.valueOf(i10)}, (Class<?>[]) new Class[]{Intent.class, Integer.TYPE}, (Object) null);
        }
        return null;
    }

    public Object b(String str) {
        Object objA;
        if (dt.f() && gr.a().a(str) && (objA = fz.d.a(bq.a("008hBel*dej8ejelMf"))) != null) {
            return gi.a(objA, bq.a("020.fkKgj*gfSeAgjCj[jdCfWelghVf%gfel:dej^ejel:f"), (Object) null, str);
        }
        return null;
    }

    public int c() {
        if (Build.VERSION.SDK_INT < 24 || !fz.d.b(bq.a("035ef5edekelejedem^kgTekegejgjgjejel%f(emhkhjgegmeihmglhifhhjeifmgdgegdhj"))) {
            return -1;
        }
        if (!az.a().i()) {
            return az.a().w();
        }
        if (this.f36471c == null) {
            this.f36471c = fz.d.a(bq.a("005ki4elVfg"));
        }
        return ((Integer) gi.a(this.f36471c, bq.a("018Ofk4gj>gmBejeVfhYgj_ghelekfigdfd*kg"), -1, new Object[0])).intValue();
    }

    public ApplicationInfo d() {
        return this.f36470a.getApplicationInfo();
    }
}
