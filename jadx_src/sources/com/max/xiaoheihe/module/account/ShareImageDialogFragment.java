package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareReportData;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.ShareTypeObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.SyncSteamCommentObj;
import com.max.xiaoheihe.bean.share.ShareImageDialogConfigObj;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.module.game.GameCommentSuccessActivity;
import com.max.xiaoheihe.module.game.d2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.zhpan.indicator.IndicatorView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ShareImageDialogFragment extends com.max.hbcommon.base.c {
    public static final int K = 9991;
    public static final String L = "ARG_POST_ADDITIONAL";
    public static final String M = "ARG_LINK_ID";
    public static final String N = "KEY_INFLATE_VIEW";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String C;
    private ScreenStyleInfoObj D;
    private String E;
    private String F;
    private String G;
    private String H;
    private SyncSteamCommentObj I;
    private BubbleTipPopup J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewPager2 f78402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f78403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Bitmap> f78404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap f78405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap f78406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f78407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f78408k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private UMShareListener f78410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f78411n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f78417t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private h f78422y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Bitmap f78423z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Bitmap> f78409l = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f78412o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<BBSTopicObj> f78413p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f78414q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private GameObj f78415r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f78416s = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i f78418u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f78419v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<ShareTypeObj> f78420w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<ShareTypeObj> f78421x = new ArrayList();
    private List<String> A = new ArrayList();
    private String B = null;

    public enum ShareType {
        WeiXin,
        WeiXinCircle,
        Sina,
        QQ,
        QZone,
        ByteDanceFriends,
        ByteDance,
        Save,
        CopyUrl,
        Post,
        SyncCommentToSteam;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ShareType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24270, new Class[]{String.class}, ShareType.class);
            return patchProxyResultProxy.isSupported ? (ShareType) patchProxyResultProxy.result : (ShareType) Enum.valueOf(ShareType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ShareType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24269, new Class[0], ShareType[].class);
            return patchProxyResultProxy.isSupported ? (ShareType[]) patchProxyResultProxy.result : (ShareType[]) values().clone();
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24239, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ShareImageDialogFragment.this.dismiss();
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f78425b;

        public class a implements ViewTreeObserver.OnScrollChangedListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f78427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f78428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ScrollView f78429c;

            a(boolean z10, View view, ScrollView scrollView) {
                this.f78427a = z10;
                this.f78428b = view;
                this.f78429c = scrollView;
            }

            private boolean a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24243, new Class[0], Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                return this.f78429c.getScrollY() + this.f78429c.getHeight() >= this.f78429c.getChildAt(0).getHeight();
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24242, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (a() || !this.f78427a) {
                    this.f78428b.setVisibility(8);
                } else {
                    this.f78428b.setVisibility(0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, List list, int i10, int i11) {
            super(context, list, i10);
            this.f78425b = i11;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, Bitmap bitmap) {
            boolean z10;
            View viewA;
            if (PatchProxy.proxy(new Object[]{eVar, bitmap}, this, changeQuickRedirect, false, 24240, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            ScrollView scrollView = (ScrollView) eVar.i(R.id.sv);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            QRCodeShareView qRCodeShareView = (QRCodeShareView) eVar.i(R.id.v_qr_code);
            RelativeLayout relativeLayout = (RelativeLayout) eVar.i(R.id.vg_custom_view_container);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_bottom);
            View viewI = eVar.i(R.id.iv_mask);
            View viewI2 = eVar.i(R.id.vg_bottom_logo);
            ImageView imageView3 = (ImageView) eVar.i(R.id.iv_bottom_logo);
            TextView textView = (TextView) eVar.i(R.id.tv_bottom_desc);
            scrollView.getLayoutParams().width = this.f78425b;
            viewI.getLayoutParams().width = this.f78425b;
            viewI.setVisibility(8);
            if (bitmap == null) {
                if (ShareImageDialogFragment.this.f78403f != null && (viewA = ShareImageDialogFragment.this.f78403f.a(relativeLayout)) != null) {
                    relativeLayout.removeAllViews();
                    relativeLayout.addView(viewA);
                }
                qRCodeShareView.setVisibility(8);
            } else {
                if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    qRCodeShareView.setVisibility(8);
                    z10 = false;
                } else {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.height = (int) (((double) (((this.f78425b * 1.0f) * bitmap.getHeight()) / bitmap.getWidth())) + 0.5d);
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageBitmap(bitmap);
                    z10 = layoutParams.height > ShareImageDialogFragment.this.f78402e.getMeasuredHeight();
                    if (z10) {
                        viewI.setVisibility(0);
                    }
                    if (ShareImageDialogFragment.this.f78412o) {
                        qRCodeShareView.setVisibility(0);
                        if (!com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.f78407j)) {
                            qRCodeShareView.setTitle(ShareImageDialogFragment.this.f78407j);
                        }
                        if (!com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.f78408k)) {
                            qRCodeShareView.setUrl(ShareImageDialogFragment.this.f78408k);
                        }
                    } else {
                        qRCodeShareView.setVisibility(8);
                    }
                }
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new a(z10, viewI, scrollView));
            }
            if (ShareImageDialogFragment.this.D == null || ShareImageDialogFragment.this.D.getBottom() == null) {
                viewI2.setVisibility(8);
                if (ShareImageDialogFragment.this.f78423z == null || ShareImageDialogFragment.this.f78423z.getWidth() <= 0) {
                    imageView2.setVisibility(8);
                    return;
                }
                qRCodeShareView.setVisibility(8);
                imageView2.setVisibility(0);
                imageView2.getLayoutParams().height = (this.f78425b * ShareImageDialogFragment.this.f78423z.getHeight()) / ShareImageDialogFragment.this.f78423z.getWidth();
                imageView2.setImageBitmap(ShareImageDialogFragment.this.f78423z);
                return;
            }
            qRCodeShareView.setVisibility(8);
            imageView2.setVisibility(8);
            viewI2.setVisibility(0);
            textView.setText(ShareImageDialogFragment.this.D.getBottom().getKey());
            float fS = ViewUtils.S(textView.getPaint(), ShareImageDialogFragment.this.D.getBottom().getKey());
            ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
            layoutParams2.width = (int) (ViewUtils.f(ShareImageDialogFragment.this.getContext(), 61.5f) + fS);
            imageView3.setLayoutParams(layoutParams2);
            int iE1 = !com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.D.getBottom().getColor()) ? com.max.xiaoheihe.utils.d.e1(ShareImageDialogFragment.this.D.getBottom().getColor()) : com.max.mediaselector.lib.utils.c.f(bitmap);
            viewI2.setBackgroundColor(iE1);
            float[] fArr = {0.0f, 0.0f, 0.0f};
            Color.colorToHSV(iE1, fArr);
            boolean z11 = fArr[2] <= 0.5f;
            imageView3.setImageResource(z11 ? R.drawable.heybox_watermark_white : R.drawable.heybox_watermark_black);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(z11 ? R.color.white_alpha50 : R.color.text_primary_1_not_change_color_alpha25));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{eVar, bitmap}, this, changeQuickRedirect, false, 24241, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bitmap);
        }
    }

    public class c extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IndicatorView f78431a;

        c(IndicatorView indicatorView) {
            this.f78431a = indicatorView;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24246, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageScrollStateChanged(i10);
            this.f78431a.onPageScrollStateChanged(i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24244, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageScrolled(i10, f10, i11);
            this.f78431a.onPageScrolled(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24245, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            this.f78431a.onPageSelected(i10);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78433a;

        static {
            int[] iArr = new int[ShareType.valuesCustom().length];
            f78433a = iArr;
            try {
                iArr[ShareType.WeiXin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78433a[ShareType.WeiXinCircle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78433a[ShareType.Sina.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78433a[ShareType.QQ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78433a[ShareType.QZone.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78433a[ShareType.ByteDance.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78433a[ShareType.Save.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f78433a[ShareType.CopyUrl.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f78433a[ShareType.Post.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f78433a[ShareType.SyncCommentToSteam.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface e {
        View a(ViewGroup viewGroup);
    }

    public interface f {
        void a();
    }

    public interface g {
        void a(List<File> list);

        void onError(Throwable th2);
    }

    public interface h {
        void a();
    }

    public class i extends com.max.hbcommon.base.adapter.s<ShareTypeObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f78434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f78435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f78436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f78437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private UMShareListener f78438f;

        public class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f78440a;

            a(List list) {
                this.f78440a = list;
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                ArrayList arrayList;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24256, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = this.f78440a.iterator();
                while (it.hasNext()) {
                    try {
                        File fileQ0 = com.max.hbimage.b.q0((Bitmap) it.next(), com.max.hbshare.d.d(i.this.f78434b));
                        if (fileQ0 != null && fileQ0.exists()) {
                            arrayList2.add(fileQ0.getAbsolutePath());
                        }
                    } catch (Throwable th2) {
                        Log.e("ShareByteDance", "" + th2.getMessage());
                    }
                }
                Activity activity = null;
                if (com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.f78417t)) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(ShareImageDialogFragment.this.f78417t);
                }
                if (i.this.f78434b instanceof Activity) {
                    activity = (Activity) i.this.f78434b;
                } else {
                    com.max.hbutils.utils.e.b().a();
                }
                com.max.hbshare.d.s(activity, arrayList2, arrayList, i.this.f78438f);
            }
        }

        public class b implements UMShareListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onCancel(SHARE_MEDIA share_media) {
                if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24255, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                    return;
                }
                ShareImageDialogFragment.this.y4();
                if (ShareImageDialogFragment.this.f78410m != null) {
                    ShareImageDialogFragment.this.f78410m.onCancel(share_media);
                }
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onError(SHARE_MEDIA share_media, Throwable th2) {
                if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 24254, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.share_fail));
                ShareImageDialogFragment.this.y4();
                if (ShareImageDialogFragment.this.f78410m != null) {
                    ShareImageDialogFragment.this.f78410m.onError(share_media, th2);
                }
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onResult(SHARE_MEDIA share_media) {
                if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24253, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
                ShareImageDialogFragment.this.y4();
                if (ShareImageDialogFragment.this.f78410m == null || !ShareImageDialogFragment.this.isAdded()) {
                    return;
                }
                ShareImageDialogFragment.this.f78410m.onResult(share_media);
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onStart(SHARE_MEDIA share_media) {
                if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24252, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || ShareImageDialogFragment.this.f78410m == null) {
                    return;
                }
                ShareImageDialogFragment.this.f78410m.onStart(share_media);
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShareTypeObj f78443b;

            c(ShareTypeObj shareTypeObj) {
                this.f78443b = shareTypeObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24257, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                i.this.q(this.f78443b.getType());
            }
        }

        public class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ QMUIRadiusImageView f78445b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f78446c;

            d(QMUIRadiusImageView qMUIRadiusImageView, String str) {
                this.f78445b = qMUIRadiusImageView;
                this.f78446c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24258, new Class[0], Void.TYPE).isSupported && ShareImageDialogFragment.this.isActive()) {
                    if (ShareImageDialogFragment.this.J == null) {
                        i iVar = i.this;
                        ShareImageDialogFragment.this.J = com.max.xiaoheihe.module.account.utils.l.d0(iVar.f78434b, this.f78445b, this.f78446c, true, 30, 4, false);
                    } else {
                        if (ShareImageDialogFragment.this.J.L()) {
                            return;
                        }
                        ShareImageDialogFragment.this.J.O();
                    }
                }
            }
        }

        public class e implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f78448a;

            e(Bitmap bitmap) {
                this.f78448a = bitmap;
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24259, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbshare.d.t(i.this.f78434b, new UMImage(i.this.f78434b, this.f78448a), null, i.this.f78438f);
            }
        }

        public class f implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f78450a;

            f(Bitmap bitmap) {
                this.f78450a = bitmap;
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24260, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbshare.d.u(i.this.f78434b, new UMImage(i.this.f78434b, this.f78450a), null, i.this.f78438f);
            }
        }

        public class g extends com.max.hbcommon.network.d<File> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f78452b;

            g(List list) {
                this.f78452b = list;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(Throwable th2) {
                if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24261, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                i.o(i.this, this.f78452b);
            }

            public void onNext(File file) {
                if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 24262, new Class[]{File.class}, Void.TYPE).isSupported || file == null || !file.exists()) {
                    return;
                }
                try {
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (!ShareImageDialogFragment.this.w4(bitmapDecodeFile)) {
                        i.o(i.this, this.f78452b);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Bitmap bitmap : this.f78452b) {
                        i iVar = i.this;
                        Bitmap bitmapK4 = ShareImageDialogFragment.this.k4(iVar.f78434b, bitmapDecodeFile, bitmap);
                        if (bitmapK4 != null) {
                            arrayList.add(bitmapK4);
                        }
                    }
                    i.o(i.this, arrayList);
                } catch (Throwable th2) {
                    Log.e("douYinBgBitmap", "douYinBgBitmap error: " + th2.getMessage());
                    i.o(i.this, this.f78452b);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24263, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((File) obj);
            }
        }

        public class h implements com.max.hbimage.b.s {
            public static ChangeQuickRedirect changeQuickRedirect;

            h() {
            }

            @Override // com.max.hbimage.b.s
            public String getFileName(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24264, new Class[]{String.class}, String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.ShareImageDialogFragment$i$i, reason: collision with other inner class name */
        public class C0641i implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0641i() {
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24265, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ShareImageDialogFragment.T3(ShareImageDialogFragment.this, false, null);
            }
        }

        public class j implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            public class a implements g {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.g
                public void a(List<File> list) {
                    if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24268, new Class[]{List.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    ShareImageDialogFragment.V3(ShareImageDialogFragment.this, list);
                }

                @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.g
                public void onError(Throwable th2) {
                    if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24267, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail) + ": " + th2.toString());
                }
            }

            j() {
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24266, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ShareImageDialogFragment.T3(ShareImageDialogFragment.this, true, new a());
            }
        }

        public i(Context context, List<ShareTypeObj> list) {
            super(context, list, R.layout.item_share);
            this.f78438f = new b();
            this.f78434b = context;
            this.f78436d = ViewUtils.f(context, 56.0f);
            this.f78437e = ViewUtils.f(context, 12.0f);
            this.f78435c = com.max.accelworld.f.a(ViewUtils.L(context) - this.f78437e, this.f78436d, ViewUtils.f(context, 12.0f), 0.33f, 0.66f);
        }

        static /* synthetic */ void o(i iVar, List list) {
            if (PatchProxy.proxy(new Object[]{iVar, list}, null, changeQuickRedirect, true, 24251, new Class[]{i.class, List.class}, Void.TYPE).isSupported) {
                return;
            }
            iVar.r(list);
        }

        private void r(List<Bitmap> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24249, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.w(list)) {
                PermissionManager.f71603a.T((FragmentActivity) this.f78434b, new a(list));
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.fail));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, ShareTypeObj shareTypeObj) {
            if (PatchProxy.proxy(new Object[]{eVar, shareTypeObj}, this, changeQuickRedirect, false, 24250, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, shareTypeObj);
        }

        public void p(com.max.hbcommon.base.adapter.s.e eVar, ShareTypeObj shareTypeObj) {
            if (PatchProxy.proxy(new Object[]{eVar, shareTypeObj}, this, changeQuickRedirect, false, 24247, new Class[]{com.max.hbcommon.base.adapter.s.e.class, ShareTypeObj.class}, Void.TYPE).isSupported) {
                return;
            }
            eVar.itemView.setOnClickListener(new c(shareTypeObj));
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) eVar.i(R.id.iv_share_icon);
            TextView textView = (TextView) eVar.i(R.id.tv_share_desc);
            View viewI = eVar.i(R.id.v_border);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.b().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = this.f78436d + this.f78435c;
            if (eVar.getBindingAdapterPosition() == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f78437e - (this.f78435c / 2);
            }
            if (eVar.getBindingAdapterPosition() == getDataList().size() - 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f78437e - (this.f78435c / 2);
            }
            eVar.b().setLayoutParams(layoutParams);
            if (getDataList().equals(ShareImageDialogFragment.this.o4())) {
                qMUIRadiusImageView.setBackground(ViewUtils.j(qMUIRadiusImageView.getWidth(), androidx.core.content.d.f(this.f78434b, R.color.background_layer_1_color)));
            }
            if (!com.max.hbcommon.utils.c.u(shareTypeObj.getIconUrl())) {
                qMUIRadiusImageView.clearColorFilter();
                qMUIRadiusImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                com.max.hbimage.b.d0(shareTypeObj.getIconUrl(), qMUIRadiusImageView, ViewUtils.f(this.f78434b, 3.0f));
            } else if (shareTypeObj.getIconId() != -1) {
                qMUIRadiusImageView.setImageResource(shareTypeObj.getIconId());
                if (shareTypeObj.getClearColorFilter()) {
                    qMUIRadiusImageView.clearColorFilter();
                } else {
                    qMUIRadiusImageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                }
                viewI.setVisibility(8);
            }
            qMUIRadiusImageView.setCornerRadius(shareTypeObj.getCornerRadius());
            textView.setText(shareTypeObj.getName());
            if (shareTypeObj.getType() != ShareType.Post || com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.E)) {
                return;
            }
            new Handler().postDelayed(new d(qMUIRadiusImageView, ShareImageDialogFragment.this.E), 100L);
            ShareImageDialogFragment.this.E = null;
        }

        public void q(ShareType shareType) {
            if (PatchProxy.proxy(new Object[]{shareType}, this, changeQuickRedirect, false, 24248, new Class[]{ShareType.class}, Void.TYPE).isSupported) {
            }
            ShareImageDialogFragment.P3(ShareImageDialogFragment.this);
            switch (d.f78433a[shareType.ordinal()]) {
                case 1:
                    Bitmap bitmapQ3 = ShareImageDialogFragment.Q3(ShareImageDialogFragment.this);
                    if (bitmapQ3 == null) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.fail));
                    } else {
                        com.max.hbshare.d.w(this.f78434b, new UMImage(this.f78434b, bitmapQ3), null, this.f78438f);
                    }
                    break;
                case 2:
                    Bitmap bitmapQ4 = ShareImageDialogFragment.Q3(ShareImageDialogFragment.this);
                    if (bitmapQ4 == null) {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.fail));
                    } else {
                        com.max.hbshare.d.x(this.f78434b, new UMImage(this.f78434b, bitmapQ4), null, this.f78438f);
                    }
                    break;
                case 3:
                    Bitmap bitmapQ5 = ShareImageDialogFragment.Q3(ShareImageDialogFragment.this);
                    if (bitmapQ5 == null) {
                        com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.fail));
                    } else {
                        com.max.hbshare.d.v(this.f78434b, new UMImage(this.f78434b, bitmapQ5), null, this.f78438f);
                    }
                    break;
                case 4:
                    Bitmap bitmapQ6 = ShareImageDialogFragment.Q3(ShareImageDialogFragment.this);
                    if (bitmapQ6 == null) {
                        com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.fail));
                    } else {
                        PermissionManager.f71603a.T((FragmentActivity) this.f78434b, new e(bitmapQ6));
                    }
                    break;
                case 5:
                    Bitmap bitmapQ7 = ShareImageDialogFragment.Q3(ShareImageDialogFragment.this);
                    if (bitmapQ7 == null) {
                        com.max.hbutils.utils.c cVar5 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(ShareImageDialogFragment.this.getString(R.string.fail));
                    } else {
                        PermissionManager.f71603a.T((FragmentActivity) this.f78434b, new f(bitmapQ7));
                    }
                    break;
                case 6:
                    ShareImageDialogFragment shareImageDialogFragment = ShareImageDialogFragment.this;
                    List<Bitmap> listR3 = ShareImageDialogFragment.R3(shareImageDialogFragment, !shareImageDialogFragment.f78412o);
                    if (!com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.C)) {
                        com.max.hbimage.b.i(com.max.hbcommon.utils.q.b(), new h(), ShareImageDialogFragment.this.C).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(listR3));
                    } else {
                        r(listR3);
                    }
                    break;
                case 7:
                    if (ShareImageDialogFragment.this.f78410m instanceof com.max.hbshare.c.b) {
                        ((com.max.hbshare.c.b) ShareImageDialogFragment.this.f78410m).c("1", com.max.hbshare.d.f72587i);
                    }
                    PermissionManager.f71603a.T(ShareImageDialogFragment.this.getActivity(), new C0641i());
                    break;
                case 8:
                    if (ShareImageDialogFragment.this.f78411n != null) {
                        ShareImageDialogFragment.this.f78411n.a();
                    } else if (!com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.f78408k)) {
                        com.max.xiaoheihe.utils.b0.b(this.f78434b, ShareImageDialogFragment.this.f78408k, this.f78434b.getResources().getString(R.string.copy_link_successful));
                    }
                    break;
                case 9:
                    PermissionManager.f71603a.T(ShareImageDialogFragment.this.getActivity(), new j());
                    break;
                case 10:
                    if (com.max.hbcommon.utils.c.u(ShareImageDialogFragment.this.I.getSync_steam_protocol())) {
                        Context context = this.f78434b;
                        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : com.max.hbutils.utils.e.b().a() instanceof FragmentActivity ? (FragmentActivity) com.max.hbutils.utils.e.b().a() : null;
                        if (fragmentActivity != null) {
                            d2.v4(ShareImageDialogFragment.this.I).show(fragmentActivity.getSupportFragmentManager(), "syncfragment");
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("action", "sync");
                            jsonObject.addProperty("from", "image_dialog");
                            com.max.hbcommon.analytics.d.d("4", GameCommentSuccessActivity.X, null, jsonObject);
                        }
                    } else {
                        com.max.xiaoheihe.base.router.b.j0(this.f78434b, ShareImageDialogFragment.this.I.getSync_steam_protocol());
                    }
                    ShareImageDialogFragment.this.dismiss();
                    break;
            }
        }
    }

    static /* synthetic */ void P3(ShareImageDialogFragment shareImageDialogFragment) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, null, changeQuickRedirect, true, 24234, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        shareImageDialogFragment.i4();
    }

    static /* synthetic */ Bitmap Q3(ShareImageDialogFragment shareImageDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareImageDialogFragment}, null, changeQuickRedirect, true, 24235, new Class[]{ShareImageDialogFragment.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : shareImageDialogFragment.m4();
    }

    static /* synthetic */ List R3(ShareImageDialogFragment shareImageDialogFragment, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareImageDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24236, new Class[]{ShareImageDialogFragment.class, Boolean.TYPE}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : shareImageDialogFragment.r4(z10);
    }

    static /* synthetic */ void T3(ShareImageDialogFragment shareImageDialogFragment, boolean z10, g gVar) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0), gVar}, null, changeQuickRedirect, true, 24237, new Class[]{ShareImageDialogFragment.class, Boolean.TYPE, g.class}, Void.TYPE).isSupported) {
            return;
        }
        shareImageDialogFragment.l4(z10, gVar);
    }

    static /* synthetic */ void V3(ShareImageDialogFragment shareImageDialogFragment, List list) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment, list}, null, changeQuickRedirect, true, 24238, new Class[]{ShareImageDialogFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        shareImageDialogFragment.c5(list);
    }

    private HBShareReportData b5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24228, new Class[0], HBShareReportData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareReportData) patchProxyResultProxy.result;
        }
        UMShareListener uMShareListener = this.f78410m;
        return uMShareListener instanceof com.max.hbshare.c.b ? ((com.max.hbshare.c.b) uMShareListener).f72577a.n() : new HBShareReportData();
    }

    private void c5(List<File> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24226, new Class[]{List.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(getActivity())) {
            h hVar = this.f78422y;
            if (hVar != null) {
                hVar.a();
            }
            z4("1");
            Intent intentX2 = PostTabActivity.x2(getActivity(), PostType.Picture);
            intentX2.putExtra(PictureVideoEditPostFragment.f82337f4, "true");
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
            List<Bitmap> listQ4 = q4();
            if (!com.max.hbcommon.utils.c.w(list)) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    File file = list.get(i10);
                    if (i10 == 0 && this.f78414q != null) {
                        bb.a.f30446a.put(com.max.hbutils.utils.s.b(file), this.f78414q);
                    }
                    Bitmap bitmap = listQ4.get(i10);
                    BBSTextObj bBSTextObj = new BBSTextObj();
                    bBSTextObj.setText(file.getAbsolutePath());
                    bBSTextObj.setHeight(String.valueOf(bitmap.getHeight()));
                    bBSTextObj.setWidth(String.valueOf(bitmap.getWidth()));
                    pictureVideoLinkDraftObj.getImgPathList().add(bBSTextObj);
                }
            }
            if (!com.max.hbcommon.utils.c.w(this.A)) {
                pictureVideoLinkDraftObj.setHashtagList(this.A);
            }
            if (this.f78415r != null) {
                pictureVideoLinkDraftObj.getGameList().add(this.f78415r);
            }
            pictureVideoLinkDraftObj.setCheckedTopics(this.f78413p);
            pictureVideoLinkDraftObj.setDefault_content(this.B);
            if (!com.max.hbcommon.utils.c.u(this.f78416s)) {
                pictureVideoLinkDraftObj.setContent(this.f78416s);
            }
            intentX2.putExtra(PictureVideoEditPostFragment.f82338g4, com.max.hbutils.utils.k.p(b5()));
            intentX2.putExtra(PictureVideoEditPostFragment.f82341j4, this.G);
            if (getArguments() != null) {
                intentX2.putExtra("source", getArguments().getString("source", ""));
            }
            if (!com.max.hbcommon.utils.c.u(this.H)) {
                intentX2.putExtra(PostTabActivity.J3, this.H);
            }
            if (!com.max.hbcommon.utils.c.u(this.F)) {
                Bundle bundleF = PostUtils.f(this.F);
                if (bundleF != null) {
                    intentX2.putExtras(bundleF);
                }
                pictureVideoLinkDraftObj = PostUtils.i(bundleF, pictureVideoLinkDraftObj);
            }
            intentX2.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
            getActivity().startActivityForResult(intentX2, 9991);
        }
    }

    private void i4() {
        BubbleTipPopup bubbleTipPopup;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24223, new Class[0], Void.TYPE).isSupported || (bubbleTipPopup = this.J) == null) {
            return;
        }
        bubbleTipPopup.G();
        this.J = null;
    }

    private void l4(boolean z10, g gVar) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), gVar}, this, changeQuickRedirect, false, 24215, new Class[]{Boolean.TYPE, g.class}, Void.TYPE).isSupported) {
            return;
        }
        List<Bitmap> listR4 = r4(z10);
        if (gVar == null) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.saving));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Bitmap> it = listR4.iterator();
        while (it.hasNext()) {
            File fileQ0 = com.max.hbimage.b.q0(it.next(), com.max.xiaoheihe.utils.d.T());
            if (fileQ0 != null && fileQ0.exists()) {
                arrayList.add(fileQ0);
            }
        }
        if (arrayList.size() != 0) {
            Iterator<File> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.max.hbimage.b.l0(getContext(), it2.next().getAbsolutePath());
            }
            if (gVar == null) {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.Z());
            } else {
                gVar.a(arrayList);
            }
        } else if (gVar == null) {
            com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.save_fail));
        } else {
            gVar.onError(new Throwable("size is 0"));
        }
        y4();
        dismiss();
    }

    private Bitmap m4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24216, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmap = this.f78405h;
        return bitmap != null ? bitmap : q4().get(0);
    }

    private List<Bitmap> q4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24217, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : r4(false);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    private List<Bitmap> r4(boolean z10) {
        int iV;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24218, new Class[]{Boolean.TYPE}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        this.f78409l.clear();
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) this.f78402e.getChildAt(0);
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(R.id.ll_share_content);
            if (viewFindViewById != null) {
                if (!z10) {
                    iV = 0;
                } else if (this.f78412o) {
                    iV = ViewUtils.V(viewFindViewById.findViewById(R.id.v_qr_code));
                } else {
                    ScreenStyleInfoObj screenStyleInfoObj = this.D;
                    if (screenStyleInfoObj == null || screenStyleInfoObj.getBottom() == null) {
                        iV = 0;
                    } else {
                        iV = ViewUtils.V(viewFindViewById.findViewById(R.id.vg_bottom_logo));
                    }
                }
                Bitmap bitmapN = com.max.hbimage.b.n(viewFindViewById, viewFindViewById.getMeasuredWidth(), viewFindViewById.getMeasuredHeight() - iV, -1, true, 2.0f);
                arrayList.add(bitmapN);
                this.f78409l.add(bitmapN);
            }
        }
        return arrayList;
    }

    private void v4(IndicatorView indicatorView) {
        if (PatchProxy.proxy(new Object[]{indicatorView}, this, changeQuickRedirect, false, 24212, new Class[]{IndicatorView.class}, Void.TYPE).isSupported) {
            return;
        }
        ch.b bVar = new ch.b();
        bVar.z(com.max.xiaoheihe.utils.d.E(R.color.white_alpha40), com.max.xiaoheihe.utils.d.E(R.color.white));
        bVar.v(this.f78404g.size());
        bVar.A(ViewUtils.f(BaseApplication.a(), 6.0f));
        bVar.B(ViewUtils.f(BaseApplication.a(), 2.0f));
        bVar.r(4);
        indicatorView.setIndicatorOptions(bVar);
        this.f78402e.registerOnPageChangeCallback(new c(indicatorView));
    }

    public static ShareImageDialogFragment x4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24209, new Class[0], ShareImageDialogFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareImageDialogFragment) patchProxyResultProxy.result;
        }
        ShareImageDialogFragment shareImageDialogFragment = new ShareImageDialogFragment();
        shareImageDialogFragment.setArguments(new Bundle());
        return shareImageDialogFragment;
    }

    private void z4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24227, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        UMShareListener uMShareListener = this.f78410m;
        if (uMShareListener instanceof com.max.hbshare.c.b) {
            ((com.max.hbshare.c.b) uMShareListener).c(str, com.max.hbshare.d.f72591m);
        }
    }

    public void A4(Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 24229, new Class[]{Bitmap.class}, Void.TYPE).isSupported || bitmap == null) {
            return;
        }
        if (this.f78404g == null) {
            this.f78404g = new ArrayList();
        }
        this.f78404g.add(bitmap);
    }

    public void B4(List<Bitmap> list) {
        this.f78404g = list;
    }

    public void C4(ShareImageDialogConfigObj shareImageDialogConfigObj) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogConfigObj}, this, changeQuickRedirect, false, 24231, new Class[]{ShareImageDialogConfigObj.class}, Void.TYPE).isSupported || shareImageDialogConfigObj == null) {
            return;
        }
        this.f78407j = shareImageDialogConfigObj.getShare_title();
        this.f78408k = shareImageDialogConfigObj.getShare_url();
        this.f78412o = com.max.hbcommon.utils.c.x(shareImageDialogConfigObj.getQr_code());
        this.f78414q = shareImageDialogConfigObj.getImage_src();
        this.f78413p = shareImageDialogConfigObj.getTopicList();
        this.f78417t = shareImageDialogConfigObj.getDouyin_hashtag();
        this.C = shareImageDialogConfigObj.getDouyin_bg_url();
        this.f78423z = shareImageDialogConfigObj.getQr_code_bitmap();
        this.A = shareImageDialogConfigObj.getHashtags();
        this.B = shareImageDialogConfigObj.getDefault_content();
        this.f78405h = shareImageDialogConfigObj.getSingleBitmap();
        this.D = shareImageDialogConfigObj.getScreenStyleInfo();
        this.E = shareImageDialogConfigObj.getPostTips();
        this.F = shareImageDialogConfigObj.getPost_extra_params();
        this.G = shareImageDialogConfigObj.getPost_card_ids();
    }

    public void D4(e eVar) {
        this.f78403f = eVar;
    }

    public void E4(String str) {
        this.B = str;
    }

    public void F4(String str) {
        this.C = str;
    }

    public void G4(String str) {
        this.f78417t = str;
    }

    public void H4(GameObj gameObj) {
        this.f78415r = gameObj;
    }

    public void I4(List<String> list) {
        this.A = list;
    }

    public void J4(String str) {
        this.f78414q = str;
    }

    public void K4(h hVar) {
        this.f78422y = hVar;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void L4(String str) {
        this.f78416s = str;
    }

    public void M4(String str) {
        this.E = str;
    }

    public void N4(String str) {
        this.G = str;
    }

    public void O4(String str) {
        this.H = str;
    }

    public void P4(Bitmap bitmap) {
        this.f78423z = bitmap;
    }

    public void Q4(Bitmap bitmap) {
        this.f78406i = bitmap;
    }

    public void R4(ScreenStyleInfoObj screenStyleInfoObj) {
        this.D = screenStyleInfoObj;
    }

    public void S4(UMShareListener uMShareListener) {
        this.f78410m = uMShareListener;
    }

    public void T4(String str) {
        this.f78407j = str;
    }

    public void U4(String str) {
        this.f78408k = str;
    }

    public void V4(boolean z10) {
        this.f78412o = z10;
    }

    public void W4(Bitmap bitmap) {
        this.f78405h = bitmap;
    }

    public void X4(SyncSteamCommentObj syncSteamCommentObj) {
        this.I = syncSteamCommentObj;
    }

    public void Y4(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 24230, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported || bBSTopicObj == null) {
            return;
        }
        if (this.f78413p == null) {
            this.f78413p = new ArrayList();
        }
        this.f78413p.add(bBSTopicObj);
    }

    public void Z4(List<BBSTopicObj> list) {
        this.f78413p = list;
    }

    public void a5(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, 24213, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f78411n = fVar;
        if (fVar == null || com.max.hbcommon.utils.c.w(this.f78421x)) {
            return;
        }
        List<ShareTypeObj> list = this.f78421x;
        ShareType shareType = ShareType.CopyUrl;
        if (j4(list, shareType)) {
            return;
        }
        this.f78421x.add(0, new ShareTypeObj("复制链接", R.drawable.share_copy_circle, null, shareType));
    }

    public boolean j4(List<ShareTypeObj> list, ShareType shareType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, shareType}, this, changeQuickRedirect, false, 24214, new Class[]{List.class, ShareType.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.w(list)) {
            Iterator<ShareTypeObj> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == shareType) {
                    return true;
                }
            }
        }
        return false;
    }

    public Bitmap k4(Context context, Bitmap bitmap, Bitmap bitmap2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bitmap, bitmap2}, this, changeQuickRedirect, false, 24232, new Class[]{Context.class, Bitmap.class, Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (!w4(bitmap2)) {
            return null;
        }
        if (!w4(bitmap)) {
            return bitmap2;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, ViewUtils.f(context, 224.0f), ViewUtils.f(context, 438.0f), false);
        int iF = ViewUtils.f(context, 181.0f);
        int iF2 = ViewUtils.f(context, 300.0f);
        int iF3 = ViewUtils.f(context, 11.0f);
        int iF4 = ViewUtils.f(context, 67.0f);
        float f10 = iF;
        float f11 = iF2;
        if (bitmap2.getWidth() / bitmap2.getHeight() > f10 / f11) {
            int height = (int) ((bitmap2.getHeight() / bitmap2.getWidth()) * f10);
            iF4 += (iF2 - height) / 2;
            iF2 = height;
        } else {
            int width = (int) ((bitmap2.getWidth() / bitmap2.getHeight()) * f11);
            iF3 += (iF - width) / 2;
            iF = width;
        }
        Bitmap bitmapL = com.max.mediaselector.lib.utils.c.l(Bitmap.createScaledBitmap(bitmap2, iF, iF2, false), ViewUtils.f(context, 8.0f));
        Canvas canvas = new Canvas(bitmapCreateScaledBitmap);
        canvas.drawBitmap(bitmapL, iF3, iF4, (Paint) null);
        canvas.save();
        canvas.restore();
        return bitmapCreateScaledBitmap;
    }

    public e n4() {
        return this.f78403f;
    }

    public List<ShareTypeObj> o4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24224, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        BBSTopicObj bBSTopicObj = !com.max.hbcommon.utils.c.w(this.f78413p) ? this.f78413p.get(0) : null;
        if (this.I != null) {
            arrayList.add(new ShareTypeObj("同步Steam", R.drawable.bbs_share_button_steam_46x46, null, ShareType.SyncCommentToSteam, true, ViewUtils.f(getContext(), 5.0f)));
        }
        arrayList.add(new ShareTypeObj("分享至社区", R.drawable.bbs_share_button_post_46x46, bBSTopicObj != null ? bBSTopicObj.getPic_url() : null, ShareType.Post, true));
        List<Bitmap> list = this.f78404g;
        arrayList.add(new ShareTypeObj((list == null || list.size() <= 1) ? com.max.xiaoheihe.utils.d.n0(R.string.save_to_disk) : "全部保存", R.drawable.bbs_sharebutton_save_to_disk_46x46, null, ShareType.Save));
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24220, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(getContext()).onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 24210, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : layoutInflater.inflate(R.layout.fragment_share_image_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24222, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        i4();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 24221, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDismiss(dialogInterface);
        Bitmap bitmap = this.f78406i;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f78406i.recycle();
        }
        i4();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 24211, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.D != null) {
            this.f78412o = false;
        }
        view.setOnClickListener(new a());
        if (this.f78404g == null) {
            this.f78404g = new ArrayList();
        }
        if (this.f78403f != null) {
            this.f78404g.add(0, null);
        }
        if (this.f78404g.size() == 0) {
            dismiss();
        } else {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.rl_bg);
            Bitmap bitmap = this.f78406i;
            if (bitmap != null && bitmap.getWidth() > 0 && this.f78406i.getHeight() > 0) {
                viewGroup.setBackgroundDrawable(new BitmapDrawable(this.f78406i));
            }
            this.f78402e = (ViewPager2) view.findViewById(R.id.vp_images);
            IndicatorView indicatorView = (IndicatorView) view.findViewById(R.id.v_indicator);
            if (this.f78404g.size() > 1) {
                indicatorView.setVisibility(0);
                v4(indicatorView);
            } else {
                indicatorView.setVisibility(8);
            }
            this.f78402e.setOffscreenPageLimit(this.f78404g.size());
            int iL = (ViewUtils.L(BaseApplication.a()) * (this.f78404g.size() > 1 ? 6 : 8)) / 10;
            int iL2 = ((ViewUtils.L(BaseApplication.a()) - iL) / 2) - ViewUtils.f(BaseApplication.a(), 15.0f);
            ((ViewGroup.MarginLayoutParams) this.f78402e.getLayoutParams()).bottomMargin = ViewUtils.f(BaseApplication.a(), this.f78404g.size() > 1 ? bb.c.b.f30830o2 : 254);
            this.f78402e.getChildAt(0).setPadding(iL2, 0, iL2, 0);
            ((RecyclerView) this.f78402e.getChildAt(0)).setClipToPadding(false);
            this.f78402e.setAdapter(new b(getContext(), this.f78404g, R.layout.item_share_image_dialog, iL));
            this.f78420w = o4();
            this.f78421x = s4();
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_local_share);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            i iVar = new i(getContext(), this.f78420w);
            this.f78418u = iVar;
            recyclerView.setAdapter(iVar);
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_share);
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            i iVar2 = new i(getContext(), this.f78421x);
            this.f78419v = iVar2;
            recyclerView2.setAdapter(iVar2);
            View viewFindViewById = view.findViewById(R.id.rv_divider);
            if (this.f78420w.size() > 0) {
                viewFindViewById.setVisibility(0);
                recyclerView.setVisibility(0);
            }
        }
        UMShareListener uMShareListener = this.f78410m;
        if (uMShareListener instanceof com.max.hbshare.c.b) {
            ((com.max.hbshare.c.b) uMShareListener).c("3", null);
        }
    }

    public h p4() {
        return this.f78422y;
    }

    public List<ShareTypeObj> s4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24225, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f78411n != null || !com.max.hbcommon.utils.c.u(this.f78408k)) {
            arrayList.add(new ShareTypeObj("复制链接", R.drawable.share_copy_circle, null, ShareType.CopyUrl));
        }
        arrayList.add(new ShareTypeObj(com.max.xiaoheihe.utils.d.n0(R.string.weixin_friends), R.drawable.share_weixin_circle, null, ShareType.WeiXin));
        arrayList.add(new ShareTypeObj(com.max.xiaoheihe.utils.d.n0(R.string.wechat_timeline), R.drawable.share_weixin_circle_circle, null, ShareType.WeiXinCircle));
        arrayList.add(new ShareTypeObj(com.max.xiaoheihe.utils.d.n0(R.string.qq), R.drawable.share_qq_circle, null, ShareType.QQ));
        arrayList.add(new ShareTypeObj(com.max.xiaoheihe.utils.d.n0(R.string.byte_dance), R.drawable.bbs_sharebutton_tik_46x46, null, ShareType.ByteDance));
        arrayList.add(new ShareTypeObj(com.max.xiaoheihe.utils.d.n0(R.string.qq_zone), R.drawable.share_qzone_circle, null, ShareType.QZone));
        arrayList.add(new ShareTypeObj(com.max.xiaoheihe.utils.d.n0(R.string.weibo), R.drawable.share_sina_circle, null, ShareType.Sina));
        return arrayList;
    }

    public UMShareListener t4() {
        return this.f78410m;
    }

    public f u4() {
        return this.f78411n;
    }

    public boolean w4(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 24233, new Class[]{Bitmap.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (bitmap != null) {
            if ((bitmap.getHeight() > 0) & (bitmap.getWidth() > 0)) {
                return true;
            }
        }
        return false;
    }

    public void y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24219, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Bitmap bitmap : this.f78409l) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        System.gc();
    }
}
