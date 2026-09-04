package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: IntIntPair.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
@xh.f
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @xh.e
    public final long f3558a;

    private /* synthetic */ b0(long j10) {
        this.f3558a = j10;
    }

    public static final /* synthetic */ b0 a(long j10) {
        return new b0(j10);
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int c(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }

    public static long d(int i10, int i11) {
        return e((((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32));
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).m();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    @kotlin.r0
    public static /* synthetic */ void i() {
    }

    public static final int j(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }

    public static int k(long j10) {
        return k.a(j10);
    }

    @dl.d
    public static String l(long j10) {
        return '(' + h(j10) + ", " + j(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f3558a, obj);
    }

    public int hashCode() {
        return k(this.f3558a);
    }

    public final /* synthetic */ long m() {
        return this.f3558a;
    }

    @dl.d
    public String toString() {
        return l(this.f3558a);
    }
}
