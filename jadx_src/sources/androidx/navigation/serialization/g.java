package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.m0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import kotlinx.serialization.r;

/* JADX INFO: compiled from: RouteEncoder.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class g<T> extends kotlinx.serialization.encoding.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<T> f25276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<String, m0<Object>> f25277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.modules.e f25278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<String, List<String>> f25279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25280e;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@dl.d kotlinx.serialization.g<T> serializer, @dl.d Map<String, ? extends m0<Object>> typeMap) {
        f0.p(serializer, "serializer");
        f0.p(typeMap, "typeMap");
        this.f25276a = serializer;
        this.f25277b = typeMap;
        this.f25278c = SerializersModuleBuildersKt.a();
        this.f25279d = new LinkedHashMap();
        this.f25280e = -1;
    }

    private final void J(Object obj) {
        String strH = this.f25276a.a().h(this.f25280e);
        m0<Object> m0Var = this.f25277b.get(strH);
        if (m0Var != null) {
            this.f25279d.put(strH, m0Var instanceof androidx.navigation.g ? ((androidx.navigation.g) m0Var).o(obj) : s.k(m0Var.l(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strH + ". Please provide NavType through typeMap.").toString());
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public void A() {
        J(null);
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean G(@dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
        f0.p(descriptor, "descriptor");
        this.f25280e = i10;
        return true;
    }

    @Override // kotlinx.serialization.encoding.b
    public void H(@dl.d Object value) {
        f0.p(value, "value");
        J(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final Map<String, List<String>> I(@dl.d Object value) {
        f0.p(value, "value");
        super.d(this.f25276a, value);
        return s0.D0(this.f25279d);
    }

    @Override // kotlinx.serialization.encoding.h, kotlinx.serialization.encoding.e
    @dl.d
    public kotlinx.serialization.modules.e a() {
        return this.f25278c;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    public <T> void d(@dl.d r<? super T> serializer, T t10) {
        f0.p(serializer, "serializer");
        J(t10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.h
    @dl.d
    public kotlinx.serialization.encoding.h g(@dl.d kotlinx.serialization.descriptors.f descriptor) {
        f0.p(descriptor, "descriptor");
        if (RouteSerializerKt.n(descriptor)) {
            this.f25280e = 0;
        }
        return super.g(descriptor);
    }
}
