package com.max.hbcommon.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: UnzipUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nUnzipUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnzipUtils.kt\ncom/max/hbcommon/utils/UnzipUtils\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1313#2,2:86\n1#3:88\n*S KotlinDebug\n*F\n+ 1 UnzipUtils.kt\ncom/max/hbcommon/utils/UnzipUtils\n*L\n27#1:86,2\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r f68262a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f68263b = 4096;
    public static ChangeQuickRedirect changeQuickRedirect;

    private r() {
    }

    private final void a(InputStream inputStream, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{inputStream, str}, this, changeQuickRedirect, false, bb.c.f.P1, new Class[]{InputStream.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("Descomprimiendo archivo: " + str);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                bufferedOutputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i10);
        }
    }

    @dl.e
    public final String b(@dl.d String fileOrDirPath) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fileOrDirPath}, this, changeQuickRedirect, false, bb.c.f.Q1, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(fileOrDirPath, "fileOrDirPath");
        String separator = File.separator;
        f0.o(separator, "separator");
        String strSubstring = fileOrDirPath.substring(0, StringsKt__StringsKt.F3(fileOrDirPath, File.separatorChar, u.K1(fileOrDirPath, separator, false, 2, null) ? fileOrDirPath.length() - 2 : fileOrDirPath.length() - 1, false, 4, null));
        f0.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void c(@dl.d File zipFilePath, @dl.d String destDirectory, @dl.d yh.l<? super Integer, b2> updateProgress) throws IOException {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{zipFilePath, destDirectory, updateProgress}, this, changeQuickRedirect, false, bb.c.f.O1, new Class[]{File.class, String.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(zipFilePath, "zipFilePath");
        f0.p(destDirectory, "destDirectory");
        f0.p(updateProgress, "updateProgress");
        File file = new File(destDirectory);
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipFile zipFile = new ZipFile(zipFilePath);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            f0.o(enumerationEntries, "entries(...)");
            ArrayList list = Collections.list(enumerationEntries);
            f0.o(list, "list(...)");
            int size = list.size();
            Enumeration<? extends ZipEntry> enumerationEntries2 = zipFile.entries();
            f0.o(enumerationEntries2, "entries(...)");
            for (ZipEntry zipEntry : SequencesKt__SequencesKt.e(kotlin.collections.u.c0(enumerationEntries2))) {
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                try {
                    String str = destDirectory + zipEntry.getName();
                    if (zipEntry.isDirectory()) {
                        new File(str).mkdir();
                    } else {
                        try {
                            r rVar = f68262a;
                            File file2 = new File(rVar.b(str));
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            f0.m(inputStream);
                            rVar.a(inputStream, str);
                        } catch (Throwable th2) {
                            com.max.heybox.hblog.g.f74531b.v("unzip path:" + str + "  error: " + th2.getMessage());
                        }
                    }
                    i10++;
                    updateProgress.invoke(Integer.valueOf((int) ((((double) i10) / ((double) size)) * ((double) 100))));
                    b2 b2Var = b2.f124493a;
                    kotlin.io.b.a(inputStream, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        kotlin.io.b.a(inputStream, th3);
                        throw th4;
                    }
                }
            }
            b2 b2Var2 = b2.f124493a;
            kotlin.io.b.a(zipFile, null);
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                kotlin.io.b.a(zipFile, th5);
                throw th6;
            }
        }
    }
}
