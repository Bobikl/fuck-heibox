package org.apache.tools.ant.util;

import java.io.File;

/* JADX INFO: compiled from: FlatFileNameMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class o0 implements g0 {
    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{new File(str).getName()};
    }
}
