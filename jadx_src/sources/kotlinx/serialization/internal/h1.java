package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.f
public abstract class h1 extends TaggedDecoder<String> {
    @dl.d
    protected String d0(@dl.d String parentName, @dl.d String childName) {
        kotlin.jvm.internal.f0.p(parentName, "parentName");
        kotlin.jvm.internal.f0.p(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + lg.a.f131414g + childName;
    }

    @dl.d
    protected String e0(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        return descriptor.h(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    @dl.d
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final String Z(@dl.d kotlinx.serialization.descriptors.f fVar, int i10) {
        kotlin.jvm.internal.f0.p(fVar, "<this>");
        return g0(e0(fVar, i10));
    }

    @dl.d
    protected final String g0(@dl.d String nestedName) {
        kotlin.jvm.internal.f0.p(nestedName, "nestedName");
        String strY = Y();
        if (strY == null) {
            strY = "";
        }
        return d0(strY, nestedName);
    }
}
