package com.max.hbcache.disk;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: FileDiskHandler.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements com.max.hbcache.disk.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f66162e = "com.livefront.bridge";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f66163f = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f66164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Future<?> f66165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, byte[]> f66166c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f66167d = false;

    /* JADX INFO: compiled from: FileDiskHandler.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Gp, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.d(b.this);
        }
    }

    public b(@n0 Context context, @n0 ExecutorService executorService) {
        this.f66164a = context.getDir(f66162e, 0);
        this.f66165b = executorService.submit(new a());
    }

    static /* synthetic */ void d(b bVar) throws IOException {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, c.b.Fp, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.l();
    }

    private void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.yp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66165b.cancel(true);
    }

    private void f(@p0 String str) {
        File[] fileArrListFiles;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.zp, new Class[]{String.class}, Void.TYPE).isSupported || (fileArrListFiles = this.f66164a.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (str == null || j(str).equals(file.getName())) {
                file.delete();
            }
        }
    }

    @p0
    private byte[] g(@n0 String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.Ap, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        File fileI = i(str);
        if (fileI == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileI);
            byte[] bArr = new byte[(int) fileI.length()];
            try {
                fileInputStream.read(bArr);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return bArr;
            } catch (IOException unused2) {
                fileInputStream.close();
                return null;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        } catch (FileNotFoundException | IOException unused4) {
        }
    }

    @p0
    private byte[] h(@n0 String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.Bp, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        byte[] bArr = this.f66166c.get(str);
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrG = g(str);
        if (bArrG != null) {
            this.f66166c.put(str, bArrG);
        }
        return bArrG;
    }

    @p0
    private File i(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.Cp, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File[] fileArrListFiles = this.f66164a.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file : fileArrListFiles) {
            if (j(str).equals(file.getName())) {
                return file;
            }
        }
        return null;
    }

    private String j(@n0 String str) {
        return str;
    }

    private String k(@n0 String str) {
        return str;
    }

    private void l() throws IOException {
        File[] fileArrListFiles;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Dp, new Class[0], Void.TYPE).isSupported || (fileArrListFiles = this.f66164a.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            h(k(file.getName()));
        }
    }

    private void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Ep, new Class[0], Void.TYPE).isSupported || this.f66167d) {
            return;
        }
        try {
            this.f66165b.get(1000L, TimeUnit.SECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
        }
        this.f66167d = true;
    }

    @Override // com.max.hbcache.disk.a
    public void a(@n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.vp, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        e();
        this.f66166c.remove(str);
        f(str);
    }

    @Override // com.max.hbcache.disk.a
    public void b(@n0 String str, @n0 byte[] bArr) throws IOException {
        if (PatchProxy.proxy(new Object[]{str, bArr}, this, changeQuickRedirect, false, c.b.xp, new Class[]{String.class, byte[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66166c.put(str, bArr);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f66164a, str));
            try {
                fileOutputStream.write(bArr);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            fileOutputStream.close();
        } catch (FileNotFoundException | IOException unused3) {
        }
    }

    @Override // com.max.hbcache.disk.a
    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.up, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e();
        this.f66166c.clear();
        f(null);
    }

    @Override // com.max.hbcache.disk.a
    @p0
    public byte[] getBytes(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.wp, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        m();
        return h(str);
    }
}
