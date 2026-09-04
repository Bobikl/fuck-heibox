package org.apache.tools.ant.taskdefs;

import com.huawei.hms.framework.common.ContainerUtils;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.RuntimeConfigurable;

/* JADX INFO: compiled from: AugmentReference.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends org.apache.tools.ant.u2 implements org.apache.tools.ant.y2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135574k;

    private synchronized void i2() {
        if (this.f135574k == null) {
            RuntimeConfigurable runtimeConfigurableN1 = N1();
            String strK = runtimeConfigurableN1.k();
            this.f135574k = strK;
            if (strK == null) {
                throw new BuildException(K1() + " attribute 'id' unset");
            }
            runtimeConfigurableN1.v("id", null);
            runtimeConfigurableN1.t("id");
            runtimeConfigurableN1.y("augmented reference \"" + this.f135574k + "\"");
        }
    }

    private synchronized void j2() {
        if (this.f135574k != null) {
            x1("restoring augment wrapper " + this.f135574k, 4);
            RuntimeConfigurable runtimeConfigurableN1 = N1();
            runtimeConfigurableN1.v("id", this.f135574k);
            runtimeConfigurableN1.y(K1());
            this.f135574k = null;
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        j2();
    }

    @Override // org.apache.tools.ant.y2
    public synchronized Object R() {
        Object objW0;
        if (b() == null) {
            throw new IllegalStateException(K1() + "Project owner unset");
        }
        i2();
        if (!b().D0(this.f135574k)) {
            throw new BuildException("Unknown reference \"" + this.f135574k + "\"");
        }
        objW0 = b().w0(this.f135574k);
        x1("project reference " + this.f135574k + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(objW0), 4);
        return objW0;
    }

    @Override // org.apache.tools.ant.y2
    public void s(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.tools.ant.y2
    public void x(Class<?> cls) {
    }
}
