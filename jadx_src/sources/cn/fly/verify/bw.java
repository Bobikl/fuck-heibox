package cn.fly.verify;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35925a = ec.a("0021daea");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35926b = ec.a("005>bjbi6hgc");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35927c = ec.a("005)bjbiMh7baZc");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35928d = ec.a("016^fdfchdfjfgffgifbfhdf7bGddCa8bacdbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static bw f35929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f35931g = ax.g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TreeMap<String, Object> f35932h;

    private bw() {
    }

    public static bw a() {
        if (f35929e == null) {
            synchronized (bw.class) {
                if (f35929e == null) {
                    f35929e = new bw();
                }
            }
        }
        return f35929e;
    }

    private String a(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArrC = el.c();
        Closeable closeable = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(gZIPOutputStream);
                    try {
                        bufferedOutputStream.write(str.getBytes("utf-8"));
                        bufferedOutputStream.flush();
                        el.a(bufferedOutputStream, gZIPOutputStream, byteArrayOutputStream);
                        byte[] bArrA = ga.a(bArrC, byteArrayOutputStream.toByteArray());
                        byte[] bArrA2 = new gg(1024).a(bArrC, new BigInteger("ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", 16), new BigInteger("191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", 16));
                        try {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                                try {
                                    dataOutputStream.writeInt(bArrA2.length);
                                    dataOutputStream.write(bArrA2);
                                    dataOutputStream.writeInt(bArrA.length);
                                    dataOutputStream.write(bArrA);
                                    dataOutputStream.flush();
                                    el.a(dataOutputStream, byteArrayOutputStream2);
                                    return Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = dataOutputStream;
                                    el.a(closeable, byteArrayOutputStream2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream2 = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = bufferedOutputStream;
                        el.a(closeable, gZIPOutputStream, byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                gZIPOutputStream = null;
            }
        } catch (Throwable th8) {
            th = th8;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }

    private String a(TreeMap<String, Object> treeMap) {
        HashMap map;
        String str = null;
        if (!by.c() || treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        try {
            HashMap map2 = new HashMap();
            map2.put(ec.a("007Ocd$bag2bibhca"), treeMap.get(ec.a("007Ocd$bag2bibhca")));
            map2.put(ec.a("005?bdbibaNde"), treeMap.get(ec.a("005?bdbibaNde")));
            map2.put(ec.a("0065dgcadgbb.d<bh"), treeMap.get(ec.a("0065dgcadgbb.d<bh")));
            map2.put(ec.a("008Oba+dAbbbgWad;ccba"), treeMap.get(ec.a("008Oba+dAbbbgWad;ccba")));
            map2.put(ec.a("004Ebabebgba"), treeMap.get(ec.a("004Ebabebgba")));
            HashMap<String, Object> map3 = new HashMap<>();
            map3.put(ec.a("006bhh!cf8d3ca"), ek.a());
            map3.put("m", a(ge.a(map2)));
            HashMap<String, String> map4 = new HashMap<>();
            map4.put(ec.a("013BcidgNd+bhficcbaDdcg]bg'g1ca"), bu.c());
            map4.put(ec.a("004Sbdbibgba"), fc.a(ax.g()).d().ai());
            fu.a aVar = new fu.a();
            aVar.f36612a = 30000;
            aVar.f36613b = 30000;
            HashMap mapA = ge.a(new fu().b(dy.a().a("gclg") + ec.a("007j]bi5hdc:bgba"), map3, map4, aVar));
            if (!"200".equals(String.valueOf(mapA.get(ec.a("004aObiba;d")))) || (map = (HashMap) mapA.get(ec.a("004>ba@bgb"))) == null) {
                return null;
            }
            String str2 = (String) map.get(ec.a("005g-bicf]dc"));
            try {
                f35929e.f35930f = str2;
                b(str2);
                return str2;
            } catch (Throwable th2) {
                th = th2;
                str = str2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        es.a().c(th);
        return str;
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return ge.a(ga.a(str, bArr));
        } catch (Throwable th2) {
            es.a().a(th2);
            return new HashMap<>();
        }
    }

    private boolean a(HashMap<String, Object> map) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        fz.a(ax.g()).i().a(new fz.a() { // from class: cn.fly.verify.bw.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                strArr[0] = bVar.i();
                countDownLatch.countDown();
            }
        });
        try {
            this.f35932h.put(ec.a("007,cdObag4bibhca"), fz.d.k());
            this.f35932h.put(ec.a("0056bdbibaHde"), fz.d.j());
            this.f35932h.put(ec.a("006HdgcadgbbId@bh"), Integer.valueOf(fz.d.g()));
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
            String str = strArr[0];
            if (!TextUtils.isEmpty(str)) {
                this.f35932h.put(ec.a("008XbaRdTbbbg7adIccba"), str);
            }
            this.f35932h.put(ec.a("004Zbabebgba"), du.a((bd) null));
            String strB = ga.b(new JSONObject(this.f35932h).toString());
            TreeMap<String, Object> treeMap = new TreeMap<>();
            treeMap.put(ec.a("010DchVdcdBbh@beQfabafg"), strB);
            b(treeMap);
            if (map == null || map.isEmpty() || !strB.equals((String) map.get(ec.a("010+ch%dcdEbh+be%fabafg")))) {
                return true;
            }
            es.a().a("[%s] %s", f35925a, "No changes");
            return false;
        } catch (Throwable th2) {
            es.a().c(th2);
            return false;
        }
    }

    private byte[] a(String str, TreeMap<String, Object> treeMap) {
        try {
            return ga.c(str, new JSONObject(treeMap).toString());
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    private void b(String str) {
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream = null;
        try {
            File fileB = gj.b(this.f35931g, f35926b);
            if (fileB != null) {
                fileOutputStream = new FileOutputStream(fileB);
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    try {
                        dataOutputStream2.writeUTF(str);
                        dataOutputStream2.flush();
                        dataOutputStream = dataOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = dataOutputStream2;
                        try {
                            es.a().a(th);
                            el.a(dataOutputStream, fileOutputStream);
                            return;
                        } catch (Throwable th3) {
                            el.a(dataOutputStream, fileOutputStream);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                fileOutputStream = null;
            }
            el.a(dataOutputStream, fileOutputStream);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    private void b(TreeMap<String, Object> treeMap) {
        gj.a(gj.b(this.f35931g, f35927c), a(f35928d, treeMap));
    }

    private String d() {
        TreeMap<String, Object> treeMap;
        this.f35932h = new TreeMap<>();
        String strA = null;
        try {
            String strE = e();
            boolean zA = a(f());
            if (!TextUtils.isEmpty(strE)) {
                es.a().a("[%s] %s", f35925a, "tk status: " + zA);
                if (zA) {
                    treeMap = this.f35932h;
                } else {
                    strA = strE;
                }
                f35929e.f35930f = strA;
                return strA;
            }
            treeMap = this.f35932h;
            strA = a(treeMap);
            f35929e.f35930f = strA;
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return strA;
    }

    private String e() throws IOException {
        DataInputStream dataInputStream;
        FileInputStream fileInputStream;
        String utf;
        DataInputStream dataInputStream2 = null;
        try {
            File fileB = gj.b(this.f35931g, f35926b);
            if (!fileB.exists() || fileB.length() <= 0) {
                utf = null;
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(fileB);
                try {
                    dataInputStream = new DataInputStream(fileInputStream);
                    try {
                        utf = dataInputStream.readUTF();
                        dataInputStream2 = dataInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            es.a().a(th);
                            el.a(dataInputStream, fileInputStream);
                            return null;
                        } catch (Throwable th3) {
                            el.a(dataInputStream, fileInputStream);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dataInputStream = null;
                }
            }
            el.a(dataInputStream2, fileInputStream);
            return utf;
        } catch (Throwable th5) {
            th = th5;
            dataInputStream = null;
            fileInputStream = null;
        }
    }

    private HashMap<String, Object> f() {
        return a(f35928d, gj.b(gj.b(this.f35931g, f35927c)));
    }

    public String b() {
        if (TextUtils.isEmpty(this.f35930f)) {
            synchronized (bw.class) {
                if (TextUtils.isEmpty(this.f35930f)) {
                    return d();
                }
            }
        }
        return this.f35930f;
    }

    public String c() {
        String str = this.f35930f;
        return TextUtils.isEmpty(str) ? e() : str;
    }
}
