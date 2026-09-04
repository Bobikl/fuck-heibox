package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n159#2:135\n159#2:139\n1789#3,3:136\n1789#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
public final class s1 {
    public static final /* synthetic */ <SD extends kotlinx.serialization.descriptors.f> boolean a(SD sd2, Object obj, yh.l<? super SD, Boolean> typeParamsAreEqual) {
        kotlin.jvm.internal.f0.p(sd2, "<this>");
        kotlin.jvm.internal.f0.p(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd2 == obj) {
            return true;
        }
        kotlin.jvm.internal.f0.y(3, "SD");
        if (!(obj instanceof kotlinx.serialization.descriptors.f)) {
            return false;
        }
        kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
        if (!kotlin.jvm.internal.f0.g(sd2.j(), fVar.j()) || !typeParamsAreEqual.invoke(obj).booleanValue() || sd2.f() != fVar.f()) {
            return false;
        }
        int iF = sd2.f();
        for (int i10 = 0; i10 < iF; i10++) {
            if (!kotlin.jvm.internal.f0.g(sd2.e(i10).j(), fVar.e(i10).j()) || !kotlin.jvm.internal.f0.g(sd2.e(i10).b(), fVar.e(i10).b())) {
                return false;
            }
        }
        return true;
    }

    public static final int b(@dl.d kotlinx.serialization.descriptors.f fVar, @dl.d kotlinx.serialization.descriptors.f[] typeParams) {
        kotlin.jvm.internal.f0.p(fVar, "<this>");
        kotlin.jvm.internal.f0.p(typeParams, "typeParams");
        int iHashCode = (fVar.j().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<kotlinx.serialization.descriptors.f> iterableA = kotlinx.serialization.descriptors.g.a(fVar);
        Iterator<kotlinx.serialization.descriptors.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strJ = it.next().j();
            if (strJ != null) {
                iHashCode3 = strJ.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<kotlinx.serialization.descriptors.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            kotlinx.serialization.descriptors.h hVarB = it2.next().b();
            iHashCode2 = i12 + (hVarB != null ? hVarB.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
