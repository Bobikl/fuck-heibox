package com.umeng.socialize.net.dplus.cache1;

import android.text.TextUtils;
import android.util.Log;
import bb.c;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class CacheExector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106309a = "CacheExector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106310b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106311c = c.f.Yc;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106312d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f106313e;

    public CacheExector(String str) {
        this.f106313e = str;
    }

    private double a(long j10) {
        if (j10 <= 0) {
            return 0.0d;
        }
        return j10 / 1024.0d;
    }

    private <T extends IReader> T a(String str, Class<T> cls) {
        try {
            return cls.getConstructor(String.class).newInstance(str);
        } catch (Throwable th2) {
            SLog.error(UmengText.CACHE.CACHEFILE, th2);
            return null;
        }
    }

    private File a() {
        if (TextUtils.isEmpty(this.f106313e)) {
            Log.d(f106309a, "Couldn't create directory mDirPath is null");
            return null;
        }
        File file = new File(this.f106313e);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Log.d(f106309a, "Couldn't create directory" + this.f106313e);
        return null;
    }

    private File a(File file, String str) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        return new File(file, a(str));
    }

    private String a(String str) {
        return String.valueOf(System.currentTimeMillis()) + str;
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                SLog.error(UmengText.CACHE.CACHEFILE, e10);
            }
        }
    }

    private File[] a(File file) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        Arrays.sort(fileArrListFiles, b());
        return fileArrListFiles;
    }

    private File b(File file, String str) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return a(file, str);
        }
        File fileC = c(file, str);
        return fileC == null ? a(file, str) : fileC;
    }

    private Comparator<File> b() {
        return new Comparator<File>() { // from class: com.umeng.socialize.net.dplus.cache1.CacheExector.1
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return Long.valueOf(file.length()).compareTo(Long.valueOf(file2.length()));
            }
        };
    }

    private File c(File file, String str) {
        File[] fileArrA = a(file);
        if (fileArrA == null || fileArrA.length <= 0 || fileArrA.length <= 0) {
            return null;
        }
        File file2 = fileArrA[0];
        if (a(file2.length()) > 32.0d) {
            return null;
        }
        return file2;
    }

    private File d(File file, String str) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return null;
        }
        return e(file, str);
    }

    private File e(File file, String str) {
        File[] fileArrA = a(file);
        if (fileArrA != null && fileArrA.length > 0) {
            for (File file2 : fileArrA) {
                if (a(file2.length()) <= 40 && file2.getName().endsWith(str)) {
                    return file2;
                }
                Log.e(f106309a, "getReadableFileFromFiles:file length don't legal" + file2.length());
                deleteFile(file2.getName());
            }
        }
        return null;
    }

    public double checkSize(String str) {
        File fileA = a();
        double dA = 0.0d;
        if (fileA != null && fileA.isDirectory()) {
            File[] fileArrListFiles = fileA.listFiles();
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file = fileArrListFiles[i10];
                if (file != null && file.getName().contains(str)) {
                    dA += a(fileArrListFiles[i10].length());
                }
            }
        }
        return dA;
    }

    public boolean deleteFile(String str) {
        File[] fileArrListFiles = a().listFiles();
        boolean zDelete = false;
        for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
            File file = fileArrListFiles[i10];
            if (file != null && file.getName().contains(str)) {
                zDelete = fileArrListFiles[i10].delete();
            }
        }
        return zDelete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Class, java.lang.Class<T extends com.umeng.socialize.net.dplus.cache1.IReader>] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.Closeable, java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.umeng.socialize.net.dplus.cache1.CacheExector] */
    public <T extends IReader> T readFile(String str, Class<T> cls) throws Throwable {
        String str2;
        FileInputStream fileInputStreamOpenRead;
        ?? r10;
        BufferedReader bufferedReader;
        File fileD = d(a(), str);
        ?? r11 = 0;
        if (fileD == null) {
            return null;
        }
        try {
            fileInputStreamOpenRead = new AtomicFile(fileD).openRead();
        } catch (IOException e10) {
            str2 = UmengText.CACHE.CACHEFILE;
            SLog.error(str2, e10);
            deleteFile(fileD.getName());
            fileInputStreamOpenRead = null;
        }
        try {
            if (fileInputStreamOpenRead == null) {
                return null;
            }
            try {
                T t10 = (T) a(fileD.getName(), cls);
                cls = (Class<T>) new InputStreamReader(fileInputStreamOpenRead);
                try {
                    bufferedReader = new BufferedReader(cls);
                    int i10 = 0;
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            i10++;
                            Log.d(f106309a, "read file:" + i10 + line);
                            if (!TextUtils.isEmpty(line)) {
                                try {
                                    sb2.append(line);
                                } catch (Exception e11) {
                                    SLog.error(UmengText.CACHE.CACHEFILE, e11);
                                }
                            }
                        }
                        if (t10 != null) {
                            t10.create(sb2.toString());
                        }
                        a(fileInputStreamOpenRead);
                        a(cls);
                        a(bufferedReader);
                        return t10;
                    } catch (IOException e12) {
                        e = e12;
                        SLog.error(UmengText.CACHE.CACHEFILE, e);
                        a(fileInputStreamOpenRead);
                        a(cls);
                        a(bufferedReader);
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = null;
                    r11 = cls;
                    r10 = str2;
                    a(fileInputStreamOpenRead);
                    a(r11);
                    a(r10);
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
                cls = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                r10 = 0;
                a(fileInputStreamOpenRead);
                a(r11);
                a(r10);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.OutputStreamWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.umeng.socialize.net.dplus.cache1.CacheExector] */
    public boolean save(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStreamStartWrite;
        File fileB = b(a(), str2);
        boolean z10 = false;
        if (fileB == null) {
            return false;
        }
        AtomicFile atomicFile = new AtomicFile(fileB);
        BufferedWriter bufferedWriter = null;
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite(true);
        } catch (IOException e10) {
            e = e10;
            SLog.error(UmengText.CACHE.CACHEFILE, e);
            deleteFile(fileB.getName());
            fileOutputStreamStartWrite = null;
        }
        try {
            if (fileOutputStreamStartWrite == null) {
                return false;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    e = 0;
                } else {
                    e = new OutputStreamWriter(fileOutputStreamStartWrite);
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(e);
                        try {
                            bufferedWriter2.write(str);
                            bufferedWriter2.newLine();
                            bufferedWriter2.flush();
                            atomicFile.finishWrite(fileOutputStreamStartWrite);
                            z10 = true;
                            bufferedWriter = bufferedWriter2;
                            e = e;
                        } catch (IOException e11) {
                            e = e11;
                            bufferedWriter = bufferedWriter2;
                            atomicFile.failWrite(fileOutputStreamStartWrite);
                            SLog.error(UmengText.CACHE.CACHEFILE, e);
                            e = e;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                }
            } catch (IOException e13) {
                e = e13;
                e = 0;
            } catch (Throwable th3) {
                th = th3;
                e = 0;
            }
            a(bufferedWriter);
            a(e);
            a(fileOutputStreamStartWrite);
            return z10;
        } catch (Throwable th4) {
            th = th4;
        }
        a(bufferedWriter);
        a(e);
        a(fileOutputStreamStartWrite);
        throw th;
    }
}
