package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.p0;
import com.google.android.exoplayer2.upstream.i0;

/* JADX INFO: compiled from: DefaultHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements i {
    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public i0.a<h> a(f fVar, @p0 g gVar) {
        return new HlsPlaylistParser(fVar, gVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public i0.a<h> b() {
        return new HlsPlaylistParser();
    }
}
