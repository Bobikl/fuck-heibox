package org.apache.tools.ant.util.regexp;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Jdk14RegexpMatcher.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f136902g;

    @Override // org.apache.tools.ant.util.regexp.e
    public Vector<String> b(String str) throws BuildException {
        return f(str, 0);
    }

    @Override // org.apache.tools.ant.util.regexp.e
    public String c() {
        return this.f136902g;
    }

    @Override // org.apache.tools.ant.util.regexp.e
    public boolean d(String str) throws BuildException {
        return e(str, 0);
    }

    @Override // org.apache.tools.ant.util.regexp.e
    public boolean e(String str, int i10) throws BuildException {
        try {
            return h(i10).matcher(str).find();
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    @Override // org.apache.tools.ant.util.regexp.e
    public Vector<String> f(String str, int i10) throws BuildException {
        Matcher matcher = h(i10).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        Vector<String> vector = new Vector<>();
        int iGroupCount = matcher.groupCount();
        for (int i11 = 0; i11 <= iGroupCount; i11++) {
            String strGroup = matcher.group(i11);
            if (strGroup == null) {
                strGroup = "";
            }
            vector.add(strGroup);
        }
        return vector;
    }

    @Override // org.apache.tools.ant.util.regexp.e
    public void g(String str) {
        this.f136902g = str;
    }

    protected Pattern h(int i10) throws BuildException {
        try {
            return Pattern.compile(this.f136902g, i(i10));
        } catch (PatternSyntaxException e10) {
            throw new BuildException(e10);
        }
    }

    protected int i(int i10) {
        int i11 = g.d(i10, 256) ? 3 : 1;
        if (g.d(i10, 4096)) {
            i11 |= 8;
        }
        return g.d(i10, 65536) ? i11 | 32 : i11;
    }
}
