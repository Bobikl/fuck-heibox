package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.n0;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f48413j = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f48414k = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f48415l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f48416m = 9;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final String f48417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n0 f48418e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f48420g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48422i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f48419f = new e0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f48421h = new byte[1024];

    public w(@p0 String str, n0 n0Var) {
        this.f48417d = str;
        this.f48418e = n0Var;
    }

    @mk.m({"output"})
    private com.google.android.exoplayer2.extractor.e0 c(long j10) {
        com.google.android.exoplayer2.extractor.e0 e0VarB = this.f48420g.b(0, 3);
        e0VarB.d(new a2.b().e0("text/vtt").V(this.f48417d).i0(j10).E());
        this.f48420g.n();
        return e0VarB;
    }

    @mk.m({"output"})
    private void d() throws ParserException {
        e0 e0Var = new e0(this.f48421h);
        com.google.android.exoplayer2.text.webvtt.i.e(e0Var);
        long jF = 0;
        long jD = 0;
        for (String strQ = e0Var.q(); !TextUtils.isEmpty(strQ); strQ = e0Var.q()) {
            if (strQ.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f48413j.matcher(strQ);
                if (!matcher.find()) {
                    throw ParserException.a(strQ.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strQ) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "), null);
                }
                Matcher matcher2 = f48414k.matcher(strQ);
                if (!matcher2.find()) {
                    throw ParserException.a(strQ.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strQ) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "), null);
                }
                jD = com.google.android.exoplayer2.text.webvtt.i.d((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
                jF = n0.f(Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher2.group(1))));
            }
        }
        Matcher matcherA = com.google.android.exoplayer2.text.webvtt.i.a(e0Var);
        if (matcherA == null) {
            c(0L);
            return;
        }
        long jD2 = com.google.android.exoplayer2.text.webvtt.i.d((String) com.google.android.exoplayer2.util.a.g(matcherA.group(1)));
        long jB = this.f48418e.b(n0.j((jF + jD2) - jD));
        com.google.android.exoplayer2.extractor.e0 e0VarC = c(jB - jD2);
        this.f48419f.Q(this.f48421h, this.f48422i);
        e0VarC.c(this.f48419f, this.f48422i);
        e0VarC.e(jB, 1, this.f48422i, 0, null);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f48420g = mVar;
        mVar.t(new b0.b(com.google.android.exoplayer2.j.f46377b));
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        lVar.n(this.f48421h, 0, 6, false);
        this.f48419f.Q(this.f48421h, 6);
        if (com.google.android.exoplayer2.text.webvtt.i.b(this.f48419f)) {
            return true;
        }
        lVar.n(this.f48421h, 6, 3, false);
        this.f48419f.Q(this.f48421h, 9);
        return com.google.android.exoplayer2.text.webvtt.i.b(this.f48419f);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.g(this.f48420g);
        int length = (int) lVar.getLength();
        int i10 = this.f48422i;
        byte[] bArr = this.f48421h;
        if (i10 == bArr.length) {
            this.f48421h = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f48421h;
        int i11 = this.f48422i;
        int i12 = lVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f48422i + i12;
            this.f48422i = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
