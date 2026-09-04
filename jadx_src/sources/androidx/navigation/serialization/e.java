package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.q0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: RouteDecoder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/RouteDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class e extends kotlinx.serialization.encoding.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final a f25272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private String f25274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.modules.e f25275g;

    public e(@dl.d Bundle bundle, @dl.d Map<String, ? extends m0<?>> typeMap) {
        f0.p(bundle, "bundle");
        f0.p(typeMap, "typeMap");
        this.f25273e = -1;
        this.f25274f = "";
        this.f25275g = kotlinx.serialization.modules.g.a();
        this.f25272d = new b(bundle, typeMap);
    }

    public e(@dl.d q0 handle, @dl.d Map<String, ? extends m0<?>> typeMap) {
        f0.p(handle, "handle");
        f0.p(typeMap, "typeMap");
        this.f25273e = -1;
        this.f25274f = "";
        this.f25275g = kotlinx.serialization.modules.g.a();
        this.f25272d = new h(handle, typeMap);
    }

    public static /* synthetic */ void L() {
    }

    private final Object M() {
        Object objB = this.f25272d.b(this.f25274f);
        if (objB != null) {
            return objB;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.f25274f).toString());
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.f
    public boolean B() {
        return this.f25272d.b(this.f25274f) != null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.f
    public <T> T E(@dl.d kotlinx.serialization.c<? extends T> deserializer) {
        f0.p(deserializer, "deserializer");
        return (T) M();
    }

    @Override // kotlinx.serialization.encoding.a
    @dl.d
    public Object J() {
        return M();
    }

    public final <T> T K(@dl.d kotlinx.serialization.c<? extends T> deserializer) {
        f0.p(deserializer, "deserializer");
        return (T) super.E(deserializer);
    }

    @Override // kotlinx.serialization.encoding.f, kotlinx.serialization.encoding.d
    @dl.d
    public kotlinx.serialization.modules.e a() {
        return this.f25275g;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.f
    @dl.e
    public Void f() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.d
    public int u(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        String strH;
        f0.p(descriptor, "descriptor");
        int i10 = this.f25273e;
        do {
            i10++;
            if (i10 >= descriptor.f()) {
                return -1;
            }
            strH = descriptor.h(i10);
        } while (!this.f25272d.a(strH));
        this.f25273e = i10;
        this.f25274f = strH;
        return i10;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.f
    @dl.d
    public kotlinx.serialization.encoding.f v(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
        if (RouteSerializerKt.n(descriptor)) {
            this.f25274f = descriptor.h(0);
            this.f25273e = 0;
        }
        return super.v(descriptor);
    }
}
