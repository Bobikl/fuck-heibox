package com.max.xiaoheihe.module.bbs.post_edit;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.core.view.j1;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.spans.AsyncCenterImageSpan;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbmmkv.MMKVManager;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareReportData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.service.ForegroundService;
import com.max.mediaselector.utils.PictureCacheManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorkCoroutinesKt;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.ToolCardResultObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.HighLikeCommentObj;
import com.max.xiaoheihe.bean.bbs.HighLikeCommentObjKt;
import com.max.xiaoheihe.bean.bbs.HighlightInfo;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.max.xiaoheihe.bean.bbs.LinkToolCardObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostBtnObj;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostLimitObj;
import com.max.xiaoheihe.bean.bbs.PostSettingObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.bean.bbs.TopicListInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicObj;
import com.max.xiaoheihe.bean.game.AllRecommendGameCategoryObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.upload.UploadInfoObj;
import com.max.xiaoheihe.module.account.MehomefragmentV2;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.DraftListActivity;
import com.max.xiaoheihe.module.bbs.ImageModuleListActivity;
import com.max.xiaoheihe.module.bbs.UserBBSInfoFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.ActivityPostSettingViewModel;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostSettingDialogFragment;
import com.max.xiaoheihe.module.game.GameCenterActivity;
import com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.b2;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.A0)
public class PictureVideoEditPostFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.bbs.adapter.x.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, com.max.hbcustomview.c.a, com.max.xiaoheihe.module.bbs.post_edit.k, com.max.xiaoheihe.module.bbs.post_edit.a.c, y0, com.max.xiaoheihe.module.bbs.post_edit.post_setting.a, com.max.xiaoheihe.module.bbs.post_edit.auto_save.d {
    public static final String X3 = "edit";
    public static final String Y3 = "draft";
    public static final String Z3 = "arg_draft_info";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final String f82332a4 = "arg_post_type";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final String f82333b4 = "arg_from_tab";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final String f82334c4 = "arg_topic_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final String f82335d4 = "arg_show_add_picture_tip";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final String f82336e4 = "add_picture_tip";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final String f82337f4 = "arg_show_post_success_dialog";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final String f82338g4 = "arg_post_share_detail";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final String f82339h4 = "open_picture_selector";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final String f82340i4 = "arg_post_order_img_src";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final String f82341j4 = "post_card_ids";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final String f82342k4 = "comment_game_info";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final int f82343l4 = 1000;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final int f82344m4 = 2001;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f82345n4 = 100;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final int f82346o4 = 101;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final int f82347p4 = 102;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final int f82348q4 = 104;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final String f82349r4 = "arg_edit_type";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final String f82350s4 = "arg_hash_tag";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final String f82351t4 = "info_at";

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final String f82352u4 = "info_hashtag";

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final String f82353v4 = "info_img";

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final String f82354w4 = "info_link";

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final String f82355x4 = "forward_img_upload";

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final String f82356y4 = "articleimg.jpg";
    private df.o A;
    private View B;
    private String K3;
    private z0 N;
    private String P;
    private String V;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f82359b0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f82367i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private POST_EDIT_TYPE f82370l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SpannableStringBuilder f82374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SpannableStringBuilder f82378q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.max.hbexpression.q f82380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LoadingDialog f82381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.max.hbcustomview.c f82382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<BBSTextObj> f82383v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f82384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<KeyDescObj> f82385x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @androidx.annotation.p0
    private RecommendedTopicsController f82386x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private PictureVideoLinkDraftObj f82388y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f82391z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82358b = 30;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f82360c = 120.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f82362d = 90.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pattern f82363e = Pattern.compile("\\[(.*?)]");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f82364f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f82365g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f82366h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f82368j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f82369k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f82371m = -10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f82372n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f82373o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TreeMap<Integer, HighlightInfo> f82379r = new TreeMap<>(new k());
    private long C = 0;
    private int D = -1;
    private ArrayList<LocalMedia> E = new ArrayList<>();
    private ArrayList<BBSTopicObj> F = new ArrayList<>();
    private File G = null;
    private String H = null;
    private String I = null;
    private String J = null;
    private String K = null;
    private boolean L = false;
    private boolean M = false;
    private boolean O = false;
    private UserPostLimitsObj Q = null;
    private HashMap<String, String> R = null;
    private PostBtnObj S = null;
    private boolean T = false;
    private boolean U = false;
    private HBShareReportData W = null;
    private int X = -1;
    private int Y = -1;
    private boolean Z = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f82357a0 = null;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private List<KeyDescObj> f82361c0 = new ArrayList();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private List<KeyDescObj> f82375p1 = new ArrayList();

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private PostTabActivityViewModel f82389y1 = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private PictureVideoEditPostFragmentViewModel f82376p2 = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f82387x2 = "";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private String f82390y2 = "";
    private String G2 = "";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f82377p3 = false;
    private String G3 = null;
    private JsonObject J3 = null;
    private androidx.activity.result.g<Uri> L3 = null;
    private com.max.mediaselector.lib.utils.f.a M3 = null;
    private androidx.activity.result.g<Uri> N3 = null;
    private com.max.mediaselector.lib.utils.f.a O3 = null;
    private RecyclerView.AdapterDataObserver P3 = null;
    private com.max.xiaoheihe.module.bbs.post_edit.f Q3 = null;
    private boolean R3 = false;
    private AnimatorSet S3 = null;
    private long T3 = 0;
    private boolean U3 = false;
    private ActivityPostSettingViewModel V3 = null;
    private PostCompilationItemObj W3 = null;

