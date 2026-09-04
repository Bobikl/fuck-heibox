package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.internal.q1;
import kotlinx.serialization.internal.t1;

/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@d
public final class ContextualSerializer<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<T> f130512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final g<T> f130513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<g<?>> f130514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130515d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(@dl.d kotlin.reflect.d<T> serializableClass) {
        this(serializableClass, null, t1.f130765a);
        f0.p(serializableClass, "serializableClass");
    }

    public ContextualSerializer(@dl.d kotlin.reflect.d<T> serializableClass, @dl.e g<T> gVar, @dl.d g<?>[] typeArgumentsSerializers) {
        f0.p(serializableClass, "serializableClass");
        f0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f130512a = serializableClass;
        this.f130513b = gVar;
        this.f130514c = kotlin.collections.m.t(typeArgumentsSerializers);
        this.f130515d = kotlinx.serialization.descriptors.b.e(SerialDescriptorsKt.e("kotlinx.serialization.ContextualSerializer", kotlinx.serialization.descriptors.h.a.f130589a, new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, b2>(this) { // from class: kotlinx.serialization.ContextualSerializer$descriptor$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ContextualSerializer<T> f130516b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f130516b = this;
            }

            public final void a(@dl.d kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                kotlinx.serialization.descriptors.f fVarA;
                f0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
                g gVar2 = ((ContextualSerializer) this.f130516b).f130513b;
                List<Annotation> annotations = (gVar2 == null || (fVarA = gVar2.a()) == null) ? null : fVarA.getAnnotations();
                if (annotations == null) {
                    annotations = CollectionsKt__CollectionsKt.E();
                }
                buildSerialDescriptor.l(annotations);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }), serializableClass);
    }

    private final g<T> g(kotlinx.serialization.modules.e eVar) {
        g<T> gVarC = eVar.c(this.f130512a, this.f130514c);
        if (gVarC != null || (gVarC = this.f130513b) != null) {
            return gVarC;
        }
        q1.j(this.f130512a);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130515d;
    }

    @Override // kotlinx.serialization.r
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        f0.p(encoder, "encoder");
        f0.p(value, "value");
        encoder.d(g(encoder.a()), value);
    }

    @Override // kotlinx.serialization.c
    @dl.d
    public T d(@dl.d kotlinx.serialization.encoding.f decoder) {
        f0.p(decoder, "decoder");
        return (T) decoder.E(g(decoder.a()));
    }
}
