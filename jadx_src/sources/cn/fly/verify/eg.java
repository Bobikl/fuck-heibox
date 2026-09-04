package cn.fly.verify;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f36255a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static eg f36256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f36257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f36258d = new BigInteger("f53c224aefb38daa0825c1b8ea691b16d2e16db10880548afddd780c6670a091a11dafa954ea4a9483797fda1045d2693a08daa48cf9cedce1e8733b857304cb", 16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BigInteger f36259e = new BigInteger("27749621e6ca022469645faed16e8261acf6af822467382d55c24bb9bc02356ab16e76ddc799dc8ba6b4f110411996eeb63505c9dcf969d3fc085d712f0f1a9713b67aa1128d7cc41bda363afb0ec7ade60e542a4e22869395331cc0096de412034551e98bb2629ae1b7168b8bc82006d064ab335d8567283e70beb6a49e9423", 16);

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f36265d;

        private a() {
        }

        private void b(final int i10, final int i11, final String str, final String str2) {
            es.a().a("[LGSM] SLR: onL", new Object[0]);
            if (eg.a().a(new gu() { // from class: cn.fly.verify.eg.a.1
                @Override // cn.fly.verify.gu
                protected void a() throws Throwable {
                    es.a().a("[LGSM] SLR: Ins", new Object[0]);
                    HashMap map = new HashMap();
                    map.put(ei.a("010(fidcehgk!fPdjfididk4e"), Integer.valueOf(i10));
                    map.put(ei.a("006Nfidcehfc6d<ej"), str);
                    map.put(ei.a("004i4ec9jf"), Integer.valueOf(i11));
                    map.put(ei.a("005fTdjdjVdi"), Long.valueOf(System.currentTimeMillis()));
                    String strEncode = URLEncoder.encode(str2);
                    if (TextUtils.isEmpty(strEncode)) {
                        strEncode = str2;
                    }
                    map.put(ei.a("003%dffiej"), Base64.encodeToString(strEncode.getBytes("utf-8"), 2));
                    map.put(ei.a("005i1didf<fLfi"), 1);
                    es.a().a("[LGSM] W l " + map, new Object[0]);
                    eg.b(i11).a(ge.a(map));
                }
            }) && en.b()) {
                es.a().a("[LGSM] SLR: U", new Object[0]);
                ep.f36340c.execute(new c());
            }
        }

        public a a(int i10, int i11, String str, String str2) {
            this.f36262a = i10;
            this.f36263b = i11;
            this.f36264c = str;
            this.f36265d = str2;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b(this.f36262a, this.f36263b, this.f36264c, this.f36265d);
            } catch (Throwable th2) {
                es.a().b(th2);
            }
        }
    }

    public static class b implements et.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<HashMap<String, Object>> f36271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f36273c;

        private b() {
            this.f36271a = new ArrayList<>();
            this.f36272b = -1;
        }

        private HashMap<String, Object> a(fz.b bVar, int i10, String str) {
            HashMap<String, Object> map = new HashMap<>();
            map.put(ei.a("003Ceh>f,ec"), ek.a());
            map.put(ei.a("004(dcdgdidc"), du.a((bd) null));
            map.put(ei.a("004jgdi"), Integer.valueOf(fz.d.e()));
            map.put(ei.a("003Nfidceh"), str);
            map.put(ei.a("0061fidcehdd,fWdj"), Integer.valueOf(i10));
            map.put(ei.a("007djjedOdf=f"), bVar.j());
            map.put(ei.a("006djjj?ehej"), fz.d.c());
            map.put(ei.a("006djj1dd,f.dj"), String.valueOf(fz.d.m()));
            map.put(ei.a("005AdfdkdcWfg"), fz.d.j());
            if (by.b()) {
                map.put(ei.a("008Edc,fYdddiHcf2didc"), bVar.i());
            }
            map.put(ei.a("006^fiecfidd4f7dj"), String.valueOf(fz.d.g()));
            map.put(ei.a("011efi[fgdkdjeh i)ecYjf"), bVar.h());
            return map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String b(String str) throws Throwable {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th2;
            byte[] bytes;
            GZIPOutputStream gZIPOutputStream;
            Throwable th3;
            try {
                bytes = str.getBytes();
                byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = byteArrayInputStream.read(bArr, 0, 1024);
                                    if (i10 == -1) {
                                        gZIPOutputStream.flush();
                                        el.a(gZIPOutputStream);
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.flush();
                                        String strEncodeToString = Base64.encodeToString(byteArray, 2);
                                        el.a(byteArrayOutputStream, byteArrayInputStream);
                                        return strEncodeToString;
                                    }
                                    gZIPOutputStream.write(bArr, 0, i10);
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                el.a(gZIPOutputStream);
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            gZIPOutputStream = null;
                            th3 = th5;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        el.a(bytes, byteArrayInputStream);
                        throw th2;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    bytes = null;
                    el.a(bytes, byteArrayInputStream);
                    throw th2;
                }
            } catch (Throwable th8) {
                byteArrayInputStream = null;
                th2 = th8;
                bytes = null;
            }
        }

        @Override // cn.fly.verify.et.a
        public void a(String str) {
            es.a().a("[LGSM] ULL onRd " + str, new Object[0]);
            HashMap<String, Object> mapA = ge.a(str);
            try {
                this.f36272b = Integer.parseInt(String.valueOf(mapA.get(ei.a("0108fidcehgk fQdjfididk1e"))));
            } catch (Throwable unused) {
            }
            this.f36273c = (String) mapA.get(ei.a("006Jfidcehfc(dHej"));
            this.f36271a.add(mapA);
        }

        @Override // cn.fly.verify.et.a
        public boolean a(fz.b bVar) {
            es.a().a("[LGSM] ULL onUd", new Object[0]);
            HashMap<String, Object> mapA = a(bVar, this.f36272b, this.f36273c);
            mapA.put(ei.a("006fZdjdjdffiej"), this.f36271a);
            try {
                String strA = ge.a((HashMap) mapA);
                this.f36271a.clear();
                String strB = b(strA);
                if (ei.a("004e@dkMef").equals(bVar.h())) {
                    throw new IllegalStateException("network is disconnected!");
                }
                HashMap<String, Object> map = new HashMap<>();
                map.put("m", strB);
                fu.a aVar = new fu.a();
                aVar.f36612a = 10000;
                aVar.f36613b = 10000;
                HashMap<String, String> map2 = new HashMap<>();
                map2.put(ei.a("013^ekfiOf6djhkeedc!fei9di4iTec"), bu.c());
                map2.put(ei.a("004Sdfdkdidc"), bVar.B());
                String str = dy.a().a("el") + "/errlog";
                es.a().a("[LGSM] ULL onUd: Req", new Object[0]);
                String strB2 = new fu().b(str, map, map2, aVar);
                es.a().a("[LGSM] ULL onUd: " + String.format("Resp(%s): %s", str, strB2), new Object[0]);
                Object obj = ge.a(strB2).get(ei.a("006Zfi0idi)dgfi"));
                return (obj != null ? ((Integer) obj).intValue() : 0) == 200;
            } catch (Throwable th2) {
                es.a().a("[LGSM] ULL onUd: E", new Object[0]);
                es.a().a(th2);
            }
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f36274a;

        private c() {
            this.f36274a = new gu() { // from class: cn.fly.verify.eg.c.1
                @Override // cn.fly.verify.gu
                protected void a() {
                    es.a().a("[LGSM] UCLR", new Object[0]);
                    eg.b(1).a(new b());
                }
            };
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (by.c()) {
                    fz.a(ax.g()).h().a(new fz.a() { // from class: cn.fly.verify.eg.c.2
                        @Override // cn.fly.verify.fz.a
                        public void a(fz.b bVar) {
                            if (ei.a("004e]dk*ef").equals(bVar.h())) {
                                return;
                            }
                            int iIntValue = ((Integer) by.a(ei.a("004cfEdjdj"), 0)).intValue();
                            es.a().a("[LGSM] ULR Ck cerr: " + iIntValue, new Object[0]);
                            if (iIntValue == 1) {
                                eg.a().a(c.this.f36274a);
                            } else {
                                eg.b(1).a(((Long) by.a("cerr_max", 104857600L)).longValue());
                            }
                        }
                    });
                } else {
                    es.a().a("[LGSM] ULR Ck nt: FBDN", new Object[0]);
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
    }

    private eg() {
    }

    public static synchronized eg a() {
        if (f36256b == null) {
            f36256b = new eg();
        }
        return f36256b;
    }

    private String a(String str) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrC = el.c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    byte[] bArrA = new gg(1024).a(bArrC, this.f36258d, this.f36259e);
                    dataOutputStream.writeInt(bArrA.length);
                    dataOutputStream.write(bArrA);
                    byte[] bArrA2 = ga.a(bArrC, str.getBytes("utf-8"));
                    dataOutputStream.writeInt(bArrA2.length);
                    dataOutputStream.write(bArrA2);
                    dataOutputStream.flush();
                    el.a(dataOutputStream, byteArrayOutputStream);
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                } catch (Throwable th2) {
                    th = th2;
                    el.a(dataOutputStream, byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
            }
        } catch (Throwable th4) {
            es.a().a(th4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final Runnable runnable) {
        if (this.f36257c == null) {
            File file = new File(ax.g().getFilesDir(), ei.a("005=dlVgEdkXc8eh"));
            this.f36257c = file;
            if (!file.exists()) {
                try {
                    this.f36257c.createNewFile();
                } catch (Throwable unused) {
                }
            }
        }
        return ef.a(this.f36257c, new ee() { // from class: cn.fly.verify.eg.1
            @Override // cn.fly.verify.ee
            public boolean a(gb gbVar) {
                runnable.run();
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static et b(int i10) {
        return new et(ei.a("005Adldf8cg[ej"), ei.a("005Adldf8cg[ej") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10, 50);
    }

    public int a(int i10, String str) {
        if (ax.f() != null && f36255a) {
            Intent intent = new Intent();
            intent.setPackage(ei.a("015ceQdlfiDhd1djEf+fidcehdl9g!dkej"));
            intent.putExtra(ei.a("007jdcSeh$dJej0f"), ax.g().getPackageName());
            intent.putExtra(ei.a("008j=djdidkdjdi6i^ec"), i10);
            intent.putExtra("ver", ax.f35783a);
            intent.putExtra(ei.a("003Jdffiej"), a(str));
            gi.a(ax.f(), ei.a("013Yfi.fe:dcfjdjdkNdWdc]cdFfi i"), new Object[]{intent}, (Class<?>[]) new Class[]{Intent.class}, 0);
        }
        return 0;
    }

    public void a(int i10, String str, int i11, String str2) {
        es.a().a("[LGSM] Sd curr", new Object[0]);
        if (i10 == 1) {
            new a().a(i11, i10, str, str2).run();
        }
    }

    public void b() {
        es.a().a("[LGSM] Sd last", new Object[0]);
        ep.f36340c.execute(new c());
    }
}
