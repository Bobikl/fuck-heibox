package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f126294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c[] f126295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final v<q> f126296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final q f126297g;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("org.jspecify.nullness");
        f126291a = cVar;
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.rxjava3.annotations");
        f126292b = cVar2;
        kotlin.reflect.jvm.internal.impl.name.c cVar3 = new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.compatqual");
        f126293c = cVar3;
        String strB = cVar2.b();
        f0.o(strB, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        f126294d = strB;
        f126295e = new kotlin.reflect.jvm.internal.impl.name.c[]{new kotlin.reflect.jvm.internal.impl.name.c(strB + ".Nullable"), new kotlin.reflect.jvm.internal.impl.name.c(strB + ".NonNull")};
        kotlin.reflect.jvm.internal.impl.name.c cVar4 = new kotlin.reflect.jvm.internal.impl.name.c("org.jetbrains.annotations");
        q.a aVar = q.f126298d;
        kotlin.reflect.jvm.internal.impl.name.c cVar5 = new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        kotlin.w wVar = new kotlin.w(1, 9);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f126296f = new NullabilityAnnotationStatesImpl(s0.W(c1.a(cVar4, aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("android.support.annotation"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("android.annotation"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("com.android.annotations"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("org.eclipse.jdt.annotation"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("org.checkerframework.checker.nullness.qual"), aVar.a()), c1.a(cVar3, aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("edu.umd.cs.findbugs.annotations"), aVar.a()), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("io.reactivex.annotations"), aVar.a()), c1.a(cVar5, new q(reportLevel, null, null, 4, null)), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("androidx.annotation.RecentlyNonNull"), new q(reportLevel, null, null, 4, null)), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("lombok"), aVar.a()), c1.a(cVar, new q(reportLevel, wVar, reportLevel2)), c1.a(cVar2, new q(reportLevel, new kotlin.w(1, 8), reportLevel2))));
        f126297g = new q(reportLevel, null, null, 4, null);
    }

    @dl.d
    public static final Jsr305Settings a(@dl.d kotlin.w configuredKotlinVersion) {
        f0.p(configuredKotlinVersion, "configuredKotlinVersion");
        q qVar = f126297g;
        ReportLevel reportLevelC = (qVar.d() == null || qVar.d().compareTo(configuredKotlinVersion) > 0) ? qVar.c() : qVar.b();
        return new Jsr305Settings(reportLevelC, c(reportLevelC), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings b(kotlin.w wVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wVar = kotlin.w.f128653h;
        }
        return a(wVar);
    }

    @dl.e
    public static final ReportLevel c(@dl.d ReportLevel globalReportLevel) {
        f0.p(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @dl.d
    public static final ReportLevel d(@dl.d kotlin.reflect.jvm.internal.impl.name.c annotationFqName) {
        f0.p(annotationFqName, "annotationFqName");
        return h(annotationFqName, v.f126433a.a(), null, 4, null);
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c e() {
        return f126291a;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c[] f() {
        return f126295e;
    }

    @dl.d
    public static final ReportLevel g(@dl.d kotlin.reflect.jvm.internal.impl.name.c annotation, @dl.d v<? extends ReportLevel> configuredReportLevels, @dl.d kotlin.w configuredKotlinVersion) {
        f0.p(annotation, "annotation");
        f0.p(configuredReportLevels, "configuredReportLevels");
        f0.p(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevelA = configuredReportLevels.a(annotation);
        if (reportLevelA != null) {
            return reportLevelA;
        }
        q qVarA = f126296f.a(annotation);
        if (qVarA == null) {
            return ReportLevel.IGNORE;
        }
        return (qVarA.d() == null || qVarA.d().compareTo(configuredKotlinVersion) > 0) ? qVarA.c() : qVarA.b();
    }

    public static /* synthetic */ ReportLevel h(kotlin.reflect.jvm.internal.impl.name.c cVar, v vVar, kotlin.w wVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            wVar = new kotlin.w(1, 7, 20);
        }
        return g(cVar, vVar, wVar);
    }
}
