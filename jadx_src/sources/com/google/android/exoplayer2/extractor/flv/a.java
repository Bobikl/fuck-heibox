package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.util.y;
import java.util.Collections;

/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f44928e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44929f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f44930g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f44931h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f44932i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44933j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f44934k = {bb.c.f.Ak, bb.c.l.Hk, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44937d;

    public a(e0 e0Var) {
        super(e0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(com.google.android.exoplayer2.util.e0 e0Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f44935b) {
            e0Var.T(1);
        } else {
            int iG = e0Var.G();
            int i10 = (iG >> 4) & 15;
            this.f44937d = i10;
            if (i10 == 2) {
                this.f44927a.d(new a2.b().e0("audio/mpeg").H(1).f0(f44934k[(iG >> 2) & 3]).E());
                this.f44936c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f44927a.d(new a2.b().e0(i10 == 7 ? y.J : y.K).H(1).f0(8000).E());
                this.f44936c = true;
            } else if (i10 != 10) {
                int i11 = this.f44937d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i11);
                throw new TagPayloadReader.UnsupportedFormatException(sb2.toString());
            }
            this.f44935b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(com.google.android.exoplayer2.util.e0 e0Var, long j10) throws ParserException {
        if (this.f44937d == 2) {
            int iA = e0Var.a();
            this.f44927a.c(e0Var, iA);
            this.f44927a.e(j10, 1, iA, 0, null);
            return true;
        }
        int iG = e0Var.G();
        if (iG != 0 || this.f44936c) {
            if (this.f44937d == 10 && iG != 1) {
                return false;
            }
            int iA2 = e0Var.a();
            this.f44927a.c(e0Var, iA2);
            this.f44927a.e(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = e0Var.a();
        byte[] bArr = new byte[iA3];
        e0Var.k(bArr, 0, iA3);
        com.google.android.exoplayer2.audio.a.c cVarF = com.google.android.exoplayer2.audio.a.f(bArr);
        this.f44927a.d(new a2.b().e0(y.A).I(cVarF.f44064c).H(cVarF.f44063b).f0(cVarF.f44062a).T(Collections.singletonList(bArr)).E());
        this.f44936c = true;
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void d() {
    }
}
