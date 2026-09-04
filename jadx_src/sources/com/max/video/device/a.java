package com.max.video.device;

import android.content.Context;
import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.u;

/* JADX INFO: compiled from: HBAudioFocusChangeListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements AudioManager.OnAudioFocusChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final b f75907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f75908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private WeakReference<com.max.video.player.a> f75909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private WeakReference<Context> f75910e;

    public a(@d b audioManager) {
        f0.p(audioManager, "audioManager");
        this.f75907b = audioManager;
        this.f75908c = true;
        this.f75909d = new WeakReference<>(null);
        this.f75910e = new WeakReference<>(null);
    }

    private final Context b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34756gk, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : this.f75910e.get();
    }

    private final com.max.video.player.a c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34779hk, new Class[0], com.max.video.player.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.video.player.a) patchProxyResultProxy.result : this.f75909d.get();
    }

    public final void a(@d Context ctx, @d com.max.video.player.a player) {
        if (PatchProxy.proxy(new Object[]{ctx, player}, this, changeQuickRedirect, false, bb.c.m.f34801ik, new Class[]{Context.class, com.max.video.player.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        f0.p(player, "player");
        this.f75910e = new WeakReference<>(ctx);
        this.f75909d = new WeakReference<>(player);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        u<Integer> uVarH;
        com.max.video.player.a aVarC;
        com.max.video.player.a aVarC2;
        boolean z10;
        com.max.video.player.a aVarC3;
        com.max.video.player.a aVarC4;
        u<Boolean> uVarW;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f34825jk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iIntValue = 100;
        if (i10 == -3) {
            com.max.video.player.a aVarC5 = c();
            if (aVarC5 != null && (uVarH = aVarC5.H()) != null) {
                iIntValue = uVarH.getValue().intValue();
            }
            float f10 = iIntValue * 0.8f;
            com.max.video.player.a aVarC6 = c();
            if (aVarC6 != null) {
                aVarC6.setVolume((int) f10);
                return;
            }
            return;
        }
        if (i10 == -2) {
            com.max.video.player.a aVarC7 = c();
            if (aVarC7 != null && aVarC7.isPlaying()) {
                z11 = true;
            }
            if (z11) {
                this.f75908c = true;
                com.max.video.player.a aVarC8 = c();
                if (aVarC8 != null) {
                    aVarC8.pause();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == -1) {
            this.f75907b.a();
            this.f75908c = false;
            com.max.video.player.a aVarC9 = c();
            if (!(aVarC9 != null && aVarC9.isPlaying()) || (aVarC = c()) == null) {
                return;
            }
            aVarC.pause();
            return;
        }
        if (i10 != 1) {
            return;
        }
        if (this.f75908c) {
            com.max.video.player.a aVarC10 = c();
            if (aVarC10 != null && aVarC10.isPlayable()) {
                com.max.video.player.a aVarC11 = c();
                if (aVarC11 != null && aVarC11.isPlaying()) {
                    aVarC2 = c();
                    if (aVarC2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        aVarC3 = c();
                        if ((aVarC3 != null || (uVarW = aVarC3.W()) == null || uVarW.getValue().booleanValue()) ? false : true) {
                            aVarC4.setVolume(100);
                        }
                    }
                } else {
                    com.max.video.player.a aVarC12 = c();
                    if (aVarC12 != null) {
                        aVarC12.start();
                    }
                }
            } else {
                aVarC2 = c();
                if (aVarC2 == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    aVarC3 = c();
                    if ((aVarC3 != null || (uVarW = aVarC3.W()) == null || uVarW.getValue().booleanValue()) ? false : true) {
                        aVarC4.setVolume(100);
                    }
                }
            }
        } else {
            aVarC2 = c();
            if (aVarC2 == null && aVarC2.isPlaying()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVarC3 = c();
                if (((aVarC3 != null || (uVarW = aVarC3.W()) == null || uVarW.getValue().booleanValue()) ? false : true) && (aVarC4 = c()) != null) {
                    aVarC4.setVolume(100);
                }
            }
        }
        this.f75908c = false;
    }
}
