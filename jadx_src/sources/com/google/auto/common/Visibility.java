package com.google.auto.common;

import com.google.common.base.Enums;
import com.google.common.collect.Ordering;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;

/* JADX INFO: loaded from: classes7.dex */
public enum Visibility {
    PRIVATE,
    DEFAULT,
    PROTECTED,
    PUBLIC;

    private static final ElementKind MODULE = (ElementKind) Enums.c(ElementKind.class, "MODULE").j();

    public static Visibility effectiveVisibilityOfElement(Element element) {
        com.google.common.base.w.E(element);
        Visibility visibility = PUBLIC;
        while (element != null) {
            visibility = (Visibility) Ordering.z().w(visibility, ofElement(element));
            element = element.getEnclosingElement();
        }
        return visibility;
    }

    public static Visibility ofElement(Element element) {
        com.google.common.base.w.E(element);
        if (element.getKind().equals(ElementKind.PACKAGE) || element.getKind().equals(MODULE)) {
            return PUBLIC;
        }
        Set modifiers = element.getModifiers();
        if (modifiers.contains(Modifier.PRIVATE)) {
            return PRIVATE;
        }
        if (modifiers.contains(Modifier.PROTECTED)) {
            return PROTECTED;
        }
        return modifiers.contains(Modifier.PUBLIC) ? PUBLIC : DEFAULT;
    }
}
