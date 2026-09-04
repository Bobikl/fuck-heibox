package com.max.accelworld;

import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldReporter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d String path, @dl.d JsonObject addition, @dl.e ArrayList<ArrayList<PathSrcNode>> arrayList) {
        if (PatchProxy.proxy(new Object[]{path, addition, arrayList}, null, changeQuickRedirect, true, bb.c.b.Hf, new Class[]{String.class, JsonObject.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        f0.p(addition, "addition");
        com.max.hbcommon.analytics.d.e("4", path, null, null, addition, arrayList, false);
    }

    public static final void b(@dl.d String path, @dl.d JsonObject addition, @dl.e ArrayList<ArrayList<PathSrcNode>> arrayList) {
        if (PatchProxy.proxy(new Object[]{path, addition, arrayList}, null, changeQuickRedirect, true, bb.c.b.If, new Class[]{String.class, JsonObject.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        f0.p(addition, "addition");
        com.max.hbcommon.analytics.d.e("4", path, null, null, addition, arrayList, true);
    }

    public static final void c(@dl.d String path, @dl.d JsonObject addition, @dl.e ArrayList<ArrayList<PathSrcNode>> arrayList) {
        if (PatchProxy.proxy(new Object[]{path, addition, arrayList}, null, changeQuickRedirect, true, bb.c.b.Df, new Class[]{String.class, JsonObject.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        f0.p(addition, "addition");
        com.max.hbcommon.analytics.d.e("3", path, null, null, addition, arrayList, true);
    }

    public static final void d(@dl.d String path, @dl.d JsonObject addition, @dl.e ArrayList<ArrayList<PathSrcNode>> arrayList) {
        if (PatchProxy.proxy(new Object[]{path, addition, arrayList}, null, changeQuickRedirect, true, bb.c.b.Ef, new Class[]{String.class, JsonObject.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        f0.p(addition, "addition");
        com.max.hbcommon.analytics.d.e("3", path, null, null, addition, arrayList, false);
    }

    public static final void e(@dl.d String path, @dl.d JsonObject addition, @dl.d String duration, @dl.d String durationInMs, @dl.e ArrayList<ArrayList<PathSrcNode>> arrayList) {
        if (PatchProxy.proxy(new Object[]{path, addition, duration, durationInMs, arrayList}, null, changeQuickRedirect, true, bb.c.b.Ff, new Class[]{String.class, JsonObject.class, String.class, String.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        f0.p(addition, "addition");
        f0.p(duration, "duration");
        f0.p(durationInMs, "durationInMs");
        com.max.hbcommon.analytics.d.e("3", path, duration, durationInMs, addition, arrayList, true);
    }

    public static final void f(@dl.d String path, @dl.d JsonObject addition, @dl.d String duration, @dl.d String durationInMs, @dl.e ArrayList<ArrayList<PathSrcNode>> arrayList) {
        if (PatchProxy.proxy(new Object[]{path, addition, duration, durationInMs, arrayList}, null, changeQuickRedirect, true, bb.c.b.Gf, new Class[]{String.class, JsonObject.class, String.class, String.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        f0.p(addition, "addition");
        f0.p(duration, "duration");
        f0.p(durationInMs, "durationInMs");
        com.max.hbcommon.analytics.d.e("3", path, duration, durationInMs, addition, arrayList, false);
    }
}
