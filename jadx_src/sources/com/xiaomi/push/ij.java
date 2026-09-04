package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f107370a = false;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f107371a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private im f582a;

        public a(Context context, im imVar) {
            this.f582a = imVar;
            this.f107371a = context;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ij.c(this.f107371a, this.f582a);
        }
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void a(Context context, im imVar) {
        ah.a(context).a(new a(context, imVar));
    }

    private static void a(Context context, im imVar, File file, byte[] bArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream = null;
                loop0: while (true) {
                    int i10 = 0;
                    int length = 0;
                    while (true) {
                        try {
                            int i11 = bufferedInputStream2.read(bArr2);
                            if (i11 == -1) {
                                break loop0;
                            }
                            if (i11 != 4) {
                                com.xiaomi.channel.commonutils.logger.b.d("TinyData read from cache file failed cause lengthBuffer error. size:" + i11);
                                break loop0;
                            }
                            int iA = ab.a(bArr2);
                            if (iA < 1 || iA > 30720) {
                                com.xiaomi.channel.commonutils.logger.b.d("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + iA);
                                break loop0;
                            }
                            byte[] bArr3 = new byte[iA];
                            int i12 = bufferedInputStream2.read(bArr3);
                            if (i12 != iA) {
                                com.xiaomi.channel.commonutils.logger.b.d("TinyData read from cache file failed cause buffer size not equal length. size:" + i12 + "__length:" + iA);
                                break loop0;
                            }
                            byte[] bArrA = h.a(bArr, bArr3);
                            if (bArrA == null || bArrA.length == 0) {
                                com.xiaomi.channel.commonutils.logger.b.d("TinyData read from cache file failed cause decrypt fail");
                            } else {
                                ir irVar = new ir();
                                jx.a(irVar, bArrA);
                                irVar.a("item_size", String.valueOf(bArrA.length));
                                arrayList.add(irVar);
                                i10++;
                                length += bArrA.length;
                                if (i10 >= 8 || length >= 30720) {
                                    ik.a(context, imVar, arrayList);
                                    arrayList.clear();
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            bufferedInputStream = bufferedInputStream2;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            x.a((Closeable) bufferedInputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedInputStream = bufferedInputStream2;
                            x.a((Closeable) bufferedInputStream);
                            throw th;
                        }
                    }
                }
                ik.a(context, imVar, arrayList);
                if (file != null && file.exists() && !file.delete()) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("TinyData delete reading temp file failed");
                }
                x.a((Closeable) bufferedInputStream2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static void b(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 4).edit();
        editorEdit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    public static void c(Context context, im imVar) throws Throwable {
        RandomAccessFile randomAccessFile;
        File file;
        if (f107370a) {
            com.xiaomi.channel.commonutils.logger.b.m62a("TinyData extractTinyData is running");
            return;
        }
        f107370a = true;
        File file2 = new File(context.getFilesDir(), "tiny_data.data");
        if (!file2.exists()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("TinyData no ready file to get data.");
            return;
        }
        a(context);
        byte[] bArrA = com.xiaomi.push.service.cb.a(context);
        FileLock fileLockLock = null;
        try {
            File file3 = new File(context.getFilesDir(), "tiny_data.lock");
            x.m780a(file3);
            randomAccessFile = new RandomAccessFile(file3, "rw");
            try {
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    file2.renameTo(new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data"));
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e10) {
                            e = e10;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e12) {
                            e = e12;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                        }
                    }
                    x.a(randomAccessFile);
                    file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
                    if (!file.exists()) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("TinyData no ready file to get data.");
                        return;
                    }
                    a(context, imVar, file, bArrA);
                    ii.a(false);
                    b(context);
                    f107370a = false;
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
                x.a(randomAccessFile);
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (fileLockLock != null) {
                fileLockLock.release();
            }
            x.a(randomAccessFile);
            throw th;
        }
        x.a(randomAccessFile);
        file = new File(context.getFilesDir() + "/tdReadTemp/tiny_data.data");
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("TinyData no ready file to get data.");
            return;
        }
        a(context, imVar, file, bArrA);
        ii.a(false);
        b(context);
        f107370a = false;
    }
}
