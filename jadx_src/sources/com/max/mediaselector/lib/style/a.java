package com.max.mediaselector.lib.style;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PictureSelectorStyle.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlbumWindowStyle f75467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TitleBarStyle f75468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SelectMainStyle f75469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BottomNavBarStyle f75470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PictureWindowAnimationStyle f75471e;

    public AlbumWindowStyle a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34787i5, new Class[0], AlbumWindowStyle.class);
        if (patchProxyResultProxy.isSupported) {
            return (AlbumWindowStyle) patchProxyResultProxy.result;
        }
        AlbumWindowStyle albumWindowStyle = this.f75467a;
        return albumWindowStyle == null ? new AlbumWindowStyle() : albumWindowStyle;
    }

    public BottomNavBarStyle b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34741g5, new Class[0], BottomNavBarStyle.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomNavBarStyle) patchProxyResultProxy.result;
        }
        BottomNavBarStyle bottomNavBarStyle = this.f75470d;
        return bottomNavBarStyle == null ? new BottomNavBarStyle() : bottomNavBarStyle;
    }

    public SelectMainStyle c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34718f5, new Class[0], SelectMainStyle.class);
        if (patchProxyResultProxy.isSupported) {
            return (SelectMainStyle) patchProxyResultProxy.result;
        }
        SelectMainStyle selectMainStyle = this.f75469c;
        return selectMainStyle == null ? new SelectMainStyle() : selectMainStyle;
    }

    public TitleBarStyle d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34695e5, new Class[0], TitleBarStyle.class);
        if (patchProxyResultProxy.isSupported) {
            return (TitleBarStyle) patchProxyResultProxy.result;
        }
        TitleBarStyle titleBarStyle = this.f75468b;
        return titleBarStyle == null ? new TitleBarStyle() : titleBarStyle;
    }

    public PictureWindowAnimationStyle e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34764h5, new Class[0], PictureWindowAnimationStyle.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureWindowAnimationStyle) patchProxyResultProxy.result;
        }
        if (this.f75471e == null) {
            this.f75471e = PictureWindowAnimationStyle.f();
        }
        return this.f75471e;
    }

    public void f(AlbumWindowStyle albumWindowStyle) {
        this.f75467a = albumWindowStyle;
    }

    public void g(BottomNavBarStyle bottomNavBarStyle) {
        this.f75470d = bottomNavBarStyle;
    }

    public void h(SelectMainStyle selectMainStyle) {
        this.f75469c = selectMainStyle;
    }

    public void i(TitleBarStyle titleBarStyle) {
        this.f75468b = titleBarStyle;
    }

    public void j(PictureWindowAnimationStyle pictureWindowAnimationStyle) {
        this.f75471e = pictureWindowAnimationStyle;
    }
}
