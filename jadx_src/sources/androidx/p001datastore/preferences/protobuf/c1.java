package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class c1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c1 f22403a = new c1();

    private c1() {
    }

    public static c1 c() {
        return f22403a;
    }

    @Override // androidx.p001datastore.preferences.protobuf.y1
    public x1 a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (x1) GeneratedMessageLite.T1(cls.asSubclass(GeneratedMessageLite.class)).C1();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.y1
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
