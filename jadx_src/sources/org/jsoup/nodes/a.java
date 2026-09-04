package org.jsoup.nodes;

import java.util.Map;

/* JADX INFO: compiled from: Attribute.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137880c;

    public a(String str, String str2) {
        org.jsoup.helper.d.h(str);
        org.jsoup.helper.d.j(str2);
        this.f137879b = str.trim().toLowerCase();
        this.f137880c = str2;
    }

    public static a b(String str, String str2) {
        return new a(str, Entities.l(str2, true));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f137879b;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return this.f137880c;
    }

    public String e() {
        return this.f137879b + "=\"" + Entities.e(this.f137880c, new Document("").Z1()) + "\"";
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f137879b;
        if (str == null ? aVar.f137879b != null : !str.equals(aVar.f137879b)) {
            return false;
        }
        String str2 = this.f137880c;
        String str3 = aVar.f137880c;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    protected void f(StringBuilder sb2, Document.a aVar) {
        sb2.append(this.f137879b);
        sb2.append("=\"");
        sb2.append(Entities.e(this.f137880c, aVar));
        sb2.append("\"");
    }

    protected boolean g() {
        return this.f137879b.startsWith("data-") && this.f137879b.length() > 5;
    }

    public void h(String str) {
        org.jsoup.helper.d.h(str);
        this.f137879b = str.trim().toLowerCase();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f137879b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137880c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        org.jsoup.helper.d.j(str);
        String str2 = this.f137880c;
        this.f137880c = str;
        return str2;
    }

    public String toString() {
        return e();
    }
}
