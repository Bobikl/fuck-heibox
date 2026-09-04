package ii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: PackagePartScopeCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final DeserializedDescriptorResolver f119371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final g f119372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, MemberScope> f119373c;

    public a(@dl.d DeserializedDescriptorResolver resolver, @dl.d g kotlinClassFinder) {
        f0.p(resolver, "resolver");
        f0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f119371a = resolver;
        this.f119372b = kotlinClassFinder;
        this.f119373c = new ConcurrentHashMap<>();
    }

    @dl.d
    public final MemberScope a(@dl.d f fileClass) {
        Collection collectionK;
        f0.p(fileClass, "fileClass");
        ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, MemberScope> concurrentHashMap = this.f119373c;
        kotlin.reflect.jvm.internal.impl.name.b bVarF = fileClass.f();
        MemberScope memberScope = concurrentHashMap.get(bVarF);
        if (memberScope == null) {
            kotlin.reflect.jvm.internal.impl.name.c cVarH = fileClass.f().h();
            f0.o(cVarH, "fileClass.classId.packageFqName");
            if (fileClass.h().c() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> listF = fileClass.h().f();
                collectionK = new ArrayList();
                Iterator<T> it = listF.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d((String) it.next()).e());
                    f0.o(bVarM, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    o oVarA = n.a(this.f119372b, bVarM);
                    if (oVarA != null) {
                        collectionK.add(oVarA);
                    }
                }
            } else {
                collectionK = s.k(fileClass);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l lVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l(this.f119371a.d().p(), cVarH);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionK.iterator();
            while (it2.hasNext()) {
                MemberScope memberScopeB = this.f119371a.b(lVar, (o) it2.next());
                if (memberScopeB != null) {
                    arrayList.add(memberScopeB);
                }
            }
            List listQ5 = CollectionsKt___CollectionsKt.Q5(arrayList);
            MemberScope memberScopeA = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f127607d.a("package " + cVarH + " (" + fileClass + ')', listQ5);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(bVarF, memberScopeA);
            memberScope = memberScopePutIfAbsent == null ? memberScopeA : memberScopePutIfAbsent;
        }
        f0.o(memberScope, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return memberScope;
    }
}
