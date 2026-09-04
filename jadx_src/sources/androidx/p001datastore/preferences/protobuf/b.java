package androidx.p001datastore.preferences.protobuf;

import androidx.p001datastore.preferences.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b<MessageType extends z1> implements p2<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p0 f22394a = p0.d();

    private MessageType A(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.l()) {
            return messagetype;
        }
        throw B(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException B(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).z1() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessageType q(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) p(inputStream, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public MessageType p(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) A(n(inputStream, p0Var));
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public MessageType k(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) s(byteString, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessageType s(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) A(u(byteString, p0Var));
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MessageType z(w wVar) throws InvalidProtocolBufferException {
        return (MessageType) g(wVar, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public MessageType g(w wVar, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) A(o(wVar, p0Var));
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MessageType i(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) r(inputStream, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public MessageType r(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) A(v(inputStream, p0Var));
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public MessageType m(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageType) y(byteBuffer, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MessageType y(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        try {
            w wVarN = w.n(byteBuffer);
            MessageType messagetypeO = o(wVarN, p0Var);
            try {
                wVarN.a(0);
                return (MessageType) A(messagetypeO);
            } catch (InvalidProtocolBufferException e10) {
                throw e10.j(messagetypeO);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public MessageType a(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) b(bArr, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public MessageType j(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) t(bArr, i10, i11, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageType t(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) A(h(bArr, i10, i11, p0Var));
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public MessageType b(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) t(bArr, 0, bArr.length, p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MessageType e(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) n(inputStream, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public MessageType n(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) v(new a.AbstractC0159a.C0160a(inputStream, w.O(i10, inputStream)), p0Var);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public MessageType l(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) u(byteString, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public MessageType u(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        try {
            w wVarL = byteString.L();
            MessageType messagetypeO = o(wVarL, p0Var);
            try {
                wVarL.a(0);
                return messagetypeO;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.j(messagetypeO);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MessageType f(w wVar) throws InvalidProtocolBufferException {
        return o(wVar, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MessageType w(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) v(inputStream, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public MessageType v(InputStream inputStream, p0 p0Var) throws InvalidProtocolBufferException {
        w wVarJ = w.j(inputStream);
        MessageType messagetypeO = o(wVarJ, p0Var);
        try {
            wVarJ.a(0);
            return messagetypeO;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.j(messagetypeO);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessageType d(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) h(bArr, 0, bArr.length, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public MessageType x(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) h(bArr, i10, i11, f22394a);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: Z */
    public MessageType h(byte[] bArr, int i10, int i11, p0 p0Var) throws InvalidProtocolBufferException {
        try {
            w wVarQ = w.q(bArr, i10, i11);
            MessageType messagetypeO = o(wVarQ, p0Var);
            try {
                wVarQ.a(0);
                return messagetypeO;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.j(messagetypeO);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.p2
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessageType c(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (MessageType) h(bArr, 0, bArr.length, p0Var);
    }
}
