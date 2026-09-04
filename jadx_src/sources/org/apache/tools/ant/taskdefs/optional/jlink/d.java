package org.apache.tools.ant.taskdefs.optional.jlink;

import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: jlink.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f135246f = 8192;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f135247g = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f135248a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f135249b = new Vector(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f135250c = new Vector(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f135251d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte[] f135252e = new byte[8192];

    private void c(ZipOutputStream zipOutputStream, File file, String str, boolean z10) throws IOException {
        for (String str2 : file.list()) {
            File file2 = new File(file, str2);
            if (file2.isDirectory()) {
                c(zipOutputStream, file2, str + str2 + IOUtils.DIR_SEPARATOR_UNIX, z10);
            } else {
                d(zipOutputStream, file2, str, z10);
            }
        }
    }

    private void d(ZipOutputStream zipOutputStream, File file, String str, boolean z10) throws IOException {
        if (file.exists()) {
            ZipEntry zipEntry = new ZipEntry(j(file, str));
            zipEntry.setTime(file.lastModified());
            zipEntry.setSize(file.length());
            if (!z10) {
                zipEntry.setCrc(h(file));
            }
            g(zipOutputStream, Files.newInputStream(file.toPath(), new OpenOption[0]), zipEntry);
        }
    }

    private void g(ZipOutputStream zipOutputStream, InputStream inputStream, ZipEntry zipEntry) throws IOException {
        try {
            zipOutputStream.putNextEntry(zipEntry);
            while (true) {
                int i10 = inputStream.read(this.f135252e);
                if (i10 <= 0) {
                    zipOutputStream.closeEntry();
                    inputStream.close();
                    return;
                }
                zipOutputStream.write(this.f135252e, 0, i10);
            }
        } catch (ZipException unused) {
            inputStream.close();
        }
    }

    private long h(File file) throws IOException {
        return i(new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0])));
    }

    private long i(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        int length = this.f135252e.length;
        while (true) {
            int i10 = inputStream.read(this.f135252e, 0, length);
            if (i10 <= 0) {
                inputStream.close();
                return crc32.getValue();
            }
            crc32.update(this.f135252e, 0, i10);
        }
    }

    private String j(File file, String str) {
        String name = file.getName();
        if (!name.endsWith(".class")) {
            try {
                InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
                try {
                    String strA = a.a(inputStreamNewInputStream);
                    if (strA != null) {
                        String str2 = strA.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class";
                        if (inputStreamNewInputStream != null) {
                            inputStreamNewInputStream.close();
                        }
                        return str2;
                    }
                    if (inputStreamNewInputStream != null) {
                        inputStreamNewInputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStreamNewInputStream != null) {
                        try {
                            inputStreamNewInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused) {
            }
        }
        System.out.printf("From %1$s and prefix %2$s, creating entry %2$s%3$s%n", file.getPath(), str, name);
        return str + name;
    }

    public static void l(String[] strArr) {
        if (strArr.length < 2) {
            System.out.println("usage: jlink output input1 ... inputN");
            System.exit(1);
        }
        d dVar = new d();
        dVar.p(strArr[0]);
        for (int i10 = 1; i10 < strArr.length; i10++) {
            dVar.e(strArr[i10]);
        }
        try {
            dVar.k();
        } catch (Exception e10) {
            System.err.print(e10.getMessage());
        }
    }

    private void m(ZipOutputStream zipOutputStream, File file) throws IOException {
        if (file.exists()) {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement.getName().indexOf("META-INF") < 0) {
                        try {
                            zipOutputStream.putNextEntry(n(zipFile, zipEntryNextElement));
                            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                            try {
                                int length = this.f135252e.length;
                                while (true) {
                                    int i10 = inputStream.read(this.f135252e, 0, length);
                                    if (i10 <= 0) {
                                        break;
                                    } else {
                                        zipOutputStream.write(this.f135252e, 0, i10);
                                    }
                                }
                                zipOutputStream.closeEntry();
                                inputStream.close();
                            } catch (Throwable th2) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        } catch (ZipException e10) {
                            if (!e10.getMessage().contains(AgooConstants.MESSAGE_DUPLICATE)) {
                                throw e10;
                            }
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable th4) {
                try {
                    zipFile.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    private ZipEntry n(ZipFile zipFile, ZipEntry zipEntry) {
        String name = zipEntry.getName();
        if (!zipEntry.isDirectory() && !name.endsWith(".class")) {
            try {
                InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(name));
                try {
                    String strA = a.a(inputStream);
                    if (strA != null) {
                        name = strA.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class";
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused) {
            }
        }
        ZipEntry zipEntry2 = new ZipEntry(name);
        zipEntry2.setTime(zipEntry.getTime());
        zipEntry2.setExtra(zipEntry.getExtra());
        zipEntry2.setComment(zipEntry.getComment());
        zipEntry2.setTime(zipEntry.getTime());
        if (this.f135251d) {
            zipEntry2.setMethod(8);
        } else {
            zipEntry2.setMethod(0);
            zipEntry2.setCrc(zipEntry.getCrc());
            zipEntry2.setSize(zipEntry.getSize());
        }
        return zipEntry2;
    }

    public void a(String str) {
        if (str == null) {
            return;
        }
        this.f135250c.add(str);
    }

    public void b(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            a(str);
        }
    }

    public void e(String str) {
        if (str == null) {
            return;
        }
        this.f135249b.add(str);
    }

    public void f(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            e(str);
        }
    }

    public void k() throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(Paths.get(this.f135248a, new String[0]), new OpenOption[0]));
        try {
            if (this.f135251d) {
                zipOutputStream.setMethod(8);
                zipOutputStream.setLevel(-1);
            } else {
                zipOutputStream.setMethod(0);
            }
            for (String str : this.f135249b) {
                File file = new File(str);
                if (file.getName().endsWith(".jar") || file.getName().endsWith(DynamicSoManager.f77249d)) {
                    m(zipOutputStream, file);
                } else {
                    a(str);
                }
            }
            Iterator<String> it = this.f135250c.iterator();
            while (it.hasNext()) {
                File file2 = new File(it.next());
                if (file2.isDirectory()) {
                    c(zipOutputStream, file2, file2.getName() + IOUtils.DIR_SEPARATOR_UNIX, this.f135251d);
                } else {
                    d(zipOutputStream, file2, "", this.f135251d);
                }
            }
            zipOutputStream.close();
        } catch (Throwable th2) {
            try {
                zipOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void o(boolean z10) {
        this.f135251d = z10;
    }

    public void p(String str) {
        if (str == null) {
            return;
        }
        this.f135248a = str;
    }
}
