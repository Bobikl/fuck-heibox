package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.util.Hashtable;

/* JADX INFO: compiled from: OrionDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final String f135018w = "orion-ejb-jar.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135019v = ".jar";

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        if (E()) {
            str = "";
        }
        File file = new File(n().f134952b, str + f135018w);
        if (file.exists()) {
            hashtable.put("META-INF/orion-ejb-jar.xml", file);
            return;
        }
        x("Unable to locate Orion deployment descriptor. It was expected to be in " + file.getPath(), 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    File w(String str) {
        return new File(p(), str + this.f135019v);
    }
}
