package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: PosixGroupSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136510c = true;

    @Override // org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        if (this.f136509b == null) {
            throw new BuildException("the group attribute is required");
        }
        try {
            GroupPrincipal groupPrincipalGroup = this.f136510c ? ((PosixFileAttributes) Files.readAttributes(file2.toPath(), PosixFileAttributes.class, new LinkOption[0])).group() : ((PosixFileAttributes) Files.readAttributes(file2.toPath(), PosixFileAttributes.class, LinkOption.NOFOLLOW_LINKS)).group();
            return groupPrincipalGroup != null && groupPrincipalGroup.getName().equals(this.f136509b);
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }

    public void b(boolean z10) {
        this.f136510c = z10;
    }

    public void c(String str) {
        this.f136509b = str;
    }
}
