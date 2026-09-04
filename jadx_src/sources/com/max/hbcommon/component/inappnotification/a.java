package com.max.hbcommon.component.inappnotification;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: InAppNotificationInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Context f67752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f67753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f67754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f67755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Direction f67756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f67757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f67758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f67759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f67760i;

    public a() {
        this(null, false, 0L, false, null, 0, 0, false, false, 511, null);
    }

    public a(@dl.e Context context, boolean z10, long j10, boolean z11, @dl.d Direction animatorFromDirection, int i10, int i11, boolean z12, boolean z13) {
        f0.p(animatorFromDirection, "animatorFromDirection");
        this.f67752a = context;
        this.f67753b = z10;
        this.f67754c = j10;
        this.f67755d = z11;
        this.f67756e = animatorFromDirection;
        this.f67757f = i10;
        this.f67758g = i11;
        this.f67759h = z12;
        this.f67760i = z13;
    }

    public /* synthetic */ a(Context context, boolean z10, long j10, boolean z11, Direction direction, int i10, int i11, boolean z12, boolean z13, int i12, u uVar) {
        this((i12 & 1) != 0 ? null : context, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? 0L : j10, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? Direction.UP : direction, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) != 0 ? 0 : i11, (i12 & 128) != 0 ? false : z12, (i12 & 256) == 0 ? z13 : false);
    }

    public final boolean a() {
        return this.f67760i;
    }

    @dl.d
    public final Direction b() {
        return this.f67756e;
    }

    public final boolean c() {
        return this.f67753b;
    }

    public final long d() {
        return this.f67754c;
    }

    public final boolean e() {
        return this.f67755d;
    }

    @dl.e
    public final Context f() {
        return this.f67752a;
    }

    @dl.e
    public abstract View g();

    public final int h() {
        return this.f67757f;
    }

    public final int i() {
        return this.f67758g;
    }

    public final boolean j() {
        return this.f67759h;
    }
}
