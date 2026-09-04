package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.z0;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: DescriptorUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.c f127544a = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmName");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f127545b = false;

    private d() {
    }

    public static boolean A(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return D(kVar, ClassKind.ENUM_CLASS);
    }

    public static boolean B(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(36);
        }
        return D(kVar, ClassKind.ENUM_ENTRY);
    }

    public static boolean C(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return D(kVar, ClassKind.INTERFACE);
    }

    private static boolean D(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d ClassKind classKind) {
        if (classKind == null) {
            a(37);
        }
        return (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).b() == classKind;
    }

    public static boolean E(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(1);
        }
        while (kVar != null) {
            if (u(kVar) || y(kVar)) {
                return true;
            }
            kVar = kVar.c();
        }
        return false;
    }

    private static boolean F(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (d0Var == null) {
            a(30);
        }
        if (kVar == null) {
            a(31);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarA = fVarD.a();
        return (kVarA instanceof kotlin.reflect.jvm.internal.impl.descriptors.f) && (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.f) && ((kotlin.reflect.jvm.internal.impl.descriptors.f) kVar).r().equals(((kotlin.reflect.jvm.internal.impl.descriptors.f) kVarA).r());
    }

    public static boolean G(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return (D(kVar, ClassKind.CLASS) || D(kVar, ClassKind.INTERFACE)) && ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).l() == Modality.SEALED;
    }

    public static boolean H(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar2) {
        if (dVar == null) {
            a(28);
        }
        if (dVar2 == null) {
            a(29);
        }
        return I(dVar.v(), dVar2.a());
    }

    public static boolean I(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (d0Var == null) {
            a(32);
        }
        if (kVar == null) {
            a(33);
        }
        if (F(d0Var, kVar)) {
            return true;
        }
        Iterator<d0> it = d0Var.O0().l().iterator();
        while (it.hasNext()) {
            if (I(it.next(), kVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return kVar != null && (kVar.c() instanceof g0);
    }

    public static boolean K(@dl.d d1 d1Var, @dl.d d0 d0Var) {
        if (d1Var == null) {
            a(63);
        }
        if (d0Var == null) {
            a(64);
        }
        if (d1Var.G() || e0.a(d0Var)) {
            return false;
        }
        if (i1.b(d0Var)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.builtins.g gVarJ = DescriptorUtilsKt.j(d1Var);
        if (!kotlin.reflect.jvm.internal.impl.builtins.g.r0(d0Var)) {
            kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f128071a;
            if (!eVar.a(gVarJ.W(), d0Var) && !eVar.a(gVarJ.K().v(), d0Var) && !eVar.a(gVarJ.i(), d0Var)) {
                kotlin.reflect.jvm.internal.impl.builtins.j jVar = kotlin.reflect.jvm.internal.impl.builtins.j.f125471a;
                if (!kotlin.reflect.jvm.internal.impl.builtins.j.d(d0Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    @dl.d
    public static <D extends CallableMemberDescriptor> D L(@dl.d D d10) {
        if (d10 == null) {
            a(59);
        }
        while (d10.b() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> collectionF = d10.f();
            if (collectionF.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
            }
            d10 = (D) collectionF.iterator().next();
        }
        return d10;
    }

    @dl.d
    public static <D extends o> D M(@dl.d D d10) {
        if (d10 == null) {
            a(61);
        }
        if (d10 instanceof CallableMemberDescriptor) {
            return L((CallableMemberDescriptor) d10);
        }
        if (d10 == null) {
            a(62);
        }
        return d10;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = p7.a.f135567e;
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.vss.g.H2;
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
        if (kVar == null) {
            a(16);
        }
        if (kVar2 == null) {
            a(17);
        }
        return g(kVar).equals(g(kVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(@dl.d D d10, @dl.d Set<D> set) {
        if (d10 == null) {
            a(70);
        }
        if (set == 0) {
            a(71);
        }
        if (set.contains(d10)) {
            return;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> it = d10.a().f().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVarA = it.next().a();
            c(aVarA, set);
            set.add(aVarA);
        }
    }

    @dl.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> d(@dl.d D d10) {
        if (d10 == null) {
            a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d10.a(), linkedHashSet);
        return linkedHashSet;
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.d e(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(45);
        }
        return f(d0Var.O0());
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.d f(@dl.d z0 z0Var) {
        if (z0Var == null) {
            a(46);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) z0Var.d();
        if (dVar == null) {
            a(47);
        }
        return dVar;
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.d0 g(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(21);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d0 d0VarH = h(kVar);
        if (d0VarH == null) {
            a(22);
        }
        return d0VarH;
    }

    @dl.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.d0 h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(23);
        }
        while (kVar != null) {
            if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d0) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.d0) kVar;
            }
            if (kVar instanceof k0) {
                return ((k0) kVar).I0();
            }
            kVar = kVar.c();
        }
        return null;
    }

    @dl.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.d0 i(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(20);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD == null) {
            return null;
        }
        return h(fVarD);
    }

    @dl.d
    public static u0 j(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(79);
        }
        if (kVar instanceof q0) {
            kVar = ((q0) kVar).n0();
        }
        if (kVar instanceof n) {
            u0 u0VarB = ((n) kVar).j().b();
            if (u0VarB == null) {
                a(80);
            }
            return u0VarB;
        }
        u0 u0Var = u0.f125943a;
        if (u0Var == null) {
            a(81);
        }
        return u0Var;
    }

    @dl.d
    public static s k(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, boolean z10) {
        if (dVar == null) {
            a(48);
        }
        ClassKind classKindB = dVar.b();
        if (classKindB == ClassKind.ENUM_CLASS || classKindB.isSingleton()) {
            s sVar = r.f125864a;
            if (sVar == null) {
                a(49);
            }
            return sVar;
        }
        if (G(dVar)) {
            if (z10) {
                s sVar2 = r.f125866c;
                if (sVar2 == null) {
                    a(50);
                }
                return sVar2;
            }
            s sVar3 = r.f125864a;
            if (sVar3 == null) {
                a(51);
            }
            return sVar3;
        }
        if (u(dVar)) {
            s sVar4 = r.f125875l;
            if (sVar4 == null) {
                a(52);
            }
            return sVar4;
        }
        s sVar5 = r.f125868e;
        if (sVar5 == null) {
            a(53);
        }
        return sVar5;
    }

    @dl.e
    public static r0 l(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(0);
        }
        if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).b0();
        }
        return null;
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.name.d m(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(2);
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarO = o(kVar);
        return cVarO != null ? cVarO.j() : p(kVar);
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.name.c n(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(3);
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarO = o(kVar);
        if (cVarO == null) {
            cVarO = p(kVar).l();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    @dl.e
    private static kotlin.reflect.jvm.internal.impl.name.c o(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(5);
        }
        if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d0) || kotlin.reflect.jvm.internal.impl.types.error.h.m(kVar)) {
            return kotlin.reflect.jvm.internal.impl.name.c.f127194c;
        }
        if (kVar instanceof k0) {
            return ((k0) kVar).e();
        }
        if (kVar instanceof g0) {
            return ((g0) kVar).e();
        }
        return null;
    }

    @dl.d
    private static kotlin.reflect.jvm.internal.impl.name.d p(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(6);
        }
        kotlin.reflect.jvm.internal.impl.name.d dVarC = m(kVar.c()).c(kVar.getName());
        if (dVarC == null) {
            a(7);
        }
        return dVarC;
    }

    @dl.e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> D q(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(kVar, cls, true);
    }

    @dl.e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> D r(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d Class<D> cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (kVar == null) {
            return null;
        }
        if (z10) {
            kVar = (D) kVar.c();
        }
        while (kVar != null) {
            if (cls.isInstance(kVar)) {
                return (D) kVar;
            }
            kVar = (D) kVar.c();
        }
        return null;
    }

    @dl.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.d s(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(44);
        }
        Iterator<d0> it = dVar.r().l().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarE = e(it.next());
            if (dVarE.b() != ClassKind.INTERFACE) {
                return dVarE;
            }
        }
        return null;
    }

    public static boolean t(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return D(kVar, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean u(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(34);
        }
        return v(kVar) && kVar.getName().equals(kotlin.reflect.jvm.internal.impl.name.h.f127210b);
    }

    public static boolean v(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return D(kVar, ClassKind.CLASS);
    }

    public static boolean w(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return v(kVar) || A(kVar);
    }

    public static boolean x(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return D(kVar, ClassKind.OBJECT) && ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).r0();
    }

    public static boolean y(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        return (kVar instanceof o) && ((o) kVar).getVisibility() == r.f125869f;
    }

    public static boolean z(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar2) {
        if (dVar == null) {
            a(26);
        }
        if (dVar2 == null) {
            a(27);
        }
        Iterator<d0> it = dVar.r().l().iterator();
        while (it.hasNext()) {
            if (F(it.next(), dVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
