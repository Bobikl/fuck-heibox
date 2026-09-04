package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.z;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* JADX INFO: compiled from: SealedSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,154:1\n1536#2:155\n1238#2,4:165\n53#3:156\n80#3,6:157\n453#4:163\n403#4:164\n83#5:169\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n*E\n"})
@f
public final class SealedClassSerializer<T> extends kotlinx.serialization.internal.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<T> f130523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<? extends Annotation> f130524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f130525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.d<? extends T>, g<? extends T>> f130526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Map<String, g<? extends T>> f130527e;

    /* JADX INFO: compiled from: _Collections.kt */
    @t0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n1#1,3683:1\n130#2:3684\n*E\n"})
    public static final class a implements d0<Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends g<? extends T>>, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f130528a;

        public a(Iterable iterable) {
            this.f130528a = iterable;
        }

        @Override // kotlin.collections.d0
        public String a(Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends g<? extends T>> entry) {
            return entry.getValue().a().j();
        }

        @Override // kotlin.collections.d0
        @dl.d
        public Iterator<Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends g<? extends T>>> b() {
            return this.f130528a.iterator();
        }
    }

    public SealedClassSerializer(@dl.d final String serialName, @dl.d kotlin.reflect.d<T> baseClass, @dl.d kotlin.reflect.d<? extends T>[] subclasses, @dl.d g<? extends T>[] subclassSerializers) {
        f0.p(serialName, "serialName");
        f0.p(baseClass, "baseClass");
        f0.p(subclasses, "subclasses");
        f0.p(subclassSerializers, "subclassSerializers");
        this.f130523a = baseClass;
        this.f130524b = CollectionsKt__CollectionsKt.E();
        this.f130525c = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<kotlinx.serialization.descriptors.f>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                final SealedClassSerializer<T> sealedClassSerializer = this;
                return SerialDescriptorsKt.e(serialName, kotlinx.serialization.descriptors.d.b.f130573a, new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, b2>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                        f0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "type", dj.a.K(v0.f124986a).a(), null, false, 12, null);
                        final SealedClassSerializer<T> sealedClassSerializer2 = sealedClassSerializer;
                        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "value", SerialDescriptorsKt.e("kotlinx.serialization.Sealed<" + sealedClassSerializer.j().F() + kotlin.text.y.f128597f, kotlinx.serialization.descriptors.h.a.f130589a, new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, b2>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2$1$elementDescriptor$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d kotlinx.serialization.descriptors.a buildSerialDescriptor2) {
                                f0.p(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                                for (Map.Entry entry : ((SealedClassSerializer) sealedClassSerializer2).f130527e.entrySet()) {
                                    kotlinx.serialization.descriptors.a.b(buildSerialDescriptor2, (String) entry.getKey(), ((g) entry.getValue()).a(), null, false, 12, null);
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                                a(aVar);
                                return b2.f124493a;
                            }
                        }), null, false, 12, null);
                        buildSerialDescriptor.l(((SealedClassSerializer) sealedClassSerializer).f130524b);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                });
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + j().F() + " should be marked @Serializable");
        }
        Map<kotlin.reflect.d<? extends T>, g<? extends T>> mapB0 = s0.B0(ArraysKt___ArraysKt.UA(subclasses, subclassSerializers));
        this.f130526d = mapB0;
        d0 aVar = new a(mapB0.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = aVar.b();
        while (itB.hasNext()) {
            T next = itB.next();
            Object objA = aVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + j() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r0.j(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (g) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f130527e = linkedHashMap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.r0
    public SealedClassSerializer(@dl.d String serialName, @dl.d kotlin.reflect.d<T> baseClass, @dl.d kotlin.reflect.d<? extends T>[] subclasses, @dl.d g<? extends T>[] subclassSerializers, @dl.d Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        f0.p(serialName, "serialName");
        f0.p(baseClass, "baseClass");
        f0.p(subclasses, "subclasses");
        f0.p(subclassSerializers, "subclassSerializers");
        f0.p(classAnnotations, "classAnnotations");
        this.f130524b = kotlin.collections.m.t(classAnnotations);
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return (kotlinx.serialization.descriptors.f) this.f130525c.getValue();
    }

    @Override // kotlinx.serialization.internal.b
    @dl.e
    public c<T> h(@dl.d kotlinx.serialization.encoding.d decoder, @dl.e String str) {
        f0.p(decoder, "decoder");
        g<? extends T> gVar = this.f130527e.get(str);
        return gVar != null ? gVar : super.h(decoder, str);
    }

    @Override // kotlinx.serialization.internal.b
    @dl.e
    public r<T> i(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        f0.p(encoder, "encoder");
        f0.p(value, "value");
        g<? extends T> gVarI = this.f130526d.get(n0.d(value.getClass()));
        if (gVarI == null) {
            gVarI = super.i(encoder, value);
        }
        if (gVarI != null) {
            return gVarI;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.b
    @dl.d
    public kotlin.reflect.d<T> j() {
        return this.f130523a;
    }
}
