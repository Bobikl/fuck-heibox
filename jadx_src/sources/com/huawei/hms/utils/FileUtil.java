package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f62743a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ScheduledExecutorService f62744b = Executors.newSingleThreadScheduledExecutor();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f62745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f62746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62747c;

        a(File file, long j10, String str) {
            this.f62745a = file;
            this.f62746b = j10;
            this.f62747c = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            File file = this.f62745a;
            if (file == null) {
                HMSLog.e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    long length = this.f62745a.length();
                    if (length > this.f62746b) {
                        String canonicalPath = this.f62745a.getCanonicalPath();
                        if (!this.f62745a.delete()) {
                            HMSLog.e("FileUtil", "last file delete failed.");
                        }
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.f62745a, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException e10) {
                            e = e10;
                            randomAccessFile2 = randomAccessFile;
                            HMSLog.e("FileUtil", "writeFile exception:", e);
                        } catch (Throwable th3) {
                            th2 = th3;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th2;
                        }
                    }
                    randomAccessFile2.writeBytes(this.f62747c + System.getProperty("line.separator"));
                } catch (Throwable th4) {
                    randomAccessFile = null;
                    th2 = th4;
                }
            } catch (IOException e11) {
                e = e11;
            }
            IOUtils.closeQuietly(randomAccessFile2);
        }
    }

    public static boolean verifyHash(String str, File file) throws Throwable {
        byte[] bArrDigest = SHA256.digest(file);
        return bArrDigest != null && HEX.encodeHexString(bArrDigest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j10) {
        f62744b.execute(new a(file, j10, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j10, int i10) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f62743a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e("FileUtil", "file delete failed.");
                }
                f62743a = true;
            }
            writeFile(file2, str + "|" + j10 + "|" + i10, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
