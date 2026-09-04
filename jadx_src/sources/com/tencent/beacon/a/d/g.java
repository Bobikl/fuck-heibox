package com.tencent.beacon.a.d;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertiesFile.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileChannel f98839b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MappedByteBuffer f98841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f98843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f98844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98845h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f98838a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f98840c = new JSONObject();

    private g(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f98839b = randomAccessFile.getChannel();
        this.f98842e = randomAccessFile.length();
        com.tencent.beacon.base.util.c.a("[properties]", "file size: " + this.f98842e, new Object[0]);
        e();
    }

    public static g a(Context context, String str) throws IOException {
        File file = new File(context.getFilesDir(), "beacon");
        if (!(!file.exists() ? file.mkdirs() : true)) {
            com.tencent.beacon.base.util.e.a("mkdir " + file.getName() + " exception!");
        }
        return new g(new File(file, str + "V1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) throws IOException {
        if (j10 > 2097152) {
            throw new IllegalArgumentException("file size to reach maximum!");
        }
        this.f98841d.rewind();
        this.f98841d = this.f98839b.map(FileChannel.MapMode.READ_WRITE, 0L, j10);
    }

    private void a(Runnable runnable) {
        com.tencent.beacon.a.b.a.a().a(new f(this, runnable));
    }

    private byte[] a(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt(0);
        if (i10 <= 1 || i10 > 2097152 || byteBuffer.capacity() <= 10) {
            return null;
        }
        byteBuffer.position(10);
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr, 0, i10);
        return bArr;
    }

    public static byte[] a(byte[] bArr) throws Exception {
        return com.tencent.beacon.base.net.c.c.b(3, "BEACONDEFAULTAES", bArr);
    }

    private static byte[] a(byte[] bArr, String str) {
        try {
            return com.tencent.beacon.base.net.c.c.a(3, str, bArr);
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            com.tencent.beacon.a.b.g.e().a("513", "unEncrypt error: key=" + str, th2);
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArrA = a(bArr, "BEACONDEFAULTAES");
        if (bArrA != null) {
            return bArrA;
        }
        com.tencent.beacon.a.b.g.e().a("517", "default aesKey unEncryption failed");
        byte[] bArrA2 = a(bArr, com.tencent.beacon.a.c.f.e().a());
        return bArrA2 != null ? bArrA2 : a(bArr, "");
    }

    private Object c(@n0 String str) {
        Object obj = null;
        try {
            synchronized (this.f98838a) {
                obj = this.f98840c.get(str);
            }
        } catch (Exception unused) {
            com.tencent.beacon.base.util.c.a("[properties]", "current jsonObject not exist key: " + str, new Object[0]);
        }
        return obj;
    }

    private boolean c() {
        if (!this.f98844g) {
            return false;
        }
        com.tencent.beacon.base.util.c.a("[properties]", "File is close!", new Object[0]);
        return true;
    }

    private Runnable d() {
        if (this.f98843f == null) {
            this.f98843f = new e(this);
        }
        return this.f98843f;
    }

    private void e() throws IOException {
        if (this.f98842e <= 10) {
            this.f98845h = true;
            this.f98842e = 4L;
        }
        MappedByteBuffer map = this.f98839b.map(FileChannel.MapMode.READ_WRITE, 0L, this.f98842e);
        this.f98841d = map;
        map.rewind();
        if (this.f98845h) {
            this.f98841d.putInt(0, 1);
            a(d());
            return;
        }
        byte[] bArrA = a(this.f98841d);
        if (bArrA == null) {
            return;
        }
        try {
            this.f98840c = new JSONObject(new String(b(bArrA), "ISO8859-1"));
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.a("[properties]", "init error" + e10.getMessage(), new Object[0]);
            com.tencent.beacon.a.b.g.e().a("504", "[properties] init error! msg: " + e10.getMessage() + ". file size: " + this.f98842e, e10);
        }
        com.tencent.beacon.base.util.c.a("[properties]", "init json: " + this.f98840c.toString(), new Object[0]);
    }

    public synchronized <T> T a(@n0 String str, @n0 T t10) {
        if (c()) {
            return t10;
        }
        Object objC = c(str);
        if (objC != null) {
            t10 = (T) objC;
        }
        return t10;
    }

    public synchronized <T> Set<T> a(@n0 String str, @p0 Set<T> set) {
        JSONObject jSONObject;
        if (c()) {
            return set;
        }
        try {
            HashSet hashSet = new HashSet();
            synchronized (this.f98838a) {
                jSONObject = this.f98840c.getJSONObject(str);
            }
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    hashSet.add(jSONObject.get(itKeys.next()));
                }
            }
            if (!hashSet.isEmpty()) {
                set = hashSet;
            }
        } catch (JSONException e10) {
            com.tencent.beacon.a.b.g.e().a("504", "[properties] JSON getSet error!", e10);
            com.tencent.beacon.base.util.c.b("[properties] JSON get error!" + e10.getMessage(), new Object[0]);
        }
        return set;
    }

    public synchronized void a() {
        this.f98840c = new JSONObject();
        a(d());
    }

    public boolean a(String str) {
        synchronized (this.f98838a) {
            Iterator<String> itKeys = this.f98840c.keys();
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    if (str.equals(itKeys.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public Map<String, ?> b() {
        synchronized (this.f98838a) {
            JSONObject jSONObject = this.f98840c;
            if (jSONObject == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, this.f98840c.get(next));
                } catch (JSONException e10) {
                    com.tencent.beacon.base.util.c.a(e10);
                }
            }
            return map;
        }
    }

    public synchronized void b(String str) {
        synchronized (this.f98838a) {
            this.f98840c.remove(str);
        }
        a(d());
    }

    public synchronized void b(@n0 String str, @n0 Object obj) {
        if (c()) {
            return;
        }
        try {
            Object objC = c(str);
            if (objC == null || !objC.equals(obj)) {
                if (obj instanceof String) {
                    if (TextUtils.isEmpty((String) obj)) {
                        return;
                    }
                    if (!com.tencent.beacon.base.util.f.a((String) obj)) {
                        com.tencent.beacon.base.util.c.b("[properties] JSON put value not english ! !", new Object[0]);
                        return;
                    }
                }
                synchronized (this.f98838a) {
                    this.f98840c.put(str, obj);
                }
                a(d());
            }
        } catch (Exception e10) {
            com.tencent.beacon.a.b.g.e().a("504", "[properties] JSON put error!", e10);
            com.tencent.beacon.base.util.c.b("[properties] JSON put error!" + e10.getMessage(), new Object[0]);
        }
    }

    public synchronized <T> void b(@n0 String str, @n0 Set<T> set) {
        if (c()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<T> it = set.iterator();
            for (int i10 = 0; i10 < set.size(); i10++) {
                if (it.hasNext()) {
                    jSONObject.put(String.valueOf(i10), it.next());
                }
            }
            b(str, jSONObject);
        } catch (JSONException e10) {
            com.tencent.beacon.base.util.c.a(e10);
            com.tencent.beacon.a.b.g.e().a("504", "[properties] JSON put set error!", e10);
        }
    }
}
