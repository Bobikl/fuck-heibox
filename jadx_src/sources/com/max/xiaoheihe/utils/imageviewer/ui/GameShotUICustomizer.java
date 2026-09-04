package com.max.xiaoheihe.utils.imageviewer.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.c1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.core.i;
import com.heybox.imageviewer.core.j;
import com.heybox.imageviewer.widgets.PhotoView2;
import com.heybox.imageviewer.widgets.SubsamplingScaleImageView2;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.t;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ExtentionsKt;
import com.max.xiaoheihe.utils.imageviewer.HBImageLoader;
import com.max.xiaoheihe.utils.imageviewer.MediaData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.c5;
import dl.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: GameShotUICustomizer.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class GameShotUICustomizer extends BaseResUICustomizer implements i, com.heybox.imageviewer.core.c, j {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f95605r = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private c5 f95606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private com.heybox.imageviewer.utils.c f95607q;

    /* JADX INFO: compiled from: GameShotUICustomizer.kt */
    public static final class a implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95609c;

        a(MediaData mediaData) {
            this.f95609c = mediaData;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49330, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            GameShotUICustomizer.this.J(this.f95609c);
            return true;
        }
    }

    /* JADX INFO: compiled from: GameShotUICustomizer.kt */
    public static final class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95611c;

        b(MediaData mediaData) {
            this.f95611c = mediaData;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49333, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            GameShotUICustomizer.this.J(this.f95611c);
            return true;
        }
    }

    /* JADX INFO: compiled from: GameShotUICustomizer.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95615c;

        c(MediaData mediaData) {
            this.f95615c = mediaData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49334, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameShotUICustomizer.this.I(this.f95615c);
        }
    }

    /* JADX INFO: compiled from: GameShotUICustomizer.kt */
    public static final class d implements ShareImageDialogFragment.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.h
        public final void a() {
            com.heybox.imageviewer.utils.c cVar;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49335, new Class[0], Void.TYPE).isSupported || (cVar = GameShotUICustomizer.this.f95607q) == null) {
                return;
            }
            cVar.b();
        }
    }

    /* JADX INFO: compiled from: GameShotUICustomizer.kt */
    public static final class e implements ShareImageDialogFragment.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<GameScreenPicShotObj> f95618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<User> f95619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediaData f95620d;

        e(Ref.ObjectRef<GameScreenPicShotObj> objectRef, Ref.ObjectRef<User> objectRef2, MediaData mediaData) {
            this.f95618b = objectRef;
            this.f95619c = objectRef2;
            this.f95620d = mediaData;
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
        public final View a(ViewGroup viewGroup) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 49336, new Class[]{ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            Context contextQ = GameShotUICustomizer.this.q();
            GameScreenPicShotObj gameScreenPicShotObj = this.f95618b.f124891b;
            String main_color = gameScreenPicShotObj != null ? gameScreenPicShotObj.getMain_color() : null;
            GameScreenPicShotObj gameScreenPicShotObj2 = this.f95618b.f124891b;
            String bg_img = gameScreenPicShotObj2 != null ? gameScreenPicShotObj2.getBg_img() : null;
            GameScreenPicShotObj gameScreenPicShotObj3 = this.f95618b.f124891b;
            String name = gameScreenPicShotObj3 != null ? gameScreenPicShotObj3.getName() : null;
            GameScreenPicShotObj gameScreenPicShotObj4 = this.f95618b.f124891b;
            String name_en = gameScreenPicShotObj4 != null ? gameScreenPicShotObj4.getName_en() : null;
            String avartar = this.f95619c.f124891b.getAccount_detail().getAvartar();
            String username = this.f95619c.f124891b.getAccount_detail().getUsername();
            GameScreenPicShotObj gameScreenPicShotObj5 = this.f95618b.f124891b;
            String desc = gameScreenPicShotObj5 != null ? gameScreenPicShotObj5.getDesc() : null;
            String strD = this.f95620d.D();
            GameScreenPicShotObj gameScreenPicShotObj6 = this.f95618b.f124891b;
            return ShareViewUtil.f(contextQ, viewGroup, main_color, bg_img, name, name_en, avartar, username, desc, strD, gameScreenPicShotObj6 != null ? gameScreenPicShotObj6.getPublish_timestamp() : null);
        }
    }

    private final void M() {
        RelativeLayout relativeLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49318, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context contextQ = q();
        Context contextQ2 = q();
        Context contextQ3 = q();
        c5 c5Var = this.f95606p;
        GradientDrawable gradientDrawableI = q.i(contextQ, R.color.black_alpha10, R.color.white_alpha10, 0.5f, ViewUtils.h0(contextQ2, ViewUtils.o(contextQ3, c5Var != null ? c5Var.f109153g : null)));
        c5 c5Var2 = this.f95606p;
        TextView textView = c5Var2 != null ? c5Var2.f109151e : null;
        if (textView != null) {
            textView.setBackground(gradientDrawableI);
        }
        c5 c5Var3 = this.f95606p;
        TextView textView2 = c5Var3 != null ? c5Var3.f109153g : null;
        if (textView2 != null) {
            textView2.setBackground(gradientDrawableI);
        }
        c5 c5Var4 = this.f95606p;
        ImageView imageView = c5Var4 != null ? c5Var4.f109149c : null;
        if (imageView != null) {
            imageView.setBackground(gradientDrawableI);
        }
        c5 c5Var5 = this.f95606p;
        ViewGroup.LayoutParams layoutParams = (c5Var5 == null || (relativeLayout = c5Var5.f109155i) == null) ? null : relativeLayout.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t.p(q());
        c5 c5Var6 = this.f95606p;
        RelativeLayout relativeLayoutB = c5Var6 != null ? c5Var6.b() : null;
        if (relativeLayoutB != null) {
            relativeLayoutB.setAlpha(0.0f);
        }
        c5 c5Var7 = this.f95606p;
        RelativeLayout relativeLayoutB2 = c5Var7 != null ? c5Var7.b() : null;
        f0.m(relativeLayoutB2);
        ObjectAnimator.ofFloat(relativeLayoutB2, "alpha", 0.0f, 1.0f).setDuration(500L).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.max.xiaoheihe.bean.game.GameScreenPicShotObj] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.max.xiaoheihe.bean.account.User] */
    @Override // com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer
    public void I(@dl.d MediaData mediaData) {
        AppCompatActivity appCompatActivity;
        if (PatchProxy.proxy(new Object[]{mediaData}, this, changeQuickRedirect, false, 49323, new Class[]{MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mediaData, "mediaData");
        if (q() instanceof AppCompatActivity) {
            Context contextQ = q();
            f0.n(contextQ, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            appCompatActivity = (AppCompatActivity) contextQ;
        } else {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            f0.n(activityA, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            appCompatActivity = (AppCompatActivity) activityA;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = (GameScreenPicShotObj) mediaData.z();
        Context contextQ2 = q();
        f0.n(contextQ2, "null cannot be cast to non-null type android.app.Activity");
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d((Activity) contextQ2));
        BBSTopicObj bBSTopicObj = new BBSTopicObj();
        GameScreenPicShotObj gameScreenPicShotObj = (GameScreenPicShotObj) objectRef.f124891b;
        bBSTopicObj.setPic_url(gameScreenPicShotObj != null ? gameScreenPicShotObj.getIcon() : null);
        GameScreenPicShotObj gameScreenPicShotObj2 = (GameScreenPicShotObj) objectRef.f124891b;
        bBSTopicObj.setTopic_id(gameScreenPicShotObj2 != null ? gameScreenPicShotObj2.getTopic_id() : null);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f124891b = i0.i();
        shareImageDialogFragmentX4.D4(new e(objectRef, objectRef2, mediaData));
        shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(com.max.hbshare.c.f72561q, w()));
        shareImageDialogFragmentX4.Y4(bBSTopicObj);
        shareImageDialogFragmentX4.V4(false);
        shareImageDialogFragmentX4.K4(new d());
        shareImageDialogFragmentX4.show(appCompatActivity.getSupportFragmentManager(), "GameShotUICustomizer_ShareImageDialogFragment");
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void a(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 49327, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j.a.h(this, viewHolder, view, f10);
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void b(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 49324, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j.a.a(this, viewHolder, view, f10);
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void c(@dl.d RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 49321, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        D(true);
    }

    @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
    public void d(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view}, this, changeQuickRedirect, false, 49322, new Class[]{RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(view, "view");
        D(false);
        n();
        com.heybox.imageviewer.core.b bVarF = Components.f59730a.f();
        if (bVarF instanceof HBImageLoader) {
            ((HBImageLoader) bVarF).l();
        }
    }

    @Override // com.heybox.imageviewer.core.i
    public void e(int i10, @dl.d com.heybox.imageviewer.core.d data, @dl.d RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), data, viewHolder}, this, changeQuickRedirect, false, 49316, new Class[]{Integer.TYPE, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        f0.p(viewHolder, "viewHolder");
        MediaData mediaData = (MediaData) data;
        Serializable serializableZ = mediaData.z();
        f0.n(serializableZ, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.GameScreenPicShotObj");
        GameScreenPicShotObj gameScreenPicShotObj = (GameScreenPicShotObj) serializableZ;
        ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R.id.iv_game_logo);
        TextView textView = (TextView) viewHolder.itemView.findViewById(R.id.tv_desc);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(R.id.tv_time);
        com.max.hbimage.b.e0(gameScreenPicShotObj.getBg_img(), imageView, ViewUtils.p(q(), imageView, ViewUtils.ViewType.IMAGE), R.drawable.common_default_placeholder_375x210);
        String desc = gameScreenPicShotObj.getDesc();
        if (desc == null) {
            desc = gameScreenPicShotObj.getName();
        }
        textView.setText(desc);
        textView2.setText(w.i(gameScreenPicShotObj.getPublish_timestamp(), w.f73605l));
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.b) {
            com.heybox.imageviewer.viewholders.b bVar = (com.heybox.imageviewer.viewholders.b) viewHolder;
            SubsamplingScaleImageView2 subsamplingScaleImageView2 = bVar.b().f141012b;
            f0.o(subsamplingScaleImageView2, "viewHolder.binding.subsamplingView");
            ExtentionsKt.k(subsamplingScaleImageView2, 0L, new l<View, b2>() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.GameShotUICustomizer$bind$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d View it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49328, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    com.heybox.imageviewer.d dVarX = this.f95612b.x();
                    if (dVarX != null) {
                        dVarX.c();
                    }
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(View view) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49329, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(view);
                    return b2.f124493a;
                }
            }, 1, null);
            bVar.b().f141012b.setOnLongClickListener(new a(mediaData));
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.a) {
            com.heybox.imageviewer.viewholders.a aVar = (com.heybox.imageviewer.viewholders.a) viewHolder;
            PhotoView2 photoView2 = aVar.b().f141010b;
            f0.o(photoView2, "viewHolder.binding.photoView");
            ExtentionsKt.k(photoView2, 0L, new l<View, b2>() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.GameShotUICustomizer$bind$3
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d View it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 49331, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    com.heybox.imageviewer.d dVarX = this.f95613b.x();
                    if (dVarX != null) {
                        dVarX.c();
                    }
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(View view) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49332, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(view);
                    return b2.f124493a;
                }
            }, 1, null);
            aVar.b().f141010b.setOnLongClickListener(new b(mediaData));
        }
    }

    @Override // com.heybox.imageviewer.core.j
    public void f(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 49319, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
        if (f0.g(lVar.e(), lb.d.M)) {
            PageEventObj pageEventObj = new PageEventObj();
            pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            pageEventObj.setPath(lb.d.N);
            pageEventObj.setType("2");
            ArrayList<ArrayList<PathSrcNode>> arrayListG = lVar.g();
            if (!(arrayListG == null || arrayListG.isEmpty())) {
                pageEventObj.setSrc(arrayListG);
            }
            pageEventObj.setStay_duration(String.valueOf((int) ((j10 / 1000.0f) + 0.5f)));
            pageEventObj.setStay_duration_ms(String.valueOf(j10));
            com.max.hbcommon.analytics.d.c(pageEventObj, true);
        }
    }

    @Override // com.heybox.imageviewer.core.i
    public void g(int i10, @dl.d RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 49315, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(ExtentionsKt.e(viewGroup, R.layout.layout_game_shot_imageviewer_custom_page));
        }
    }

    @Override // com.heybox.imageviewer.core.c
    @dl.d
    public View h(@dl.d ViewGroup parent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent}, this, changeQuickRedirect, false, 49317, new Class[]{ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        this.f95606p = c5.d(LayoutInflater.from(parent.getContext()), parent, false);
        M();
        c5 c5Var = this.f95606p;
        f0.m(c5Var);
        RelativeLayout relativeLayoutB = c5Var.b();
        f0.o(relativeLayoutB, "binding!!.root");
        return relativeLayoutB;
    }

    @Override // com.heybox.imageviewer.core.j
    public void i(int i10, @dl.d RecyclerView.ViewHolder viewHolder) {
        ImageView imageView;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 49320, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        c5 c5Var = this.f95606p;
        y(i10, viewHolder, c5Var != null ? c5Var.f109151e : null, c5Var != null ? c5Var.f109153g : null, c5Var != null ? c5Var.f109149c : null);
        List<com.heybox.imageviewer.core.d> listB = Components.f59730a.e().b();
        if (i10 >= 0 && i10 < t()) {
            z10 = true;
        }
        if (z10) {
            com.heybox.imageviewer.core.d dVar = listB.get(i10);
            f0.n(dVar, "null cannot be cast to non-null type com.max.xiaoheihe.utils.imageviewer.MediaData");
            MediaData mediaData = (MediaData) dVar;
            c5 c5Var2 = this.f95606p;
            if (c5Var2 != null && (imageView = c5Var2.f109150d) != null) {
                imageView.setOnClickListener(new c(mediaData));
            }
            c5 c5Var3 = this.f95606p;
            TextView textView = c5Var3 != null ? c5Var3.f109152f : null;
            if (textView == null) {
                return;
            }
            Serializable serializableZ = mediaData.z();
            f0.n(serializableZ, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.GameScreenPicShotObj");
            textView.setText(((GameScreenPicShotObj) serializableZ).getName());
        }
    }

    @Override // com.heybox.imageviewer.core.i
    public void j(@dl.d Context context, @dl.d com.heybox.imageviewer.utils.c builder) {
        if (PatchProxy.proxy(new Object[]{context, builder}, this, changeQuickRedirect, false, 49314, new Class[]{Context.class, com.heybox.imageviewer.utils.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(builder, "builder");
        E(context);
        ComponentCallbacks2 componentCallbacks2P = p(context);
        if (componentCallbacks2P instanceof FragmentActivity) {
            H((com.heybox.imageviewer.d) new y0((c1) componentCallbacks2P).a(com.heybox.imageviewer.d.class));
        }
        builder.c(this);
        builder.e(this);
        builder.d(this);
        this.f95607q = builder;
    }

    @Override // com.heybox.imageviewer.core.j
    public void onPageScrollStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49325, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        j.a.d(this, i10);
    }

    @Override // com.heybox.imageviewer.core.j
    public void onPageScrolled(int i10, float f10, int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49326, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        j.a.e(this, i10, f10, i11);
    }
}
