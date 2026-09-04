package org.apache.tools.ant.taskdefs;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Copydir.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class s0 extends h4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135728n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135729o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135730p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, String> f135731q = new Hashtable();

    private void y2(File file, File file2, String[] strArr) {
        for (String str : strArr) {
            File file3 = new File(file, str);
            File file4 = this.f135729o ? new File(file2, new File(str).getName()) : new File(file2, str);
            if (this.f135730p || file3.lastModified() > file4.lastModified()) {
                this.f135731q.put(file3.getAbsolutePath(), file4.getAbsolutePath());
            }
        }
    }

    public void A2(boolean z10) {
        this.f135728n = z10;
    }

    public void B2(boolean z10) {
        this.f135729o = z10;
    }

    public void C2(boolean z10) {
        this.f135730p = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        log("DEPRECATED - The copydir task is deprecated.  Use copy instead.");
        File file = this.f135726l;
        if (file == null) {
            throw new BuildException("src attribute must be set!", w1());
        }
        if (!file.exists()) {
            throw new BuildException("srcdir " + this.f135726l.toString() + " does not exist!", w1());
        }
        File file2 = this.f135727m;
        if (file2 == null) {
            throw new BuildException("The dest attribute must be set.", w1());
        }
        if (this.f135726l.equals(file2)) {
            x1("Warning: src == dest", 1);
        }
        try {
            y2(this.f135726l, this.f135727m, super.p2(this.f135726l).m());
            if (this.f135731q.size() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Copying ");
                sb2.append(this.f135731q.size());
                sb2.append(" file");
                sb2.append(this.f135731q.size() == 1 ? "" : ak.aB);
                sb2.append(" to ");
                sb2.append(this.f135727m.getAbsolutePath());
                log(sb2.toString());
                for (Map.Entry<String, String> entry : this.f135731q.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    try {
                        b().u(key, value, this.f135728n, this.f135730p);
                    } catch (IOException e10) {
                        throw new BuildException("Failed to copy " + key + " to " + value + " due to " + e10.getMessage(), e10, w1());
                    }
                }
            }
            this.f135731q.clear();
        } catch (Throwable th2) {
            this.f135731q.clear();
            throw th2;
        }
    }

    public void D2(File file) {
        this.f135726l = file;
    }

    public void z2(File file) {
        this.f135727m = file;
    }
}
