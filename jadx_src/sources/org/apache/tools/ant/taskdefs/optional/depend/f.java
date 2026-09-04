package org.apache.tools.ant.taskdefs.optional.depend;

import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: compiled from: ClassFileUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {
    public static String a(String str) {
        return str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX);
    }

    public static String b(String str) {
        return str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, lg.a.f131414g).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g);
    }
}
