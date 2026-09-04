package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: TSerializer.java */
/* JADX INFO: loaded from: classes4.dex */
public class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f104559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce f104560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bs f104561c;

    public bc() {
        this(new bm.a());
    }

    public bc(bu buVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f104559a = byteArrayOutputStream;
        ce ceVar = new ce(byteArrayOutputStream);
        this.f104560b = ceVar;
        this.f104561c = buVar.a(ceVar);
    }

    public String a(at atVar, String str) throws az {
        try {
            return new String(a(atVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }

    public byte[] a(at atVar) throws az {
        this.f104559a.reset();
        atVar.write(this.f104561c);
        return this.f104559a.toByteArray();
    }

    public String b(at atVar) throws az {
        return new String(a(atVar));
    }
}
