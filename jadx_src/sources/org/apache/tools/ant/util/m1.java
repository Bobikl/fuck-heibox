package org.apache.tools.ant.util;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: RegexpPatternMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class m1 implements g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f136862g = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected org.apache.tools.ant.util.regexp.e f136863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char[] f136864c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected StringBuffer f136865d = new StringBuffer();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f136866e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f136867f = 0;

    public m1() throws BuildException {
        this.f136863b = null;
        this.f136863b = new org.apache.tools.ant.util.regexp.f().b();
    }

    protected String a(String str) {
        Vector<String> vectorF = this.f136863b.f(str, this.f136867f);
        this.f136865d.setLength(0);
        int i10 = 0;
        while (true) {
            char[] cArr = this.f136864c;
            if (i10 >= cArr.length) {
                return this.f136865d.substring(0);
            }
            char c10 = cArr[i10];
            if (c10 == '\\') {
                i10++;
                if (i10 < cArr.length) {
                    int iDigit = Character.digit(cArr[i10], 10);
                    if (iDigit > -1) {
                        this.f136865d.append(vectorF.get(iDigit));
                    } else {
                        this.f136865d.append(this.f136864c[i10]);
                    }
                } else {
                    this.f136865d.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
            } else {
                this.f136865d.append(c10);
            }
            i10++;
        }
    }

    public void b(boolean z10) {
        this.f136867f = org.apache.tools.ant.util.regexp.g.b(z10);
    }

    public void c(boolean z10) {
        this.f136866e = z10;
    }

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) throws BuildException {
        if (str == null) {
            throw new BuildException("this mapper requires a 'from' attribute");
        }
        try {
            this.f136863b.g(str);
        } catch (NoClassDefFoundError e10) {
            throw new BuildException("Cannot load regular expression matcher", e10);
        }
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
        if (str == null) {
            throw new BuildException("this mapper requires a 'to' attribute");
        }
        this.f136864c = str.toCharArray();
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        if (str == null) {
            return null;
        }
        if (this.f136866e && str.contains("\\")) {
            str = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        }
        org.apache.tools.ant.util.regexp.e eVar = this.f136863b;
        if (eVar == null || this.f136864c == null || !eVar.e(str, this.f136867f)) {
            return null;
        }
        return new String[]{a(str)};
    }
}
