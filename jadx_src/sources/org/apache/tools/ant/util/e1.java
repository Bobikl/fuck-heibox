package org.apache.tools.ant.util;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;

/* JADX INFO: compiled from: PackageNameMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class e1 extends p0 {
    @Override // org.apache.tools.ant.util.p0
    protected String a(String str) {
        String strSubstring = str.substring(this.f136880d, str.length() - this.f136881e);
        if (b()) {
            strSubstring = strSubstring.replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g).replace(IOUtils.DIR_SEPARATOR_WINDOWS, lg.a.f131414g);
        }
        return strSubstring.replace(File.separatorChar, lg.a.f131414g);
    }
}
