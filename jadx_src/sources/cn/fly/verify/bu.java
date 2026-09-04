package cn.fly.verify;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f35898a = {ba.a("008Mgnhmhfilikgnhnke"), ba.a("006Fgnjegngnhnke"), ba.a("007%jeijhlhggggike"), ba.a("007Wjeijhlingmgnhm"), ba.a("009Ignikgfimikilggiekn"), ba.a("008Pjeijhlhfhngnhnke"), ba.a("008Kjeijhlkfgmhfilhn")};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f35899b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f35900c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, bd> f35901d = new HashMap<>();

    private static synchronized String a(final ArrayList<bd> arrayList, final int i10) {
        final String[] strArr;
        strArr = new String[]{""};
        fz.c cVarD = fz.a(ax.g()).r().h().d();
        if (!en.b() || i10 == 3) {
            cVarD.c(true);
        } else {
            cVarD.i();
        }
        cVarD.a(new fz.a() { // from class: cn.fly.verify.bu.2
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) throws Throwable {
                String str;
                String str2;
                String str3;
                String str4 = "";
                String strEncode = TextUtils.isEmpty(fz.d.c()) ? "" : URLEncoder.encode(fz.d.c(), "utf-8");
                String strEncode2 = TextUtils.isEmpty(fz.d.f()) ? "" : URLEncoder.encode(fz.d.f(), "utf-8");
                String strEncode3 = TextUtils.isEmpty(fz.d.k()) ? "" : URLEncoder.encode(fz.d.k(), "utf-8");
                String strEncode4 = TextUtils.isEmpty(fz.d.j()) ? "" : URLEncoder.encode(fz.d.j(), "utf-8");
                String strEncode5 = TextUtils.isEmpty(bVar.r()) ? "" : URLEncoder.encode(bVar.r(), "utf-8");
                String strEncode6 = TextUtils.isEmpty(fz.d.h()) ? "" : URLEncoder.encode(fz.d.h(), "utf-8");
                HashMap<String, Object> mapB = ei.a().b();
                String str5 = ba.a("004.hfinin0n") + strEncode + ";" + strEncode2;
                String str6 = ba.a("012>gnkngnHn4hfYgWfeflfmfkfeli") + fz.d.g() + ";" + strEncode6;
                String str7 = ba.a("004[gnhnggWn") + ((!en.b() || i10 == 3) ? bVar.c(new int[0]) : bVar.i());
                String str8 = ba.a("003.ieje(n") + strEncode3 + ";" + strEncode4;
                if (!TextUtils.isEmpty(strEncode5)) {
                    str8 = str8 + ";" + strEncode5;
                }
                String str9 = ba.a("003Zgiik=n") + bVar.h() + ";" + bVar.d();
                String str10 = ba.a("005%hgXfgRglFn") + Locale.getDefault().toString().replace(ba.a("002Hjmfl"), Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                String str11 = ba.a("004Ugfhgim0n") + ax.f35783a;
                String strA = ba.a("004+gnhnkeGn");
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        try {
                            bd bdVar = (bd) arrayList.get(i11);
                            if (i11 != 0) {
                                str3 = str4;
                                try {
                                    strA = strA + Constants.ACCEPT_TIME_SEPARATOR_SP;
                                } catch (Throwable unused) {
                                }
                            } else {
                                str3 = str4;
                            }
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(strA);
                                String str12 = strA;
                                try {
                                    sb2.append(bdVar.a());
                                    sb2.append(";");
                                    sb2.append(bdVar.b());
                                    sb2.append(";");
                                    sb2.append(mapB.get(bdVar.a()));
                                    strA = sb2.toString();
                                } catch (Throwable unused2) {
                                    strA = str12;
                                }
                            } catch (Throwable unused3) {
                            }
                        } catch (Throwable unused4) {
                            str3 = str4;
                        }
                        i11++;
                        str4 = str3;
                    }
                }
                String str13 = str4;
                int i12 = i10;
                if (i12 == 1) {
                    str = "DC/[DC]";
                } else {
                    str = i12 == 2 ? "DC/[DC2]" : "DC/9";
                }
                String strI = fz.d.i();
                if (TextUtils.isEmpty(strI)) {
                    str2 = str13;
                } else {
                    str2 = ba.a("003Gheklfj") + strI;
                }
                String strC = bw.a().c();
                String str14 = "TID/";
                if (!TextUtils.isEmpty(strC)) {
                    str14 = "TID/" + strC;
                }
                int iA = cs.a();
                String str15 = "SVM/" + iA;
                if (fd.c()) {
                    if (!ba.a("004.gnhnke6n").equals(strA)) {
                        strA = strA + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                    strA = strA + "CS;" + iA;
                }
                String str16 = "RD/";
                String strF = eo.a().f();
                if (!TextUtils.isEmpty(strF)) {
                    str16 = "RD/" + strF;
                }
                strArr[0] = str5 + " " + str6 + " " + str7 + " " + str8 + " " + str9 + " " + str10 + " " + str11 + " " + strA + " " + str + " " + str2 + " " + str14 + " " + str15 + " " + str16;
            }
        });
        return strArr[0];
    }

    public static void a() {
        g();
        ep.f36340c.execute(new gu() { // from class: cn.fly.verify.bu.1
            @Override // cn.fly.verify.gu
            protected void a() {
                es.a().a("init sks start", new Object[0]);
                bu.b();
                es.a().a("init sks over", new Object[0]);
            }
        });
    }

    public static void a(bd bdVar) {
        HashMap<String, bd> map = f35901d;
        synchronized (map) {
            if (bdVar != null) {
                if (!map.containsKey(bdVar.a())) {
                    map.put(bdVar.a(), bdVar);
                }
            }
        }
    }

    public static ArrayList<bd> b() {
        ArrayList<bd> arrayList;
        HashMap<String, bd> map = f35901d;
        synchronized (map) {
            if (en.h() && f35899b.compareAndSet(false, true)) {
                map.putAll(h());
            }
            arrayList = new ArrayList<>();
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public static synchronized String c() {
        return a(b(), 0);
    }

    public static synchronized String d() {
        return a(b(), 1);
    }

    public static synchronized String e() {
        return a(b(), 2);
    }

    public static synchronized String f() {
        return a(b(), 3);
    }

    private static void g() {
    }

    private static HashMap<String, bd> h() {
        HashMap<String, bd> map = new HashMap<>();
        for (Object obj : ej.f36297a) {
            try {
                Class<?> cls = obj instanceof String ? Class.forName(String.valueOf(obj).trim()) : (Class) obj;
                if (!bd.class.isAssignableFrom(cls) || bd.class.equals(cls)) {
                    cls.newInstance();
                } else {
                    bd bdVar = (bd) cls.newInstance();
                    String strA = bdVar.a();
                    for (String str : f35898a) {
                        if (str.equals(strA)) {
                            map.put(str, bdVar);
                            break;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }
}
