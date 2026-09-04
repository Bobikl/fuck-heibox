package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.sequences.SequencesKt___SequencesKt;
import yh.l;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaAnnotations implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d f126067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final mi.d f126068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f126069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<mi.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f126070e;

    public LazyJavaAnnotations(@dl.d d c10, @dl.d mi.d annotationOwner, boolean z10) {
        f0.p(c10, "c");
        f0.p(annotationOwner, "annotationOwner");
        this.f126067b = c10;
        this.f126068c = annotationOwner;
        this.f126069d = z10;
        this.f126070e = c10.a().u().h(new l<mi.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$annotationDescriptors$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke(@dl.d mi.a annotation) {
                f0.p(annotation, "annotation");
                return kotlin.reflect.jvm.internal.impl.load.java.components.b.f126038a.e(annotation, this.f126071b.f126067b, this.f126071b.f126069d);
            }
        });
    }

    public /* synthetic */ LazyJavaAnnotations(d dVar, mi.d dVar2, boolean z10, int i10, u uVar) {
        this(dVar, dVar2, (i10 & 4) != 0 ? false : z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        return this.f126068c.getAnnotations().isEmpty() && !this.f126068c.A();
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return SequencesKt___SequencesKt.v0(SequencesKt___SequencesKt.n2(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(this.f126068c.getAnnotations()), this.f126070e), kotlin.reflect.jvm.internal.impl.load.java.components.b.f126038a.a(h.a.f125466y, this.f126068c, this.f126067b))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarInvoke;
        f0.p(fqName, "fqName");
        mi.a aVarK = this.f126068c.k(fqName);
        return (aVarK == null || (cVarInvoke = this.f126070e.invoke(aVarK)) == null) ? kotlin.reflect.jvm.internal.impl.load.java.components.b.f126038a.a(fqName, this.f126068c, this.f126067b) : cVarInvoke;
    }
}
