package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.f0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
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
public final class UnsignedType {
    private static final /* synthetic */ UnsignedType[] $VALUES;
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b arrayClassId;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b bVarE = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UByte");
        f0.o(bVarE, "fromString(\"kotlin/UByte\")");
        UBYTE = new UnsignedType("UBYTE", 0, bVarE);
        kotlin.reflect.jvm.internal.impl.name.b bVarE2 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UShort");
        f0.o(bVarE2, "fromString(\"kotlin/UShort\")");
        USHORT = new UnsignedType("USHORT", 1, bVarE2);
        kotlin.reflect.jvm.internal.impl.name.b bVarE3 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UInt");
        f0.o(bVarE3, "fromString(\"kotlin/UInt\")");
        UINT = new UnsignedType("UINT", 2, bVarE3);
        kotlin.reflect.jvm.internal.impl.name.b bVarE4 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/ULong");
        f0.o(bVarE4, "fromString(\"kotlin/ULong\")");
        ULONG = new UnsignedType("ULONG", 3, bVarE4);
        $VALUES = $values();
    }

    private UnsignedType(String str, int i10, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        super(str, i10);
        this.classId = bVar;
        kotlin.reflect.jvm.internal.impl.name.f fVarJ = bVar.j();
        f0.o(fVarJ, "classId.shortClassName");
        this.typeName = fVarJ;
        this.arrayClassId = new kotlin.reflect.jvm.internal.impl.name.b(bVar.h(), kotlin.reflect.jvm.internal.impl.name.f.f(fVarJ.b() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b getArrayClassId() {
        return this.arrayClassId;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b getClassId() {
        return this.classId;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
