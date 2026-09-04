package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.util.r0;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: ParserSupports.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends b2 implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f133860h = "Property and feature attributes are exclusive";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f133861i = "feature";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f133862j = "property";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f133863k = " not recognized: ";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f133864l = " not supported: ";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f133865m = "Neither feature or property are set";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f133866n = "A value is needed when testing for property support";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133869g;

    private XMLReader G1() {
        r0.f();
        return r0.i();
    }

    public boolean B1() {
        XMLReader xMLReaderG1 = G1();
        if (this.f133869g == null) {
            this.f133869g = "true";
        }
        try {
            xMLReaderG1.setFeature(this.f133867e, Project.t1(this.f133869g));
            return true;
        } catch (SAXNotRecognizedException unused) {
            x1("feature not recognized: " + this.f133867e, 3);
            return false;
        } catch (SAXNotSupportedException unused2) {
            x1("feature not supported: " + this.f133867e, 3);
            return false;
        }
    }

    public boolean D1() {
        try {
            G1().setProperty(this.f133868f, this.f133869g);
            return true;
        } catch (SAXNotRecognizedException unused) {
            x1("property not recognized: " + this.f133868f, 3);
            return false;
        } catch (SAXNotSupportedException unused2) {
            x1("property not supported: " + this.f133868f, 3);
            return false;
        }
    }

    public void H1(String str) {
        this.f133867e = str;
    }

    public void I1(String str) {
        this.f133868f = str;
    }

    public void K1(String str) {
        this.f133869g = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        String str = this.f133867e;
        if (str != null && this.f133868f != null) {
            throw new BuildException(f133860h);
        }
        if (str == null && this.f133868f == null) {
            throw new BuildException(f133865m);
        }
        if (str != null) {
            return B1();
        }
        if (this.f133869g != null) {
            return D1();
        }
        throw new BuildException(f133866n);
    }
}
