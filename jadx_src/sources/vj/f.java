package vj;

import java.security.Permission;
import org.apache.tools.ant.ExitException;

/* JADX INFO: compiled from: NoExitSecurityManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends SecurityManager {
    @Override // java.lang.SecurityManager
    public void checkExit(int i10) {
        throw new ExitException(i10);
    }

    @Override // java.lang.SecurityManager
    public void checkPermission(Permission permission) {
    }
}
