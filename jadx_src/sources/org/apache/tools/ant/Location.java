package org.apache.tools.ant;

import java.io.Serializable;
import java.util.Objects;
import org.xml.sax.Locator;

/* JADX INFO: loaded from: classes5.dex */
public class Location implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Location f133036e = new Location();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f133037f = org.apache.tools.ant.util.j0.O();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f133038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f133039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f133040d;

    private Location() {
        this(null, 0, 0);
    }

    public Location(String str) {
        this(str, 0, 0);
    }

    public Location(String str, int i10, int i11) {
        if (str == null || !str.startsWith("file:")) {
            this.f133038b = str;
        } else {
            this.f133038b = f133037f.K(str);
        }
        this.f133039c = i10;
        this.f133040d = i11;
    }

    public Location(Locator locator) {
        this(locator.getSystemId(), locator.getLineNumber(), locator.getColumnNumber());
    }

    public int a() {
        return this.f133040d;
    }

    public String b() {
        return this.f133038b;
    }

    public int c() {
        return this.f133039c;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && obj.getClass() == getClass() && toString().equals(obj.toString()));
    }

    public int hashCode() {
        return Objects.hash(this.f133038b, Integer.valueOf(this.f133039c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f133038b;
        if (str != null) {
            sb2.append(str);
            if (this.f133039c != 0) {
                sb2.append(":");
                sb2.append(this.f133039c);
            }
            sb2.append(": ");
        }
        return sb2.toString();
    }
}
