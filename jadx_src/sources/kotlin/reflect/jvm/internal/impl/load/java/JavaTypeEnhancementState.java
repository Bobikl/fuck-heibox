package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaTypeEnhancementState {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f125966d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final JavaTypeEnhancementState f125967e = new JavaTypeEnhancementState(p.b(null, 1, null), JavaTypeEnhancementState$Companion$DEFAULT$1.f125971d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Jsr305Settings f125968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> f125969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f125970c;

    /* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final JavaTypeEnhancementState a() {
            return JavaTypeEnhancementState.f125967e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(@dl.d Jsr305Settings jsr305, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.c, ? extends ReportLevel> getReportLevelForAnnotation) {
        f0.p(jsr305, "jsr305");
        f0.p(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f125968a = jsr305;
        this.f125969b = getReportLevelForAnnotation;
        this.f125970c = jsr305.d() || getReportLevelForAnnotation.invoke(p.e()) == ReportLevel.IGNORE;
    }

    public final boolean b() {
        return this.f125970c;
    }

    @dl.d
    public final yh.l<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> c() {
        return this.f125969b;
    }

    @dl.d
    public final Jsr305Settings d() {
        return this.f125968a;
    }

    @dl.d
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f125968a + ", getReportLevelForAnnotation=" + this.f125969b + ')';
    }
}
