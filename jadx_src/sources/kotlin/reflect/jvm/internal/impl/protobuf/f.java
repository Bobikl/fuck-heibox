package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f127342b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f127343c = new f(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.f<?, ?>> f127344a;

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f127345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f127346b;

        a(Object obj, int i10) {
            this.f127345a = obj;
            this.f127346b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f127345a == aVar.f127345a && this.f127346b == aVar.f127346b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f127345a) * 65535) + this.f127346b;
        }
    }

    f() {
        this.f127344a = new HashMap();
    }

    private f(boolean z10) {
        this.f127344a = Collections.emptyMap();
    }

    public static f c() {
        return f127343c;
    }

    public static f d() {
        return new f();
    }

    public final void a(GeneratedMessageLite.f<?, ?> fVar) {
        this.f127344a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends n> GeneratedMessageLite.f<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.f) this.f127344a.get(new a(containingtype, i10));
    }
}
