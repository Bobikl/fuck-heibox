package com.vivo.push.model;

/* JADX INFO: compiled from: ConfigItem.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106617b;

    public a(String str, String str2) {
        this.f106616a = str;
        this.f106617b = str2;
    }

    public final String a() {
        return this.f106616a;
    }

    public final String b() {
        return this.f106617b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f106616a;
        if (str == null) {
            if (aVar.f106616a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f106616a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f106616a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f106616a + "', mValue='" + this.f106617b + "'}";
    }
}
