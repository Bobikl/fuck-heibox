package com.umeng.analytics.pro;

/* JADX INFO: compiled from: TMessage.java */
/* JADX INFO: loaded from: classes4.dex */
public final class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f104636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f104637c;

    public bq() {
        this("", (byte) 0, 0);
    }

    public bq(String str, byte b10, int i10) {
        this.f104635a = str;
        this.f104636b = b10;
        this.f104637c = i10;
    }

    public boolean a(bq bqVar) {
        return this.f104635a.equals(bqVar.f104635a) && this.f104636b == bqVar.f104636b && this.f104637c == bqVar.f104637c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bq) {
            return a((bq) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f104635a + "' type: " + ((int) this.f104636b) + " seqid:" + this.f104637c + ">";
    }
}
