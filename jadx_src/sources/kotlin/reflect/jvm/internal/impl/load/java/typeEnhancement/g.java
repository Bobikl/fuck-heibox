package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final k f126400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<k> f126401b;

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public g(@dl.e k kVar, @dl.d List<k> parametersInfo) {
        f0.p(parametersInfo, "parametersInfo");
        this.f126400a = kVar;
        this.f126401b = parametersInfo;
    }

    public /* synthetic */ g(k kVar, List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : kVar, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.E() : list);
    }

    @dl.d
    public final List<k> a() {
        return this.f126401b;
    }

    @dl.e
    public final k b() {
        return this.f126400a;
    }
}
