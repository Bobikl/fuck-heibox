package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f127312b = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC1169a<BuilderType extends AbstractC1169a> implements n.a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractMessageLite.java */
        public static final class C1170a extends FilterInputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f127313b;

            C1170a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f127313b = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f127313b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f127313b <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f127313b--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f127313b;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f127313b -= i13;
                }
                return i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f127313b));
                if (jSkip >= 0) {
                    this.f127313b = (int) (((long) this.f127313b) - jSkip);
                }
                return jSkip;
            }
        }

        protected static UninitializedMessageException d(n nVar) {
            return new UninitializedMessageException(nVar);
        }

        @Override // 
        /* JADX INFO: renamed from: b */
        public abstract BuilderType m();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        public abstract BuilderType c(e eVar, f fVar) throws IOException;
    }

    UninitializedMessageException b() {
        return new UninitializedMessageException(this);
    }

    public void c(OutputStream outputStream) throws IOException {
        int iU = u();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputStream, CodedOutputStream.u(CodedOutputStream.v(iU) + iU));
        codedOutputStreamJ.o0(iU);
        a(codedOutputStreamJ);
        codedOutputStreamJ.I();
    }
}
