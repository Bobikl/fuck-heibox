package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final qi.a f127718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final c f127719b;

    /* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127720a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127720a = iArr;
        }
    }

    public b(@dl.d d0 module, @dl.d NotFoundClasses notFoundClasses, @dl.d qi.a protocol) {
        f0.p(module, "module");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(protocol, "protocol");
        this.f127718a = protocol;
        this.f127719b = new c(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a(@dl.d t container, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n callableProto, @dl.d AnnotatedCallableKind kind, int i10, @dl.d ProtoBuf.ValueParameter proto) {
        f0.p(container, "container");
        f0.p(callableProto, "callableProto");
        f0.p(kind, "kind");
        f0.p(proto, "proto");
        List listE = (List) proto.p(this.f127718a.g());
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f127719b.a((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b(@dl.d t.a container) {
        f0.p(container, "container");
        List listE = (List) container.f().p(this.f127718a.a());
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f127719b.a((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> c(@dl.d t container, @dl.d ProtoBuf.EnumEntry proto) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        List listE = (List) proto.p(this.f127718a.d());
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f127719b.a((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d(@dl.d ProtoBuf.TypeParameter proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        List listE = (List) proto.p(this.f127718a.l());
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f127719b.a((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f(@dl.d t container, @dl.d ProtoBuf.Property proto) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> g(@dl.d t container, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n proto, @dl.d AnnotatedCallableKind kind) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(kind, "kind");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> h(@dl.d ProtoBuf.Type proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        List listE = (List) proto.p(this.f127718a.k());
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f127719b.a((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(@dl.d t container, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n proto, @dl.d AnnotatedCallableKind kind) {
        List listE;
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            listE = (List) ((ProtoBuf.Constructor) proto).p(this.f127718a.c());
        } else if (proto instanceof ProtoBuf.Function) {
            listE = (List) ((ProtoBuf.Function) proto).p(this.f127718a.f());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = a.f127720a[kind.ordinal()];
            if (i10 == 1) {
                listE = (List) ((ProtoBuf.Property) proto).p(this.f127718a.h());
            } else if (i10 == 2) {
                listE = (List) ((ProtoBuf.Property) proto).p(this.f127718a.i());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                listE = (List) ((ProtoBuf.Property) proto).p(this.f127718a.j());
            }
        }
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f127719b.a((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k(@dl.d t container, @dl.d ProtoBuf.Property proto) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a
    @dl.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> j(@dl.d t container, @dl.d ProtoBuf.Property proto, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 expectedType) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(expectedType, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a
    @dl.e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e(@dl.d t container, @dl.d ProtoBuf.Property proto, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 expectedType) {
        f0.p(container, "container");
        f0.p(proto, "proto");
        f0.p(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(proto, this.f127718a.b());
        if (value == null) {
            return null;
        }
        return this.f127719b.f(expectedType, value, container.b());
    }
}
