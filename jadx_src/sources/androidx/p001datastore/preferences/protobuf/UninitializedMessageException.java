package androidx.p001datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f22341b;

    public UninitializedMessageException(z1 z1Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f22341b = null;
    }

    public UninitializedMessageException(List<String> list) {
        super(b(list));
        this.f22341b = list;
    }

    private static String b(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> c() {
        return Collections.unmodifiableList(this.f22341b);
    }
}
