package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class NioByteString extends ByteString.LeafByteString {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ByteBuffer f22317j;

    public class a extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteBuffer f22318b;

        a() {
            this.f22318b = NioByteString.this.f22317j.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f22318b.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f22318b.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f22318b.hasRemaining()) {
                return this.f22318b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!this.f22318b.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, this.f22318b.remaining());
            this.f22318b.get(bArr, i10, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f22318b.reset();
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }
    }

    NioByteString(ByteBuffer byteBuffer) {
        i1.e(byteBuffer, "buffer");
        this.f22317j = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void D0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer E0(int i10, int i11) {
        if (i10 < this.f22317j.position() || i11 > this.f22317j.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f22317j.slice();
        byteBufferSlice.position(i10 - this.f22317j.position());
        byteBufferSlice.limit(i11 - this.f22317j.position());
        return byteBufferSlice;
    }

    private Object F0() {
        return ByteString.s(this.f22317j.slice());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected void B(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f22317j.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
    boolean B0(ByteString byteString, int i10, int i11) {
        return b0(0, i11).equals(byteString.b0(i10, i11 + i10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public byte F(int i10) {
        return h(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public boolean H() {
        return Utf8.s(this.f22317j);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public w L() {
        return w.o(this.f22317j, true);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public InputStream N() {
        return new a();
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected int S(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f22317j.get(i13);
        }
        return i10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected int T(int i10, int i11, int i12) {
        return Utf8.v(i10, this.f22317j, i11, i12 + i11);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public ByteBuffer b() {
        return this.f22317j.asReadOnlyBuffer();
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public ByteString b0(int i10, int i11) {
        try {
            return new NioByteString(E0(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> e() {
        return Collections.singletonList(b());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.f22317j.equals(((NioByteString) obj).f22317j);
        }
        return obj instanceof RopeByteString ? obj.equals(this) : this.f22317j.equals(byteString.b());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public byte h(int i10) {
        try {
            return this.f22317j.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected String l0(Charset charset) {
        byte[] bArrD0;
        int iArrayOffset;
        int length;
        if (this.f22317j.hasArray()) {
            bArrD0 = this.f22317j.array();
            iArrayOffset = this.f22317j.arrayOffset() + this.f22317j.position();
            length = this.f22317j.remaining();
        } else {
            bArrD0 = d0();
            iArrayOffset = 0;
            length = bArrD0.length;
        }
        return new String(bArrD0, iArrayOffset, length, charset);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public int size() {
        return this.f22317j.remaining();
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    void u0(t tVar) throws IOException {
        tVar.W(this.f22317j.slice());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public void v0(OutputStream outputStream) throws IOException {
        outputStream.write(d0());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public void x(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f22317j.slice());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    void y0(OutputStream outputStream, int i10, int i11) throws IOException {
        if (!this.f22317j.hasArray()) {
            s.h(E0(i10, i11 + i10), outputStream);
        } else {
            outputStream.write(this.f22317j.array(), this.f22317j.arrayOffset() + this.f22317j.position() + i10, i11);
        }
    }
}
