package com.max.hbstory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IStoryService.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private String f72962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Map<String, String> f72963b;

    public e(@dl.e String str, @dl.d Map<String, String> params) {
        f0.p(params, "params");
        this.f72962a = str;
        this.f72963b = params;
    }

    @dl.e
    public final String a() {
        return this.f72962a;
    }

    @dl.d
    public final Map<String, String> b() {
        return this.f72963b;
    }

    public final void c(@dl.e String str) {
        this.f72962a = str;
    }

    public final void d(@dl.d Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, bb.c.k.f33548fb, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.f72963b = map;
    }
}
