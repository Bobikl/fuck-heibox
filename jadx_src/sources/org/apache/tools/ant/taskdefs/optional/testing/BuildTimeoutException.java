package org.apache.tools.ant.taskdefs.optional.testing;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;

/* JADX INFO: loaded from: classes5.dex */
public class BuildTimeoutException extends BuildException {
    private static final long serialVersionUID = -8057644603246297562L;

    public BuildTimeoutException() {
    }

    public BuildTimeoutException(String str) {
        super(str);
    }

    public BuildTimeoutException(String str, Throwable th2) {
        super(str, th2);
    }

    public BuildTimeoutException(String str, Throwable th2, Location location) {
        super(str, th2, location);
    }

    public BuildTimeoutException(String str, Location location) {
        super(str, location);
    }

    public BuildTimeoutException(Throwable th2) {
        super(th2);
    }

    public BuildTimeoutException(Throwable th2, Location location) {
        super(th2, location);
    }
}
