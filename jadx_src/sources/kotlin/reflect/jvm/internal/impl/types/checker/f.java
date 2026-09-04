package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f extends kotlin.reflect.jvm.internal.impl.types.g {

    /* JADX INFO: compiled from: KotlinTypeRefiner.kt */
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f128072a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
        @dl.e
        public kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
            f0.p(classId, "classId");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
        @dl.d
        public <S extends MemberScope> S c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor, @dl.d yh.a<? extends S> compute) {
            f0.p(classDescriptor, "classDescriptor");
            f0.p(compute, "compute");
            return compute.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
        public boolean d(@dl.d d0 moduleDescriptor) {
            f0.p(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
        public boolean e(@dl.d z0 typeConstructor) {
            f0.p(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.types.d0> g(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
            f0.p(classDescriptor, "classDescriptor");
            Collection<kotlin.reflect.jvm.internal.impl.types.d0> collectionL = classDescriptor.r().l();
            f0.o(collectionL, "classDescriptor.typeConstructor.supertypes");
            return collectionL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.g
        @dl.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.d0 a(@dl.d si.g type) {
            f0.p(type, "type");
            return (kotlin.reflect.jvm.internal.impl.types.d0) type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
        @dl.e
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.d f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k descriptor) {
            f0.p(descriptor, "descriptor");
            return null;
        }
    }

    @dl.e
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar);

    @dl.d
    public abstract <S extends MemberScope> S c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d yh.a<? extends S> aVar);

    public abstract boolean d(@dl.d d0 d0Var);

    public abstract boolean e(@dl.d z0 z0Var);

    @dl.e
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.f f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar);

    @dl.d
    public abstract Collection<kotlin.reflect.jvm.internal.impl.types.d0> g(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar);

    @dl.d
    /* JADX INFO: renamed from: h */
    public abstract kotlin.reflect.jvm.internal.impl.types.d0 a(@dl.d si.g gVar);
}
