package com.airbnb.lottie.network;

import androidx.annotation.n0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: DefaultLottieNetworkFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements e {
    @Override // com.airbnb.lottie.network.e
    @n0
    public c a(@n0 String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
