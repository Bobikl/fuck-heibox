package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ir;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes4.dex */
public class cc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f107986a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ir f1074a;

    cc(Context context, ir irVar) {
        this.f107986a = context;
        this.f1074a = irVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        RandomAccessFile randomAccessFile;
        synchronized (cb.f107985a) {
            FileLock fileLockLock = null;
            try {
                try {
                    File file = new File(this.f107986a.getFilesDir(), "tiny_data.lock");
                    com.xiaomi.push.x.m780a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        try {
                            fileLockLock = randomAccessFile.getChannel().lock();
                            cb.c(this.f107986a, this.f1074a);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e10) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e12) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e12);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e13) {
                                com.xiaomi.channel.commonutils.logger.b.a(e13);
                            }
                        }
                        com.xiaomi.push.x.a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (Exception e14) {
                e = e14;
                randomAccessFile = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                com.xiaomi.push.x.a(randomAccessFile);
                throw th;
            }
            com.xiaomi.push.x.a(randomAccessFile);
        }
    }
}
