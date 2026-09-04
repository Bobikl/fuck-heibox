package org.apache.tools.ant.taskdefs.cvslib;

/* JADX INFO: compiled from: CvsTagEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f134013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f134014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f134015c;

    public h(String str) {
        this(str, null, null);
    }

    public h(String str, String str2) {
        this(str, str2, null);
    }

    public h(String str, String str2, String str3) {
        this.f134013a = str;
        this.f134015c = str2;
        this.f134014b = str3;
    }

    public String a() {
        return this.f134013a;
    }

    public String b() {
        return this.f134014b;
    }

    public String c() {
        return this.f134015c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f134013a);
        if (this.f134015c == null) {
            sb2.append(" was removed");
            if (this.f134014b != null) {
                sb2.append("; previous revision was ");
                sb2.append(this.f134014b);
            }
        } else if (this.f134014b == null) {
            sb2.append(" is new; current revision is ");
            sb2.append(this.f134015c);
        } else {
            sb2.append(" has changed from ");
            sb2.append(this.f134014b);
            sb2.append(" to ");
            sb2.append(this.f134015c);
        }
        return sb2.toString();
    }
}
