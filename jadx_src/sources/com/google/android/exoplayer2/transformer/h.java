package com.google.android.exoplayer2.transformer;

import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.z;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: SefSlowMotionVideoSampleTransformer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @j1
    static final int f50228j = 30;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f50229k = 30;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f50230l = z.f51618b.length;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f50231m = 14;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f50232a = new byte[f50230l];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final SlowMotionData f50233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Iterator<SlowMotionData.Segment> f50234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f50235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private b f50238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private b f50239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50240i;

    /* JADX INFO: compiled from: SefSlowMotionVideoSampleTransformer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f50241a = -3.4028235E38f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50242b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50243c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public SlowMotionData f50244d;
    }

    /* JADX INFO: compiled from: SefSlowMotionVideoSampleTransformer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f50246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f50248d;

        public b(SlowMotionData.Segment segment, int i10, int i11) {
            this.f50245a = u0.U0(segment.f46964b);
            this.f50246b = u0.U0(segment.f46965c);
            int i12 = segment.f46966d;
            this.f50247c = i12;
            this.f50248d = a(i12, i10, i11);
        }

        private static int a(int i10, int i11, int i12) {
            for (int i13 = i10; i13 > 0; i13 >>= 1) {
                if ((i13 & 1) == 1) {
                    boolean z10 = (i13 >> 1) == 0;
                    StringBuilder sb2 = new StringBuilder(34);
                    sb2.append("Invalid speed divisor: ");
                    sb2.append(i10);
                    com.google.android.exoplayer2.util.a.j(z10, sb2.toString());
                    break;
                }
                i12++;
            }
            return Math.min(i12, i11);
        }
    }

    public h(a2 a2Var) {
        a aVarD = d(a2Var.f43591k);
        SlowMotionData slowMotionData = aVarD.f50244d;
        this.f50233b = slowMotionData;
        Iterator<SlowMotionData.Segment> it = (slowMotionData != null ? slowMotionData.f46962b : ImmutableList.B()).iterator();
        this.f50234c = it;
        this.f50235d = aVarD.f50241a;
        int i10 = aVarD.f50242b;
        this.f50236e = i10;
        int i11 = aVarD.f50243c;
        this.f50237f = i11;
        this.f50239h = it.hasNext() ? new b(it.next(), i10, i11) : null;
        if (slowMotionData != null) {
            boolean zEquals = "video/avc".equals(a2Var.f43593m);
            String strValueOf = String.valueOf(a2Var.f43593m);
            com.google.android.exoplayer2.util.a.b(zEquals, strValueOf.length() != 0 ? "Unsupported MIME type for SEF slow motion video track: ".concat(strValueOf) : new String("Unsupported MIME type for SEF slow motion video track: "));
        }
    }

    private void b() {
        if (this.f50238g != null) {
            e();
        }
        this.f50238g = this.f50239h;
        this.f50239h = this.f50234c.hasNext() ? new b(this.f50234c.next(), this.f50236e, this.f50237f) : null;
    }

    private static a d(@p0 Metadata metadata) {
        a aVar = new a();
        if (metadata == null) {
            return aVar;
        }
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof SmtaMetadataEntry) {
                SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) entryC;
                aVar.f50241a = smtaMetadataEntry.f46967b;
                aVar.f50242b = smtaMetadataEntry.f46968c - 1;
            } else if (entryC instanceof SlowMotionData) {
                aVar.f50244d = (SlowMotionData) entryC;
            }
        }
        if (aVar.f50244d == null) {
            return aVar;
        }
        com.google.android.exoplayer2.util.a.j(aVar.f50242b != -1, "SVC temporal layer count not found.");
        com.google.android.exoplayer2.util.a.j(aVar.f50241a != -3.4028235E38f, "Capture frame rate not found.");
        float f10 = aVar.f50241a;
        boolean z10 = f10 % 1.0f == 0.0f && f10 % 30.0f == 0.0f;
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Invalid capture frame rate: ");
        sb2.append(f10);
        com.google.android.exoplayer2.util.a.j(z10, sb2.toString());
        int i11 = ((int) aVar.f50241a) / 30;
        for (int i12 = aVar.f50242b; i12 >= 0; i12--) {
            if ((i11 & 1) == 1) {
                boolean z11 = (i11 >> 1) == 0;
                float f11 = aVar.f50241a;
                StringBuilder sb3 = new StringBuilder(84);
                sb3.append("Could not compute normal speed max SVC layer for capture frame rate  ");
                sb3.append(f11);
                com.google.android.exoplayer2.util.a.j(z11, sb3.toString());
                aVar.f50243c = i12;
                break;
            }
            i11 >>= 1;
        }
        return aVar;
    }

    @mk.m({"currentSegmentInfo"})
    private void e() {
        long j10 = this.f50240i;
        b bVar = this.f50238g;
        this.f50240i = j10 + ((bVar.f50246b - bVar.f50245a) * ((long) (bVar.f50247c - 1)));
        this.f50238g = null;
    }

    private boolean g(int i10, long j10) {
        int i11;
        b bVar = this.f50239h;
        if (bVar != null && i10 < (i11 = bVar.f50248d)) {
            long j11 = ((bVar.f50245a - j10) * 30) / 1000000;
            float f10 = (-(1 << (this.f50236e - i11))) + 0.45f;
            for (int i12 = 1; i12 < this.f50239h.f50248d && j11 < (1 << (this.f50236e - i12)) + f10; i12++) {
                if (i10 <= i12) {
                    return true;
                }
            }
        }
        return false;
    }

    private void h(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        while (true) {
            int iRemaining = byteBuffer.remaining();
            int i10 = f50230l;
            if (iRemaining < i10) {
                throw new IllegalStateException("Could not find NAL unit start code.");
            }
            byteBuffer.get(this.f50232a, 0, i10);
            if (Arrays.equals(this.f50232a, z.f51618b)) {
                byteBuffer.position(iPosition);
                return;
            } else {
                iPosition++;
                byteBuffer.position(iPosition);
            }
        }
    }

    @Override // com.google.android.exoplayer2.transformer.g
    public void a(DecoderInputBuffer decoderInputBuffer) {
        if (this.f50233b == null) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) u0.k(decoderInputBuffer.f44488e);
        byteBuffer.position(byteBuffer.position() + f50230l);
        boolean z10 = false;
        byteBuffer.get(this.f50232a, 0, 4);
        byte[] bArr = this.f50232a;
        int i10 = bArr[0] & 31;
        boolean z11 = ((bArr[1] & 255) >> 7) == 1;
        if (i10 == 14 && z11) {
            z10 = true;
        }
        com.google.android.exoplayer2.util.a.j(z10, "Missing SVC extension prefix NAL unit.");
        if (!f((this.f50232a[3] & 255) >> 5, decoderInputBuffer.f44490g)) {
            decoderInputBuffer.f44488e = null;
        } else {
            decoderInputBuffer.f44490g = c(decoderInputBuffer.f44490g);
            h(byteBuffer);
        }
    }

    @j1
    long c(long j10) {
        long j11 = this.f50240i + j10;
        b bVar = this.f50238g;
        if (bVar != null) {
            j11 += (j10 - bVar.f50245a) * ((long) (bVar.f50247c - 1));
        }
        return Math.round((j11 * 30) / this.f50235d);
    }

    @j1
    boolean f(int i10, long j10) {
        b bVar;
        while (true) {
            bVar = this.f50239h;
            if (bVar == null || j10 < bVar.f50246b) {
                break;
            }
            b();
        }
        if (bVar == null || j10 < bVar.f50245a) {
            b bVar2 = this.f50238g;
            if (bVar2 != null && j10 >= bVar2.f50246b) {
                e();
            }
        } else {
            b();
        }
        b bVar3 = this.f50238g;
        return i10 <= (bVar3 != null ? bVar3.f50248d : this.f50237f) || g(i10, j10);
    }
}
