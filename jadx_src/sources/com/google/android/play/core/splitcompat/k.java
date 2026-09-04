package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f56212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f56213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ZipFile f56214c;

    k(o oVar, Set set, u uVar, ZipFile zipFile) {
        this.f56212a = set;
        this.f56213b = uVar;
        this.f56214c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.play.core.splitcompat.m
    public final void a(n nVar, File file, boolean z10) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f56212a.add(file);
        if (z10) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f56213b.b(), nVar.f56215a, this.f56213b.a().getAbsolutePath(), nVar.f56216b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f56214c;
        ZipEntry zipEntry = nVar.f56216b;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f.m(file);
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th5;
        }
    }
}
