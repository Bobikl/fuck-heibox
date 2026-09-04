package org.apache.tools.ant.types.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ContentTransformingResource.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u extends y0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f136464q = 8192;

    protected u() {
    }

    protected u(org.apache.tools.ant.types.u1 u1Var) {
        super(u1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ OutputStream A2(f fVar) throws IOException {
        OutputStream outputStreamJ = fVar.j();
        if (outputStreamJ == null) {
            return null;
        }
        return C2(outputStreamJ);
    }

    protected abstract InputStream B2(InputStream inputStream) throws IOException;

    protected abstract OutputStream C2(OutputStream outputStream) throws IOException;

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public <T> T e2(Class<T> cls) {
        final f fVar;
        if (!f.class.isAssignableFrom(cls)) {
            if (y.class.isAssignableFrom(cls)) {
                return null;
            }
            return (T) x2().e2(cls);
        }
        if (!z2() || (fVar = (f) x2().e2(f.class)) == null) {
            return null;
        }
        return cls.cast(new f() { // from class: org.apache.tools.ant.types.resources.t
            @Override // org.apache.tools.ant.types.resources.f
            public final OutputStream j() {
                return this.f136461b.A2(fVar);
            }
        });
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        InputStream inputStreamH2 = x2().h2();
        return inputStreamH2 != null ? B2(inputStreamH2) : inputStreamH2;
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        OutputStream outputStreamL2 = x2().l2();
        return outputStreamL2 != null ? C2(outputStreamL2) : outputStreamL2;
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public long n2() {
        if (!p2()) {
            return 0L;
        }
        try {
            InputStream inputStreamH2 = h2();
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = inputStreamH2.read(bArr, 0, 8192);
                    if (i11 <= 0) {
                        long j10 = i10;
                        inputStreamH2.close();
                        return j10;
                    }
                    i10 += i11;
                }
            } catch (Throwable th2) {
                if (inputStreamH2 != null) {
                    try {
                        inputStreamH2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("caught exception while reading " + k2(), e10);
        }
    }

    protected boolean z2() {
        return false;
    }
}
