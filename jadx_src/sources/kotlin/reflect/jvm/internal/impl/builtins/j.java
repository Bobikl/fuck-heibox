package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import xh.m;

/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j f125471a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f125472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f125473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f125474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f125475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final HashMap<UnsignedArrayType, kotlin.reflect.jvm.internal.impl.name.f> f125476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f125477g;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f125472b = CollectionsKt___CollectionsKt.V5(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f125473c = CollectionsKt___CollectionsKt.V5(arrayList2);
        f125474d = new HashMap<>();
        f125475e = new HashMap<>();
        f125476f = s0.M(c1.a(UnsignedArrayType.UBYTEARRAY, kotlin.reflect.jvm.internal.impl.name.f.f("ubyteArrayOf")), c1.a(UnsignedArrayType.USHORTARRAY, kotlin.reflect.jvm.internal.impl.name.f.f("ushortArrayOf")), c1.a(UnsignedArrayType.UINTARRAY, kotlin.reflect.jvm.internal.impl.name.f.f("uintArrayOf")), c1.a(UnsignedArrayType.ULONGARRAY, kotlin.reflect.jvm.internal.impl.name.f.f("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().j());
        }
        f125477g = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f125474d.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f125475e.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    private j() {
    }

    @m
    public static final boolean d(@dl.d d0 type) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD;
        f0.p(type, "type");
        if (i1.w(type) || (fVarD = type.O0().d()) == null) {
            return false;
        }
        return f125471a.c(fVarD);
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.b a(@dl.d kotlin.reflect.jvm.internal.impl.name.b arrayClassId) {
        f0.p(arrayClassId, "arrayClassId");
        return f125474d.get(arrayClassId);
    }

    public final boolean b(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        return f125477g.contains(name);
    }

    public final boolean c(@dl.d k descriptor) {
        f0.p(descriptor, "descriptor");
        k kVarC = descriptor.c();
        return (kVarC instanceof g0) && f0.g(((g0) kVarC).e(), h.f125412u) && f125472b.contains(descriptor.getName());
    }
}
