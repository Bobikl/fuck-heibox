package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: NameResolverImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ProtoBuf.StringTable f127063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ProtoBuf.QualifiedNameTable f127064b;

    /* JADX INFO: compiled from: NameResolverImpl.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127065a;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127065a = iArr;
        }
    }

    public d(@dl.d ProtoBuf.StringTable strings, @dl.d ProtoBuf.QualifiedNameTable qualifiedNames) {
        f0.p(strings, "strings");
        f0.p(qualifiedNames, "qualifiedNames");
        this.f127063a = strings;
        this.f127064b = qualifiedNames;
    }

    private final Triple<List<String>, List<String>, Boolean> c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedNameS = this.f127064b.s(i10);
            String strS = this.f127063a.s(qualifiedNameS.A());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kindY = qualifiedNameS.y();
            f0.m(kindY);
            int i11 = a.f127065a[kindY.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strS);
            } else if (i11 == 2) {
                linkedList.addFirst(strS);
            } else if (i11 == 3) {
                linkedList2.addFirst(strS);
                z10 = true;
            }
            i10 = qualifiedNameS.z();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @dl.d
    public String a(int i10) {
        Triple<List<String>, List<String>, Boolean> tripleC = c(i10);
        List<String> listA = tripleC.a();
        String strH3 = CollectionsKt___CollectionsKt.h3(tripleC.b(), ".", null, null, 0, null, null, 62, null);
        if (listA.isEmpty()) {
            return strH3;
        }
        return CollectionsKt___CollectionsKt.h3(listA, "/", null, null, 0, null, null, 62, null) + IOUtils.DIR_SEPARATOR_UNIX + strH3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public boolean b(int i10) {
        return c(i10).h().booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @dl.d
    public String getString(int i10) {
        String strS = this.f127063a.s(i10);
        f0.o(strS, "strings.getString(index)");
        return strS;
    }
}
