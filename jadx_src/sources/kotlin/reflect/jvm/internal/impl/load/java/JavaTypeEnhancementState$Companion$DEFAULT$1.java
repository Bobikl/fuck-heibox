package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements yh.l<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 f125971d = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.h(p.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ReportLevel invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.c p10) {
        f0.p(p10, "p0");
        return p.d(p10);
    }
}
