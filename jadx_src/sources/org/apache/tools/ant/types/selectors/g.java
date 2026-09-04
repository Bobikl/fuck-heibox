package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: BaseExtendSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g extends h implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected org.apache.tools.ant.types.m0[] f136511i = null;

    @Override // org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        this.f136511i = m0VarArr;
    }

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public abstract boolean P0(File file, String str, File file2) throws BuildException;

    protected org.apache.tools.ant.types.m0[] k2() {
        return this.f136511i;
    }
}
