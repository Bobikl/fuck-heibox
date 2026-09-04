package com.google.android.exoplayer2.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MediaParserChunkExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(30)
public final class q implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f47702j = "MediaPrsrChunkExtractor";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g.a f47703k = new g.a() { // from class: com.google.android.exoplayer2.source.chunk.p
        @Override // com.google.android.exoplayer2.source.chunk.g.a
        public final g a(int i10, a2 a2Var, boolean z10, List list, e0 e0Var) {
            return q.j(i10, a2Var, z10, list, e0Var);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.mediaparser.h f47704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.mediaparser.a f47705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MediaParser f47706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f47707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.j f47708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private g.b f47710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private a2[] f47711i;

    /* JADX INFO: compiled from: MediaParserChunkExtractor.java */
    public class b implements com.google.android.exoplayer2.extractor.m {
        private b() {
        }

        @Override // com.google.android.exoplayer2.extractor.m
        public e0 b(int i10, int i11) {
            return q.this.f47710h != null ? q.this.f47710h.b(i10, i11) : q.this.f47708f;
        }

        @Override // com.google.android.exoplayer2.extractor.m
        public void n() {
            q qVar = q.this;
            qVar.f47711i = qVar.f47704b.j();
        }

        @Override // com.google.android.exoplayer2.extractor.m
        public void t(b0 b0Var) {
        }
    }

    @SuppressLint({"WrongConstant"})
    public q(int i10, a2 a2Var, List<a2> list) {
        com.google.android.exoplayer2.source.mediaparser.h hVar = new com.google.android.exoplayer2.source.mediaparser.h(a2Var, i10, true);
        this.f47704b = hVar;
        this.f47705c = new com.google.android.exoplayer2.source.mediaparser.a();
        String str = y.r((String) com.google.android.exoplayer2.util.a.g(a2Var.f43592l)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        hVar.r(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, hVar);
        this.f47706d = mediaParserCreateByName;
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48552a, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48553b, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48554c, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48555d, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48556e, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48557f, bool);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(com.google.android.exoplayer2.source.mediaparser.b.a(list.get(i11)));
        }
        this.f47706d.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48558g, arrayList);
        this.f47704b.p(list);
        this.f47707e = new b();
        this.f47708f = new com.google.android.exoplayer2.extractor.j();
        this.f47709g = com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g j(int i10, a2 a2Var, boolean z10, List list, e0 e0Var) {
        if (!y.s(a2Var.f43592l)) {
            return new q(i10, a2Var, list);
        }
        u.m(f47702j, "Ignoring an unsupported text track.");
        return null;
    }

    private void k() {
        MediaParser.SeekMap seekMapF = this.f47704b.f();
        long j10 = this.f47709g;
        if (j10 == com.google.android.exoplayer2.j.f46377b || seekMapF == null) {
            return;
        }
        this.f47706d.seek((MediaParser.SeekPoint) seekMapF.getSeekPoints(j10).first);
        this.f47709g = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    public boolean a(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        k();
        this.f47705c.c(lVar, lVar.getLength());
        return this.f47706d.advance(this.f47705c);
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    public void c(@p0 g.b bVar, long j10, long j11) {
        this.f47710h = bVar;
        this.f47704b.q(j11);
        this.f47704b.o(this.f47707e);
        this.f47709g = j10;
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    @p0
    public com.google.android.exoplayer2.extractor.e d() {
        return this.f47704b.d();
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    @p0
    public a2[] e() {
        return this.f47711i;
    }

    @Override // com.google.android.exoplayer2.source.chunk.g
    public void release() {
        this.f47706d.release();
    }
}
