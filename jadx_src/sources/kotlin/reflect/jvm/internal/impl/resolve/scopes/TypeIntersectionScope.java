package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import xh.m;
import yh.l;

/* JADX INFO: compiled from: TypeIntersectionScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeIntersectionScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f127601d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f127602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final MemberScope f127603c;

    /* JADX INFO: compiled from: TypeIntersectionScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final MemberScope a(@dl.d String message, @dl.d Collection<? extends d0> types) {
            f0.p(message, "message");
            f0.p(types, "types");
            ArrayList arrayList = new ArrayList(t.Y(types, 10));
            Iterator<T> it = types.iterator();
            while (it.hasNext()) {
                arrayList.add(((d0) it.next()).u());
            }
            kotlin.reflect.jvm.internal.impl.utils.d<MemberScope> dVarB = ui.a.b(arrayList);
            MemberScope memberScopeB = b.f127607d.b(message, dVarB);
            return dVarB.size() <= 1 ? memberScopeB : new TypeIntersectionScope(message, memberScopeB, null);
        }
    }

    private TypeIntersectionScope(String str, MemberScope memberScope) {
        this.f127602b = str;
        this.f127603c = memberScope;
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, u uVar) {
        this(str, memberScope);
    }

    @dl.d
    @m
    public static final MemberScope k(@dl.d String str, @dl.d Collection<? extends d0> collection) {
        return f127601d.a(str, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return OverridingUtilsKt.a(super.a(name, location), new l<s0, kotlin.reflect.jvm.internal.impl.descriptors.a>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedFunctions$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(@dl.d s0 selectMostSpecificInEachOverridableGroup) {
                f0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return OverridingUtilsKt.a(super.c(name, location), new l<o0, kotlin.reflect.jvm.internal.impl.descriptors.a>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedVariables$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(@dl.d o0 selectMostSpecificInEachOverridableGroup) {
                f0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        Collection<k> collectionG = super.g(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionG) {
            if (((k) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        f0.n(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt___CollectionsKt.y4(OverridingUtilsKt.a(list, new l<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedDescriptors$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a selectMostSpecificInEachOverridableGroup) {
                f0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            }
        }), list2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @dl.d
    protected MemberScope j() {
        return this.f127603c;
    }
}
