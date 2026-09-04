package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.util.Pair;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.collect.ImmutableList;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: OutputConsumerAdapterV30.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(30)
@SuppressLint({"Override"})
public final class h implements MediaParser.OutputConsumer {
    private static final String A = "chunk-index-long-us-times";
    private static final Pattern B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f48560u = "OutputConsumerAdapterV30";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f48561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f48562w = "track-type-string";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f48563x = "chunk-index-int-sizes";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f48564y = "chunk-index-long-offsets";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f48565z = "chunk-index-long-us-durations";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<e0> f48566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a2> f48567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<MediaCodec.CryptoInfo> f48568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<e0.a> f48569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f48570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f48571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final a2 f48573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f48574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private MediaParser.SeekMap f48575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private MediaParser.SeekMap f48576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private String f48577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.extractor.e f48578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private n0 f48579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<a2> f48580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f48582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f48583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f48584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f48585t;

    /* JADX INFO: compiled from: OutputConsumerAdapterV30.java */
    public static final class b implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public MediaParser.InputReader f48586b;

        private b() {
        }

        @Override // com.google.android.exoplayer2.upstream.k
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            return ((MediaParser.InputReader) u0.k(this.f48586b)).read(bArr, i10, i11);
        }
    }

    /* JADX INFO: compiled from: OutputConsumerAdapterV30.java */
    public static final class c implements b0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MediaParser.SeekMap f48587d;

        public c(MediaParser.SeekMap seekMap) {
            this.f48587d = seekMap;
        }

        private static c0 a(MediaParser.SeekPoint seekPoint) {
            return new c0(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public b0.a d(long j10) {
            Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.f48587d.getSeekPoints(j10);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new b0.a(a((MediaParser.SeekPoint) obj)) : new b0.a(a((MediaParser.SeekPoint) obj), a((MediaParser.SeekPoint) seekPoints.second));
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public boolean e() {
            return this.f48587d.isSeekable();
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public long i() {
            long durationMicros = this.f48587d.getDurationMicros();
            return durationMicros != -2147483648L ? durationMicros : j.f46377b;
        }
    }

    static {
        MediaParser.SeekPoint seekPoint = MediaParser.SeekPoint.START;
        f48561v = Pair.create(seekPoint, seekPoint);
        B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public h() {
        this(null, -2, false);
    }

    public h(@p0 a2 a2Var, int i10, boolean z10) {
        this.f48571f = z10;
        this.f48573h = a2Var;
        this.f48572g = i10;
        this.f48566a = new ArrayList<>();
        this.f48567b = new ArrayList<>();
        this.f48568c = new ArrayList<>();
        this.f48569d = new ArrayList<>();
        this.f48570e = new b();
        this.f48574i = new com.google.android.exoplayer2.extractor.i();
        this.f48582q = j.f46377b;
        this.f48580o = ImmutableList.B();
    }

    private void b(int i10) {
        for (int size = this.f48566a.size(); size <= i10; size++) {
            this.f48566a.add(null);
            this.f48567b.add(null);
            this.f48568c.add(null);
            this.f48569d.add(null);
        }
    }

    private static byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @p0
    private static com.google.android.exoplayer2.video.c e(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] bArrC = byteBuffer != null ? c(byteBuffer) : null;
        int integer = mediaFormat.getInteger("color-transfer", -1);
        int integer2 = mediaFormat.getInteger("color-range", -1);
        int integer3 = mediaFormat.getInteger("color-standard", -1);
        if (bArrC == null && integer == -1 && integer2 == -1 && integer3 == -1) {
            return null;
        }
        return new com.google.android.exoplayer2.video.c(integer3, integer2, integer, bArrC);
    }

    private static int g(MediaFormat mediaFormat, String str, int i10) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i10;
        }
        return 0;
    }

    private static List<byte[]> h(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(c(byteBuffer));
            i10 = i11;
        }
    }

    private static String i(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return "video/mp4";
            case "android.media.mediaparser.OggParser":
                return y.f51565c0;
            case "android.media.mediaparser.TsParser":
                return y.f51588o;
            case "android.media.mediaparser.AdtsParser":
                return y.A;
            case "android.media.mediaparser.WavParser":
                return y.I;
            case "android.media.mediaparser.PsParser":
                return y.f51594r;
            case "android.media.mediaparser.Ac3Parser":
                return y.L;
            case "android.media.mediaparser.AmrParser":
                return "audio/amr";
            case "android.media.mediaparser.FlacParser":
                return y.Z;
            case "android.media.mediaparser.MatroskaParser":
                return y.f51574h;
            case "android.media.mediaparser.Ac4Parser":
                return y.O;
            case "android.media.mediaparser.Mp3Parser":
                return "audio/mpeg";
            case "android.media.mediaparser.FlvParser":
                return y.f51602v;
            default:
                throw new IllegalArgumentException(str.length() != 0 ? "Illegal parser name: ".concat(str) : new String("Illegal parser name: "));
        }
    }

    private static int l(MediaFormat mediaFormat) {
        return g(mediaFormat, "is-forced-subtitle", 2) | g(mediaFormat, "is-autoselect", 4) | 0 | g(mediaFormat, "is-default", 1);
    }

    private void m() {
        if (!this.f48583r || this.f48584s) {
            return;
        }
        int size = this.f48566a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f48566a.get(i10) == null) {
                return;
            }
        }
        this.f48574i.n();
        this.f48584s = true;
    }

    private boolean n(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(f48563x);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) com.google.android.exoplayer2.util.a.g(mediaFormat.getByteBuffer(f48564y))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) com.google.android.exoplayer2.util.a.g(mediaFormat.getByteBuffer(f48565z))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) com.google.android.exoplayer2.util.a.g(mediaFormat.getByteBuffer(A))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        com.google.android.exoplayer2.extractor.e eVar = new com.google.android.exoplayer2.extractor.e(iArr, jArr, jArr2, jArr3);
        this.f48578m = eVar;
        this.f48574i.t(eVar);
        return true;
    }

    @p0
    private e0.a t(int i10, @p0 MediaCodec.CryptoInfo cryptoInfo) {
        int i11;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.f48568c.get(i10) == cryptoInfo) {
            return (e0.a) com.google.android.exoplayer2.util.a.g(this.f48569d.get(i10));
        }
        int i12 = 0;
        try {
            Matcher matcher = B.matcher(cryptoInfo.toString());
            matcher.find();
            int i13 = Integer.parseInt((String) u0.k(matcher.group(1)));
            i11 = Integer.parseInt((String) u0.k(matcher.group(2)));
            i12 = i13;
        } catch (RuntimeException e10) {
            String strValueOf = String.valueOf(cryptoInfo);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 43);
            sb2.append("Unexpected error while parsing CryptoInfo: ");
            sb2.append(strValueOf);
            u.e(f48560u, sb2.toString(), e10);
            i11 = 0;
        }
        e0.a aVar = new e0.a(cryptoInfo.mode, cryptoInfo.key, i12, i11);
        this.f48568c.set(i10, cryptoInfo);
        this.f48569d.set(i10, aVar);
        return aVar;
    }

    @p0
    private static DrmInitData u(@p0 String str, @p0 android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i10 = 0; i10 < schemeInitDataCount; i10++) {
            android.media.DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i10);
            schemeDataArr[i10] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new DrmInitData(str, schemeDataArr);
    }

    private a2 v(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        a2.b bVarF = new a2.b().M(u(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).K(this.f48577l).Z(mediaFormat.getInteger("bitrate", -1)).H(mediaFormat.getInteger("channel-count", -1)).J(e(mediaFormat)).e0(string).I(mediaFormat.getString("codecs-string")).P(mediaFormat.getFloat("frame-rate", -1.0f)).j0(mediaFormat.getInteger("width", -1)).Q(mediaFormat.getInteger("height", -1)).T(h(mediaFormat)).V(mediaFormat.getString(ak.N)).W(mediaFormat.getInteger("max-input-size", -1)).Y(mediaFormat.getInteger("exo-pcm-encoding", -1)).d0(mediaFormat.getInteger("rotation-degrees", 0)).f0(mediaFormat.getInteger("sample-rate", -1)).g0(l(mediaFormat)).N(mediaFormat.getInteger("encoder-delay", 0)).O(mediaFormat.getInteger("encoder-padding", 0)).a0(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).i0(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).F(integer);
        for (int i10 = 0; i10 < this.f48580o.size(); i10++) {
            a2 a2Var = this.f48580o.get(i10);
            if (u0.c(a2Var.f43593m, string) && a2Var.E == integer) {
                bVarF.V(a2Var.f43584d).c0(a2Var.f43586f).g0(a2Var.f43585e).U(a2Var.f43583c).X(a2Var.f43591k);
                break;
            }
        }
        return bVarF.E();
    }

    private static int w(@p0 String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return y.l(str);
        }
    }

    public void a() {
        this.f48585t = true;
    }

    @p0
    public com.google.android.exoplayer2.extractor.e d() {
        return this.f48578m;
    }

    @p0
    public MediaParser.SeekMap f() {
        return this.f48575j;
    }

    @p0
    public a2[] j() {
        if (!this.f48583r) {
            return null;
        }
        a2[] a2VarArr = new a2[this.f48567b.size()];
        for (int i10 = 0; i10 < this.f48567b.size(); i10++) {
            a2VarArr[i10] = (a2) com.google.android.exoplayer2.util.a.g(this.f48567b.get(i10));
        }
        return a2VarArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> k(long j10) {
        MediaParser.SeekMap seekMap = this.f48576k;
        return seekMap != null ? seekMap.getSeekPoints(j10) : f48561v;
    }

    public void o(m mVar) {
        this.f48574i = mVar;
    }

    public void onSampleCompleted(int i10, long j10, int i11, int i12, int i13, @p0 MediaCodec.CryptoInfo cryptoInfo) {
        long j11 = this.f48582q;
        if (j11 == j.f46377b || j10 < j11) {
            n0 n0Var = this.f48579n;
            if (n0Var != null) {
                j10 = n0Var.a(j10);
            }
            ((e0) com.google.android.exoplayer2.util.a.g(this.f48566a.get(i10))).e(j10, i11, i12, i13, t(i10, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i10, MediaParser.InputReader inputReader) throws IOException {
        b(i10);
        this.f48570e.f48586b = inputReader;
        e0 e0VarB = this.f48566a.get(i10);
        if (e0VarB == null) {
            e0VarB = this.f48574i.b(i10, -1);
            this.f48566a.set(i10, e0VarB);
        }
        e0VarB.b(this.f48570e, (int) inputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        b0 cVar;
        if (this.f48571f && this.f48575j == null) {
            this.f48575j = seekMap;
            return;
        }
        this.f48576k = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        m mVar = this.f48574i;
        if (this.f48585t) {
            if (durationMicros == -2147483648L) {
                durationMicros = j.f46377b;
            }
            cVar = new b0.b(durationMicros);
        } else {
            cVar = new c(seekMap);
        }
        mVar.t(cVar);
    }

    public void onTrackCountFound(int i10) {
        this.f48583r = true;
        m();
    }

    public void onTrackDataFound(int i10, MediaParser.TrackData trackData) {
        if (n(trackData.mediaFormat)) {
            return;
        }
        b(i10);
        e0 e0Var = this.f48566a.get(i10);
        if (e0Var == null) {
            String string = trackData.mediaFormat.getString(f48562w);
            int iW = w(string != null ? string : trackData.mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I));
            if (iW == this.f48572g) {
                this.f48581p = i10;
            }
            e0 e0VarB = this.f48574i.b(i10, iW);
            this.f48566a.set(i10, e0VarB);
            if (string != null) {
                return;
            } else {
                e0Var = e0VarB;
            }
        }
        a2 a2VarV = v(trackData);
        a2 a2Var = this.f48573h;
        e0Var.d((a2Var == null || i10 != this.f48581p) ? a2VarV : a2VarV.B(a2Var));
        this.f48567b.set(i10, a2VarV);
        m();
    }

    public void p(List<a2> list) {
        this.f48580o = list;
    }

    public void q(long j10) {
        this.f48582q = j10;
    }

    public void r(String str) {
        this.f48577l = i(str);
    }

    public void s(n0 n0Var) {
        this.f48579n = n0Var;
    }
}
