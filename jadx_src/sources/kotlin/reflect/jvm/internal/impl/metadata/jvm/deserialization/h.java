package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: JvmNameResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    @dl.d
    public static final List<JvmProtoBuf.StringTableTypes.Record> a(@dl.d List<JvmProtoBuf.StringTableTypes.Record> list) {
        f0.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list) {
            int iG = record.G();
            for (int i10 = 0; i10 < iG; i10++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
