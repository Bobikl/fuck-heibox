package kotlinx.serialization;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.k0;
import kotlinx.serialization.internal.r0;

/* JADX INFO: compiled from: SerialFormat.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n {
    public static final /* synthetic */ <T> T a(a aVar, byte[] bytes) {
        f0.p(aVar, "<this>");
        f0.p(bytes, "bytes");
        kotlinx.serialization.modules.e eVarA = aVar.a();
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return (T) aVar.e(t.m(eVarA, null), bytes);
    }

    public static final /* synthetic */ <T> T b(a aVar, String hex) {
        f0.p(aVar, "<this>");
        f0.p(hex, "hex");
        kotlinx.serialization.modules.e eVarA = aVar.a();
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return (T) c(aVar, t.m(eVarA, null), hex);
    }

    public static final <T> T c(@dl.d a aVar, @dl.d c<? extends T> deserializer, @dl.d String hex) {
        f0.p(aVar, "<this>");
        f0.p(deserializer, "deserializer");
        f0.p(hex, "hex");
        return (T) aVar.e(deserializer, r0.f130751a.b(hex));
    }

    public static final /* synthetic */ <T> T d(v vVar, String string) {
        f0.p(vVar, "<this>");
        f0.p(string, "string");
        kotlinx.serialization.modules.e eVarA = vVar.a();
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return (T) vVar.d(t.m(eVarA, null), string);
    }

    public static final /* synthetic */ <T> byte[] e(a aVar, T t10) {
        f0.p(aVar, "<this>");
        kotlinx.serialization.modules.e eVarA = aVar.a();
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return aVar.b(t.m(eVarA, null), t10);
    }

    public static final /* synthetic */ <T> String f(a aVar, T t10) {
        f0.p(aVar, "<this>");
        kotlinx.serialization.modules.e eVarA = aVar.a();
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return g(aVar, t.m(eVarA, null), t10);
    }

    @dl.d
    public static final <T> String g(@dl.d a aVar, @dl.d r<? super T> serializer, T t10) {
        f0.p(aVar, "<this>");
        f0.p(serializer, "serializer");
        return r0.f130751a.c(aVar.b(serializer, t10), true);
    }

    public static final /* synthetic */ <T> String h(v vVar, T t10) {
        f0.p(vVar, "<this>");
        kotlinx.serialization.modules.e eVarA = vVar.a();
        f0.y(6, androidx.exifinterface.media.a.f23244d5);
        k0.n("kotlinx.serialization.serializer.withModule");
        return vVar.c(t.m(eVarA, null), t10);
    }
}
