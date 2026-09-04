package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,151:1\n13374#2,2:152\n13309#2,2:154\n13376#2:156\n13309#2,2:157\n13374#2,2:159\n13309#2,2:161\n13376#2:163\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n70#1:152,2\n73#1:154,2\n70#1:156\n91#1:157,2\n94#1:159,2\n97#1:161,2\n94#1:163\n*E\n"})
public final class d0 {
    @kotlinx.serialization.f
    @dl.d
    public static final <T extends Enum<T>> kotlinx.serialization.g<T> a(@dl.d String serialName, @dl.d T[] values, @dl.d String[] names, @dl.d Annotation[][] entryAnnotations, @dl.e Annotation[] annotationArr) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(values, "values");
        kotlin.jvm.internal.f0.p(names, "names");
        kotlin.jvm.internal.f0.p(entryAnnotations, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                enumDescriptor.t(annotation);
            }
        }
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) ArraysKt___ArraysKt.qf(names, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.n(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt___ArraysKt.qf(entryAnnotations, i11);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    enumDescriptor.s(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    @kotlinx.serialization.f
    @dl.d
    public static final <T extends Enum<T>> kotlinx.serialization.g<T> b(@dl.d String serialName, @dl.d T[] values, @dl.d String[] names, @dl.d Annotation[][] annotations) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(values, "values");
        kotlin.jvm.internal.f0.p(names, "names");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(serialName, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) ArraysKt___ArraysKt.qf(names, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.n(enumDescriptor, strName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) ArraysKt___ArraysKt.qf(annotations, i11);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    enumDescriptor.s(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        return new EnumSerializer(serialName, values, enumDescriptor);
    }

    @kotlinx.serialization.f
    @dl.d
    public static final <T extends Enum<T>> kotlinx.serialization.g<T> c(@dl.d String serialName, @dl.d T[] values) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(values, "values");
        return new EnumSerializer(serialName, values);
    }
}
