package com.max.mediaselector.lib.basic;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.max.hbpermission.PermissionManager;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.service.ForegroundService;
import com.max.mediaselector.lib.style.PictureWindowAnimationStyle;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.max.mediaselector.lib.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import oe.s;
import oe.u;
import oe.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: PictureCommonFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends Fragment implements com.max.mediaselector.lib.basic.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f74924m = g.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private re.c f74925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.max.mediaselector.lib.basic.b f74926c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.max.mediaselector.lib.loader.a f74928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected PictureSelectionConfig f74929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.max.mediaselector.lib.dialog.d f74930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SoundPool f74931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f74932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f74933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Dialog f74934k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f74927d = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected FragmentActivity f74935l = null;

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class a implements oe.c<ArrayList<LocalMedia>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // oe.c
        public /* bridge */ /* synthetic */ void a(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.f34594zj, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(arrayList);
        }

        public void b(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.f34572yj, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            LocalMedia localMedia = null;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia2 = arrayList.get(i10);
                if (com.max.mediaselector.lib.config.f.h(arrayList.get(i10).A())) {
                    localMedia = localMedia2;
                    break;
                }
            }
            PictureSelectionConfig.f75022g4.a(g.this, localMedia, arrayList, 69);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class b implements oe.c<ArrayList<LocalMedia>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // oe.c
        public /* bridge */ /* synthetic */ void a(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Bj, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(arrayList);
        }

        public void b(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Aj, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!g.T3(g.this)) {
                g.this.G0(arrayList);
                return;
            }
            LocalMedia localMedia = null;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia2 = arrayList.get(i10);
                if (com.max.mediaselector.lib.config.f.h(arrayList.get(i10).A())) {
                    localMedia = localMedia2;
                    break;
                }
            }
            PictureSelectionConfig.Y3.a(g.this, localMedia, arrayList, 69);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class c extends PictureThreadUtils.d<ArrayList<LocalMedia>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList f74938p;

        /* JADX INFO: compiled from: PictureCommonFragment.java */
        public class a implements oe.b<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // oe.b
            public /* bridge */ /* synthetic */ void a(LocalMedia localMedia, int i10) {
                if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Hj, new Class[]{Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                b(localMedia, i10);
            }

            public void b(LocalMedia localMedia, int i10) {
                if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Gj, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                LocalMedia localMedia2 = (LocalMedia) c.this.f74938p.get(i10);
                localMedia2.P0(localMedia.K());
                if (g.this.f74929f.S) {
                    localMedia2.K0(localMedia.C());
                    localMedia2.I0(!TextUtils.isEmpty(localMedia.C()));
                }
            }
        }

        c(ArrayList arrayList) {
            this.f74938p = arrayList;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Fj, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.Ej, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((ArrayList) obj);
        }

        public ArrayList<LocalMedia> r() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Cj, new Class[0], ArrayList.class);
            if (patchProxyResultProxy.isSupported) {
                return (ArrayList) patchProxyResultProxy.result;
            }
            for (int i10 = 0; i10 < this.f74938p.size(); i10++) {
                int i11 = i10;
                PictureSelectionConfig.Z3.a(g.this.getContext(), g.this.f74929f.S, i11, (LocalMedia) this.f74938p.get(i10), new a());
            }
            return this.f74938p;
        }

        public void s(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Dj, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            g.U3(g.this, arrayList);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class d implements View.OnKeyListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, bb.c.l.f34550xj, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            g.this.x1();
            return true;
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class e implements oe.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // oe.h
        public void a(View view, int i10) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Ij, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                if (PictureSelectionConfig.f75018c4 != null) {
                    g.N3(g.this, 1);
                    return;
                } else {
                    g.this.q3();
                    return;
                }
            }
            if (i10 != 1) {
                return;
            }
            if (PictureSelectionConfig.f75018c4 != null) {
                g.N3(g.this, 2);
            } else {
                g.this.u2();
            }
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class f implements com.max.mediaselector.lib.dialog.b.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.mediaselector.lib.dialog.b.a
        public void a(boolean z10, DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), dialogInterface}, this, changeQuickRedirect, false, bb.c.l.Jj, new Class[]{Boolean.TYPE, DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            g gVar = g.this;
            if (gVar.f74929f.f75031c && z10) {
                gVar.x1();
            }
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.basic.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class C0604g implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0604g() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Kj, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.O3(g.this);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class h implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Lj, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.P3(g.this);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class i implements s {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // oe.s
        public void a(String[] strArr, boolean z10) {
            if (PatchProxy.proxy(new Object[]{strArr, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Mj, new Class[]{String[].class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                g.Q3(g.this);
            } else {
                g.this.p2(strArr);
            }
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class j implements re.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // re.c
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Nj, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.Q3(g.this);
        }

        @Override // re.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Oj, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g.this.p2(re.b.f138892e);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class k implements oe.c<ArrayList<LocalMedia>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // oe.c
        public /* bridge */ /* synthetic */ void a(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Qj, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(arrayList);
        }

        public void b(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Pj, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.G0(arrayList);
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public class l extends PictureThreadUtils.d<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Intent f74949p;

        l(Intent intent) {
            this.f74949p = intent;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Uj, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.Tj, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((LocalMedia) obj);
        }

        public LocalMedia r() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Rj, new Class[0], LocalMedia.class);
            if (patchProxyResultProxy.isSupported) {
                return (LocalMedia) patchProxyResultProxy.result;
            }
            String strL4 = g.this.l4(this.f74949p);
            if (!TextUtils.isEmpty(strL4)) {
                g.this.f74929f.f75028a0 = strL4;
            }
            if (TextUtils.isEmpty(g.this.f74929f.f75028a0)) {
                return null;
            }
            if (g.this.f74929f.f75029b == com.max.mediaselector.lib.config.h.b()) {
                g.R3(g.this);
            }
            g gVar = g.this;
            return gVar.V3(gVar.f74929f.f75028a0);
        }

        public void s(LocalMedia localMedia) {
            if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.Sj, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            if (localMedia != null) {
                g.S3(g.this, localMedia);
                g.this.c0(localMedia);
            }
        }
    }

    /* JADX INFO: compiled from: PictureCommonFragment.java */
    public static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f74952b;

        public m(int i10, Intent intent) {
            this.f74951a = i10;
            this.f74952b = intent;
        }
    }

    private void A4(LocalMedia localMedia) {
        int i10;
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.Ji, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        if (com.max.mediaselector.lib.utils.o.e()) {
            if (com.max.mediaselector.lib.config.f.i(localMedia.A()) && com.max.mediaselector.lib.config.f.c(this.f74929f.f75028a0)) {
                new com.max.mediaselector.lib.basic.j(this.f74935l, localMedia.G());
                return;
            }
            return;
        }
        new com.max.mediaselector.lib.basic.j(this.f74935l, com.max.mediaselector.lib.config.f.c(this.f74929f.f75028a0) ? localMedia.G() : this.f74929f.f75028a0);
        if (!com.max.mediaselector.lib.config.f.h(localMedia.A()) || (i10 = com.max.mediaselector.lib.utils.l.i(getContext())) == -1) {
            return;
        }
        com.max.mediaselector.lib.utils.l.s(getContext(), i10);
    }

    private void C4() {
        SoundPool soundPool;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Di, new Class[0], Void.TYPE).isSupported || (soundPool = this.f74931h) == null || !this.f74929f.M) {
            return;
        }
        soundPool.play(this.f74932i, 0.1f, 0.5f, 0, 1, 1.0f);
    }

    private void D4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ei, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            SoundPool soundPool = this.f74931h;
            if (soundPool != null) {
                soundPool.release();
                this.f74931h = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void H4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34166gi, new Class[0], Void.TYPE).isSupported && this.f74929f.K) {
            ne.a.f(this.f74935l, PictureSelectionConfig.f75017b4.c().j0());
        }
    }

    private void I4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34372pi, new Class[]{String.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        try {
            Dialog dialog = this.f74934k;
            if (dialog == null || !dialog.isShowing()) {
                Dialog dialogB = com.max.mediaselector.lib.dialog.e.b(getContext(), str);
                this.f74934k = dialogB;
                dialogB.show();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void J4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34549xi, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        if (PictureSelectionConfig.f75018c4 != null) {
            ForegroundService.c(getContext());
            o4(1);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.f74935l.getPackageManager()) != null) {
            ForegroundService.c(getContext());
            Uri uriC = com.max.mediaselector.lib.utils.k.c(getContext(), this.f74929f);
            if (uriC != null) {
                if (this.f74929f.f75039j) {
                    intent.putExtra(com.max.mediaselector.lib.config.e.f75099d, 1);
                }
                intent.putExtra("output", uriC);
                startActivityForResult(intent, 909);
            }
        }
    }

    private void K4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Bi, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        if (PictureSelectionConfig.f75018c4 != null) {
            ForegroundService.c(getContext());
            o4(3);
            return;
        }
        Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
        if (intent.resolveActivity(this.f74935l.getPackageManager()) == null) {
            t.c(getContext(), "The system is missing a recording component");
        } else {
            ForegroundService.c(getContext());
            startActivityForResult(intent, 909);
        }
    }

    private void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34593zi, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        if (PictureSelectionConfig.f75018c4 != null) {
            ForegroundService.c(getContext());
            o4(2);
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(this.f74935l.getPackageManager()) != null) {
            ForegroundService.c(getContext());
            Uri uriD = com.max.mediaselector.lib.utils.k.d(getContext(), this.f74929f);
            if (uriD != null) {
                intent.putExtra("output", uriD);
                if (this.f74929f.f75039j) {
                    intent.putExtra(com.max.mediaselector.lib.config.e.f75099d, 1);
                }
                intent.putExtra(com.max.mediaselector.lib.config.e.f75101f, this.f74929f.f75061y2);
                intent.putExtra("android.intent.extra.durationLimit", this.f74929f.f75054v);
                intent.putExtra("android.intent.extra.videoQuality", this.f74929f.f75049q);
                startActivityForResult(intent, 909);
            }
        }
    }

    static /* synthetic */ void N3(g gVar, int i10) {
        if (PatchProxy.proxy(new Object[]{gVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.f34373pj, new Class[]{g.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gVar.o4(i10);
    }

    static /* synthetic */ void O3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34396qj, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.J4();
    }

    static /* synthetic */ void P3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34418rj, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.L4();
    }

    static /* synthetic */ void Q3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34440sj, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.K4();
    }

    static /* synthetic */ void R3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34462tj, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.a4();
    }

    static /* synthetic */ void S3(g gVar, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{gVar, localMedia}, null, changeQuickRedirect, true, bb.c.l.f34484uj, new Class[]{g.class, LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.A4(localMedia);
    }

    static /* synthetic */ boolean T3(g gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, bb.c.l.f34506vj, new Class[]{g.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gVar.Y3();
    }

    static /* synthetic */ void U3(g gVar, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{gVar, arrayList}, null, changeQuickRedirect, true, bb.c.l.f34528wj, new Class[]{g.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.w4(arrayList);
    }

    private boolean W3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Li, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig.f75040k == 2 && !pictureSelectionConfig.f75031c) {
            if (pictureSelectionConfig.P) {
                ArrayList<LocalMedia> arrayListI = qe.a.i();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < arrayListI.size(); i12++) {
                    if (com.max.mediaselector.lib.config.f.i(arrayListI.get(i12).A())) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
                PictureSelectionConfig pictureSelectionConfig2 = this.f74929f;
                int i13 = pictureSelectionConfig2.f75042m;
                if (i13 > 0 && i10 < i13) {
                    if (PictureSelectionConfig.f75019d4.a(getContext(), this.f74929f, 5)) {
                        return true;
                    }
                    I4(getString(R.string.ps_min_img_num, String.valueOf(this.f74929f.f75042m)));
                    return true;
                }
                int i14 = pictureSelectionConfig2.f75044o;
                if (i14 > 0 && i11 < i14) {
                    if (PictureSelectionConfig.f75019d4.a(getContext(), this.f74929f, 7)) {
                        return true;
                    }
                    I4(getString(R.string.ps_min_video_num, String.valueOf(this.f74929f.f75044o)));
                    return true;
                }
            } else {
                String strJ = qe.a.j();
                if (com.max.mediaselector.lib.config.f.h(strJ) && this.f74929f.f75042m > 0 && qe.a.g() < this.f74929f.f75042m) {
                    u uVar = PictureSelectionConfig.f75019d4;
                    if (uVar != null && uVar.a(getContext(), this.f74929f, 5)) {
                        return true;
                    }
                    I4(getString(R.string.ps_min_img_num, String.valueOf(this.f74929f.f75042m)));
                    return true;
                }
                if (com.max.mediaselector.lib.config.f.i(strJ) && this.f74929f.f75044o > 0 && qe.a.g() < this.f74929f.f75044o) {
                    u uVar2 = PictureSelectionConfig.f75019d4;
                    if (uVar2 != null && uVar2.a(getContext(), this.f74929f, 7)) {
                        return true;
                    }
                    I4(getString(R.string.ps_min_video_num, String.valueOf(this.f74929f.f75044o)));
                    return true;
                }
                if (com.max.mediaselector.lib.config.f.e(strJ) && this.f74929f.f75045p > 0 && qe.a.g() < this.f74929f.f75045p) {
                    u uVar3 = PictureSelectionConfig.f75019d4;
                    if (uVar3 != null && uVar3.a(getContext(), this.f74929f, 12)) {
                        return true;
                    }
                    I4(getString(R.string.ps_min_audio_num, String.valueOf(this.f74929f.f75045p)));
                    return true;
                }
            }
        }
        return false;
    }

    private boolean Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Pi, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (PictureSelectionConfig.Y3 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.f74929f.R;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (qe.a.g() == 1) {
            String strJ = qe.a.j();
            boolean zH = com.max.mediaselector.lib.config.f.h(strJ);
            if (zH && hashSet.contains(strJ)) {
                return false;
            }
            return zH;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < qe.a.g(); i11++) {
            LocalMedia localMedia = qe.a.i().get(i11);
            if (com.max.mediaselector.lib.config.f.h(localMedia.A()) && hashSet.contains(localMedia.A())) {
                i10++;
            }
        }
        return i10 != qe.a.g();
    }

    private void Z3(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Ri, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        PictureThreadUtils.M(new c(arrayList));
    }

    private void a4() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Hi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            if (TextUtils.isEmpty(this.f74929f.X) || !com.max.mediaselector.lib.config.f.c(this.f74929f.f75028a0)) {
                return;
            }
            InputStream inputStreamA = com.max.mediaselector.lib.basic.h.a(getContext(), Uri.parse(this.f74929f.f75028a0));
            if (TextUtils.isEmpty(this.f74929f.V)) {
                str = "";
            } else {
                PictureSelectionConfig pictureSelectionConfig = this.f74929f;
                if (pictureSelectionConfig.f75031c) {
                    str = pictureSelectionConfig.V;
                } else {
                    str = System.currentTimeMillis() + lg.a.f131412e + this.f74929f.V;
                }
            }
            Context context = getContext();
            PictureSelectionConfig pictureSelectionConfig2 = this.f74929f;
            File fileC = com.max.mediaselector.lib.utils.n.c(context, pictureSelectionConfig2.f75029b, str, "", pictureSelectionConfig2.X);
            if (com.max.mediaselector.lib.utils.n.x(inputStreamA, new FileOutputStream(fileC.getAbsolutePath()))) {
                com.max.mediaselector.lib.utils.l.b(getContext(), this.f74929f.f75028a0);
                this.f74929f.f75028a0 = fileC.getAbsolutePath();
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    private void b4() {
        me.e eVarA;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34212ij, new Class[0], Void.TYPE).isSupported && PictureSelectionConfig.c().P3 && PictureSelectionConfig.X3 == null && (eVarA = ke.b.d().a()) != null) {
            PictureSelectionConfig.X3 = eVarA.d();
        }
    }

    private void c4() {
        me.e eVarA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34167gj, new Class[0], Void.TYPE).isSupported || PictureSelectionConfig.W3 != null || (eVarA = ke.b.d().a()) == null) {
            return;
        }
        PictureSelectionConfig.W3 = eVarA.f();
    }

    private void d4() {
        me.e eVarA;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34281lj, new Class[0], Void.TYPE).isSupported && PictureSelectionConfig.c().N3 && PictureSelectionConfig.f75024i4 == null && (eVarA = ke.b.d().a()) != null) {
            PictureSelectionConfig.f75024i4 = eVarA.b();
        }
    }

    private void e4() {
        me.e eVarA;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34190hj, new Class[0], Void.TYPE).isSupported && PictureSelectionConfig.c().Q3 && PictureSelectionConfig.f75016a4 == null && (eVarA = ke.b.d().a()) != null) {
            PictureSelectionConfig.f75016a4 = eVarA.a();
        }
    }

    private void f4() {
        me.e eVarA;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34258kj, new Class[0], Void.TYPE).isSupported && PictureSelectionConfig.c().M3 && PictureSelectionConfig.f75020e4 == null && (eVarA = ke.b.d().a()) != null) {
            PictureSelectionConfig.f75020e4 = eVarA.e();
        }
    }

    private void g4() {
        me.e eVarA;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34235jj, new Class[0], Void.TYPE).isSupported && PictureSelectionConfig.c().R3 && PictureSelectionConfig.Z3 == null && (eVarA = ke.b.d().a()) != null) {
            PictureSelectionConfig.Z3 = eVarA.c();
        }
    }

    private void h4(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.l.Gi, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new l(intent));
    }

    @SuppressLint({"StringFormatInvalid"})
    private static String n4(Context context, String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.f34395qi, new Class[]{Context.class, String.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.mediaselector.lib.config.f.i(str)) {
            return context.getString(R.string.ps_message_video_max_num, String.valueOf(i10));
        }
        return com.max.mediaselector.lib.config.f.e(str) ? context.getString(R.string.ps_message_audio_max_num, String.valueOf(i10)) : context.getString(R.string.ps_message_max_num, String.valueOf(i10));
    }

    private void o4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Ci, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ForegroundService.c(getContext());
        PictureSelectionConfig.f75018c4.a(this, i10, 909);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34327nj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t4(oe.c cVar, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{cVar, arrayList}, this, changeQuickRedirect, false, bb.c.l.f34350oj, new Class[]{oe.c.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        V1();
        cVar.a(arrayList);
    }

    private void u4(ArrayList<LocalMedia> arrayList) {
        if (!PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Si, new Class[]{ArrayList.class}, Void.TYPE).isSupported && this.f74929f.S) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia = arrayList.get(i10);
                localMedia.I0(true);
                localMedia.K0(localMedia.E());
            }
        }
    }

    private void w4(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Ui, new Class[]{ArrayList.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        V1();
        oe.f fVar = PictureSelectionConfig.f75026k4;
        if (fVar != null) {
            fVar.a(getContext(), arrayList, new v() { // from class: com.max.mediaselector.lib.basic.f
                @Override // oe.v
                public final void a() {
                    this.f74923a.s4();
                }
            });
        } else if (this.f74929f.O3) {
            this.f74935l.setResult(-1, q.l(arrayList));
            B4(-1, arrayList);
        } else {
            oe.t<LocalMedia> tVar = PictureSelectionConfig.f75020e4;
            if (tVar != null) {
                tVar.onResult(arrayList);
            }
        }
        if (PictureSelectionConfig.f75026k4 == null) {
            z4();
        }
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void A0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34505vi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.lib.dialog.b bVarM3 = com.max.mediaselector.lib.dialog.b.M3();
        bVarM3.O3(new e());
        bVarM3.N3(new f());
        bVarM3.show(getChildFragmentManager(), "PhotoItemSelectedDialog");
    }

    public void B4(int i10, ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), arrayList}, this, changeQuickRedirect, false, bb.c.l.f34121ej, new Class[]{Integer.TYPE, ArrayList.class}, Void.TYPE).isSupported || this.f74926c == null) {
            return;
        }
        this.f74926c.a(m4(i10, arrayList));
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void D0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34461ti, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        List<Fragment> listJ0 = this.f74935l.getSupportFragmentManager().J0();
        for (int i10 = 0; i10 < listJ0.size(); i10++) {
            Fragment fragment = listJ0.get(i10);
            if (fragment instanceof g) {
                ((g) fragment).Z0();
            }
        }
    }

    public void E(boolean z10) {
    }

    public void E4(long j10) {
        this.f74933j = j10;
    }

    public void F4(re.c cVar) {
        this.f74925b = cVar;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void G0(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Ti, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        if (PictureSelectionConfig.Z3 != null) {
            Z3(arrayList);
        } else {
            u4(arrayList);
            w4(arrayList);
        }
    }

    public void G4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34189hi, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new d());
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void H0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Wi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c4();
        b4();
        g4();
        e4();
        f4();
        d4();
    }

    public void H1(String[] strArr) {
    }

    public int I() {
        return 0;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void I3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ai, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        oe.j jVar = PictureSelectionConfig.f75023h4;
        if (jVar != null) {
            jVar.a(this, re.b.f138892e, new i());
        } else {
            re.a.b().i(this, new String[]{"android.permission.RECORD_AUDIO"}, new j());
        }
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void K() {
        PictureSelectionConfig pictureSelectionConfigC;
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Vi, new Class[0], Void.TYPE).isSupported || (i10 = (pictureSelectionConfigC = PictureSelectionConfig.c()).C) == -2 || pictureSelectionConfigC.f75031c) {
            return;
        }
        pe.c.e(this.f74935l, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.max.mediaselector.lib.basic.c
    public int O0(LocalMedia localMedia, boolean z10) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34280li, new Class[]{LocalMedia.class, Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (p4(localMedia, z10) != 200) {
            return -1;
        }
        ArrayList<LocalMedia> arrayListI = qe.a.i();
        if (z10) {
            arrayListI.remove(localMedia);
            i10 = 1;
        } else {
            if (this.f74929f.f75040k == 1 && arrayListI.size() > 0) {
                W(arrayListI.get(0));
                arrayListI.clear();
            }
            arrayListI.add(localMedia);
            localMedia.G0(arrayListI.size());
            C4();
        }
        y1(i10 ^ 1, localMedia);
        return i10;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void Q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34483ui, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        int i10 = pictureSelectionConfig.f75029b;
        if (i10 == 0) {
            if (pictureSelectionConfig.J3 == com.max.mediaselector.lib.config.h.c()) {
                q3();
                return;
            } else if (this.f74929f.J3 == com.max.mediaselector.lib.config.h.d()) {
                u2();
                return;
            } else {
                A0();
                return;
            }
        }
        if (i10 == 1) {
            q3();
        } else if (i10 == 2) {
            u2();
        } else {
            if (i10 != 3) {
                return;
            }
            I3();
        }
    }

    public void T0() {
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34029aj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            if (!com.max.mediaselector.lib.utils.a.d(this.f74935l) && this.f74930g.isShowing()) {
                this.f74930g.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public LocalMedia V3(String str) throws Throwable {
        File file;
        long jE;
        String str2;
        com.max.mediaselector.lib.entity.b bVarG;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.Ki, new Class[]{String.class}, LocalMedia.class);
        if (patchProxyResultProxy.isSupported) {
            return (LocalMedia) patchProxyResultProxy.result;
        }
        if (com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return null;
        }
        long jCurrentTimeMillis = 0;
        if (com.max.mediaselector.lib.config.f.c(str)) {
            Uri uri = Uri.parse(str);
            file = new File(com.max.mediaselector.lib.utils.n.m(this.f74935l, uri));
            String strM = com.max.mediaselector.lib.utils.l.m(file.getAbsolutePath());
            if (com.max.mediaselector.lib.utils.n.v(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    String[] strArrSplit = documentId.split(":");
                    if (strArrSplit.length > 1) {
                        jCurrentTimeMillis = com.max.mediaselector.lib.utils.u.j(strArrSplit[1]);
                    }
                }
            } else if (com.max.mediaselector.lib.utils.n.r(uri)) {
                jCurrentTimeMillis = com.max.mediaselector.lib.utils.u.j(DocumentsContract.getDocumentId(uri));
            } else {
                int iLastIndexOf = str.lastIndexOf("/") + 1;
                jCurrentTimeMillis = iLastIndexOf > 0 ? com.max.mediaselector.lib.utils.u.j(str.substring(iLastIndexOf)) : System.currentTimeMillis();
            }
            jE = com.max.mediaselector.lib.config.f.e(strM) ? com.max.mediaselector.lib.utils.l.e(getContext(), file, "") : com.max.mediaselector.lib.utils.l.c(getContext(), file, "");
            str2 = strM;
        } else {
            file = new File(str);
            String strM2 = com.max.mediaselector.lib.utils.l.m(file.getAbsolutePath());
            jCurrentTimeMillis = System.currentTimeMillis();
            jE = com.max.mediaselector.lib.config.f.e(strM2) ? com.max.mediaselector.lib.utils.l.e(getContext(), file, this.f74929f.W) : com.max.mediaselector.lib.utils.l.c(getContext(), file, this.f74929f.W);
            str2 = strM2;
        }
        long j10 = jE;
        long j11 = jCurrentTimeMillis;
        if (com.max.mediaselector.lib.config.f.h(str2) && this.f74929f.G2) {
            com.max.mediaselector.lib.utils.c.s(getContext(), str);
        }
        if (com.max.mediaselector.lib.config.f.i(str2)) {
            bVarG = com.max.mediaselector.lib.utils.l.p(getContext(), str);
        } else {
            bVarG = com.max.mediaselector.lib.config.f.e(str2) ? com.max.mediaselector.lib.utils.l.g(getContext(), str) : com.max.mediaselector.lib.utils.l.j(getContext(), str);
        }
        LocalMedia localMediaA0 = LocalMedia.a0(j11, str, file.getAbsolutePath(), file.getName(), com.max.mediaselector.lib.utils.l.d(file.getAbsolutePath()), bVarG.a(), this.f74929f.f75029b, str2, bVarG.e(), bVarG.b(), file.length(), j10, file.lastModified() / 1000);
        if (com.max.mediaselector.lib.utils.o.e()) {
            localMediaA0.P0(com.max.mediaselector.lib.config.f.c(str) ? null : str);
        }
        return localMediaA0;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void W(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34439si, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        List<Fragment> listJ0 = this.f74935l.getSupportFragmentManager().J0();
        for (int i10 = 0; i10 < listJ0.size(); i10++) {
            Fragment fragment = listJ0.get(i10);
            if (fragment instanceof g) {
                ((g) fragment).i1(localMedia);
            }
        }
    }

    public boolean X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Qi, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (PictureSelectionConfig.X3 != null) {
            for (int i10 = 0; i10 < qe.a.g(); i10++) {
                if (com.max.mediaselector.lib.config.f.h(qe.a.i().get(i10).A())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.max.mediaselector.lib.basic.c
    @SuppressLint({"StringFormatInvalid"})
    public boolean Y(boolean z10, String str, String str2, long j10, long j11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34349oi, new Class[]{cls, String.class, String.class, cls2, cls2}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.mediaselector.lib.config.f.m(str2, str)) {
            u uVar = PictureSelectionConfig.f75019d4;
            if (uVar != null && uVar.a(getContext(), this.f74929f, 3)) {
                return true;
            }
            I4(getString(R.string.ps_rule));
            return true;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        long j12 = pictureSelectionConfig.A;
        if (j12 > 0 && j10 > j12) {
            u uVar2 = PictureSelectionConfig.f75019d4;
            if (uVar2 != null && uVar2.a(getContext(), this.f74929f, 1)) {
                return true;
            }
            I4(getString(R.string.ps_select_max_size, com.max.mediaselector.lib.utils.n.h(this.f74929f.A, 1)));
            return true;
        }
        long j13 = pictureSelectionConfig.B;
        if (j13 > 0 && j10 < j13) {
            u uVar3 = PictureSelectionConfig.f75019d4;
            if (uVar3 != null && uVar3.a(getContext(), this.f74929f, 2)) {
                return true;
            }
            I4(getString(R.string.ps_select_min_size, com.max.mediaselector.lib.utils.n.h(this.f74929f.B, 1)));
            return true;
        }
        if (com.max.mediaselector.lib.config.f.i(str)) {
            PictureSelectionConfig pictureSelectionConfig2 = this.f74929f;
            if (pictureSelectionConfig2.f75040k == 2) {
                int i10 = pictureSelectionConfig2.f75043n;
                if (i10 <= 0) {
                    i10 = pictureSelectionConfig2.f75041l;
                }
                pictureSelectionConfig2.f75043n = i10;
                if (!z10 && qe.a.g() >= this.f74929f.f75043n) {
                    u uVar4 = PictureSelectionConfig.f75019d4;
                    if (uVar4 != null && uVar4.a(getContext(), this.f74929f, 6)) {
                        return true;
                    }
                    I4(n4(getContext(), str, this.f74929f.f75043n));
                    return true;
                }
            }
            if (!z10 && this.f74929f.f75053u > 0 && com.max.mediaselector.lib.utils.g.k(j11) < this.f74929f.f75053u) {
                u uVar5 = PictureSelectionConfig.f75019d4;
                if (uVar5 != null && uVar5.a(getContext(), this.f74929f, 9)) {
                    return true;
                }
                I4(getString(R.string.ps_select_video_min_second, Integer.valueOf(this.f74929f.f75053u / 1000)));
                return true;
            }
            if (!z10 && this.f74929f.f75052t > 0 && com.max.mediaselector.lib.utils.g.k(j11) > this.f74929f.f75052t) {
                u uVar6 = PictureSelectionConfig.f75019d4;
                if (uVar6 != null && uVar6.a(getContext(), this.f74929f, 8)) {
                    return true;
                }
                I4(getString(R.string.ps_select_video_max_second, Integer.valueOf(this.f74929f.f75052t / 1000)));
                return true;
            }
        } else if (com.max.mediaselector.lib.config.f.e(str)) {
            if (this.f74929f.f75040k == 2 && !z10 && qe.a.i().size() >= this.f74929f.f75041l) {
                u uVar7 = PictureSelectionConfig.f75019d4;
                if (uVar7 != null && uVar7.a(getContext(), this.f74929f, 4)) {
                    return true;
                }
                I4(n4(getContext(), str, this.f74929f.f75041l));
                return true;
            }
            if (!z10 && this.f74929f.f75053u > 0 && com.max.mediaselector.lib.utils.g.k(j11) < this.f74929f.f75053u) {
                u uVar8 = PictureSelectionConfig.f75019d4;
                if (uVar8 != null && uVar8.a(getContext(), this.f74929f, 11)) {
                    return true;
                }
                I4(getString(R.string.ps_select_audio_min_second, Integer.valueOf(this.f74929f.f75053u / 1000)));
                return true;
            }
            if (!z10 && this.f74929f.f75052t > 0 && com.max.mediaselector.lib.utils.g.k(j11) > this.f74929f.f75052t) {
                u uVar9 = PictureSelectionConfig.f75019d4;
                if (uVar9 != null && uVar9.a(getContext(), this.f74929f, 10)) {
                    return true;
                }
                I4(getString(R.string.ps_select_audio_max_second, Integer.valueOf(this.f74929f.f75052t / 1000)));
                return true;
            }
        } else if (this.f74929f.f75040k == 2 && !z10 && qe.a.i().size() >= this.f74929f.f75041l) {
            u uVar10 = PictureSelectionConfig.f75019d4;
            if (uVar10 != null && uVar10.a(getContext(), this.f74929f, 4)) {
                return true;
            }
            I4(n4(getContext(), str, this.f74929f.f75041l));
            return true;
        }
        return false;
    }

    public void Z0() {
    }

    public void a0(Intent intent) {
    }

    public void c0(LocalMedia localMedia) {
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void i1(LocalMedia localMedia) {
    }

    public void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Oi, new Class[0], Void.TYPE).isSupported || W3()) {
            return;
        }
        x4(requireContext(), r4(), new ArrayList<>(qe.a.i()), new b());
    }

    public void j0(Bundle bundle) {
    }

    public long j4() {
        long j10 = this.f74933j;
        if (j10 > 50) {
            j10 -= 50;
        }
        if (j10 >= 0) {
            return j10;
        }
        return 0L;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void k0() {
    }

    public void k2(boolean z10, LocalMedia localMedia) {
    }

    @Override // com.max.mediaselector.lib.basic.c
    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    public boolean k3(boolean z10, String str, int i10, long j10, long j11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34326ni, new Class[]{cls, String.class, Integer.TYPE, cls2, cls2}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        long j12 = pictureSelectionConfig.A;
        if (j12 > 0 && j10 > j12) {
            u uVar = PictureSelectionConfig.f75019d4;
            if (uVar != null && uVar.a(getContext(), this.f74929f, 1)) {
                return true;
            }
            I4(getString(R.string.ps_select_max_size, com.max.mediaselector.lib.utils.n.h(this.f74929f.A, 1)));
            return true;
        }
        long j13 = pictureSelectionConfig.B;
        if (j13 > 0 && j10 < j13) {
            u uVar2 = PictureSelectionConfig.f75019d4;
            if (uVar2 != null && uVar2.a(getContext(), this.f74929f, 2)) {
                return true;
            }
            I4(getString(R.string.ps_select_min_size, com.max.mediaselector.lib.utils.n.h(this.f74929f.B, 1)));
            return true;
        }
        if (com.max.mediaselector.lib.config.f.i(str)) {
            PictureSelectionConfig pictureSelectionConfig2 = this.f74929f;
            if (pictureSelectionConfig2.f75040k == 2) {
                if (pictureSelectionConfig2.f75043n <= 0) {
                    u uVar3 = PictureSelectionConfig.f75019d4;
                    if (uVar3 != null && uVar3.a(getContext(), this.f74929f, 3)) {
                        return true;
                    }
                    I4(getString(R.string.ps_rule));
                    return true;
                }
                if (!z10 && qe.a.i().size() >= this.f74929f.f75041l) {
                    u uVar4 = PictureSelectionConfig.f75019d4;
                    if (uVar4 != null && uVar4.a(getContext(), this.f74929f, 4)) {
                        return true;
                    }
                    I4(getString(R.string.ps_message_max_num, Integer.valueOf(this.f74929f.f75041l)));
                    return true;
                }
                if (!z10 && i10 >= this.f74929f.f75043n) {
                    u uVar5 = PictureSelectionConfig.f75019d4;
                    if (uVar5 != null && uVar5.a(getContext(), this.f74929f, 6)) {
                        return true;
                    }
                    I4(n4(getContext(), str, this.f74929f.f75043n));
                    return true;
                }
            }
            if (!z10 && this.f74929f.f75053u > 0 && com.max.mediaselector.lib.utils.g.k(j11) < this.f74929f.f75053u) {
                u uVar6 = PictureSelectionConfig.f75019d4;
                if (uVar6 != null && uVar6.a(getContext(), this.f74929f, 9)) {
                    return true;
                }
                I4(getString(R.string.ps_select_video_min_second, Integer.valueOf(this.f74929f.f75053u / 1000)));
                return true;
            }
            if (!z10 && this.f74929f.f75052t > 0 && com.max.mediaselector.lib.utils.g.k(j11) > this.f74929f.f75052t) {
                u uVar7 = PictureSelectionConfig.f75019d4;
                if (uVar7 != null && uVar7.a(getContext(), this.f74929f, 8)) {
                    return true;
                }
                I4(getString(R.string.ps_select_video_max_second, Integer.valueOf(this.f74929f.f75052t / 1000)));
                return true;
            }
        } else if (this.f74929f.f75040k == 2 && !z10 && qe.a.i().size() >= this.f74929f.f75041l) {
            u uVar8 = PictureSelectionConfig.f75019d4;
            if (uVar8 != null && uVar8.a(getContext(), this.f74929f, 4)) {
                return true;
            }
            I4(getString(R.string.ps_message_max_num, Integer.valueOf(this.f74929f.f75041l)));
            return true;
        }
        return false;
    }

    public String k4() {
        return f74924m;
    }

    public String l4(Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.l.Ii, new Class[]{Intent.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (intent == null) {
            return null;
        }
        Uri data = (this.f74929f.f75029b != com.max.mediaselector.lib.config.h.b() || intent.getData() == null) ? (Uri) intent.getParcelableExtra("output") : intent.getData();
        if (data != null) {
            return com.max.mediaselector.lib.config.f.c(data.toString()) ? data.toString() : data.getPath();
        }
        return null;
    }

    public m m4(int i10, ArrayList<LocalMedia> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), arrayList}, this, changeQuickRedirect, false, bb.c.l.f34304mj, new Class[]{Integer.TYPE, ArrayList.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        return new m(i10, arrayList != null ? q.l(arrayList) : null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Fi, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        ForegroundService.d(getContext());
        if (i11 != -1) {
            if (i11 == 96) {
                Throwable thA = intent != null ? com.max.mediaselector.lib.config.a.a(intent) : new Throwable("image crop error");
                if (thA != null) {
                    t.c(getContext(), thA.getMessage());
                    return;
                }
                return;
            }
            if (i11 == 0) {
                if (i10 == 909) {
                    com.max.mediaselector.lib.utils.l.b(getContext(), this.f74929f.f75028a0);
                    return;
                } else {
                    if (i10 == 1102) {
                        H1(re.b.f138888a);
                        re.b.f138888a = null;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i10 == 909) {
            h4(intent);
            return;
        }
        if (i10 == 696) {
            a0(intent);
            return;
        }
        if (i10 == 69) {
            ArrayList<LocalMedia> arrayListI = qe.a.i();
            try {
                if (arrayListI.size() == 1) {
                    LocalMedia localMedia = arrayListI.get(0);
                    Uri uriB = com.max.mediaselector.lib.config.a.b(intent);
                    localMedia.p0(uriB != null ? uriB.getPath() : "");
                    localMedia.o0(TextUtils.isEmpty(localMedia.u()) ? false : true);
                    localMedia.j0(com.max.mediaselector.lib.config.a.h(intent));
                    localMedia.g0(com.max.mediaselector.lib.config.a.e(intent));
                    localMedia.k0(com.max.mediaselector.lib.config.a.f(intent));
                    localMedia.l0(com.max.mediaselector.lib.config.a.g(intent));
                    localMedia.m0(com.max.mediaselector.lib.config.a.c(intent));
                    localMedia.n0(com.max.mediaselector.lib.config.a.d(intent));
                    localMedia.P0(localMedia.u());
                } else {
                    JSONArray jSONArray = new JSONArray(intent.getStringExtra("output"));
                    if (jSONArray.length() == arrayListI.size()) {
                        for (int i12 = 0; i12 < arrayListI.size(); i12++) {
                            LocalMedia localMedia2 = arrayListI.get(i12);
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                            localMedia2.p0(jSONObjectOptJSONObject.optString(com.max.mediaselector.lib.config.b.f75074b));
                            localMedia2.o0(!TextUtils.isEmpty(localMedia2.u()));
                            localMedia2.j0(jSONObjectOptJSONObject.optInt(com.max.mediaselector.lib.config.b.f75075c));
                            localMedia2.g0(jSONObjectOptJSONObject.optInt(com.max.mediaselector.lib.config.b.f75076d));
                            localMedia2.k0(jSONObjectOptJSONObject.optInt(com.max.mediaselector.lib.config.b.f75077e));
                            localMedia2.l0(jSONObjectOptJSONObject.optInt(com.max.mediaselector.lib.config.b.f75078f));
                            localMedia2.m0((float) jSONObjectOptJSONObject.optDouble(com.max.mediaselector.lib.config.b.f75079g));
                            localMedia2.n0(jSONObjectOptJSONObject.optString(com.max.mediaselector.lib.config.b.f75073a));
                            localMedia2.P0(localMedia2.u());
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                t.c(getContext(), e10.getMessage());
            }
            ArrayList<LocalMedia> arrayList = new ArrayList<>(arrayListI);
            if (!X3()) {
                G0(arrayList);
            } else {
                showLoading();
                PictureSelectionConfig.X3.a(getContext(), r4(), arrayList, new k());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@n0 Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.f34052bj, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        K();
        H0();
        super.onAttach(context);
        this.f74935l = getActivity();
        if (getParentFragment() instanceof com.max.mediaselector.lib.basic.b) {
            this.f74926c = (com.max.mediaselector.lib.basic.b) getParentFragment();
        } else if (context instanceof com.max.mediaselector.lib.basic.b) {
            this.f74926c = (com.max.mediaselector.lib.basic.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@n0 Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, bb.c.l.f34211ii, new Class[]{Configuration.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        K();
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        Animation animationLoadAnimation;
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34257ki, new Class[]{cls, Boolean.TYPE, cls}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        PictureWindowAnimationStyle pictureWindowAnimationStyleE = PictureSelectionConfig.f75017b4.e();
        if (z10) {
            animationLoadAnimation = pictureWindowAnimationStyleE.f75418b != 0 ? AnimationUtils.loadAnimation(getContext(), pictureWindowAnimationStyleE.f75418b) : AnimationUtils.loadAnimation(getContext(), R.anim.ps_anim_alpha_enter);
            E4(animationLoadAnimation.getDuration());
            k0();
        } else {
            animationLoadAnimation = pictureWindowAnimationStyleE.f75419c != 0 ? AnimationUtils.loadAnimation(getContext(), pictureWindowAnimationStyleE.f75419c) : AnimationUtils.loadAnimation(getContext(), R.anim.ps_anim_alpha_exit);
            T0();
        }
        return animationLoadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.l.f34120ei, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        return I() != 0 ? layoutInflater.inflate(I(), viewGroup, false) : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Yi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        D4();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34075cj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f74935l = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), strArr, iArr}, this, changeQuickRedirect, false, bb.c.l.f34074ci, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (this.f74925b != null) {
            re.a.b().f(iArr, this.f74925b);
            this.f74925b = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.f34234ji, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig != null) {
            bundle.putParcelable(com.max.mediaselector.lib.config.e.f75098c, pictureSelectionConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.l.f34143fi, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f74930g = new com.max.mediaselector.lib.dialog.d(getContext());
        if (bundle != null) {
            this.f74929f = (PictureSelectionConfig) bundle.getParcelable(com.max.mediaselector.lib.config.e.f75098c);
        }
        if (this.f74929f == null) {
            this.f74929f = PictureSelectionConfig.c();
        }
        H4();
        G4(requireView());
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (!pictureSelectionConfig.M || pictureSelectionConfig.f75031c) {
            return;
        }
        SoundPool soundPool = new SoundPool(1, 3, 0);
        this.f74931h = soundPool;
        this.f74932i = soundPool.load(getContext(), R.raw.ps_click_music, 1);
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void p2(String[] strArr) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.f34097di, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (strArr != re.b.f138889b && strArr != re.b.f138890c) {
            z10 = false;
        }
        re.b.f138888a = strArr;
        re.d.a(this, z10, 1102);
    }

    public int p4(LocalMedia localMedia, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34303mi, new Class[]{LocalMedia.class, Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String strA = localMedia.A();
        long jW = localMedia.w();
        long jL = localMedia.L();
        ArrayList<LocalMedia> arrayListI = qe.a.i();
        if (!this.f74929f.P) {
            return Y(z10, strA, qe.a.j(), jL, jW) ? -1 : 200;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayListI.size(); i11++) {
            if (com.max.mediaselector.lib.config.f.i(arrayListI.get(i11).A())) {
                i10++;
            }
        }
        return k3(z10, strA, i10, jL, jW) ? -1 : 200;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34527wi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.M(requireActivity(), new C0604g());
    }

    public boolean q4() {
        FragmentActivity fragmentActivity = this.f74935l;
        return (fragmentActivity instanceof PictureSelectorSupporterActivity) || (fragmentActivity instanceof PictureSelectorTransparentActivity) || (fragmentActivity instanceof com.max.mediaselector.lib.basic.k);
    }

    public boolean r4() {
        return this.f74929f.S;
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void showLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Zi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            if (com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
                return;
            }
            if (this.f74930g.isShowing()) {
                this.f74930g.dismiss();
            }
            this.f74930g.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void t() {
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34571yi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.M(requireActivity(), new h());
    }

    public void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34098dj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            this.f74935l.getSupportFragmentManager().s1();
        }
        List<Fragment> listJ0 = this.f74935l.getSupportFragmentManager().J0();
        for (int i10 = 0; i10 < listJ0.size(); i10++) {
            Fragment fragment = listJ0.get(i10);
            if (fragment instanceof g) {
                ((g) fragment).t();
            }
        }
    }

    public void x1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Xi, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        if (this.f74929f.O3) {
            this.f74935l.setResult(0);
            B4(0, null);
        } else {
            oe.t<LocalMedia> tVar = PictureSelectionConfig.f75020e4;
            if (tVar != null) {
                tVar.onCancel();
            }
        }
        z4();
    }

    public void x4(Context context, boolean z10, ArrayList<LocalMedia> arrayList, final oe.c<ArrayList<LocalMedia>> cVar) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), arrayList, cVar}, this, changeQuickRedirect, false, bb.c.l.Mi, new Class[]{Context.class, Boolean.TYPE, ArrayList.class, oe.c.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!X3()) {
            cVar.a(arrayList);
        } else {
            showLoading();
            PictureSelectionConfig.X3.a(context, z10, arrayList, new oe.c() { // from class: com.max.mediaselector.lib.basic.e
                @Override // oe.c
                public final void a(Object obj) {
                    this.f74921a.t4(cVar, (ArrayList) obj);
                }
            });
        }
    }

    @Override // com.max.mediaselector.lib.basic.c
    public void y1(boolean z10, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), localMedia}, this, changeQuickRedirect, false, bb.c.l.f34417ri, new Class[]{Boolean.TYPE, LocalMedia.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            return;
        }
        List<Fragment> listJ0 = this.f74935l.getSupportFragmentManager().J0();
        for (int i10 = 0; i10 < listJ0.size(); i10++) {
            Fragment fragment = listJ0.get(i10);
            if (fragment instanceof g) {
                ((g) fragment).k2(z10, localMedia);
            }
        }
    }

    public void y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ni, new Class[0], Void.TYPE).isSupported || PictureSelectionConfig.f75022g4 == null) {
            return;
        }
        x4(requireContext(), r4(), new ArrayList<>(qe.a.i()), new a());
    }

    public void z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34144fj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.mediaselector.lib.utils.a.d(this.f74935l)) {
            if (q4()) {
                this.f74935l.finish();
            } else {
                List<Fragment> listJ0 = this.f74935l.getSupportFragmentManager().J0();
                for (int i10 = 0; i10 < listJ0.size(); i10++) {
                    if (listJ0.get(i10) instanceof g) {
                        v4();
                    }
                }
            }
        }
        PictureSelectionConfig.a();
    }
}
