package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: HttpUrlFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f40854h = "HttpUrlFetcher";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f40855i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @j1
    static final String f40856j = "Location";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @j1
    static final b f40857k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @j1
    static final int f40858l = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.model.h f40859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f40861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HttpURLConnection f40862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f40863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f40864g;

    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(com.bumptech.glide.load.model.h hVar, int i10) {
        this(hVar, i10, f40857k);
    }

    @j1
    j(com.bumptech.glide.load.model.h hVar, int i10, b bVar) {
        this.f40859b = hVar;
        this.f40860c = i10;
        this.f40861d = bVar;
    }

    private HttpURLConnection e(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.f40861d.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f40860c);
            httpURLConnectionA.setReadTimeout(this.f40860c);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable(f40854h, 3)) {
                return -1;
            }
            Log.d(f40854h, "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f40863f = com.bumptech.glide.util.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f40854h, 3)) {
                    Log.d(f40854h, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f40863f = httpURLConnection.getInputStream();
            }
            return this.f40863f;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map<String, String> map) throws HttpException {
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionE = e(url, map);
        this.f40862e = httpURLConnectionE;
        try {
            httpURLConnectionE.connect();
            this.f40863f = this.f40862e.getInputStream();
            if (this.f40864g) {
                return null;
            }
            int iF = f(this.f40862e);
            if (h(iF)) {
                return g(this.f40862e);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.f40862e.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f40862e.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", f(this.f40862e), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @n0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f40863f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f40862e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f40862e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @n0
    public DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f40864g = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@n0 Priority priority, @n0 d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long jB = com.bumptech.glide.util.i.b();
        try {
            aVar.e(j(this.f40859b.i(), 0, null, this.f40859b.e()));
            if (Log.isLoggable(f40854h, 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(com.bumptech.glide.util.i.a(jB));
                String string = sb2.toString();
            }
        } catch (IOException e10) {
            if (Log.isLoggable(f40854h, 3)) {
                Log.d(f40854h, "Failed to load data for url", e10);
            }
            aVar.f(e10);
            if (!Log.isLoggable(f40854h, 2)) {
            } else {
                sb2 = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable(f40854h, 2)) {
                Log.v(f40854h, "Finished http url fetcher fetch in " + com.bumptech.glide.util.i.a(jB));
            }
        }
    }
}
