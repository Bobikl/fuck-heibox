package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: BaseResourceCollectionWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Collection<org.apache.tools.ant.types.s1> f136414j = null;

    private synchronized Collection<org.apache.tools.ant.types.s1> m2() {
        if (this.f136414j == null || !j2()) {
            this.f136414j = n2();
        }
        return this.f136414j;
    }

    @Override // org.apache.tools.ant.types.resources.c
    protected Iterator<org.apache.tools.ant.types.s1> f2() {
        return m2().iterator();
    }

    @Override // org.apache.tools.ant.types.resources.c
    protected int i2() {
        return m2().size();
    }

    protected abstract Collection<org.apache.tools.ant.types.s1> n2();
}
