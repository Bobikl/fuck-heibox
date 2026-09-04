package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: compiled from: VersionedParcelStream.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class f extends VersionedParcel {
    private static final Charset C = Charset.forName("UTF-16");
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 3;
    private static final int H = 4;
    private static final int I = 5;
    private static final int J = 6;
    private static final int K = 7;
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 10;
    private static final int O = 11;
    private static final int P = 12;
    private static final int Q = 13;
    private static final int R = 14;
    private int A;
    int B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataInputStream f28190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DataOutputStream f28191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private DataInputStream f28192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private DataOutputStream f28193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b f28194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f28195y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f28196z;

    /* JADX INFO: compiled from: VersionedParcelStream.java */
    public class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            f fVar = f.this;
            int i10 = fVar.B;
            if (i10 != -1 && fVar.f28196z >= i10) {
                throw new IOException();
            }
            int i11 = super.read();
            f.this.f28196z++;
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            f fVar = f.this;
            int i12 = fVar.B;
            if (i12 != -1 && fVar.f28196z >= i12) {
                throw new IOException();
            }
            int i13 = super.read(bArr, i10, i11);
            if (i13 > 0) {
                f.this.f28196z += i13;
            }
            return i13;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            f fVar = f.this;
            int i10 = fVar.B;
            if (i10 != -1 && fVar.f28196z >= i10) {
                throw new IOException();
            }
            long jSkip = super.skip(j10);
            if (jSkip > 0) {
                f.this.f28196z += (int) jSkip;
            }
            return jSkip;
        }
    }

    /* JADX INFO: compiled from: VersionedParcelStream.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ByteArrayOutputStream f28198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataOutputStream f28199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f28200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DataOutputStream f28201d;

        b(int i10, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f28198a = byteArrayOutputStream;
            this.f28199b = new DataOutputStream(byteArrayOutputStream);
            this.f28200c = i10;
            this.f28201d = dataOutputStream;
        }

        void a() throws IOException {
            this.f28199b.flush();
            int size = this.f28198a.size();
            this.f28201d.writeInt((this.f28200c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f28201d.writeInt(size);
            }
            this.f28198a.writeTo(this.f28201d);
        }
    }

    public f(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private f(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f28196z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f28190t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f28191u = dataOutputStream;
        this.f28192v = dataInputStream;
        this.f28193w = dataOutputStream;
    }

    private void o1(int i10, String str, Bundle bundle) {
        switch (i10) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i10);
        }
    }

    private void p1(Object obj) {
        if (obj == null) {
            L0(0);
            return;
        }
        if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C0(double d10) {
        try {
            this.f28193w.writeDouble(d10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean F(int i10) {
        while (true) {
            try {
                int i11 = this.A;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                int i12 = this.f28196z;
                int i13 = this.B;
                if (i12 < i13) {
                    this.f28190t.skip(i13 - i12);
                }
                this.B = -1;
                int i14 = this.f28190t.readInt();
                this.f28196z = 0;
                int i15 = i14 & 65535;
                if (i15 == 65535) {
                    i15 = this.f28190t.readInt();
                }
                this.A = (i14 >> 16) & 65535;
                this.B = i15;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float G() {
        try {
            return this.f28192v.readFloat();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void H0(float f10) {
        try {
            this.f28193w.writeFloat(f10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int L() {
        try {
            return this.f28192v.readInt();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void L0(int i10) {
        try {
            this.f28193w.writeInt(i10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long Q() {
        try {
            return this.f28192v.readLong();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void Q0(long j10) {
        try {
            this.f28193w.writeLong(j10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void W0(Parcelable parcelable) {
        if (!this.f28195y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        b bVar = this.f28194x;
        if (bVar != null) {
            try {
                if (bVar.f28198a.size() != 0) {
                    this.f28194x.a();
                }
                this.f28194x = null;
            } catch (IOException e10) {
                throw new VersionedParcel.ParcelException(e10);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel c() {
        return new f(this.f28192v, this.f28193w, this.f28178a, this.f28179b, this.f28180c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String c0() {
        try {
            int i10 = this.f28192v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f28192v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder e0() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void e1(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(C);
                this.f28193w.writeInt(bytes.length);
                this.f28193w.write(bytes);
            } else {
                this.f28193w.writeInt(-1);
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g1(IBinder iBinder) {
        if (!this.f28195y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean i() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i0(int i10) {
        a();
        b bVar = new b(i10, this.f28191u);
        this.f28194x = bVar;
        this.f28193w = bVar.f28199b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void i1(IInterface iInterface) {
        if (!this.f28195y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void j0(boolean z10, boolean z11) {
        if (!z10) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f28195y = z11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean l() {
        try {
            return this.f28192v.readBoolean();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void m0(boolean z10) {
        try {
            this.f28193w.writeBoolean(z10);
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle p() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < iL; i10++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f28193w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f28193w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] s() {
        try {
            int i10 = this.f28192v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f28192v.readFully(bArr);
            return bArr;
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f28193w.writeInt(bArr.length);
                this.f28193w.write(bArr);
            } else {
                this.f28193w.writeInt(-1);
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void v0(byte[] bArr, int i10, int i11) {
        try {
            if (bArr != null) {
                this.f28193w.writeInt(i11);
                this.f28193w.write(bArr, i10, i11);
            } else {
                this.f28193w.writeInt(-1);
            }
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double y() {
        try {
            return this.f28192v.readDouble();
        } catch (IOException e10) {
            throw new VersionedParcel.ParcelException(e10);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void y0(CharSequence charSequence) {
        if (!this.f28195y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }
}
