package org.apache.tools.ant.types.resources;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: JavaConstantResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class k0 extends a {
    @Override // org.apache.tools.ant.types.resources.a
    protected InputStream B2(ClassLoader classLoader) throws IOException {
        String strK2 = k2();
        if (strK2 == null) {
            throw new IOException("Attribute 'name' must be set.");
        }
        int iLastIndexOf = strK2.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            throw new IOException("No class name in " + strK2);
        }
        String strSubstring = strK2.substring(0, iLastIndexOf);
        String strSubstring2 = strK2.substring(iLastIndexOf + 1);
        try {
            return new ByteArrayInputStream((classLoader != null ? Class.forName(strSubstring, true, classLoader) : Class.forName(strSubstring)).getField(strSubstring2).get(null).toString().getBytes(StandardCharsets.UTF_8));
        } catch (ClassNotFoundException unused) {
            throw new IOException("Class not found:" + strSubstring);
        } catch (IllegalAccessException unused2) {
            throw new IOException("Illegal access to :" + strSubstring2 + " in " + strSubstring);
        } catch (NoSuchFieldException unused3) {
            throw new IOException("Field not found:" + strSubstring2 + " in " + strSubstring);
        } catch (NullPointerException unused4) {
            throw new IOException("Not a static field: " + strSubstring2 + " in " + strSubstring);
        }
    }
}
