package com.google.android.exoplayer2.offline;

import androidx.annotation.k1;
import androidx.annotation.p0;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: ActionFileUpgradeUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: compiled from: ActionFileUpgradeUtil.java */
    public interface a {
        String a(DownloadRequest downloadRequest);
    }

    private b() {
    }

    static void a(DownloadRequest downloadRequest, c cVar, boolean z10, long j10) throws IOException {
        e eVar;
        e eVarD = cVar.d(downloadRequest.f47094b);
        if (eVarD != null) {
            eVar = r.r(eVarD, downloadRequest, eVarD.f47240f, j10);
        } else {
            eVar = new e(downloadRequest, z10 ? 3 : 0, j10, j10, -1L, 0, 0);
        }
        cVar.e(eVar);
    }

    @k1
    public static void b(File file, @p0 a aVar, c cVar, boolean z10, boolean z11) throws IOException {
        com.google.android.exoplayer2.offline.a aVar2 = new com.google.android.exoplayer2.offline.a(file);
        if (aVar2.b()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (DownloadRequest downloadRequestA : aVar2.e()) {
                    if (aVar != null) {
                        downloadRequestA = downloadRequestA.a(aVar.a(downloadRequestA));
                    }
                    a(downloadRequestA, cVar, z11, jCurrentTimeMillis);
                }
                aVar2.a();
            } catch (Throwable th2) {
                if (z10) {
                    aVar2.a();
                }
                throw th2;
            }
        }
    }
}
