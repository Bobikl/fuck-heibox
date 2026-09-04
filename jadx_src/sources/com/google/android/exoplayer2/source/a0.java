package com.google.android.exoplayer2.source;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: MediaParserExtractorAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
@androidx.annotation.w0(30)
public final class a0 implements r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0.a f47456e = new r0.a() { // from class: com.google.android.exoplayer2.source.z
        @Override // com.google.android.exoplayer2.source.r0.a
        public final r0 a() {
            return new a0();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.mediaparser.h f47457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.mediaparser.a f47458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaParser f47459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47460d;

    @SuppressLint({"WrongConstant"})
    public a0() {
        com.google.android.exoplayer2.source.mediaparser.h hVar = new com.google.android.exoplayer2.source.mediaparser.h();
        this.f47457a = hVar;
        this.f47458b = new com.google.android.exoplayer2.source.mediaparser.a();
        MediaParser mediaParserCreate = MediaParser.create(hVar, new String[0]);
        this.f47459c = mediaParserCreate;
        Boolean bool = Boolean.TRUE;
        mediaParserCreate.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48554c, bool);
        mediaParserCreate.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48552a, bool);
        mediaParserCreate.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48553b, bool);
        this.f47460d = "android.media.mediaparser.UNKNOWN";
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void a(long j10, long j11) {
        this.f47458b.b(j10);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> pairK = this.f47457a.k(j11);
        MediaParser mediaParser = this.f47459c;
        Object obj = pairK.second;
        mediaParser.seek(((MediaParser.SeekPoint) obj).position == j10 ? (MediaParser.SeekPoint) obj : (MediaParser.SeekPoint) pairK.first);
    }

    @Override // com.google.android.exoplayer2.source.r0
    public int b(com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        boolean zAdvance = this.f47459c.advance(this.f47458b);
        long jA = this.f47458b.a();
        zVar.f46218a = jA;
        if (zAdvance) {
            return jA != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.source.r0
    public long c() {
        return this.f47458b.getPosition();
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void d() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f47460d)) {
            this.f47457a.a();
        }
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void e(com.google.android.exoplayer2.upstream.k kVar, Uri uri, Map<String, List<String>> map, long j10, long j11, com.google.android.exoplayer2.extractor.m mVar) throws IOException {
        this.f47457a.o(mVar);
        this.f47458b.c(kVar, j11);
        this.f47458b.b(j10);
        String parserName = this.f47459c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.f47459c.advance(this.f47458b);
            String parserName2 = this.f47459c.getParserName();
            this.f47460d = parserName2;
            this.f47457a.r(parserName2);
            return;
        }
        if (parserName.equals(this.f47460d)) {
            return;
        }
        String parserName3 = this.f47459c.getParserName();
        this.f47460d = parserName3;
        this.f47457a.r(parserName3);
    }

    @Override // com.google.android.exoplayer2.source.r0
    public void release() {
        this.f47459c.release();
    }
}
