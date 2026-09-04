package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j2 f22511a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j2 f22512b = new k2();

    l2() {
    }

    static j2 a() {
        return f22511a;
    }

    static j2 b() {
        return f22512b;
    }

    private static j2 c() {
        try {
            return (j2) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
