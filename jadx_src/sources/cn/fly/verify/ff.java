package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ff implements fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f36476a;

    public ff(HashMap<String, Object> map) {
        this.f36476a = map;
    }

    private <T> T a(Class<T> cls, Object obj) {
        T tCast;
        Class cls2;
        T t10 = (T) null;
        if (cls != null && obj != null && cls != Void.class) {
            try {
                if (cls == Boolean.TYPE) {
                    cls2 = Boolean.class;
                } else if (cls == Integer.TYPE) {
                    cls2 = Integer.class;
                } else if (cls == Byte.TYPE) {
                    cls2 = Byte.class;
                } else if (cls == Character.TYPE) {
                    cls2 = Character.class;
                } else if (cls == Short.TYPE) {
                    cls2 = Short.class;
                } else if (cls == Long.TYPE) {
                    cls2 = Long.class;
                } else if (cls == Float.TYPE) {
                    cls2 = Float.class;
                } else {
                    if (cls == Double.TYPE) {
                        cls2 = Double.class;
                    } else {
                        tCast = cls.cast(obj);
                    }
                    t10 = tCast;
                }
                tCast = (T) cls2.cast(obj);
                t10 = tCast;
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        if (t10 != null) {
            return t10;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Integer.TYPE) {
            return (T) (-1);
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) Float.valueOf(0.0f);
        }
        return cls == Double.TYPE ? (T) Double.valueOf(0.0d) : t10;
    }

    private Object a(String str, Object... objArr) {
        LinkedList<Object> linkedListA;
        try {
            HashMap<String, Object> map = this.f36476a;
            if (map == null || !map.containsKey(str) || (linkedListA = cs.a(this.f36476a.get(str), objArr)) == null || linkedListA.isEmpty()) {
                return null;
            }
            return linkedListA.get(0);
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Long> A() {
        return (HashMap) a(HashMap.class, a("gmrin", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String B() {
        return (String) a(String.class, a("galgu", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String C() {
        return (String) a(String.class, a("gscsz", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String D() {
        return (String) a(String.class, a("gneypnw", new Object[0]));
    }

    @Override // cn.fly.verify.fa
    public String E() {
        return (String) a(String.class, a("gnktpfs", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String F() {
        return (String) a(String.class, a("gdtlnktpfs", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public boolean G() {
        return ((Boolean) a(Boolean.TYPE, a("cknavbl", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public int H() {
        return ((Integer) a(Integer.TYPE, a("gdntp", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String I() {
        return (String) a(String.class, a("gtmne", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String J() {
        return (String) a(String.class, a("gflv", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String K() {
        return (String) a(String.class, a("gbsbd", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String L() {
        return (String) a(String.class, a("gbfspy", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String M() {
        return (String) a(String.class, a("gbplfo", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String N() {
        return (String) a(String.class, a("giads", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> O() {
        return (ArrayList) a(ArrayList.class, a("gal", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> P() {
        return (ArrayList) a(ArrayList.class, a("gsl", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String Q() {
        return (String) a(String.class, a("gdvk", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String R() {
        return (String) a(String.class, a("gscpt", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String S() {
        return (String) a(String.class, a("gsnmd", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String T() {
        return (String) a(String.class, a("gpgnm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String U() {
        return (String) a(String.class, a("gpnmmt", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public int V() {
        return ((Integer) a(Integer.TYPE, a("gpvsnm", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String W() {
        return (String) a(String.class, a("gpvsme", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public boolean X() {
        return ((Boolean) a(Boolean.TYPE, a("cinmnps", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String Y() {
        return (String) a(String.class, a("gcrtpcnm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public boolean Z() {
        return ((Boolean) a(Boolean.TYPE, a("ciafgd", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo a(String str, int i10) {
        return (ApplicationInfo) a(ApplicationInfo.class, a("gtaifprm", str, Integer.valueOf(i10)));
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo a(boolean z10, String str, int i10) {
        return (ApplicationInfo) a(ApplicationInfo.class, a("gtaifprmfce", Boolean.valueOf(z10), str, Integer.valueOf(i10)));
    }

    @Override // cn.fly.verify.fa
    public PackageInfo a(boolean z10, int i10, String str, int i11) {
        return (PackageInfo) a(PackageInfo.class, a("gpgiffist", Boolean.valueOf(z10), Integer.valueOf(i10), str, Integer.valueOf(i11)));
    }

    @Override // cn.fly.verify.fa
    public Location a(int i10, int i11, boolean z10) {
        return (Location) a(Location.class, a("glctn", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public String a(String str) {
        return (String) a(String.class, a("gstmpts", str));
    }

    @Override // cn.fly.verify.fa
    public String a(boolean z10) {
        return (String) a(String.class, a("gsimtfce", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> a(boolean z10, boolean z11) {
        return (ArrayList) a(ArrayList.class, a("giafce", Boolean.valueOf(z10), Boolean.valueOf(z11)));
    }

    @Override // cn.fly.verify.fa
    public List a(int i10, int i11, boolean z10, boolean z11) {
        return (List) a(List.class, a("gtelcmefce", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11)));
    }

    @Override // cn.fly.verify.fa
    public List<ResolveInfo> a(Intent intent, int i10) {
        return (List) a(List.class, a("qritsvc", intent, Integer.valueOf(i10)));
    }

    @Override // cn.fly.verify.fa
    public boolean a() {
        return ((Boolean) a(Boolean.TYPE, a("cird", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public Context aa() {
        return (Context) a(Context.class, a("gaplcn", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String ab() {
        return (String) a(String.class, a("gdvda", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String ac() {
        return (String) a(String.class, a("gdvdtnas", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public long ad() {
        return ((Long) a(Long.TYPE, a("galtut", (Object[]) null))).longValue();
    }

    @Override // cn.fly.verify.fa
    public String ae() {
        return (String) a(String.class, a("gdvme", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String af() {
        return (String) a(String.class, a("gcrup", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String ag() {
        return (String) a(String.class, a("gcifm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String ah() {
        return (String) a(String.class, a("godm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String ai() {
        return (String) a(String.class, a("godhm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> aj() {
        return (HashMap) a(HashMap.class, a("galdm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo ak() {
        return (ApplicationInfo) a(ApplicationInfo.class, a("gtaif", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> al() {
        return (ArrayList) a(ArrayList.class, a("gtaifok", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public long am() {
        return ((Long) a(Long.TYPE, a("gtbdt", (Object[]) null))).longValue();
    }

    @Override // cn.fly.verify.fa
    public double an() {
        return ((Double) a(Double.TYPE, a("gtscnin", (Object[]) null))).doubleValue();
    }

    @Override // cn.fly.verify.fa
    public int ao() {
        return ((Integer) a(Integer.TYPE, a("gtscnppi", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public boolean ap() {
        return ((Boolean) a(Boolean.TYPE, a("ishmos", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String aq() {
        return (String) a(String.class, a("gthmosv", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String ar() {
        return (String) a(String.class, a("gthmosdtlv", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public int as() {
        return ((Integer) a(Integer.TYPE, a("gthmpmst", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public int at() {
        return ((Integer) a(Integer.TYPE, a("gthmepmst", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String au() {
        return (String) a(String.class, a("gtinnerlangmt", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public int av() {
        return ((Integer) a(Integer.TYPE, a("gtgramgendt", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public boolean aw() {
        return ((Boolean) a(Boolean.TYPE, a("ctedebbing", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> ax() {
        return (ArrayList) a(ArrayList.class, a("gteacifo", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ResolveInfo b(Intent intent, int i10) {
        return (ResolveInfo) a(ResolveInfo.class, a("rsaciy", intent, Integer.valueOf(i10)));
    }

    @Override // cn.fly.verify.fa
    public Object b(boolean z10, int i10, String str, int i11) {
        return a(Object.class, a("gpgiffist", Boolean.valueOf(z10), Integer.valueOf(i10), str, Integer.valueOf(i11)));
    }

    @Override // cn.fly.verify.fa
    public String b(boolean z10) {
        return (String) a(String.class, a("gbsifce", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean b() {
        return ((Boolean) a(Boolean.TYPE, a("cx", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean b(String str) {
        return ((Boolean) a(Boolean.TYPE, a("ipgist", str))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String c(String str) {
        return (String) a(String.class, a("gsnmdfp", str));
    }

    @Override // cn.fly.verify.fa
    public String c(boolean z10) {
        return (String) a(String.class, a("gcriefce", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean c() {
        return ((Boolean) a(Boolean.TYPE, a("ckpd", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String d(String str) {
        return (String) a(String.class, a("gpnmfp", str));
    }

    @Override // cn.fly.verify.fa
    public String d(boolean z10) {
        return (String) a(String.class, a("gcrnmfce", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean d() {
        return ((Boolean) a(Boolean.TYPE, a("degb", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> e(boolean z10) {
        return (HashMap) a(HashMap.class, a("wmcwifce", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean e() {
        return ((Boolean) a(Boolean.TYPE, a("vnmt", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean e(String str) {
        return ((Boolean) a(Boolean.TYPE, a("ckpmsi", str))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public long f(String str) {
        return ((Long) a(Long.TYPE, a("gtlstactme", str))).longValue();
    }

    @Override // cn.fly.verify.fa
    public String f(boolean z10) {
        return (String) a(String.class, a("gneypfce", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean f() {
        return ((Boolean) a(Boolean.TYPE, a("ckua", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String g(boolean z10) {
        return (String) a(String.class, a("gdvkfc", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean g() {
        return ((Boolean) a(Boolean.TYPE, a("dvenbl", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String h(boolean z10) {
        return (String) a(String.class, a("gtdm", Boolean.valueOf(z10)));
    }

    @Override // cn.fly.verify.fa
    public boolean h() {
        return ((Boolean) a(Boolean.TYPE, a("ubenbl", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean i() {
        return ((Boolean) a(Boolean.TYPE, a("iwpxy", (Object[]) null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String j() {
        return (String) a(String.class, a("gavti", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String k() {
        return (String) a(String.class, a("gmivsn", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String l() {
        return (String) a(String.class, a("bgmdl", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String m() {
        return (String) a(String.class, a("gmnft", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String n() {
        return (String) a(String.class, a("gbrd", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String o() {
        return (String) a(String.class, a("gdvtp", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public Object p() {
        return a(Object.class, a("gtecloc", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> q() {
        return (ArrayList) a(ArrayList.class, a("gnbclin", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> r() {
        return e(false);
    }

    @Override // cn.fly.verify.fa
    public int s() {
        return ((Integer) a(Integer.TYPE, a("govsit", (Object[]) null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String t() {
        return (String) a(String.class, a("govsnm", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String u() {
        return (String) a(String.class, a("golgu", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String v() {
        return (String) a(String.class, a("gocnty", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> w() {
        return (HashMap) a(HashMap.class, a("gcuin", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<ArrayList<String>> x() {
        return (ArrayList) a(ArrayList.class, a("gtydvin", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public String y() {
        return (String) a(String.class, a("gqmkn", (Object[]) null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, HashMap<String, Long>> z() {
        return (HashMap) a(HashMap.class, a("gszin", (Object[]) null));
    }
}
