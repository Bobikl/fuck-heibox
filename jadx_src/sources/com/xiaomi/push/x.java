package com.xiaomi.push;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f108055a = {"jpg", "png", "bmp", "gif", "webp"};

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:22:0x0063 */
    public static String a(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        Closeable closeable;
        StringWriter stringWriter = new StringWriter();
        Closeable closeable2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
                try {
                    char[] cArr = new char[2048];
                    while (true) {
                        int i10 = inputStreamReader.read(cArr);
                        if (i10 == -1) {
                            String string = stringWriter.toString();
                            a(inputStreamReader);
                            a(stringWriter);
                            return string;
                        }
                        stringWriter.write(cArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    com.xiaomi.channel.commonutils.logger.b.c("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    a(inputStreamReader);
                    a(stringWriter);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                a(closeable2);
                a(stringWriter);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            a(closeable2);
            a(stringWriter);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file, File file2) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file, false));
                try {
                    a(zipOutputStream2, file2, null, null);
                    a(zipOutputStream2);
                } catch (FileNotFoundException unused) {
                    zipOutputStream = zipOutputStream2;
                    a(zipOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    zipOutputStream = zipOutputStream2;
                    com.xiaomi.channel.commonutils.logger.b.m62a("zip file failure + " + e.getMessage());
                    a(zipOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = zipOutputStream2;
                    a(zipOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static void a(File file, String str) throws Throwable {
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.c("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write(str);
                    a(bufferedWriter2);
                } catch (IOException e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    com.xiaomi.channel.commonutils.logger.b.c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    a(bufferedWriter);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    a(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static void a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) throws Throwable {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    String str3 = File.separator;
                    sb2.append(str3);
                    zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str + str3;
                    }
                    for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                        a(zipOutputStream, fileArrListFiles[i10], str2 + fileArrListFiles[i10].getName(), null);
                    }
                    File[] fileArrListFiles2 = file.listFiles(new y());
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            a(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                } else {
                    if (TextUtils.isEmpty(str)) {
                        zipOutputStream.putNextEntry(new ZipEntry(String.valueOf(new Date().getTime()) + ".txt"));
                    } else {
                        zipOutputStream.putNextEntry(new ZipEntry(str));
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = fileInputStream2.read(bArr);
                            if (i11 == -1) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i11);
                            }
                        }
                        fileInputStream = fileInputStream2;
                    } catch (IOException e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        com.xiaomi.channel.commonutils.logger.b.d("zipFiction failed with exception:" + e.toString());
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        a((Closeable) fileInputStream);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
            a((Closeable) fileInputStream);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m780a(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static byte[] a(InputStream inputStream) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int i10 = inputStream.read(bArr, 0, 8192);
                    if (i10 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    byteArray = null;
                }
            } catch (Throwable th2) {
                a((Closeable) inputStream);
                a(byteArrayOutputStream);
                throw th2;
            }
        }
        byteArray = byteArrayOutputStream.toByteArray();
        a((Closeable) inputStream);
        a(byteArrayOutputStream);
        return byteArray;
    }

    public static byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void b(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 < 0) {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
