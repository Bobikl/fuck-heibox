package com.max.xiaoheihe.module.littleprogram.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameRollEarnInfoObj;
import com.max.xiaoheihe.bean.game.GameRollRoomObj;
import com.max.xiaoheihe.bean.game.RollItemObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.GameRollRoomListFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import df.ax;
import df.gb;
import io.reactivex.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: RollRoomDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class RollRoomDetailFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {

    @dl.d
    public static final String A = "linkid";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final a f88854y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f88855z = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private gb f88856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f88857q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private Result<BBSLinkTreeObj> f88859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private LinkInfoObj f88860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private GameRollRoomObj f88861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f88862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private LoadingDialog f88863w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private String f88858r = "1";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final com.max.hbshare.c.b f88864x = new g(new h());

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final RollRoomDetailFragment a(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38892, new Class[]{Bundle.class}, RollRoomDetailFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (RollRoomDetailFragment) patchProxyResultProxy.result;
            }
            RollRoomDetailFragment rollRoomDetailFragment = new RollRoomDetailFragment();
            rollRoomDetailFragment.setArguments(bundle);
            return rollRoomDetailFragment;
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88866c;

        b(String str) {
            this.f88866c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38893, new Class[0], Void.TYPE).isSupported && RollRoomDetailFragment.this.isActive()) {
                RollRoomDetailFragment.this.f88862v = false;
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38894, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (RollRoomDetailFragment.this.isActive()) {
                RollRoomDetailFragment.this.f88862v = false;
                super.onError(e10);
                RollRoomDetailFragment.Q4(RollRoomDetailFragment.this, true ^ f0.g("1", this.f88866c));
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38895, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            RollRoomDetailFragment.this.isActive();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38896, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38897, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (RollRoomDetailFragment.this.isActive()) {
                super.onError(e10);
                RollRoomDetailFragment.O4(RollRoomDetailFragment.this);
            }
        }

        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38898, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (RollRoomDetailFragment.this.isActive()) {
                super.onNext(result);
                RollRoomDetailFragment.this.W4(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38899, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88869c;

        d(String str) {
            this.f88869c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38900, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (RollRoomDetailFragment.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialogT4 = RollRoomDetailFragment.this.T4();
                if (loadingDialogT4 != null) {
                    loadingDialogT4.c();
                }
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38901, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (RollRoomDetailFragment.this.isActive()) {
                super.onNext(result);
                LoadingDialog loadingDialogT4 = RollRoomDetailFragment.this.T4();
                if (loadingDialogT4 != null) {
                    loadingDialogT4.c();
                }
                LinkInfoObj linkInfoObj = RollRoomDetailFragment.this.f88860t;
                f0.m(linkInfoObj);
                linkInfoObj.getRelated_status().getRoom_detail().setIn_room("1");
                RollRoomDetailFragment.this.Z4();
                RollRoomDetailFragment.I4(RollRoomDetailFragment.this);
                Intent intent = new Intent(lb.a.f131067x);
                intent.putExtra(GameRollRoomListFragment.H, this.f88869c);
                ((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38902, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RollItemObj f88870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RollRoomDetailFragment f88871c;

        e(RollItemObj rollItemObj, RollRoomDetailFragment rollRoomDetailFragment) {
            this.f88870b = rollItemObj;
            this.f88871c = rollRoomDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38903, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f88870b.getProtocol())) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) this.f88871c).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, this.f88870b.getProtocol());
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameRollRoomObj f88872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RollRoomDetailFragment f88873c;

        f(GameRollRoomObj gameRollRoomObj, RollRoomDetailFragment rollRoomDetailFragment) {
            this.f88872b = gameRollRoomObj;
            this.f88873c = rollRoomDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38904, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f88872b.isHas_pwd()) {
                RollRoomDetailFragment.P4(this.f88873c);
            } else {
                RollRoomDetailFragment.M4(this.f88873c, null);
            }
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class g extends com.max.hbshare.c.b {
        g(h hVar) {
            super("roll_room", hVar);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class h implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 38906, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(RollRoomDetailFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 38905, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(RollRoomDetailFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f88875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RollRoomDetailFragment f88876c;

        i(EditText editText, RollRoomDetailFragment rollRoomDetailFragment) {
            this.f88875b = editText;
            this.f88876c = rollRoomDetailFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38907, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f88875b.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                com.max.hbutils.utils.c.f(this.f88876c.getString(R.string.room_input_pwd));
            } else {
                RollRoomDetailFragment.M4(this.f88876c, string);
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class j implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f88877b = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38908, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class k extends s<RollItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(Activity activity, List<RollItemObj> list) {
            super(activity, list, R.layout.hbwallet_coupon_roll_item);
        }

        public void m(@dl.d s.e viewHolder, @dl.d RollItemObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 38909, new Class[]{s.e.class, RollItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            be.d dVarA = be.d.a(viewHolder.b());
            f0.o(dVarA, "bind(viewHolder.getItemView())");
            RollRoomDetailFragment.Y4(RollRoomDetailFragment.this, dVarA, data, false, 4, null);
            if (viewHolder.getBindingAdapterPosition() != 0) {
                ViewGroup.LayoutParams layoutParams = dVarA.b().getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext, 6.0f);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, RollItemObj rollItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, rollItemObj}, this, changeQuickRedirect, false, 38910, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, rollItemObj);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38911, new Class[]{View.class}, Void.TYPE).isSupported || !i0.e(((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext) || RollRoomDetailFragment.this.f88860t == null) {
                return;
            }
            LinkInfoObj linkInfoObj = RollRoomDetailFragment.this.f88860t;
            f0.m(linkInfoObj);
            String str = "1";
            if (f0.g("1", linkInfoObj.getIs_award_link())) {
                RollRoomDetailFragment.Q4(RollRoomDetailFragment.this, false);
                str = "0";
            } else {
                RollRoomDetailFragment.Q4(RollRoomDetailFragment.this, true);
            }
            RollRoomDetailFragment rollRoomDetailFragment = RollRoomDetailFragment.this;
            LinkInfoObj linkInfoObj2 = rollRoomDetailFragment.f88860t;
            f0.m(linkInfoObj2);
            rollRoomDetailFragment.R4(linkInfoObj2.getLinkid(), str);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38912, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext;
            GameRollRoomObj gameRollRoomObj = RollRoomDetailFragment.this.f88861u;
            f0.m(gameRollRoomObj);
            String share_title = gameRollRoomObj.getShare_title();
            GameRollRoomObj gameRollRoomObj2 = RollRoomDetailFragment.this.f88861u;
            f0.m(gameRollRoomObj2);
            String share_desc = gameRollRoomObj2.getShare_desc();
            GameRollRoomObj gameRollRoomObj3 = RollRoomDetailFragment.this.f88861u;
            f0.m(gameRollRoomObj3);
            com.max.hbshare.d.E(activity, new HBShareData(false, true, share_title, share_desc, gameRollRoomObj3.getShare_url(), null, new UMImage(((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext, R.drawable.share_thumbnail), RollRoomDetailFragment.this.U4(), null, null, null, null, null, bb.c.k.L0, null));
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class n extends s<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n(Activity activity, List<BBSUserInfoObj> list) {
            super(activity, list, R.layout.item_roll_room_post_joined_user);
        }

        public void m(@dl.d s.e viewHolder, @dl.d BBSUserInfoObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 38913, new Class[]{s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            com.max.hbimage.b.L(data.getAvartar(), (ImageView) viewHolder.i(R.id.iv_avartar), R.drawable.common_default_avatar_40x40);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 38914, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSUserInfoObj);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38915, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzrollroom", "to join user page");
            Bundle bundleA = androidx.core.os.e.a();
            GameRollRoomObj gameRollRoomObj = RollRoomDetailFragment.this.f88861u;
            f0.m(gameRollRoomObj);
            bundleA.putString("room_id", gameRollRoomObj.getRoom_id());
            com.max.xiaoheihe.module.littleprogram.b.a aVar = com.max.xiaoheihe.module.littleprogram.b.f88740a;
            Activity mContext = ((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext;
            f0.o(mContext, "mContext");
            aVar.n(mContext, com.max.xiaoheihe.module.littleprogram.b.f88754o, bundleA);
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f88883c;

        p(BBSUserInfoObj bBSUserInfoObj) {
            this.f88883c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38916, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext;
            f0.o(mContext, "mContext");
            String userid = this.f88883c.getUserid();
            f0.o(userid, "user.userid");
            com.max.xiaoheihe.base.router.b.U(mContext, userid, this.f88883c.getSteamid()).A();
        }
    }

    /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
    public static final class q extends s<GameRollEarnInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: RollRoomDetailFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RollRoomDetailFragment f88885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f88886c;

            a(RollRoomDetailFragment rollRoomDetailFragment, BBSUserInfoObj bBSUserInfoObj) {
                this.f88885b = rollRoomDetailFragment;
                this.f88886c = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38919, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((com.max.hbcommon.base.d) this.f88885b).mContext;
                f0.o(mContext, "mContext");
                String userid = this.f88886c.getUserid();
                f0.o(userid, "user.userid");
                com.max.xiaoheihe.base.router.b.U(mContext, userid, this.f88886c.getSteamid()).A();
            }
        }

        q(Activity activity, List<GameRollEarnInfoObj> list) {
            super(activity, list, R.layout.item_roll_room_earn_info);
        }

        public void m(@dl.d s.e viewHolder, @dl.d GameRollEarnInfoObj data) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 38917, new Class[]{s.e.class, GameRollEarnInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ax axVarA = ax.a(viewHolder.b());
            f0.o(axVarA, "bind(viewHolder.getItemView())");
            BBSUserInfoObj user_info = data.getUser_info();
            RollRoomDetailFragment rollRoomDetailFragment = RollRoomDetailFragment.this;
            axVarA.f108650h.setName(user_info.getUsername());
            axVarA.f108650h.getAvartar().setAvatar(user_info.getAvartar(), user_info.getAvatar_decoration());
            axVarA.f108650h.a(user_info.getMedal(), user_info.getMedals(), user_info.getUserid());
            LevelInfoObj level_info = user_info.getLevel_info();
            if (level_info != null) {
                f0.o(level_info, "level_info");
                axVarA.f108650h.setLevel(com.max.hbutils.utils.n.q(user_info.getLevel_info().getLevel()));
            }
            axVarA.f108650h.setType(BBSUserSectionView.BBSUserSectionType.Link);
            axVarA.f108650h.getAvartar().setOnClickListener(new a(rollRoomDetailFragment, user_info));
            if (f0.g(user_info.getUserid(), i0.j())) {
                axVarA.f108650h.getLl_top_last().removeAllViews();
                TextView textView = new TextView(((com.max.hbcommon.base.d) rollRoomDetailFragment).mContext);
                textView.setText("我获得的");
                textView.setTextSize(1, 10.0f);
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                textView.setGravity(17);
                textView.setBackgroundDrawable(ViewUtils.i(ViewUtils.f(((com.max.hbcommon.base.d) rollRoomDetailFragment).mContext, 2.0f), com.max.xiaoheihe.utils.d.E(R.color.red_start), com.max.xiaoheihe.utils.d.E(R.color.red_end)));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) rollRoomDetailFragment).mContext, 46.0f), ViewUtils.f(((com.max.hbcommon.base.d) rollRoomDetailFragment).mContext, 16.0f));
                layoutParams.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) rollRoomDetailFragment).mContext, 6.0f);
                axVarA.f108650h.getLl_top_last().addView(textView, layoutParams);
                z10 = true;
            } else {
                axVarA.f108650h.getLl_top_last().removeAllViews();
                z10 = false;
            }
            axVarA.f108644b.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext, R.color.divider_secondary_2_color, 8.0f), ((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext, R.color.background_layer_1_color, 0.5f));
            axVarA.f108652j.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_1_color));
            if (com.max.hbutils.utils.n.p(data.getTotal_price()) > 0.0f) {
                axVarA.f108647e.setText(data.getTotal_price());
                axVarA.f108648f.setVisibility(0);
                axVarA.f108645c.setVisibility(0);
                axVarA.f108647e.setVisibility(0);
            } else {
                axVarA.f108648f.setVisibility(8);
                axVarA.f108645c.setVisibility(8);
                axVarA.f108647e.setVisibility(8);
            }
            axVarA.f108646d.setText(data.getGame_count());
            if (viewHolder.getBindingAdapterPosition() != 0) {
                axVarA.f108649g.setVisibility(0);
            } else {
                axVarA.f108649g.setVisibility(8);
            }
            axVarA.f108651i.removeAllViews();
            if (com.max.hbcommon.utils.c.w(data.getWin_items())) {
                return;
            }
            for (RollItemObj rollitem : data.getWin_items()) {
                be.d dVarD = be.d.d(this.mInflater, axVarA.f108651i, false);
                f0.o(dVarD, "inflate(\n               …                        )");
                RollRoomDetailFragment rollRoomDetailFragment2 = RollRoomDetailFragment.this;
                f0.o(rollitem, "rollitem");
                rollRoomDetailFragment2.X4(dVarD, rollitem, z10);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                if (axVarA.f108651i.getChildCount() > 0) {
                    layoutParams2.topMargin = ViewUtils.f(((com.max.hbcommon.base.d) RollRoomDetailFragment.this).mContext, 6.0f);
                }
                axVarA.f108651i.addView(dVarD.b(), layoutParams2);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, GameRollEarnInfoObj gameRollEarnInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameRollEarnInfoObj}, this, changeQuickRedirect, false, 38918, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameRollEarnInfoObj);
        }
    }

    public static final /* synthetic */ void I4(RollRoomDetailFragment rollRoomDetailFragment) {
        if (PatchProxy.proxy(new Object[]{rollRoomDetailFragment}, null, changeQuickRedirect, true, 38891, new Class[]{RollRoomDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        rollRoomDetailFragment.S4();
    }

    public static final /* synthetic */ void M4(RollRoomDetailFragment rollRoomDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{rollRoomDetailFragment, str}, null, changeQuickRedirect, true, 38890, new Class[]{RollRoomDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        rollRoomDetailFragment.V4(str);
    }

    public static final /* synthetic */ void O4(RollRoomDetailFragment rollRoomDetailFragment) {
        if (PatchProxy.proxy(new Object[]{rollRoomDetailFragment}, null, changeQuickRedirect, true, 38887, new Class[]{RollRoomDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        rollRoomDetailFragment.showError();
    }

    public static final /* synthetic */ void P4(RollRoomDetailFragment rollRoomDetailFragment) {
        if (PatchProxy.proxy(new Object[]{rollRoomDetailFragment}, null, changeQuickRedirect, true, 38889, new Class[]{RollRoomDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        rollRoomDetailFragment.c5();
    }

    public static final /* synthetic */ void Q4(RollRoomDetailFragment rollRoomDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{rollRoomDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38888, new Class[]{RollRoomDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        rollRoomDetailFragment.e5(z10);
    }

    private final void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38870, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f88857q;
        if (str == null) {
            f0.S("mLinkId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.s(null, str, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, this.f88858r, null, "0", "0", null, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    private final void V4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38885, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f88863w;
        if (loadingDialog != null) {
            f0.m(loadingDialog);
            if (!loadingDialog.i()) {
                Activity mContext = this.mContext;
                f0.o(mContext, "mContext");
                this.f88863w = new LoadingDialog(mContext, "", true).r();
            }
        } else {
            Activity mContext2 = this.mContext;
            f0.o(mContext2, "mContext");
            this.f88863w = new LoadingDialog(mContext2, "", true).r();
        }
        JsonObject jsonObject = new JsonObject();
        LinkInfoObj linkInfoObj = this.f88860t;
        f0.m(linkInfoObj);
        String room_id = linkInfoObj.getRelated_status().getRoom_detail().getRoom_id();
        jsonObject.addProperty("room_id", room_id);
        if (!com.max.hbcommon.utils.c.u(str)) {
            jsonObject.addProperty("passwd", str);
        }
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.p(jsonObject));
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r9(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(room_id)));
    }

    public static /* synthetic */ void Y4(RollRoomDetailFragment rollRoomDetailFragment, be.d dVar, RollItemObj rollItemObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{rollRoomDetailFragment, dVar, rollItemObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 38880, new Class[]{RollRoomDetailFragment.class, be.d.class, RollItemObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        rollRoomDetailFragment.X4(dVar, rollItemObj, z10);
    }

    private final void a5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38877, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iE = z10 ? com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color) : com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color);
        gb gbVar = this.f88856p;
        gb gbVar2 = null;
        if (gbVar == null) {
            f0.S("mBinding");
            gbVar = null;
        }
        gbVar.f110915q.setTextColor(iE);
        gb gbVar3 = this.f88856p;
        if (gbVar3 == null) {
            f0.S("mBinding");
            gbVar3 = null;
        }
        gbVar3.f110903e.setColorFilter(iE);
        gb gbVar4 = this.f88856p;
        if (gbVar4 == null) {
            f0.S("mBinding");
        } else {
            gbVar2 = gbVar4;
        }
        TextView textView = gbVar2.f110915q;
        LinkInfoObj linkInfoObj = this.f88860t;
        f0.m(linkInfoObj);
        String link_award_num = linkInfoObj.getLink_award_num();
        f0.o(link_award_num, "mLinkInfoObj!!.link_award_num");
        textView.setText(String.valueOf(Math.max(Integer.parseInt(link_award_num), 0)));
    }

    private final void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38884, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        EditText editText = new EditText(this.mContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int iF = ViewUtils.f(this.mContext, 10.0f);
        layoutParams.setMargins(0, iF, 0, iF * 2);
        editText.setLayoutParams(layoutParams);
        editText.setPadding(iF, iF, iF, iF);
        editText.setGravity(17);
        editText.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.drawable.bg_dialog_edit));
        editText.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_16));
        editText.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
        new com.max.hbcommon.view.a.f(this.mContext).y(getString(R.string.prompt)).l(getString(R.string.room_input_pwd)).i(editText).u(getString(R.string.join_immediately), new i(editText, this)).o(getString(R.string.cancel), j.f88877b).F();
    }

    private final void d5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38875, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        gb gbVar = this.f88856p;
        gb gbVar2 = null;
        if (gbVar == null) {
            f0.S("mBinding");
            gbVar = null;
        }
        gbVar.f110902d.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.mContext, R.color.divider_secondary_2_color, 8.0f), this.mContext, R.color.background_layer_1_color, 0.5f));
        gb gbVar3 = this.f88856p;
        if (gbVar3 == null) {
            f0.S("mBinding");
            gbVar3 = null;
        }
        gbVar3.E.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_1_color));
        gb gbVar4 = this.f88856p;
        if (gbVar4 == null) {
            f0.S("mBinding");
            gbVar4 = null;
        }
        TextView textView = gbVar4.f110919u;
        v0 v0Var = v0.f124986a;
        String string = getString(R.string.roll_time_format);
        f0.o(string, "getString(R.string.roll_time_format)");
        Object[] objArr = new Object[1];
        GameRollRoomObj gameRollRoomObj = this.f88861u;
        objArr[0] = gameRollRoomObj != null ? gameRollRoomObj.getRoll_time_desc() : null;
        String str = String.format(string, Arrays.copyOf(objArr, 1));
        f0.o(str, "format(format, *args)");
        textView.setText(str);
        gb gbVar5 = this.f88856p;
        if (gbVar5 == null) {
            f0.S("mBinding");
            gbVar5 = null;
        }
        TextView textView2 = gbVar5.f110913o;
        String string2 = getString(R.string.roll_get_prize_user_num_format);
        f0.o(string2, "getString(R.string.roll_get_prize_user_num_format)");
        Object[] objArr2 = new Object[1];
        GameRollRoomObj gameRollRoomObj2 = this.f88861u;
        objArr2[0] = gameRollRoomObj2 != null ? gameRollRoomObj2.getGet_prize_user_num() : null;
        String str2 = String.format(string2, Arrays.copyOf(objArr2, 1));
        f0.o(str2, "format(format, *args)");
        textView2.setText(str2);
        gb gbVar6 = this.f88856p;
        if (gbVar6 == null) {
            f0.S("mBinding");
            gbVar6 = null;
        }
        gbVar6.f110907i.setLayoutManager(new LinearLayoutManager(this.mContext));
        gb gbVar7 = this.f88856p;
        if (gbVar7 == null) {
            f0.S("mBinding");
            gbVar7 = null;
        }
        RecyclerView recyclerView = gbVar7.f110907i;
        Activity activity = this.mContext;
        GameRollRoomObj gameRollRoomObj3 = this.f88861u;
        recyclerView.setAdapter(new k(activity, gameRollRoomObj3 != null ? gameRollRoomObj3.getRoll_items() : null));
        GameRollRoomObj gameRollRoomObj4 = this.f88861u;
        if (com.max.hbutils.utils.n.p(gameRollRoomObj4 != null ? gameRollRoomObj4.getTotal_price() : null) <= 0.0f) {
            gb gbVar8 = this.f88856p;
            if (gbVar8 == null) {
                f0.S("mBinding");
                gbVar8 = null;
            }
            gbVar8.f110921w.setVisibility(8);
            gb gbVar9 = this.f88856p;
            if (gbVar9 == null) {
                f0.S("mBinding");
                gbVar9 = null;
            }
            gbVar9.f110916r.setVisibility(8);
            gb gbVar10 = this.f88856p;
            if (gbVar10 == null) {
                f0.S("mBinding");
                gbVar10 = null;
            }
            gbVar10.f110918t.setVisibility(8);
        } else {
            gb gbVar11 = this.f88856p;
            if (gbVar11 == null) {
                f0.S("mBinding");
                gbVar11 = null;
            }
            TextView textView3 = gbVar11.f110918t;
            GameRollRoomObj gameRollRoomObj5 = this.f88861u;
            textView3.setText(gameRollRoomObj5 != null ? gameRollRoomObj5.getTotal_price() : null);
            gb gbVar12 = this.f88856p;
            if (gbVar12 == null) {
                f0.S("mBinding");
                gbVar12 = null;
            }
            gbVar12.f110921w.setVisibility(0);
            gb gbVar13 = this.f88856p;
            if (gbVar13 == null) {
                f0.S("mBinding");
                gbVar13 = null;
            }
            gbVar13.f110916r.setVisibility(0);
            gb gbVar14 = this.f88856p;
            if (gbVar14 == null) {
                f0.S("mBinding");
                gbVar14 = null;
            }
            gbVar14.f110918t.setVisibility(0);
        }
        gb gbVar15 = this.f88856p;
        if (gbVar15 == null) {
            f0.S("mBinding");
            gbVar15 = null;
        }
        TextView textView4 = gbVar15.f110917s;
        GameRollRoomObj gameRollRoomObj6 = this.f88861u;
        textView4.setText(gameRollRoomObj6 != null ? gameRollRoomObj6.getGame_count() : null);
        LinkInfoObj linkInfoObj = this.f88860t;
        f0.m(linkInfoObj);
        a5(f0.g(linkInfoObj.getIs_award_link(), "1"));
        gb gbVar16 = this.f88856p;
        if (gbVar16 == null) {
            f0.S("mBinding");
            gbVar16 = null;
        }
        gbVar16.B.setOnClickListener(new l());
        gb gbVar17 = this.f88856p;
        if (gbVar17 == null) {
            f0.S("mBinding");
        } else {
            gbVar2 = gbVar17;
        }
        gbVar2.F.setOnClickListener(new m());
    }

    private final void e5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38878, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            LinkInfoObj linkInfoObj = this.f88860t;
            f0.m(linkInfoObj);
            LinkInfoObj linkInfoObj2 = this.f88860t;
            f0.m(linkInfoObj2);
            String link_award_num = linkInfoObj2.getLink_award_num();
            f0.o(link_award_num, "mLinkInfoObj!!.link_award_num");
            linkInfoObj.setLink_award_num(String.valueOf(Integer.parseInt(link_award_num) + 1));
            LinkInfoObj linkInfoObj3 = this.f88860t;
            f0.m(linkInfoObj3);
            linkInfoObj3.setIs_award_link("1");
        } else {
            LinkInfoObj linkInfoObj4 = this.f88860t;
            f0.m(linkInfoObj4);
            LinkInfoObj linkInfoObj5 = this.f88860t;
            f0.m(linkInfoObj5);
            String link_award_num2 = linkInfoObj5.getLink_award_num();
            f0.o(link_award_num2, "mLinkInfoObj!!.link_award_num");
            linkInfoObj4.setLink_award_num(String.valueOf(Math.max(Integer.parseInt(link_award_num2) - 1, 0)));
            LinkInfoObj linkInfoObj6 = this.f88860t;
            f0.m(linkInfoObj6);
            linkInfoObj6.setIs_award_link("0");
        }
        a5(z10);
    }

    private final void g5() {
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38873, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameRollRoomObj gameRollRoomObj = this.f88861u;
        f0.m(gameRollRoomObj);
        gb gbVar = null;
        if (gameRollRoomObj.isHas_pwd()) {
            gb gbVar2 = this.f88856p;
            if (gbVar2 == null) {
                f0.S("mBinding");
                gbVar2 = null;
            }
            gbVar2.C.b().setVisibility(0);
            gb gbVar3 = this.f88856p;
            if (gbVar3 == null) {
                f0.S("mBinding");
            } else {
                gbVar = gbVar3;
            }
            gbVar.C.f115140c.setText("注意交易安全谨防上当受骗");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("加密房间：");
            LinkInfoObj linkInfoObj = this.f88860t;
            f0.m(linkInfoObj);
            sb2.append(linkInfoObj.getRelated_status().getRoom_detail().getRoom_id());
            string = sb2.toString();
        } else {
            gb gbVar4 = this.f88856p;
            if (gbVar4 == null) {
                f0.S("mBinding");
            } else {
                gbVar = gbVar4;
            }
            gbVar.C.b().setVisibility(8);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("房间：");
            LinkInfoObj linkInfoObj2 = this.f88860t;
            f0.m(linkInfoObj2);
            sb3.append(linkInfoObj2.getRelated_status().getRoom_detail().getRoom_id());
            string = sb3.toString();
        }
        this.mTitleBar.setTitle(string);
    }

    private final void h5() {
        boolean z10;
        BBSUserInfoObj user;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38874, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObj = this.f88860t;
        gb gbVar = null;
        if (linkInfoObj != null && (user = linkInfoObj.getUser()) != null) {
            gb gbVar2 = this.f88856p;
            if (gbVar2 == null) {
                f0.S("mBinding");
                gbVar2 = null;
            }
            gbVar2.f110922x.setName(user.getUsername());
            gb gbVar3 = this.f88856p;
            if (gbVar3 == null) {
                f0.S("mBinding");
                gbVar3 = null;
            }
            gbVar3.f110922x.getAvartar().setAvatar(user.getAvartar(), user.getAvatar_decoration());
            gb gbVar4 = this.f88856p;
            if (gbVar4 == null) {
                f0.S("mBinding");
                gbVar4 = null;
            }
            gbVar4.f110922x.a(user.getMedal(), user.getMedals(), user.getUserid());
            LevelInfoObj level_info = user.getLevel_info();
            if (level_info != null) {
                f0.o(level_info, "level_info");
                gb gbVar5 = this.f88856p;
                if (gbVar5 == null) {
                    f0.S("mBinding");
                    gbVar5 = null;
                }
                gbVar5.f110922x.setLevel(com.max.hbutils.utils.n.q(user.getLevel_info().getLevel()));
            }
            gb gbVar6 = this.f88856p;
            if (gbVar6 == null) {
                f0.S("mBinding");
                gbVar6 = null;
            }
            gbVar6.f110922x.setType(BBSUserSectionView.BBSUserSectionType.Link);
            gb gbVar7 = this.f88856p;
            if (gbVar7 == null) {
                f0.S("mBinding");
                gbVar7 = null;
            }
            gbVar7.f110922x.getAvartar().setOnClickListener(new p(user));
        }
        GameRollRoomObj gameRollRoomObj = this.f88861u;
        boolean z11 = true;
        if (com.max.hbcommon.utils.c.u(gameRollRoomObj != null ? gameRollRoomObj.getRoom_desc() : null)) {
            gb gbVar8 = this.f88856p;
            if (gbVar8 == null) {
                f0.S("mBinding");
                gbVar8 = null;
            }
            gbVar8.f110912n.setVisibility(8);
            z10 = false;
        } else {
            gb gbVar9 = this.f88856p;
            if (gbVar9 == null) {
                f0.S("mBinding");
                gbVar9 = null;
            }
            ExpressionTextView expressionTextView = gbVar9.f110912n;
            GameRollRoomObj gameRollRoomObj2 = this.f88861u;
            expressionTextView.setText(gameRollRoomObj2 != null ? gameRollRoomObj2.getRoom_desc() : null);
            gb gbVar10 = this.f88856p;
            if (gbVar10 == null) {
                f0.S("mBinding");
                gbVar10 = null;
            }
            gbVar10.f110912n.setVisibility(0);
            z10 = true;
        }
        GameRollRoomObj gameRollRoomObj3 = this.f88861u;
        if (com.max.hbcommon.utils.c.u(gameRollRoomObj3 != null ? gameRollRoomObj3.getRoom_title() : null)) {
            gb gbVar11 = this.f88856p;
            if (gbVar11 == null) {
                f0.S("mBinding");
                gbVar11 = null;
            }
            gbVar11.f110920v.setVisibility(8);
            z11 = z10;
        } else {
            gb gbVar12 = this.f88856p;
            if (gbVar12 == null) {
                f0.S("mBinding");
                gbVar12 = null;
            }
            HBLineHeightTextView hBLineHeightTextView = gbVar12.f110920v;
            GameRollRoomObj gameRollRoomObj4 = this.f88861u;
            hBLineHeightTextView.setText(gameRollRoomObj4 != null ? gameRollRoomObj4.getRoom_title() : null);
            gb gbVar13 = this.f88856p;
            if (gbVar13 == null) {
                f0.S("mBinding");
                gbVar13 = null;
            }
            gbVar13.f110920v.setVisibility(0);
        }
        if (z11) {
            gb gbVar14 = this.f88856p;
            if (gbVar14 == null) {
                f0.S("mBinding");
            } else {
                gbVar = gbVar14;
            }
            gbVar.f110909k.setVisibility(0);
            return;
        }
        gb gbVar15 = this.f88856p;
        if (gbVar15 == null) {
            f0.S("mBinding");
        } else {
            gbVar = gbVar15;
        }
        gbVar.f110909k.setVisibility(8);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38869, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        String string = arguments.getString(A);
        f0.m(string);
        this.f88857q = string;
    }

    public final void R4(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38876, new Class[]{String.class, String.class}, Void.TYPE).isSupported || this.f88862v) {
            return;
        }
        this.f88862v = true;
        z<Result> zVarZ2 = com.max.xiaoheihe.network.i.a().z2(null, str, str2, new HashMap());
        f0.o(zVarZ2, "createHeyBoxService()\n  …inkId, awardType, params)");
        addDisposable((io.reactivex.disposables.b) zVarZ2.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str2)));
    }

    @dl.e
    public final LoadingDialog T4() {
        return this.f88863w;
    }

    @dl.d
    public final com.max.hbshare.c.b U4() {
        return this.f88864x;
    }

    public final void W4(@dl.e Result<BBSLinkTreeObj> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38872, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88858r = "0";
        this.f88859s = result;
        if (result != null && result.getResult() != null) {
            BBSLinkTreeObj result2 = result.getResult();
            f0.m(result2);
            if (result2.getLink() != null) {
                BBSLinkTreeObj result3 = result.getResult();
                f0.m(result3);
                LinkInfoObj link = result3.getLink();
                this.f88860t = link;
                f0.m(link);
                this.f88861u = link.getRelated_status().getRoom_detail();
            }
        }
        if (this.f88861u == null) {
            showError();
            return;
        }
        g5();
        h5();
        d5();
        f5();
        i5();
        Z4();
        showContentView();
    }

    public final void X4(@dl.d be.d itemBinding, @dl.d RollItemObj data, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemBinding, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38879, new Class[]{be.d.class, RollItemObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemBinding, "itemBinding");
        f0.p(data, "data");
        Context context = itemBinding.b().getContext();
        com.max.hbimage.b.K(data.getImage(), itemBinding.f35260f);
        itemBinding.f35259e.setBackgroundDrawable(com.max.hbutils.utils.q.L(context, R.color.white_alpha40, 0.5f, 4.0f));
        itemBinding.f35265k.setText(data.getName());
        itemBinding.f35266l.setText(data.getTime_desc());
        itemBinding.f35264j.setText(data.getDescription());
        itemBinding.f35258d.setVisibility(8);
        itemBinding.b().setOnClickListener(new e(data, this));
        if (z10) {
            itemBinding.f35257c.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color)));
        } else {
            itemBinding.f35257c.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_gray_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_gray_dark_end_color)));
        }
    }

    public final void Z4() {
        LinkInfoObj linkInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38883, new Class[0], Void.TYPE).isSupported || (linkInfoObj = this.f88860t) == null) {
            return;
        }
        f0.m(linkInfoObj);
        if (linkInfoObj.getRelated_status().getRoom_detail() == null) {
            return;
        }
        LinkInfoObj linkInfoObj2 = this.f88860t;
        f0.m(linkInfoObj2);
        GameRollRoomObj room_detail = linkInfoObj2.getRelated_status().getRoom_detail();
        Drawable graybg = ViewUtils.i(ViewUtils.f(this.mContext, 5.0f), com.max.xiaoheihe.utils.d.E(R.color.black_start), com.max.xiaoheihe.utils.d.E(R.color.black_end));
        graybg.setAlpha(128);
        gb gbVar = null;
        if (!f0.g("1", room_detail.getOver())) {
            if (f0.g("1", room_detail.getIn_room())) {
                gb gbVar2 = this.f88856p;
                if (gbVar2 == null) {
                    f0.S("mBinding");
                    gbVar2 = null;
                }
                gbVar2.f110900b.setRightText(this.mContext.getResources().getString(R.string.joined));
                gb gbVar3 = this.f88856p;
                if (gbVar3 == null) {
                    f0.S("mBinding");
                    gbVar3 = null;
                }
                gbVar3.f110900b.setRightTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                gb gbVar4 = this.f88856p;
                if (gbVar4 == null) {
                    f0.S("mBinding");
                    gbVar4 = null;
                }
                BottomButtonLeftItemView bottomButtonLeftItemView = gbVar4.f110900b;
                f0.o(graybg, "graybg");
                bottomButtonLeftItemView.setRightBackground(graybg);
                gb gbVar5 = this.f88856p;
                if (gbVar5 == null) {
                    f0.S("mBinding");
                    gbVar5 = null;
                }
                gbVar5.f110900b.setRightClickListener(null);
                return;
            }
            String string = getString(R.string.join_immediately);
            f0.o(string, "getString(R.string.join_immediately)");
            gb gbVar6 = this.f88856p;
            if (gbVar6 == null) {
                f0.S("mBinding");
                gbVar6 = null;
            }
            gbVar6.f110900b.setRightText(string);
            gb gbVar7 = this.f88856p;
            if (gbVar7 == null) {
                f0.S("mBinding");
                gbVar7 = null;
            }
            gbVar7.f110900b.setRightTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            gb gbVar8 = this.f88856p;
            if (gbVar8 == null) {
                f0.S("mBinding");
                gbVar8 = null;
            }
            BottomButtonLeftItemView bottomButtonLeftItemView2 = gbVar8.f110900b;
            Drawable drawableI = ViewUtils.i(ViewUtils.f(this.mContext, 5.0f), com.max.xiaoheihe.utils.d.E(R.color.dialog_btn_black_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            f0.o(drawableI, "getBL2TRGradientRoundedR…or)\n                    )");
            bottomButtonLeftItemView2.setRightBackground(drawableI);
            gb gbVar9 = this.f88856p;
            if (gbVar9 == null) {
                f0.S("mBinding");
            } else {
                gbVar = gbVar9;
            }
            gbVar.f110900b.setRightClickListener(new f(room_detail, this));
            return;
        }
        if (f0.g("1", room_detail.getWin_prize()) || !(room_detail.getMy_prize() == null || room_detail.getMy_prize().getWin_items() == null)) {
            gb gbVar10 = this.f88856p;
            if (gbVar10 == null) {
                f0.S("mBinding");
                gbVar10 = null;
            }
            gbVar10.f110900b.setRightText(this.mContext.getResources().getString(R.string.already_win));
            gb gbVar11 = this.f88856p;
            if (gbVar11 == null) {
                f0.S("mBinding");
                gbVar11 = null;
            }
            gbVar11.f110900b.setRightTextColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha50));
            gb gbVar12 = this.f88856p;
            if (gbVar12 == null) {
                f0.S("mBinding");
                gbVar12 = null;
            }
            BottomButtonLeftItemView bottomButtonLeftItemView3 = gbVar12.f110900b;
            Drawable drawableI2 = ViewUtils.i(ViewUtils.f(this.mContext, 5.0f), com.max.xiaoheihe.utils.d.E(R.color.red_start), com.max.xiaoheihe.utils.d.E(R.color.red_end));
            f0.o(drawableI2, "getBL2TRGradientRoundedR…nd)\n                    )");
            bottomButtonLeftItemView3.setRightBackground(drawableI2);
            gb gbVar13 = this.f88856p;
            if (gbVar13 == null) {
                f0.S("mBinding");
                gbVar13 = null;
            }
            gbVar13.f110900b.setRightClickListener(null);
            return;
        }
        if (f0.g("1", room_detail.getIn_room())) {
            gb gbVar14 = this.f88856p;
            if (gbVar14 == null) {
                f0.S("mBinding");
                gbVar14 = null;
            }
            gbVar14.f110900b.setRightText(this.mContext.getResources().getString(R.string.not_win));
            gb gbVar15 = this.f88856p;
            if (gbVar15 == null) {
                f0.S("mBinding");
                gbVar15 = null;
            }
            gbVar15.f110900b.setRightTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            gb gbVar16 = this.f88856p;
            if (gbVar16 == null) {
                f0.S("mBinding");
                gbVar16 = null;
            }
            BottomButtonLeftItemView bottomButtonLeftItemView4 = gbVar16.f110900b;
            f0.o(graybg, "graybg");
            bottomButtonLeftItemView4.setRightBackground(graybg);
            gb gbVar17 = this.f88856p;
            if (gbVar17 == null) {
                f0.S("mBinding");
                gbVar17 = null;
            }
            gbVar17.f110900b.setRightClickListener(null);
            return;
        }
        gb gbVar18 = this.f88856p;
        if (gbVar18 == null) {
            f0.S("mBinding");
            gbVar18 = null;
        }
        gbVar18.f110900b.setRightText(this.mContext.getResources().getString(R.string.already_over));
        gb gbVar19 = this.f88856p;
        if (gbVar19 == null) {
            f0.S("mBinding");
            gbVar19 = null;
        }
        gbVar19.f110900b.setRightTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        gb gbVar20 = this.f88856p;
        if (gbVar20 == null) {
            f0.S("mBinding");
            gbVar20 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView5 = gbVar20.f110900b;
        f0.o(graybg, "graybg");
        bottomButtonLeftItemView5.setRightBackground(graybg);
        gb gbVar21 = this.f88856p;
        if (gbVar21 == null) {
            f0.S("mBinding");
            gbVar21 = null;
        }
        gbVar21.f110900b.setRightClickListener(null);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38886, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A, (String) (map != null ? map.get(A) : null));
        return f88854y.a(bundle);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38868, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        gb gbVarC = gb.c(this.mInflater);
        f0.o(gbVarC, "inflate(mInflater)");
        this.f88856p = gbVarC;
        gb gbVar = null;
        if (gbVarC == null) {
            f0.S("mBinding");
            gbVarC = null;
        }
        setContentView(gbVarC);
        this.mTitleBar.a0();
        this.mTitleBarDivider.setVisibility(8);
        gb gbVar2 = this.f88856p;
        if (gbVar2 == null) {
            f0.S("mBinding");
            gbVar2 = null;
        }
        gbVar2.f110911m.i0(false);
        gb gbVar3 = this.f88856p;
        if (gbVar3 == null) {
            f0.S("mBinding");
        } else {
            gbVar = gbVar3;
        }
        gbVar.f110911m.b0(false);
        showLoading();
        S4();
    }

    public final void b5(@dl.e LoadingDialog loadingDialog) {
        this.f88863w = loadingDialog;
    }

    public final void f5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List[] listArr = new List[1];
        GameRollRoomObj gameRollRoomObj = this.f88861u;
        gb gbVar = null;
        listArr[0] = gameRollRoomObj != null ? gameRollRoomObj.getJoin_users() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            gb gbVar2 = this.f88856p;
            if (gbVar2 == null) {
                f0.S("mBinding");
                gbVar2 = null;
            }
            gbVar2.A.setVisibility(8);
            gb gbVar3 = this.f88856p;
            if (gbVar3 == null) {
                f0.S("mBinding");
            } else {
                gbVar = gbVar3;
            }
            gbVar.f110910l.setVisibility(8);
            return;
        }
        gb gbVar4 = this.f88856p;
        if (gbVar4 == null) {
            f0.S("mBinding");
            gbVar4 = null;
        }
        gbVar4.A.setVisibility(0);
        gb gbVar5 = this.f88856p;
        if (gbVar5 == null) {
            f0.S("mBinding");
            gbVar5 = null;
        }
        gbVar5.f110910l.setVisibility(0);
        gb gbVar6 = this.f88856p;
        if (gbVar6 == null) {
            f0.S("mBinding");
            gbVar6 = null;
        }
        TextView textView = gbVar6.f110914p;
        GameRollRoomObj gameRollRoomObj2 = this.f88861u;
        textView.setText(gameRollRoomObj2 != null ? gameRollRoomObj2.getJoin_user_count() : null);
        gb gbVar7 = this.f88856p;
        if (gbVar7 == null) {
            f0.S("mBinding");
            gbVar7 = null;
        }
        gbVar7.f110906h.setLayoutManager(new GridLayoutManager(this.mContext, 10));
        gb gbVar8 = this.f88856p;
        if (gbVar8 == null) {
            f0.S("mBinding");
            gbVar8 = null;
        }
        gbVar8.f110906h.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.background_card_1_color, 5.0f));
        gb gbVar9 = this.f88856p;
        if (gbVar9 == null) {
            f0.S("mBinding");
            gbVar9 = null;
        }
        RecyclerView recyclerView = gbVar9.f110906h;
        Activity activity = this.mContext;
        GameRollRoomObj gameRollRoomObj3 = this.f88861u;
        recyclerView.setAdapter(new n(activity, gameRollRoomObj3 != null ? gameRollRoomObj3.getJoin_users() : null));
        gb gbVar10 = this.f88856p;
        if (gbVar10 == null) {
            f0.S("mBinding");
        } else {
            gbVar = gbVar10;
        }
        gbVar.f110923y.setOnClickListener(new o());
    }

    public final void i5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List[] listArr = new List[1];
        GameRollRoomObj gameRollRoomObj = this.f88861u;
        gb gbVar = null;
        listArr[0] = gameRollRoomObj != null ? gameRollRoomObj.getEarn_info() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            gb gbVar2 = this.f88856p;
            if (gbVar2 == null) {
                f0.S("mBinding");
                gbVar2 = null;
            }
            gbVar2.f110904f.setVisibility(8);
            gb gbVar3 = this.f88856p;
            if (gbVar3 == null) {
                f0.S("mBinding");
            } else {
                gbVar = gbVar3;
            }
            gbVar.f110908j.setVisibility(8);
            return;
        }
        gb gbVar4 = this.f88856p;
        if (gbVar4 == null) {
            f0.S("mBinding");
            gbVar4 = null;
        }
        gbVar4.f110904f.setVisibility(0);
        gb gbVar5 = this.f88856p;
        if (gbVar5 == null) {
            f0.S("mBinding");
            gbVar5 = null;
        }
        gbVar5.f110908j.setVisibility(0);
        gb gbVar6 = this.f88856p;
        if (gbVar6 == null) {
            f0.S("mBinding");
            gbVar6 = null;
        }
        gbVar6.f110908j.setLayoutManager(new LinearLayoutManager(this.mContext));
        gb gbVar7 = this.f88856p;
        if (gbVar7 == null) {
            f0.S("mBinding");
        } else {
            gbVar = gbVar7;
        }
        RecyclerView recyclerView = gbVar.f110908j;
        Activity activity = this.mContext;
        GameRollRoomObj gameRollRoomObj2 = this.f88861u;
        f0.m(gameRollRoomObj2);
        recyclerView.setAdapter(new q(activity, gameRollRoomObj2.getEarn_info()));
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38871, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        showLoading();
        S4();
    }
}
