package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class af {
    public static boolean a(Context context, String str, long j10) throws Throwable {
        RandomAccessFile randomAccessFile;
        if (!g.d(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return true;
        }
        FileLock fileLockLock = null;
        try {
            File file = new File(new File(context.getExternalFilesDir(null), "/.vdevdir/"), "lcfp.lock");
            x.m780a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    boolean zB = b(context, str, j10);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    x.a(randomAccessFile);
                    return zB;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    x.a(randomAccessFile);
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException unused3) {
                    }
                }
                x.a(randomAccessFile);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    private static boolean b(Context context, String str, long j10) throws Throwable {
        ?? r10;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        File file = new File(new File(context.getExternalFilesDir(null), "/.vdevdir/"), "lcfp");
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = str + ":" + context.getPackageName() + Constants.ACCEPT_TIME_SEPARATOR_SP + jCurrentTimeMillis;
        ?? Exists = file.exists();
        try {
            if (Exists != 0) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split(":");
                            if (strArrSplit.length == 2) {
                                if (TextUtils.equals(strArrSplit[0], String.valueOf(str))) {
                                    String[] strArrSplit2 = strArrSplit[1].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                    if (strArrSplit2.length == 2) {
                                        long j11 = Long.parseLong(strArrSplit2[1]);
                                        if (!TextUtils.equals(strArrSplit2[0], context.getPackageName()) && Math.abs(jCurrentTimeMillis - j11) < 1000 * j10 * 0.9f) {
                                            x.a(bufferedReader);
                                            return false;
                                        }
                                    }
                                } else {
                                    arrayList.add(line);
                                }
                            }
                        } catch (Exception unused) {
                            arrayList.clear();
                        }
                    }
                } catch (Exception unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    r10 = 0;
                    x.a((Closeable) r10);
                    throw th;
                }
                x.a(bufferedReader);
            } else if (!x.m780a(file)) {
                return true;
            }
            arrayList.add(str2);
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            bufferedWriter.write((String) it.next());
                            bufferedWriter.newLine();
                            bufferedWriter.flush();
                        }
                    } catch (IOException e10) {
                        e = e10;
                        com.xiaomi.channel.commonutils.logger.b.d(e.toString());
                    }
                } catch (Throwable th3) {
                    th = th3;
                    x.a(bufferedWriter);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedWriter = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedWriter = null;
                x.a(bufferedWriter);
                throw th;
            }
            x.a(bufferedWriter);
            return true;
        } catch (Throwable th5) {
            th = th5;
            r10 = Exists;
        }
    }
}
