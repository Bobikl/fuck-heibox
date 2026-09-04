package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.Deflater;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: UMSLUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f105270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f105271b = new Object();

    /* JADX WARN: Code duplicated, block: B:38:0x0063 A[EXC_TOP_SPLITTER, PHI: r1
  0x0063: PHI (r1v3 java.io.FileOutputStream) = (r1v1 java.io.FileOutputStream), (r1v4 java.io.FileOutputStream) binds: [B:22:0x0061, B:27:0x006b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static int a(Context context, String str, String str2, byte[] bArr) {
        int i10 = 101;
        if (context != null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    synchronized (f105271b) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(context.getFilesDir());
                            String str3 = File.separator;
                            sb2.append(str3);
                            sb2.append(str);
                            File file = new File(sb2.toString());
                            if (!file.isDirectory()) {
                                file.mkdir();
                            }
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file.getPath() + str3 + str2));
                            try {
                                fileOutputStream2.write(bArr);
                                fileOutputStream2.close();
                                i10 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (Throwable th4) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th4;
                }
            } catch (IOException e10) {
                UMCrashManager.reportCrash(context, e10);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th5) {
                UMCrashManager.reportCrash(context, th5);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        }
        return i10;
    }

    public static File a(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file = null;
        try {
            synchronized (f105271b) {
                ULog.i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                if (context != null && context.getApplicationContext() != null) {
                    String str = context.getApplicationContext().getFilesDir() + File.separator + a.f105246e;
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0) {
                            for (File file3 : fileArrListFiles) {
                                if (file3 != null && file3.isDirectory() && (fileArrListFiles2 = file3.listFiles()) != null && fileArrListFiles2.length > 0) {
                                    Arrays.sort(fileArrListFiles2, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.1
                                        @Override // java.util.Comparator
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public int compare(File file4, File file5) {
                                            long jLastModified = file4.lastModified() - file5.lastModified();
                                            if (jLastModified > 0) {
                                                return 1;
                                            }
                                            return jLastModified == 0 ? 0 : -1;
                                        }
                                    });
                                    File file4 = fileArrListFiles2[0];
                                    if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                        file = file4;
                                    }
                                }
                            }
                        }
                    }
                }
                ULog.i("walle", "get last envelope end, thread is " + Thread.currentThread());
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
        return file;
    }

    public static String a(Context context, boolean z10) {
        String str;
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            if (z10) {
                str = context.getApplicationContext().getFilesDir() + File.separator + a.f105246e;
            } else {
                str = context.getApplicationContext().getFilesDir() + File.separator + a.f105247f;
            }
            str2 = str;
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void a(Context context, String str, int i10) {
        try {
            if (str == null) {
                ULog.i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                ULog.i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f105271b) {
                File[] fileArrListFiles = file.listFiles();
                ULog.i("AmapLBS", "[lbs-build] delete file begin " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                if (fileArrListFiles.length >= i10) {
                    ULog.i("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i10) {
                        Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.4
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file3, File file4) {
                                if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                    return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                }
                                return -1;
                            }
                        });
                        if (ULog.DEBUG) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                ULog.i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i11)).getPath());
                            }
                        }
                        for (int i12 = 0; i12 <= arrayList.size() - i10; i12++) {
                            if (arrayList.get(i12) != null) {
                                ULog.i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i12)).getPath());
                                try {
                                    ((File) arrayList.get(i12)).delete();
                                    arrayList.remove(i12);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } else {
                    ULog.i("AmapLBS", "[lbs-build] file size < max");
                }
                ULog.i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static void a(Context context, String str, final String str2, int i10) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                synchronized (f105271b) {
                    try {
                        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.umeng.commonsdk.stateless.d.5
                            @Override // java.io.FilenameFilter
                            public boolean accept(File file2, String str3) {
                                return str3.startsWith(str2);
                            }
                        });
                        if (fileArrListFiles == null || fileArrListFiles.length < i10) {
                            ULog.i("AmapLBS", "[lbs-build] file size < max");
                        } else {
                            ULog.i("AmapLBS", "[lbs-build] file size >= max");
                            ArrayList arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    arrayList.add(file2);
                                }
                            }
                            if (arrayList.size() >= i10) {
                                Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.6
                                    @Override // java.util.Comparator
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public int compare(File file3, File file4) {
                                        if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                            return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                        }
                                        return -1;
                                    }
                                });
                                if (ULog.DEBUG) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        ULog.i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i11)).getPath());
                                    }
                                }
                                for (int i12 = 0; i12 <= arrayList.size() - i10; i12++) {
                                    if (arrayList.get(i12) != null) {
                                        ULog.i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i12)).getPath());
                                        try {
                                            ((File) arrayList.get(i12)).delete();
                                            arrayList.remove(i12);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                        }
                        ULog.i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            UMCrashManager.reportCrash(context, th3);
        }
    }

    public static boolean a(long j10, long j11) {
        return j10 > j11;
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static byte[] a(String str) throws IOException {
        byte[] bArr;
        synchronized (f105271b) {
            FileChannel channel = null;
            try {
                try {
                    channel = new RandomAccessFile(str, "r").getChannel();
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                    bArr = new byte[(int) channel.size()];
                    if (mappedByteBufferLoad.remaining() > 0) {
                        mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                    }
                    try {
                        channel.close();
                    } catch (Throwable unused) {
                    }
                } catch (IOException e10) {
                    ULog.i("walle", "[stateless] write envelope, e is " + e10.getMessage());
                    throw e10;
                }
            } catch (Throwable th2) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f105270a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    f105270a += iDeflate;
                    byteArrayOutputStream2.write(bArr2, 0, iDeflate);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(UMUtils.genIv()));
        return cipher.doFinal(bArr);
    }

    public static File b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f105271b) {
                String str = context.getApplicationContext().getFilesDir() + File.separator + a.f105247f;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                synchronized (f105271b) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.2
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file2, File file3) {
                                long jLastModified = file2.lastModified() - file3.lastModified();
                                if (jLastModified > 0) {
                                    return 1;
                                }
                                return jLastModified == 0 ? 0 : -1;
                            }
                        });
                        return fileArrListFiles[0];
                    }
                    return null;
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r8, java.lang.String r9, java.lang.String r10, byte[] r11) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.d.b(android.content.Context, java.lang.String, java.lang.String, byte[]):boolean");
    }

    public static byte[] b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    public static File[] c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f105271b) {
                String str = context.getApplicationContext().getFilesDir() + File.separator + a.f105247f;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                synchronized (f105271b) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.3
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file2, File file3) {
                                long jLastModified = file2.lastModified() - file3.lastModified();
                                if (jLastModified > 0) {
                                    return 1;
                                }
                                return jLastModified == 0 ? 0 : -1;
                            }
                        });
                        return fileArrListFiles;
                    }
                    return null;
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String d(String str) {
        int iLastIndexOf;
        int iLastIndexOf2;
        return (!TextUtils.isEmpty(str) && str.indexOf("envelope") < 0 && (iLastIndexOf = str.lastIndexOf(lg.a.f131412e)) >= 0 && (iLastIndexOf2 = str.lastIndexOf(".")) >= 0) ? str.substring(iLastIndexOf + 1, iLastIndexOf2) : "";
    }
}
