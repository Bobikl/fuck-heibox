package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.PosixFilePermissions;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.util.PermissionUtils;

/* JADX INFO: compiled from: PosixPermissionsSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class g0 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136513c = true;

    @Override // org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        if (this.f136512b == null) {
            throw new BuildException("the permissions attribute is required");
        }
        try {
            return PosixFilePermissions.toString(this.f136513c ? Files.getPosixFilePermissions(file2.toPath(), new LinkOption[0]) : Files.getPosixFilePermissions(file2.toPath(), LinkOption.NOFOLLOW_LINKS)).equals(this.f136512b);
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public /* synthetic */ boolean a(s1 s1Var) {
        return u.a(this, s1Var);
    }

    public void b(boolean z10) {
        this.f136513c = z10;
    }

    public void c(String str) {
        if (str.length() == 3 && str.matches("^[0-7]+$")) {
            this.f136512b = PosixFilePermissions.toString(PermissionUtils.e(Integer.parseInt(str, 8)));
            return;
        }
        try {
            this.f136512b = PosixFilePermissions.toString(PosixFilePermissions.fromString(str));
        } catch (IllegalArgumentException e10) {
            throw new BuildException("the permissions attribute " + str + " is invalid", e10);
        }
    }
}
