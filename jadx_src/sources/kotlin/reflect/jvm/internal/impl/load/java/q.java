package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JavaNullabilityAnnotationsStatus.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f126298d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final q f126299e = new q(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ReportLevel f126300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final kotlin.w f126301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ReportLevel f126302c;

    /* JADX INFO: compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final q a() {
            return q.f126299e;
        }
    }

    public q(@dl.d ReportLevel reportLevelBefore, @dl.e kotlin.w wVar, @dl.d ReportLevel reportLevelAfter) {
        f0.p(reportLevelBefore, "reportLevelBefore");
        f0.p(reportLevelAfter, "reportLevelAfter");
        this.f126300a = reportLevelBefore;
        this.f126301b = wVar;
        this.f126302c = reportLevelAfter;
    }

    public /* synthetic */ q(ReportLevel reportLevel, kotlin.w wVar, ReportLevel reportLevel2, int i10, kotlin.jvm.internal.u uVar) {
        this(reportLevel, (i10 & 2) != 0 ? new kotlin.w(1, 0) : wVar, (i10 & 4) != 0 ? reportLevel : reportLevel2);
    }

    @dl.d
    public final ReportLevel b() {
        return this.f126302c;
    }

    @dl.d
    public final ReportLevel c() {
        return this.f126300a;
    }

    @dl.e
    public final kotlin.w d() {
        return this.f126301b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f126300a == qVar.f126300a && f0.g(this.f126301b, qVar.f126301b) && this.f126302c == qVar.f126302c;
    }

    public int hashCode() {
        int iHashCode = this.f126300a.hashCode() * 31;
        kotlin.w wVar = this.f126301b;
        return ((iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31) + this.f126302c.hashCode();
    }

    @dl.d
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f126300a + ", sinceVersion=" + this.f126301b + ", reportLevelAfter=" + this.f126302c + ')';
    }
}
