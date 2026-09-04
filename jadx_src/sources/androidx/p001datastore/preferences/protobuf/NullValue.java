package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes6.dex */
public enum NullValue implements i1.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final i1.d<NullValue> internalValueMap = new i1.d<NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.a
        @Override // androidx.datastore.preferences.protobuf.i1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NullValue a(int i10) {
            return NullValue.forNumber(i10);
        }
    };
    private final int value;

    public static final class b implements i1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i1.e f22320a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.i1.e
        public boolean a(int i10) {
            return NullValue.forNumber(i10) != null;
        }
    }

    NullValue(int i10) {
        this.value = i10;
    }

    public static NullValue forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static i1.d<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static i1.e internalGetVerifier() {
        return b.f22320a;
    }

    @Deprecated
    public static NullValue valueOf(int i10) {
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
