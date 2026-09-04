package com.max.mediaselector.lib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.decoration.WrapContentLinearLayoutManager;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.magical.MagicalView;
import com.max.mediaselector.lib.magical.ViewParams;
import com.max.mediaselector.lib.style.PictureWindowAnimationStyle;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.widget.BottomNavBar;
import com.max.mediaselector.lib.widget.CompleteSelectView;
import com.max.mediaselector.lib.widget.EditPictureTextView;
import com.max.mediaselector.lib.widget.PreviewBottomNavBar;
import com.max.mediaselector.lib.widget.PreviewTitleBar;
import com.max.mediaselector.lib.widget.TitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PictureSelectorPreviewFragment extends com.max.mediaselector.lib.basic.g {
    public static final String U = PictureSelectorPreviewFragment.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;
    private boolean B;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private TextView I;
    private TextView J;
    private View K;
    private CompleteSelectView L;
    private EditPictureTextView M;
    private CheckBox N;
    private RecyclerView Q;
    private com.max.mediaselector.lib.adapter.holder.g R;
    private List<View> S;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PreviewTitleBar f74757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PreviewBottomNavBar f74758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MagicalView f74759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ViewPager2 f74760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.max.mediaselector.lib.adapter.d f74761s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f74763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f74764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f74765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f74766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f74767y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f74768z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<LocalMedia> f74756n = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f74762t = true;
    private boolean C = true;
    private long H = -1;
    private boolean O = true;
    private boolean P = false;
    private final ViewPager2.OnPageChangeCallback T = new l();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Td, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.V4(PictureSelectorPreviewFragment.this);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Ud, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureSelectorPreviewFragment.this.A) {
                PictureSelectorPreviewFragment.V4(PictureSelectorPreviewFragment.this);
                return;
            }
            LocalMedia localMedia = (LocalMedia) PictureSelectorPreviewFragment.this.f74756n.get(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.O0(localMedia, pictureSelectorPreviewFragment.I.isSelected()) == 0) {
                PictureSelectorPreviewFragment.this.I.startAnimation(AnimationUtils.loadAnimation(PictureSelectorPreviewFragment.this.getContext(), R.anim.ps_anim_modal_in));
            }
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Vd, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.this.K.performClick();
        }
    }

    public class d implements com.max.mediaselector.lib.adapter.holder.g.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f74775b;

            a(int i10) {
                this.f74775b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Yd, new Class[0], Void.TYPE).isSupported && ((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L) {
                    PictureSelectorPreviewFragment.this.f74761s.s(this.f74775b);
                }
            }
        }

        d() {
        }

        @Override // com.max.mediaselector.lib.adapter.holder.g.c
        public void a(int i10, LocalMedia localMedia, View view) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), localMedia, view}, this, changeQuickRedirect, false, bb.c.l.Xd, new Class[]{Integer.TYPE, LocalMedia.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureSelectorPreviewFragment.this.f74764v || TextUtils.equals(PictureSelectorPreviewFragment.this.f74767y, PictureSelectorPreviewFragment.this.getString(R.string.ps_camera_roll)) || TextUtils.equals(localMedia.D(), PictureSelectorPreviewFragment.this.f74767y)) {
                if (!PictureSelectorPreviewFragment.this.f74764v) {
                    i10 = PictureSelectorPreviewFragment.this.f74768z ? localMedia.f75199l - 1 : localMedia.f75199l;
                }
                if (i10 == PictureSelectorPreviewFragment.this.f74760r.getCurrentItem() && localMedia.M()) {
                    return;
                }
                if (PictureSelectorPreviewFragment.this.f74760r.getAdapter() != null) {
                    PictureSelectorPreviewFragment.this.f74760r.setAdapter(null);
                    PictureSelectorPreviewFragment.this.f74760r.setAdapter(PictureSelectorPreviewFragment.this.f74761s);
                }
                PictureSelectorPreviewFragment.this.f74760r.setCurrentItem(i10, false);
                PictureSelectorPreviewFragment.a5(PictureSelectorPreviewFragment.this, localMedia);
                PictureSelectorPreviewFragment.this.f74760r.post(new a(i10));
            }
        }
    }

    public class e extends ItemTouchHelper.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a extends AnimatorListenerAdapter {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34139fe, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                PictureSelectorPreviewFragment.this.P = true;
            }
        }

        public class b extends AnimatorListenerAdapter {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34162ge, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                PictureSelectorPreviewFragment.this.O = true;
            }
        }

        e() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder) {
            int iS;
            if (PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, bb.c.l.f34116ee, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            viewHolder.itemView.setAlpha(1.0f);
            if (PictureSelectorPreviewFragment.this.P) {
                PictureSelectorPreviewFragment.this.P = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.1f, 1.0f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.1f, 1.0f));
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.setDuration(50L);
                animatorSet.start();
                animatorSet.addListener(new b());
            }
            super.clearView(recyclerView, viewHolder);
            PictureSelectorPreviewFragment.this.R.notifyItemChanged(viewHolder.getAbsoluteAdapterPosition());
            if (PictureSelectorPreviewFragment.this.f74764v && PictureSelectorPreviewFragment.this.f74760r.getCurrentItem() != (iS = PictureSelectorPreviewFragment.this.R.s()) && iS != -1) {
                PictureSelectorPreviewFragment.this.f74760r.setCurrentItem(iS, false);
            }
            if (!PictureSelectionConfig.f75017b4.c().n0() || com.max.mediaselector.lib.utils.a.d(PictureSelectorPreviewFragment.this.getActivity())) {
                return;
            }
            List<Fragment> listJ0 = PictureSelectorPreviewFragment.this.getActivity().getSupportFragmentManager().J0();
            for (int i10 = 0; i10 < listJ0.size(); i10++) {
                Fragment fragment = listJ0.get(i10);
                if (fragment instanceof com.max.mediaselector.lib.basic.g) {
                    ((com.max.mediaselector.lib.basic.g) fragment).E(true);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public long getAnimationDuration(@n0 RecyclerView recyclerView, int i10, float f10, float f11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34093de, new Class[]{RecyclerView.class, Integer.TYPE, cls, cls}, Long.TYPE);
            return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : super.getAnimationDuration(recyclerView, i10, f10, f11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, bb.c.l.Zd, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            viewHolder.itemView.setAlpha(0.7f);
            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(@n0 Canvas canvas, @n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
            Object[] objArr = {canvas, recyclerView, viewHolder, new Float(f10), new Float(f11), new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34047be, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.ViewHolder.class, cls, cls, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureSelectorPreviewFragment.this.O) {
                PictureSelectorPreviewFragment.this.O = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.0f, 1.1f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.0f, 1.1f));
                animatorSet.setDuration(50L);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.start();
                animatorSet.addListener(new a());
            }
            super.onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@n0 RecyclerView recyclerView, @n0 RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, bb.c.l.f34024ae, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            try {
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                    int i10 = absoluteAdapterPosition;
                    while (i10 < absoluteAdapterPosition2) {
                        int i11 = i10 + 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.R.r(), i10, i11);
                        Collections.swap(qe.a.i(), i10, i11);
                        if (PictureSelectorPreviewFragment.this.f74764v) {
                            Collections.swap(PictureSelectorPreviewFragment.this.f74756n, i10, i11);
                        }
                        i10 = i11;
                    }
                } else {
                    for (int i12 = absoluteAdapterPosition; i12 > absoluteAdapterPosition2; i12--) {
                        int i13 = i12 - 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.R.r(), i12, i13);
                        Collections.swap(qe.a.i(), i12, i13);
                        if (PictureSelectorPreviewFragment.this.f74764v) {
                            Collections.swap(PictureSelectorPreviewFragment.this.f74756n, i12, i13);
                        }
                    }
                }
                PictureSelectorPreviewFragment.this.R.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(@p0 RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34070ce, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onSelectedChanged(viewHolder, i10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    public class f implements com.max.mediaselector.lib.adapter.holder.g.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ItemTouchHelper f74780a;

        f(ItemTouchHelper itemTouchHelper) {
            this.f74780a = itemTouchHelper;
        }

        @Override // com.max.mediaselector.lib.adapter.holder.g.d
        public void a(RecyclerView.ViewHolder viewHolder, int i10, View view) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10), view}, this, changeQuickRedirect, false, bb.c.l.f34185he, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((Vibrator) PictureSelectorPreviewFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            if (PictureSelectorPreviewFragment.this.R.getItemCount() != ((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.f75041l) {
                this.f74780a.startDrag(viewHolder);
            } else if (viewHolder.getLayoutPosition() != PictureSelectorPreviewFragment.this.R.getItemCount() - 1) {
                this.f74780a.startDrag(viewHolder);
            }
        }
    }

    public class g extends BottomNavBar.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.mediaselector.lib.widget.BottomNavBar.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34230je, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.this.D0();
        }

        @Override // com.max.mediaselector.lib.widget.BottomNavBar.a
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34208ie, new Class[0], Void.TYPE).isSupported || PictureSelectionConfig.f75022g4 == null) {
                return;
            }
            LocalMedia localMedia = (LocalMedia) PictureSelectorPreviewFragment.this.f74756n.get(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem());
            oe.i iVar = PictureSelectionConfig.f75022g4;
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            iVar.a(pictureSelectorPreviewFragment, localMedia, pictureSelectorPreviewFragment.f74756n, 696);
        }

        @Override // com.max.mediaselector.lib.widget.BottomNavBar.a
        public void c() {
            int currentItem;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34253ke, new Class[0], Void.TYPE).isSupported && PictureSelectorPreviewFragment.this.f74756n.size() > (currentItem = PictureSelectorPreviewFragment.this.f74760r.getCurrentItem())) {
                PictureSelectorPreviewFragment.this.O0((LocalMedia) PictureSelectorPreviewFragment.this.f74756n.get(currentItem), false);
            }
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ArrayList arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.f34299me, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
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
                nVarN.startCrop(PictureSelectorPreviewFragment.this.getActivity(), PictureSelectorPreviewFragment.this, arrayList2, new HashMap<>());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList<LocalMedia> arrayListI;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34276le, new Class[]{View.class}, Void.TYPE).isSupported || (arrayListI = qe.a.i()) == null || arrayListI.size() <= 0) {
                return;
            }
            for (LocalMedia localMedia : arrayListI) {
                if (com.max.mediaselector.lib.config.f.i(localMedia.A()) || com.max.mediaselector.lib.config.f.f(localMedia.A())) {
                    ob.a aVar = ob.a.f132240a;
                    pb.m mVarH = ob.a.h();
                    if (mVarH != null) {
                        mVarH.a(PictureSelectorPreviewFragment.this.getString(R.string.edit_not_support_tips));
                        return;
                    } else {
                        com.max.mediaselector.lib.utils.t.c(((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74935l, PictureSelectorPreviewFragment.this.getString(R.string.edit_not_support_tips));
                        return;
                    }
                }
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            PictureSelectorPreviewFragment.j5(pictureSelectorPreviewFragment, pictureSelectorPreviewFragment.requireContext(), PictureSelectorPreviewFragment.this.r4(), arrayListI, new oe.c() { // from class: com.max.mediaselector.lib.f
                @Override // oe.c
                public final void a(Object obj) {
                    this.f75231a.b((ArrayList) obj);
                }
            });
        }
    }

    public class i extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34322ne, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.this.D = false;
        }
    }

    public class j implements com.max.mediaselector.lib.magical.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.mediaselector.lib.magical.c
        public void a(boolean z10) {
            com.max.mediaselector.lib.adapter.holder.b bVarN;
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Sd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ViewParams viewParamsD = com.max.mediaselector.lib.magical.a.d(PictureSelectorPreviewFragment.this.f74768z ? PictureSelectorPreviewFragment.this.f74763u + 1 : PictureSelectorPreviewFragment.this.f74763u);
            if (viewParamsD == null || (bVarN = PictureSelectorPreviewFragment.this.f74761s.n(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem())) == null) {
                return;
            }
            bVarN.f74837f.getLayoutParams().width = viewParamsD.f75330d;
            bVarN.f74837f.getLayoutParams().height = viewParamsD.f75331e;
            bVarN.f74837f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }

        @Override // com.max.mediaselector.lib.magical.c
        public void b(MagicalView magicalView, boolean z10) {
            com.max.mediaselector.lib.adapter.holder.b bVarN;
            int width;
            int height;
            if (PatchProxy.proxy(new Object[]{magicalView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Pd, new Class[]{MagicalView.class, Boolean.TYPE}, Void.TYPE).isSupported || (bVarN = PictureSelectorPreviewFragment.this.f74761s.n(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem())) == null) {
                return;
            }
            LocalMedia localMedia = (LocalMedia) PictureSelectorPreviewFragment.this.f74756n.get(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem());
            if (!localMedia.O() || localMedia.k() <= 0 || localMedia.j() <= 0) {
                width = localMedia.getWidth();
                height = localMedia.getHeight();
            } else {
                width = localMedia.k();
                height = localMedia.j();
            }
            if (com.max.mediaselector.lib.utils.l.r(width, height)) {
                bVarN.f74837f.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                bVarN.f74837f.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            if (bVarN instanceof com.max.mediaselector.lib.adapter.holder.i) {
                com.max.mediaselector.lib.adapter.holder.i iVar = (com.max.mediaselector.lib.adapter.holder.i) bVarN;
                if (iVar.f74910k.getVisibility() == 8) {
                    iVar.f74910k.setVisibility(0);
                }
            }
        }

        @Override // com.max.mediaselector.lib.magical.c
        public void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Rd, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.x5(PictureSelectorPreviewFragment.this);
        }

        @Override // com.max.mediaselector.lib.magical.c
        public void d(float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.l.Qd, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            for (int i10 = 0; i10 < PictureSelectorPreviewFragment.this.S.size(); i10++) {
                if (!(PictureSelectorPreviewFragment.this.S.get(i10) instanceof TitleBar)) {
                    ((View) PictureSelectorPreviewFragment.this.S.get(i10)).setAlpha(f10);
                }
            }
        }

        @Override // com.max.mediaselector.lib.magical.c
        public void e() {
            com.max.mediaselector.lib.adapter.holder.b bVarN;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Od, new Class[0], Void.TYPE).isSupported || (bVarN = PictureSelectorPreviewFragment.this.f74761s.n(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem())) == null) {
                return;
            }
            if (bVarN.f74837f.getVisibility() == 8) {
                bVarN.f74837f.setVisibility(0);
            }
            if (bVarN instanceof com.max.mediaselector.lib.adapter.holder.i) {
                com.max.mediaselector.lib.adapter.holder.i iVar = (com.max.mediaselector.lib.adapter.holder.i) bVarN;
                if (iVar.f74910k.getVisibility() == 0) {
                    iVar.f74910k.setVisibility(8);
                }
            }
        }
    }

    public class k implements com.max.mediaselector.lib.dialog.c.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74786a;

        public class a implements oe.c<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // oe.c
            public /* bridge */ /* synthetic */ void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34435se, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(str);
            }

            public void b(String str) {
                String string;
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34413re, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                PictureSelectorPreviewFragment.this.V1();
                if (TextUtils.isEmpty(str)) {
                    if (com.max.mediaselector.lib.config.f.e(k.this.f74786a.A())) {
                        string = PictureSelectorPreviewFragment.this.getString(R.string.ps_save_audio_error);
                    } else {
                        string = com.max.mediaselector.lib.config.f.i(k.this.f74786a.A()) ? PictureSelectorPreviewFragment.this.getString(R.string.ps_save_video_error) : PictureSelectorPreviewFragment.this.getString(R.string.ps_save_image_error);
                    }
                    com.max.mediaselector.lib.utils.t.c(PictureSelectorPreviewFragment.this.getContext(), string);
                    return;
                }
                new com.max.mediaselector.lib.basic.j(PictureSelectorPreviewFragment.this.getActivity(), str);
                com.max.mediaselector.lib.utils.t.c(PictureSelectorPreviewFragment.this.getContext(), PictureSelectorPreviewFragment.this.getString(R.string.ps_save_success) + "\n" + str);
            }
        }

        k(LocalMedia localMedia) {
            this.f74786a = localMedia;
        }

        @Override // com.max.mediaselector.lib.dialog.c.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34391qe, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            String strB = this.f74786a.b();
            if (com.max.mediaselector.lib.config.f.g(strB)) {
                PictureSelectorPreviewFragment.this.showLoading();
            }
            com.max.mediaselector.lib.utils.j.a(PictureSelectorPreviewFragment.this.getContext(), strB, this.f74786a.A(), new a());
        }
    }

    public class l extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34457te, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported && PictureSelectorPreviewFragment.this.f74756n.size() > i10) {
                LocalMedia localMedia = (LocalMedia) (i11 < PictureSelectorPreviewFragment.this.F / 2 ? PictureSelectorPreviewFragment.this.f74756n.get(i10) : PictureSelectorPreviewFragment.this.f74756n.get(i10 + 1));
                PictureSelectorPreviewFragment.this.I.setSelected(PictureSelectorPreviewFragment.this.i6(localMedia));
                PictureSelectorPreviewFragment.a5(PictureSelectorPreviewFragment.this, localMedia);
                PictureSelectorPreviewFragment.this.p6(localMedia);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34479ue, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.this.f74763u = i10;
            PictureSelectorPreviewFragment.this.f74757o.setTitle((PictureSelectorPreviewFragment.this.f74763u + 1) + "/" + PictureSelectorPreviewFragment.this.E);
            if (PictureSelectorPreviewFragment.this.f74756n.size() > i10) {
                LocalMedia localMedia = (LocalMedia) PictureSelectorPreviewFragment.this.f74756n.get(i10);
                PictureSelectorPreviewFragment.this.p6(localMedia);
                if (!PictureSelectorPreviewFragment.this.A && !PictureSelectorPreviewFragment.this.f74764v && ((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L) {
                    PictureSelectorPreviewFragment.C5(PictureSelectorPreviewFragment.this, i10);
                }
                if (((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L && (PictureSelectorPreviewFragment.this.f74765w || PictureSelectorPreviewFragment.this.f74764v)) {
                    PictureSelectorPreviewFragment.this.f74761s.s(i10);
                }
                PictureSelectorPreviewFragment.a5(PictureSelectorPreviewFragment.this, localMedia);
                PictureSelectorPreviewFragment.this.f74758p.e(com.max.mediaselector.lib.config.f.i(localMedia.A()) || com.max.mediaselector.lib.config.f.e(localMedia.A()));
                if (PictureSelectorPreviewFragment.this.A || PictureSelectorPreviewFragment.this.f74764v || ((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.K3 || !((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.f75046p1) {
                    return;
                }
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment.f74762t) {
                    if (i10 == (pictureSelectorPreviewFragment.f74761s.getItemCount() - 1) - 10 || i10 == PictureSelectorPreviewFragment.this.f74761s.getItemCount() - 1) {
                        PictureSelectorPreviewFragment.H5(PictureSelectorPreviewFragment.this);
                    }
                }
            }
        }
    }

    public class m implements oe.c<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f74791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74792c;

        m(LocalMedia localMedia, int[] iArr, int i10) {
            this.f74790a = localMedia;
            this.f74791b = iArr;
            this.f74792c = i10;
        }

        @Override // oe.c
        public /* bridge */ /* synthetic */ void a(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.l.f34523we, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bitmap);
        }

        public void b(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.l.f34501ve, new Class[]{Bitmap.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(PictureSelectorPreviewFragment.this.getActivity())) {
                return;
            }
            this.f74790a.t0(bitmap.getWidth());
            this.f74790a.G1(bitmap.getHeight());
            if (com.max.mediaselector.lib.utils.l.r(bitmap.getWidth(), bitmap.getHeight())) {
                this.f74791b[0] = PictureSelectorPreviewFragment.this.F;
                this.f74791b[1] = PictureSelectorPreviewFragment.this.G;
            } else {
                this.f74791b[0] = bitmap.getWidth();
                this.f74791b[1] = bitmap.getHeight();
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            int[] iArr = this.f74791b;
            PictureSelectorPreviewFragment.K5(pictureSelectorPreviewFragment, iArr[0], iArr[1], this.f74792c);
        }
    }

    public class n implements oe.l<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public void a(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.f34345oe, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.N5(PictureSelectorPreviewFragment.this, localMediaFolder.c());
        }

        @Override // oe.l
        public /* bridge */ /* synthetic */ void onComplete(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.f34368pe, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(localMediaFolder);
        }
    }

    public class o implements oe.l<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public void a(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.f34545xe, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.N5(PictureSelectorPreviewFragment.this, localMediaFolder.c());
        }

        @Override // oe.l
        public /* bridge */ /* synthetic */ void onComplete(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.l.f34567ye, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(localMediaFolder);
        }
    }

    public class p extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34589ze, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.N5(PictureSelectorPreviewFragment.this, arrayList);
        }
    }

    public class q extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Ae, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.N5(PictureSelectorPreviewFragment.this, arrayList);
        }
    }

    public class r extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Be, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.O5(PictureSelectorPreviewFragment.this, arrayList, z10);
        }
    }

    public class s extends oe.n<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // oe.n
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Ce, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PictureSelectorPreviewFragment.O5(PictureSelectorPreviewFragment.this, arrayList, z10);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SelectMainStyle f74800b;

        t(SelectMainStyle selectMainStyle) {
            this.f74800b = selectMainStyle;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.De, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f74800b.g0() && qe.a.g() == 0) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment.O0((LocalMedia) pictureSelectorPreviewFragment.f74756n.get(PictureSelectorPreviewFragment.this.f74760r.getCurrentItem()), false) != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                PictureSelectorPreviewFragment.P5(PictureSelectorPreviewFragment.this);
            }
        }
    }

    public class u extends TitleBar.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // com.max.mediaselector.lib.widget.TitleBar.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ee, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (PictureSelectorPreviewFragment.this.A) {
                PictureSelectorPreviewFragment.Q4(PictureSelectorPreviewFragment.this);
            } else if (PictureSelectorPreviewFragment.this.f74764v || !((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L) {
                PictureSelectorPreviewFragment.U4(PictureSelectorPreviewFragment.this);
            } else {
                PictureSelectorPreviewFragment.this.f74759q.t();
            }
        }
    }

    public class v implements com.max.mediaselector.lib.adapter.holder.b.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        private v() {
        }

        /* synthetic */ v(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, j jVar) {
            this();
        }

        @Override // com.max.mediaselector.lib.adapter.holder.b.d
        public void a(LocalMedia localMedia) {
            if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.Je, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || ((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.O || !PictureSelectorPreviewFragment.this.A) {
                return;
            }
            PictureSelectorPreviewFragment.y5(PictureSelectorPreviewFragment.this, localMedia);
        }

        @Override // com.max.mediaselector.lib.adapter.holder.b.d
        public void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.Ie, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                PictureSelectorPreviewFragment.this.f74757o.setTitle(str);
                return;
            }
            PictureSelectorPreviewFragment.this.f74757o.setTitle((PictureSelectorPreviewFragment.this.f74763u + 1) + "/" + PictureSelectorPreviewFragment.this.E);
        }

        @Override // com.max.mediaselector.lib.adapter.holder.b.d
        public void c(ImageView imageView, int i10, int i11) {
            Object[] objArr = {imageView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Fe, new Class[]{ImageView.class, cls, cls}, Void.TYPE).isSupported || PictureSelectorPreviewFragment.this.f74766x || PictureSelectorPreviewFragment.this.f74765w || PictureSelectorPreviewFragment.this.f74764v || !((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L) {
                return;
            }
            PictureSelectorPreviewFragment.this.f74765w = true;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            PictureSelectorPreviewFragment.this.f74759q.A(i10, i11, false);
            ViewParams viewParamsD = com.max.mediaselector.lib.magical.a.d(PictureSelectorPreviewFragment.this.f74768z ? PictureSelectorPreviewFragment.this.f74763u + 1 : PictureSelectorPreviewFragment.this.f74763u);
            if (viewParamsD == null) {
                PictureSelectorPreviewFragment.this.f74759q.J(i10, i11, false);
                PictureSelectorPreviewFragment.this.f74759q.setBackgroundAlpha(1.0f);
                for (int i12 = 0; i12 < PictureSelectorPreviewFragment.this.S.size(); i12++) {
                    ((View) PictureSelectorPreviewFragment.this.S.get(i12)).setAlpha(1.0f);
                }
            } else {
                PictureSelectorPreviewFragment.this.f74759q.setViewParams(viewParamsD.f75328b, viewParamsD.f75329c, viewParamsD.f75330d, viewParamsD.f75331e, i10, i11);
                PictureSelectorPreviewFragment.this.f74759q.I(false);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(PictureSelectorPreviewFragment.this.f74760r, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(50L);
            objectAnimatorOfFloat.start();
        }

        @Override // com.max.mediaselector.lib.adapter.holder.b.d
        public void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ge, new Class[0], Void.TYPE).isSupported || PictureSelectorPreviewFragment.this.f74765w || PictureSelectorPreviewFragment.this.f74764v || !((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L) {
                return;
            }
            PictureSelectorPreviewFragment.this.f74765w = true;
            PictureSelectorPreviewFragment.this.f74760r.setAlpha(1.0f);
            PictureSelectorPreviewFragment.this.f74759q.J(0, 0, false);
            PictureSelectorPreviewFragment.this.f74759q.setBackgroundAlpha(1.0f);
            for (int i10 = 0; i10 < PictureSelectorPreviewFragment.this.S.size(); i10++) {
                ((View) PictureSelectorPreviewFragment.this.S.get(i10)).setAlpha(1.0f);
            }
        }

        @Override // com.max.mediaselector.lib.adapter.holder.b.d
        public void onBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.He, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.K) {
                PictureSelectorPreviewFragment.r5(PictureSelectorPreviewFragment.this);
                return;
            }
            if (PictureSelectorPreviewFragment.this.A) {
                PictureSelectorPreviewFragment.Q4(PictureSelectorPreviewFragment.this);
            } else if (PictureSelectorPreviewFragment.this.f74764v || !((com.max.mediaselector.lib.basic.g) PictureSelectorPreviewFragment.this).f74929f.L) {
                PictureSelectorPreviewFragment.t5(PictureSelectorPreviewFragment.this);
            } else {
                PictureSelectorPreviewFragment.this.f74759q.t();
            }
        }
    }

    static /* synthetic */ void C5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.Ld, new Class[]{PictureSelectorPreviewFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.Q5(i10);
    }

    static /* synthetic */ void H5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Md, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.l6();
    }

    static /* synthetic */ void K5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, int i10, int i11, int i12) {
        Object[] objArr = {pictureSelectorPreviewFragment, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.Nd, new Class[]{PictureSelectorPreviewFragment.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.x6(i10, i11, i12);
    }

    static /* synthetic */ void N5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment, arrayList}, null, changeQuickRedirect, true, bb.c.l.Ad, new Class[]{PictureSelectorPreviewFragment.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.W5(arrayList);
    }

    static /* synthetic */ void O5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Bd, new Class[]{PictureSelectorPreviewFragment.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.X5(list, z10);
    }

    static /* synthetic */ void P5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Cd, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.i4();
    }

    static /* synthetic */ void Q4(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Dd, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.V5();
    }

    private void Q5(int i10) {
        int i11;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34412rd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LocalMedia localMedia = this.f74756n.get(i10);
        int[] iArrU5 = U5(localMedia);
        int[] iArrH = com.max.mediaselector.lib.utils.c.h(iArrU5[0], iArrU5[1]);
        int i12 = iArrU5[0];
        if (i12 <= 0 || (i11 = iArrU5[1]) <= 0) {
            PictureSelectionConfig.W3.b(getActivity(), localMedia.b(), iArrH[0], iArrH[1], new m(localMedia, iArrU5, i10));
        } else {
            x6(i12, i11, i10);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void R5() {
        oe.e eVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34138fd, new Class[0], Void.TYPE).isSupported || !this.B || (eVar = PictureSelectionConfig.f75021f4) == null) {
            return;
        }
        eVar.b(this.f74760r.getCurrentItem());
        int currentItem = this.f74760r.getCurrentItem();
        this.f74756n.remove(currentItem);
        if (this.f74756n.size() == 0) {
            V5();
            return;
        }
        this.f74757o.setTitle(getString(R.string.ps_preview_image_num, Integer.valueOf(this.f74763u + 1), Integer.valueOf(this.f74756n.size())));
        this.E = this.f74756n.size();
        this.f74763u = currentItem;
        if (this.f74760r.getAdapter() != null) {
            this.f74760r.setAdapter(null);
            this.f74760r.setAdapter(this.f74761s);
        }
        this.f74760r.setCurrentItem(this.f74763u, false);
    }

    private void S5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34252kd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74757o.getImageDelete().setVisibility(this.B ? 0 : 8);
        this.I.setVisibility(8);
        this.f74758p.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
    }

    static /* synthetic */ void U4(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Ed, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.v4();
    }

    private int[] U5(LocalMedia localMedia) {
        int width;
        int height;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34456td, new Class[]{LocalMedia.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        if (com.max.mediaselector.lib.utils.l.r(localMedia.getWidth(), localMedia.getHeight())) {
            width = this.F;
            height = this.G;
        } else {
            width = localMedia.getWidth();
            height = localMedia.getHeight();
        }
        if (localMedia.O() && localMedia.k() > 0 && localMedia.j() > 0) {
            width = localMedia.k();
            height = localMedia.j();
        }
        return new int[]{width, height};
    }

    static /* synthetic */ void V4(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Fd, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.R5();
    }

    private void V5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34161gd, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        if (this.f74929f.K) {
            Y5();
        }
        z4();
    }

    private void W5(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.Xc, new Class[]{ArrayList.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        this.f74756n = arrayList;
        if (arrayList.size() == 0) {
            v4();
            return;
        }
        int i10 = this.f74768z ? 0 : -1;
        for (int i11 = 0; i11 < this.f74756n.size(); i11++) {
            i10++;
            this.f74756n.get(i11).N0(i10);
        }
        h6();
    }

    private void X5(List<LocalMedia> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Zc, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        this.f74762t = z10;
        if (z10) {
            if (list.size() <= 0) {
                l6();
                return;
            }
            int size = this.f74756n.size();
            this.f74756n.addAll(list);
            this.f74761s.notifyItemRangeChanged(size, this.f74756n.size());
        }
    }

    private void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34367pd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.S.size(); i10++) {
            this.S.get(i10).setEnabled(true);
        }
        this.f74758p.getEditor().setEnabled(true);
    }

    private void Z5() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Pc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74764v) {
            this.f74759q.setBackgroundAlpha(1.0f);
            return;
        }
        if (!this.f74929f.L) {
            this.f74759q.setBackgroundAlpha(1.0f);
            return;
        }
        if (this.f74766x) {
            this.f74759q.setBackgroundAlpha(1.0f);
            while (i10 < this.S.size()) {
                if (!(this.S.get(i10) instanceof TitleBar)) {
                    this.S.get(i10).setAlpha(1.0f);
                }
                i10++;
            }
        } else {
            this.f74759q.setBackgroundAlpha(0.0f);
            while (i10 < this.S.size()) {
                if (!(this.S.get(i10) instanceof TitleBar)) {
                    this.S.get(i10).setAlpha(0.0f);
                }
                i10++;
            }
        }
        v6();
    }

    static /* synthetic */ void a5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment, localMedia}, null, changeQuickRedirect, true, bb.c.l.Gd, new Class[]{PictureSelectorPreviewFragment.class, LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.n6(localMedia);
    }

    private void a6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34207id, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74758p.setBottomNavBarStyle();
        this.f74758p.setSelectedChange();
        this.f74758p.setOnBottomNavBarListener(new g());
    }

    private void b6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34023ad, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        if (com.max.mediaselector.lib.utils.s.c(selectMainStyleC.K())) {
            this.I.setBackgroundResource(selectMainStyleC.K());
        } else if (com.max.mediaselector.lib.utils.s.c(selectMainStyleC.P())) {
            this.I.setBackgroundResource(selectMainStyleC.P());
        }
        if (com.max.mediaselector.lib.utils.s.f(selectMainStyleC.M())) {
            this.J.setText(selectMainStyleC.M());
        } else {
            this.J.setText("");
        }
        if (com.max.mediaselector.lib.utils.s.b(selectMainStyleC.O())) {
            this.J.setTextSize(selectMainStyleC.O());
        }
        if (com.max.mediaselector.lib.utils.s.c(selectMainStyleC.N())) {
            this.J.setTextColor(selectMainStyleC.N());
        }
        if (com.max.mediaselector.lib.utils.s.b(selectMainStyleC.L())) {
            if (this.I.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                if (this.I.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.I.getLayoutParams())).rightMargin = selectMainStyleC.L();
                }
            } else if (this.I.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.I.getLayoutParams()).rightMargin = selectMainStyleC.L();
            }
        }
        this.L.setCompleteSelectViewStyle();
        if (selectMainStyleC.g0()) {
            if (this.L.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.L.getLayoutParams();
                int i10 = R.id.title_bar;
                layoutParams.f19300h = i10;
                ((ConstraintLayout.LayoutParams) this.L.getLayoutParams()).f19306k = i10;
                if (this.f74929f.K) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.L.getLayoutParams())).topMargin = com.max.mediaselector.lib.utils.h.j(getContext());
                }
            } else if ((this.L.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f74929f.K) {
                ((RelativeLayout.LayoutParams) this.L.getLayoutParams()).topMargin = com.max.mediaselector.lib.utils.h.j(getContext());
            }
        }
        if (selectMainStyleC.m0()) {
            if (this.I.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.I.getLayoutParams();
                int i11 = R.id.bottom_nar_bar;
                layoutParams2.f19300h = i11;
                ((ConstraintLayout.LayoutParams) this.I.getLayoutParams()).f19306k = i11;
                ((ConstraintLayout.LayoutParams) this.J.getLayoutParams()).f19300h = i11;
                ((ConstraintLayout.LayoutParams) this.J.getLayoutParams()).f19306k = i11;
                ((ConstraintLayout.LayoutParams) this.K.getLayoutParams()).f19300h = i11;
                ((ConstraintLayout.LayoutParams) this.K.getLayoutParams()).f19306k = i11;
            }
        } else if (this.f74929f.K) {
            if (this.J.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.J.getLayoutParams())).topMargin = com.max.mediaselector.lib.utils.h.j(getContext());
            } else if (this.J.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.J.getLayoutParams()).topMargin = com.max.mediaselector.lib.utils.h.j(getContext());
            }
        }
        this.L.setOnClickListener(new t(selectMainStyleC));
    }

    private void d6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Jc, new Class[0], Void.TYPE).isSupported && this.f74929f.S3) {
            this.N.setVisibility(0);
            this.N.setChecked(this.f74929f.S);
            this.N.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.mediaselector.lib.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    this.f75188b.j6(compoundButton, z10);
                }
            });
        }
    }

    private void e6(ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.l.f34069cd, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        if (selectMainStyleC.k0()) {
            this.Q = new RecyclerView(getContext());
            if (com.max.mediaselector.lib.utils.s.c(selectMainStyleC.u())) {
                this.Q.setBackgroundResource(selectMainStyleC.u());
            } else {
                this.Q.setBackgroundResource(R.drawable.ps_preview_gallery_bg);
            }
            viewGroup.addView(this.Q);
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.f19304j = R.id.bottom_nar_bar;
                layoutParams2.f19322s = 0;
                layoutParams2.f19326u = 0;
            }
            WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getContext()) { // from class: com.max.mediaselector.lib.PictureSelectorPreviewFragment.13
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.mediaselector.lib.PictureSelectorPreviewFragment$13$a */
                public class a extends LinearSmoothScroller {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    a(Context context) {
                        super(context);
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        return 300.0f / displayMetrics.densityDpi;
                    }
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
                    if (PatchProxy.proxy(new Object[]{recyclerView, state, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Wd, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    super.smoothScrollToPosition(recyclerView, state, i10);
                    a aVar = new a(recyclerView.getContext());
                    aVar.setTargetPosition(i10);
                    startSmoothScroll(aVar);
                }
            };
            RecyclerView.ItemAnimator itemAnimator = this.Q.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
            if (this.Q.getItemDecorationCount() == 0) {
                this.Q.addItemDecoration(new le.b(Integer.MAX_VALUE, com.max.mediaselector.lib.utils.h.a(getContext(), 6.0f)));
            }
            wrapContentLinearLayoutManager.setOrientation(0);
            this.Q.setLayoutManager(wrapContentLinearLayoutManager);
            if (qe.a.g() > 0) {
                this.Q.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.ps_anim_layout_fall_enter));
            }
            this.R = new com.max.mediaselector.lib.adapter.holder.g(this.f74764v, qe.a.i());
            n6(this.f74756n.get(this.f74763u));
            this.Q.setAdapter(this.R);
            this.R.x(new d());
            if (qe.a.g() > 0) {
                this.Q.setVisibility(0);
            } else {
                this.Q.setVisibility(4);
            }
            this.S.add(this.Q);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new e());
            itemTouchHelper.attachToRecyclerView(this.Q);
            this.R.y(new f(itemTouchHelper));
        }
    }

    private void f6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34046bd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (PictureSelectionConfig.f75017b4.d().B()) {
            this.f74757o.setVisibility(8);
        }
        this.f74757o.setTitleBarStyle();
        this.f74757o.setOnTitleBarListener(new u());
        this.f74757o.setTitle((this.f74763u + 1) + "/" + this.E);
        this.f74757o.getImageDelete().setOnClickListener(new a());
        this.K.setOnClickListener(new b());
        this.I.setOnClickListener(new c());
    }

    private void g6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34229jd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M.setSelectedChange();
        this.M.setOnClickListener(new h());
    }

    private void h6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34275ld, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74761s = new com.max.mediaselector.lib.adapter.d(this.f74756n, new v(this, null));
        this.f74760r.setOrientation(0);
        this.f74760r.setAdapter(this.f74761s);
        this.f74760r.setCurrentItem(this.f74763u, false);
        if (this.f74756n.size() > 0) {
            LocalMedia localMedia = this.f74756n.get(this.f74763u);
            this.f74758p.e(com.max.mediaselector.lib.config.f.i(localMedia.A()) || com.max.mediaselector.lib.config.f.e(localMedia.A()));
        }
        this.I.setSelected(qe.a.i().contains(this.f74756n.get(this.f74760r.getCurrentItem())));
        this.L.setSelectedChange(true);
        this.f74760r.registerOnPageChangeCallback(this.T);
        this.f74760r.setPageTransformer(new MarginPageTransformer(com.max.mediaselector.lib.utils.h.a(getContext(), 3.0f)));
        E(false);
        p6(this.f74756n.get(this.f74763u));
    }

    static /* synthetic */ void j5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, Context context, boolean z10, ArrayList arrayList, oe.c cVar) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment, context, new Byte(z10 ? (byte) 1 : (byte) 0), arrayList, cVar}, null, changeQuickRedirect, true, bb.c.l.Hd, new Class[]{PictureSelectorPreviewFragment.class, Context.class, Boolean.TYPE, ArrayList.class, oe.c.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.x4(context, z10, arrayList, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j6(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34566yd, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f74929f.S = z10;
        this.N.setChecked(z10);
    }

    private void k6(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Wc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f74929f.K3) {
            me.c cVar = PictureSelectionConfig.f75016a4;
            if (cVar != null) {
                cVar.d(getContext(), new n());
                return;
            } else {
                this.f74928e.j(new o());
                return;
            }
        }
        me.c cVar2 = PictureSelectionConfig.f75016a4;
        if (cVar2 != null) {
            cVar2.b(getContext(), this.H, 1, i10, new p());
        } else {
            this.f74928e.i(this.H, i10, new q());
        }
    }

    private void l6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Yc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f74927d + 1;
        this.f74927d = i10;
        me.c cVar = PictureSelectionConfig.f75016a4;
        if (cVar == null) {
            this.f74928e.l(this.H, i10, this.f74929f.f75032c0, new s());
            return;
        }
        Context context = getContext();
        long j10 = this.H;
        int i11 = this.f74927d;
        int i12 = this.f74929f.f75032c0;
        cVar.c(context, j10, i11, i12, i12, new r());
    }

    public static PictureSelectorPreviewFragment m6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.Dc, new Class[0], PictureSelectorPreviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureSelectorPreviewFragment) patchProxyResultProxy.result;
        }
        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = new PictureSelectorPreviewFragment();
        pictureSelectorPreviewFragment.setArguments(new Bundle());
        return pictureSelectorPreviewFragment;
    }

    private void n6(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34092dd, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || this.R == null || !PictureSelectionConfig.f75017b4.c().k0()) {
            return;
        }
        this.R.t(localMedia);
    }

    private void o6(boolean z10, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), localMedia}, this, changeQuickRedirect, false, bb.c.l.f34115ed, new Class[]{Boolean.TYPE, LocalMedia.class}, Void.TYPE).isSupported || this.R == null || !PictureSelectionConfig.f75017b4.c().k0()) {
            return;
        }
        if (this.Q.getVisibility() == 4) {
            this.Q.setVisibility(0);
        }
        if (z10) {
            if (this.f74929f.f75040k == 1) {
                this.R.p();
            }
            this.R.o(localMedia);
            this.Q.smoothScrollToPosition(this.R.getItemCount() - 1);
            return;
        }
        this.R.w(localMedia);
        if (qe.a.g() == 0) {
            this.Q.setVisibility(4);
        }
    }

    private void q6(LocalMedia localMedia) {
        oe.e eVar;
        String string;
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34390qd, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || (eVar = PictureSelectionConfig.f75021f4) == null || eVar.a(localMedia)) {
            return;
        }
        if (com.max.mediaselector.lib.config.f.e(localMedia.A()) || com.max.mediaselector.lib.config.f.n(localMedia.b())) {
            string = getString(R.string.ps_prompt_audio_content);
        } else {
            string = (com.max.mediaselector.lib.config.f.i(localMedia.A()) || com.max.mediaselector.lib.config.f.q(localMedia.b())) ? getString(R.string.ps_prompt_video_content) : getString(R.string.ps_prompt_image_content);
        }
        com.max.mediaselector.lib.dialog.c.c(getContext(), getString(R.string.ps_prompt), string).b(new k(localMedia));
    }

    static /* synthetic */ void r5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Id, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.s6();
    }

    private void r6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34298md, new Class[0], Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(getActivity())) {
            return;
        }
        if (this.A) {
            z4();
            return;
        }
        if (this.f74764v) {
            v4();
        } else if (this.f74929f.L) {
            this.f74759q.t();
        } else {
            v4();
        }
    }

    private void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34321nd, new Class[0], Void.TYPE).isSupported || this.D) {
            return;
        }
        boolean z10 = this.f74757o.getTranslationY() == 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        float f10 = z10 ? 0.0f : -this.f74757o.getHeight();
        float f11 = z10 ? -this.f74757o.getHeight() : 0.0f;
        float f12 = z10 ? 1.0f : 0.0f;
        float f13 = z10 ? 0.0f : 1.0f;
        for (int i10 = 0; i10 < this.S.size(); i10++) {
            View view = this.S.get(i10);
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", f12, f13));
            if (view instanceof TitleBar) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", f10, f11));
            }
        }
        animatorSet.setDuration(350L);
        animatorSet.start();
        this.D = true;
        animatorSet.addListener(new i());
        if (z10) {
            y6();
        } else {
            Y5();
        }
    }

    static /* synthetic */ void t5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.Jd, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.v4();
    }

    private void v6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Qc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74759q.setOnMojitoViewCallback(new j());
    }

    private void w6() {
        ArrayList<LocalMedia> arrayList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Mc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        if (com.max.mediaselector.lib.utils.s.c(selectMainStyleC.I())) {
            this.f74759q.setBackgroundColor(selectMainStyleC.I());
            return;
        }
        if (this.f74929f.f75029b == com.max.mediaselector.lib.config.h.b() || ((arrayList = this.f74756n) != null && arrayList.size() > 0 && com.max.mediaselector.lib.config.f.e(this.f74756n.get(0).A()))) {
            this.f74759q.setBackgroundColor(androidx.core.content.d.f(getContext(), R.color.ps_color_white));
        } else {
            this.f74759q.setBackgroundColor(androidx.core.content.d.f(getContext(), R.color.ps_color_black));
        }
    }

    static /* synthetic */ void x5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment}, null, changeQuickRedirect, true, bb.c.l.f34588zd, new Class[]{PictureSelectorPreviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.v4();
    }

    private void x6(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34434sd, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f74759q.A(i10, i11, true);
        if (this.f74768z) {
            i12++;
        }
        ViewParams viewParamsD = com.max.mediaselector.lib.magical.a.d(i12);
        if (viewParamsD == null || i10 == 0 || i11 == 0) {
            this.f74759q.setViewParams(0, 0, 0, 0, i10, i11);
        } else {
            this.f74759q.setViewParams(viewParamsD.f75328b, viewParamsD.f75329c, viewParamsD.f75330d, viewParamsD.f75331e, i10, i11);
        }
    }

    static /* synthetic */ void y5(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{pictureSelectorPreviewFragment, localMedia}, null, changeQuickRedirect, true, bb.c.l.Kd, new Class[]{PictureSelectorPreviewFragment.class, LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureSelectorPreviewFragment.q6(localMedia);
    }

    private void y6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34344od, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.S.size(); i10++) {
            this.S.get(i10).setEnabled(false);
        }
        this.f74758p.getEditor().setEnabled(false);
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void E(boolean z10) {
        Byte b10 = new Byte(z10 ? (byte) 1 : (byte) 0);
        int i10 = 0;
        if (!PatchProxy.proxy(new Object[]{b10}, this, changeQuickRedirect, false, bb.c.l.Tc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && PictureSelectionConfig.f75017b4.c().l0() && PictureSelectionConfig.f75017b4.c().n0()) {
            while (i10 < qe.a.g()) {
                LocalMedia localMedia = qe.a.i().get(i10);
                i10++;
                localMedia.G0(i10);
            }
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public int I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Fc, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = com.max.mediaselector.lib.config.d.a(getContext(), 2);
        return iA != 0 ? iA : R.layout.ps_fragment_preview;
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void T0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34184hd, new Class[0], Void.TYPE).isSupported && this.f74929f.K) {
            Y5();
        }
    }

    public void T5(Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.l.Lc, new Class[]{Intent.class}, Void.TYPE).isSupported || intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri")) == null || parcelableArrayListExtra.size() <= 0) {
            return;
        }
        ArrayList<LocalMedia> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < parcelableArrayListExtra.size(); i10++) {
            arrayList.add(V3(((Uri) parcelableArrayListExtra.get(i10)).getPath()));
        }
        G0(arrayList);
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void Z0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Hc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74758p.setOriginalCheck();
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void a0(Intent intent) {
        if (!PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.l.f34522wd, new Class[]{Intent.class}, Void.TYPE).isSupported && this.f74756n.size() > this.f74760r.getCurrentItem()) {
            LocalMedia localMedia = this.f74756n.get(this.f74760r.getCurrentItem());
            Uri uriB = com.max.mediaselector.lib.config.a.b(intent);
            localMedia.p0(uriB != null ? uriB.getPath() : "");
            localMedia.j0(com.max.mediaselector.lib.config.a.h(intent));
            localMedia.g0(com.max.mediaselector.lib.config.a.e(intent));
            localMedia.k0(com.max.mediaselector.lib.config.a.f(intent));
            localMedia.l0(com.max.mediaselector.lib.config.a.g(intent));
            localMedia.m0(com.max.mediaselector.lib.config.a.c(intent));
            localMedia.o0(true ^ TextUtils.isEmpty(localMedia.u()));
            localMedia.n0(com.max.mediaselector.lib.config.a.d(intent));
            localMedia.y0(localMedia.O());
            localMedia.P0(localMedia.u());
            if (qe.a.i().contains(localMedia)) {
                LocalMedia localMediaF = localMedia.f();
                if (localMediaF != null) {
                    localMediaF.p0(localMedia.u());
                    localMediaF.o0(localMedia.O());
                    localMediaF.y0(localMedia.P());
                    localMediaF.n0(localMedia.r());
                    localMediaF.P0(localMedia.u());
                    localMediaF.j0(com.max.mediaselector.lib.config.a.h(intent));
                    localMediaF.g0(com.max.mediaselector.lib.config.a.e(intent));
                    localMediaF.k0(com.max.mediaselector.lib.config.a.f(intent));
                    localMediaF.l0(com.max.mediaselector.lib.config.a.g(intent));
                    localMediaF.m0(com.max.mediaselector.lib.config.a.c(intent));
                }
                W(localMedia);
            } else {
                O0(localMedia, false);
            }
            this.f74761s.notifyItemChanged(this.f74760r.getCurrentItem());
            n6(localMedia);
        }
    }

    public void c6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Vc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74929f.f75046p1) {
            this.f74928e = new com.max.mediaselector.lib.loader.d(getContext(), this.f74929f);
        } else {
            this.f74928e = new com.max.mediaselector.lib.loader.b(getContext(), this.f74929f);
        }
    }

    public boolean i6(LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34500vd, new Class[]{LocalMedia.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : qe.a.i().contains(localMedia);
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void j0(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.Nc, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.j0(bundle);
        if (bundle != null) {
            this.f74927d = bundle.getInt(com.max.mediaselector.lib.config.e.f75106k, 1);
            this.H = bundle.getLong(com.max.mediaselector.lib.config.e.f75107l, -1L);
            this.f74763u = bundle.getInt(com.max.mediaselector.lib.config.e.f75109n, this.f74763u);
            this.f74768z = bundle.getBoolean(com.max.mediaselector.lib.config.e.f75103h, this.f74768z);
            this.E = bundle.getInt(com.max.mediaselector.lib.config.e.f75110o, this.E);
            this.A = bundle.getBoolean(com.max.mediaselector.lib.config.e.f75102g, this.A);
            this.B = bundle.getBoolean(com.max.mediaselector.lib.config.e.f75108m, this.B);
            this.f74764v = bundle.getBoolean(com.max.mediaselector.lib.config.e.f75104i, this.f74764v);
            this.f74767y = bundle.getString(com.max.mediaselector.lib.config.e.f75105j, "");
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void k2(boolean z10, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), localMedia}, this, changeQuickRedirect, false, bb.c.l.Gc, new Class[]{Boolean.TYPE, LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        this.I.setSelected(qe.a.i().contains(localMedia));
        this.f74758p.setSelectedChange();
        this.L.setSelectedChange(true);
        this.M.setSelectedChange();
        p6(localMedia);
        o6(z10, localMedia);
    }

    @Override // com.max.mediaselector.lib.basic.g
    public String k4() {
        return U;
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Kc, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 69) {
            super.onActivityResult(i10, i11, intent);
        } else if (i11 == -1) {
            T5(intent);
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@n0 Configuration configuration) {
        int i10;
        int i11;
        if (PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, bb.c.l.Uc, new Class[]{Configuration.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.f74764v || this.A || !this.f74929f.L) {
            return;
        }
        int size = this.f74756n.size();
        int i12 = this.f74763u;
        if (size > i12) {
            int[] iArrU5 = U5(this.f74756n.get(i12));
            ViewParams viewParamsD = com.max.mediaselector.lib.magical.a.d(this.f74768z ? this.f74763u + 1 : this.f74763u);
            if (viewParamsD == null || (i10 = iArrU5[0]) == 0 || (i11 = iArrU5[1]) == 0) {
                this.f74759q.setViewParams(0, 0, 0, 0, iArrU5[0], iArrU5[1]);
                this.f74759q.C(iArrU5[0], iArrU5[1], false);
            } else {
                this.f74759q.setViewParams(viewParamsD.f75328b, viewParamsD.f75329c, viewParamsD.f75330d, viewParamsD.f75331e, i10, i11);
                this.f74759q.B();
            }
        }
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    @p0
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Sc, new Class[]{cls, Boolean.TYPE, cls}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        if (!this.f74764v && !this.A && this.f74929f.L) {
            return null;
        }
        PictureWindowAnimationStyle pictureWindowAnimationStyleE = PictureSelectionConfig.f75017b4.e();
        if (pictureWindowAnimationStyleE.f75420d == 0 || pictureWindowAnimationStyleE.f75421e == 0) {
            return super.onCreateAnimation(i10, z10, i11);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getActivity(), z10 ? pictureWindowAnimationStyleE.f75420d : pictureWindowAnimationStyleE.f75421e);
        if (z10) {
            k0();
        } else {
            T0();
        }
        return animationLoadAnimation;
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34544xd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74761s.m();
        this.f74760r.unregisterOnPageChangeCallback(this.T);
        if (this.A) {
            PictureSelectionConfig.a();
        }
        super.onDestroy();
    }

    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.Rc, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putInt(com.max.mediaselector.lib.config.e.f75106k, this.f74927d);
        bundle.putLong(com.max.mediaselector.lib.config.e.f75107l, this.H);
        bundle.putInt(com.max.mediaselector.lib.config.e.f75109n, this.f74763u);
        bundle.putInt(com.max.mediaselector.lib.config.e.f75110o, this.E);
        bundle.putBoolean(com.max.mediaselector.lib.config.e.f75102g, this.A);
        bundle.putBoolean(com.max.mediaselector.lib.config.e.f75108m, this.B);
        bundle.putBoolean(com.max.mediaselector.lib.config.e.f75103h, this.f74768z);
        bundle.putBoolean(com.max.mediaselector.lib.config.e.f75104i, this.f74764v);
        bundle.putString(com.max.mediaselector.lib.config.e.f75105j, this.f74767y);
        if (this.A) {
            qe.a.c(this.f74756n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
    @Override // com.max.mediaselector.lib.basic.g, androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        int i10;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.l.Ic, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        j0(bundle);
        this.f74766x = bundle != null;
        this.F = com.max.mediaselector.lib.utils.h.f(getContext());
        this.G = com.max.mediaselector.lib.utils.h.h(getContext());
        this.f74757o = (PreviewTitleBar) view.findViewById(R.id.title_bar);
        this.I = (TextView) view.findViewById(R.id.ps_tv_selected);
        this.J = (TextView) view.findViewById(R.id.ps_tv_selected_word);
        this.K = view.findViewById(R.id.select_click_area);
        this.L = (CompleteSelectView) view.findViewById(R.id.ps_complete_select);
        this.M = (EditPictureTextView) view.findViewById(R.id.tv_edit);
        this.N = (CheckBox) view.findViewById(R.id.cb_original);
        this.f74759q = (MagicalView) view.findViewById(R.id.magical);
        this.f74760r = new ViewPager2(getContext());
        this.f74758p = (PreviewBottomNavBar) view.findViewById(R.id.bottom_nar_bar);
        this.f74759q.setMagicalContent(this.f74760r);
        w6();
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        arrayList.add(this.f74757o);
        this.S.add(this.I);
        this.S.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.f74758p);
        this.S.add(this.M);
        f6();
        d6();
        if (this.A) {
            if (bundle != null || this.f74756n.size() == 0) {
                this.f74756n = new ArrayList<>(qe.a.h());
            }
            this.f74759q.setBackgroundAlpha(1.0f);
            qe.a.d();
            S5();
            h6();
            return;
        }
        c6();
        a6();
        e6((ViewGroup) view);
        b6();
        g6();
        Z5();
        if (bundle == null || this.f74756n.size() != 0) {
            h6();
        } else if (this.f74764v) {
            this.f74756n = new ArrayList<>(qe.a.i());
            h6();
        } else {
            PictureSelectionConfig pictureSelectionConfig = this.f74929f;
            if (pictureSelectionConfig.f75046p1) {
                k6(this.f74927d * pictureSelectionConfig.f75032c0);
            } else {
                this.f74928e = new com.max.mediaselector.lib.loader.d(getContext(), this.f74929f);
                k6(this.E);
            }
        }
        this.f74758p.setVisibility(this.C ? 0 : 8);
        this.L.setVisibility(this.C ? 0 : 8);
        this.N.setVisibility(this.C ? 0 : 8);
        EditPictureTextView editPictureTextView = this.M;
        if (PictureSelectionConfig.c().V3 && this.C) {
            ob.a aVar = ob.a.f132240a;
            i10 = ob.a.n() == null ? 8 : 0;
        }
        editPictureTextView.setVisibility(i10);
    }

    public void p6(LocalMedia localMedia) {
        if (!PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34478ud, new Class[]{LocalMedia.class}, Void.TYPE).isSupported && PictureSelectionConfig.f75017b4.c().l0() && PictureSelectionConfig.f75017b4.c().n0()) {
            this.I.setText("");
            for (int i10 = 0; i10 < qe.a.g(); i10++) {
                LocalMedia localMedia2 = qe.a.i().get(i10);
                if (TextUtils.equals(localMedia2.E(), localMedia.E()) || localMedia2.z() == localMedia.z()) {
                    localMedia.G0(localMedia2.B());
                    localMedia2.N0(localMedia.F());
                    this.I.setText(com.max.mediaselector.lib.utils.u.l(Integer.valueOf(localMedia.B())));
                }
            }
        }
    }

    public void t6(int i10, int i11, ArrayList<LocalMedia> arrayList, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Ec, new Class[]{cls, cls, ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f74756n = arrayList;
        this.E = i11;
        this.f74763u = i10;
        this.B = z10;
        this.A = true;
        PictureSelectionConfig.c().L = false;
    }

    public void u6(boolean z10, String str, boolean z11, int i10, int i11, int i12, long j10, ArrayList<LocalMedia> arrayList, boolean z12) {
        this.f74927d = i12;
        this.H = j10;
        this.f74756n = arrayList;
        this.E = i11;
        this.f74763u = i10;
        this.f74767y = str;
        this.f74768z = z11;
        this.f74764v = z10;
        this.C = z12;
    }

    @Override // com.max.mediaselector.lib.basic.g, com.max.mediaselector.lib.basic.c
    public void x1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Oc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r6();
    }
}
