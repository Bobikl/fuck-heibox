package com.max.hbshare;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.n;
import com.bytedance.sdk.open.aweme.base.ImageObject;
import com.bytedance.sdk.open.aweme.base.MediaContent;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.ShareImageObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import pb.l;

/* JADX INFO: compiled from: ShareUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UMShareListener f72579a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SHARE_MEDIA f72580b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f72581c = "WechatTimeline";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72582d = "WechatSession";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f72583e = "SinaWeibo";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f72584f = "QQFriend";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f72585g = "QZone";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f72586h = "Douyin";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f72587i = "SaveToDevice";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f72588j = "CopyURL";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f72589k = "Feedback";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f72590l = "GenerateImage";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f72591m = "PostLink";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f72592n = "POST_AUTHORIZATION";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f72593o = "POST_OPTION_ONLY";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f72594p = "SHARE_WINDOW_BG_COLOR";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f72595q = "normal";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f72596r = "game";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f72597s = "web";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f72598t = "BBSComment";

    /* JADX INFO: compiled from: ShareUtils.java */
    public class a extends s<PostOptionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f72599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f72600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f72601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f72602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f72603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Dialog f72604g;

        /* JADX INFO: renamed from: com.max.hbshare.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ShareUtils.java */
        public class ViewOnClickListenerC0581a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostOptionObj f72605b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ s.e f72606c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImageView f72607d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TextView f72608e;

            ViewOnClickListenerC0581a(PostOptionObj postOptionObj, s.e eVar, ImageView imageView, TextView textView) {
                this.f72605b = postOptionObj;
                this.f72606c = eVar;
                this.f72607d = imageView;
                this.f72608e = textView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33777pa, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f72605b.getClick_listener().onClick(a.this.f72604g, this.f72606c.b(), this.f72607d, this.f72608e);
                a.this.f72604g.dismiss();
            }
        }

        /* JADX INFO: compiled from: ShareUtils.java */
        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostOptionObj f72610b;

            b(PostOptionObj postOptionObj) {
                this.f72610b = postOptionObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33800qa, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ob.a.p().c(a.this.f72599b, this.f72610b.getProtocol());
                a.this.f72604g.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, int i10, Context context2, int i11, int i12, int i13, boolean z10, Dialog dialog) {
            super(context, list, i10);
            this.f72599b = context2;
            this.f72600c = i11;
            this.f72601d = i12;
            this.f72602e = i13;
            this.f72603f = z10;
            this.f72604g = dialog;
        }

        public void m(s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, bb.c.k.f33731na, new Class[]{s.e.class, PostOptionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            d.b(this.f72599b, postOptionObj, imageView, textView);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.b().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = this.f72600c + this.f72601d;
            if (eVar.getBindingAdapterPosition() == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f72602e - (this.f72601d / 2);
            }
            if (eVar.getBindingAdapterPosition() == getDataList().size() - 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f72602e - (this.f72601d / 2);
            }
            eVar.b().setLayoutParams(layoutParams);
            if (this.f72603f) {
                imageView.setBackground(ViewUtils.j(imageView.getWidth(), androidx.core.content.d.f(this.f72599b, R.color.background_layer_1_color)));
            }
            if (postOptionObj.getClick_listener() != null) {
                eVar.b().setOnClickListener(new ViewOnClickListenerC0581a(postOptionObj, eVar, imageView, textView));
            } else {
                if (com.max.hbcommon.utils.c.u(postOptionObj.getProtocol())) {
                    return;
                }
                eVar.b().setOnClickListener(new b(postOptionObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, bb.c.k.f33754oa, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, postOptionObj);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class b extends com.bumptech.glide.request.target.e<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f72612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f72613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HBShareData f72614d;

        b(l lVar, Context context, HBShareData hBShareData) {
            this.f72612b = lVar;
            this.f72613c = context;
            this.f72614d = hBShareData;
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.k.f33685la, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            d.p(this.f72613c, this.f72614d);
        }

        public void onResourceReady(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            l lVar;
            if (PatchProxy.proxy(new Object[]{bitmap, fVar}, this, changeQuickRedirect, false, bb.c.k.f33662ka, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported || (lVar = this.f72612b) == null) {
                return;
            }
            Context context = this.f72613c;
            lVar.a((FragmentActivity) context, ((FragmentActivity) context).getSupportFragmentManager(), new ShareImageObj(bitmap, null, null));
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.k.f33708ma, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f72615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f72616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HBShareData f72617d;

        c(Context context, com.max.hbcommon.component.i iVar, HBShareData hBShareData) {
            this.f72615b = context;
            this.f72616c = iVar;
            this.f72617d = hBShareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33822ra, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d.n(this.f72615b, this.f72616c);
            if (this.f72617d.getShareListener() != null) {
                this.f72617d.getShareListener().onCancel(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.hbshare.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ShareUtils.java */
    public class C0582d implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f72618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f72619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f72620c;

        C0582d(Context context, String str, HBShareData hBShareData) {
            this.f72618a = context;
            this.f72619b = str;
            this.f72620c = hBShareData;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.k.f33844sa, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            u.a(this.f72618a, this.f72619b);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(this.f72618a.getString(R.string.copy_link_successful));
            d.n(this.f72618a, dialog);
            UMShareListener shareListener = this.f72620c.getShareListener();
            if (shareListener instanceof com.max.hbshare.c.b) {
                com.max.hbshare.c.b bVar = (com.max.hbshare.c.b) shareListener;
                com.max.hbshare.c.a(bVar.f72577a.e(), "1", d.f72588j, bVar.f72577a.b());
            }
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class e implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBShareData f72621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f72623c;

        e(HBShareData hBShareData, boolean z10, Context context) {
            this.f72621a = hBShareData;
            this.f72622b = z10;
            this.f72623c = context;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.k.f33866ta, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || d.a(this.f72621a)) {
                return;
            }
            if (this.f72622b) {
                d.w(this.f72623c, this.f72621a.getUmImage(), this.f72621a.getText(), this.f72621a.getShareListener());
            } else {
                d.C(this.f72623c, this.f72621a);
            }
            d.n(this.f72623c, dialog);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class f implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBShareData f72624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f72626c;

        f(HBShareData hBShareData, boolean z10, Context context) {
            this.f72624a = hBShareData;
            this.f72625b = z10;
            this.f72626c = context;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.k.f33888ua, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || d.a(this.f72624a)) {
                return;
            }
            if (this.f72625b) {
                d.x(this.f72626c, this.f72624a.getUmImage(), this.f72624a.getText(), this.f72624a.getShareListener());
            } else {
                d.D(this.f72626c, this.f72624a);
            }
            d.n(this.f72626c, dialog);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class g implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBShareData f72627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f72629c;

        /* JADX INFO: compiled from: ShareUtils.java */
        public class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33932wa, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                String text = g.this.f72627a.getText();
                d.t(g.this.f72629c, g.this.f72627a.getUmImage(), text, g.this.f72627a.getShareListener());
            }
        }

        g(HBShareData hBShareData, boolean z10, Context context) {
            this.f72627a = hBShareData;
            this.f72628b = z10;
            this.f72629c = context;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.k.f33910va, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || d.a(this.f72627a)) {
                return;
            }
            if (this.f72628b) {
                PermissionManager.f71603a.T((FragmentActivity) this.f72629c, new a());
            } else {
                d.z(this.f72629c, this.f72627a);
            }
            d.n(this.f72629c, dialog);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class h implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBShareData f72631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f72633c;

        /* JADX INFO: compiled from: ShareUtils.java */
        public class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33976ya, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                String text = h.this.f72631a.getText();
                d.u(h.this.f72633c, h.this.f72631a.getUmImage(), text, h.this.f72631a.getShareListener());
            }
        }

        h(HBShareData hBShareData, boolean z10, Context context) {
            this.f72631a = hBShareData;
            this.f72632b = z10;
            this.f72633c = context;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.k.f33954xa, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || d.a(this.f72631a)) {
                return;
            }
            if (this.f72632b) {
                PermissionManager.f71603a.T((FragmentActivity) this.f72633c, new a());
            } else {
                d.A(this.f72633c, this.f72631a);
            }
            d.n(this.f72633c, dialog);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class i implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBShareData f72635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f72637c;

        i(HBShareData hBShareData, boolean z10, Context context) {
            this.f72635a = hBShareData;
            this.f72636b = z10;
            this.f72637c = context;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.k.f33998za, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || d.a(this.f72635a)) {
                return;
            }
            if (this.f72636b) {
                d.v(this.f72637c, this.f72635a.getUmImage(), this.f72635a.getText(), this.f72635a.getShareListener());
            } else {
                d.B(this.f72637c, this.f72635a);
            }
            d.n(this.f72637c, dialog);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public class j extends n<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f72638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ HBShareData f72639f;

        j(Context context, HBShareData hBShareData) {
            this.f72638e = context;
            this.f72639f = hBShareData;
        }

        public void c(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            if (PatchProxy.proxy(new Object[]{bitmap, fVar}, this, changeQuickRedirect, false, bb.c.k.Aa, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f72639f.setUmImage(new UMImage(this.f72638e, bitmap));
            d.y(this.f72638e, SHARE_MEDIA.QQ, this.f72639f);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
        public void onLoadFailed(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.k.Ba, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            d.y(this.f72638e, SHARE_MEDIA.QQ, this.f72639f);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.k.Ca, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Bitmap) obj, fVar);
        }
    }

    public static void A(Context context, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.W9, new Class[]{Context.class, HBShareData.class}, Void.TYPE).isSupported) {
            return;
        }
        y(context, SHARE_MEDIA.QZONE, hBShareData);
    }

    public static void B(Context context, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.S9, new Class[]{Context.class, HBShareData.class}, Void.TYPE).isSupported) {
            return;
        }
        y(context, SHARE_MEDIA.SINA, hBShareData);
    }

    public static void C(Context context, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.Q9, new Class[]{Context.class, HBShareData.class}, Void.TYPE).isSupported) {
            return;
        }
        y(context, SHARE_MEDIA.WEIXIN, hBShareData);
    }

    public static void D(Context context, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.O9, new Class[]{Context.class, HBShareData.class}, Void.TYPE).isSupported) {
            return;
        }
        y(context, SHARE_MEDIA.WEIXIN_CIRCLE, hBShareData);
    }

    public static void E(Context context, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.D9, new Class[]{Context.class, HBShareData.class}, Void.TYPE).isSupported) {
            return;
        }
        l lVarG = ob.a.g();
        if (hBShareData.getUmImage() != null && lVarG != null && hBShareData.getOnlyShareImage()) {
            UMImage umImage = hBShareData.getUmImage();
            if (umImage.asBitmap() != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                lVarG.a(fragmentActivity, fragmentActivity.getSupportFragmentManager(), new ShareImageObj(umImage.asBitmap(), null, null));
                return;
            } else if (umImage.asUrlImage() != null) {
                Glide.F(context).l().load(umImage.asUrlImage()).z1(new b(lVarG, context, hBShareData));
                return;
            }
        }
        p(context, hBShareData);
    }

    public static void F(com.max.hbcommon.base.f fVar, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{fVar, str, str2, str3, str4}, null, changeQuickRedirect, true, bb.c.k.f33570ga, new Class[]{com.max.hbcommon.base.f.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        ob.a aVar = ob.a.f132240a;
        if (ob.a.o().b()) {
            com.max.hbcommon.network.e.a().C1(str, str2, str3, str4).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
        }
    }

    public static void G(Context context, HBShareData hBShareData, List<PostOptionObj> list) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData, list}, null, changeQuickRedirect, true, bb.c.k.G9, new Class[]{Context.class, HBShareData.class, List.class}, Void.TYPE).isSupported || hBShareData == null) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(hBShareData.getExtraShareActionList())) {
            list.addAll(0, hBShareData.getExtraShareActionList());
        }
        Bundle extraOpts = hBShareData.getExtraOpts();
        if (extraOpts != null && extraOpts.getSerializable(f72592n) != null && extraOpts.getBoolean(f72593o, false)) {
            list.clear();
            return;
        }
        boolean canCopyUrl = hBShareData.getCanCopyUrl();
        String targetUrl = hBShareData.getTargetUrl();
        if (canCopyUrl && !com.max.hbcommon.utils.c.u(targetUrl)) {
            list.add(c(context, hBShareData));
        }
        list.add(l(context, hBShareData));
        list.add(m(context, hBShareData));
        list.add(g(context, hBShareData));
        list.add(f(context, hBShareData));
        list.add(k(context, hBShareData));
    }

    static /* synthetic */ boolean a(HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBShareData}, null, changeQuickRedirect, true, bb.c.k.f33639ja, new Class[]{HBShareData.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : o(hBShareData);
    }

    public static void b(Context context, PostOptionObj postOptionObj, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{context, postOptionObj, imageView, textView}, null, changeQuickRedirect, true, bb.c.k.F9, new Class[]{Context.class, PostOptionObj.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(postOptionObj.getImage_url())) {
            imageView.clearColorFilter();
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            com.max.hbimage.b.d0(postOptionObj.getImage_url(), imageView, ViewUtils.f(context, 3.0f));
        } else if (com.max.hbcommon.utils.c.u(postOptionObj.getIcon_url())) {
            if (postOptionObj.getImage_resource_id() == R.drawable.bbs_share_button_post_46x46 || postOptionObj.getImage_resource_id() == R.drawable.bbs_sharebutton_silence_forever_46x46_3x) {
                imageView.clearColorFilter();
            } else {
                imageView.setColorFilter(context.getResources().getColor(R.color.text_primary_1_color));
            }
            imageView.setImageResource(postOptionObj.getImage_resource_id());
        } else {
            if (com.max.hbcommon.utils.c.u(postOptionObj.getIcon_tint_color())) {
                imageView.setColorFilter(context.getColor(R.color.text_primary_1_color));
            } else {
                imageView.setColorFilter(ob.a.b().p(postOptionObj.getIcon_tint_color()));
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            com.max.hbimage.b.H(postOptionObj.getIcon_url(), imageView);
        }
        textView.setText(postOptionObj.getName());
    }

    public static PostOptionObj c(Context context, @n0 HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.H9, new Class[]{Context.class, HBShareData.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        String targetUrl = hBShareData.getTargetUrl();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(context.getResources().getString(R.string.copy_link));
        postOptionObj.setImage_resource_id(R.drawable.share_copy_circle);
        postOptionObj.setClick_listener(new C0582d(context, targetUrl, hBShareData));
        return postOptionObj;
    }

    public static String d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 8419, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return context.getExternalFilesDir(null) + "/shareData/";
    }

    public static String e(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.k.Z9, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        ob.a aVar = ob.a.f132240a;
        sb2.append(ob.a.b().h());
        sb2.append(".fileprovider");
        Uri uriF = FileProvider.f(context, sb2.toString(), file);
        context.grantUriPermission("com.ss.android.ugc.aweme", uriF, 1);
        context.grantUriPermission("com.ss.android.ugc.aweme.lite", uriF, 1);
        return uriF.toString();
    }

    public static PostOptionObj f(Context context, @n0 HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.M9, new Class[]{Context.class, HBShareData.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        boolean onlyShareImage = hBShareData.getOnlyShareImage();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(context.getResources().getString(R.string.qq_zone));
        postOptionObj.setImage_resource_id(R.drawable.share_qzone_circle);
        postOptionObj.setClick_listener(new h(hBShareData, onlyShareImage, context));
        return postOptionObj;
    }

    public static PostOptionObj g(Context context, @n0 HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.L9, new Class[]{Context.class, HBShareData.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        boolean onlyShareImage = hBShareData.getOnlyShareImage();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(context.getResources().getString(R.string.qq));
        postOptionObj.setImage_resource_id(R.drawable.share_qq_circle);
        postOptionObj.setClick_listener(new g(hBShareData, onlyShareImage, context));
        return postOptionObj;
    }

    public static s<PostOptionObj> h(Context context, List<PostOptionObj> list, int i10, int i11, int i12, Dialog dialog, int i13, boolean z10) {
        Object[] objArr = {context, list, new Integer(i10), new Integer(i11), new Integer(i12), dialog, new Integer(i13), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.f33616ia, new Class[]{Context.class, List.class, cls, cls, cls, Dialog.class, cls, Boolean.TYPE}, s.class);
        return patchProxyResultProxy.isSupported ? (s) patchProxyResultProxy.result : new a(context, list, i13, context, i10, i11, i12, z10, dialog);
    }

    public static String i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.f33593ha, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ("WEIXIN_CIRCLE".equals(str)) {
            return f72581c;
        }
        if ("WEIXIN".equals(str)) {
            return f72582d;
        }
        if (Constants.SOURCE_QQ.equals(str)) {
            return f72584f;
        }
        if ("QZONE".equals(str)) {
            return f72585g;
        }
        return ("BYTEDANCE".equals(str) || "BYTEDANCE_PUBLISH".equals(str)) ? f72586h : f72583e;
    }

    public static UMWeb j(Context context, HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.f33524ea, new Class[]{Context.class, HBShareData.class}, UMWeb.class);
        if (patchProxyResultProxy.isSupported) {
            return (UMWeb) patchProxyResultProxy.result;
        }
        if (hBShareData == null) {
            return null;
        }
        UMImage umImage = hBShareData.getUmImage();
        if (umImage == null) {
            umImage = new UMImage(context, R.drawable.share_thumbnail);
        }
        String targetUrl = hBShareData.getTargetUrl();
        if (com.max.hbcommon.utils.c.u(targetUrl)) {
            targetUrl = "http://www.dotamax.com/";
        }
        String title = hBShareData.getTitle();
        if (com.max.hbcommon.utils.c.u(title)) {
            title = context.getResources().getString(R.string.default_share_title);
        }
        String text = hBShareData.getText();
        if (com.max.hbcommon.utils.c.u(text)) {
            text = context.getResources().getString(R.string.default_share_desc);
        }
        UMWeb uMWeb = new UMWeb(targetUrl);
        uMWeb.setThumb(umImage);
        uMWeb.setDescription(text);
        uMWeb.setTitle(title);
        return uMWeb;
    }

    public static PostOptionObj k(Context context, @n0 HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.N9, new Class[]{Context.class, HBShareData.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        boolean onlyShareImage = hBShareData.getOnlyShareImage();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(context.getResources().getString(R.string.weibo));
        postOptionObj.setImage_resource_id(R.drawable.share_sina_circle);
        postOptionObj.setClick_listener(new i(hBShareData, onlyShareImage, context));
        return postOptionObj;
    }

    public static PostOptionObj l(Context context, @n0 HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.J9, new Class[]{Context.class, HBShareData.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        boolean onlyShareImage = hBShareData.getOnlyShareImage();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(context.getResources().getString(R.string.weixin_friends));
        postOptionObj.setImage_resource_id(R.drawable.share_weixin_circle);
        postOptionObj.setClick_listener(new e(hBShareData, onlyShareImage, context));
        return postOptionObj;
    }

    public static PostOptionObj m(Context context, @n0 HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.K9, new Class[]{Context.class, HBShareData.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        boolean onlyShareImage = hBShareData.getOnlyShareImage();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(context.getResources().getString(R.string.wechat_timeline));
        postOptionObj.setImage_resource_id(R.drawable.share_weixin_circle_circle);
        postOptionObj.setClick_listener(new f(hBShareData, onlyShareImage, context));
        return postOptionObj;
    }

    public static void n(Context context, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{context, dialog}, null, changeQuickRedirect, true, bb.c.k.f33547fa, new Class[]{Context.class, Dialog.class}, Void.TYPE).isSupported || !(context instanceof Activity) || ((Activity) context).isFinishing() || dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    private static boolean o(HBShareData hBShareData) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBShareData}, null, changeQuickRedirect, true, bb.c.k.I9, new Class[]{HBShareData.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (hBShareData == null || com.max.hbcommon.utils.c.u(hBShareData.getCan_not_share_tips())) {
            return false;
        }
        com.max.hbutils.utils.c.f(hBShareData.getCan_not_share_tips());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x023a  */
    public static Dialog p(Context context, HBShareData hBShareData) {
        ViewGroup viewGroup;
        int i10;
        int i11;
        String strE;
        JsonObject jsonObjectB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.E9, new Class[]{Context.class, HBShareData.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || hBShareData == null) {
            return null;
        }
        Bundle extraOpts = hBShareData.getExtraOpts();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_share_v2, (ViewGroup) null);
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(context, viewGroup2);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.rv_option_container);
        View viewFindViewById = viewGroup2.findViewById(R.id.container_divider);
        RecyclerView recyclerView2 = (RecyclerView) viewGroup2.findViewById(R.id.rv_share_container);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.iv_close);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.vg_screen_shot_file);
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.iv_screen_shot_file);
        View viewFindViewById2 = viewGroup2.findViewById(R.id.v_screen_shot_border);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.tv_share_desc);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(R.id.vg_share_action);
        View viewFindViewById3 = viewGroup2.findViewById(R.id.v_screenshot_div);
        ViewGroup viewGroup5 = (ViewGroup) viewGroup2.findViewById(R.id.vg_custom_title);
        ViewGroup viewGroup6 = (ViewGroup) viewGroup2.findViewById(R.id.vg_title);
        if (hBShareData.getCustomTitleView() != null) {
            textView.setVisibility(8);
            viewGroup5.setVisibility(0);
            viewGroup5.addView(hBShareData.getCustomTitleView());
            ((ViewGroup.MarginLayoutParams) viewGroup6.getLayoutParams()).bottomMargin = ViewUtils.f(context, 14.0f);
        } else {
            textView.setVisibility(0);
            viewGroup5.setVisibility(8);
        }
        String shareFilePath = hBShareData.getShareFilePath();
        if (com.max.hbcommon.utils.c.u(shareFilePath) || !new File(shareFilePath).exists()) {
            viewGroup = viewGroup2;
        } else {
            viewGroup = viewGroup2;
            viewFindViewById2.setBackground(q.L(context, R.color.divider_primary_1_color, 0.5f, 3.0f));
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(shareFilePath);
            if (bitmapDecodeFile != null && bitmapDecodeFile.getHeight() > 0 && bitmapDecodeFile.getWidth() > 0) {
                viewGroup4.setPadding(0, ViewUtils.f(context, 8.0f), 0, 0);
                textView.setText("分享截屏");
                viewGroup3.setVisibility(0);
                viewFindViewById3.setVisibility(0);
                imageView2.setImageBitmap(bitmapDecodeFile);
                int width = bitmapDecodeFile.getWidth();
                int height = bitmapDecodeFile.getHeight();
                int iF = ViewUtils.f(context, 72.0f);
                int iF2 = ViewUtils.f(context, 84.0f);
                if (width / height > iF / iF2) {
                    imageView2.getLayoutParams().width = iF;
                    int i12 = (height * iF) / width;
                    imageView2.getLayoutParams().height = i12;
                    imageView2.invalidate();
                    viewFindViewById2.getLayoutParams().width = iF;
                    viewFindViewById2.getLayoutParams().height = i12;
                    viewFindViewById2.invalidate();
                } else {
                    int i13 = (width * iF2) / height;
                    imageView2.getLayoutParams().width = i13;
                    imageView2.getLayoutParams().height = iF2;
                    imageView2.invalidate();
                    viewFindViewById2.getLayoutParams().width = i13;
                    viewFindViewById2.getLayoutParams().height = iF2;
                    viewFindViewById2.invalidate();
                }
            }
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context);
        linearLayoutManager2.setOrientation(0);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        List<PostOptionObj> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int iF3 = ViewUtils.f(context, 56.0f);
        int iF4 = ViewUtils.f(context, 12.0f);
        int iA = com.max.accelworld.f.a(ViewUtils.L(context) - iF4, iF3, ViewUtils.f(context, 12.0f), 0.33f, 0.66f);
        if (com.max.hbcommon.utils.c.w(hBShareData.getShareActionList())) {
            G(context, hBShareData, arrayList);
        } else {
            arrayList = hBShareData.getShareActionList();
        }
        List<PostOptionObj> list = arrayList;
        if (extraOpts != null) {
            ArrayList arrayList3 = (ArrayList) extraOpts.getSerializable(f72592n);
            if (com.max.hbcommon.utils.c.w(arrayList3)) {
                i10 = 0;
                i11 = 8;
            } else {
                arrayList2.addAll(arrayList3);
                i11 = 8;
                s<PostOptionObj> sVarH = h(context, arrayList2, iF3, iA, iF4, iVar, R.layout.item_post_share_v2, true);
                i10 = 0;
                viewFindViewById.setVisibility(com.max.hbcommon.utils.c.w(list) ? 8 : 0);
                recyclerView.setVisibility(0);
                recyclerView.setAdapter(sVarH);
            }
        } else {
            i10 = 0;
            i11 = 8;
        }
        List[] listArr = new List[1];
        listArr[i10] = list;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            recyclerView2.setVisibility(i11);
        } else {
            recyclerView2.setVisibility(i10);
            recyclerView2.setAdapter(h(context, list, iF3, iA, iF4, iVar, R.layout.item_post_share_v2, false));
        }
        c cVar = new c(context, iVar, hBShareData);
        viewGroup.setOnClickListener(cVar);
        imageView.setOnClickListener(cVar);
        iVar.show();
        iVar.f(false);
        if (!(hBShareData.getShareListener() instanceof com.max.hbshare.c.b) || ((com.max.hbshare.c.b) hBShareData.getShareListener()).f72577a == null) {
            strE = null;
            jsonObjectB = null;
        } else {
            strE = ((com.max.hbshare.c.b) hBShareData.getShareListener()).f72577a.e();
            jsonObjectB = ((com.max.hbshare.c.b) hBShareData.getShareListener()).f72577a.b();
        }
        com.max.hbshare.c.a(strE, "3", null, jsonObjectB);
        return null;
    }

    public static void q() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.f33454ba, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.Z4, null, null);
    }

    public static void r(Context context, SHARE_MEDIA share_media, UMImage uMImage, UMImage uMImage2, String str, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, share_media, uMImage, uMImage2, str, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.f33501da, new Class[]{Context.class, SHARE_MEDIA.class, UMImage.class, UMImage.class, String.class, UMShareListener.class}, Void.TYPE).isSupported || !(context instanceof Activity) || uMImage == null) {
            return;
        }
        Activity activity = (Activity) context;
        if (uMImage2 != null) {
            uMImage.setThumb(uMImage2);
        }
        ShareAction platform = new ShareAction(activity).withMedia(uMImage).setPlatform(share_media);
        if (!TextUtils.isEmpty(str)) {
            platform.withText(str);
        } else if (share_media == SHARE_MEDIA.QZONE) {
            platform.withText("HeyBox");
        }
        if (uMShareListener != null) {
            platform.setCallback(uMShareListener);
        }
        platform.share();
    }

    public static void s(Activity activity, ArrayList<String> arrayList, ArrayList<String> arrayList2, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{activity, arrayList, arrayList2, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.Y9, new Class[]{Activity.class, ArrayList.class, ArrayList.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        q();
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            return;
        }
        f72579a = uMShareListener;
        SHARE_MEDIA share_media = SHARE_MEDIA.BYTEDANCE;
        f72580b = share_media;
        uMShareListener.onStart(share_media);
        q7.a aVarA = p7.d.a(activity);
        if (!aVarA.h()) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("当前抖音版本不支持");
            return;
        }
        m7.b.a aVar = new m7.b.a();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.set(i10, e(activity, arrayList.get(i10)));
        }
        ImageObject imageObject = new ImageObject();
        imageObject.mImagePaths = arrayList;
        MediaContent mediaContent = new MediaContent();
        mediaContent.mMediaObject = imageObject;
        aVar.f131456d = mediaContent;
        aVar.f131455c = arrayList2;
        aVarA.b(aVar);
    }

    public static void t(Context context, UMImage uMImage, String str, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, uMImage, str, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.V9, new Class[]{Context.class, UMImage.class, String.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        r(context, SHARE_MEDIA.QQ, uMImage, null, str, uMShareListener);
    }

    public static void u(Context context, UMImage uMImage, String str, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, uMImage, str, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.X9, new Class[]{Context.class, UMImage.class, String.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        r(context, SHARE_MEDIA.QZONE, uMImage, null, str, uMShareListener);
    }

    public static void v(Context context, UMImage uMImage, String str, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, uMImage, str, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.T9, new Class[]{Context.class, UMImage.class, String.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        r(context, SHARE_MEDIA.SINA, uMImage, null, str, uMShareListener);
    }

    public static void w(Context context, UMImage uMImage, String str, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, uMImage, str, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.R9, new Class[]{Context.class, UMImage.class, String.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        r(context, SHARE_MEDIA.WEIXIN, uMImage, null, str, uMShareListener);
    }

    public static void x(Context context, UMImage uMImage, String str, UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, uMImage, str, uMShareListener}, null, changeQuickRedirect, true, bb.c.k.P9, new Class[]{Context.class, UMImage.class, String.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        r(context, SHARE_MEDIA.WEIXIN_CIRCLE, uMImage, null, str, uMShareListener);
    }

    public static void y(Context context, SHARE_MEDIA share_media, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, share_media, hBShareData}, null, changeQuickRedirect, true, bb.c.k.f33477ca, new Class[]{Context.class, SHARE_MEDIA.class, HBShareData.class}, Void.TYPE).isSupported || !(context instanceof Activity) || hBShareData == null || share_media == null || o(hBShareData)) {
            return;
        }
        UMShareListener shareListener = hBShareData.getShareListener();
        if (shareListener instanceof com.max.hbshare.c.b) {
            com.max.hbshare.c.b bVar = (com.max.hbshare.c.b) shareListener;
            bVar.b(hBShareData.getTargetUrl());
            if (hBShareData.getReport_extra() != null) {
                bVar.a(hBShareData.getReport_extra());
            }
        }
        Activity activity = (Activity) context;
        ShareAction platform = new ShareAction(activity).withMedia(j(activity, hBShareData)).setPlatform(share_media);
        if (shareListener != null) {
            platform.setCallback(shareListener);
        }
        platform.share();
    }

    public static void z(Context context, HBShareData hBShareData) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData}, null, changeQuickRedirect, true, bb.c.k.U9, new Class[]{Context.class, HBShareData.class}, Void.TYPE).isSupported) {
            return;
        }
        String strAsUrlImage = hBShareData.getUmImage() != null ? hBShareData.getUmImage().asUrlImage() : null;
        if (com.max.hbcommon.utils.c.u(strAsUrlImage)) {
            y(context, SHARE_MEDIA.QQ, hBShareData);
        } else {
            Glide.F(context).l().load(strAsUrlImage).z1(new j(context, hBShareData));
        }
    }
}
