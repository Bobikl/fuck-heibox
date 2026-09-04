package androidx.p001datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AllocatedBuffer.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    /* JADX INFO: compiled from: AllocatedBuffer.java */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f22431a;

        a(ByteBuffer byteBuffer) {
            this.f22431a = byteBuffer;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public byte[] a() {
            return this.f22431a.array();
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int b() {
            return this.f22431a.arrayOffset();
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public boolean c() {
            return this.f22431a.hasArray();
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public boolean d() {
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int e() {
            return this.f22431a.limit();
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public ByteBuffer f() {
            return this.f22431a;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int g() {
            return this.f22431a.position();
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public d h(int i10) {
            this.f22431a.position(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int i() {
            return this.f22431a.remaining();
        }
    }

    /* JADX INFO: compiled from: AllocatedBuffer.java */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f22433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22435d;

        b(byte[] bArr, int i10, int i11) {
            this.f22433b = bArr;
            this.f22434c = i10;
            this.f22435d = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public byte[] a() {
            return this.f22433b;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int b() {
            return this.f22434c;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public boolean c() {
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public boolean d() {
            return false;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int e() {
            return this.f22435d;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int g() {
            return this.f22432a;
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public d h(int i10) {
            if (i10 >= 0 && i10 <= this.f22435d) {
                this.f22432a = i10;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.d
        public int i() {
            return this.f22435d - this.f22432a;
        }
    }

    d() {
    }

    public static d j(ByteBuffer byteBuffer) {
        i1.e(byteBuffer, "buffer");
        return new a(byteBuffer);
    }

    public static d k(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static d l(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        return m(bArr, i10, i11);
    }

    private static d m(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract d h(int i10);

    public abstract int i();
}
