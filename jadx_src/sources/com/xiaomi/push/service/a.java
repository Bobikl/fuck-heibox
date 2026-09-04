package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f107856a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f987a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile String f107860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f107861f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Object f988a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f107857b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final String f989a = "mipush_region";

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final String f990b = "mipush_country_code";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f107858c = "mipush_region.lock";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f107859d = "mipush_country_code.lock";

    public a(Context context) {
        this.f987a = context;
    }

    public static a a(Context context) {
        if (f107856a == null) {
            synchronized (a.class) {
                if (f107856a == null) {
                    f107856a = new a(context);
                }
            }
        }
        return f107856a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable, java.io.RandomAccessFile] */
    private String a(Context context, String str, String str2, Object obj) {
        FileLock fileLockLock;
        File file = new File(context.getFilesDir(), str);
        ?? r10 = 0;
        r10 = 0;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                try {
                    File file2 = new File(context.getFilesDir(), str2);
                    com.xiaomi.push.x.m780a(file2);
                    context = new RandomAccessFile(file2, "rw");
                    try {
                        fileLockLock = context.getChannel().lock();
                        try {
                            String strA = com.xiaomi.push.x.a(file);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e10) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                                }
                            }
                            com.xiaomi.push.x.a((Closeable) context);
                            return strA;
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
                            com.xiaomi.push.x.a((Closeable) context);
                            return null;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        fileLockLock = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r10 != 0 && r10.isValid()) {
                            try {
                                r10.release();
                            } catch (IOException e14) {
                                com.xiaomi.channel.commonutils.logger.b.a(e14);
                            }
                        }
                        com.xiaomi.push.x.a((Closeable) context);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = str;
                }
            } catch (Exception e15) {
                e = e15;
                context = 0;
                fileLockLock = null;
            } catch (Throwable th4) {
                th = th4;
                context = 0;
            }
        }
    }

    private void a(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLockLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), str3);
                    com.xiaomi.push.x.m780a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        try {
                            fileLockLock = randomAccessFile.getChannel().lock();
                            com.xiaomi.push.x.a(new File(context.getFilesDir(), str2), str);
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

    public String a() {
        if (TextUtils.isEmpty(this.f107860e)) {
            this.f107860e = a(this.f987a, "mipush_region", "mipush_region.lock", this.f988a);
        }
        return this.f107860e;
    }

    public void a(String str, boolean z10) {
        if (!TextUtils.equals(str, this.f107860e)) {
            this.f107860e = str;
        }
        if (z10) {
            a(this.f987a, str, "mipush_region", "mipush_region.lock", this.f988a);
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f107861f)) {
            this.f107861f = a(this.f987a, "mipush_country_code", "mipush_country_code.lock", this.f107857b);
        }
        return this.f107861f;
    }

    public void b(String str, boolean z10) {
        if (!TextUtils.equals(str, this.f107861f)) {
            this.f107861f = str;
        }
        if (z10) {
            a(this.f987a, str, "mipush_country_code", "mipush_region.lock", this.f988a);
        }
    }
}
