package org.apache.tools.ant.taskdefs.optional.net;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: MimeMail.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class a extends org.apache.tools.ant.taskdefs.email.b {
    @Override // org.apache.tools.ant.taskdefs.email.b, org.apache.tools.ant.u2
    public void D1() throws BuildException {
        log("DEPRECATED - The " + K1() + " task is deprecated. Use the mail task instead.");
        super.D1();
    }
}
