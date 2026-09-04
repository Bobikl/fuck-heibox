package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.UserPrincipal;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: OwnedBySelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class e0 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136508c = true;

    @Override // org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        if (this.f136507b == null) {
            throw new BuildException("the owner attribute is required");
        }
        if (file2 == null) {
            return false;
        }
        try {
            UserPrincipal owner = this.f136508c ? Files.getOwner(file2.toPath(), new LinkOption[0]) : Files.getOwner(file2.toPath(), LinkOption.NOFOLLOW_LINKS);
            return owner != null && this.f136507b.equals(owner.getName());
        } catch (IOException | UnsupportedOperationException unused) {
            return false;
        }
    }

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }

    public void b(boolean z10) {
        this.f136508c = z10;
    }

    public void c(String str) {
        this.f136507b = str;
    }
}
