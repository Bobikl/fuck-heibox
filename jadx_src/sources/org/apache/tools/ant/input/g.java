package org.apache.tools.ant.input;

import java.util.Arrays;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: SecureInputHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends a {
    @Override // org.apache.tools.ant.input.a, org.apache.tools.ant.input.c
    public void a(d dVar) throws BuildException {
        String strC = c(dVar);
        do {
            char[] password = System.console().readPassword(strC, new Object[0]);
            if (password == null) {
                throw new BuildException("unexpected end of stream while reading input");
            }
            dVar.f(new String(password));
            Arrays.fill(password, ' ');
        } while (!dVar.d());
    }
}
