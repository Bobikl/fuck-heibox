package com.tencent.qmsp.sdk.c;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f101788f = {org.apache.tools.tar.c.I, 117, -95};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f101789g = {38, 114, -96};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f101790h = {com.google.common.base.a.f56671x, 125, -96, 80, 13, 57, 57, -7, 36, 100};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f101791i = {com.google.common.base.a.f56671x, 125, -96, 80, 13, 57, 91, -20, org.apache.tools.tar.c.G};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f101792j = {org.apache.tools.tar.c.J, 100};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f101793k = {com.google.common.base.a.f56671x, 125, -96, 80, 96, com.google.common.base.a.B, 117};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[][] f101794l = {new byte[]{org.apache.tools.tar.c.L, 100}, new byte[]{org.apache.tools.tar.c.G, 99, -70}, new byte[]{org.apache.tools.tar.c.L, 115}};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static g f101795m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f101798c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, Integer> f101796a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f101797b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f101799d = com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f101800e = 0;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.a(false);
        }
    }

    public class b implements com.tencent.qmsp.sdk.b.e {
        b() {
        }

        @Override // com.tencent.qmsp.sdk.b.e
        public void a(int i10, JSONObject jSONObject) throws Throwable {
            if (i10 != 161 || jSONObject == null) {
                return;
            }
            g.this.a(jSONObject);
        }
    }

    public interface c {
        void a(List<Pair<Integer, Integer>> list);
    }

    private g() throws Throwable {
        this.f101798c = null;
        this.f101798c = com.tencent.qmsp.sdk.app.a.getContext().getSharedPreferences(com.tencent.qmsp.sdk.c.b.f101769a + a(f101791i), 0);
        b();
    }

    private int a(int i10, int i11) {
        return a(new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private int a(Pair<Integer, Integer> pair) {
        if (pair == null) {
            return -1;
        }
        switch (((Integer) pair.first).intValue()) {
            case 10000:
                if (com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 5000) {
                    com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().set(((Integer) pair.second).intValue());
                    com.tencent.qmsp.sdk.f.g.a(a(f101793k), 1, "[CB-CYC] Socket Conn TimeOut: " + com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().get());
                }
                return 0;
            case 10001:
                if (com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 5000) {
                    com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().set(((Integer) pair.second).intValue());
                    com.tencent.qmsp.sdk.f.g.a(a(f101793k), 1, "[CB-CYC] Socket Read TimeOut: " + com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().get());
                }
                return 0;
            case 10002:
                if (com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 3600000) {
                    com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().set(((Integer) pair.second).intValue());
                    com.tencent.qmsp.sdk.f.g.a(a(f101793k), 1, "[CB-CYC] CB Ruery TimeOut : " + com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get());
                }
                return 0;
            case 10003:
                if (com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get() != ((Integer) pair.second).intValue() && ((Integer) pair.second).intValue() > 3600000) {
                    com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().set(((Integer) pair.second).intValue());
                    com.tencent.qmsp.sdk.f.g.a(a(f101793k), 1, "[CB-CYC] Plugin Ruery TimeOut : " + com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get());
                }
                return 0;
            default:
                return -1;
        }
    }

    private Pair<Integer, Integer> a(String str, JSONObject jSONObject) {
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(jSONObject.getInt(str)));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private String a(byte[] bArr) {
        return com.tencent.qmsp.sdk.f.h.a(bArr);
    }

    private void a(int i10, int i11, int i12) {
        com.tencent.qmsp.sdk.f.g.a(a(f101793k), 1, String.format("[CB] report: funType=%d, result=%d,  NowTaskID=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
        com.tencent.qmsp.sdk.a.g gVar = new com.tencent.qmsp.sdk.a.g();
        try {
            gVar.a(i10).a(i11).a(i12);
            com.tencent.qmsp.sdk.a.f.a(gVar.toString(), 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            com.tencent.qmsp.sdk.f.g.b(com.tencent.qmsp.sdk.f.g.f101940a, 0, "onReport error!");
        }
    }

    private void a(long j10) {
        f.i().c().postDelayed(new a(), j10);
    }

    private void a(String str) throws Throwable {
        Iterator<String> itKeys;
        LinkedList linkedList = new LinkedList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt(a(f101788f)) != 1) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(a(f101789g));
            if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null) {
                while (itKeys.hasNext()) {
                    Pair<Integer, Integer> pairA = a(itKeys.next(), jSONObject2);
                    if (pairA != null) {
                        a(pairA);
                        Integer num = this.f101796a.get(pairA.first);
                        if (num == null || num.byteValue() != ((Integer) pairA.second).intValue()) {
                            linkedList.add(pairA);
                        }
                        this.f101796a.put((Integer) pairA.first, (Integer) pairA.second);
                    }
                }
            }
        } catch (Exception e10) {
            a(1002, -1, this.f101800e);
            e10.printStackTrace();
        }
        g();
        if (linkedList.isEmpty()) {
            return;
        }
        Iterator<c> it = this.f101797b.iterator();
        while (it.hasNext()) {
            it.next().a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) throws Throwable {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cb-->Result: ");
            sb2.append(jSONObject);
            com.tencent.qmsp.sdk.f.g.a("Task: ", 0, sb2.toString());
            int iOptInt = -1;
            byte[][] bArr = f101794l;
            if (!jSONObject.isNull(a(bArr[0])) && !jSONObject.isNull(a(bArr[1])) && !jSONObject.isNull(a(bArr[2]))) {
                iOptInt = jSONObject.optInt(a(bArr[0]));
                this.f101800e = Integer.valueOf(jSONObject.optString(a(bArr[1]))).intValue();
                String strOptString = jSONObject.optString(a(bArr[2]));
                if (iOptInt == 0 && strOptString != null && !strOptString.equals("")) {
                    a(strOptString);
                }
            }
            a(1001, iOptInt, this.f101800e);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private void b(byte[] bArr) throws Throwable {
        DataInputStream dataInputStream;
        Object obj;
        ?? r10 = 0;
        Integer numValueOf = null;
        DataInputStream dataInputStream2 = null;
        try {
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream(bArr));
                while (true) {
                    try {
                        int iAvailable = dataInputStream3.available();
                        obj = numValueOf;
                        dataInputStream = dataInputStream3;
                        if (iAvailable == 0) {
                            break;
                        }
                        int i10 = dataInputStream3.readInt();
                        int i11 = dataInputStream3.readInt();
                        a(i10, i11);
                        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f101796a;
                        Integer numValueOf2 = Integer.valueOf(i10);
                        numValueOf = Integer.valueOf(i11);
                        concurrentHashMap.put(numValueOf2, numValueOf);
                    } catch (IOException e10) {
                        e = e10;
                        dataInputStream2 = dataInputStream3;
                        e.printStackTrace();
                        r10 = dataInputStream2;
                        if (dataInputStream2 != null) {
                            dataInputStream = dataInputStream2;
                            obj = dataInputStream2;
                            try {
                                dataInputStream.close();
                                r10 = obj;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                r10 = obj;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = dataInputStream3;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
        }
        dataInputStream.close();
        r10 = obj;
    }

    private JSONObject c() {
        try {
            SharedPreferences.Editor editorEdit = this.f101798c.edit();
            editorEdit.putLong(a(f101792j), System.currentTimeMillis());
            editorEdit.commit();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectA = com.tencent.qmsp.sdk.a.d.a(1);
            if (jSONObjectA == null) {
                com.tencent.qmsp.sdk.f.g.d(a(f101793k), 0, "make query head Fail!");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(20), 1);
            jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(21), 512);
            jSONObject.put(com.tencent.qmsp.sdk.a.e.a(15), jSONObjectA);
            jSONObject.put(com.tencent.qmsp.sdk.a.e.a(16), jSONObject2);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static g d() {
        if (f101795m == null) {
            synchronized (g.class) {
                if (f101795m == null) {
                    f101795m = new g();
                }
            }
        }
        return f101795m;
    }

    private String e() {
        return com.tencent.qmsp.sdk.a.b.a() + File.separator + a(f101790h);
    }

    private boolean f() {
        try {
            this.f101799d = com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get();
            long j10 = 0;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f101798c.getLong(a(f101792j), 0L);
            if (jCurrentTimeMillis >= 0) {
                j10 = jCurrentTimeMillis;
            }
            if (j10 >= com.tencent.qmsp.sdk.app.a.getAtomCbTimeout().get()) {
                return true;
            }
            this.f101799d -= j10;
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    private void g() throws Throwable {
        byte[] bArrH = h();
        if (bArrH != null) {
            new m().a(e(), bArrH, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    private byte[] h() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e10;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    try {
                        for (Map.Entry<Integer, Integer> entry : this.f101796a.entrySet()) {
                            dataOutputStream.writeInt(entry.getKey().intValue());
                            dataOutputStream.writeInt(entry.getValue().intValue());
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        try {
                            dataOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e13) {
                        e10 = e13;
                        e10.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream3;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    if (dataOutputStream != null) {
                        throw th;
                    }
                    try {
                        dataOutputStream.close();
                        throw th;
                    } catch (IOException e17) {
                        e17.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e18) {
                e10 = e18;
                dataOutputStream = null;
            } catch (Throwable th3) {
                dataOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                th = th3;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                if (dataOutputStream != null) {
                    throw th;
                }
                dataOutputStream.close();
                throw th;
            }
        } catch (IOException e19) {
            e10 = e19;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            dataOutputStream = null;
        }
    }

    private void i() {
        try {
            a(1003, 0, this.f101800e);
            JSONObject jSONObjectC = c();
            String strA = a(f101793k);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CB: ");
            sb2.append(jSONObjectC.toString());
            com.tencent.qmsp.sdk.f.g.d(strA, 0, sb2.toString());
            com.tencent.qmsp.sdk.b.g.b().a(1, com.tencent.qmsp.sdk.app.a.getAppID(), 1, jSONObjectC, new b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public int a(int i10) {
        Integer num = this.f101796a.get(Integer.valueOf(i10));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public void a() {
        if (f101795m != null) {
            f101795m = null;
        }
    }

    public void a(c cVar) {
        this.f101797b.add(cVar);
    }

    public void a(boolean z10) {
        String strA;
        StringBuilder sb2;
        if (!com.tencent.qmsp.sdk.app.a.getTaskStatus()) {
            com.tencent.qmsp.sdk.f.g.a(a(f101793k), 1, "cb Task Finish！");
            return;
        }
        try {
            byte[] bArr = f101793k;
            com.tencent.qmsp.sdk.f.g.a(a(bArr), 1, "Start to query cb!");
            if (!z10) {
                if (f()) {
                    i();
                } else {
                    com.tencent.qmsp.sdk.f.g.a(a(bArr), 1, "time has not arrived!");
                }
            }
            strA = a(bArr);
            sb2 = new StringBuilder();
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                strA = a(f101793k);
                sb2 = new StringBuilder();
            } finally {
                com.tencent.qmsp.sdk.f.g.a(a(f101793k), 0, "next time: " + this.f101799d);
                a(this.f101799d);
            }
        }
        sb2.append("next time: ");
        sb2.append(this.f101799d);
        com.tencent.qmsp.sdk.f.g.a(strA, 0, sb2.toString());
    }

    public void b() throws Throwable {
        byte[] bArrA = new m().a(e(), null, 1);
        if (bArrA != null) {
            b(bArrA);
        }
    }
}
