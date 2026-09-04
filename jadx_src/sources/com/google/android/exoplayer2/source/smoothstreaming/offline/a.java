package com.google.android.exoplayer2.source.smoothstreaming.offline;

import androidx.profileinstaller.f;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.d0;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SsDownloader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends d0<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> {
    public a(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar) {
        this(i2Var, dVar, new f());
    }

    public a(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        this(i2Var.c().K(u0.G(((i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c)).f46345a)).a(), new SsManifestParser(), dVar, executor);
    }

    public a(i2 i2Var, i0.a<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> aVar, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        super(i2Var, aVar, dVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.d0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<d0.c> h(o oVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar : aVar.f49140f) {
            for (int i10 = 0; i10 < bVar.f49159j.length; i10++) {
                for (int i11 = 0; i11 < bVar.f49160k; i11++) {
                    arrayList.add(new d0.c(bVar.e(i11), new r(bVar.a(i10, i11))));
                }
            }
        }
        return arrayList;
    }
}
