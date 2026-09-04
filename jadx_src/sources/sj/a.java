package sj;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: Provider.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f139402e;

    public void B1() {
        String str = this.f139402e;
        if (str == null) {
            throw new BuildException("classname attribute must be set for provider element", w1());
        }
        if (str.isEmpty()) {
            throw new BuildException("Invalid empty classname", w1());
        }
    }

    public String D1() {
        return this.f139402e;
    }

    public void G1(String str) {
        this.f139402e = str;
    }
}
