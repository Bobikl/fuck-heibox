package org.apache.tools.ant;

/* JADX INFO: loaded from: classes5.dex */
public class BuildException extends RuntimeException {
    private static final long serialVersionUID = -5419014565354664240L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Location f133033b;

    public BuildException() {
        this.f133033b = Location.f133036e;
    }

    public BuildException(String str) {
        super(str);
        this.f133033b = Location.f133036e;
    }

    public BuildException(String str, Throwable th2) {
        super(str, th2);
        this.f133033b = Location.f133036e;
    }

    public BuildException(String str, Throwable th2, Location location) {
        this(str, th2);
        this.f133033b = location;
    }

    public BuildException(String str, Location location) {
        super(str);
        Location location2 = Location.f133036e;
        this.f133033b = location;
    }

    public BuildException(String str, Object... objArr) {
        super(String.format(str, objArr));
        this.f133033b = Location.f133036e;
    }

    public BuildException(Throwable th2) {
        super(th2);
        this.f133033b = Location.f133036e;
    }

    public BuildException(Throwable th2, Location location) {
        this(th2);
        this.f133033b = location;
    }

    @Deprecated
    public Throwable a() {
        return getCause();
    }

    public Location b() {
        return this.f133033b;
    }

    public void c(Location location) {
        this.f133033b = location;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f133033b.toString() + getMessage();
    }
}
