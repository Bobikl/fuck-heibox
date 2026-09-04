package org.apache.tools.ant.util.regexp;

import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: RegexpMatcher.java */
/* JADX INFO: loaded from: classes5.dex */
public interface e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136906c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136907d = 256;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136908e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136909f = 65536;

    Vector<String> b(String str) throws BuildException;

    String c() throws BuildException;

    boolean d(String str) throws BuildException;

    boolean e(String str, int i10) throws BuildException;

    Vector<String> f(String str, int i10) throws BuildException;

    void g(String str) throws BuildException;
}
