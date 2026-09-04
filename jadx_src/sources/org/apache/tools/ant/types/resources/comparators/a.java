package org.apache.tools.ant.types.resources.comparators;

import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: Content.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136336g = true;

    @Override // org.apache.tools.ant.types.resources.comparators.m
    protected int g2(s1 s1Var, s1 s1Var2) {
        try {
            return ResourceUtils.g(s1Var, s1Var2, !this.f136336g);
        } catch (IOException e10) {
            throw new BuildException(e10);
        }
    }

    public boolean h2() {
        return this.f136336g;
    }

    public void i2(boolean z10) {
        this.f136336g = z10;
    }
}
