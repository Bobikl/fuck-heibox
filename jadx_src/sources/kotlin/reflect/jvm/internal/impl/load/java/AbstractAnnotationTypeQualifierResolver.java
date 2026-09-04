package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;

/* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final a f125952c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final Map<String, AnnotationQualifierApplicabilityType> f125953d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final JavaTypeEnhancementState f125954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<Object, TAnnotation> f125955b;

    /* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f125953d = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(@dl.d JavaTypeEnhancementState javaTypeEnhancementState) {
        f0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f125954a = javaTypeEnhancementState;
        this.f125955b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<AnnotationQualifierApplicabilityType> a(Set<? extends AnnotationQualifierApplicabilityType> set) {
        return set.contains(AnnotationQualifierApplicabilityType.TYPE_USE) ? e1.C(e1.y(ArraysKt___ArraysKt.Mz(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final l d(TAnnotation tannotation) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVarG;
        l lVarR = r(tannotation);
        if (lVarR != null) {
            return lVarR;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> pairT = t(tannotation);
        if (pairT == null) {
            return null;
        }
        TAnnotation tannotationA = pairT.a();
        Set<AnnotationQualifierApplicabilityType> setB = pairT.b();
        ReportLevel reportLevelQ = q(tannotation);
        if (reportLevelQ == null) {
            reportLevelQ = p(tannotationA);
        }
        if (reportLevelQ.isIgnore() || (fVarG = g(tannotationA, new yh.l<TAnnotation, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d TAnnotation extractNullability) {
                f0.p(extractNullability, "$this$extractNullability");
                return Boolean.FALSE;
            }
        })) == null) {
            return null;
        }
        return new l(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.b(fVarG, null, reportLevelQ.isWarning(), 1, null), setB, false, 4, null);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f g(TAnnotation tannotation, yh.l<? super TAnnotation, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVarN;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVarN2 = n(tannotation, lVar.invoke(tannotation).booleanValue());
        if (fVarN2 != null) {
            return fVarN2;
        }
        TAnnotation tannotationS = s(tannotation);
        if (tannotationS == null) {
            return null;
        }
        ReportLevel reportLevelP = p(tannotation);
        if (reportLevelP.isIgnore() || (fVarN = n(tannotationS, lVar.invoke(tannotationS).booleanValue())) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.b(fVarN, null, reportLevelP.isWarning(), 1, null);
    }

    private final TAnnotation h(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        for (TAnnotation tannotation2 : k(tannotation)) {
            if (f0.g(i(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean l(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Iterable<TAnnotation> iterableK = k(tannotation);
        if ((iterableK instanceof Collection) && ((Collection) iterableK).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableK.iterator();
        while (it.hasNext()) {
            if (f0.g(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r6.equals("NEVER") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r6.equals("MAYBE") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f n(TAnnotation r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.n(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f");
    }

    private final ReportLevel o(TAnnotation tannotation) {
        kotlin.reflect.jvm.internal.impl.name.c cVarI = i(tannotation);
        return (cVarI == null || !kotlin.reflect.jvm.internal.impl.load.java.a.c().containsKey(cVarI)) ? p(tannotation) : this.f125954a.c().invoke(cVarI);
    }

    private final ReportLevel p(TAnnotation tannotation) {
        ReportLevel reportLevelQ = q(tannotation);
        return reportLevelQ != null ? reportLevelQ : this.f125954a.d().a();
    }

    private final ReportLevel q(TAnnotation tannotation) {
        Iterable<String> iterableB;
        String str;
        ReportLevel reportLevel = this.f125954a.d().c().get(i(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationH = h(tannotation, kotlin.reflect.jvm.internal.impl.load.java.a.d());
        if (tannotationH == null || (iterableB = b(tannotationH, false)) == null || (str = (String) CollectionsKt___CollectionsKt.z2(iterableB)) == null) {
            return null;
        }
        ReportLevel reportLevelB = this.f125954a.d().b();
        if (reportLevelB != null) {
            return reportLevelB;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    private final l r(TAnnotation tannotation) {
        l lVar;
        if (this.f125954a.b() || (lVar = kotlin.reflect.jvm.internal.impl.load.java.a.a().get(i(tannotation))) == null) {
            return null;
        }
        ReportLevel reportLevelO = o(tannotation);
        if (!(reportLevelO != ReportLevel.IGNORE)) {
            reportLevelO = null;
        }
        if (reportLevelO == null) {
            return null;
        }
        return l.b(lVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.b(lVar.d(), null, reportLevelO.isWarning(), 1, null), null, false, 6, null);
    }

    private final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> t(TAnnotation tannotation) {
        TAnnotation tannotationH;
        TAnnotation next;
        if (this.f125954a.d().d() || (tannotationH = h(tannotation, kotlin.reflect.jvm.internal.impl.load.java.a.e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = k(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(s(next) != null));
        if (next == null) {
            return null;
        }
        Iterable<String> iterableB = b(tannotationH, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableB.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f125953d.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(next, a(linkedHashSet));
    }

    @dl.d
    protected abstract Iterable<String> b(@dl.d TAnnotation tannotation, boolean z10);

    @dl.e
    public final r c(@dl.e r rVar, @dl.d Iterable<? extends TAnnotation> annotations) {
        EnumMap<AnnotationQualifierApplicabilityType, l> enumMapB;
        f0.p(annotations, "annotations");
        if (this.f125954a.b()) {
            return rVar;
        }
        ArrayList<l> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = annotations.iterator();
        while (it.hasNext()) {
            l lVarD = d(it.next());
            if (lVarD != null) {
                arrayList.add(lVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return rVar;
        }
        EnumMap enumMap = (rVar == null || (enumMapB = rVar.b()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMapB);
        boolean z10 = false;
        for (l lVar : arrayList) {
            Iterator<AnnotationQualifierApplicabilityType> it2 = lVar.e().iterator();
            while (it2.hasNext()) {
                enumMap.put(it2.next(), lVar);
                z10 = true;
            }
        }
        return !z10 ? rVar : new r(enumMap);
    }

    @dl.e
    public final MutabilityQualifier e(@dl.d Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        f0.p(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.c cVarI = i(it.next());
            if (u.m().contains(cVarI)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (u.j().contains(cVarI)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f(@dl.d Iterable<? extends TAnnotation> annotations, @dl.d yh.l<? super TAnnotation, Boolean> forceWarning) {
        f0.p(annotations, "annotations");
        f0.p(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVar = null;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f fVarG = g(it.next(), forceWarning);
            if (fVar != null) {
                if (fVarG != null && !f0.g(fVarG, fVar) && (!fVarG.d() || fVar.d())) {
                    if (fVarG.d() || !fVar.d()) {
                        return null;
                    }
                }
            }
            fVar = fVarG;
        }
        return fVar;
    }

    @dl.e
    protected abstract kotlin.reflect.jvm.internal.impl.name.c i(@dl.d TAnnotation tannotation);

    @dl.d
    protected abstract Object j(@dl.d TAnnotation tannotation);

    @dl.d
    protected abstract Iterable<TAnnotation> k(@dl.d TAnnotation tannotation);

    public final boolean m(@dl.d TAnnotation annotation) {
        f0.p(annotation, "annotation");
        TAnnotation tannotationH = h(annotation, kotlin.reflect.jvm.internal.impl.builtins.h.a.H);
        if (tannotationH == null) {
            return false;
        }
        Iterable<String> iterableB = b(tannotationH, false);
        if ((iterableB instanceof Collection) && ((Collection) iterableB).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableB.iterator();
        while (it.hasNext()) {
            if (f0.g(it.next(), KotlinTarget.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    public final TAnnotation s(@dl.d TAnnotation annotation) {
        TAnnotation tannotationS;
        f0.p(annotation, "annotation");
        if (this.f125954a.d().d()) {
            return null;
        }
        if (CollectionsKt___CollectionsKt.R1(kotlin.reflect.jvm.internal.impl.load.java.a.b(), i(annotation)) || l(annotation, kotlin.reflect.jvm.internal.impl.load.java.a.f())) {
            return annotation;
        }
        if (!l(annotation, kotlin.reflect.jvm.internal.impl.load.java.a.g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f125955b;
        Object objJ = j(annotation);
        TAnnotation tannotation = concurrentHashMap.get(objJ);
        if (tannotation != null) {
            return tannotation;
        }
        Iterator<TAnnotation> it = k(annotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationS = null;
                break;
            }
            tannotationS = s(it.next());
        } while (tannotationS == null);
        if (tannotationS == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objJ, tannotationS);
        return tannotationPutIfAbsent == null ? tannotationS : tannotationPutIfAbsent;
    }
}
