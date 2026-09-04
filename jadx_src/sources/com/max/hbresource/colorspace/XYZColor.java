package com.max.hbresource.colorspace;

import com.meituan.robust.ChangeQuickRedirect;
import hd.a;
import java.io.Serializable;

/* JADX INFO: compiled from: XYZColor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class XYZColor implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f71906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f71907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f71908d;

    public XYZColor(double d10, double d11, double d12) {
        this.f71906b = d10;
        this.f71907c = d11;
        this.f71908d = d12;
    }

    public final double a() {
        return this.f71906b;
    }

    public final double b() {
        return this.f71907c;
    }

    public final double c() {
        return this.f71908d;
    }
}
