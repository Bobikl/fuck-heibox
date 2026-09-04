package kotlinx.serialization.encoding;

import java.util.Collection;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,507:1\n488#1,2:508\n490#1,2:513\n1864#2,3:510\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n501#1:508,2\n501#1:513,2\n502#1:510,3\n*E\n"})
public final class i {
    public static final void a(@dl.d h hVar, @dl.d kotlinx.serialization.descriptors.f descriptor, int i10, @dl.d l<? super e, b2> block) {
        f0.p(hVar, "<this>");
        f0.p(descriptor, "descriptor");
        f0.p(block, "block");
        e eVarX = hVar.x(descriptor, i10);
        block.invoke(eVarX);
        eVarX.c(descriptor);
    }

    public static final <E> void b(@dl.d h hVar, @dl.d kotlinx.serialization.descriptors.f descriptor, @dl.d Collection<? extends E> collection, @dl.d q<? super e, ? super Integer, ? super E, b2> block) {
        f0.p(hVar, "<this>");
        f0.p(descriptor, "descriptor");
        f0.p(collection, "collection");
        f0.p(block, "block");
        e eVarX = hVar.x(descriptor, collection.size());
        Iterator<T> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a.a.a.a.d.p.d.c.d dVar = (Object) it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            block.invoke(eVarX, Integer.valueOf(i10), dVar);
            i10 = i11;
        }
        eVarX.c(descriptor);
    }

    public static final void c(@dl.d h hVar, @dl.d kotlinx.serialization.descriptors.f descriptor, @dl.d l<? super e, b2> block) {
        f0.p(hVar, "<this>");
        f0.p(descriptor, "descriptor");
        f0.p(block, "block");
        e eVarB = hVar.b(descriptor);
        block.invoke(eVarB);
        eVarB.c(descriptor);
    }
}
