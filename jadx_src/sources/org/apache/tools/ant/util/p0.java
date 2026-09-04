package org.apache.tools.ant.util;

import com.tencent.qcloud.core.util.IOUtils;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: GlobPatternMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class p0 implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f136880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f136881e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f136878b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f136879c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f136882f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f136883g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136884h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136885i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136886j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f136887k = true;

    private String c(String str) {
        if (!this.f136887k) {
            str = str.toLowerCase();
        }
        return (this.f136886j && str.contains("\\")) ? str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) : str;
    }

    protected String a(String str) {
        return str.substring(this.f136880d, str.length() - this.f136881e);
    }

    public boolean b() {
        return this.f136886j;
    }

    public void d(boolean z10) {
        this.f136887k = z10;
    }

    public void e(boolean z10) {
        this.f136886j = z10;
    }

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
        if (str == null) {
            throw new BuildException("this mapper requires a 'from' attribute");
        }
        int iLastIndexOf = str.lastIndexOf(42);
        if (iLastIndexOf < 0) {
            this.f136878b = str;
            this.f136879c = "";
        } else {
            this.f136878b = str.substring(0, iLastIndexOf);
            this.f136879c = str.substring(iLastIndexOf + 1);
            this.f136884h = true;
        }
        this.f136880d = this.f136878b.length();
        this.f136881e = this.f136879c.length();
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
        if (str == null) {
            throw new BuildException("this mapper requires a 'to' attribute");
        }
        int iLastIndexOf = str.lastIndexOf(42);
        if (iLastIndexOf < 0) {
            this.f136882f = str;
            this.f136883g = "";
        } else {
            this.f136882f = str.substring(0, iLastIndexOf);
            this.f136883g = str.substring(iLastIndexOf + 1);
            this.f136885i = true;
        }
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        String str2;
        String[] strArr = null;
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (this.f136878b != null && str.length() >= this.f136880d + this.f136881e && ((this.f136884h || strC.equals(c(this.f136878b))) && (!this.f136884h || (strC.startsWith(c(this.f136878b)) && strC.endsWith(c(this.f136879c)))))) {
            strArr = new String[1];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f136882f);
            if (this.f136885i) {
                str2 = a(str) + this.f136883g;
            } else {
                str2 = "";
            }
            sb2.append(str2);
            strArr[0] = sb2.toString();
        }
        return strArr;
    }
}
