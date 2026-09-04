package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class fg implements fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36477a;

    public fg(Context context) {
        this.f36477a = context;
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

    @Override // cn.fly.verify.fa
    public HashMap<String, Long> A() {
        return (HashMap) a(HashMap.class, fl.a("gmrin", null));
    }

    @Override // cn.fly.verify.fa
    public String B() {
        return (String) a(String.class, fl.a("galgu", null));
    }

    @Override // cn.fly.verify.fa
    public String C() {
        return (String) a(String.class, fl.a("gscsz", null));
    }

    @Override // cn.fly.verify.fa
    public String D() {
        return (String) a(String.class, fl.a("gneypnw", null));
    }

    @Override // cn.fly.verify.fa
    public String E() {
        return (String) a(String.class, fl.a("gnktpfs", null));
    }

    @Override // cn.fly.verify.fa
    public String F() {
        return (String) a(String.class, fl.a("gdtlnktpfs", null));
    }

    @Override // cn.fly.verify.fa
    public boolean G() {
        return ((Boolean) a(Boolean.TYPE, fl.a("cknavbl", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public int H() {
        return ((Integer) a(Integer.TYPE, fl.a("gdntp", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String I() {
        return (String) a(String.class, fl.a("gtmne", null));
    }

    @Override // cn.fly.verify.fa
    public String J() {
        return (String) a(String.class, fl.a("gflv", null));
    }

    @Override // cn.fly.verify.fa
    public String K() {
        return (String) a(String.class, fl.a("gbsbd", null));
    }

    @Override // cn.fly.verify.fa
    public String L() {
        return (String) a(String.class, fl.a("gbfspy", null));
    }

    @Override // cn.fly.verify.fa
    public String M() {
        return (String) a(String.class, fl.a("gbplfo", null));
    }

    @Override // cn.fly.verify.fa
    public String N() {
        return (String) a(String.class, fl.a("giads", null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> O() {
        return (ArrayList) a(ArrayList.class, fl.a("gal", null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> P() {
        return (ArrayList) a(ArrayList.class, fl.a("gsl", null));
    }

    @Override // cn.fly.verify.fa
    public String Q() {
        return (String) a(String.class, fl.a("gdvk", null));
    }

    @Override // cn.fly.verify.fa
    public String R() {
        return (String) a(String.class, fl.a("gscpt", null));
    }

    @Override // cn.fly.verify.fa
    public String S() {
        return (String) a(String.class, fl.a("gsnmd", null));
    }

    @Override // cn.fly.verify.fa
    public String T() {
        return (String) a(String.class, fl.a("gpgnm", null));
    }

    @Override // cn.fly.verify.fa
    public String U() {
        return (String) a(String.class, fl.a("gpnmmt", null));
    }

    @Override // cn.fly.verify.fa
    public int V() {
        return ((Integer) a(Integer.TYPE, fl.a("gpvsnm", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String W() {
        return (String) a(String.class, fl.a("gpvsme", null));
    }

    @Override // cn.fly.verify.fa
    public boolean X() {
        return ((Boolean) a(Boolean.TYPE, fl.a("cinmnps", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String Y() {
        return (String) a(String.class, fl.a("gcrtpcnm", null));
    }

    @Override // cn.fly.verify.fa
    public boolean Z() {
        return ((Boolean) a(Boolean.TYPE, fl.a("ciafgd", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo a(String str, int i10) {
        return (ApplicationInfo) a(ApplicationInfo.class, fl.a("gtaifprm", new ArrayList(Arrays.asList(str, Integer.valueOf(i10)))));
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo a(boolean z10, String str, int i10) {
        return (ApplicationInfo) a(ApplicationInfo.class, fl.a("gtaifprmfce", new ArrayList(Arrays.asList(Boolean.valueOf(z10), str, Integer.valueOf(i10)))));
    }

    @Override // cn.fly.verify.fa
    public PackageInfo a(boolean z10, int i10, String str, int i11) {
        return (PackageInfo) a(PackageInfo.class, fl.a("gpgiffist", new ArrayList(Arrays.asList(Boolean.valueOf(z10), Integer.valueOf(i10), str, Integer.valueOf(i11)))));
    }

    @Override // cn.fly.verify.fa
    public Location a(int i10, int i11, boolean z10) {
        return (Location) a(Location.class, fl.a("glctn", new ArrayList(Arrays.asList(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public String a(String str) {
        return (String) a(String.class, fl.a("gstmpts", new ArrayList(Arrays.asList(str))));
    }

    @Override // cn.fly.verify.fa
    public String a(boolean z10) {
        return (String) a(String.class, fl.a("gsimtfce", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, String>> a(boolean z10, boolean z11) {
        return (ArrayList) a(ArrayList.class, fl.a("giafce", new ArrayList(Arrays.asList(Boolean.valueOf(z10), Boolean.valueOf(z11)))));
    }

    @Override // cn.fly.verify.fa
    public List a(int i10, int i11, boolean z10, boolean z11) {
        return (List) a(List.class, fl.a("gtelcmefce", new ArrayList(Arrays.asList(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11)))));
    }

    @Override // cn.fly.verify.fa
    public List<ResolveInfo> a(Intent intent, int i10) {
        return (List) a(List.class, fl.a("qritsvc", new ArrayList(Arrays.asList(intent, Integer.valueOf(i10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean a() {
        return ((Boolean) a(Boolean.TYPE, fl.a("cird", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public Context aa() {
        return (Context) a(Context.class, fl.a("gaplcn", null));
    }

    @Override // cn.fly.verify.fa
    public String ab() {
        return (String) a(String.class, fl.a("gdvda", null));
    }

    @Override // cn.fly.verify.fa
    public String ac() {
        return (String) a(String.class, fl.a("gdvdtnas", null));
    }

    @Override // cn.fly.verify.fa
    public long ad() {
        return ((Long) a(Long.TYPE, fl.a("galtut", null))).longValue();
    }

    @Override // cn.fly.verify.fa
    public String ae() {
        return (String) a(String.class, fl.a("gdvme", null));
    }

    @Override // cn.fly.verify.fa
    public String af() {
        return (String) a(String.class, fl.a("gcrup", null));
    }

    @Override // cn.fly.verify.fa
    public String ag() {
        return (String) a(String.class, fl.a("gcifm", null));
    }

    @Override // cn.fly.verify.fa
    public String ah() {
        return (String) a(String.class, fl.a("godm", null));
    }

    @Override // cn.fly.verify.fa
    public String ai() {
        return (String) a(String.class, fl.a("godhm", null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> aj() {
        return (HashMap) a(HashMap.class, fl.a("galdm", null));
    }

    @Override // cn.fly.verify.fa
    public ApplicationInfo ak() {
        return (ApplicationInfo) a(ApplicationInfo.class, fl.a("gtaif", null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> al() {
        return (ArrayList) a(ArrayList.class, fl.a("gtaifok", null));
    }

    @Override // cn.fly.verify.fa
    public long am() {
        return ((Long) a(Long.TYPE, fl.a("gtbdt", null))).longValue();
    }

    @Override // cn.fly.verify.fa
    public double an() {
        return ((Double) a(Double.TYPE, fl.a("gtscnin", null))).doubleValue();
    }

    @Override // cn.fly.verify.fa
    public int ao() {
        return ((Integer) a(Integer.TYPE, fl.a("gtscnppi", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public boolean ap() {
        return ((Boolean) a(Boolean.TYPE, fl.a("ishmos", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String aq() {
        return (String) a(String.class, fl.a("gthmosv", null));
    }

    @Override // cn.fly.verify.fa
    public String ar() {
        return (String) a(String.class, fl.a("gthmosdtlv", null));
    }

    @Override // cn.fly.verify.fa
    public int as() {
        return ((Integer) a(Integer.TYPE, fl.a("gthmpmst", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public int at() {
        return ((Integer) a(Integer.TYPE, fl.a("gthmepmst", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String au() {
        return (String) a(String.class, fl.a("gtinnerlangmt", null));
    }

    @Override // cn.fly.verify.fa
    public int av() {
        return ((Integer) a(Integer.TYPE, fl.a("gtgramgendt", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public boolean aw() {
        return ((Boolean) a(Boolean.TYPE, fl.a("ctedebbing", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> ax() {
        return (ArrayList) a(ArrayList.class, fl.a("gteacifo", null));
    }

    @Override // cn.fly.verify.fa
    public ResolveInfo b(Intent intent, int i10) {
        return (ResolveInfo) a(ResolveInfo.class, fl.a("rsaciy", new ArrayList(Arrays.asList(intent, Integer.valueOf(i10)))));
    }

    @Override // cn.fly.verify.fa
    public Object b(boolean z10, int i10, String str, int i11) {
        return a(PackageInfo.class, fl.a("gmpfis", new ArrayList(Arrays.asList(Boolean.valueOf(z10), Integer.valueOf(i10), str, Integer.valueOf(i11)))));
    }

    @Override // cn.fly.verify.fa
    public String b(boolean z10) {
        return (String) a(String.class, fl.a("gbsifce", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean b() {
        return ((Boolean) a(Boolean.TYPE, fl.a("cx", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean b(String str) {
        return ((Boolean) a(Boolean.TYPE, fl.a("ipgist", new ArrayList(Arrays.asList(str))))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String c(String str) {
        return (String) a(String.class, fl.a("gsnmdfp", new ArrayList(Arrays.asList(str))));
    }

    @Override // cn.fly.verify.fa
    public String c(boolean z10) {
        return (String) a(String.class, fl.a("gcriefce", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean c() {
        return ((Boolean) a(Boolean.TYPE, fl.a("ckpd", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String d(String str) {
        return (String) a(String.class, fl.a("gpnmfp", new ArrayList(Arrays.asList(str))));
    }

    @Override // cn.fly.verify.fa
    public String d(boolean z10) {
        return (String) a(String.class, fl.a("gcrnmfce", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean d() {
        return ((Boolean) a(Boolean.TYPE, fl.a("degb", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> e(boolean z10) {
        return (HashMap) a(HashMap.class, fl.a("wmcwifce", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean e() {
        return ((Boolean) a(Boolean.TYPE, fl.a("vnmt", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean e(String str) {
        return ((Boolean) a(Boolean.TYPE, fl.a("ckpmsi", new ArrayList(Arrays.asList(str))))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public long f(String str) {
        return ((Long) a(Long.TYPE, fl.a("gtlstactme", new ArrayList(Arrays.asList(str))))).longValue();
    }

    @Override // cn.fly.verify.fa
    public String f(boolean z10) {
        return (String) a(String.class, fl.a("gneypfce", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean f() {
        return ((Boolean) a(Boolean.TYPE, fl.a("ckua", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String g(boolean z10) {
        return (String) a(String.class, fl.a("gdvkfc", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean g() {
        return ((Boolean) a(Boolean.TYPE, fl.a("dvenbl", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String h(boolean z10) {
        return (String) a(String.class, fl.a("gtdm", new ArrayList(Arrays.asList(Boolean.valueOf(z10)))));
    }

    @Override // cn.fly.verify.fa
    public boolean h() {
        return ((Boolean) a(Boolean.TYPE, fl.a("ubenbl", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public boolean i() {
        return ((Boolean) a(Boolean.TYPE, fl.a("iwpxy", null))).booleanValue();
    }

    @Override // cn.fly.verify.fa
    public String j() {
        return (String) a(String.class, fl.a("gavti", null));
    }

    @Override // cn.fly.verify.fa
    public String k() {
        return (String) a(String.class, fl.a("gmivsn", null));
    }

    @Override // cn.fly.verify.fa
    public String l() {
        return (String) a(String.class, fl.a("bgmdl", null));
    }

    @Override // cn.fly.verify.fa
    public String m() {
        return (String) a(String.class, fl.a("gmnft", null));
    }

    @Override // cn.fly.verify.fa
    public String n() {
        return (String) a(String.class, fl.a("gbrd", null));
    }

    @Override // cn.fly.verify.fa
    public String o() {
        return (String) a(String.class, fl.a("gdvtp", null));
    }

    @Override // cn.fly.verify.fa
    public Object p() {
        return a(Object.class, fl.a("gtecloc", null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<HashMap<String, Object>> q() {
        return (ArrayList) a(ArrayList.class, fl.a("gnbclin", null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> r() {
        return e(false);
    }

    @Override // cn.fly.verify.fa
    public int s() {
        return ((Integer) a(Integer.TYPE, fl.a("govsit", null))).intValue();
    }

    @Override // cn.fly.verify.fa
    public String t() {
        return (String) a(String.class, fl.a("govsnm", null));
    }

    @Override // cn.fly.verify.fa
    public String u() {
        return (String) a(String.class, fl.a("golgu", null));
    }

    @Override // cn.fly.verify.fa
    public String v() {
        return (String) a(String.class, fl.a("gocnty", null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, Object> w() {
        return (HashMap) a(HashMap.class, fl.a("gcuin", null));
    }

    @Override // cn.fly.verify.fa
    public ArrayList<ArrayList<String>> x() {
        return (ArrayList) a(ArrayList.class, fl.a("gtydvin", null));
    }

    @Override // cn.fly.verify.fa
    public String y() {
        return (String) a(String.class, fl.a("gqmkn", null));
    }

    @Override // cn.fly.verify.fa
    public HashMap<String, HashMap<String, Long>> z() {
        return (HashMap) a(HashMap.class, fl.a("gszin", null));
    }
}
