package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e1;
import kotlin.collections.r0;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.o;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import yh.l;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a implements u {

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final ProtoBuf.Class f127728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f127729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final t0 f127730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b f127731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final Modality f127732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final s f127733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final ClassKind f127734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j f127735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.f f127736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final DeserializedClassTypeConstructor f127737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final ScopesHolderForClass<DeserializedClassMemberScope> f127738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private final EnumEntryClassDescriptors f127739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.k f127740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.descriptors.c> f127741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<Collection<kotlin.reflect.jvm.internal.impl.descriptors.c>> f127742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.descriptors.d> f127743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>> f127744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<z0<j0>> f127745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final t.a f127746z;

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.types.checker.f f127747g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h<Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> f127748h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h<Collection<d0>> f127749i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ DeserializedClassDescriptor f127750j;

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends kotlin.reflect.jvm.internal.impl.resolve.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<D> f127752a;

            a(List<D> list) {
                this.f127752a = list;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.resolve.h
            public void a(@dl.d CallableMemberDescriptor fakeOverride) {
                f0.p(fakeOverride, "fakeOverride");
                OverridingUtil.K(fakeOverride, null);
                this.f127752a.add((D) fakeOverride);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.g
            protected void e(@dl.d CallableMemberDescriptor fromSuper, @dl.d CallableMemberDescriptor fromCurrent) {
                f0.p(fromSuper, "fromSuper");
                f0.p(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof o) {
                    ((o) fromCurrent).V0(kotlin.reflect.jvm.internal.impl.descriptors.t.f125941a, fromSuper);
                }
            }
        }

        public DeserializedClassMemberScope(@dl.d DeserializedClassDescriptor deserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f127750j = deserializedClassDescriptor;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j jVarB1 = deserializedClassDescriptor.b1();
            List<ProtoBuf.Function> listI0 = deserializedClassDescriptor.c1().I0();
            f0.o(listI0, "classProto.functionList");
            List<ProtoBuf.Property> listW0 = deserializedClassDescriptor.c1().W0();
            f0.o(listW0, "classProto.propertyList");
            List<ProtoBuf.TypeAlias> listE1 = deserializedClassDescriptor.c1().e1();
            f0.o(listE1, "classProto.typeAliasList");
            List<Integer> listT0 = deserializedClassDescriptor.c1().T0();
            f0.o(listT0, "classProto.nestedClassNameList");
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarG = deserializedClassDescriptor.b1().g();
            final ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listT0, 10));
            Iterator<T> it = listT0.iterator();
            while (it.hasNext()) {
                arrayList.add(r.b(cVarG, ((Number) it.next()).intValue()));
            }
            super(jVarB1, listI0, listW0, listE1, new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                    return arrayList;
                }
            });
            this.f127747g = kotlinTypeRefiner;
            this.f127748h = q().h().c(new yh.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.k>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> invoke() {
                    return this.f127753b.k(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127625o, MemberScope.f127583a.a(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                }
            });
            this.f127749i = q().h().c(new yh.a<Collection<? extends d0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<d0> invoke() {
                    return this.f127754b.f127747g.g(this.f127754b.C());
                }
            });
        }

        private final <D extends CallableMemberDescriptor> void B(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends D> collection, List<D> list) {
            q().c().m().b().v(fVar, collection, new ArrayList(list), C(), new a(list));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeserializedClassDescriptor C() {
            return this.f127750j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @dl.d
        public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            e(name, location);
            return super.a(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            e(name, location);
            return super.c(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            f0.p(name, "name");
            f0.p(location, "location");
            ji.a.a(q().c().o(), location, C(), name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
            f0.p(kindFilter, "kindFilter");
            f0.p(nameFilter, "nameFilter");
            return this.f127748h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @dl.e
        public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarF;
            f0.p(name, "name");
            f0.p(location, "location");
            e(name, location);
            EnumEntryClassDescriptors enumEntryClassDescriptors = C().f127739s;
            return (enumEntryClassDescriptors == null || (dVarF = enumEntryClassDescriptors.f(name)) == null) ? super.h(name, location) : dVarF;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void j(@dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> result, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
            f0.p(result, "result");
            f0.p(nameFilter, "nameFilter");
            EnumEntryClassDescriptors enumEntryClassDescriptors = C().f127739s;
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> collectionD = enumEntryClassDescriptors != null ? enumEntryClassDescriptors.d() : null;
            if (collectionD == null) {
                collectionD = CollectionsKt__CollectionsKt.E();
            }
            result.addAll(collectionD);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void l(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d List<s0> functions) {
            f0.p(name, "name");
            f0.p(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<d0> it = this.f127749i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().u().a(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            functions.addAll(q().c().c().d(name, this.f127750j));
            B(name, arrayList, functions);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void m(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d List<o0> descriptors) {
            f0.p(name, "name");
            f0.p(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<d0> it = this.f127749i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().u().c(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            B(name, arrayList, descriptors);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @dl.d
        protected kotlin.reflect.jvm.internal.impl.name.b n(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
            f0.p(name, "name");
            kotlin.reflect.jvm.internal.impl.name.b bVarD = this.f127750j.f127731k.d(name);
            f0.o(bVarD, "classId.createNestedClassId(name)");
            return bVarD;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @dl.e
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> t() {
            List<d0> listL = C().f127737q.l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listL.iterator();
            while (it.hasNext()) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setF = ((d0) it.next()).u().f();
                if (setF == null) {
                    return null;
                }
                x.n0(linkedHashSet, setF);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @dl.d
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> u() {
            List<d0> listL = C().f127737q.l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listL.iterator();
            while (it.hasNext()) {
                x.n0(linkedHashSet, ((d0) it.next()).u().b());
            }
            linkedHashSet.addAll(q().c().c().e(this.f127750j));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @dl.d
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> v() {
            List<d0> listL = C().f127737q.l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listL.iterator();
            while (it.hasNext()) {
                x.n0(linkedHashSet, ((d0) it.next()).u().d());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected boolean y(@dl.d s0 function) {
            f0.p(function, "function");
            return q().c().s().a(this.f127750j, function);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h<List<y0>> f127755d;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.b1().h());
            this.f127755d = DeserializedClassDescriptor.this.b1().h().c(new yh.a<List<? extends y0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends y0> invoke() {
                    return TypeParameterUtilsKt.d(deserializedClassDescriptor);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public List<y0> getParameters() {
            return this.f127755d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected Collection<d0> k() {
            String strB;
            kotlin.reflect.jvm.internal.impl.name.c cVarB;
            List<ProtoBuf.Type> listO = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.o(DeserializedClassDescriptor.this.c1(), DeserializedClassDescriptor.this.b1().j());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listO, 10));
            Iterator<T> it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.b1().i().q((ProtoBuf.Type) it.next()));
            }
            List listY4 = CollectionsKt___CollectionsKt.y4(arrayList, DeserializedClassDescriptor.this.b1().c().c().c(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.b> arrayList2 = new ArrayList();
            Iterator it2 = listY4.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((d0) it2.next()).O0().d();
                NotFoundClasses.b bVar = fVarD instanceof NotFoundClasses.b ? (NotFoundClasses.b) fVarD : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                m mVarI = DeserializedClassDescriptor.this.b1().c().i();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(arrayList2, 10));
                for (NotFoundClasses.b bVar2 : arrayList2) {
                    kotlin.reflect.jvm.internal.impl.name.b bVarK = DescriptorUtilsKt.k(bVar2);
                    if (bVarK == null || (cVarB = bVarK.b()) == null || (strB = cVarB.b()) == null) {
                        strB = bVar2.getName().b();
                    }
                    arrayList3.add(strB);
                }
                mVarI.b(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt___CollectionsKt.Q5(listY4);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected w0 p() {
            return w0.a.f125944a;
        }

        @dl.d
        public String toString() {
            String string = DeserializedClassDescriptor.this.getName().toString();
            f0.o(string, "name.toString()");
            return string;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        @dl.d
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor d() {
            return DeserializedClassDescriptor.this;
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public final class EnumEntryClassDescriptors {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, ProtoBuf.EnumEntry> f127758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> f127759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.storage.h<Set<kotlin.reflect.jvm.internal.impl.name.f>> f127760c;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf.EnumEntry> listD0 = DeserializedClassDescriptor.this.c1().D0();
            f0.o(listD0, "classProto.enumEntryList");
            LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(kotlin.collections.t.Y(listD0, 10)), 16));
            for (Object obj : listD0) {
                linkedHashMap.put(r.b(DeserializedClassDescriptor.this.b1().g(), ((ProtoBuf.EnumEntry) obj).F()), obj);
            }
            this.f127758a = linkedHashMap;
            kotlin.reflect.jvm.internal.impl.storage.m mVarH = DeserializedClassDescriptor.this.b1().h();
            final DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.f127759b = mVarH.h(new l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
                    f0.p(name, "name");
                    final ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) this.f127762b.f127758a.get(name);
                    if (enumEntry == null) {
                        return null;
                    }
                    final DeserializedClassDescriptor deserializedClassDescriptor2 = deserializedClassDescriptor;
                    return kotlin.reflect.jvm.internal.impl.descriptors.impl.m.M0(deserializedClassDescriptor2.b1().h(), deserializedClassDescriptor2, name, this.f127762b.f127760c, new b(deserializedClassDescriptor2.b1().h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                            return CollectionsKt___CollectionsKt.Q5(deserializedClassDescriptor2.b1().c().d().c(deserializedClassDescriptor2.g1(), enumEntry));
                        }
                    }), t0.f125942a);
                }
            });
            this.f127760c = DeserializedClassDescriptor.this.b1().h().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                    return this.f127766b.e();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
            HashSet hashSet = new HashSet();
            Iterator<d0> it = DeserializedClassDescriptor.this.r().l().iterator();
            while (it.hasNext()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.k kVar : kotlin.reflect.jvm.internal.impl.resolve.scopes.h.a.a(it.next().u(), null, null, 3, null)) {
                    if ((kVar instanceof s0) || (kVar instanceof o0)) {
                        hashSet.add(kVar.getName());
                    }
                }
            }
            List<ProtoBuf.Function> listI0 = DeserializedClassDescriptor.this.c1().I0();
            f0.o(listI0, "classProto.functionList");
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = listI0.iterator();
            while (it2.hasNext()) {
                hashSet.add(r.b(deserializedClassDescriptor.b1().g(), ((ProtoBuf.Function) it2.next()).e0()));
            }
            List<ProtoBuf.Property> listW0 = DeserializedClassDescriptor.this.c1().W0();
            f0.o(listW0, "classProto.propertyList");
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = listW0.iterator();
            while (it3.hasNext()) {
                hashSet.add(r.b(deserializedClassDescriptor2.b1().g(), ((ProtoBuf.Property) it3.next()).d0()));
            }
            return e1.C(hashSet, hashSet);
        }

        @dl.d
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> d() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setKeySet = this.f127758a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarF = f((kotlin.reflect.jvm.internal.impl.name.f) it.next());
                if (dVarF != null) {
                    arrayList.add(dVarF);
                }
            }
            return arrayList;
        }

        @dl.e
        public final kotlin.reflect.jvm.internal.impl.descriptors.d f(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
            f0.p(name, "name");
            return this.f127759b.invoke(name);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(@dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.j outerContext, @dl.d ProtoBuf.Class classProto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a metadataVersion, @dl.d t0 sourceElement) {
        super(outerContext.h(), r.a(nameResolver, classProto.F0()).j());
        f0.p(outerContext, "outerContext");
        f0.p(classProto, "classProto");
        f0.p(nameResolver, "nameResolver");
        f0.p(metadataVersion, "metadataVersion");
        f0.p(sourceElement, "sourceElement");
        this.f127728h = classProto;
        this.f127729i = metadataVersion;
        this.f127730j = sourceElement;
        this.f127731k = r.a(nameResolver, classProto.F0());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.u uVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.u.f127907a;
        this.f127732l = uVar.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127038e.d(classProto.E0()));
        this.f127733m = v.a(uVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127037d.d(classProto.E0()));
        ClassKind classKindA = uVar.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127039f.d(classProto.E0()));
        this.f127734n = classKindA;
        List<ProtoBuf.TypeParameter> listH1 = classProto.h1();
        f0.o(listH1, "classProto.typeParameterList");
        ProtoBuf.TypeTable typeTableI1 = classProto.i1();
        f0.o(typeTableI1, "classProto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(typeTableI1);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.a aVar = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f127067b;
        ProtoBuf.VersionRequirementTable versionRequirementTableK1 = classProto.k1();
        f0.o(versionRequirementTableK1, "classProto.versionRequirementTable");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.j jVarA = outerContext.a(this, listH1, nameResolver, gVar, aVar.a(versionRequirementTableK1), metadataVersion);
        this.f127735o = jVarA;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        this.f127736p = classKindA == classKind ? new StaticScopeForKotlinEnum(jVarA.h(), this) : MemberScope.b.f127587b;
        this.f127737q = new DeserializedClassTypeConstructor();
        this.f127738r = ScopesHolderForClass.f125571e.a(this, jVarA.h(), jVarA.c().m().c(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.f127739s = classKindA == classKind ? new EnumEntryClassDescriptors() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarE = outerContext.e();
        this.f127740t = kVarE;
        this.f127741u = jVarA.h().b(new yh.a<kotlin.reflect.jvm.internal.impl.descriptors.c>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.c invoke() {
                return this.f127770b.X0();
            }
        });
        this.f127742v = jVarA.h().c(new yh.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> invoke() {
                return this.f127769b.U0();
            }
        });
        this.f127743w = jVarA.h().b(new yh.a<kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke() {
                return this.f127768b.T0();
            }
        });
        this.f127744x = jVarA.h().c(new yh.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> invoke() {
                return this.f127771b.Z0();
            }
        });
        this.f127745y = jVarA.h().b(new yh.a<z0<j0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$valueClassRepresentation$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z0<j0> invoke() {
                return this.f127772b.a1();
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarG = jVarA.g();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVarJ = jVarA.j();
        DeserializedClassDescriptor deserializedClassDescriptor = kVarE instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) kVarE : null;
        this.f127746z = new t.a(classProto, cVarG, gVarJ, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f127746z : null);
        this.A = !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127036c.d(classProto.E0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b() : new k(jVarA.h(), new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                return CollectionsKt___CollectionsKt.Q5(this.f127767b.b1().c().d().b(this.f127767b.g1()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d T0() {
        if (!this.f127728h.l1()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = d1().h(r.b(this.f127735o.g(), this.f127728h.r0()), NoLookupLocation.FROM_DESERIALIZATION);
        if (fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> U0() {
        return CollectionsKt___CollectionsKt.y4(CollectionsKt___CollectionsKt.y4(Y0(), CollectionsKt__CollectionsKt.M(D())), this.f127735o.c().c().b(this));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.x<j0> V0() {
        kotlin.reflect.jvm.internal.impl.name.f name;
        j0 j0VarN;
        Object obj = null;
        if (!g() && !y()) {
            return null;
        }
        if (y() && !this.f127728h.o1() && !this.f127728h.p1() && !this.f127728h.q1() && this.f127728h.M0() > 0) {
            return null;
        }
        if (this.f127728h.o1()) {
            name = r.b(this.f127735o.g(), this.f127728h.J0());
        } else {
            if (this.f127729i.c(1, 5, 1)) {
                throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + this).toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.c cVarD = D();
            if (cVarD == null) {
                throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
            }
            List<b1> listI = cVarD.i();
            f0.o(listI, "constructor.valueParameters");
            name = ((b1) CollectionsKt___CollectionsKt.w2(listI)).getName();
            f0.o(name, "{\n                // Bef…irst().name\n            }");
        }
        ProtoBuf.Type typeI = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.i(this.f127728h, this.f127735o.j());
        if (typeI == null || (j0VarN = TypeDeserializer.n(this.f127735o.i(), typeI, false, 2, null)) == null) {
            Iterator<T> it = d1().c(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
            Object obj2 = null;
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z10) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it.next();
                if (((o0) next).l0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj2 = next;
                }
            }
            o0 o0Var = (o0) obj;
            if (o0Var == null) {
                throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
            }
            d0 type = o0Var.getType();
            f0.n(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            j0VarN = (j0) type;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.x<>(name, j0VarN);
    }

    private final e0<j0> W0() {
        List<ProtoBuf.Type> listS0;
        List<Integer> listN0 = this.f127728h.N0();
        f0.o(listN0, "classProto.multiFieldValueClassUnderlyingNameList");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listN0, 10));
        for (Integer it : listN0) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarG = this.f127735o.g();
            f0.o(it, "it");
            arrayList.add(r.b(cVarG, it.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (!y()) {
            throw new IllegalArgumentException(("Not a value class: " + this).toString());
        }
        Pair pairA = c1.a(Integer.valueOf(this.f127728h.Q0()), Integer.valueOf(this.f127728h.P0()));
        if (f0.g(pairA, c1.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listR0 = this.f127728h.R0();
            f0.o(listR0, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
            listS0 = new ArrayList<>(kotlin.collections.t.Y(listR0, 10));
            for (Integer it2 : listR0) {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVarJ = this.f127735o.j();
                f0.o(it2, "it");
                listS0.add(gVarJ.a(it2.intValue()));
            }
        } else {
            if (!f0.g(pairA, c1.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("Illegal multi-field value class representation: " + this).toString());
            }
            listS0 = this.f127728h.S0();
        }
        f0.o(listS0, "when (typeIdCount to typ…tation: $this\")\n        }");
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(listS0, 10));
        for (ProtoBuf.Type it3 : listS0) {
            TypeDeserializer typeDeserializerI = this.f127735o.i();
            f0.o(it3, "it");
            arrayList2.add(TypeDeserializer.n(typeDeserializerI, it3, false, 2, null));
        }
        return new e0<>(CollectionsKt___CollectionsKt.d6(arrayList, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.c X0() {
        Object next;
        if (this.f127734n.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.e eVarL = kotlin.reflect.jvm.internal.impl.resolve.c.l(this, t0.f125942a);
            eVarL.h1(v());
            return eVarL;
        }
        List<ProtoBuf.Constructor> listU0 = this.f127728h.u0();
        f0.o(listU0, "classProto.constructorList");
        Iterator<T> it = listU0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127046m.d(((ProtoBuf.Constructor) next).K()).booleanValue()));
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.f127735o.f().i(constructor, true);
        }
        return null;
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.c> Y0() {
        List<ProtoBuf.Constructor> listU0 = this.f127728h.u0();
        f0.o(listU0, "classProto.constructorList");
        ArrayList<ProtoBuf.Constructor> arrayList = new ArrayList();
        for (Object obj : listU0) {
            Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127046m.d(((ProtoBuf.Constructor) obj).K());
            f0.o(boolD, "IS_SECONDARY.get(it.flags)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(arrayList, 10));
        for (ProtoBuf.Constructor it : arrayList) {
            MemberDeserializer memberDeserializerF = this.f127735o.f();
            f0.o(it, "it");
            arrayList2.add(memberDeserializerF.i(it, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> Z0() {
        if (this.f127732l != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<Integer> fqNames = this.f127728h.X0();
        f0.o(fqNames, "fqNames");
        if (!(!fqNames.isEmpty())) {
            return kotlin.reflect.jvm.internal.impl.resolve.a.f127506a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer index : fqNames) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVarC = this.f127735o.c();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarG = this.f127735o.g();
            f0.o(index, "index");
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarB = hVarC.b(r.a(cVarG, index.intValue()));
            if (dVarB != null) {
                arrayList.add(dVarB);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0<j0> a1() {
        kotlin.reflect.jvm.internal.impl.descriptors.x<j0> xVarV0 = V0();
        e0<j0> e0VarW0 = W0();
        if (xVarV0 != null && e0VarW0 != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + this);
        }
        if ((!y() && !g()) || xVarV0 != null || e0VarW0 != null) {
            return xVarV0 != null ? xVarV0 : e0VarW0;
        }
        throw new IllegalArgumentException("Value class has no value class representation: " + this);
    }

    private final DeserializedClassMemberScope d1() {
        return (DeserializedClassMemberScope) this.f127738r.c(this.f127735o.c().m().c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127042i.d(this.f127728h.E0());
        f0.o(boolD, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return this.f127741u.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        return this.f127734n;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j b1() {
        return this.f127735o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        return this.f127740t;
    }

    @dl.d
    public final ProtoBuf.Class c1() {
        return this.f127728h;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a e1() {
        return this.f127729i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.f x0() {
        return this.f127736p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean g() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127044k.d(this.f127728h.E0());
        f0.o(boolD, "IS_VALUE_CLASS.get(classProto.flags)");
        return boolD.booleanValue() && this.f127729i.e(1, 4, 1);
    }

    @dl.d
    public final t.a g1() {
        return this.f127746z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public s getVisibility() {
        return this.f127733m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        return this.f127742v.invoke();
    }

    public final boolean h1(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        return d1().r().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        return this.f127730j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        return this.f127732l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127040g.d(this.f127728h.E0());
        f0.o(boolD, "IS_INNER.get(classProto.flags)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public z0<j0> m0() {
        return this.f127745y.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.r0> p0() {
        List<ProtoBuf.Type> listB = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.b(this.f127728h, this.f127735o.j());
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new c0(b0(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b(this, this.f127735o.i().q((ProtoBuf.Type) it.next()), null, null), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.z0 r() {
        return this.f127737q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean r0() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127039f.d(this.f127728h.E0()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> s() {
        return this.f127744x.invoke();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(w0() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    protected MemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f127738r.c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        return this.f127735o.i().j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127043j.d(this.f127728h.E0());
        f0.o(boolD, "IS_EXPECT_CLASS.get(classProto.flags)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean x() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127045l.d(this.f127728h.E0());
        f0.o(boolD, "IS_FUN_INTERFACE.get(classProto.flags)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean y() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127044k.d(this.f127728h.E0());
        f0.o(boolD, "IS_VALUE_CLASS.get(classProto.flags)");
        return boolD.booleanValue() && this.f127729i.c(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d y0() {
        return this.f127743w.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean z() {
        Boolean boolD = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f127041h.d(this.f127728h.E0());
        f0.o(boolD, "IS_DATA.get(classProto.flags)");
        return boolD.booleanValue();
    }
}
