package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: Caverphone.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements mj.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f132979a = new c();

    @Override // mj.g
    public String a(String str) {
        return b(str);
    }

    public String b(String str) {
        return this.f132979a.a(str);
    }

    public boolean c(String str, String str2) {
        return b(str).equals(b(str2));
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return b((String) obj);
        }
        throw new EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
}
