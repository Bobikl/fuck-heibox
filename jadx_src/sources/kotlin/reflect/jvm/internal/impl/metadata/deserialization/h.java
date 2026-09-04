package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: VersionRequirement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f127067b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final h f127068c = new h(CollectionsKt__CollectionsKt.E());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<ProtoBuf.VersionRequirement> f127069a;

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final h a(@dl.d ProtoBuf.VersionRequirementTable table) {
            f0.p(table, "table");
            if (table.s() == 0) {
                return b();
            }
            List<ProtoBuf.VersionRequirement> listX = table.x();
            f0.o(listX, "table.requirementList");
            return new h(listX, null);
        }

        @dl.d
        public final h b() {
            return h.f127068c;
        }
    }

    private h(List<ProtoBuf.VersionRequirement> list) {
        this.f127069a = list;
    }

    public /* synthetic */ h(List list, u uVar) {
        this(list);
    }
}
