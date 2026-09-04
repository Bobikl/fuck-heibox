package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.p0;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.a0;
import com.google.android.exoplayer2.upstream.i0;
import java.util.List;

/* JADX INFO: compiled from: FilteringHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f48290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<StreamKey> f48291b;

    public e(i iVar, List<StreamKey> list) {
        this.f48290a = iVar;
        this.f48291b = list;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public i0.a<h> a(f fVar, @p0 g gVar) {
        return new a0(this.f48290a.a(fVar, gVar), this.f48291b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public i0.a<h> b() {
        return new a0(this.f48290a.b(), this.f48291b);
    }
}
