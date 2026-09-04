package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d implements Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f127320b = new m(new byte[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f127321c = false;

    /* JADX INFO: compiled from: ByteString.java */
    public interface a extends Iterator<Byte> {
        byte l();
    }

    /* JADX INFO: compiled from: ByteString.java */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final byte[] f127322g = new byte[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f127323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<d> f127324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f127326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127327f;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f127323b = i10;
            this.f127324c = new ArrayList<>();
            this.f127326e = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f127324c.add(new m(this.f127326e));
            int length = this.f127325d + this.f127326e.length;
            this.f127325d = length;
            this.f127326e = new byte[Math.max(this.f127323b, Math.max(i10, length >>> 1))];
            this.f127327f = 0;
        }

        private void c() {
            int i10 = this.f127327f;
            byte[] bArr = this.f127326e;
            if (i10 >= bArr.length) {
                this.f127324c.add(new m(this.f127326e));
                this.f127326e = f127322g;
            } else if (i10 > 0) {
                this.f127324c.add(new m(a(bArr, i10)));
            }
            this.f127325d += this.f127327f;
            this.f127327f = 0;
        }

        public synchronized int d() {
            return this.f127325d + this.f127327f;
        }

        public synchronized d e() {
            c();
            return d.e(this.f127324c);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            if (this.f127327f == this.f127326e.length) {
                b(1);
            }
            byte[] bArr = this.f127326e;
            int i11 = this.f127327f;
            this.f127327f = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.f127326e;
            int length = bArr2.length;
            int i12 = this.f127327f;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f127327f += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                b(i13);
                System.arraycopy(bArr, i10 + length2, this.f127326e, 0, i13);
                this.f127327f = i13;
            }
        }
    }

    d() {
    }

    private static d a(Iterator<d> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).b(a(it, i10 - i11));
    }

    public static d e(Iterable<d> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f127320b : a(arrayList.iterator(), arrayList.size());
    }

    public static d g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static d h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new m(bArr2);
    }

    public static d i(String str) {
        try {
            return new m(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b u() {
        return new b(128);
    }

    public abstract String A(String str) throws UnsupportedEncodingException;

    public String B() {
        try {
            return A("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void D(OutputStream outputStream, int i10, int i11) throws IOException {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                E(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    abstract void E(OutputStream outputStream, int i10, int i11) throws IOException;

    public d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return r.I(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void j(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                l(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract void l(byte[] bArr, int i10, int i11, int i12);

    protected abstract int m();

    protected abstract boolean o();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public abstract a iterator();

    public abstract int size();

    public abstract e t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int v(int i10, int i11, int i12);

    protected abstract int w(int i10, int i11, int i12);

    protected abstract int x();

    public byte[] y() {
        int size = size();
        if (size == 0) {
            return h.f127353a;
        }
        byte[] bArr = new byte[size];
        l(bArr, 0, 0, size);
        return bArr;
    }
}
