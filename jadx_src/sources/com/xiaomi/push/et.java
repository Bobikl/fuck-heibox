package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class et extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f107047a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Context f341a;

    public et(Context context, int i10) {
        this.f107047a = i10;
        this.f341a = context;
    }

    public static void a(Context context, iv ivVar) {
        em emVarM283a = en.a().m283a();
        String strA = emVarM283a == null ? "" : emVarM283a.a();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(ivVar.a())) {
            return;
        }
        a(context, ivVar, strA);
    }

    private static void a(Context context, iv ivVar, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] bArrB = ep.b(str, jx.a(ivVar));
        if (bArrB == null || bArrB.length == 0) {
            return;
        }
        synchronized (eq.f107043a) {
            FileLock fileLock = null;
            try {
                try {
                    File file = new File(context.getExternalFilesDir(null), "push_cdata.lock");
                    x.m780a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getExternalFilesDir(null), "push_cdata.data");
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                            try {
                                bufferedOutputStream.write(ab.a(bArrB.length));
                                bufferedOutputStream.write(bArrB);
                                bufferedOutputStream.flush();
                                file2.setLastModified(0L);
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    try {
                                        fileLockLock.release();
                                    } catch (IOException unused) {
                                    }
                                }
                                x.a(bufferedOutputStream);
                            } catch (IOException e10) {
                                e = e10;
                                fileLock = fileLockLock;
                                try {
                                    e.printStackTrace();
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    x.a(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    x.a(bufferedOutputStream);
                                    x.a(randomAccessFile);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = fileLockLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                x.a(bufferedOutputStream);
                                x.a(randomAccessFile);
                                throw th;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            bufferedOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream = null;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        bufferedOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            } catch (IOException e13) {
                e = e13;
                bufferedOutputStream = null;
                randomAccessFile = null;
            } catch (Throwable th7) {
                th = th7;
                bufferedOutputStream = null;
                randomAccessFile = null;
            }
            x.a(randomAccessFile);
        }
    }

    private String c() {
        return "dc_job_result_time_" + mo195a();
    }

    private String d() {
        return "dc_job_result_" + mo195a();
    }

    public abstract ip a();

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected boolean m285a() {
        return ep.a(this.f341a, String.valueOf(mo195a()), this.f107047a);
    }

    public abstract String b();

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    protected boolean m286b() {
        return true;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    protected boolean m287c() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        if (m285a()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("DC run job mutual: " + mo195a());
            return;
        }
        em emVarM283a = en.a().m283a();
        String strA = emVarM283a == null ? "" : emVarM283a.a();
        if (!TextUtils.isEmpty(strA) && m286b()) {
            if (m287c()) {
                SharedPreferences sharedPreferences = this.f341a.getSharedPreferences("mipush_extra", 0);
                if (bp.a(strB).equals(sharedPreferences.getString(d(), null))) {
                    long j10 = sharedPreferences.getLong(c(), 0L);
                    int iA = com.xiaomi.push.service.az.a(this.f341a).a(is.DCJobUploadRepeatedInterval.a(), 604800);
                    if ((System.currentTimeMillis() - j10) / 1000 < this.f107047a) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j10) / 1000 < iA) {
                        strB = "same_" + j10;
                    }
                }
            }
            iv ivVar = new iv();
            ivVar.a(strB);
            ivVar.a(System.currentTimeMillis());
            ivVar.a(a());
            a(this.f341a, ivVar, strA);
        }
    }
}
