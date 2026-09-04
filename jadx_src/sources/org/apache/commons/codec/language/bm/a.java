package org.apache.commons.codec.language.bm;

import mj.g;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: BeiderMorseEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f132918a = new d(NameType.GENERIC, RuleType.APPROX, true);

    @Override // mj.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return this.f132918a.c(str);
    }

    public NameType b() {
        return this.f132918a.f();
    }

    public RuleType c() {
        return this.f132918a.g();
    }

    public boolean d() {
        return this.f132918a.h();
    }

    public void e(boolean z10) {
        this.f132918a = new d(this.f132918a.f(), this.f132918a.g(), z10);
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("BeiderMorseEncoder encode parameter is not of type String");
    }

    public void f(NameType nameType) {
        this.f132918a = new d(nameType, this.f132918a.g(), this.f132918a.h());
    }

    public void g(RuleType ruleType) {
        this.f132918a = new d(this.f132918a.f(), ruleType, this.f132918a.h());
    }
}
