package com.ss.android.ttvecamera;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TECamera1MTKUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f97403c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<String> f97402b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97401a = (String) com.ss.android.ttvecamera.framework.d.c("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"});

    static {
        Collections.addAll(f97402b, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public static boolean a() {
        return !TextUtils.isEmpty(f97401a);
    }

    public static boolean b() {
        if (!f97403c) {
            f97403c = Collections.unmodifiableList(f97402b).indexOf(f97401a) < 0;
        }
        return f97403c;
    }
}
