package androidx.appcompat.widget;

/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f2862i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2863a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2864b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2865c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2866d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2867e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2868f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2869g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2870h = false;

    o0() {
    }

    public int a() {
        return this.f2869g ? this.f2863a : this.f2864b;
    }

    public int b() {
        return this.f2863a;
    }

    public int c() {
        return this.f2864b;
    }

    public int d() {
        return this.f2869g ? this.f2864b : this.f2863a;
    }

    public void e(int i10, int i11) {
        this.f2870h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f2867e = i10;
            this.f2863a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2868f = i11;
            this.f2864b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f2869g) {
            return;
        }
        this.f2869g = z10;
        if (!this.f2870h) {
            this.f2863a = this.f2867e;
            this.f2864b = this.f2868f;
            return;
        }
        if (z10) {
            int i10 = this.f2866d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f2867e;
            }
            this.f2863a = i10;
            int i11 = this.f2865c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f2868f;
            }
            this.f2864b = i11;
            return;
        }
        int i12 = this.f2865c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f2867e;
        }
        this.f2863a = i12;
        int i13 = this.f2866d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f2868f;
        }
        this.f2864b = i13;
    }

    public void g(int i10, int i11) {
        this.f2865c = i10;
        this.f2866d = i11;
        this.f2870h = true;
        if (this.f2869g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f2863a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f2864b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f2863a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2864b = i11;
        }
    }
}
