package com.google.auto.common;

import java.util.Optional;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/* JADX INFO: compiled from: GeneratedAnnotations.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 {
    private m0() {
    }

    @Deprecated
    public static Optional<TypeElement> a(Elements elements) {
        TypeElement typeElement = elements.getTypeElement("javax.annotation.processing.Generated");
        return typeElement != null ? Optional.of(typeElement) : Optional.ofNullable(elements.getTypeElement("javax.annotation.Generated"));
    }

    public static Optional<TypeElement> b(Elements elements, SourceVersion sourceVersion) {
        return Optional.ofNullable(elements.getTypeElement(sourceVersion.compareTo(SourceVersion.RELEASE_8) > 0 ? "javax.annotation.processing.Generated" : "javax.annotation.Generated"));
    }
}
