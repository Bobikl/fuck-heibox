package org.apache.tools.ant.filters;

import java.io.Reader;
import org.apache.tools.ant.types.m0;
import org.apache.tools.ant.types.n0;

/* JADX INFO: compiled from: BaseParamFilterReader.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends a implements n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m0[] f133149e;

    public b() {
    }

    public b(Reader reader) {
        super(reader);
    }

    @Override // org.apache.tools.ant.types.n0
    public final void H0(m0... m0VarArr) {
        this.f133149e = m0VarArr;
        e(false);
    }

    protected final m0[] g() {
        return this.f133149e;
    }
}
