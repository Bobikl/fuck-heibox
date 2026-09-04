package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.z;

/* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class IntegerLiteralTypeConstructor implements z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final Companion f127521f = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f127522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d0 f127523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Set<kotlin.reflect.jvm.internal.impl.types.d0> f127524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final j0 f127525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final z f127526e;

    /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127527a;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f127527a = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final j0 a(Collection<? extends j0> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                next = IntegerLiteralTypeConstructor.f127521f.e((j0) next, j0Var, mode);
            }
            return (j0) next;
        }

        private final j0 c(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set setD3;
            int i10 = a.f127527a[mode.ordinal()];
            if (i10 == 1) {
                setD3 = CollectionsKt___CollectionsKt.d3(integerLiteralTypeConstructor.j(), integerLiteralTypeConstructor2.j());
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setD3 = CollectionsKt___CollectionsKt.X5(integerLiteralTypeConstructor.j(), integerLiteralTypeConstructor2.j());
            }
            return KotlinTypeFactory.e(w0.f128193c.h(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f127522a, integerLiteralTypeConstructor.f127523b, setD3, null), false);
        }

        private final j0 d(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, j0 j0Var) {
            if (integerLiteralTypeConstructor.j().contains(j0Var)) {
                return j0Var;
            }
            return null;
        }

        private final j0 e(j0 j0Var, j0 j0Var2, Mode mode) {
            if (j0Var == null || j0Var2 == null) {
                return null;
            }
            z0 z0VarO0 = j0Var.O0();
            z0 z0VarO1 = j0Var2.O0();
            boolean z10 = z0VarO0 instanceof IntegerLiteralTypeConstructor;
            if (z10 && (z0VarO1 instanceof IntegerLiteralTypeConstructor)) {
                return c((IntegerLiteralTypeConstructor) z0VarO0, (IntegerLiteralTypeConstructor) z0VarO1, mode);
            }
            if (z10) {
                return d((IntegerLiteralTypeConstructor) z0VarO0, j0Var2);
            }
            if (z0VarO1 instanceof IntegerLiteralTypeConstructor) {
                return d((IntegerLiteralTypeConstructor) z0VarO1, j0Var);
            }
            return null;
        }

        @dl.e
        public final j0 b(@dl.d Collection<? extends j0> types) {
            f0.p(types, "types");
            return a(types, Mode.INTERSECTION_TYPE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j10, d0 d0Var, Set<? extends kotlin.reflect.jvm.internal.impl.types.d0> set) {
        this.f127525d = KotlinTypeFactory.e(w0.f128193c.h(), this, false);
        this.f127526e = b0.c(new yh.a<List<j0>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$supertypes$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<j0> invoke() {
                j0 j0VarV = this.f127528b.t().x().v();
                f0.o(j0VarV, "builtIns.comparable.defaultType");
                List<j0> listP = CollectionsKt__CollectionsKt.P(g1.f(j0VarV, kotlin.collections.s.k(new e1(Variance.IN_VARIANCE, this.f127528b.f127525d)), null, 2, null));
                if (!this.f127528b.m()) {
                    listP.add(this.f127528b.t().L());
                }
                return listP;
            }
        });
        this.f127522a = j10;
        this.f127523b = d0Var;
        this.f127524c = set;
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j10, d0 d0Var, Set set, kotlin.jvm.internal.u uVar) {
        this(j10, d0Var, set);
    }

    private final List<kotlin.reflect.jvm.internal.impl.types.d0> k() {
        return (List) this.f127526e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        Collection<kotlin.reflect.jvm.internal.impl.types.d0> collectionA = r.a(this.f127523b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            if (!(!this.f127524c.contains((kotlin.reflect.jvm.internal.impl.types.d0) it.next()))) {
                return false;
            }
        }
        return true;
    }

    private final String n() {
        return '[' + CollectionsKt___CollectionsKt.h3(this.f127524c, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<kotlin.reflect.jvm.internal.impl.types.d0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$valueToString$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 it) {
                f0.p(it, "it");
                return it.toString();
            }
        }, 30, null) + ']';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public z0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public List<y0> getParameters() {
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.d
    public final Set<kotlin.reflect.jvm.internal.impl.types.d0> j() {
        return this.f127524c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.types.d0> l() {
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        return this.f127523b.t();
    }

    @dl.d
    public String toString() {
        return "IntegerLiteralType" + n();
    }
}
