package org.apache.tools.ant.taskdefs.condition;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;

/* JADX INFO: compiled from: Http.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends b2 implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f133909j = 400;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f133910k = "GET";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133911e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133912f = "GET";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133913g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f133914h = 400;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f133915i = 0;

    public void B1(int i10) {
        this.f133914h = i10;
    }

    public void D1(boolean z10) {
        this.f133913g = z10;
    }

    public void G1(int i10) {
        if (i10 >= 0) {
            this.f133915i = i10;
        }
    }

    public void H1(String str) {
        this.f133912f = str == null ? "GET" : str.toUpperCase(Locale.ENGLISH);
    }

    public void I1(String str) {
        this.f133911e = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if (this.f133911e == null) {
            throw new BuildException("No url specified in http condition");
        }
        x1("Checking for " + this.f133911e, 3);
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.f133911e).openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    return true;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod(this.f133912f);
                httpURLConnection.setInstanceFollowRedirects(this.f133913g);
                httpURLConnection.setReadTimeout(this.f133915i);
                int responseCode = httpURLConnection.getResponseCode();
                x1("Result code for " + this.f133911e + " was " + responseCode, 3);
                return responseCode > 0 && responseCode < this.f133914h;
            } catch (ProtocolException e10) {
                throw new BuildException("Invalid HTTP protocol: " + this.f133912f, e10);
            } catch (IOException unused) {
                return false;
            }
        } catch (MalformedURLException e11) {
            throw new BuildException("Badly formed URL: " + this.f133911e, e11);
        }
    }
}
