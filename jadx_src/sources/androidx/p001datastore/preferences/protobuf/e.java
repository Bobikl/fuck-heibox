package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f22441a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f22442b;

    static {
        f22442b = a("org.robolectric.Robolectric") != null;
    }

    e() {
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f22441a;
    }

    static boolean c() {
        return (f22441a == null || f22442b) ? false : true;
    }
}
