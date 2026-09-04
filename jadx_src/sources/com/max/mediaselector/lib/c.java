package com.max.mediaselector.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.widget.BottomNavBar;
import com.max.mediaselector.lib.widget.CompleteSelectView;
import com.max.mediaselector.lib.widget.EditPictureTextView;
import com.max.mediaselector.lib.widget.RecyclerPreloadView;
import com.max.mediaselector.lib.widget.TitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PictureSelectorFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends com.max.mediaselector.lib.basic.g implements oe.p, com.max.mediaselector.lib.basic.d {
    public static final int J = 69;
    private static final String K = "HEYBOX_UCROP";
    public static final String L = "HEYBOX_UCROP.Multi_OutputUri";
    private static final int M = 135;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.mediaselector.lib.adapter.b A;
    private com.max.mediaselector.lib.dialog.a B;
    private boolean C;
    private com.max.mediaselector.lib.widget.a D;
    public y E;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RecyclerPreloadView f74975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f74976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TitleBar f74977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BottomNavBar f74978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CompleteSelectView f74979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private EditPictureTextView f74980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CheckBox f74981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f74982u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f74984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f74985x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f74987z;
    public static final String I = c.class.getSimpleName();
    public static String N = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f74983v = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f74986y = -1;
    public boolean F = false;
    private boolean G = false;
    private com.max.mediaselector.lib.dialog.d H = null;

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ob, new Class[0], Void.TYPE).isSupported && c.N == null) {
                c.k6();
            }
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class b implements oe.m<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // oe.m
        public void a(List<LocalMediaFolder> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Pb, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            c.j5(c.this, list);
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class C0605c implements oe.m<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0605c() {
        }

        @Override // oe.m
        public void a(List<LocalMediaFolder> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Qb, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            c.j5(c.this, list);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class d extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Rb, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            c.k5(c.this, arrayList, z10);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class e extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Sb, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            c.k5(c.this, arrayList, z10);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class f implements oe.l<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void a(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.Tb, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            c.m5(c.this, localMediaFolder);
        }

        @Override // oe.l
        public /* bridge */ /* synthetic */ void onComplete(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.Ub, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(localMediaFolder);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class g implements oe.l<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void a(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.Vb, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            c.m5(c.this, localMediaFolder);
        }

        @Override // oe.l
        public /* bridge */ /* synthetic */ void onComplete(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.Wb, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(localMediaFolder);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Xb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.f74975n.scrollToPosition(c.this.f74986y);
            c.this.f74975n.setLastVisiblePosition(c.this.f74986y);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class i implements com.max.mediaselector.lib.adapter.b.InterfaceC0600b {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.mediaselector.lib.adapter.b.InterfaceC0600b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34068cc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.t5(c.this);
        }

        @Override // com.max.mediaselector.lib.adapter.b.InterfaceC0600b
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Yb, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.i.a()) {
                return;
            }
            c.this.Q2();
        }

        @Override // com.max.mediaselector.lib.adapter.b.InterfaceC0600b
        public void c(View view, int i10, LocalMedia localMedia) {
            oe.k kVar;
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), localMedia}, this, changeQuickRedirect, false, bb.c.l.f34022ac, new Class[]{View.class, Integer.TYPE, LocalMedia.class}, Void.TYPE).isSupported) {
                return;
            }
            if (((com.max.mediaselector.lib.basic.g) c.this).f74929f.f75040k == 1 && ((com.max.mediaselector.lib.basic.g) c.this).f74929f.f75033d) {
                qe.a.e();
                if (c.this.O0(localMedia, false) == 0) {
                    c.r5(c.this);
                    return;
                }
                return;
            }
            if (com.max.mediaselector.lib.utils.i.a()) {
                return;
            }
            if (!com.max.mediaselector.lib.config.f.e(localMedia.A()) || (kVar = PictureSelectionConfig.f75025j4) == null) {
                c.g5(c.this, i10, false);
            } else {
                kVar.a(c.this.getContext(), localMedia);
            }
        }

        @Override // com.max.mediaselector.lib.adapter.b.InterfaceC0600b
        public void d(View view, int i10) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34045bc, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported || c.this.D == null || !((com.max.mediaselector.lib.basic.g) c.this).f74929f.U3) {
                return;
            }
            ((Vibrator) c.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            c.this.D.p(i10);
        }

        @Override // com.max.mediaselector.lib.adapter.b.InterfaceC0600b
        public int e(View view, int i10, LocalMedia localMedia) {
            Object[] objArr = {view, new Integer(i10), localMedia};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Zb, new Class[]{View.class, cls, LocalMedia.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int iO0 = c.this.O0(localMedia, view.isSelected());
            if (iO0 == 0) {
                view.startAnimation(AnimationUtils.loadAnimation(c.this.getContext(), R.anim.ps_anim_modal_in));
            }
            return iO0;
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class j implements oe.r {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // oe.r
        public void a() {
            me.d dVar;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34114ec, new Class[0], Void.TYPE).isSupported || (dVar = PictureSelectionConfig.W3) == null) {
                return;
            }
            dVar.d(c.this.getContext());
        }

        @Override // oe.r
        public void b() {
            me.d dVar;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34091dc, new Class[0], Void.TYPE).isSupported || (dVar = PictureSelectionConfig.W3) == null) {
                return;
            }
            dVar.a(c.this.getContext());
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Nb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.A.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class l implements oe.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // oe.q
        public void a(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34183hc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 1) {
                c.v5(c.this);
            } else if (i10 == 0) {
                c.w5(c.this);
            }
        }

        @Override // oe.q
        public void b(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34160gc, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            c.u5(c.this);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class m implements com.max.mediaselector.lib.widget.b.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashSet f75000a;

        m(HashSet hashSet) {
            this.f75000a = hashSet;
        }

        @Override // com.max.mediaselector.lib.widget.b.a
        public void a(int i10, int i11, boolean z10, boolean z11) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34228jc, new Class[]{cls, cls, cls2, cls2}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList<LocalMedia> arrayListN = c.this.A.n();
            if (arrayListN.size() == 0 || i10 > arrayListN.size()) {
                return;
            }
            LocalMedia localMedia = arrayListN.get(i10);
            c.this.D.m(c.this.O0(localMedia, qe.a.i().contains(localMedia)) != -1);
        }

        public HashSet<Integer> b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34206ic, new Class[0], HashSet.class);
            if (patchProxyResultProxy.isSupported) {
                return (HashSet) patchProxyResultProxy.result;
            }
            for (int i10 = 0; i10 < qe.a.g(); i10++) {
                this.f75000a.add(Integer.valueOf(qe.a.i().get(i10).f75199l));
            }
            return this.f75000a;
        }

        @Override // com.max.mediaselector.lib.widget.b.a
        public /* bridge */ /* synthetic */ Set t() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34251kc, new Class[0], Set.class);
            return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : b();
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class n implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f75002b;

        n(ArrayList arrayList) {
            this.f75002b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34274lc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.E4(0L);
            c.this.E(false);
            c.this.A.u(this.f75002b);
            if (c.this.A.p()) {
                c.y5(c.this);
            } else {
                c.z5(c.this);
            }
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class o extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34297mc, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            c.A5(c.this, arrayList, z10);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class p extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34320nc, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            c.A5(c.this, arrayList, z10);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34137fc, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.O4(c.this);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class r extends TitleBar.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // com.max.mediaselector.lib.widget.TitleBar.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34366pc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (c.this.B.isShowing()) {
                c.this.B.dismiss();
            } else {
                c.this.x1();
            }
        }

        @Override // com.max.mediaselector.lib.widget.TitleBar.a
        public void b(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34389qc, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.B.showAsDropDown(view);
        }

        @Override // com.max.mediaselector.lib.widget.TitleBar.a
        public void c() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34343oc, new Class[0], Void.TYPE).isSupported && ((com.max.mediaselector.lib.basic.g) c.this).f74929f.f75058x2) {
                if (SystemClock.uptimeMillis() - c.this.f74983v < 500 && c.this.A.getItemCount() > 0) {
                    c.this.f74975n.scrollToPosition(0);
                } else {
                    c.this.f74983v = SystemClock.uptimeMillis();
                }
            }
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class s implements com.max.mediaselector.lib.dialog.a.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.mediaselector.lib.dialog.a.c
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34411rc, new Class[0], Void.TYPE).isSupported || ((com.max.mediaselector.lib.basic.g) c.this).f74929f.K3) {
                return;
            }
            com.max.mediaselector.lib.utils.b.a(c.this.f74977p.getImageArrow(), true);
        }

        @Override // com.max.mediaselector.lib.dialog.a.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34433sc, new Class[0], Void.TYPE).isSupported || ((com.max.mediaselector.lib.basic.g) c.this).f74929f.K3) {
                return;
            }
            com.max.mediaselector.lib.utils.b.a(c.this.f74977p.getImageArrow(), false);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class t implements oe.s {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // oe.s
        public void a(String[] strArr, boolean z10) {
            if (PatchProxy.proxy(new Object[]{strArr, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34455tc, new Class[]{String[].class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                c.F5(c.this);
            } else {
                c.this.p2(strArr);
            }
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class u implements re.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // re.c
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34477uc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.F5(c.this);
        }

        @Override // re.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34499vc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.p2(re.b.f138889b);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class v implements oe.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PictureSelectorFragment.java */
        public class a extends oe.n<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // oe.n
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34543xc, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                c.Z4(c.this, arrayList, z10);
            }
        }

        /* JADX INFO: compiled from: PictureSelectorFragment.java */
        public class b extends oe.n<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // oe.n
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34565yc, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                c.Z4(c.this, arrayList, z10);
            }
        }

        v() {
        }

        @Override // oe.a
        public void a(int i10, LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.f34521wc, new Class[]{Integer.TYPE, LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            c cVar = c.this;
            cVar.f74987z = ((com.max.mediaselector.lib.basic.g) cVar).f74929f.D && localMediaFolder.a() == -1;
            c.this.A.v(c.this.f74987z);
            c.this.f74977p.setTitle(localMediaFolder.h());
            LocalMediaFolder localMediaFolderF = qe.a.f();
            long jA = localMediaFolderF.a();
            if (((com.max.mediaselector.lib.basic.g) c.this).f74929f.f75046p1) {
                if (localMediaFolder.a() != jA) {
                    localMediaFolderF.r(c.this.A.n());
                    localMediaFolderF.p(((com.max.mediaselector.lib.basic.g) c.this).f74927d);
                    localMediaFolderF.z(c.this.f74975n.e());
                    if (localMediaFolder.c().size() > 0) {
                        c.U4(c.this, localMediaFolder.c());
                        ((com.max.mediaselector.lib.basic.g) c.this).f74927d = localMediaFolder.b();
                        c.this.f74975n.setEnabledLoadMore(localMediaFolder.l());
                        c.this.f74975n.smoothScrollToPosition(0);
                    } else {
                        ((com.max.mediaselector.lib.basic.g) c.this).f74927d = 1;
                        me.c cVar2 = PictureSelectionConfig.f75016a4;
                        if (cVar2 != null) {
                            cVar2.b(c.this.getContext(), localMediaFolder.a(), ((com.max.mediaselector.lib.basic.g) c.this).f74927d, ((com.max.mediaselector.lib.basic.g) c.this).f74929f.f75032c0, new a());
                        } else {
                            ((com.max.mediaselector.lib.basic.g) c.this).f74928e.l(localMediaFolder.a(), ((com.max.mediaselector.lib.basic.g) c.this).f74927d, ((com.max.mediaselector.lib.basic.g) c.this).f74929f.f75032c0, new b());
                        }
                    }
                }
            } else if (localMediaFolder.a() != jA) {
                c.U4(c.this, localMediaFolder.c());
                c.this.f74975n.smoothScrollToPosition(0);
            }
            qe.a.k(localMediaFolder);
            c.this.B.dismiss();
            if (c.this.D == null || !((com.max.mediaselector.lib.basic.g) c.this).f74929f.U3) {
                return;
            }
            c.this.D.n(c.this.A.q() ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class w extends BottomNavBar.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // com.max.mediaselector.lib.widget.BottomNavBar.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ac, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.D0();
        }

        @Override // com.max.mediaselector.lib.widget.BottomNavBar.a
        public void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34587zc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.g5(c.this, 0, true);
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ArrayList arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Cc, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList<Uri> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((LocalMedia) it.next()).l());
            }
            ob.a aVar = ob.a.f132240a;
            pb.n nVarN = ob.a.n();
            if (nVarN != null) {
                nVarN.startCrop(c.this.getActivity(), c.this, arrayList2, new HashMap<>());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList<LocalMedia> arrayListI;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Bc, new Class[]{View.class}, Void.TYPE).isSupported || (arrayListI = qe.a.i()) == null || arrayListI.size() <= 0) {
                return;
            }
            for (LocalMedia localMedia : arrayListI) {
                if (com.max.mediaselector.lib.config.f.i(localMedia.A()) || com.max.mediaselector.lib.config.f.f(localMedia.A())) {
                    ob.a aVar = ob.a.f132240a;
                    pb.m mVarH = ob.a.h();
                    if (mVarH != null) {
                        mVarH.a(c.this.getString(R.string.edit_not_support_tips));
                        return;
                    } else {
                        com.max.mediaselector.lib.utils.t.c(((com.max.mediaselector.lib.basic.g) c.this).f74935l, c.this.getString(R.string.edit_not_support_tips));
                        return;
                    }
                }
            }
            c cVar = c.this;
            c.i5(cVar, cVar.requireContext(), c.this.r4(), arrayListI, new oe.c() { // from class: com.max.mediaselector.lib.d
                @Override // oe.c
                public final void a(Object obj) {
                    this.f75172a.b((ArrayList) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: PictureSelectorFragment.java */
    public interface y {
        void a();
    }

    static /* synthetic */ void A5(c cVar, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Mb, new Class[]{c.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.P5(list, z10);
    }

    static /* synthetic */ void F5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.f34542xb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.I5();
    }

    private void G5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Pa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.B.j(new v());
    }

    private void H5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34136fb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.A.w(new i());
        this.f74975n.setOnRecyclerViewScrollStateListener(new j());
        this.f74975n.setOnRecyclerViewScrollListener(new l());
        if (this.f74929f.U3) {
            com.max.mediaselector.lib.widget.a aVarV = new com.max.mediaselector.lib.widget.a().n(this.A.q() ? 1 : 0).v(new com.max.mediaselector.lib.widget.b(new m(new HashSet())));
            this.D = aVarV;
            this.f74975n.addOnItemTouchListener(aVarV);
        }
    }

    private void I5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Na, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74929f.K3) {
            A3();
        } else {
            y2();
        }
    }

    private boolean J5(boolean z10) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Da, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig.f75060y1) {
            if (pictureSelectionConfig.P) {
                if (pictureSelectionConfig.f75040k != 1) {
                    if (qe.a.g() == this.f74929f.f75041l) {
                        return true;
                    }
                    if (!z10 && qe.a.g() == this.f74929f.f75041l - 1) {
                        return true;
                    }
                }
            } else {
                if (qe.a.g() == 0) {
                    return true;
                }
                if (z10 && qe.a.g() == 1) {
                    return true;
                }
                if (com.max.mediaselector.lib.config.f.i(qe.a.j())) {
                    PictureSelectionConfig pictureSelectionConfig2 = this.f74929f;
                    int i10 = pictureSelectionConfig2.f75043n;
                    if (i10 <= 0) {
                        i10 = pictureSelectionConfig2.f75041l;
                    }
                    if (qe.a.g() == i10) {
                        return true;
                    }
                    if (!z10 && qe.a.g() == i10 - 1) {
                        return true;
                    }
                } else {
                    if (qe.a.g() == this.f74929f.f75041l) {
                        return true;
                    }
                    if (!z10 && qe.a.g() == this.f74929f.f75041l - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private int L5(long j10) {
        if (j10 != -1) {
            return this.f74929f.f75032c0;
        }
        int i10 = this.f74984w;
        int i11 = i10 > 0 ? this.f74929f.f75032c0 - i10 : this.f74929f.f75032c0;
        this.f74984w = 0;
        return i11;
    }

    private void M5(List<LocalMediaFolder> list) {
        LocalMediaFolder localMediaFolderF;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Ya, new Class[]{List.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            o6();
            return;
        }
        if (qe.a.f() != null) {
            localMediaFolderF = qe.a.f();
        } else {
            localMediaFolderF = list.get(0);
            qe.a.k(localMediaFolderF);
        }
        this.f74977p.setTitle(localMediaFolderF.h());
        this.B.b(list);
        if (this.f74929f.f75046p1) {
            s3(localMediaFolderF.a());
        } else {
            l6(localMediaFolderF.c());
        }
    }

    private void N5(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34021ab, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        this.f74975n.setEnabledLoadMore(z10);
        if (this.f74975n.e() && arrayList.size() == 0) {
            C2();
        } else {
            l6(arrayList);
        }
        i6();
    }

    static /* synthetic */ void O4(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.f34520wb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.i4();
    }

    private void O5(LocalMediaFolder localMediaFolder) {
        if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.f34067cb, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        String str = this.f74929f.Y;
        boolean z10 = localMediaFolder != null;
        this.f74977p.setTitle(z10 ? localMediaFolder.h() : new File(str).getName());
        if (!z10) {
            o6();
            return;
        }
        qe.a.k(localMediaFolder);
        l6(localMediaFolder.c());
        i6();
    }

    private void P5(List<LocalMedia> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34319nb, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        this.f74975n.setEnabledLoadMore(z10);
        if (this.f74975n.e()) {
            if (list.size() > 0) {
                int size = this.A.n().size();
                this.A.n().addAll(list);
                com.max.mediaselector.lib.adapter.b bVar = this.A;
                bVar.notifyItemRangeChanged(size, bVar.getItemCount());
            } else {
                C2();
            }
            if (list.size() < 10) {
                RecyclerPreloadView recyclerPreloadView = this.f74975n;
                recyclerPreloadView.onScrolled(recyclerPreloadView.getScrollX(), this.f74975n.getScrollY());
            }
        }
    }

    private void Q5(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Qa, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        this.f74975n.setEnabledLoadMore(z10);
        if (arrayList.size() == 0) {
            this.A.n().clear();
        }
        l6(arrayList);
        this.f74975n.onScrolled(0, 0);
        this.f74975n.smoothScrollToPosition(0);
    }

    private void S5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34205ib, new Class[0], Void.TYPE).isSupported && this.f74929f.T3 && this.A.n().size() > 0) {
            this.f74982u.animate().setDuration(250L).alpha(0.0f).start();
        }
    }

    private void T5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34432sb, new Class[0], Void.TYPE).isSupported && this.f74976o.getVisibility() == 0) {
            this.f74976o.setVisibility(8);
        }
    }

    static /* synthetic */ void U4(c cVar, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{cVar, arrayList}, null, changeQuickRedirect, true, bb.c.l.f34564yb, new Class[]{c.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.l6(arrayList);
    }

    private void U5() {
        com.max.mediaselector.lib.dialog.d dVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34476ub, new Class[0], Void.TYPE).isSupported || (dVar = this.H) == null) {
            return;
        }
        dVar.dismiss();
        this.H = null;
    }

    private void V5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.La, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.lib.dialog.a aVarC = com.max.mediaselector.lib.dialog.a.c(getContext());
        this.B = aVarC;
        aVarC.k(new s());
        G5();
    }

    private void W5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ra, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74978q.setBottomNavBarStyle();
        this.f74978q.setOnBottomNavBarListener(new w());
        this.f74978q.setSelectedChange();
    }

    private void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ia, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig.f75040k == 1 && pictureSelectionConfig.f75033d) {
            PictureSelectionConfig.f75017b4.d().E(false);
            this.f74977p.getTitleCancelView().setVisibility(0);
            this.f74979r.setVisibility(8);
            return;
        }
        this.f74979r.setCompleteSelectViewStyle();
        this.f74979r.setSelectedChange(false);
        if (PictureSelectionConfig.f75017b4.c().g0()) {
            if (this.f74979r.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f74979r.getLayoutParams();
                int i10 = R.id.title_bar;
                layoutParams.f19300h = i10;
                ((ConstraintLayout.LayoutParams) this.f74979r.getLayoutParams()).f19306k = i10;
                if (this.f74929f.K) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f74979r.getLayoutParams())).topMargin = com.max.mediaselector.lib.utils.h.j(getContext());
                }
            } else if ((this.f74979r.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f74929f.K) {
                ((RelativeLayout.LayoutParams) this.f74979r.getLayoutParams()).topMargin = com.max.mediaselector.lib.utils.h.j(getContext());
            }
        }
        this.f74979r.setOnClickListener(new q());
    }

    static /* synthetic */ void Z4(c cVar, ArrayList arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34586zb, new Class[]{c.class, ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.Q5(arrayList, z10);
    }

    private void Z5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ta, new Class[0], Void.TYPE).isSupported && this.f74929f.S3) {
            this.f74981t.setVisibility(0);
            this.f74981t.setChecked(this.f74929f.S);
            this.f74981t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.mediaselector.lib.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    this.f74920b.e6(compoundButton, z10);
                }
            });
        }
    }

    private void a6(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34113eb, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f74975n = (RecyclerPreloadView) view.findViewById(R.id.recycler);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        int iG = selectMainStyleC.G();
        if (com.max.mediaselector.lib.utils.s.c(iG)) {
            this.f74975n.setBackgroundColor(iG);
        } else {
            this.f74975n.setBackgroundColor(androidx.core.content.d.f(getContext(), R.color.ps_color_black));
        }
        int i10 = this.f74929f.f75056x;
        if (i10 <= 0) {
            i10 = 4;
        }
        if (this.f74975n.getItemDecorationCount() == 0) {
            if (com.max.mediaselector.lib.utils.s.b(selectMainStyleC.r())) {
                this.f74975n.addItemDecoration(new le.a(i10, selectMainStyleC.r(), selectMainStyleC.f0()));
            } else {
                this.f74975n.addItemDecoration(new le.a(i10, com.max.mediaselector.lib.utils.h.a(view.getContext(), 1.0f), selectMainStyleC.f0()));
            }
        }
        this.f74975n.setLayoutManager(new GridLayoutManager(getContext(), i10));
        RecyclerView.ItemAnimator itemAnimator = this.f74975n.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f74975n.setItemAnimator(null);
        }
        if (this.f74929f.f75046p1) {
            this.f74975n.setReachBottomRow(2);
            this.f74975n.setOnRecyclerViewPreloadListener(this);
        } else {
            this.f74975n.setHasFixedSize(true);
        }
        com.max.mediaselector.lib.adapter.b bVar = new com.max.mediaselector.lib.adapter.b(getContext(), this.f74929f);
        this.A = bVar;
        bVar.v(this.f74987z);
        int i11 = this.f74929f.f75047p2;
        if (i11 == 1) {
            this.f74975n.setAdapter(new je.a(this.A));
        } else if (i11 != 2) {
            this.f74975n.setAdapter(this.A);
        } else {
            this.f74975n.setAdapter(new je.d(this.A));
        }
        H5();
    }

    private void b6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ka, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (PictureSelectionConfig.f75017b4.d().B()) {
            this.f74977p.setVisibility(8);
        }
        this.f74977p.setTitleBarStyle();
        this.f74977p.setOnTitleBarListener(new r());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    private void c6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Sa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (PictureSelectionConfig.c().V3) {
            ob.a aVar = ob.a.f132240a;
            if (ob.a.n() == null) {
                this.f74980s.setVisibility(8);
            }
        } else {
            this.f74980s.setVisibility(8);
        }
        this.f74980s.setSelectedChange();
        this.f74980s.setOnClickListener(new x());
        new Handler().postDelayed(new a(), 300L);
    }

    private boolean d6(int i10) {
        int i11;
        return i10 != 0 && (i11 = this.f74985x) > 0 && i11 < i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e6(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34498vb, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f74929f.S = z10;
        this.f74981t.setChecked(z10);
    }

    private void f6(LocalMedia localMedia) {
        LocalMediaFolder localMediaFolderG;
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, 10539, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.B.h() == 0) {
            localMediaFolderG = new LocalMediaFolder();
            localMediaFolderG.w(getString(this.f74929f.f75029b == com.max.mediaselector.lib.config.h.b() ? R.string.ps_all_audio : R.string.ps_camera_roll));
            localMediaFolderG.u("");
            localMediaFolderG.o(-1L);
            this.B.e().add(0, localMediaFolderG);
        } else {
            localMediaFolderG = this.B.g(0);
        }
        localMediaFolderG.u(localMedia.E());
        localMediaFolderG.v(localMedia.A());
        localMediaFolderG.r(this.A.n());
        localMediaFolderG.o(-1L);
        localMediaFolderG.y(d6(localMediaFolderG.j()) ? localMediaFolderG.j() : localMediaFolderG.j() + 1);
        if (qe.a.f() == null) {
            qe.a.k(localMediaFolderG);
        }
        LocalMediaFolder localMediaFolder = null;
        List<LocalMediaFolder> listE = this.B.e();
        for (int i10 = 0; i10 < listE.size(); i10++) {
            LocalMediaFolder localMediaFolder2 = listE.get(i10);
            if (TextUtils.equals(localMediaFolder2.h(), localMedia.D())) {
                localMediaFolder = localMediaFolder2;
                break;
            }
        }
        if (localMediaFolder == null) {
            localMediaFolder = new LocalMediaFolder();
            localMediaFolder.w(localMedia.D());
            localMediaFolder.o(localMedia.c());
            if (!TextUtils.isEmpty(this.f74929f.W) || !TextUtils.isEmpty(this.f74929f.X)) {
                localMediaFolder.c().add(0, localMedia);
            }
            listE.add(localMediaFolder);
        } else {
            if ((!this.f74929f.f75046p1 && !d6(localMediaFolderG.j())) || !TextUtils.isEmpty(this.f74929f.W) || !TextUtils.isEmpty(this.f74929f.X)) {
                localMediaFolder.c().add(0, localMedia);
            }
            if (localMediaFolder.a() == -1 || localMediaFolder.a() == 0) {
                localMediaFolder.o(localMedia.c());
            }
        }
        localMediaFolder.y(d6(localMediaFolderG.j()) ? localMediaFolder.j() : 1 + localMediaFolder.j());
        localMediaFolder.u(this.f74929f.f75028a0);
        localMediaFolder.v(localMedia.A());
        this.B.b(listE);
    }

    static /* synthetic */ void g5(c cVar, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Ab, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.h6(i10, z10);
    }

    public static c g6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.f34519wa, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c cVar = new c();
        cVar.setArguments(new Bundle());
        return cVar;
    }

    private void h6(int i10, boolean z10) {
        ArrayList<LocalMedia> arrayListN;
        int iJ;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34227jb, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        String str = PictureSelectorPreviewFragment.U;
        if (com.max.mediaselector.lib.utils.a.b(activity, str)) {
            long jA = 0;
            if (z10) {
                ArrayList<LocalMedia> arrayList = new ArrayList<>(qe.a.i());
                arrayListN = arrayList;
                iJ = arrayList.size();
            } else {
                arrayListN = this.A.n();
                iJ = qe.a.f().j();
                jA = qe.a.f().a();
            }
            if (!z10) {
                PictureSelectionConfig pictureSelectionConfig = this.f74929f;
                if (pictureSelectionConfig.L) {
                    com.max.mediaselector.lib.magical.a.c(this.f74975n, pictureSelectionConfig.K ? 0 : com.max.mediaselector.lib.utils.h.j(getContext()));
                }
            }
            oe.k kVar = PictureSelectionConfig.f75025j4;
            if (kVar != null) {
                kVar.b(getContext(), i10, iJ, this.f74927d, jA, this.f74977p.getTitleText(), this.A.q(), arrayListN, z10);
            } else if (com.max.mediaselector.lib.utils.a.b(getActivity(), str)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragmentM6 = PictureSelectorPreviewFragment.m6();
                pictureSelectorPreviewFragmentM6.u6(z10, this.f74977p.getTitleText(), this.A.q(), i10, iJ, this.f74927d, jA, arrayListN, !this.F);
                com.max.mediaselector.lib.basic.a.a(getActivity(), str, pictureSelectorPreviewFragmentM6);
            }
        }
    }

    static /* synthetic */ void i5(c cVar, Context context, boolean z10, ArrayList arrayList, oe.c cVar2) {
        if (PatchProxy.proxy(new Object[]{cVar, context, new Byte(z10 ? (byte) 1 : (byte) 0), arrayList, cVar2}, null, changeQuickRedirect, true, bb.c.l.Bb, new Class[]{c.class, Context.class, Boolean.TYPE, ArrayList.class, oe.c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.x4(context, z10, arrayList, cVar2);
    }

    private void i6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34090db, new Class[0], Void.TYPE).isSupported && this.f74986y > 0) {
            this.f74975n.post(new h());
        }
    }

    static /* synthetic */ void j5(c cVar, List list) {
        if (PatchProxy.proxy(new Object[]{cVar, list}, null, changeQuickRedirect, true, bb.c.l.Cb, new Class[]{c.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.M5(list);
    }

    static /* synthetic */ void k5(c cVar, ArrayList arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Db, new Class[]{c.class, ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.N5(arrayList, z10);
    }

    public static void k6() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.f34497va, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ob.a aVar = ob.a.f132240a;
        N = ob.a.f().a();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void l6(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.f34250kb, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        requireView().postDelayed(new n(arrayList), j4());
    }

    static /* synthetic */ void m5(c cVar, LocalMediaFolder localMediaFolder) {
        if (PatchProxy.proxy(new Object[]{cVar, localMediaFolder}, null, changeQuickRedirect, true, bb.c.l.Eb, new Class[]{c.class, LocalMediaFolder.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.O5(localMediaFolder);
    }

    private void m6() {
        int firstVisiblePosition;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34159gb, new Class[0], Void.TYPE).isSupported || !this.f74929f.T3 || (firstVisiblePosition = this.f74975n.getFirstVisiblePosition()) == -1) {
            return;
        }
        ArrayList<LocalMedia> arrayListN = this.A.n();
        if (arrayListN.size() <= firstVisiblePosition || arrayListN.get(firstVisiblePosition).v() <= 0) {
            return;
        }
        this.f74982u.setText(com.max.mediaselector.lib.utils.g.g(getContext(), arrayListN.get(firstVisiblePosition).v()));
    }

    private void n6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34182hb, new Class[0], Void.TYPE).isSupported && this.f74929f.T3 && this.A.n().size() > 0 && this.f74982u.getAlpha() == 0.0f) {
            this.f74982u.animate().setDuration(150L).alphaBy(1.0f).start();
        }
    }

    private void o6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34410rb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74976o.getVisibility() == 8) {
            this.f74976o.setVisibility(0);
        }
        this.f74976o.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ps_ic_no_data, 0, 0);
        this.f74976o.setText(getString(this.f74929f.f75029b == com.max.mediaselector.lib.config.h.b() ? R.string.ps_audio_empty : R.string.ps_empty));
    }

    private void p6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34454tb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.H == null) {
            this.H = new com.max.mediaselector.lib.dialog.d(this.f74935l);
        }
        if (this.H.isShowing()) {
            return;
        }
        this.H.show();
    }

    static /* synthetic */ void r5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Fb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.i4();
    }

    static /* synthetic */ void t5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Gb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.U5();
    }

    static /* synthetic */ void u5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Hb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.m6();
    }

    static /* synthetic */ void v5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Ib, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.n6();
    }

    static /* synthetic */ void w5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Jb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.S5();
    }

    static /* synthetic */ void y5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Kb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.o6();
    }

    static /* synthetic */ void z5(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.l.Lb, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.T5();
    }

    @Override // com.max.mediaselector.lib.basic.d
    public void A3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34044bb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        me.c cVar = PictureSelectionConfig.f75016a4;
        if (cVar != null) {
            cVar.d(getContext(), new f());
        } else {
            this.f74928e.j(new g());
        }
    }

    @Override // oe.p
    public void C2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34273lb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        X1();
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void E(boolean z10) {
        int i10 = 0;
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Ba, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && PictureSelectionConfig.f75017b4.c().n0()) {
            while (i10 < qe.a.g()) {
                LocalMedia localMedia = qe.a.i().get(i10);
                i10++;
                localMedia.G0(i10);
                if (z10) {
                    this.A.r(localMedia.f75199l);
                }
            }
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void H1(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.l.Oa, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        oe.j jVar = PictureSelectionConfig.f75023h4;
        if (jVar != null ? jVar.b(this, strArr) : re.a.d(getContext())) {
            I5();
        } else {
            com.max.mediaselector.lib.utils.t.c(getContext(), getString(R.string.ps_jurisdiction));
            x1();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public int I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34541xa, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = com.max.mediaselector.lib.config.d.a(getContext(), 1);
        return iA != 0 ? iA : R.layout.ps_fragment_selector;
    }

    public void K5(Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.l.Wa, new Class[]{Intent.class}, Void.TYPE).isSupported || intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri")) == null || parcelableArrayListExtra.size() <= 0) {
            return;
        }
        ArrayList<LocalMedia> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < parcelableArrayListExtra.size(); i10++) {
            arrayList.add(V3(((Uri) parcelableArrayListExtra.get(i10)).getPath()));
        }
        G0(arrayList);
    }

    public boolean L0() {
        return this.G;
    }

    public void R5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34585za, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.F = true;
        this.f74978q.setVisibility(8);
        this.f74979r.setVisibility(8);
        this.f74980s.setVisibility(8);
        this.f74981t.setVisibility(8);
    }

    @Override // com.max.mediaselector.lib.basic.d
    public void X1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34296mb, new Class[0], Void.TYPE).isSupported && this.f74975n.e()) {
            this.f74927d++;
            LocalMediaFolder localMediaFolderF = qe.a.f();
            long jA = localMediaFolderF != null ? localMediaFolderF.a() : 0L;
            me.c cVar = PictureSelectionConfig.f75016a4;
            if (cVar != null) {
                cVar.c(getContext(), jA, this.f74927d, L5(jA), this.f74929f.f75032c0, new o());
            } else {
                this.f74928e.k(jA, this.f74927d, L5(jA), this.f74929f.f75032c0, new p());
            }
        }
    }

    public void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ja, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74929f.f75046p1) {
            this.f74928e = new com.max.mediaselector.lib.loader.d(getContext(), this.f74929f);
        } else {
            this.f74928e = new com.max.mediaselector.lib.loader.b(getContext(), this.f74929f);
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void Z0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ca, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74978q.setOriginalCheck();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void c0(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34342ob, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.C) {
            this.C = false;
            qe.a.b(localMedia);
            this.A.r(this.f74929f.D ? 1 : 0);
            if (this.f74929f.f75033d) {
                i4();
                return;
            }
            return;
        }
        if (!d6(this.B.f())) {
            this.A.n().add(0, localMedia);
            this.f74984w++;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f74929f;
        if (pictureSelectionConfig.f75040k == 1 && pictureSelectionConfig.f75033d) {
            qe.a.e();
            if (O0(localMedia, false) == 0) {
                i4();
            }
        } else {
            O0(localMedia, false);
        }
        this.A.notifyItemInserted(this.f74929f.D ? 1 : 0);
        com.max.mediaselector.lib.adapter.b bVar = this.A;
        bVar.notifyItemRangeChanged(this.f74929f.D ? 1 : 0, bVar.n().size());
        if (!this.f74929f.K3) {
            f6(localMedia);
        } else if (qe.a.f() == null) {
            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
            localMediaFolder.o(com.max.mediaselector.lib.utils.u.j(Integer.valueOf(localMedia.D().hashCode())));
            localMediaFolder.w(localMedia.D());
            localMediaFolder.v(localMedia.A());
            localMediaFolder.u(localMedia.E());
            localMediaFolder.y(this.A.n().size());
            localMediaFolder.p(this.f74927d);
            localMediaFolder.z(false);
            this.f74975n.setEnabledLoadMore(false);
            qe.a.k(localMediaFolder);
        }
        this.f74985x = 0;
        if (this.A.n().size() > 0 || this.f74929f.f75033d) {
            T5();
        } else {
            o6();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void i1(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.Aa, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        this.A.r(localMedia.f75199l);
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void j0(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.Ha, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.j0(bundle);
        if (bundle == null) {
            this.f74987z = this.f74929f.D;
            return;
        }
        this.f74985x = bundle.getInt(com.max.mediaselector.lib.config.e.f75100e);
        this.f74927d = bundle.getInt(com.max.mediaselector.lib.config.e.f75106k, this.f74927d);
        this.f74986y = bundle.getInt(com.max.mediaselector.lib.config.e.f75109n, this.f74986y);
        this.f74987z = bundle.getBoolean(com.max.mediaselector.lib.config.e.f75103h, this.f74929f.D);
    }

    public void j6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ma, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.A.v(this.f74987z);
        if (re.a.d(getContext())) {
            I5();
            return;
        }
        oe.j jVar = PictureSelectionConfig.f75023h4;
        if (jVar != null) {
            jVar.a(this, re.b.f138889b, new t());
        } else {
            re.a.b().i(this, re.b.f138889b, new u());
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    @SuppressLint({"NotifyDataSetChanged"})
    public void k2(boolean z10, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), localMedia}, this, changeQuickRedirect, false, bb.c.l.f34563ya, new Class[]{Boolean.TYPE, LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f74978q.setSelectedChange();
        this.f74979r.setSelectedChange(false);
        this.f74980s.setSelectedChange();
        y yVar = this.E;
        if (yVar != null) {
            yVar.a();
        }
        if (J5(z10)) {
            this.A.r(localMedia.f75199l);
            this.f74975n.postDelayed(new k(), 135L);
        } else {
            this.A.r(localMedia.f75199l);
        }
        if (z10) {
            return;
        }
        E(true);
    }

    @Override // com.max.mediaselector.lib.basic.g
    public String k4() {
        return I;
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Va, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 69) {
            super.onActivityResult(i10, i11, intent);
        } else if (i11 == -1) {
            K5(intent);
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ua, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        N = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34388qb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        this.G = false;
        com.max.mediaselector.lib.widget.a aVar = this.D;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.Ea, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putInt(com.max.mediaselector.lib.config.e.f75100e, this.f74985x);
        bundle.putInt(com.max.mediaselector.lib.config.e.f75106k, this.f74927d);
        bundle.putInt(com.max.mediaselector.lib.config.e.f75109n, this.f74975n.getLastVisiblePosition());
        bundle.putBoolean(com.max.mediaselector.lib.config.e.f75103h, this.A.q());
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.l.Fa, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        j0(bundle);
        this.C = bundle != null;
        this.f74976o = (TextView) view.findViewById(R.id.tv_data_empty);
        this.f74979r = (CompleteSelectView) view.findViewById(R.id.ps_complete_select);
        this.f74980s = (EditPictureTextView) view.findViewById(R.id.tv_edit);
        this.f74981t = (CheckBox) view.findViewById(R.id.cb_original);
        this.f74977p = (TitleBar) view.findViewById(R.id.title_bar);
        this.f74978q = (BottomNavBar) view.findViewById(R.id.bottom_nar_bar);
        this.f74982u = (TextView) view.findViewById(R.id.tv_current_data_time);
        Y5();
        V5();
        b6();
        X5();
        a6(view);
        W5();
        c6();
        Z5();
        j6();
        this.G = true;
        if (this.F) {
            R5();
        }
        p6();
    }

    @Override // com.max.mediaselector.lib.basic.d
    public void s3(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.l.Za, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f74975n.setEnabledLoadMore(true);
        me.c cVar = PictureSelectionConfig.f75016a4;
        if (cVar == null) {
            this.f74928e.i(j10, this.f74927d * this.f74929f.f75032c0, new e());
            return;
        }
        Context context = getContext();
        int i10 = this.f74927d;
        cVar.b(context, j10, i10, i10 * this.f74929f.f75032c0, new d());
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ga, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G4(requireView());
    }

    @Override // com.max.mediaselector.lib.basic.d
    public void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Xa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        me.c cVar = PictureSelectionConfig.f75016a4;
        if (cVar != null) {
            cVar.a(getContext(), new b());
        } else {
            this.f74928e.h(new C0605c());
        }
    }
}
