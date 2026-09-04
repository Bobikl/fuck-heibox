package com.lzy.okgo.convert;

import android.os.Environment;
import android.text.TextUtils;
import com.lzy.okgo.model.Progress;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: FileConvert.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements com.lzy.okgo.convert.b<File> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64689d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ia.c<File> f64692c;

    /* JADX INFO: compiled from: FileConvert.java */
    public class a implements Progress.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.lzy.okgo.model.Progress.a
        public void a(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 419, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            c.h(c.this, progress);
        }
    }

    /* JADX INFO: compiled from: FileConvert.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64694b;

        b(Progress progress) {
            this.f64694b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 420, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.f64692c.d(this.f64694b);
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        String str = File.separator;
        sb2.append(str);
        sb2.append(ChannelsDetailActivity.f79595e4);
        sb2.append(str);
        f64689d = sb2.toString();
    }

    public c() {
        this(null);
    }

    public c(String str) {
        this(Environment.getExternalStorageDirectory() + f64689d, str);
    }

    public c(String str, String str2) {
        this.f64690a = str;
        this.f64691b = str2;
    }

    static /* synthetic */ void h(c cVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{cVar, progress}, null, changeQuickRedirect, true, 418, new Class[]{c.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.k(progress);
    }

    private void k(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 416, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.j(new b(progress));
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.File, java.lang.Object] */
    @Override // com.lzy.okgo.convert.b
    public /* bridge */ /* synthetic */ File g(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, bb.c.b.f30533b5, new Class[]{c0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : j(c0Var);
    }

    public File j(c0 c0Var) throws Throwable {
        FileOutputStream fileOutputStream;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, bb.c.b.Z4, new Class[]{c0.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        String url = c0Var.getRequest().q().getUrl();
        if (TextUtils.isEmpty(this.f64690a)) {
            this.f64690a = Environment.getExternalStorageDirectory() + f64689d;
        }
        if (TextUtils.isEmpty(this.f64691b)) {
            this.f64691b = la.b.g(c0Var, url);
        }
        File file = new File(this.f64690a);
        la.c.i(file);
        File file2 = new File(file, this.f64691b);
        la.c.o(file2);
        byte[] bArr = new byte[8192];
        InputStream inputStream = null;
        try {
            d0 d0VarQ = c0Var.q();
            if (d0VarQ == null) {
                la.c.c(null);
                la.c.c(null);
                return null;
            }
            InputStream inputStreamByteStream = d0VarQ.byteStream();
            try {
                Progress progress = new Progress();
                progress.f64782h = d0VarQ.getF132481e();
                progress.f64780f = this.f64691b;
                progress.f64779e = file2.getAbsolutePath();
                progress.f64785k = 2;
                progress.f64777c = url;
                progress.f64776b = url;
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int i10 = inputStreamByteStream.read(bArr);
                        if (i10 == -1) {
                            fileOutputStream.flush();
                            la.c.c(inputStreamByteStream);
                            la.c.c(fileOutputStream);
                            return file2;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                        if (this.f64692c != null) {
                            Progress.e(progress, i10, new a());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamByteStream;
                        la.c.c(inputStream);
                        la.c.c(fileOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        la.c.c(inputStream);
        la.c.c(fileOutputStream);
        throw th;
    }

    public void l(ia.c<File> cVar) {
        this.f64692c = cVar;
    }
}
