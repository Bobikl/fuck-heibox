package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.f
public abstract class i1 extends k2<String> {
    @dl.d
    protected String b0(@dl.d String parentName, @dl.d String childName) {
        kotlin.jvm.internal.f0.p(parentName, "parentName");
        kotlin.jvm.internal.f0.p(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + lg.a.f131414g + childName;
    }

    @dl.d
    protected String c0(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return descriptor.h(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.k2
    @dl.d
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final String Y(@dl.d kotlinx.serialization.descriptors.f fVar, int i10) {
        kotlin.jvm.internal.f0.p(fVar, "<this>");
        return e0(c0(fVar, i10));
    }

    @dl.d
    protected final String e0(@dl.d String nestedName) {
        kotlin.jvm.internal.f0.p(nestedName, "nestedName");
        String strX = X();
        if (strX == null) {
            strX = "";
        }
        return b0(strX, nestedName);
    }
}
