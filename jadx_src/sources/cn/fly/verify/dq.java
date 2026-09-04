package cn.fly.verify;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.UnknownHostException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class dq {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected ArrayList<Object> f36117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected DataInputStream f36118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f36119c;

        private a(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i10) {
            this.f36117a = arrayList;
            this.f36118b = dataInputStream;
            this.f36119c = i10;
        }

        public void a() throws Throwable {
            this.f36118b.readShort();
        }

        public void a(dr drVar) throws Throwable {
            drVar.f36128b = (String) this.f36117a.get(this.f36118b.readShort());
            drVar.f36129c = this.f36118b.readShort();
        }

        public <T> T b() throws Throwable {
            return (T) this.f36117a.get(this.f36118b.readShort());
        }

        public int c() {
            return this.f36119c;
        }
    }

    public static class b extends a {
        private b(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i10) {
            super(arrayList, dataInputStream, i10);
        }

        @Override // cn.fly.verify.dq.a
        public void a() throws Throwable {
            this.f36118b.readInt();
        }

        @Override // cn.fly.verify.dq.a
        public void a(dr drVar) throws Throwable {
            drVar.f36128b = (String) this.f36117a.get(this.f36118b.readInt());
            drVar.f36129c = this.f36118b.readInt();
        }

        @Override // cn.fly.verify.dq.a
        public <T> T b() throws Throwable {
            return (T) this.f36117a.get(this.f36118b.readInt());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f36120a;

        private c(Object obj) {
            this.f36120a = new d(obj);
        }

        public c a(Object obj) {
            this.f36120a.a(obj);
            return this;
        }

        public d a(String str, Class<?> cls) {
            return this.f36120a.a(str, cls);
        }

        public d a(String str, Object obj) {
            return this.f36120a.a(str, obj);
        }

        public void a() throws Throwable {
            this.f36120a.a();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<Object> f36121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<Object> f36122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HashMap<String, Object> f36123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HashMap<String, Object> f36124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f36125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap<Class<?>, Class<? extends dm<?>>> f36126f;

        private d(Object obj) {
            ArrayList<Object> arrayList = new ArrayList<>();
            this.f36121a = arrayList;
            arrayList.add(obj);
            this.f36122b = new ArrayList<>();
            this.f36123c = new HashMap<>();
            this.f36124d = new HashMap<>();
            this.f36126f = new HashMap<>();
            this.f36123c.put("t_map", this.f36124d);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #4 {all -> 0x004c, blocks: (B:18:0x0032, B:20:0x0036, B:24:0x0042), top: B:44:0x0032 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0042 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x004c, blocks: (B:18:0x0032, B:20:0x0036, B:24:0x0042), top: B:44:0x0032 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x003e A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0048 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        private String a(Throwable th2) {
            if (th2 == null) {
                return "";
            }
            StringWriter stringWriter = null;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                try {
                    if (cause instanceof UnknownHostException) {
                        return "";
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        return th instanceof OutOfMemoryError ? ei.a("0239ej:fi$elGidc=ehfcdj;dcf^elJi3djdi@eCejifdkdkdf") : th.getMessage();
                    } finally {
                        if (stringWriter != null) {
                            try {
                                stringWriter.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            StringWriter stringWriter2 = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter2);
                th2.printStackTrace(printWriter);
                printWriter.flush();
                printWriter.close();
                String string = stringWriter2.toString();
                try {
                    stringWriter2.close();
                } catch (Throwable unused2) {
                }
                return string;
            } catch (Throwable th4) {
                th = th4;
                stringWriter = stringWriter2;
                if (th instanceof OutOfMemoryError) {
                }
            }
        }

        private String a(byte[] bArr, String str) {
            if (bArr == null) {
                return str;
            }
            try {
                byte[] bytes = str.getBytes("UTF-8");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ei.a("003=fdgiel"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ei.a("003Cfdgiel"));
                sb2.append(ei.a("003lCgied"));
                sb2.append(ei.a("008?fjKl(glicedelikgl"));
                sb2.append(ei.a("006d[dcdcdiHe:ej"));
                Provider provider = Security.getProvider(ei.a("0023fjed"));
                Cipher cipher = provider != null ? Cipher.getInstance(sb2.toString(), provider) : Cipher.getInstance(sb2.toString(), ei.a("002<fjed"));
                cipher.init(1, secretKeySpec);
                byte[] bArr2 = new byte[cipher.getOutputSize(bytes.length)];
                cipher.doFinal(bArr2, cipher.update(bytes, 0, bytes.length, bArr2, 0));
                return new BigInteger(1, bArr2).toString(16);
            } catch (Throwable unused) {
                return "";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [cn.fly.verify.dq$1] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v3 */
        private void a(InputStream inputStream, ArrayList<dr> arrayList, dn dnVar) throws Throwable {
            InputStream bufferedInputStream;
            InputStream gZIPInputStream;
            ByteArrayInputStream byteArrayInputStream;
            ByteArrayInputStream byteArrayInputStream2;
            if (inputStream.read() != 70) {
                inputStream.close();
                return;
            }
            ?? r10 = 0;
            dataInputStream = null;
            DataInputStream dataInputStream = null;
            dataInputStream = null;
            DataInputStream dataInputStream2 = null;
            r10 = 0;
            r10 = 0;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i10 = inputStream.read();
                if (i10 == 1 || i10 == 2) {
                    bufferedInputStream = inputStream;
                    gZIPInputStream = new GZIPInputStream(bufferedInputStream);
                } else {
                    gZIPInputStream = inputStream;
                }
                try {
                    bufferedInputStream = new BufferedInputStream(gZIPInputStream, 4096);
                    DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(null);
                        int i11 = dataInputStream3.readInt();
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList2.add(Integer.valueOf(dataInputStream3.readInt()));
                        }
                        int i13 = dataInputStream3.readInt();
                        for (int i14 = 0; i14 < i13; i14++) {
                            arrayList2.add(Long.valueOf(dataInputStream3.readLong()));
                        }
                        int i15 = dataInputStream3.readInt();
                        for (int i16 = 0; i16 < i15; i16++) {
                            arrayList2.add(Float.valueOf(dataInputStream3.readFloat()));
                        }
                        int i17 = dataInputStream3.readInt();
                        for (int i18 = 0; i18 < i17; i18++) {
                            arrayList2.add(Double.valueOf(dataInputStream3.readDouble()));
                        }
                        int i19 = dataInputStream3.readInt();
                        for (int i20 = 0; i20 < i19; i20++) {
                            arrayList2.add(Boolean.valueOf(dataInputStream3.readBoolean()));
                        }
                        int i21 = dataInputStream3.readInt();
                        if (i10 == 2) {
                            byte[] bArr = new byte[dataInputStream3.readInt()];
                            dataInputStream3.readFully(bArr);
                            try {
                                byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                                try {
                                    DataInputStream dataInputStream4 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(byteArrayInputStream2), 2048));
                                    for (int i22 = 0; i22 < i21; i22++) {
                                        try {
                                            arrayList2.add(dataInputStream4.readUTF());
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataInputStream = dataInputStream4;
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            } else if (byteArrayInputStream2 != null) {
                                                byteArrayInputStream2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    dataInputStream4.close();
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                byteArrayInputStream2 = null;
                            }
                        } else {
                            for (int i23 = 0; i23 < i21; i23++) {
                                arrayList2.add(dataInputStream3.readUTF());
                            }
                        }
                        if (dataInputStream3.readByte() != 15) {
                            throw new RuntimeException("data has offset in pos 1");
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        this.f36124d.put("lc_t", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                        a bVar = dataInputStream3.readBoolean() ? new b(arrayList2, dataInputStream3, arrayList.size()) : new a(arrayList2, dataInputStream3, arrayList.size());
                        int i24 = dataInputStream3.readInt();
                        boolean z10 = dataInputStream3.readBoolean();
                        if (dataInputStream3.readByte() != 25) {
                            throw new RuntimeException("data has offset in pos 2");
                        }
                        for (int i25 = 0; i25 < i24; i25++) {
                            dr drVar = new dr();
                            drVar.f36127a = dataInputStream3.readByte();
                            if (z10) {
                                bVar.a(drVar);
                            }
                            drVar.a(bVar);
                            arrayList.add(drVar);
                        }
                        if (dataInputStream3.readByte() != 39) {
                            throw new RuntimeException("data has offset in pos 3");
                        }
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        this.f36124d.put("lcmd_t", Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2));
                        byte[] bArr2 = new byte[dataInputStream3.readInt()];
                        dataInputStream3.readFully(bArr2);
                        if (i10 == 2) {
                            try {
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                try {
                                    DataInputStream dataInputStream5 = new DataInputStream(new GZIPInputStream(byteArrayInputStream));
                                    try {
                                        byte[] bArr3 = new byte[dataInputStream5.readInt()];
                                        dataInputStream5.readFully(bArr3);
                                        dataInputStream5.close();
                                        bArr2 = bArr3;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        dataInputStream2 = dataInputStream5;
                                        if (dataInputStream2 != null) {
                                            dataInputStream2.close();
                                        } else if (byteArrayInputStream != null) {
                                            byteArrayInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                byteArrayInputStream = null;
                            }
                        }
                        dnVar.a(bArr2);
                        this.f36124d.put("mreg_t", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis3));
                        try {
                            dataInputStream3.close();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        r10 = dataInputStream3;
                        try {
                            if (r10 != 0) {
                                r10.close();
                            } else {
                                bufferedInputStream.close();
                            }
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    bufferedInputStream = gZIPInputStream;
                }
            } catch (Throwable th10) {
                th = th10;
                bufferedInputStream = inputStream;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj) {
            this.f36121a.add(obj);
        }

        public <T> d a(Class<T> cls, Class<? extends dm<T>> cls2) {
            this.f36126f.put(cls, cls2);
            return this;
        }

        public d a(String str) {
            this.f36125e = str;
            return this;
        }

        public d a(String str, Class<?> cls) {
            dp.f36114a.put(str, cls);
            return this;
        }

        public d a(String str, Object obj) {
            this.f36123c.put(str, obj);
            return this;
        }

        public void a() throws Throwable {
            byte[] bytes;
            InputStream byteArrayInputStream;
            ArrayList<dr> arrayList = new ArrayList<>();
            String str = this.f36125e;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
                System.arraycopy(bytes, 0, new byte[16], 0, Math.min(bytes.length, 16));
            } else {
                bytes = null;
            }
            try {
                dn dnVar = new dn();
                for (Object obj : this.f36121a) {
                    if (obj instanceof String) {
                        byteArrayInputStream = new FileInputStream((String) obj);
                    } else {
                        if (!(obj instanceof byte[])) {
                            throw new ClassCastException("program is not string or byte array");
                        }
                        byteArrayInputStream = new ByteArrayInputStream((byte[]) obj);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    a(byteArrayInputStream, arrayList, dnVar);
                    this.f36124d.put("l_t", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
                for (Map.Entry<Class<?>, Class<? extends dm<?>>> entry : this.f36126f.entrySet()) {
                    dnVar.a(entry.getKey(), entry.getValue());
                }
                new dp(arrayList, this.f36122b).a(this.f36123c, dnVar);
            } catch (Throwable th2) {
                th = th2;
                if (bytes == null) {
                    throw th;
                }
                String string = th.getMessage() == null ? th.getClass().toString() : th.getMessage();
                if (th instanceof Cdo) {
                    th = th.getCause();
                }
                throw new Cdo(a(bytes, string + " " + a(th)), th);
            }
        }
    }

    private dq() {
    }

    public static int a() {
        return 70;
    }

    private static c a(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        c cVar = new c(objArr[0]);
        for (int i10 = 1; i10 < objArr.length; i10++) {
            cVar.a(objArr[i10]);
        }
        return cVar;
    }

    public static c a(String... strArr) {
        return a((Object[]) strArr);
    }

    public static c a(byte[]... bArr) {
        return a((Object[]) bArr);
    }
}
