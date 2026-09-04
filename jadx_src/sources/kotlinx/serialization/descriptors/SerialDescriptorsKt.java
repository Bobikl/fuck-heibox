package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.text.u;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.t;
import yh.l;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class SerialDescriptorsKt {
    @dl.d
    public static final f a(@dl.d String serialName, @dl.d e kind) {
        f0.p(serialName, "serialName");
        f0.p(kind, "kind");
        if (!u.V1(serialName)) {
            return z1.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @dl.d
    @kotlinx.serialization.d
    public static final f b(@dl.d String serialName, @dl.d f original) {
        f0.p(serialName, "serialName");
        f0.p(original, "original");
        if (!(!u.V1(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!(original.b() instanceof e))) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead".toString());
        }
        if (!f0.g(serialName, original.j())) {
            return new j(serialName, original);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.j() + ')').toString());
    }

    @dl.d
    public static final f c(@dl.d String serialName, @dl.d f[] typeParameters, @dl.d l<? super a, b2> builderAction) {
        f0.p(serialName, "serialName");
        f0.p(typeParameters, "typeParameters");
        f0.p(builderAction, "builderAction");
        if (!(!u.V1(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new SerialDescriptorImpl(serialName, i.a.f130591a, aVar.g().size(), ArraysKt___ArraysKt.kz(typeParameters), aVar);
    }

    public static /* synthetic */ f d(String str, f[] fVarArr, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = new l<a, b2>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildClassSerialDescriptor$1
                public final void a(@dl.d a aVar) {
                    f0.p(aVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            };
        }
        return c(str, fVarArr, lVar);
    }

    @kotlinx.serialization.f
    @dl.d
    public static final f e(@dl.d String serialName, @dl.d h kind, @dl.d f[] typeParameters, @dl.d l<? super a, b2> builder) {
        f0.p(serialName, "serialName");
        f0.p(kind, "kind");
        f0.p(typeParameters, "typeParameters");
        f0.p(builder, "builder");
        if (!(!u.V1(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!f0.g(kind, i.a.f130591a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new SerialDescriptorImpl(serialName, kind, aVar.g().size(), ArraysKt___ArraysKt.kz(typeParameters), aVar);
    }

    public static /* synthetic */ f f(String str, h hVar, f[] fVarArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new l<a, b2>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                public final void a(@dl.d a aVar) {
                    f0.p(aVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            };
        }
        return e(str, hVar, fVarArr, lVar);
    }

    public static final /* synthetic */ <T> void g(a aVar, String elementName, List<? extends Annotation> annotations, boolean z10) {
        f0.p(aVar, "<this>");
        f0.p(elementName, "elementName");
        f0.p(annotations, "annotations");
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        aVar.a(elementName, t.i(null).a(), annotations, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(a aVar, String elementName, List annotations, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotations = CollectionsKt__CollectionsKt.E();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        f0.p(aVar, "<this>");
        f0.p(elementName, "elementName");
        f0.p(annotations, "annotations");
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        aVar.a(elementName, t.i(null).a(), annotations, z10);
    }

    @dl.d
    public static final f i(@dl.d f fVar) {
        f0.p(fVar, "<this>");
        return fVar.c() ? fVar : new kotlinx.serialization.internal.b2(fVar);
    }

    public static /* synthetic */ void j(f fVar) {
    }

    @kotlinx.serialization.d
    public static final /* synthetic */ <T> f k() {
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        return l(t.i(null).a());
    }

    @dl.d
    @kotlinx.serialization.d
    public static final f l(@dl.d f elementDescriptor) {
        f0.p(elementDescriptor, "elementDescriptor");
        return new kotlinx.serialization.internal.e(elementDescriptor);
    }

    @kotlinx.serialization.d
    public static final /* synthetic */ <K, V> f m() {
        f0.y(6, "K");
        k0.n("kotlinx.serialization.serializer.simple");
        f fVarA = t.i(null).a();
        f0.y(6, androidx.exifinterface.media.a.X4);
        k0.n("kotlinx.serialization.serializer.simple");
        return n(fVarA, t.i(null).a());
    }

    @dl.d
    @kotlinx.serialization.d
    public static final f n(@dl.d f keyDescriptor, @dl.d f valueDescriptor) {
        f0.p(keyDescriptor, "keyDescriptor");
        f0.p(valueDescriptor, "valueDescriptor");
        return new i0(keyDescriptor, valueDescriptor);
    }

    public static final /* synthetic */ <T> f o() {
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        return t.i(null).a();
    }

    @dl.d
    public static final f p(@dl.d r type) {
        f0.p(type, "type");
        return t.i(type).a();
    }

    @kotlinx.serialization.d
    public static final /* synthetic */ <T> f q() {
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        return r(t.i(null).a());
    }

    @dl.d
    @kotlinx.serialization.d
    public static final f r(@dl.d f elementDescriptor) {
        f0.p(elementDescriptor, "elementDescriptor");
        return new kotlinx.serialization.internal.k0(elementDescriptor);
    }
}
