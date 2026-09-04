package com.max.hbcommon.component.inappnotification;

import android.view.View;
import androidx.annotation.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NotificationInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class q {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f67777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private View f67779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @i0
    private int f67780d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private r f67783g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f67786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f67787k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f67781e = 150;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f67782f = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f67784h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private Direction f67785i = Direction.UP;

    public final boolean a() {
        return this.f67787k;
    }

    @dl.d
    public final Direction b() {
        return this.f67785i;
    }

    public final boolean c() {
        return this.f67784h;
    }

    @dl.e
    public final View d() {
        return this.f67779c;
    }

    public final int e() {
        return this.f67780d;
    }

    public final long f() {
        return this.f67781e;
    }

    public final long g() {
        return this.f67782f;
    }

    @dl.e
    public final r h() {
        return this.f67783g;
    }

    public final int i() {
        return this.f67777a;
    }

    public final int j() {
        return this.f67778b;
    }

    public final boolean k() {
        return this.f67786j;
    }

    public final void l(boolean z10) {
        this.f67787k = z10;
    }

    public final void m(@dl.d Direction direction) {
        if (PatchProxy.proxy(new Object[]{direction}, this, changeQuickRedirect, false, bb.c.e.O0, new Class[]{Direction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(direction, "<set-?>");
        this.f67785i = direction;
    }

    public final void n(boolean z10) {
        this.f67786j = z10;
    }

    public final void o(boolean z10) {
        this.f67784h = z10;
    }

    public final void p(@dl.e View view) {
        this.f67779c = view;
    }

    public final void q(int i10) {
        this.f67780d = i10;
    }

    public final void r(long j10) {
        this.f67781e = j10;
    }

    public final void s(long j10) {
        this.f67782f = j10;
    }

    public final void t(@dl.e r rVar) {
        this.f67783g = rVar;
    }

    public final void u(int i10) {
        this.f67777a = i10;
    }

    public final void v(int i10) {
        this.f67778b = i10;
    }
}
