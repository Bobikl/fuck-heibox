package org.apache.tools.ant.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Properties;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: PropertyFileInputHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f133468b = "ant.input.properties";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Properties f133469a = null;

    private synchronized void b() throws BuildException {
        if (this.f133469a == null) {
            String property = System.getProperty(f133468b);
            if (property == null) {
                throw new BuildException("System property ant.input.properties for PropertyFileInputHandler not set");
            }
            Properties properties = new Properties();
            this.f133469a = properties;
            try {
                properties.load(Files.newInputStream(Paths.get(property, new String[0]), new OpenOption[0]));
            } catch (IOException e10) {
                throw new BuildException("Couldn't load " + property, e10);
            }
        }
    }

    @Override // org.apache.tools.ant.input.c
    public void a(d dVar) throws BuildException {
        b();
        Object obj = this.f133469a.get(dVar.c());
        if (obj == null) {
            throw new BuildException("Unable to find input for '" + dVar.c() + "'");
        }
        dVar.f(obj.toString());
        if (dVar.d()) {
            return;
        }
        throw new BuildException("Found invalid input " + obj + " for '" + dVar.c() + "'");
    }
}
