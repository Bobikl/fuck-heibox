package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.i;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.j0;
import yh.l;

/* JADX INFO: compiled from: annotationUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125587e;

    static {
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f("message");
        f0.o(fVarF, "identifier(\"message\")");
        f125583a = fVarF;
        kotlin.reflect.jvm.internal.impl.name.f fVarF2 = kotlin.reflect.jvm.internal.impl.name.f.f("replaceWith");
        f0.o(fVarF2, "identifier(\"replaceWith\")");
        f125584b = fVarF2;
        kotlin.reflect.jvm.internal.impl.name.f fVarF3 = kotlin.reflect.jvm.internal.impl.name.f.f("level");
        f0.o(fVarF3, "identifier(\"level\")");
        f125585c = fVarF3;
        kotlin.reflect.jvm.internal.impl.name.f fVarF4 = kotlin.reflect.jvm.internal.impl.name.f.f("expression");
        f0.o(fVarF4, "identifier(\"expression\")");
        f125586d = fVarF4;
        kotlin.reflect.jvm.internal.impl.name.f fVarF5 = kotlin.reflect.jvm.internal.impl.name.f.f("imports");
        f0.o(fVarF5, "identifier(\"imports\")");
        f125587e = fVarF5;
    }

    @dl.d
    public static final c a(@dl.d final kotlin.reflect.jvm.internal.impl.builtins.g gVar, @dl.d String message, @dl.d String replaceWith, @dl.d String level) {
        f0.p(gVar, "<this>");
        f0.p(message, "message");
        f0.p(replaceWith, "replaceWith");
        f0.p(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(gVar, kotlin.reflect.jvm.internal.impl.builtins.h.a.B, s0.W(c1.a(f125586d, new t(replaceWith)), c1.a(f125587e, new kotlin.reflect.jvm.internal.impl.resolve.constants.b(CollectionsKt__CollectionsKt.E(), new l<d0, kotlin.reflect.jvm.internal.impl.types.d0>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.types.d0 invoke(@dl.d d0 module) {
                f0.p(module, "module");
                j0 j0VarL = module.t().l(Variance.INVARIANT, gVar.W());
                f0.o(j0VarL, "module.builtIns.getArray…ce.INVARIANT, stringType)");
                return j0VarL;
            }
        }))));
        kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.builtins.h.a.f125466y;
        kotlin.reflect.jvm.internal.impl.name.f fVar = f125585c;
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.A);
        f0.o(bVarM, "topLevel(StandardNames.FqNames.deprecationLevel)");
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(level);
        f0.o(fVarF, "identifier(level)");
        return new BuiltInAnnotationDescriptor(gVar, cVar, s0.W(c1.a(f125583a, new t(message)), c1.a(f125584b, new kotlin.reflect.jvm.internal.impl.resolve.constants.a(builtInAnnotationDescriptor)), c1.a(fVar, new i(bVarM, fVarF))));
    }

    public static /* synthetic */ c b(kotlin.reflect.jvm.internal.impl.builtins.g gVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        return a(gVar, str, str2, str3);
    }
}
