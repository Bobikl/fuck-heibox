package org.apache.tools.ant.listener;

import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.w1;

/* JADX INFO: compiled from: SimpleBigProjectLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends w1 {
    @Override // org.apache.tools.ant.w1
    protected String k(BuildEvent buildEvent) {
        String strK = super.k(buildEvent);
        String strB = b(buildEvent);
        if (strB == null || strK == null) {
            return strK;
        }
        return strB + lg.a.f131414g + strK;
    }
}
