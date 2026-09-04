package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.f0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnsignedArrayType {
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b bVarE = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UByteArray");
        f0.o(bVarE, "fromString(\"kotlin/UByteArray\")");
        UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, bVarE);
        kotlin.reflect.jvm.internal.impl.name.b bVarE2 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UShortArray");
        f0.o(bVarE2, "fromString(\"kotlin/UShortArray\")");
        USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, bVarE2);
        kotlin.reflect.jvm.internal.impl.name.b bVarE3 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UIntArray");
        f0.o(bVarE3, "fromString(\"kotlin/UIntArray\")");
        UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, bVarE3);
        kotlin.reflect.jvm.internal.impl.name.b bVarE4 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/ULongArray");
        f0.o(bVarE4, "fromString(\"kotlin/ULongArray\")");
        ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, bVarE4);
        $VALUES = $values();
    }

    private UnsignedArrayType(String str, int i10, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        super(str, i10);
        this.classId = bVar;
        kotlin.reflect.jvm.internal.impl.name.f fVarJ = bVar.j();
        f0.o(fVarJ, "classId.shortClassName");
        this.typeName = fVarJ;
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
