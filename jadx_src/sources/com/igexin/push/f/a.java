package com.igexin.push.f;

import android.text.TextUtils;
import com.igexin.a.a.b.c;
import com.igexin.a.a.d.e;
import com.igexin.push.core.d;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f64007e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f64008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f64009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f64010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f64011d;

    private a() {
        super(-2147483637);
        this.f64008a = new ArrayList<>();
        this.f64009b = new ArrayList<>();
        this.f64010c = System.currentTimeMillis();
    }

    public static a i() {
        if (f64007e == null) {
            synchronized (a.class) {
                if (f64007e == null) {
                    f64007e = new a();
                    c.b().a(f64007e, true, true);
                }
            }
        }
        return f64007e;
    }

    public static void k() {
        a aVar = f64007e;
        if (aVar != null) {
            aVar.j();
        }
    }

    private long u() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f64010c;
        if ((jCurrentTimeMillis >= 60000 && this.f64008a.size() > 0) || this.f64008a.size() >= 10) {
            return 0L;
        }
        if (this.f64008a.size() <= 0) {
            return Long.MAX_VALUE;
        }
        return 60000 - jCurrentTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e0 A[EXC_TOP_SPLITTER, PHI: r2
  0x00e0: PHI (r2v4 java.io.OutputStream) = (r2v3 java.io.OutputStream), (r2v5 java.io.OutputStream) binds: [B:42:0x00eb, B:35:0x00de] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private void v() {
        OutputStream fileOutputStream;
        if (d.f63671e == null || d.C == null) {
            return;
        }
        synchronized (this) {
            this.f64009b.addAll(this.f64008a);
            this.f64008a.clear();
        }
        w();
        File file = new File(this.f64011d);
        if (file.exists() || file.mkdirs()) {
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            OutputStream outputStream = null;
            try {
                File file2 = new File(this.f64011d + "/" + d.f63669c + "." + str + ".log");
                if (!file2.exists()) {
                    if (!file2.createNewFile()) {
                        return;
                    } else {
                        com.igexin.a.a.c.a.a();
                    }
                }
                if (com.igexin.a.a.c.a.b() == null) {
                    com.igexin.a.a.c.a.a();
                    file2.delete();
                }
                try {
                    fileOutputStream = com.igexin.a.a.c.a.a(file2, new SecretKeySpec(d.au, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
                } catch (Throwable unused) {
                    fileOutputStream = new FileOutputStream(file2, true);
                }
                outputStream = fileOutputStream;
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = this.f64009b.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next() + "\r\n");
                }
                if (sb2.length() > 0) {
                    outputStream.write(sb2.toString().getBytes("UTF-8"));
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Exception unused3) {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
            this.f64010c = System.currentTimeMillis();
            this.f64009b.clear();
        }
    }

    private void w() {
        if (TextUtils.isEmpty(this.f64011d)) {
            this.f64011d = com.igexin.push.util.d.d(d.f63671e);
        }
    }

    public synchronized void a(String str) {
        this.f64008a.add(str);
        try {
            if (this.f64008a.size() <= 1 || this.f64008a.size() >= 10) {
                notify();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.igexin.a.a.d.e
    public void b() throws Exception {
        super.b();
        while (true) {
            try {
                synchronized (this) {
                    while (true) {
                        long jU = u();
                        if (jU == 0) {
                            break;
                        } else {
                            wait(jU);
                        }
                    }
                }
                v();
            } catch (Throwable unused) {
                v();
                return;
            }
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return -2147483637;
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
        super.d();
        this.f63234m = true;
    }

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }

    @Override // com.igexin.a.a.d.e
    protected void e_() {
        super.e_();
        f64007e = null;
    }

    public void j() {
        if (s() != null) {
            s().interrupt();
        }
    }
}
