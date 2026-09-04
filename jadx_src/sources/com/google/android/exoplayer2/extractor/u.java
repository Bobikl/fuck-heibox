package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.j0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f46190m = "FlacStreamMetadata";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46191n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f46192o = "=";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f46202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public final a f46203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final Metadata f46204l;

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f46205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f46206b;

        public a(long[] jArr, long[] jArr2) {
            this.f46205a = jArr;
            this.f46206b = jArr2;
        }
    }

    private u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @p0 a aVar, @p0 Metadata metadata) {
        this.f46193a = i10;
        this.f46194b = i11;
        this.f46195c = i12;
        this.f46196d = i13;
        this.f46197e = i14;
        this.f46198f = m(i14);
        this.f46199g = i15;
        this.f46200h = i16;
        this.f46201i = f(i16);
        this.f46202j = j10;
        this.f46203k = aVar;
        this.f46204l = metadata;
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, a(arrayList, arrayList2));
    }

    public u(byte[] bArr, int i10) {
        com.google.android.exoplayer2.util.d0 d0Var = new com.google.android.exoplayer2.util.d0(bArr);
        d0Var.q(i10 * 8);
        this.f46193a = d0Var.h(16);
        this.f46194b = d0Var.h(16);
        this.f46195c = d0Var.h(24);
        this.f46196d = d0Var.h(24);
        int iH = d0Var.h(20);
        this.f46197e = iH;
        this.f46198f = m(iH);
        this.f46199g = d0Var.h(3) + 1;
        int iH2 = d0Var.h(5) + 1;
        this.f46200h = iH2;
        this.f46201i = f(iH2);
        this.f46202j = d0Var.j(36);
        this.f46203k = null;
        this.f46204l = null;
    }

    @p0
    private static Metadata a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrQ1 = u0.q1(str, "=");
            if (strArrQ1.length != 2) {
                String strValueOf = String.valueOf(str);
                com.google.android.exoplayer2.util.u.m(f46190m, strValueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(strValueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(strArrQ1[0], strArrQ1[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static int f(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int m(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case j0.f44139a /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public u b(List<PictureFrame> list) {
        return new u(this.f46193a, this.f46194b, this.f46195c, this.f46196d, this.f46197e, this.f46199g, this.f46200h, this.f46202j, this.f46203k, k(a(Collections.emptyList(), list)));
    }

    public u c(@p0 a aVar) {
        return new u(this.f46193a, this.f46194b, this.f46195c, this.f46196d, this.f46197e, this.f46199g, this.f46200h, this.f46202j, aVar, this.f46204l);
    }

    public u d(List<String> list) {
        return new u(this.f46193a, this.f46194b, this.f46195c, this.f46196d, this.f46197e, this.f46199g, this.f46200h, this.f46202j, this.f46203k, k(a(list, Collections.emptyList())));
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f46196d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f46195c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f46193a;
            j10 = ((((i11 != this.f46194b || i11 <= 0) ? 4096L : i11) * ((long) this.f46199g)) * ((long) this.f46200h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int g() {
        return this.f46200h * this.f46197e * this.f46199g;
    }

    public long h() {
        long j10 = this.f46202j;
        return j10 == 0 ? com.google.android.exoplayer2.j.f46377b : (j10 * 1000000) / ((long) this.f46197e);
    }

    public a2 i(byte[] bArr, @p0 Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f46196d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new a2.b().e0(com.google.android.exoplayer2.util.y.Z).W(i10).H(this.f46199g).f0(this.f46197e).T(Collections.singletonList(bArr)).X(k(metadata)).E();
    }

    public int j() {
        return this.f46194b * this.f46199g * (this.f46200h / 8);
    }

    @p0
    public Metadata k(@p0 Metadata metadata) {
        Metadata metadata2 = this.f46204l;
        return metadata2 == null ? metadata : metadata2.b(metadata);
    }

    public long l(long j10) {
        return u0.t((j10 * ((long) this.f46197e)) / 1000000, 0L, this.f46202j - 1);
    }
}
