package anet.channel.util;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class HttpUrl {
    private String host;
    private volatile boolean isSchemeLocked;
    private String path;
    private int port;
    private String scheme;
    private String simpleUrl;
    private String url;

    private HttpUrl() {
        this.isSchemeLocked = false;
    }

    public HttpUrl(HttpUrl httpUrl) {
        this.isSchemeLocked = false;
        this.scheme = httpUrl.scheme;
        this.host = httpUrl.host;
        this.path = httpUrl.path;
        this.url = httpUrl.url;
        this.simpleUrl = httpUrl.simpleUrl;
        this.isSchemeLocked = httpUrl.isSchemeLocked;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        if (r2 <= 65535) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static anet.channel.util.HttpUrl parse(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.HttpUrl.parse(java.lang.String):anet.channel.util.HttpUrl");
    }

    public boolean containsNonDefaultPort() {
        return this.port != 0 && (("http".equals(this.scheme) && this.port != 80) || ("https".equals(this.scheme) && this.port != 443));
    }

    public void downgradeSchemeAndLock() {
        this.isSchemeLocked = true;
        if ("http".equals(this.scheme)) {
            return;
        }
        this.scheme = "http";
        String str = this.url;
        this.url = StringUtils.concatString("http", ":", str.substring(str.indexOf("//")));
    }

    public int getPort() {
        return this.port;
    }

    public String host() {
        return this.host;
    }

    public boolean isSchemeLocked() {
        return this.isSchemeLocked;
    }

    public void lockScheme() {
        this.isSchemeLocked = true;
    }

    public String path() {
        return this.path;
    }

    public void replaceIpAndPort(String str, int i10) {
        if (str != null) {
            int iIndexOf = this.url.indexOf("//") + 2;
            while (iIndexOf < this.url.length() && this.url.charAt(iIndexOf) != '/') {
                iIndexOf++;
            }
            boolean zB = anet.channel.strategy.utils.c.b(str);
            StringBuilder sb2 = new StringBuilder(this.url.length() + str.length());
            sb2.append(this.scheme);
            sb2.append(HttpConstant.SCHEME_SPLIT);
            if (zB) {
                sb2.append('[');
            }
            sb2.append(str);
            if (zB) {
                sb2.append(']');
            }
            if (i10 != 0) {
                sb2.append(':');
                sb2.append(i10);
            } else if (this.port != 0) {
                sb2.append(':');
                sb2.append(this.port);
            }
            sb2.append(this.url.substring(iIndexOf));
            this.url = sb2.toString();
        }
    }

    public String scheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        if (this.isSchemeLocked || str.equalsIgnoreCase(this.scheme)) {
            return;
        }
        this.scheme = str;
        String str2 = this.url;
        String strConcatString = StringUtils.concatString(str, ":", str2.substring(str2.indexOf("//")));
        this.url = strConcatString;
        this.simpleUrl = StringUtils.concatString(str, ":", this.simpleUrl.substring(strConcatString.indexOf("//")));
    }

    public String simpleUrlString() {
        return this.simpleUrl;
    }

    public String toString() {
        return this.url;
    }

    public URL toURL() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public String urlString() {
        return this.url;
    }
}
