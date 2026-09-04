package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.b0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: Jsr305Settings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ReportLevel f125972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final ReportLevel f125973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> f125974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f125975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f125976e;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@dl.d ReportLevel globalLevel, @dl.e ReportLevel reportLevel, @dl.d Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        f0.p(globalLevel, "globalLevel");
        f0.p(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f125972a = globalLevel;
        this.f125973b = reportLevel;
        this.f125974c = userDefinedLevelForSpecificAnnotation;
        this.f125975d = b0.c(new yh.a<String[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$description$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String[] invoke() {
                Jsr305Settings jsr305Settings = this.f125977b;
                List listI = kotlin.collections.s.i();
                listI.add(jsr305Settings.a().getDescription());
                ReportLevel reportLevelB = jsr305Settings.b();
                if (reportLevelB != null) {
                    listI.add("under-migration:" + reportLevelB.getDescription());
                }
                for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> entry : jsr305Settings.c().entrySet()) {
                    listI.add('@' + entry.getKey() + ':' + entry.getValue().getDescription());
                }
                return (String[]) kotlin.collections.s.a(listI).toArray(new String[0]);
            }
        });
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f125976e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this(reportLevel, (i10 & 2) != 0 ? null : reportLevel2, (i10 & 4) != 0 ? s0.z() : map);
    }

    @dl.d
    public final ReportLevel a() {
        return this.f125972a;
    }

    @dl.e
    public final ReportLevel b() {
        return this.f125973b;
    }

    @dl.d
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> c() {
        return this.f125974c;
    }

    public final boolean d() {
        return this.f125976e;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f125972a == jsr305Settings.f125972a && this.f125973b == jsr305Settings.f125973b && f0.g(this.f125974c, jsr305Settings.f125974c);
    }

    public int hashCode() {
        int iHashCode = this.f125972a.hashCode() * 31;
        ReportLevel reportLevel = this.f125973b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f125974c.hashCode();
    }

    @dl.d
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f125972a + ", migrationLevel=" + this.f125973b + ", userDefinedLevelForSpecificAnnotation=" + this.f125974c + ')';
    }
}
