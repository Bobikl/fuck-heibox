package cn.fly.verify;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile String f36161a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f36162b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile String f36163c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f36164d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HashSet<String> f36165e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ay f36166f = new ay();

    public static synchronized String a(bd bdVar) {
        HashMap<String, Object> mapB = b(bdVar);
        if (mapB == null) {
            return null;
        }
        return (String) mapB.get(ft.f36593a);
    }

    public static boolean a() {
        return !by.a();
    }

    public static String b() {
        if (a()) {
            return null;
        }
        if (TextUtils.isEmpty(f36161a)) {
            String strA = d().a();
            if (!TextUtils.isEmpty(strA) && TextUtils.isEmpty(f36161a)) {
                f36161a = strA;
            }
        }
        return f36161a;
    }

    public static synchronized HashMap<String, Object> b(final bd bdVar) {
        boolean z10;
        HashMap<String, Object> map;
        boolean z11 = true;
        if (bdVar != null) {
            bu.a(bdVar);
            z10 = !f36165e.contains(bdVar.a());
            if (z10) {
                f36165e.add(bdVar.a());
            }
        } else {
            z10 = false;
        }
        if (TextUtils.isEmpty(f36161a)) {
            f36161a = d().b();
        } else {
            z11 = z10;
        }
        es.a().a("aut pro: " + bdVar + ", ndReg: " + z11 + ", hsReged: " + f36164d, new Object[0]);
        if (z11 || !f36164d) {
            ep.f36340c.execute(new gu() { // from class: cn.fly.verify.du.1
                @Override // cn.fly.verify.gu
                protected void a() {
                    if (by.a(ec.a("002Obabg"))) {
                        boolean unused = du.f36164d = true;
                        if (!by.d()) {
                            int i10 = 0;
                            while (i10 < 5) {
                                i10++;
                                try {
                                    Thread.sleep(5000L);
                                    if (by.d()) {
                                        break;
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        if (by.d()) {
                            du.d().a(bdVar, new gq<Void>() { // from class: cn.fly.verify.du.1.1
                                @Override // cn.fly.verify.gq
                                public void a(Void r10) {
                                }
                            });
                        }
                    }
                }
            });
        }
        if (f36162b == null) {
            String strB = bv.a().b("key_curr_passed_duid", (String) null);
            f36163c = strB;
            f36162b = (TextUtils.isEmpty(strB) || strB.equals(f36161a)) ? Boolean.FALSE : Boolean.TRUE;
        }
        bv.a().a("key_curr_passed_duid", f36161a);
        map = new HashMap<>();
        map.put(ft.f36593a, f36161a);
        map.put("isModified", Boolean.valueOf(f36162b.booleanValue()));
        map.put("duidPrevious", f36163c);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ay d() {
        return f36166f;
    }
}
