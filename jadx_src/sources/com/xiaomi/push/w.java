package com.xiaomi.push;

import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<String, String> f108054a;

    static {
        HashMap<String, String> map = new HashMap<>();
        f108054a = map;
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", "gif");
        map.put("474946", "gif");
        map.put("424D", "bmp");
    }

    public static long a(File file) {
        long jA = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                jA += fileArrListFiles[i10].isDirectory() ? a(fileArrListFiles[i10]) : fileArrListFiles[i10].length();
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
        return jA;
    }
}
