package com.max.hbresource.colorspace;

import android.graphics.Color;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import hd.a;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SRGBColor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SRGBColor implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f71902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f71903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f71904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f71905e;

    public SRGBColor(int i10) {
        this.f71902b = (i10 >> 24) & 255;
        this.f71903c = (i10 >> 16) & 255;
        this.f71904d = (i10 >> 8) & 255;
        this.f71905e = i10 & 255;
    }

    public SRGBColor(int i10, int i11, int i12, int i13) {
        this.f71902b = i10;
        this.f71903c = i11;
        this.f71904d = i12;
        this.f71905e = i13;
    }

    public /* synthetic */ SRGBColor(int i10, int i11, int i12, int i13, int i14, u uVar) {
        this((i14 & 1) != 0 ? 255 : i10, i11, i12, i13);
    }

    public final int a() {
        return this.f71902b;
    }

    public final int b() {
        return this.f71905e;
    }

    public final int c() {
        return this.f71904d;
    }

    public final int d() {
        return this.f71903c;
    }

    public final void e(int i10) {
        this.f71902b = i10;
    }

    public final int f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33945x1, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb(this.f71902b, this.f71903c, this.f71904d, this.f71905e);
    }
}
