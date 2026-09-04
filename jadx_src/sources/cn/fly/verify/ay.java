package cn.fly.verify;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35786a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f35787b = new byte[0];

    public class a implements bd {
        a() {
        }

        @Override // cn.fly.verify.bd
        public String a() {
            return bq.a("006Ffehiididhifh");
        }

        @Override // cn.fly.verify.bd
        public int b() {
            return ax.f35783a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f35797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35798e;

        public b(String str, long j10, String str2, long j11, String str3) {
            this.f35794a = str;
            this.f35795b = j10;
            this.f35796c = str2;
            this.f35797d = j11;
            this.f35798e = str3;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x007a  */
        /* JADX WARN: Code duplicated, block: B:41:0x009b  */
        public static b a(String str) {
            long jIntValue;
            long j10;
            long jIntValue2;
            if (!TextUtils.isEmpty(str)) {
                try {
                    HashMap mapA = ge.a(str);
                    String str2 = (String) mapA.get(bq.a("004Kedehejed"));
                    if (TextUtils.isEmpty(str2) || TextUtils.equals("null", str2)) {
                        str2 = null;
                    }
                    String str3 = (String) mapA.get("genType");
                    String str4 = (TextUtils.isEmpty(str3) || TextUtils.equals("null", str3)) ? null : str3;
                    String str5 = (String) mapA.get(bq.a("002$fkYk"));
                    String str6 = (TextUtils.isEmpty(str5) || TextUtils.equals("null", str5)) ? null : str5;
                    Object obj = mapA.get("gt");
                    if (obj == null) {
                        jIntValue = 0;
                    } else if (obj instanceof Long) {
                        jIntValue = ((Long) obj).longValue();
                    } else if (obj instanceof Integer) {
                        jIntValue = ((Integer) obj).intValue();
                    } else {
                        jIntValue = 0;
                    }
                    Object obj2 = mapA.get("expTime");
                    if (obj2 == null) {
                        j10 = 0;
                    } else {
                        if (obj2 instanceof Long) {
                            jIntValue2 = ((Long) obj2).longValue();
                        } else if (obj2 instanceof Integer) {
                            jIntValue2 = ((Integer) obj2).intValue();
                        } else {
                            j10 = 0;
                        }
                        j10 = jIntValue2;
                    }
                    return new b(str2, jIntValue, str4, j10, str6);
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
            return null;
        }

        public String a() {
            return ge.a((HashMap) b());
        }

        public boolean a(long j10) {
            long j11 = this.f35797d;
            return j11 == 0 || j10 + (j11 * 1000) <= System.currentTimeMillis();
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> map = new HashMap<>();
            map.put(bq.a("004Dedehejed"), this.f35794a);
            map.put("gt", Long.valueOf(this.f35795b));
            map.put("genType", this.f35796c);
            map.put("expTime", Long.valueOf(this.f35797d));
            map.put(bq.a("0026fk3k"), this.f35798e);
            return map;
        }

        public String c() {
            return this.f35794a;
        }

        public long d() {
            return this.f35795b;
        }

        public String e() {
            return this.f35796c;
        }

        public long f() {
            return this.f35797d;
        }

        public String g() {
            return this.f35798e;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final List<String> f35799a = Arrays.asList("4c5f81a0-4728-476f-a57f-b46fa44f07d3", "f6af99e2-2b64-4eb6-aba6-4d44fb935939", "00000000-0000-0000-0000-000000000000");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f35800b;

        private c() {
        }

        private String a(long j10) {
            String string = UUID.randomUUID().toString();
            return TextUtils.isEmpty(string) ? b(j10) : string;
        }

        private String b(long j10) {
            ByteArrayOutputStream byteArrayOutputStream;
            DataOutputStream dataOutputStream;
            String strB = null;
            try {
                long jNextLong = new SecureRandom().nextLong();
                long jCurrentTimeMillis = j10 + System.currentTimeMillis();
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeLong(jNextLong);
                        dataOutputStream.writeLong(jCurrentTimeMillis);
                        strB = ga.b(byteArrayOutputStream.toByteArray());
                        el.a(dataOutputStream, byteArrayOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            es.a().a(th);
                            el.a(dataOutputStream, byteArrayOutputStream);
                        } catch (Throwable th3) {
                            el.a(dataOutputStream, byteArrayOutputStream);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dataOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                dataOutputStream = null;
            }
            return strB;
        }

        private void c() {
            d dVarI = ax.f35783a + 30 >= d() ? bv.a().i() : e();
            if (dVarI != null && dVarI.c() != null) {
                this.f35800b = dVarI.c();
            }
            if (this.f35800b == null) {
                this.f35800b = f35799a;
            }
        }

        private int d() {
            return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        }

        private d e() {
            try {
                fu fuVar = new fu();
                fu.a aVar = new fu.a();
                aVar.f36613b = 2000;
                aVar.f36612a = 5000;
                String strB = fuVar.b(dy.a().a("dg") + "/getDuidBlacklist", null, null, aVar);
                HashMap mapA = ge.a(strB);
                if (mapA != null && !mapA.isEmpty()) {
                    if (!"200".equals(String.valueOf(mapA.get(bq.a("0062gjHjejKehgj"))))) {
                        throw new Throwable("RS is illegal: " + strB);
                    }
                    String strValueOf = String.valueOf(mapA.get(bq.a("004Ved6eje")));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        d dVarA = d.a(ga.a(f(), Base64.decode(strValueOf, 0)));
                        bv.a().a(dVarA);
                        return dVarA;
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
            return null;
        }

        private String f() {
            String[] strArr = {"QvxJJ", "FYsAX", "cvWe", "MqlWJL"};
            return strArr[1] + strArr[3] + new String[]{"akuRE", "wbMqR", "uBs", "CDpnc"}[3];
        }

        public b a() {
            c();
            return b();
        }

        public b b() {
            String strB;
            boolean z10 = true;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = new String[1];
            fz.a(ax.g()).l().a(new fz.a() { // from class: cn.fly.verify.ay.c.1
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) throws Throwable {
                    try {
                        strArr[0] = bVar.l();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
            try {
                String strJ = fz.d.j();
                String strTrim = strJ == null ? null : strJ.trim();
                String strAh = fc.a(ax.g()).d().ah();
                if (TextUtils.isEmpty(strAh)) {
                    strAh = (TextUtils.isEmpty(strArr[0]) || this.f35800b.contains(strArr[0])) ? null : strArr[0];
                }
                if (TextUtils.isEmpty(strAh)) {
                    strAh = a(SystemClock.elapsedRealtime());
                } else {
                    z10 = false;
                }
                String str = strTrim + ":" + strAh + ":" + ((Object) null) + ":" + ((Object) null);
                try {
                    strB = !TextUtils.isEmpty(str) ? ga.b(ga.a(str)) : null;
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
                if (z10) {
                    strB = "s_" + strB;
                }
                b bVar = new b(strB, System.currentTimeMillis(), "client", 0L, Base64.encodeToString(str.getBytes(), 2));
                bv.a().a(bVar);
                return bVar;
            } catch (Throwable th3) {
                es.a().a(th3);
                return null;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f35804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f35805b;

        public d(List<String> list, List<String> list2) {
            this.f35804a = list;
            this.f35805b = list2;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0025  */
        /* JADX WARN: Code duplicated, block: B:21:0x0040  */
        public static d a(String str) {
            List<String> listB;
            List<String> listB2;
            if (!TextUtils.isEmpty(str)) {
                try {
                    HashMap mapA = ge.a(str);
                    Object obj = mapA.get("idfas");
                    if (obj == null) {
                        listB = null;
                    } else if (obj instanceof String) {
                        listB = b((String) obj);
                    } else if (obj instanceof List) {
                        listB = (List) obj;
                    } else {
                        listB = null;
                    }
                    Object obj2 = mapA.get("oiid");
                    if (obj2 == null) {
                        listB2 = null;
                    } else if (obj2 instanceof String) {
                        listB2 = b((String) obj2);
                    } else if (obj2 instanceof List) {
                        listB2 = (List) obj2;
                    } else {
                        listB2 = null;
                    }
                    return new d(listB, listB2);
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
            return null;
        }

        private static List<String> b(String str) {
            String[] strArrSplit;
            return (TextUtils.isEmpty(str) || (strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) == null || strArrSplit.length <= 0) ? new ArrayList() : new ArrayList(Arrays.asList(strArrSplit));
        }

        public String a() {
            return ge.a((HashMap) b());
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> map = new HashMap<>();
            map.put("idfas", this.f35804a);
            map.put("oiid", this.f35805b);
            return map;
        }

        public List<String> c() {
            return this.f35804a;
        }

        public List<String> d() {
            return this.f35805b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, fz.b bVar) {
        try {
            if (!by.c()) {
                return null;
            }
            b bVarJ = bv.a().j();
            if (bVarJ != null && !bVarJ.a(bv.a().b("key_request_duid_time", 0L)) && !eo.a().d()) {
                return null;
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put(bq.a("004khej"), 1);
            map.put(bq.a("0057egeledSgh"), fz.d.j());
            map.put(bq.a("007_fgBedj7elekfd"), fz.d.k());
            map.put("admt", bVar.l());
            map.put("oamt", fc.a(ax.g()).d().ah());
            map.put("btt", Long.valueOf(SystemClock.elapsedRealtime()));
            map.put(bq.a("0042ekedejed"), eo.a().e());
            map.put("v", eo.a().b());
            map.put(bq.a("004kRehejed"), eo.a().g());
            map.put(bq.a("005Uedekegejed"), eo.a().h());
            map.put(bq.a("008j4elJk3eiedekeggj"), eo.a().i());
            if (bVarJ == null) {
                map.put(bq.a("004Wedehejed"), str);
                map.put("genType", "common");
            } else {
                map.put(bq.a("0044edehejed"), bVarJ.c());
                map.put("gt", Long.valueOf(bVarJ.d()));
                map.put("genType", bVarJ.e());
                map.put("expTime", Long.valueOf(bVarJ.f()));
                map.put(bq.a("0021fkQk"), bVarJ.g());
            }
            HashMap map2 = (HashMap) new ft(1024, "ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", "191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd").b(true, null, map, dy.a().a("dg") + "/v4/dgen", true);
            if (map2 != null) {
                bv.a().a("key_request_duid_time", System.currentTimeMillis());
                String str2 = (String) map2.get(bq.a("004Yekedejed"));
                if (!TextUtils.isEmpty(str2)) {
                    eo.a().a(str2);
                }
                b bVarA = b.a(ge.a(map2));
                if (bVarA != null) {
                    bv.a().a(bVarA);
                    return bVarA.c();
                }
            }
        } catch (Throwable th2) {
            es.a().b(th2);
        }
        return null;
    }

    private static HashMap<String, Object> a(String str, byte[] bArr) throws Throwable {
        return ge.a(ga.a(str, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final HashMap<String, Object> map) {
        ef.a(ef.a(ef.f36246c), new ee() { // from class: cn.fly.verify.ay.2
            @Override // cn.fly.verify.ee
            public boolean a(gb gbVar) {
                gj.a(ay.this.d(), ay.b(fz.d.j(), map));
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> map, String str, fz.b bVar) {
        try {
            if (by.c()) {
                HashMap map2 = (HashMap) map.get(bq.a("010BedSg^eeejFdg;ffZf:fgel"));
                HashMap map3 = new HashMap();
                map3.put(bq.a("005j0elfiSgf"), bw.a().b());
                for (Map.Entry entry : map2.entrySet()) {
                    map3.put(entry.getKey(), entry.getValue());
                }
                try {
                    map3.put(bq.a("007de*ekekejEg%ek"), Integer.valueOf(Integer.parseInt(String.valueOf(map3.get(bq.a("007deGekekej4gYek"))))));
                } catch (Throwable unused) {
                }
                map3.put(bq.a("004Pedehejed"), str);
                HashMap<String, Long> mapQ = bVar.q();
                HashMap<String, HashMap<String, Long>> mapP = bVar.p();
                if (mapQ != null) {
                    map3.put(bq.a("003DekVe'eg"), mapQ.get(bq.a("005j6elHjeh")));
                }
                if (mapP != null) {
                    HashMap<String, Long> map4 = mapP.get(bq.a("006ZgjedEdeVeked"));
                    if (map4 != null) {
                        map3.put(bq.a("013(gjed8de8ekedfmLj-elekAePfkSg"), map4.get(bq.a("005j)elXjeh")));
                    }
                    HashMap<String, Long> map5 = mapP.get(bq.a("0042edIeje"));
                    if (map5 != null) {
                        map3.put(bq.a("011,ed4eje+fmAjDelekUe+fk<g"), map5.get(bq.a("005j>elJjeh")));
                    }
                }
                try {
                    String str2 = (String) map3.get("fsuud");
                    if (!TextUtils.isEmpty(str2)) {
                        map3.put("fsuud", ge.a(str2));
                    }
                } catch (Throwable unused2) {
                }
                map3.put(bq.a("006Rekelegffegfk"), bVar.r());
                String strEncodeToString = Base64.encodeToString(ga.a(c(), ge.a(map3)), 2);
                HashMap<String, Object> map6 = new HashMap<>();
                map6.put("m", strEncodeToString);
                fu.a aVar = new fu.a();
                aVar.f36612a = 30000;
                aVar.f36613b = 30000;
                fu fuVar = new fu();
                String str3 = dy.a().a("dg") + bq.a("006m>edej)f fgel");
                HashMap<String, String> map7 = new HashMap<>();
                map7.put(bq.a("013Iflgj'gFekilffedXgfjBej2j.fd"), bu.c());
                map7.put(bq.a("004Gegelejed"), fc.a(ax.g()).d().ai());
                if ("200".equals(String.valueOf(ge.a(fuVar.b(str3, map6, map7, aVar)).get(bq.a("006Bgj%jej8ehgj"))))) {
                    bv.a().a(bv.f35905a, System.currentTimeMillis());
                }
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    private boolean a(bd bdVar, HashMap<String, Object> map, fz.b bVar) throws Throwable {
        if (!by.c()) {
            return false;
        }
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put(bq.a("007k3ekeledeh@dj"), bdVar.a());
        b bVarJ = bv.a().j();
        String strC = bVarJ != null ? bVarJ.c() : null;
        String strValueOf = String.valueOf(fz.d.c());
        map2.put(bq.a("006ekk fi@g!fd"), ek.a());
        map2.put(bq.a("004Vedehejed"), strC);
        map2.put(bq.a("006ekkk$fifk"), strValueOf);
        map2.put(bq.a("006ekk.ee5gFek"), String.valueOf(fz.d.m()));
        map2.put(bq.a("006%gjedfieeDg'ek"), String.valueOf(bdVar.b()));
        map2.put(bq.a("007fgj0ghelekfi"), String.valueOf(bVar.h()));
        String str = dy.a().a("dg") + bq.a("006mBedgjejfk[f");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put(bq.a("0134flgj?gLekilffed!gfjHejNjAfd"), bu.c());
        map3.put(bq.a("0041egelejed"), bVar.B());
        fu.a aVar = new fu.a();
        aVar.f36612a = 10000;
        aVar.f36613b = 10000;
        HashMap mapA = ge.a(new fu().b(str, map2, map3, aVar));
        if (bq.a("004j$ekeh)g").equals(String.valueOf(mapA.get(bq.a("004:ek=g!ehQk"))))) {
            this.f35786a = true;
        }
        if (!"200".equals(String.valueOf(mapA.get(bq.a("006QgjYjejJehgj"))))) {
            return false;
        }
        HashMap map4 = (HashMap) map.get(bq.a("007ekkEffSf.fgel"));
        HashMap map5 = (HashMap) map4.get(strValueOf);
        if (map5 == null) {
            map5 = new HashMap();
        }
        map5.put(bdVar.a(), ek.a());
        map4.put(strValueOf, map5);
        map.put(bq.a("007ekkYffWf^fgel"), map4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(HashMap<String, Object> map, bd bdVar, fz.b bVar) {
        if (bdVar == null) {
            bdVar = new a();
        }
        boolean z10 = false;
        try {
            HashMap map2 = (HashMap) map.get(bq.a("007ekkZff3f%fgel"));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(bq.a("007ekk7ff!f0fgel"), map2);
                z10 = true;
            }
            HashMap map3 = (HashMap) map2.get(fz.d.c());
            String str = map3 != null ? (String) map3.get(bdVar.a()) : null;
            String strA = ek.a();
            if ((str == null || !str.equals(strA)) && a(bdVar, map, bVar)) {
                return true;
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:104:0x0307  */
    public boolean a(HashMap<String, Object> map, fz.b bVar) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13 = true;
        if (map == null) {
            map = new HashMap<>();
            z10 = true;
        } else {
            z10 = false;
        }
        HashMap map2 = (HashMap) map.get(bq.a("0103edZg5eeej3dgXff1fCfgel"));
        if (map2 == null) {
            map2 = new HashMap();
            map.put(bq.a("010>ed5gOeeej=dg;ffNf[fgel"), map2);
            z10 = true;
        }
        Object obj = map2.get("admt");
        String strL = bVar.l();
        if (strL == null || strL.equals(obj)) {
            z11 = false;
        } else {
            map2.put("admt", strL);
            z11 = true;
        }
        Object obj2 = map2.get(bq.a("0042elMe5ejed"));
        String strAh = fc.a(ax.g()).d().ah();
        if ((obj2 != null || TextUtils.isEmpty(strAh)) && (obj2 == null || String.valueOf(obj2).equals(strAh))) {
            i10 = 0;
            z12 = z11;
        } else {
            map2.put(bq.a("004EelQeJejed"), strAh);
            z12 = true;
            i10 = 1;
        }
        Object obj3 = map2.get(bq.a("004Cekedejed"));
        String strC = eo.a().c();
        if ((obj3 == null && !TextUtils.isEmpty(strC)) || (obj3 != null && !String.valueOf(obj3).equals(strC))) {
            map2.put(bq.a("004Bekedejed"), strC);
            i10 |= 2;
            z12 = true;
        }
        Object obj4 = map2.get(bq.a("005Kedekegejed"));
        String strH = eo.a().h();
        if ((obj4 == null && !TextUtils.isEmpty(strH)) || (obj4 != null && !String.valueOf(obj4).equals(strH))) {
            map2.put(bq.a("0053edekegejed"), strH);
            i10 |= 4;
            z12 = true;
        }
        Object obj5 = map2.get(bq.a("004kRehejed"));
        String strG = eo.a().g();
        if ((obj5 == null && !TextUtils.isEmpty(strG)) || (obj5 != null && !String.valueOf(obj5).equals(strG))) {
            map2.put(bq.a("004kUehejed"), strG);
            i10 |= 8;
            z12 = true;
        }
        Object obj6 = map2.get("v");
        String strB = eo.a().b();
        if ((obj6 == null && !TextUtils.isEmpty(strB)) || (obj6 != null && !String.valueOf(obj6).equals(strB))) {
            map2.put("v", strB);
            z12 = true;
        }
        map2.put("cid_modify", Integer.valueOf(i10));
        if (z12) {
            z10 = true;
        }
        Object obj7 = map2.get(bq.a("0050egeled(gh"));
        String strJ = fz.d.j();
        if (strJ != null && !strJ.equals(obj7)) {
            map2.put(bq.a("0051egeled]gh"), strJ);
            z10 = true;
        }
        Object obj8 = map2.get(bq.a("0072fgLedj<elekfd"));
        String strK = fz.d.k();
        if (strK != null && !strK.equals(obj8)) {
            map2.put(bq.a("0071fg-edjNelekfd"), strK);
            z10 = true;
        }
        Object obj9 = map2.get(bq.a("007deWekekejZgIek"));
        String strD = bVar.d();
        if (strD != null && !strD.equals(obj9)) {
            map2.put(bq.a("007de[ekekej=gBek"), strD);
            z10 = true;
        }
        Object obj10 = map2.get(bq.a("006 gjfdgjeeZgZek"));
        String strH2 = fz.d.h();
        if (strH2 != null && !strH2.equals(obj10)) {
            map2.put(bq.a("006PgjfdgjeeZg_ek"), strH2);
            z10 = true;
        }
        Object obj11 = map2.get(bq.a("0023fjJk"));
        boolean zS = bVar.s();
        if (obj11 == null || !String.valueOf(zS ? 1 : 0).equals(String.valueOf(obj11))) {
            map2.put(bq.a("0021fj6k"), Integer.valueOf(zS ? 1 : 0));
            z10 = true;
        }
        Object obj12 = map2.get(bq.a("0077ggekLgeVfi!g:ed"));
        boolean zA = bVar.a();
        map2.put(bq.a("007Rggek3geQfiSg^ed"), Boolean.valueOf(zA));
        if ((obj12 == null && zA) || (obj12 != null && !String.valueOf(obj12).equals(String.valueOf(zA)))) {
            z10 = true;
        }
        String strValueOf = String.valueOf(map2.get("prelangmt"));
        String strValueOf2 = String.valueOf(bVar.D());
        if (!TextUtils.equals(strValueOf, strValueOf2)) {
            map2.put("prelangmt", strValueOf2);
            z10 = true;
        }
        Object obj13 = map2.get("gramgendt");
        int iE = bVar.E();
        if (obj13 == null || !TextUtils.equals(String.valueOf(obj13), String.valueOf(iE))) {
            map2.put("gramgendt", Integer.valueOf(iE));
            z10 = true;
        }
        if (((Integer) by.a("ndi", 0)).intValue() == 1) {
            String str = (String) map2.get("fsuud");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fbt", Long.valueOf(bVar.n(0)));
            linkedHashMap.put("fwt", Long.valueOf(bVar.n(1)));
            linkedHashMap.put("fls", Long.valueOf(bVar.n(2)));
            linkedHashMap.put("fda", Long.valueOf(bVar.n(3)));
            linkedHashMap.put("fsm", Long.valueOf(bVar.n(4)));
            linkedHashMap.put("fus", Long.valueOf(bVar.n(5)));
            linkedHashMap.put("fsf", Long.valueOf(bVar.n(6)));
            String strA = ge.a((HashMap) linkedHashMap);
            if (TextUtils.equals(str, strA)) {
                z13 = z10;
            } else {
                map2.put("fsuud", strA);
            }
        } else {
            z13 = z10;
        }
        map2.put(bq.a("004khej"), Integer.valueOf(fz.d.e()));
        map2.put(bq.a("010)ed_g)eeej;dgOgdfdEkg"), bVar.o());
        map2.put(bq.a("003ke5ed"), Integer.valueOf(bVar.t() ? 1 : 0));
        map2.put(bq.a("010Agj9d4ekYggfUgjejhe(g"), bVar.c());
        HashMap<String, Object> mapA = cc.a(ax.g());
        if (mapA != null && mapA.size() > 0) {
            map2.putAll(mapA);
        }
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(String str, HashMap<String, Object> map) {
        String strA = ge.a((HashMap) map);
        try {
            return ga.a(str, strA);
        } catch (Throwable th2) {
            es.a().a(th2);
            return strA.getBytes();
        }
    }

    private String c() {
        return bq.a("016:gjedfiem;dAelegegel2fekVemgjedfi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File d() {
        return gj.a(ax.g(), ec.f36235b, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> e() {
        try {
            return a(fz.d.j(), gj.b(d()));
        } catch (Throwable th2) {
            es.a().a(th2);
            return new HashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        bv bvVarA = bv.a();
        String str = bv.f35905a;
        long jB = bvVarA.b(str, -1L);
        if (jB != -1) {
            return System.currentTimeMillis() >= jB + (((Long) by.a(bq.a("0051edejfk8ek"), 2592000L)).longValue() * 1000);
        }
        bv.a().a(str, System.currentTimeMillis());
        return false;
    }

    synchronized String a() {
        b bVarJ = bv.a().j();
        if (bVarJ == null || TextUtils.isEmpty(bVarJ.c())) {
            return null;
        }
        return bVarJ.c();
    }

    public void a(final bd bdVar, final gq<Void> gqVar) {
        es.a().a("di init", new Object[0]);
        fz.c cVarF = fz.a(ax.g()).l().d().q().p().s().a().o().t().c().h().C().B().z().r().E().F();
        if (((Integer) by.a("ndi", 0)).intValue() == 1) {
            cVarF.b(bq.a("028m?ed]ejemEgjfdgjZjgGegAmheHgjXj,ilSige6edIgMekemRj%fj(j")).b(bq.a("035mRed_ejem,gjfdgjDjg_egQm4ghAejdih.ejgjJjXeigj,gjjVejBfIfkgjemfjeg=h")).b(bq.a("028m$edDejemUgjfdgjIjgVegImhJel.d$figjGgjj8ejYfRfkgjemedgg")).b(bq.a("005mCedDeje")).b(bq.a("012mOedJejem7gjfdgjWjgIeg")).b(bq.a("018mJedDejem4gjfdgjTjgSeg;m'ehgj9gKekgj")).b(bq.a("045m,ed5ejem*gjfdgjQjg:egQm8ehgj>g2ekgjVmEgi<m(gj.gjjNejVfCfkgjeifgej:fTfkLgWekEk1ekejUfjKemfjegHh"));
        }
        cVarF.a(new fz.a() { // from class: cn.fly.verify.ay.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                try {
                    synchronized (ay.this.f35787b) {
                        String strA = ay.this.a(du.f36161a, bVar);
                        HashMap mapE = ay.this.e();
                        boolean zA = ay.this.a((HashMap<String, Object>) mapE, bVar);
                        boolean zF = ay.this.f();
                        ay.this.f35786a = zA || zF;
                        boolean zA2 = ay.this.a((HashMap<String, Object>) mapE, bdVar, bVar);
                        es.a().a("map: " + mapE + "\nisCh: " + zA + ", isG: " + zF + ", isReg: " + zA2, ", udif:" + ay.this.f35786a);
                        if (ay.this.f35786a) {
                            if (TextUtils.isEmpty(strA)) {
                                strA = du.f36161a;
                            }
                            ay.this.a((HashMap<String, Object>) mapE, strA, bVar);
                        }
                        if (zA || zA2) {
                            ay.this.a((HashMap<String, Object>) mapE);
                        }
                    }
                    gqVar.a(null);
                } catch (Throwable th2) {
                    gqVar.a(null);
                    throw th2;
                }
            }
        });
    }

    synchronized String b() {
        String strA;
        Throwable th2;
        try {
            strA = a();
            try {
                if (!TextUtils.isEmpty(strA) && !TextUtils.equals("null", strA)) {
                    return strA;
                }
                b bVarA = new c().a();
                if (bVarA != null) {
                    strA = bVarA.c();
                }
            } catch (Throwable th3) {
                th2 = th3;
                es.a().a(th2);
            }
        } catch (Throwable th4) {
            strA = null;
            th2 = th4;
        }
        return strA;
    }
}
