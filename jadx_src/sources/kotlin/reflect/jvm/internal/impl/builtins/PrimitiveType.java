package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, still in use, count: 1, list:
  (r0v1 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) from 0x006e: FILLED_NEW_ARRAY 
  (r0v1 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r1v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r4v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r6v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r8v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r10v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r12v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
 A[WRAPPED] elemType: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PrimitiveType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    @dl.d
    @xh.e
    public static final Set<PrimitiveType> NUMBER_TYPES = d1.u(new PrimitiveType("Char"), new PrimitiveType("Byte"), new PrimitiveType("Short"), new PrimitiveType("Int"), new PrimitiveType("Float"), new PrimitiveType("Long"), new PrimitiveType("Double"));

    @dl.d
    private final z arrayTypeFqName$delegate;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f arrayTypeName;

    @dl.d
    private final z typeFqName$delegate;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    @dl.d
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: PrimitiveType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    static {
    }

    private PrimitiveType(String str) {
        super(str, i);
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(str);
        f0.o(fVarF, "identifier(typeName)");
        this.typeName = fVarF;
        kotlin.reflect.jvm.internal.impl.name.f fVarF2 = kotlin.reflect.jvm.internal.impl.name.f.f(str + "Array");
        f0.o(fVarF2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = fVarF2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = b0.b(lazyThreadSafetyMode, new yh.a<kotlin.reflect.jvm.internal.impl.name.c>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$typeFqName$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
                kotlin.reflect.jvm.internal.impl.name.c cVarC = h.f125412u.c(this.f125340b.getTypeName());
                f0.o(cVarC, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
                return cVarC;
            }
        });
        this.arrayTypeFqName$delegate = b0.b(lazyThreadSafetyMode, new yh.a<kotlin.reflect.jvm.internal.impl.name.c>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$arrayTypeFqName$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
                kotlin.reflect.jvm.internal.impl.name.c cVarC = h.f125412u.c(this.f125339b.getArrayTypeName());
                f0.o(cVarC, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
                return cVarC;
            }
        });
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.c getArrayTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.c) this.arrayTypeFqName$delegate.getValue();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.c getTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.c) this.typeFqName$delegate.getValue();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
