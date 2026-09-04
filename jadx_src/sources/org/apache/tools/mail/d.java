package org.apache.tools.mail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: SmtpResponseReader.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BufferedReader f137266a;

    public d(InputStream inputStream) {
        this.f137266a = null;
        this.f137266a = new BufferedReader(new InputStreamReader(inputStream));
    }

    private static void a(StringBuilder sb2, String str) {
        if (str.length() > 4) {
            sb2.append(str.substring(4));
            sb2.append(' ');
        }
    }

    public void b() throws IOException {
        this.f137266a.close();
    }

    public String c() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        String line = this.f137266a.readLine();
        if (line != null && line.length() >= 3) {
            sb2.append((CharSequence) line, 0, 3);
            sb2.append(" ");
        }
        while (line != null) {
            a(sb2, line);
            if (!d(line)) {
                break;
            }
            line = this.f137266a.readLine();
        }
        return sb2.toString().trim();
    }

    protected boolean d(String str) {
        return str.length() > 3 && str.charAt(3) == '-';
    }
}
