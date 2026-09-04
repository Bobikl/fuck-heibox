package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.c1;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.n;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126028h = {n0.u(new PropertyReference1Impl(n0.d(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final h f126029g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(@dl.d mi.a annotation, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10) {
        super(c10, annotation, kotlin.reflect.jvm.internal.impl.builtins.h.a.L);
        f0.p(annotation, "annotation");
        f0.p(c10, "c");
        this.f126029g = c10.e().c(new yh.a<Map<f, ? extends g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<f, g<?>> invoke() {
                g<?> gVarA = JavaAnnotationTargetMapper.f126021a.a(this.f126030b.b());
                Map<f, g<?>> mapK = gVarA != null ? r0.k(c1.a(b.f126038a.c(), gVarA)) : null;
                return mapK == null ? s0.z() : mapK;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<f, g<?>> a() {
        return (Map) l.a(this.f126029g, this, f126028h[0]);
    }
}
