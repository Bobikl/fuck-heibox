package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: TypedBundle.java */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f17842m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f17843n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f17844o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f17845p = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f17846a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f17847b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17848c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f17849d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float[] f17850e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f17851f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f17852g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f17853h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f17854i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int[] f17855j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean[] f17856k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f17857l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f17851f;
        int[] iArr = this.f17849d;
        if (i11 >= iArr.length) {
            this.f17849d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17850e;
            this.f17850e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17849d;
        int i12 = this.f17851f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f17850e;
        this.f17851f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f17848c;
        int[] iArr = this.f17846a;
        if (i12 >= iArr.length) {
            this.f17846a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f17847b;
            this.f17847b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f17846a;
        int i13 = this.f17848c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f17847b;
        this.f17848c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f17854i;
        int[] iArr = this.f17852g;
        if (i11 >= iArr.length) {
            this.f17852g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f17853h;
            this.f17853h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f17852g;
        int i12 = this.f17854i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f17853h;
        this.f17854i = i12 + 1;
        strArr2[i12] = str;
    }

    public void d(int i10, boolean z10) {
        int i11 = this.f17857l;
        int[] iArr = this.f17855j;
        if (i11 >= iArr.length) {
            this.f17855j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f17856k;
            this.f17856k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f17855j;
        int i12 = this.f17857l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f17856k;
        this.f17857l = i12 + 1;
        zArr2[i12] = z10;
    }

    public void e(int i10, String str) {
        if (str != null) {
            c(i10, str);
        }
    }

    public void f(u uVar) {
        for (int i10 = 0; i10 < this.f17848c; i10++) {
            uVar.b(this.f17846a[i10], this.f17847b[i10]);
        }
        for (int i11 = 0; i11 < this.f17851f; i11++) {
            uVar.a(this.f17849d[i11], this.f17850e[i11]);
        }
        for (int i12 = 0; i12 < this.f17854i; i12++) {
            uVar.c(this.f17852g[i12], this.f17853h[i12]);
        }
        for (int i13 = 0; i13 < this.f17857l; i13++) {
            uVar.d(this.f17855j[i13], this.f17856k[i13]);
        }
    }

    public void g(w wVar) {
        for (int i10 = 0; i10 < this.f17848c; i10++) {
            wVar.a(this.f17846a[i10], this.f17847b[i10]);
        }
        for (int i11 = 0; i11 < this.f17851f; i11++) {
            wVar.b(this.f17849d[i11], this.f17850e[i11]);
        }
        for (int i12 = 0; i12 < this.f17854i; i12++) {
            wVar.d(this.f17852g[i12], this.f17853h[i12]);
        }
        for (int i13 = 0; i13 < this.f17857l; i13++) {
            wVar.c(this.f17855j[i13], this.f17856k[i13]);
        }
    }

    public void h() {
        this.f17857l = 0;
        this.f17854i = 0;
        this.f17851f = 0;
        this.f17848c = 0;
    }

    public int i(int i10) {
        for (int i11 = 0; i11 < this.f17848c; i11++) {
            if (this.f17846a[i11] == i10) {
                return this.f17847b[i11];
            }
        }
        return -1;
    }
}
