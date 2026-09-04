package cn.fly.verify;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final dk f36077a = new dk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dc f36078b = new dc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dh f36079c = new dh();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile df f36080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile df f36081e;

    static {
        try {
            f36080d = new df(new df.a() { // from class: cn.fly.verify.cs.1
                @Override // cn.fly.verify.df.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    try {
                        if (cs.f36081e != null) {
                            return cs.f36081e.a(str, arrayList);
                        }
                        return null;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            f36081e = new df(new df.a() { // from class: cn.fly.verify.cs.2
                @Override // cn.fly.verify.df.a
                public Object a(String str, ArrayList<Object> arrayList) {
                    return str + "" + arrayList;
                }
            });
            f36080d.a(com.google.android.exoplayer2.text.ttml.d.f49795n, null);
        } catch (Throwable unused) {
        }
    }

    public static int a() {
        return dq.a();
    }

    public static LinkedList<Object> a(Object obj, Object... objArr) throws Throwable {
        return ((ds) obj).b(objArr);
    }

    public static void a(Context context, String str, String str2, Method method) throws Throwable {
        a(dq.a(str), context, str2, method);
    }

    public static void a(Context context, String str, String str2, HashMap<String, Object> map, HashMap<String, Object> map2) throws Throwable {
        dq.c cVarA = dq.a(str);
        cVarA.a("ss_dhMap", map).a("ss_dataMaps", map2);
        a(cVarA, context, str2, (Method) null);
    }

    public static void a(Context context, byte[] bArr, String str, Method method) throws Throwable {
        a(dq.a(bArr), context, str, method);
    }

    private static void a(dq.c cVar, Context context, String str, Method method) throws Throwable {
        cVar.a(eh.b("012EfgJieDci;ch,chcjRdPdkKeh"), dc.class).a(eh.b("003Jgbdfeb"), cw.class).a("SBSP", dh.class).a(eh.b("004]gbdkfkej"), cz.class).a(eh.b("015Udkeiej;cd%cb-feIcieb+g0ciVec=cb"), er.class).a(eh.b("019XdkeieicicjNc$cbXbcGehPh<fiTebeFchcc?e^ci"), db.class).a(eh.b("0170dkeidccj<dhedh)fi e;ehcjZfHcc!e ci"), de.class).a(eh.b("019Udkeidk2eSciccchVbeBdccj1ddebh_chcj2d"), di.class).a(eh.b("017$dkeidccjPdhedh%fgeeeh*eVciccFeUci"), dd.class).a(eh.b("017_dkeidf(eh'efcjcidgdc,cffBeeEcb'dg"), dg.class).a(eh.b("009:dkeiejXcdScb5fe5ci"), df.class).a(eh.b("0038gbdfdc"), ft.class).a(eh.b("004Dgbdfebfg"), fu.a.class).a("NoVaDataException", gf.b.class).a(eh.b("003 ejcjdd"), ed.class).a(db.class, db.class).a(dd.class, dd.class).a(di.class, dj.class).a(dg.class, dg.class).a(dk.class, dk.class).a(dc.class, dc.class).a(cw.class, cw.class).a(cz.class, da.class).a(Context.class, cv.class).a(PackageManager.class, cy.class).a(NotificationManager.class, cx.class).a(dh.class, dh.class).a(ed.class, cu.class).a("ss_sdh", f36079c).a("ss_opSet", f36078b).a("ss_suls", f36077a).a(eh.b("0154ehehcg9bNcj:dhe!dhXh0fkPc.ci;c'ce"), context).a(eh.b("014%ehehcgeh2hc-ciOh$fkMc4ciSc;ceeh"), str).a(eh.b("012!ehehcgeh2hcHci;h2ebchceKe"), Long.valueOf(System.currentTimeMillis())).a(eh.b("0066ehehcgcecbVi"), method).a(eh.b("016bOcjcececjPdciDckehcbdgck+b>cbAb"));
        cVar.a();
    }
}
