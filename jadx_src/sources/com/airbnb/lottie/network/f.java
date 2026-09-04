package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: NetworkCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final d f37647a;

    public f(@n0 d dVar) {
        this.f37647a = dVar;
    }

    private static String c(String str, FileExtension fileExtension, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? fileExtension.tempExtension() : fileExtension.extension);
        return sb2.toString();
    }

    @p0
    private File d(String str) throws FileNotFoundException {
        File file = new File(e(), c(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), c(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File e() {
        File fileA = this.f37647a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public void a() {
        File fileE = e();
        if (fileE.exists()) {
            File[] fileArrListFiles = fileE.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileE.listFiles()) {
                    file.delete();
                }
            }
            fileE.delete();
        }
    }

    @k1
    @p0
    Pair<FileExtension, InputStream> b(String str) {
        try {
            File fileD = d(str);
            if (fileD == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileD);
            FileExtension fileExtension = fileD.getAbsolutePath().endsWith(DynamicSoManager.f77249d) ? FileExtension.ZIP : FileExtension.JSON;
            com.airbnb.lottie.utils.f.a("Cache hit for " + str + " at " + fileD.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, FileExtension fileExtension) {
        File file = new File(e(), c(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.f.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        com.airbnb.lottie.utils.f.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(e(), c(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }
}
