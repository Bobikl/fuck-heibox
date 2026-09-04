package com.lzy.okserver.download;

import android.text.TextUtils;
import com.lzy.okgo.exception.HttpException;
import com.lzy.okgo.exception.OkGoException;
import com.lzy.okgo.exception.StorageException;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f64852f = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Progress f64853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Object, com.lzy.okserver.download.a> f64854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ThreadPoolExecutor f64855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.lzy.okserver.task.b f64856e;

    /* JADX INFO: compiled from: DownloadTask.java */
    public class a implements Progress.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.lzy.okgo.model.Progress.a
        public void a(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30975ud, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            b.a(b.this, progress);
        }
    }

    /* JADX INFO: renamed from: com.lzy.okserver.download.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadTask.java */
    public class RunnableC0527b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64858b;

        RunnableC0527b(Progress progress) {
            this.f64858b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30997vd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.download.a> it = b.this.f64854c.values().iterator();
            while (it.hasNext()) {
                it.next().e(this.f64858b);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadTask.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64860b;

        c(Progress progress) {
            this.f64860b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31019wd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.download.a> it = b.this.f64854c.values().iterator();
            while (it.hasNext()) {
                it.next().a(this.f64860b);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadTask.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64862b;

        d(Progress progress) {
            this.f64862b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31041xd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.download.a> it = b.this.f64854c.values().iterator();
            while (it.hasNext()) {
                it.next().a(this.f64862b);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadTask.java */
    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64864b;

        e(Progress progress) {
            this.f64864b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31063yd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.download.a> it = b.this.f64854c.values().iterator();
            while (it.hasNext()) {
                it.next().a(this.f64864b);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadTask.java */
    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64866b;

        f(Progress progress) {
            this.f64866b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31085zd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            for (com.lzy.okserver.download.a aVar : b.this.f64854c.values()) {
                aVar.a(this.f64866b);
                aVar.c(this.f64866b);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadTask.java */
    public class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f64869c;

        g(Progress progress, File file) {
            this.f64868b = progress;
            this.f64869c = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ad, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            for (com.lzy.okserver.download.a aVar : b.this.f64854c.values()) {
                aVar.a(this.f64868b);
                aVar.b(this.f64869c, this.f64868b);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadTask.java */
    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64871b;

        h(Progress progress) {
            this.f64871b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Bd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<com.lzy.okserver.download.a> it = b.this.f64854c.values().iterator();
            while (it.hasNext()) {
                it.next().d(this.f64871b);
            }
            b.this.f64854c.clear();
        }
    }

    public b(Progress progress) {
        la.b.b(progress, "progress == null");
        this.f64853b = progress;
        this.f64855d = com.lzy.okserver.b.c().f().b();
        this.f64854c = new HashMap();
    }

    public b(String str, Request<File, ? extends Request> request) {
        la.b.b(str, "tag == null");
        Progress progress = new Progress();
        this.f64853b = progress;
        progress.f64776b = str;
        progress.f64778d = com.lzy.okserver.b.c().b();
        this.f64853b.f64777c = request.G();
        Progress progress2 = this.f64853b;
        progress2.f64785k = 0;
        progress2.f64782h = -1L;
        progress2.f64788n = request;
        this.f64855d = com.lzy.okserver.b.c().f().b();
        this.f64854c = new HashMap();
    }

    static /* synthetic */ void a(b bVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{bVar, progress}, null, changeQuickRedirect, true, bb.c.b.f30953td, new Class[]{b.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.i(progress);
    }

    private void b(InputStream inputStream, RandomAccessFile randomAccessFile, Progress progress) throws Throwable {
        if (PatchProxy.proxy(new Object[]{inputStream, randomAccessFile, progress}, this, changeQuickRedirect, false, bb.c.b.f30749kd, new Class[]{InputStream.class, RandomAccessFile.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        if (inputStream == null || randomAccessFile == null) {
            return;
        }
        progress.f64785k = 2;
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        while (true) {
            try {
                int i10 = bufferedInputStream.read(bArr, 0, 8192);
                if (i10 == -1 || progress.f64785k != 2) {
                    break;
                }
                randomAccessFile.write(bArr, 0, i10);
                try {
                    Progress.d(progress, i10, progress.f64782h, new a());
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            la.c.c(randomAccessFile);
            la.c.c(bufferedInputStream);
            la.c.c(inputStream);
            throw th;
        }
        la.c.c(randomAccessFile);
        la.c.c(bufferedInputStream);
        la.c.c(inputStream);
    }

    private void i(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30841od, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        y(progress);
        la.b.j(new e(progress));
    }

    private void j(Progress progress, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{progress, th2}, this, changeQuickRedirect, false, bb.c.b.f30864pd, new Class[]{Progress.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 4;
        progress.f64792r = th2;
        y(progress);
        la.b.j(new f(progress));
    }

    private void k(Progress progress, File file) {
        if (PatchProxy.proxy(new Object[]{progress, file}, this, changeQuickRedirect, false, bb.c.b.f30887qd, new Class[]{Progress.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64781g = 1.0f;
        progress.f64785k = 5;
        y(progress);
        la.b.j(new g(progress, file));
    }

    private void l(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30909rd, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        y(progress);
        la.b.j(new h(progress));
    }

    private void m(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30772ld, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 0;
        y(progress);
        la.b.j(new RunnableC0527b(progress));
    }

    private void n(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30818nd, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 3;
        y(progress);
        la.b.j(new d(progress));
    }

    private void o(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30795md, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        progress.f64784j = 0L;
        progress.f64785k = 1;
        y(progress);
        la.b.j(new c(progress));
    }

    private void y(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30931sd, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        com.lzy.okgo.db.g.Q().S(Progress.c(progress), progress.f64776b);
    }

    public b c(Serializable serializable) {
        this.f64853b.f64789o = serializable;
        return this;
    }

    public b d(Serializable serializable) {
        this.f64853b.f64790p = serializable;
        return this;
    }

    public b e(Serializable serializable) {
        this.f64853b.f64791q = serializable;
        return this;
    }

    public b f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Zc, new Class[]{String.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (str == null || TextUtils.isEmpty(str.trim())) {
            la.d.l("fileName is null, ignored!");
        } else {
            this.f64853b.f64780f = str;
        }
        return this;
    }

    public b g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Yc, new Class[]{String.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (str == null || TextUtils.isEmpty(str.trim())) {
            la.d.l("folder is null, ignored!");
        } else {
            this.f64853b.f64778d = str;
        }
        return this;
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30657gd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64855d.remove(this.f64856e);
        Progress progress = this.f64853b;
        int i10 = progress.f64785k;
        if (i10 == 1) {
            n(progress);
            return;
        }
        if (i10 == 2) {
            progress.f64784j = 0L;
            progress.f64785k = 3;
        } else {
            la.d.l("only the task with status WAITING(1) or LOADING(2) can pause, current status is " + this.f64853b.f64785k);
        }
    }

    public b p(int i10) {
        this.f64853b.f64786l = i10;
        return this;
    }

    public b q(com.lzy.okserver.download.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.b.f30541bd, new Class[]{com.lzy.okserver.download.a.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (aVar != null) {
            this.f64854c.put(aVar.f64851a, aVar);
        }
        return this;
    }

    public b r(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.f30703id, new Class[]{Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        h();
        if (z10) {
            la.c.p(this.f64853b.f64779e);
        }
        com.lzy.okgo.db.g.Q().K(this.f64853b.f64776b);
        b bVarL = com.lzy.okserver.b.c().l(this.f64853b.f64776b);
        l(this.f64853b);
        return bVarL;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        File file;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30726jd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Progress progress = this.f64853b;
        long j10 = progress.f64783i;
        if (j10 < 0) {
            j(progress, OkGoException.a());
            return;
        }
        if (j10 > 0 && !TextUtils.isEmpty(progress.f64779e) && !new File(this.f64853b.f64779e).exists()) {
            j(this.f64853b, OkGoException.b());
            return;
        }
        try {
            Request<?, ? extends Request> request = this.f64853b.f64788n;
            request.X("Range", "bytes=" + j10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            c0 c0VarC = request.C();
            int iX = c0VarC.x();
            if (iX == 404 || iX >= 500) {
                j(this.f64853b, HttpException.b());
                return;
            }
            d0 d0VarQ = c0VarC.q();
            if (d0VarQ == null) {
                j(this.f64853b, new HttpException("response body is null"));
                return;
            }
            Progress progress2 = this.f64853b;
            if (progress2.f64782h == -1) {
                progress2.f64782h = d0VarQ.getF132481e();
            }
            String strG = this.f64853b.f64780f;
            if (TextUtils.isEmpty(strG)) {
                strG = la.b.g(c0VarC, this.f64853b.f64777c);
                this.f64853b.f64780f = strG;
            }
            if (!la.c.j(this.f64853b.f64778d)) {
                j(this.f64853b, StorageException.a());
                return;
            }
            if (TextUtils.isEmpty(this.f64853b.f64779e)) {
                file = new File(this.f64853b.f64778d, strG);
                this.f64853b.f64779e = file.getAbsolutePath();
            } else {
                file = new File(this.f64853b.f64779e);
            }
            if (j10 > 0 && !file.exists()) {
                j(this.f64853b, OkGoException.a());
                return;
            }
            Progress progress3 = this.f64853b;
            if (j10 > progress3.f64782h) {
                j(progress3, OkGoException.a());
                return;
            }
            if (j10 == 0 && file.exists()) {
                la.c.o(file);
            }
            if (j10 == this.f64853b.f64782h && j10 > 0) {
                if (file.exists() && j10 == file.length()) {
                    k(this.f64853b, file);
                    return;
                } else {
                    j(this.f64853b, OkGoException.a());
                    return;
                }
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(j10);
                this.f64853b.f64783i = j10;
                try {
                    com.lzy.okgo.db.g.Q().B(this.f64853b);
                    b(d0VarQ.byteStream(), randomAccessFile, this.f64853b);
                    Progress progress4 = this.f64853b;
                    int i10 = progress4.f64785k;
                    if (i10 == 3) {
                        n(progress4);
                        return;
                    }
                    if (i10 != 2) {
                        j(progress4, OkGoException.c());
                        return;
                    }
                    long length = file.length();
                    Progress progress5 = this.f64853b;
                    if (length == progress5.f64782h) {
                        k(progress5, file);
                    } else {
                        j(progress5, OkGoException.a());
                    }
                } catch (IOException e10) {
                    j(this.f64853b, e10);
                }
            } catch (Exception e11) {
                j(this.f64853b, e11);
            }
        } catch (IOException | NullPointerException e12) {
            j(this.f64853b, e12);
        }
    }

    public void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30680hd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r(false);
    }

    public void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30634fd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h();
        la.c.p(this.f64853b.f64779e);
        Progress progress = this.f64853b;
        progress.f64785k = 0;
        progress.f64783i = 0L;
        progress.f64781g = 0.0f;
        progress.f64784j = 0L;
        com.lzy.okgo.db.g.Q().B(this.f64853b);
        v();
    }

    public b u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30518ad, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(this.f64853b.f64778d) && !TextUtils.isEmpty(this.f64853b.f64780f)) {
            Progress progress = this.f64853b;
            Progress progress2 = this.f64853b;
            progress.f64779e = new File(progress2.f64778d, progress2.f64780f).getAbsolutePath();
        }
        com.lzy.okgo.db.g.Q().B(this.f64853b);
        return this;
    }

    public void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30611ed, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.lzy.okserver.b.c().d(this.f64853b.f64776b) == null || com.lzy.okgo.db.g.Q().L(this.f64853b.f64776b) == null) {
            throw new IllegalStateException("you must call DownloadTask#save() before DownloadTask#start()！");
        }
        Progress progress = this.f64853b;
        int i10 = progress.f64785k;
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            m(progress);
            o(this.f64853b);
            com.lzy.okserver.task.b bVar = new com.lzy.okserver.task.b(this.f64853b.f64786l, this);
            this.f64856e = bVar;
            this.f64855d.execute(bVar);
            return;
        }
        if (i10 != 5) {
            la.d.l("the task with tag " + this.f64853b.f64776b + " is already in the download queue, current task status is " + this.f64853b.f64785k);
            return;
        }
        if (progress.f64779e == null) {
            j(progress, new StorageException("the file of the task with tag:" + this.f64853b.f64776b + " may be invalid or damaged, please call the method restart() to download again！"));
            return;
        }
        File file = new File(this.f64853b.f64779e);
        if (file.exists()) {
            long length = file.length();
            Progress progress2 = this.f64853b;
            if (length == progress2.f64782h) {
                k(progress2, new File(this.f64853b.f64779e));
                return;
            }
        }
        j(this.f64853b, new StorageException("the file " + this.f64853b.f64779e + " may be invalid or damaged, please call the method restart() to download again！"));
    }

    public void w(com.lzy.okserver.download.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.b.f30564cd, new Class[]{com.lzy.okserver.download.a.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.b(aVar, "listener == null");
        this.f64854c.remove(aVar.f64851a);
    }

    public void x(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30588dd, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.b(str, "tag == null");
        this.f64854c.remove(str);
    }
}
