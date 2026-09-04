package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
@kotlin.r0
public final class m0 extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f130726m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@dl.d String name, @dl.d h0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(generatedSerializer, "generatedSerializer");
        this.f130726m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
            if (kotlin.jvm.internal.f0.g(j(), fVar.j())) {
                m0 m0Var = (m0) obj;
                if ((m0Var.g() && Arrays.equals(q(), m0Var.q())) && f() == fVar.f()) {
                    int iF = f();
                    for (int i10 = 0; i10 < iF; i10++) {
                        if (kotlin.jvm.internal.f0.g(e(i10).j(), fVar.e(i10).j()) && kotlin.jvm.internal.f0.g(e(i10).b(), fVar.e(i10).b())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.f
    public boolean g() {
        return this.f130726m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }
}
