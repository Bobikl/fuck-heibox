package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.n;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public class JavaAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126013f = {n0.u(new PropertyReference1Impl(n0.d(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f126014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final t0 f126015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final h f126016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final mi.b f126017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f126018e;

    public JavaAnnotationDescriptor(@dl.d final kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.e mi.a aVar, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        t0 NO_SOURCE;
        Collection<mi.b> collectionD;
        f0.p(c10, "c");
        f0.p(fqName, "fqName");
        this.f126014a = fqName;
        if (aVar == null || (NO_SOURCE = c10.a().t().a(aVar)) == null) {
            NO_SOURCE = t0.f125942a;
            f0.o(NO_SOURCE, "NO_SOURCE");
        }
        this.f126015b = NO_SOURCE;
        this.f126016c = c10.e().c(new yh.a<j0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke() {
                j0 j0VarV = c10.d().t().o(this.e()).v();
                f0.o(j0VarV, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return j0VarV;
            }
        });
        this.f126017d = (aVar == null || (collectionD = aVar.d()) == null) ? null : (mi.b) CollectionsKt___CollectionsKt.z2(collectionD);
        this.f126018e = aVar != null && aVar.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, g<?>> a() {
        return s0.z();
    }

    @dl.e
    protected final mi.b b() {
        return this.f126017d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 getType() {
        return (j0) l.a(this.f126016c, this, f126013f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return this.f126014a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.f
    public boolean g() {
        return this.f126018e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public t0 j() {
        return this.f126015b;
    }
}
