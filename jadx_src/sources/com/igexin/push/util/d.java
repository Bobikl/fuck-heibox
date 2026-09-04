package com.igexin.push.util;

import android.content.Context;
import android.text.TextUtils;
import com.igexin.push.core.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f64042a = new Object();

    public static void a() {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(com.igexin.push.core.d.T);
                if (!file.exists() && !file.createNewFile()) {
                    com.igexin.a.a.c.b.a("FileUtils | create file : " + file.toString() + " failed !!!", new Object[0]);
                    m.a(null);
                    return;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(com.igexin.push.core.d.T);
                try {
                    fileOutputStream2.write(com.igexin.a.a.a.a.d((("v01" + com.igexin.push.core.d.f63690x) + com.igexin.push.core.d.f63684r + "|" + com.igexin.push.core.d.f63655a + "|" + com.igexin.push.core.d.f63685s + "|" + x.a().d(com.igexin.push.core.d.f63671e)).getBytes(), com.igexin.push.core.d.C));
                    m.a(fileOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    com.igexin.a.a.c.b.a("FileUtils | " + e.toString(), new Object[0]);
                    m.a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    m.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a(File file, String... strArr) {
        File[] fileArrListFiles;
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            return;
        }
        List listAsList = strArr != null ? Arrays.asList(strArr) : null;
        for (File file2 : fileArrListFiles) {
            if (listAsList == null || !listAsList.contains(file2.getName())) {
                file2.delete();
            }
        }
    }

    private static void a(List<File> list, File file, String str) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (file.getName().startsWith(str)) {
                    list.add(file);
                }
            } else {
                for (File file2 : file.listFiles()) {
                    a(list, file2, str);
                }
            }
        }
    }

    public static void a(byte[] bArr, String str, boolean z10) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str), z10);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream == null) {
                    } else {
                        fileOutputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean a(Context context) {
        return !new com.igexin.sdk.a.c(context).b();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[SYNTHETIC] */
    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        byteArray = null;
        byte[] byteArray = null;
        if (!new File(str).exists()) {
            com.igexin.a.a.c.b.a("FileUtils|get data from file = " + str + " file not exist ######", new Object[0]);
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        try {
                            int i10 = fileInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } catch (Exception e10) {
                            e = e10;
                            com.igexin.a.a.c.b.a("FileUtils|" + e.toString(), new Object[0]);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            return byteArray;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (Exception unused3) {
                            throw th;
                        }
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
                try {
                    fileInputStream.close();
                } catch (Exception unused4) {
                }
            } catch (Exception e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (byteArrayOutputStream == null) {
                throw th;
            }
            byteArrayOutputStream.close();
            throw th;
        }
        try {
            byteArrayOutputStream.close();
        } catch (Exception unused5) {
        }
        return byteArray;
    }

    public static String b() {
        return com.igexin.push.core.e.d.a().b(com.igexin.push.core.d.f63671e);
    }

    public static void b(Context context) {
        if (!com.igexin.push.config.l.f63435m) {
            com.igexin.a.a.c.b.a("FileUtils|isReportInitialize = false", new Object[0]);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - com.igexin.push.core.d.aq < 1000) {
            com.igexin.a.a.c.b.a("FileUtils|not allowed to save initialization twice within 1s", new Object[0]);
            return;
        }
        com.igexin.push.core.d.aq = jCurrentTimeMillis;
        if (com.igexin.push.core.d.f63672f.get()) {
            com.igexin.a.a.b.c.b().a(new f(context, jCurrentTimeMillis), false, true);
        } else {
            new Thread(new g(context, jCurrentTimeMillis)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        String str2 = context.getFilesDir().getPath() + "/init_c1.pid";
        synchronized (f64042a) {
            if (str.length() == 0) {
                a(str.getBytes(), str2, false);
            } else {
                a((str + "|").getBytes(), str2, true);
            }
        }
    }

    public static boolean b(String str) {
        boolean zDelete;
        File[] fileArrListFiles;
        com.igexin.a.a.c.b.a("FileUtils|removeExt " + str, new Object[0]);
        try {
            File file = new File(com.igexin.push.core.d.V);
            if (!file.exists() || (fileArrListFiles = file.listFiles(new e(str))) == null) {
                zDelete = false;
            } else {
                zDelete = false;
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
            String strSubstring = com.igexin.a.b.a.a(str).substring(12, 20);
            com.igexin.a.a.c.b.a("FileUtils|removeExt renamedExtName = " + strSubstring, new Object[0]);
            File file3 = new File(com.igexin.push.core.d.V + "/" + strSubstring);
            if (file3.exists()) {
                com.igexin.a.a.c.b.a("FileUtils|removeExt, delete ext rename Ext path = " + file3.getAbsolutePath(), new Object[0]);
                com.igexin.a.a.c.b.a("FileUtils|removeExt, delete ext renamedExt succeed = " + file3.delete(), new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, new File(com.igexin.push.core.d.V + "/oat"), str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            return zDelete;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("FileUtils|" + th2.toString(), new Object[0]);
            return false;
        }
    }

    public static String c() {
        return com.igexin.push.core.e.d.a().a(com.igexin.push.core.d.f63671e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        Exception exc;
        Object obj;
        RandomAccessFile randomAccessFile2 = null;
        FileLock fileLockLock = null;
        String str = null;
        String strA = null;
        try {
            randomAccessFile = new RandomAccessFile(new File(context.getFilesDir().getPath() + "/gt_safe.pid"), "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                try {
                    try {
                        if (fileLockLock.isValid()) {
                            byte[] bArr = new byte[128];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                int i10 = randomAccessFile.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                                try {
                                    com.igexin.a.a.c.b.a("FileUtils|get safeCode err = " + exc.toString(), new Object[0]);
                                    m.a(randomAccessFile2);
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return obj;
                                } catch (Throwable th3) {
                                    randomAccessFile = randomAccessFile2;
                                    th2 = th3;
                                    m.a(randomAccessFile);
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            String str2 = new String(byteArrayOutputStream.toByteArray());
                            try {
                                com.igexin.a.a.c.b.a("FileUtils|old safeCode = " + str2, new Object[0]);
                                if (TextUtils.isEmpty(str2)) {
                                    strA = p.a(16);
                                    com.igexin.a.a.c.b.a("FileUtils|new safeCode = " + strA, new Object[0]);
                                    randomAccessFile.write(strA.getBytes("utf-8"));
                                    str = strA;
                                } else {
                                    str = str2;
                                }
                            } catch (Exception e10) {
                                exc = e10;
                                randomAccessFile2 = randomAccessFile;
                                obj = str2;
                            }
                        }
                        m.a(randomAccessFile);
                        if (!fileLockLock.isValid()) {
                            return str;
                        }
                        try {
                            fileLockLock.release();
                            return str;
                        } catch (IOException unused3) {
                            return str;
                        }
                    } catch (Exception e11) {
                        obj = strA;
                        randomAccessFile2 = randomAccessFile;
                        exc = e11;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    m.a(randomAccessFile);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                e = e12;
                randomAccessFile2 = randomAccessFile;
                exc = e;
                obj = randomAccessFile2;
            } catch (Throwable th5) {
                th2 = th5;
                fileLockLock = null;
            }
        } catch (Exception e13) {
            e = e13;
        } catch (Throwable th6) {
            randomAccessFile = null;
            th2 = th6;
            fileLockLock = null;
        }
    }

    public static long d() {
        return com.igexin.push.core.e.d.a().c(com.igexin.push.core.d.f63671e);
    }

    public static String d(Context context) {
        return context.getExternalFilesDir("gtpush") + "/log/";
    }

    public static void e() {
        com.igexin.push.core.e.d.a().a(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63691y);
    }

    public static void f() throws Throwable {
        String str = com.igexin.push.core.d.f63671e.getFilesDir().getPath() + "/init.pid";
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (new File(str).exists()) {
                    byte[] bytes = com.igexin.push.core.d.f63685s.getBytes();
                    byte[] bArr = new byte[bytes.length];
                    for (int i10 = 0; i10 < bytes.length; i10++) {
                        bArr[i10] = (byte) (bytes[i10] ^ com.igexin.push.core.d.Y[i10]);
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    try {
                        fileOutputStream2.write(bArr);
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.a.a.c.b.a("FileUtils|" + e.toString(), new Object[0]);
                        if (fileOutputStream == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (fileOutputStream == null) {
                    return;
                }
            } catch (Exception e11) {
                e = e11;
            }
            try {
                fileOutputStream.close();
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
