package com.apm.lite.j;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f40033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f40036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f40037f;

    public i(String str, String str2, Map<String, String> map, boolean z10) throws ProtocolException {
        this.f40034c = str2;
        this.f40035d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f40032a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f40033b = httpURLConnection;
        com.apm.lite.h.a.a(httpURLConnection);
        this.f40033b.setUseCaches(false);
        this.f40033b.setDoOutput(true);
        this.f40033b.setDoInput(true);
        this.f40033b.setRequestMethod("POST");
        this.f40033b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f40033b.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (!z10) {
            this.f40036e = new f(this.f40033b.getOutputStream());
        } else {
            this.f40033b.setRequestProperty("Content-Encoding", "gzip");
            this.f40037f = new l(this.f40033b.getOutputStream());
        }
    }

    public i(String str, String str2, boolean z10) {
        this(str, str2, null, z10);
    }

    public String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f40032a + "--\r\n").getBytes();
        if (this.f40035d) {
            this.f40037f.write(bytes);
            this.f40037f.b();
            this.f40037f.a();
        } else {
            this.f40036e.write(bytes);
            this.f40036e.flush();
            this.f40036e.a();
        }
        int responseCode = this.f40033b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Server returned non-OK status: " + responseCode);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f40033b.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        bufferedReader.close();
        this.f40033b.disconnect();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        return sb2.toString();
    }

    public void b(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f40032a);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\n");
        sb2.append("Content-Transfer-Encoding: binary");
        sb2.append("\r\n");
        sb2.append("\r\n");
        if (this.f40035d) {
            this.f40037f.write(sb2.toString().getBytes());
        } else {
            this.f40036e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else {
                (this.f40035d ? this.f40037f : this.f40036e).write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f40035d) {
            this.f40037f.write("\r\n".getBytes());
        } else {
            this.f40036e.write("\r\n".getBytes());
            this.f40036e.flush();
        }
    }

    public void c(String str, String str2) {
        d(str, str2, false);
    }

    public void d(String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f40032a);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"");
        sb2.append("\r\n");
        sb2.append("Content-Type: text/plain; charset=");
        sb2.append(this.f40034c);
        sb2.append("\r\n");
        sb2.append("\r\n");
        try {
            if (this.f40035d) {
                this.f40037f.write(sb2.toString().getBytes());
            } else {
                this.f40036e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z10) {
            bytes = com.apm.lite.k.g.a(bytes);
        }
        try {
            if (this.f40035d) {
                this.f40037f.write(bytes);
                this.f40037f.write("\r\n".getBytes());
            } else {
                this.f40036e.write(bytes);
                this.f40036e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public void e(String str, Map<String, String> map, File... fileArr) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f40032a);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("; ");
                sb2.append(entry.getKey());
                sb2.append("=\"");
                sb2.append(entry.getValue());
                sb2.append("\"");
            }
        }
        sb2.append("\r\n");
        sb2.append("Content-Transfer-Encoding: binary");
        sb2.append("\r\n");
        sb2.append("\r\n");
        if (this.f40035d) {
            this.f40037f.write(sb2.toString().getBytes());
        } else {
            this.f40036e.write(sb2.toString().getBytes());
        }
        com.apm.lite.k.i.n(this.f40035d ? this.f40037f : this.f40036e, fileArr);
        if (this.f40035d) {
            this.f40037f.write("\r\n".getBytes());
        } else {
            this.f40036e.write("\r\n".getBytes());
            this.f40036e.flush();
        }
    }

    public void f(String str, File... fileArr) {
        e(str, null, fileArr);
    }
}
