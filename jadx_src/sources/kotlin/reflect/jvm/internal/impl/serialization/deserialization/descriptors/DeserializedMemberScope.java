package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import fi.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e1;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.n;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DeserializedMemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f127773f = {n0.u(new PropertyReference1Impl(n0.d(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), n0.u(new PropertyReference1Impl(n0.d(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j f127774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a f127775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f127776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f127777e;

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public final class NoReorderImplementation implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ n<Object>[] f127778o = {n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "allProperties", "getAllProperties()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), n0.u(new PropertyReference1Impl(n0.d(NoReorderImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final List<ProtoBuf.Function> f127779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<ProtoBuf.Property> f127780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final List<ProtoBuf.TypeAlias> f127781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127786h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127787i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127790l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127791m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ DeserializedMemberScope f127792n;

        public NoReorderImplementation(@dl.d final DeserializedMemberScope deserializedMemberScope, @dl.d List<ProtoBuf.Function> functionList, @dl.d List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            f0.p(functionList, "functionList");
            f0.p(propertyList, "propertyList");
            f0.p(typeAliasList, "typeAliasList");
            this.f127792n = deserializedMemberScope;
            this.f127779a = functionList;
            this.f127780b = propertyList;
            this.f127781c = deserializedMemberScope.q().c().g().e() ? typeAliasList : CollectionsKt__CollectionsKt.E();
            this.f127782d = deserializedMemberScope.q().h().c(new yh.a<List<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$declaredFunctions$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends s0> invoke() {
                    return this.f127796b.v();
                }
            });
            this.f127783e = deserializedMemberScope.q().h().c(new yh.a<List<? extends o0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$declaredProperties$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends o0> invoke() {
                    return this.f127797b.y();
                }
            });
            this.f127784f = deserializedMemberScope.q().h().c(new yh.a<List<? extends x0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allTypeAliases$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends x0> invoke() {
                    return this.f127795b.z();
                }
            });
            this.f127785g = deserializedMemberScope.q().h().c(new yh.a<List<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allFunctions$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends s0> invoke() {
                    return CollectionsKt___CollectionsKt.y4(this.f127793b.D(), this.f127793b.t());
                }
            });
            this.f127786h = deserializedMemberScope.q().h().c(new yh.a<List<? extends o0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allProperties$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends o0> invoke() {
                    return CollectionsKt___CollectionsKt.y4(this.f127794b.E(), this.f127794b.u());
                }
            });
            this.f127787i = deserializedMemberScope.q().h().c(new yh.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends x0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Map<kotlin.reflect.jvm.internal.impl.name.f, x0> invoke() {
                    List listC = this.f127802b.C();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(t.Y(listC, 10)), 16));
                    for (Object obj : listC) {
                        kotlin.reflect.jvm.internal.impl.name.f name = ((x0) obj).getName();
                        f0.o(name, "it.name");
                        linkedHashMap.put(name, obj);
                    }
                    return linkedHashMap;
                }
            });
            this.f127788j = deserializedMemberScope.q().h().c(new yh.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends List<? extends s0>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionsByName$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Map<kotlin.reflect.jvm.internal.impl.name.f, List<s0>> invoke() {
                    List listA = this.f127800b.A();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listA) {
                        kotlin.reflect.jvm.internal.impl.name.f name = ((s0) obj).getName();
                        f0.o(name, "it.name");
                        Object arrayList = linkedHashMap.get(name);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(name, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    return linkedHashMap;
                }
            });
            this.f127789k = deserializedMemberScope.q().h().c(new yh.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends List<? extends o0>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$propertiesByName$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Map<kotlin.reflect.jvm.internal.impl.name.f, List<o0>> invoke() {
                    List listB = this.f127801b.B();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listB) {
                        kotlin.reflect.jvm.internal.impl.name.f name = ((o0) obj).getName();
                        f0.o(name, "it.name");
                        Object arrayList = linkedHashMap.get(name);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(name, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    return linkedHashMap;
                }
            });
            this.f127790l = deserializedMemberScope.q().h().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.f127798b;
                    List list = noReorderImplementation.f127779a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.f127792n;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(r.b(deserializedMemberScope2.q().g(), ((ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).e0()));
                    }
                    return e1.C(linkedHashSet, deserializedMemberScope.u());
                }
            });
            this.f127791m = deserializedMemberScope.q().h().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.f127803b;
                    List list = noReorderImplementation.f127780b;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.f127792n;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(r.b(deserializedMemberScope2.q().g(), ((ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).d0()));
                    }
                    return e1.C(linkedHashSet, deserializedMemberScope.v());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<s0> A() {
            return (List) l.a(this.f127785g, this, f127778o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<o0> B() {
            return (List) l.a(this.f127786h, this, f127778o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<x0> C() {
            return (List) l.a(this.f127784f, this, f127778o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<s0> D() {
            return (List) l.a(this.f127782d, this, f127778o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<o0> E() {
            return (List) l.a(this.f127783e, this, f127778o[1]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, Collection<s0>> F() {
            return (Map) l.a(this.f127788j, this, f127778o[6]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, Collection<o0>> G() {
            return (Map) l.a(this.f127789k, this, f127778o[7]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, x0> H() {
            return (Map) l.a(this.f127787i, this, f127778o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<s0> t() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setU = this.f127792n.u();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setU.iterator();
            while (it.hasNext()) {
                x.n0(arrayList, w((kotlin.reflect.jvm.internal.impl.name.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<o0> u() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setV = this.f127792n.v();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setV.iterator();
            while (it.hasNext()) {
                x.n0(arrayList, x((kotlin.reflect.jvm.internal.impl.name.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<s0> v() {
            List<ProtoBuf.Function> list = this.f127779a;
            DeserializedMemberScope deserializedMemberScope = this.f127792n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                s0 s0VarJ = deserializedMemberScope.q().f().j((ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (!deserializedMemberScope.y(s0VarJ)) {
                    s0VarJ = null;
                }
                if (s0VarJ != null) {
                    arrayList.add(s0VarJ);
                }
            }
            return arrayList;
        }

        private final List<s0> w(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<s0> listD = D();
            DeserializedMemberScope deserializedMemberScope = this.f127792n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                if (f0.g(((kotlin.reflect.jvm.internal.impl.descriptors.k) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<o0> x(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<o0> listE = E();
            DeserializedMemberScope deserializedMemberScope = this.f127792n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (f0.g(((kotlin.reflect.jvm.internal.impl.descriptors.k) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.m(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<o0> y() {
            List<ProtoBuf.Property> list = this.f127780b;
            DeserializedMemberScope deserializedMemberScope = this.f127792n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                o0 o0VarL = deserializedMemberScope.q().f().l((ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (o0VarL != null) {
                    arrayList.add(o0VarL);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<x0> z() {
            List<ProtoBuf.TypeAlias> list = this.f127781c;
            DeserializedMemberScope deserializedMemberScope = this.f127792n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                x0 x0VarM = deserializedMemberScope.q().f().m((ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (x0VarM != null) {
                    arrayList.add(x0VarM);
                }
            }
            return arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            Collection<s0> collection;
            f0.p(name, "name");
            f0.p(location, "location");
            return (b().contains(name) && (collection = F().get(name)) != null) ? collection : CollectionsKt__CollectionsKt.E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return (Set) l.a(this.f127790l, this, f127778o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            Collection<o0> collection;
            f0.p(name, "name");
            f0.p(location, "location");
            return (d().contains(name) && (collection = G().get(name)) != null) ? collection : CollectionsKt__CollectionsKt.E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return (Set) l.a(this.f127791m, this, f127778o[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.e
        public x0 e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
            f0.p(name, "name");
            return H().get(name);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void f(@dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> result, @dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter, @dl.d ki.b location) {
            f0.p(result, "result");
            f0.p(kindFilter, "kindFilter");
            f0.p(nameFilter, "nameFilter");
            f0.p(location, "location");
            if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.i())) {
                for (Object obj : B()) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((o0) obj).getName();
                    f0.o(name, "it.name");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.d())) {
                for (Object obj2 : A()) {
                    kotlin.reflect.jvm.internal.impl.name.f name2 = ((s0) obj2).getName();
                    f0.o(name2, "it.name");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> g() {
            List<ProtoBuf.TypeAlias> list = this.f127781c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f127792n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(r.b(deserializedMemberScope.q().g(), ((ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).X()));
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public final class OptimizedImplementation implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ n<Object>[] f127805j = {n0.u(new PropertyReference1Impl(n0.d(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), n0.u(new PropertyReference1Impl(n0.d(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f127806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f127807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f127808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, Collection<s0>> f127809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, Collection<o0>> f127810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, x0> f127811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h f127813h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ DeserializedMemberScope f127814i;

        public OptimizedImplementation(@dl.d DeserializedMemberScope deserializedMemberScope, @dl.d List<ProtoBuf.Function> functionList, @dl.d List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) throws IOException {
            Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> mapZ;
            f0.p(functionList, "functionList");
            f0.p(propertyList, "propertyList");
            f0.p(typeAliasList, "typeAliasList");
            this.f127814i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                kotlin.reflect.jvm.internal.impl.name.f fVarB = r.b(deserializedMemberScope.q().g(), ((ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj)).e0());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f127806a = p(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f127814i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                kotlin.reflect.jvm.internal.impl.name.f fVarB2 = r.b(deserializedMemberScope2.q().g(), ((ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj2)).d0());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f127807b = p(linkedHashMap2);
            if (this.f127814i.q().c().g().e()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f127814i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    kotlin.reflect.jvm.internal.impl.name.f fVarB3 = r.b(deserializedMemberScope3.q().g(), ((ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj3)).X());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapZ = p(linkedHashMap3);
            } else {
                mapZ = kotlin.collections.s0.z();
            }
            this.f127808c = mapZ;
            this.f127809d = this.f127814i.q().h().a(new yh.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functions$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<s0> invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f it) {
                    f0.p(it, "it");
                    return this.f127820b.m(it);
                }
            });
            this.f127810e = this.f127814i.q().h().a(new yh.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends o0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$properties$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<o0> invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f it) {
                    f0.p(it, "it");
                    return this.f127821b.n(it);
                }
            });
            this.f127811f = this.f127814i.q().h().h(new yh.l<kotlin.reflect.jvm.internal.impl.name.f, x0>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final x0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f it) {
                    f0.p(it, "it");
                    return this.f127822b.o(it);
                }
            });
            m mVarH = this.f127814i.q().h();
            final DeserializedMemberScope deserializedMemberScope4 = this.f127814i;
            this.f127812g = mVarH.c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                    return e1.C(this.f127818b.f127806a.keySet(), deserializedMemberScope4.u());
                }
            });
            m mVarH2 = this.f127814i.q().h();
            final DeserializedMemberScope deserializedMemberScope5 = this.f127814i;
            this.f127813h = mVarH2.c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                    return e1.C(this.f127823b.f127807b.keySet(), deserializedMemberScope5.v());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        public final Collection<s0> m(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<ProtoBuf.Function> listE;
            Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> map = this.f127806a;
            p<ProtoBuf.Function> PARSER = ProtoBuf.Function.f126746x;
            f0.o(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.f127814i;
            byte[] bArr = map.get(fVar);
            if (bArr != null) {
                listE = SequencesKt___SequencesKt.c3(SequencesKt__SequencesKt.m(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), this.f127814i)));
                if (listE == null) {
                    listE = CollectionsKt__CollectionsKt.E();
                }
            } else {
                listE = CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(listE.size());
            for (ProtoBuf.Function it : listE) {
                MemberDeserializer memberDeserializerF = deserializedMemberScope.q().f();
                f0.o(it, "it");
                s0 s0VarJ = memberDeserializerF.j(it);
                if (!deserializedMemberScope.y(s0VarJ)) {
                    s0VarJ = null;
                }
                if (s0VarJ != null) {
                    arrayList.add(s0VarJ);
                }
            }
            deserializedMemberScope.l(fVar, arrayList);
            return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        public final Collection<o0> n(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<ProtoBuf.Property> listE;
            Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> map = this.f127807b;
            p<ProtoBuf.Property> PARSER = ProtoBuf.Property.f126814x;
            f0.o(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.f127814i;
            byte[] bArr = map.get(fVar);
            if (bArr != null) {
                listE = SequencesKt___SequencesKt.c3(SequencesKt__SequencesKt.m(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), this.f127814i)));
                if (listE == null) {
                    listE = CollectionsKt__CollectionsKt.E();
                }
            } else {
                listE = CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(listE.size());
            for (ProtoBuf.Property it : listE) {
                MemberDeserializer memberDeserializerF = deserializedMemberScope.q().f();
                f0.o(it, "it");
                o0 o0VarL = memberDeserializerF.l(it);
                if (o0VarL != null) {
                    arrayList.add(o0VarL);
                }
            }
            deserializedMemberScope.m(fVar, arrayList);
            return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final x0 o(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            ProtoBuf.TypeAlias typeAliasO0;
            byte[] bArr = this.f127808c.get(fVar);
            if (bArr == null || (typeAliasO0 = ProtoBuf.TypeAlias.o0(new ByteArrayInputStream(bArr), this.f127814i.q().c().j())) == null) {
                return null;
            }
            return this.f127814i.q().f().m(typeAliasO0);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> p(Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(r0.j(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(t.Y(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it2.next()).c(byteArrayOutputStream);
                    arrayList.add(b2.f124493a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            return !b().contains(name) ? CollectionsKt__CollectionsKt.E() : this.f127809d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return (Set) l.a(this.f127812g, this, f127805j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            return !d().contains(name) ? CollectionsKt__CollectionsKt.E() : this.f127810e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return (Set) l.a(this.f127813h, this, f127805j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.e
        public x0 e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
            f0.p(name, "name");
            return this.f127811f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void f(@dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> result, @dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter, @dl.d ki.b location) {
            f0.p(result, "result");
            f0.p(kindFilter, "kindFilter");
            f0.p(nameFilter, "nameFilter");
            f0.p(location, "location");
            if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.i())) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setD = d();
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar : setD) {
                    if (nameFilter.invoke(fVar).booleanValue()) {
                        arrayList.addAll(c(fVar, location));
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.f.b INSTANCE = kotlin.reflect.jvm.internal.impl.resolve.f.b.f127559b;
                f0.o(INSTANCE, "INSTANCE");
                w.m0(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.d())) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : setB) {
                    if (nameFilter.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(a(fVar2, location));
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.f.b INSTANCE2 = kotlin.reflect.jvm.internal.impl.resolve.f.b.f127559b;
                f0.o(INSTANCE2, "INSTANCE");
                w.m0(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> g() {
            return this.f127808c.keySet();
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public interface a {
        @dl.d
        Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);

        @dl.d
        Set<kotlin.reflect.jvm.internal.impl.name.f> b();

        @dl.d
        Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar);

        @dl.d
        Set<kotlin.reflect.jvm.internal.impl.name.f> d();

        @dl.e
        x0 e(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

        void f(@dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collection, @dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @dl.d ki.b bVar);

        @dl.d
        Set<kotlin.reflect.jvm.internal.impl.name.f> g();
    }

    protected DeserializedMemberScope(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.j c10, @dl.d List<ProtoBuf.Function> functionList, @dl.d List<ProtoBuf.Property> propertyList, @dl.d List<ProtoBuf.TypeAlias> typeAliasList, @dl.d final yh.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> classNames) {
        f0.p(c10, "c");
        f0.p(functionList, "functionList");
        f0.p(propertyList, "propertyList");
        f0.p(typeAliasList, "typeAliasList");
        f0.p(classNames, "classNames");
        this.f127774b = c10;
        this.f127775c = o(functionList, propertyList, typeAliasList);
        this.f127776d = c10.h().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return CollectionsKt___CollectionsKt.V5(classNames.invoke());
            }
        });
        this.f127777e = c10.h().b(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classifierNamesLazy$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setT = this.f127826b.t();
                if (setT == null) {
                    return null;
                }
                return e1.C(e1.C(this.f127826b.r(), this.f127826b.f127775c.g()), setT);
            }
        });
    }

    private final a o(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f127774b.c().g().c() ? new NoReorderImplementation(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d p(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f127774b.c().b(n(fVar));
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> s() {
        return (Set) l.b(this.f127777e, this, f127773f[1]);
    }

    private final x0 w(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f127775c.e(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return this.f127775c.a(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f127775c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return this.f127775c.c(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f127775c.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        if (x(name)) {
            return p(name);
        }
        if (this.f127775c.g().contains(name)) {
            return w(name);
        }
        return null;
    }

    protected abstract void j(@dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collection, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @dl.d
    protected final Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> k(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter, @dl.d ki.b location) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        f0.p(location, "location");
        ArrayList arrayList = new ArrayList(0);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c;
        if (kindFilter.a(aVar.g())) {
            j(arrayList, nameFilter);
        }
        this.f127775c.f(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : r()) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, p(fVar));
                }
            }
        }
        if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.h())) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : this.f127775c.g()) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, this.f127775c.e(fVar2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    protected void l(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d List<s0> functions) {
        f0.p(name, "name");
        f0.p(functions, "functions");
    }

    protected void m(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d List<o0> descriptors) {
        f0.p(name, "name");
        f0.p(descriptors, "descriptors");
    }

    @dl.d
    protected abstract kotlin.reflect.jvm.internal.impl.name.b n(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    @dl.d
    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j q() {
        return this.f127774b;
    }

    @dl.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> r() {
        return (Set) l.a(this.f127776d, this, f127773f[0]);
    }

    @dl.e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> t();

    @dl.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> u();

    @dl.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> v();

    protected boolean x(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        return r().contains(name);
    }

    protected boolean y(@dl.d s0 function) {
        f0.p(function, "function");
        return true;
    }
}
