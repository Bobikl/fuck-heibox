package com.getkeepsafe.relinker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: ApkLibraryInstaller.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f43000a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f43001b = 4096;

    /* JADX INFO: renamed from: com.getkeepsafe.relinker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApkLibraryInstaller.java */
    public static class C0362a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZipFile f43002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZipEntry f43003b;

        public C0362a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f43002a = zipFile;
            this.f43003b = zipEntry;
        }
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                outputStream.flush();
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    private C0362a d(Context context, String[] strArr, String str, e eVar) {
        String[] strArrF = f(context);
        int length = strArrF.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str2 = strArrF[i11];
            int i12 = i10;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile != null) {
                int i14 = i10;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 >= 5) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    int length2 = strArr.length;
                    int i16 = i10;
                    while (i16 < length2) {
                        String str3 = "lib" + File.separatorChar + strArr[i16] + File.separatorChar + str;
                        Object[] objArr = new Object[2];
                        objArr[i10] = str3;
                        objArr[1] = str2;
                        eVar.m("Looking for %s in APK %s...", objArr);
                        ZipEntry entry = zipFile.getEntry(str3);
                        if (entry != null) {
                            return new C0362a(zipFile, entry);
                        }
                        i16++;
                        i10 = 0;
                    }
                    i14 = i15;
                    i10 = 0;
                }
            }
            i11++;
            i10 = 0;
        }
    }

    private String[] e(Context context, String str) {
        Pattern patternCompile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // com.getkeepsafe.relinker.d.a
    @SuppressLint({"SetWorldReadable"})
    public void a(Context context, String[] strArr, String str, File file, e eVar) throws Throwable {
        String[] strArrE;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        C0362a c0362a = null;
        Closeable closeable = null;
        try {
            C0362a c0362aD = d(context, strArr, str, eVar);
            try {
                if (c0362aD == null) {
                    try {
                        strArrE = e(context, str);
                    } catch (Exception e10) {
                        strArrE = new String[]{e10.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArrE);
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 >= 5) {
                        eVar.l("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile = c0362aD.f43002a;
                            if (zipFile != null) {
                                zipFile.close();
                                return;
                            }
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    eVar.m("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = c0362aD.f43002a.getInputStream(c0362aD.f43003b);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        long jC = c(inputStream, fileOutputStream);
                                        fileOutputStream.getFD().sync();
                                        if (jC == file.length()) {
                                            b(inputStream);
                                            b(fileOutputStream);
                                            file.setReadable(true, false);
                                            file.setExecutable(true, false);
                                            file.setWritable(true);
                                            try {
                                                ZipFile zipFile2 = c0362aD.f43002a;
                                                if (zipFile2 != null) {
                                                    zipFile2.close();
                                                    return;
                                                }
                                                return;
                                            } catch (IOException unused2) {
                                                return;
                                            }
                                        }
                                        b(inputStream);
                                        b(fileOutputStream);
                                    } catch (FileNotFoundException unused3) {
                                        b(inputStream);
                                    } catch (IOException unused4) {
                                        b(inputStream);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        closeable = inputStream;
                                        b(closeable);
                                        b(fileOutputStream);
                                        throw th;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    fileOutputStream = null;
                                } catch (IOException unused6) {
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                            } catch (FileNotFoundException unused7) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (IOException unused8) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = null;
                            }
                        }
                    } catch (IOException unused9) {
                    }
                    i10 = i11;
                }
            } catch (Throwable th5) {
                th = th5;
                c0362a = c0362aD;
                if (c0362a != null) {
                    try {
                        ZipFile zipFile3 = c0362a.f43002a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
