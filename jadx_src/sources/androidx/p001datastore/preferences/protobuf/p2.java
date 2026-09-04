package androidx.p001datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes6.dex */
public interface p2<MessageType> {
    MessageType a(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType b(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType c(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType d(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType e(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType f(w wVar) throws InvalidProtocolBufferException;

    MessageType g(w wVar, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType h(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType i(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType j(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    MessageType k(ByteString byteString) throws InvalidProtocolBufferException;

    MessageType l(ByteString byteString) throws InvalidProtocolBufferException;

    MessageType m(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType n(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType o(w wVar, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType p(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType q(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType r(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType s(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType t(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType u(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType v(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType w(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType x(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    MessageType y(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException;

    MessageType z(w wVar) throws InvalidProtocolBufferException;
}