    public enum Action {
        MANUAL_SAVE,
        SAVE_BEFORE_EXIT,
        POST;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Action valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 30428, new Class[]{String.class}, Action.class);
            return patchProxyResultProxy.isSupported ? (Action) patchProxyResultProxy.result : (Action) Enum.valueOf(Action.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Action[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 30427, new Class[0], Action[].class);
            return patchProxyResultProxy.isSupported ? (Action[]) patchProxyResultProxy.result : (Action[]) values().clone();
        }
    }

    public enum POST_EDIT_TYPE {
        POST_PICTURE,
        POST_VIDEO;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static POST_EDIT_TYPE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 30430, new Class[]{String.class}, POST_EDIT_TYPE.class);
            return patchProxyResultProxy.isSupported ? (POST_EDIT_TYPE) patchProxyResultProxy.result : (POST_EDIT_TYPE) Enum.valueOf(POST_EDIT_TYPE.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static POST_EDIT_TYPE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 30429, new Class[0], POST_EDIT_TYPE[].class);
            return patchProxyResultProxy.isSupported ? (POST_EDIT_TYPE[]) patchProxyResultProxy.result : (POST_EDIT_TYPE[]) values().clone();
        }
    }

    public class a implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (!PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 30342, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported && "change".equals(keyDescObj.getKey())) {
                PictureVideoEditPostFragment.K4(PictureVideoEditPostFragment.this);
            }
        }
    }

    public class a0 extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Action f82393b;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f82395b;

            a(Result result) {
                this.f82395b = result;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30390, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                PictureVideoEditPostFragment.U5(PictureVideoEditPostFragment.this, ((ResultVerifyInfoObj) this.f82395b.getResult()).getLink_id());
            }
        }

        a0(Action action) {
            this.f82393b = action;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30386, new Class[0], Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 30387, new Class[]{Throwable.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                super.onError(th2);
                if (PictureVideoEditPostFragment.this.f82381t != null) {
                    PictureVideoEditPostFragment.this.f82381t.c();
                }
                if (th2 != null) {
                    PostUtils.q(PictureVideoEditPostFragment.this.f82370l, th2.toString(), "[createLinkV1] conceptVideoLinkPost fail", PictureVideoEditPostFragment.this.G3, PictureVideoEditPostFragment.this.J3);
                }
            }
        }

        public void onNext(Result<ResultVerifyInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30388, new Class[]{Result.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                super.onNext(result);
                if (PictureVideoEditPostFragment.this.f82381t != null) {
                    PictureVideoEditPostFragment.this.f82381t.c();
                }
                if (this.f82393b == Action.POST) {
                    if ((result.getResult() == null || result.getResult().getReply_push_state() == null || !"1".equals(result.getResult().getReply_push_state().getPush_state())) ? false : true) {
                        com.max.xiaoheihe.utils.v.a(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, com.max.xiaoheihe.utils.v.f95760a, new a(result));
                        return;
                    } else {
                        PictureVideoEditPostFragment.U5(PictureVideoEditPostFragment.this, result.getResult() != null ? result.getResult().getLink_id() : null);
                        return;
                    }
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(PictureVideoEditPostFragment.this.getString(R.string.success));
                if (this.f82393b == Action.SAVE_BEFORE_EXIT) {
                    ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext.finish();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30389, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultVerifyInfoObj>) obj);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements oe.t<LocalMedia> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // oe.t
            public void onCancel() {
            }

            @Override // oe.t
            public void onResult(ArrayList<LocalMedia> arrayList) {
                if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 30344, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                    return;
                }
                try {
                    if (com.max.hbcommon.utils.c.w(arrayList) || arrayList.get(0) == null) {
                        return;
                    }
                    com.max.mediaselector.e.m(FileProvider.f(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, "com.max.xiaoheihe.fileprovider", new File(arrayList.get(0).G())), ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 2001, PictureVideoEditPostFragment.R4(PictureVideoEditPostFragment.this), ((int) (PictureVideoEditPostFragment.this.f82365g > PictureVideoEditPostFragment.this.f82364f ? 90.0f : 120.0f)) * 10, ((int) (PictureVideoEditPostFragment.this.f82365g > PictureVideoEditPostFragment.this.f82364f ? 120.0f : 90.0f)) * 10);
                } catch (Throwable unused) {
                }
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30343, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.mediaselector.e.j(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 1, new a(), true, false, false, true);
        }
    }

    public class b0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30391, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.a0.g().d(PictureVideoEditPostFragment.f82355x4);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 30392, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            if (PictureVideoEditPostFragment.this.f82381t != null) {
                PictureVideoEditPostFragment.this.f82381t.c();
            }
            PostUtils.q(PictureVideoEditPostFragment.this.f82370l, th2.toString(), "postVideoLinkLegal fail", PictureVideoEditPostFragment.this.G3, PictureVideoEditPostFragment.this.J3);
            com.max.xiaoheihe.utils.a0.g().k(PictureVideoEditPostFragment.f82355x4);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30345, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.S4(PictureVideoEditPostFragment.this);
        }
    }

    public class c0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f82401b;

        c0(String str) {
            this.f82401b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30393, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostUtils.t((FragmentActivity) com.max.hbutils.utils.e.b().a(), this.f82401b);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30346, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.K4(PictureVideoEditPostFragment.this);
        }
    }

    public class d0 implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 30394, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < PictureVideoEditPostFragment.this.f82388y.getImgPathList().size(); i11++) {
                if (com.max.hbcommon.utils.c.u(PictureVideoEditPostFragment.this.f82388y.getImgPathList().get(i11).getUrl())) {
                    PictureVideoEditPostFragment.this.f82388y.getImgPathList().get(i11).setUrl(strArr[i10]);
                    i10++;
                }
            }
            com.max.xiaoheihe.utils.a0.g().d(PictureVideoEditPostFragment.f82355x4);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30395, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureVideoEditPostFragment.this.f82381t != null) {
                com.max.hbcommon.utils.d.b("cqtest", "upload failed ");
                PictureVideoEditPostFragment.this.f82381t.c();
            }
            PostUtils.q(PictureVideoEditPostFragment.this.f82370l, str, "upload img failed", PictureVideoEditPostFragment.this.G3, PictureVideoEditPostFragment.this.J3);
            com.max.xiaoheihe.utils.a0.g().k(PictureVideoEditPostFragment.f82355x4);
        }
    }

    public class e implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbimage.b.q
        public void a(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 30347, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.A.f113996p.setImageDrawable(drawable);
            PictureVideoEditPostFragment.this.J = null;
            PictureVideoEditPostFragment.U4(PictureVideoEditPostFragment.this, drawable.getMinimumHeight() > drawable.getMinimumWidth());
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(Drawable drawable) {
        }
    }

    public class e0 implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 30396, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (strArr != null && strArr.length > 0) {
                PictureVideoEditPostFragment.this.I = strArr[0];
            }
            com.max.xiaoheihe.utils.a0.g().d(PictureVideoEditPostFragment.f82355x4);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30397, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureVideoEditPostFragment.this.f82381t != null) {
                PictureVideoEditPostFragment.this.f82381t.c();
            }
            PostUtils.q(PictureVideoEditPostFragment.this.f82370l, str, "upload video thump fail", PictureVideoEditPostFragment.this.G3, PictureVideoEditPostFragment.this.J3);
            com.max.xiaoheihe.utils.a0.g().k(PictureVideoEditPostFragment.f82355x4);
        }
    }

    public class f extends com.max.hbcommon.base.adapter.s<BBSTextObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTextObj f82408b;

            a(BBSTextObj bBSTextObj) {
                this.f82408b = bBSTextObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30350, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                PictureVideoEditPostFragment.W4(PictureVideoEditPostFragment.this, this.f82408b);
            }
        }

        public class b implements com.max.hbimage.b.q {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ImageView f82410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTextObj f82411b;

            b(ImageView imageView, BBSTextObj bBSTextObj) {
                this.f82410a = imageView;
                this.f82411b = bBSTextObj;
            }

            @Override // com.max.hbimage.b.q
            public void a(Drawable drawable) {
                if (!PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 30351, new Class[]{Drawable.class}, Void.TYPE).isSupported && this.f82410a.getTag(R.id.image) == this.f82411b.getUrl()) {
                    this.f82410a.setImageDrawable(drawable);
                    this.f82411b.setHeight(String.valueOf(drawable.getMinimumHeight()));
                    this.f82411b.setWidth(String.valueOf(drawable.getMinimumWidth()));
                }
            }

            @Override // com.max.hbimage.b.q
            public /* synthetic */ void b(Drawable drawable) {
                com.max.hbimage.d.a(this, drawable);
            }

            @Override // com.max.hbimage.b.q
            public void onLoadFailed(Drawable drawable) {
                if (!PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 30352, new Class[]{Drawable.class}, Void.TYPE).isSupported && this.f82410a.getTag(R.id.image) == this.f82411b.getUrl()) {
                    com.max.hbimage.b.L(this.f82411b.getUrl(), this.f82410a, R.drawable.common_default_placeholder_375x210);
                    this.f82411b.setHeight(Constants.DEFAULT_UIN);
                    this.f82411b.setWidth(Constants.DEFAULT_UIN);
                }
            }
        }

        f(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSTextObj bBSTextObj) {
            com.max.xiaoheihe.module.bbs.post_edit.n nVar;
            Bitmap bitmapB;
            String strC;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{eVar, bBSTextObj}, this, changeQuickRedirect, false, 30348, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTextObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_preview);
            TextView textView2 = (TextView) eVar.i(R.id.tv_duration);
            boolean zEquals = "video".equals(bBSTextObj.getType());
            if (eVar.getBindingAdapterPosition() != 0 || zEquals) {
                textView.setVisibility(8);
            } else {
                if (PictureVideoEditPostFragment.this.f82388y.getPostSettingObj() == null || !PictureVideoEditPostFragment.this.f82388y.getPostSettingObj().getHeadLine()) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                if (!com.max.hbcommon.utils.c.u(bBSTextObj.getText())) {
                    File file = new File(bBSTextObj.getText());
                    if (file.exists() && com.max.hbcommon.utils.c.u(bb.a.f30446a.get(com.max.hbutils.utils.s.b(file)))) {
                        PictureVideoEditPostFragment.this.f82376p2.L(null);
                    }
                }
            }
            if (zEquals) {
                textView2.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, R.color.text_primary_1_color_alpha70, 2.0f));
                textView2.setVisibility(0);
                textView2.setText(bBSTextObj.getDuration());
                eVar.itemView.setOnClickListener(null);
            } else {
                textView2.setVisibility(8);
                eVar.itemView.setOnClickListener(new a(bBSTextObj));
            }
            if (zEquals) {
                com.max.mediaselector.utils.c.u().r(bBSTextObj.getText(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 102.0f), ViewUtils.f(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 102.0f));
                return;
            }
            if (com.max.hbcommon.utils.c.u(bBSTextObj.getCommentText())) {
                if (com.max.hbcommon.utils.c.u(bBSTextObj.getUrl())) {
                    com.max.hbimage.b.L(bBSTextObj.getText(), imageView, R.drawable.common_default_placeholder_375x210);
                    return;
                }
                imageView.setTag(R.id.image, bBSTextObj.getUrl());
                imageView.setImageResource(R.drawable.common_default_placeholder_375x210);
                com.max.hbimage.b.X(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, imageView, bBSTextObj.getUrl(), new b(imageView, bBSTextObj));
                return;
            }
            try {
                if (PictureVideoEditPostFragment.this.getContext() != null && (bitmapB = (nVar = new com.max.xiaoheihe.module.bbs.post_edit.n(PictureVideoEditPostFragment.this.getContext())).b(bBSTextObj.getCommentText(), bBSTextObj.getCommentTextImageBgColor())) != null && (strC = nVar.c(bitmapB)) != null) {
                    bBSTextObj.setText(strC);
                    bBSTextObj.setWidth(String.valueOf(bitmapB.getWidth()));
                    bBSTextObj.setHeight(String.valueOf(bitmapB.getHeight()));
                    Glide.F(imageView.getContext()).e(Uri.fromFile(new File(strC))).C1(imageView);
                    z10 = true;
                }
                if (z10) {
                    return;
                }
                com.max.hbimage.b.L(bBSTextObj.getText(), imageView, R.drawable.common_default_placeholder_375x210);
            } catch (Exception unused) {
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTextObj bBSTextObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTextObj}, this, changeQuickRedirect, false, 30349, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTextObj);
        }
    }

    public class f0 implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 30398, new Class[]{String[].class, String.class}, Void.TYPE).isSupported || strArr == null || strArr.length <= 0) {
                return;
            }
            PictureVideoEditPostFragment.this.f82388y.getPostSettingObj().getThumbImageObj().setUrl(strArr[0]);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30353, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.b5(PictureVideoEditPostFragment.this);
        }
    }

    public class g0 implements androidx.lifecycle.j0<PostCompilationItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 30381, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postCompilationItemObj);
        }

        public void b(PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 30380, new Class[]{PostCompilationItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.W3 = postCompilationItemObj;
        }
    }

    public class h extends ItemTouchHelper.SimpleCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        h(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 30356, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            super.clearView(recyclerView, viewHolder);
            PictureVideoEditPostFragment.this.f82384w.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 30355, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (PictureVideoEditPostFragment.this.f82388y.getImgPathList() == null || PictureVideoEditPostFragment.this.f82388y.getImgPathList().size() <= 0 || viewHolder.getAdapterPosition() >= PictureVideoEditPostFragment.this.f82388y.getImgPathList().size()) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 30354, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (PictureVideoEditPostFragment.this.f82388y.getImgPathList() == null || PictureVideoEditPostFragment.this.f82388y.getImgPathList().size() <= 0 || adapterPosition >= PictureVideoEditPostFragment.this.f82388y.getImgPathList().size() || adapterPosition2 >= PictureVideoEditPostFragment.this.f82388y.getImgPathList().size()) {
                return false;
            }
            if (adapterPosition < adapterPosition2) {
                int i10 = adapterPosition;
                while (i10 < adapterPosition2) {
                    int i11 = i10 + 1;
                    Collections.swap(PictureVideoEditPostFragment.this.f82388y.getImgPathList(), i10, i11);
                    i10 = i11;
                }
            } else {
                for (int i12 = adapterPosition; i12 > adapterPosition2; i12--) {
                    Collections.swap(PictureVideoEditPostFragment.this.f82388y.getImgPathList(), i12, i12 - 1);
                }
            }
            PictureVideoEditPostFragment.this.f82384w.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    public class h0 implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30401, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.Y5(PictureVideoEditPostFragment.this);
        }
    }

    public class i extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f82419b;

            a(KeyDescObj keyDescObj) {
                this.f82419b = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30359, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int iIndexOf = PictureVideoEditPostFragment.this.f82375p1.indexOf(this.f82419b);
                PictureVideoEditPostFragment.this.f82375p1.remove(this.f82419b);
                PictureVideoEditPostFragment.h5(PictureVideoEditPostFragment.this, this.f82419b);
                PictureVideoEditPostFragment.this.f82385x.notifyItemRemoved(iIndexOf);
                PictureVideoEditPostFragment.j5(PictureVideoEditPostFragment.this);
            }
        }

        i(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 30357, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_icon);
            ImageView imageView3 = (ImageView) eVar.i(R.id.iv_del);
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_bottom_container);
            textView2.setMaxWidth(ViewUtils.L(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 72.0f));
            eVar.b().setBackground(com.max.hbutils.utils.q.i(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, R.color.divider_secondary_2_color, R.color.divider_secondary_1_color, 0.5f, 5.0f));
            viewGroup.setBackground(com.max.hbutils.utils.q.s(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, R.color.background_card_1_color, 5.0f));
            if (com.max.hbcommon.utils.c.u(keyDescObj.getImg())) {
                imageView.setVisibility(8);
            } else {
                com.max.hbimage.b.L(keyDescObj.getImg(), imageView, R.drawable.common_default_placeholder_375x210);
                imageView.setVisibility(0);
            }
            if (keyDescObj.isChecked()) {
                imageView2.setVisibility(0);
                imageView2.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
                imageView2.setImageResource(keyDescObj.getIconId());
            } else {
                imageView2.clearColorFilter();
                if (com.max.hbcommon.utils.c.u(keyDescObj.getIcon())) {
                    imageView2.setVisibility(8);
                } else {
                    com.max.hbimage.b.L(keyDescObj.getIcon(), imageView2, R.drawable.common_default_placeholder_375x210);
                    imageView2.setVisibility(0);
                }
            }
            textView.setText(keyDescObj.getTitle());
            textView2.setText(keyDescObj.getDesc());
            imageView3.setOnClickListener(new a(keyDescObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 30358, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public class i0 implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30402, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.Y5(PictureVideoEditPostFragment.this);
        }
    }

    public class j extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30360, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onChanged();
            if (PictureVideoEditPostFragment.this.f82386x1 != null) {
                PictureVideoEditPostFragment.this.f82386x1.w();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30361, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onItemRangeChanged(i10, i11);
            if (PictureVideoEditPostFragment.this.f82386x1 != null) {
                PictureVideoEditPostFragment.this.f82386x1.w();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30362, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onItemRangeInserted(i10, i11);
            if (PictureVideoEditPostFragment.this.f82386x1 != null) {
                PictureVideoEditPostFragment.this.f82386x1.w();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30363, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onItemRangeRemoved(i10, i11);
            if (PictureVideoEditPostFragment.this.f82386x1 != null) {
                PictureVideoEditPostFragment.this.f82386x1.w();
            }
        }
    }

    public class j0 implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 30403, new Class[]{ArrayList.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList) || arrayList.get(0) == null) {
                return;
            }
            PictureVideoEditPostFragment.Z5(PictureVideoEditPostFragment.this, arrayList.get(0).G(), true, true);
        }
    }

    public class k implements Comparator<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        public int a(Integer num, Integer num2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 30340, new Class[]{Integer.class, Integer.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : -num.compareTo(num2);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Integer num, Integer num2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 30341, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(num, num2);
        }
    }

    public class k0 implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30408, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PictureVideoEditPostFragment.c6(PictureVideoEditPostFragment.this);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30409, new Class[0], Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                    PictureVideoEditPostFragment.this.A.H.setText("上传失败");
                }
            }
        }

        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f82428b;

            c(float f10) {
                this.f82428b = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30410, new Class[0], Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                    PictureVideoEditPostFragment.this.A.H.setAlpha(1.0f);
                    PictureVideoEditPostFragment.this.A.f114000t.setAlpha(1.0f);
                    PictureVideoEditPostFragment.this.A.H.setText(String.format("上传中 %d%%", Integer.valueOf((int) (this.f82428b * 100.0f))));
                    PictureVideoEditPostFragment.this.A.f114000t.setProgress((int) (this.f82428b * 100.0f));
                }
            }
        }

        k0() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void a(float f10) {
            if (!PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 30406, new Class[]{Float.TYPE}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext.runOnUiThread(new c(f10));
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public boolean b() {
            return true;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (!PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 30404, new Class[]{String[].class, String.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                PictureVideoEditPostFragment.this.L = true;
                PictureVideoEditPostFragment.this.K = strArr[0];
                ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext.runOnUiThread(new a());
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public boolean d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30407, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : PictureVideoEditPostFragment.this.M;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30405, new Class[]{String.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext.runOnUiThread(new b());
            }
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30367, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class l0 implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 30411, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PictureVideoEditPostFragment.this.A.H.setAlpha(fFloatValue);
                PictureVideoEditPostFragment.this.A.f114000t.setAlpha(fFloatValue);
            }
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30368, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.f82388y.getPostSettingObj().setView_limit("1");
            PictureVideoEditPostFragment.m5(PictureVideoEditPostFragment.this);
            dialogInterface.dismiss();
        }
    }

    public class m0 implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f82433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f82434b;

        m0(ArrayList arrayList, ArrayList arrayList2) {
            this.f82433a = arrayList;
            this.f82434b = arrayList2;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30412, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            File file = new File(PictureVideoEditPostFragment.g7(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext));
            if (!file.exists()) {
                file.mkdirs();
            }
            com.max.mediaselector.lib.c.k6();
            UCrop uCropOf = UCrop.of(this.f82433a, Uri.fromFile(file), this.f82434b);
            uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
            uCropOf.getCropIntent().putExtra("type", "1");
            uCropOf.startWithType(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 1);
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f82436b;

        n(BBSTopicObj bBSTopicObj) {
            this.f82436b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30369, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.F.remove(this.f82436b);
            PictureVideoEditPostFragment.a5(PictureVideoEditPostFragment.this);
        }
    }

    public class n0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f82438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f82439c;

        n0(ArrayList arrayList, File file) {
            this.f82438b = arrayList;
            this.f82439c = file;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30413, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C("draft_info", null);
            UCrop uCropOf = UCrop.of((ArrayList<Uri>) this.f82438b, Uri.fromFile(this.f82439c));
            uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
            uCropOf.startWithType(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 1);
            dialogInterface.dismiss();
        }
    }

    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f82441b;

        o(String str) {
            this.f82441b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30370, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.f82388y.getHashtagList().remove(this.f82441b);
            PictureVideoEditPostFragment.a5(PictureVideoEditPostFragment.this);
        }
    }

    public class o0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f82443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f82444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f82445d;

        o0(ArrayList arrayList, File file, ArrayList arrayList2) {
            this.f82443b = arrayList;
            this.f82444c = file;
            this.f82445d = arrayList2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30414, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            UCrop uCropOf = UCrop.of(this.f82443b, Uri.fromFile(this.f82444c), this.f82445d);
            uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
            uCropOf.startWithType(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, 1);
            dialogInterface.dismiss();
        }
    }

    public class p implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 30372, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureVideoEditPostFragment.this.f82386x1 != null) {
                PictureVideoEditPostFragment.this.f82386x1.w();
            }
            PictureVideoEditPostFragment.n5(PictureVideoEditPostFragment.this);
            PictureVideoEditPostFragment.w4(PictureVideoEditPostFragment.this, editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30371, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported || charSequence == null || !charSequence.toString().contains("\n")) {
                return;
            }
            String strReplace = charSequence.toString().replace("\n", "");
            PictureVideoEditPostFragment.this.A.f113985e.setText(strReplace);
            PictureVideoEditPostFragment.this.A.f113985e.setSelection(strReplace.length());
        }
    }

    public class p0 extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        public void onNext(Result<KeyDescObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30415, new Class[]{Result.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                PictureVideoEditPostFragment.this.f82376p2.L(result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30416, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    public class q implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Spannable f82449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f82450c = false;

        q() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 30375, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureVideoEditPostFragment.this.f82386x1 != null) {
                PictureVideoEditPostFragment.this.f82386x1.w();
            }
            PictureVideoEditPostFragment.this.f82376p2.N(com.max.xiaoheihe.utils.e0.k(PictureVideoEditPostFragment.this.A.f113984d.getText().toString()).length() + "字");
            PictureVideoEditPostFragment.n5(PictureVideoEditPostFragment.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30373, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported || PictureVideoEditPostFragment.this.f82369k) {
                return;
            }
            this.f82449b = new SpannableString(charSequence);
            Matcher matcher = PictureVideoEditPostFragment.this.f82363e.matcher(charSequence.subSequence(i10, i10 + i11));
            while (matcher.find()) {
                PictureVideoEditPostFragment.q5(PictureVideoEditPostFragment.this, (matcher.end() - matcher.start()) - 1);
            }
            if (i11 - i12 == 0 || !PictureVideoEditPostFragment.r5(PictureVideoEditPostFragment.this, i10, i11)) {
                PictureVideoEditPostFragment.t5(PictureVideoEditPostFragment.this, i10, i12 - i11);
            } else {
                PictureVideoEditPostFragment.s5(PictureVideoEditPostFragment.this, i10, i11, this.f82449b);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30374, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.f82374p = (SpannableStringBuilder) charSequence;
            if (!PictureVideoEditPostFragment.this.f82369k) {
                if (charSequence.toString().trim().equals(this.f82449b.toString().trim())) {
                    return;
                }
                if (PictureVideoEditPostFragment.this.f82371m != -10) {
                    PictureVideoEditPostFragment.this.f82378q.insert(PictureVideoEditPostFragment.this.f82371m, (CharSequence) charSequence.subSequence(i10, i10 + i12).toString());
                    PictureVideoEditPostFragment pictureVideoEditPostFragment = PictureVideoEditPostFragment.this;
                    PictureVideoEditPostFragment.t5(pictureVideoEditPostFragment, pictureVideoEditPostFragment.f82371m, i12);
                    PictureVideoEditPostFragment.this.f82369k = true;
                    PictureVideoEditPostFragment.this.A.f113984d.setText(PictureVideoEditPostFragment.this.f82378q);
                    PictureVideoEditPostFragment.this.A.f113984d.setSelection(PictureVideoEditPostFragment.this.f82371m + i12);
                    PictureVideoEditPostFragment.this.f82369k = false;
                    PictureVideoEditPostFragment.this.f82371m = -10;
                }
                if (i12 == 1) {
                    if (charSequence.charAt(i10) == '@') {
                        PictureVideoEditPostFragment pictureVideoEditPostFragment2 = PictureVideoEditPostFragment.this;
                        pictureVideoEditPostFragment2.startActivityForResult(AddAtUserActivity.N1(((com.max.hbcommon.base.d) pictureVideoEditPostFragment2).mContext, com.max.xiaoheihe.utils.i0.j()), 100);
                    } else if (charSequence.charAt(i10) == '#') {
                        if (PictureVideoEditPostFragment.this.f82388y.getHashtagList() == null || PictureVideoEditPostFragment.this.f82388y.getHashtagList().size() < 5) {
                            PictureVideoEditPostFragment.C5(PictureVideoEditPostFragment.this, true);
                        } else {
                            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext.getString(R.string.toast_hashtag_count_limit));
                        }
                    }
                }
            }
            PictureVideoEditPostFragment pictureVideoEditPostFragment3 = PictureVideoEditPostFragment.this;
            pictureVideoEditPostFragment3.f82372n = pictureVideoEditPostFragment3.f82374p.length();
        }
    }

    public static /* synthetic */ class q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82452a;

        static {
            int[] iArr = new int[POST_EDIT_TYPE.valuesCustom().length];
            f82452a = iArr;
            try {
                iArr[POST_EDIT_TYPE.POST_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82452a[POST_EDIT_TYPE.POST_PICTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30376, new Class[]{View.class}, Void.TYPE).isSupported && (((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext instanceof PostTabActivity)) {
                ((PostTabActivity) ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext).C2();
            }
        }
    }

    public class r0 extends com.max.hbcommon.network.d<Result<TopicListInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        public void onNext(Result<TopicListInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30399, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (PictureVideoEditPostFragment.this.isActive()) {
                List<BBSTopicObj> topic_infos = result.getResult().getTopic_infos();
                if (!com.max.hbcommon.utils.c.w(topic_infos)) {
                    for (BBSTopicObj bBSTopicObj : topic_infos) {
                        if (PictureVideoEditPostFragment.this.F.contains(bBSTopicObj)) {
                            BBSTopicObj bBSTopicObj2 = (BBSTopicObj) PictureVideoEditPostFragment.this.F.get(PictureVideoEditPostFragment.this.F.indexOf(bBSTopicObj));
                            bBSTopicObj2.setName(bBSTopicObj.getName());
                            bBSTopicObj2.setPic_url(bBSTopicObj.getPic_url());
                        } else {
                            PictureVideoEditPostFragment.this.F.add(bBSTopicObj);
                        }
                        com.max.xiaoheihe.module.bbs.b0.f().c(bBSTopicObj);
                    }
                }
                PictureVideoEditPostFragment.a5(PictureVideoEditPostFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30400, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicListInfoObj>) obj);
        }
    }

    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30377, new Class[]{View.class}, Void.TYPE).isSupported && (((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext instanceof PostTabActivity)) {
                ((PostTabActivity) ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext).C2();
            }
        }
    }

    public class s0 extends com.max.hbcommon.network.d<Result<ToolCardResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s0() {
        }

        public void onNext(Result<ToolCardResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30417, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (PictureVideoEditPostFragment.this.isActive() && !com.max.hbcommon.utils.c.w(result.getResult().getTool_cards())) {
                PictureVideoEditPostFragment.this.f82388y.getPost_tool_cards().clear();
                PictureVideoEditPostFragment.this.f82388y.getPost_tool_cards().addAll(result.getResult().getTool_cards());
                PictureVideoEditPostFragment.z5(PictureVideoEditPostFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30418, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ToolCardResultObj>) obj);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30378, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.onBackPressed();
        }
    }

    public class t0 extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t0() {
        }

        public void onNext(Result<UserPostLimitsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30419, new Class[]{Result.class}, Void.TYPE).isSupported && PictureVideoEditPostFragment.this.isActive()) {
                super.onNext(result);
                PictureVideoEditPostFragment.this.Q = result.getResult();
                if (PictureVideoEditPostFragment.this.Q == null) {
                    return;
                }
                if (PictureVideoEditPostFragment.this.Q.isCan_post_link()) {
                    ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mTitleBar.getAppbarActionTextView().setEnabled(true);
                } else {
                    ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mTitleBar.getAppbarActionTextView().setEnabled(false);
                    PostUtils.o(PictureVideoEditPostFragment.this.f82370l, PostCheckReason.TOAST_POST_LIMIT_NOT_ALLOW, PictureVideoEditPostFragment.this.G3, PictureVideoEditPostFragment.this.J3);
                    if (!com.max.hbcommon.utils.c.u(PictureVideoEditPostFragment.this.Q.getMsg_post_link())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.d(PictureVideoEditPostFragment.this.Q.getMsg_post_link());
                    }
                }
                if (PictureVideoEditPostFragment.this.Q.getPic_link_limit() != null && PictureVideoEditPostFragment.this.Q.getPic_link_limit().getPic_limit() != null && PictureVideoEditPostFragment.this.Q.getPic_link_limit().getPic_limit().getMax() != null) {
                    PictureVideoEditPostFragment pictureVideoEditPostFragment = PictureVideoEditPostFragment.this;
                    pictureVideoEditPostFragment.f82358b = com.max.hbutils.utils.n.q(pictureVideoEditPostFragment.Q.getPic_link_limit().getPic_limit().getMax());
                }
                PictureVideoEditPostFragment pictureVideoEditPostFragment2 = PictureVideoEditPostFragment.this;
                PictureVideoEditPostFragment.w4(pictureVideoEditPostFragment2, pictureVideoEditPostFragment2.A.f113985e.getText().toString());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30420, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    public class u extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        u(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30379, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext.startActivity(DraftListActivity.z2(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext));
        }
    }

    public class u0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicIndexObj f82460b;

        u0(BBSTopicIndexObj bBSTopicIndexObj) {
            this.f82460b = bBSTopicIndexObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30421, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext, this.f82460b.getTips().getProtocol());
        }
    }

    public class v extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30364, new Class[0], Void.TYPE).isSupported || PictureVideoEditPostFragment.this.f82384w == null || PictureVideoEditPostFragment.this.f82384w.getItemCount() <= 1 || PictureVideoEditPostFragment.this.A.f114004x.getVisibility() == 0) {
                return;
            }
            PictureVideoEditPostFragment.this.A.f114004x.setVisibility(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30365, new Class[]{cls, cls}, Void.TYPE).isSupported || PictureVideoEditPostFragment.this.f82384w == null || PictureVideoEditPostFragment.this.f82384w.getItemCount() <= 1 || PictureVideoEditPostFragment.this.A.f114004x.getVisibility() == 0) {
                return;
            }
            PictureVideoEditPostFragment.this.A.f114004x.setVisibility(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30366, new Class[]{cls, cls}, Void.TYPE).isSupported || PictureVideoEditPostFragment.this.f82384w == null || PictureVideoEditPostFragment.this.f82384w.getItemCount() <= 1 || PictureVideoEditPostFragment.this.A.f114004x.getVisibility() == 0) {
                return;
            }
            PictureVideoEditPostFragment.this.A.f114004x.setVisibility(0);
        }
    }

    public class v0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        v0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30422, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragment.this.f82380s.v2();
        }
    }

    public class w implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30382, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            PictureVideoEditPostFragment.this.f82388y.getPostSettingObj().setHeadLine(false);
            PictureVideoEditPostFragment.L5(PictureVideoEditPostFragment.this);
        }
    }

    public class w0 implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSTextObj f82465a;

        public class a extends com.max.hbimage.image.o {
            public static ChangeQuickRedirect changeQuickRedirect;

            a(String str) {
                super(str);
            }

            @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
            public void onLoadFailed(@androidx.annotation.p0 Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 30425, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onLoadFailed(drawable);
                if (PictureVideoEditPostFragment.this.f82381t != null && PictureVideoEditPostFragment.this.f82381t.i()) {
                    PictureVideoEditPostFragment.this.f82381t.c();
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("图片资源加载失败");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.max.hbimage.image.o
            public void onResourceReady(@androidx.annotation.n0 File file, @androidx.annotation.p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
                if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, 30424, new Class[]{File.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onResourceReady(file, fVar);
                if (PictureVideoEditPostFragment.this.f82381t != null && PictureVideoEditPostFragment.this.f82381t.i()) {
                    PictureVideoEditPostFragment.this.f82381t.c();
                }
                if (file.exists()) {
                    w0.this.f82465a.setText(file.getPath());
                    w0 w0Var = w0.this;
                    PictureVideoEditPostFragment.C4(PictureVideoEditPostFragment.this, w0Var.f82465a);
                }
            }

            @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
            public /* bridge */ /* synthetic */ void onResourceReady(@androidx.annotation.n0 File file, @androidx.annotation.p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
                if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, 30426, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                    return;
                }
                onResourceReady(file, fVar);
            }
        }

        w0(BBSTextObj bBSTextObj) {
            this.f82465a = bBSTextObj;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 30423, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (GameCenterActivity.S.equals(keyDescObj.getKey())) {
                PictureVideoEditPostFragment.z4(PictureVideoEditPostFragment.this, this.f82465a);
                return;
            }
            Bitmap bitmapDecodeFile = null;
            if (!"edit".equals(keyDescObj.getKey())) {
                if (!org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a.equals(keyDescObj.getKey()) || PictureVideoEditPostFragment.this.f82388y.getImgPathList() == null) {
                    return;
                }
                PictureVideoEditPostFragment.A4(PictureVideoEditPostFragment.this, null);
                int iIndexOf = PictureVideoEditPostFragment.this.f82388y.getImgPathList().indexOf(this.f82465a);
                PictureVideoEditPostFragment.this.f82388y.getImgPathList().remove(this.f82465a);
                if (PictureVideoEditPostFragment.this.f82376p2 != null) {
                    PictureVideoEditPostFragment.this.f82376p2.O(this.f82465a.getText());
                }
                PictureVideoEditPostFragment.this.f82384w.notifyDataSetChanged();
                if (iIndexOf == 0) {
                    PictureVideoEditPostFragment.this.f82376p2.L(null);
                    return;
                }
                return;
            }
            PictureVideoEditPostFragment.A4(PictureVideoEditPostFragment.this, null);
            if (!com.max.hbcommon.utils.c.u(this.f82465a.getText()) || com.max.hbcommon.utils.c.u(this.f82465a.getUrl())) {
                if (this.f82465a.getImageEditDraft() == null || this.f82465a.getImageEditDraft().getSrc() == null) {
                    PictureVideoEditPostFragment.C4(PictureVideoEditPostFragment.this, this.f82465a);
                    return;
                }
                PictureVideoEditPostFragment pictureVideoEditPostFragment = PictureVideoEditPostFragment.this;
                pictureVideoEditPostFragment.D = pictureVideoEditPostFragment.f82388y.getImgPathList().indexOf(this.f82465a);
                PictureVideoEditPostFragment.I4(PictureVideoEditPostFragment.this, Uri.fromFile(new File(this.f82465a.getImageEditDraft().getSrc())), this.f82465a.getImageEditDraft());
                return;
            }
            File fileP = com.max.hbimage.b.p(this.f82465a.getUrl());
            if (fileP != null && fileP.exists()) {
                bitmapDecodeFile = BitmapFactory.decodeFile(fileP.getPath());
            }
            if (bitmapDecodeFile != null) {
                this.f82465a.setText(com.max.hbimage.b.q0(bitmapDecodeFile, PictureVideoEditPostFragment.g7(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext)).getPath());
                PictureVideoEditPostFragment.C4(PictureVideoEditPostFragment.this, this.f82465a);
                return;
            }
            if (PictureVideoEditPostFragment.this.f82381t == null || !PictureVideoEditPostFragment.this.f82381t.i()) {
                PictureVideoEditPostFragment pictureVideoEditPostFragment2 = PictureVideoEditPostFragment.this;
                pictureVideoEditPostFragment2.f82381t = new LoadingDialog(((com.max.hbcommon.base.d) pictureVideoEditPostFragment2).mContext, PictureVideoEditPostFragment.this.getString(R.string.loading), false).r();
            }
            Glide.F(com.max.hbimage.image.l.a()).u().load(this.f82465a.getUrl()).z1(new a(this.f82465a.getUrl()));
        }
    }

    public class x implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30383, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            PictureVideoEditPostFragment.N5(PictureVideoEditPostFragment.this);
        }
    }

    public class y implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30384, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureVideoEditPostFragment.this.f82389y1 != null) {
                PictureVideoEditPostFragment.this.f82389y1.z();
            }
            JsonObject jsonObject = new JsonObject();
            String strP5 = PictureVideoEditPostFragment.P5(PictureVideoEditPostFragment.this);
            if (!com.max.hbcommon.utils.c.u(strP5)) {
                jsonObject.addProperty("h_src", strP5);
            }
            if (POST_EDIT_TYPE.POST_VIDEO.equals(PictureVideoEditPostFragment.this.f82370l)) {
                jsonObject.addProperty("post_type", PostType.Video.toString());
            } else {
                jsonObject.addProperty("post_type", PostType.Picture.toString());
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.U0, null, jsonObject);
            PictureVideoEditPostFragment.Q5(PictureVideoEditPostFragment.this);
            PictureVideoEditPostFragment.this.Y8();
            dialogInterface.dismiss();
        }
    }

    public class z implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30385, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (PictureVideoEditPostFragment.this.f82389y1 != null) {
                PictureVideoEditPostFragment.this.f82389y1.z();
            }
            JsonObject jsonObject = new JsonObject();
            String strP5 = PictureVideoEditPostFragment.P5(PictureVideoEditPostFragment.this);
            if (!com.max.hbcommon.utils.c.u(strP5)) {
                jsonObject.addProperty("h_src", strP5);
            }
            if (POST_EDIT_TYPE.POST_VIDEO.equals(PictureVideoEditPostFragment.this.f82370l)) {
                jsonObject.addProperty("post_type", PostType.Video.toString());
            } else {
                jsonObject.addProperty("post_type", PostType.Picture.toString());
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.T0, null, jsonObject);
            PictureVideoEditPostFragment.R5(PictureVideoEditPostFragment.this);
            androidx.localbroadcastmanager.content.a.b(((com.max.hbcommon.base.d) PictureVideoEditPostFragment.this).mContext).d(new Intent(lb.a.Z));
            dialogInterface.dismiss();
        }
    }

    static /* synthetic */ void A4(PictureVideoEditPostFragment pictureVideoEditPostFragment, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, aVar}, null, changeQuickRedirect, true, 30314, new Class[]{PictureVideoEditPostFragment.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.m8(aVar);
    }

    private void A6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30191, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f82359b0 = z10;
        String string = null;
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getGameList())) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<GameObj> it = this.f82388y.getGameList().iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getAppid());
                sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            string = sb2.deleteCharAt(sb2.length() - 1).toString();
        }
        com.max.xiaoheihe.module.bbs.post_edit.a.E.i(getChildFragmentManager(), getCompositeDisposable(), this, this.F, this.f82388y.getHashtagList(), string, this.A.f113985e.getText() != null ? this.A.f113985e.getText().toString() : "", this.A.f113984d.getText() != null ? this.A.f113984d.getText().toString() : "");
        l8();
        n8(true);
    }

    private void A7(String str) {
    }

    private void A8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30231, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        POST_EDIT_TYPE post_edit_type = this.f82370l;
        if (post_edit_type == POST_EDIT_TYPE.POST_VIDEO) {
            com.max.xiaoheihe.base.router.b.g(this, lb.d.K1).U(UserBBSInfoFragment.M, UserBBSInfoFragment.O).U(MehomefragmentV2.C, lb.d.K1).A();
        } else if (post_edit_type == POST_EDIT_TYPE.POST_PICTURE) {
            PostUtils.d(getActivity(), str, new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.s
                @Override // yh.a
                public final Object invoke() {
                    return this.f83161b.S7();
                }
            });
        } else {
            com.max.heybox.hblog.g.G("[performRouteToDestinationWhenPost] undefine postType route");
        }
    }

    private boolean B7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30223, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "edit".equals(this.f82391z);
    }

    private void B8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30216, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.a0 a0VarG = com.max.xiaoheihe.utils.a0.g();
        a0VarG.k(f82355x4);
        if (this.f82388y.getImgPathList().size() > 0) {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.s0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83162a.T7();
                }
            }, f82355x4);
        }
        if (this.I == null && this.H != null) {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.t0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83164a.U7();
                }
            }, f82355x4);
        }
        if (this.f82370l != POST_EDIT_TYPE.POST_VIDEO) {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.q
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83157a.Y7();
                }
            }, f82355x4);
        } else if (this.L) {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.u0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83166a.V7();
                }
            }, f82355x4);
        } else {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.v0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83168a.W7();
                }
            }, f82355x4);
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.p
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83025a.X7();
                }
            }, f82355x4);
        }
        a0VarG.n(f82355x4);
        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82376p2;
        if (pictureVideoEditPostFragmentViewModel != null) {
            pictureVideoEditPostFragmentViewModel.F();
        }
    }

    static /* synthetic */ void C4(PictureVideoEditPostFragment pictureVideoEditPostFragment, BBSTextObj bBSTextObj) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, bBSTextObj}, null, changeQuickRedirect, true, 30315, new Class[]{PictureVideoEditPostFragment.class, BBSTextObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.I6(bBSTextObj);
    }

    static /* synthetic */ void C5(PictureVideoEditPostFragment pictureVideoEditPostFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 30330, new Class[]{PictureVideoEditPostFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.A6(z10);
    }

    private void C6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30268, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureCacheManager pictureCacheManager = PictureCacheManager.f75668a;
        pictureCacheManager.e();
        pictureCacheManager.a();
        pictureCacheManager.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 C7(Action action, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{action, str, str2}, this, changeQuickRedirect, false, 30282, new Class[]{Action.class, String.class, String.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        E6(action, str, str2);
        return null;
    }

    private void C8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30219, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        F6(Action.POST, null, null);
    }

    private StringBuilder D6(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30235, new Class[]{String.class}, StringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (StringBuilder) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (Integer num : this.f82379r.keySet()) {
            Integer numValueOf = Integer.valueOf(this.f82379r.get(num).getEnd());
            if ("info_at".equals(this.f82379r.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), L6(this.f82379r.get(num)));
            } else if ("info_hashtag".equals(this.f82379r.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), M6(this.f82379r.get(num)));
            } else if ("info_img".equals(this.f82379r.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), N6(this.f82379r.get(num)));
            } else if (f82354w4.equals(this.f82379r.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), O6(this.f82379r.get(num)));
            }
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D7(Integer num) {
        if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 30301, new Class[]{Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        PostTabActivityViewModel postTabActivityViewModel = this.f82389y1;
        if (postTabActivityViewModel != null) {
            if (postTabActivityViewModel.h().f() == PostType.Article) {
                return;
            }
            POST_EDIT_TYPE post_edit_type = this.f82370l;
            POST_EDIT_TYPE post_edit_type2 = POST_EDIT_TYPE.POST_VIDEO;
            if (post_edit_type == post_edit_type2 && this.f82389y1.h().f() == PostType.Picture) {
                return;
            }
            if (this.f82370l != post_edit_type2 && this.f82389y1.h().f() == PostType.Video) {
                return;
            }
        }
        if (num.intValue() == 1) {
            X8();
        }
    }

    @SuppressLint({"AutoDispose"})
    private void D8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30228, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f82381t;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.f82381t = new LoadingDialog(this.mContext, getString(R.string.commiting), true).r();
        }
        PostDataObj postDataObjY6 = Y6(Action.POST, null, null, false);
        com.max.xiaoheihe.network.i.a().M7(postDataObjY6.getCookieHeaders(), postDataObjY6.getUser_code(), postDataObjY6.isDraft(), postDataObjY6.getParamsMap(), "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new b0());
    }

    @SuppressLint({"AutoDispose"})
    private void E6(Action action, String str, String str2) {
        io.reactivex.z<Result<ResultVerifyInfoObj>> zVarC5;
        if (PatchProxy.proxy(new Object[]{action, str, str2}, this, changeQuickRedirect, false, 30227, new Class[]{Action.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f82381t;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.f82381t = new LoadingDialog(this.mContext, getString(R.string.commiting), false).r();
        }
        PostDataObj postDataObjY6 = Y6(action, str, str2, false);
        if (this.R != null && postDataObjY6.getParamsMap() != null) {
            postDataObjY6.getParamsMap().putAll(this.R);
        }
        int i10 = q0.f82452a[this.f82370l.ordinal()];
        if (i10 == 1) {
            if (this.L) {
                postDataObjY6.getParamsMap().putAll(PostUtils.h(this.K));
            } else if ("2".equals(postDataObjY6.isDraft()) && !com.max.hbcommon.utils.c.u(this.J)) {
                t6();
            }
            zVarC5 = com.max.xiaoheihe.network.i.a().c5(postDataObjY6.getCookieHeaders(), str, postDataObjY6.isDraft(), postDataObjY6.getParamsMap());
        } else if (i10 != 2) {
            zVarC5 = com.max.xiaoheihe.network.i.a().m2(postDataObjY6.getCookieHeaders(), str, postDataObjY6.isDraft(), postDataObjY6.getParamsMap());
        } else {
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
            if (pictureVideoLinkDraftObj != null && pictureVideoLinkDraftObj.getHighLikeComment() != null) {
                String strValueOf = String.valueOf((int) this.f82388y.getHighLikeComment().getComment_id());
                Map<String, String> paramsMap = postDataObjY6.getParamsMap();
                if (paramsMap != null) {
                    paramsMap.put("relate_comment_id", strValueOf);
                }
            }
            zVarC5 = com.max.xiaoheihe.network.i.a().Ba(postDataObjY6.getCookieHeaders(), str, postDataObjY6.isDraft(), postDataObjY6.getParamsMap());
        }
        addDisposable((io.reactivex.disposables.b) zVarC5.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a0(action)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E7(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30298, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            m8(null);
        }
        if (PictureVideoPostEditSlice.A(this.f82370l) && z10) {
            this.f82376p2.H(true);
        }
        if (z10 && this.f82380s != null && !ad.a.a(ad.a.A, false)) {
            this.f82380s.C();
        }
        Log.d("PVEditFragment-dbg", "[etTitle#onFocusChange] hasFocus: " + z10);
    }

    private void E8(BBSTopicIndexObj bBSTopicIndexObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicIndexObj}, this, changeQuickRedirect, false, 30166, new Class[]{BBSTopicIndexObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bBSTopicIndexObj != null) {
            if (this.f82370l == POST_EDIT_TYPE.POST_VIDEO && bBSTopicIndexObj.getPost_video_notify() != null) {
                this.A.f113984d.setHint(bBSTopicIndexObj.getPost_video_notify().getText());
                this.A.f113985e.setHint(bBSTopicIndexObj.getPost_video_notify().getTitle());
            } else if (bBSTopicIndexObj.getPost_pic_link_notify() != null) {
                this.A.f113984d.setHint(bBSTopicIndexObj.getPost_pic_link_notify().getText());
                this.A.f113985e.setHint(bBSTopicIndexObj.getPost_pic_link_notify().getTitle());
                this.f82390y2 = bBSTopicIndexObj.getPost_pic_link_notify().getShow_add_topic_guide_alert();
            }
            if (bBSTopicIndexObj.getTips() != null) {
                this.A.O.setVisibility(0);
                this.A.C.setText(bBSTopicIndexObj.getTips().getDesc());
                this.A.O.setOnClickListener(new u0(bBSTopicIndexObj));
            } else {
                this.A.O.setVisibility(8);
            }
            if (!com.max.hbcommon.utils.c.w(bBSTopicIndexObj.getPost_pic_link_plan())) {
                this.f82361c0.clear();
                this.f82361c0.addAll(bBSTopicIndexObj.getPost_pic_link_plan());
                PostSettingObj postSettingObj = this.f82388y.getPostSettingObj();
                if (postSettingObj == null) {
                    postSettingObj = new PostSettingObj();
                }
                postSettingObj.setPost_plan(this.f82361c0);
                MMKVManager.f71329a.o(ad.e.f1248a, ad.e.f1251d, com.max.hbutils.utils.k.r(this.f82361c0), false);
            }
            if (!com.max.hbcommon.utils.c.u(bBSTopicIndexObj.getPost_pic_link_plan_notice())) {
                this.K3 = bBSTopicIndexObj.getPost_pic_link_plan_notice();
                if (com.max.hbcommon.utils.c.w(bBSTopicIndexObj.getPost_pic_link_plan())) {
                    this.f82361c0.clear();
                    PostSettingObj postSettingObj2 = this.f82388y.getPostSettingObj();
                    if (postSettingObj2 == null) {
                        postSettingObj2 = new PostSettingObj();
                    }
                    postSettingObj2.setPost_plan(this.f82361c0);
                }
            }
        }
        j1();
        PostBtnObj postBtnObj = this.S;
        if (postBtnObj != null) {
            if (!com.max.hbcommon.utils.c.u(postBtnObj.getPrompt())) {
                this.A.f113984d.setHint(this.S.getPrompt());
            }
            if (com.max.hbcommon.utils.c.u(this.S.getTitle_place_holder())) {
                return;
            }
            this.A.f113985e.setHint(this.S.getTitle_place_holder());
        }
    }

    @SuppressLint({"AutoDispose"})
    private void F6(final Action action, final String str, final String str2) {
        if (PatchProxy.proxy(new Object[]{action, str, str2}, this, changeQuickRedirect, false, 30226, new Class[]{Action.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        AccelWorkCoroutinesKt.b(new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.e0
            @Override // yh.a
            public final Object invoke() {
                return this.f82956b.C7(action, str, str2);
            }
        }, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F7(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30297, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            m8(null);
        }
        if (PictureVideoPostEditSlice.A(this.f82370l) && z10) {
            this.f82376p2.H(true);
        }
        if (z10 && this.f82380s != null && !ad.a.a(ad.a.A, false)) {
            this.f82380s.C();
        }
        Log.d("PVEditFragment-dbg", "[etContent#onFocusChange] hasFocus: " + z10);
    }

    private void F8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30180, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82375p1.clear();
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getGameList())) {
            Iterator<GameObj> it = this.f82388y.getGameList().iterator();
            while (it.hasNext()) {
                m6(it.next());
            }
        }
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getPost_tool_cards())) {
            Iterator<LinkToolCardObj> it2 = this.f82388y.getPost_tool_cards().iterator();
            while (it2.hasNext()) {
                q6(it2.next());
            }
        }
        this.f82385x.notifyDataSetChanged();
        G8();
    }

    private Uri G6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30218, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        File file = new File(com.max.xiaoheihe.utils.d.T());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, System.currentTimeMillis() + "articleimg.jpg");
        this.G = file2;
        if (!file2.exists()) {
            try {
                this.G.createNewFile();
            } catch (IOException unused) {
                com.max.hbcommon.utils.d.b("zzzz", "creat file IOException");
            }
        }
        return com.max.xiaoheihe.utils.d.w0(this.mContext, this.G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G7(com.max.xiaoheihe.module.bbs.post_edit.m mVar) {
        if (PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, 30303, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.m.class}, Void.TYPE).isSupported) {
            return;
        }
        if (mVar == null) {
            com.max.heybox.hblog.g.G("[PictureVideoEditPostFragment][initFragmentViewModel] error status, sliceAction is null");
            return;
        }
        if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.c) {
            r8();
        } else if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.d) {
            s8();
        } else if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.b) {
            q8();
        } else if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.e) {
            t8();
        } else if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.g) {
            x8();
        } else if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.f) {
            com.max.xiaoheihe.module.bbs.post_edit.m.f fVar = (com.max.xiaoheihe.module.bbs.post_edit.m.f) mVar;
            BBSTopicObj bBSTopicObjE = fVar.e();
            if (fVar.f()) {
                this.F.add(bBSTopicObjE);
            } else {
                this.F.remove(bBSTopicObjE);
            }
            j1();
        } else if (mVar instanceof com.max.xiaoheihe.module.bbs.post_edit.m.a) {
            com.max.xiaoheihe.module.bbs.post_edit.m.a aVar = (com.max.xiaoheihe.module.bbs.post_edit.m.a) mVar;
            String strE = aVar.e();
            boolean zF = aVar.f();
            if (this.f82388y.getHashtagList() != null) {
                if (zF) {
                    this.f82388y.getHashtagList().add(strE);
                } else {
                    this.f82388y.getHashtagList().remove(strE);
                }
                j1();
            }
        }
        com.max.heybox.hblog.g.x("[getPostEditSliceActionLiveData] onAction: " + mVar);
    }

    private void G8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.A.f114003w.setVisibility(com.max.hbcommon.utils.c.w(this.f82375p1) ? 8 : 0);
        this.f82376p2.K(!com.max.hbcommon.utils.c.w(this.f82375p1));
    }

    private void H6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30245, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.D = -1;
        if (this.f82388y.getImgPathList() != null) {
            this.f82388y.getImgPathList().size();
        }
        int i10 = q0.f82452a[this.f82370l.ordinal()];
        if (i10 == 1) {
            com.max.mediaselector.e.j(this.mContext, 1, new j0(), true, false, true, false);
            return;
        }
        if (i10 != 2) {
            return;
        }
        int size = this.f82388y.getImgPathList() != null ? this.f82388y.getImgPathList().size() : 0;
        int i11 = this.f82358b;
        if (size >= i11) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d(String.format(com.max.xiaoheihe.utils.d.n0(R.string.max_pic_select_tips), Integer.valueOf(this.f82358b)));
            return;
        }
        Intent intentA = ImageModuleListActivity.f79943x1.a(this.mContext, i11 - size < 9 ? i11 - size : 9, false, "0");
        int i12 = this.Y;
        if (i12 > 0) {
            intentA.putExtra(ImageModuleListActivity.f79942p3, i12);
            this.Y = -1;
        } else {
            int i13 = this.X;
            if (i13 > 0) {
                intentA.putExtra(ImageModuleListActivity.f79942p3, i13);
            }
        }
        startActivityForResult(intentA, 102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H7(Result result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30302, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        W6();
        if (result == null) {
            com.max.heybox.hblog.g.G("[PictureVideoEditPostFragment][initFragmentViewModel] error status, topicIndexDataResult is null");
            return;
        }
        E8((BBSTopicIndexObj) result.getResult());
        if (result.getResult() != null) {
            this.G2 = ((BBSTopicIndexObj) result.getResult()).getPlan_protocol();
            this.U3 = com.max.hbcommon.utils.c.x(((BBSTopicIndexObj) result.getResult()).getAllow_schedule());
        }
    }

    private void H8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30163, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iZ6 = Z6() - AccelWorldStringKt.c(str);
        if (iZ6 < 0) {
            this.A.F.setTextColor(this.mContext.getColor(R.color.alert_color));
        } else {
            this.A.F.setTextColor(this.mContext.getColor(R.color.text_secondary_2_color));
        }
        this.A.F.setText(String.valueOf(iZ6));
    }

    static /* synthetic */ void I4(PictureVideoEditPostFragment pictureVideoEditPostFragment, Uri uri, Draft draft) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, uri, draft}, null, changeQuickRedirect, true, 30316, new Class[]{PictureVideoEditPostFragment.class, Uri.class, Draft.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.J6(uri, draft);
    }

    private void I6(BBSTextObj bBSTextObj) {
        if (!PatchProxy.proxy(new Object[]{bBSTextObj}, this, changeQuickRedirect, false, 30176, new Class[]{BBSTextObj.class}, Void.TYPE).isSupported && isActive()) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Uri.fromFile(new File(bBSTextObj.getText())));
                File file = new File(g7(this.mContext));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.D = this.f82388y.getImgPathList().indexOf(bBSTextObj);
                com.max.mediaselector.lib.c.k6();
                UCrop uCropOf = UCrop.of((ArrayList<Uri>) arrayList, Uri.fromFile(file));
                uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
                uCropOf.startWithType(this.mContext, 1);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I7(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30295, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.C > 1000) {
            this.C = jCurrentTimeMillis;
            com.max.xiaoheihe.module.bbs.post_edit.w0 w0VarQ6 = Q6();
            if (w0VarQ6.f() != PostCheckReason.CHECK_PASS) {
                PostUtils.o(this.f82370l, w0VarQ6.f(), this.G3, this.J3);
                if (com.max.hbcommon.utils.c.u(w0VarQ6.e())) {
                    return;
                }
                com.max.hbutils.utils.c.f(w0VarQ6.e());
                return;
            }
            if (this.f82388y.getPostSettingObj() != null && this.f82388y.getPostSettingObj().getHeadLine() && (this.f82388y.getPostSettingObj().getThumbImageObj() == null || (this.f82388y.getPostSettingObj().getThumbImageObj() != null && this.f82388y.getPostSettingObj().getThumbImageObj().getUrl() == null))) {
                P8();
            } else if (w6()) {
                Q8();
            } else {
                B8();
            }
        }
    }

    private void I8(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 30183, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (keyDescObj.isChecked()) {
            if (com.max.hbcommon.utils.c.w(this.f82388y.getGameList())) {
                return;
            }
            for (GameObj gameObj : this.f82388y.getGameList()) {
                if (gameObj.getAppid() != null && gameObj.getAppid().equals(keyDescObj.getId())) {
                    this.f82388y.getGameList().remove(gameObj);
                    return;
                }
            }
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f82388y.getPost_tool_cards())) {
            return;
        }
        for (LinkToolCardObj linkToolCardObj : this.f82388y.getPost_tool_cards()) {
            if (linkToolCardObj.getCard_id() != null && linkToolCardObj.getCard_id().equals(keyDescObj.getId())) {
                this.f82388y.getPost_tool_cards().remove(linkToolCardObj);
                return;
            }
        }
    }

    private void J6(Uri uri, Draft draft) {
        if (PatchProxy.proxy(new Object[]{uri, draft}, this, changeQuickRedirect, false, 30248, new Class[]{Uri.class, Draft.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(uri);
        arrayList2.add(draft);
        PermissionManager.f71603a.R(this, (AppCompatActivity) this.mContext, new m0(arrayList, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J7(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30294, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        activity.startActivity(DraftListActivity.z2(activity));
    }

    private void J8(int i10, int i11, Spannable spannable) {
        Object[] objArr = {new Integer(i10), new Integer(i11), spannable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30168, new Class[]{cls, cls, Spannable.class}, Void.TYPE).isSupported || this.f82379r.size() == 0) {
            return;
        }
        this.f82378q = new SpannableStringBuilder(spannable);
        Iterator<Integer> it = this.f82379r.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            HighlightInfo highlightInfo = this.f82379r.get(next);
            int i12 = i10 + i11;
            if (next.intValue() < i12 && highlightInfo.getEnd() >= i10) {
                if ("info_at".equals(highlightInfo.getType())) {
                    this.f82373o--;
                } else if ("info_img".equals(highlightInfo.getType()) || f82354w4.equals(highlightInfo.getType())) {
                    this.f82373o -= highlightInfo.getLength();
                }
                it.remove();
                this.f82378q.replace(next.intValue(), highlightInfo.getEnd(), (CharSequence) "");
                k8(next.intValue(), -highlightInfo.getLength());
                if (next.intValue() < i10) {
                    i11 -= highlightInfo.getEnd() - i10;
                    i10 = next.intValue();
                } else {
                    i11 = i12 < highlightInfo.getEnd() ? i11 - (i12 - next.intValue()) : i11 - highlightInfo.getLength();
                }
                if (i11 == 0) {
                    break;
                } else {
                    it = this.f82379r.keySet().iterator();
                }
            }
        }
        if (i11 > 0) {
            this.f82378q.replace(i10, i10 + i11, (CharSequence) "");
            k8(i10, -i11);
        }
        this.f82371m = i10;
    }

    static /* synthetic */ void K4(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30317, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.p8();
    }

    private void K6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30217, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UploadInfoObj uploadInfoObjJ = com.max.xiaoheihe.module.upload.c.g().j(this.J);
        if (uploadInfoObjJ != null) {
            uploadInfoObjJ.setVideoPostData(Y6(Action.POST, null, null, false));
            uploadInfoObjJ.setVideoThumbUrl(this.I);
            com.max.xiaoheihe.module.upload.c.g().q();
        }
        if (!PostUtils.l() && !B7()) {
            A8("");
        }
        this.mContext.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.max.xiaoheihe.module.bbs.post_edit.d K7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30296, new Class[0], com.max.xiaoheihe.module.bbs.post_edit.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.bbs.post_edit.d) patchProxyResultProxy.result : new com.max.xiaoheihe.module.bbs.post_edit.d(this.f82388y.getGameList(), this.A.f113985e.getText().toString(), this.A.f113984d.getText().toString());
    }

    private void K8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30172, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82367i = true;
        this.A.f113986f.setVisibility(0);
        com.max.hbexpression.q qVar = this.f82380s;
        if (qVar != null) {
            qVar.q1();
            return;
        }
        com.max.hbexpression.q qVarA = com.max.hbexpression.e.a(true);
        this.f82380s = qVarA;
        qVarA.b2(new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.g0
            @Override // yh.a
            public final Object invoke() {
                return this.f82971b.Z7();
            }
        });
        getParentFragmentManager().u().y(R.id.fl_toolbar_popup_box, this.f82380s.P()).m();
        this.A.f113986f.post(new v0());
    }

    static /* synthetic */ void L5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30331, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.B8();
    }

    private String L6(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 30242, new Class[]{HighlightInfo.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return String.format("<a data-user-id=\"%s\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://", highlightInfo.getData()) + URLEncoder.encode(String.format("{\"protocol_type\":\"openUser\",\"user_id\":\"%s\"}", highlightInfo.getData())) + String.format("\" target=\"_blank\">%s</a>", highlightInfo.getName());
        } catch (Exception e10) {
            e10.printStackTrace();
            return String.format("<a data-user-id=\"%s\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://{\"protocol_type\":\"openUser\",\"user_id\":\"%s\"}\" target=\"_blank\">%s</a>", highlightInfo.getData(), highlightInfo.getData(), highlightInfo.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L7(PostType postType) {
        if (PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 30309, new Class[]{PostType.class}, Void.TYPE).isSupported || this.f82389y1.h().f() == PostType.Article) {
            return;
        }
        POST_EDIT_TYPE post_edit_type = this.f82370l;
        POST_EDIT_TYPE post_edit_type2 = POST_EDIT_TYPE.POST_VIDEO;
        if (post_edit_type == post_edit_type2 && this.f82389y1.h().f() == PostType.Picture) {
            return;
        }
        if (this.f82370l == post_edit_type2 || this.f82389y1.h().f() != PostType.Video) {
            this.f82389y1.L(Q0());
        }
    }

    private void L8(String str) {
        int size;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30233, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = this.J3;
        JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : new JsonObject();
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        if (pictureVideoLinkDraftObj == null || com.max.hbcommon.utils.c.w(pictureVideoLinkDraftObj.getImgPathList())) {
            size = 0;
        } else {
            size = this.f82388y.getImgPathList().size();
            for (BBSTextObj bBSTextObj : this.f82388y.getImgPathList()) {
                if (bBSTextObj != null && GameShotPictureSelectorFragment.f84764s.equals(bBSTextObj.getExtra())) {
                    i10++;
                }
            }
        }
        jsonObjectDeepCopy.addProperty("link_id", str);
        jsonObjectDeepCopy.addProperty("steam_shot_pic_num", Integer.valueOf(i10));
        jsonObjectDeepCopy.addProperty("total_pic_num", Integer.valueOf(size));
        jsonObjectDeepCopy.addProperty("tags", com.max.xiaoheihe.module.bbs.post_edit.o.a(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, this.f82388y.getHashtagList()));
        String strB7 = b7();
        if (!com.max.hbcommon.utils.c.u(strB7)) {
            jsonObjectDeepCopy.addProperty("h_src", strB7);
        }
        if (!com.max.hbcommon.utils.c.u(this.G3)) {
            jsonObjectDeepCopy.addProperty("source", this.G3);
        }
        PostCompilationItemObj postCompilationItemObj = this.W3;
        if (postCompilationItemObj != null) {
            jsonObjectDeepCopy.addProperty("compilation_id", postCompilationItemObj.getObj_id());
        } else {
            jsonObjectDeepCopy.addProperty("compilation_id", "");
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.P0, null, jsonObjectDeepCopy);
    }

    private String M6(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 30241, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"heybox://open_subject\" target=\"_blank\">%s</a>", highlightInfo.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M7(com.max.xiaoheihe.module.bbs.post_edit.e eVar) throws Throwable {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 30308, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.e.class}, Void.TYPE).isSupported || eVar == null || !isActive()) {
            return;
        }
        POST_EDIT_TYPE post_edit_type = this.f82370l;
        POST_EDIT_TYPE post_edit_type2 = POST_EDIT_TYPE.POST_VIDEO;
        if (post_edit_type == post_edit_type2 && this.f82389y1.h().f() == PostType.Video) {
            y8(eVar);
        } else {
            if (this.f82370l == post_edit_type2 || this.f82389y1.h().f() != PostType.Picture) {
                return;
            }
            u8(eVar);
        }
    }

    private void M8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30220, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.a0 a0VarG = com.max.xiaoheihe.utils.a0.g();
        a0VarG.k(f82355x4);
        if (this.f82388y.getImgPathList().size() > 0) {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.p0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83026a.a8();
                }
            }, f82355x4);
        }
        if (this.I == null && this.H != null) {
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.q0
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83158a.b8();
                }
            }, f82355x4);
        }
        a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.r0
            @Override // com.max.xiaoheihe.utils.a0.a
            public final void a() {
                this.f83160a.c8();
            }
        }, f82355x4);
        a0VarG.n(f82355x4);
    }

    static /* synthetic */ void N5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30332, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.X8();
    }

    private String N6(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 30236, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"heybox://open_image_preview\" data-urls=\"%s\">%s</a>", highlightInfo.getData(), highlightInfo.getName().substring(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N7(Pair pair) throws Throwable {
        if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30307, new Class[]{Pair.class}, Void.TYPE).isSupported || this.f82370l == POST_EDIT_TYPE.POST_VIDEO || this.f82389y1.h().f() != PostType.Picture) {
            return;
        }
        v8(((Boolean) pair.e()).booleanValue(), (Uri) pair.f());
    }

    private String O6(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 30237, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"%s\" data-link-type=\"text\">%s</a>", highlightInfo.getData(), highlightInfo.getName().substring(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O7(PostToolsV2TabType postToolsV2TabType) {
        if (PatchProxy.proxy(new Object[]{postToolsV2TabType}, this, changeQuickRedirect, false, 30306, new Class[]{PostToolsV2TabType.class}, Void.TYPE).isSupported || this.f82389y1.h().f() == PostType.Article) {
            return;
        }
        POST_EDIT_TYPE post_edit_type = this.f82370l;
        POST_EDIT_TYPE post_edit_type2 = POST_EDIT_TYPE.POST_VIDEO;
        if (post_edit_type == post_edit_type2 && this.f82389y1.h().f() == PostType.Picture) {
            return;
        }
        if (this.f82370l == post_edit_type2 || this.f82389y1.h().f() != PostType.Video) {
            JsonObject jsonObject = new JsonObject();
            if (postToolsV2TabType == PostToolsV2TabType.GALLERY) {
                jsonObject.addProperty("tab", (Number) 1);
            } else if (postToolsV2TabType == PostToolsV2TabType.GAME_SHOT) {
                jsonObject.addProperty("tab", (Number) 2);
            } else if (postToolsV2TabType == PostToolsV2TabType.TEMPLATE) {
                jsonObject.addProperty("tab", (Number) 3);
            }
            if (this.f82370l == post_edit_type2) {
                jsonObject.addProperty("post_type", "5");
            } else {
                jsonObject.addProperty("post_type", "4");
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.Q0, null, jsonObject);
        }
    }

    private void O8(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30178, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.A.f113982b.getLayoutParams().height = ViewUtils.f(this.mContext, 120.0f);
            this.A.f113982b.getLayoutParams().width = ViewUtils.f(this.mContext, 90.0f);
        } else {
            this.A.f113982b.getLayoutParams().height = ViewUtils.f(this.mContext, 90.0f);
            this.A.f113982b.getLayoutParams().width = ViewUtils.f(this.mContext, 120.0f);
        }
    }

    static /* synthetic */ String P5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30333, new Class[]{PictureVideoEditPostFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : pictureVideoEditPostFragment.b7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PostDataObj P6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30279, new Class[0], PostDataObj.class);
        return patchProxyResultProxy.isSupported ? (PostDataObj) patchProxyResultProxy.result : Y6(Action.SAVE_BEFORE_EXIT, null, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 P7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30299, new Class[0], b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        if (isActive()) {
            K8();
            r6(true);
            s6(true);
        }
        return b2.f124493a;
    }

    private void P8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30212, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PostUtils.o(this.f82370l, PostCheckReason.NO_COVER, this.G3, this.J3);
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.prompt).l("您还未添加封面，将无法参与创作计划").u("去添加", new x()).o("直接发布", new w()).F();
    }

    static /* synthetic */ void Q5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30334, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.t6();
    }

    @androidx.annotation.n0
    private com.max.xiaoheihe.module.bbs.post_edit.w0 Q6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30198, new Class[0], com.max.xiaoheihe.module.bbs.post_edit.w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.module.bbs.post_edit.w0) patchProxyResultProxy.result;
        }
        PostLimitObj postLimitObjS6 = S6();
        if (postLimitObjS6 != null) {
            if (postLimitObjS6.getTitle_limit() != null) {
                int iC = AccelWorldStringKt.c(this.A.f113985e.getText().toString());
                if (postLimitObjS6.getTitle_limit().getMin() != null && iC < com.max.hbutils.utils.n.q(postLimitObjS6.getTitle_limit().getMin())) {
                    return new com.max.xiaoheihe.module.bbs.post_edit.w0("标题字数不得少于" + postLimitObjS6.getTitle_limit().getMin(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
                if (postLimitObjS6.getTitle_limit().getMax() != null && iC > com.max.hbutils.utils.n.q(postLimitObjS6.getTitle_limit().getMax())) {
                    return new com.max.xiaoheihe.module.bbs.post_edit.w0("标题字数不得多于" + postLimitObjS6.getTitle_limit().getMax(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
            }
            if (postLimitObjS6.getText_limit() != null) {
                if (postLimitObjS6.getText_limit().getMin() != null && this.A.f113984d.getText().length() < com.max.hbutils.utils.n.q(postLimitObjS6.getText_limit().getMin())) {
                    return new com.max.xiaoheihe.module.bbs.post_edit.w0("内容字数不得少于" + postLimitObjS6.getText_limit().getMin(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
                if (postLimitObjS6.getText_limit().getMax() != null && this.A.f113984d.getText().length() > com.max.hbutils.utils.n.q(postLimitObjS6.getText_limit().getMax())) {
                    return new com.max.xiaoheihe.module.bbs.post_edit.w0("内容字数不得多于" + postLimitObjS6.getText_limit().getMax(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
            }
            if (this.f82370l != POST_EDIT_TYPE.POST_VIDEO && postLimitObjS6.getPic_limit() != null) {
                int size = this.f82388y.getImgPathList() != null ? this.f82388y.getImgPathList().size() : 0;
                if (postLimitObjS6.getPic_limit().getMin() != null && size < com.max.hbutils.utils.n.q(postLimitObjS6.getPic_limit().getMin())) {
                    return new com.max.xiaoheihe.module.bbs.post_edit.w0("图片不得少于" + postLimitObjS6.getPic_limit().getMin(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
                if (postLimitObjS6.getPic_limit().getMax() != null && size > com.max.hbutils.utils.n.q(postLimitObjS6.getPic_limit().getMax())) {
                    return new com.max.xiaoheihe.module.bbs.post_edit.w0("图片不得多于" + postLimitObjS6.getPic_limit().getMax(), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
                }
            }
        } else if (com.max.hbcommon.utils.c.u(this.A.f113984d.getText().toString())) {
            return new com.max.xiaoheihe.module.bbs.post_edit.w0(getString(R.string.content_empty_msg), PostCheckReason.TOAST_POST_LIMIT_CHECK_FAIL);
        }
        if (this.f82388y.getPostSettingObj() != null && this.f82388y.getPostSettingObj().getHeadLine() && com.max.hbcommon.utils.c.u(d7())) {
            return new com.max.xiaoheihe.module.bbs.post_edit.w0("请添加社区", PostCheckReason.TOAST_NO_TOPIC);
        }
        if (com.max.hbcommon.utils.c.n(this.A.f113985e.getText().toString())) {
            return new com.max.xiaoheihe.module.bbs.post_edit.w0("标题中不能包含特殊符号", PostCheckReason.TOAST_TITLE_CONTAIN_EMOJI);
        }
        return (this.f82370l == POST_EDIT_TYPE.POST_VIDEO && this.J == null) ? new com.max.xiaoheihe.module.bbs.post_edit.w0("请选择视频", PostCheckReason.TOAST_NO_VIDEO) : new com.max.xiaoheihe.module.bbs.post_edit.w0("", PostCheckReason.CHECK_PASS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 Q7(Uri uri, Boolean bool) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, bool}, this, changeQuickRedirect, false, 30305, new Class[]{Uri.class, Boolean.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        ForegroundService.d(this.mContext);
        if (bool.booleanValue() && uri != null) {
            BBSTextObj bBSTextObjV6 = V6(uri, null);
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
            if (pictureVideoLinkDraftObj != null && pictureVideoLinkDraftObj.getImgPathList() != null && bBSTextObjV6 != null) {
                this.f82388y.getImgPathList().add(bBSTextObjV6);
                this.f82384w.notifyItemInserted(this.f82388y.getImgPathList().indexOf(bBSTextObjV6));
            }
        }
        return b2.f124493a;
    }

    private void Q8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30214, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PostUtils.o(this.f82370l, PostCheckReason.DIALOG_NO_TOPIC, this.G3, this.J3);
        MMKVManager mMKVManager = MMKVManager.f71329a;
        if (mMKVManager.d(ad.e.f1248a, ad.e.f1249b, false, true)) {
            if (mMKVManager.d(ad.e.f1248a, ad.e.f1250c, false, true)) {
                B8();
                return;
            }
            mMKVManager.k(ad.e.f1248a, ad.e.f1250c, true, true);
        }
        new com.max.hbcommon.view.a.f(this.mContext).y("请添加分区").l("选择合适的分区会让你的内容获得更多曝光哦").u("去添加", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f83165b.d8(dialogInterface, i10);
            }
        }).o("直接发布", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f83167b.e8(dialogInterface, i10);
            }
        }).F();
    }

    static /* synthetic */ Uri R4(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30318, new Class[]{PictureVideoEditPostFragment.class}, Uri.class);
        return patchProxyResultProxy.isSupported ? (Uri) patchProxyResultProxy.result : pictureVideoEditPostFragment.G6();
    }

    static /* synthetic */ void R5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30335, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.M8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 R7(Uri uri, Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, bool}, this, changeQuickRedirect, false, 30304, new Class[]{Uri.class, Boolean.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        ForegroundService.d(this.mContext);
        if (bool.booleanValue() && uri != null) {
            String strM = com.max.mediaselector.lib.utils.n.m(this.mContext, uri);
            Log.d("PictureVideoEdit-dbg", "[onVideoGalleryEvent]\nuri: " + uri + "\nfilePath: " + strM);
            if (!com.max.hbcommon.utils.c.u(strM)) {
                h7(strM, true, true);
            }
        }
        return b2.f124493a;
    }

    private void R8(BBSTextObj bBSTextObj) {
        if (PatchProxy.proxy(new Object[]{bBSTextObj}, this, changeQuickRedirect, false, 30173, new Class[]{BBSTextObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey(GameCenterActivity.S);
        keyDescObj.setDesc("预览");
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("edit");
        keyDescObj2.setDesc("编辑");
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a);
        keyDescObj3.setDesc("删除");
        keyDescObj3.setColor("#FA3C4B");
        arrayList.add(keyDescObj);
        arrayList.add(keyDescObj2);
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList, false);
        heyBoxPopupMenu.Y(true);
        heyBoxPopupMenu.P(new HeyBoxPopupMenu.e(this.mContext.getColor(R.color.text_primary_1_color_day_night), 0.06f));
        heyBoxPopupMenu.R(new w0(bBSTextObj));
        heyBoxPopupMenu.show();
    }

    static /* synthetic */ void S4(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30319, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.W8();
    }

    private PostLimitObj S6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30165, new Class[0], PostLimitObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostLimitObj) patchProxyResultProxy.result;
        }
        if (this.Q == null) {
            return null;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        if (pictureVideoLinkDraftObj == null || pictureVideoLinkDraftObj.getPostSettingObj() == null || !this.f82388y.getPostSettingObj().getHeadLine()) {
            return this.f82370l == POST_EDIT_TYPE.POST_VIDEO ? this.Q.getLink_limit() : this.Q.getPic_link_limit();
        }
        return this.Q.getArticle_limit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 S7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30281, new Class[0], b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        this.mContext.finish();
        return b2.f124493a;
    }

    private void S8(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 30200, new Class[]{Activity.class}, Void.TYPE).isSupported || activity == null) {
            return;
        }
        ViewUtils.r0(this.A.f113984d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b9(this.f82388y.getImgPathList(), "bbs");
    }

    private void T8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30201, new Class[0], Void.TYPE).isSupported && x6()) {
            S8(this.mContext);
        }
    }

    static /* synthetic */ void U4(PictureVideoEditPostFragment pictureVideoEditPostFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 30320, new Class[]{PictureVideoEditPostFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.O8(z10);
    }

    static /* synthetic */ void U5(PictureVideoEditPostFragment pictureVideoEditPostFragment, String str) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, str}, null, changeQuickRedirect, true, 30336, new Class[]{PictureVideoEditPostFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.w8(str);
    }

    @SuppressLint({"AutoDispose"})
    private void U6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30270, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30290, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d9();
    }

    private void U8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.f(getString(R.string.post_success));
    }

    private BBSTextObj V6(Uri uri, Draft draft) throws Throwable {
        int i10;
        int i11;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, draft}, this, changeQuickRedirect, false, 30259, new Class[]{Uri.class, Draft.class}, BBSTextObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTextObj) patchProxyResultProxy.result;
        }
        int[] iArrK = com.max.mediaselector.lib.utils.c.k(this.mContext, com.max.mediaselector.lib.config.f.c(uri.toString()) ? uri.toString() : uri.getPath());
        if (iArrK == null || iArrK.length != 2 || (i10 = iArrK[0]) <= 0 || (i11 = iArrK[1]) <= 0) {
            return null;
        }
        BBSTextObj bBSTextObj = new BBSTextObj();
        bBSTextObj.setType(SocialConstants.PARAM_IMG_URL);
        bBSTextObj.setHeight(String.valueOf(i11));
        bBSTextObj.setWidth(String.valueOf(i10));
        bBSTextObj.setText(com.max.mediaselector.lib.utils.n.m(this.mContext, uri));
        bBSTextObj.setImageEditDraft(draft);
        return bBSTextObj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30289, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C8();
    }

    private void V8(BBSTextObj bBSTextObj) {
        int length = 0;
        if (PatchProxy.proxy(new Object[]{bBSTextObj}, this, changeQuickRedirect, false, 30175, new Class[]{BBSTextObj.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f82388y.getImgPathList())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (BBSTextObj bBSTextObj2 : this.f82388y.getImgPathList()) {
            if (!com.max.hbcommon.utils.c.u(bBSTextObj2.getUrl())) {
                if (sb2.length() > 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(bBSTextObj2.getUrl());
            } else if (!com.max.hbcommon.utils.c.u(bBSTextObj2.getText())) {
                if (sb2.length() > 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(bBSTextObj2.getText());
            }
            if (bBSTextObj2 == bBSTextObj) {
                length = sb2.toString().split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP).length - 1;
            }
        }
        if (sb2.length() > 0) {
            ImageViewerHelper.a(this.mContext).g(this.mContext, sb2.toString().split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP), null).d(length).p();
        }
    }

    static /* synthetic */ void W4(PictureVideoEditPostFragment pictureVideoEditPostFragment, BBSTextObj bBSTextObj) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, bBSTextObj}, null, changeQuickRedirect, true, 30321, new Class[]{PictureVideoEditPostFragment.class, BBSTextObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.R8(bBSTextObj);
    }

    private void W6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30155, new Class[0], Void.TYPE).isSupported || this.f82376p2.D()) {
            return;
        }
        this.f82376p2.S(true);
        try {
            String strI = MMKVManager.f71329a.i(ad.e.f1248a, ad.e.f1251d, null, false);
            if (com.max.hbcommon.utils.c.u(strI)) {
                return;
            }
            List listB = com.max.hbutils.utils.k.b(strI, KeyDescObj.class);
            this.f82361c0.clear();
            this.f82361c0.addAll(listB);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        D8();
    }

    private void W8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30174, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("change");
        keyDescObj.setDesc("更换视频");
        arrayList.add(keyDescObj);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList, false);
        heyBoxPopupMenu.Y(true);
        heyBoxPopupMenu.R(new a());
        heyBoxPopupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PictureVideoLinkDraftObj X6() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30278, new Class[0], PictureVideoLinkDraftObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureVideoLinkDraftObj) patchProxyResultProxy.result;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        if (getArguments() != null && getArguments().getBoolean(PostTabActivity.G2)) {
            z10 = true;
        }
        String str = this.I;
        if (str == null) {
            str = this.H;
        }
        return pictureVideoLinkDraftObj.copy(this.A.f113985e.getText().toString(), D6(this.f82374p.toString()).toString(), pictureVideoLinkDraftObj.getLink_id(), pictureVideoLinkDraftObj.getImgPathList(), pictureVideoLinkDraftObj.getGameList(), pictureVideoLinkDraftObj.getHashtagList(), O2(), pictureVideoLinkDraftObj.getPost_tool_cards(), this.K, String.valueOf(this.f82366h), this.J, str, pictureVideoLinkDraftObj.getPostSettingObj(), pictureVideoLinkDraftObj.getDefault_content(), pictureVideoLinkDraftObj.getHighLikeComment(), Boolean.valueOf(z10), pictureVideoLinkDraftObj.getOriginCompilationId(), this.W3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K6();
    }

    private void X8() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30192, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PostSettingObj postSettingObj = this.f82388y.getPostSettingObj();
        if (postSettingObj == null) {
            postSettingObj = new PostSettingObj();
        }
        PostSettingObj postSettingObj2 = postSettingObj;
        postSettingObj2.setCheckedTopics(this.F);
        postSettingObj2.setPost_plan(this.f82361c0);
        PostType postType = this.f82370l == POST_EDIT_TYPE.POST_VIDEO ? PostType.Video : PostType.Picture;
        String str = this.G2;
        long j10 = this.T3;
        if (getArguments() != null && getArguments().getBoolean(PostTabActivity.G2)) {
            z10 = true;
        }
        PostSettingDialogFragment.D4(postType, postSettingObj2, str, j10, Boolean.valueOf(z10), this.K3, Boolean.valueOf(this.U3)).show(getChildFragmentManager(), "PostSettingDialogFragment");
    }

    static /* synthetic */ void Y5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30337, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.H6();
    }

    private PostDataObj Y6(Action action, String str, String str2, boolean z10) {
        GameObj gameObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{action, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30229, new Class[]{Action.class, String.class, String.class, Boolean.TYPE}, PostDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostDataObj) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap(16);
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            map.put("Cookie", str2);
        }
        JsonArray jsonArray = new JsonArray();
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getHashtagList())) {
            Iterator<String> it = this.f82388y.getHashtagList().iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next().replace("#", ""));
            }
        }
        ArrayList arrayList = new ArrayList();
        BBSTextObj bBSTextObj = new BBSTextObj();
        bBSTextObj.setType("text");
        String string = this.A.f113984d.getText().toString();
        map2.put(SocialConstants.PARAM_APP_DESC, string);
        if (this.f82370l != POST_EDIT_TYPE.POST_VIDEO) {
            if (this.f82388y.getPostSettingObj() != null) {
                if (this.f82388y.getPostSettingObj().getHeadLine() && this.f82388y.getPostSettingObj().getThumbImageObj() != null && this.f82388y.getPostSettingObj().getThumbImageObj().getUrl() != null) {
                    map2.put("thumb", this.f82388y.getPostSettingObj().getThumbImageObj().getUrl());
                }
                if (this.f82388y.getPostSettingObj().getView_limit() != null) {
                    map2.put("view_limit", this.f82388y.getPostSettingObj().getView_limit());
                }
                if (this.f82388y.getPostSettingObj().getHeadLine() && this.f82388y.getPostSettingObj().getSelectPostPlan() != null) {
                    map2.put("post_plan", this.f82388y.getPostSettingObj().getSelectPostPlan().getKey());
                }
                if (this.f82388y.getPostSettingObj().getSchedulePostTimeMs() > 0) {
                    map2.put("schedule_ts", String.valueOf(this.f82388y.getPostSettingObj().getSchedulePostTimeMs() / 1000));
                }
            }
            bBSTextObj.setText(D6(this.f82374p.toString()).toString());
            arrayList.add(bBSTextObj);
            if (!com.max.hbcommon.utils.c.w(this.f82388y.getImgPathList())) {
                for (BBSTextObj bBSTextObj2 : this.f82388y.getImgPathList()) {
                    BBSTextObj bBSTextObj3 = new BBSTextObj();
                    bBSTextObj3.setUrl(bBSTextObj2.getUrl());
                    if (z10) {
                        String strB = PostEditAutoSaveManager.f82868h.b(bBSTextObj2.getText());
                        if (strB != null) {
                            bBSTextObj3.setText(strB);
                        } else {
                            bBSTextObj3.setText(bBSTextObj2.getText());
                        }
                    }
                    bBSTextObj3.setType(SocialConstants.PARAM_IMG_URL);
                    bBSTextObj3.setWidth(bBSTextObj2.getWidth());
                    bBSTextObj3.setHeight(bBSTextObj2.getHeight());
                    if (!com.max.hbcommon.utils.c.u(bBSTextObj2.getText())) {
                        bBSTextObj3.setSource_info(AccelWorldScreenShotKt.b(bBSTextObj2.getText()));
                    }
                    arrayList.add(bBSTextObj3);
                }
            }
            if (!com.max.hbcommon.utils.c.w(this.f82388y.getGameList())) {
                for (GameObj gameObj2 : this.f82388y.getGameList()) {
                    BBSTextObj bBSTextObj4 = new BBSTextObj();
                    bBSTextObj4.setType("game_card");
                    bBSTextObj4.setAppid(gameObj2.getAppid());
                    arrayList.add(bBSTextObj4);
                }
            }
            map2.put("text", com.max.hbutils.utils.k.p(arrayList));
        } else {
            if (this.f82388y.getPostSettingObj() != null && this.f82388y.getPostSettingObj().getView_limit() != null) {
                map2.put("view_limit", this.f82388y.getPostSettingObj().getView_limit());
            }
            if (!com.max.hbcommon.utils.c.w(this.f82388y.getGameList()) && (gameObj = this.f82388y.getGameList().get(0)) != null && r1.Z(gameObj) != null) {
                map2.put("game_tag", r1.Z(gameObj));
            }
            map2.put("text", string);
        }
        if (!com.max.hbcommon.utils.c.u(this.A.f113985e.getText().toString())) {
            map2.put("title", this.A.f113985e.getText().toString());
        }
        if (jsonArray.size() > 0) {
            map2.put("hashtags", jsonArray.toString());
        }
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getPost_tool_cards())) {
            StringBuilder sb2 = new StringBuilder();
            for (LinkToolCardObj linkToolCardObj : this.f82388y.getPost_tool_cards()) {
                if (sb2.length() > 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(linkToolCardObj.getCard_id());
            }
            map2.put(f82341j4, sb2.toString());
        }
        if (!com.max.hbcommon.utils.c.u(this.f82388y.getLink_id())) {
            map2.put("link_id", this.f82388y.getLink_id());
            map2.put("edit", "1");
        }
        String str3 = action != Action.POST ? this.f82370l == POST_EDIT_TYPE.POST_VIDEO ? "2" : "1" : "0";
        if ("0".equals(str3)) {
            PostCompilationItemObj postCompilationItemObj = this.W3;
            if (postCompilationItemObj != null) {
                map2.put("compilation_obj_id", postCompilationItemObj.getObj_id());
            }
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
            if (pictureVideoLinkDraftObj != null && !com.max.hbcommon.utils.c.u(pictureVideoLinkDraftObj.getOriginCompilationId()) && (this.W3 == null || !Objects.equals(this.f82388y.getOriginCompilationId(), this.W3.getObj_id()))) {
                map2.put("del_compilation_obj_id", this.f82388y.getOriginCompilationId());
            }
        }
        int i10 = q0.f82452a[this.f82370l.ordinal()];
        if (i10 == 1) {
            String strD7 = d7();
            if (!com.max.hbcommon.utils.c.u(strD7)) {
                map2.put("topic_ids", strD7);
            }
            if (!com.max.hbcommon.utils.c.u(this.I)) {
                map2.put("video_thumb", this.I);
            }
            if (!"0".equals(str3) && !com.max.hbcommon.utils.c.u(this.J)) {
                map2.put("video_local_path", this.J);
            }
            map2.put("link_tag", "1");
            map2.put("post_type", "4");
            map2.put("video_cos_provider", "tencent");
        } else if (i10 == 2) {
            String strD8 = d7();
            if (!com.max.hbcommon.utils.c.u(strD8) || (this.f82388y.getPostSettingObj() != null && this.f82388y.getPostSettingObj().getHeadLine())) {
                if (!com.max.hbcommon.utils.c.u(strD8)) {
                    map2.put("topic_ids", strD8);
                }
                map2.put("link_tag", "27");
            } else {
                map2.put("topic_ids", BBSTopicObj.TOPIC_ID_TIMELINE);
                map2.put("link_tag", "28");
            }
            if (this.f82388y.getPostSettingObj() != null && this.f82388y.getPostSettingObj().getHeadLine()) {
                map2.put("post_type", "3");
            }
        }
        return new PostDataObj(map, str3, map2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30286, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C8();
    }

    static /* synthetic */ void Z5(PictureVideoEditPostFragment pictureVideoEditPostFragment, String str, boolean z10, boolean z11) {
        Object[] objArr = {pictureVideoEditPostFragment, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30338, new Class[]{PictureVideoEditPostFragment.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.h7(str, z10, z11);
    }

    private int Z6() {
        int iQ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30164, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        PostLimitObj postLimitObjS6 = S6();
        if (postLimitObjS6 == null || postLimitObjS6.getTitle_limit() == null || postLimitObjS6.getTitle_limit().getMax() == null || (iQ = com.max.hbutils.utils.n.q(postLimitObjS6.getTitle_limit().getMax())) <= 0) {
            return 30;
        }
        return iQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Z7() {
        boolean zU;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30300, new Class[0], Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        if (this.A.f113985e.hasFocus()) {
            if (this.A.f113985e.getText() != null) {
                zU = com.max.hbcommon.utils.c.u(this.A.f113985e.getText().toString());
                z10 = !zU;
            }
        } else if (this.A.f113984d.getText() != null) {
            zU = com.max.hbcommon.utils.c.u(this.A.f113984d.getText().toString());
            z10 = !zU;
        }
        return Boolean.valueOf(z10);
    }

    private void Z8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30195, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82376p2.J(this.F);
        this.f82376p2.I(this.f82388y.getHashtagList());
    }

    static /* synthetic */ void a5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30310, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.j1();
    }

    @SuppressLint({"AutoDispose"})
    private void a7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30162, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        String strD7 = d7();
        if (!com.max.hbcommon.utils.c.u(strD7)) {
            map.put("topic_ids", strD7);
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30285, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b9(this.f82388y.getImgPathList(), "bbs");
    }

    private void a9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30196, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.A.f113999s.removeAllViews();
        PostSettingObj postSettingObj = this.f82388y.getPostSettingObj();
        if (postSettingObj != null && postSettingObj.getHeadLine()) {
            if (!com.max.hbcommon.utils.c.w(postSettingObj.getPost_plan()) && !com.max.hbcommon.utils.c.w(postSettingObj.getSelect_post_plan())) {
                for (KeyDescObj keyDescObj : postSettingObj.getPost_plan()) {
                    keyDescObj.setChecked(postSettingObj.getSelect_post_plan().contains(keyDescObj));
                }
            }
            KeyDescObj selectPostPlan = postSettingObj.getSelectPostPlan();
            if (selectPostPlan != null) {
                View viewInflate = this.mInflater.inflate(R.layout.item_topics_new, (ViewGroup) this.A.f113999s, false);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
                ((ImageView) viewInflate.findViewById(R.id.iv_close)).setVisibility(8);
                textView.setText(selectPostPlan.getName());
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
                imageView.setImageResource(R.drawable.bbs_post_plan_icon_12x12);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
                this.A.f113999s.addView(viewInflate);
            }
        }
        if (!com.max.hbcommon.utils.c.w(this.F)) {
            for (BBSTopicObj bBSTopicObj : this.F) {
                if (BBSTopicObj.TOPIC_ID_TIMELINE.equals(bBSTopicObj.getTopic_id())) {
                    this.F.remove(bBSTopicObj);
                } else {
                    View viewInflate2 = this.mInflater.inflate(R.layout.item_topics_new, (ViewGroup) this.A.f113999s, false);
                    ImageView imageView2 = (ImageView) viewInflate2.findViewById(R.id.iv_topic_icon);
                    TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_topic_name);
                    ImageView imageView3 = (ImageView) viewInflate2.findViewById(R.id.iv_close);
                    com.max.hbimage.b.L(bBSTopicObj.getPic_url(), imageView2, R.drawable.default_game_avatar_351x351);
                    textView2.setText(bBSTopicObj.getName());
                    imageView3.setVisibility(0);
                    imageView3.setOnClickListener(new n(bBSTopicObj));
                    this.A.f113999s.addView(viewInflate2);
                }
            }
        }
        if (com.max.hbcommon.utils.c.w(this.f82388y.getHashtagList())) {
            return;
        }
        for (String str : this.f82388y.getHashtagList()) {
            View viewInflate3 = this.mInflater.inflate(R.layout.item_topics_new, (ViewGroup) this.A.f113999s, false);
            ImageView imageView4 = (ImageView) viewInflate3.findViewById(R.id.iv_topic_icon);
            TextView textView3 = (TextView) viewInflate3.findViewById(R.id.tv_topic_name);
            ImageView imageView5 = (ImageView) viewInflate3.findViewById(R.id.iv_close);
            imageView4.setImageResource(R.drawable.bbs_topic_filled_24x24);
            ViewGroup.LayoutParams layoutParams = imageView4.getLayoutParams();
            layoutParams.width = ViewUtils.f(this.mContext, 12.0f);
            layoutParams.height = ViewUtils.f(this.mContext, 12.0f);
            imageView4.setLayoutParams(layoutParams);
            imageView4.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            textView3.setText(str);
            imageView5.setVisibility(0);
            imageView5.setOnClickListener(new o(str));
            this.A.f113999s.addView(viewInflate3);
        }
    }

    static /* synthetic */ void b5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30322, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.o8();
    }

    private String b7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30234, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (getArguments() != null && !com.max.hbcommon.utils.c.u(getArguments().getString("h_src"))) {
            return getArguments().getString("h_src");
        }
        Activity activity = this.mContext;
        if (activity instanceof PostTabActivity) {
            return ((PostTabActivity) activity).n2();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30284, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d9();
    }

    private void b9(List<BBSTextObj> list, String str) {
        if (PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 30238, new Class[]{List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f82381t = new LoadingDialog(this.mContext, getString(R.string.commiting), true).r();
        ArrayList arrayList = new ArrayList();
        for (BBSTextObj bBSTextObj : list) {
            if (com.max.hbcommon.utils.c.u(bBSTextObj.getUrl())) {
                arrayList.add(bBSTextObj.getText());
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            com.max.xiaoheihe.utils.a0.g().d(f82355x4);
        } else {
            com.max.xiaoheihe.module.upload.g.h(this.mContext, getCompositeDisposable(), arrayList, str, new d0());
        }
    }

    static /* synthetic */ void c6(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30339, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.l7();
    }

    @SuppressLint({"AutoDispose"})
    private void c7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30161, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30283, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        F6(Action.SAVE_BEFORE_EXIT, null, null);
    }

    private void c9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30240, new Class[0], Void.TYPE).isSupported || this.f82388y.getPostSettingObj() == null || this.f82388y.getPostSettingObj().getThumbImageObj() == null || this.f82388y.getPostSettingObj().getThumbImageObj().getPath() == null || this.f82388y.getPostSettingObj().getThumbImageObj().getUrl() != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f82388y.getPostSettingObj().getThumbImageObj().getPath());
        com.max.xiaoheihe.module.upload.g.h(this.mContext, getCompositeDisposable(), arrayList, "bbs", new f0());
    }

    private String d7() {
        StringBuilder sb2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30197, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.F)) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            for (int i10 = 0; i10 < this.F.size(); i10++) {
                if (i10 != 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(this.F.get(i10).getTopic_id());
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d8(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30293, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
        z6();
    }

    private void d9() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30239, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f82381t;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.f82381t = new LoadingDialog(this.mContext, getString(R.string.commiting), true).r();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.H);
        com.max.xiaoheihe.module.upload.g.h(this.mContext, getCompositeDisposable(), arrayList, "bbs", new e0());
    }

    private void e7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30159, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        com.max.xiaoheihe.module.bbs.b0 b0VarF = com.max.xiaoheihe.module.bbs.b0.f();
        if (!com.max.hbcommon.utils.c.w(this.F)) {
            for (BBSTopicObj bBSTopicObj : this.F) {
                if (com.max.hbcommon.utils.c.u(bBSTopicObj.getName()) || com.max.hbcommon.utils.c.u(bBSTopicObj.getPic_url())) {
                    BBSTopicObj bBSTopicObjE = b0VarF.e(bBSTopicObj.getTopic_id());
                    if (bBSTopicObjE != null) {
                        bBSTopicObj.setName(bBSTopicObjE.getName());
                        bBSTopicObj.setPic_url(bBSTopicObjE.getPic_url());
                    } else {
                        arrayList.add(bBSTopicObj.getTopic_id());
                    }
                }
            }
        }
        if (!com.max.hbcommon.utils.c.u(this.P)) {
            BBSTopicObj bBSTopicObjE2 = b0VarF.e(this.P);
            if (bBSTopicObjE2 == null) {
                arrayList.add(this.P);
                BBSTopicObj bBSTopicObj2 = new BBSTopicObj();
                bBSTopicObj2.setTopic_id(this.P);
                this.F.add(bBSTopicObj2);
            } else {
                this.F.add(bBSTopicObjE2);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : arrayList) {
                if (sb2.length() > 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str);
            }
            f7(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e8(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 30292, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
        B8();
    }

    private ValueAnimator e9(final View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 30253, new Class[]{View.class, Integer.TYPE}, ValueAnimator.class);
        if (patchProxyResultProxy.isSupported) {
            return (ValueAnimator) patchProxyResultProxy.result;
        }
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.height, i10);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f82960b.f8(layoutParams, view, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }

    @SuppressLint({"AutoDispose"})
    private void f7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30160, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f8(ViewGroup.LayoutParams layoutParams, View view, ValueAnimator valueAnimator) {
        if (!PatchProxy.proxy(new Object[]{layoutParams, view, valueAnimator}, this, changeQuickRedirect, false, 30280, new Class[]{ViewGroup.LayoutParams.class, View.class, ValueAnimator.class}, Void.TYPE).isSupported && isActive()) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                layoutParams.height = ((Integer) animatedValue).intValue();
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static String g7(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 30140, new Class[]{Context.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : PictureCacheManager.f75668a.l();
    }

    private void g8(SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder}, this, changeQuickRedirect, false, 30204, new Class[]{SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.A.f113985e.hasFocus()) {
            new mc.b(this.mContext, spannableStringBuilder, (int) this.A.f113985e.getPaint().getTextSize()).a();
        } else {
            this.f82373o += new mc.b(this.mContext, spannableStringBuilder, (int) this.A.f113984d.getPaint().getTextSize()).a();
        }
    }

    static /* synthetic */ void h5(PictureVideoEditPostFragment pictureVideoEditPostFragment, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, keyDescObj}, null, changeQuickRedirect, true, 30323, new Class[]{PictureVideoEditPostFragment.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.I8(keyDescObj);
    }

    private void h7(String str, boolean z10, boolean z11) {
        boolean z12 = true;
        Object[] objArr = {str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30246, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        t6();
        try {
            this.J = str;
            this.A.f113982b.setVisibility(0);
            this.A.M.setVisibility(0);
            this.A.L.setVisibility(8);
            com.max.mediaselector.lib.entity.b bVarP = com.max.mediaselector.lib.utils.l.p(this.mContext, str);
            com.max.mediaselector.lib.entity.b bVarQ = com.max.mediaselector.lib.utils.l.q(this.mContext, str);
            this.f82364f = bVarP.e();
            this.f82365g = bVarP.b();
            this.f82366h = bVarP.a();
            if (bVarP.b() <= bVarP.e()) {
                z12 = false;
            }
            O8(z12);
            this.A.A.setText(com.max.mediaselector.lib.utils.g.c(bVarP.a()));
            if (z11) {
                u6(bVarQ.d());
            }
            if (z10) {
                this.L = false;
                this.M = false;
                com.max.xiaoheihe.module.upload.c.u(this.mContext, getCompositeDisposable(), str, new k0());
            }
        } catch (Throwable unused) {
        }
    }

    private void h8(Context context, List<LocalMedia> list) {
        if (PatchProxy.proxy(new Object[]{context, list}, this, changeQuickRedirect, false, 30256, new Class[]{Context.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<LocalMedia> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.fromFile(new File(it.next().G())));
        }
        File file = new File(g7(this.mContext));
        if (!file.exists()) {
            file.mkdirs();
        }
        ArrayList<Draft> draft = UCrop.getDraft(arrayList);
        if (draft != null && !draft.isEmpty()) {
            new com.max.hbcommon.view.a.f(context).l("检测到未完成的编辑，是否继续？").u("是", new o0(arrayList, file, draft)).o("否", new n0(arrayList, file)).F();
            return;
        }
        UCrop uCropOf = UCrop.of((ArrayList<Uri>) arrayList, Uri.fromFile(file));
        uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_SHOW_FILTER, "0");
        uCropOf.startWithType(this.mContext, this, 1);
    }

    private void i8(String str) {
        char c10;
        int i10;
        char c11;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30205, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Pattern patternCompile = Pattern.compile("</?p>");
        for (Matcher matcher = patternCompile.matcher(spannableStringBuilder); matcher.find(); matcher = patternCompile.matcher(spannableStringBuilder)) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), "");
        }
        g8(spannableStringBuilder);
        Matcher matcher2 = Pattern.compile("#(?!#|heybox:)(((?!heybox:|\\[.+?]).)*?)#(?!heybox:)").matcher(spannableStringBuilder);
        while (true) {
            c10 = '!';
            if (!matcher2.find()) {
                break;
            }
            matcher2.group(1);
            HighlightInfo highlightInfo = new HighlightInfo("info_hashtag", matcher2.start(), matcher2.group(0));
            this.f82379r.put(Integer.valueOf(highlightInfo.getStart()), highlightInfo);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.click_blue)), highlightInfo.getStart(), highlightInfo.getEnd(), 33);
        }
        Pattern patternCompile2 = Pattern.compile("(<a.?data-user-id=\\\"(.*?)\\\".*?>(@.*?)</a>)");
        Matcher matcher3 = patternCompile2.matcher(spannableStringBuilder);
        while (true) {
            i10 = 2;
            if (!matcher3.find()) {
                break;
            }
            HighlightInfo highlightInfo2 = new HighlightInfo("info_at", matcher3.start(), matcher3.group(3), matcher3.group(2));
            spannableStringBuilder.replace(matcher3.start(), matcher3.end(), "");
            k8(matcher3.start(), matcher3.group(3).length() - matcher3.group(0).length());
            int start = highlightInfo2.getStart();
            this.f82379r.put(Integer.valueOf(start), highlightInfo2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(highlightInfo2.getName());
            spannableStringBuilder2.setSpan(com.max.xiaoheihe.accelworld.e.b(this.mContext, highlightInfo2.getName(), this.A.f113984d.getTextSize()), 0, spannableStringBuilder2.length(), 33);
            this.f82373o++;
            spannableStringBuilder.insert(start, (CharSequence) spannableStringBuilder2);
            matcher3 = patternCompile2.matcher(spannableStringBuilder);
        }
        Pattern patternCompile3 = Pattern.compile("(<a.*?data-urls=\\\"(.*?)\\\".*?>(.*?)</a>)");
        for (Matcher matcher4 = patternCompile3.matcher(spannableStringBuilder); matcher4.find(); matcher4 = patternCompile3.matcher(spannableStringBuilder)) {
            HighlightInfo highlightInfo3 = new HighlightInfo("info_img", matcher4.start(), "图" + matcher4.group(3), matcher4.group(2));
            spannableStringBuilder.replace(matcher4.start(), matcher4.end(), "");
            k8(matcher4.start(), (matcher4.group(3).length() + 1) - matcher4.group(0).length());
            int start2 = highlightInfo3.getStart();
            this.f82379r.put(Integer.valueOf(start2), highlightInfo3);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(highlightInfo3.getName());
            Drawable drawable = getResources().getDrawable(R.drawable.ic_0icon_format_pic_16);
            drawable.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, ViewUtils.f(this.mContext, 16.0f), ViewUtils.f(this.mContext, 16.0f));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.setSpan(new com.max.hbcustomview.spans.b(drawable, 0), 0, 1, 33);
            this.f82373o += spannableStringBuilder3.length();
            spannableStringBuilder.insert(start2, (CharSequence) spannableStringBuilder3);
        }
        Pattern patternCompile4 = Pattern.compile(com.max.xiaoheihe.module.expression.core.a.f83581a);
        Matcher matcher5 = patternCompile4.matcher(spannableStringBuilder);
        while (matcher5.find()) {
            Map<String, String> mapE = AccelWorldStringKt.e(matcher5.group(1));
            if ("text".equals(mapE.get("data-link-type"))) {
                String str2 = mapE.get("href");
                String str3 = mapE.get("icon-url");
                String strGroup = matcher5.group(i10);
                HighlightInfo highlightInfo4 = new HighlightInfo(f82354w4, matcher5.start(), "图" + strGroup, str2);
                spannableStringBuilder.replace(matcher5.start(), matcher5.end(), "");
                k8(matcher5.start(), (strGroup.length() + 1) - matcher5.group(0).length());
                int start3 = highlightInfo4.getStart();
                this.f82379r.put(Integer.valueOf(start3), highlightInfo4);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(highlightInfo4.getName());
                spannableStringBuilder4.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder4.length(), 33);
                int iF = ViewUtils.f(this.mContext, 3.0f);
                if (com.max.hbcommon.utils.c.u(str3)) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.common_article);
                    drawable2.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
                    drawable2.setBounds(0, 0, ViewUtils.f(this.mContext, 13.0f), ViewUtils.f(this.mContext, 13.0f));
                    com.max.hbcustomview.spans.b bVar = new com.max.hbcustomview.spans.b(drawable2, 0, 0, iF);
                    c11 = '!';
                    spannableStringBuilder4.setSpan(bVar, 0, 1, 33);
                } else {
                    int iF2 = ViewUtils.f(this.mContext, 14.0f);
                    AsyncCenterImageSpan asyncCenterImageSpan = new AsyncCenterImageSpan(this.mContext, str3, this.A.f113984d, iF2, iF2, 0, iF, 0, 0);
                    c11 = '!';
                    spannableStringBuilder4.setSpan(asyncCenterImageSpan, 0, 1, 33);
                }
                this.f82373o += spannableStringBuilder4.length();
                spannableStringBuilder.insert(start3, (CharSequence) spannableStringBuilder4);
                matcher5 = patternCompile4.matcher(spannableStringBuilder);
            } else {
                c11 = c10;
            }
            c10 = c11;
            i10 = 2;
        }
        this.f82369k = true;
        this.A.f113984d.setText(spannableStringBuilder);
        this.f82369k = false;
        this.f82372n = this.A.f113984d.getText().length();
        this.A.f113984d.requestFocus();
        this.A.f113984d.setSelection(0);
    }

    private void j1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30194, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (PictureVideoPostEditSlice.A(this.f82370l)) {
            Z8();
        } else {
            a9();
        }
    }

    static /* synthetic */ void j5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30324, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.G8();
    }

    private void j7() {
        ActivityPostSettingViewModel activityPostSettingViewModel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30206, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f82370l = (POST_EDIT_TYPE) arguments.getSerializable(f82332a4);
            this.f82388y = (PictureVideoLinkDraftObj) arguments.getSerializable(Z3);
            this.X = arguments.getInt(f82339h4);
            String string = arguments.getString(f82337f4);
            if (!com.max.hbcommon.utils.c.u(string)) {
                this.U = com.max.hbcommon.utils.c.x(string);
            }
            this.W = (HBShareReportData) com.max.hbutils.utils.k.a(arguments.getString(f82338g4), HBShareReportData.class);
            if (this.f82370l == null) {
                this.f82370l = POST_EDIT_TYPE.POST_PICTURE;
            }
            if (this.f82388y == null) {
                this.f82388y = new PictureVideoLinkDraftObj();
            } else if (arguments.containsKey(f82340i4)) {
                p6(arguments.getString(f82340i4), this.f82388y.getImgPathList());
            }
            String[] stringArray = arguments.getStringArray(f82350s4);
            if (stringArray != null) {
                for (String str : stringArray) {
                    n6(str);
                }
            }
            this.f82391z = arguments.getString(f82349r4);
            this.O = arguments.getBoolean(f82333b4, false);
            this.P = arguments.getString(f82334c4, null);
            String string2 = arguments.getString(f82336e4);
            boolean z10 = arguments.getBoolean(f82335d4, false);
            TextView textView = this.A.E;
            Activity activity = this.mContext;
            textView.setBackground(com.max.hbutils.utils.q.o(activity, R.color.post_picture_tip_blue, ViewUtils.h0(activity, ViewUtils.o(activity, textView))));
            if (!com.max.hbcommon.utils.c.u(string2)) {
                this.A.E.setVisibility(0);
                this.A.E.setText(string2);
            } else if (z10) {
                this.A.E.setVisibility(0);
                this.A.E.setText(R.string.post_add_picture_tip);
            } else {
                this.A.E.setVisibility(8);
            }
            HashMap<String, String> map = (HashMap) arguments.getSerializable("extra_params");
            this.R = map;
            if (map != null) {
                this.T = map.containsKey("cate_id");
            }
            this.T = this.T || com.max.hbcommon.utils.c.x(arguments.getString(NewLinkEditFragment.f82066i5)) || arguments.getInt(NewLinkEditFragment.f82066i5, 0) == 1;
            Serializable serializable = arguments.getSerializable(NewLinkEditFragment.f82063f5);
            if (serializable != null) {
                this.S = (PostBtnObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(serializable), PostBtnObj.class);
            }
            this.V = arguments.getString(f82341j4);
            if (this.f82388y.getPostSettingObj() != null && B7()) {
                this.T3 = this.f82388y.getPostSettingObj().getSchedulePostTimeMs();
            }
            this.G3 = arguments.getString("source", null);
            this.J3 = (JsonObject) com.max.hbutils.utils.k.a(arguments.getString(PostTabActivity.J3), JsonObject.class);
        } else {
            if (this.f82370l == null) {
                this.f82370l = POST_EDIT_TYPE.POST_PICTURE;
            }
            if (this.f82388y == null) {
                this.f82388y = new PictureVideoLinkDraftObj();
            }
        }
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getCheckedTopics())) {
            this.F.addAll(this.f82388y.getCheckedTopics());
            j1();
        }
        if (!com.max.hbcommon.utils.c.u(this.f82388y.getOriginCompilationId()) && (activityPostSettingViewModel = this.V3) != null) {
            activityPostSettingViewModel.v(this.f82388y.getOriginCompilationId());
        }
        this.A.f113984d.setText(this.f82388y.getDefault_content());
    }

    private void j8(List<LocalMedia> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30255, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strG = list.get(i10).G();
            String strC = com.max.mediaselector.lib.utils.g.c(list.get(i10).w());
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setType("video");
            bBSTextObj.setText(strG);
            bBSTextObj.setDuration(strC);
            this.f82388y.getImgPathList().add(bBSTextObj);
            this.f82384w.notifyItemChanged(this.D);
        }
    }

    private void k7(Activity activity) {
        View viewPeekDecorView;
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 30199, new Class[]{Activity.class}, Void.TYPE).isSupported || activity == null || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null || viewPeekDecorView.getWindowToken() == null) {
            return;
        }
        this.f82368j = ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
    }

    private void k8(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30170, new Class[]{cls, cls}, Void.TYPE).isSupported || this.f82379r.size() == 0 || i11 == 0) {
            return;
        }
        ArrayList<HighlightInfo> arrayList = new ArrayList();
        Iterator<Integer> it = this.f82379r.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() >= i10) {
                HighlightInfo highlightInfo = this.f82379r.get(next);
                highlightInfo.setStart(next.intValue() + i11);
                arrayList.add(highlightInfo);
                it.remove();
            }
        }
        for (HighlightInfo highlightInfo2 : arrayList) {
            this.f82379r.put(Integer.valueOf(highlightInfo2.getStart()), highlightInfo2);
        }
    }

    private void l7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30247, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new l0());
        valueAnimatorOfFloat.start();
    }

    private void l8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30152, new Class[0], Void.TYPE).isSupported && !this.f82377p3 && this.O && (this.mContext instanceof PostTabActivity)) {
            PostTabActivityViewModel postTabActivityViewModel = this.f82389y1;
            if (postTabActivityViewModel != null) {
                postTabActivityViewModel.B();
            }
            this.f82376p2.H(true);
            this.f82377p3 = true;
        }
    }

    static /* synthetic */ void m5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30325, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.z6();
    }

    private void m6(GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 30181, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setImg(gameObj.getImage());
        keyDescObj.setTitle(AllRecommendGameCategoryObj.STYLE_GAME);
        keyDescObj.setDesc(gameObj.getName());
        keyDescObj.setIconId(R.drawable.bbs_game_filled_24x24);
        keyDescObj.setId(gameObj.getAppid());
        keyDescObj.setChecked(true);
        this.f82375p1.add(keyDescObj);
    }

    private void m7() {
        ActivityPostSettingViewModel activityPostSettingViewModel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30150, new Class[0], Void.TYPE).isSupported || (activityPostSettingViewModel = this.V3) == null) {
            return;
        }
        activityPostSettingViewModel.r().k(this, new g0());
        this.V3.o().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.z
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                this.f83175a.D7((Integer) obj);
            }
        });
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        if (pictureVideoLinkDraftObj != null && pictureVideoLinkDraftObj.getSelectedDraftCompilation() != null) {
            this.V3.v(this.f82388y.getSelectedDraftCompilation().getObj_id());
        }
        this.V3.w(false, new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.k0
            @Override // yh.a
            public final Object invoke() {
                return Boolean.valueOf(this.f83001b.isActive());
            }
        });
    }

    private void m8(@androidx.annotation.p0 yh.a<b2> aVar) {
        PostTabActivityViewModel postTabActivityViewModel;
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 30153, new Class[]{yh.a.class}, Void.TYPE).isSupported || (postTabActivityViewModel = this.f82389y1) == null) {
            return;
        }
        postTabActivityViewModel.G(false, aVar);
    }

    static /* synthetic */ void n5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30326, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.l8();
    }

    private void n6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30208, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.f82388y.getHashtagList().add(str);
    }

    private void n7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30151, new Class[0], Void.TYPE).isSupported || this.f82370l == POST_EDIT_TYPE.POST_VIDEO) {
            return;
        }
        ScrollView scrollView = this.A.f114005y;
        df.o oVar = this.A;
        j1.y2(scrollView, new com.max.xiaoheihe.module.bbs.utils.e(oVar.f114004x, oVar.f114001u));
    }

    private void o6(HighlightInfo highlightInfo) {
        if (PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 30167, new Class[]{HighlightInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        int start = highlightInfo.getStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(highlightInfo.getName());
        spannableStringBuilder.setSpan(com.max.xiaoheihe.accelworld.e.b(this.mContext, highlightInfo.getName(), this.A.f113984d.getTextSize()), 0, spannableStringBuilder.length(), 33);
        this.f82369k = true;
        if ("info_at".equals(highlightInfo.getType())) {
            this.f82373o++;
        }
        this.f82374p.insert(start, (CharSequence) spannableStringBuilder);
        this.A.f113984d.setSelection(spannableStringBuilder.length() + start);
        k8(start, spannableStringBuilder.length());
        this.f82379r.put(Integer.valueOf(start), highlightInfo);
        this.f82369k = false;
    }

    private void o7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f82388y.getTitle())) {
            this.A.f113985e.setText(this.f82388y.getTitle());
        }
        if (!com.max.hbcommon.utils.c.u(this.f82388y.getContent())) {
            i8(this.f82388y.getContent());
        }
        HighLikeCommentObj highLikeComment = this.f82388y.getHighLikeComment();
        if (highLikeComment == null || !HighLikeCommentObjKt.hasPostContent(highLikeComment)) {
            return;
        }
        this.A.f113984d.setText(highLikeComment.getPost_content());
    }

    private void o8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30243, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l8();
        PermissionManager.f71603a.R(this, (AppCompatActivity) this.mContext, new h0());
    }

    private void p6(String str, List<BBSTextObj> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 30207, new Class[]{String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null || str.isEmpty()) {
            com.max.heybox.hblog.g.G("[PictureVideoEditPostFragment][addPostOrderImgSrc] invalid imgSrc: " + str);
            return;
        }
        if (list == null || list.isEmpty()) {
            com.max.heybox.hblog.g.G("[PictureVideoEditPostFragment][addPostOrderImgSrc] invalid imgPathList: " + list);
            return;
        }
        BBSTextObj bBSTextObj = list.get(0);
        if (bBSTextObj == null) {
            com.max.heybox.hblog.g.G("[PictureVideoEditPostFragment][addPostOrderImgSrc] invalid postOrderImgObj: " + bBSTextObj);
            return;
        }
        String text = bBSTextObj.getText();
        if (text != null && !text.isEmpty()) {
            bb.a.f30446a.put(com.max.hbutils.utils.s.b(new File(text)), str);
            this.f82387x2 = str;
        } else {
            com.max.heybox.hblog.g.G("[PictureVideoEditPostFragment][addPostOrderImgSrc] invalid filePath: " + text);
        }
    }

    private void p7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30203, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82374p = (SpannableStringBuilder) this.A.f113984d.getText();
        this.A.f113985e.addTextChangedListener(new p());
        this.A.f113985e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.i0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f82999b.E7(view, z10);
            }
        });
        this.A.f113984d.addTextChangedListener(new q());
        this.A.f113984d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.j0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f83000b.F7(view, z10);
            }
        });
    }

    private void p8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.W(this, (AppCompatActivity) this.mContext, new i0());
    }

    static /* synthetic */ int q5(PictureVideoEditPostFragment pictureVideoEditPostFragment, int i10) {
        int i11 = pictureVideoEditPostFragment.f82373o - i10;
        pictureVideoEditPostFragment.f82373o = i11;
        return i11;
    }

    private void q6(LinkToolCardObj linkToolCardObj) {
        if (PatchProxy.proxy(new Object[]{linkToolCardObj}, this, changeQuickRedirect, false, 30182, new Class[]{LinkToolCardObj.class}, Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setIcon(linkToolCardObj.getIcon());
        keyDescObj.setImg(linkToolCardObj.getImage());
        keyDescObj.setTitle(linkToolCardObj.getTitle());
        keyDescObj.setDesc(linkToolCardObj.getText());
        keyDescObj.setId(linkToolCardObj.getCard_id());
        keyDescObj.setChecked(false);
        this.f82375p1.add(keyDescObj);
    }

    private void q7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30149, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82376p2.y().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.y
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                this.f83174a.G7((m) obj);
            }
        });
        this.f82376p2.z().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.a0
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                this.f82827a.H7((Result) obj);
            }
        });
    }

    private void q8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30187, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l8();
        startActivityForResult(AddAtUserActivity.N1(this.mContext, com.max.xiaoheihe.utils.i0.j()), 100);
    }

    static /* synthetic */ boolean r5(PictureVideoEditPostFragment pictureVideoEditPostFragment, int i10, int i11) {
        Object[] objArr = {pictureVideoEditPostFragment, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30327, new Class[]{PictureVideoEditPostFragment.class, cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : pictureVideoEditPostFragment.y6(i10, i11);
    }

    private void r6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30254, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.A.f113983c.getRoot().setVisibility(0);
        } else {
            this.A.f113983c.getRoot().setVisibility(8);
        }
    }

    private void r7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30179, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.A.f114003w.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        this.A.f114003w.setLayoutManager(linearLayoutManager);
        i iVar = new i(this.mContext, this.f82375p1, R.layout.item_post_game_and_tool_card);
        this.f82385x = iVar;
        this.A.f114003w.setAdapter(iVar);
        if (PictureVideoPostEditSlice.A(this.f82370l)) {
            ViewGroup.LayoutParams layoutParams = this.A.f114003w.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = ViewUtils.f(this.mContext, 6.0f);
                this.A.f114003w.setLayoutParams(marginLayoutParams);
            }
        }
        G8();
    }

    private void r8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30186, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l8();
        if (this.f82367i) {
            this.f82367i = false;
            com.max.hbexpression.q qVar = this.f82380s;
            if (qVar != null) {
                qVar.C();
            }
            S8(this.mContext);
            s6(false);
            return;
        }
        if (!x6()) {
            m8(new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.r
                @Override // yh.a
                public final Object invoke() {
                    return this.f83159b.P7();
                }
            });
            return;
        }
        k7(this.mContext);
        K8();
        r6(true);
        s6(true);
    }

    static /* synthetic */ void s5(PictureVideoEditPostFragment pictureVideoEditPostFragment, int i10, int i11, Spannable spannable) {
        Object[] objArr = {pictureVideoEditPostFragment, new Integer(i10), new Integer(i11), spannable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30328, new Class[]{PictureVideoEditPostFragment.class, cls, cls, Spannable.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.J8(i10, i11, spannable);
    }

    private void s6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30252, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f82370l == POST_EDIT_TYPE.POST_VIDEO) {
            return;
        }
        int iF = ViewUtils.f(this.mContext, 102.0f);
        if (z10) {
            iF = ViewUtils.f(this.mContext, 70.0f);
        }
        ValueAnimator valueAnimatorE9 = e9(this.A.f114004x, iF);
        ImageView imageView = (ImageView) this.B.findViewById(R.id.iv_add);
        int iF2 = ViewUtils.f(this.mContext, 24.0f);
        if (z10) {
            iF2 = ViewUtils.f(this.mContext, 18.0f);
        }
        ValueAnimator valueAnimatorE10 = e9(imageView, iF2);
        if (valueAnimatorE9 == null || valueAnimatorE10 == null) {
            return;
        }
        AnimatorSet animatorSet = this.S3;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.S3 = animatorSet2;
        animatorSet2.playTogether(valueAnimatorE9, valueAnimatorE10);
        this.S3.setDuration(300L);
        this.S3.setStartDelay(300L);
        this.S3.start();
    }

    private void s7(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30211, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PostBtnObj postBtnObj = this.S;
        if (postBtnObj == null || com.max.hbcommon.utils.c.u(postBtnObj.getText())) {
            int i10 = q0.f82452a[this.f82370l.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    this.mTitleBar.setTitle(R.string.post);
                } else if (z10 && this.O) {
                    this.mTitleBar.setTitle(R.string.post_picture);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("图文 \uf0d7");
                    spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), 3, spannableStringBuilder.length(), 33);
                    this.mTitleBar.getAppbarTitleTextView().setText(spannableStringBuilder);
                    this.mTitleBar.getAppbarTitleTextView().setOnClickListener(new r());
                } else {
                    this.mTitleBar.setTitle(R.string.post_picture);
                    this.mTitleBar.getAppbarTitleTextView().setOnClickListener(null);
                }
            } else if (z10 && this.O) {
                this.mTitleBar.setTitle(R.string.post_video);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("视频 \uf0d7");
                spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(0)), 3, spannableStringBuilder2.length(), 33);
                this.mTitleBar.getAppbarTitleTextView().setText(spannableStringBuilder2);
                this.mTitleBar.getAppbarTitleTextView().setOnClickListener(new s());
            } else {
                this.mTitleBar.setTitle(R.string.post_video);
                this.mTitleBar.getAppbarTitleTextView().setOnClickListener(null);
            }
        } else {
            this.mTitleBar.setTitle(this.S.getText());
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83169b.I7(view);
            }
        };
        this.mTitleBar.setNavigationOnClickListener(new t());
        this.mTitleBar.getAppbarActionTextView().setVisibility(0);
        int iQ = com.max.hbutils.utils.n.q(this.f82357a0);
        String str = "";
        if (this.O) {
            if (!z10 || (this.f82357a0 != null && iQ == 0)) {
                this.mTitleBar.getAppbarActionTextView().setText(R.string.post);
                this.mTitleBar.setActionOnClickListener(onClickListener);
                return;
            }
            TextView appbarActionTextView = this.mTitleBar.getAppbarActionTextView();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.mContext.getResources().getText(R.string.draft));
            if (iQ > 0) {
                str = " " + iQ;
            }
            sb2.append(str);
            appbarActionTextView.setText(sb2.toString());
            this.mTitleBar.setActionOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.post_edit.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f83173b.J7(view);
                }
            });
            return;
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        if (!this.T) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) this.mContext.getResources().getText(R.string.draft));
            if (iQ > 0) {
                str = " " + iQ;
            }
            sb3.append(str);
            sb3.append("  ");
            spannableStringBuilder3.append((CharSequence) sb3.toString());
            spannableStringBuilder3.setSpan(new u(this.mContext.getResources().getColor(R.color.btn_text_primary_1_color)), 0, spannableStringBuilder3.length(), 33);
        }
        spannableStringBuilder3.append((CharSequence) getString(R.string.post));
        this.mTitleBar.getAppbarActionTextView().setText(spannableStringBuilder3);
        this.mTitleBar.getAppbarActionTextView().setMovementMethod(LinkMovementMethod.getInstance());
        this.mTitleBar.setActionOnClickListener(onClickListener);
        this.mTitleBarDivider.setVisibility(0);
    }

    private void s8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30185, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l8();
        int i10 = this.f82370l == POST_EDIT_TYPE.POST_VIDEO ? 1 : 10;
        if (this.f82388y.getGameList() == null || this.f82388y.getGameList().size() < i10) {
            com.max.xiaoheihe.base.router.b.x0(this.mContext, com.max.xiaoheihe.module.search.page.e.M.a(true)).C(1001).A();
        } else {
            com.max.hbutils.utils.c.f("游戏卡片数量已达上限");
        }
    }

    static /* synthetic */ void t5(PictureVideoEditPostFragment pictureVideoEditPostFragment, int i10, int i11) {
        Object[] objArr = {pictureVideoEditPostFragment, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30329, new Class[]{PictureVideoEditPostFragment.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.k8(i10, i11);
    }

    private void t6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30225, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.J)) {
            return;
        }
        com.max.xiaoheihe.module.upload.g.e(this.J);
        this.M = true;
    }

    private void t7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30177, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = q0.f82452a[this.f82370l.ordinal()];
        if (i10 == 1) {
            this.A.S.setVisibility(0);
            this.A.f114004x.setVisibility(8);
            this.A.M.setOnClickListener(new b());
            this.A.f113982b.setOnClickListener(new c());
            this.A.L.setOnClickListener(new d());
            this.L = !com.max.hbcommon.utils.c.u(this.f82388y.getVideo_url());
            this.K = this.f82388y.getVideo_url();
            this.I = this.f82388y.getVideo_thumb();
            if (!com.max.hbcommon.utils.c.u(this.f82388y.getVideo_local_path()) && new File(this.f82388y.getVideo_local_path()).exists()) {
                h7(this.f82388y.getVideo_local_path(), com.max.hbcommon.utils.c.u(this.f82388y.getVideo_url()), com.max.hbcommon.utils.c.u(this.f82388y.getVideo_thumb()));
                com.max.hbimage.b.K(this.f82388y.getVideo_thumb(), this.A.f113996p);
                return;
            } else if (com.max.hbcommon.utils.c.u(this.f82388y.getVideo_url())) {
                this.A.L.setVisibility(0);
                this.A.f113982b.setVisibility(8);
                this.A.M.setVisibility(8);
                return;
            } else {
                this.A.L.setVisibility(8);
                this.A.f113982b.setVisibility(0);
                this.A.M.setVisibility(0);
                this.A.A.setText(com.max.mediaselector.lib.utils.g.c(com.max.hbutils.utils.n.r(this.f82388y.getVideo_duration())));
                com.max.hbimage.b.X(this.mContext, this.A.f113996p, this.f82388y.getVideo_thumb(), new e());
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        this.A.S.setVisibility(8);
        this.A.f114004x.setVisibility(0);
        this.A.f114004x.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        this.A.f114004x.setLayoutManager(linearLayoutManager);
        HighLikeCommentObj highLikeComment = this.f82388y.getHighLikeComment();
        if (highLikeComment != null) {
            if (HighLikeCommentObjKt.hasThumb(highLikeComment)) {
                ArrayList<BBSTextObj> bBSTextObjList = HighLikeCommentObjKt.getBBSTextObjList(highLikeComment);
                if (this.f82388y.getImgPathList() == null) {
                    this.f82388y.setImgPathList(bBSTextObjList);
                } else {
                    this.f82388y.getImgPathList().addAll(bBSTextObjList);
                }
            }
            if (HighLikeCommentObjKt.hasText(highLikeComment) && this.f82388y.getImgPathList().isEmpty()) {
                ArrayList<BBSTextObj> commentBBSTextObjList = HighLikeCommentObjKt.getCommentBBSTextObjList(highLikeComment);
                if (this.f82388y.getImgPathList() == null) {
                    this.f82388y.setImgPathList(commentBBSTextObjList);
                } else {
                    this.f82388y.getImgPathList().addAll(commentBBSTextObjList);
                }
            }
        }
        if (!com.max.hbcommon.utils.c.w(this.f82388y.getImgPathList())) {
            String text = this.f82388y.getImgPathList().get(0).getText();
            if (!com.max.hbcommon.utils.c.u(text)) {
                File file = new File(text);
                if (file.exists()) {
                    String str = bb.a.f30446a.get(com.max.hbutils.utils.s.b(file));
                    if (!com.max.hbcommon.utils.c.u(str) && !str.equals(this.f82387x2)) {
                        U6(str);
                    }
                }
            }
        }
        f fVar = new f(this.mContext, this.f82388y.getImgPathList(), R.layout.item_concept_post_image);
        this.f82383v = fVar;
        this.f82384w = new com.max.hbcommon.base.adapter.t(fVar);
        View viewInflate = getLayoutInflater().inflate(R.layout.item_concept_post_image, (ViewGroup) this.A.f114004x, false);
        this.B = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        ImageView imageView2 = (ImageView) this.B.findViewById(R.id.iv_add);
        this.B.findViewById(R.id.v_img_stroke).setVisibility(8);
        imageView2.setVisibility(0);
        imageView.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.mContext, R.color.background_card_1_color, 3.0f), this.mContext, R.color.divider_secondary_1_color, 0.5f));
        this.B.setOnClickListener(new g());
        this.f82384w.m(R.layout.item_concept_post_image, this.B);
        this.A.f114004x.setAdapter(this.f82384w);
        new ItemTouchHelper(new h(12, 3)).attachToRecyclerView(this.A.f114004x);
    }

    private void t8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30188, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l8();
        MMKVManager.f71329a.k(ad.e.f1248a, ad.e.f1253f, false, false);
        X8();
    }

    private void u6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30264, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.I = null;
        this.H = str;
        com.max.hbimage.b.K(str, this.A.f113996p);
        UploadInfoObj uploadInfoObjJ = com.max.xiaoheihe.module.upload.c.g().j(this.J);
        if (uploadInfoObjJ != null) {
            uploadInfoObjJ.setVideoThumbPath(this.H);
            com.max.xiaoheihe.module.upload.c.g().q();
        }
    }

    private void u7() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30184, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.hbcache.c.J0, "0")) && !PictureVideoPostEditSlice.A(this.f82370l)) {
            z10 = true;
        }
        if (z10) {
            this.f82385x.registerAdapterDataObserver(new j());
            this.f82386x1 = new RecommendedTopicsController(this, (RecommendTopicViewModel) new androidx.lifecycle.y0(this).a(RecommendTopicViewModel.class));
        }
    }

    private void u8(com.max.xiaoheihe.module.bbs.post_edit.e eVar) throws Throwable {
        com.max.mediaselector.lib.utils.f.a aVar;
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 30146, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.e.class}, Void.TYPE).isSupported) {
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.a) {
            if (this.L3 != null && (aVar = this.M3) != null) {
                aVar.e(new yh.p() { // from class: com.max.xiaoheihe.module.bbs.post_edit.h0
                    @Override // yh.p
                    public final Object invoke(Object obj, Object obj2) {
                        return this.f82986b.Q7((Uri) obj, (Boolean) obj2);
                    }
                });
                com.max.mediaselector.lib.utils.f.c(this, this.L3, this.M3);
            }
            m8(null);
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.b) {
            this.Y = 3;
            H6();
            m8(null);
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.c) {
            com.max.xiaoheihe.module.bbs.post_edit.e.c cVar = (com.max.xiaoheihe.module.bbs.post_edit.e.c) eVar;
            int iF = cVar.f();
            LocalMedia localMediaE = cVar.e();
            if (iF == 0) {
                BBSTextObj bBSTextObjV6 = V6(localMediaE.I(), null);
                PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
                if (pictureVideoLinkDraftObj == null || pictureVideoLinkDraftObj.getImgPathList() == null || bBSTextObjV6 == null) {
                    return;
                }
                this.f82388y.getImgPathList().add(bBSTextObjV6);
                this.f82384w.notifyItemInserted(this.f82388y.getImgPathList().indexOf(bBSTextObjV6));
                return;
            }
            if (iF == 1) {
                Uri uriI = localMediaE.I();
                PictureVideoLinkDraftObj pictureVideoLinkDraftObj2 = this.f82388y;
                if (pictureVideoLinkDraftObj2 == null || pictureVideoLinkDraftObj2.getImgPathList() == null) {
                    return;
                }
                for (int i10 = 0; i10 < this.f82388y.getImgPathList().size(); i10++) {
                    BBSTextObj bBSTextObj = this.f82388y.getImgPathList().get(i10);
                    if (bBSTextObj != null && !com.max.hbcommon.utils.c.u(bBSTextObj.getText()) && bBSTextObj.getText().equals(uriI.getPath())) {
                        this.f82388y.getImgPathList().remove(bBSTextObj);
                        this.f82384w.notifyItemRemoved(i10);
                    }
                }
            }
        }
    }

    private boolean v6(boolean[] zArr, int i10) {
        if (zArr == null || i10 >= zArr.length) {
            return false;
        }
        return zArr[i10];
    }

    private void v7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30210, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.A == null) {
            com.max.heybox.hblog.g.G("[initPostEditSlice] error status: binding is null");
            return;
        }
        PictureVideoPostEditSlice pictureVideoPostEditSlice = new PictureVideoPostEditSlice(this.mContext, this, this.f82376p2, this.f82370l, Boolean.valueOf(this.O));
        this.Q3 = pictureVideoPostEditSlice;
        pictureVideoPostEditSlice.c(this.A.b());
        this.Q3.b(new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.t
            @Override // yh.a
            public final Object invoke() {
                return this.f83163b.K7();
            }
        });
    }

    private void v8(boolean z10, Uri uri) throws Throwable {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), uri}, this, changeQuickRedirect, false, 30148, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            BBSTextObj bBSTextObjV6 = V6(uri, null);
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
            if (pictureVideoLinkDraftObj == null || pictureVideoLinkDraftObj.getImgPathList() == null || bBSTextObjV6 == null) {
                return;
            }
            this.f82388y.getImgPathList().add(bBSTextObjV6);
            this.f82384w.notifyItemInserted(this.f82388y.getImgPathList().indexOf(bBSTextObjV6));
            return;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj2 = this.f82388y;
        if (pictureVideoLinkDraftObj2 == null || pictureVideoLinkDraftObj2.getImgPathList() == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f82388y.getImgPathList().size(); i10++) {
            BBSTextObj bBSTextObj = this.f82388y.getImgPathList().get(i10);
            if (bBSTextObj != null && !com.max.hbcommon.utils.c.u(bBSTextObj.getText()) && bBSTextObj.getText().equals(uri.getPath())) {
                this.f82388y.getImgPathList().remove(bBSTextObj);
                this.f82384w.notifyItemRemoved(i10);
            }
        }
    }

    static /* synthetic */ void w4(PictureVideoEditPostFragment pictureVideoEditPostFragment, String str) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, str}, null, changeQuickRedirect, true, 30312, new Class[]{PictureVideoEditPostFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.H8(str);
    }

    private boolean w6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30213, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (ad.a.a(ad.a.f1214u, false)) {
            return false;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        return (pictureVideoLinkDraftObj == null || pictureVideoLinkDraftObj.getPostSettingObj() == null || !(Objects.equals(this.f82388y.getPostSettingObj().getView_limit(), "2") || Objects.equals(this.f82388y.getPostSettingObj().getView_limit(), "3"))) && com.max.hbcommon.utils.c.u(d7()) && com.max.hbcommon.utils.c.x(this.f82390y2);
    }

    private void w7() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30145, new Class[0], Void.TYPE).isSupported && (this.mContext instanceof PostTabActivity)) {
            PostTabActivityViewModel postTabActivityViewModel = (PostTabActivityViewModel) new androidx.lifecycle.y0(requireActivity()).a(PostTabActivityViewModel.class);
            this.f82389y1 = postTabActivityViewModel;
            postTabActivityViewModel.h().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.l0
                @Override // androidx.lifecycle.j0
                public final void a(Object obj) {
                    this.f83002a.L7((PostType) obj);
                }
            });
            if (this.f82389y1.v(this.G3)) {
                this.f82389y1.o().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.m0
                    @Override // androidx.lifecycle.j0
                    public final void a(Object obj) throws Throwable {
                        this.f83020a.M7((e) obj);
                    }
                });
                this.f82389y1.r().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.n0
                    @Override // androidx.lifecycle.j0
                    public final void a(Object obj) throws Throwable {
                        this.f83023a.N7((Pair) obj);
                    }
                });
                this.f82389y1.t().k(this, new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.post_edit.o0
                    @Override // androidx.lifecycle.j0
                    public final void a(Object obj) {
                        this.f83024a.O7((PostToolsV2TabType) obj);
                    }
                });
            }
        }
    }

    private void w8(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30230, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        L8(str);
        this.mContext.sendBroadcast(new Intent().setAction("com.heybox.refresh.topic"));
        this.mContext.sendBroadcast(new Intent().setAction(lb.a.f131043t));
        this.mContext.sendBroadcast(new Intent().setAction("com.max.xiaoheihe.post.gotop"));
        this.mContext.sendBroadcast(new Intent().setAction(lb.a.f130972h0).putExtra("link_id", str));
        androidx.localbroadcastmanager.content.a.b(this.mContext).d(new Intent(lb.a.Z));
        HashMap<String, String> map = this.R;
        if (map != null) {
            com.max.xiaoheihe.utils.d.u1(this.mContext, map);
        }
        HBShareReportData hBShareReportData = this.W;
        if (hBShareReportData != null) {
            com.max.hbshare.c.a(hBShareReportData.getSrc(), "2", com.max.hbshare.d.f72591m, this.W.getExtra());
        }
        PostTabActivityViewModel postTabActivityViewModel = this.f82389y1;
        if (postTabActivityViewModel != null) {
            postTabActivityViewModel.z();
        }
        if (!PostUtils.l() && !B7()) {
            A8(str);
            return;
        }
        if (!this.U || com.max.hbcommon.utils.c.u(str)) {
            U8();
        } else {
            new Handler().postDelayed(new c0(str), 200L);
        }
        this.mContext.finish();
    }

    private boolean x6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30202, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PostTabActivityViewModel postTabActivityViewModel = this.f82389y1;
        if (postTabActivityViewModel == null) {
            return true;
        }
        return Boolean.FALSE.equals(postTabActivityViewModel.u().f()) || !this.f82389y1.v(this.G3);
    }

    private void x7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30144, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f82370l == POST_EDIT_TYPE.POST_VIDEO) {
            this.O3 = new com.max.mediaselector.lib.utils.f.a();
            this.N3 = registerForActivityResult(new z.b.a(), this.O3);
        } else {
            this.M3 = new com.max.mediaselector.lib.utils.f.a();
            this.L3 = registerForActivityResult(new z.b.o(), this.M3);
        }
    }

    private void x8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30189, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f82388y.getPostSettingObj() == null || PostSettingObj.Companion.isPublic(this.f82388y.getPostSettingObj().getView_limit())) {
            z6();
        } else {
            new com.max.hbcommon.view.a.f(this.mContext).x(R.string.prompt).l("若要添加社区，则分享范围将被设置为公开发表").t(R.string.confirm, new m()).n(R.string.cancel, new l()).F();
        }
    }

    private boolean y6(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30169, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f82379r.size() != 0) {
            int i12 = i11 + i10;
            return this.f82379r.ceilingKey(Integer.valueOf(i12)) != null && this.f82379r.ceilingEntry(Integer.valueOf(i12)).getValue().getEnd() > i10;
        }
        return false;
    }

    private void y7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30143, new Class[0], Void.TYPE).isSupported || this.f82370l == POST_EDIT_TYPE.POST_VIDEO || this.A.E.getVisibility() == 0) {
            return;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        if (pictureVideoLinkDraftObj == null || com.max.hbcommon.utils.c.w(pictureVideoLinkDraftObj.getImgPathList())) {
            this.A.f114004x.setVisibility(8);
            v vVar = new v();
            this.P3 = vVar;
            com.max.hbcommon.base.adapter.t tVar = this.f82384w;
            if (tVar != null) {
                tVar.registerAdapterDataObserver(vVar);
            }
        }
    }

    private void y8(com.max.xiaoheihe.module.bbs.post_edit.e eVar) {
        com.max.mediaselector.lib.utils.f.a aVar;
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 30147, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.e.class}, Void.TYPE).isSupported) {
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.a) {
            if (this.N3 != null && (aVar = this.O3) != null) {
                aVar.e(new yh.p() { // from class: com.max.xiaoheihe.module.bbs.post_edit.d0
                    @Override // yh.p
                    public final Object invoke(Object obj, Object obj2) {
                        return this.f82947b.R7((Uri) obj, (Boolean) obj2);
                    }
                });
                com.max.mediaselector.lib.utils.f.e(this, this.N3, this.O3);
            }
            m8(null);
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.b) {
            H6();
            m8(null);
            return;
        }
        if (eVar instanceof com.max.xiaoheihe.module.bbs.post_edit.e.c) {
            com.max.xiaoheihe.module.bbs.post_edit.e.c cVar = (com.max.xiaoheihe.module.bbs.post_edit.e.c) eVar;
            int iF = cVar.f();
            LocalMedia localMediaE = cVar.e();
            if (iF == 0) {
                if (com.max.hbcommon.utils.c.u(localMediaE.H())) {
                    return;
                }
                h7(localMediaE.H(), true, true);
            } else if (iF == 1) {
                z8();
                t6();
                this.J = null;
                this.A.f113982b.setVisibility(8);
                this.A.M.setVisibility(8);
                this.A.L.setVisibility(0);
            }
        }
    }

    static /* synthetic */ void z4(PictureVideoEditPostFragment pictureVideoEditPostFragment, BBSTextObj bBSTextObj) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment, bBSTextObj}, null, changeQuickRedirect, true, 30313, new Class[]{PictureVideoEditPostFragment.class, BBSTextObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.V8(bBSTextObj);
    }

    static /* synthetic */ void z5(PictureVideoEditPostFragment pictureVideoEditPostFragment) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragment}, null, changeQuickRedirect, true, 30311, new Class[]{PictureVideoEditPostFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragment.F8();
    }

    private void z6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30190, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A6(false);
    }

    private void z7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30171, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        g8(spannableStringBuilder);
        if (this.A.f113985e.hasFocus()) {
            this.A.f113985e.getText().insert(this.A.f113985e.getSelectionEnd(), spannableStringBuilder);
        } else {
            this.A.f113984d.getText().insert(this.A.f113984d.getSelectionEnd(), spannableStringBuilder);
        }
    }

    private void z8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30224, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.J)) {
            return;
        }
        com.max.xiaoheihe.module.upload.g.g(this.J);
    }

    public void B6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30269, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureCacheManager.f75668a.b();
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.k
    public void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30215, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Z = false;
        if (isActive()) {
            s7(false);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.p0
    public List<String> J1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30276, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = this.f82388y;
        if (pictureVideoLinkDraftObj == null) {
            return null;
        }
        return pictureVideoLinkDraftObj.getHashtagList();
    }

    public void N8(String str) {
        this.f82357a0 = str;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.p0
    public List<BBSTopicObj> O2() {
        return this.F;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.n0
    public androidx.lifecycle.y P2() {
        return this;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.auto_save.d
    @androidx.annotation.n0
    public com.max.xiaoheihe.module.bbs.post_edit.auto_save.c<PostEditAutoSaveData> Q0() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30277, new Class[0], com.max.xiaoheihe.module.bbs.post_edit.auto_save.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.module.bbs.post_edit.auto_save.c) patchProxyResultProxy.result;
        }
        boolean zB7 = B7();
        if (getArguments() != null && getArguments().getBoolean(PostTabActivity.G2)) {
            z10 = true;
        }
        boolean z11 = z10;
        String strName = (this.f82370l == POST_EDIT_TYPE.POST_VIDEO ? PostType.Video : PostType.Picture).name();
        Log.d("PVEditPostFragment-dbg", "[getPostEditSaveDataProvider] postTypeEnumName: " + strName);
        return new com.max.xiaoheihe.module.bbs.post_edit.auto_save.e(zB7, z11, strName, this.R, new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.b0
            @Override // yh.a
            public final Object invoke() {
                return this.f82941b.X6();
            }
        }, new yh.a() { // from class: com.max.xiaoheihe.module.bbs.post_edit.c0
            @Override // yh.a
            public final Object invoke() {
                return this.f82942b.P6();
            }
        });
    }

    public void R6(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 30260, new Class[]{Intent.class}, Void.TYPE).isSupported || intent == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri");
        List list = (List) intent.getSerializableExtra(UCrop.EXTRA_MULTI_DRAFT);
        boolean[] booleanArrayExtra = intent.getBooleanArrayExtra(UCrop.EXTRA_MULTI_HAS_EDITED_FLAG);
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() <= 0) {
            return;
        }
        int i10 = this.D;
        if (i10 == -1 || i10 < 0 || i10 >= this.f82388y.getImgPathList().size()) {
            for (int i11 = 0; i11 < parcelableArrayListExtra.size(); i11++) {
                Uri uri = (Uri) parcelableArrayListExtra.get(i11);
                BBSTextObj bBSTextObjV6 = V6(uri, !com.max.hbcommon.utils.c.w(list) ? (Draft) list.get(i11) : null);
                if (bBSTextObjV6 != null) {
                    this.f82388y.getImgPathList().add(bBSTextObjV6);
                }
                if (this.f82376p2 != null && v6(booleanArrayExtra, i11)) {
                    this.f82376p2.o(uri);
                }
            }
            this.f82384w.notifyDataSetChanged();
            return;
        }
        Uri uri2 = (Uri) parcelableArrayListExtra.get(0);
        BBSTextObj bBSTextObjV7 = V6(uri2, com.max.hbcommon.utils.c.w(list) ? null : (Draft) list.get(0));
        if (bBSTextObjV7 != null) {
            BBSTextObj bBSTextObjRemove = this.f82388y.getImgPathList().remove(this.D);
            this.f82388y.getImgPathList().add(this.D, bBSTextObjV7);
            this.f82384w.notifyItemChanged(this.D);
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82376p2;
            if (pictureVideoEditPostFragmentViewModel == null || bBSTextObjRemove == null) {
                return;
            }
            pictureVideoEditPostFragmentViewModel.O(bBSTextObjRemove.getText());
            if (v6(booleanArrayExtra, 0)) {
                this.f82376p2.o(uri2);
            }
        }
    }

    public void T6(@androidx.annotation.p0 Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 30261, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (intent == null) {
            T8();
            return;
        }
        GameObj gameObj = (GameObj) intent.getSerializableExtra(com.max.hbsearch.l.B);
        if (gameObj == null) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.fail));
            return;
        }
        if (this.f82370l == POST_EDIT_TYPE.POST_VIDEO) {
            this.f82388y.getGameList().clear();
            this.f82388y.getGameList().add(gameObj);
            F8();
            this.f82385x.notifyDataSetChanged();
        } else if (!this.f82388y.getGameList().contains(gameObj)) {
            this.f82388y.getGameList().add(gameObj);
            m6(gameObj);
            this.f82385x.notifyItemInserted(this.f82375p1.size());
        }
        G8();
        S8(this.mContext);
    }

    public void Y8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30221, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.a0();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30250, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.A.f113985e.hasFocus()) {
            this.A.f113985e.onKeyDown(67, new KeyEvent(0, 67));
        } else {
            this.A.f113984d.onKeyDown(67, new KeyEvent(0, 67));
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.n0
    public RecommendTopicContainer f2() {
        return this.A.Q;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.n0
    public String getContent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30274, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.A.f113984d.getText().toString();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30271, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = this.J3;
        JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : new JsonObject();
        jsonObjectDeepCopy.addProperty("post_type", "4");
        jsonObjectDeepCopy.addProperty("h_src", getArguments().getString("h_src", ""));
        jsonObjectDeepCopy.addProperty("tags", com.max.xiaoheihe.module.bbs.post_edit.o.a(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, this.f82388y.getHashtagList()));
        if (!com.max.hbcommon.utils.c.u(this.G3)) {
            jsonObjectDeepCopy.addProperty("source", this.G3);
        }
        return jsonObjectDeepCopy.toString();
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.n0
    public String getTitle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30273, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.A.f113985e.getText().toString();
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.a.c
    public void h2(@dl.e ArrayList<TopicHashtagWrapper> arrayList, boolean z10) {
        boolean zEquals = true;
        if (PatchProxy.proxy(new Object[]{arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30257, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<BBSTopicObj> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            for (TopicHashtagWrapper topicHashtagWrapper : arrayList) {
                if (!topicHashtagWrapper.isHashtag()) {
                    arrayList2.add(topicHashtagWrapper.getTopic());
                } else if (!com.max.hbcommon.utils.c.u(topicHashtagWrapper.getHashtag().getName())) {
                    arrayList3.add(topicHashtagWrapper.getHashtag().getName());
                }
            }
            zEquals = true ^ new HashSet(this.f82388y.getHashtagList()).equals(new HashSet(arrayList3));
            this.f82388y.getHashtagList().clear();
            this.f82388y.getHashtagList().addAll(arrayList3);
            this.F = arrayList2;
            j1();
            a7();
        }
        if (z10) {
            S8(this.mContext);
        } else {
            T8();
        }
        if (zEquals && this.f82359b0) {
            this.f82359b0 = false;
            this.A.f113984d.onKeyDown(67, new KeyEvent(0, 67));
        }
        n8(false);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30265, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o8();
    }

    public void i7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30263, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        activity.revokeUriPermission(com.max.xiaoheihe.utils.d.w0(activity, this.G), 2);
        File file = this.G;
        if (file != null) {
            u6(file.getAbsolutePath());
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30142, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        df.o oVarC = df.o.c(this.mInflater);
        this.A = oVarC;
        setContentView(oVarC);
        j7();
        s7(this.Z && this.O);
        com.max.hbcustomview.c cVar = new com.max.hbcustomview.c(getContentView());
        this.f82382u = cVar;
        cVar.c(this);
        p7();
        v7();
        t7();
        r7();
        u7();
        o7();
        j1();
        if (!this.O) {
            ViewUtils.r0(this.A.f113985e);
        }
        B6();
        C6();
        if (!this.O && com.max.hbcommon.utils.c.w(this.f82388y.getImgPathList()) && this.X > 0) {
            o8();
        }
        w7();
        PostTabActivityViewModel postTabActivityViewModel = this.f82389y1;
        if (postTabActivityViewModel != null && postTabActivityViewModel.v(this.G3)) {
            x7();
            y7();
        }
        q7();
        m7();
        n7();
        if (com.max.xiaoheihe.utils.i0.s()) {
            a7();
        }
        e7();
        if (com.max.hbcommon.utils.c.u(this.V)) {
            F8();
        } else {
            c7(this.V);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.p0
    public String k1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30275, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.f82388y.getGameList())) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        List<GameObj> gameList = this.f82388y.getGameList();
        Objects.requireNonNull(gameList);
        Iterator<GameObj> it = gameList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getAppid());
            sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        return sb2.deleteCharAt(sb2.length() - 1).toString();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30266, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.f82388y.getImgPathList() != null && this.f82388y.getImgPathList().size() > 0 && i10 < this.f82388y.getImgPathList().size()) {
            this.f82388y.getImgPathList().remove(i10);
            this.f82384w.notifyItemRemoved(i10);
        }
    }

    public void n8(boolean z10) {
        PostTabActivityViewModel postTabActivityViewModel;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30154, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (postTabActivityViewModel = this.f82389y1) == null) {
            return;
        }
        postTabActivityViewModel.E(z10);
    }

    @Override // com.max.hbexpression.q.a
    public void o0(ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 30249, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (expressionObj.getType() != 0) {
            z7(expressionObj.getEmoji_key());
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkImageObj linkImageObj = new LinkImageObj();
        linkImageObj.setUrl(expressionObj.getUrl());
        arrayList.add(linkImageObj);
        A7(com.max.hbutils.utils.k.p(arrayList));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) throws Throwable {
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30258, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 69) {
            if (i11 == -1) {
                R6(intent);
            }
            S8(this.mContext);
        } else if (i10 == 104) {
            if (i11 == -1 && intent != null) {
                ArrayList<BBSTopicObj> arrayList = (ArrayList) intent.getSerializableExtra("choosed_topics");
                this.F = arrayList;
                if (arrayList == null) {
                    this.F = new ArrayList<>();
                }
                j1();
                a7();
            }
            S8(this.mContext);
        } else if (i10 != 1001) {
            if (i10 != 2001) {
                switch (i10) {
                    case 100:
                        if (intent == null || i11 != -1) {
                            T8();
                        } else {
                            if (this.A.f113984d.getSelectionEnd() > 0 && this.f82374p.charAt(this.A.f113984d.getSelectionEnd() - 1) == '@') {
                                this.A.f113984d.getText().replace(this.A.f113984d.getSelectionEnd() - 1, this.A.f113984d.getSelectionEnd(), "");
                            }
                            String stringExtra = intent.getStringExtra("user_name");
                            String stringExtra2 = intent.getStringExtra("user_id");
                            o6(new HighlightInfo("info_at", this.A.f113984d.getSelectionEnd(), "@" + stringExtra, stringExtra2));
                            S8(this.mContext);
                        }
                        break;
                    case 101:
                        if (intent != null && i11 == -1) {
                            n6(intent.getStringExtra("hashtag_name"));
                        }
                        S8(this.mContext);
                        break;
                    case 102:
                        if (i11 == -1) {
                            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("HEYBOX_UCROP.Multi_OutputUri");
                            List list = (List) intent.getSerializableExtra(UCrop.EXTRA_MULTI_DRAFT);
                            boolean[] booleanArrayExtra = intent.getBooleanArrayExtra(UCrop.EXTRA_MULTI_HAS_EDITED_FLAG);
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                int i12 = this.D;
                                if (i12 == -1 || i12 < 0 || i12 >= this.f82388y.getImgPathList().size()) {
                                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                        Uri uri = (Uri) arrayList2.get(i13);
                                        BBSTextObj bBSTextObjV6 = V6(uri, !com.max.hbcommon.utils.c.w(list) ? (Draft) list.get(i13) : null);
                                        if (bBSTextObjV6 != null) {
                                            bBSTextObjV6.setExtra(intent.getStringExtra(UCropPlusActivity.ARG_EXTRA));
                                            this.f82388y.getImgPathList().add(bBSTextObjV6);
                                        }
                                        if (this.f82376p2 != null && v6(booleanArrayExtra, i13)) {
                                            this.f82376p2.o(uri);
                                        }
                                    }
                                    this.f82384w.notifyDataSetChanged();
                                } else {
                                    Uri uri2 = (Uri) arrayList2.get(0);
                                    BBSTextObj bBSTextObjV7 = V6(uri2, com.max.hbcommon.utils.c.w(list) ? null : (Draft) list.get(0));
                                    if (bBSTextObjV7 != null) {
                                        BBSTextObj bBSTextObjRemove = this.f82388y.getImgPathList().remove(this.D);
                                        this.f82388y.getImgPathList().add(this.D, bBSTextObjV7);
                                        this.f82384w.notifyItemChanged(this.D);
                                        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82376p2;
                                        if (pictureVideoEditPostFragmentViewModel != null && bBSTextObjRemove != null) {
                                            pictureVideoEditPostFragmentViewModel.O(bBSTextObjRemove.getText());
                                            if (v6(booleanArrayExtra, 0)) {
                                                this.f82376p2.o(uri2);
                                            }
                                        }
                                    }
                                }
                            } else if (!this.O && this.f82370l == POST_EDIT_TYPE.POST_PICTURE && ((pictureVideoLinkDraftObj = this.f82388y) == null || com.max.hbcommon.utils.c.w(pictureVideoLinkDraftObj.getImgPathList()))) {
                                this.mContext.finish();
                            }
                        }
                        S8(this.mContext);
                        break;
                }
            } else {
                if (i11 == -1) {
                    i7();
                }
                S8(this.mContext);
            }
        } else if (i11 == -1) {
            T6(intent);
        } else {
            T8();
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30156, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getActivity() instanceof z0) {
            this.N = (z0) getActivity();
        } else {
            if (!(getParentFragment() instanceof z0)) {
                throw new IllegalArgumentException("parent must be SuperOnBackPressed");
            }
            this.N = (z0) getParentFragment();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30222, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.T) {
            PostTabActivityViewModel postTabActivityViewModel = this.f82389y1;
            if (postTabActivityViewModel != null) {
                postTabActivityViewModel.z();
            }
            Y8();
            return;
        }
        if (B7()) {
            PostTabActivityViewModel postTabActivityViewModel2 = this.f82389y1;
            if (postTabActivityViewModel2 != null) {
                postTabActivityViewModel2.z();
            }
            Y8();
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.A.f113984d.getText().toString()) || !com.max.hbcommon.utils.c.u(this.A.f113985e.getText().toString()) || !com.max.hbcommon.utils.c.w(this.f82388y.getImgPathList()) || !com.max.hbcommon.utils.c.u(this.J)) {
            new com.max.hbcommon.view.a.f(this.mContext).y(com.max.xiaoheihe.utils.d.n0(R.string.save_draft_confirm)).u(com.max.xiaoheihe.utils.d.n0(R.string.save), new z()).o(com.max.xiaoheihe.utils.d.n0(R.string.not_save), new y()).F();
            return;
        }
        PostTabActivityViewModel postTabActivityViewModel3 = this.f82389y1;
        if (postTabActivityViewModel3 != null) {
            postTabActivityViewModel3.z();
        }
        Y8();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30141, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.f82376p2 = (PictureVideoEditPostFragmentViewModel) new androidx.lifecycle.y0(this).a(PictureVideoEditPostFragmentViewModel.class);
        FragmentActivity activity = getActivity();
        if (activity == null || ad.a.a(ad.a.I, false)) {
            return;
        }
        this.V3 = (ActivityPostSettingViewModel) new androidx.lifecycle.y0(activity).a(ActivityPostSettingViewModel.class);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        RecyclerView.AdapterDataObserver adapterDataObserver;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30267, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        B6();
        C6();
        MMKVManager.f71329a.k(ad.e.f1248a, ad.e.f1253f, false, false);
        com.max.hbcommon.base.adapter.t tVar = this.f82384w;
        if (tVar != null && (adapterDataObserver = this.P3) != null) {
            tVar.unregisterAdapterDataObserver(adapterDataObserver);
        }
        com.max.xiaoheihe.module.bbs.post_edit.f fVar = this.Q3;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30158, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        this.R3 = false;
        Log.d("pvEditdbg", "[onPause] mIsForeground: " + this.R3);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30157, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.R3 = true;
        Log.d("pvEditdbg", "[onResume] mIsForeground: " + this.R3);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.post_setting.a
    public void r3(@androidx.annotation.n0 PostSettingObj postSettingObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{postSettingObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30193, new Class[]{PostSettingObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (postSettingObj != null) {
            this.f82388y.setPostSettingObj(postSettingObj);
            if (this.f82388y.getPostSettingObj().getThumbImageObj() != null && this.f82388y.getPostSettingObj().getThumbImageObj().getUrl() == null && this.f82388y.getPostSettingObj().getThumbImageObj().getPath() != null) {
                c9();
            }
            postSettingObj.setCheckedTopics(this.F);
            j1();
            com.max.hbcommon.base.adapter.t tVar = this.f82384w;
            if (tVar != null && tVar.y() != null && !com.max.hbcommon.utils.c.w(this.f82384w.y().getDataList())) {
                com.max.hbcommon.base.adapter.t tVar2 = this.f82384w;
                tVar2.notifyItemChanged(tVar2.u());
            }
        }
        Log.d("PVEdit-dbg", "[onPostSettingFinish] hasEditPostSetting: " + z10);
        if (z10) {
            S8(this.mContext);
        } else {
            T8();
        }
    }

    @Override // com.max.hbcustomview.c.a
    public void s(boolean z10, int i10) {
        com.max.hbexpression.q qVar;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 30251, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported || z10 == this.f82368j) {
            return;
        }
        this.f82368j = z10;
        r6(this.f82367i || z10);
        if (z10 && (qVar = this.f82380s) != null) {
            this.f82367i = false;
            qVar.C();
        }
        if ((z10 || this.f82367i) && this.R3) {
            s6(true);
        }
        if (z10 || this.f82367i || !this.R3) {
            return;
        }
        s6(false);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    public void w3(@androidx.annotation.n0 RecommendedTopicObj recommendedTopicObj) {
        HashtagObj bBSHashtagObj;
        BBSTopicObj bBSTopicObj;
        if (PatchProxy.proxy(new Object[]{recommendedTopicObj}, this, changeQuickRedirect, false, 30272, new Class[]{RecommendedTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (recommendedTopicObj.isTopic() && (bBSTopicObj = recommendedTopicObj.toBBSTopicObj()) != null) {
            this.F.add(bBSTopicObj);
        }
        if (recommendedTopicObj.isHashtag() && recommendedTopicObj.toBBSHashtagObj() != null && (bBSHashtagObj = recommendedTopicObj.toBBSHashtagObj()) != null) {
            n6(bBSHashtagObj.getName());
        }
        j1();
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.y0
    @androidx.annotation.n0
    public ImageView x() {
        return this.A.f113987g;
    }
}
