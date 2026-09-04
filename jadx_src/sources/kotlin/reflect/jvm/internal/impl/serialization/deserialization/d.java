package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: AnnotationLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d<A> {
    @dl.d
    List<A> a(@dl.d t tVar, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n nVar, @dl.d AnnotatedCallableKind annotatedCallableKind, int i10, @dl.d ProtoBuf.ValueParameter valueParameter);

    @dl.d
    List<A> b(@dl.d t.a aVar);

    @dl.d
    List<A> c(@dl.d t tVar, @dl.d ProtoBuf.EnumEntry enumEntry);

    @dl.d
    List<A> d(@dl.d ProtoBuf.TypeParameter typeParameter, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);

    @dl.d
    List<A> f(@dl.d t tVar, @dl.d ProtoBuf.Property property);

    @dl.d
    List<A> g(@dl.d t tVar, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n nVar, @dl.d AnnotatedCallableKind annotatedCallableKind);

    @dl.d
    List<A> h(@dl.d ProtoBuf.Type type, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);

    @dl.d
    List<A> i(@dl.d t tVar, @dl.d kotlin.reflect.jvm.internal.impl.protobuf.n nVar, @dl.d AnnotatedCallableKind annotatedCallableKind);

    @dl.d
    List<A> k(@dl.d t tVar, @dl.d ProtoBuf.Property property);
}
