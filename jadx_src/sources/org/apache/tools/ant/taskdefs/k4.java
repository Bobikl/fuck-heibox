package org.apache.tools.ant.taskdefs;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Move.java */
/* JADX INFO: loaded from: classes5.dex */
public class k4 extends q0 {
    private boolean N = org.apache.tools.ant.taskdefs.condition.z.b("windows");

    public k4() {
        Y2(true);
    }

    private void h3(File file, File file2, boolean z10, boolean z11) {
        try {
            x1("Copying " + file + " to " + file2, this.f135585u);
            final org.apache.tools.ant.types.h0 h0Var = new org.apache.tools.ant.types.h0();
            if (z10) {
                h0Var.a(b().n0());
            }
            B2().forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.j4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    h0Var.a((org.apache.tools.ant.types.f0) obj);
                }
            });
            try {
                z2().q(file, file2, h0Var, A2(), this.f135583s, H2(), false, y2(), G2(), b(), C2());
            } catch (IOException e10) {
                e = e10;
                throw new BuildException("Failed to copy " + file + " to " + file2 + " due to " + e.getMessage(), e, w1());
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    private void k3(File file, File file2, boolean z10, boolean z11) {
        try {
            x1("Attempting to rename: " + file + " to " + file2, this.f135585u);
            if (m3(file, file2, z10, this.f135583s)) {
                return;
            }
            h3(file, file2, z10, z11);
            if (!z2().u0(file, this.N)) {
                throw new BuildException("Unable to delete file %s", file.getAbsolutePath());
            }
        } catch (IOException e10) {
            throw new BuildException("Failed to rename " + file + " to " + file2 + " due to " + e10.getMessage(), e10, w1());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.q0
    protected void g3() throws BuildException {
        File file = this.f135575k;
        if (file == null || !file.isDirectory()) {
            super.g3();
            return;
        }
        File file2 = this.f135576l;
        if ((file2 != null && this.f135577m != null) || (file2 == null && this.f135577m == null)) {
            throw new BuildException("One and only one of tofile and todir must be set.");
        }
        if (file2 == null) {
            file2 = new File(this.f135577m, this.f135575k.getName());
        }
        this.f135576l = file2;
        File parentFile = this.f135577m;
        if (parentFile == null) {
            parentFile = file2.getParentFile();
        }
        this.f135577m = parentFile;
        this.f135590z.put(this.f135575k, this.f135576l);
        this.f135575k = null;
    }

    protected void i3(File file) {
        j3(file, false);
    }

    protected void j3(File file, boolean z10) {
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (!file2.isDirectory()) {
                if (z10 && !z2().u0(file2, this.N)) {
                    throw new BuildException("Unable to delete file %s", file2.getAbsolutePath());
                }
                throw new BuildException("UNEXPECTED ERROR - The file %s should not exist!", file2.getAbsolutePath());
            }
            i3(file2);
        }
        x1("Deleting directory " + file.getAbsolutePath(), this.f135585u);
        if (!z2().u0(file, this.N)) {
            throw new BuildException("Unable to delete directory %s", file.getAbsolutePath());
        }
    }

    protected boolean l3(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (!file2.isDirectory() || !l3(file2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean m3(File file, File file2, boolean z10, boolean z11) throws IOException, BuildException {
        if (file2.isDirectory() || z10 || !B2().isEmpty() || !A2().isEmpty()) {
            return false;
        }
        if (file2.isFile() && !file2.canWrite()) {
            if (!C2()) {
                throw new IOException(String.format("can't replace read-only destination file %s", file2));
            }
            if (!z2().t0(file2)) {
                throw new IOException(String.format("failed to delete read-only destination file %s", file2));
            }
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        } else if (file2.isFile()) {
            file = z2().i0(file.getAbsolutePath()).getCanonicalFile();
            file2 = z2().i0(file2.getAbsolutePath());
            if (file2.getAbsolutePath().equals(file.getAbsolutePath())) {
                x1("Rename of " + file + " to " + file2 + " is a no-op.", 3);
                return true;
            }
            if (!z2().b(file, file2) && !z2().u0(file2, this.N)) {
                throw new BuildException("Unable to remove existing file %s", file2);
            }
        }
        return file.renameTo(file2);
    }

    public void n3(boolean z10) {
        this.N = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.q0
    protected void v2() {
        if (this.f135590z.size() > 0) {
            for (Map.Entry<File, File> entry : this.f135590z.entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                try {
                    x1("Attempting to rename dir: " + key + " to " + value, this.f135585u);
                    if (!m3(key, value, this.f135581q, this.f135583s)) {
                        org.apache.tools.ant.types.b0 b0Var = new org.apache.tools.ant.types.b0();
                        b0Var.J(b());
                        b0Var.R2(key);
                        o2(b0Var);
                        org.apache.tools.ant.v0 v0VarB2 = b0Var.B2(b());
                        N2(key, value, v0VarB2.m(), v0VarB2.j());
                    }
                } catch (IOException e10) {
                    throw new BuildException("Failed to rename dir " + key + " to " + value + " due to " + e10.getMessage(), e10, w1());
                }
            }
        }
        int size = this.f135588x.size();
        if (size > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Moving ");
            sb2.append(size);
            sb2.append(" file");
            sb2.append(size == 1 ? "" : ak.aB);
            sb2.append(" to ");
            sb2.append(this.f135577m.getAbsolutePath());
            log(sb2.toString());
            for (Map.Entry<String, String[]> entry2 : this.f135588x.entrySet()) {
                String key2 = entry2.getKey();
                File file = new File(key2);
                if (file.exists()) {
                    String[] value2 = entry2.getValue();
                    boolean z10 = false;
                    for (int i10 = 0; i10 < value2.length; i10++) {
                        String str = value2[i10];
                        if (key2.equals(str)) {
                            x1("Skipping self-move of " + key2, this.f135585u);
                            z10 = true;
                        } else {
                            File file2 = new File(str);
                            if (i10 + 1 != value2.length || z10) {
                                h3(file, file2, this.f135581q, this.f135583s);
                            } else {
                                k3(file, file2, this.f135581q, this.f135583s);
                            }
                        }
                    }
                }
            }
        }
        if (this.f135586v) {
            int i11 = 0;
            for (Map.Entry<String, String[]> entry3 : this.f135589y.entrySet()) {
                String key3 = entry3.getKey();
                boolean z11 = false;
                for (String str2 : entry3.getValue()) {
                    if (key3.equals(str2)) {
                        x1("Skipping self-move of " + key3, this.f135585u);
                        z11 = true;
                    } else {
                        File file3 = new File(str2);
                        if (!file3.exists()) {
                            if (file3.mkdirs() || file3.exists()) {
                                i11++;
                            } else {
                                x1("Unable to create directory " + file3.getAbsolutePath(), 0);
                            }
                        }
                    }
                }
                File file4 = new File(key3);
                if (!z11 && l3(file4)) {
                    i3(file4);
                }
            }
            if (i11 > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Moved ");
                sb3.append(this.f135589y.size());
                sb3.append(" empty director");
                sb3.append(this.f135589y.size() == 1 ? "y" : "ies");
                sb3.append(" to ");
                sb3.append(i11);
                sb3.append(" empty director");
                sb3.append(i11 != 1 ? "ies" : "y");
                sb3.append(" under ");
                sb3.append(this.f135577m.getAbsolutePath());
                log(sb3.toString());
            }
        }
    }
}
