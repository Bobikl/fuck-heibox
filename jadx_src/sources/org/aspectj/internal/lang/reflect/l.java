package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import zj.u;

/* JADX INFO: compiled from: PerClauseImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class l implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PerClauseKind f137650a;

    protected l(PerClauseKind perClauseKind) {
        this.f137650a = perClauseKind;
    }

    @Override // zj.u
    public PerClauseKind b() {
        return this.f137650a;
    }

    public String toString() {
        return "issingleton()";
    }
}
