package pl.droidsonroids.gif;

import androidx.annotation.n0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final GifError f138313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f138314c;

    GifIOException(int i10, String str) {
        this.f138313b = GifError.fromCode(i10);
        this.f138314c = str;
    }

    static GifIOException a(int i10) {
        if (i10 == GifError.NO_ERROR.errorCode) {
            return null;
        }
        return new GifIOException(i10, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f138314c == null) {
            return this.f138313b.getFormattedDescription();
        }
        return this.f138313b.getFormattedDescription() + ": " + this.f138314c;
    }
}
