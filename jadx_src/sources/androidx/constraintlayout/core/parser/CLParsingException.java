package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18058d;

    public CLParsingException(String str, c cVar) {
        this.f18056b = str;
        if (cVar != null) {
            this.f18058d = cVar.o();
            this.f18057c = cVar.l();
        } else {
            this.f18058d = "unknown";
            this.f18057c = 0;
        }
    }

    public String a() {
        return this.f18056b + " (" + this.f18058d + " at line " + this.f18057c + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
