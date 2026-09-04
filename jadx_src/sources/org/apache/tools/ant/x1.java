package org.apache.tools.ant;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: PathTokenizer.java */
/* JADX INFO: loaded from: classes5.dex */
public class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringTokenizer f137106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137107b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f137108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137109d;

    public x1(String str) {
        boolean zB = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133972n);
        this.f137108c = zB;
        if (zB) {
            this.f137106a = new StringTokenizer(str, ":;", true);
        } else {
            this.f137106a = new StringTokenizer(str, ":;", false);
        }
        this.f137109d = File.pathSeparatorChar == ';';
    }

    public boolean a() {
        return this.f137107b != null || this.f137106a.hasMoreTokens();
    }

    public String b() throws NoSuchElementException {
        String strTrim = this.f137107b;
        if (strTrim != null) {
            this.f137107b = null;
        } else {
            strTrim = this.f137106a.nextToken().trim();
        }
        if (!this.f137108c) {
            if (strTrim.length() != 1 || !Character.isLetter(strTrim.charAt(0)) || !this.f137109d || !this.f137106a.hasMoreTokens()) {
                return strTrim;
            }
            String strTrim2 = this.f137106a.nextToken().trim();
            if (!strTrim2.startsWith("\\") && !strTrim2.startsWith("/")) {
                this.f137107b = strTrim2;
                return strTrim;
            }
            return strTrim + ":" + strTrim2;
        }
        String str = File.pathSeparator;
        if (strTrim.equals(str) || ":".equals(strTrim)) {
            strTrim = this.f137106a.nextToken().trim();
        }
        if (!this.f137106a.hasMoreTokens()) {
            return strTrim;
        }
        String strTrim3 = this.f137106a.nextToken().trim();
        if (strTrim3.equals(str)) {
            return strTrim;
        }
        if (!":".equals(strTrim3)) {
            this.f137107b = strTrim3;
            return strTrim;
        }
        if (strTrim.startsWith("/") || strTrim.startsWith("\\") || strTrim.startsWith(".") || strTrim.startsWith("..")) {
            return strTrim;
        }
        String strTrim4 = this.f137106a.nextToken().trim();
        if (!strTrim4.equals(str)) {
            return strTrim + ":" + strTrim4;
        }
        String str2 = strTrim + ":";
        this.f137107b = strTrim4;
        return str2;
    }
}
