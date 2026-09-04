package com.google.common.hash;

import com.google.common.primitives.Longs;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
@h
public final class LittleEndianByteArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f58482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f58483b = false;

    public enum JavaLittleEndianBytes implements b {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.b
            public long getLongLittleEndian(byte[] bArr, int i10) {
                return Longs.j(bArr[i10 + 7], bArr[i10 + 6], bArr[i10 + 5], bArr[i10 + 4], bArr[i10 + 3], bArr[i10 + 2], bArr[i10 + 1], bArr[i10]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.b
            public void putLongLittleEndian(byte[] bArr, int i10, long j10) {
                long j11 = 255;
                for (int i11 = 0; i11 < 8; i11++) {
                    bArr[i10 + i11] = (byte) ((j10 & j11) >> (i11 * 8));
                    j11 <<= 8;
                }
            }
        }
    }

    public enum UnsafeByteArray implements b {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.b
            public long getLongLittleEndian(byte[] bArr, int i10) {
                return UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i10) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.b
            public void putLongLittleEndian(byte[] bArr, int i10, long j10) {
                UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i10) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), j10);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.b
            public long getLongLittleEndian(byte[] bArr, int i10) {
                return Long.reverseBytes(UnsafeByteArray.theUnsafe.getLong(bArr, ((long) i10) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET)));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.b
            public void putLongLittleEndian(byte[] bArr, int i10, long j10) {
                UnsafeByteArray.theUnsafe.putLong(bArr, ((long) i10) + ((long) UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET), Long.reverseBytes(j10));
            }
        };

        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final Unsafe theUnsafe;

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
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
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
    }

    public interface b {
        long getLongLittleEndian(byte[] bArr, int i10);

        void putLongLittleEndian(byte[] bArr, int i10, long j10);
    }

    static {
        b bVar = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                bVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f58482a = bVar;
    }

    private LittleEndianByteArray() {
    }

    static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static long b(byte[] bArr, int i10) {
        return f58482a.getLongLittleEndian(bArr, i10);
    }

    static long c(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, 8);
        long j10 = 0;
        for (int i12 = 0; i12 < iMin; i12++) {
            j10 |= (((long) bArr[i10 + i12]) & 255) << (i12 * 8);
        }
        return j10;
    }

    static void d(byte[] bArr, int i10, long j10) {
        f58482a.putLongLittleEndian(bArr, i10, j10);
    }

    static boolean e() {
        return f58482a instanceof UnsafeByteArray;
    }
}
