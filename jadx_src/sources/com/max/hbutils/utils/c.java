package com.max.hbutils.utils;

import androidx.annotation.d1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: HBToastUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f73533a = new c();
    public static ChangeQuickRedirect changeQuickRedirect;

    private c() {
    }

    @xh.m
    public static final void d(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Ho, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        x.m(str);
    }

    @xh.m
    public static final void f(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Go, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        x.p(str);
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Io, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x.e();
    }

    @kotlin.k(message = "使用 fun showBottomHintToast(text: String?)，仅传入字符串，获取字符串在 String 工具类里处理")
    public final void b(@d1 int i10) {
        x.i(i10);
    }

    public final void c(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.Ko, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        x.j(str);
    }

    public final void e(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.k.Jo, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        x.n(str, str2);
    }
}
