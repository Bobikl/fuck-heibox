package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.r0;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@d
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<String> f130517b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @r0
    public MissingFieldException(@dl.d String missingField) {
        this(kotlin.collections.s.k(missingField), "Field '" + missingField + "' is required, but it was missing", null);
        f0.p(missingField, "missingField");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@dl.d String missingField, @dl.d String serialName) {
        this(kotlin.collections.s.k(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
        f0.p(missingField, "missingField");
        f0.p(serialName, "serialName");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(@dl.d List<String> missingFields, @dl.d String serialName) {
        String str;
        f0.p(missingFields, "missingFields");
        f0.p(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@dl.d List<String> missingFields, @dl.e String str, @dl.e Throwable th2) {
        super(str, th2);
        f0.p(missingFields, "missingFields");
        this.f130517b = missingFields;
    }

    @dl.d
    public final List<String> a() {
        return this.f130517b;
    }
}
