package androidx.collection;

/* JADX INFO: compiled from: CircularIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private int[] f3594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3597d;

    @xh.i
    public g() {
        this(0, 1, null);
    }

    @xh.i
    public g(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (!(i10 <= 1073741824)) {
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f3597d = i10 - 1;
        this.f3594a = new int[i10];
    }

    public /* synthetic */ g(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    private final void d() {
        int[] iArr = this.f3594a;
        int length = iArr.length;
        int i10 = this.f3595b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        kotlin.collections.m.a1(iArr, iArr2, 0, i10, length);
        kotlin.collections.m.a1(this.f3594a, iArr2, i11, 0, this.f3595b);
        this.f3594a = iArr2;
        this.f3595b = 0;
        this.f3596c = length;
        this.f3597d = i12 - 1;
    }

    public final void a(int i10) {
        int i11 = (this.f3595b - 1) & this.f3597d;
        this.f3595b = i11;
        this.f3594a[i11] = i10;
        if (i11 == this.f3596c) {
            d();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f3594a;
        int i11 = this.f3596c;
        iArr[i11] = i10;
        int i12 = this.f3597d & (i11 + 1);
        this.f3596c = i12;
        if (i12 == this.f3595b) {
            d();
        }
    }

    public final void c() {
        this.f3596c = this.f3595b;
    }

    public final int e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f3594a[this.f3597d & (this.f3595b + i10)];
    }

    public final int f() {
        int i10 = this.f3595b;
        if (i10 != this.f3596c) {
            return this.f3594a[i10];
        }
        h hVar = h.f3604a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int g() {
        int i10 = this.f3595b;
        int i11 = this.f3596c;
        if (i10 != i11) {
            return this.f3594a[(i11 - 1) & this.f3597d];
        }
        h hVar = h.f3604a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean h() {
        return this.f3595b == this.f3596c;
    }

    public final int i() {
        int i10 = this.f3595b;
        if (i10 == this.f3596c) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f3594a[i10];
        this.f3595b = (i10 + 1) & this.f3597d;
        return i11;
    }

    public final int j() {
        int i10 = this.f3595b;
        int i11 = this.f3596c;
        if (i10 == i11) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f3597d & (i11 - 1);
        int i13 = this.f3594a[i12];
        this.f3596c = i12;
        return i13;
    }

    public final void k(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f3596c = this.f3597d & (this.f3596c - i10);
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f3595b = this.f3597d & (this.f3595b + i10);
    }

    public final int m() {
        return (this.f3596c - this.f3595b) & this.f3597d;
    }
}
