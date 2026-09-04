package com.tencent.thumbplayer.tcmedia.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tools.ant.taskdefs.v7;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f103187a;

    static {
        HashMap map = new HashMap();
        f103187a = map;
        map.put("http://", 0);
        f103187a.put("https://", 1);
        f103187a.put("rtmp://", 2);
        f103187a.put("webrtc://", 3);
        f103187a.put(v7.f135919a, 4);
        f103187a.put("/", 4);
    }

    public static int a(String str) {
        if (str == null) {
            return -1;
        }
        String lowerCase = str.toLowerCase();
        for (Map.Entry<String, Integer> entry : f103187a.entrySet()) {
            if (lowerCase.startsWith(entry.getKey())) {
                return entry.getValue().intValue();
            }
        }
        try {
            return new File(str).exists() ? 4 : -1;
        } catch (Exception unused) {
        }
    }
}
