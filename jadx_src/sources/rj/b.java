package rj;

import java.io.StringReader;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.UnsupportedAttributeException;
import org.apache.tools.ant.filters.util.i;
import org.apache.tools.ant.types.c0;
import org.apache.tools.ant.util.g0;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: FilterMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends c0 implements g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f139138h = 8192;

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
        throw new UnsupportedAttributeException("filtermapper doesn't support the \"from\" attribute.", "from");
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
        throw new UnsupportedAttributeException("filtermapper doesn't support the \"to\" attribute.", "to");
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        if (str == null) {
            return null;
        }
        try {
            StringReader stringReader = new StringReader(str);
            i iVar = new i();
            iVar.k(8192);
            iVar.m(stringReader);
            iVar.n(b());
            Vector<c0> vector = new Vector<>();
            vector.add(this);
            iVar.l(vector);
            String strO0 = j0.o0(iVar.f());
            if (strO0.isEmpty()) {
                return null;
            }
            return new String[]{strO0};
        } catch (BuildException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new BuildException(e11);
        }
    }
}
