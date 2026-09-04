package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.c1;
import kotlin.collections.r0;
import kotlin.collections.s;
import kotlin.collections.s0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.n;
import mi.m;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126031h = {n0.u(new PropertyReference1Impl(n0.d(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final h f126032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(@dl.d mi.a annotation, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10) {
        super(c10, annotation, kotlin.reflect.jvm.internal.impl.builtins.h.a.H);
        f0.p(annotation, "annotation");
        f0.p(c10, "c");
        this.f126032g = c10.e().c(new yh.a<Map<f, ? extends g<? extends Object>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<f, g<Object>> invoke() {
                g<?> gVarC;
                mi.b bVarB = this.f126033b.b();
                if (bVarB instanceof mi.e) {
                    gVarC = JavaAnnotationTargetMapper.f126021a.c(((mi.e) this.f126033b.b()).getElements());
                } else {
                    gVarC = bVarB instanceof m ? JavaAnnotationTargetMapper.f126021a.c(s.k(this.f126033b.b())) : null;
                }
                Map<f, g<Object>> mapK = gVarC != null ? r0.k(c1.a(b.f126038a.d(), gVarC)) : null;
                return mapK == null ? s0.z() : mapK;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<f, g<Object>> a() {
        return (Map) l.a(this.f126032g, this, f126031h[0]);
    }
}
