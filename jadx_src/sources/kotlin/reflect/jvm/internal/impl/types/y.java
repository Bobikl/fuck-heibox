package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y extends l1 implements si.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j0 f128195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final j0 f128196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@dl.d j0 lowerBound, @dl.d j0 upperBound) {
        super(null);
        kotlin.jvm.internal.f0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.f0.p(upperBound, "upperBound");
        this.f128195c = lowerBound;
        this.f128196d = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return V0().M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return V0().N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public z0 O0() {
        return V0().O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return V0().P0();
    }

    @dl.d
    public abstract j0 V0();

    @dl.d
    public final j0 W0() {
        return this.f128195c;
    }

    @dl.d
    public final j0 X0() {
        return this.f128196d;
    }

    @dl.d
    public abstract String Y0(@dl.d DescriptorRenderer descriptorRenderer, @dl.d kotlin.reflect.jvm.internal.impl.renderer.b bVar);

    @dl.d
    public String toString() {
        return DescriptorRenderer.f127420j.y(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return V0().u();
    }
}
