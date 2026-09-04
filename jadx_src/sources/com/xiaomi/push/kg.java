package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f107793a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final String f924a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final short f925a;

    public kg() {
        this("", (byte) 0, (short) 0);
    }

    public kg(String str, byte b10, short s10) {
        this.f924a = str;
        this.f107793a = b10;
        this.f925a = s10;
    }

    public String toString() {
        return "<TField name:'" + this.f924a + "' type:" + ((int) this.f107793a) + " field-id:" + ((int) this.f925a) + ">";
    }
}
