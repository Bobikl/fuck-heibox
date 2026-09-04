package org.apache.tools.ant;

/* JADX INFO: loaded from: classes5.dex */
public class UnsupportedAttributeException extends BuildException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f133078c;

    public UnsupportedAttributeException(String str, String str2) {
        super(str);
        this.f133078c = str2;
    }

    public String d() {
        return this.f133078c;
    }
}
