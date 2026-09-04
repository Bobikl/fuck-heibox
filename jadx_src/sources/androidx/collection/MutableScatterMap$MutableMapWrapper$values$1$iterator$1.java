package androidx.collection;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1<V> implements Iterator<V>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Iterator<Integer> f3455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3456c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableScatterMap<K, V> f3457d;

    MutableScatterMap$MutableMapWrapper$values$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f3457d = mutableScatterMap;
        this.f3455b = kotlin.sequences.q.a(new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3455b.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        int iIntValue = this.f3455b.next().intValue();
        this.f3456c = iIntValue;
        return (V) this.f3457d.f3489c[iIntValue];
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f3456c;
        if (i10 >= 0) {
            this.f3457d.o0(i10);
            this.f3456c = -1;
        }
    }
}
