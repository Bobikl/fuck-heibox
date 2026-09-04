package org.apache.tools.ant;

/* JADX INFO: compiled from: NoBannerLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class w1 extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f137103i;

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public synchronized void B0(BuildEvent buildEvent) {
        this.f137103i = null;
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
        if (buildEvent.c() > this.f137114d || buildEvent.b() == null || buildEvent.b().trim().isEmpty()) {
            return;
        }
        synchronized (this) {
            String str = this.f137103i;
            if (str != null) {
                this.f137112b.println(String.format("%n%s:", str));
                this.f137103i = null;
            }
        }
        super.V(buildEvent);
    }

    protected String k(BuildEvent buildEvent) {
        return buildEvent.e().k();
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public synchronized void r1(BuildEvent buildEvent) {
        this.f137103i = k(buildEvent);
    }
}
