package org.apache.tools.ant.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: DOMUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class z {
    private z() {
    }

    public static void a(Element element, String str) {
        element.appendChild(element.getOwnerDocument().createCDATASection(str));
    }

    public static void b(Element element, String str, String str2) {
        a(e(element, str), str2);
    }

    public static void c(Element element, String str) {
        element.appendChild(element.getOwnerDocument().createTextNode(str));
    }

    public static void d(Element element, String str, String str2) {
        c(e(element, str), str2);
    }

    public static Element e(Element element, String str) {
        Element elementCreateElement = element.getOwnerDocument().createElement(str);
        element.appendChild(elementCreateElement);
        return elementCreateElement;
    }

    public static Document f() {
        return r0.b().newDocument();
    }
}
