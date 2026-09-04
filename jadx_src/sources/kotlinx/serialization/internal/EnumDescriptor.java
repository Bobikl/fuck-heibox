package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n13#2:152\n159#3:153\n1789#4,3:154\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:152\n46#1:153\n46#1:154,3\n*E\n"})
@kotlin.r0
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.h f130610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final kotlin.z f130611n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(@dl.d final String name, final int i10) {
        super(name, null, i10, 2, null);
        kotlin.jvm.internal.f0.p(name, "name");
        this.f130610m = kotlinx.serialization.descriptors.h.b.f130590a;
        this.f130611n = kotlin.b0.c(new yh.a<kotlinx.serialization.descriptors.f[]>() { // from class: kotlinx.serialization.internal.EnumDescriptor$elementDescriptors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f[] invoke() {
                int i11 = i10;
                kotlinx.serialization.descriptors.f[] fVarArr = new kotlinx.serialization.descriptors.f[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    fVarArr[i12] = SerialDescriptorsKt.f(name + lg.a.f131414g + this.h(i12), kotlinx.serialization.descriptors.i.d.f130594a, new kotlinx.serialization.descriptors.f[0], null, 8, null);
                }
                return fVarArr;
            }
        });
    }

    private final kotlinx.serialization.descriptors.f[] u() {
        return (kotlinx.serialization.descriptors.f[]) this.f130611n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.h b() {
        return this.f130610m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.f e(int i10) {
        return u()[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kotlinx.serialization.descriptors.f)) {
            return false;
        }
        kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
        return fVar.b() == kotlinx.serialization.descriptors.h.b.f130590a && kotlin.jvm.internal.f0.g(j(), fVar.j()) && kotlin.jvm.internal.f0.g(q1.a(this), q1.a(fVar));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int iHashCode = j().hashCode();
        Iterator<String> it = kotlinx.serialization.descriptors.g.c(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i10 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i10 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @dl.d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(kotlinx.serialization.descriptors.g.c(this), ", ", j() + '(', ")", 0, null, null, 56, null);
    }
}
