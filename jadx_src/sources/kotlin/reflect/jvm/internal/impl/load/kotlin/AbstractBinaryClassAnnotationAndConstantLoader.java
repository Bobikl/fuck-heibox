package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, a<? extends A, ? extends C>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.a<A, C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<o, a<A, C>> f126436b;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class a<A, C> extends AbstractBinaryClassAnnotationLoader.a<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Map<r, List<A>> f126437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Map<r, C> f126438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Map<r, C> f126439c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d Map<r, ? extends List<? extends A>> memberAnnotations, @dl.d Map<r, ? extends C> propertyConstants, @dl.d Map<r, ? extends C> annotationParametersDefaultValues) {
            f0.p(memberAnnotations, "memberAnnotations");
            f0.p(propertyConstants, "propertyConstants");
            f0.p(annotationParametersDefaultValues, "annotationParametersDefaultValues");
            this.f126437a = memberAnnotations;
            this.f126438b = propertyConstants;
            this.f126439c = annotationParametersDefaultValues;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.a
        @dl.d
        public Map<r, List<A>> a() {
            return this.f126437a;
        }

        @dl.d
        public final Map<r, C> b() {
            return this.f126439c;
        }

        @dl.d
        public final Map<r, C> c() {
            return this.f126438b;
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class b implements o.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f126440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<r, List<A>> f126441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f126442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap<r, C> f126443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<r, C> f126444e;

        /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public final class a extends C1155b implements o.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f126445d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d b bVar, r signature) {
                super(bVar, signature);
                f0.p(signature, "signature");
                this.f126445d = bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.e
            @dl.e
            public o.a a(int i10, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d t0 source) {
                f0.p(classId, "classId");
                f0.p(source, "source");
                r rVarE = r.f126558b.e(c(), i10);
                List<A> arrayList = this.f126445d.f126441b.get(rVarE);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f126445d.f126441b.put(rVarE, arrayList);
                }
                return this.f126445d.f126440a.w(classId, source, arrayList);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class C1155b implements o.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final r f126446a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private final ArrayList<A> f126447b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f126448c;

            public C1155b(@dl.d b bVar, r signature) {
                f0.p(signature, "signature");
                this.f126448c = bVar;
                this.f126446a = signature;
                this.f126447b = new ArrayList<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
            @dl.e
            public o.a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d t0 source) {
                f0.p(classId, "classId");
                f0.p(source, "source");
                return this.f126448c.f126440a.w(classId, source, this.f126447b);
            }

            @dl.d
            protected final r c() {
                return this.f126446a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
            public void visitEnd() {
                if (!this.f126447b.isEmpty()) {
                    this.f126448c.f126441b.put(this.f126446a, this.f126447b);
                }
            }
        }

        b(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader, HashMap<r, List<A>> map, o oVar, HashMap<r, C> map2, HashMap<r, C> map3) {
            this.f126440a = abstractBinaryClassAnnotationAndConstantLoader;
            this.f126441b = map;
            this.f126442c = oVar;
            this.f126443d = map2;
            this.f126444e = map3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.d
        @dl.e
        public o.e a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d String desc) {
            f0.p(name, "name");
            f0.p(desc, "desc");
            r.a aVar = r.f126558b;
            String strB = name.b();
            f0.o(strB, "name.asString()");
            return new a(this, aVar.d(strB, desc));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.d
        @dl.e
        public o.c b(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d String desc, @dl.e Object obj) {
            C cE;
            f0.p(name, "name");
            f0.p(desc, "desc");
            r.a aVar = r.f126558b;
            String strB = name.b();
            f0.o(strB, "name.asString()");
            r rVarA = aVar.a(strB, desc);
            if (obj != null && (cE = this.f126440a.E(desc, obj)) != null) {
                this.f126444e.put(rVarA, cE);
            }
            return new C1155b(this, rVarA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d m kotlinClassFinder) {
        super(kotlinClassFinder);
        f0.p(storageManager, "storageManager");
        f0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f126436b = storageManager.a(new yh.l<o, a<? extends A, ? extends C>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$storage$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f126451b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f126451b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractBinaryClassAnnotationAndConstantLoader.a<A, C> invoke(@dl.d o kotlinClass) {
                f0.p(kotlinClass, "kotlinClass");
                return this.f126451b.D(kotlinClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a<A, C> D(o oVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        oVar.g(new b(this, map, oVar, map3, map2), q(oVar));
        return new a<>(map, map2, map3);
    }

    private final C F(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t tVar, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, d0 d0Var, yh.p<? super a<? extends A, ? extends C>, ? super r, ? extends C> pVar) {
        C cInvoke;
        o oVarO = o(tVar, t(tVar, true, true, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A.d(property.b0()), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(property)));
        if (oVarO == null) {
            return null;
        }
        r rVarR = r(property, tVar.b(), tVar.d(), annotatedCallableKind, oVarO.h().d().d(DeserializedDescriptorResolver.f126456b.a()));
        if (rVarR == null || (cInvoke = pVar.invoke(this.f126436b.invoke(oVarO), rVarR)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.builtins.j.d(d0Var) ? G(cInvoke) : cInvoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @dl.d
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a<A, C> p(@dl.d o binaryClass) {
        f0.p(binaryClass, "binaryClass");
        return this.f126436b.invoke(binaryClass);
    }

    protected final boolean C(@dl.d kotlin.reflect.jvm.internal.impl.name.b annotationClassId, @dl.d Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> arguments) {
        f0.p(annotationClassId, "annotationClassId");
        f0.p(arguments, "arguments");
        if (!f0.g(annotationClassId, kotlin.reflect.jvm.internal.impl.a.f125331a.a())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = arguments.get(kotlin.reflect.jvm.internal.impl.name.f.f("value"));
        kotlin.reflect.jvm.internal.impl.resolve.constants.o oVar = gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o ? (kotlin.reflect.jvm.internal.impl.resolve.constants.o) gVar : null;
        if (oVar == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.o.b bVarB = oVar.b();
        kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.C1176b c1176b = bVarB instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.C1176b ? (kotlin.reflect.jvm.internal.impl.resolve.constants.o.b.C1176b) bVarB : null;
        if (c1176b == null) {
            return false;
        }
        return u(c1176b.b());
    }

    @dl.e
    protected abstract C E(@dl.d String str, @dl.d Object obj);

    @dl.e
    protected abstract C G(@dl.d C c10);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a
    @dl.e
    public C e(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d ProtoBuf.Property proto, @dl.d d0 expectedType) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(expectedType, "expectedType");
        return F(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, new yh.p<a<? extends A, ? extends C>, r, C>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1
            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C invoke(@dl.d AbstractBinaryClassAnnotationAndConstantLoader.a<? extends A, ? extends C> loadConstantFromProperty, @dl.d r it) {
                f0.p(loadConstantFromProperty, "$this$loadConstantFromProperty");
                f0.p(it, "it");
                return loadConstantFromProperty.c().get(it);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a
    @dl.e
    public C j(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.t container, @dl.d ProtoBuf.Property proto, @dl.d d0 expectedType) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(expectedType, "expectedType");
        return F(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, new yh.p<a<? extends A, ? extends C>, r, C>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1
            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C invoke(@dl.d AbstractBinaryClassAnnotationAndConstantLoader.a<? extends A, ? extends C> loadConstantFromProperty, @dl.d r it) {
                f0.p(loadConstantFromProperty, "$this$loadConstantFromProperty");
                f0.p(it, "it");
                return loadConstantFromProperty.b().get(it);
            }
        });
    }
}
