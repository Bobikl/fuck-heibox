package cn.fly.verify;

import android.os.SystemClock;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: loaded from: classes6.dex */
public class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FileOutputStream f36692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f36693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileChannel f36694c;

    private boolean b(boolean z10) throws Throwable {
        this.f36693b = z10 ? this.f36694c.lock() : this.f36694c.tryLock();
        return this.f36693b != null;
    }

    public synchronized void a() {
        FileLock fileLock = this.f36693b;
        if (fileLock == null) {
            return;
        }
        try {
            fileLock.release();
        } catch (Throwable unused) {
        }
        this.f36693b = null;
    }

    public synchronized void a(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.f36692a = fileOutputStream;
            this.f36694c = fileOutputStream.getChannel();
        } catch (Throwable unused) {
            el.a(this.f36694c, this.f36692a);
        }
    }

    public synchronized boolean a(boolean z10) {
        return a(z10, z10 ? 1000L : 500L, 16L);
    }

    public synchronized boolean a(boolean z10, long j10, long j11) {
        boolean zB;
        if (this.f36692a == null) {
            return false;
        }
        try {
            return b(z10);
        } catch (Throwable th2) {
            if (j10 <= 0 || !((th2 instanceof OverlappingFileLockException) || (th2 instanceof IOException))) {
                es.a().b(th2);
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
                while (true) {
                    if (j10 <= 0) {
                        zB = false;
                        break;
                    }
                    try {
                        Thread.sleep(j11);
                    } catch (Throwable unused) {
                    }
                    try {
                        j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
                        zB = b(z10);
                        break;
                    } catch (Throwable th3) {
                        if (!(th3 instanceof OverlappingFileLockException) && !(th3 instanceof IOException)) {
                            es.a().b(th2);
                            j10 = -1;
                        } else if (j10 <= 0) {
                            es.a().b("OverlappingFileLockException or IOExcept timeout");
                        }
                    }
                }
                if (j10 > 0) {
                    return zB;
                }
            }
            FileLock fileLock = this.f36693b;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (Throwable unused2) {
                }
                this.f36693b = null;
            }
            el.a(this.f36694c, this.f36692a);
            return false;
        }
    }

    public synchronized void b() {
        if (this.f36692a == null) {
            return;
        }
        a();
        el.a(this.f36694c, this.f36692a);
        this.f36694c = null;
        this.f36692a = null;
    }
}
