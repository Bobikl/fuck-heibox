package com.max.hbresource.colorspace;

import com.meituan.robust.ChangeQuickRedirect;
import hd.a;
import java.io.Serializable;

/* JADX INFO: compiled from: LabColor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LabColor implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f71899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f71900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f71901d;

    public LabColor(double d10, double d11, double d12) {
        this.f71899b = d10;
        this.f71900c = d11;
        this.f71901d = d12;
    }

    public final double a() {
        return this.f71900c;
    }

    public final double b() {
        return this.f71901d;
    }

    public final double c() {
        return this.f71899b;
    }
}
