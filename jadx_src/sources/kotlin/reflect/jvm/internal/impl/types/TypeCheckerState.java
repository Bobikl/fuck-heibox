package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.b2;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public class TypeCheckerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f128015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f128016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f128017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final si.p f128018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final f f128019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final g f128020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f128021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f128022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private ArrayDeque<si.i> f128023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private Set<si.i> f128024j;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public interface a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class C1179a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f128025a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a
            public void a(@dl.d yh.a<Boolean> block) {
                kotlin.jvm.internal.f0.p(block, "block");
                if (this.f128025a) {
                    return;
                }
                this.f128025a = block.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f128025a;
            }
        }

        void a(@dl.d yh.a<Boolean> aVar);
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static abstract class b {

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static abstract class a extends b {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class C1180b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final C1180b f128026a = new C1180b();

            private C1180b() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @dl.d
            public si.i a(@dl.d TypeCheckerState state, @dl.d si.g type) {
                kotlin.jvm.internal.f0.p(state, "state");
                kotlin.jvm.internal.f0.p(type, "type");
                return state.j().M(type);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final c f128027a = new c();

            private c() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            public /* bridge */ /* synthetic */ si.i a(TypeCheckerState typeCheckerState, si.g gVar) {
                return (si.i) b(typeCheckerState, gVar);
            }

            @dl.d
            public Void b(@dl.d TypeCheckerState state, @dl.d si.g type) {
                kotlin.jvm.internal.f0.p(state, "state");
                kotlin.jvm.internal.f0.p(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final d f128028a = new d();

            private d() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @dl.d
            public si.i a(@dl.d TypeCheckerState state, @dl.d si.g type) {
                kotlin.jvm.internal.f0.p(state, "state");
                kotlin.jvm.internal.f0.p(type, "type");
                return state.j().k0(type);
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public abstract si.i a(@dl.d TypeCheckerState typeCheckerState, @dl.d si.g gVar);
    }

    public TypeCheckerState(boolean z10, boolean z11, boolean z12, @dl.d si.p typeSystemContext, @dl.d f kotlinTypePreparator, @dl.d g kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.f0.p(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f128015a = z10;
        this.f128016b = z11;
        this.f128017c = z12;
        this.f128018d = typeSystemContext;
        this.f128019e = kotlinTypePreparator;
        this.f128020f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(TypeCheckerState typeCheckerState, si.g gVar, si.g gVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return typeCheckerState.c(gVar, gVar2, z10);
    }

    @dl.e
    public Boolean c(@dl.d si.g subType, @dl.d si.g superType, boolean z10) {
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<si.i> arrayDeque = this.f128023i;
        kotlin.jvm.internal.f0.m(arrayDeque);
        arrayDeque.clear();
        Set<si.i> set = this.f128024j;
        kotlin.jvm.internal.f0.m(set);
        set.clear();
        this.f128022h = false;
    }

    public boolean f(@dl.d si.g subType, @dl.d si.g superType) {
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superType, "superType");
        return true;
    }

    @dl.d
    public LowerCapturedTypePolicy g(@dl.d si.i subType, @dl.d si.b superType) {
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @dl.e
    public final ArrayDeque<si.i> h() {
        return this.f128023i;
    }

    @dl.e
    public final Set<si.i> i() {
        return this.f128024j;
    }

    @dl.d
    public final si.p j() {
        return this.f128018d;
    }

    public final void k() {
        this.f128022h = true;
        if (this.f128023i == null) {
            this.f128023i = new ArrayDeque<>(4);
        }
        if (this.f128024j == null) {
            this.f128024j = kotlin.reflect.jvm.internal.impl.utils.e.f128306d.a();
        }
    }

    public final boolean l(@dl.d si.g type) {
        kotlin.jvm.internal.f0.p(type, "type");
        return this.f128017c && this.f128018d.v(type);
    }

    public final boolean m() {
        return this.f128015a;
    }

    public final boolean n() {
        return this.f128016b;
    }

    @dl.d
    public final si.g o(@dl.d si.g type) {
        kotlin.jvm.internal.f0.p(type, "type");
        return this.f128019e.a(type);
    }

    @dl.d
    public final si.g p(@dl.d si.g type) {
        kotlin.jvm.internal.f0.p(type, "type");
        return this.f128020f.a(type);
    }

    public boolean q(@dl.d yh.l<? super a, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        a.C1179a c1179a = new a.C1179a();
        block.invoke(c1179a);
        return c1179a.b();
    }
}
