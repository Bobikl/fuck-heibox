package com.igexin.push.extension.distribution.basic.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.igexin.push.core.CoreConsts;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63953a = "EXT-" + c.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f63954d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.igexin.push.extension.distribution.basic.e.a f63955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f63956c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f63957e = "/sdcard/libs//com.getui.sdk.deviceId.db";

    private c(Context context) {
        this.f63956c = context;
    }

    public static c a() {
        if (f63954d == null) {
            f63954d = new c(e.f63961a);
        }
        return f63954d;
    }

    private void a(File file) {
        for (File file2 : file.listFiles()) {
            while (file2.exists()) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (!file2.delete()) {
                    a(file2);
                }
            }
        }
        file.delete();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e A[EXC_TOP_SPLITTER, PHI: r3
  0x009e: PHI (r3v3 java.io.FileOutputStream) = (r3v4 java.io.FileOutputStream), (r3v5 java.io.FileOutputStream) binds: [B:26:0x00c7, B:19:0x009c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private void b(String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        String str2 = f63953a;
        sb2.append(str2);
        sb2.append("|save deviceId = ");
        sb2.append(str);
        sb2.append(" to ");
        sb2.append(this.f63957e);
        com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
        ReentrantReadWriteLock.WriteLock writeLock = new ReentrantReadWriteLock().writeLock();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (writeLock.tryLock()) {
                    File file = new File(this.f63957e);
                    if (!file.exists() && !file.createNewFile()) {
                        com.igexin.a.a.c.b.a(str2 + "|create file " + file.toString() + " failed", new Object[0]);
                        writeLock.unlock();
                        return;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.f63957e);
                    try {
                        fileOutputStream2.write(com.igexin.a.b.a.b(("V1|" + str).getBytes("utf-8")));
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.a.a.c.b.a(f63953a + "|" + e.toString(), new Object[0]);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused) {
                            }
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
                        writeLock.unlock();
                        throw th;
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        writeLock.unlock();
    }

    private void c(String str) {
        try {
            if (e.f63972l.a()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", (Integer) 2);
                contentValues.put("value", str);
                e.f63972l.a("runtime", (String) null, contentValues);
                e.f63972l.close();
            }
        } catch (Throwable unused) {
        }
    }

    private String g() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        FileInputStream fileInputStream2 = null;
        if (new File(this.f63957e).exists()) {
            byte[] bArr = new byte[1024];
            try {
                fileInputStream = new FileInputStream(this.f63957e);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i10 = fileInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } catch (Exception unused) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused4) {
                                throw th;
                            }
                        }
                    }
                    String[] strArrSplit = new String(com.igexin.a.b.a.c(byteArrayOutputStream.toByteArray()), "utf-8").split("\\|");
                    if (strArrSplit.length > 1 && "V1".equals(strArrSplit[0])) {
                        str = strArrSplit[1];
                    }
                    try {
                        fileInputStream.close();
                    } catch (Exception unused5) {
                    }
                } catch (Exception unused6) {
                    byteArrayOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } catch (Exception unused7) {
                fileInputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused8) {
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0084 A[DONT_GENERATE, PHI: r1 r8
  0x0084: PHI (r1v1 java.lang.String) = (r1v3 java.lang.String), (r1v4 java.lang.String) binds: [B:24:0x008f, B:18:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r8v3 android.database.Cursor) = (r8v4 android.database.Cursor), (r8v5 android.database.Cursor) binds: [B:24:0x008f, B:18:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    public String a(String str) {
        String string;
        String str2 = "";
        com.igexin.push.extension.distribution.basic.e.a aVarB = b();
        this.f63955b = aVarB;
        Cursor cursorA = null;
        try {
            try {
                cursorA = aVarB.a("image", new String[]{"imageurl"}, new String[]{str}, null, null);
                if (cursorA != null) {
                    loop0: while (true) {
                        string = "";
                        while (true) {
                            try {
                                if (!cursorA.moveToNext()) {
                                    break loop0;
                                }
                                string = cursorA.getString(cursorA.getColumnIndexOrThrow("imagesrc"));
                                File file = new File(string);
                                if (!file.exists() || !file.canRead()) {
                                    this.f63955b.a("image", new String[]{"imageurl"}, new String[]{str});
                                    if (this.f63956c.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.f63956c.getPackageName()) != 0) {
                                        e.f63971k = this.f63956c.getCacheDir() + "/ImgCache/";
                                    }
                                }
                            } catch (Exception unused) {
                                str2 = string;
                            }
                        }
                    }
                    str2 = string;
                }
            } catch (Exception unused2) {
            }
            return str2;
        } finally {
            if (0 != 0) {
                cursorA.close();
            }
        }
    }

    public com.igexin.push.extension.distribution.basic.e.a b() {
        if (this.f63955b == null) {
            this.f63955b = new com.igexin.push.extension.distribution.basic.e.a(this.f63956c);
        }
        return this.f63955b;
    }

    public void c() {
        Cursor cursorA = null;
        try {
            cursorA = b().a("image", new String[]{"taskid"}, "createtime <= " + String.valueOf(System.currentTimeMillis() - 604800000));
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    String string = cursorA.getString(cursorA.getColumnIndexOrThrow("taskid"));
                    b().a("image", new String[]{"taskid"}, new String[]{string});
                    File file = new File(e.f63971k + string);
                    if (file.exists()) {
                        a(file);
                    }
                }
            }
            if (cursorA == null) {
                return;
            }
        } catch (Exception unused) {
            if (cursorA == null) {
                return;
            }
        } catch (Throwable th2) {
            if (cursorA != null) {
                cursorA.close();
            }
            throw th2;
        }
        cursorA.close();
    }

    public void d() {
        File file = new File(CoreConsts.f63455e);
        if (file.exists()) {
            for (File file2 : file.listFiles(new d(this))) {
                if (file2.exists()) {
                    a(file2);
                }
            }
        }
    }

    public void e() throws Throwable {
        String strG = g();
        StringBuilder sb2 = new StringBuilder();
        String str = f63953a;
        sb2.append(str);
        sb2.append("|read from com.getui.sdk.deviceId.db = ");
        sb2.append(strG);
        sb2.append("; CoreRuntimeInfo.deviceId = ");
        sb2.append(com.igexin.push.core.d.f63691y);
        com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
        if (strG != null) {
            if (strG.equals(com.igexin.push.core.d.f63691y)) {
                return;
            }
            com.igexin.push.core.d.f63691y = strG;
            c(strG);
            return;
        }
        String str2 = com.igexin.push.core.d.f63691y;
        if (str2 != null) {
            b(str2);
            return;
        }
        com.igexin.a.a.c.b.a(str + "|updateDeviceId new file deviceId and CoreRuntimeInfo deviceId is null return", new Object[0]);
    }

    public void f() {
    }
}
