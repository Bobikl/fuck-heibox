package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f41494a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DownsampleStrategy f41495b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DownsampleStrategy f41496c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DownsampleStrategy f41497d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DownsampleStrategy f41498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DownsampleStrategy f41499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DownsampleStrategy f41500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<DownsampleStrategy> f41501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f41502i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    public static class a extends DownsampleStrategy {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class b extends DownsampleStrategy {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class c extends DownsampleStrategy {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f41496c.a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.f41496c.b(i10, i11, i12, i13));
        }
    }

    public static class d extends DownsampleStrategy {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    public static class e extends DownsampleStrategy {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f41502i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f41502i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class f extends DownsampleStrategy {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        d dVar = new d();
        f41498e = dVar;
        f41499f = new f();
        f41500g = dVar;
        f41501h = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f41502i = true;
    }

    public abstract SampleSizeRounding a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
