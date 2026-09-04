package com.tencent.cos.xml.utils;

import android.util.Log;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.Util;
import z5.f;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    public static boolean clearFile(String str) throws IOException {
        if (deleteFileIfExist(str)) {
            return new File(str).createNewFile();
        }
        return false;
    }

    public static boolean deleteFileIfExist(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static void intercept(String str, long j10, long j11) throws IOException {
        if (j11 <= 0) {
            clearFile(str);
        }
        File file = new File(str);
        File file2 = new File(str.concat("." + System.currentTimeMillis() + ".temp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileInputStream fileInputStream = new FileInputStream(file);
        if (j10 > 0 && fileInputStream.skip(j10) != j10) {
            throw new IOException("skip size is not equal to offset");
        }
        byte[] bArr = new byte[65536];
        long j12 = 65536;
        long jMin = Math.min(j12, j11);
        while (true) {
            int i10 = fileInputStream.read(bArr, 0, (int) jMin);
            if (i10 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i10);
            j11 -= (long) i10;
            jMin = Math.min(j12, j11);
        }
        deleteFileIfExist(str);
        if (file2.renameTo(file)) {
            return;
        }
        throw new IOException("rename to " + str + f.f141859j);
    }

    public static File[] listFile(File file) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        return file.listFiles();
    }

    public static void saveInputStreamToTmpFile(InputStream inputStream, File file, long j10, long j11) throws Throwable {
        int i10;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                long j12 = 0;
                if (j11 < 0) {
                    j11 = Long.MAX_VALUE;
                }
                if (j10 > 0) {
                    inputStream.skip(j10);
                }
                while (j12 < j11 && (i10 = inputStream.read(bArr)) != -1) {
                    long j13 = i10;
                    fileOutputStream2.write(bArr, 0, (int) Math.min(j13, j11 - j12));
                    j12 += j13;
                }
                fileOutputStream2.flush();
                Util.closeQuietly(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    Util.closeQuietly(fileOutputStream);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String tempCache(InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                String str = CosXmlSimpleService.appCachePath + File.separator + "temp.tmp";
                Log.d("UnitTest", str);
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int i10 = inputStream.read(bArr, 0, 65536);
                        if (i10 <= 0) {
                            fileOutputStream2.flush();
                            CloseUtil.closeQuietly(fileOutputStream2);
                            CloseUtil.closeQuietly(inputStream);
                            return str;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    CloseUtil.closeQuietly(fileOutputStream);
                    CloseUtil.closeQuietly(inputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
