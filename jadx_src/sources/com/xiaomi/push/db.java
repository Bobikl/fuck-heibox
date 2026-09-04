package com.xiaomi.push;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106947a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f265a;

    public db(String str, int i10) {
        this.f265a = str;
        this.f106947a = i10;
    }

    public static db a(String str, int i10) {
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(0, iLastIndexOf);
            try {
                int i11 = Integer.parseInt(str.substring(iLastIndexOf + 1));
                if (i11 > 0) {
                    i10 = i11;
                }
            } catch (NumberFormatException unused) {
            }
            str = strSubstring;
        }
        return new db(str, i10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static InetSocketAddress m237a(String str, int i10) {
        db dbVarA = a(str, i10);
        return new InetSocketAddress(dbVarA.m238a(), dbVarA.a());
    }

    public int a() {
        return this.f106947a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m238a() {
        return this.f265a;
    }

    public String toString() {
        if (this.f106947a <= 0) {
            return this.f265a;
        }
        return this.f265a + ":" + this.f106947a;
    }
}
