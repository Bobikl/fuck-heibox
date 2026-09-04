package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.k0;
import kotlin.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class t {
    @dl.d
    @r0
    public static final g<?> a(@dl.d String str) {
        return SerializersKt__SerializersKt.c(str);
    }

    @dl.d
    @r0
    public static final g<?> b(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.d<?> dVar) {
        return SerializersKt__SerializersKt.d(eVar, dVar);
    }

    @dl.d
    @r0
    public static final g<?> c(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.d<?> dVar, @dl.d g<?>[] gVarArr) {
        return SerializersKt__SerializersKt.e(eVar, dVar, gVarArr);
    }

    @dl.e
    public static final g<? extends Object> d(@dl.d kotlin.reflect.d<Object> dVar, @dl.d List<? extends g<Object>> list, @dl.d yh.a<? extends kotlin.reflect.g> aVar) {
        return SerializersKt__SerializersKt.g(dVar, list, aVar);
    }

    public static final /* synthetic */ <T> g<T> e() {
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        return (g<T>) i(null);
    }

    @dl.d
    public static final g<Object> f(@dl.d Type type) {
        return u.d(type);
    }

    @f
    @dl.d
    public static final <T> g<T> g(@dl.d kotlin.reflect.d<T> dVar) {
        return SerializersKt__SerializersKt.i(dVar);
    }

    @dl.d
    @d
    public static final g<Object> h(@dl.d kotlin.reflect.d<?> dVar, @dl.d List<? extends g<?>> list, boolean z10) {
        return SerializersKt__SerializersKt.j(dVar, list, z10);
    }

    @dl.d
    public static final g<Object> i(@dl.d kotlin.reflect.r rVar) {
        return SerializersKt__SerializersKt.k(rVar);
    }

    public static final /* synthetic */ <T> g<T> j(kotlinx.serialization.modules.e eVar) {
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return (g<T>) m(eVar, null);
    }

    @dl.d
    public static final g<Object> k(@dl.d kotlinx.serialization.modules.e eVar, @dl.d Type type) {
        return u.e(eVar, type);
    }

    @dl.d
    @d
    public static final g<Object> l(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.d<?> dVar, @dl.d List<? extends g<?>> list, boolean z10) {
        return SerializersKt__SerializersKt.m(eVar, dVar, list, z10);
    }

    @dl.d
    public static final g<Object> m(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.r rVar) {
        return SerializersKt__SerializersKt.n(eVar, rVar);
    }

    @dl.e
    public static final g<Object> n(@dl.d Type type) {
        return u.h(type);
    }

    @f
    @dl.e
    public static final <T> g<T> o(@dl.d kotlin.reflect.d<T> dVar) {
        return SerializersKt__SerializersKt.q(dVar);
    }

    @dl.e
    public static final g<Object> p(@dl.d kotlin.reflect.r rVar) {
        return SerializersKt__SerializersKt.r(rVar);
    }

    @dl.e
    public static final g<Object> q(@dl.d kotlinx.serialization.modules.e eVar, @dl.d Type type) {
        return u.i(eVar, type);
    }

    @dl.e
    public static final g<Object> r(@dl.d kotlinx.serialization.modules.e eVar, @dl.d kotlin.reflect.r rVar) {
        return SerializersKt__SerializersKt.s(eVar, rVar);
    }

    @dl.e
    public static final List<g<Object>> s(@dl.d kotlinx.serialization.modules.e eVar, @dl.d List<? extends kotlin.reflect.r> list, boolean z10) {
        return SerializersKt__SerializersKt.t(eVar, list, z10);
    }
}
