package com.max.xiaoheihe.accelworld;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ResultObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicSubTagResult;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.FeedbackCateObj;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.GamesInfoResultObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkLabelsResult;
import com.max.xiaoheihe.bean.bbs.PostExposureCountResult;
import com.max.xiaoheihe.bean.bbs.PostExposureRatioObj;
import com.max.xiaoheihe.bean.bbs.PostExposureRatioResult;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.ChooseTopicsActivity;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: BBSShareDialogManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class BBSShareDialogManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f76506k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Activity f76507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Result<BBSLinkTreeObj> f76508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f76509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private UMImage f76510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f76511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final String f76512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f76513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.accelworld.w f76514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private WeakReference<Activity> f76515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private List<String> f76516j;

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public final class a implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f76517a;

        public a(boolean z10) {
            this.f76517a = z10;
        }

        public final boolean a() {
            return this.f76517a;
        }

        public final void b(boolean z10) {
            this.f76517a = z10;
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, bb.c.m.OA, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.m.NA, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
            if (!this.f76517a) {
                BBSShareDialogManager.this.a0().l("action_share", true);
            }
            com.max.hbshare.d.F(null, BBSShareDialogManager.this.d0(), this.f76517a ? com.max.hbshare.d.f72598t : "normal", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class a0 extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.cC, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.dC, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class a1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<kotlin.b2> f76522c;

        a1(LinkInfoObj linkInfoObj, yh.a<kotlin.b2> aVar) {
            this.f76521b = linkInfoObj;
            this.f76522c = aVar;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.QC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", this.f76521b.getLinkid());
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            com.max.hbcommon.analytics.d.d("4", lb.d.f131191k0, null, jsonObject);
            BBSShareDialogManager.H(BBSShareDialogManager.this, this.f76521b, this.f76522c);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class a2 extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a2() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.FD, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.GD, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<ResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f76527e;

        b(String str, String str2, String str3) {
            this.f76525c = str;
            this.f76526d = str2;
            this.f76527e = str3;
        }

        public void onNext(@dl.d Result<ResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.PA, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (kotlin.jvm.internal.f0.g("1", this.f76525c) && result.getResult() != null) {
                    ResultObj result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    if (!com.max.hbcommon.utils.c.u(result2.getMsg())) {
                        BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
                        String str = this.f76526d;
                        String str2 = this.f76527e;
                        ResultObj result3 = result.getResult();
                        kotlin.jvm.internal.f0.m(result3);
                        BBSShareDialogManager.A(bBSShareDialogManager, str, str2, result3.getMsg());
                        return;
                    }
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.QA, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class b0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76530d;

        b0(String str, String str2) {
            this.f76529c = str;
            this.f76530d = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.eC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.a(BBSShareDialogManager.this, this.f76529c, this.f76530d, "0");
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class b1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostOptionObj f76532b;

        b1(PostOptionObj postOptionObj) {
            this.f76532b = postOptionObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.RC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activityC0 = BBSShareDialogManager.this.c0();
            kotlin.jvm.internal.f0.m(activityC0);
            com.max.xiaoheihe.base.router.b.k0(activityC0, this.f76532b.getProtocol());
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class b2 extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76534c;

        b2(String str) {
            this.f76534c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.HD, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:26:0x006b  */
        public void onNext(@dl.d Result<?> result) {
            String strN0;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.ID, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.d(result.getMsg());
                    return;
                }
                switch (this.f76534c) {
                    case "1":
                        strN0 = "已设置为所有人可见";
                        break;
                    case "2":
                        strN0 = "已设置为仅粉丝可见";
                        break;
                    case "3":
                        strN0 = "已设置为仅自己可见";
                        break;
                    default:
                        strN0 = com.max.xiaoheihe.utils.d.n0(R.string.success);
                        break;
                }
                com.max.hbutils.utils.c.d(strN0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.JD, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.RA, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.SA, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class c0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c0 f76536b = new c0();
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.fC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class c1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c1() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.OC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!BBSShareDialogManager.this.a0().p()) {
                BBSShareDialogManager.this.x0();
            }
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class c2 extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c2() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.KD, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.LD, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.TA, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.UA, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.VA, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
            } else {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.WA, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class d0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76540b;

        d0(LinkInfoObj linkInfoObj) {
            this.f76540b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.hC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.I(BBSShareDialogManager.this, this.f76540b.getUser().getUserid(), BBSShareDialogManager.this.e0(), "link");
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class d1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76542b;

        d1(LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76541a = linkInfoObj;
            this.f76542b = bBSShareDialogManager;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.SC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (kotlin.jvm.internal.f0.g("1", this.f76541a.getIs_favour())) {
                textView.setText(com.max.xiaoheihe.utils.d.n0(R.string.favour));
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            } else {
                textView.setText(com.max.xiaoheihe.utils.d.n0(R.string.collected));
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            }
            BBSShareDialogManager.r(this.f76542b);
            com.max.hbshare.d.n(this.f76542b.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.XA, new Class[0], Void.TYPE).isSupported && BBSShareDialogManager.this.q0()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.YA, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.ZA, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Activity activityC0 = BBSShareDialogManager.this.c0();
                if (activityC0 != null) {
                    activityC0.finish();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.aB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class e0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76545b;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ LinkInfoObj f76547b;

            a(BBSShareDialogManager bBSShareDialogManager, LinkInfoObj linkInfoObj) {
                this.f76546a = bBSShareDialogManager;
                this.f76547b = linkInfoObj;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.kC, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                BBSShareDialogManager.L(this.f76546a, this.f76547b.getUser().getUserid());
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.jC, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        e0(LinkInfoObj linkInfoObj) {
            this.f76545b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.iC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(BBSShareDialogManager.this.c0(), com.max.xiaoheihe.utils.d.n0(R.string.cancel_forbid_tips), "", com.max.xiaoheihe.utils.d.n0(R.string.cancel_forbid), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new a(BBSShareDialogManager.this, this.f76545b));
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class e1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76549b;

        e1(LinkInfoObj linkInfoObj) {
            this.f76549b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.TC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (BBSShareDialogManager.this.c0() instanceof FragmentActivity) {
                Activity activityC0 = BBSShareDialogManager.this.c0();
                kotlin.jvm.internal.f0.n(activityC0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) activityC0;
                String linkid = this.f76549b.getLinkid();
                ArrayList<FeedbackCateObj> feedback = this.f76549b.getFeedback();
                String strD0 = BBSShareDialogManager.this.d0();
                if (strD0 == null) {
                    LinkInfoObj linkInfoObj = this.f76549b;
                    strD0 = linkInfoObj != null ? linkInfoObj.getH_src() : null;
                }
                com.max.xiaoheihe.module.news.g.c4(linkid, feedback, strD0, "1").M3(fragmentActivity.getSupportFragmentManager(), "NegativeFeedback");
            }
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76551c;

        f(String str) {
            this.f76551c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.bB, new Class[0], Void.TYPE).isSupported && BBSShareDialogManager.this.q0()) {
                if (kotlin.jvm.internal.f0.g("1", this.f76551c)) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.collect_success));
                } else {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.cancel_collect_success));
                }
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.cB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
                BBSShareDialogManager.this.a0().m();
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.dB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                BBSShareDialogManager.this.a0().r(this.f76551c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.eB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class f0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76553b;

        f0(LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76552a = linkInfoObj;
            this.f76553b = bBSShareDialogManager;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.lC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.w(this.f76552a.getTopics())) {
                com.max.xiaoheihe.accelworld.w wVarA0 = this.f76553b.a0();
                Intent intentC2 = ChooseTopicsActivity.c2(this.f76553b.c0(), this.f76552a.getTopics(), 3);
                kotlin.jvm.internal.f0.o(intentC2, "getIntent(mContext, mLinkInfoObj.topics, 3)");
                wVarA0.startActivityForResult(intentC2, 5);
            } else if (this.f76552a.getTopic() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f76552a.getTopic());
                com.max.xiaoheihe.accelworld.w wVarA1 = this.f76553b.a0();
                Intent intentC3 = ChooseTopicsActivity.c2(this.f76553b.c0(), arrayList, 3);
                kotlin.jvm.internal.f0.o(intentC3, "getIntent(mContext, topics, 3)");
                wVarA1.startActivityForResult(intentC3, 5);
            }
            com.max.hbshare.d.n(this.f76553b.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class f1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76555b;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements ReportReasonFragment.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76556a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f76557b;

            a(BBSShareDialogManager bBSShareDialogManager, TextView textView) {
                this.f76556a = bBSShareDialogManager;
                this.f76557b = textView;
            }

            @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
            public void a(@dl.d String report_reason, @dl.e String str) {
                if (PatchProxy.proxy(new Object[]{report_reason, str}, this, changeQuickRedirect, false, bb.c.m.VC, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(report_reason, "report_reason");
                if (this.f76556a.i0()) {
                    this.f76557b.setText(com.max.xiaoheihe.utils.d.n0(R.string.report));
                    this.f76557b.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                } else {
                    this.f76557b.setText(com.max.xiaoheihe.utils.d.n0(R.string.reported));
                    this.f76557b.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                }
                this.f76556a.G0(true);
                com.max.xiaoheihe.module.bbs.utils.b.T(this.f76556a.e0(), report_reason, str, this.f76556a.d0());
            }
        }

        f1(LinkInfoObj linkInfoObj) {
            this.f76555b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.UC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.xiaoheihe.utils.i0.e(BBSShareDialogManager.this.c0())) {
                ReportReasonFragment.a aVar = ReportReasonFragment.f80025u;
                a aVar2 = new a(BBSShareDialogManager.this, textView);
                ReportReasonFragment.ObjectType objectType = ReportReasonFragment.ObjectType.link;
                BBSUserInfoObj user = this.f76555b.getUser();
                ReportReasonFragment reportReasonFragmentA = aVar.a(aVar2, objectType, user != null ? user.getUserid() : null, this.f76555b.getLinkid(), null);
                FragmentManager fragmentManagerO = BBSShareDialogManager.this.a0().o();
                if (fragmentManagerO != null) {
                    reportReasonFragmentA.show(fragmentManagerO, "ForbidReasonFragment");
                }
            }
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.fB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.gB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class g0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76560b;

        g0(LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76559a = linkInfoObj;
            this.f76560b = bBSShareDialogManager;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.mC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.k(this.f76560b, this.f76559a.getTopic() != null ? this.f76559a.getTopic().getTopic_id() : null);
            com.max.hbshare.d.n(this.f76560b.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class g1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f76562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76563c;

        g1(String str, LinkInfoObj linkInfoObj) {
            this.f76562b = str;
            this.f76563c = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.WC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", this.f76563c.getLinkid());
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            com.max.hbcommon.analytics.d.d("4", lb.d.f131226p0, null, jsonObject);
            BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
            String currentUserId = this.f76562b;
            kotlin.jvm.internal.f0.o(currentUserId, "currentUserId");
            BBSShareDialogManager.B(bBSShareDialogManager, currentUserId, this.f76563c);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<BBSTopicSubTagResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.hB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<BBSTopicSubTagResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.iB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (result.getResult() != null) {
                BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
                BBSTopicSubTagResult result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                BBSShareDialogManager.G(bBSShareDialogManager, result2.getCategories());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.jB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicSubTagResult>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class h0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76567b;

        h0(LinkInfoObj linkInfoObj) {
            this.f76567b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.nC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.u(BBSShareDialogManager.this, this.f76567b.getLinkid());
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class h1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76569b;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ LinkInfoObj f76571b;

            a(BBSShareDialogManager bBSShareDialogManager, LinkInfoObj linkInfoObj) {
                this.f76570a = bBSShareDialogManager;
                this.f76571b = linkInfoObj;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.ZC, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                BBSShareDialogManager.t(this.f76570a, this.f76571b.getLinkid());
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.YC, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        h1(LinkInfoObj linkInfoObj) {
            this.f76569b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.XC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(BBSShareDialogManager.this.c0(), "", com.max.xiaoheihe.utils.d.n0(R.string.put_post_to_bottom), com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new a(BBSShareDialogManager.this, this.f76569b));
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<PostExposureCountResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HeyBoxPopupMenu f76574b;

            a(BBSShareDialogManager bBSShareDialogManager, HeyBoxPopupMenu heyBoxPopupMenu) {
                this.f76573a = bBSShareDialogManager;
                this.f76574b = heyBoxPopupMenu;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, bb.c.m.pB, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                BBSShareDialogManager bBSShareDialogManager = this.f76573a;
                LinkInfoObj linkInfoObjF0 = bBSShareDialogManager.f0();
                BBSShareDialogManager.w(bBSShareDialogManager, linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null, keyDescObj.getKey());
                this.f76574b.dismiss();
            }
        }

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.mB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<PostExposureCountResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.nB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0() && result.getResult() != null) {
                PostExposureCountResult result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                List<KeyDescObj> options = result2.getOptions();
                ArrayList arrayList = new ArrayList();
                PostExposureCountResult result3 = result.getResult();
                kotlin.jvm.internal.f0.m(result3);
                if (!com.max.hbcommon.utils.c.w(result3.getInfo())) {
                    PostExposureCountResult result4 = result.getResult();
                    kotlin.jvm.internal.f0.m(result4);
                    List<String> info = result4.getInfo();
                    kotlin.jvm.internal.f0.m(info);
                    for (String str : info) {
                        KeyDescObj keyDescObj = new KeyDescObj();
                        keyDescObj.setKey("current_info");
                        keyDescObj.setDesc(str);
                        keyDescObj.setCanClick(false);
                        arrayList.add(keyDescObj);
                    }
                }
                if (options != null && options.size() > 0) {
                    for (KeyDescObj keyDescObj2 : options) {
                        KeyDescObj keyDescObj3 = new KeyDescObj();
                        keyDescObj3.setKey(keyDescObj2.getKey());
                        keyDescObj3.setDesc(keyDescObj2.getDesc());
                        arrayList.add(keyDescObj3);
                    }
                }
                Activity activityC0 = BBSShareDialogManager.this.c0();
                kotlin.jvm.internal.f0.m(activityC0);
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(activityC0, arrayList, false);
                heyBoxPopupMenu.O(false);
                heyBoxPopupMenu.R(new a(BBSShareDialogManager.this, heyBoxPopupMenu));
                heyBoxPopupMenu.show();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.oB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PostExposureCountResult>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class i0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76576b;

        i0(LinkInfoObj linkInfoObj) {
            this.f76576b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.oC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.b(BBSShareDialogManager.this, this.f76576b.getLinkid());
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class i1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76578b;

        i1(LinkInfoObj linkInfoObj) {
            this.f76578b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.aD, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.D(BBSShareDialogManager.this, this.f76578b.getUser().getUserid(), BBSShareDialogManager.this.e0(), "link");
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<PostExposureRatioResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HeyBoxPopupMenu f76581b;

            a(BBSShareDialogManager bBSShareDialogManager, HeyBoxPopupMenu heyBoxPopupMenu) {
                this.f76580a = bBSShareDialogManager;
                this.f76581b = heyBoxPopupMenu;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, bb.c.m.tB, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (kotlin.jvm.internal.f0.g("input", keyDescObj.getKey())) {
                    BBSShareDialogManager.C(this.f76580a);
                } else {
                    BBSShareDialogManager bBSShareDialogManager = this.f76580a;
                    LinkInfoObj linkInfoObjF0 = bBSShareDialogManager.f0();
                    BBSShareDialogManager.x(bBSShareDialogManager, linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null, keyDescObj.getKey());
                }
                this.f76581b.dismiss();
            }
        }

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.qB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<PostExposureRatioResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.rB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (result.getResult() != null) {
                PostExposureRatioResult result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                List<PostExposureRatioObj> exposure_levels = result2.getExposure_levels();
                ArrayList arrayList = new ArrayList();
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setKey("current_info");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("本帖当前曝光额外系数");
                PostExposureRatioResult result3 = result.getResult();
                kotlin.jvm.internal.f0.m(result3);
                sb2.append(result3.getCurr_ratio());
                keyDescObj.setDesc(sb2.toString());
                keyDescObj.setCanClick(false);
                arrayList.add(keyDescObj);
                if (exposure_levels != null && exposure_levels.size() > 0) {
                    for (PostExposureRatioObj postExposureRatioObj : exposure_levels) {
                        KeyDescObj keyDescObj2 = new KeyDescObj();
                        keyDescObj2.setKey(postExposureRatioObj.getRatio());
                        keyDescObj2.setDesc(postExposureRatioObj.getDesc() + '(' + postExposureRatioObj.getRatio() + ')');
                        arrayList.add(keyDescObj2);
                    }
                }
                KeyDescObj keyDescObj3 = new KeyDescObj();
                keyDescObj3.setKey("input");
                keyDescObj3.setDesc("自定义曝光");
                arrayList.add(keyDescObj3);
                Activity activityC0 = BBSShareDialogManager.this.c0();
                kotlin.jvm.internal.f0.m(activityC0);
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(activityC0, arrayList, false);
                heyBoxPopupMenu.O(false);
                heyBoxPopupMenu.R(new a(BBSShareDialogManager.this, heyBoxPopupMenu));
                heyBoxPopupMenu.show();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.sB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PostExposureRatioResult>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class j0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76583b;

        j0(LinkInfoObj linkInfoObj) {
            this.f76583b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.pC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.a(BBSShareDialogManager.this, this.f76583b.getLinkid(), "3", "1");
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class j1 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f76584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76587d;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a extends com.max.hbcommon.network.d<Result<?>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76588b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LinkInfoObj f76589c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f76590d;

            a(BBSShareDialogManager bBSShareDialogManager, LinkInfoObj linkInfoObj, String str) {
                this.f76588b = bBSShareDialogManager;
                this.f76589c = linkInfoObj;
                this.f76590d = str;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.cD, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
                if (this.f76588b.q0()) {
                    this.f76589c.setIs_top_link(this.f76590d);
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<?> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.dD, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                if (this.f76588b.q0()) {
                    com.max.hbutils.utils.x.p(result.getResult());
                    Activity activityC0 = this.f76588b.c0();
                    if (activityC0 != null) {
                        androidx.localbroadcastmanager.content.a.b(activityC0).d(new Intent(lb.a.Z));
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.eD, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<?>) obj);
            }
        }

        j1(boolean z10, LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager, String str) {
            this.f76584a = z10;
            this.f76585b = linkInfoObj;
            this.f76586c = bBSShareDialogManager;
            this.f76587d = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.bD, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = this.f76584a ? lb.d.f131219o0 : lb.d.f131212n0;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", this.f76585b.getLinkid());
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            com.max.hbcommon.analytics.d.d("4", str, null, jsonObject);
            boolean z10 = this.f76584a;
            String str2 = z10 ? "cancel" : "add";
            if (z10) {
                this.f76585b.setIs_top_link("0");
            } else {
                this.f76585b.setIs_top_link("1");
            }
            io.reactivex.disposables.a aVarA = this.f76586c.a0().a();
            if (aVarA != null) {
                aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P2(this.f76585b.getLinkid(), str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(this.f76586c, this.f76585b, this.f76587d)));
            }
            com.max.hbshare.d.n(this.f76586c.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class k extends com.max.hbcommon.network.d<Result<GamesInfoResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Result<BBSLinkTreeObj> f76593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76594e;

        k(LinkInfoObj linkInfoObj, Result<BBSLinkTreeObj> result, boolean z10) {
            this.f76592c = linkInfoObj;
            this.f76593d = result;
            this.f76594e = z10;
        }

        public void onNext(@dl.d Result<GamesInfoResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.uB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                LinkInfoObj linkInfoObj = this.f76592c;
                if (linkInfoObj == null || !kotlin.jvm.internal.f0.g("1", linkInfoObj.getIs_article())) {
                    Activity activityC0 = BBSShareDialogManager.this.c0();
                    kotlin.jvm.internal.f0.m(activityC0);
                    com.max.xiaoheihe.base.router.b.h(activityC0, this.f76593d, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).C(6).W(PostTabActivity.G2, this.f76594e).A();
                } else {
                    Activity activityC1 = BBSShareDialogManager.this.c0();
                    kotlin.jvm.internal.f0.m(activityC1);
                    com.max.xiaoheihe.base.router.b.a(activityC1, this.f76593d, com.max.hbutils.utils.k.p(result.getResult().getBase_infos())).C(6).W(PostTabActivity.G2, this.f76594e).A();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.vB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamesInfoResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class k0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76597c;

        k0(LinkInfoObj linkInfoObj, boolean z10) {
            this.f76596b = linkInfoObj;
            this.f76597c = z10;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.qC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.y(BBSShareDialogManager.this, this.f76596b.getLinkid(), this.f76597c);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class k1 implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76599b;

        k1(LinkInfoObj linkInfoObj) {
            this.f76599b = linkInfoObj;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.gD, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            BBSShareDialogManager.d(BBSShareDialogManager.this, this.f76599b.getLinkid());
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.fD, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class l extends com.max.hbcommon.network.d<Result<LinkLabelsResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76601a;

            a(BBSShareDialogManager bBSShareDialogManager) {
                this.f76601a = bBSShareDialogManager;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, bb.c.m.zB, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                BBSShareDialogManager bBSShareDialogManager = this.f76601a;
                LinkInfoObj linkInfoObjF0 = bBSShareDialogManager.f0();
                BBSShareDialogManager.p(bBSShareDialogManager, linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null, keyDescObj.getId());
            }
        }

        l() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.wB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<LinkLabelsResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.xB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (result.getResult() != null) {
                LinkLabelsResult result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                ArrayList<KeyDescObj> arrayList = new ArrayList(result2.getLabels());
                for (KeyDescObj keyDescObj : arrayList) {
                    keyDescObj.setDesc(keyDescObj.getName());
                }
                Activity activityC0 = BBSShareDialogManager.this.c0();
                kotlin.jvm.internal.f0.m(activityC0);
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(activityC0, arrayList);
                heyBoxPopupMenu.R(new a(BBSShareDialogManager.this));
                heyBoxPopupMenu.show();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.yB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<LinkLabelsResult>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class l0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76603b;

        l0(LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76602a = linkInfoObj;
            this.f76603b = bBSShareDialogManager;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.rC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f76602a.getRelated_status() != null && kotlin.jvm.internal.f0.g("roll_room", this.f76602a.getRelated_status().getContent_type())) {
                BBSShareDialogManager.z(this.f76603b, this.f76602a.getRelated_status().getRoom_detail().getRoom_id());
            }
            com.max.hbshare.d.n(this.f76603b.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class l1 implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f76606c;

        l1(LinkInfoObj linkInfoObj, HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f76605b = linkInfoObj;
            this.f76606c = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, bb.c.m.hD, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(keyDescObj.getId(), "1")) {
                JsonObject jsonObject = new JsonObject();
                LinkInfoObj linkInfoObjF0 = BBSShareDialogManager.this.f0();
                jsonObject.addProperty("link_id", linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null);
                kotlin.b2 b2Var = kotlin.b2.f124493a;
                com.max.hbcommon.analytics.d.d("4", lb.d.f131240r0, null, jsonObject);
                BBSShareDialogManager.d(BBSShareDialogManager.this, this.f76605b.getLinkid());
            } else {
                JsonObject jsonObject2 = new JsonObject();
                LinkInfoObj linkInfoObjF1 = BBSShareDialogManager.this.f0();
                jsonObject2.addProperty("link_id", linkInfoObjF1 != null ? linkInfoObjF1.getLinkid() : null);
                kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                com.max.hbcommon.analytics.d.d("4", lb.d.f131233q0, null, jsonObject2);
                BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
                String linkid = this.f76605b.getLinkid();
                kotlin.jvm.internal.f0.o(linkid, "linkInfoObj.linkid");
                BBSShareDialogManager.c1(bBSShareDialogManager, linkid, null, 2, null);
            }
            this.f76606c.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<BBSTopicSubTagResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.AB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<BBSTopicSubTagResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.BB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (result.getResult() != null) {
                BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
                BBSTopicSubTagResult result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                BBSShareDialogManager.G(bBSShareDialogManager, result2.getCategories());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.CB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicSubTagResult>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class m0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m0() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.sC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.F(BBSShareDialogManager.this);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class m1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f76609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76610c;

        m1(EditText editText, BBSShareDialogManager bBSShareDialogManager) {
            this.f76609b = editText;
            this.f76610c = bBSShareDialogManager;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.iD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f76609b.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                com.max.hbutils.utils.c.f("请输入有效数字");
                return;
            }
            BBSShareDialogManager bBSShareDialogManager = this.f76610c;
            LinkInfoObj linkInfoObjF0 = bBSShareDialogManager.f0();
            BBSShareDialogManager.x(bBSShareDialogManager, linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null, string);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.DB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.EB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class n0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76613b;

        n0(LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76612a = linkInfoObj;
            this.f76613b = bBSShareDialogManager;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.gC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f76612a.getForward() != null && this.f76612a.getForward().getIs_deleted() != null && kotlin.jvm.internal.f0.g("1", this.f76612a.getForward().getIs_deleted())) {
                com.max.hbutils.utils.c.f("原贴已被删除，无法转发");
            } else {
                if (!com.max.hbcommon.utils.c.u(this.f76612a.getCan_not_share_tips())) {
                    com.max.hbutils.utils.c.f(this.f76612a.getCan_not_share_tips());
                    return;
                }
                if (!this.f76613b.a0().p()) {
                    this.f76613b.x0();
                }
                com.max.hbshare.d.n(this.f76613b.c0(), dialog);
            }
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class n1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n1 f76614b = new n1();
        public static ChangeQuickRedirect changeQuickRedirect;

        n1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.jD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class o extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.FB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.GB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class o0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o0() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.uC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.E(BBSShareDialogManager.this);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class o1 implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f76618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76620d;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements RadioGroup.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f76621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<RadioButton> f76622b;

            a(View view, Ref.ObjectRef<RadioButton> objectRef) {
                this.f76621a = view;
                this.f76622b = objectRef;
            }

            /* JADX WARN: Type inference failed for: r9v7, types: [T, android.widget.RadioButton, android.widget.TextView] */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.lD, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ?? r10 = (RadioButton) this.f76621a.findViewById(i10);
                RadioButton radioButton = this.f76622b.f124891b;
                if (radioButton != null) {
                    radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
                if (r10 != 0) {
                    r10.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
                this.f76622b.f124891b = r10;
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RadioGroup f76623b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditText f76624c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76625d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f76626e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f76627f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f76628g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f76629h;

            b(RadioGroup radioGroup, EditText editText, BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3, String str4) {
                this.f76623b = radioGroup;
                this.f76624c = editText;
                this.f76625d = bBSShareDialogManager;
                this.f76626e = str;
                this.f76627f = str2;
                this.f76628g = str3;
                this.f76629h = str4;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.mD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f76623b.getCheckedRadioButtonId() == R.id.rb_1) {
                    str = "259200";
                } else if (this.f76623b.getCheckedRadioButtonId() == R.id.rb_2) {
                    str = "604800";
                } else {
                    str = this.f76623b.getCheckedRadioButtonId() == R.id.rb_3 ? "1296000" : "86400";
                }
                BBSShareDialogManager.e(this.f76625d, this.f76626e, this.f76627f, str, null, this.f76628g, this.f76629h, !com.max.hbcommon.utils.c.u(this.f76624c.getText().toString()) ? this.f76624c.getText().toString() : null);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f76630b = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.nD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        o1(String str, String str2, String str3) {
            this.f76618b = str;
            this.f76619c = str2;
            this.f76620d = str3;
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [T, android.view.View] */
        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, bb.c.m.kD, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported || BBSShareDialogManager.this.c0() == null) {
                return;
            }
            Activity activityC0 = BBSShareDialogManager.this.c0();
            kotlin.jvm.internal.f0.m(activityC0);
            View viewInflate = activityC0.getLayoutInflater().inflate(R.layout.layout_forbid_user, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            View viewFindViewById = viewInflate.findViewById(R.id.rg_forbid_time);
            kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.RadioGroup");
            RadioGroup radioGroup = (RadioGroup) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_forbid_time_remained);
            kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.et_forbid_comment);
            kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) viewFindViewById3;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? FindViewById = viewInflate.findViewById(radioGroup.getCheckedRadioButtonId());
            objectRef.f124891b = FindViewById;
            RadioButton radioButton = (RadioButton) FindViewById;
            if (radioButton != null) {
                radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            radioGroup.setOnCheckedChangeListener(new a(viewInflate, objectRef));
            if (forbidReasonResult == null || forbidReasonResult.getForbid_info() == null) {
                str2 = "0";
            } else {
                long jR = com.max.hbutils.utils.n.r(forbidReasonResult.getForbid_info().getRemained_seconds());
                kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                str2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Math.ceil(jR / 86400.0d))}, 1));
                kotlin.jvm.internal.f0.o(str2, "format(locale, format, *args)");
            }
            kotlin.jvm.internal.v0 v0Var2 = kotlin.jvm.internal.v0.f124986a;
            String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.forbid_remained);
            kotlin.jvm.internal.f0.o(strN0, "getString(R.string.forbid_remained)");
            String str3 = String.format(strN0, Arrays.copyOf(new Object[]{str2}, 1));
            kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
            textView.setText(str3);
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(BBSShareDialogManager.this.c0());
            fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.please_choose_forbid_time)).i(viewInflate).u(com.max.xiaoheihe.utils.d.n0(R.string.bbs_mute), new b(radioGroup, editText, BBSShareDialogManager.this, this.f76618b, str, this.f76619c, this.f76620d)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), c.f76630b);
            fVar.F();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class p extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.HB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.IB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class p0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76633b;

        p0(LinkInfoObj linkInfoObj) {
            this.f76633b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.vC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
            String linkid = this.f76633b.getLinkid();
            kotlin.jvm.internal.f0.o(linkid, "mLinkInfoObj.linkid");
            BBSShareDialogManager.o(bBSShareDialogManager, linkid);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class p1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f76634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76635c;

        p1(EditText editText, BBSShareDialogManager bBSShareDialogManager) {
            this.f76634b = editText;
            this.f76635c = bBSShareDialogManager;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.oD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = !com.max.hbcommon.utils.c.u(this.f76634b.getText().toString()) ? this.f76634b.getText().toString() : null;
            BBSShareDialogManager bBSShareDialogManager = this.f76635c;
            BBSShareDialogManager.q(bBSShareDialogManager, bBSShareDialogManager.e0(), string, null);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class q extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.JB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.KB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class q0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76638b;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76639b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LinkInfoObj f76640c;

            a(BBSShareDialogManager bBSShareDialogManager, LinkInfoObj linkInfoObj) {
                this.f76639b = bBSShareDialogManager;
                this.f76640c = linkInfoObj;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.xC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                BBSShareDialogManager.m(this.f76639b, this.f76640c.getLinkid());
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f76641b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.yC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        q0(LinkInfoObj linkInfoObj) {
            this.f76638b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.wC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(BBSShareDialogManager.this.c0());
            fVar.y("是否确认增加头条值？").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a(BBSShareDialogManager.this, this.f76638b)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), b.f76641b);
            fVar.F();
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class q1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q1 f76642b = new q1();
        public static ChangeQuickRedirect changeQuickRedirect;

        q1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.pD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class r extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76645d;

        r(boolean z10, String str) {
            this.f76644c = z10;
            this.f76645d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.LB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.MB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                if (this.f76644c || !kotlin.jvm.internal.f0.g("0", this.f76645d)) {
                    LinkInfoObj linkInfoObjF0 = BBSShareDialogManager.this.f0();
                    if (linkInfoObjF0 == null) {
                        return;
                    }
                    linkInfoObjF0.setNews_show("0");
                    return;
                }
                LinkInfoObj linkInfoObjF1 = BBSShareDialogManager.this.f0();
                if (linkInfoObjF1 == null) {
                    return;
                }
                linkInfoObjF1.setNews_show("1");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.NB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class r0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.zC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.j(BBSShareDialogManager.this);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class r1 implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        r1() {
        }

        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, bb.c.m.qD, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
            BBSShareDialogManager.q(bBSShareDialogManager, bBSShareDialogManager.e0(), null, str);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class s extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.OB, new Class[0], Void.TYPE).isSupported && BBSShareDialogManager.this.q0()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.PB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (BBSShareDialogManager.this.q0()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.QB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Activity activityC0 = BBSShareDialogManager.this.c0();
                if (activityC0 != null) {
                    activityC0.finish();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.RB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class s0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76650b;

        s0(LinkInfoObj linkInfoObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76649a = linkInfoObj;
            this.f76650b = bBSShareDialogManager;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.AC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.f(this.f76650b, this.f76649a.getTopic() != null ? this.f76649a.getTopic().getTopic_id() : null);
            com.max.hbshare.d.n(this.f76650b.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class s1 implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s1() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.m.uD, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.d SHARE_MEDIA share_media, @dl.d Throwable throwable) {
            if (PatchProxy.proxy(new Object[]{share_media, throwable}, this, changeQuickRedirect, false, bb.c.m.tD, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
            kotlin.jvm.internal.f0.p(throwable, "throwable");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.m.sD, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
            com.max.hbshare.d.F(null, BBSShareDialogManager.this.d0(), "normal", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.m.rD, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class t extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.SB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.TB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class t0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f76654b;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76655b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f76656c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.accelworld.BBSShareDialogManager$t0$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BBSShareDialogManager.kt */
            public static final class DialogInterfaceOnClickListenerC0619a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ BBSShareDialogManager f76657b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f76658c;

                DialogInterfaceOnClickListenerC0619a(BBSShareDialogManager bBSShareDialogManager, boolean z10) {
                    this.f76657b = bBSShareDialogManager;
                    this.f76658c = z10;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.DC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    BBSShareDialogManager bBSShareDialogManager = this.f76657b;
                    BBSShareDialogManager.s(bBSShareDialogManager, bBSShareDialogManager.e0(), this.f76658c, "0");
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: compiled from: BBSShareDialogManager.kt */
            public static final class b implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f76659b = new b();
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.EC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            a(BBSShareDialogManager bBSShareDialogManager, boolean z10) {
                this.f76655b = bBSShareDialogManager;
                this.f76656c = z10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.CC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f76655b.c0());
                fVar.y("确定立即上线？").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new DialogInterfaceOnClickListenerC0619a(this.f76655b, this.f76656c)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), b.f76659b);
                fVar.F();
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76660b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f76661c;

            /* JADX INFO: compiled from: BBSShareDialogManager.kt */
            public static final class a implements DatePickerDialog.OnDateSetListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Calendar f76662a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ BBSShareDialogManager f76663b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f76664c;

                /* JADX INFO: renamed from: com.max.xiaoheihe.accelworld.BBSShareDialogManager$t0$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: BBSShareDialogManager.kt */
                public static final class C0620a implements TimePickerDialog.OnTimeSetListener {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Calendar f76665a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ BBSShareDialogManager f76666b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f76667c;

                    C0620a(Calendar calendar, BBSShareDialogManager bBSShareDialogManager, boolean z10) {
                        this.f76665a = calendar;
                        this.f76666b = bBSShareDialogManager;
                        this.f76667c = z10;
                    }

                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
                        Object[] objArr = {timePicker, new Integer(i10), new Integer(i11)};
                        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                        Class cls = Integer.TYPE;
                        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.HC, new Class[]{TimePicker.class, cls, cls}, Void.TYPE).isSupported) {
                            return;
                        }
                        this.f76665a.set(11, i10);
                        this.f76665a.set(12, i11);
                        BBSShareDialogManager bBSShareDialogManager = this.f76666b;
                        BBSShareDialogManager.s(bBSShareDialogManager, bBSShareDialogManager.e0(), this.f76667c, com.max.hbutils.utils.w.P(this.f76665a.getTimeInMillis()) + "");
                    }
                }

                a(Calendar calendar, BBSShareDialogManager bBSShareDialogManager, boolean z10) {
                    this.f76662a = calendar;
                    this.f76663b = bBSShareDialogManager;
                    this.f76664c = z10;
                }

                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                    Object[] objArr = {datePicker, new Integer(i10), new Integer(i11), new Integer(i12)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Integer.TYPE;
                    if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.GC, new Class[]{DatePicker.class, cls, cls, cls}, Void.TYPE).isSupported) {
                        return;
                    }
                    this.f76662a.set(i10, i11, i12);
                    new TimePickerDialog(this.f76663b.c0(), new C0620a(this.f76662a, this.f76663b, this.f76664c), this.f76662a.get(11), this.f76662a.get(12), true).show();
                }
            }

            b(BBSShareDialogManager bBSShareDialogManager, boolean z10) {
                this.f76660b = bBSShareDialogManager;
                this.f76661c = z10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.FC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(11, 1);
                Activity activityC0 = this.f76660b.c0();
                kotlin.jvm.internal.f0.m(activityC0);
                DatePickerDialog datePickerDialog = new DatePickerDialog(activityC0, new a(calendar2, this.f76660b, this.f76661c), calendar2.get(1), calendar2.get(2), calendar2.get(5));
                DatePicker datePicker = datePickerDialog.getDatePicker();
                kotlin.jvm.internal.f0.o(datePicker, "datePickerDialog.datePicker");
                datePicker.setMinDate(calendar.getTimeInMillis());
                datePickerDialog.show();
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class c implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76668b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f76669c;

            c(BBSShareDialogManager bBSShareDialogManager, boolean z10) {
                this.f76668b = bBSShareDialogManager;
                this.f76669c = z10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.IC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                BBSShareDialogManager bBSShareDialogManager = this.f76668b;
                BBSShareDialogManager.s(bBSShareDialogManager, bBSShareDialogManager.e0(), this.f76669c, "0");
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class d implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f76670b = new d();
            public static ChangeQuickRedirect changeQuickRedirect;

            d() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.JC, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        t0(boolean z10) {
            this.f76654b = z10;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(@dl.d Dialog dialog, @dl.d View container, @dl.d ImageView image, @dl.d TextView name) {
            if (PatchProxy.proxy(new Object[]{dialog, container, image, name}, this, changeQuickRedirect, false, bb.c.m.BC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            kotlin.jvm.internal.f0.p(container, "container");
            kotlin.jvm.internal.f0.p(image, "image");
            kotlin.jvm.internal.f0.p(name, "name");
            if (com.max.xiaoheihe.utils.i0.e(BBSShareDialogManager.this.c0())) {
                boolean z10 = this.f76654b;
                if (z10) {
                    com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(BBSShareDialogManager.this.c0());
                    fVar.y("确认下线？").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new c(BBSShareDialogManager.this, this.f76654b)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), d.f76670b);
                    fVar.F();
                } else {
                    BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
                    com.max.hbcommon.view.a.f fVar2 = new com.max.hbcommon.view.a.f(bBSShareDialogManager.c0());
                    fVar2.y("是否立即上线到首页推荐？").u("立即上线", new a(bBSShareDialogManager, z10)).o("定时上线", new b(bBSShareDialogManager, z10));
                    fVar2.F();
                }
            }
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class t1 implements ShareImageDialogFragment.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSFollowedMomentObj f76672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSShareDialogManager f76673c;

        t1(String str, BBSFollowedMomentObj bBSFollowedMomentObj, BBSShareDialogManager bBSShareDialogManager) {
            this.f76671a = str;
            this.f76672b = bBSFollowedMomentObj;
            this.f76673c = bBSShareDialogManager;
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
        public final View a(ViewGroup viewGroup) {
            String string;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.m.vD, new Class[]{ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            if (kotlin.jvm.internal.f0.g(BBSFollowedMomentObj.CONTENT_TYPE_GAME_ACHIEVE, this.f76671a)) {
                GameObj game = this.f76672b.getGame();
                return ShareViewUtil.a(this.f76673c.c0(), viewGroup, game.getImage(), game.getAppicon(), game.getName(), com.max.hbutils.utils.n.q(this.f76672b.getAchieve_count() != null ? this.f76672b.getAchieve_count() : this.f76672b.getAchieve_stats().getAchieved()), this.f76672b.getUnlocktime(), game.getItems(), this.f76672b.getUser().getAvartar(), this.f76672b.getUser().getUsername());
            }
            if (!kotlin.jvm.internal.f0.g(BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME, this.f76671a) && !kotlin.jvm.internal.f0.g("game_purchase", this.f76671a)) {
                return null;
            }
            GameObj gameObj = this.f76672b.getGames().get(0);
            if (kotlin.jvm.internal.f0.g(BBSFollowedMomentObj.CONTENT_TYPE_FOLLOW_GAME, this.f76671a)) {
                kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.follow_game_format);
                kotlin.jvm.internal.f0.o(strN0, "getString(R.string.follow_game_format)");
                string = String.format(strN0, Arrays.copyOf(new Object[]{this.f76672b.getFollow_count()}, 1));
                kotlin.jvm.internal.f0.o(string, "format(format, *args)");
            } else {
                String strN1 = kotlin.text.u.L1("heybox", this.f76672b.getPurchase_channel(), true) ? com.max.xiaoheihe.utils.d.n0(R.string.at_heybox) : com.max.xiaoheihe.utils.d.n0(R.string.at_steam);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strN1);
                kotlin.jvm.internal.v0 v0Var2 = kotlin.jvm.internal.v0.f124986a;
                String strN2 = com.max.xiaoheihe.utils.d.n0(R.string.purchase_game_format);
                kotlin.jvm.internal.f0.o(strN2, "getString(R.string.purchase_game_format)");
                String str = String.format(strN2, Arrays.copyOf(new Object[]{this.f76672b.getPurchase_count()}, 1));
                kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                sb2.append(str);
                string = sb2.toString();
            }
            return ShareViewUtil.c(this.f76673c.c0(), viewGroup, gameObj.getImage(), string, this.f76672b.getUser().getAvartar(), this.f76672b.getUser().getUsername(), this.f76672b.getTimestamp(), this.f76672b.getGames());
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class u extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76676d;

        u(LinkInfoObj linkInfoObj, String str) {
            this.f76675c = linkInfoObj;
            this.f76676d = str;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.UB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext((Result) result);
                LinkInfoObj linkInfoObj = this.f76675c;
                if (linkInfoObj != null) {
                    linkInfoObj.setDisable_comment(this.f76676d);
                    BBSShareDialogManager.this.a0().k(this.f76676d);
                }
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.VB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class u0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76678b;

        u0(LinkInfoObj linkInfoObj) {
            this.f76678b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.KC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.n(BBSShareDialogManager.this, this.f76678b.getLinkid());
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class u1 implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76680c;

        u1(String str) {
            this.f76680c = str;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.wD, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                if (BBSShareDialogManager.this.f76516j.contains(this.f76680c)) {
                    BBSShareDialogManager.this.f76516j.remove(this.f76680c);
                }
            } else {
                if (BBSShareDialogManager.this.f76516j.contains(this.f76680c)) {
                    return;
                }
                List list = BBSShareDialogManager.this.f76516j;
                String id2 = this.f76680c;
                kotlin.jvm.internal.f0.o(id2, "id");
                list.add(id2);
            }
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class v implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76683d;

        v(String str, String str2) {
            this.f76682c = str;
            this.f76683d = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.WB, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            io.reactivex.disposables.a aVarA = BBSShareDialogManager.this.a0().a();
            if (aVarA != null) {
                aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().za(this.f76682c, this.f76683d).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q()));
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class v0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76685b;

        v0(LinkInfoObj linkInfoObj) {
            this.f76685b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.LC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            if (BBSShareDialogManager.this.r0()) {
                BBSShareDialogManager.J(BBSShareDialogManager.this);
            } else {
                BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
                LinkInfoObj linkInfoObj = this.f76685b;
                kotlin.jvm.internal.f0.m(linkInfoObj);
                BBSShareDialogManager.K(bBSShareDialogManager, linkInfoObj.getLinkid());
            }
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class v1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.xD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.w(BBSShareDialogManager.this.f76516j)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.no_tag_tips));
                return;
            }
            BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
            BBSShareDialogManager.c(bBSShareDialogManager, bBSShareDialogManager.f76516j);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class w implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w f76687b = new w();
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.XB, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class w0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76689b;

        w0(LinkInfoObj linkInfoObj) {
            this.f76689b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.MC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
            BBSShareDialogManager.v(bBSShareDialogManager, bBSShareDialogManager.e0(), kotlin.jvm.internal.f0.g("1", this.f76689b.getDisable_comment()) ? "0" : "1");
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class w1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w1 f76690b = new w1();
        public static ChangeQuickRedirect changeQuickRedirect;

        w1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.yD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class x implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76693d;

        x(String str, String str2) {
            this.f76692c = str;
            this.f76693d = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.YB, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            io.reactivex.disposables.a aVarA = BBSShareDialogManager.this.a0().a();
            if (aVarA != null) {
                aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f5(this.f76692c, this.f76693d).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q()));
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class x0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x0() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.NC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.h(BBSShareDialogManager.this);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class x1 implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<kotlin.b2> f76697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f76698d;

        x1(LinkInfoObj linkInfoObj, yh.a<kotlin.b2> aVar, HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f76696b = linkInfoObj;
            this.f76697c = aVar;
            this.f76698d = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, bb.c.m.zD, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            LinkInfoObj linkInfoObjF0 = BBSShareDialogManager.this.f0();
            jsonObject.addProperty("link_id", linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null);
            jsonObject.addProperty("view_limit", keyDescObj.getId());
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            com.max.hbcommon.analytics.d.d("4", lb.d.f131198l0, null, jsonObject);
            BBSShareDialogManager bBSShareDialogManager = BBSShareDialogManager.this;
            String linkid = this.f76696b.getLinkid();
            kotlin.jvm.internal.f0.o(linkid, "linkInfoObj.linkid");
            String id2 = keyDescObj.getId();
            kotlin.jvm.internal.f0.o(id2, "data.id");
            BBSShareDialogManager.M(bBSShareDialogManager, linkid, id2);
            yh.a<kotlin.b2> aVar = this.f76697c;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f76698d.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class y implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f76699b = new y();
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.ZB, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class y0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76702c;

        y0(LinkInfoObj linkInfoObj, String str) {
            this.f76701b = linkInfoObj;
            this.f76702c = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.tC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", BBSShareDialogManager.this.e0());
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            com.max.hbcommon.analytics.d.d("4", lb.d.f131184j0, null, jsonObject);
            if (!com.max.hbcommon.utils.c.u(this.f76701b.getCan_not_share_chat_tips())) {
                com.max.hbutils.utils.c.f(this.f76701b.getCan_not_share_chat_tips());
                return;
            }
            Activity activityC0 = BBSShareDialogManager.this.c0();
            if (activityC0 != null) {
                activityC0.startActivity(SendToFriendActivity.O.a(activityC0, this.f76702c, "17"));
            }
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class y1 implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f76704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76706d;

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSShareDialogManager f76707b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f76708c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f76709d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f76710e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f76711f;

            a(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3, String str4) {
                this.f76707b = bBSShareDialogManager;
                this.f76708c = str;
                this.f76709d = str2;
                this.f76710e = str3;
                this.f76711f = str4;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.BD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                BBSShareDialogManager.N(this.f76707b, this.f76708c, null, this.f76709d, this.f76710e, this.f76711f);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSShareDialogManager.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f76712b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.CD, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        y1(String str, String str2, String str3) {
            this.f76704b = str;
            this.f76705c = str2;
            this.f76706d = str3;
        }

        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, bb.c.m.AD, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(BBSShareDialogManager.this.c0());
            fVar.y("是否确认警告该用户").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a(BBSShareDialogManager.this, this.f76704b, this.f76705c, this.f76706d, str)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), b.f76712b);
            fVar.F();
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class z extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76714c;

        z(boolean z10) {
            this.f76714c = z10;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.aC, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                if (this.f76714c) {
                    LinkInfoObj linkInfoObjF0 = BBSShareDialogManager.this.f0();
                    if (linkInfoObjF0 == null) {
                        return;
                    }
                    linkInfoObjF0.setRecommendable("0");
                    return;
                }
                LinkInfoObj linkInfoObjF1 = BBSShareDialogManager.this.f0();
                if (linkInfoObjF1 == null) {
                    return;
                }
                linkInfoObjF1.setRecommendable("1");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.bC, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class z0 implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z0() {
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, bb.c.m.PC, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSShareDialogManager.g(BBSShareDialogManager.this);
            com.max.hbshare.d.n(BBSShareDialogManager.this.c0(), dialog);
        }
    }

    /* JADX INFO: compiled from: BBSShareDialogManager.kt */
    public static final class z1 extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f76717c;

        z1(LinkInfoObj linkInfoObj) {
            this.f76717c = linkInfoObj;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.DD, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (BBSShareDialogManager.this.q0()) {
                BBSLinkTreeObj result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                LinkInfoObj link = result2.getLink();
                boolean zX = com.max.hbcommon.utils.c.x(link != null ? link.getCan_modify_post_plan() : null);
                if (kotlin.jvm.internal.f0.g("27", link.getLink_tag()) || kotlin.jvm.internal.f0.g("28", link.getLink_tag())) {
                    com.max.xiaoheihe.module.bbs.utils.c.g(BBSShareDialogManager.this.c0(), BBSShareDialogManager.this.a0().a(), link, true, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE, link.getTopics(), zX);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                if (!kotlin.jvm.internal.f0.g("1", link.getIs_web()) || com.max.hbcommon.utils.c.u(link.getText())) {
                    z10 = false;
                } else {
                    String text = link.getText();
                    kotlin.jvm.internal.f0.o(text, "linkInfoObj.text");
                    if (kotlin.text.u.v2(text, Constants.ARRAY_TYPE, false, 2, null)) {
                        String text2 = link.getText();
                        kotlin.jvm.internal.f0.o(text2, "linkInfoObj.text");
                        if (kotlin.text.u.K1(text2, "]", false, 2, null)) {
                            List listB = com.max.hbutils.utils.k.b(link.getText(), BBSTextObj.class);
                            if (com.max.hbcommon.utils.c.w(listB)) {
                                z10 = false;
                            } else {
                                Object obj = listB.get(0);
                                kotlin.jvm.internal.f0.m(obj);
                                if (kotlin.jvm.internal.f0.g(((BBSTextObj) obj).getType(), LinkDraftObj.DRAFT_TYPE_HTML)) {
                                    Pattern patternE = NewLinkEditFragment.L4.e();
                                    Object obj2 = listB.get(0);
                                    kotlin.jvm.internal.f0.m(obj2);
                                    Matcher matcher = patternE.matcher(((BBSTextObj) obj2).getText());
                                    while (matcher.find()) {
                                        matcher.group(1);
                                        if (sb2.length() > 0) {
                                            sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        }
                                        sb2.append(matcher.group(1));
                                    }
                                } else {
                                    z10 = false;
                                }
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    com.max.hbutils.utils.c.f("不允许编辑");
                    return;
                }
                if (!com.max.hbcommon.utils.c.u(sb2.toString())) {
                    BBSShareDialogManager.i(BBSShareDialogManager.this, result, sb2.toString(), zX);
                    return;
                }
                LinkInfoObj linkInfoObj = this.f76717c;
                if (linkInfoObj == null || !kotlin.jvm.internal.f0.g("1", linkInfoObj.getIs_article())) {
                    Activity activityC0 = BBSShareDialogManager.this.c0();
                    kotlin.jvm.internal.f0.m(activityC0);
                    com.max.xiaoheihe.base.router.b.h(activityC0, result, null).C(6).W(PostTabActivity.G2, zX).A();
                } else {
                    Activity activityC1 = BBSShareDialogManager.this.c0();
                    kotlin.jvm.internal.f0.m(activityC1);
                    com.max.xiaoheihe.base.router.b.a(activityC1, result, null).C(6).W(PostTabActivity.G2, zX).A();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.ED, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    public BBSShareDialogManager(@dl.e Activity activity, @dl.d Result<BBSLinkTreeObj> mLinkTreeResult, @dl.e String str, @dl.e UMImage uMImage, @dl.e String str2, @dl.e String str3, boolean z10, @dl.d com.max.xiaoheihe.accelworld.w iShareExtraThing) {
        kotlin.jvm.internal.f0.p(mLinkTreeResult, "mLinkTreeResult");
        kotlin.jvm.internal.f0.p(iShareExtraThing, "iShareExtraThing");
        this.f76507a = activity;
        this.f76508b = mLinkTreeResult;
        this.f76509c = str;
        this.f76510d = uMImage;
        this.f76511e = str2;
        this.f76512f = str3;
        this.f76513g = z10;
        this.f76514h = iShareExtraThing;
        this.f76515i = new WeakReference<>(activity);
        this.f76516j = new ArrayList();
    }

    public static final /* synthetic */ void A(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.JA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.K0(str, str2, str3);
    }

    private final void A0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Oz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t()));
    }

    public static final /* synthetic */ void B(BBSShareDialogManager bBSShareDialogManager, String str, LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, linkInfoObj}, null, changeQuickRedirect, true, bb.c.m.bA, new Class[]{BBSShareDialogManager.class, String.class, LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.N0(str, linkInfoObj);
    }

    private final void B0(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.jz, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjF0 = f0();
        io.reactivex.disposables.a aVarA = this.f76514h.a();
        if (aVarA != null) {
            aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N2(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new u(linkInfoObjF0, str2)));
        }
    }

    public static final /* synthetic */ void C(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.FA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.O0();
    }

    private final void C0(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.lz, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(c0()).y("确定设置曝光量 " + str2 + " ?").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new v(str2, str)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), w.f76687b).F();
    }

    public static final /* synthetic */ void D(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.dA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.P0(str, str2, str3);
    }

    private final void D0(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.vz, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(c0()).y("确定设置曝光系数 " + str2 + " ?").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new x(str2, str)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), y.f76699b).F();
    }

    public static final /* synthetic */ void E(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.nA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.Q0();
    }

    private final void E0(String str, boolean z10) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.wz, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e1(str, z10 ? "1" : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new z(z10)));
    }

    public static final /* synthetic */ void F(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.mA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.R0();
    }

    public static final /* synthetic */ void G(BBSShareDialogManager bBSShareDialogManager, List list) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, list}, null, changeQuickRedirect, true, bb.c.m.EA, new Class[]{BBSShareDialogManager.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.U0(list);
    }

    public static final /* synthetic */ void H(BBSShareDialogManager bBSShareDialogManager, LinkInfoObj linkInfoObj, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, linkInfoObj, aVar}, null, changeQuickRedirect, true, bb.c.m.zA, new Class[]{BBSShareDialogManager.class, LinkInfoObj.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.V0(linkInfoObj, aVar);
    }

    public static final /* synthetic */ void I(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.eA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.W0(str, str2, str3);
    }

    public static final /* synthetic */ void J(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.uA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.X0();
    }

    private final void J0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.xz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a0()));
    }

    public static final /* synthetic */ void K(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.vA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.Y0(str);
    }

    private final void K0(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.m.Iz, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (c0() == null || q0()) {
            new com.max.hbcommon.view.a.f(c0()).y(com.max.xiaoheihe.utils.d.n0(R.string.add_boutique_tips_title)).l(str3).t(R.string.confirm, new b0(str, str2)).n(R.string.cancel, c0.f76536b).F();
        }
    }

    public static final /* synthetic */ void L(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.fA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.a1(str);
    }

    public static final /* synthetic */ void M(BBSShareDialogManager bBSShareDialogManager, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2}, null, changeQuickRedirect, true, bb.c.m.LA, new Class[]{BBSShareDialogManager.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.b1(str, str2);
    }

    public static /* synthetic */ void M0(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3, UMImage uMImage, yh.a aVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3, uMImage, aVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.bz, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class, UMImage.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.L0(str, str2, str3, uMImage, (i10 & 16) != 0 ? null : aVar);
    }

    public static final /* synthetic */ void N(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, bb.c.m.IA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.d1(str, str2, str3, str4, str5);
    }

    private final void N0(String str, LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{str, linkInfoObj}, this, changeQuickRedirect, false, bb.c.m.ez, new Class[]{String.class, LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(str)) {
            BBSUserInfoObj user = linkInfoObj.getUser();
            if (kotlin.jvm.internal.f0.g(str, user != null ? user.getUserid() : null)) {
                Activity activityC0 = c0();
                if (activityC0 == null || activityC0.isFinishing()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (!kotlin.jvm.internal.f0.g(linkInfoObj.getView_limit(), "3")) {
                    KeyDescObj keyDescObj = new KeyDescObj();
                    keyDescObj.setText("设置为仅自己可见");
                    keyDescObj.setDesc("可保留内容并仅自己可见");
                    keyDescObj.setId("0");
                    arrayList.add(keyDescObj);
                }
                KeyDescObj keyDescObj2 = new KeyDescObj();
                keyDescObj2.setText("删除内容");
                keyDescObj2.setDesc("内容将被永久删除");
                keyDescObj2.setId("1");
                arrayList.add(keyDescObj2);
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(activityC0, arrayList, true);
                heyBoxPopupMenu.O(false);
                heyBoxPopupMenu.R(new l1(linkInfoObj, heyBoxPopupMenu));
                heyBoxPopupMenu.Q(HeyBoxPopupMenu.MenuItemTextSource.DATA_TEXT);
                heyBoxPopupMenu.U(true);
                heyBoxPopupMenu.P(new HeyBoxPopupMenu.e(activityC0.getColor(R.color.text_primary_1_color_day_night), 0.06f));
                heyBoxPopupMenu.T(true);
                heyBoxPopupMenu.show();
                return;
            }
        }
        com.max.xiaoheihe.view.l.D(c0(), "", com.max.xiaoheihe.utils.d.n0(R.string.del_post), com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new k1(linkInfoObj));
    }

    private final void O(String str, String str2, String str3) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.m.Hz, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n1(str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str3, str, str2)));
    }

    private final void O0() {
        Activity activityC0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uz, new Class[0], Void.TYPE).isSupported || !q0() || (activityC0 = c0()) == null) {
            return;
        }
        EditText editText = new EditText(activityC0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int iF = ViewUtils.f(activityC0, 10.0f);
        layoutParams.setMargins(0, iF, 0, iF * 2);
        editText.setLayoutParams(layoutParams);
        editText.setPadding(iF, iF, iF, iF);
        editText.setGravity(17);
        editText.setInputType(8194);
        editText.setBackgroundDrawable(com.max.xiaoheihe.utils.d.X(R.drawable.bg_dialog_edit));
        editText.setTextSize(0, activityC0.getResources().getDimensionPixelSize(R.dimen.text_size_16));
        editText.setTextColor(activityC0.getResources().getColor(R.color.text_primary_1_color));
        new com.max.hbcommon.view.a.f(activityC0).y("输入自定义曝光系数").i(editText).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new m1(editText, this)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), n1.f76614b).F();
    }

    private final void P(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Lz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l4(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void P0(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.m.Rz, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n nVarV3 = com.max.xiaoheihe.module.bbs.n.V3(str, new o1(str, str2, str3));
        FragmentManager fragmentManagerO = this.f76514h.o();
        if (fragmentManagerO != null) {
            nVarV3.show(fragmentManagerO, "ForbidReasonFragment");
        }
    }

    private final void Q(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.m.Yz, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(list.get(i10));
        }
        io.reactivex.disposables.a aVarA = this.f76514h.a();
        if (aVarA != null) {
            aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().db(e0(), sb2.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
        }
    }

    private final void Q0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.zz, new Class[0], Void.TYPE).isSupported || c0() == null) {
            return;
        }
        Activity activityC0 = c0();
        kotlin.jvm.internal.f0.m(activityC0);
        View viewInflate = activityC0.getLayoutInflater().inflate(R.layout.layout_forbid_user, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = viewInflate.findViewById(R.id.rg_forbid_time);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.RadioGroup");
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_forbid_time_remained);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = viewInflate.findViewById(R.id.et_forbid_comment);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) viewFindViewById3;
        ((RadioGroup) viewFindViewById).setVisibility(8);
        ((TextView) viewFindViewById2).setVisibility(8);
        editText.setHint(com.max.xiaoheihe.utils.d.n0(R.string.modify_forbid_comment_hint));
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(c0());
        fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.modify_forbid_comment)).i(viewInflate).u(com.max.xiaoheihe.utils.d.n0(R.string.edit), new p1(editText, this)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), q1.f76642b);
        fVar.F();
    }

    private final void R(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Pz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void R0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.yz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n nVarV3 = com.max.xiaoheihe.module.bbs.n.V3(null, new r1());
        FragmentManager fragmentManagerO = this.f76514h.o();
        if (fragmentManagerO != null) {
            nVarV3.show(fragmentManagerO, "ForbidReasonFragment");
        }
    }

    private final void S(String str, String str2, String str3) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.m.Nz, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r3(this.f76512f, str, str2, str3, l0()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(str3)));
    }

    private final void S0(BBSFollowedMomentObj bBSFollowedMomentObj, String str) {
        if (PatchProxy.proxy(new Object[]{bBSFollowedMomentObj, str}, this, changeQuickRedirect, false, bb.c.m.Fz, new Class[]{BBSFollowedMomentObj.class, String.class}, Void.TYPE).isSupported || bBSFollowedMomentObj == null) {
            return;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d(c0()));
        shareImageDialogFragmentX4.D4(new t1(str, bBSFollowedMomentObj, this));
        shareImageDialogFragmentX4.S4(new s1());
        FragmentManager fragmentManagerO = this.f76514h.o();
        if (fragmentManagerO != null) {
            shareImageDialogFragmentX4.show(fragmentManagerO, "shareImageDialogFragment");
        }
    }

    private final void T(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, bb.c.m.Sz, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n6(str, str2, str3, str4, str5, str6, str7).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private final void T0(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.Bz, new Class[]{String.class, String.class}, Void.TYPE).isSupported && (c0() instanceof com.max.hbcommon.base.f)) {
            ComponentCallbacks2 componentCallbacks2C0 = c0();
            kotlin.jvm.internal.f0.n(componentCallbacks2C0, "null cannot be cast to non-null type com.max.hbcommon.base.BaseView");
            ShareViewUtil.h((com.max.hbcommon.base.f) componentCallbacks2C0, str, str2, null);
        }
    }

    private final void U(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.rz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().W5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private final void U0(List<? extends KeyDescObj> list) {
        Activity activityC0;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.m.Xz, new Class[]{List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list) || (activityC0 = c0()) == null) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(c0());
        View viewInflate = activityC0.getLayoutInflater().inflate(R.layout.dialog_change_topic_tag, (ViewGroup) null);
        kotlin.jvm.internal.f0.n(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        kotlin.jvm.internal.f0.m(list);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            KeyDescObj keyDescObj = list.get(i10);
            kotlin.jvm.internal.f0.m(keyDescObj);
            String id2 = keyDescObj.getId();
            String name = keyDescObj.getName();
            CheckBox checkBox = new CheckBox(c0());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(c0(), 24.0f));
            if (i10 == list.size() - 1) {
                layoutParams.setMargins(ViewUtils.f(c0(), 10.0f), 0, ViewUtils.f(c0(), 10.0f), ViewUtils.f(c0(), 10.0f));
            } else {
                layoutParams.setMargins(ViewUtils.f(c0(), 10.0f), 0, 0, ViewUtils.f(c0(), 10.0f));
            }
            layoutParams.gravity = 16;
            checkBox.setLayoutParams(layoutParams);
            checkBox.setGravity(17);
            checkBox.setPadding(ViewUtils.f(c0(), 6.0f), 0, ViewUtils.f(c0(), 6.0f), 0);
            checkBox.setMinWidth(ViewUtils.f(c0(), 60.0f));
            checkBox.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)}));
            checkBox.setTextSize(1, 12.0f);
            checkBox.setBackgroundResource(R.drawable.reference_interactive_bg_2dp);
            checkBox.setText(name);
            checkBox.setButtonDrawable((Drawable) null);
            checkBox.setOnCheckedChangeListener(new u1(id2));
            viewGroup.addView(checkBox);
        }
        fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.choose_type)).i(viewGroup).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new v1()).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), w1.f76690b);
        fVar.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final void V() {
        Activity activityC0;
        String strE0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Kz, new Class[0], Void.TYPE).isSupported || (activityC0 = c0()) == 0 || (strE0 = e0()) == null) {
            return;
        }
        Map<String, String> mapL0 = l0();
        String str = this.f76512f;
        if (str != null) {
            mapL0.put("h_src", str);
        }
        BBSKtUtils.f83254a.h(activityC0, strE0, mapL0, (androidx.lifecycle.y) activityC0, new yh.l<Boolean, kotlin.b2>() { // from class: com.max.xiaoheihe.accelworld.BBSShareDialogManager$getCollectionFolders$1$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(boolean z10) {
                if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.kB, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                    this.f76564b.a0().n("1");
                    this.f76564b.a0().q("syncWeb('favor')");
                    this.f76564b.a0().r("1");
                }
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.m.lB, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool.booleanValue());
                return b2.f124493a;
            }
        });
    }

    private final void V0(LinkInfoObj linkInfoObj, yh.a<kotlin.b2> aVar) {
        Activity activityC0;
        if (PatchProxy.proxy(new Object[]{linkInfoObj, aVar}, this, changeQuickRedirect, false, bb.c.m.hz, new Class[]{LinkInfoObj.class, yh.a.class}, Void.TYPE).isSupported || (activityC0 = c0()) == null || activityC0.isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setText("所有人可见");
        keyDescObj.setId("1");
        keyDescObj.setChecked(kotlin.jvm.internal.f0.g("1", linkInfoObj.getView_limit()) || kotlin.jvm.internal.f0.g("0", linkInfoObj.getView_limit()));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setText("仅粉丝可见");
        keyDescObj2.setId("2");
        keyDescObj2.setChecked(kotlin.jvm.internal.f0.g("2", linkInfoObj.getView_limit()));
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setText("仅自己可见");
        keyDescObj3.setId("3");
        keyDescObj3.setChecked(kotlin.jvm.internal.f0.g("3", linkInfoObj.getView_limit()));
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(activityC0, arrayList, true);
        heyBoxPopupMenu.O(false);
        heyBoxPopupMenu.R(new x1(linkInfoObj, aVar, heyBoxPopupMenu));
        heyBoxPopupMenu.Q(HeyBoxPopupMenu.MenuItemTextSource.DATA_TEXT);
        heyBoxPopupMenu.P(new HeyBoxPopupMenu.e(activityC0.getColor(R.color.text_primary_1_color_day_night), 0.06f));
        heyBoxPopupMenu.T(true);
        heyBoxPopupMenu.show();
    }

    private final void W0(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.m.Gz, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n nVarV3 = com.max.xiaoheihe.module.bbs.n.V3(null, new y1(str, str2, str3));
        FragmentManager fragmentManagerO = this.f76514h.o();
        if (fragmentManagerO != null) {
            nVarV3.show(fragmentManagerO, "WarningReasonFragment");
        }
    }

    private final void X() {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.kz, new Class[0], Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        LinkInfoObj linkInfoObjF0 = f0();
        aVarA.c((io.reactivex.disposables.b) eVarA.c4(linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private final void X0() {
        Activity activityC0;
        BBSLinkTreeObj result;
        GameObj game_info;
        BBSLinkTreeObj result2;
        GameCommentsObj game_comment_share_info;
        BBSLinkTreeObj result3;
        GameObj game_info2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.dz, new Class[0], Void.TYPE).isSupported || (activityC0 = c0()) == null) {
            return;
        }
        Result<BBSLinkTreeObj> result4 = this.f76508b;
        String game_type = null;
        String appid = (result4 == null || (result3 = result4.getResult()) == null || (game_info2 = result3.getGame_info()) == null) ? null : game_info2.getAppid();
        Result<BBSLinkTreeObj> result5 = this.f76508b;
        int iQ = com.max.hbutils.utils.n.q((result5 == null || (result2 = result5.getResult()) == null || (game_comment_share_info = result2.getGame_comment_share_info()) == null) ? null : game_comment_share_info.getScore());
        Result<BBSLinkTreeObj> result6 = this.f76508b;
        if (result6 != null && (result = result6.getResult()) != null && (game_info = result.getGame_info()) != null) {
            game_type = game_info.getGame_type();
        }
        com.max.xiaoheihe.base.router.b.k(activityC0, appid, iQ, game_type, false).C(2).A();
    }

    private final void Y() {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.tz, new Class[0], Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        LinkInfoObj linkInfoObjF0 = f0();
        aVarA.c((io.reactivex.disposables.b) eVarA.G5(linkInfoObjF0 != null ? linkInfoObjF0.getLinkid() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private final void Y0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.pz, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjF0 = f0();
        io.reactivex.disposables.a aVarA = this.f76514h.a();
        if (aVarA != null) {
            aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().D0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new z1(linkInfoObjF0)));
        }
    }

    private final void Z(Result<BBSLinkTreeObj> result, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{result, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.qz, new Class[]{Result.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjF0 = f0();
        io.reactivex.disposables.a aVarA = this.f76514h.a();
        if (aVarA != null) {
            aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O2(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k(linkInfoObjF0, result, z10)));
        }
    }

    private final void Z0(String str, String str2, String str3, UMImage uMImage) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, uMImage}, this, changeQuickRedirect, false, bb.c.m.Ez, new Class[]{String.class, String.class, String.class, UMImage.class}, Void.TYPE).isSupported) {
            return;
        }
        Boolean boolF = com.max.xiaoheihe.utils.j.f(this.f76509c);
        kotlin.jvm.internal.f0.o(boolF, "checkCanForward(mLinkTag)");
        if (boolF.booleanValue()) {
            com.max.xiaoheihe.utils.j.p(c0(), this.f76509c, e0(), f0());
        } else {
            M0(this, str, str2, str3, uMImage, null, 16, null);
        }
    }

    public static final /* synthetic */ void a(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.jA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.O(str, str2, str3);
    }

    private final void a1(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Uz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a2()));
    }

    public static final /* synthetic */ void b(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.iA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.P(str);
    }

    private final void b0() {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.mz, new Class[0], Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private final void b1(String str, String str2) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.fz, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X9(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b2(str2)));
    }

    public static final /* synthetic */ void c(BBSShareDialogManager bBSShareDialogManager, List list) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, list}, null, changeQuickRedirect, true, bb.c.m.MA, new Class[]{BBSShareDialogManager.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.Q(list);
    }

    static /* synthetic */ void c1(BBSShareDialogManager bBSShareDialogManager, String str, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.gz, new Class[]{BBSShareDialogManager.class, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str2 = "3";
        }
        bBSShareDialogManager.b1(str, str2);
    }

    public static final /* synthetic */ void d(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.AA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.R(str);
    }

    private final void d1(String str, String str2, String str3, String str4, String str5) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, bb.c.m.Tz, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().B(str, str2, str3, str4, str5).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c2()));
    }

    public static final /* synthetic */ void e(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, bb.c.m.KA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.T(str, str2, str3, str4, str5, str6, str7);
    }

    public static final /* synthetic */ void f(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.rA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.U(str);
    }

    public static final /* synthetic */ void g(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.yA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.X();
    }

    public static final /* synthetic */ void h(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.xA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.Y();
    }

    public static final /* synthetic */ void i(BBSShareDialogManager bBSShareDialogManager, Result result, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, result, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.DA, new Class[]{BBSShareDialogManager.class, Result.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.Z(result, str, z10);
    }

    public static final /* synthetic */ void j(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.qA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.b0();
    }

    public static final /* synthetic */ void k(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.gA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.m0(str);
    }

    private final Map<String, String> l0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Dz, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = com.max.xiaoheihe.utils.l0.X(this.f76514h.i());
        return mapX == null ? new HashMap(16) : mapX;
    }

    public static final /* synthetic */ void m(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.pA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.o0(str);
    }

    private final void m0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Wz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    public static final /* synthetic */ void n(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.tA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.p0(str);
    }

    private final com.max.hbshare.c.b n0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Zz, new Class[]{Boolean.TYPE}, com.max.hbshare.c.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbshare.c.b) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        LinkInfoObj linkInfoObjF0 = f0();
        if (linkInfoObjF0 != null) {
            jsonObject.addProperty("link_id", linkInfoObjF0.getLinkid());
        }
        String str = this.f76512f;
        if (str != null) {
            jsonObject.addProperty("h_src", str);
        }
        if (kotlin.jvm.internal.f0.g(this.f76509c, "23")) {
            return new com.max.hbshare.c.b("wiki", new a(z10), jsonObject);
        }
        LinkInfoObj linkInfoObjF1 = f0();
        if (kotlin.jvm.internal.f0.g("1", linkInfoObjF1 != null ? linkInfoObjF1.getIs_article() : null)) {
            return new com.max.hbshare.c.b(z10 ? com.max.hbshare.c.f72549e : "news", new a(z10), jsonObject);
        }
        return new com.max.hbshare.c.b(z10 ? com.max.hbshare.c.f72547c : "link", new a(z10), jsonObject);
    }

    public static final /* synthetic */ void o(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.oA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.t0(str);
    }

    private final void o0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.sz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G(str, "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    public static final /* synthetic */ void p(BBSShareDialogManager bBSShareDialogManager, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2}, null, changeQuickRedirect, true, bb.c.m.CA, new Class[]{BBSShareDialogManager.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.u0(str, str2);
    }

    private final void p0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.nz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w2(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    public static final /* synthetic */ void q(BBSShareDialogManager bBSShareDialogManager, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.HA, new Class[]{BBSShareDialogManager.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.v0(str, str2, str3);
    }

    public static final /* synthetic */ void r(BBSShareDialogManager bBSShareDialogManager) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager}, null, changeQuickRedirect, true, bb.c.m.aA, new Class[]{BBSShareDialogManager.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.w0();
    }

    public static final /* synthetic */ void s(BBSShareDialogManager bBSShareDialogManager, String str, boolean z10, String str2) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, new Byte(z10 ? (byte) 1 : (byte) 0), str2}, null, changeQuickRedirect, true, bb.c.m.sA, new Class[]{BBSShareDialogManager.class, String.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.y0(str, z10, str2);
    }

    private final void s0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Cz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().F(this.f76512f, e0(), l0()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
    }

    public static final /* synthetic */ void t(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.cA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.z0(str);
    }

    private final void t0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Mz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().E3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p()));
    }

    public static final /* synthetic */ void u(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.hA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.A0(str);
    }

    private final void u0(String str, String str2) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.oz, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Xb(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q()));
    }

    public static final /* synthetic */ void v(BBSShareDialogManager bBSShareDialogManager, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2}, null, changeQuickRedirect, true, bb.c.m.wA, new Class[]{BBSShareDialogManager.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.B0(str, str2);
    }

    private final void v0(String str, String str2, String str3) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.m.Az, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().qb(str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q()));
    }

    public static final /* synthetic */ void w(BBSShareDialogManager bBSShareDialogManager, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2}, null, changeQuickRedirect, true, bb.c.m.BA, new Class[]{BBSShareDialogManager.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.C0(str, str2);
    }

    private final void w0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Jz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjF0 = f0();
        if (!com.max.xiaoheihe.utils.i0.e(c0()) || linkInfoObjF0 == null) {
            return;
        }
        if (!kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getIs_favour())) {
            V();
            return;
        }
        com.max.xiaoheihe.accelworld.w wVar = this.f76514h;
        if (wVar != null) {
            wVar.n("2");
        }
        S(linkInfoObjF0.getLinkid(), null, "2");
        com.max.xiaoheihe.accelworld.w wVar2 = this.f76514h;
        if (wVar2 != null) {
            wVar2.q("syncWeb('favor')");
        }
    }

    public static final /* synthetic */ void x(BBSShareDialogManager bBSShareDialogManager, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, str2}, null, changeQuickRedirect, true, bb.c.m.GA, new Class[]{BBSShareDialogManager.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.D0(str, str2);
    }

    public static final /* synthetic */ void y(BBSShareDialogManager bBSShareDialogManager, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.kA, new Class[]{BBSShareDialogManager.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.E0(str, z10);
    }

    private final void y0(String str, boolean z10, String str2) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), str2}, this, changeQuickRedirect, false, bb.c.m.Vz, new Class[]{String.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G1(str, !z10 ? 1 : 0, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r(z10, str2)));
    }

    public static final /* synthetic */ void z(BBSShareDialogManager bBSShareDialogManager, String str) {
        if (PatchProxy.proxy(new Object[]{bBSShareDialogManager, str}, null, changeQuickRedirect, true, bb.c.m.lA, new Class[]{BBSShareDialogManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSShareDialogManager.J0(str);
    }

    private final void z0(String str) {
        io.reactivex.disposables.a aVarA;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Qz, new Class[]{String.class}, Void.TYPE).isSupported || (aVarA = this.f76514h.a()) == null) {
            return;
        }
        aVarA.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s()));
    }

    public final void F0(@dl.d Result<BBSLinkTreeObj> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Vy, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(result, "<set-?>");
        this.f76508b = result;
    }

    public final void G0(boolean z10) {
        this.f76513g = z10;
    }

    public final void H0(@dl.e String str) {
        this.f76511e = str;
    }

    public final void I0(@dl.e UMImage uMImage) {
        this.f76510d = uMImage;
    }

    public final void L0(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e UMImage uMImage, @dl.e yh.a<kotlin.b2> aVar) {
        GameObj game_info;
        Bundle bundle;
        GameObj game_info2;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, uMImage, aVar}, this, changeQuickRedirect, false, bb.c.m.az, new Class[]{String.class, String.class, String.class, UMImage.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjF0 = f0();
        if (c0() == null || linkInfoObjF0 == null) {
            return;
        }
        BBSLinkTreeObj result = this.f76508b.getResult();
        if ((result != null ? result.getLink() : null) == null) {
            return;
        }
        boolean zG = kotlin.jvm.internal.f0.g("1", com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_basic_permission());
        boolean zG2 = kotlin.jvm.internal.f0.g("1", com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_advance_permission());
        boolean zG3 = kotlin.jvm.internal.f0.g("1", com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_super_permission());
        boolean zG4 = kotlin.jvm.internal.f0.g("1", com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_root_permission());
        String userid = com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUserid();
        boolean zX = com.max.hbcommon.utils.c.x(linkInfoObjF0.getCan_edit());
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(com.max.xiaoheihe.utils.d.n0(R.string.forward_timeline));
        postOptionObj.setImage_resource_id(R.drawable.bbs_sharebutton_forward_46x46);
        postOptionObj.setClick_listener(new n0(linkInfoObjF0, this));
        PostOptionObj postOptionObj2 = new PostOptionObj();
        postOptionObj2.setName(com.max.xiaoheihe.utils.d.n0(R.string.private_letter));
        postOptionObj2.setImage_resource_id(R.drawable.bbs_sharebutton_private_chat_46x46);
        postOptionObj2.setClick_listener(new y0(linkInfoObjF0, str3));
        PostOptionObj postOptionObj3 = new PostOptionObj();
        postOptionObj3.setName(com.max.xiaoheihe.utils.d.n0(R.string.share));
        postOptionObj3.setImage_resource_id(R.drawable.bbs_sharebutton_forward_46x46);
        postOptionObj3.setClick_listener(new c1());
        PostOptionObj postOptionObj4 = new PostOptionObj();
        postOptionObj4.setImage_resource_id(R.drawable.bbs_sharebutton_collect_46x46);
        if (kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getIs_favour())) {
            postOptionObj4.setName(com.max.xiaoheihe.utils.d.n0(R.string.collected));
            postOptionObj4.setChecked("1");
        } else {
            postOptionObj4.setName(com.max.xiaoheihe.utils.d.n0(R.string.favour));
            postOptionObj4.setChecked("0");
        }
        postOptionObj4.setClick_listener(new d1(linkInfoObjF0, this));
        PostOptionObj postOptionObj5 = new PostOptionObj();
        postOptionObj5.setImage_resource_id(R.drawable.bbs_sharebutton_dislike_46x46);
        postOptionObj5.setName("内容反馈");
        postOptionObj5.setClick_listener(new e1(linkInfoObjF0));
        PostOptionObj postOptionObj6 = new PostOptionObj();
        postOptionObj6.setImage_resource_id(R.drawable.bbs_sharebutton_report_46x46);
        if (this.f76513g) {
            postOptionObj6.setName(com.max.xiaoheihe.utils.d.n0(R.string.reported));
            postOptionObj6.setChecked("1");
        } else {
            postOptionObj6.setName(com.max.xiaoheihe.utils.d.n0(R.string.report));
            postOptionObj6.setChecked("0");
        }
        postOptionObj6.setClick_listener(new f1(linkInfoObjF0));
        PostOptionObj postOptionObj7 = new PostOptionObj();
        postOptionObj7.setName(com.max.xiaoheihe.utils.d.n0(R.string.delete));
        postOptionObj7.setImage_resource_id(R.drawable.bbs_sharebutton_delete_46x46);
        postOptionObj7.setClick_listener(new g1(userid, linkInfoObjF0));
        PostOptionObj postOptionObj8 = new PostOptionObj();
        postOptionObj8.setName(com.max.xiaoheihe.utils.d.n0(R.string.put_post_to_bottom));
        postOptionObj8.setImage_resource_id(R.drawable.bbs_sharebutton_shentie_46x46);
        postOptionObj8.setClick_listener(new h1(linkInfoObjF0));
        PostOptionObj postOptionObj9 = new PostOptionObj();
        postOptionObj9.setName(com.max.xiaoheihe.utils.d.n0(R.string.bbs_mute));
        postOptionObj9.setImage_resource_id(R.drawable.bbs_sharebutton_ban_46x46);
        postOptionObj9.setClick_listener(new i1(linkInfoObjF0));
        PostOptionObj postOptionObj10 = new PostOptionObj();
        postOptionObj10.setName(com.max.xiaoheihe.utils.d.n0(R.string.bbs_warning));
        postOptionObj10.setImage_resource_id(R.drawable.bbs_sharebutton_warn_46x46);
        postOptionObj10.setClick_listener(new d0(linkInfoObjF0));
        PostOptionObj postOptionObj11 = new PostOptionObj();
        postOptionObj11.setName(com.max.xiaoheihe.utils.d.n0(R.string.cancel_forbid));
        postOptionObj11.setImage_resource_id(R.drawable.bbs_sharebutton_lift_the_ban_46x46);
        postOptionObj11.setClick_listener(new e0(linkInfoObjF0));
        PostOptionObj postOptionObj12 = new PostOptionObj();
        postOptionObj12.setName(com.max.xiaoheihe.utils.d.n0(R.string.bbs_move));
        postOptionObj12.setImage_resource_id(R.drawable.bbs_sharebutton_carry_46x46);
        postOptionObj12.setClick_listener(new f0(linkInfoObjF0, this));
        PostOptionObj postOptionObj13 = new PostOptionObj();
        postOptionObj13.setName(com.max.xiaoheihe.utils.d.n0(R.string.type));
        postOptionObj13.setImage_resource_id(R.drawable.bbs_sharebutton_sub_channel_46x46);
        postOptionObj13.setClick_listener(new g0(linkInfoObjF0, this));
        PostOptionObj postOptionObj14 = new PostOptionObj();
        postOptionObj14.setName(com.max.xiaoheihe.utils.d.n0(R.string.push));
        postOptionObj14.setImage_resource_id(R.drawable.bbs_sharebutton_push_46x46);
        postOptionObj14.setClick_listener(new h0(linkInfoObjF0));
        PostOptionObj postOptionObj15 = new PostOptionObj();
        postOptionObj15.setName(com.max.xiaoheihe.utils.d.n0(R.string.boutique_apply));
        postOptionObj15.setImage_resource_id(R.drawable.bbs_sharebutton_boutique_46x46);
        postOptionObj15.setClick_listener(new i0(linkInfoObjF0));
        PostOptionObj postOptionObj16 = new PostOptionObj();
        postOptionObj16.setName(com.max.xiaoheihe.utils.d.n0(R.string.add_boutique));
        postOptionObj16.setImage_resource_id(R.drawable.bbs_sharebutton_crown_46x46);
        postOptionObj16.setClick_listener(new j0(linkInfoObjF0));
        PostOptionObj postOptionObj17 = new PostOptionObj();
        boolean zG5 = kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getRecommendable());
        if (zG5) {
            postOptionObj17.setName("下线社区推荐");
            postOptionObj17.setImage_resource_id(R.drawable.bbs_sharebutton_remove_recommendations_46x46);
        } else {
            postOptionObj17.setName("上线社区推荐");
            postOptionObj17.setImage_resource_id(R.drawable.bbs_sharebutton_add_recommendation_46x46);
        }
        postOptionObj17.setClick_listener(new k0(linkInfoObjF0, zG5));
        PostOptionObj postOptionObj18 = new PostOptionObj();
        postOptionObj18.setName(com.max.xiaoheihe.utils.d.n0(R.string.screen));
        postOptionObj18.setImage_resource_id(R.drawable.bbs_sharebutton_ban_46x46);
        postOptionObj18.setClick_listener(new l0(linkInfoObjF0, this));
        PostOptionObj postOptionObj19 = new PostOptionObj();
        postOptionObj19.setName(com.max.xiaoheihe.utils.d.n0(R.string.modify_forbid_reason));
        postOptionObj19.setImage_resource_id(R.drawable.bbs_sharebutton_edit_tie_46x46);
        postOptionObj19.setClick_listener(new m0());
        PostOptionObj postOptionObj20 = new PostOptionObj();
        postOptionObj20.setName(com.max.xiaoheihe.utils.d.n0(R.string.modify_forbid_comment));
        postOptionObj20.setImage_resource_id(R.drawable.bbs_sharebutton_edit_tie_46x46);
        postOptionObj20.setClick_listener(new o0());
        PostOptionObj postOptionObj21 = new PostOptionObj();
        postOptionObj21.setName(com.max.xiaoheihe.utils.d.n0(R.string.link_unreport));
        postOptionObj21.setImage_resource_id(R.drawable.bbs_sharebutton_remove_report_46x46);
        postOptionObj21.setClick_listener(new p0(linkInfoObjF0));
        PostOptionObj postOptionObj22 = new PostOptionObj();
        postOptionObj22.setName("加头条值");
        postOptionObj22.setImage_resource_id(R.drawable.bbs_sharebutton_headlines_46x46);
        postOptionObj22.setClick_listener(new q0(linkInfoObjF0));
        PostOptionObj postOptionObj23 = new PostOptionObj();
        postOptionObj23.setName("打标签");
        postOptionObj23.setImage_resource_id(R.drawable.bbs_sharebutton_label_46x46);
        postOptionObj23.setClick_listener(new r0());
        PostOptionObj postOptionObj24 = new PostOptionObj();
        postOptionObj24.setName("添加子频道");
        postOptionObj24.setImage_resource_id(R.drawable.bbs_sharebutton_sub_channel_46x46);
        postOptionObj24.setClick_listener(new s0(linkInfoObjF0, this));
        PostOptionObj postOptionObj25 = new PostOptionObj();
        boolean zG6 = kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getNews_show());
        if (zG6) {
            postOptionObj25.setName(com.max.xiaoheihe.utils.d.n0(R.string.recall_hot_news));
            postOptionObj25.setImage_resource_id(R.drawable.bbs_sharebutton_offline_46x46);
        } else {
            postOptionObj25.setName(com.max.xiaoheihe.utils.d.n0(R.string.publish_hot_news));
            postOptionObj25.setImage_resource_id(R.drawable.bbs_sharebutton_online_46x46);
        }
        postOptionObj25.setClick_listener(new t0(zG6));
        PostOptionObj postOptionObj26 = new PostOptionObj();
        postOptionObj26.setName(com.max.xiaoheihe.utils.d.n0(R.string.hot_post_recall));
        postOptionObj26.setImage_resource_id(R.drawable.bbs_sharebutton_remove_hot_list_46x46);
        postOptionObj26.setClick_listener(new u0(linkInfoObjF0));
        PostOptionObj postOptionObj27 = new PostOptionObj();
        postOptionObj27.setName("编辑");
        postOptionObj27.setImage_resource_id(R.drawable.bbs_sharebutton_edit_tie_46x46);
        postOptionObj27.setClick_listener(new v0(linkInfoObjF0));
        PostOptionObj postOptionObj28 = new PostOptionObj();
        postOptionObj28.setName(com.max.xiaoheihe.utils.d.n0(kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getDisable_comment()) ? R.string.enable_comment : R.string.disable_comment));
        postOptionObj28.setImage_resource_id(kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getDisable_comment()) ? R.drawable.bbs_sharebutton_allow_comments_46x46 : R.drawable.bbs_sharebutton_disable_comments_46x46);
        postOptionObj28.setClick_listener(new w0(linkInfoObjF0));
        PostOptionObj postOptionObj29 = new PostOptionObj();
        postOptionObj29.setName("曝光分级");
        postOptionObj29.setImage_resource_id(R.drawable.bbs_sharebutton_home_page_exposure_46x46);
        postOptionObj29.setClick_listener(new x0());
        PostOptionObj postOptionObj30 = new PostOptionObj();
        postOptionObj30.setName("手动曝光");
        postOptionObj30.setImage_resource_id(R.drawable.bbs_sharebutton_community_exposure_46x46);
        postOptionObj30.setClick_listener(new z0());
        PostOptionObj postOptionObj31 = new PostOptionObj();
        postOptionObj31.setName(com.max.xiaoheihe.utils.d.n0(R.string.visit_permission_setting));
        postOptionObj31.setImage_resource_id(R.drawable.bbs_sharebutton_permission_setting_46x46);
        postOptionObj31.setClick_listener(new a1(linkInfoObjF0, aVar));
        PostOptionObj postOptionObj32 = new PostOptionObj();
        String is_top_link = linkInfoObjF0.getIs_top_link();
        boolean zX2 = com.max.hbcommon.utils.c.x(is_top_link);
        if (zX2) {
            postOptionObj32.setName(com.max.xiaoheihe.utils.d.n0(R.string.cancel_top_comment));
            postOptionObj32.setImage_resource_id(R.drawable.bbs_sharebutton_cancel_top_46x46);
        } else {
            postOptionObj32.setName(com.max.xiaoheihe.utils.d.n0(R.string.post_stick_tag));
            postOptionObj32.setImage_resource_id(R.drawable.bbs_sharebutton_top_46x46);
        }
        postOptionObj32.setClick_listener(new j1(zX2, linkInfoObjF0, this, is_top_link));
        Boolean boolF = com.max.xiaoheihe.utils.j.f(this.f76509c);
        kotlin.jvm.internal.f0.o(boolF, "checkCanForward(mLinkTag)");
        if (boolF.booleanValue()) {
            arrayList.add(postOptionObj);
        }
        if (!ad.a.a(ad.a.f1219z, false)) {
            arrayList.add(postOptionObj2);
        }
        if (!com.max.hbcommon.utils.c.u(userid) && linkInfoObjF0.getUser() != null && kotlin.jvm.internal.f0.g(userid, linkInfoObjF0.getUser().getUserid())) {
            if (r0()) {
                arrayList.add(postOptionObj3);
                if (zX) {
                    BBSLinkTreeObj result2 = this.f76508b.getResult();
                    if (!com.max.hbcommon.utils.c.u((result2 == null || (game_info2 = result2.getGame_info()) == null) ? null : game_info2.getAppid())) {
                        arrayList.add(postOptionObj27);
                    }
                }
                arrayList.add(postOptionObj31);
                arrayList.add(postOptionObj7);
            } else if (!kotlin.jvm.internal.f0.g("20", this.f76509c) && (linkInfoObjF0.getRelated_status() == null || !kotlin.jvm.internal.f0.g("roll_room", linkInfoObjF0.getRelated_status().getContent_type()))) {
                if (!zG2 && zX) {
                    arrayList.add(postOptionObj27);
                }
                arrayList.add(postOptionObj31);
                arrayList.add(postOptionObj4);
                arrayList.add(postOptionObj7);
            }
            if (com.max.hbcommon.utils.c.x(linkInfoObjF0.getTop_link_status())) {
                arrayList.add(postOptionObj32);
            }
        } else if (r0()) {
            arrayList.add(postOptionObj3);
            if (zX) {
                BBSLinkTreeObj result3 = this.f76508b.getResult();
                if (!com.max.hbcommon.utils.c.u((result3 == null || (game_info = result3.getGame_info()) == null) ? null : game_info.getAppid())) {
                    arrayList.add(postOptionObj27);
                }
            }
            arrayList.add(postOptionObj6);
        } else if (!kotlin.jvm.internal.f0.g("20", this.f76509c) && (linkInfoObjF0.getRelated_status() == null || !kotlin.jvm.internal.f0.g("roll_room", linkInfoObjF0.getRelated_status().getContent_type()))) {
            arrayList.add(postOptionObj4);
            arrayList.add(postOptionObj5);
            arrayList.add(postOptionObj6);
            if (!zG2 && zX) {
                arrayList.add(postOptionObj27);
            }
        }
        if (r0()) {
            if (zG) {
                if (!arrayList.contains(postOptionObj7)) {
                    arrayList.add(postOptionObj7);
                }
                arrayList.add(postOptionObj8);
                arrayList.add(postOptionObj9);
                arrayList.add(postOptionObj10);
            }
        } else if (kotlin.jvm.internal.f0.g("20", this.f76509c)) {
            if (zG) {
                arrayList.add(postOptionObj7);
                arrayList.add(postOptionObj8);
                arrayList.add(postOptionObj19);
                arrayList.add(postOptionObj20);
            }
            if (zG3) {
                arrayList.add(postOptionObj11);
            }
        } else if (linkInfoObjF0.getRelated_status() == null || !kotlin.jvm.internal.f0.g("roll_room", linkInfoObjF0.getRelated_status().getContent_type())) {
            if (zG) {
                if (!arrayList.contains(postOptionObj7)) {
                    arrayList.add(postOptionObj7);
                }
                arrayList.add(postOptionObj8);
                arrayList.add(postOptionObj10);
                arrayList.add(postOptionObj9);
                arrayList.add(postOptionObj12);
                arrayList.add(postOptionObj21);
            }
            if (zG2) {
                arrayList.add(postOptionObj24);
                arrayList.add(postOptionObj27);
                arrayList.add(postOptionObj25);
                arrayList.add(postOptionObj17);
            }
            if (zG4) {
                if (kotlin.jvm.internal.f0.g("1", linkInfoObjF0.getIs_hot_post())) {
                    arrayList.add(postOptionObj26);
                }
                arrayList.add(postOptionObj28);
            }
            if (zG3) {
                arrayList.add(postOptionObj29);
                arrayList.add(postOptionObj30);
            }
        } else if (zG4) {
            arrayList.add(postOptionObj18);
        }
        List<PostOptionObj> link_action_list = linkInfoObjF0.getLink_action_list();
        if (link_action_list != null) {
            for (PostOptionObj action : link_action_list) {
                if (action != null) {
                    kotlin.jvm.internal.f0.o(action, "action");
                    action.setClick_listener(new b1(action));
                    arrayList.add(action);
                }
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        if (r0() || kotlin.jvm.internal.f0.g("20", this.f76509c)) {
            bundle = bundle2;
            bundle.putBoolean(com.max.hbshare.d.f72593o, true);
        } else {
            bundle = bundle2;
        }
        bundle.putSerializable(com.max.hbshare.d.f72592n, arrayList);
        com.max.hbshare.d.E(c0(), new HBShareData(false, true, str, str2, str3, bundle, uMImage, n0(false), null, null, null, null, linkInfoObjF0.getCan_not_share_tips(), bb.c.e.f31800g5, null));
    }

    @dl.e
    public final Activity W() {
        return this.f76507a;
    }

    @dl.d
    public final com.max.xiaoheihe.accelworld.w a0() {
        return this.f76514h;
    }

    @dl.e
    public final Activity c0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Wy, new Class[0], Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : this.f76515i.get();
    }

    @dl.e
    public final String d0() {
        return this.f76512f;
    }

    @dl.e
    public final String e0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Yy, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        LinkInfoObj linkInfoObjF0 = f0();
        if (linkInfoObjF0 != null) {
            return linkInfoObjF0.getLinkid();
        }
        return null;
    }

    @dl.e
    public final LinkInfoObj f0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Xy, new Class[0], LinkInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkInfoObj) patchProxyResultProxy.result;
        }
        BBSLinkTreeObj result = this.f76508b.getResult();
        if (result != null) {
            return result.getLink();
        }
        return null;
    }

    @dl.e
    public final String g0() {
        return this.f76509c;
    }

    @dl.d
    public final Result<BBSLinkTreeObj> h0() {
        return this.f76508b;
    }

    public final boolean i0() {
        return this.f76513g;
    }

    @dl.e
    public final String j0() {
        return this.f76511e;
    }

    @dl.e
    public final UMImage k0() {
        return this.f76510d;
    }

    public final boolean q0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Zy, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f76514h.isActive();
    }

    public final boolean r0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.cz, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return kotlin.jvm.internal.f0.g("3", this.f76509c) || kotlin.jvm.internal.f0.g("14", this.f76509c);
    }

    public final void x0() {
        LinkInfoObj linkInfoObjF0;
        String title;
        GameObj game_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.iz, new Class[0], Void.TYPE).isSupported || (linkInfoObjF0 = f0()) == null) {
            return;
        }
        s0();
        if ((kotlin.jvm.internal.f0.g("18", this.f76509c) || kotlin.jvm.internal.f0.g("19", this.f76509c)) && linkInfoObjF0.getRelated_status() != null) {
            BBSFollowedMomentObj related_status = linkInfoObjF0.getRelated_status();
            related_status.setUser(linkInfoObjF0.getUser());
            if (kotlin.jvm.internal.f0.g("roll_room", related_status.getContent_type())) {
                Z0(related_status.getRoom_detail().getShare_title(), related_status.getRoom_detail().getShare_desc(), related_status.getRoom_detail().getShare_url(), this.f76510d);
                return;
            } else {
                S0(related_status, related_status.getContent_type());
                return;
            }
        }
        if (r0()) {
            BBSLinkTreeObj result = this.f76508b.getResult();
            if ((result != null ? result.getGame_info() : null) != null) {
                BBSLinkTreeObj result2 = this.f76508b.getResult();
                if ((result2 != null ? result2.getGame_comment_share_info() : null) != null) {
                    BBSLinkTreeObj result3 = this.f76508b.getResult();
                    String appid = (result3 == null || (game_info = result3.getGame_info()) == null) ? null : game_info.getAppid();
                    BBSUserInfoObj user = linkInfoObjF0.getUser();
                    T0(appid, user != null ? user.getUserid() : null);
                    return;
                }
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.f0.g("21", this.f76509c) || linkInfoObjF0.getUser() == null) {
            title = linkInfoObjF0.getTitle();
            kotlin.jvm.internal.f0.o(title, "{\n                      …tle\n                    }");
        } else {
            kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
            String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.share_moments_title_format);
            kotlin.jvm.internal.f0.o(strN0, "getString(R.string.share_moments_title_format)");
            title = String.format(strN0, Arrays.copyOf(new Object[]{linkInfoObjF0.getUser().getUsername()}, 1));
            kotlin.jvm.internal.f0.o(title, "format(format, *args)");
        }
        Z0(title, this.f76511e, linkInfoObjF0.getShare_url(), this.f76510d);
    }
}
