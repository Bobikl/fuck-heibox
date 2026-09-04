package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,151:1\n13309#2,2:152\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n123#1:152,2\n*E\n"})
@kotlin.r0
public final class EnumSerializer<T extends Enum<T>> implements kotlinx.serialization.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final T[] f130615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private kotlinx.serialization.descriptors.f f130616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.z f130617c;

    public EnumSerializer(@dl.d final String serialName, @dl.d T[] values) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(values, "values");
        this.f130615a = values;
        this.f130617c = kotlin.b0.c(new yh.a<kotlinx.serialization.descriptors.f>(this) { // from class: kotlinx.serialization.internal.EnumSerializer$descriptor$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumSerializer<T> f130618b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f130618b = this;
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                kotlinx.serialization.descriptors.f fVar = ((EnumSerializer) this.f130618b).f130616b;
                return fVar == null ? this.f130618b.h(serialName) : fVar;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(@dl.d String serialName, @dl.d T[] values, @dl.d kotlinx.serialization.descriptors.f descriptor) {
        this(serialName, values);
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(values, "values");
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        this.f130616b = descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.descriptors.f h(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.f130615a.length);
        for (T t10 : this.f130615a) {
            PluginGeneratedSerialDescriptor.n(enumDescriptor, t10.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return (kotlinx.serialization.descriptors.f) this.f130617c.getValue();
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        int iR = decoder.r(a());
        boolean z10 = false;
        if (iR >= 0 && iR < this.f130615a.length) {
            z10 = true;
        }
        if (z10) {
            return this.f130615a[iR];
        }
        throw new SerializationException(iR + " is not among valid " + a().j() + " enum values, values size is " + this.f130615a.length);
    }

    @Override // kotlinx.serialization.r
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d T value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        int iJg = ArraysKt___ArraysKt.jg(this.f130615a, value);
        if (iJg != -1) {
            encoder.f(a(), iJg);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(a().j());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f130615a);
        kotlin.jvm.internal.f0.o(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @dl.d
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().j() + kotlin.text.y.f128597f;
    }
}
