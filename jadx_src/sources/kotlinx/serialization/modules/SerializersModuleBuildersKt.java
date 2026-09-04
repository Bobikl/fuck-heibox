package kotlinx.serialization.modules;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: SerializersModuleBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
@t0({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,270:1\n31#1,3:271\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n15#1:271,3\n*E\n"})
public final class SerializersModuleBuildersKt {
    @dl.d
    public static final e a() {
        return g.a();
    }

    @dl.d
    public static final e b(@dl.d l<? super f, b2> builderAction) {
        f0.p(builderAction, "builderAction");
        f fVar = new f();
        builderAction.invoke(fVar);
        return fVar.g();
    }

    public static final /* synthetic */ <T> void c(f fVar, kotlinx.serialization.g<T> serializer) {
        f0.p(fVar, "<this>");
        f0.p(serializer, "serializer");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        fVar.e(n0.d(Object.class), serializer);
    }

    public static final <Base> void d(@dl.d f fVar, @dl.d kotlin.reflect.d<Base> baseClass, @dl.e kotlinx.serialization.g<Base> gVar, @dl.d l<? super b<? super Base>, b2> builderAction) {
        f0.p(fVar, "<this>");
        f0.p(baseClass, "baseClass");
        f0.p(builderAction, "builderAction");
        b bVar = new b(baseClass, gVar);
        builderAction.invoke(bVar);
        bVar.a(fVar);
    }

    public static /* synthetic */ void e(f fVar, kotlin.reflect.d baseClass, kotlinx.serialization.g gVar, l builderAction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        if ((i10 & 4) != 0) {
            builderAction = new l<b<Object>, b2>() { // from class: kotlinx.serialization.modules.SerializersModuleBuildersKt$polymorphic$1
                public final void a(@dl.d b<Object> bVar) {
                    f0.p(bVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b<Object> bVar) {
                    a(bVar);
                    return b2.f124493a;
                }
            };
        }
        f0.p(fVar, "<this>");
        f0.p(baseClass, "baseClass");
        f0.p(builderAction, "builderAction");
        b bVar = new b(baseClass, gVar);
        builderAction.invoke(bVar);
        bVar.a(fVar);
    }

    @dl.d
    public static final <T> e f(@dl.d kotlin.reflect.d<T> kClass, @dl.d kotlinx.serialization.g<T> serializer) {
        f0.p(kClass, "kClass");
        f0.p(serializer, "serializer");
        f fVar = new f();
        fVar.e(kClass, serializer);
        return fVar.g();
    }

    public static final /* synthetic */ <T> e g(kotlinx.serialization.g<T> serializer) {
        f0.p(serializer, "serializer");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return f(n0.d(Object.class), serializer);
    }
}
