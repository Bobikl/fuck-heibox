package androidx.p001datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f22751a = Logger.getLogger(z3.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f22752b = R();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f22753c = androidx.p001datastore.preferences.protobuf.e.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f22754d = q(Long.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f22755e = q(Integer.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f22756f = N();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f22757g = t0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f22758h = s0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final long f22759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f22760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f22761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f22762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f22763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f22764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f22765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f22766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f22767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f22768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f22769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f22770t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f22771u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f22772v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f22773w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f22774x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f22775y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final boolean f22776z;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class a implements PrivilegedExceptionAction<Unsafe> {
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
            return null;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f22777b = -1;

        b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int A(long j10) {
            return (int) (j10 & (-1));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public boolean e(Object obj, long j10) {
            return z3.f22776z ? z3.w(obj, j10) : z3.x(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public byte g(Object obj, long j10) {
            return z3.f22776z ? z3.B(obj, j10) : z3.C(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public int j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public long l(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void q(Object obj, long j10, boolean z10) {
            if (z3.f22776z) {
                z3.Z(obj, j10, z10);
            } else {
                z3.a0(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void r(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void s(Object obj, long j10, byte b10) {
            if (z3.f22776z) {
                z3.e0(obj, j10, b10);
            } else {
                z3.f0(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void t(Object obj, long j10, double d10) {
            y(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void u(Object obj, long j10, float f10) {
            w(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void v(long j10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void x(long j10, long j11) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public boolean e(Object obj, long j10) {
            return z3.f22776z ? z3.w(obj, j10) : z3.x(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public byte g(Object obj, long j10) {
            return z3.f22776z ? z3.B(obj, j10) : z3.C(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public int j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public long l(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void q(Object obj, long j10, boolean z10) {
            if (z3.f22776z) {
                z3.Z(obj, j10, z10);
            } else {
                z3.a0(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void r(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void s(Object obj, long j10, byte b10) {
            if (z3.f22776z) {
                z3.e0(obj, j10, b10);
            } else {
                z3.f0(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void t(Object obj, long j10, double d10) {
            y(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void u(Object obj, long j10, float f10) {
            w(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void v(long j10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void x(long j10, long j11) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f22778a.copyMemory((Object) null, j10, bArr, z3.f22759i + j11, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            this.f22778a.copyMemory(bArr, z3.f22759i + j10, (Object) null, j11, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public boolean e(Object obj, long j10) {
            return this.f22778a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public byte f(long j10) {
            return this.f22778a.getByte(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public byte g(Object obj, long j10) {
            return this.f22778a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public double h(Object obj, long j10) {
            return this.f22778a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public float i(Object obj, long j10) {
            return this.f22778a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public int j(long j10) {
            return this.f22778a.getInt(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public long l(long j10) {
            return this.f22778a.getLong(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public Object o(Field field) {
            return n(this.f22778a.staticFieldBase(field), this.f22778a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void q(Object obj, long j10, boolean z10) {
            this.f22778a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void r(long j10, byte b10) {
            this.f22778a.putByte(j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void s(Object obj, long j10, byte b10) {
            this.f22778a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void t(Object obj, long j10, double d10) {
            this.f22778a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void u(Object obj, long j10, float f10) {
            this.f22778a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void v(long j10, int i10) {
            this.f22778a.putInt(j10, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.e
        public void x(long j10, long j11) {
            this.f22778a.putLong(j10, j11);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f22778a;

        e(Unsafe unsafe) {
            this.f22778a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f22778a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f22778a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract void d(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean e(Object obj, long j10);

        public abstract byte f(long j10);

        public abstract byte g(Object obj, long j10);

        public abstract double h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public abstract int j(long j10);

        public final int k(Object obj, long j10) {
            return this.f22778a.getInt(obj, j10);
        }

        public abstract long l(long j10);

        public final long m(Object obj, long j10) {
            return this.f22778a.getLong(obj, j10);
        }

        public final Object n(Object obj, long j10) {
            return this.f22778a.getObject(obj, j10);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.f22778a.objectFieldOffset(field);
        }

        public abstract void q(Object obj, long j10, boolean z10);

        public abstract void r(long j10, byte b10);

        public abstract void s(Object obj, long j10, byte b10);

        public abstract void t(Object obj, long j10, double d10);

        public abstract void u(Object obj, long j10, float f10);

        public abstract void v(long j10, int i10);

        public final void w(Object obj, long j10, int i10) {
            this.f22778a.putInt(obj, j10, i10);
        }

        public abstract void x(long j10, long j11);

        public final void y(Object obj, long j10, long j11) {
            this.f22778a.putLong(obj, j10, j11);
        }

        public final void z(Object obj, long j10, Object obj2) {
            this.f22778a.putObject(obj, j10, obj2);
        }
    }

    static {
        long jK = k(byte[].class);
        f22759i = jK;
        f22760j = k(boolean[].class);
        f22761k = l(boolean[].class);
        f22762l = k(int[].class);
        f22763m = l(int[].class);
        f22764n = k(long[].class);
        f22765o = l(long[].class);
        f22766p = k(float[].class);
        f22767q = l(float[].class);
        f22768r = k(double[].class);
        f22769s = l(double[].class);
        f22770t = k(Object[].class);
        f22771u = l(Object[].class);
        f22772v = s(m());
        f22775y = (int) (7 & jK);
        f22776z = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private z3() {
    }

    static byte A(byte[] bArr, long j10) {
        return f22756f.g(bArr, f22759i + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte B(Object obj, long j10) {
        return (byte) ((I(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte C(Object obj, long j10) {
        return (byte) ((I(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double D(Object obj, long j10) {
        return f22756f.h(obj, j10);
    }

    static double E(double[] dArr, long j10) {
        return f22756f.h(dArr, f22768r + (j10 * f22769s));
    }

    static float F(Object obj, long j10) {
        return f22756f.i(obj, j10);
    }

    static float G(float[] fArr, long j10) {
        return f22756f.i(fArr, f22766p + (j10 * f22767q));
    }

    static int H(long j10) {
        return f22756f.j(j10);
    }

    static int I(Object obj, long j10) {
        return f22756f.k(obj, j10);
    }

    static int J(int[] iArr, long j10) {
        return f22756f.k(iArr, f22762l + (j10 * f22763m));
    }

    static long K(long j10) {
        return f22756f.l(j10);
    }

    static long L(Object obj, long j10) {
        return f22756f.m(obj, j10);
    }

    static long M(long[] jArr, long j10) {
        return f22756f.m(jArr, f22764n + (j10 * f22765o));
    }

    private static e N() {
        Unsafe unsafe = f22752b;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.p001datastore.preferences.protobuf.e.c()) {
            return new d(unsafe);
        }
        if (f22754d) {
            return new c(unsafe);
        }
        if (f22755e) {
            return new b(unsafe);
        }
        return null;
    }

    static Object O(Object obj, long j10) {
        return f22756f.n(obj, j10);
    }

    static Object P(Object[] objArr, long j10) {
        return f22756f.n(objArr, f22770t + (j10 * f22771u));
    }

    static Object Q(Field field) {
        return f22756f.o(field);
    }

    static Unsafe R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean S() {
        return f22758h;
    }

    static boolean T() {
        return f22757g;
    }

    static boolean U() {
        return f22754d;
    }

    static int V(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i10 < 0 || i11 < 0 || i12 < 0 || i10 + i12 > bArr.length || i11 + i12 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i13 = 0;
        if (f22758h) {
            for (int i14 = (f22775y + i10) & 7; i13 < i12 && (i14 & 7) != 0; i14++) {
                if (bArr[i10 + i13] != bArr2[i11 + i13]) {
                    return i13;
                }
                i13++;
            }
            int i15 = ((i12 - i13) & (-8)) + i13;
            while (i13 < i15) {
                long j10 = f22759i;
                long j11 = i13;
                long jL = L(bArr, ((long) i10) + j10 + j11);
                long jL2 = L(bArr2, j10 + ((long) i11) + j11);
                if (jL != jL2) {
                    return i13 + t(jL, jL2);
                }
                i13 += 8;
            }
        }
        while (i13 < i12) {
            if (bArr[i10 + i13] != bArr2[i11 + i13]) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    static long W(Field field) {
        return f22756f.p(field);
    }

    static void X(Object obj, long j10, boolean z10) {
        f22756f.q(obj, j10, z10);
    }

    static void Y(boolean[] zArr, long j10, boolean z10) {
        f22756f.q(zArr, f22760j + (j10 * f22761k), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z(Object obj, long j10, boolean z10) {
        e0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a0(Object obj, long j10, boolean z10) {
        f0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void b0(long j10, byte b10) {
        f22756f.r(j10, b10);
    }

    static void c0(Object obj, long j10, byte b10) {
        f22756f.s(obj, j10, b10);
    }

    static void d0(byte[] bArr, long j10, byte b10) {
        f22756f.s(bArr, f22759i + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int I = I(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        l0(obj, j11, ((255 & b10) << i10) | (I & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f0(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        l0(obj, j11, ((255 & b10) << i10) | (I(obj, j11) & (~(255 << i10))));
    }

    static void g0(Object obj, long j10, double d10) {
        f22756f.t(obj, j10, d10);
    }

    static void h0(double[] dArr, long j10, double d10) {
        f22756f.t(dArr, f22768r + (j10 * f22769s), d10);
    }

    static long i(ByteBuffer byteBuffer) {
        return f22756f.m(byteBuffer, f22772v);
    }

    static void i0(Object obj, long j10, float f10) {
        f22756f.u(obj, j10, f10);
    }

    static <T> T j(Class<T> cls) {
        try {
            return (T) f22752b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static void j0(float[] fArr, long j10, float f10) {
        f22756f.u(fArr, f22766p + (j10 * f22767q), f10);
    }

    private static int k(Class<?> cls) {
        if (f22758h) {
            return f22756f.a(cls);
        }
        return -1;
    }

    static void k0(long j10, int i10) {
        f22756f.v(j10, i10);
    }

    private static int l(Class<?> cls) {
        if (f22758h) {
            return f22756f.b(cls);
        }
        return -1;
    }

    static void l0(Object obj, long j10, int i10) {
        f22756f.w(obj, j10, i10);
    }

    private static Field m() {
        Field fieldR;
        if (androidx.p001datastore.preferences.protobuf.e.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        Field fieldR2 = r(Buffer.class, "address");
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    static void m0(int[] iArr, long j10, int i10) {
        f22756f.w(iArr, f22762l + (j10 * f22763m), i10);
    }

    static void n(long j10, byte[] bArr, long j11, long j12) {
        f22756f.c(j10, bArr, j11, j12);
    }

    static void n0(long j10, long j11) {
        f22756f.x(j10, j11);
    }

    static void o(byte[] bArr, long j10, long j11, long j12) {
        f22756f.d(bArr, j10, j11, j12);
    }

    static void o0(Object obj, long j10, long j11) {
        f22756f.y(obj, j10, j11);
    }

    static void p(byte[] bArr, long j10, byte[] bArr2, long j11, long j12) {
        System.arraycopy(bArr, (int) j10, bArr2, (int) j11, (int) j12);
    }

    static void p0(long[] jArr, long j10, long j11) {
        f22756f.y(jArr, f22764n + (j10 * f22765o), j11);
    }

    private static boolean q(Class<?> cls) {
        if (!androidx.p001datastore.preferences.protobuf.e.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f22753c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static void q0(Object obj, long j10, Object obj2) {
        f22756f.z(obj, j10, obj2);
    }

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void r0(Object[] objArr, long j10, Object obj) {
        f22756f.z(objArr, f22770t + (j10 * f22771u), obj);
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f22756f) == null) {
            return -1L;
        }
        return eVar.p(field);
    }

    private static boolean s0() {
        Unsafe unsafe = f22752b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (androidx.p001datastore.preferences.protobuf.e.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            f22751a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static int t(long j10, long j11) {
        return (f22776z ? Long.numberOfLeadingZeros(j10 ^ j11) : Long.numberOfTrailingZeros(j10 ^ j11)) >> 3;
    }

    private static boolean t0() {
        Unsafe unsafe = f22752b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (androidx.p001datastore.preferences.protobuf.e.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            f22751a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    static boolean u(Object obj, long j10) {
        return f22756f.e(obj, j10);
    }

    static boolean v(boolean[] zArr, long j10) {
        return f22756f.e(zArr, f22760j + (j10 * f22761k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j10) {
        return B(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(Object obj, long j10) {
        return C(obj, j10) != 0;
    }

    static byte y(long j10) {
        return f22756f.f(j10);
    }

    static byte z(Object obj, long j10) {
        return f22756f.g(obj, j10);
    }
}
