package org.apache.tools.ant.types.resources.selectors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.a2;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: Date.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f136427g = "Either the millis or the datetime attribute must be set.";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j0 f136428h = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f136429b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136430c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f136431d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a2 f136432e = a2.f136103g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f136433f = f136428h.M();

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public synchronized boolean a(s1 s1Var) {
        if (this.f136430c == null && this.f136429b == null) {
            throw new BuildException(f136427g);
        }
        if (this.f136429b == null) {
            String str = this.f136431d;
            String str2 = str == null ? "MM/dd/yyyy hh:mm a" : str;
            try {
                long time = (str == null ? new SimpleDateFormat(str2, Locale.US) : new SimpleDateFormat(str2)).parse(this.f136430c).getTime();
                if (time < 0) {
                    throw new BuildException("Date of %s results in negative milliseconds value relative to epoch (January 1, 1970, 00:00:00 GMT).", this.f136430c);
                }
                i(time);
            } catch (ParseException unused) {
                throw new BuildException("Date of %s Cannot be parsed correctly. It should be in '%s' format.", this.f136430c, str2);
            }
        }
        return this.f136432e.k(s1Var.i2(), this.f136429b.longValue(), this.f136433f);
    }

    public synchronized String b() {
        return this.f136430c;
    }

    public synchronized long c() {
        return this.f136433f;
    }

    public synchronized long d() {
        Long l10;
        l10 = this.f136429b;
        return l10 == null ? -1L : l10.longValue();
    }

    public synchronized String e() {
        return this.f136431d;
    }

    public synchronized a2 f() {
        return this.f136432e;
    }

    public synchronized void g(String str) {
        this.f136430c = str;
        this.f136429b = null;
    }

    public synchronized void h(long j10) {
        this.f136433f = j10;
    }

    public synchronized void i(long j10) {
        this.f136429b = Long.valueOf(j10);
    }

    public synchronized void j(String str) {
        this.f136431d = str;
    }

    public synchronized void k(a2 a2Var) {
        this.f136432e = a2Var;
    }
}
