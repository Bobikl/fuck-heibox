package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: compiled from: ProfileVerifier.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26804a = "/data/misc/profiles/ref/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26805b = "/data/misc/profiles/cur/0/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26806c = "primary.prof";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26807d = "profileInstalled";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26810g = "ProfileVerifier";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.concurrent.futures.b<c> f26808e = androidx.concurrent.futures.b.u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f26809f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private static c f26811h = null;

    /* JADX INFO: compiled from: ProfileVerifier.java */
    @w0(33)
    public static class a {
        private a() {
        }

        @u
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f26812e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f26813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f26814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f26815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f26816d;

        b(int i10, int i11, long j10, long j11) {
            this.f26813a = i10;
            this.f26814b = i11;
            this.f26815c = j10;
            this.f26816d = j11;
        }

        static b a(@n0 File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        void b(@n0 File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f26813a);
                dataOutputStream.writeInt(this.f26814b);
                dataOutputStream.writeLong(this.f26815c);
                dataOutputStream.writeLong(this.f26816d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26814b == bVar.f26814b && this.f26815c == bVar.f26815c && this.f26813a == bVar.f26813a && this.f26816d == bVar.f26816d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f26814b), Long.valueOf(this.f26815c), Integer.valueOf(this.f26813a), Long.valueOf(this.f26816d));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f26817d = 16;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f26818e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f26819f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f26820g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f26821h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f26822i = 65536;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f26823j = 131072;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f26824k = 196608;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f26825l = 262144;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f26826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f26827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f26828c;

        /* JADX INFO: compiled from: ProfileVerifier.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface a {
        }

        c(int i10, boolean z10, boolean z11) {
            this.f26826a = i10;
            this.f26828c = z11;
            this.f26827b = z10;
        }

        public int a() {
            return this.f26826a;
        }

        public boolean b() {
            return this.f26828c;
        }

        public boolean c() {
            return this.f26827b;
        }
    }

    private o() {
    }

    @n0
    public static com.google.common.util.concurrent.p0<c> a() {
        return f26808e;
    }

    private static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c c(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f26811h = cVar;
        f26808e.p(cVar);
        return f26811h;
    }

    @k1
    @n0
    public static c d(@n0 Context context) {
        return e(context, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @k1
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static c e(@n0 Context context, boolean z10) {
        int i10;
        int i11;
        File file;
        boolean z11;
        File file2;
        long length;
        boolean z12;
        File file3;
        b bVarA;
        b bVar;
        int i12;
        c cVar;
        if (!z10 && (cVar = f26811h) != null) {
            return cVar;
        }
        synchronized (f26809f) {
            if (z10) {
                i10 = Build.VERSION.SDK_INT;
                i11 = 0;
                if (i10 >= 28) {
                    file = new File(new File(f26804a, context.getPackageName()), f26806c);
                    long length2 = file.length();
                    if (file.exists()) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    file2 = new File(new File(f26805b, context.getPackageName()), f26806c);
                    length = file2.length();
                    if (file2.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    long jB = b(context);
                    file3 = new File(context.getFilesDir(), f26807d);
                    bVarA = file3.exists() ? b.a(file3) : null;
                    if (bVarA == null) {
                        if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                    } else if (z11) {
                        i11 = 1;
                    } else if (z12) {
                        i11 = 2;
                    }
                    if (z10) {
                        i11 = 2;
                    }
                    if (bVarA != null) {
                        i11 = 3;
                    }
                    bVar = new b(1, i11, jB, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return c(i11, z11, z12);
                }
                return c(262144, false, false);
            }
            c cVar2 = f26811h;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = Build.VERSION.SDK_INT;
            i11 = 0;
            if (i10 >= 28 && i10 != 30) {
                file = new File(new File(f26804a, context.getPackageName()), f26806c);
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                file2 = new File(new File(f26805b, context.getPackageName()), f26806c);
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                try {
                    long jB2 = b(context);
                    file3 = new File(context.getFilesDir(), f26807d);
                    if (file3.exists()) {
                        try {
                        } catch (IOException unused) {
                            return c(131072, z11, z12);
                        }
                    }
                    if (bVarA == null && bVarA.f26815c == jB2 && (i12 = bVarA.f26814b) != 2) {
                        i11 = i12;
                    } else if (z11) {
                        i11 = 1;
                    } else if (z12) {
                        i11 = 2;
                    }
                    if (z10 && z12 && i11 != 1) {
                        i11 = 2;
                    }
                    if (bVarA != null && bVarA.f26814b == 2 && i11 == 1 && length3 < bVarA.f26816d) {
                        i11 = 3;
                    }
                    bVar = new b(1, i11, jB2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i11 = c.f26824k;
                        }
                    }
                    return c(i11, z11, z12);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return c(65536, z11, z12);
                }
            }
            return c(262144, false, false);
            throw th;
        }
    }
}
