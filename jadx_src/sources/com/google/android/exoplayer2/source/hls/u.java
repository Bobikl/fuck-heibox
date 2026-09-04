package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.y;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: MediaParserHlsMediaChunkExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(30)
public final class u implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f48402h = new h() { // from class: com.google.android.exoplayer2.source.hls.t
        @Override // com.google.android.exoplayer2.source.hls.h
        public final k a(Uri uri, a2 a2Var, List list, n0 n0Var, Map map, com.google.android.exoplayer2.extractor.l lVar) {
            return u.i(uri, a2Var, list, n0Var, map, lVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.mediaparser.h f48403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.mediaparser.a f48404b = new com.google.android.exoplayer2.source.mediaparser.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaParser f48405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f48406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableList<MediaFormat> f48408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48409g;

    /* JADX INFO: compiled from: MediaParserHlsMediaChunkExtractor.java */
    public static final class b implements MediaParser.SeekableInputReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.l f48410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48411b;

        private b(com.google.android.exoplayer2.extractor.l lVar) {
            this.f48410a = lVar;
        }

        @Override // android.media.MediaParser.InputReader
        public long getLength() {
            return this.f48410a.getLength();
        }

        public long getPosition() {
            return this.f48410a.q();
        }

        @Override // android.media.MediaParser.InputReader
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int iJ = this.f48410a.j(bArr, i10, i11);
            this.f48411b += iJ;
            return iJ;
        }

        public void seekToPosition(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    public u(MediaParser mediaParser, com.google.android.exoplayer2.source.mediaparser.h hVar, a2 a2Var, boolean z10, ImmutableList<MediaFormat> immutableList, int i10) {
        this.f48405c = mediaParser;
        this.f48403a = hVar;
        this.f48407e = z10;
        this.f48408f = immutableList;
        this.f48406d = a2Var;
        this.f48409g = i10;
    }

    @SuppressLint({"WrongConstant"})
    private static MediaParser h(MediaParser.OutputConsumer outputConsumer, a2 a2Var, boolean z10, ImmutableList<MediaFormat> immutableList, String... strArr) {
        MediaParser mediaParserCreateByName = strArr.length == 1 ? MediaParser.createByName(strArr[0], outputConsumer) : MediaParser.create(outputConsumer, strArr);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48558g, immutableList);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48557f, Boolean.valueOf(z10));
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48552a, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48554c, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.b.f48559h, bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = a2Var.f43590j;
        if (!TextUtils.isEmpty(str)) {
            if (!y.A.equals(y.c(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!"video/avc".equals(y.o(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        return mediaParserCreateByName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k i(Uri uri, a2 a2Var, List list, n0 n0Var, Map map, com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        List listB = list;
        if (com.google.android.exoplayer2.util.n.a(a2Var.f43593m) == 13) {
            return new c(new w(a2Var.f43584d, n0Var), a2Var, n0Var);
        }
        boolean z10 = listB != null;
        ImmutableList.a aVarQ = ImmutableList.q();
        if (listB != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                aVarQ.a(com.google.android.exoplayer2.source.mediaparser.b.a((a2) list.get(i10)));
            }
        } else {
            aVarQ.a(com.google.android.exoplayer2.source.mediaparser.b.a(new a2.b().e0(y.f51593q0).E()));
        }
        ImmutableList immutableListE = aVarQ.e();
        com.google.android.exoplayer2.source.mediaparser.h hVar = new com.google.android.exoplayer2.source.mediaparser.h();
        if (listB == null) {
            listB = ImmutableList.B();
        }
        hVar.p(listB);
        hVar.s(n0Var);
        MediaParser mediaParserH = h(hVar, a2Var, z10, immutableListE, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        b bVar = new b(lVar);
        mediaParserH.advance(bVar);
        hVar.r(mediaParserH.getParserName());
        return new u(mediaParserH, hVar, a2Var, z10, immutableListE, bVar.f48411b);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public boolean a(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        lVar.t(this.f48409g);
        this.f48409g = 0;
        this.f48404b.c(lVar, lVar.getLength());
        return this.f48405c.advance(this.f48404b);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f48403a.o(mVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public void c() {
        this.f48405c.seek(MediaParser.SeekPoint.START);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public boolean d() {
        String parserName = this.f48405c.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public boolean e() {
        String parserName = this.f48405c.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public k f() {
        com.google.android.exoplayer2.util.a.i(!d());
        return new u(h(this.f48403a, this.f48406d, this.f48407e, this.f48408f, this.f48405c.getParserName()), this.f48403a, this.f48406d, this.f48407e, this.f48408f, 0);
    }
}
