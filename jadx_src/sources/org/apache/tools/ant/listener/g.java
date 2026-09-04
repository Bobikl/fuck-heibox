package org.apache.tools.ant.listener;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.y;

/* JADX INFO: compiled from: ProfileLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<Object, Date> f133555i = new ConcurrentHashMap();

    private void k(BuildEvent buildEvent, Date date, String str) {
        Date date2 = new Date();
        String str2 = date != null ? String.format("%n%s: finished %s (%d)", str, date2, Long.valueOf(date2.getTime() - date.getTime())) : String.format("%n%s: finished %s (unknown duration, start not detected)", str, date2);
        i(str2, this.f137112b, buildEvent.c());
        h(str2);
    }

    private void l(BuildEvent buildEvent, Date date, String str) {
        String str2 = String.format("%n%s: started %s", str, date);
        i(str2, this.f137112b, buildEvent.c());
        h(str2);
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
        k(buildEvent, this.f133555i.remove(buildEvent.e()), "Target " + buildEvent.e().k());
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
        String strK1 = buildEvent.f().K1();
        Date date = new Date();
        l(buildEvent, date, strK1);
        this.f133555i.put(buildEvent.f(), date);
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
        Date date = new Date();
        l(buildEvent, date, "Target " + buildEvent.e().k());
        this.f133555i.put(buildEvent.e(), date);
    }

    @Override // org.apache.tools.ant.y, org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
        k(buildEvent, this.f133555i.remove(buildEvent.f()), buildEvent.f().K1());
    }
}
