package cn.fly.verify;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class fr implements fq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpURLConnection f36592a;

    public fr(HttpURLConnection httpURLConnection) {
        this.f36592a = httpURLConnection;
    }

    @Override // cn.fly.verify.fq
    public int a() throws IOException {
        return this.f36592a.getResponseCode();
    }

    @Override // cn.fly.verify.fq
    public InputStream b() throws IOException {
        return this.f36592a.getInputStream();
    }

    @Override // cn.fly.verify.fq
    public InputStream c() throws IOException {
        return this.f36592a.getErrorStream();
    }

    @Override // cn.fly.verify.fq
    public Map<String, List<String>> d() throws IOException {
        return this.f36592a.getHeaderFields();
    }
}
