package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes6.dex */
public enum Syntax implements i1.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final i1.d<Syntax> internalValueMap = new i1.d<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.a
        @Override // androidx.datastore.preferences.protobuf.i1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Syntax a(int i10) {
            return Syntax.forNumber(i10);
        }
    };
    private final int value;

    public static final class b implements i1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i1.e f22340a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public boolean a(int i10) {
            return Syntax.forNumber(i10) != null;
        }
    }

    Syntax(int i10) {
        this.value = i10;
    }

    public static Syntax forNumber(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static i1.d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static i1.e internalGetVerifier() {
        return b.f22340a;
    }

    @Deprecated
    public static Syntax valueOf(int i10) {
        return forNumber(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.i1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
