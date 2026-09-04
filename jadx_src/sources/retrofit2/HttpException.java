package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f138894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f138895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient s<?> f138896d;

    public HttpException(s<?> sVar) {
        super(b(sVar));
        this.f138894b = sVar.b();
        this.f138895c = sVar.h();
        this.f138896d = sVar;
    }

    private static String b(s<?> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return "HTTP " + sVar.b() + " " + sVar.h();
    }

    public int a() {
        return this.f138894b;
    }

    public String c() {
        return this.f138895c;
    }

    @Nullable
    public s<?> d() {
        return this.f138896d;
    }
}
