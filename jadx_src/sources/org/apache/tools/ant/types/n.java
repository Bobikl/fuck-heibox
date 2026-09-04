package org.apache.tools.ant.types;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CharSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f136228c = new ArrayList();

    static {
        for (Map.Entry<String, Charset> entry : Charset.availableCharsets().entrySet()) {
            List<String> list = f136228c;
            list.add(entry.getKey());
            list.addAll(entry.getValue().aliases());
        }
    }

    public n() {
    }

    public n(String str) {
        g(str);
    }

    public static n i() {
        return new n(StandardCharsets.US_ASCII.name());
    }

    public static n k() {
        return new n(Charset.defaultCharset().name());
    }

    public static n l() {
        return new n(StandardCharsets.UTF_8.name());
    }

    @Override // org.apache.tools.ant.types.w
    public String[] e() {
        return (String[]) f136228c.toArray(new String[0]);
    }

    @Override // org.apache.tools.ant.types.w
    public final void g(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : Arrays.asList(str, str.toLowerCase(), str.toUpperCase())) {
                if (f136228c.contains(str2)) {
                    str = str2;
                    break;
                }
            }
        } else {
            str = Charset.defaultCharset().name();
        }
        super.g(str);
    }

    public boolean h(n nVar) {
        return j().name().equals(nVar.j().name());
    }

    public Charset j() {
        return Charset.forName(d());
    }
}
