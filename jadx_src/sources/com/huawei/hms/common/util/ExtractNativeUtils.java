package com.huawei.hms.common.util;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes7.dex */
public class ExtractNativeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60573a = "ExtractNativeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60574b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60575c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60576d = 50;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60577e = 52428800;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f60578f = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f60579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZipEntry f60580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f60581c;

        public b(ZipEntry zipEntry, String str, String str2) {
            this.f60580b = zipEntry;
            this.f60579a = str;
            this.f60581c = str2;
        }
    }

    public static int a(File file, String str) throws Throwable {
        Logger.i(f60573a, "begin extractNativeLibrary");
        int i10 = 0;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                try {
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                        HashMap map = new HashMap();
                        int iA = a(enumerationEntries, (HashMap<String, HashSet<b>>) map, 0);
                        if (iA == -1) {
                            Logger.e(f60573a, "Unsafe zip name!");
                            try {
                                zipFile2.close();
                            } catch (IOException e10) {
                                Logger.e(f60573a, "IOException:", e10);
                            }
                            return -1;
                        }
                        if (iA > 50) {
                            Logger.e(f60573a, "the total number is larger than the max");
                            try {
                                zipFile2.close();
                            } catch (IOException e11) {
                                Logger.e(f60573a, "IOException:", e11);
                            }
                            return -1;
                        }
                        Iterator it = map.keySet().iterator();
                        int iA2 = 0;
                        while (it.hasNext()) {
                            try {
                                Set<b> set = (Set) map.get((String) it.next());
                                if (set == null) {
                                    Logger.e(f60573a, "Get nativeZipEntries failed.");
                                    try {
                                        zipFile2.close();
                                    } catch (IOException e12) {
                                        Logger.e(f60573a, "IOException:", e12);
                                    }
                                    return -1;
                                }
                                for (b bVar : set) {
                                    String str2 = str + File.separator + bVar.f60581c;
                                    ModuleCopy.makeDirectory(str2);
                                    new File(str2).setExecutable(true, false);
                                    iA2 = a(zipFile2, bVar, str2);
                                    if (iA2 != 0) {
                                        try {
                                            zipFile2.close();
                                        } catch (IOException e13) {
                                            Logger.e(f60573a, "IOException:", e13);
                                        }
                                        return iA2;
                                    }
                                    new File(str2, bVar.f60579a).setReadable(true, false);
                                }
                            } catch (IOException e14) {
                                e = e14;
                                i10 = iA2;
                                zipFile = zipFile2;
                                Logger.e(f60573a, "catch IOException ", e);
                                if (zipFile != null) {
                                    try {
                                        zipFile.close();
                                    } catch (IOException e15) {
                                        e = e15;
                                        iA2 = i10;
                                    }
                                }
                                return i10;
                            }
                            Logger.e(f60573a, "IOException:", e);
                            return iA2;
                        }
                        try {
                            zipFile2.close();
                            return iA2;
                        } catch (IOException e16) {
                            e = e16;
                        }
                    } catch (IOException e17) {
                        e = e17;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e18) {
                            Logger.e(f60573a, "IOException:", e18);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e19) {
            e = e19;
        }
    }

    public static int a(Enumeration enumeration, HashMap<String, HashSet<b>> map, int i10) {
        while (enumeration.hasMoreElements()) {
            Object objNextElement = enumeration.nextElement();
            if (objNextElement != null && (objNextElement instanceof ZipEntry)) {
                ZipEntry zipEntry = (ZipEntry) objNextElement;
                String name = zipEntry.getName();
                if (name.contains("../")) {
                    Logger.e(f60573a, "Unsafe zip name!");
                    return -1;
                }
                Matcher matcher = f60578f.matcher(name);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    HashSet<b> hashSet = map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new b(zipEntry, strGroup2, strGroup));
                    i10++;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static int a(ZipFile e10, b bVar, String str) throws Throwable {
        ?? r10;
        IOException e11;
        FileOutputStream fileOutputStream = null;
        ?? r11 = 0;
        ?? r12 = 0;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        int i10 = -1;
        try {
            try {
                byte[] bArr = new byte[4096];
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(str, bVar.f60579a));
                try {
                    e10 = e10.getInputStream(bVar.f60580b);
                    int i11 = 0;
                    while (true) {
                        try {
                            int i12 = e10.read(bArr);
                            if (i12 <= 0) {
                                i10 = 0;
                                fileOutputStream = i11;
                                break;
                            }
                            int i13 = i11 + i12;
                            if (i13 > 52428800) {
                                Logger.e(f60573a, "so file too big , " + bVar.f60581c + " , " + bVar.f60579a);
                                fileOutputStream = i13;
                                break;
                            }
                            fileOutputStream3.write(bArr, 0, i12);
                            i11 = i13;
                        } catch (FileNotFoundException unused) {
                            r11 = e10;
                            e10 = r11;
                            fileOutputStream = fileOutputStream3;
                            Logger.e(f60573a, "FileNotFoundException");
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e12) {
                                    Logger.e(f60573a, "IOException", e12);
                                }
                            }
                            if (e10 != 0) {
                            }
                            return i10;
                        } catch (IOException e13) {
                            e11 = e13;
                            r12 = e10;
                            e10 = r12;
                            fileOutputStream = fileOutputStream3;
                            Logger.e(f60573a, "IOException", e11);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e14) {
                                    Logger.e(f60573a, "IOException", e14);
                                }
                            }
                            if (e10 != 0) {
                            }
                            return i10;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream3;
                            Throwable th3 = th;
                            r10 = e10;
                            th = th3;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e15) {
                                    Logger.e(f60573a, "IOException", e15);
                                }
                            }
                            if (r10 != 0) {
                                throw th;
                            }
                            try {
                                r10.close();
                                throw th;
                            } catch (IOException e16) {
                                Logger.e(f60573a, "IOException", e16);
                                throw th;
                            }
                        }
                    }
                    try {
                        fileOutputStream3.close();
                    } catch (IOException e17) {
                        Logger.e(f60573a, "IOException", e17);
                    }
                } catch (FileNotFoundException unused2) {
                } catch (IOException e18) {
                    e11 = e18;
                } catch (Throwable th4) {
                    th = th4;
                    e10 = 0;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (FileNotFoundException unused3) {
            e10 = 0;
        } catch (IOException e19) {
            e11 = e19;
            e10 = 0;
        } catch (Throwable th6) {
            th = th6;
            r10 = 0;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            if (r10 != 0) {
                throw th;
            }
            r10.close();
            throw th;
        }
        try {
            e10.close();
        } catch (IOException e20) {
            e10 = e20;
            Logger.e(f60573a, "IOException", (Throwable) e10);
        }
        return i10;
    }

    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT <= 23) {
            Logger.i(f60573a, "The android version is below android 6.");
            return true;
        }
        try {
            if ((context.getPackageManager().getPackageArchiveInfo(str, 128).applicationInfo.flags & 268435456) == 268435456) {
                Logger.i(f60573a, "The extract-native-flag has set, need to extract.");
                return true;
            }
            Logger.i(f60573a, "The extract-native-flag has not set, No need to extract.");
            return false;
        } catch (Exception unused) {
            Logger.w(f60573a, "Get package name failed: name not found.");
            return true;
        }
    }
}
