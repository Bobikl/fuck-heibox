package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import yh.l;

/* JADX INFO: compiled from: KotlinBuiltIns.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.f f125376g = kotlin.reflect.jvm.internal.impl.name.f.i("<built-ins module>");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f125377h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ModuleDescriptorImpl f125378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.storage.h<ModuleDescriptorImpl> f125379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<e> f125380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<Collection<k0>> f125381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> f125382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f125383f;

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class a implements yh.a<Collection<k0>> {
        a() {
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<k0> invoke() {
            return Arrays.asList(g.this.r().R(h.f125412u), g.this.r().R(h.f125414w), g.this.r().R(h.f125415x), g.this.r().R(h.f125413v));
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class b implements yh.a<e> {
        b() {
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                j0 j0VarQ = g.this.q(primitiveType.getTypeName().b());
                j0 j0VarQ2 = g.this.q(primitiveType.getArrayTypeName().b());
                enumMap.put(primitiveType, j0VarQ2);
                map.put(j0VarQ, j0VarQ2);
                map2.put(j0VarQ2, j0VarQ);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class c implements l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> {
        c() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.d invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = g.this.s().h(fVar, NoLookupLocation.FROM_BUILTINS);
            if (fVarH == null) {
                throw new AssertionError("Built-in class " + h.f125412u.c(fVar) + " is not found");
            }
            if (fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + fVarH);
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class d implements yh.a<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ModuleDescriptorImpl f125387b;

        d(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f125387b = moduleDescriptorImpl;
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (g.this.f125378a == null) {
                g.this.f125378a = this.f125387b;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + g.this.f125378a + " (attempting to reset to " + this.f125387b + ")");
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<PrimitiveType, j0> f125389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<d0, j0> f125390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<j0, j0> f125391c;

        private e(@dl.d Map<PrimitiveType, j0> map, @dl.d Map<d0, j0> map2, @dl.d Map<j0, j0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f125389a = map;
            this.f125390b = map2;
            this.f125391c = map3;
        }

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    protected g(@dl.d m mVar) {
        if (mVar == null) {
            a(0);
        }
        this.f125383f = mVar;
        this.f125381d = mVar.c(new a());
        this.f125380c = mVar.c(new b());
        this.f125382e = mVar.a(new c());
    }

    @dl.e
    private static d0 A(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var2) {
        kotlin.reflect.jvm.internal.impl.name.b bVarK;
        kotlin.reflect.jvm.internal.impl.name.b bVarA;
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA;
        if (d0Var == null) {
            a(71);
        }
        if (d0Var2 == null) {
            a(72);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD == null) {
            return null;
        }
        j jVar = j.f125471a;
        if (!jVar.b(fVarD.getName()) || (bVarK = DescriptorUtilsKt.k(fVarD)) == null || (bVarA = jVar.a(bVarK)) == null || (dVarA = FindClassInModuleKt.a(d0Var2, bVarA)) == null) {
            return null;
        }
        return dVarA.v();
    }

    public static boolean A0(@dl.d k kVar) {
        if (kVar == null) {
            a(10);
        }
        while (kVar != null) {
            if (kVar instanceof g0) {
                return ((g0) kVar).e().i(h.f125411t);
            }
            kVar = kVar.c();
        }
        return false;
    }

    public static boolean B0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(142);
        }
        return l0(d0Var, h.a.f125428f);
    }

    public static boolean C0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(132);
        }
        return w0(d0Var) || z0(d0Var) || x0(d0Var) || y0(d0Var);
    }

    @dl.e
    public static PrimitiveType N(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(92);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD == null) {
            return null;
        }
        return P(fVarD);
    }

    @dl.e
    public static PrimitiveType P(@dl.d k kVar) {
        if (kVar == null) {
            a(77);
        }
        if (h.a.H0.contains(kVar.getName())) {
            return h.a.J0.get(kotlin.reflect.jvm.internal.impl.resolve.d.m(kVar));
        }
        return null;
    }

    @dl.d
    private kotlin.reflect.jvm.internal.impl.descriptors.d Q(@dl.d PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(16);
        }
        return p(primitiveType.getTypeName().b());
    }

    @dl.e
    public static PrimitiveType S(@dl.d k kVar) {
        if (kVar == null) {
            a(76);
        }
        if (h.a.G0.contains(kVar.getName())) {
            return h.a.I0.get(kotlin.reflect.jvm.internal.impl.resolve.d.m(kVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case bb.c.b.f30528b0 /* 157 */:
            case 158:
            case 159:
            case 160:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case bb.c.b.f30528b0 /* 157 */:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean a0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(108);
        }
        return e(dVar, h.a.f125420b);
    }

    public static boolean b0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(139);
        }
        return g0(d0Var, h.a.f125420b);
    }

    public static boolean c0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(88);
        }
        return g0(d0Var, h.a.f125434i);
    }

    public static boolean d0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(89);
        }
        return e(dVar, h.a.f125434i) || P(dVar) != null;
    }

    private static boolean e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (fVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return fVar.getName().equals(dVar.i()) && dVar.equals(kotlin.reflect.jvm.internal.impl.resolve.d.m(fVar));
    }

    public static boolean e0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(90);
        }
        return c0(d0Var) || p0(d0Var);
    }

    public static boolean f0(@dl.d k kVar) {
        if (kVar == null) {
            a(9);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.d.r(kVar, kotlin.reflect.jvm.internal.impl.builtins.a.class, false) != null;
    }

    private static boolean g0(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (d0Var == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return v0(d0Var.O0(), dVar);
    }

    private static boolean h0(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (d0Var == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return g0(d0Var, dVar) && !d0Var.P0();
    }

    public static boolean i0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(141);
        }
        return o0(d0Var);
    }

    public static boolean j0(@dl.d k kVar) {
        if (kVar == null) {
            a(161);
        }
        if (kVar.a().getAnnotations().J1(h.a.f125466y)) {
            return true;
        }
        if (!(kVar instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) kVar;
        boolean zG = o0Var.G();
        p0 getter = o0Var.getGetter();
        q0 setter = o0Var.getSetter();
        if (getter != null && j0(getter)) {
            if (!zG) {
                return true;
            }
            if (setter != null && j0(setter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(158);
        }
        return e(dVar, h.a.f125435i0);
    }

    private static boolean l0(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (d0Var == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !d0Var.P0() && g0(d0Var, dVar);
    }

    public static boolean m0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(136);
        }
        return n0(d0Var) && !i1.l(d0Var);
    }

    public static boolean n0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(138);
        }
        return g0(d0Var, h.a.f125422c);
    }

    public static boolean o0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(140);
        }
        return b0(d0Var) && d0Var.P0();
    }

    @dl.d
    private kotlin.reflect.jvm.internal.impl.descriptors.d p(@dl.d String str) {
        if (str == null) {
            a(14);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarInvoke = this.f125382e.invoke(kotlin.reflect.jvm.internal.impl.name.f.f(str));
        if (dVarInvoke == null) {
            a(15);
        }
        return dVarInvoke;
    }

    public static boolean p0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(91);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        return (fVarD == null || P(fVarD) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dl.d
    public j0 q(@dl.d String str) {
        if (str == null) {
            a(46);
        }
        j0 j0VarV = p(str).v();
        if (j0VarV == null) {
            a(47);
        }
        return j0VarV;
    }

    public static boolean q0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(96);
        }
        return S(dVar) != null;
    }

    public static boolean r0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(94);
        }
        return !d0Var.P0() && s0(d0Var);
    }

    public static boolean s0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(95);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        return (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && q0((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
    }

    public static boolean t0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(107);
        }
        return e(dVar, h.a.f125420b) || e(dVar, h.a.f125422c);
    }

    public static boolean u0(@dl.e d0 d0Var) {
        return d0Var != null && l0(d0Var, h.a.f125432h);
    }

    public static boolean v0(@dl.d z0 z0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (z0Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = z0Var.d();
        return (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && e(fVarD, dVar);
    }

    public static boolean w0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(128);
        }
        return h0(d0Var, h.a.C0.j());
    }

    public static boolean x0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(130);
        }
        return h0(d0Var, h.a.E0.j());
    }

    public static boolean y0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(131);
        }
        return h0(d0Var, h.a.F0.j());
    }

    public static boolean z0(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(129);
        }
        return h0(d0Var, h.a.D0.j());
    }

    @dl.d
    public j0 B() {
        j0 j0VarR = R(PrimitiveType.FLOAT);
        if (j0VarR == null) {
            a(60);
        }
        return j0VarR;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d C(int i10) {
        return p(h.b(i10));
    }

    @dl.d
    public j0 D() {
        j0 j0VarR = R(PrimitiveType.INT);
        if (j0VarR == null) {
            a(58);
        }
        return j0VarR;
    }

    public void D0(@dl.d ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            a(1);
        }
        this.f125383f.g(new d(moduleDescriptorImpl));
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d E() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = o(h.a.f125435i0.l());
        if (dVarO == null) {
            a(21);
        }
        return dVarO;
    }

    @dl.d
    public j0 F() {
        j0 j0VarR = R(PrimitiveType.LONG);
        if (j0VarR == null) {
            a(59);
        }
        return j0VarR;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d G() {
        return p("Nothing");
    }

    @dl.d
    public j0 H() {
        j0 j0VarV = G().v();
        if (j0VarV == null) {
            a(48);
        }
        return j0VarV;
    }

    @dl.d
    public j0 I() {
        j0 j0VarV0 = i().V0(true);
        if (j0VarV0 == null) {
            a(51);
        }
        return j0VarV0;
    }

    @dl.d
    public j0 J() {
        j0 j0VarV0 = H().V0(true);
        if (j0VarV0 == null) {
            a(49);
        }
        return j0VarV0;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d K() {
        return p("Number");
    }

    @dl.d
    public j0 L() {
        j0 j0VarV = K().v();
        if (j0VarV == null) {
            a(55);
        }
        return j0VarV;
    }

    @dl.d
    protected gi.c M() {
        gi.c.b bVar = gi.c.b.f119065a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    @dl.d
    public j0 O(@dl.d PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(73);
        }
        j0 j0Var = this.f125380c.invoke().f125389a.get(primitiveType);
        if (j0Var == null) {
            a(74);
        }
        return j0Var;
    }

    @dl.d
    public j0 R(@dl.d PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(53);
        }
        j0 j0VarV = Q(primitiveType).v();
        if (j0VarV == null) {
            a(54);
        }
        return j0VarV;
    }

    @dl.d
    public j0 T() {
        j0 j0VarR = R(PrimitiveType.SHORT);
        if (j0VarR == null) {
            a(57);
        }
        return j0VarR;
    }

    @dl.d
    protected m U() {
        m mVar = this.f125383f;
        if (mVar == null) {
            a(6);
        }
        return mVar;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d V() {
        return p("String");
    }

    @dl.d
    public j0 W() {
        j0 j0VarV = V().v();
        if (j0VarV == null) {
            a(65);
        }
        return j0VarV;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d X(int i10) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = o(h.f125404m.c(kotlin.reflect.jvm.internal.impl.name.f.f(h.d(i10))));
        if (dVarO == null) {
            a(18);
        }
        return dVarO;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return p("Unit");
    }

    @dl.d
    public j0 Z() {
        j0 j0VarV = Y().v();
        if (j0VarV == null) {
            a(64);
        }
        return j0VarV;
    }

    protected void f(boolean z10) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f125376g, this.f125383f, this, null);
        this.f125378a = moduleDescriptorImpl;
        moduleDescriptorImpl.T0(BuiltInsLoader.f125335a.a().a(this.f125383f, this.f125378a, v(), M(), g(), z10));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f125378a;
        moduleDescriptorImpl2.Z0(moduleDescriptorImpl2);
    }

    @dl.d
    protected gi.a g() {
        gi.a.C1078a c1078a = gi.a.C1078a.f119063a;
        if (c1078a == null) {
            a(3);
        }
        return c1078a;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d h() {
        return p("Any");
    }

    @dl.d
    public j0 i() {
        j0 j0VarV = h().v();
        if (j0VarV == null) {
            a(50);
        }
        return j0VarV;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d j() {
        return p("Array");
    }

    @dl.d
    public d0 k(@dl.d d0 d0Var) {
        d0 d0VarA;
        if (d0Var == null) {
            a(67);
        }
        if (c0(d0Var)) {
            if (d0Var.M0().size() != 1) {
                throw new IllegalStateException();
            }
            d0 type = d0Var.M0().get(0).getType();
            if (type == null) {
                a(68);
            }
            return type;
        }
        d0 d0VarN = i1.n(d0Var);
        j0 j0Var = this.f125380c.invoke().f125391c.get(d0VarN);
        if (j0Var != null) {
            return j0Var;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d0 d0VarI = kotlin.reflect.jvm.internal.impl.resolve.d.i(d0VarN);
        if (d0VarI != null && (d0VarA = A(d0VarN, d0VarI)) != null) {
            return d0VarA;
        }
        throw new IllegalStateException("not array: " + d0Var);
    }

    @dl.d
    public j0 l(@dl.d Variance variance, @dl.d d0 d0Var) {
        if (variance == null) {
            a(82);
        }
        if (d0Var == null) {
            a(83);
        }
        j0 j0VarM = m(variance, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b());
        if (j0VarM == null) {
            a(84);
        }
        return j0VarM;
    }

    @dl.d
    public j0 m(@dl.d Variance variance, @dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (variance == null) {
            a(78);
        }
        if (d0Var == null) {
            a(79);
        }
        if (eVar == null) {
            a(80);
        }
        j0 j0VarG = KotlinTypeFactory.g(x0.b(eVar), j(), Collections.singletonList(new e1(variance, d0Var)));
        if (j0VarG == null) {
            a(81);
        }
        return j0VarG;
    }

    @dl.d
    public j0 n() {
        j0 j0VarR = R(PrimitiveType.BOOLEAN);
        if (j0VarR == null) {
            a(63);
        }
        return j0VarR;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d o(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(12);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarC = q.c(r(), cVar, NoLookupLocation.FROM_BUILTINS);
        if (dVarC == null) {
            a(13);
        }
        return dVarC;
    }

    @dl.d
    public ModuleDescriptorImpl r() {
        if (this.f125378a == null) {
            this.f125378a = this.f125379b.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f125378a;
        if (moduleDescriptorImpl == null) {
            a(7);
        }
        return moduleDescriptorImpl;
    }

    @dl.d
    public MemberScope s() {
        MemberScope memberScopeU = r().R(h.f125412u).u();
        if (memberScopeU == null) {
            a(11);
        }
        return memberScopeU;
    }

    @dl.d
    public j0 t() {
        j0 j0VarR = R(PrimitiveType.BYTE);
        if (j0VarR == null) {
            a(56);
        }
        return j0VarR;
    }

    @dl.d
    public j0 u() {
        j0 j0VarR = R(PrimitiveType.CHAR);
        if (j0VarR == null) {
            a(62);
        }
        return j0VarR;
    }

    @dl.d
    protected Iterable<gi.b> v() {
        List listSingletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.f125383f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d w() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = o(h.a.U);
        if (dVarO == null) {
            a(34);
        }
        return dVarO;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d x() {
        return p("Comparable");
    }

    @dl.d
    public j0 y() {
        j0 j0VarI = I();
        if (j0VarI == null) {
            a(52);
        }
        return j0VarI;
    }

    @dl.d
    public j0 z() {
        j0 j0VarR = R(PrimitiveType.DOUBLE);
        if (j0VarR == null) {
            a(61);
        }
        return j0VarR;
    }
}
