package com.taobao.downloader.download.protocol.huc;

import android.text.TextUtils;
import com.taobao.downloader.Configuration;
import com.taobao.downloader.download.protocol.DLConfig;
import com.taobao.downloader.download.protocol.DLConnection;
import com.taobao.downloader.download.protocol.DLInputStream;
import com.taobao.downloader.util.Dlog;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class HUCConnection implements DLConnection {
    private static final String TAG = "hucCon";
    protected HttpURLConnection httpURLConnection;

    private String replaceUrlByIp(String str, int i10) {
        String str2;
        if (Configuration.dnsService == null) {
            return str;
        }
        try {
            URL url = new URL(str);
            String host = url.getHost();
            int port = url.getPort();
            if (port == -1) {
                str2 = host;
            } else {
                str2 = host + ":" + port;
            }
            List<String> ipPorts = Configuration.dnsService.getIpPorts(host);
            if (ipPorts.isEmpty()) {
                return str;
            }
            String str3 = ipPorts.get(i10 % ipPorts.size());
            if (!TextUtils.isEmpty(str3)) {
                return str.replaceFirst(str2, str3);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return str;
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public void addRequestProperty(String str, String str2) {
        this.httpURLConnection.addRequestProperty(str, str2);
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public void connect() throws IOException {
        this.httpURLConnection.connect();
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public void disConnect() {
        this.httpURLConnection.disconnect();
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public long getDownloadLength() {
        String headerField = this.httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField) || !TextUtils.isDigitsOnly(headerField)) {
            return 0L;
        }
        return Long.valueOf(headerField).longValue();
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public String getErrorMsg() {
        if (this.httpURLConnection == null) {
            return "HttpResponse is empty!";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.httpURLConnection.getResponseCode());
            sb2.append("\n");
            sb2.append(this.httpURLConnection.getResponseMessage());
            sb2.append("\n");
            Map<String, List<String>> headerFields = this.httpURLConnection.getHeaderFields();
            for (String str : headerFields.keySet()) {
                sb2.append((Object) str);
                sb2.append(":");
                sb2.append(headerFields.get(str));
                sb2.append("\n");
            }
            return sb2.toString();
        } catch (Throwable th2) {
            Dlog.e(TAG, "getErrorMsg", th2, new Object[0]);
            return "";
        }
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public String getHeaderField(String str) {
        return this.httpURLConnection.getHeaderField(str);
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public DLInputStream getInputStream() throws IOException {
        return new HUCInputStream(this.httpURLConnection.getInputStream());
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public int getStatusCode() throws Exception {
        return this.httpURLConnection.getResponseCode();
    }

    @Override // com.taobao.downloader.download.protocol.DLConnection
    public void openConnection(URL url, DLConfig dLConfig) throws IOException {
        if (url.getProtocol().equals("http") && !dLConfig.isLastConnect()) {
            url = new URL(replaceUrlByIp(url.toString(), dLConfig.getConnectFailTime()));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        this.httpURLConnection = httpURLConnection;
        httpURLConnection.setConnectTimeout(dLConfig.getConnectTimeout());
        this.httpURLConnection.setReadTimeout(dLConfig.getReadTimeout());
        this.httpURLConnection.setInstanceFollowRedirects(DLConfig.REDIRECTABLE);
    }
}
