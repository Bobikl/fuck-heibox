package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: AnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends AbstractAnnotationTypeQualifierResolver<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        f0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List<String> y(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b)) {
            return gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.i ? kotlin.collections.s.k(((kotlin.reflect.jvm.internal.impl.resolve.constants.i) gVar).c().d()) : CollectionsKt__CollectionsKt.E();
        }
        List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> listB = ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.n0(arrayList, y((kotlin.reflect.jvm.internal.impl.resolve.constants.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @dl.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable<String> b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z10) {
        f0.p(cVar, "<this>");
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> mapA = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> entry : mapA.entrySet()) {
            kotlin.collections.x.n0(arrayList, (!z10 || f0.g(entry.getKey(), t.f126311c)) ? y(entry.getValue()) : CollectionsKt__CollectionsKt.E());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @dl.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.name.c i(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        f0.p(cVar, "<this>");
        return cVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object j(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        f0.p(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarI = DescriptorUtilsKt.i(cVar);
        f0.m(dVarI);
        return dVarI;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations;
        f0.p(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarI = DescriptorUtilsKt.i(cVar);
        return (dVarI == null || (annotations = dVarI.getAnnotations()) == null) ? CollectionsKt__CollectionsKt.E() : annotations;
    }
}
