package androidx.p001datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: FieldInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t0 implements Comparable<t0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f22605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FieldType f22606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<?> f22607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Field f22609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m2 f22613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Field f22614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Class<?> f22615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f22616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i1.e f22617n;

    /* JADX INFO: compiled from: FieldInfo.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22618a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f22618a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22618a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22618a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22618a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Field f22619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FieldType f22620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Field f22622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f22625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private m2 f22626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Class<?> f22627i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f22628j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private i1.e f22629k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Field f22630l;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public t0 a() {
            m2 m2Var = this.f22626h;
            if (m2Var != null) {
                return t0.f(this.f22621c, this.f22620b, m2Var, this.f22627i, this.f22625g, this.f22629k);
            }
            Object obj = this.f22628j;
            if (obj != null) {
                return t0.e(this.f22619a, this.f22621c, obj, this.f22629k);
            }
            Field field = this.f22622d;
            if (field != null) {
                return this.f22624f ? t0.j(this.f22619a, this.f22621c, this.f22620b, field, this.f22623e, this.f22625g, this.f22629k) : t0.i(this.f22619a, this.f22621c, this.f22620b, field, this.f22623e, this.f22625g, this.f22629k);
            }
            i1.e eVar = this.f22629k;
            if (eVar != null) {
                Field field2 = this.f22630l;
                return field2 == null ? t0.d(this.f22619a, this.f22621c, this.f22620b, eVar) : t0.h(this.f22619a, this.f22621c, this.f22620b, eVar, field2);
            }
            Field field3 = this.f22630l;
            return field3 == null ? t0.c(this.f22619a, this.f22621c, this.f22620b, this.f22625g) : t0.g(this.f22619a, this.f22621c, this.f22620b, field3);
        }

        public b b(Field field) {
            this.f22630l = field;
            return this;
        }

        public b c(boolean z10) {
            this.f22625g = z10;
            return this;
        }

        public b d(i1.e eVar) {
            this.f22629k = eVar;
            return this;
        }

        public b e(Field field) {
            if (this.f22626h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f22619a = field;
            return this;
        }

        public b f(int i10) {
            this.f22621c = i10;
            return this;
        }

        public b g(Object obj) {
            this.f22628j = obj;
            return this;
        }

        public b h(m2 m2Var, Class<?> cls) {
            if (this.f22619a != null || this.f22622d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f22626h = m2Var;
            this.f22627i = cls;
            return this;
        }

        public b i(Field field, int i10) {
            this.f22622d = (Field) i1.e(field, "presenceField");
            this.f22623e = i10;
            return this;
        }

        public b j(boolean z10) {
            this.f22624f = z10;
            return this;
        }

        public b k(FieldType fieldType) {
            this.f22620b = fieldType;
            return this;
        }
    }

    private t0(Field field, int i10, FieldType fieldType, Class<?> cls, Field field2, int i11, boolean z10, boolean z11, m2 m2Var, Class<?> cls2, Object obj, i1.e eVar, Field field3) {
        this.f22605b = field;
        this.f22606c = fieldType;
        this.f22607d = cls;
        this.f22608e = i10;
        this.f22609f = field2;
        this.f22610g = i11;
        this.f22611h = z10;
        this.f22612i = z11;
        this.f22613j = m2Var;
        this.f22615l = cls2;
        this.f22616m = obj;
        this.f22617n = eVar;
        this.f22614k = field3;
    }

    private static boolean A(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    public static b I() {
        return new b(null);
    }

    private static void a(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static t0 c(Field field, int i10, FieldType fieldType, boolean z10) {
        a(i10);
        i1.e(field, "field");
        i1.e(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new t0(field, i10, fieldType, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static t0 d(Field field, int i10, FieldType fieldType, i1.e eVar) {
        a(i10);
        i1.e(field, "field");
        return new t0(field, i10, fieldType, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static t0 e(Field field, int i10, Object obj, i1.e eVar) {
        i1.e(obj, "mapDefaultEntry");
        a(i10);
        i1.e(field, "field");
        return new t0(field, i10, FieldType.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static t0 f(int i10, FieldType fieldType, m2 m2Var, Class<?> cls, boolean z10, i1.e eVar) {
        a(i10);
        i1.e(fieldType, "fieldType");
        i1.e(m2Var, "oneof");
        i1.e(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new t0(null, i10, fieldType, null, null, 0, false, z10, m2Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + fieldType);
    }

    public static t0 g(Field field, int i10, FieldType fieldType, Field field2) {
        a(i10);
        i1.e(field, "field");
        i1.e(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new t0(field, i10, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static t0 h(Field field, int i10, FieldType fieldType, i1.e eVar, Field field2) {
        a(i10);
        i1.e(field, "field");
        return new t0(field, i10, fieldType, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static t0 i(Field field, int i10, FieldType fieldType, Field field2, int i11, boolean z10, i1.e eVar) {
        a(i10);
        i1.e(field, "field");
        i1.e(fieldType, "fieldType");
        i1.e(field2, "presenceField");
        if (field2 == null || A(i11)) {
            return new t0(field, i10, fieldType, null, field2, i11, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static t0 j(Field field, int i10, FieldType fieldType, Field field2, int i11, boolean z10, i1.e eVar) {
        a(i10);
        i1.e(field, "field");
        i1.e(fieldType, "fieldType");
        i1.e(field2, "presenceField");
        if (field2 == null || A(i11)) {
            return new t0(field, i10, fieldType, null, field2, i11, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static t0 k(Field field, int i10, FieldType fieldType, Class<?> cls) {
        a(i10);
        i1.e(field, "field");
        i1.e(fieldType, "fieldType");
        i1.e(cls, "messageClass");
        return new t0(field, i10, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    public boolean C() {
        return this.f22611h;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(t0 t0Var) {
        return this.f22608e - t0Var.f22608e;
    }

    public Field l() {
        return this.f22614k;
    }

    public i1.e m() {
        return this.f22617n;
    }

    public Field n() {
        return this.f22605b;
    }

    public int o() {
        return this.f22608e;
    }

    public Class<?> p() {
        return this.f22607d;
    }

    public Object q() {
        return this.f22616m;
    }

    public Class<?> r() {
        int i10 = a.f22618a[this.f22606c.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Field field = this.f22605b;
            return field != null ? field.getType() : this.f22615l;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f22607d;
        }
        return null;
    }

    public m2 s() {
        return this.f22613j;
    }

    public Class<?> t() {
        return this.f22615l;
    }

    public Field w() {
        return this.f22609f;
    }

    public int x() {
        return this.f22610g;
    }

    public FieldType y() {
        return this.f22606c;
    }

    public boolean z() {
        return this.f22612i;
    }
}
