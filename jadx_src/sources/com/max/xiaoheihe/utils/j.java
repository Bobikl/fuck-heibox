package com.max.xiaoheihe.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ForwardInfo;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PostImageObj;
import com.max.xiaoheihe.module.bbs.ForwardEditActiviy;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ForwardUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class a implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f95630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f95631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ForwardInfo f95632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f95634g;

        a(Context context, View view, LinkInfoObj linkInfoObj, ForwardInfo forwardInfo, String str, AtomicInteger atomicInteger) {
            this.f95629b = context;
            this.f95630c = view;
            this.f95631d = linkInfoObj;
            this.f95632e = forwardInfo;
            this.f95633f = str;
            this.f95634g = atomicInteger;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@androidx.annotation.p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48708, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            j.b(this.f95629b, this.f95630c, this.f95631d, this.f95632e, this.f95633f);
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48710, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48709, new Class[]{Drawable.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this.f95634g.decrementAndGet() == 0) {
                j.b(this.f95629b, this.f95630c, this.f95631d, this.f95632e, this.f95633f);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class b implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f95636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f95637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ForwardInfo f95638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f95640g;

        b(Context context, View view, LinkInfoObj linkInfoObj, ForwardInfo forwardInfo, String str, AtomicInteger atomicInteger) {
            this.f95635b = context;
            this.f95636c = view;
            this.f95637d = linkInfoObj;
            this.f95638e = forwardInfo;
            this.f95639f = str;
            this.f95640g = atomicInteger;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@androidx.annotation.p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48711, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            j.b(this.f95635b, this.f95636c, this.f95637d, this.f95638e, this.f95639f);
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48713, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48712, new Class[]{Drawable.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this.f95640g.decrementAndGet() == 0) {
                j.b(this.f95635b, this.f95636c, this.f95637d, this.f95638e, this.f95639f);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f95641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f95642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f95643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ForwardInfo f95644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95645f;

        /* JADX INFO: compiled from: ForwardUtils.java */
        public class a implements UMShareListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onCancel(SHARE_MEDIA share_media) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onError(SHARE_MEDIA share_media, Throwable th2) {
                if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 48716, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(c.this.f95643d.getString(R.string.share_fail));
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onResult(SHARE_MEDIA share_media) {
                if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 48715, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
                com.max.hbshare.d.F(com.max.xiaoheihe.module.bbs.utils.b.g(c.this.f95643d), null, com.max.hbshare.d.f72598t, null, null);
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        }

        c(View view, LinkInfoObj linkInfoObj, Context context, ForwardInfo forwardInfo, String str) {
            this.f95641b = view;
            this.f95642c = linkInfoObj;
            this.f95643d = context;
            this.f95644e = forwardInfo;
            this.f95645f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48714, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f95641b.measure(0, 0);
            View view = this.f95641b;
            j.o(this.f95643d, new HBShareData(true, true, null, null, null, null, new UMImage(this.f95643d, com.max.hbimage.b.l(view, view.getMeasuredWidth(), this.f95641b.getMeasuredHeight())), new com.max.hbshare.c.b("1".equals(this.f95642c.getIs_article()) ? com.max.hbshare.c.f72549e : com.max.hbshare.c.f72547c, new a())), this.f95644e, this.f95642c.getLinkid(), this.f95642c.getLink_tag(), this.f95645f);
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95650e;

        d(Context context, String str, String str2, com.max.hbcommon.view.a aVar) {
            this.f95647b = context;
            this.f95648c = str;
            this.f95649d = str2;
            this.f95650e = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48717, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f95647b)) {
                Context context = this.f95647b;
                String str = this.f95648c;
                String str2 = this.f95649d;
                if (str2 == null) {
                    str2 = "";
                }
                j.h(context, null, null, str, new StringBuilder(str2), null, null);
                this.f95650e.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95651b;

        e(com.max.hbcommon.view.a aVar) {
            this.f95651b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48718, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95651b.dismiss();
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f95655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ForwardInfo f95657g;

        f(Context context, com.max.hbcommon.view.a aVar, String str, String str2, String str3, ForwardInfo forwardInfo) {
            this.f95652b = context;
            this.f95653c = aVar;
            this.f95654d = str;
            this.f95655e = str2;
            this.f95656f = str3;
            this.f95657g = forwardInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48719, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f95652b)) {
                this.f95653c.dismiss();
                Context context = this.f95652b;
                com.max.xiaoheihe.utils.d.G1(context, ForwardEditActiviy.W2(context, this.f95654d, this.f95655e, this.f95656f, this.f95657g));
            }
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class g extends com.max.hbcommon.base.adapter.s<PostOptionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f95659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f95660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f95661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f95662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f95663g;

        /* JADX INFO: compiled from: ForwardUtils.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostOptionObj f95664b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f95665c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImageView f95666d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TextView f95667e;

            a(PostOptionObj postOptionObj, com.max.hbcommon.base.adapter.s.e eVar, ImageView imageView, TextView textView) {
                this.f95664b = postOptionObj;
                this.f95665c = eVar;
                this.f95666d = imageView;
                this.f95667e = textView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48722, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f95664b.getClick_listener().onClick(g.this.f95663g, this.f95665c.b(), this.f95666d, this.f95667e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, List list, int i10, Context context2, List list2, int i11, int i12, int i13, com.max.hbcommon.view.a aVar) {
            super(context, list, i10);
            this.f95658b = context2;
            this.f95659c = list2;
            this.f95660d = i11;
            this.f95661e = i12;
            this.f95662f = i13;
            this.f95663g = aVar;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, 48720, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PostOptionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            com.max.hbshare.d.b(this.f95658b, postOptionObj, imageView, textView);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.b().getLayoutParams();
            if (this.f95659c.size() > 5) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = this.f95660d + this.f95661e;
                if (eVar.getBindingAdapterPosition() == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f95662f - (this.f95661e / 2);
                }
                if (eVar.getBindingAdapterPosition() == getDataList().size() - 1) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f95662f - (this.f95661e / 2);
                }
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = ViewUtils.L(this.f95658b) / 5;
            }
            eVar.b().setLayoutParams(layoutParams);
            if (postOptionObj.getClick_listener() != null) {
                eVar.b().setOnClickListener(new a(postOptionObj, eVar, imageView, textView));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, 48721, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, postOptionObj);
        }
    }

    /* JADX INFO: compiled from: ForwardUtils.java */
    public class h extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LoadingDialog f95671d;

        /* JADX INFO: compiled from: ForwardUtils.java */
        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48727, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                j.d(h.this.f95669b);
            }
        }

        h(Context context, String str, LoadingDialog loadingDialog) {
            this.f95669b = context;
            this.f95670c = str;
            this.f95671d = loadingDialog;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48723, new Class[0], Void.TYPE).isSupported && j.c(this.f95669b)) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48724, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("forward_link_id", this.f95670c);
            jsonObject.addProperty("msg", th2.getMessage());
            com.max.hbcommon.analytics.d.d("3", lb.d.M5, null, jsonObject);
            if (j.c(this.f95669b)) {
                super.onError(th2);
                LoadingDialog loadingDialog = this.f95671d;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(Result<ResultVerifyInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48725, new Class[]{Result.class}, Void.TYPE).isSupported && j.c(this.f95669b)) {
                super.onNext(result);
                LoadingDialog loadingDialog = this.f95671d;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("forward_link_id", this.f95670c);
                if (result.getResult() != null) {
                    jsonObject.addProperty("link_id", result.getResult().getLink_id());
                }
                com.max.hbcommon.analytics.d.d("4", lb.d.L5, null, jsonObject);
                if ((result.getResult() == null || result.getResult().getReply_push_state() == null || !"1".equals(result.getResult().getReply_push_state().getPush_state())) ? false : true) {
                    v.a(this.f95669b, v.f95760a, new a());
                } else {
                    j.d(this.f95669b);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48726, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultVerifyInfoObj>) obj);
        }
    }

    static /* synthetic */ void b(Context context, View view, LinkInfoObj linkInfoObj, ForwardInfo forwardInfo, String str) {
        if (PatchProxy.proxy(new Object[]{context, view, linkInfoObj, forwardInfo, str}, null, changeQuickRedirect, true, 48705, new Class[]{Context.class, View.class, LinkInfoObj.class, ForwardInfo.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(context, view, linkInfoObj, forwardInfo, str);
    }

    static /* synthetic */ boolean c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48706, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : k(context);
    }

    static /* synthetic */ void d(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48707, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        m(context);
    }

    public static String e(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 48695, new Class[]{String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return "//" + String.format("<a data-user-id=\"%s\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://", str) + URLEncoder.encode(String.format("{\"protocol_type\":\"openUser\",\"user_id\":\"%s\"}", str)) + String.format("\" target=\"_blank\">@%s</a>", str2) + ":" + str3;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "//" + String.format("<a data-user-id=\"%s\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://{\"protocol_type\":\"openUser\",\"user_id\":\"%s\"}\" target=\"_blank\">@%s</a>", str, str, str2) + ":" + str3;
        }
    }

    public static Boolean f(String str) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48702, new Class[]{String.class}, Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        if (!"12".equals(str) && !"26".equals(str) && !com.max.xiaoheihe.module.bbs.utils.b.y(str) && !com.max.xiaoheihe.module.bbs.utils.b.x(str)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static void g(Context context, BBSCommentObj bBSCommentObj, ForwardInfo forwardInfo, LinkInfoObj linkInfoObj, String str) {
        if (PatchProxy.proxy(new Object[]{context, bBSCommentObj, forwardInfo, linkInfoObj, str}, null, changeQuickRedirect, true, 48693, new Class[]{Context.class, BBSCommentObj.class, ForwardInfo.class, LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        AtomicInteger atomicInteger = bBSCommentObj.getImgs() != null ? new AtomicInteger(2) : new AtomicInteger(1);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_post_comment_share, (ViewGroup) null, false);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_bg);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_image);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_avatar);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_comment);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_title);
        textView.setText(bBSCommentObj.getUser().getUsername());
        textView2.setText(bBSCommentObj.getText());
        if (com.max.hbcommon.utils.c.u(linkInfoObj.getTitle())) {
            textView3.setVisibility(8);
        } else {
            textView3.setText("—— " + linkInfoObj.getTitle());
            textView3.setVisibility(0);
        }
        if (bBSCommentObj.getImgs() != null) {
            PostImageObj postImageObj = bBSCommentObj.getImgs().get(0);
            int iL = ViewUtils.L(context) - ViewUtils.f(context, 122.0f);
            int iQ = com.max.hbutils.utils.n.q(postImageObj.getWidth());
            int i10 = (iQ > iL || iQ == 0) ? iL : iQ;
            if (iQ != 0) {
                iL = (com.max.hbutils.utils.n.q(postImageObj.getHeight()) * i10) / com.max.hbutils.utils.n.q(postImageObj.getWidth());
            }
            imageView2.getLayoutParams().width = i10;
            imageView2.getLayoutParams().height = iL;
            imageView2.setVisibility(0);
            Glide.F(HeyBoxApplication.C().getApplicationContext()).load(postImageObj.getUrl()).i(new com.bumptech.glide.request.h()).E1(new a(context, viewInflate, linkInfoObj, forwardInfo, str, atomicInteger)).C1(imageView2);
        } else {
            imageView2.setVisibility(8);
        }
        Glide.F(HeyBoxApplication.C().getApplicationContext()).load(bBSCommentObj.getUser().getAvartar()).i(new com.bumptech.glide.request.h().m().E0(R.drawable.common_default_avatar_40x40)).E1(new b(context, viewInflate, linkInfoObj, forwardInfo, str, atomicInteger)).C1(imageView3);
        imageView.getLayoutParams().height = ViewUtils.V(viewGroup);
    }

    public static List<io.reactivex.disposables.b> h(Context context, String str, String str2, String str3, StringBuilder sb2, List<String> list, LoadingDialog loadingDialog) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, sb2, list, loadingDialog}, null, changeQuickRedirect, true, 48698, new Class[]{Context.class, String.class, String.class, String.class, StringBuilder.class, List.class, LoadingDialog.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap(16);
        map.put("topic_ids", BBSTopicObj.TOPIC_ID_TIMELINE);
        map.put("link_tag", "21");
        ArrayList arrayList2 = new ArrayList();
        BBSTextObj bBSTextObj = new BBSTextObj();
        bBSTextObj.setType(LinkDraftObj.DRAFT_TYPE_HTML);
        bBSTextObj.setText("<p>" + sb2.toString() + "</p>");
        arrayList2.add(bBSTextObj);
        map.put("text", com.max.hbutils.utils.k.p(arrayList2));
        map.put(SocialConstants.PARAM_APP_DESC, sb2.toString());
        map.put("hashtags", com.max.hbutils.utils.k.p(list));
        map.put("forward_id", str3);
        HashMap map2 = new HashMap();
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            map2.put("Cookie", str2);
        }
        arrayList.add((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ba(map2, str, "0", map).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new h(context, str3, loadingDialog)));
        return arrayList;
    }

    public static void i(Context context, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{context, dialog}, null, changeQuickRedirect, true, 48697, new Class[]{Context.class, Dialog.class}, Void.TYPE).isSupported || !(context instanceof Activity) || ((Activity) context).isFinishing() || dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    public static void j(View view, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{view, str, str2, str3, str4}, null, changeQuickRedirect, true, 48701, new Class[]{View.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
        TextView textView = (TextView) view.findViewById(R.id.tv_author);
        if (com.max.hbcommon.utils.c.x(str4)) {
            textView.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            textView.setText("@" + str3);
            com.max.hbimage.b.K(str2, imageView);
        }
        ((ExpressionTextView) view.findViewById(R.id.tv_desc)).setText(str);
    }

    private static boolean k(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48700, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context instanceof BaseActivity) {
            return ((BaseActivity) context).isActive();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Context context, com.max.hbcommon.view.a aVar, HBShareData hBShareData, View view) {
        if (PatchProxy.proxy(new Object[]{context, aVar, hBShareData, view}, null, changeQuickRedirect, true, 48704, new Class[]{Context.class, com.max.hbcommon.view.a.class, HBShareData.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        i(context, aVar);
        if (hBShareData.getShareListener() != null) {
            hBShareData.getShareListener().onCancel(null);
        }
    }

    private static void m(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48699, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.sendBroadcast(new Intent().setAction("com.heybox.refresh.topic"));
        context.sendBroadcast(new Intent().setAction(lb.a.f131043t));
        context.sendBroadcast(new Intent().setAction("com.max.xiaoheihe.post.gotop"));
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(context.getString(R.string.forward_success));
        if (context instanceof com.max.hbshare.b) {
            ((com.max.hbshare.b) context).l0();
        }
    }

    private static void n(Context context, View view, LinkInfoObj linkInfoObj, ForwardInfo forwardInfo, String str) {
        if (PatchProxy.proxy(new Object[]{context, view, linkInfoObj, forwardInfo, str}, null, changeQuickRedirect, true, 48694, new Class[]{Context.class, View.class, LinkInfoObj.class, ForwardInfo.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        new Handler().postDelayed(new c(view, linkInfoObj, context, forwardInfo, str), 50L);
    }

    public static void o(final Context context, final HBShareData hBShareData, ForwardInfo forwardInfo, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{context, hBShareData, forwardInfo, str, str2, str3}, null, changeQuickRedirect, true, 48696, new Class[]{Context.class, HBShareData.class, ForwardInfo.class, String.class, String.class, String.class}, Void.TYPE).isSupported || !(context instanceof Activity) || ((Activity) context).isFinishing() || hBShareData == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_forward_dialog, (ViewGroup) null);
        final com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(context).D(viewGroup).B(true).E(R.style.PopupAnimation).d();
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).N0(aVarD);
        }
        View viewFindViewById = viewGroup.findViewById(R.id.rv_share);
        View viewFindViewById2 = viewGroup.findViewById(R.id.bb_cancel);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_forward);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_edit);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_desc);
        if (com.max.hbcommon.utils.c.u(hBShareData.getTitle())) {
            textView3.setText(hBShareData.getText());
        } else {
            textView3.setText(hBShareData.getTitle());
        }
        textView.setOnClickListener(new d(context, str, str3, aVarD));
        viewGroup.findViewById(R.id.v_out).setOnClickListener(new e(aVarD));
        j(viewGroup, forwardInfo.getCardText(), forwardInfo.getImgUrl(), forwardInfo.getAuthorName(), forwardInfo.getIsDeleted());
        if (!com.max.hbcommon.utils.c.u(str3)) {
            textView2.setText(com.max.xiaoheihe.module.expression.core.a.g(context, new SpannableStringBuilder(str3 != null ? str3 : ""), (int) textView2.getPaint().getTextSize(), true, true, true, true, textView2));
        }
        textView2.setOnClickListener(new f(context, aVarD, str, str2, str3, forwardInfo));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList arrayList = new ArrayList();
        int iF = ViewUtils.f(context, 56.0f);
        int iF2 = ViewUtils.f(context, 12.0f);
        g gVar = new g(context, arrayList, R.layout.item_post_share_bottom, context, arrayList, iF, com.max.accelworld.f.a(ViewUtils.L(context) - iF2, iF, ViewUtils.f(context, 12.0f), 0.33f, 0.66f), iF2, aVarD);
        com.max.hbshare.d.G(context, hBShareData, arrayList);
        recyclerView.setAdapter(gVar);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.utils.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.l(context, aVarD, hBShareData, view);
            }
        });
        aVarD.show();
    }

    public static void p(Context context, String str, String str2, LinkInfoObj linkInfoObj) {
        ForwardInfo forwardInfo;
        String strE;
        if (PatchProxy.proxy(new Object[]{context, str, str2, linkInfoObj}, null, changeQuickRedirect, true, 48703, new Class[]{Context.class, String.class, String.class, LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (linkInfoObj.getForward() == null) {
            forwardInfo = new ForwardInfo(com.max.hbcommon.utils.c.u(linkInfoObj.getTitle()) ? linkInfoObj.getDescription() : linkInfoObj.getTitle(), linkInfoObj.getUser().getUsername(), linkInfoObj.getUser().getUserid(), linkInfoObj.getLinkid(), com.max.hbcommon.utils.c.u(linkInfoObj.getThumb()) ? linkInfoObj.getUser().getAvartar() : linkInfoObj.getThumb(), null);
        } else if (com.max.hbcommon.utils.c.x(linkInfoObj.getForward().getIs_deleted())) {
            forwardInfo = new ForwardInfo(linkInfoObj.getForward().getDescription(), null, null, null, null, linkInfoObj.getForward().getIs_deleted());
        } else {
            forwardInfo = new ForwardInfo(com.max.hbcommon.utils.c.u(linkInfoObj.getForward().getTitle()) ? linkInfoObj.getDescription() : linkInfoObj.getForward().getTitle(), linkInfoObj.getForward().getUser().getUsername(), linkInfoObj.getUser().getUserid(), linkInfoObj.getLinkid(), linkInfoObj.getUser().getAvartar(), linkInfoObj.getForward().getIs_deleted());
        }
        if (i0.e(context)) {
            if (linkInfoObj.getForward() == null) {
                strE = "";
            } else {
                strE = linkInfoObj.getDescription() == null ? null : e(linkInfoObj.getUser().getUserid(), linkInfoObj.getUser().getUsername(), linkInfoObj.getDescription());
            }
            com.max.xiaoheihe.utils.d.G1(context, ForwardEditActiviy.W2(context, str2, str, strE, forwardInfo));
        }
    }
}
