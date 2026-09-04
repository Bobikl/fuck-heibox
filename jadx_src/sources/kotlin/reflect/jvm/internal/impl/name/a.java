package kotlin.reflect.jvm.internal.impl.name;

import com.tencent.qcloud.core.util.IOUtils;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CallableId.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final C1168a f127183e = new C1168a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final f f127184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final c f127185g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final c f127186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final c f127187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final f f127188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final c f127189d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallableId.kt */
    public static final class C1168a {
        private C1168a() {
        }

        public /* synthetic */ C1168a(u uVar) {
            this();
        }
    }

    static {
        f fVar = h.f127221m;
        f127184f = fVar;
        c cVarK = c.k(fVar);
        f0.o(cVarK, "topLevel(LOCAL_NAME)");
        f127185g = cVarK;
    }

    public a(@dl.d c packageName, @dl.e c cVar, @dl.d f callableName, @dl.e c cVar2) {
        f0.p(packageName, "packageName");
        f0.p(callableName, "callableName");
        this.f127186a = packageName;
        this.f127187b = cVar;
        this.f127188c = callableName;
        this.f127189d = cVar2;
    }

    public /* synthetic */ a(c cVar, c cVar2, f fVar, c cVar3, int i10, u uVar) {
        this(cVar, cVar2, fVar, (i10 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@dl.d c packageName, @dl.d f callableName) {
        this(packageName, null, callableName, null, 8, null);
        f0.p(packageName, "packageName");
        f0.p(callableName, "callableName");
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.g(this.f127186a, aVar.f127186a) && f0.g(this.f127187b, aVar.f127187b) && f0.g(this.f127188c, aVar.f127188c) && f0.g(this.f127189d, aVar.f127189d);
    }

    public int hashCode() {
        int iHashCode = this.f127186a.hashCode() * 31;
        c cVar = this.f127187b;
        int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f127188c.hashCode()) * 31;
        c cVar2 = this.f127189d;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strB = this.f127186a.b();
        f0.o(strB, "packageName.asString()");
        sb2.append(kotlin.text.u.k2(strB, lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
        sb2.append("/");
        c cVar = this.f127187b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f127188c);
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
