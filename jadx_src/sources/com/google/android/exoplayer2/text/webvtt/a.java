package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Mp4WebvttDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends com.google.android.exoplayer2.text.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f49890p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f49891q = 1885436268;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f49892r = 1937011815;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f49893s = 1987343459;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0 f49894o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f49894o = new e0();
    }

    private static com.google.android.exoplayer2.text.b A(e0 e0Var, int i10) throws SubtitleDecoderException {
        CharSequence charSequenceQ = null;
        com.google.android.exoplayer2.text.b.c cVarO = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iO = e0Var.o();
            int iO2 = e0Var.o();
            int i11 = iO - 8;
            String strJ = u0.J(e0Var.d(), e0Var.e(), i11);
            e0Var.T(i11);
            i10 = (i10 - 8) - i11;
            if (iO2 == f49892r) {
                cVarO = f.o(strJ);
            } else if (iO2 == f49891q) {
                charSequenceQ = f.q(null, strJ.trim(), Collections.emptyList());
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return cVarO != null ? cVarO.A(charSequenceQ).a() : f.l(charSequenceQ);
    }

    @Override // com.google.android.exoplayer2.text.f
    protected com.google.android.exoplayer2.text.g y(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f49894o.Q(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f49894o.a() > 0) {
            if (this.f49894o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iO = this.f49894o.o();
            if (this.f49894o.o() == f49893s) {
                arrayList.add(A(this.f49894o, iO - 8));
            } else {
                this.f49894o.T(iO - 8);
            }
        }
        return new b(arrayList);
    }
}
