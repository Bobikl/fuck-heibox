package com.efs.sdk.base.core.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Random f42573a = new Random();

    public static String a(com.efs.sdk.base.core.d.b bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f42520a.f42513a);
        sb2.append(lg.a.f131412e);
        sb2.append(bVar.f42520a.f42516d);
        sb2.append(lg.a.f131412e);
        sb2.append(bVar.f42520a.f42517e);
        sb2.append(lg.a.f131412e);
        sb2.append((int) bVar.f42520a.f42514b);
        sb2.append(lg.a.f131412e);
        sb2.append(ProcessUtil.myPid());
        sb2.append(lg.a.f131412e);
        sb2.append(f42573a.nextInt(10000));
        sb2.append(lg.a.f131412e);
        com.efs.sdk.base.core.a.a.a();
        sb2.append(com.efs.sdk.base.core.a.a.b());
        return sb2.toString();
    }

    public static String a(File file) {
        return e(file);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                Log.e("efs.util.file", "safe close error", th2);
            }
        }
    }

    public static void a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i10);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        try {
                            Log.e("efs.util.file", "error when copy", e);
                            a(fileInputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            a(fileInputStream);
                            a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                        a(fileInputStream);
                        a(fileOutputStream);
                        throw th;
                    }
                }
                a(fileInputStream2);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
        a(fileOutputStream);
        b(file);
    }

    public static boolean a(File file, String str) {
        return a(file, str.getBytes());
    }

    public static boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                a(fileOutputStream2);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("efs.util.file", "write file error, filename is " + file.getName(), th);
                    return false;
                } finally {
                    a(fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static byte[] a(String str) throws Throwable {
        byte[] bArr = new byte[0];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    bArr = new byte[fileInputStream2.available()];
                    fileInputStream2.read(bArr);
                    a(fileInputStream2);
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    Log.e("efs.util.file", "read data error", e);
                    a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return bArr;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static com.efs.sdk.base.core.d.b b(String str) {
        String[] strArrSplit = str.split(lg.a.f131412e);
        if (strArrSplit.length != 7) {
            Log.w("efs.util.file", "File name error, name is ".concat(str));
            return null;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        byte bByteValue = Byte.valueOf(strArrSplit[2]).byteValue();
        com.efs.sdk.base.core.d.b bVar = new com.efs.sdk.base.core.d.b(str2, Byte.valueOf(strArrSplit[3]).byteValue());
        bVar.a(str3);
        bVar.a(bByteValue);
        return bVar;
    }

    public static void b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    public static long c(File file) {
        long jC = 0;
        if (!file.isDirectory()) {
            return 0 + file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jC += c(file2);
        }
        return jC;
    }

    public static List<File> d(File file) {
        if (file.isFile()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(d(file2));
            }
        }
        return arrayList;
    }

    private static String e(File file) {
        String string = "";
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i10 = fileInputStream2.read(bArr);
                    if (i10 <= 0) {
                        break;
                    }
                    sb2.append(new String(bArr, 0, i10));
                }
                string = sb2.toString();
                a(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    Log.e("efs.util.file", "read file error", th);
                } finally {
                    a(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return string;
    }
}
