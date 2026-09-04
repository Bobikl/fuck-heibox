package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class WireFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f22349a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f22350b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f22351c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f22352d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f22353e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22354f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22355g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22356h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22357i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f22358j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22359k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f22360l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f22361m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f22362n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f22363o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f22364p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f22365q = c(1, 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f22366r = c(1, 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f22367s = c(2, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f22368t = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType BOOL;
        public static final FieldType BYTES;
        public static final FieldType DOUBLE;
        public static final FieldType ENUM;
        public static final FieldType FIXED32;
        public static final FieldType FIXED64;
        public static final FieldType FLOAT;
        public static final FieldType GROUP;
        public static final FieldType INT32;
        public static final FieldType INT64;
        public static final FieldType MESSAGE;
        public static final FieldType SFIXED32;
        public static final FieldType SFIXED64;
        public static final FieldType SINT32;
        public static final FieldType SINT64;
        public static final FieldType STRING;
        public static final FieldType UINT32;
        public static final FieldType UINT64;
        private final JavaType javaType;
        private final int wireType;

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            INT64 = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            UINT64 = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            INT32 = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            FIXED64 = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            FIXED32 = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            FieldType fieldType9 = new FieldType("STRING", 8, JavaType.STRING, 2) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.1
                {
                    a aVar = null;
                }

                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            STRING = fieldType9;
            JavaType javaType3 = JavaType.MESSAGE;
            FieldType fieldType10 = new FieldType("GROUP", 9, javaType3, 3) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.2
                {
                    a aVar = null;
                }

                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            GROUP = fieldType10;
            int i10 = 2;
            FieldType fieldType11 = new FieldType("MESSAGE", 10, javaType3, i10) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.3
                {
                    a aVar = null;
                }

                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            MESSAGE = fieldType11;
            FieldType fieldType12 = new FieldType("BYTES", 11, JavaType.BYTE_STRING, i10) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.4
                {
                    a aVar = null;
                }

                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            BYTES = fieldType12;
            FieldType fieldType13 = new FieldType("UINT32", 12, javaType2, 0);
            UINT32 = fieldType13;
            FieldType fieldType14 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            ENUM = fieldType14;
            FieldType fieldType15 = new FieldType("SFIXED32", 14, javaType2, 5);
            SFIXED32 = fieldType15;
            FieldType fieldType16 = new FieldType("SFIXED64", 15, javaType, 1);
            SFIXED64 = fieldType16;
            FieldType fieldType17 = new FieldType("SINT32", 16, javaType2, 0);
            SINT32 = fieldType17;
            FieldType fieldType18 = new FieldType("SINT64", 17, javaType, 0);
            SINT64 = fieldType18;
            $VALUES = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        private FieldType(String str, int i10, JavaType javaType, int i11) {
            super(str, i10);
            this.javaType = javaType;
            this.wireType = i11;
        }

        /* synthetic */ FieldType(String str, int i10, JavaType javaType, int i11, a aVar) {
            this(str, i10, javaType, i11);
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f22239f),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        JavaType(Object obj) {
            this.defaultDefault = obj;
        }

        Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    public enum Utf8Validation {
        LOOSE { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            Object readString(w wVar) throws IOException {
                return wVar.W();
            }
        },
        STRICT { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            Object readString(w wVar) throws IOException {
                return wVar.X();
            }
        },
        LAZY { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            Object readString(w wVar) throws IOException {
                return wVar.x();
            }
        };

        /* synthetic */ Utf8Validation(a aVar) {
            this();
        }

        abstract Object readString(w wVar) throws IOException;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22369a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f22369a = iArr;
            try {
                iArr[FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22369a[FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22369a[FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22369a[FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22369a[FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22369a[FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22369a[FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22369a[FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22369a[FieldType.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22369a[FieldType.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22369a[FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22369a[FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22369a[FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22369a[FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22369a[FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22369a[FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22369a[FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22369a[FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private WireFormat() {
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    static Object d(w wVar, FieldType fieldType, Utf8Validation utf8Validation) throws IOException {
        switch (a.f22369a[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(wVar.y());
            case 2:
                return Float.valueOf(wVar.C());
            case 3:
                return Long.valueOf(wVar.G());
            case 4:
                return Long.valueOf(wVar.a0());
            case 5:
                return Integer.valueOf(wVar.F());
            case 6:
                return Long.valueOf(wVar.B());
            case 7:
                return Integer.valueOf(wVar.A());
            case 8:
                return Boolean.valueOf(wVar.u());
            case 9:
                return wVar.x();
            case 10:
                return Integer.valueOf(wVar.Z());
            case 11:
                return Integer.valueOf(wVar.S());
            case 12:
                return Long.valueOf(wVar.T());
            case 13:
                return Integer.valueOf(wVar.U());
            case 14:
                return Long.valueOf(wVar.V());
            case 15:
                return utf8Validation.readString(wVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
