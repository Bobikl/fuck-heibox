package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.z;

/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends TagPayloadReader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f44977h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f44978i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44979j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44980k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f44981l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f44982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f44983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44987g;

    public e(com.google.android.exoplayer2.extractor.e0 e0Var) {
        super(e0Var);
        this.f44982b = new e0(z.f51618b);
        this.f44983c = new e0(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(e0 e0Var) throws TagPayloadReader.UnsupportedFormatException {
        int iG = e0Var.G();
        int i10 = (iG >> 4) & 15;
        int i11 = iG & 15;
        if (i11 == 7) {
            this.f44987g = i10;
            return i10 != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i11);
        throw new TagPayloadReader.UnsupportedFormatException(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(e0 e0Var, long j10) throws ParserException {
        int iG = e0Var.G();
        long jP = j10 + (((long) e0Var.p()) * 1000);
        if (iG == 0 && !this.f44985e) {
            e0 e0Var2 = new e0(new byte[e0Var.a()]);
            e0Var.k(e0Var2.d(), 0, e0Var.a());
            com.google.android.exoplayer2.video.a aVarB = com.google.android.exoplayer2.video.a.b(e0Var2);
            this.f44984d = aVarB.f51697b;
            this.f44927a.d(new a2.b().e0("video/avc").I(aVarB.f51701f).j0(aVarB.f51698c).Q(aVarB.f51699d).a0(aVarB.f51700e).T(aVarB.f51696a).E());
            this.f44985e = true;
            return false;
        }
        if (iG != 1 || !this.f44985e) {
            return false;
        }
        int i10 = this.f44987g == 1 ? 1 : 0;
        if (!this.f44986f && i10 == 0) {
            return false;
        }
        byte[] bArrD = this.f44983c.d();
        bArrD[0] = 0;
        bArrD[1] = 0;
        bArrD[2] = 0;
        int i11 = 4 - this.f44984d;
        int i12 = 0;
        while (e0Var.a() > 0) {
            e0Var.k(this.f44983c.d(), i11, this.f44984d);
            this.f44983c.S(0);
            int iK = this.f44983c.K();
            this.f44982b.S(0);
            this.f44927a.c(this.f44982b, 4);
            this.f44927a.c(e0Var, iK);
            i12 = i12 + 4 + iK;
        }
        this.f44927a.e(jP, i10, i12, 0, null);
        this.f44986f = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void d() {
        this.f44986f = false;
    }
}
