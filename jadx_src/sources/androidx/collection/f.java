package androidx.collection;

/* JADX INFO: compiled from: CircularArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
public final class f<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private E[] f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3590d;

    @xh.i
    public f() {
        this(0, 1, null);
    }

    @xh.i
    public f(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (!(i10 <= 1073741824)) {
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f3590d = i10 - 1;
        this.f3587a = (E[]) new Object[i10];
    }

    public /* synthetic */ f(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    private final void d() {
        E[] eArr = this.f3587a;
        int length = eArr.length;
        int i10 = this.f3588b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        kotlin.collections.m.c1(eArr, eArr2, 0, i10, length);
        kotlin.collections.m.c1(this.f3587a, eArr2, i11, 0, this.f3588b);
        this.f3587a = eArr2;
        this.f3588b = 0;
        this.f3589c = length;
        this.f3590d = i12 - 1;
    }

    public final void a(E e10) {
        int i10 = (this.f3588b - 1) & this.f3590d;
        this.f3588b = i10;
        this.f3587a[i10] = e10;
        if (i10 == this.f3589c) {
            d();
        }
    }

    public final void b(E e10) {
        E[] eArr = this.f3587a;
        int i10 = this.f3589c;
        eArr[i10] = e10;
        int i11 = this.f3590d & (i10 + 1);
        this.f3589c = i11;
        if (i11 == this.f3588b) {
            d();
        }
    }

    public final void c() {
        l(m());
    }

    public final E e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f3587a[this.f3590d & (this.f3588b + i10)];
        kotlin.jvm.internal.f0.m(e10);
        return e10;
    }

    public final E f() {
        int i10 = this.f3588b;
        if (i10 == this.f3589c) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f3587a[i10];
        kotlin.jvm.internal.f0.m(e10);
        return e10;
    }

    public final E g() {
        int i10 = this.f3588b;
        int i11 = this.f3589c;
        if (i10 == i11) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f3587a[(i11 - 1) & this.f3590d];
        kotlin.jvm.internal.f0.m(e10);
        return e10;
    }

    public final boolean h() {
        return this.f3588b == this.f3589c;
    }

    public final E i() {
        int i10 = this.f3588b;
        if (i10 == this.f3589c) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f3587a;
        E e10 = eArr[i10];
        eArr[i10] = null;
        this.f3588b = (i10 + 1) & this.f3590d;
        return e10;
    }

    public final E j() {
        int i10 = this.f3588b;
        int i11 = this.f3589c;
        if (i10 == i11) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f3590d & (i11 - 1);
        E[] eArr = this.f3587a;
        E e10 = eArr[i12];
        eArr[i12] = null;
        this.f3589c = i12;
        return e10;
    }

    public final void k(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f3589c;
        int i12 = i10 < i11 ? i11 - i10 : 0;
        for (int i13 = i12; i13 < i11; i13++) {
            this.f3587a[i13] = null;
        }
        int i14 = this.f3589c;
        int i15 = i14 - i12;
        int i16 = i10 - i15;
        this.f3589c = i14 - i15;
        if (i16 > 0) {
            int length = this.f3587a.length;
            this.f3589c = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < length; i18++) {
                this.f3587a[i18] = null;
            }
            this.f3589c = i17;
        }
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f3604a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f3587a.length;
        int i11 = this.f3588b;
        if (i10 < length - i11) {
            length = i11 + i10;
        }
        while (i11 < length) {
            this.f3587a[i11] = null;
            i11++;
        }
        int i12 = this.f3588b;
        int i13 = length - i12;
        int i14 = i10 - i13;
        this.f3588b = this.f3590d & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.f3587a[i15] = null;
            }
            this.f3588b = i14;
        }
    }

    public final int m() {
        return (this.f3589c - this.f3588b) & this.f3590d;
    }
}
