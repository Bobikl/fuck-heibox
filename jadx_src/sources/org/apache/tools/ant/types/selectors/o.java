package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.StringTokenizer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: DepthSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f136588l = "min";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f136589m = "max";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f136590j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f136591k = -1;

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if (f136588l.equalsIgnoreCase(strA)) {
                    try {
                        m2(Integer.parseInt(m0Var.c()));
                    } catch (NumberFormatException unused) {
                        g2("Invalid minimum value " + m0Var.c());
                    }
                } else if (f136589m.equalsIgnoreCase(strA)) {
                    try {
                        l2(Integer.parseInt(m0Var.c()));
                    } catch (NumberFormatException unused2) {
                        g2("Invalid maximum value " + m0Var.c());
                    }
                } else {
                    g2("Invalid parameter " + strA);
                }
            }
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        String str2 = File.separator;
        StringTokenizer stringTokenizer = new StringTokenizer(absolutePath, str2);
        StringTokenizer stringTokenizer2 = new StringTokenizer(absolutePath2, str2);
        int i10 = -1;
        while (stringTokenizer2.hasMoreTokens()) {
            String strNextToken = stringTokenizer2.nextToken();
            if (!stringTokenizer.hasMoreTokens()) {
                i10++;
                int i11 = this.f136591k;
                if (i11 > -1 && i10 > i11) {
                    return false;
                }
            } else if (!stringTokenizer.nextToken().equals(strNextToken)) {
                throw new BuildException("File %s does not appear within %s directory", str, absolutePath);
            }
        }
        if (stringTokenizer.hasMoreTokens()) {
            throw new BuildException("File %s is outside of %s directory tree", str, absolutePath);
        }
        int i12 = this.f136590j;
        return i12 <= -1 || i10 >= i12;
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136590j < 0 && this.f136591k < 0) {
            g2("You must set at least one of the min or the max levels.");
        }
        int i10 = this.f136591k;
        if (i10 >= this.f136590j || i10 <= -1) {
            return;
        }
        g2("The maximum depth is lower than the minimum.");
    }

    public void l2(int i10) {
        this.f136591k = i10;
    }

    public void m2(int i10) {
        this.f136590j = i10;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return "{depthselector min: " + this.f136590j + " max: " + this.f136591k + z5.g.f141884d;
    }
}
