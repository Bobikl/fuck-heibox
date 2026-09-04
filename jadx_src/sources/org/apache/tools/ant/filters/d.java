package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ClassConstants.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends a implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f133150f = "org.apache.tools.ant.filters.util.JavaClassHelper";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133151e;

    public d() {
        this.f133151e = null;
    }

    public d(Reader reader) {
        super(reader);
        this.f133151e = null;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        String str = this.f133151e;
        if (str != null && str.isEmpty()) {
            this.f133151e = null;
        }
        String str2 = this.f133151e;
        if (str2 != null) {
            char cCharAt = str2.charAt(0);
            String strSubstring = this.f133151e.substring(1);
            this.f133151e = strSubstring;
            if (!strSubstring.isEmpty()) {
                return cCharAt;
            }
            this.f133151e = null;
            return cCharAt;
        }
        String strC = c();
        if (strC != null && !strC.isEmpty()) {
            try {
                StringBuffer stringBuffer = (StringBuffer) Class.forName(f133150f).getMethod("getConstants", byte[].class).invoke(null, strC.getBytes(StandardCharsets.ISO_8859_1));
                if (stringBuffer.length() > 0) {
                    this.f133151e = stringBuffer.toString();
                    return read();
                }
            } catch (NoClassDefFoundError e10) {
                throw e10;
            } catch (RuntimeException e11) {
                throw e11;
            } catch (InvocationTargetException e12) {
                Throwable targetException = e12.getTargetException();
                if (targetException instanceof NoClassDefFoundError) {
                    throw ((NoClassDefFoundError) targetException);
                }
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
                throw new BuildException(targetException);
            } catch (Exception e13) {
                throw new BuildException(e13);
            }
        }
        return -1;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        return new d(reader);
    }
}
