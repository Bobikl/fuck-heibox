package com.tencent.qmsp.sdk.c;

import android.os.Bundle;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import okio.Utf8;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[][] f101811c = {new byte[]{com.google.common.base.a.f56671x, 67, -74, 67, 2, org.apache.tools.tar.c.H, 117, -18}, new byte[]{org.apache.tools.tar.c.I, 117, -95, org.apache.tools.tar.c.P, 39, org.apache.tools.tar.c.J, 121}, new byte[]{9, 121, -79, 101, 32, 47, 101, -28}, new byte[]{44, 116}, new byte[]{org.apache.tools.tar.c.G, 105, -93, 69}, new byte[]{35, 124, -78, 71, 61}, new byte[]{org.apache.tools.tar.c.K, 113, -89, 72}, new byte[]{43, 113, -66, 69}, new byte[]{org.apache.tools.tar.c.I, 113, -65, 85, 43}, new byte[]{org.apache.tools.tar.c.I, 117, -95}, new byte[]{com.google.common.base.a.f56671x, 125, -96, 80, 96, Utf8.REPLACEMENT_BYTE, 118, -23}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f101812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f101813b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f101814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f101815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f101816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f101817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f101818e;
    }

    public j() throws Throwable {
        this.f101813b = 1;
        Pair<Integer, List<a>> pairA = a(c(), 1);
        if (pairA != null) {
            this.f101813b = ((Integer) pairA.first).intValue();
            this.f101812a = (List) pairA.second;
        }
        if (this.f101812a == null) {
            this.f101812a = new LinkedList();
        }
    }

    private int a(Element element) {
        try {
            NamedNodeMap attributes = element.getAttributes();
            if (attributes == null) {
                return 0;
            }
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                Node nodeItem = attributes.item(i10);
                String nodeName = nodeItem.getNodeName();
                if (nodeName != null && nodeName.equalsIgnoreCase(b(1))) {
                    return Integer.parseInt(nodeItem.getNodeValue());
                }
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private Pair<Integer, List<a>> a(String str, int i10) throws Throwable {
        byte[] bArrA = new m().a(str, null, 1);
        if (bArrA != null) {
            return a(bArrA, i10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0093: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:49:0x0093 */
    private Pair<Integer, List<a>> a(byte[] bArr, int i10) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        String nodeName;
        a aVarA;
        ByteArrayInputStream byteArrayInputStream3 = null;
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    Element documentElement = documentBuilderNewDocumentBuilder.parse(byteArrayInputStream).getDocumentElement();
                    int iA = a(documentElement);
                    if (iA != 0 && iA <= i10) {
                        LinkedList linkedList = new LinkedList();
                        NodeList childNodes = documentElement.getChildNodes();
                        int length = childNodes.getLength();
                        for (int i11 = 0; i11 < length; i11++) {
                            Node nodeItem = childNodes.item(i11);
                            if (nodeItem.getNodeType() == 1 && (nodeName = nodeItem.getNodeName()) != null && nodeName.equalsIgnoreCase(b(2)) && (aVarA = a(nodeItem)) != null) {
                                linkedList.add(aVarA);
                            }
                        }
                        Pair<Integer, List<a>> pair = new Pair<>(Integer.valueOf(iA), linkedList);
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        return pair;
                    }
                    Pair<Integer, List<a>> pair2 = new Pair<>(Integer.valueOf(iA), null);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    return pair2;
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream3 = byteArrayInputStream2;
                if (byteArrayInputStream3 != null) {
                    try {
                        byteArrayInputStream3.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            byteArrayInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayInputStream3 != null) {
                byteArrayInputStream3.close();
            }
            throw th;
        }
    }

    private a a(Node node) {
        try {
            NamedNodeMap attributes = node.getAttributes();
            if (attributes == null) {
                return null;
            }
            a aVar = new a();
            int length = attributes.getLength();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                Node nodeItem = attributes.item(i11);
                if (nodeItem.getNodeType() == 2) {
                    String nodeName = nodeItem.getNodeName();
                    String nodeValue = nodeItem.getNodeValue();
                    if (nodeName != null && nodeValue != null) {
                        if (nodeName.equalsIgnoreCase(b(3))) {
                            aVar.f101814a = Integer.parseInt(nodeValue);
                        } else if (nodeName.equalsIgnoreCase(b(4))) {
                            aVar.f101815b = Integer.parseInt(nodeValue);
                        } else if (nodeName.equalsIgnoreCase(b(5))) {
                            aVar.f101816c = Integer.parseInt(nodeValue);
                        } else if (nodeName.equalsIgnoreCase(b(6))) {
                            aVar.f101818e = nodeValue;
                        } else if (nodeName.equalsIgnoreCase(b(9))) {
                            aVar.f101817d = nodeValue;
                        }
                        i10++;
                    }
                }
            }
            if (i10 != 5) {
                return null;
            }
            b(node);
            return aVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private boolean a(String str, int i10, List<a> list) throws Throwable {
        byte[] bArrA = a(i10, list);
        if (bArrA == null) {
            return false;
        }
        return new m().a(str, bArrA, null, 1);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00b3: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:29:0x00b3 */
    private byte[] a(int i10, List<a> list) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, "UTF-8");
                    xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, b(0));
                    xmlSerializerNewSerializer.attribute(null, b(1), Integer.toString(i10));
                    for (a aVar : list) {
                        xmlSerializerNewSerializer.startTag(null, b(2));
                        xmlSerializerNewSerializer.attribute(null, b(3), Integer.toString(aVar.f101814a));
                        xmlSerializerNewSerializer.attribute(null, b(4), Integer.toString(aVar.f101815b));
                        xmlSerializerNewSerializer.attribute(null, b(5), Integer.toString(aVar.f101816c));
                        xmlSerializerNewSerializer.attribute(null, b(9), aVar.f101817d);
                        xmlSerializerNewSerializer.attribute(null, b(6), aVar.f101818e);
                        xmlSerializerNewSerializer.endTag(null, b(2));
                    }
                    xmlSerializerNewSerializer.endTag(null, b(0));
                    xmlSerializerNewSerializer.endDocument();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return byteArray;
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream3 = byteArrayOutputStream2;
                if (byteArrayOutputStream3 != null) {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayOutputStream3 != null) {
                byteArrayOutputStream3.close();
            }
            throw th;
        }
    }

    private Bundle b(Node node) {
        NamedNodeMap attributes;
        Node namedItem;
        String nodeValue;
        Node namedItem2;
        String nodeValue2;
        try {
            Bundle bundle = new Bundle();
            NodeList childNodes = node.getChildNodes();
            int length = childNodes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                Node nodeItem = childNodes.item(i10);
                if (nodeItem.getNodeType() == 1 && (attributes = nodeItem.getAttributes()) != null && (namedItem = attributes.getNamedItem(b(7))) != null && namedItem.getNodeType() == 2 && (nodeValue = namedItem.getNodeValue()) != null && (namedItem2 = attributes.getNamedItem(b(8))) != null && namedItem2.getNodeType() == 2 && (nodeValue2 = namedItem2.getNodeValue()) != null) {
                    bundle.putString(nodeValue, nodeValue2);
                }
            }
            return bundle;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private String b(int i10) {
        return com.tencent.qmsp.sdk.f.h.a(f101811c[i10]);
    }

    private String c() {
        return com.tencent.qmsp.sdk.a.b.a() + File.separator + b(10);
    }

    private boolean c(int i10) {
        return d(i10) != null;
    }

    private a d(int i10) {
        for (a aVar : this.f101812a) {
            if (aVar.f101814a == i10) {
                return aVar;
            }
        }
        return null;
    }

    public a a(int i10) {
        return d(i10);
    }

    public void a(int i10, boolean z10) throws Throwable {
        a aVarD = d(i10);
        if (aVarD == null) {
            return;
        }
        this.f101812a.remove(aVarD);
        if (z10) {
            a(c(), this.f101813b, this.f101812a);
        }
    }

    public boolean a() {
        return a(c(), this.f101813b, this.f101812a);
    }

    public boolean a(a aVar, boolean z10) {
        if (c(aVar.f101814a)) {
            return false;
        }
        this.f101812a.add(aVar);
        if (z10) {
            return a();
        }
        return true;
    }

    public List<a> b() {
        return this.f101812a;
    }
}
