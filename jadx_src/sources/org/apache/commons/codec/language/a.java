package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: AbstractCaverphone.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements mj.g {
    public boolean b(String str, String str2) throws EncoderException {
        return a(str).equals(a(str2));
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
}
