package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;

/* JADX INFO: compiled from: ReflectJavaAnnotationOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface g extends mi.d {
    @dl.e
    AnnotatedElement a();

    @Override // mi.d
    @dl.d
    List<d> getAnnotations();

    @Override // mi.d
    @dl.e
    d k(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);
}
