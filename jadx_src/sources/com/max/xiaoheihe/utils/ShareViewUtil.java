package com.max.xiaoheihe.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.question.OptionObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AchieveObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PostImageObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.ShareGameCommentDataObj;
import com.max.xiaoheihe.bean.game.SyncSteamCommentObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ShareViewUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f95256a = "ShareViewUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95257b;

        a(Context context) {
            this.f95257b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 48847, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int iF = ViewUtils.f(this.f95257b, 2.0f);
            int iF2 = ViewUtils.f(this.f95257b, 1.0f);
            rect.set(iF2, iF, iF2, iF);
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95258b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, List list, int i10, Context context2) {
            super(context, list, i10);
            this.f95258b = context2;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 48848, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_image);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_purchase_game);
            eVar.b();
            int iL = (int) (((ViewUtils.L(this.f95258b) - ViewUtils.f(this.f95258b, 84.0f)) / 2.0f) + 0.5f);
            int i10 = (int) (((iL * 66.0f) / 145.0f) + 0.5f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams.width != iL || layoutParams.height != i10) {
                layoutParams.width = iL;
                layoutParams.height = i10;
                imageView.setLayoutParams(layoutParams);
            }
            com.max.hbimage.b.L(gameObj.getImage(), imageView, R.drawable.common_default_placeholder_375x210);
            r1.P1(eVar, gameObj.getScore_desc(), gameObj.getScore());
            textView.setText(gameObj.getName());
            ((RelativeLayout.LayoutParams) textView.getLayoutParams()).topMargin = ViewUtils.f(this.f95258b, 4.0f);
            r1.A(eVar, gameObj);
            textView2.setVisibility(8);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 48849, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<ShareGameCommentDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.f f95259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LoadingDialog f95260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95261d;

        public class a implements ShareImageDialogFragment.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GameCommentsObj f95262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f95263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameObj f95264c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f95265d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShareGameCommentDataObj f95266e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f95267f;

            a(GameCommentsObj gameCommentsObj, Context context, GameObj gameObj, BBSUserInfoObj bBSUserInfoObj, ShareGameCommentDataObj shareGameCommentDataObj, String str) {
                this.f95262a = gameCommentsObj;
                this.f95263b = context;
                this.f95264c = gameObj;
                this.f95265d = bBSUserInfoObj;
                this.f95266e = shareGameCommentDataObj;
                this.f95267f = str;
            }

            @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
            public View a(ViewGroup viewGroup) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 48854, new Class[]{ViewGroup.class}, View.class);
                if (patchProxyResultProxy.isSupported) {
                    return (View) patchProxyResultProxy.result;
                }
                GameCommentsObj gameCommentsObj = this.f95262a;
                return ShareViewUtil.b(this.f95263b, viewGroup, this.f95264c.getMain_color(), !com.max.hbcommon.utils.c.u(this.f95264c.getShare_bg_img()) ? this.f95264c.getShare_bg_img() : this.f95264c.getImage(), this.f95264c.getScore(), this.f95264c.getScore_desc(), this.f95264c.getName(), this.f95264c.getName_en(), this.f95265d.getAvatar(), this.f95265d.getUsername(), this.f95266e.getUser_comment_score(), gameCommentsObj != null ? gameCommentsObj.getPlay_state() : null, this.f95267f, this.f95266e.getGame_impression_list());
            }
        }

        public class b implements UMShareListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onCancel(SHARE_MEDIA share_media) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onError(SHARE_MEDIA share_media, Throwable th2) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onResult(SHARE_MEDIA share_media) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        }

        c(com.max.hbcommon.base.f fVar, LoadingDialog loadingDialog, String str) {
            this.f95259b = fVar;
            this.f95260c = loadingDialog;
            this.f95261d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48851, new Class[0], Void.TYPE).isSupported && this.f95259b.isActive()) {
                super.onComplete();
                this.f95260c.c();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48850, new Class[]{Throwable.class}, Void.TYPE).isSupported && this.f95259b.isActive()) {
                super.onError(th2);
                this.f95260c.c();
            }
        }

        public void onNext(Result<ShareGameCommentDataObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48852, new Class[]{Result.class}, Void.TYPE).isSupported || !this.f95259b.isActive() || result.getResult() == null) {
                return;
            }
            super.onNext(result);
            Context viewContext = this.f95259b.getViewContext();
            ShareGameCommentDataObj result2 = result.getResult();
            GameObj game_info = result2.getGame_info();
            GameCommentsObj share_info = result2.getShare_info();
            LinkInfoObj comment_detail = result2.getComment_detail();
            BBSUserInfoObj user = result2.getUser();
            String description = null;
            if (game_info == null || user == null) {
                return;
            }
            ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
            Bundle arguments = shareImageDialogFragmentX4.getArguments() != null ? shareImageDialogFragmentX4.getArguments() : new Bundle();
            arguments.putString("source", "game_comment_share");
            shareImageDialogFragmentX4.setArguments(arguments);
            shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d((Activity) viewContext));
            shareImageDialogFragmentX4.Y4(result2.getTopic_info());
            shareImageDialogFragmentX4.H4(game_info);
            if (comment_detail != null) {
                description = comment_detail.getDescription();
                if (i0.q(this.f95261d)) {
                    shareImageDialogFragmentX4.L4(comment_detail.getDescription());
                }
            }
            shareImageDialogFragmentX4.D4(new a(share_info, viewContext, game_info, user, result2, description));
            JsonObject jsonObject = new JsonObject();
            if (comment_detail != null && comment_detail.getLinkid() != null) {
                jsonObject.addProperty("link_id", comment_detail.getLinkid());
                if (com.max.hbcommon.utils.c.x(result2.getCan_sync_steam())) {
                    shareImageDialogFragmentX4.X4(new SyncSteamCommentObj(r1.Z(game_info), comment_detail.getDescription(), comment_detail.getScore(), result2.getSync_steam_protocol(), comment_detail.getLinkid(), "image_dialog"));
                }
            }
            shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b("game_comment", new b(), jsonObject));
            if (viewContext instanceof AppCompatActivity) {
                shareImageDialogFragmentX4.show(((AppCompatActivity) viewContext).getSupportFragmentManager(), "shareImageDialogFragment");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48853, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ShareGameCommentDataObj>) obj);
        }
    }

    public class d implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f95270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f95271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f95272c;

        d(ImageView imageView, View view, View view2) {
            this.f95270a = imageView;
            this.f95271b = view;
            this.f95272c = view2;
        }

        @Override // com.max.hbimage.b.q
        public void a(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 48845, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95270a.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 48846, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95270a.setImageResource(R.drawable.game_comment_default_share_bg_323x106);
            int iE = com.max.xiaoheihe.utils.d.E(R.color.default_main_comment_share_color);
            this.f95271b.setBackgroundColor(iE);
            this.f95272c.setBackground(ViewUtils.P(0, com.max.xiaoheihe.utils.d.E(R.color.transparent), iE));
        }
    }

    public class e extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f95273b;

        e(int i10) {
            this.f95273b = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 48855, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = this.f95273b;
            rect.set(0, i10, i10, 0);
        }
    }

    public class f extends com.max.hbcommon.base.adapter.s<AchieveObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 48856, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AchieveObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbimage.b.d0(achieveObj.getIcon(), (ImageView) eVar.i(R.id.iv_achievement_icon), 2);
            eVar.p(R.id.tv_achievement_desc, achieveObj.getDesc());
            eVar.p(R.id.tv_achievement_full_desc, achieveObj.getFull_desc());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 48857, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, achieveObj);
        }
    }

    public class g extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f95274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Paint f95275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f95276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f95277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f95278f;

        g(Context context, int i10) {
            this.f95277e = context;
            this.f95278f = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 48858, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            Paint paint = new Paint();
            this.f95275c = paint;
            paint.setColor(this.f95277e.getResources().getColor(R.color.divider_color));
            this.f95274b = this.f95277e.getResources().getDimensionPixelSize(R.dimen.divider_height);
            int iA = com.max.hbcommon.component.ezcalendarview.utils.c.a(10.0f);
            this.f95276d = iA;
            int i10 = this.f95274b;
            rect.bottom = i10;
            if (childAdapterPosition == 0 && this.f95278f == 2) {
                rect.bottom = i10 + iA;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 48859, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            for (int i10 = 0; i10 < childCount - 1; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                canvas.drawRect(this.f95277e.getResources().getDimensionPixelSize(R.dimen.dimen_size_54) + recyclerView.getPaddingLeft(), childAt.getBottom() + (this.f95276d / 2), width, childAt.getBottom() + (this.f95276d / 2) + this.f95274b, this.f95275c);
            }
        }
    }

    public class h extends com.max.hbcommon.base.adapter.s<AchieveObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f95279b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, List list, int i10, int i11) {
            super(context, list, i10);
            this.f95279b = i11;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 48860, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AchieveObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_achievement_item_icon);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            int i10 = this.f95279b;
            layoutParams.width = i10;
            layoutParams.height = i10;
            imageView.setLayoutParams(layoutParams);
            com.max.hbimage.b.d0(achieveObj.getIcon(), imageView, 2);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 48861, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, achieveObj);
        }
    }

    public class i extends com.max.hbcommon.base.adapter.s<AchieveObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f95280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context, List list, int i10, int i11) {
            super(context, list, i10);
            this.f95280b = i11;
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 20;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 48862, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AchieveObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_achievement_item_icon);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            int i10 = this.f95280b;
            layoutParams.width = i10;
            layoutParams.height = i10;
            imageView.setLayoutParams(layoutParams);
            com.max.hbimage.b.d0(achieveObj.getIcon(), imageView, 2);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 48863, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, achieveObj);
        }
    }

    public static View a(Context context, ViewGroup viewGroup, String str, String str2, String str3, int i10, String str4, List<AchieveObj> list, String str5, String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, str, str2, str3, new Integer(i10), str4, list, str5, str6}, null, changeQuickRedirect, true, 48840, new Class[]{Context.class, ViewGroup.class, String.class, String.class, String.class, Integer.TYPE, String.class, List.class, String.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_game_achieve_share, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_game_logo);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_game_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_game_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_achievement_points);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_user_avatar);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_user_name);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_achievement_time);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_achievement_items);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_achievement_num);
        View viewFindViewById = viewInflate.findViewById(R.id.recyclerview_divider);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_ahievement_more);
        com.max.hbimage.b.L(str, imageView, R.drawable.common_default_placeholder_375x210);
        com.max.hbimage.b.L(str2, imageView2, R.drawable.common_default_placeholder_375x210);
        com.max.hbimage.b.I(str5, imageView3, R.drawable.common_default_placeholder_375x210);
        if (!com.max.hbcommon.utils.c.u(str3)) {
            textView.setText(str3);
        }
        if (!com.max.hbcommon.utils.c.u(str6)) {
            textView3.setText(str6);
        }
        if (!com.max.hbcommon.utils.c.u(str4)) {
            textView4.setText(com.max.hbutils.utils.w.i(str4, "yyyy-MM-dd"));
        }
        int iQ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iQ += com.max.hbutils.utils.n.q(list.get(i11).getPoint());
        }
        Locale locale = Locale.US;
        textView2.setText(String.format(locale, "+%1$d", Integer.valueOf(iQ)));
        textView5.setText(String.format(locale, "达成了%1$d个新成就", Integer.valueOf(i10)));
        int iL = (int) (((ViewUtils.L(context) - ViewUtils.f(context, 96.0f)) / 5.0f) + 0.5f);
        if (list.size() <= 2) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            recyclerView.setAdapter(new f(context, list, R.layout.item_achievement_share_type1));
            recyclerView.addItemDecoration(new g(context, i10));
        } else if (list.size() <= 20) {
            recyclerView.setLayoutManager(new GridLayoutManager(context, 5) { // from class: com.max.xiaoheihe.utils.ShareViewUtil.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.setPadding(com.max.hbcommon.component.ezcalendarview.utils.c.a(18.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(8.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(18.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(8.0f));
            recyclerView.setAdapter(new h(context, list, R.layout.item_achievement_share_type2, iL));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, 5) { // from class: com.max.xiaoheihe.utils.ShareViewUtil.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.setPadding(com.max.hbcommon.component.ezcalendarview.utils.c.a(18.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(8.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(18.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(8.0f));
            recyclerView.setAdapter(new i(context, list, R.layout.item_achievement_share_type2, iL));
            textView6.setText(String.format(locale, "等%1$d个", Integer.valueOf(i10 - 20)));
            viewFindViewById.setVisibility(0);
            textView6.setVisibility(0);
        }
        return viewInflate;
    }

    public static View b(Context context, ViewGroup viewGroup, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<OptionObj> list) {
        int i10;
        int i11;
        int i12;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list}, null, changeQuickRedirect, true, 48837, new Class[]{Context.class, ViewGroup.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_game_comments_share, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_game_logo);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_game_logo);
        View viewFindViewById = viewInflate.findViewById(R.id.v_game_logo_mask);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_game_score);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_game_score);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_game_score);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_user_comment_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_game_name);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_game_name_en);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_user_avatar);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_user_name);
        GameRateStarView gameRateStarView = (GameRateStarView) viewInflate.findViewById(R.id.ll_user_rating);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_user_comments);
        ViewGroup viewGroup3 = (ViewGroup) viewInflate.findViewById(R.id.vg_game_impression);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_game_impression);
        imageView.setImageResource(R.drawable.common_default_placeholder_375x210);
        com.max.hbimage.b.X(context, imageView, str2, new d(imageView, viewInflate, viewFindViewById));
        int iE1 = !com.max.hbcommon.utils.c.u(str) ? com.max.xiaoheihe.utils.d.e1(str) : com.max.xiaoheihe.utils.d.E(R.color.default_main_comment_share_color);
        viewInflate.setBackgroundColor(iE1);
        viewFindViewById.setBackground(ViewUtils.P(0, com.max.xiaoheihe.utils.d.E(R.color.transparent), iE1));
        viewGroup2.getLayoutParams().height = (int) (((ViewUtils.L(context) - ViewUtils.f(context, 40.0f)) * 85.0f) / 323.0f);
        if (TextUtils.isEmpty(str3)) {
            i10 = 8;
            viewFindViewById2.setVisibility(8);
        } else {
            textView.setText(str3);
            viewFindViewById2.setBackgroundDrawable(ViewUtils.x(ViewUtils.o(context, viewFindViewById2), r1.u0(context, str3), r1.t0(context, str3)));
            viewFindViewById2.setVisibility(0);
            imageView2.setVisibility(0);
            i10 = 8;
        }
        textView3.setText(str5);
        textView4.setText(str6);
        com.max.hbimage.b.I(str7, imageView3, R.drawable.common_default_avatar_40x40);
        textView5.setText(str8);
        float fP = com.max.hbutils.utils.n.p(str9);
        if (fP <= 0.0f) {
            gameRateStarView.setVisibility(i10);
            i11 = 0;
        } else {
            i11 = 0;
            gameRateStarView.setVisibility(0);
            gameRateStarView.setRating(fP);
        }
        if (com.max.hbcommon.utils.c.u(str10)) {
            textView2.setVisibility(i10);
        } else {
            textView2.setText(str10);
            textView2.setVisibility(i11);
        }
        List[] listArr = new List[1];
        listArr[i11] = list;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            i12 = 8;
            viewGroup3.setVisibility(8);
        } else {
            viewGroup3.setVisibility(i11);
            recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
            com.max.xiaoheihe.module.game.adapter.t tVar = new com.max.xiaoheihe.module.game.adapter.t(context, list);
            recyclerView.setAdapter(tVar);
            recyclerView.addItemDecoration(new e(ViewUtils.f(context, 6.0f)));
            tVar.notifyDataSetChanged();
            i12 = 8;
        }
        if (com.max.hbcommon.utils.c.u(str11)) {
            textView6.setVisibility(i12);
        } else {
            textView6.setText(str11);
            textView6.setVisibility(0);
        }
        return viewInflate;
    }

    public static View c(Context context, ViewGroup viewGroup, String str, String str2, String str3, String str4, String str5, List<GameObj> list) {
        List<GameObj> listSubList;
        Context context2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, str, str2, str3, str4, str5, list}, null, changeQuickRedirect, true, 48841, new Class[]{Context.class, ViewGroup.class, String.class, String.class, String.class, String.class, String.class, List.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_game_follow_purchase_share, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_game_logo);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_user_avatar);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_user_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_moments_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_moments_time);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_single_game);
        View viewFindViewById2 = viewInflate.findViewById(R.id.ll_more);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_more_game);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_games);
        com.max.hbimage.b.L(str, imageView, R.drawable.common_default_placeholder_375x210);
        textView2.setText(str2);
        textView3.setText(com.max.hbutils.utils.w.i(str5, "yyyy-MM-dd"));
        com.max.hbimage.b.I(str3, imageView2, R.drawable.common_default_avatar_40x40);
        textView.setText(str4);
        if (list.size() > 1) {
            viewFindViewById.setVisibility(8);
            recyclerView.setVisibility(0);
            if (list.size() > 6) {
                viewFindViewById2.setVisibility(0);
                textView4.setText("等" + (list.size() - 6) + "款");
                listSubList = list.subList(0, 6);
            } else {
                listSubList = list;
            }
            if (recyclerView.getLayoutManager() == null) {
                context2 = context;
                recyclerView.setLayoutManager(new GridLayoutManager(context2, 2) { // from class: com.max.xiaoheihe.utils.ShareViewUtil.9
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean canScrollVertically() {
                        return false;
                    }
                });
                recyclerView.addItemDecoration(new a(context2));
            } else {
                context2 = context;
            }
            recyclerView.setAdapter(new b(context2, listSubList, R.layout.item_game_recommendations, context2));
        } else if (list.size() > 0) {
            GameObj gameObj = list.get(0);
            viewFindViewById.setVisibility(0);
            recyclerView.setVisibility(8);
            com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.item_game, viewFindViewById);
            r1.r1(eVar, gameObj, GameObj.KEY_POINT_FOLLOW_STATE);
            eVar.i(R.id.tv_follow_state).setVisibility(8);
        }
        return viewInflate;
    }

    private static Drawable d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, 48839, new Class[]{Integer.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(51, iRed, iGreen, iBlue), Color.argb(bb.c.b.B1, iRed, iGreen, iBlue), Color.argb(255, iRed, iGreen, iBlue)});
    }

    public static View e(Context context, ViewGroup viewGroup, BBSCommentObj bBSCommentObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, bBSCommentObj, str}, null, changeQuickRedirect, true, 48842, new Class[]{Context.class, ViewGroup.class, BBSCommentObj.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_post_comment_share, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_bg);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_image);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_avatar);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_comment);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_title);
        com.max.hbimage.b.I(bBSCommentObj.getUser().getAvartar(), imageView3, R.drawable.common_default_avatar_40x40);
        textView.setText(bBSCommentObj.getUser().getUsername());
        textView2.setText(bBSCommentObj.getText());
        if (com.max.hbcommon.utils.c.u(str)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText("—— " + str);
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
            com.max.hbimage.b.K(postImageObj.getUrl(), imageView2);
        } else {
            imageView2.setVisibility(8);
        }
        imageView.getLayoutParams().height = ViewUtils.V(viewGroup2);
        return viewInflate;
    }

    public static View f(Context context, ViewGroup viewGroup, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, str, str2, str3, str4, str5, str6, str7, str8, str9}, null, changeQuickRedirect, true, 48838, new Class[]{Context.class, ViewGroup.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_screenshot_share, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_game_logo);
        View viewFindViewById = viewInflate.findViewById(R.id.v_game_logo_mask);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_user_comment_desc);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_game_name);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_game_name_en);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_user_avatar);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_user_name);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_user_comments);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_image);
        ImageView imageView4 = (ImageView) viewInflate.findViewById(R.id.iv_bottom_logo);
        textView.setText("截图时间 " + com.max.hbutils.utils.w.i(str9, "yyyy-MM-dd"));
        imageView.setImageResource(R.drawable.common_default_placeholder_375x210);
        com.max.hbimage.b.L(str2, imageView, R.drawable.game_comment_default_share_bg_323x106);
        imageView3.getLayoutParams().height = ((ViewUtils.L(context) - ViewUtils.f(context, 80.0f)) * 9) / 16;
        com.max.hbimage.b.K(str8, imageView3);
        int iE1 = !com.max.hbcommon.utils.c.u(str) ? com.max.xiaoheihe.utils.d.e1(str) : com.max.xiaoheihe.utils.d.E(R.color.default_main_comment_share_color);
        viewInflate.setBackgroundColor(iE1);
        viewFindViewById.setBackground(d(iE1));
        float[] fArr = {0.0f, 0.0f, 0.0f};
        Color.colorToHSV(iE1, fArr);
        imageView4.setColorFilter(com.max.xiaoheihe.utils.d.E(fArr[2] <= 0.5f ? R.color.text_primary_1_color_alpha70 : R.color.white_alpha20));
        textView2.setText(str3);
        textView3.setText(str4);
        com.max.hbimage.b.I(str5, imageView2, R.drawable.common_default_avatar_40x40);
        textView4.setText(str6);
        if (com.max.hbcommon.utils.c.u(str7)) {
            textView5.setVisibility(8);
        } else {
            textView5.setText(str7);
            textView5.setVisibility(0);
        }
        return viewInflate;
    }

    public static Bitmap g(RecyclerView recyclerView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView}, null, changeQuickRedirect, true, 48844, new Class[]{RecyclerView.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return null;
        }
        int itemCount = adapter.getItemCount();
        Paint paint = new Paint();
        LruCache lruCache = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        int measuredHeight = 0;
        for (int i10 = 0; i10 < itemCount; i10++) {
            RecyclerView.ViewHolder viewHolderCreateViewHolder = adapter.createViewHolder(recyclerView, adapter.getItemViewType(i10));
            adapter.onBindViewHolder(viewHolderCreateViewHolder, i10);
            viewHolderCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = viewHolderCreateViewHolder.itemView;
            view.layout(0, 0, view.getMeasuredWidth(), viewHolderCreateViewHolder.itemView.getMeasuredHeight());
            viewHolderCreateViewHolder.itemView.setDrawingCacheEnabled(true);
            viewHolderCreateViewHolder.itemView.buildDrawingCache();
            Bitmap drawingCache = viewHolderCreateViewHolder.itemView.getDrawingCache();
            if (drawingCache != null) {
                lruCache.put(String.valueOf(i10), drawingCache);
            }
            measuredHeight += viewHolderCreateViewHolder.itemView.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(recyclerView.getMeasuredWidth(), measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int height = 0;
        for (int i11 = 0; i11 < itemCount; i11++) {
            Bitmap bitmap = (Bitmap) lruCache.get(String.valueOf(i11));
            canvas.drawBitmap(bitmap, 0.0f, height, paint);
            height += bitmap.getHeight();
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    @SuppressLint({"CheckResult"})
    public static void h(com.max.hbcommon.base.f fVar, String str, String str2, String str3) {
        if (!PatchProxy.proxy(new Object[]{fVar, str, str2, str3}, null, changeQuickRedirect, true, 48843, new Class[]{com.max.hbcommon.base.f.class, String.class, String.class, String.class}, Void.TYPE).isSupported && (fVar.getViewContext() instanceof AppCompatActivity) && fVar.isActive()) {
            com.max.xiaoheihe.network.i.a().P7(str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(fVar, new LoadingDialog(fVar.getViewContext()).r(), str2));
        }
    }
}
