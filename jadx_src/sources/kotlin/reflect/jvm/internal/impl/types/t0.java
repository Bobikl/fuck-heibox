package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeAliasExpansionReportStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface t0 {

    /* JADX INFO: compiled from: TypeAliasExpansionReportStrategy.kt */
    public static final class a implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f128177a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.t0
        public void a(@dl.d TypeSubstitutor substitutor, @dl.d d0 unsubstitutedArgument, @dl.d d0 argument, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 typeParameter) {
            kotlin.jvm.internal.f0.p(substitutor, "substitutor");
            kotlin.jvm.internal.f0.p(unsubstitutedArgument, "unsubstitutedArgument");
            kotlin.jvm.internal.f0.p(argument, "argument");
            kotlin.jvm.internal.f0.p(typeParameter, "typeParameter");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.t0
        public void b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 typeAlias) {
            kotlin.jvm.internal.f0.p(typeAlias, "typeAlias");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.t0
        public void c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation) {
            kotlin.jvm.internal.f0.p(annotation, "annotation");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.t0
        public void d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 typeAlias, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, @dl.d d0 substitutedArgument) {
            kotlin.jvm.internal.f0.p(typeAlias, "typeAlias");
            kotlin.jvm.internal.f0.p(substitutedArgument, "substitutedArgument");
        }
    }

    void a(@dl.d TypeSubstitutor typeSubstitutor, @dl.d d0 d0Var, @dl.d d0 d0Var2, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var);

    void b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var);

    void c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar);

    void d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, @dl.d d0 d0Var);
}
