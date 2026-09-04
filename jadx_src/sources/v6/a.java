package v6;

import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.util.c;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;

/* JADX INFO: compiled from: OkHttpStreamFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements d<InputStream>, f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f140823h = "OkHttpFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f140824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f140825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f140826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d0 f140827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a<? super InputStream> f140828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile e f140829g;

    public a(e.a aVar, h hVar) {
        this.f140824b = aVar;
        this.f140825c = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    @n0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream = this.f140826d;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        d0 d0Var = this.f140827e;
        if (d0Var != null) {
            d0Var.close();
        }
        this.f140828f = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @n0
    public DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        e eVar = this.f140829g;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@n0 Priority priority, @n0 d.a<? super InputStream> aVar) {
        a0.a aVarB = new a0.a().B(this.f140825c.h());
        for (Map.Entry<String, String> entry : this.f140825c.e().entrySet()) {
            aVarB.a(entry.getKey(), entry.getValue());
        }
        a0 a0VarB = aVarB.b();
        this.f140828f = aVar;
        this.f140829g = this.f140824b.a(a0VarB);
        this.f140829g.enqueue(this);
    }

    @Override // okhttp3.f
    public void onFailure(@n0 e eVar, @n0 IOException iOException) {
        if (Log.isLoggable(f140823h, 3)) {
            Log.d(f140823h, "OkHttp failed to obtain result", iOException);
        }
        this.f140828f.f(iOException);
    }

    @Override // okhttp3.f
    public void onResponse(@n0 e eVar, @n0 c0 c0Var) {
        this.f140827e = c0Var.q();
        if (!c0Var.c1()) {
            this.f140828f.f(new HttpException(c0Var.getMessage(), c0Var.x()));
            return;
        }
        InputStream inputStreamB = c.b(this.f140827e.byteStream(), ((d0) m.e(this.f140827e)).getContentLength());
        this.f140826d = inputStreamB;
        this.f140828f.e(inputStreamB);
    }
}
