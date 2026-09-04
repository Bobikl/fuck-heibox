package com.max.video.impl;

import af.k;
import af.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.max.hbvideo.R;
import com.max.video.player.info.PlaybackState;
import com.max.video.ui.TopPanel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CountDownTopPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CountDownTopPanel extends TopPanel implements k, m {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final xd.e f75927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private ze.a f75929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTopPanel(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        xd.e eVarD = xd.e.d(LayoutInflater.from(getContext()), this, true);
        f0.o(eVarD, "inflate(...)");
        this.f75927b = eVarD;
        this.f75928c = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        xd.e eVarD = xd.e.d(LayoutInflater.from(getContext()), this, true);
        f0.o(eVarD, "inflate(...)");
        this.f75927b = eVarD;
        this.f75928c = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        xd.e eVarD = xd.e.d(LayoutInflater.from(getContext()), this, true);
        f0.o(eVarD, "inflate(...)");
        this.f75927b = eVarD;
        this.f75928c = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        xd.e eVarD = xd.e.d(LayoutInflater.from(getContext()), this, true);
        f0.o(eVarD, "inflate(...)");
        this.f75927b = eVarD;
        this.f75928c = -1;
    }

    @Override // af.m
    public void a(int i10) {
        String string;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Kk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f75928c - i10;
        if (i11 >= 0) {
            string = ye.c.f141793a.c(i11);
        } else {
            string = getResources().getString(R.string.time_unknown);
            f0.m(string);
        }
        this.f75927b.f141276b.setText(string);
    }

    @Override // com.max.video.ui.TopPanel
    public void b(@dl.d com.max.video.ui.widget.f action) {
        if (PatchProxy.proxy(new Object[]{action}, this, changeQuickRedirect, false, bb.c.m.Lk, new Class[]{com.max.video.ui.widget.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
    }

    @Override // af.k
    public void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Jk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f75927b.f141276b.setVisibility(0);
        } else {
            this.f75927b.f141276b.setVisibility(4);
        }
    }

    @Override // af.m
    public void e(int i10) {
    }

    @Override // af.m
    public void g(int i10) {
        this.f75928c = i10;
    }

    @Override // af.k
    @dl.e
    public ze.a getPlayAction() {
        return this.f75929d;
    }

    @Override // af.k
    public void i(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Mk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k.a.a(this, z10);
    }

    @Override // af.k
    public void j(@dl.d PlaybackState playbackState) {
        if (PatchProxy.proxy(new Object[]{playbackState}, this, changeQuickRedirect, false, bb.c.m.Nk, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
            return;
        }
        k.a.b(this, playbackState);
    }

    @Override // af.k
    public void setPlayAction(@dl.e ze.a aVar) {
        this.f75929d = aVar;
    }
}
