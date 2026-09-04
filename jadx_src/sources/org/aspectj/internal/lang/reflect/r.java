package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import zj.a0;
import zj.b0;

/* JADX INFO: compiled from: TypePatternBasedPerClauseImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class r extends l implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f137662b;

    public r(PerClauseKind perClauseKind, String str) {
        super(perClauseKind);
        this.f137662b = new s(str);
    }

    @Override // zj.b0
    public a0 e() {
        return this.f137662b;
    }

    @Override // org.aspectj.internal.lang.reflect.l
    public String toString() {
        return "pertypewithin(" + this.f137662b.a() + ")";
    }
}
