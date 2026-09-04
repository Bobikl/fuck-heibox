package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q0<?> f22597a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q0<?> f22598b = c();

    s0() {
    }

    static q0<?> a() {
        q0<?> q0Var = f22598b;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q0<?> b() {
        return f22597a;
    }

    private static q0<?> c() {
        try {
            return (q0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
