package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class XorWowRandom extends Random implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final a f125036j = new a(null);

    @Deprecated
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f125037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f125038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f125039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f125040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f125041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f125042i;

    /* JADX INFO: compiled from: XorWowRandom.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public XorWowRandom(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }

    public XorWowRandom(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f125037d = i10;
        this.f125038e = i11;
        this.f125039f = i12;
        this.f125040g = i13;
        this.f125041h = i14;
        this.f125042i = i15;
        int i16 = i10 | i11 | i12 | i13 | i14;
        if (!(i16 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i17 = 0; i17 < 64; i17++) {
            l();
        }
    }

    @Override // kotlin.random.Random
    public int b(int i10) {
        return d.j(l(), i10);
    }

    @Override // kotlin.random.Random
    public int l() {
        int i10 = this.f125037d;
        int i11 = i10 ^ (i10 >>> 2);
        this.f125037d = this.f125038e;
        this.f125038e = this.f125039f;
        this.f125039f = this.f125040g;
        int i12 = this.f125041h;
        this.f125040g = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f125041h = i13;
        int i14 = this.f125042i + 362437;
        this.f125042i = i14;
        return i13 + i14;
    }
}
