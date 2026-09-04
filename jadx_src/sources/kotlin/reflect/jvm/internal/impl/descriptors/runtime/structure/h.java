package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @dl.e
    public static final d a(@dl.d Annotation[] annotationArr, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(annotationArr, "<this>");
        f0.p(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (f0.g(ReflectClassUtilKt.a(xh.a.e(xh.a.a(annotation))).b(), fqName)) {
                if (annotation != null) {
                    return new d(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new d(annotation);
        }
        return null;
    }

    @dl.d
    public static final List<d> b(@dl.d Annotation[] annotationArr) {
        f0.p(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new d(annotation));
        }
        return arrayList;
    }
}
