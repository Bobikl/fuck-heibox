package com.max.mediaselector.utils;

import android.content.Context;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.max.heybox.hblog.g;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;

/* JADX INFO: compiled from: HBCompressEngine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBCompressEngine implements me.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final a f75632e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f75633f = "improve_ab_testdisable_new_image_compress";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f75634a = 2631.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f75635b = 1280.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f75636c = 2631.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f75637d = 16383.0f;

    /* JADX INFO: compiled from: HBCompressEngine.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    @Override // me.a
    public void a(@e Context context, boolean z10, @e ArrayList<LocalMedia> arrayList, @e oe.c<ArrayList<LocalMedia>> cVar) {
        if (!PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), arrayList, cVar}, this, changeQuickRedirect, false, bb.c.m.f34654cb, new Class[]{Context.class, Boolean.TYPE, ArrayList.class, oe.c.class}, Void.TYPE).isSupported && (context instanceof y)) {
            k.f(z.a((y) context), null, null, new HBCompressEngine$onStartCompress$1(arrayList, cVar, this, z10, context, null), 3, null);
        }
    }

    public final float d(boolean z10) {
        return z10 ? this.f75634a : this.f75635b;
    }

    public final int e(boolean z10, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.f34701eb, new Class[]{Boolean.TYPE, Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!z10) {
            return 85;
        }
        double d10 = j10 / ((double) 1000000);
        if (d10 > 10.0d) {
            return fi.u.u(1, (int) (((double) 1000) / d10));
        }
        return 100;
    }

    public final int f(boolean z10, long j10) {
        if (!z10) {
            return 85;
        }
        double d10 = j10 / ((double) 1000000);
        if (d10 > 10.0d) {
            return 85;
        }
        return d10 > 5.0d ? 90 : 100;
    }

    public final boolean g(@d LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.m.f34678db, new Class[]{LocalMedia.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(localMedia, "localMedia");
        if (f.i(localMedia.A()) || f.f(localMedia.A())) {
            g.f74531b.q("HBCompressEngine, ignore video/gif");
            return false;
        }
        double dL = localMedia.L() / ((double) 1000);
        if (dL >= 200.0d) {
            return true;
        }
        g.f74531b.q("HBCompressEngine, small byteSize " + dL + "KB");
        return false;
    }
}
