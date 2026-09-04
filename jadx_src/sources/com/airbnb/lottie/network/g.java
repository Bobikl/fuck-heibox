package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.airbnb.lottie.p;
import com.tencent.qcloud.core.http.HttpConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final f f37648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final e f37649b;

    public g(@n0 f fVar, @n0 e eVar) {
        this.f37648a = fVar;
        this.f37649b = eVar;
    }

    @k1
    @p0
    private com.airbnb.lottie.g a(@n0 String str, @p0 String str2) {
        Pair<FileExtension, InputStream> pairB;
        if (str2 == null || (pairB = this.f37648a.b(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairB.first;
        InputStream inputStream = (InputStream) pairB.second;
        p<com.airbnb.lottie.g> pVarB = fileExtension == FileExtension.ZIP ? com.airbnb.lottie.h.B(new ZipInputStream(inputStream), str) : com.airbnb.lottie.h.k(inputStream, str);
        if (pVarB.b() != null) {
            return pVarB.b();
        }
        return null;
    }

    @k1
    @n0
    private p<com.airbnb.lottie.g> b(@n0 String str, @p0 String str2) {
        com.airbnb.lottie.utils.f.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                c cVarA = this.f37649b.a(str);
                if (!cVarA.c1()) {
                    p<com.airbnb.lottie.g> pVar = new p<>(new IllegalArgumentException(cVarA.h()));
                    try {
                        cVarA.close();
                    } catch (IOException e10) {
                        com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e10);
                    }
                    return pVar;
                }
                p<com.airbnb.lottie.g> pVarD = d(str, cVarA.V0(), cVarA.j(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(pVarD.b() != null);
                com.airbnb.lottie.utils.f.a(sb2.toString());
                try {
                    cVarA.close();
                } catch (IOException e11) {
                    com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e11);
                }
                return pVarD;
            } catch (Exception e12) {
                p<com.airbnb.lottie.g> pVar2 = new p<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e13);
                    }
                }
                return pVar2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e14) {
                    com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e14);
                }
            }
            throw th2;
        }
    }

    @n0
    private p<com.airbnb.lottie.g> d(@n0 String str, @n0 InputStream inputStream, @p0 String str2, @p0 String str3) throws IOException {
        FileExtension fileExtension;
        p<com.airbnb.lottie.g> pVarF;
        if (str2 == null) {
            str2 = HttpConstants.ContentType.JSON;
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.f.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            pVarF = f(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.f.a("Received json response.");
            fileExtension = FileExtension.JSON;
            pVarF = e(str, inputStream, str3);
        }
        if (str3 != null && pVarF.b() != null) {
            this.f37648a.f(str, fileExtension);
        }
        return pVarF;
    }

    @n0
    private p<com.airbnb.lottie.g> e(@n0 String str, @n0 InputStream inputStream, @p0 String str2) throws IOException {
        return str2 == null ? com.airbnb.lottie.h.k(inputStream, null) : com.airbnb.lottie.h.k(new FileInputStream(new File(this.f37648a.g(str, inputStream, FileExtension.JSON).getAbsolutePath())), str);
    }

    @n0
    private p<com.airbnb.lottie.g> f(@n0 String str, @n0 InputStream inputStream, @p0 String str2) throws IOException {
        return str2 == null ? com.airbnb.lottie.h.B(new ZipInputStream(inputStream), null) : com.airbnb.lottie.h.B(new ZipInputStream(new FileInputStream(this.f37648a.g(str, inputStream, FileExtension.ZIP))), str);
    }

    @k1
    @n0
    public p<com.airbnb.lottie.g> c(@n0 String str, @p0 String str2) {
        com.airbnb.lottie.g gVarA = a(str, str2);
        if (gVarA != null) {
            return new p<>(gVarA);
        }
        com.airbnb.lottie.utils.f.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
