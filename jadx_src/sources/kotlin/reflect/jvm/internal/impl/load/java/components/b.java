package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.t;
import kotlin.reflect.jvm.internal.impl.name.f;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f126038a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final f f126039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final f f126040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final f f126041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f126042e;

    static {
        f fVarF = f.f("message");
        f0.o(fVarF, "identifier(\"message\")");
        f126039b = fVarF;
        f fVarF2 = f.f("allowedTargets");
        f0.o(fVarF2, "identifier(\"allowedTargets\")");
        f126040c = fVarF2;
        f fVarF3 = f.f("value");
        f0.o(fVarF3, "identifier(\"value\")");
        f126041d = fVarF3;
        f126042e = s0.W(c1.a(h.a.H, t.f126312d), c1.a(h.a.L, t.f126314f), c1.a(h.a.P, t.f126317i));
    }

    private b() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(b bVar, mi.a aVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return bVar.e(aVar, dVar, z10);
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@dl.d kotlin.reflect.jvm.internal.impl.name.c kotlinName, @dl.d mi.d annotationOwner, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10) {
        mi.a aVarK;
        f0.p(kotlinName, "kotlinName");
        f0.p(annotationOwner, "annotationOwner");
        f0.p(c10, "c");
        if (f0.g(kotlinName, h.a.f125466y)) {
            kotlin.reflect.jvm.internal.impl.name.c DEPRECATED_ANNOTATION = t.f126316h;
            f0.o(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            mi.a aVarK2 = annotationOwner.k(DEPRECATED_ANNOTATION);
            if (aVarK2 != null || annotationOwner.A()) {
                return new JavaDeprecatedAnnotationDescriptor(aVarK2, c10);
            }
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = f126042e.get(kotlinName);
        if (cVar == null || (aVarK = annotationOwner.k(cVar)) == null) {
            return null;
        }
        return f(f126038a, aVarK, c10, false, 4, null);
    }

    @dl.d
    public final f b() {
        return f126039b;
    }

    @dl.d
    public final f c() {
        return f126041d;
    }

    @dl.d
    public final f d() {
        return f126040c;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@dl.d mi.a annotation, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, boolean z10) {
        f0.p(annotation, "annotation");
        f0.p(c10, "c");
        kotlin.reflect.jvm.internal.impl.name.b bVarF = annotation.f();
        if (f0.g(bVarF, kotlin.reflect.jvm.internal.impl.name.b.m(t.f126312d))) {
            return new JavaTargetAnnotationDescriptor(annotation, c10);
        }
        if (f0.g(bVarF, kotlin.reflect.jvm.internal.impl.name.b.m(t.f126314f))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c10);
        }
        if (f0.g(bVarF, kotlin.reflect.jvm.internal.impl.name.b.m(t.f126317i))) {
            return new JavaAnnotationDescriptor(c10, annotation, h.a.P);
        }
        if (f0.g(bVarF, kotlin.reflect.jvm.internal.impl.name.b.m(t.f126316h))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c10, annotation, z10);
    }
}
