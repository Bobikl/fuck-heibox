package org.apache.tools.ant.util;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: XMLFragment.java */
/* JADX INFO: loaded from: classes5.dex */
public class x2 extends org.apache.tools.ant.b2 implements org.apache.tools.ant.b1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Document f136991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DocumentFragment f136992f;

    /* JADX INFO: compiled from: XMLFragment.java */
    public class a implements org.apache.tools.ant.z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Element f136993b;

        a(Element element) {
            this.f136993b = element;
        }

        @Override // org.apache.tools.ant.x0
        public void a(String str, String str2, String str3, String str4) {
            if (str.isEmpty()) {
                this.f136993b.setAttribute(str2, str4);
            } else {
                this.f136993b.setAttributeNS(str, str3, str4);
            }
        }

        public void b(String str) {
            x2.this.H1(this.f136993b, str);
        }

        @Override // org.apache.tools.ant.b1
        public Object w(String str, String str2, String str3) {
            Element elementCreateElement = str.isEmpty() ? x2.this.f136991e.createElement(str2) : x2.this.f136991e.createElementNS(str, str3);
            this.f136993b.appendChild(elementCreateElement);
            return x2.this.new a(elementCreateElement);
        }
    }

    public x2() {
        Document documentNewDocument = r0.b().newDocument();
        this.f136991e = documentNewDocument;
        this.f136992f = documentNewDocument.createDocumentFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1(Node node, String str) {
        String strV0 = b().V0(str);
        if (strV0 == null || strV0.trim().isEmpty()) {
            return;
        }
        node.appendChild(this.f136991e.createTextNode(strV0.trim()));
    }

    public void G1(String str) {
        H1(this.f136992f, str);
    }

    public DocumentFragment I1() {
        return this.f136992f;
    }

    @Override // org.apache.tools.ant.b1
    public Object w(String str, String str2, String str3) {
        Element elementCreateElement = str.isEmpty() ? this.f136991e.createElement(str2) : this.f136991e.createElementNS(str, str3);
        this.f136992f.appendChild(elementCreateElement);
        return new a(elementCreateElement);
    }
}
