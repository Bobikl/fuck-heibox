package com.google.common.primitives;

import com.google.common.base.w;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.c
public final class UnsignedBytes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f59069a = -128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte f59070b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f59071c = 255;

    @o9.d
    public static class LexicographicalComparatorHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f59072a = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Comparator<byte[]> f59073b = a();

        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i10 = 0; i10 < iMin; i10++) {
                    int iB = UnsignedBytes.b(bArr[i10], bArr2[i10]);
                    if (iB != 0) {
                        return iB;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @o9.d
        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            public class a implements PrivilegedExceptionAction<Unsafe> {
                a() {
                }

                @Override // java.security.PrivilegedExceptionAction
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            }

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e10) {
                        throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new a());
                }
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i10 = iMin & (-8);
                int i11 = 0;
                while (i11 < i10) {
                    Unsafe unsafe = theUnsafe;
                    int i12 = BYTE_ARRAY_BASE_OFFSET;
                    long j10 = i11;
                    long j11 = unsafe.getLong(bArr, ((long) i12) + j10);
                    long j12 = unsafe.getLong(bArr2, ((long) i12) + j10);
                    if (j11 != j12) {
                        if (BIG_ENDIAN) {
                            return UnsignedLongs.a(j11, j12);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11 ^ j12) & (-8);
                        return ((int) ((j11 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j12 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i11 += 8;
                }
                while (i11 < iMin) {
                    int iB = UnsignedBytes.b(bArr[i11], bArr2[i11]);
                    if (iB != 0) {
                        return iB;
                    }
                    i11++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        LexicographicalComparatorHolder() {
        }

        static Comparator<byte[]> a() {
            try {
                Object[] enumConstants = Class.forName(f59072a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.f();
            }
        }
    }

    private UnsignedBytes() {
    }

    @s9.a
    public static byte a(long j10) {
        w.p((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10, byte b11) {
        return p(b10) - p(b11);
    }

    private static byte c(byte b10) {
        return (byte) (b10 ^ 128);
    }

    public static String d(String str, byte... bArr) {
        w.E(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * (str.length() + 3));
        sb2.append(p(bArr[0]));
        for (int i10 = 1; i10 < bArr.length; i10++) {
            sb2.append(str);
            sb2.append(q(bArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> e() {
        return LexicographicalComparatorHolder.f59073b;
    }

    @o9.d
    static Comparator<byte[]> f() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    public static byte g(byte... bArr) {
        w.d(bArr.length > 0);
        int iP = p(bArr[0]);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            int iP2 = p(bArr[i10]);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return (byte) iP;
    }

    public static byte h(byte... bArr) {
        w.d(bArr.length > 0);
        int iP = p(bArr[0]);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            int iP2 = p(bArr[i10]);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return (byte) iP;
    }

    @o9.a
    @s9.a
    public static byte i(String str) {
        return j(str, 10);
    }

    @o9.a
    @s9.a
    public static byte j(String str, int i10) {
        int i11 = Integer.parseInt((String) w.E(str), i10);
        if ((i11 >> 8) == 0) {
            return (byte) i11;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("out of range: ");
        sb2.append(i11);
        throw new NumberFormatException(sb2.toString());
    }

    public static byte k(long j10) {
        if (j10 > p((byte) -1)) {
            return (byte) -1;
        }
        if (j10 < 0) {
            return (byte) 0;
        }
        return (byte) j10;
    }

    public static void l(byte[] bArr) {
        w.E(bArr);
        m(bArr, 0, bArr.length);
    }

    public static void m(byte[] bArr, int i10, int i11) {
        w.E(bArr);
        w.f0(i10, i11, bArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12] = c(bArr[i12]);
        }
        Arrays.sort(bArr, i10, i11);
        while (i10 < i11) {
            bArr[i10] = c(bArr[i10]);
            i10++;
        }
    }

    public static void n(byte[] bArr) {
        w.E(bArr);
        o(bArr, 0, bArr.length);
    }

    public static void o(byte[] bArr, int i10, int i11) {
        w.E(bArr);
        w.f0(i10, i11, bArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ 127);
        }
        Arrays.sort(bArr, i10, i11);
        while (i10 < i11) {
            bArr[i10] = (byte) (bArr[i10] ^ 127);
            i10++;
        }
    }

    public static int p(byte b10) {
        return b10 & 255;
    }

    @o9.a
    public static String q(byte b10) {
        return r(b10, 10);
    }

    @o9.a
    public static String r(byte b10, int i10) {
        w.k(i10 >= 2 && i10 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i10);
        return Integer.toString(p(b10), i10);
    }
}
