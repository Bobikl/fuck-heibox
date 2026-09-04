package kotlinx.serialization.modules;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.t;

/* JADX INFO: compiled from: PolymorphicModuleBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Base, T extends Base> void a(b<? super Base> bVar, kotlin.reflect.d<T> clazz) {
        f0.p(bVar, "<this>");
        f0.p(clazz, "clazz");
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.simple");
        bVar.d(clazz, t.i(null));
    }

    public static final /* synthetic */ <Base, T extends Base> void b(b<? super Base> bVar, kotlinx.serialization.g<T> serializer) {
        f0.p(bVar, "<this>");
        f0.p(serializer, "serializer");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        bVar.d(n0.d(Object.class), serializer);
    }
}
