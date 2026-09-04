package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: ProtoBufUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T a(@dl.d GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @dl.d GeneratedMessageLite.f<M, T> extension) {
        f0.p(extendableMessage, "<this>");
        f0.p(extension, "extension");
        if (extendableMessage.x(extension)) {
            return (T) extendableMessage.p(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T b(@dl.d GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @dl.d GeneratedMessageLite.f<M, List<T>> extension, int i10) {
        f0.p(extendableMessage, "<this>");
        f0.p(extension, "extension");
        if (i10 < extendableMessage.s(extension)) {
            return (T) extendableMessage.q(extension, i10);
        }
        return null;
    }
}
