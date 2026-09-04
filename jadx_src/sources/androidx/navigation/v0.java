package androidx.navigation;

import androidx.annotation.RestrictTo;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.r;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n2634#2:54\n1#3:55\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt\n*L\n50#1:54\n50#1:55\n*E\n"})
public final class v0 {
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T a(@dl.d androidx.lifecycle.q0 q0Var, @dl.d kotlin.reflect.d<T> route, @dl.d Map<r, ? extends m0<?>> typeMap) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlinx.serialization.g gVarG = kotlinx.serialization.t.g(route);
        for (i iVar : RouteSerializerKt.i(gVarG, typeMap)) {
            linkedHashMap.put(iVar.d(), iVar.c().b());
        }
        return (T) androidx.navigation.serialization.f.b(gVarG, q0Var, linkedHashMap);
    }

    public static final /* synthetic */ <T> T b(androidx.lifecycle.q0 q0Var, Map<r, m0<?>> typeMap) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return (T) a(q0Var, kotlin.jvm.internal.n0.d(Object.class), typeMap);
    }

    public static /* synthetic */ Object c(androidx.lifecycle.q0 q0Var, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return a(q0Var, kotlin.jvm.internal.n0.d(Object.class), typeMap);
    }
}
