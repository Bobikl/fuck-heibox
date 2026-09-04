package com.airbnb.lottie.network;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: DefaultLottieFetchResult.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final HttpURLConnection f37646b;

    public a(@n0 HttpURLConnection httpURLConnection) {
        this.f37646b = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            throw th2;
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // com.airbnb.lottie.network.c
    @n0
    public InputStream V0() throws IOException {
        return this.f37646b.getInputStream();
    }

    @Override // com.airbnb.lottie.network.c
    public boolean c1() {
        try {
            return this.f37646b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37646b.disconnect();
    }

    @Override // com.airbnb.lottie.network.c
    @p0
    public String h() {
        try {
            if (c1()) {
                return null;
            }
            return "Unable to fetch " + this.f37646b.getURL() + ". Failed with " + this.f37646b.getResponseCode() + "\n" + a(this.f37646b);
        } catch (IOException e10) {
            com.airbnb.lottie.utils.f.f("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.c
    @p0
    public String j() {
        return this.f37646b.getContentType();
    }
}
