package com.ss.android.ttvecamera.hardware;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TECameraMTKProxy.java */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public class e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f97549g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List<String> f97548f = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f97547e = (String) com.ss.android.ttvecamera.framework.d.c("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"});

    static {
        Collections.addAll(f97548f, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public e(Context context) {
        super(context);
    }

    public static boolean C() {
        return !TextUtils.isEmpty(f97547e);
    }

    public static boolean D() {
        if (!f97549g) {
            f97549g = Collections.unmodifiableList(f97548f).indexOf(f97547e) < 0;
        }
        return f97549g;
    }
}
