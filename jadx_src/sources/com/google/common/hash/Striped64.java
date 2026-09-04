package com.google.common.hash;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
@h
@o9.c
public abstract class Striped64 extends Number {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal<int[]> f58531e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Random f58532f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f58533g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Unsafe f58534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f58535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f58536j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    volatile transient b[] f58537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile transient long f58538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile transient int f58539d;

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

    public static final class b {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Unsafe f58540p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final long f58541q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile long f58542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile long f58543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile long f58544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f58545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f58546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f58547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f58548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f58549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile long f58550i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile long f58551j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile long f58552k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile long f58553l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile long f58554m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile long f58555n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile long f58556o;

        static {
            try {
                Unsafe unsafeF = Striped64.f();
                f58540p = unsafeF;
                f58541q = unsafeF.objectFieldOffset(b.class.getDeclaredField(RXScreenCaptureService.KEY_HEIGHT));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        b(long j10) {
            this.f58549h = j10;
        }

        final boolean a(long j10, long j11) {
            return f58540p.compareAndSwapLong(this, f58541q, j10, j11);
        }
    }

    static {
        try {
            Unsafe unsafeF = f();
            f58534h = unsafeF;
            f58535i = unsafeF.objectFieldOffset(Striped64.class.getDeclaredField(ak.aF));
            f58536j = unsafeF.objectFieldOffset(Striped64.class.getDeclaredField("d"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    Striped64() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe f() {
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

    final boolean c(long j10, long j11) {
        return f58534h.compareAndSwapLong(this, f58535i, j10, j11);
    }

    final boolean d() {
        return f58534h.compareAndSwapInt(this, f58536j, 0, 1);
    }

    abstract long e(long j10, long j11);

    final void g(long j10) {
        b[] bVarArr = this.f58537b;
        this.f58538c = j10;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f58549h = j10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    final void h(long j10, @CheckForNull int[] iArr, boolean z10) {
        int iNextInt;
        int[] iArr2;
        boolean z11;
        int length;
        boolean z12;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            f58531e.set(iArr2);
            iNextInt = f58532f.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z13 = false;
        int i10 = iNextInt;
        boolean z14 = z10;
        while (true) {
            b[] bVarArr = this.f58537b;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i10];
                if (bVar == null) {
                    if (this.f58539d == 0) {
                        b bVar2 = new b(j10);
                        if (this.f58539d == 0 && d()) {
                            try {
                                b[] bVarArr2 = this.f58537b;
                                if (bVarArr2 == null || (length2 = bVarArr2.length) <= 0) {
                                    z12 = false;
                                } else {
                                    int i11 = (length2 - 1) & i10;
                                    if (bVarArr2[i11] == null) {
                                        bVarArr2[i11] = bVar2;
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                this.f58539d = 0;
                                if (z12) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.f58539d = 0;
                                throw th2;
                            }
                        }
                    }
                    z13 = false;
                    int i12 = i10 ^ (i10 << 13);
                    int i13 = i12 ^ (i12 >>> 17);
                    i10 = i13 ^ (i13 << 5);
                    iArr2[0] = i10;
                } else {
                    if (z14) {
                        long j11 = bVar.f58549h;
                        if (bVar.a(j11, e(j11, j10))) {
                            return;
                        }
                        if (length >= f58533g || this.f58537b != bVarArr) {
                            z13 = false;
                        } else if (!z13) {
                            z13 = true;
                        } else if (this.f58539d == 0 && d()) {
                            try {
                                if (this.f58537b == bVarArr) {
                                    b[] bVarArr3 = new b[length << 1];
                                    for (int i14 = 0; i14 < length; i14++) {
                                        bVarArr3[i14] = bVarArr[i14];
                                    }
                                    this.f58537b = bVarArr3;
                                }
                                this.f58539d = 0;
                                z13 = false;
                            } catch (Throwable th3) {
                                this.f58539d = 0;
                                throw th3;
                            }
                        }
                    } else {
                        z14 = true;
                    }
                    int i15 = i10 ^ (i10 << 13);
                    int i16 = i15 ^ (i15 >>> 17);
                    i10 = i16 ^ (i16 << 5);
                    iArr2[0] = i10;
                }
            } else if (this.f58539d == 0 && this.f58537b == bVarArr && d()) {
                try {
                    if (this.f58537b == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i10 & 1] = new b(j10);
                        this.f58537b = bVarArr4;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f58539d = 0;
                    if (z11) {
                        return;
                    }
                } catch (Throwable th4) {
                    this.f58539d = 0;
                    throw th4;
                }
            } else {
                long j12 = this.f58538c;
                if (c(j12, e(j12, j10))) {
                    return;
                }
            }
        }
    }
}
