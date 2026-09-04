package kotlin.reflect.jvm.internal.impl.resolve;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.y;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import yh.p;

/* JADX INFO: loaded from: classes5.dex */
public class OverridingUtil {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<ExternalOverridabilityCondition> f127487e = CollectionsKt___CollectionsKt.Q5(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final OverridingUtil f127488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.types.checker.e.a f127489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f127490h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f127491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinTypePreparator f127492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.e.a f127493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p<d0, d0, Boolean> f127494d;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final OverrideCompatibilityInfo f127495c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Result f127496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f127497b;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(@dl.d Result result, @dl.d String str) {
            if (result == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f127496a = result;
            this.f127497b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 == 1 || i10 == 2) {
                objArr[0] = "debugMessage";
            } else if (i10 == 3) {
                objArr[0] = "success";
            } else if (i10 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i10 == 1) {
                objArr[2] = "incompatible";
            } else if (i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        @dl.d
        public static OverrideCompatibilityInfo b(@dl.d String str) {
            if (str == null) {
                a(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        @dl.d
        public static OverrideCompatibilityInfo d(@dl.d String str) {
            if (str == null) {
                a(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        @dl.d
        public static OverrideCompatibilityInfo e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f127495c;
            if (overrideCompatibilityInfo == null) {
                a(0);
            }
            return overrideCompatibilityInfo;
        }

        @dl.d
        public Result c() {
            Result result = this.f127496a;
            if (result == null) {
                a(5);
            }
            return result;
        }
    }

    public static final class a implements kotlin.reflect.jvm.internal.impl.types.checker.e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = ak.av;
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
        public boolean a(@dl.d z0 z0Var, @dl.d z0 z0Var2) {
            if (z0Var == null) {
                b(0);
            }
            if (z0Var2 == null) {
                b(1);
            }
            return z0Var.equals(z0Var2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    public static final class b<D> implements p<D, D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // yh.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            return new Pair(aVar, aVar2);
        }
    }

    public static final class c implements yh.l<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k f127498b;

        c(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
            this.f127498b = kVar;
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return Boolean.valueOf(callableMemberDescriptor.c() == this.f127498b);
        }
    }

    public static final class d implements yh.l<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        d() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    public static final class e implements yh.l<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f127499b;

        e(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            this.f127499b = dVar;
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z10 = false;
            if (!r.g(callableMemberDescriptor.getVisibility()) && r.h(callableMemberDescriptor, this.f127499b, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class f implements yh.l<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        f() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    public static final class g implements yh.l<CallableMemberDescriptor, b2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.h f127500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CallableMemberDescriptor f127501c;

        g(kotlin.reflect.jvm.internal.impl.resolve.h hVar, CallableMemberDescriptor callableMemberDescriptor) {
            this.f127500b = hVar;
            this.f127501c = callableMemberDescriptor;
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b2 invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f127500b.b(this.f127501c, callableMemberDescriptor);
            return b2.f124493a;
        }
    }

    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f127502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f127503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f127504c;

        static {
            int[] iArr = new int[Modality.values().length];
            f127504c = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127504c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127504c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f127504c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f127503b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f127503b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f127503b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f127502a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f127502a[ExternalOverridabilityCondition.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f127502a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f127502a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        a aVar = new a();
        f127489g = aVar;
        f127488f = new OverridingUtil(aVar, kotlin.reflect.jvm.internal.impl.types.checker.f.a.f128072a, KotlinTypePreparator.a.f128056a, null);
    }

    private OverridingUtil(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.e.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar, @dl.d KotlinTypePreparator kotlinTypePreparator, @dl.e p<d0, d0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (fVar == null) {
            a(6);
        }
        if (kotlinTypePreparator == null) {
            a(7);
        }
        this.f127493c = aVar;
        this.f127491a = fVar;
        this.f127492b = kotlinTypePreparator;
        this.f127494d = pVar;
    }

    private static boolean A(@dl.e n0 n0Var, @dl.e n0 n0Var2) {
        if (n0Var == null || n0Var2 == null) {
            return true;
        }
        return H(n0Var, n0Var2);
    }

    public static boolean B(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            a(67);
        }
        if (aVar2 == null) {
            a(68);
        }
        d0 returnType = aVar.getReturnType();
        d0 returnType2 = aVar2.getReturnType();
        if (!H(aVar, aVar2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateL = f127488f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof w) {
            return G(aVar, returnType, aVar2, returnType2, typeCheckerStateL);
        }
        if (!(aVar instanceof o0)) {
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        }
        o0 o0Var = (o0) aVar;
        o0 o0Var2 = (o0) aVar2;
        if (!A(o0Var.getSetter(), o0Var2.getSetter())) {
            return false;
        }
        if (o0Var.G() && o0Var2.G()) {
            return AbstractTypeChecker.f127958a.k(typeCheckerStateL, returnType.R0(), returnType2.R0());
        }
        return (o0Var.G() || !o0Var2.G()) && G(aVar, returnType, aVar2, returnType2, typeCheckerStateL);
    }

    private static boolean C(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (aVar == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @dl.d d0 d0Var2, @dl.d TypeCheckerState typeCheckerState) {
        if (aVar == null) {
            a(73);
        }
        if (d0Var == null) {
            a(74);
        }
        if (aVar2 == null) {
            a(75);
        }
        if (d0Var2 == null) {
            a(76);
        }
        if (typeCheckerState == null) {
            a(77);
        }
        return AbstractTypeChecker.f127958a.r(typeCheckerState, d0Var.R0(), d0Var2.R0());
    }

    private static boolean H(@dl.d o oVar, @dl.d o oVar2) {
        if (oVar == null) {
            a(69);
        }
        if (oVar2 == null) {
            a(70);
        }
        Integer numD = r.d(oVar.getVisibility(), oVar2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(@dl.d a0 a0Var, @dl.d a0 a0Var2, boolean z10) {
        if (a0Var == null) {
            a(57);
        }
        if (a0Var2 == null) {
            a(58);
        }
        return !r.g(a0Var2.getVisibility()) && r.h(a0Var2, a0Var, z10);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean J(@dl.d D d10, @dl.d D d11, boolean z10, boolean z11) {
        if (d10 == null) {
            a(13);
        }
        if (d11 == null) {
            a(14);
        }
        if (!d10.equals(d11) && DescriptorEquivalenceForOverrides.f127482a.f(d10.a(), d11.a(), z10, z11)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a aVarA = d11.a();
        Iterator it = kotlin.reflect.jvm.internal.impl.resolve.d.d(d10).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.f127482a.f(aVarA, (kotlin.reflect.jvm.internal.impl.descriptors.a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.e yh.l<CallableMemberDescriptor, b2> lVar) {
        s sVar;
        if (callableMemberDescriptor == null) {
            a(107);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.f()) {
            if (callableMemberDescriptor2.getVisibility() == r.f125870g) {
                K(callableMemberDescriptor2, lVar);
            }
        }
        if (callableMemberDescriptor.getVisibility() != r.f125870g) {
            return;
        }
        s sVarH = h(callableMemberDescriptor);
        if (sVarH == null) {
            if (lVar != null) {
                lVar.invoke(callableMemberDescriptor);
            }
            sVar = r.f125868e;
        } else {
            sVar = sVarH;
        }
        if (callableMemberDescriptor instanceof z) {
            ((z) callableMemberDescriptor).e1(sVar);
            Iterator<n0> it = ((o0) callableMemberDescriptor).A().iterator();
            while (it.hasNext()) {
                K(it.next(), sVarH == null ? null : lVar);
            }
            return;
        }
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.o) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.o) callableMemberDescriptor).k1(sVar);
            return;
        }
        y yVar = (y) callableMemberDescriptor;
        yVar.P0(sVar);
        if (sVar != yVar.n0().getVisibility()) {
            yVar.N0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static <H> H L(@dl.d Collection<H> collection, @dl.d yh.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        if (collection == null) {
            a(78);
        }
        if (lVar == 0) {
            a(79);
        }
        if (collection.size() == 1) {
            H h10 = (H) CollectionsKt___CollectionsKt.u2(collection);
            if (h10 == null) {
                a(80);
            }
            return h10;
        }
        ArrayList arrayList = new ArrayList(2);
        List listS3 = CollectionsKt___CollectionsKt.s3(collection, lVar);
        H h11 = (H) CollectionsKt___CollectionsKt.u2(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.invoke(h11);
        for (H h12 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.invoke(h12);
            if (C(aVar2, listS3)) {
                arrayList.add(h12);
            }
            if (B(aVar2, aVar) && !B(aVar, aVar2)) {
                h11 = h12;
            }
        }
        if (arrayList.isEmpty()) {
            if (h11 == null) {
                a(81);
            }
            return h11;
        }
        if (arrayList.size() == 1) {
            H h13 = (H) CollectionsKt___CollectionsKt.u2(arrayList);
            if (h13 == null) {
                a(82);
            }
            return h13;
        }
        H h14 = null;
        for (Object obj : arrayList) {
            if (!b0.b(((kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.invoke(obj)).getReturnType())) {
                h14 = (H) obj;
                break;
            }
        }
        if (h14 != null) {
            return h14;
        }
        H h15 = (H) CollectionsKt___CollectionsKt.u2(arrayList);
        if (h15 == null) {
            a(84);
        }
        return h15;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.vss.g.H2;
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = Constants.KEY_STRATEGY;
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = ak.av;
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static boolean b(@dl.d Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return CollectionsKt___CollectionsKt.r1(collection, new c(collection.iterator().next().c()));
    }

    private static boolean c(@dl.d y0 y0Var, @dl.d y0 y0Var2, @dl.d TypeCheckerState typeCheckerState) {
        if (y0Var == null) {
            a(49);
        }
        if (y0Var2 == null) {
            a(50);
        }
        if (typeCheckerState == null) {
            a(51);
        }
        List<d0> upperBounds = y0Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(y0Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (d0 d0Var : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(d0Var, (d0) listIterator.next(), typeCheckerState)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(@dl.d d0 d0Var, @dl.d d0 d0Var2, @dl.d TypeCheckerState typeCheckerState) {
        if (d0Var == null) {
            a(46);
        }
        if (d0Var2 == null) {
            a(47);
        }
        if (typeCheckerState == null) {
            a(48);
        }
        if (e0.a(d0Var) && e0.a(d0Var2)) {
            return true;
        }
        return AbstractTypeChecker.f127958a.k(typeCheckerState, d0Var.R0(), d0Var2.R0());
    }

    @dl.e
    private static OverrideCompatibilityInfo e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if ((aVar.l0() == null) != (aVar2.l0() == null)) {
            return OverrideCompatibilityInfo.d("Receiver presence mismatch");
        }
        if (aVar.i().size() != aVar2.i().size()) {
            return OverrideCompatibilityInfo.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (callableMemberDescriptor.b().isReal()) {
            set.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.f().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.f().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    private static List<d0> g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        r0 r0VarL0 = aVar.l0();
        ArrayList arrayList = new ArrayList();
        if (r0VarL0 != null) {
            arrayList.add(r0VarL0.getType());
        }
        Iterator<b1> it = aVar.i().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @dl.e
    private static s h(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(108);
        }
        Collection<? extends CallableMemberDescriptor> collectionF = callableMemberDescriptor.f();
        s sVarU = u(collectionF);
        if (sVarU == null) {
            return null;
        }
        if (callableMemberDescriptor.b() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return sVarU.f();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collectionF) {
            if (callableMemberDescriptor2.l() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(sVarU)) {
                return null;
            }
        }
        return sVarU;
    }

    @dl.d
    public static OverridingUtil i(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.e.a aVar) {
        if (fVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new OverridingUtil(aVar, fVar, KotlinTypePreparator.a.f128056a, null);
    }

    private static void j(@dl.d Collection<CallableMemberDescriptor> collection, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.h hVar) {
        if (collection == null) {
            a(85);
        }
        if (dVar == null) {
            a(86);
        }
        if (hVar == null) {
            a(87);
        }
        Collection<CallableMemberDescriptor> collectionT = t(dVar, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        CallableMemberDescriptor callableMemberDescriptorK0 = ((CallableMemberDescriptor) L(collection, new d())).k0(dVar, n(collection, dVar), zIsEmpty ? r.f125871h : r.f125870g, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        hVar.d(callableMemberDescriptorK0, collection);
        hVar.a(callableMemberDescriptorK0);
    }

    private static void k(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d Collection<CallableMemberDescriptor> collection, @dl.d kotlin.reflect.jvm.internal.impl.resolve.h hVar) {
        if (dVar == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (hVar == null) {
            a(66);
        }
        if (b(collection)) {
            Iterator<CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), dVar, hVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(m.a(linkedList), linkedList, hVar), dVar, hVar);
            }
        }
    }

    @dl.d
    private TypeCheckerState l(@dl.d List<y0> list, @dl.d List<y0> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateI0 = new i(null, this.f127493c, this.f127491a, this.f127492b, this.f127494d).I0(true, true);
            if (typeCheckerStateI0 == null) {
                a(44);
            }
            return typeCheckerStateI0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(list.get(i10).r(), list2.get(i10).r());
        }
        TypeCheckerState typeCheckerStateI1 = new i(map, this.f127493c, this.f127491a, this.f127492b, this.f127494d).I0(true, true);
        if (typeCheckerStateI1 == null) {
            a(45);
        }
        return typeCheckerStateI1;
    }

    @dl.d
    public static OverridingUtil m(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (fVar == null) {
            a(0);
        }
        return new OverridingUtil(f127489g, fVar, KotlinTypePreparator.a.f128056a, null);
    }

    @dl.d
    private static Modality n(@dl.d Collection<CallableMemberDescriptor> collection, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (collection == null) {
            a(88);
        }
        if (dVar == null) {
            a(89);
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i10 = h.f127504c[callableMemberDescriptor.l().ordinal()];
            if (i10 == 1) {
                Modality modality = Modality.FINAL;
                if (modality == null) {
                    a(90);
                }
                return modality;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (dVar.w0() && dVar.l() != Modality.ABSTRACT && dVar.l() != Modality.SEALED) {
            z10 = true;
        }
        if (z11 && !z12) {
            Modality modality2 = Modality.OPEN;
            if (modality2 == null) {
                a(91);
            }
            return modality2;
        }
        if (!z11 && z12) {
            Modality modalityL = z10 ? dVar.l() : Modality.ABSTRACT;
            if (modalityL == null) {
                a(92);
            }
            return modalityL;
        }
        HashSet hashSet = new HashSet();
        Iterator<CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z10, dVar.l());
    }

    private Collection<CallableMemberDescriptor> o(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d Collection<? extends CallableMemberDescriptor> collection, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.h hVar) {
        if (callableMemberDescriptor == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (dVar == null) {
            a(61);
        }
        if (hVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        kotlin.reflect.jvm.internal.impl.utils.e eVarA = kotlin.reflect.jvm.internal.impl.utils.e.a();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result resultC = D(callableMemberDescriptor2, callableMemberDescriptor, dVar).c();
            boolean zI = I(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i10 = h.f127503b[resultC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    eVarA.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i10 == 2) {
                if (zI) {
                    hVar.c(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        hVar.d(callableMemberDescriptor, eVarA);
        return arrayList;
    }

    @dl.d
    public static <H> Collection<H> p(@dl.d H h10, @dl.d Collection<H> collection, @dl.d yh.l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar, @dl.d yh.l<H, b2> lVar2) {
        if (h10 == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (lVar == null) {
            a(101);
        }
        if (lVar2 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h10);
        kotlin.reflect.jvm.internal.impl.descriptors.a aVarInvoke = lVar.invoke(h10);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a aVarInvoke2 = lVar.invoke(next);
            if (h10 == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultX = x(aVarInvoke, aVarInvoke2);
                if (resultX == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultX == OverrideCompatibilityInfo.Result.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @dl.d
    private static Collection<CallableMemberDescriptor> q(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d Queue<CallableMemberDescriptor> queue, @dl.d kotlin.reflect.jvm.internal.impl.resolve.h hVar) {
        if (callableMemberDescriptor == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (hVar == null) {
            a(106);
        }
        return p(callableMemberDescriptor, queue, new f(), new g(hVar, callableMemberDescriptor));
    }

    @dl.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> r(@dl.d Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && DescriptorUtilsKt.u(DescriptorUtilsKt.p(set.iterator().next())), null, new b());
    }

    @dl.d
    public static <D> Set<D> s(@dl.d Set<D> set, boolean z10, @dl.e yh.a<?> aVar, @dl.d p<? super D, ? super D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> pairInvoke = pVar.invoke(obj, (Object) it.next());
                kotlin.reflect.jvm.internal.impl.descriptors.a aVarA = pairInvoke.a();
                kotlin.reflect.jvm.internal.impl.descriptors.a aVarB = pairInvoke.b();
                if (!J(aVarA, aVarB, z10, true)) {
                    if (J(aVarB, aVarA, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @dl.d
    private static Collection<CallableMemberDescriptor> t(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d Collection<CallableMemberDescriptor> collection) {
        if (dVar == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        List listH2 = CollectionsKt___CollectionsKt.h2(collection, new e(dVar));
        if (listH2 == null) {
            a(98);
        }
        return listH2;
    }

    @dl.e
    public static s u(@dl.d Collection<? extends CallableMemberDescriptor> collection) {
        s sVar;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return r.f125875l;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            sVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                s visibility = it.next().getVisibility();
                if (sVar != null) {
                    Integer numD = r.d(visibility, sVar);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                sVar = visibility;
            }
        }
        if (sVar == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = r.d(sVar, it2.next().getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return sVar;
    }

    @dl.e
    public static OverrideCompatibilityInfo w(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z10;
        if (aVar == null) {
            a(40);
        }
        if (aVar2 == null) {
            a(41);
        }
        boolean z11 = aVar instanceof w;
        if ((z11 && !(aVar2 instanceof w)) || (((z10 = aVar instanceof o0)) && !(aVar2 instanceof o0))) {
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return OverrideCompatibilityInfo.d("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = e(aVar, aVar2);
        if (overrideCompatibilityInfoE != null) {
            return overrideCompatibilityInfoE;
        }
        return null;
    }

    @dl.e
    public static OverrideCompatibilityInfo.Result x(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        OverridingUtil overridingUtil = f127488f;
        OverrideCompatibilityInfo.Result resultC = overridingUtil.D(aVar2, aVar, null).c();
        OverrideCompatibilityInfo.Result resultC2 = overridingUtil.D(aVar, aVar2, null).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (resultC == result && resultC2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (resultC == result2 || resultC2 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    @dl.d
    private static Modality y(@dl.d Collection<CallableMemberDescriptor> collection, boolean z10, @dl.d Modality modality) {
        if (collection == null) {
            a(93);
        }
        if (modality == null) {
            a(94);
        }
        Modality modality2 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Modality modalityL = (z10 && callableMemberDescriptor.l() == Modality.ABSTRACT) ? modality : callableMemberDescriptor.l();
            if (modalityL.compareTo(modality2) < 0) {
                modality2 = modalityL;
            }
        }
        if (modality2 == null) {
            a(95);
        }
        return modality2;
    }

    @dl.d
    public static Set<CallableMemberDescriptor> z(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    @dl.d
    public OverrideCompatibilityInfo D(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = E(aVar, aVar2, dVar, false);
        if (overrideCompatibilityInfoE == null) {
            a(21);
        }
        return overrideCompatibilityInfoE;
    }

    @dl.d
    public OverrideCompatibilityInfo E(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar, boolean z10) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoF = F(aVar, aVar2, z10);
        boolean z11 = overrideCompatibilityInfoF.c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f127487e) {
            if (externalOverridabilityCondition.a() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z11 || externalOverridabilityCondition.a() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i10 = h.f127502a[externalOverridabilityCondition.b(aVar, aVar2, dVar).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else {
                    if (i10 == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoB = OverrideCompatibilityInfo.b("External condition failed");
                        if (overrideCompatibilityInfoB == null) {
                            a(24);
                        }
                        return overrideCompatibilityInfoB;
                    }
                    if (i10 == 3) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoD = OverrideCompatibilityInfo.d("External condition");
                        if (overrideCompatibilityInfoD == null) {
                            a(25);
                        }
                        return overrideCompatibilityInfoD;
                    }
                }
            }
        }
        if (!z11) {
            return overrideCompatibilityInfoF;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f127487e) {
            if (externalOverridabilityCondition2.a() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i11 = h.f127502a[externalOverridabilityCondition2.b(aVar, aVar2, dVar).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoB2 = OverrideCompatibilityInfo.b("External condition failed");
                    if (overrideCompatibilityInfoB2 == null) {
                        a(27);
                    }
                    return overrideCompatibilityInfoB2;
                }
                if (i11 == 3) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoD2 = OverrideCompatibilityInfo.d("External condition");
                    if (overrideCompatibilityInfoD2 == null) {
                        a(28);
                    }
                    return overrideCompatibilityInfoD2;
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = OverrideCompatibilityInfo.e();
        if (overrideCompatibilityInfoE == null) {
            a(29);
        }
        return overrideCompatibilityInfoE;
    }

    @dl.d
    public OverrideCompatibilityInfo F(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z10) {
        if (aVar == null) {
            a(30);
        }
        if (aVar2 == null) {
            a(31);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoW = w(aVar, aVar2);
        if (overrideCompatibilityInfoW != null) {
            return overrideCompatibilityInfoW;
        }
        List<d0> listG = g(aVar);
        List<d0> listG2 = g(aVar2);
        List<y0> typeParameters = aVar.getTypeParameters();
        List<y0> typeParameters2 = aVar2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.e.f128071a.a(listG.get(i10), listG2.get(i10))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoD = OverrideCompatibilityInfo.d("Type parameter number mismatch");
                    if (overrideCompatibilityInfoD == null) {
                        a(33);
                    }
                    return overrideCompatibilityInfoD;
                }
                i10++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoB = OverrideCompatibilityInfo.b("Type parameter number mismatch");
            if (overrideCompatibilityInfoB == null) {
                a(34);
            }
            return overrideCompatibilityInfoB;
        }
        TypeCheckerState typeCheckerStateL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c(typeParameters.get(i11), typeParameters2.get(i11), typeCheckerStateL)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoD2 = OverrideCompatibilityInfo.d("Type parameter bounds mismatch");
                if (overrideCompatibilityInfoD2 == null) {
                    a(35);
                }
                return overrideCompatibilityInfoD2;
            }
        }
        for (int i12 = 0; i12 < listG.size(); i12++) {
            if (!d(listG.get(i12), listG2.get(i12), typeCheckerStateL)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoD3 = OverrideCompatibilityInfo.d("Value parameter type mismatch");
                if (overrideCompatibilityInfoD3 == null) {
                    a(36);
                }
                return overrideCompatibilityInfoD3;
            }
        }
        if ((aVar instanceof w) && (aVar2 instanceof w) && ((w) aVar).isSuspend() != ((w) aVar2).isSuspend()) {
            OverrideCompatibilityInfo overrideCompatibilityInfoB2 = OverrideCompatibilityInfo.b("Incompatible suspendability");
            if (overrideCompatibilityInfoB2 == null) {
                a(37);
            }
            return overrideCompatibilityInfoB2;
        }
        if (z10) {
            d0 returnType = aVar.getReturnType();
            d0 returnType2 = aVar2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (e0.a(returnType2) && e0.a(returnType)) {
                    i10 = 1;
                }
                if (i10 == 0 && !AbstractTypeChecker.f127958a.r(typeCheckerStateL, returnType2.R0(), returnType.R0())) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoB3 = OverrideCompatibilityInfo.b("Return type mismatch");
                    if (overrideCompatibilityInfoB3 == null) {
                        a(38);
                    }
                    return overrideCompatibilityInfoB3;
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = OverrideCompatibilityInfo.e();
        if (overrideCompatibilityInfoE == null) {
            a(39);
        }
        return overrideCompatibilityInfoE;
    }

    public void v(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Collection<? extends CallableMemberDescriptor> collection, @dl.d Collection<? extends CallableMemberDescriptor> collection2, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.h hVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (dVar == null) {
            a(55);
        }
        if (hVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, dVar, hVar));
        }
        k(dVar, linkedHashSet, hVar);
    }
}
