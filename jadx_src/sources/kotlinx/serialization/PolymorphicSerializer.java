package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.r0;
import kotlin.z;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PolymorphicSerializer<T> extends kotlinx.serialization.internal.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<T> f130518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<? extends Annotation> f130519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f130520c;

    public PolymorphicSerializer(@dl.d kotlin.reflect.d<T> baseClass) {
        f0.p(baseClass, "baseClass");
        this.f130518a = baseClass;
        this.f130519b = CollectionsKt__CollectionsKt.E();
        this.f130520c = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<kotlinx.serialization.descriptors.f>(this) { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PolymorphicSerializer<T> f130521b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f130521b = this;
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                final PolymorphicSerializer<T> polymorphicSerializer = this.f130521b;
                return kotlinx.serialization.descriptors.b.e(SerialDescriptorsKt.e("kotlinx.serialization.Polymorphic", kotlinx.serialization.descriptors.d.a.f130572a, new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, b2>() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                        f0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "type", dj.a.K(v0.f124986a).a(), null, false, 12, null);
                        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "value", SerialDescriptorsKt.f("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.j().F() + kotlin.text.y.f128597f, kotlinx.serialization.descriptors.h.a.f130589a, new kotlinx.serialization.descriptors.f[0], null, 8, null), null, false, 12, null);
                        buildSerialDescriptor.l(((PolymorphicSerializer) polymorphicSerializer).f130519b);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }), this.f130521b.j());
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @r0
    public PolymorphicSerializer(@dl.d kotlin.reflect.d<T> baseClass, @dl.d Annotation[] classAnnotations) {
        this(baseClass);
        f0.p(baseClass, "baseClass");
        f0.p(classAnnotations, "classAnnotations");
        this.f130519b = kotlin.collections.m.t(classAnnotations);
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return (kotlinx.serialization.descriptors.f) this.f130520c.getValue();
    }

    @Override // kotlinx.serialization.internal.b
    @dl.d
    public kotlin.reflect.d<T> j() {
        return this.f130518a;
    }

    @dl.d
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }
}
