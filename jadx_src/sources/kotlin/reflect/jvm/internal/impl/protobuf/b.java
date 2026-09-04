package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<MessageType extends n> implements p<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f127314a = f.c();

    private MessageType e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.l()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).b() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return (MessageType) e(j(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType b(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return (MessageType) e(k(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType c(d dVar, f fVar) throws InvalidProtocolBufferException {
        return (MessageType) e(l(dVar, fVar));
    }

    public MessageType j(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) k(new a.AbstractC1169a.C1170a(inputStream, e.B(i10, inputStream)), fVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        e eVarG = e.g(inputStream);
        MessageType messagetypeD = d(eVarG, fVar);
        try {
            eVarG.a(0);
            return messagetypeD;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetypeD);
        }
    }

    public MessageType l(d dVar, f fVar) throws InvalidProtocolBufferException {
        try {
            e eVarT = dVar.t();
            MessageType messagetypeD = d(eVarT, fVar);
            try {
                eVarT.a(0);
                return messagetypeD;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.i(messagetypeD);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }
}
