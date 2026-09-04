package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: TypeTable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<ProtoBuf.Type> f127066a;

    public g(@dl.d ProtoBuf.TypeTable typeTable) {
        f0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> listB = typeTable.B();
        if (typeTable.C()) {
            int iY = typeTable.y();
            List<ProtoBuf.Type> listB2 = typeTable.B();
            f0.o(listB2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(t.Y(listB2, 10));
            int i10 = 0;
            for (Object obj : listB2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i10 >= iY) {
                    typeBuild = typeBuild.t().b0(true).build();
                }
                arrayList.add(typeBuild);
                i10 = i11;
            }
            listB = arrayList;
        }
        f0.o(listB, "run {\n        val origin… else originalTypes\n    }");
        this.f127066a = listB;
    }

    @dl.d
    public final ProtoBuf.Type a(int i10) {
        return this.f127066a.get(i10);
    }
}
