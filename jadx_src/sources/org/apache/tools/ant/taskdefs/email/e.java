package org.apache.tools.ant.taskdefs.email;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: Message.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f134137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private StringBuffer f134138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f134139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f134140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f134141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f134142j;

    public e() {
        this.f134137e = null;
        this.f134138f = new StringBuffer();
        this.f134139g = "text/plain";
        this.f134140h = false;
        this.f134141i = null;
    }

    public e(File file) {
        this.f134137e = null;
        this.f134138f = new StringBuffer();
        this.f134139g = "text/plain";
        this.f134140h = false;
        this.f134141i = null;
        this.f134137e = file;
    }

    public e(String str) {
        this.f134137e = null;
        this.f134138f = new StringBuffer();
        this.f134139g = "text/plain";
        this.f134140h = false;
        this.f134141i = null;
        B1(str);
    }

    private Reader H1(File file) throws IOException {
        if (this.f134142j == null) {
            return new FileReader(file);
        }
        InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            return new InputStreamReader(inputStreamNewInputStream, this.f134142j);
        } catch (IOException e10) {
            inputStreamNewInputStream.close();
            throw e10;
        }
    }

    public void B1(String str) {
        this.f134138f.append(str);
    }

    public String D1() {
        return this.f134141i;
    }

    public String G1() {
        return this.f134139g;
    }

    public boolean I1() {
        return this.f134140h;
    }

    public void K1(PrintStream printStream) throws IOException {
        BufferedWriter bufferedWriter = this.f134141i == null ? new BufferedWriter(new OutputStreamWriter(printStream)) : new BufferedWriter(new OutputStreamWriter(printStream, this.f134141i));
        if (this.f134137e != null) {
            BufferedReader bufferedReader = new BufferedReader(H1(this.f134137e));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    bufferedWriter.write(b().V0(line));
                    bufferedWriter.newLine();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } else {
            bufferedWriter.write(b().V0(this.f134138f.substring(0)));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }

    public void L1(String str) {
        this.f134141i = str;
    }

    public void N1(String str) {
        this.f134142j = str;
    }

    public void O1(String str) {
        this.f134139g = str;
        this.f134140h = true;
    }

    public void Q1(File file) {
        this.f134137e = file;
    }
}
