package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import androidx.profileinstaller.f;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.d0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.g;
import com.google.android.exoplayer2.source.hls.playlist.h;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: HlsDownloader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends d0<h> {
    public a(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar) {
        this(i2Var, dVar, new f());
    }

    public a(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        this(i2Var, new HlsPlaylistParser(), dVar, executor);
    }

    public a(i2 i2Var, i0.a<h> aVar, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        super(i2Var, aVar, dVar, executor);
    }

    private void l(List<Uri> list, List<r> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list2.add(d0.f(list.get(i10)));
        }
    }

    private void m(g gVar, g.e eVar, HashSet<Uri> hashSet, ArrayList<d0.c> arrayList) {
        String str = gVar.f48361a;
        long j10 = gVar.f48323h + eVar.f48349f;
        String str2 = eVar.f48351h;
        if (str2 != null) {
            Uri uriF = q0.f(str, str2);
            if (hashSet.add(uriF)) {
                arrayList.add(new d0.c(j10, d0.f(uriF)));
            }
        }
        arrayList.add(new d0.c(j10, new r(q0.f(str, eVar.f48345b), eVar.f48353j, eVar.f48354k)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.d0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<d0.c> h(o oVar, h hVar, boolean z10) throws InterruptedException, IOException {
        ArrayList<r> arrayList = new ArrayList();
        if (hVar instanceof com.google.android.exoplayer2.source.hls.playlist.f) {
            l(((com.google.android.exoplayer2.source.hls.playlist.f) hVar).f48296d, arrayList);
        } else {
            arrayList.add(d0.f(Uri.parse(hVar.f48361a)));
        }
        ArrayList<d0.c> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        for (r rVar : arrayList) {
            arrayList2.add(new d0.c(0L, rVar));
            try {
                g gVar = (g) g(oVar, rVar, z10);
                g.e eVar = null;
                List<g.e> list = gVar.f48333r;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    g.e eVar2 = list.get(i10);
                    g.e eVar3 = eVar2.f48346c;
                    if (eVar3 != null && eVar3 != eVar) {
                        m(gVar, eVar3, hashSet, arrayList2);
                        eVar = eVar3;
                    }
                    m(gVar, eVar2, hashSet, arrayList2);
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
        return arrayList2;
    }
}
