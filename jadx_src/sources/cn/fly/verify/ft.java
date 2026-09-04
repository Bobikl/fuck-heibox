package cn.fly.verify;

import android.util.Base64;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class ft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36593a = ei.a("004+dcdgdidc");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadPoolExecutor f36594b = new ThreadPoolExecutor(3, 20, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f36595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f36596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gg f36597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fu f36598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private fu.a f36599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ThreadPoolExecutor f36600h;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public ft(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public ft(int i10, String str, String str2, fu.a aVar) {
        this.f36597e = new gg(i10);
        this.f36595c = new BigInteger(str, 16);
        this.f36596d = new BigInteger(str2, 16);
        this.f36598f = new fu();
        if (aVar != null) {
            this.f36599g = aVar;
        } else {
            fu.a aVar2 = new fu.a();
            this.f36599g = aVar2;
            aVar2.f36612a = 30000;
            aVar2.f36613b = 5000;
        }
        this.f36600h = f36594b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(fq fqVar) throws Throwable {
        List<String> listA = a(fqVar, ei.a("0148eddk^eifei2hkfe_feTej(ih"));
        if (listA == null || listA.size() <= 0) {
            return -1L;
        }
        return Long.parseLong(listA.get(0));
    }

    private fs a(final byte[] bArr, final String[] strArr, final boolean z10) {
        return new fs() { // from class: cn.fly.verify.ft.1
            @Override // cn.fly.verify.fs
            public void a(fq fqVar) throws Throwable {
                InputStream inputStreamB;
                int iA = fqVar.a();
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    inputStreamB = iA == 200 ? fqVar.b() : fqVar.c();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i10 = inputStreamB.read(bArr2);
                                if (i10 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream2.write(bArr2, 0, i10);
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            if (iA != 200) {
                                HashMap mapA = ge.a(new String(byteArray, "utf-8"));
                                mapA.put(ei.a("010hiijAel[idiYdgfi"), Integer.valueOf(iA));
                                throw new a(ge.a(mapA));
                            }
                            if (z10) {
                                long jA = ft.this.a(fqVar);
                                if (jA == -1 || jA != byteArray.length) {
                                    HashMap map = new HashMap();
                                    map.put(ei.a("010hiijQelRidiWdgfi"), Integer.valueOf(iA));
                                    map.put(ei.a("006^fiYidi!dgfi"), -2);
                                    map.put(ei.a("005fLdjdjdkdj"), "Illegal content length");
                                    throw new a(ge.a(map));
                                }
                                strArr[0] = ft.this.a(bArr, byteArray);
                            } else {
                                strArr[0] = new String(byteArray, "utf-8");
                            }
                            el.a(byteArrayOutputStream2, inputStreamB);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            el.a(byteArrayOutputStream, inputStreamB);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamB = null;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T a(boolean z10, HashMap<String, String> map, String str, String str2, boolean z11, boolean z12, boolean z13) throws Throwable {
        byte[] bArrC = el.c();
        byte[] bArrA = a(bArrC, str, z11);
        String[] strArr = new String[1];
        fs fsVarA = a(bArrC, strArr, z13);
        if (z12) {
            String strEncodeToString = Base64.encodeToString(bArrA, 2);
            HashMap<String, String> mapA = a(z10, map, str, strEncodeToString.getBytes("utf-8").length);
            fx fxVar = new fx();
            fxVar.a(strEncodeToString);
            es.a().a(">>>  request(" + str2 + "): " + str + "\nheader = " + mapA.toString(), new Object[0]);
            this.f36598f.a(str2, mapA, fxVar, -1, fsVarA, this.f36599g);
        } else {
            HashMap<String, String> mapA2 = a(z10, map, str, -1);
            es.a().a(">>>  request(" + str2 + "): " + str + "\nheader = " + mapA2.toString(), new Object[0]);
            this.f36598f.a(str2, bArrA, mapA2, -1, fsVarA, this.f36599g);
        }
        if (strArr[0] == 0) {
            return null;
        }
        es.a().a(">>> response(" + str2 + "): " + strArr[0], new Object[0]);
        return z13 ? (T) b(strArr[0]) : (T) strArr[0];
    }

    public static String a(String str) {
        return el.b(str);
    }

    private String a(HashMap<String, Object> map) {
        if (map == null) {
            return "{}";
        }
        String strA = ge.a((HashMap) map);
        return strA.length() == 0 ? "{}" : strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(byte[] bArr, byte[] bArr2) throws Throwable {
        return new String(ga.b(bArr, Base64.decode(bArr2, 2)), "utf-8");
    }

    public static HashMap<String, String> a() throws Throwable {
        HashMap<String, String> map = new HashMap<>();
        map.put(ei.a("003Reh0fIec"), ek.a());
        map.put(ei.a("013OekfiRf;djhkeedcXfeiSdiPi7ec"), bu.c());
        map.put(ei.a("004Rdfdkdidc"), fc.a(ax.g()).d().ai());
        return map;
    }

    private HashMap<String, String> a(String str, int i10) throws Throwable {
        HashMap<String, String> mapA = a();
        mapA.put(ei.a("004*fidiej^e"), ga.b(str + ax.e()));
        mapA.put(ei.a("014(eddkJeifei*hkfe.feZej2ih"), String.valueOf(i10));
        return mapA;
    }

    private HashMap<String, String> a(boolean z10, HashMap<String, String> map, String str, int i10) throws Throwable {
        HashMap<String, String> map2;
        if (z10) {
            map2 = i10 > 0 ? a(str, i10) : a();
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    private List<String> a(fq fqVar, String str) throws Throwable {
        Map<String, List<String>> mapD = fqVar.d();
        if (mapD == null || mapD.isEmpty()) {
            return null;
        }
        for (String str2 : mapD.keySet()) {
            if (str2 != null && str2.equals(str)) {
                return mapD.get(str2);
            }
        }
        return null;
    }

    private byte[] a(byte[] bArr, String str, boolean z10) throws Throwable {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        GZIPOutputStream gZIPOutputStream;
        Closeable closeable = null;
        if (z10) {
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(gZIPOutputStream);
                        try {
                            bufferedOutputStream.write(str.getBytes("utf-8"));
                            bufferedOutputStream.flush();
                            el.a(bufferedOutputStream, gZIPOutputStream, byteArrayOutputStream2);
                            bytes = byteArrayOutputStream2.toByteArray();
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = bufferedOutputStream;
                            el.a(closeable, gZIPOutputStream, byteArrayOutputStream2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream2 = null;
                gZIPOutputStream = null;
            }
        } else {
            bytes = str.getBytes("utf-8");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    byte[] bArrA = this.f36597e.a(bArr, this.f36595c, this.f36596d);
                    dataOutputStream.writeInt(bArrA.length);
                    dataOutputStream.write(bArrA);
                    byte[] bArrA2 = ga.a(bArr, bytes);
                    dataOutputStream.writeInt(bArrA2.length);
                    dataOutputStream.write(bArrA2);
                    dataOutputStream.flush();
                    el.a(dataOutputStream, byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th6) {
                    th = th6;
                    closeable = dataOutputStream;
                    el.a(closeable, byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            byteArrayOutputStream = null;
        }
    }

    private Object b(String str) throws Throwable {
        if (str == null) {
            HashMap map = new HashMap();
            map.put(ei.a("006_fi?idiAdgfi"), -1);
            map.put(ei.a("005f^djdjdkdj"), "RS is empty");
            throw new a(ge.a(map));
        }
        HashMap mapA = ge.a(str.trim());
        if (!mapA.isEmpty()) {
            Object obj = mapA.get(ei.a("003Ndj;fEfi"));
            return obj == null ? mapA.get(ei.a("004Ddc1did")) : obj;
        }
        HashMap map2 = new HashMap();
        map2.put(ei.a("006Wfi*idi!dgfi"), -1);
        map2.put(ei.a("005f=djdjdkdj"), "RS is empty");
        throw new a(ge.a(map2));
    }

    public <T> T a(HashMap<String, Object> map, String str, boolean z10) throws Throwable {
        return (T) a((HashMap<String, String>) null, map, str, z10);
    }

    public <T> T a(HashMap<String, String> map, HashMap<String, Object> map2, String str, boolean z10) throws Throwable {
        return (T) a(true, map, map2, str, z10);
    }

    public <T> T a(boolean z10, HashMap<String, String> map, HashMap<String, Object> map2, String str, boolean z11) throws Throwable {
        return (T) a(z10, map, a(map2), str, z11, true, true);
    }

    public <T> T b(boolean z10, HashMap<String, String> map, HashMap<String, Object> map2, String str, boolean z11) throws Throwable {
        return (T) a(z10, map, a(map2), str, true, false, z11);
    }
}
