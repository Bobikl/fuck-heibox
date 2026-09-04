package androidx.p001datastore.preferences.protobuf;

import androidx.p001datastore.preferences.protobuf.a;
import androidx.p001datastore.preferences.protobuf.a.AbstractC0159a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0159a<MessageType, BuilderType>> implements z1 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0159a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0159a<MessageType, BuilderType>> implements z1.a {

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractMessageLite.java */
        public static final class C0160a extends FilterInputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f22370b;

            C0160a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f22370b = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f22370b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f22370b <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f22370b--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f22370b;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f22370b -= i13;
                }
                return i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f22370b));
                if (jSkip >= 0) {
                    this.f22370b = (int) (((long) this.f22370b) - jSkip);
                }
                return jSkip;
            }
        }

        protected static UninitializedMessageException N1(z1 z1Var) {
            return new UninitializedMessageException(z1Var);
        }

        @Deprecated
        protected static <T> void u1(Iterable<T> iterable, Collection<? super T> collection) {
            w1(iterable, (List) collection);
        }

        protected static <T> void w1(Iterable<T> iterable, List<? super T> list) {
            i1.d(iterable);
            if (!(iterable instanceof n1)) {
                if (iterable instanceof q2) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    x1(iterable, list);
                    return;
                }
            }
            List<?> listP = ((n1) iterable).p();
            n1 n1Var = (n1) list;
            int size = list.size();
            for (Object obj : listP) {
                if (obj == null) {
                    String str = "Element at index " + (n1Var.size() - size) + " is null.";
                    for (int size2 = n1Var.size() - 1; size2 >= size; size2--) {
                        n1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    n1Var.f0((ByteString) obj);
                } else {
                    n1Var.add((String) obj);
                }
            }
        }

        private static <T> void x1(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        private String z1(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected abstract BuilderType A1(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
        public BuilderType C0(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                w wVarL = byteString.L();
                D0(wVarL);
                wVarL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(z1("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public BuilderType h1(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
            try {
                w wVarL = byteString.L();
                b1(wVarL, p0Var);
                wVarL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(z1("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
        public BuilderType D0(w wVar) throws IOException {
            return (BuilderType) b1(wVar, p0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: E1 */
        public abstract BuilderType b1(w wVar, p0 p0Var) throws IOException;

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
        public BuilderType A(z1 z1Var) {
            if (r().getClass().isInstance(z1Var)) {
                return (BuilderType) A1((a) z1Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
        public BuilderType L(InputStream inputStream) throws IOException {
            w wVarJ = w.j(inputStream);
            D0(wVarJ);
            wVarJ.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
        public BuilderType W(InputStream inputStream, p0 p0Var) throws IOException {
            w wVarJ = w.j(inputStream);
            b1(wVarJ, p0Var);
            wVarJ.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
        public BuilderType a0(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) P1(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: J1 */
        public BuilderType P1(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                w wVarQ = w.q(bArr, i10, i11);
                D0(wVarQ);
                wVarQ.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(z1("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        public BuilderType K1(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException {
            try {
                w wVarQ = w.q(bArr, i10, i11);
                b1(wVarQ, p0Var);
                wVarQ.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(z1("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
        public BuilderType f1(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
            return (BuilderType) K1(bArr, 0, bArr.length, p0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        public boolean M1(InputStream inputStream, p0 p0Var) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            W(new C0160a(inputStream, w.O(i10, inputStream)), p0Var);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z1.a
        public boolean v1(InputStream inputStream) throws IOException {
            return M1(inputStream, p0.d());
        }

        @Override // 
        public abstract BuilderType y1();
    }

    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public interface b {
        int getNumber();
    }

    @Deprecated
    protected static <T> void I(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0159a.w1(iterable, (List) collection);
    }

    protected static <T> void N(Iterable<T> iterable, List<? super T> list) {
        AbstractC0159a.w1(iterable, list);
    }

    protected static void u1(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.H()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String y1(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    void A1(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public void C(OutputStream outputStream) throws IOException {
        int iU = u();
        CodedOutputStream codedOutputStreamK1 = CodedOutputStream.k1(outputStream, CodedOutputStream.J0(CodedOutputStream.L0(iU) + iU));
        codedOutputStreamK1.Z1(iU);
        l0(codedOutputStreamK1);
        codedOutputStreamK1.e1();
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public byte[] k() {
        try {
            byte[] bArr = new byte[u()];
            CodedOutputStream codedOutputStreamN1 = CodedOutputStream.n1(bArr);
            l0(codedOutputStreamN1);
            codedOutputStreamN1.Z();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(y1("byte array"), e10);
        }
    }

    int w1() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamK1 = CodedOutputStream.k1(outputStream, CodedOutputStream.J0(u()));
        l0(codedOutputStreamK1);
        codedOutputStreamK1.e1();
    }

    int x1(x2 x2Var) {
        int iW1 = w1();
        if (iW1 != -1) {
            return iW1;
        }
        int iG = x2Var.g(this);
        A1(iG);
        return iG;
    }

    @Override // androidx.p001datastore.preferences.protobuf.z1
    public ByteString z0() {
        try {
            ByteString.g gVarJ = ByteString.J(u());
            l0(gVarJ.b());
            return gVarJ.a();
        } catch (IOException e10) {
            throw new RuntimeException(y1("ByteString"), e10);
        }
    }

    UninitializedMessageException z1() {
        return new UninitializedMessageException(this);
    }
}
