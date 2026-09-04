package org.apache.tools.ant.taskdefs.email;

import java.io.File;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.d0;

/* JADX INFO: compiled from: Mailer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f134123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected a f134124g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected u2 f134131n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f134118a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f134119b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f134120c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f134121d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f134122e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Vector<a> f134125h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Vector<a> f134126i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Vector<a> f134127j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Vector<a> f134128k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Vector<File> f134129l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f134130m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f134132o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected Vector<c> f134133p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f134134q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f134135r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f134136s = false;

    protected final String a() {
        return d0.h();
    }

    protected boolean b() {
        return this.f134136s;
    }

    protected boolean c() {
        return this.f134135r;
    }

    public abstract void d() throws BuildException;

    public void e(Vector<a> vector) {
        this.f134128k = vector;
    }

    public void f(Vector<a> vector) {
        this.f134127j = vector;
    }

    public void g(boolean z10) {
        this.f134135r = z10;
    }

    public void h(Vector<File> vector) {
        this.f134129l = vector;
    }

    public void i(a aVar) {
        this.f134124g = aVar;
    }

    public void j(Vector<c> vector) {
        this.f134133p = vector;
    }

    public void k(String str) {
        this.f134118a = str;
    }

    public void l(boolean z10) {
        this.f134134q = z10;
    }

    public void m(boolean z10) {
        this.f134132o = z10;
    }

    public void n(e eVar) {
        this.f134123f = eVar;
    }

    public void o(String str) {
        this.f134121d = str;
    }

    public void p(int i10) {
        this.f134119b = i10;
    }

    public void q(boolean z10) {
        this.f134136s = z10;
    }

    public void r(Vector<a> vector) {
        this.f134125h = vector;
    }

    public void s(boolean z10) {
        this.f134122e = z10;
    }

    public void t(String str) {
        this.f134130m = str;
    }

    public void u(u2 u2Var) {
        this.f134131n = u2Var;
    }

    public void v(Vector<a> vector) {
        this.f134126i = vector;
    }

    public void w(String str) {
        this.f134120c = str;
    }

    protected boolean x() {
        return this.f134134q;
    }
}
