package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f127307b;

    public UninitializedMessageException(n nVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f127307b = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
