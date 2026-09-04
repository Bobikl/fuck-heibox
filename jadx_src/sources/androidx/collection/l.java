package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: FloatFloatPair.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
@xh.f
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @xh.e
    public final long f3646a;

    private /* synthetic */ l(long j10) {
        this.f3646a = j10;
    }

    public static final /* synthetic */ l a(long j10) {
        return new l(j10);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static long d(float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).m();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @kotlin.r0
    public static /* synthetic */ void i() {
    }

    public static final float j(long j10) {
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int k(long j10) {
        return k.a(j10);
    }

    @dl.d
    public static String l(long j10) {
        return '(' + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f3646a, obj);
    }

    public int hashCode() {
        return k(this.f3646a);
    }

    public final /* synthetic */ long m() {
        return this.f3646a;
    }

    @dl.d
    public String toString() {
        return l(this.f3646a);
    }
}
