package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.c1;
import kotlin.collections.r0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.n;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126025h = {n0.u(new PropertyReference1Impl(n0.d(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final h f126026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(@dl.e mi.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10) {
        super(c10, aVar, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125466y);
        f0.p(c10, "c");
        this.f126026g = c10.e().c(new yh.a<Map<f, ? extends t>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<f, t> invoke() {
                return r0.k(c1.a(b.f126038a.b(), new t("Deprecated in Java")));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<f, g<?>> a() {
        return (Map) l.a(this.f126026g, this, f126025h[0]);
    }
}
