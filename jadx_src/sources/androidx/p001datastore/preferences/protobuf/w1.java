package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u1 f22702a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u1 f22703b = new v1();

    w1() {
    }

    static u1 a() {
        return f22702a;
    }

    static u1 b() {
        return f22703b;
    }

    private static u1 c() {
        try {
            return (u1) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
