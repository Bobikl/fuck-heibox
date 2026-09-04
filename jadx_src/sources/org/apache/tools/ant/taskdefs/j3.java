package org.apache.tools.ant.taskdefs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* JADX INFO: compiled from: JikesOutputParser.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class j3 implements q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected org.apache.tools.ant.u2 f134331b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f134333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f134334e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f134336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected BufferedReader f134337h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f134332c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f134335f = false;

    protected j3(org.apache.tools.ant.u2 u2Var, boolean z10) {
        System.err.println("As of Ant 1.2 released in October 2000, the JikesOutputParser class");
        System.err.println("is considered to be dead code by the Ant developers and is unmaintained.");
        System.err.println("Don't use it!");
        this.f134331b = u2Var;
        this.f134336g = z10;
    }

    private void b(String str) {
        if (!this.f134336g) {
            this.f134331b.x1("", !this.f134335f ? 1 : 0);
        }
        this.f134331b.x1(str, !this.f134335f ? 1 : 0);
    }

    private void c(BufferedReader bufferedReader) throws IOException {
        e(bufferedReader);
    }

    private void e(BufferedReader bufferedReader) throws IOException {
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String lowerCase = line.toLowerCase();
            if (!line.trim().isEmpty()) {
                if (lowerCase.contains("error")) {
                    f(true);
                } else if (lowerCase.contains("warning")) {
                    f(false);
                } else if (this.f134336g) {
                    f(true);
                }
                b(line);
            }
        }
    }

    private void f(boolean z10) {
        this.f134335f = z10;
        if (z10) {
            this.f134332c = true;
        }
    }

    protected boolean a() {
        return this.f134332c;
    }

    protected void d(BufferedReader bufferedReader) throws IOException {
        if (this.f134336g) {
            c(bufferedReader);
        } else {
            e(bufferedReader);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void e1(InputStream inputStream) {
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void o1(OutputStream outputStream) {
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void q1(InputStream inputStream) throws IOException {
        this.f134337h = new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void start() throws IOException {
        d(this.f134337h);
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void stop() {
    }
}
