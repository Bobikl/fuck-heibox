package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,57:1\n570#2,4:58\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:58,4\n*E\n"})
@kotlin.r0
public final class ObjectSerializer<T> implements kotlinx.serialization.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final T f130625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<? extends Annotation> f130626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.z f130627c;

    public ObjectSerializer(@dl.d final String serialName, @dl.d T objectInstance) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(objectInstance, "objectInstance");
        this.f130625a = objectInstance;
        this.f130626b = CollectionsKt__CollectionsKt.E();
        this.f130627c = kotlin.b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<kotlinx.serialization.descriptors.f>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                final ObjectSerializer<T> objectSerializer = this;
                return SerialDescriptorsKt.e(serialName, kotlinx.serialization.descriptors.i.d.f130594a, new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, kotlin.b2>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                        kotlin.jvm.internal.f0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        buildSerialDescriptor.l(((ObjectSerializer) objectSerializer).f130626b);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                        a(aVar);
                        return kotlin.b2.f124493a;
                    }
                });
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.r0
    public ObjectSerializer(@dl.d String serialName, @dl.d T objectInstance, @dl.d Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(objectInstance, "objectInstance");
        kotlin.jvm.internal.f0.p(classAnnotations, "classAnnotations");
        this.f130626b = kotlin.collections.m.t(classAnnotations);
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return (kotlinx.serialization.descriptors.f) this.f130627c.getValue();
    }

    @Override // kotlinx.serialization.r
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        encoder.b(a()).c(a());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    public T d(@dl.d kotlinx.serialization.encoding.f decoder) {
        int iU;
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlinx.serialization.descriptors.f fVarA = a();
        kotlinx.serialization.encoding.d dVarB = decoder.b(fVarA);
        if (dVarB.j() || (iU = dVarB.u(a())) == -1) {
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            dVarB.c(fVarA);
            return this.f130625a;
        }
        throw new SerializationException("Unexpected index " + iU);
    }
}
