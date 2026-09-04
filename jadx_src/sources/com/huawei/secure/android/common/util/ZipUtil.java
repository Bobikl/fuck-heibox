package com.huawei.secure.android.common.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.w0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class ZipUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63097a = "ZipUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f63098b = 104857600;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f63099c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f63100d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63101e = "..";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f63102f = {"..\\", "../", "./", ".\\.\\", "%00", "..%2F", "..%5C", ".%2F"};

    /* JADX WARN: Code duplicated, block: B:111:0x01b2  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @SuppressLint({"NewApi"})
    private static List<File> a(File file, File file2, long j10, boolean z10, boolean z11) throws Throwable {
        String str;
        boolean z12;
        ZipFile zipFile;
        boolean z13;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        ZipFile zipFile2 = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream = null;
        zipFile2 = null;
        if (file == null || file2 == null) {
            return null;
        }
        boolean z14 = true;
        ArrayList arrayList = new ArrayList();
        String str2 = f63097a;
        try {
            if (z11) {
                LogsUtil.i(f63097a, "not a utf8 zip file, use gbk open zip file : " + file);
                zipFile = new ZipFile(file, Charset.forName("GBK"));
            } else {
                zipFile = new ZipFile(file);
            }
            ZipFile zipFile3 = zipFile;
            try {
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile3.entries();
                    boolean z15 = true;
                    int i10 = 0;
                    while (true) {
                        try {
                            if (!enumerationEntries.hasMoreElements()) {
                                z13 = z15;
                                break;
                            }
                            try {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                String name = zipEntryNextElement.getName();
                                if (!TextUtils.isEmpty(name)) {
                                    String strNormalize = Normalizer.normalize(name, Normalizer.Form.NFKC);
                                    if (e(strNormalize)) {
                                        Log.e(str2, "zipPath is a invalid path: " + d(strNormalize));
                                        z13 = false;
                                        break;
                                    }
                                    File file3 = new File(file2, strNormalize.replaceAll("\\\\", "/"));
                                    if (z10 && file3.exists() && file3.isFile()) {
                                        e(file3);
                                    }
                                    arrayList.add(file3);
                                    if (zipEntryNextElement.isDirectory()) {
                                        if (!a(file3)) {
                                            IOUtil.closeSecure(zipFile3);
                                            a(arrayList);
                                            return null;
                                        }
                                        str = str2;
                                    } else {
                                        if (!b(file3)) {
                                            IOUtil.closeSecure(zipFile3);
                                            a(arrayList);
                                            return null;
                                        }
                                        try {
                                            bufferedInputStream = new BufferedInputStream(zipFile3.getInputStream(zipEntryNextElement));
                                            try {
                                                FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                                try {
                                                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                                    try {
                                                        byte[] bArr = new byte[1024];
                                                        while (true) {
                                                            int i11 = bufferedInputStream.read(bArr);
                                                            if (i11 == -1) {
                                                                str = str2;
                                                                z12 = false;
                                                                break;
                                                            }
                                                            i10 += i11;
                                                            String str3 = str2;
                                                            if (i10 > j10) {
                                                                str = str3;
                                                                try {
                                                                    Log.e(str, "unzipFileNew: over than top size");
                                                                    z12 = false;
                                                                    z15 = false;
                                                                    break;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    IOUtil.closeSecure((InputStream) bufferedInputStream);
                                                                    IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                                                    IOUtil.closeSecure((OutputStream) fileOutputStream);
                                                                    throw th;
                                                                }
                                                            }
                                                            try {
                                                                bufferedOutputStream.write(bArr, 0, i11);
                                                                str2 = str3;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                fileOutputStream = fileOutputStream2;
                                                                IOUtil.closeSecure((InputStream) bufferedInputStream);
                                                                IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                                                IOUtil.closeSecure((OutputStream) fileOutputStream);
                                                                throw th;
                                                            }
                                                        }
                                                        try {
                                                            IOUtil.closeSecure((InputStream) bufferedInputStream);
                                                            IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                                            IOUtil.closeSecure((OutputStream) fileOutputStream2);
                                                        } catch (IOException e10) {
                                                            e = e10;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    bufferedOutputStream = null;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                bufferedOutputStream = null;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bufferedInputStream = null;
                                            bufferedOutputStream = null;
                                        }
                                    }
                                    zipFile2 = zipFile3;
                                    try {
                                        Log.e(str, "unzip new IOException : " + e.getMessage());
                                        IOUtil.closeSecure(zipFile2);
                                        a(arrayList);
                                        return arrayList;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        z14 = z12;
                                        IOUtil.closeSecure(zipFile2);
                                        if (!z14) {
                                            a(arrayList);
                                        }
                                        throw th;
                                    }
                                }
                                str = str2;
                            } catch (IllegalArgumentException e11) {
                                str = str2;
                                LogsUtil.i(str, "not a utf8 zip file, IllegalArgumentException : " + e11.getMessage());
                                if (Build.VERSION.SDK_INT >= 24) {
                                    List<File> listA = a(file, file2, j10, z10, true);
                                    IOUtil.closeSecure(zipFile3);
                                    if (!z15) {
                                        a(arrayList);
                                    }
                                    return listA;
                                }
                                LogsUtil.e(str, "File is not a utf8 zip file and Build.VERSION_CODES < 24");
                            }
                            str2 = str;
                        } catch (Throwable th9) {
                            th = th9;
                            zipFile2 = zipFile3;
                            z14 = z15;
                            IOUtil.closeSecure(zipFile2);
                            if (!z14) {
                                a(arrayList);
                            }
                            throw th;
                        }
                    }
                    IOUtil.closeSecure(zipFile3);
                    if (!z13) {
                        a(arrayList);
                    }
                } catch (Throwable th10) {
                    th = th10;
                    zipFile2 = zipFile3;
                }
            } catch (IOException e12) {
                e = e12;
                str = str2;
                z12 = false;
            }
        } catch (IOException e13) {
            e = e13;
            str = f63097a;
            z12 = false;
        } catch (Throwable th11) {
            th = th11;
        }
        return arrayList;
    }

    private static void a(FileInputStream fileInputStream, BufferedOutputStream bufferedOutputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        IOUtil.closeSecure((InputStream) fileInputStream);
        IOUtil.closeSecure((OutputStream) bufferedOutputStream);
        IOUtil.closeSecure((InputStream) zipInputStream);
        IOUtil.closeSecure((OutputStream) fileOutputStream);
    }

    private static void a(String str) {
        if (TextUtils.isEmpty(str) || !e(str)) {
            return;
        }
        Log.e(f63097a, "IllegalArgumentException--path is not a standard path");
        throw new IllegalArgumentException("path is not a standard path");
    }

    private static boolean a(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    @w0(api = 24)
    private static boolean a(String str, long j10, int i10, boolean z10) {
        ZipFile zipFile;
        boolean z11 = false;
        ZipFile zipFile2 = null;
        try {
            try {
                try {
                    if (z10) {
                        LogsUtil.i(f63097a, "not a utf8 zip file, use gbk open zip file : " + str);
                        zipFile = new ZipFile(str, Charset.forName("GBK"));
                    } else {
                        zipFile = new ZipFile(str);
                    }
                    ZipFile zipFile3 = zipFile;
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile3.entries();
                    long size = 0;
                    int i11 = 0;
                    boolean zA = true;
                    while (true) {
                        if (enumerationEntries.hasMoreElements()) {
                            try {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                size += zipEntryNextElement.getSize();
                                i11++;
                                if (e(zipEntryNextElement.getName()) || i11 >= i10 || size > j10 || zipEntryNextElement.getSize() == -1) {
                                    LogsUtil.e(f63097a, "File name is invalid or too many files or too big");
                                    zipFile3.close();
                                    return z11;
                                }
                            } catch (IllegalArgumentException e10) {
                                LogsUtil.i(f63097a, "not a utf8 zip file, IllegalArgumentException : " + e10.getMessage());
                                if (Build.VERSION.SDK_INT >= 24) {
                                    zA = a(str, j10, i10, true);
                                    z11 = zA;
                                    zipFile3.close();
                                    return z11;
                                }
                                LogsUtil.e(f63097a, "File is not a utf8 zip file and Build.VERSION_CODES < 24");
                                zA = false;
                            }
                        }
                        z11 = zA;
                        zipFile3.close();
                        return z11;
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            zipFile2.close();
                        } catch (IOException unused) {
                            LogsUtil.e(f63097a, "close zipFile IOException ");
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused2) {
                LogsUtil.e(f63097a, "close zipFile IOException ");
            }
        } catch (IOException e11) {
            LogsUtil.e(f63097a, "not a valid zip file, IOException : " + e11.getMessage());
            if (0 != 0) {
                zipFile2.close();
            }
            return z11;
        }
    }

    private static boolean a(String str, String str2, long j10, int i10) throws SecurityCommonException {
        if (TextUtils.isEmpty(str) || e(str)) {
            LogsUtil.e(f63097a, "zip file is not valid");
            return false;
        }
        if (TextUtils.isEmpty(str2) || e(str2)) {
            LogsUtil.e(f63097a, "target directory is not valid");
            return false;
        }
        if (a(str, j10, i10, false)) {
            return true;
        }
        LogsUtil.e(f63097a, "zip file contains valid chars or too many files");
        throw new SecurityCommonException("unsecure zipfile!");
    }

    private static boolean a(List<File> list) {
        try {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return true;
        } catch (Exception e10) {
            LogsUtil.e(f63097a, "unzip fail delete file failed" + e10.getMessage());
            return false;
        }
    }

    private static File b(String str) {
        a(str);
        return new File(str);
    }

    private static boolean b(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!a(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            Log.e(f63097a, "createOrExistsFile IOException ");
            return false;
        }
    }

    private static File c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(str);
    }

    private static void c(File file) {
        if (file == null || file.delete()) {
            return;
        }
        LogsUtil.e(f63097a, "delete file error");
    }

    private static String d(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : str.substring(iLastIndexOf + 1);
    }

    private static void d(File file) {
        if (file == null || file.exists() || file.mkdirs()) {
            return;
        }
        LogsUtil.e(f63097a, "mkdirs error , files exists or IOException.");
    }

    private static void e(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            c(file);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                c(file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
            c(file);
        }
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f63097a, "isContainInvalidStr: name is null");
            return false;
        }
        if (str.equals(f63101e)) {
            return true;
        }
        for (String str2 : f63102f) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    @Deprecated
    public static boolean unZip(String str, String str2, long j10, int i10, boolean z10) throws Throwable {
        ZipInputStream zipInputStream;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream3;
        String strSubstring = str2;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!a(str, str2, j10, i10)) {
            return false;
        }
        String str3 = File.separator;
        if (strSubstring.endsWith(str3) && str2.length() > str3.length()) {
            strSubstring = strSubstring.substring(0, str2.length() - str3.length());
        }
        boolean z12 = true;
        int i11 = 4096;
        byte[] bArr = new byte[4096];
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
                int i12 = 0;
                fileOutputStream2 = null;
                while (true) {
                    try {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                break;
                            }
                            String strReplaceAll = nextEntry.getName().replaceAll("\\\\", "/");
                            File file = new File(strSubstring, strReplaceAll);
                            String strNormalize = Normalizer.normalize(strReplaceAll, Normalizer.Form.NFKC);
                            if (e(strNormalize)) {
                                Log.e(f63097a, "zipPath is a invalid path: " + d(strNormalize));
                                z12 = z11 ? 1 : 0;
                                break;
                            }
                            if (z10 && file.exists() && file.isFile()) {
                                e(file);
                            }
                            if (nextEntry.isDirectory()) {
                                d(file);
                                arrayList.add(file);
                            } else {
                                File parentFile = file.getParentFile();
                                if (parentFile != null && !parentFile.exists()) {
                                    d(parentFile);
                                }
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                    while (true) {
                                        try {
                                            try {
                                                int i13 = zipInputStream.read(bArr, z11 ? 1 : 0, i11);
                                                if (i13 == -1) {
                                                    break;
                                                }
                                                i12 += i13;
                                                if (i12 > j10) {
                                                    try {
                                                        Log.e(f63097a, "unzip  over than top size");
                                                        z12 = false;
                                                        z11 = false;
                                                        break;
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        fileOutputStream3 = fileOutputStream;
                                                        z11 = false;
                                                        fileOutputStream = fileOutputStream3;
                                                        fileInputStream2 = fileInputStream;
                                                        try {
                                                            LogsUtil.e(f63097a, "Unzip IOException : " + e.getMessage());
                                                            fileInputStream = fileInputStream2;
                                                            bufferedOutputStream2 = bufferedOutputStream;
                                                            fileOutputStream2 = fileOutputStream;
                                                            a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
                                                            if (!z11) {
                                                                a(arrayList);
                                                            }
                                                            return z11;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                bufferedOutputStream.write(bArr, 0, i13);
                                                i11 = 4096;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                fileInputStream2 = fileInputStream;
                                                a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                                throw th;
                                            }
                                        } catch (IOException e11) {
                                            e = e11;
                                            fileOutputStream3 = fileOutputStream;
                                        }
                                    }
                                    arrayList.add(file);
                                    bufferedOutputStream.flush();
                                    IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                    IOUtil.closeSecure((OutputStream) fileOutputStream);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    fileOutputStream2 = fileOutputStream;
                                } catch (IOException e12) {
                                    e = e12;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    LogsUtil.e(f63097a, "Unzip IOException : " + e.getMessage());
                                    fileInputStream = fileInputStream2;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    fileOutputStream2 = fileOutputStream;
                                    a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
                                    if (!z11) {
                                        a(arrayList);
                                    }
                                    return z11;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                    throw th;
                                }
                            }
                            try {
                                zipInputStream.closeEntry();
                                i11 = 4096;
                            } catch (IOException e13) {
                                e = e13;
                                FileOutputStream fileOutputStream4 = fileOutputStream2;
                                bufferedOutputStream = bufferedOutputStream2;
                                fileOutputStream3 = fileOutputStream4;
                                fileOutputStream = fileOutputStream3;
                                fileInputStream2 = fileInputStream;
                                LogsUtil.e(f63097a, "Unzip IOException : " + e.getMessage());
                                fileInputStream = fileInputStream2;
                                bufferedOutputStream2 = bufferedOutputStream;
                                fileOutputStream2 = fileOutputStream;
                                a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
                                if (!z11) {
                                    a(arrayList);
                                }
                                return z11;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            fileOutputStream = fileOutputStream2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream = fileOutputStream2;
                    }
                }
                IOUtil.closeSecure((InputStream) zipInputStream);
                IOUtil.closeSecure((InputStream) fileInputStream);
                z11 = z12;
            } catch (IOException e15) {
                e = e15;
                zipInputStream = null;
                bufferedOutputStream = null;
                fileOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                zipInputStream = null;
                bufferedOutputStream = null;
                fileOutputStream = null;
            }
        } catch (IOException e16) {
            e = e16;
            zipInputStream = null;
            bufferedOutputStream = null;
            fileOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            zipInputStream = null;
            bufferedOutputStream = null;
            fileOutputStream = null;
        }
        a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
        if (!z11) {
            a(arrayList);
        }
        return z11;
    }

    @Deprecated
    public static boolean unZip(String str, String str2, boolean z10) throws SecurityCommonException {
        return unZip(str, str2, 104857600L, 100, z10);
    }

    public static List<File> unZipNew(String str, String str2, long j10, int i10, boolean z10) throws SecurityCommonException {
        if (!a(str, str2, j10, i10)) {
            return null;
        }
        String str3 = File.separator;
        if (str2.endsWith(str3) && str2.length() > str3.length()) {
            str2 = str2.substring(0, str2.length() - str3.length());
        }
        return a(c(str), c(str2), j10, z10, false);
    }

    public static List<File> unZipNew(String str, String str2, boolean z10) throws SecurityCommonException {
        return unZipNew(str, str2, 104857600L, 100, z10);
    }
}
