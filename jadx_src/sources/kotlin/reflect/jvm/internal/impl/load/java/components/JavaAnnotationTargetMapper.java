package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.c1;
import kotlin.collections.d1;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.i;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mi.m;
import yh.l;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaAnnotationTargetMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final JavaAnnotationTargetMapper f126021a = new JavaAnnotationTargetMapper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Map<String, EnumSet<KotlinTarget>> f126022b = s0.W(c1.a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), c1.a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), c1.a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), c1.a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), c1.a("FIELD", EnumSet.of(KotlinTarget.FIELD)), c1.a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), c1.a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), c1.a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), c1.a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), c1.a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Map<String, KotlinRetention> f126023c = s0.W(c1.a("RUNTIME", KotlinRetention.RUNTIME), c1.a("CLASS", KotlinRetention.BINARY), c1.a("SOURCE", KotlinRetention.SOURCE));

    private JavaAnnotationTargetMapper() {
    }

    @dl.e
    public final g<?> a(@dl.e mi.b bVar) {
        m mVar = bVar instanceof m ? (m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, KotlinRetention> map = f126023c;
        f fVarD = mVar.d();
        KotlinRetention kotlinRetention = map.get(fVarD != null ? fVarD.b() : null);
        if (kotlinRetention == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(h.a.K);
        f0.o(bVarM, "topLevel(StandardNames.F…ames.annotationRetention)");
        f fVarF = f.f(kotlinRetention.name());
        f0.o(fVarF, "identifier(retention.name)");
        return new i(bVarM, fVarF);
    }

    @dl.d
    public final Set<KotlinTarget> b(@dl.e String str) {
        EnumSet<KotlinTarget> enumSet = f126022b.get(str);
        return enumSet != null ? enumSet : d1.k();
    }

    @dl.d
    public final g<?> c(@dl.d List<? extends mi.b> arguments) {
        f0.p(arguments, "arguments");
        ArrayList<m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof m) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (m mVar : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = f126021a;
            f fVarD = mVar.d();
            x.n0(arrayList2, javaAnnotationTargetMapper.b(fVarD != null ? fVarD.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(t.Y(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(h.a.J);
            f0.o(bVarM, "topLevel(StandardNames.FqNames.annotationTarget)");
            f fVarF = f.f(kotlinTarget.name());
            f0.o(fVarF, "identifier(kotlinTarget.name)");
            arrayList3.add(new i(bVarM, fVarF));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b(arrayList3, new l<d0, kotlin.reflect.jvm.internal.impl.types.d0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$mapJavaTargetArguments$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.types.d0 invoke(@dl.d d0 module) {
                f0.p(module, "module");
                b1 b1VarB = a.b(b.f126038a.d(), module.t().o(h.a.H));
                kotlin.reflect.jvm.internal.impl.types.d0 type = b1VarB != null ? b1VarB.getType() : null;
                return type == null ? kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
            }
        });
    }
}
