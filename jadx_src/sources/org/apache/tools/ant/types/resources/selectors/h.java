package org.apache.tools.ant.types.resources.selectors;

import com.tencent.qcloud.core.util.IOUtils;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.r1;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.selectors.m0;

/* JADX INFO: compiled from: Name.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136441c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r1 f136444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.apache.tools.ant.util.regexp.c f136445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Project f136446h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136440b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136442d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f136443e = false;

    private boolean f(String str) {
        String str2 = this.f136441c;
        if (str2 != null) {
            return m0.i(g(str2), g(str), this.f136442d);
        }
        if (this.f136444f == null) {
            r1 r1Var = new r1();
            this.f136444f = r1Var;
            r1Var.j2(this.f136440b);
            this.f136445g = this.f136444f.g2(this.f136446h);
        }
        return this.f136445g.e(g(str), org.apache.tools.ant.util.regexp.g.b(this.f136442d));
    }

    private String g(String str) {
        return (str != null && this.f136443e && str.contains("\\")) ? str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) : str;
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        String strK2 = s1Var.k2();
        if (f(strK2)) {
            return true;
        }
        String string = s1Var.toString();
        return !string.equals(strK2) && f(string);
    }

    public boolean b() {
        return this.f136443e;
    }

    public String c() {
        return this.f136441c;
    }

    public String d() {
        return this.f136440b;
    }

    public boolean e() {
        return this.f136442d;
    }

    public void h(boolean z10) {
        this.f136442d = z10;
    }

    public void i(boolean z10) {
        this.f136443e = z10;
    }

    public void j(String str) {
        this.f136441c = str;
    }

    public void k(Project project) {
        this.f136446h = project;
    }

    public void l(String str) {
        this.f136440b = str;
        this.f136444f = null;
    }
}
