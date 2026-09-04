package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes6.dex */
public interface z1 extends a2 {

    /* JADX INFO: compiled from: MessageLite.java */
    public interface a extends a2, Cloneable {
        a A(z1 z1Var);

        a C0(ByteString byteString) throws InvalidProtocolBufferException;

        a D0(w wVar) throws IOException;

        /* JADX INFO: renamed from: G0 */
        a K1(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException;

        a L(InputStream inputStream) throws IOException;

        boolean M1(InputStream inputStream, p0 p0Var) throws IOException;

        a P1(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        a W(InputStream inputStream, p0 p0Var) throws IOException;

        a a0(byte[] bArr) throws InvalidProtocolBufferException;

        z1 a1();

        a b1(w wVar, p0 p0Var) throws IOException;

        z1 build();

        a clear();

        /* JADX INFO: renamed from: clone */
        a mo8clone();

        a f1(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException;

        a h1(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException;

        boolean v1(InputStream inputStream) throws IOException;
    }

    void C(OutputStream outputStream) throws IOException;

    byte[] k();

    void l0(CodedOutputStream codedOutputStream) throws IOException;

    a t();

    int u();

    a v();

    p2<? extends z1> w();

    void writeTo(OutputStream outputStream) throws IOException;

    ByteString z0();
}
