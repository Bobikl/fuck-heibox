package pl.droidsonroids.gif;

import androidx.annotation.f0;
import androidx.annotation.p0;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: GifOptions.java */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    char f138368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f138369b;

    public g() {
        a();
    }

    private void a() {
        this.f138368a = (char) 1;
        this.f138369b = false;
    }

    void b(@p0 g gVar) {
        if (gVar == null) {
            a();
        } else {
            this.f138369b = gVar.f138369b;
            this.f138368a = gVar.f138368a;
        }
    }

    public void c(boolean z10) {
        this.f138369b = z10;
    }

    public void d(@f0(from = 1, to = WebSocketProtocol.PAYLOAD_SHORT_MAX) int i10) {
        if (i10 < 1 || i10 > 65535) {
            this.f138368a = (char) 1;
        } else {
            this.f138368a = (char) i10;
        }
    }
}
