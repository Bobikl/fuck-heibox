package org.apache.tools.ant.util;

import java.io.File;

/* JADX INFO: compiled from: UnPackageNameMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class r2 extends p0 {
    @Override // org.apache.tools.ant.util.p0
    protected String a(String str) {
        return str.substring(this.f136880d, str.length() - this.f136881e).replace(lg.a.f131414g, File.separatorChar);
    }
}
