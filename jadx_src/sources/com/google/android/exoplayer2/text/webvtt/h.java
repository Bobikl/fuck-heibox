package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.e0;
import java.util.ArrayList;

/* JADX INFO: compiled from: WebvttDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends com.google.android.exoplayer2.text.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f49994q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f49995r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f49996s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f49997t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f49998u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f49999v = "NOTE";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f50000w = "STYLE";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0 f50001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f50002p;

    public h() {
        super("WebvttDecoder");
        this.f50001o = new e0();
        this.f50002p = new c();
    }

    private static int A(e0 e0Var) {
        int iE = 0;
        int i10 = -1;
        while (i10 == -1) {
            iE = e0Var.e();
            String strQ = e0Var.q();
            if (strQ == null) {
                i10 = 0;
            } else if (f50000w.equals(strQ)) {
                i10 = 2;
            } else {
                i10 = strQ.startsWith(f49999v) ? 1 : 3;
            }
        }
        e0Var.S(iE);
        return i10;
    }

    private static void B(e0 e0Var) {
        while (!TextUtils.isEmpty(e0Var.q())) {
        }
    }

    @Override // com.google.android.exoplayer2.text.f
    protected com.google.android.exoplayer2.text.g y(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        e eVarM;
        this.f50001o.Q(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f50001o);
            while (!TextUtils.isEmpty(this.f50001o.q())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iA = A(this.f50001o);
                if (iA == 0) {
                    return new k(arrayList2);
                }
                if (iA == 1) {
                    B(this.f50001o);
                } else if (iA == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f50001o.q();
                    arrayList.addAll(this.f50002p.d(this.f50001o));
                } else if (iA == 3 && (eVarM = f.m(this.f50001o, arrayList)) != null) {
                    arrayList2.add(eVarM);
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }
}
