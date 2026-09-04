package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f128130a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f1 f128131b = new a();

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class a extends f1 {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        public /* bridge */ /* synthetic */ c1 e(d0 d0Var) {
            return (c1) i(d0Var);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        public boolean f() {
            return true;
        }

        @dl.e
        public Void i(@dl.d d0 key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return null;
        }

        @dl.d
        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class c extends f1 {
        c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        public boolean a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        public boolean b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        @dl.d
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations) {
            kotlin.jvm.internal.f0.p(annotations, "annotations");
            return f1.this.d(annotations);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        @dl.e
        public c1 e(@dl.d d0 key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return f1.this.e(key);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        public boolean f() {
            return f1.this.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f1
        @dl.d
        public d0 g(@dl.d d0 topLevelType, @dl.d Variance position) {
            kotlin.jvm.internal.f0.p(topLevelType, "topLevelType");
            kotlin.jvm.internal.f0.p(position, "position");
            return f1.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @dl.d
    public final TypeSubstitutor c() {
        TypeSubstitutor typeSubstitutorG = TypeSubstitutor.g(this);
        kotlin.jvm.internal.f0.o(typeSubstitutorG, "create(this)");
        return typeSubstitutorG;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations) {
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        return annotations;
    }

    @dl.e
    public abstract c1 e(@dl.d d0 d0Var);

    public boolean f() {
        return false;
    }

    @dl.d
    public d0 g(@dl.d d0 topLevelType, @dl.d Variance position) {
        kotlin.jvm.internal.f0.p(topLevelType, "topLevelType");
        kotlin.jvm.internal.f0.p(position, "position");
        return topLevelType;
    }

    @dl.d
    public final f1 h() {
        return new c();
    }
}
