package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: JvmNameResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final JvmProtoBuf.StringTableTypes f127172h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@dl.d JvmProtoBuf.StringTableTypes types, @dl.d String[] strings) {
        Set setV5;
        f0.p(types, "types");
        f0.p(strings, "strings");
        List<Integer> _init_$lambda$0 = types.y();
        if (_init_$lambda$0.isEmpty()) {
            setV5 = d1.k();
        } else {
            f0.o(_init_$lambda$0, "_init_$lambda$0");
            setV5 = CollectionsKt___CollectionsKt.V5(_init_$lambda$0);
        }
        List<JvmProtoBuf.StringTableTypes.Record> listZ = types.z();
        f0.o(listZ, "types.recordList");
        super(strings, setV5, h.a(listZ));
        this.f127172h = types;
    }
}
