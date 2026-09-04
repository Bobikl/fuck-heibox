package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final d f126339a = new d(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final d f126340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final d f126341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Map<String, g> f126342d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f126340b = new d(nullabilityQualifier, null, false, false, 8, null);
        f126341c = new d(nullabilityQualifier, null, true, false, 8, null);
        final SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
        final String strH = signatureBuildingComponents.h("Object");
        final String strG = signatureBuildingComponents.g("Predicate");
        final String strG2 = signatureBuildingComponents.g("Function");
        final String strG3 = signatureBuildingComponents.g("Consumer");
        final String strG4 = signatureBuildingComponents.g("BiFunction");
        final String strG5 = signatureBuildingComponents.g("BiConsumer");
        final String strG6 = signatureBuildingComponents.g("UnaryOperator");
        final String strI = signatureBuildingComponents.i("stream/Stream");
        final String strI2 = signatureBuildingComponents.i("Optional");
        h hVar = new h();
        new h.a(hVar, signatureBuildingComponents.i("Iterator")).a("forEachRemaining", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strG3, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, signatureBuildingComponents.h("Iterable")).a("spliterator", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(signatureBuildingComponents.i("Spliterator"), PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        h.a aVar = new h.a(hVar, signatureBuildingComponents.i("Collection"));
        aVar.a("removeIf", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strG, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
                function.d(JvmPrimitiveType.BOOLEAN);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar.a("stream", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(strI, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar.a("parallelStream", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(strI, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, signatureBuildingComponents.i("List")).a("replaceAll", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strG6, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        h.a aVar2 = new h.a(hVar, signatureBuildingComponents.i("Map"));
        aVar2.a("forEach", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strG5, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a("putIfAbsent", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.c(strH, PredefinedEnhancementInfoKt.f126339a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a(org.apache.tools.ant.taskdefs.optional.vss.g.K2, new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.c(strH, PredefinedEnhancementInfoKt.f126339a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a(org.apache.tools.ant.taskdefs.optional.vss.g.K2, new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.d(JvmPrimitiveType.BOOLEAN);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a("replaceAll", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strG4, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a("compute", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strG4, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126339a, PredefinedEnhancementInfoKt.f126339a);
                function.c(strH, PredefinedEnhancementInfoKt.f126339a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a("computeIfAbsent", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strG2, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b);
                function.c(strH, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a("computeIfPresent", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strG4, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126341c, PredefinedEnhancementInfoKt.f126339a);
                function.c(strH, PredefinedEnhancementInfoKt.f126339a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar2.a("merge", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126341c);
                function.b(strG4, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126341c, PredefinedEnhancementInfoKt.f126341c, PredefinedEnhancementInfoKt.f126339a);
                function.c(strH, PredefinedEnhancementInfoKt.f126339a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        h.a aVar3 = new h.a(hVar, strI2);
        aVar3.a("empty", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(strI2, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126341c);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar3.a("of", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126341c);
                function.c(strI2, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126341c);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar3.a("ofNullable", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126339a);
                function.c(strI2, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126341c);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar3.a("get", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(strH, PredefinedEnhancementInfoKt.f126341c);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        aVar3.a("ifPresent", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strG3, PredefinedEnhancementInfoKt.f126340b, PredefinedEnhancementInfoKt.f126341c);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, signatureBuildingComponents.h("ref/Reference")).a("get", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$7$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(strH, PredefinedEnhancementInfoKt.f126339a);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, strG).a("test", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$8$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.d(JvmPrimitiveType.BOOLEAN);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, signatureBuildingComponents.g("BiPredicate")).a("test", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$9$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.d(JvmPrimitiveType.BOOLEAN);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, strG3).a("accept", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$10$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, strG5).a("accept", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, strG2).a("apply", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$12$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.c(strH, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, strG4).a("apply", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.b(strH, PredefinedEnhancementInfoKt.f126340b);
                function.c(strH, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        new h.a(hVar, signatureBuildingComponents.g("Supplier")).a("get", new yh.l<h.a.C1154a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$14$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d h.a.C1154a function) {
                f0.p(function, "$this$function");
                function.c(strH, PredefinedEnhancementInfoKt.f126340b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(h.a.C1154a c1154a) {
                a(c1154a);
                return b2.f124493a;
            }
        });
        f126342d = hVar.b();
    }

    @dl.d
    public static final Map<String, g> d() {
        return f126342d;
    }
}
