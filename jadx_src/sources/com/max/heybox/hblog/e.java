package com.max.heybox.hblog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HBLogTools.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nHBLogTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBLogTools.kt\ncom/max/heybox/hblog/HBLogTools\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f74507a = new e();
    public static ChangeQuickRedirect changeQuickRedirect;

    private e() {
    }

    private final void b(String str, String str2, ZipOutputStream zipOutputStream) throws Exception {
        if (PatchProxy.proxy(new Object[]{str, str2, zipOutputStream}, this, changeQuickRedirect, false, bb.c.l.f34494v7, new Class[]{String.class, String.class, ZipOutputStream.class}, Void.TYPE).isSupported || zipOutputStream == null) {
            return;
        }
        File file = new File(str + str2);
        if (!file.isFile()) {
            String[] list = file.list();
            if (list == null) {
                zipOutputStream.putNextEntry(new ZipEntry(str2 + File.separator));
                zipOutputStream.closeEntry();
                return;
            }
            if (list.length == 0) {
                zipOutputStream.putNextEntry(new ZipEntry(str2 + File.separator));
                zipOutputStream.closeEntry();
            }
            for (String str3 : list) {
                b(str, str2 + File.separator + str3, zipOutputStream);
            }
            return;
        }
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
        try {
            zipOutputStream.putNextEntry(new ZipEntry(str2));
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    try {
                        bufferedInputStream.close();
                        zipOutputStream.closeEntry();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                zipOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
                zipOutputStream.closeEntry();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    public final void a(@dl.d String folderPath, @dl.d String zipFilePath) throws IOException {
        if (PatchProxy.proxy(new Object[]{folderPath, zipFilePath}, this, changeQuickRedirect, false, bb.c.l.f34472u7, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(folderPath, "folderPath");
        f0.p(zipFilePath, "zipFilePath");
        File file = new File(folderPath);
        if (!file.exists() || !file.isDirectory()) {
            throw new IOException("Folder " + folderPath + " does't exist or isn't a directory");
        }
        File file2 = new File(zipFilePath);
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Zip folder " + parentFile.getAbsolutePath() + " not created");
            }
            if (!file2.createNewFile()) {
                throw new IOException("Zip file " + zipFilePath + " not created");
            }
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
        try {
            String[] list = file.list();
            f0.o(list, "list(...)");
            for (String str : list) {
                String str2 = folderPath + File.separator;
                f0.m(str);
                b(str2, str, zipOutputStream);
            }
            try {
                zipOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                zipOutputStream.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }
}
