package org.apache.tools.ant;

/* JADX INFO: loaded from: classes5.dex */
public class ExitStatusException extends BuildException {
    private static final long serialVersionUID = 7760846806886585968L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f133035c;

    public ExitStatusException(int i10) {
        this.f133035c = i10;
    }

    public ExitStatusException(String str, int i10) {
        super(str);
        this.f133035c = i10;
    }

    public ExitStatusException(String str, int i10, Location location) {
        super(str, location);
        this.f133035c = i10;
    }

    public int d() {
        return this.f133035c;
    }
}
