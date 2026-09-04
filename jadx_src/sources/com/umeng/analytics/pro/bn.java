package com.umeng.analytics.pro;

/* JADX INFO: compiled from: TField.java */
/* JADX INFO: loaded from: classes4.dex */
public class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f104628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f104629c;

    public bn() {
        this("", (byte) 0, (short) 0);
    }

    public bn(String str, byte b10, short s10) {
        this.f104627a = str;
        this.f104628b = b10;
        this.f104629c = s10;
    }

    public boolean a(bn bnVar) {
        return this.f104628b == bnVar.f104628b && this.f104629c == bnVar.f104629c;
    }

    public String toString() {
        return "<TField name:'" + this.f104627a + "' type:" + ((int) this.f104628b) + " field-id:" + ((int) this.f104629c) + ">";
    }
}
