package cn.fly.verify;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ek {
    public static String a() {
        if (TextUtils.isEmpty(eh.f36277a) && ax.g() != null) {
            eh.a(ax.g());
        }
        return TextUtils.isEmpty(eh.f36277a) ? eh.f36279c : eh.f36277a;
    }

    public static String a(String str, String str2, String str3, boolean z10) {
        if (!c()) {
            return dy.a().a(str, str2, str3, z10);
        }
        es.a().a("isForb: true", new Object[0]);
        return null;
    }

    public static HashMap<String, Object> a(String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(bq.a("006ekkOfi^g]fd"), a());
        map.put(bq.a("006ekkkPfifk"), fz.d.c());
        map.put(bq.a("006ekkIee8gSek"), fz.d.f());
        map.put(bq.a("004khej"), String.valueOf(fz.d.e()));
        map.put(bq.a("011fgj.ghelekfiBjEfdDkg"), str);
        String strB = du.b();
        if (!TextUtils.isEmpty(strB)) {
            map.put(bq.a("004Dedehejed"), strB);
        }
        return map;
    }

    public static void a(boolean z10) {
        try {
            en.a(z10);
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    public static int b() {
        int iD = en.d();
        if (iD == 1) {
            return 1;
        }
        return iD == 0 ? -1 : 0;
    }

    public static boolean c() {
        int iB = b();
        if (iB != 2 && iB != 1) {
            return true;
        }
        en.g();
        return true ^ by.a();
    }

    public static HashMap<String, Object> d() {
        final HashMap<String, Object>[] mapArr = {new HashMap<>()};
        fz.a(ax.g()).d().h().r().g().C().a(new fz.a() { // from class: cn.fly.verify.ek.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                mapArr[0] = ek.a(bVar.h());
                mapArr[0].put(bq.a("006Mgjedfiee.gGek"), Integer.valueOf(ax.f35783a));
                mapArr[0].put(bq.a("004-edehejed"), du.a((bd) null));
                mapArr[0].put(bq.a("006ekkBee]gEek"), Integer.valueOf(fz.d.m()));
                mapArr[0].put(bq.a("007de=ekekejIg5ek"), bVar.d());
                mapArr[0].put(bq.a("0054egeled3gh"), fz.d.j());
                mapArr[0].put(bq.a("007Ifg4edjUelekfd"), fz.d.k());
                mapArr[0].put(bq.a("006[gjfdgjee(g=ek"), fz.d.h());
                mapArr[0].put(bq.a("0050ehejee-g9ek"), bVar.r());
                mapArr[0].put(bq.a("0099gjfdgjeeOg-ekej^fj"), Integer.valueOf(fz.d.g()));
                mapArr[0].put(bq.a("010dh1ej6gfj gdejegHg"), Long.valueOf(System.currentTimeMillis()));
                mapArr[0].put(bq.a("006ekk,egedij"), bVar.g());
                mapArr[0].put(bq.a("005:ggekBef!ed"), fz.d.l());
                mapArr[0].put("usridt", bu.c());
                mapArr[0].put(bq.a("004Legelejed"), bVar.B());
            }
        });
        return mapArr[0];
    }
}
