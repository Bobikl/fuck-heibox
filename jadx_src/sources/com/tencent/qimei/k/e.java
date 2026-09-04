package com.tencent.qimei.k;

import android.content.Context;
import androidx.annotation.n0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertiesFile.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileChannel f101268a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MappedByteBuffer f101270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f101271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f101272e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f101274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101275h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f101269b = new JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f101273f = new Object();

    public e(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f101268a = randomAccessFile.getChannel();
        this.f101271d = randomAccessFile.length();
        c();
    }

    public static e a(Context context, String str) throws IOException {
        String str2;
        File file = new File(context.getFilesDir(), "beacon");
        boolean z10 = true;
        if (!(!file.exists() ? file.mkdirs() : true)) {
            com.tencent.qimei.l.e.a("mkdir " + file.getName() + " exception!");
        }
        File file2 = null;
        String[] strArr = {"", "tbs", "tdm", "tvk", "ydk", "yes", "ywg"};
        int i10 = 0;
        while (true) {
            if (i10 >= 7) {
                z10 = false;
                break;
            }
            String str3 = strArr[i10];
            if (str3.equals("")) {
                str2 = str + "V1";
            } else {
                str2 = str + str3 + "beacon_V1";
            }
            File file3 = new File(file, str2);
            if (file3.exists()) {
                file2 = file3;
                break;
            }
            i10++;
            file2 = file3;
        }
        if (!z10 || file2 == null) {
            file2 = new File(file, str + "V1");
        }
        return new e(file2);
    }

    public final Object a(@n0 String str) {
        Object obj = null;
        try {
            synchronized (this.f101273f) {
                obj = this.f101269b.get(str);
            }
        } catch (Exception unused) {
        }
        return obj;
    }

    public synchronized <T> T a(@n0 String str, @n0 T t10) {
        if (a()) {
            return t10;
        }
        Object objA = a(str);
        if (objA != null) {
            t10 = (T) objA;
        }
        return t10;
    }

    public final void a(long j10) throws IOException {
        if (j10 > 2097152) {
            throw new IllegalArgumentException("file size to reach maximum!");
        }
        this.f101270c.rewind();
        this.f101270c = this.f101268a.map(FileChannel.MapMode.READ_WRITE, 0L, j10);
    }

    public final void a(Runnable runnable) {
        com.tencent.qimei.c.a.a().a(new d(this, runnable));
    }

    public final boolean a() {
        if (!this.f101274g) {
            return false;
        }
        com.tencent.qimei.n.a.c("[properties]", "File is close!", new Object[0]);
        return true;
    }

    public final byte[] a(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt(0);
        if (i10 <= 1 || i10 > 2097152 || byteBuffer.capacity() <= 10 || byteBuffer.capacity() < i10 + 10) {
            return null;
        }
        byteBuffer.position(10);
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr, 0, i10);
        return bArr;
    }

    public final byte[] a(byte[] bArr) throws Exception {
        return com.tencent.qimei.b.a.b(bArr, com.tencent.qimei.b.a.a("BEACONDEFAULTAES").getBytes());
    }

    public final byte[] a(byte[] bArr, String str) {
        try {
            return com.tencent.qimei.b.a.a(bArr, com.tencent.qimei.b.a.a(str).getBytes());
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            return null;
        }
    }

    public final Runnable b() {
        if (this.f101272e == null) {
            this.f101272e = new c(this);
        }
        return this.f101272e;
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArrA = a(bArr, "BEACONDEFAULTAES");
        if (bArrA != null) {
            return bArrA;
        }
        byte[] bArrA2 = a(bArr, com.tencent.qimei.d.d.l().c());
        return bArrA2 != null ? bArrA2 : a(bArr, "");
    }

    public final void c() throws IOException {
        if (this.f101271d <= 10) {
            this.f101275h = true;
            this.f101271d = 4L;
        }
        MappedByteBuffer map = this.f101268a.map(FileChannel.MapMode.READ_WRITE, 0L, this.f101271d);
        this.f101270c = map;
        map.rewind();
        if (this.f101275h) {
            this.f101270c.putInt(0, 1);
            a(b());
            return;
        }
        byte[] bArrA = a(this.f101270c);
        if (bArrA == null) {
            return;
        }
        try {
            this.f101269b = new JSONObject(new String(b(bArrA), "ISO8859-1"));
        } catch (Exception e10) {
            com.tencent.qimei.n.a.c("[properties]", "init error" + e10.getMessage(), new Object[0]);
        }
        com.tencent.qimei.n.a.c("[properties]", "init json: " + this.f101269b.toString(), new Object[0]);
    }
}
