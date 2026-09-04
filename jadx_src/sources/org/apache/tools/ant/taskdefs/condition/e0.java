package org.apache.tools.ant.taskdefs.condition;

import java.io.IOException;
import java.net.Socket;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: Socket.java */
/* JADX INFO: loaded from: classes5.dex */
public class e0 extends b2 implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133883e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133884f = 0;

    public void B1(int i10) {
        this.f133884f = i10;
    }

    public void D1(String str) {
        this.f133883e = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if (this.f133883e == null) {
            throw new BuildException("No server specified in socket condition");
        }
        if (this.f133884f == 0) {
            throw new BuildException("No port specified in socket condition");
        }
        x1("Checking for listener at " + this.f133883e + ":" + this.f133884f, 3);
        try {
            new Socket(this.f133883e, this.f133884f).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
