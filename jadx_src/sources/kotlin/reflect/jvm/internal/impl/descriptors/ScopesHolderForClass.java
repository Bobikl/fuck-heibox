package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: ScopesHolderForClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d f125573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, T> f125574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f125575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125576d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f125572f = {kotlin.jvm.internal.n0.u(new PropertyReference1Impl(kotlin.jvm.internal.n0.d(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f125571e = new a(null);

    /* JADX INFO: compiled from: ScopesHolderForClass.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final <T extends MemberScope> ScopesHolderForClass<T> a(@dl.d d classDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefinerForOwnerModule, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.checker.f, ? extends T> scopeFactory) {
            kotlin.jvm.internal.f0.p(classDescriptor, "classDescriptor");
            kotlin.jvm.internal.f0.p(storageManager, "storageManager");
            kotlin.jvm.internal.f0.p(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            kotlin.jvm.internal.f0.p(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(d dVar, kotlin.reflect.jvm.internal.impl.storage.m mVar, yh.l<? super kotlin.reflect.jvm.internal.impl.types.checker.f, ? extends T> lVar, kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        this.f125573a = dVar;
        this.f125574b = lVar;
        this.f125575c = fVar;
        this.f125576d = mVar.c(new yh.a<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$scopeForOwnerModule$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ScopesHolderForClass<T> f125579b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125579b = this;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope invoke() {
                return (MemberScope) ((ScopesHolderForClass) this.f125579b).f125574b.invoke(((ScopesHolderForClass) this.f125579b).f125575c);
            }
        });
    }

    public /* synthetic */ ScopesHolderForClass(d dVar, kotlin.reflect.jvm.internal.impl.storage.m mVar, yh.l lVar, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, kotlin.jvm.internal.u uVar) {
        this(dVar, mVar, lVar, fVar);
    }

    private final T d() {
        return (T) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125576d, this, f125572f[0]);
    }

    @dl.d
    public final T c(@dl.d final kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(DescriptorUtilsKt.p(this.f125573a))) {
            return (T) d();
        }
        kotlin.reflect.jvm.internal.impl.types.z0 z0VarR = this.f125573a.r();
        kotlin.jvm.internal.f0.o(z0VarR, "classDescriptor.typeConstructor");
        return !kotlinTypeRefiner.e(z0VarR) ? (T) d() : (T) kotlinTypeRefiner.c(this.f125573a, new yh.a<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$getScope$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ScopesHolderForClass<T> f125577b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125577b = this;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope invoke() {
                return (MemberScope) ((ScopesHolderForClass) this.f125577b).f125574b.invoke(kotlinTypeRefiner);
            }
        });
    }
}
