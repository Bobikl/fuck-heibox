package com.max.xiaoheihe.module.bbs.post.utils;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.f;
import com.max.hbimage.image.t;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HighLikeCommentObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkSpecialTagObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostCheckReason;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.module.bbs.z;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.video.VideoActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import dl.d;
import dl.e;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import xh.i;
import xh.m;
import yh.a;

/* JADX INFO: compiled from: PostUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81984b = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f81986d = 500;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f81987e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final Companion f81983a = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f81985c = 200;

    /* JADX INFO: compiled from: PostUtils.kt */
    @t0({"SMAP\nPostUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostUtils.kt\ncom/max/xiaoheihe/module/bbs/post/utils/PostUtils$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,922:1\n1855#2,2:923\n*S KotlinDebug\n*F\n+ 1 PostUtils.kt\ncom/max/xiaoheihe/module/bbs/post/utils/PostUtils$Companion\n*L\n810#1:923,2\n*E\n"})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostUtils.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f81988a;

            static {
                int[] iArr = new int[PostType.valuesCustom().length];
                try {
                    iArr[PostType.Picture.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PostType.Video.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PostType.Article.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f81988a = iArr;
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        @t0({"SMAP\nPostUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostUtils.kt\ncom/max/xiaoheihe/module/bbs/post/utils/PostUtils$Companion$addTextList$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,922:1\n37#2,2:923\n*S KotlinDebug\n*F\n+ 1 PostUtils.kt\ncom/max/xiaoheihe/module/bbs/post/utils/PostUtils$Companion$addTextList$1\n*L\n189#1:923,2\n*E\n"})
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f81989b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f81990c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f81991d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f81992e;

            b(Activity activity, ImageView imageView, int i10, String str) {
                this.f81989b = activity;
                this.f81990c = imageView;
                this.f81991d = i10;
                this.f81992e = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29472, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                companion.a(this.f81989b).m(companion.d(this.f81990c, this.f81991d), (String[]) StringsKt__StringsKt.U4(this.f81992e, new String[]{";"}, false, 0, 6, null).toArray(new String[0])).d(this.f81991d).p();
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f81993b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f81994c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Activity f81995d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f81996e;

            c(String str, ImageView imageView, Activity activity, String str2) {
                this.f81993b = str;
                this.f81994c = imageView;
                this.f81995d = activity;
                this.f81996e = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29473, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbimage.b.P(this.f81993b, this.f81994c, R.drawable.common_default_placeholder_375x210, -1, -1, 1.0f, false, -1, false, true);
                Activity activity = this.f81995d;
                activity.startActivity(VideoActivity.N1(activity, this.f81996e));
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class d extends ClickableSpan {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f81997b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f81998c;

            d(Activity activity, String str) {
                this.f81997b = activity;
                this.f81998c = str;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(@dl.d View arg0) {
                if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 29474, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(arg0, "arg0");
                if (l0.n0(this.f81997b, this.f81998c)) {
                    return;
                }
                Intent intent = new Intent(this.f81997b, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", this.f81998c);
                intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.app_name));
                this.f81997b.startActivity(intent);
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class e implements z.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f82000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f82001b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z f82002c;

            e(yh.a<b2> aVar, String str, z zVar) {
                this.f82000a = aVar;
                this.f82001b = str;
                this.f82002c = zVar;
            }

            @Override // com.max.xiaoheihe.module.bbs.z.b
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29477, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.heybox.hblog.g.f74531b.v("[directOpenLinkWhenPost] open link: " + this.f82001b + " fail!");
                com.max.hbutils.utils.c.f(this.f82002c.getString(R.string.post_success));
            }

            @Override // com.max.xiaoheihe.module.bbs.z.b
            public void onSuccess() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29476, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f82000a.invoke();
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class f extends com.max.hbcommon.network.d<Result<?>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.f f82003b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextView f82004c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameObj f82005d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f82006e;

            f(com.max.hbcommon.base.f fVar, TextView textView, GameObj gameObj, String str) {
                this.f82003b = fVar;
                this.f82004c = textView;
                this.f82005d = gameObj;
                this.f82006e = str;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29478, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f82003b.isActive()) {
                    super.onError(e10);
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
                    r1.n2(this.f82004c, this.f82005d.getFollow_state(), true, true);
                }
            }

            public void onNext(@dl.d Result<?> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29479, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f82003b.isActive()) {
                    super.onNext(result);
                    this.f82005d.setFollow_state(this.f82006e);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29480, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<?>) obj);
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class g implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f82007b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f82008c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TextView f82009d;

            /* JADX INFO: compiled from: PostUtils.kt */
            public static final class a implements r1.y0 {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ TextView f82010a;

                a(TextView textView) {
                    this.f82010a = textView;
                }

                @Override // com.max.xiaoheihe.module.game.r1.y0
                public void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29483, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    r1.n2(this.f82010a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
                }

                @Override // com.max.xiaoheihe.module.game.r1.y0
                public void b() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29482, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    r1.n2(this.f82010a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
                }
            }

            g(GameObj gameObj, Activity activity, TextView textView) {
                this.f82007b = gameObj;
                this.f82008c = activity;
                this.f82009d = textView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29481, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (!com.max.hbcommon.utils.c.u(this.f82007b.getDownload_url_android())) {
                    l0.z0(this.f82008c, this.f82007b.getDownload_url_android(), this.f82007b.getBundle_id());
                    return;
                }
                if (i0.e(this.f82008c)) {
                    if (u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, this.f82007b.getFollow_state(), true)) {
                        String strX0 = r1.x0();
                        if (!com.max.hbcommon.utils.c.B(strX0)) {
                            strX0 = null;
                        }
                        Activity activity = this.f82008c;
                        f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                        r1.h2((BaseActivity) activity, strX0, r1.Z(this.f82007b), new a(this.f82009d));
                        return;
                    }
                    if (!u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, this.f82007b.getFollow_state(), true)) {
                        u.L1(GameObj.FOLLOW_STATE_OWNED, this.f82007b.getFollow_state(), true);
                        return;
                    }
                    r1.n2(this.f82009d, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, true, true);
                    Companion companion = PostUtils.f81983a;
                    ComponentCallbacks2 componentCallbacks2 = this.f82008c;
                    f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
                    companion.d((com.max.hbcommon.base.f) componentCallbacks2, this.f82009d, this.f82007b, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null);
                }
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class h implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f82011b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameObj f82012c;

            h(Activity activity, GameObj gameObj) {
                this.f82011b = activity;
                this.f82012c = gameObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29484, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = this.f82011b;
                activity.startActivity(com.max.xiaoheihe.module.game.z.b(activity, this.f82012c.getH_src(), this.f82012c.getAppid(), this.f82012c.getGame_type(), null, i0.m(), i0.j(), null));
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class i extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f82013b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PostDataObj f82014c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f82015d;

            /* JADX INFO: compiled from: PostUtils.kt */
            public static final class a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Context f82016b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PostDataObj f82017c;

                a(Context context, PostDataObj postDataObj) {
                    this.f82016b = context;
                    this.f82017c = postDataObj;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29488, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    PostUtils.f81983a.m(this.f82016b, f0.g(this.f82017c.isDraft(), "2"));
                }
            }

            i(int i10, PostDataObj postDataObj, Context context) {
                this.f82013b = i10;
                this.f82014c = postDataObj;
                this.f82015d = context;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29485, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                super.onError(e10);
                if (this.f82013b < 3) {
                    this.f82014c.setDraft("2");
                    PostUtils.f81983a.n(this.f82015d, this.f82014c, this.f82013b + 1);
                    return;
                }
                com.max.heybox.hblog.g.f74531b.v("[PostUtils][postVideo]\nretryTimes: " + this.f82013b + "\npostData: " + this.f82014c + ", mContext: " + this.f82015d + "error: " + e10);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0054  */
            public void onNext(@dl.d Result<ResultVerifyInfoObj> result) {
                boolean z10;
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29486, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                super.onNext(result);
                if (result.getResult() != null) {
                    ResultVerifyInfoObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getReply_push_state() != null) {
                        ResultVerifyInfoObj result3 = result.getResult();
                        f0.m(result3);
                        z10 = f0.g("1", result3.getReply_push_state().getPush_state());
                    }
                }
                if (!z10) {
                    PostUtils.f81983a.m(this.f82015d, f0.g(this.f82014c.isDraft(), "2"));
                } else {
                    Context context = this.f82015d;
                    v.a(context, v.f95760a, new a(context, this.f82014c));
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29487, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<ResultVerifyInfoObj>) obj);
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class j implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FragmentActivity f82018b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f82019c;

            j(FragmentActivity fragmentActivity, String str) {
                this.f82018b = fragmentActivity;
                this.f82019c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29489, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                Companion.c(PostUtils.f81983a, this.f82018b, this.f82019c, null, 4, null);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class k implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final k f82020b = new k();
            public static ChangeQuickRedirect changeQuickRedirect;

            k() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29490, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class l implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f82021b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FragmentActivity f82022c;

            l(String str, FragmentActivity fragmentActivity) {
                this.f82021b = str;
                this.f82022c = fragmentActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29491, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                z.P3(this.f82021b).show(this.f82022c.getSupportFragmentManager(), "PostNativeRouterDialogFragment");
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: PostUtils.kt */
        public static final class m implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final m f82023b = new m();
            public static ChangeQuickRedirect changeQuickRedirect;

            m() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 29492, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void c(Companion companion, FragmentActivity fragmentActivity, String str, yh.a aVar, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{companion, fragmentActivity, str, aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 29460, new Class[]{Companion.class, FragmentActivity.class, String.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((i10 & 4) != 0) {
                aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.utils.PostUtils$Companion$directOpenLinkWhenPost$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29475, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }
                };
            }
            companion.b(fragmentActivity, str, aVar);
        }

        public static /* synthetic */ void o(Companion companion, Context context, PostDataObj postDataObj, int i10, int i11, Object obj) {
            Object[] objArr = {companion, context, postDataObj, new Integer(i10), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 29456, new Class[]{Companion.class, Context.class, PostDataObj.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            companion.n(context, postDataObj, i10);
        }

        public static /* synthetic */ void y(Companion companion, Activity activity, List list, List list2, String str, List list3, List list4, String str2, String str3, JsonObject jsonObject, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{companion, activity, list, list2, str, list3, list4, str2, str3, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, 29464, new Class[]{Companion.class, Activity.class, List.class, List.class, String.class, List.class, List.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            companion.x(activity, list, list2, str, list3, list4, str2, (i10 & 128) != 0 ? null : str3, jsonObject);
        }

        @xh.m
        public final void a(@dl.d Activity mContext, @dl.d LayoutInflater mInflater, @dl.e List<BBSTextObj> list, @dl.d ViewGroup ll_comment, @dl.e LinkInfoObj linkInfoObj, boolean z10) {
            String str;
            boolean z11;
            LinkSpecialTagObj special_tag;
            GameObj gameObjF;
            List<BBSTextObj> list2 = list;
            if (PatchProxy.proxy(new Object[]{mContext, mInflater, list2, ll_comment, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29450, new Class[]{Activity.class, LayoutInflater.class, List.class, ViewGroup.class, LinkInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            f0.p(mInflater, "mInflater");
            f0.p(ll_comment, "ll_comment");
            if (list2 == null || list.size() <= 0 || linkInfoObj == null) {
                return;
            }
            int iY = com.max.hbimage.b.y();
            Iterator<BBSTextObj> it = list.iterator();
            String str2 = "";
            while (true) {
                boolean zHasNext = it.hasNext();
                str = SocialConstants.PARAM_IMG_URL;
                if (!zHasNext) {
                    break;
                }
                BBSTextObj next = it.next();
                if (f0.g(next.getType(), SocialConstants.PARAM_IMG_URL)) {
                    str2 = str2 + next.getUrl() + ';';
                }
            }
            int size = list.size();
            int i10 = -1;
            long jF = 0;
            int size2 = list.size();
            int i11 = 0;
            while (i11 < size2) {
                BBSTextObj bBSTextObj = list2.get(i11);
                if (f0.g(bBSTextObj.getType(), str)) {
                    ImageView imageView = new ImageView(mContext);
                    if (com.max.hbcommon.utils.c.u(bBSTextObj.getHeight()) || com.max.hbcommon.utils.c.u(bBSTextObj.getWidth())) {
                        jF += (long) ViewUtils.f(mContext, 180.0f);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins(0, 0, 0, i11 == size + (-1) ? 0 : ViewUtils.f(mContext, 10.0f));
                        imageView.setLayoutParams(layoutParams);
                    } else {
                        int iL = ViewUtils.L(mContext) - ViewUtils.f(mContext, 24.0f);
                        if (n.q(bBSTextObj.getWidth()) <= iL / 2) {
                            iL = ViewUtils.f(mContext, 180.0f);
                        }
                        int i12 = iL;
                        String height = bBSTextObj.getHeight();
                        f0.o(height, "mTextobj.height");
                        float f10 = i12 * Float.parseFloat(height);
                        String width = bBSTextObj.getWidth();
                        f0.o(width, "mTextobj.width");
                        int i13 = (int) (f10 / Float.parseFloat(width));
                        if (iY > 0 && i13 > iY) {
                            i13 = iY;
                        }
                        jF += (long) (i12 * i13);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i12, i13);
                        layoutParams2.setMargins(0, 0, 0, i11 == size + (-1) ? 0 : ViewUtils.f(mContext, 10.0f));
                        imageView.setLayoutParams(layoutParams2);
                    }
                    imageView.setId(R.id.iv_image);
                    ll_comment.addView(imageView);
                    i10++;
                    com.max.hbimage.b.P(bBSTextObj.getUrl(), imageView, R.drawable.common_default_placeholder_375x210, -1, -1, jF > 18662400 ? 0.3f : 1.0f, false, -1, false, true);
                    imageView.setOnClickListener(new b(mContext, imageView, i10, str2));
                } else {
                    str = str;
                    size2 = size2;
                    if (f0.g(bBSTextObj.getType(), "video")) {
                        View viewInflate = mInflater.inflate(R.layout.layout_video_thumb, ll_comment, false);
                        View viewFindViewById = viewInflate.findViewById(R.id.iv_video_thumb);
                        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                        ImageView imageView2 = (ImageView) viewFindViewById;
                        String url = bBSTextObj.getUrl();
                        String video_thumb = bBSTextObj.getVideo_thumb();
                        com.max.hbimage.b.P(video_thumb, imageView2, R.drawable.common_default_placeholder_375x210, -1, -1, 1.0f, false, -1, false, true);
                        viewInflate.setOnClickListener(new c(video_thumb, imageView2, mContext, url));
                        ll_comment.addView(viewInflate);
                    } else if (f0.g(bBSTextObj.getType(), "url")) {
                        TextView textView = new TextView(mContext);
                        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        textView.setTextSize(1, 16.0f);
                        textView.setTypeface(Typeface.SANS_SERIF);
                        textView.setTextColor(mContext.getResources().getColor(R.color.click_blue));
                        String text = bBSTextObj.getText();
                        SpannableString spannableString = new SpannableString(text);
                        spannableString.setSpan(new d(mContext, text), 0, text.length(), 33);
                        textView.setText(spannableString);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        ll_comment.addView(textView);
                    } else {
                        if (f0.g(bBSTextObj.getType(), "game")) {
                            String appid = bBSTextObj.getApp_info() != null ? bBSTextObj.getApp_info().getAppid() : null;
                            if (!com.max.hbcommon.utils.c.u(appid) && (gameObjF = f(linkInfoObj.getGame_details(), appid)) != null) {
                                ll_comment.addView(j(mContext, mInflater, ll_comment, gameObjF));
                            }
                        } else {
                            ExpressionTextView expressionTextView = new ExpressionTextView(mContext);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams3.setMargins(0, 0, 0, i11 == size + (-1) ? 0 : ViewUtils.f(mContext, 10.0f));
                            expressionTextView.setLayoutParams(layoutParams3);
                            expressionTextView.setTextSize(0, mContext.getResources().getDimensionPixelSize(R.dimen.text_size_16));
                            expressionTextView.setTextColor(mContext.getResources().getColor(R.color.text_primary_1_color));
                            if (com.max.hbcommon.utils.c.u(linkInfoObj.getTitle()) && i11 == 0) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                                if (!z10 || (special_tag = linkInfoObj.getSpecial_tag()) == null) {
                                    z11 = false;
                                } else {
                                    String name = special_tag.getName();
                                    int iE1 = com.max.xiaoheihe.utils.d.e1(special_tag.getColor());
                                    int dimensionPixelSize = mContext.getResources().getDimensionPixelSize(R.dimen.text_size_11);
                                    int color = mContext.getResources().getColor(R.color.white);
                                    int iF = ViewUtils.f(mContext, 2.0f);
                                    spannableStringBuilder.append((CharSequence) name).append((CharSequence) " ");
                                    z11 = false;
                                    com.max.hbcustomview.spans.b bVar = new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name, dimensionPixelSize, color, iE1, iE1, iF, ViewUtils.f(mContext, 5.0f), ViewUtils.f(mContext, 3.0f)), 0);
                                    f0.m(name);
                                    spannableStringBuilder.setSpan(bVar, 0, name.length(), 33);
                                }
                                spannableStringBuilder.append((CharSequence) bBSTextObj.getText());
                                expressionTextView.setText(spannableStringBuilder);
                            } else {
                                iY = iY;
                                z11 = false;
                                expressionTextView.setText(bBSTextObj.getText());
                            }
                            expressionTextView.setLineSpacing(ViewUtils.f(mContext, 6.0f), 1.0f);
                            expressionTextView.setMovementMethod(LinkMovementMethod.getInstance());
                            ll_comment.addView(expressionTextView);
                        }
                        i11++;
                        list2 = list;
                        iY = iY;
                        str = str;
                        size2 = size2;
                    }
                }
                iY = iY;
                z11 = false;
                i11++;
                list2 = list;
                iY = iY;
                str = str;
                size2 = size2;
            }
        }

        @xh.m
        public final void b(@dl.e FragmentActivity fragmentActivity, @dl.e String str, @dl.d yh.a<b2> onOpenLinkSuccess) {
            if (PatchProxy.proxy(new Object[]{fragmentActivity, str, onOpenLinkSuccess}, this, changeQuickRedirect, false, 29459, new Class[]{FragmentActivity.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(onOpenLinkSuccess, "onOpenLinkSuccess");
            if (fragmentActivity == null || com.max.hbcommon.utils.c.u(str)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.post_success));
                return;
            }
            z zVarP3 = z.P3(str);
            zVarP3.Q3(new e(onOpenLinkSuccess, str, zVarP3));
            zVarP3.show(fragmentActivity.getSupportFragmentManager(), "PostNativeRouterDialogFragment");
        }

        @xh.m
        public final void d(@dl.d com.max.hbcommon.base.f baseView, @dl.e TextView textView, @dl.e GameObj gameObj, @dl.e String str, @dl.e String str2) {
            io.reactivex.z<Result> zVarI5;
            io.reactivex.z<Result> zVarA4;
            if (PatchProxy.proxy(new Object[]{baseView, textView, gameObj, str, str2}, this, changeQuickRedirect, false, 29453, new Class[]{com.max.hbcommon.base.f.class, TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(baseView, "baseView");
            if (gameObj != null) {
                io.reactivex.z<Result> zVarNb = null;
                if (u.L1("unfollowing", str, true)) {
                    zVarNb = com.max.xiaoheihe.network.i.a().x3(gameObj.getAppid());
                } else if (u.L1("following", str, true)) {
                    zVarNb = com.max.xiaoheihe.network.i.a().cb(gameObj.getAppid());
                } else if (u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, str, true)) {
                    zVarNb = com.max.xiaoheihe.network.i.a().l8(gameObj.getAppid());
                } else if (u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, str, true)) {
                    zVarNb = com.max.xiaoheihe.network.i.a().nb(gameObj.getAppid(), str2);
                }
                if (zVarNb == null || (zVarI5 = zVarNb.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
                    return;
                }
            }
        }

        @dl.e
        @xh.m
        public final Bundle e(@dl.e String str) {
            HashMap map;
            boolean z10 = true;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29465, new Class[]{String.class}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            aVar.M("getBundleFromJsonString  jsonString：" + str);
            if (str == null) {
                return null;
            }
            try {
                map = (HashMap) com.max.hbutils.utils.k.a(str, HashMap.class);
                try {
                    aVar.M("getBundleFromJsonString  params：" + com.max.hbutils.utils.k.p(map));
                } catch (Throwable th2) {
                    th = th2;
                    com.max.heybox.hblog.g.f74531b.v("getBundleFromJsonString Json解析失败 " + th.getMessage() + "  jsonString：" + str);
                }
            } catch (Throwable th3) {
                th = th3;
                map = null;
            }
            if (map != null && !map.isEmpty()) {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str2 = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    f0.n(value2, "null cannot be cast to non-null type kotlin.String");
                    bundle.putString(str2, (String) value2);
                } else if (value instanceof Character) {
                    String str3 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    f0.n(value3, "null cannot be cast to non-null type kotlin.Char");
                    bundle.putChar(str3, ((Character) value3).charValue());
                } else if (value instanceof CharSequence) {
                    String str4 = (String) entry.getKey();
                    Object value4 = entry.getValue();
                    f0.n(value4, "null cannot be cast to non-null type kotlin.CharSequence");
                    bundle.putCharSequence(str4, (CharSequence) value4);
                } else if (value instanceof Integer) {
                    String str5 = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    f0.n(value5, "null cannot be cast to non-null type kotlin.Int");
                    bundle.putInt(str5, ((Integer) value5).intValue());
                } else if (value instanceof Short) {
                    String str6 = (String) entry.getKey();
                    Object value6 = entry.getValue();
                    f0.n(value6, "null cannot be cast to non-null type kotlin.Short");
                    bundle.putShort(str6, ((Short) value6).shortValue());
                } else if (value instanceof Long) {
                    String str7 = (String) entry.getKey();
                    Object value7 = entry.getValue();
                    f0.n(value7, "null cannot be cast to non-null type kotlin.Long");
                    bundle.putLong(str7, ((Long) value7).longValue());
                } else if (value instanceof Double) {
                    String str8 = (String) entry.getKey();
                    Object value8 = entry.getValue();
                    f0.n(value8, "null cannot be cast to non-null type kotlin.Double");
                    bundle.putInt(str8, (int) ((Double) value8).doubleValue());
                } else if (value instanceof Boolean) {
                    String str9 = (String) entry.getKey();
                    Object value9 = entry.getValue();
                    f0.n(value9, "null cannot be cast to non-null type kotlin.Boolean");
                    bundle.putBoolean(str9, ((Boolean) value9).booleanValue());
                } else if (value instanceof Byte) {
                    String str10 = (String) entry.getKey();
                    Object value10 = entry.getValue();
                    f0.n(value10, "null cannot be cast to non-null type kotlin.Byte");
                    bundle.putByte(str10, ((Byte) value10).byteValue());
                } else if (value instanceof Float) {
                    String str11 = (String) entry.getKey();
                    Object value11 = entry.getValue();
                    f0.n(value11, "null cannot be cast to non-null type kotlin.Float");
                    bundle.putFloat(str11, ((Float) value11).floatValue());
                } else if (value instanceof Parcelable) {
                    String str12 = (String) entry.getKey();
                    Object value12 = entry.getValue();
                    f0.n(value12, "null cannot be cast to non-null type android.os.Parcelable");
                    bundle.putParcelable(str12, (Parcelable) value12);
                } else if (value instanceof Serializable) {
                    String str13 = (String) entry.getKey();
                    Object value13 = entry.getValue();
                    f0.n(value13, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable(str13, (Serializable) value13);
                }
            }
            com.max.heybox.hblog.g.f74531b.M("getBundleFromJsonString  bundle：" + bundle);
            return bundle;
        }

        @dl.e
        @xh.m
        public final GameObj f(@dl.e List<? extends GameObj> list, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 29451, new Class[]{List.class, String.class}, GameObj.class);
            if (patchProxyResultProxy.isSupported) {
                return (GameObj) patchProxyResultProxy.result;
            }
            if (list == null || str == null) {
                return null;
            }
            for (GameObj gameObj : list) {
                if (u.L1(str, gameObj.getAppid(), true)) {
                    return gameObj;
                }
            }
            return null;
        }

        public final long g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29448, new Class[0], Long.TYPE);
            return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : PostUtils.f81985c;
        }

        @dl.d
        @xh.m
        public final Map<String, String> h(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29454, new Class[]{String.class}, Map.class);
            if (patchProxyResultProxy.isSupported) {
                return (Map) patchProxyResultProxy.result;
            }
            HashMap map = new HashMap();
            if (str != null) {
            }
            return map;
        }

        @dl.e
        @xh.m
        public final PictureVideoLinkDraftObj i(@dl.e Bundle bundle, @dl.e PictureVideoLinkDraftObj pictureVideoLinkDraftObj) {
            List listB;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle, pictureVideoLinkDraftObj}, this, changeQuickRedirect, false, 29466, new Class[]{Bundle.class, PictureVideoLinkDraftObj.class}, PictureVideoLinkDraftObj.class);
            if (patchProxyResultProxy.isSupported) {
                return (PictureVideoLinkDraftObj) patchProxyResultProxy.result;
            }
            if (bundle == null) {
                return null;
            }
            com.max.heybox.hblog.g.f74531b.M("handlePostData  result: " + com.max.hbutils.utils.k.p(pictureVideoLinkDraftObj));
            if (pictureVideoLinkDraftObj == null) {
                pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
            }
            Serializable serializable = bundle.getSerializable(NewLinkEditFragment.Q4);
            BBSTopicObj bBSTopicObj = serializable != null ? (BBSTopicObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializable), BBSTopicObj.class) : null;
            Serializable serializable2 = bundle.getSerializable(NewLinkEditFragment.R4);
            ArrayList arrayList = new ArrayList();
            if (serializable2 != null && (listB = com.max.hbutils.utils.k.b(com.max.hbutils.utils.k.p(serializable2), BBSTopicObj.class)) != null) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add((BBSTopicObj) it.next());
                }
            }
            Serializable serializable3 = bundle.getSerializable(NewLinkEditFragment.U4);
            LinkedTreeMap linkedTreeMap = serializable3 instanceof LinkedTreeMap ? (LinkedTreeMap) serializable3 : null;
            String json = linkedTreeMap != null ? new Gson().toJson(linkedTreeMap) : null;
            HighLikeCommentObj highLikeCommentObj = json != null ? (HighLikeCommentObj) new Gson().fromJson(json, HighLikeCommentObj.class) : null;
            if (highLikeCommentObj != null) {
                pictureVideoLinkDraftObj.setHighLikeComment(highLikeCommentObj);
            }
            Serializable serializable4 = bundle.getSerializable("tags");
            ArrayList arrayList2 = serializable4 instanceof ArrayList ? (ArrayList) serializable4 : null;
            if (arrayList2 != null) {
                pictureVideoLinkDraftObj.setHashtagList(arrayList2);
            }
            if ((!arrayList.isEmpty()) || bBSTopicObj != null) {
                ArrayList arrayList3 = new ArrayList();
                if (!com.max.hbcommon.utils.c.w(arrayList)) {
                    arrayList3.addAll(arrayList);
                } else if (bBSTopicObj != null) {
                    arrayList3.add(bBSTopicObj);
                }
                pictureVideoLinkDraftObj.setCheckedTopics(arrayList3);
            }
            com.max.heybox.hblog.g.f74531b.M("handlePostData  result: " + com.max.hbutils.utils.k.p(pictureVideoLinkDraftObj));
            return pictureVideoLinkDraftObj;
        }

        @dl.d
        @xh.m
        public final View j(@dl.d Activity mContext, @dl.d LayoutInflater mInflater, @dl.e ViewGroup viewGroup, @dl.d GameObj gameObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, mInflater, viewGroup, gameObj}, this, changeQuickRedirect, false, 29452, new Class[]{Activity.class, LayoutInflater.class, ViewGroup.class, GameObj.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            f0.p(mContext, "mContext");
            f0.p(mInflater, "mInflater");
            f0.p(gameObj, "gameObj");
            View gameView = mInflater.inflate(R.layout.item_game, viewGroup, false);
            s.e eVar = new s.e(R.layout.item_game, gameView);
            r1.r1(eVar, gameObj, GameObj.KEY_POINT_FOLLOW_STATE);
            TextView textView = (TextView) eVar.i(R.id.tv_follow_state);
            if (gameObj.getHeybox_price() != null) {
                textView.setClickable(false);
            } else {
                textView.setOnClickListener(new g(gameObj, mContext, textView));
            }
            gameView.setOnClickListener(new h(mContext, gameObj));
            gameView.setBackgroundResource(R.drawable.game_bg_in_post);
            f0.o(gameView, "gameView");
            return gameView;
        }

        @xh.m
        public final boolean k(int i10) {
            return i10 == 11 || i10 == 12 || i10 == 14;
        }

        @xh.m
        public final boolean l() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29461, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.a(ad.a.f1201h, false);
        }

        @xh.m
        public final void m(@dl.e Context context, boolean z10) {
            if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29457, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (context != null) {
                context.sendBroadcast(new Intent().setAction("com.heybox.refresh.topic"));
            }
            if (context != null) {
                context.sendBroadcast(new Intent().setAction(lb.a.f131043t));
            }
            if (context != null) {
                context.sendBroadcast(new Intent().setAction("com.max.xiaoheihe.post.gotop"));
            }
            if (z10) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.save_draft_success));
            } else {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.post_success));
            }
        }

        @xh.m
        public final void n(@dl.e Context context, @dl.e PostDataObj postDataObj, int i10) {
            if (PatchProxy.proxy(new Object[]{context, postDataObj, new Integer(i10)}, this, changeQuickRedirect, false, 29455, new Class[]{Context.class, PostDataObj.class, Integer.TYPE}, Void.TYPE).isSupported || postDataObj == null) {
                return;
            }
        }

        @xh.m
        public final void p(@dl.d PictureVideoEditPostFragment.POST_EDIT_TYPE postEditType, @dl.d PostCheckReason reason, @dl.e String str, @dl.e JsonObject jsonObject) {
            if (PatchProxy.proxy(new Object[]{postEditType, reason, str, jsonObject}, this, changeQuickRedirect, false, 29467, new Class[]{PictureVideoEditPostFragment.POST_EDIT_TYPE.class, PostCheckReason.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(postEditType, "postEditType");
            f0.p(reason, "reason");
            q(postEditType == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO ? PostType.Video : PostType.Picture, reason, str, jsonObject);
        }

        @xh.m
        public final void q(@dl.d PostType type, @dl.d PostCheckReason reason, @dl.e String str, @dl.e JsonObject jsonObject) {
            int i10 = 1;
            if (PatchProxy.proxy(new Object[]{type, reason, str, jsonObject}, this, changeQuickRedirect, false, 29468, new Class[]{PostType.class, PostCheckReason.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(type, "type");
            f0.p(reason, "reason");
            int i11 = a.f81988a[type.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    i10 = 2;
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 3;
                }
            }
            JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : null;
            if (jsonObjectDeepCopy == null) {
                jsonObjectDeepCopy = new JsonObject();
            }
            jsonObjectDeepCopy.addProperty("type", Integer.valueOf(i10));
            jsonObjectDeepCopy.addProperty("reason", Integer.valueOf(reason.getReasonCode()));
            if (!com.max.hbcommon.utils.c.u(str)) {
                jsonObjectDeepCopy.addProperty("source", str);
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.R0, null, jsonObjectDeepCopy);
        }

        @xh.m
        public final void r(@dl.d PictureVideoEditPostFragment.POST_EDIT_TYPE postEditType, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e JsonObject jsonObject) {
            if (PatchProxy.proxy(new Object[]{postEditType, str, str2, str3, jsonObject}, this, changeQuickRedirect, false, 29469, new Class[]{PictureVideoEditPostFragment.POST_EDIT_TYPE.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(postEditType, "postEditType");
            s(postEditType == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO ? PostType.Video : PostType.Picture, str, str2, str3, jsonObject);
        }

        @xh.m
        public final void s(@dl.d PostType type, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e JsonObject jsonObject) {
            int i10 = 1;
            if (PatchProxy.proxy(new Object[]{type, str, str2, str3, jsonObject}, this, changeQuickRedirect, false, 29470, new Class[]{PostType.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(type, "type");
            int i11 = a.f81988a[type.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    i10 = 2;
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 3;
                }
            }
            JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : null;
            if (jsonObjectDeepCopy == null) {
                jsonObjectDeepCopy = new JsonObject();
            }
            jsonObjectDeepCopy.addProperty("type", Integer.valueOf(i10));
            jsonObjectDeepCopy.addProperty("error", str);
            jsonObjectDeepCopy.addProperty("status", z5.f.f141859j);
            jsonObjectDeepCopy.addProperty("msg", str2);
            if (!com.max.hbcommon.utils.c.u(str3)) {
                jsonObjectDeepCopy.addProperty("source", str3);
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.S0, null, jsonObjectDeepCopy);
        }

        public final void t(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 29449, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PostUtils.f81985c = j10;
        }

        @xh.m
        public final void u(@dl.d FragmentActivity mContext, @dl.e Intent intent) {
            if (PatchProxy.proxy(new Object[]{mContext, intent}, this, changeQuickRedirect, false, 29462, new Class[]{FragmentActivity.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            String stringExtra = intent != null ? intent.getStringExtra(ShareImageDialogFragment.L) : null;
            String stringExtra2 = intent != null ? intent.getStringExtra(ShareImageDialogFragment.M) : null;
            JsonObject jsonObject = com.max.hbcommon.utils.c.u(stringExtra) ? null : (JsonObject) com.max.hbutils.utils.k.a(stringExtra, JsonObject.class);
            if (com.max.hbcommon.utils.c.u(stringExtra2) || jsonObject == null) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.post_success));
            } else {
                new com.max.hbcommon.view.a.f(mContext).y("社区发布成功").g(false).u("去查看", new l(stringExtra2, mContext)).n(R.string.cancel, m.f82023b).F();
            }
        }

        @xh.m
        public final void v(@dl.d FragmentActivity mContext, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{mContext, str}, this, changeQuickRedirect, false, 29458, new Class[]{FragmentActivity.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            if (com.max.hbcommon.utils.c.u(str)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.post_success));
            } else {
                new com.max.hbcommon.view.a.f(mContext).y("社区发布成功").g(false).u("去查看", new j(mContext, str)).n(R.string.cancel, k.f82020b).F();
            }
        }

        @xh.i
        @xh.m
        public final void w(@dl.e Activity activity, @dl.d List<File> imageFileList, @dl.e List<Bitmap> list, @dl.e String str, @dl.e List<BBSTopicObj> list2, @dl.e List<String> list3, @dl.e String str2, @dl.e JsonObject jsonObject) {
            if (PatchProxy.proxy(new Object[]{activity, imageFileList, list, str, list2, list3, str2, jsonObject}, this, changeQuickRedirect, false, 29471, new Class[]{Activity.class, List.class, List.class, String.class, List.class, List.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(imageFileList, "imageFileList");
            y(this, activity, imageFileList, list, str, list2, list3, str2, null, jsonObject, 128, null);
        }

        @xh.i
        @xh.m
        public final void x(@dl.e Activity activity, @dl.d List<File> imageFileList, @dl.e List<Bitmap> list, @dl.e String str, @dl.e List<BBSTopicObj> list2, @dl.e List<String> list3, @dl.e String str2, @dl.e String str3, @dl.e JsonObject jsonObject) {
            int i10 = 1;
            if (PatchProxy.proxy(new Object[]{activity, imageFileList, list, str, list2, list3, str2, str3, jsonObject}, this, changeQuickRedirect, false, 29463, new Class[]{Activity.class, List.class, List.class, String.class, List.class, List.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(imageFileList, "imageFileList");
            if (activity == null || list == null || !i0.e(activity)) {
                return;
            }
            Intent intentA = PostTabActivity.f82577y1.a(activity, PostType.Picture);
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
            if (!com.max.hbcommon.utils.c.w(imageFileList)) {
                int size = imageFileList.size();
                int i11 = 0;
                while (i11 < size) {
                    File file = imageFileList.get(i11);
                    Bitmap bitmap = list.get(i11);
                    if (file != null && file.exists()) {
                        if (str != null) {
                            HashMap<String, String> sShareImageSrcMap = bb.a.f30446a;
                            f0.o(sShareImageSrcMap, "sShareImageSrcMap");
                            sShareImageSrcMap.put(t.b(file), str);
                        }
                        BBSTextObj bBSTextObj = new BBSTextObj();
                        bBSTextObj.setText(file.getAbsolutePath());
                        bBSTextObj.setHeight(String.valueOf(bitmap.getHeight()));
                        bBSTextObj.setWidth(String.valueOf(bitmap.getWidth()));
                        List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
                        f0.m(imgPathList);
                        imgPathList.add(bBSTextObj);
                    }
                    i11++;
                    i10 = 1;
                }
            }
            List[] listArr = new List[i10];
            listArr[0] = list3;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                pictureVideoLinkDraftObj.setHashtagList(list3);
            }
            pictureVideoLinkDraftObj.setCheckedTopics(list2);
            Bundle bundleE = e(str2);
            if (bundleE != null) {
                intentA.putExtras(bundleE);
                pictureVideoLinkDraftObj = PostUtils.f81983a.i(bundleE, pictureVideoLinkDraftObj);
            }
            intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
            intentA.putExtra(PictureVideoEditPostFragment.f82341j4, str3);
            intentA.putExtra(PostTabActivity.J3, com.max.hbutils.utils.k.p(jsonObject));
            activity.startActivity(intentA);
        }
    }

    @m
    public static final void c(@d Activity activity, @d LayoutInflater layoutInflater, @e List<BBSTextObj> list, @d ViewGroup viewGroup, @e LinkInfoObj linkInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{activity, layoutInflater, list, viewGroup, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29428, new Class[]{Activity.class, LayoutInflater.class, List.class, ViewGroup.class, LinkInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.a(activity, layoutInflater, list, viewGroup, linkInfoObj, z10);
    }

    @m
    public static final void d(@e FragmentActivity fragmentActivity, @e String str, @d a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, str, aVar}, null, changeQuickRedirect, true, 29437, new Class[]{FragmentActivity.class, String.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.b(fragmentActivity, str, aVar);
    }

    @m
    public static final void e(@d f fVar, @e TextView textView, @e GameObj gameObj, @e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{fVar, textView, gameObj, str, str2}, null, changeQuickRedirect, true, 29431, new Class[]{f.class, TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.d(fVar, textView, gameObj, str, str2);
    }

    @e
    @m
    public static final Bundle f(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 29441, new Class[]{String.class}, Bundle.class);
        return patchProxyResultProxy.isSupported ? (Bundle) patchProxyResultProxy.result : f81983a.e(str);
    }

    @e
    @m
    public static final GameObj g(@e List<? extends GameObj> list, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, null, changeQuickRedirect, true, 29429, new Class[]{List.class, String.class}, GameObj.class);
        return patchProxyResultProxy.isSupported ? (GameObj) patchProxyResultProxy.result : f81983a.f(list, str);
    }

    @d
    @m
    public static final Map<String, String> h(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 29432, new Class[]{String.class}, Map.class);
        return patchProxyResultProxy.isSupported ? (Map) patchProxyResultProxy.result : f81983a.h(str);
    }

    @e
    @m
    public static final PictureVideoLinkDraftObj i(@e Bundle bundle, @e PictureVideoLinkDraftObj pictureVideoLinkDraftObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle, pictureVideoLinkDraftObj}, null, changeQuickRedirect, true, 29442, new Class[]{Bundle.class, PictureVideoLinkDraftObj.class}, PictureVideoLinkDraftObj.class);
        return patchProxyResultProxy.isSupported ? (PictureVideoLinkDraftObj) patchProxyResultProxy.result : f81983a.i(bundle, pictureVideoLinkDraftObj);
    }

    @d
    @m
    public static final View j(@d Activity activity, @d LayoutInflater layoutInflater, @e ViewGroup viewGroup, @d GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, layoutInflater, viewGroup, gameObj}, null, changeQuickRedirect, true, 29430, new Class[]{Activity.class, LayoutInflater.class, ViewGroup.class, GameObj.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : f81983a.j(activity, layoutInflater, viewGroup, gameObj);
    }

    @m
    public static final boolean k(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 29435, new Class[]{Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f81983a.k(i10);
    }

    @m
    public static final boolean l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 29438, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f81983a.l();
    }

    @m
    public static final void m(@e Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29434, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.m(context, z10);
    }

    @m
    public static final void n(@e Context context, @e PostDataObj postDataObj, int i10) {
        if (PatchProxy.proxy(new Object[]{context, postDataObj, new Integer(i10)}, null, changeQuickRedirect, true, 29433, new Class[]{Context.class, PostDataObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.n(context, postDataObj, i10);
    }

    @m
    public static final void o(@d PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, @d PostCheckReason postCheckReason, @e String str, @e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{post_edit_type, postCheckReason, str, jsonObject}, null, changeQuickRedirect, true, 29443, new Class[]{PictureVideoEditPostFragment.POST_EDIT_TYPE.class, PostCheckReason.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.p(post_edit_type, postCheckReason, str, jsonObject);
    }

    @m
    public static final void p(@d PostType postType, @d PostCheckReason postCheckReason, @e String str, @e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{postType, postCheckReason, str, jsonObject}, null, changeQuickRedirect, true, 29444, new Class[]{PostType.class, PostCheckReason.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.q(postType, postCheckReason, str, jsonObject);
    }

    @m
    public static final void q(@d PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, @e String str, @e String str2, @e String str3, @e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{post_edit_type, str, str2, str3, jsonObject}, null, changeQuickRedirect, true, 29445, new Class[]{PictureVideoEditPostFragment.POST_EDIT_TYPE.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.r(post_edit_type, str, str2, str3, jsonObject);
    }

    @m
    public static final void r(@d PostType postType, @e String str, @e String str2, @e String str3, @e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{postType, str, str2, str3, jsonObject}, null, changeQuickRedirect, true, 29446, new Class[]{PostType.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.s(postType, str, str2, str3, jsonObject);
    }

    @m
    public static final void s(@d FragmentActivity fragmentActivity, @e Intent intent) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, intent}, null, changeQuickRedirect, true, 29439, new Class[]{FragmentActivity.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.u(fragmentActivity, intent);
    }

    @m
    public static final void t(@d FragmentActivity fragmentActivity, @e String str) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, str}, null, changeQuickRedirect, true, 29436, new Class[]{FragmentActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.v(fragmentActivity, str);
    }

    @i
    @m
    public static final void u(@e Activity activity, @d List<File> list, @e List<Bitmap> list2, @e String str, @e List<BBSTopicObj> list3, @e List<String> list4, @e String str2, @e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{activity, list, list2, str, list3, list4, str2, jsonObject}, null, changeQuickRedirect, true, 29447, new Class[]{Activity.class, List.class, List.class, String.class, List.class, List.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.w(activity, list, list2, str, list3, list4, str2, jsonObject);
    }

    @i
    @m
    public static final void v(@e Activity activity, @d List<File> list, @e List<Bitmap> list2, @e String str, @e List<BBSTopicObj> list3, @e List<String> list4, @e String str2, @e String str3, @e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{activity, list, list2, str, list3, list4, str2, str3, jsonObject}, null, changeQuickRedirect, true, 29440, new Class[]{Activity.class, List.class, List.class, String.class, List.class, List.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f81983a.x(activity, list, list2, str, list3, list4, str2, str3, jsonObject);
    }
}
