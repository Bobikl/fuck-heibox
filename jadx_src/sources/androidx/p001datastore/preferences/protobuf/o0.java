package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f22563a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Class<?> f22564b = e();

    o0() {
    }

    public static p0 a() {
        if (f22564b != null) {
            try {
                return c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new p0();
    }

    public static p0 b() {
        if (f22564b != null) {
            try {
                return c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return p0.f22574g;
    }

    private static final p0 c(String str) throws Exception {
        return (p0) f22564b.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    static boolean d(p0 p0Var) {
        Class<?> cls = f22564b;
        return cls != null && cls.isAssignableFrom(p0Var.getClass());
    }

    static Class<?> e() {
        try {
            return Class.forName(f22563a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
