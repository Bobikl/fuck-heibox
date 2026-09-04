package com.max.xiaoheihe.module.bbs.post_edit.post_setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.transition.AutoTransition;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.picker.HBWrappedDateTimePicker;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.max.xiaoheihe.bean.bbs.PostSettingObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import df.f6;
import dl.d;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: PostSettingDialogFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,974:1\n1855#2,2:975\n1855#2,2:977\n1855#2,2:979\n1#3:981\n262#4,2:982\n262#4,2:984\n262#4,2:986\n262#4,2:988\n262#4,2:990\n262#4,2:992\n262#4,2:994\n262#4,2:996\n262#4,2:998\n262#4,2:1000\n262#4,2:1002\n262#4,2:1004\n262#4,2:1006\n262#4,2:1008\n262#4,2:1010\n262#4,2:1012\n262#4,2:1014\n262#4,2:1016\n262#4,2:1018\n262#4,2:1020\n262#4,2:1022\n*S KotlinDebug\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment\n*L\n158#1:975,2\n168#1:977,2\n180#1:979,2\n296#1:982,2\n443#1:984,2\n444#1:986,2\n445#1:988,2\n446#1:990,2\n449#1:992,2\n452#1:994,2\n484#1:996,2\n485#1:998,2\n486#1:1000,2\n488#1:1002,2\n489#1:1004,2\n493#1:1006,2\n494#1:1008,2\n495#1:1010,2\n496#1:1012,2\n497#1:1014,2\n646#1:1016,2\n651#1:1018,2\n655#1:1020,2\n659#1:1022,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PostSettingDialogFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final a f83089t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f83090u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f83091v = "post_setting";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f83092w = "post_plan_protocol";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final String f83093x = "post_link_plan_toast_text";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final String f83094y = "origin_link_schedule_post_time";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final String f83095z = "allow_schedule_post";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f6 f83096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private PostType f83097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private PostSettingObj f83098l = new PostSettingObj(false, null, null, null, null, null, null, null, null, null, false, 0, 4095, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private PostSettingObj f83099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f83100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.post_edit.post_setting.a f83101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private String f83102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f83103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f83104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private ActivityPostSettingViewModel f83105s;

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ PostSettingDialogFragment b(a aVar, PostType postType, PostSettingObj postSettingObj, String str, long j10, Boolean bool, String str2, Boolean bool2, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, postType, postSettingObj, str, new Long(j10), bool, str2, bool2, new Integer(i10), obj}, null, changeQuickRedirect, true, 31058, new Class[]{a.class, PostType.class, PostSettingObj.class, String.class, Long.TYPE, Boolean.class, String.class, Boolean.class, Integer.TYPE, Object.class}, PostSettingDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostSettingDialogFragment) patchProxyResultProxy.result;
            }
            return aVar.a(postType, (i10 & 2) != 0 ? null : postSettingObj, (i10 & 4) != 0 ? null : str, j10, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : str2, bool2);
        }

        @dl.d
        @xh.m
        public final PostSettingDialogFragment a(@dl.d PostType postType, @dl.e PostSettingObj postSettingObj, @dl.e String str, long j10, @dl.e Boolean bool, @dl.e String str2, @dl.e Boolean bool2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postType, postSettingObj, str, new Long(j10), bool, str2, bool2}, this, changeQuickRedirect, false, 31057, new Class[]{PostType.class, PostSettingObj.class, String.class, Long.TYPE, Boolean.class, String.class, Boolean.class}, PostSettingDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostSettingDialogFragment) patchProxyResultProxy.result;
            }
            f0.p(postType, "postType");
            PostSettingDialogFragment postSettingDialogFragment = new PostSettingDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(PostTabActivity.f82576x2, postType);
            bundle.putSerializable(PostSettingDialogFragment.f83091v, postSettingObj);
            bundle.putString(PostSettingDialogFragment.f83092w, str);
            bundle.putBoolean(PostTabActivity.G2, bool != null ? bool.booleanValue() : false);
            bundle.putString(PostSettingDialogFragment.f83093x, str2);
            bundle.putLong(PostSettingDialogFragment.f83094y, j10);
            bundle.putBoolean(PostSettingDialogFragment.f83095z, bool2 != null ? bool2.booleanValue() : false);
            postSettingDialogFragment.setArguments(bundle);
            return postSettingDialogFragment;
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83106a;

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
            f83106a = iArr;
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class c implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 31059, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null || arrayList.size() <= 0) {
                return;
            }
            Uri uriFromFile = Uri.fromFile(new File(arrayList.get(0).G()));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(uriFromFile);
            PostSettingDialogFragment.W3(PostSettingDialogFragment.this, arrayList2);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer numF;
            FragmentManager supportFragmentManager;
            LiveData<Integer> liveDataS;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31060, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ActivityPostSettingViewModel activityPostSettingViewModel = PostSettingDialogFragment.this.f83105s;
            if (activityPostSettingViewModel == null || (liveDataS = activityPostSettingViewModel.s()) == null || (numF = liveDataS.f()) == null) {
                numF = 0;
            }
            com.max.hbcommon.base.c cVarA = numF.intValue() == 0 ? PostCompilationCreateDialogFragment.f83049o.a() : PostCompilationSelectDialogFragment.f83073o.a();
            FragmentActivity activity = PostSettingDialogFragment.this.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                cVarA.M3(supportFragmentManager, "PostSettingDialogFragment");
            }
            if (cVarA instanceof PostCompilationCreateDialogFragment) {
                com.max.hbcommon.analytics.d.d("4", lb.d.Z0, null, new JsonObject());
            }
            PostSettingDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FragmentManager supportFragmentManager;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31061, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FragmentActivity activity = PostSettingDialogFragment.this.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                PostCompilationSelectDialogFragment.f83073o.a().M3(supportFragmentManager, "PostSettingDialogFragment");
            }
            PostSettingDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ActivityPostSettingViewModel activityPostSettingViewModel;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31062, new Class[]{View.class}, Void.TYPE).isSupported || (activityPostSettingViewModel = PostSettingDialogFragment.this.f83105s) == null) {
                return;
            }
            activityPostSettingViewModel.v(null);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    @t0({"SMAP\nPostSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment$initProjectRecyclerView$1$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,974:1\n262#2,2:975\n262#2,2:977\n*S KotlinDebug\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment$initProjectRecyclerView$1$1$1\n*L\n376#1:975,2\n383#1:977,2\n*E\n"})
    public static final class g extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f83111b;

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f83113b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PostSettingDialogFragment f83114c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f83115d;

            a(boolean z10, PostSettingDialogFragment postSettingDialogFragment, KeyDescObj keyDescObj) {
                this.f83113b = z10;
                this.f83114c = postSettingDialogFragment;
                this.f83115d = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31065, new Class[]{View.class}, Void.TYPE).isSupported || this.f83113b) {
                    return;
                }
                FragmentActivity fragmentActivityRequireActivity = this.f83114c.requireActivity();
                f0.o(fragmentActivityRequireActivity, "requireActivity()");
                com.max.xiaoheihe.base.router.b.k0(fragmentActivityRequireActivity, this.f83115d.getProtocol());
            }
        }

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostSettingDialogFragment f83116b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f83117c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CheckBox f83118d;

            b(PostSettingDialogFragment postSettingDialogFragment, boolean z10, CheckBox checkBox) {
                this.f83116b = postSettingDialogFragment;
                this.f83117c = z10;
                this.f83118d = checkBox;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31066, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (PostSettingDialogFragment.d4(this.f83116b) && !this.f83116b.f83100n) {
                    PostSettingDialogFragment.k4(this.f83116b);
                } else {
                    if (this.f83117c) {
                        return;
                    }
                    CheckBox checkBox = this.f83118d;
                    checkBox.setChecked(true ^ checkBox.isChecked());
                }
            }
        }

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class c implements CompoundButton.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostSettingDialogFragment f83119b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CheckBox f83120c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f83121d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f83122e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f83123f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f83124g;

            c(PostSettingDialogFragment postSettingDialogFragment, CheckBox checkBox, boolean z10, KeyDescObj keyDescObj, g gVar, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f83119b = postSettingDialogFragment;
                this.f83120c = checkBox;
                this.f83121d = z10;
                this.f83122e = keyDescObj;
                this.f83123f = gVar;
                this.f83124g = eVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31067, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (PostSettingDialogFragment.d4(this.f83119b) && !this.f83119b.f83100n) {
                    PostSettingDialogFragment.k4(this.f83119b);
                    this.f83120c.setChecked(!z10);
                    return;
                }
                if (this.f83121d) {
                    this.f83122e.setChecked(false);
                    this.f83120c.setChecked(false);
                    List<KeyDescObj> select_post_plan = this.f83119b.f83098l.getSelect_post_plan();
                    if (select_post_plan != null) {
                        select_post_plan.remove(this.f83122e);
                        return;
                    }
                    return;
                }
                int size = this.f83123f.getDataList().size();
                int i10 = this.f83123f.f83111b;
                if ((i10 >= 0 && i10 < size) != false) {
                    this.f83123f.getDataList().get(this.f83123f.f83111b).setChecked(false);
                    g gVar = this.f83123f;
                    gVar.notifyItemChanged(gVar.f83111b);
                }
                this.f83123f.f83111b = this.f83124g.getAbsoluteAdapterPosition();
                this.f83122e.setChecked(true);
                List<KeyDescObj> select_post_plan2 = this.f83119b.f83098l.getSelect_post_plan();
                if (select_post_plan2 != null) {
                    KeyDescObj keyDescObj = this.f83122e;
                    select_post_plan2.clear();
                    select_post_plan2.add(keyDescObj);
                }
                g gVar2 = this.f83123f;
                gVar2.notifyItemChanged(gVar2.f83111b);
            }
        }

        g(List<KeyDescObj> list, FragmentActivity fragmentActivity) {
            super(fragmentActivity, list, R.layout.item_post_plan);
            this.f83111b = PostSettingDialogFragment.this.f83098l.getSelectPostPlanIndex();
        }

        public void o(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            View viewI;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 31063, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            PostSettingDialogFragment postSettingDialogFragment = PostSettingDialogFragment.this;
            BBSTopicIndexObj.PostPlan postPlan = keyDescObj instanceof BBSTopicIndexObj.PostPlan ? (BBSTopicIndexObj.PostPlan) keyDescObj : null;
            boolean z11 = postPlan != null && postPlan.isDisabled();
            if (z11) {
                eVar.b().setAlpha(0.5f);
            } else {
                eVar.b().setAlpha(1.0f);
            }
            String str = postSettingDialogFragment.f83102p;
            if (!(str == null || kotlin.text.u.V1(str))) {
                List<KeyDescObj> post_plan = postSettingDialogFragment.f83098l.getPost_plan();
                if (f0.g(post_plan != null ? (KeyDescObj) CollectionsKt___CollectionsKt.q3(post_plan) : null, keyDescObj) && (viewI = eVar.i(R.id.divider_post_plan_item)) != null) {
                    f0.o(viewI, "getView<View>(R.id.divider_post_plan_item)");
                    viewI.setVisibility(8);
                }
            }
            if (keyDescObj != null) {
                ((TextView) eVar.i(R.id.tv_name)).setText(keyDescObj.getName());
                ImageView onBindViewHolder$lambda$5$lambda$4$lambda$1 = (ImageView) eVar.i(R.id.iv_help);
                f0.o(onBindViewHolder$lambda$5$lambda$4$lambda$1, "onBindViewHolder$lambda$5$lambda$4$lambda$1");
                onBindViewHolder$lambda$5$lambda$4$lambda$1.setVisibility(com.max.hbcommon.utils.c.u(keyDescObj.getProtocol()) ^ true ? 0 : 8);
                onBindViewHolder$lambda$5$lambda$4$lambda$1.setOnClickListener(new a(z11, postSettingDialogFragment, keyDescObj));
                CheckBox checkBox = (CheckBox) eVar.i(R.id.cb_check);
                checkBox.setOnCheckedChangeListener(null);
                if (keyDescObj.isChecked() && !z11) {
                    z10 = true;
                }
                checkBox.setChecked(z10);
                checkBox.setOnCheckedChangeListener(new c(postSettingDialogFragment, checkBox, z11, keyDescObj, this, eVar));
                eVar.i(R.id.vg_check).setOnClickListener(new b(postSettingDialogFragment, z11, checkBox));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 31064, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31068, new Class[]{View.class}, Void.TYPE).isSupported && PostSettingDialogFragment.this.t4().f110436m.c()) {
                PostSettingDialogFragment.n4(PostSettingDialogFragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    @t0({"SMAP\nPostSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment$initSchedulePostSetting$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,974:1\n262#2,2:975\n262#2,2:977\n262#2,2:979\n262#2,2:981\n*S KotlinDebug\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment$initSchedulePostSetting$2\n*L\n669#1:975,2\n670#1:977,2\n679#1:979,2\n680#1:981,2\n*E\n"})
    public static final class i implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31069, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                PostSettingDialogFragment.this.f83098l.setSchedulePostTimeMs(0L);
                TextView textView = PostSettingDialogFragment.this.t4().f110442s;
                f0.o(textView, "binding.tvPostScheduleTime");
                textView.setVisibility(8);
                ImageView imageView = PostSettingDialogFragment.this.t4().f110429f;
                f0.o(imageView, "binding.ivPostScheduleTimeArrow");
                imageView.setVisibility(8);
                return;
            }
            TextView textView2 = PostSettingDialogFragment.this.t4().f110442s;
            f0.o(textView2, "binding.tvPostScheduleTime");
            textView2.setVisibility(0);
            ImageView imageView2 = PostSettingDialogFragment.this.t4().f110429f;
            f0.o(imageView2, "binding.ivPostScheduleTimeArrow");
            imageView2.setVisibility(0);
            if (PostSettingDialogFragment.this.f83098l.getSchedulePostTimeMs() <= 0) {
                PostSettingDialogFragment.this.f83098l.setSchedulePostTimeMs(System.currentTimeMillis() + 7200000);
            }
            PostSettingDialogFragment.this.t4().f110442s.setText(PostSettingDialogFragment.this.requireContext().getString(R.string.post_at_schedule_time, com.max.hbutils.utils.w.h(PostSettingDialogFragment.this.f83098l.getSchedulePostTimeMs(), "MM月dd日 EE HH:mm")));
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 31072, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable != null && editable.length() != 0) {
                z10 = false;
            }
            if (z10) {
                PostSettingDialogFragment.this.f83098l.setSource(null);
            } else {
                PostSettingDialogFragment.this.f83098l.setSource(editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31070, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31071, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class k implements j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 31074, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 31073, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            if (num != null && num.intValue() == 0) {
                TextView textView = PostSettingDialogFragment.this.t4().f110438o;
                Context context = PostSettingDialogFragment.this.getContext();
                textView.setText(context != null ? context.getString(R.string.go_to_create) : null);
            } else {
                TextView textView2 = PostSettingDialogFragment.this.t4().f110438o;
                Context context2 = PostSettingDialogFragment.this.getContext();
                textView2.setText(context2 != null ? context2.getString(R.string.total_count_v2, num) : null);
            }
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    @t0({"SMAP\nPostSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment$initViewModel$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,974:1\n262#2,2:975\n262#2,2:977\n262#2,2:979\n262#2,2:981\n*S KotlinDebug\n*F\n+ 1 PostSettingDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/PostSettingDialogFragment$initViewModel$2\n*L\n341#1:975,2\n342#1:977,2\n345#1:979,2\n346#1:981,2\n*E\n"})
    public static final class l implements j0<PostCompilationItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 31076, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postCompilationItemObj);
        }

        public final void b(@dl.e PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 31075, new Class[]{PostCompilationItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (postCompilationItemObj == null) {
                LinearLayout linearLayout = PostSettingDialogFragment.this.t4().f110430g;
                f0.o(linearLayout, "binding.llAction");
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = PostSettingDialogFragment.this.t4().f110431h;
                f0.o(linearLayout2, "binding.llSelectedCompilation");
                linearLayout2.setVisibility(8);
                return;
            }
            LinearLayout linearLayout3 = PostSettingDialogFragment.this.t4().f110430g;
            f0.o(linearLayout3, "binding.llAction");
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = PostSettingDialogFragment.this.t4().f110431h;
            f0.o(linearLayout4, "binding.llSelectedCompilation");
            linearLayout4.setVisibility(0);
            PostSettingDialogFragment.this.t4().f110443t.setText(postCompilationItemObj.getTitle());
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class m implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31079, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.X3(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class n implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostSettingDialogFragment f83132b;

            a(PostSettingDialogFragment postSettingDialogFragment) {
                this.f83132b = postSettingDialogFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31083, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83132b.f83098l.setView_limit("1");
                PostSettingDialogFragment.V3(this.f83132b);
                PostSettingDialogFragment.c4(this.f83132b);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostSettingDialogFragment f83133b;

            b(PostSettingDialogFragment postSettingDialogFragment) {
                this.f83133b = postSettingDialogFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31084, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83133b.f83098l.setHeadLine(false);
                this.f83133b.t4().f110434k.setChecked(false, false);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        n() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31082, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.this.f83098l.setHeadLine(z10);
            if (z10) {
                if (!PostSettingObj.Companion.isPublic(PostSettingDialogFragment.this.f83098l.getView_limit())) {
                    new com.max.hbcommon.view.a.f(PostSettingDialogFragment.this.requireContext()).y("若要参与创作计划，则分享范围将被设置为公开发表").l("").t(R.string.confirm, new a(PostSettingDialogFragment.this)).n(R.string.cancel, new b(PostSettingDialogFragment.this)).F();
                    return;
                } else {
                    PostSettingDialogFragment.V3(PostSettingDialogFragment.this);
                    PostSettingDialogFragment.C4(PostSettingDialogFragment.this, false, 1, null);
                    return;
                }
            }
            if (!PostSettingDialogFragment.d4(PostSettingDialogFragment.this) || PostSettingDialogFragment.this.f83100n) {
                PostSettingDialogFragment.V3(PostSettingDialogFragment.this);
                PostSettingDialogFragment.e4(PostSettingDialogFragment.this, false);
            } else {
                PostSettingDialogFragment.k4(PostSettingDialogFragment.this);
                PostSettingDialogFragment.this.f83098l.setHeadLine(true);
                PostSettingDialogFragment.this.t4().f110434k.getSb().setChecked(true);
            }
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31085, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.m4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31086, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.i4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31087, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.l4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31088, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.j4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31089, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.f4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class t implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f83142b;

        t(HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f83142b = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 31090, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.this.f83098l.setArticleType(keyDescObj.getKey());
            PostSettingDialogFragment.V3(PostSettingDialogFragment.this);
            PostSettingDialogFragment.g4(PostSettingDialogFragment.this);
            this.f83142b.dismiss();
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class u implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 31091, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.this.f83098l.setArticleAuth(keyDescObj.getKey());
            PostSettingDialogFragment.V3(PostSettingDialogFragment.this);
            PostSettingDialogFragment.g4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class v implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 31092, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PostSettingDialogFragment.this.f83098l.setArticleReprintTips(keyDescObj.getKey());
            PostSettingDialogFragment.h4(PostSettingDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class w implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f83146b;

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostSettingDialogFragment f83147b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f83148c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ HeyBoxPopupMenu f83149d;

            a(PostSettingDialogFragment postSettingDialogFragment, KeyDescObj keyDescObj, HeyBoxPopupMenu heyBoxPopupMenu) {
                this.f83147b = postSettingDialogFragment;
                this.f83148c = keyDescObj;
                this.f83149d = heyBoxPopupMenu;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(@dl.e DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31094, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83147b.t4().f110435l.setRightDesc(this.f83148c.getDesc());
                this.f83147b.f83098l.setView_limit(this.f83148c.getKey());
                this.f83147b.f83098l.setHeadLine(false);
                SettingItemView settingItemView = this.f83147b.t4().f110434k;
                f0.o(settingItemView, "binding.sivHeadline");
                SettingItemView.setChecked$default(settingItemView, false, false, 2, null);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                this.f83149d.dismiss();
            }
        }

        /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HeyBoxPopupMenu f83150b;

            b(HeyBoxPopupMenu heyBoxPopupMenu) {
                this.f83150b = heyBoxPopupMenu;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(@dl.e DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31095, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                this.f83150b.dismiss();
            }
        }

        w(HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f83146b = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 31093, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (f0.g(keyDescObj.getKey(), "1")) {
                PostSettingDialogFragment.this.t4().f110435l.setRightDesc(keyDescObj.getDesc());
                PostSettingDialogFragment.this.f83098l.setView_limit(keyDescObj.getKey());
                this.f83146b.dismiss();
            } else {
                if (PostSettingDialogFragment.this.f83098l.getHeadLine()) {
                    new com.max.hbcommon.view.a.f(PostSettingDialogFragment.this.requireActivity()).y("修改为非公开，则将不再同步至社区，也无法参加创作计划").l("").t(R.string.confirm, new a(PostSettingDialogFragment.this, keyDescObj, this.f83146b)).n(R.string.cancel, new b(this.f83146b)).F();
                    return;
                }
                PostSettingDialogFragment.this.t4().f110435l.setRightDesc(keyDescObj.getDesc());
                PostSettingDialogFragment.this.f83098l.setView_limit(keyDescObj.getKey());
                this.f83146b.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class x implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBWrappedDateTimePicker f83151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n3 f83152c;

        x(HBWrappedDateTimePicker hBWrappedDateTimePicker, n3 n3Var) {
            this.f83151b = hBWrappedDateTimePicker;
            this.f83152c = n3Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31096, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f83151b.setBottomSafeSpace(this.f83152c.f(n3.m.i()).f20745d);
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBWrappedDateTimePicker f83153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostSettingDialogFragment f83154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f83155d;

        y(HBWrappedDateTimePicker hBWrappedDateTimePicker, PostSettingDialogFragment postSettingDialogFragment, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f83153b = hBWrappedDateTimePicker;
            this.f83154c = postSettingDialogFragment;
            this.f83155d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31097, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            long timestampMs = this.f83153b.getTimestampMs();
            this.f83154c.f83098l.setSchedulePostTimeMs(timestampMs);
            this.f83154c.t4().f110442s.setText(this.f83154c.requireContext().getString(R.string.post_at_schedule_time, com.max.hbutils.utils.w.h(timestampMs, "MM月dd日 EE HH:mm")));
            this.f83155d.dismiss();
        }
    }

    /* JADX INFO: compiled from: PostSettingDialogFragment.kt */
    public static final class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f83156b;

        z(com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f83156b = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31098, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83156b.dismiss();
        }
    }

    private final boolean A4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31020, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f83098l.is_edit();
    }

    private final void B4(boolean z10) {
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31022, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            TextView textView = t4().f110441r;
            f0.o(textView, "binding.tvPostPlanDesc");
            textView.setVisibility(0);
            LinearLayout linearLayout = t4().f110446w;
            f0.o(linearLayout, "binding.vgProject");
            linearLayout.setVisibility(8);
            LinearLayout linearLayoutB = t4().f110444u.b();
            f0.o(linearLayoutB, "binding.vgArticlePreview.root");
            linearLayoutB.setVisibility(8);
            View root = t4().f110425b.getRoot();
            f0.o(root, "binding.bottomTipDivider.root");
            root.setVisibility(8);
            HBLineHeightTextView hBLineHeightTextView = t4().f110440q;
            f0.o(hBLineHeightTextView, "binding.tvIrregularPostPlanTip");
            hBLineHeightTextView.setVisibility(8);
            return;
        }
        TextView textView2 = t4().f110441r;
        f0.o(textView2, "binding.tvPostPlanDesc");
        textView2.setVisibility(8);
        LinearLayout linearLayout2 = t4().f110446w;
        f0.o(linearLayout2, "binding.vgProject");
        linearLayout2.setVisibility(0);
        LinearLayout linearLayoutB2 = t4().f110444u.b();
        f0.o(linearLayoutB2, "binding.vgArticlePreview.root");
        linearLayoutB2.setVisibility(0);
        String str = this.f83102p;
        if (str != null && !kotlin.text.u.V1(str)) {
            z11 = false;
        }
        if (z11) {
            return;
        }
        View root2 = t4().f110425b.getRoot();
        f0.o(root2, "binding.bottomTipDivider.root");
        root2.setVisibility(0);
        HBLineHeightTextView hBLineHeightTextView2 = t4().f110440q;
        f0.o(hBLineHeightTextView2, "binding.tvIrregularPostPlanTip");
        hBLineHeightTextView2.setVisibility(0);
        t4().f110440q.setText(this.f83102p);
    }

    static /* synthetic */ void C4(PostSettingDialogFragment postSettingDialogFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 31023, new Class[]{PostSettingDialogFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        postSettingDialogFragment.B4(z10);
    }

    @dl.d
    @xh.m
    public static final PostSettingDialogFragment D4(@dl.d PostType postType, @dl.e PostSettingObj postSettingObj, @dl.e String str, long j10, @dl.e Boolean bool, @dl.e String str2, @dl.e Boolean bool2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postType, postSettingObj, str, new Long(j10), bool, str2, bool2}, null, changeQuickRedirect, true, 31041, new Class[]{PostType.class, PostSettingObj.class, String.class, Long.TYPE, Boolean.class, String.class, Boolean.class}, PostSettingDialogFragment.class);
        return patchProxyResultProxy.isSupported ? (PostSettingDialogFragment) patchProxyResultProxy.result : f83089t.a(postType, postSettingObj, str, j10, bool, str2, bool2);
    }

    private final void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31029, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager permissionManager = PermissionManager.f71603a;
        Context context = getContext();
        f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        permissionManager.S((AppCompatActivity) context, new m());
    }

    private final void F4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31036, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!f0.g("1", this.f83098l.getArticleType()) && !f0.g("0", this.f83098l.getArticleType())) {
            t4().f110444u.f114078p.setVisibility(8);
            t4().f110444u.f114076n.setVisibility(8);
            t4().f110444u.f114077o.setVisibility(8);
        } else {
            if (f0.g("1", this.f83098l.getArticleType())) {
                t4().f110444u.f114066d.setRightDesc(getString(R.string.original_article));
                t4().f110444u.f114078p.setVisibility(0);
                t4().f110444u.f114076n.setVisibility(8);
                t4().f110444u.f114077o.setVisibility(8);
                H4();
                return;
            }
            t4().f110444u.f114066d.setRightDesc(getString(R.string.reprinted_article));
            t4().f110444u.f114076n.setVisibility(0);
            t4().f110444u.f114077o.setVisibility(0);
            t4().f110444u.f114078p.setVisibility(8);
            G4();
        }
    }

    private final void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31038, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String articleAuth = this.f83098l.getArticleAuth();
        if (f0.g("1", articleAuth) || f0.g("2", articleAuth)) {
            t4().f110444u.f114067e.setRightDesc(com.max.xiaoheihe.utils.d.n0(f0.g("1", articleAuth) ? R.string.auth_granted : R.string.auth_denied));
        } else {
            t4().f110444u.f114067e.setRightDesc(com.max.xiaoheihe.utils.d.n0(R.string.not_selected));
        }
    }

    private final void H4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31037, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String articleReprintTips = this.f83098l.getArticleReprintTips();
        if (f0.g("1", articleReprintTips) || f0.g("2", articleReprintTips)) {
            t4().f110444u.f114068f.setRightDesc(com.max.xiaoheihe.utils.d.n0(f0.g("1", articleReprintTips) ? R.string.auth_tips_1 : R.string.auth_tips_2));
        } else {
            t4().f110444u.f114068f.setRightDesc(com.max.xiaoheihe.utils.d.n0(R.string.not_selected));
        }
    }

    private final void J4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31033, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String articleType = this.f83098l.getArticleType();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("1");
        keyDescObj.setDesc(getString(R.string.original_article));
        keyDescObj.setChecked(f0.g(articleType, "1"));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("0");
        keyDescObj2.setDesc(getString(R.string.reprinted_article));
        keyDescObj2.setChecked(f0.g(articleType, "0"));
        arrayList.add(keyDescObj2);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(requireActivity(), arrayList, true);
        heyBoxPopupMenu.R(new t(heyBoxPopupMenu));
        heyBoxPopupMenu.show();
    }

    private final void K4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String articleAuth = this.f83098l.getArticleAuth();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(getString(R.string.not_selected));
        keyDescObj.setChecked(articleAuth == null);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc(getString(R.string.auth_granted));
        keyDescObj2.setKey("1");
        keyDescObj2.setChecked(f0.g(articleAuth, keyDescObj2.getKey()));
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setDesc(getString(R.string.auth_denied));
        keyDescObj3.setKey("2");
        keyDescObj3.setChecked(f0.g(articleAuth, keyDescObj3.getKey()));
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(getViewContext(), arrayList);
        heyBoxPopupMenu.R(new u());
        heyBoxPopupMenu.show();
    }

    private final void L4() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31018, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        com.max.hbutils.utils.c.d(context.getString(R.string.cannot_change_post_plan_tip));
    }

    private final void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31034, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String articleReprintTips = this.f83098l.getArticleReprintTips();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(getString(R.string.not_selected));
        keyDescObj.setChecked(articleReprintTips == null);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc(getString(R.string.auth_tips_1));
        keyDescObj2.setKey("1");
        keyDescObj2.setChecked(f0.g(articleReprintTips, keyDescObj2.getKey()));
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setDesc(getString(R.string.auth_tips_2));
        keyDescObj3.setKey("2");
        keyDescObj3.setChecked(f0.g(articleReprintTips, keyDescObj3.getKey()));
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(getViewContext(), arrayList);
        heyBoxPopupMenu.R(new v());
        heyBoxPopupMenu.show();
    }

    private final void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31032, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("1");
        keyDescObj.setDesc(getString(R.string.game_card_show));
        keyDescObj.setChecked(f0.g("1", this.f83098l.getView_limit()) || com.max.hbcommon.utils.c.u(this.f83098l.getView_limit()));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("2");
        keyDescObj2.setDesc(getString(R.string.fans_only));
        keyDescObj2.setChecked(f0.g("2", this.f83098l.getView_limit()));
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey("3");
        keyDescObj3.setDesc(getString(R.string.game_card_self_only));
        keyDescObj3.setChecked(f0.g("3", this.f83098l.getView_limit()));
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(requireActivity(), arrayList, true);
        heyBoxPopupMenu.R(new w(heyBoxPopupMenu));
        heyBoxPopupMenu.show();
    }

    private final void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31028, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = 7200000 + jCurrentTimeMillis;
        long j11 = jCurrentTimeMillis + 604800000;
        long jK = fi.u.K(this.f83098l.getSchedulePostTimeMs(), j10, j11);
        com.max.hbcommon.component.bottomsheet.q qVarA = new com.max.hbcommon.component.bottomsheet.a().z("").k(true).x(false).a();
        Context contextRequireContext = requireContext();
        f0.o(contextRequireContext, "requireContext()");
        HBWrappedDateTimePicker hBWrappedDateTimePicker = new HBWrappedDateTimePicker(contextRequireContext, null, 0, 6, null);
        hBWrappedDateTimePicker.setTimestampMs(jK);
        hBWrappedDateTimePicker.setTimestampRange(j10, j11);
        hBWrappedDateTimePicker.setTitleOrHide("定时发布日期");
        hBWrappedDateTimePicker.setOnConfirmClickListener(new y(hBWrappedDateTimePicker, this, qVarA));
        hBWrappedDateTimePicker.setOnCancelClickListener(new z(qVarA));
        n3 n3VarO0 = j1.o0(t4().b());
        if (n3VarO0 != null) {
            hBWrappedDateTimePicker.post(new x(hBWrappedDateTimePicker, n3VarO0));
        }
        qVarA.u4(hBWrappedDateTimePicker);
        qVarA.M3(getChildFragmentManager(), "");
    }

    public static final /* synthetic */ void V3(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31042, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.o4();
    }

    public static final /* synthetic */ void W3(PostSettingDialogFragment postSettingDialogFragment, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment, arrayList}, null, changeQuickRedirect, true, 31054, new Class[]{PostSettingDialogFragment.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.q4(arrayList);
    }

    public static final /* synthetic */ void X3(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31053, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.s4();
    }

    public static final /* synthetic */ void c4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31043, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.y4();
    }

    public static final /* synthetic */ boolean d4(PostSettingDialogFragment postSettingDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31044, new Class[]{PostSettingDialogFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : postSettingDialogFragment.A4();
    }

    public static final /* synthetic */ void e4(PostSettingDialogFragment postSettingDialogFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31046, new Class[]{PostSettingDialogFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.B4(z10);
    }

    public static final /* synthetic */ void f4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31051, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.E4();
    }

    public static final /* synthetic */ void g4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31055, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.F4();
    }

    public static final /* synthetic */ void h4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31056, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.H4();
    }

    public static final /* synthetic */ void i4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31048, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.J4();
    }

    public static final /* synthetic */ void j4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31050, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.K4();
    }

    public static final /* synthetic */ void k4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31045, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.L4();
    }

    public static final /* synthetic */ void l4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31049, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.M4();
    }

    public static final /* synthetic */ void m4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31047, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.N4();
    }

    public static final /* synthetic */ void n4(PostSettingDialogFragment postSettingDialogFragment) {
        if (PatchProxy.proxy(new Object[]{postSettingDialogFragment}, null, changeQuickRedirect, true, 31052, new Class[]{PostSettingDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postSettingDialogFragment.O4();
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31021, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.w0(200L);
        androidx.transition.v.b(t4().b(), autoTransition);
    }

    private final boolean p4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31040, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PostSettingObj postSettingObj = this.f83099m;
        if (postSettingObj == null) {
            return true;
        }
        if (!this.f83098l.getHeadLine() && !postSettingObj.getHeadLine()) {
            return !f0.g(this.f83098l.getView_limit(), postSettingObj.getView_limit());
        }
        if (this.f83098l.getHeadLine() != postSettingObj.getHeadLine()) {
            return true;
        }
        return !f0.g(this.f83098l, postSettingObj);
    }

    private final void q4(ArrayList<Uri> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 31031, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        File file = new File(PictureVideoEditPostFragment.g7(requireActivity()));
        if (!file.exists()) {
            file.mkdirs();
        }
        UCrop uCropOf = UCrop.of(arrayList, Uri.fromFile(file));
        uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_ONLY_CROP, true);
        uCropOf.startWithType(requireActivity(), this, 1);
    }

    private final void r4(File file) {
        Bitmap bitmapDecodeFile;
        if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 31025, new Class[]{File.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            requireActivity().revokeUriPermission(com.max.xiaoheihe.utils.d.w0(requireActivity(), file), 2);
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            aVar.M("BitmapSize  size:" + file.length() + " max:2097152");
            try {
                if (file.length() > 2097152) {
                    bitmapDecodeFile = com.max.hbimage.b.k0(file.getPath(), 1125.0f, 600.0f);
                    aVar.M("BitmapSize width:" + bitmapDecodeFile.getWidth() + " height:" + bitmapDecodeFile.getHeight());
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = 1;
                    bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options);
                    aVar.M("BitmapSize width:" + options.outWidth + " height:" + options.outHeight);
                    if (options.outWidth < 900 || options.outHeight < 480) {
                        com.max.hbutils.utils.c.d("请选择尺寸不低于900*480的图片");
                        return;
                    }
                }
            } catch (Exception unused) {
                f0.m(file);
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
            }
            t4().f110444u.f114065c.setImageBitmap(bitmapDecodeFile);
            f0.m(bitmapDecodeFile);
            int height = bitmapDecodeFile.getHeight();
            int width = bitmapDecodeFile.getWidth();
            LinkImageObj linkImageObj = new LinkImageObj();
            linkImageObj.setHeight(String.valueOf(height));
            linkImageObj.setWidth(String.valueOf(width));
            f0.m(file);
            linkImageObj.setPath(file.getPath());
            String string = UUID.randomUUID().toString();
            f0.o(string, "randomUUID().toString()");
            linkImageObj.setId(string);
            this.f83098l.setThumbImageObj(linkImageObj);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31030, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.k(this, 1, new c(), true, false, false, true, false);
    }

    private final void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31014, new Class[0], Void.TYPE).isSupported || ad.a.a(ad.a.I, false)) {
            return;
        }
        f6 f6VarT4 = t4();
        LinearLayout postCompilationContainer = f6VarT4.f110432i;
        f0.o(postCompilationContainer, "postCompilationContainer");
        postCompilationContainer.setVisibility(0);
        f6VarT4.f110439p.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        f6VarT4.f110430g.setOnClickListener(new d());
        f6VarT4.f110431h.setBackground(com.max.hbutils.utils.q.o(getContext(), R.color.background_layer_1_color, 3.0f));
        f6VarT4.f110431h.setOnClickListener(new e());
        com.max.xiaoheihe.accelworld.s.a(f6VarT4.f110428e, 10.0f);
        f6VarT4.f110428e.setOnClickListener(new f());
    }

    private final void v4(List<KeyDescObj> list, String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 31017, new Class[]{List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(list)) {
            if (str != null && !kotlin.text.u.V1(str)) {
                z10 = false;
            }
            if (!z10) {
                SettingItemView settingItemView = t4().f110434k;
                f0.o(settingItemView, "binding.sivHeadline");
                SettingItemView.setChecked$default(settingItemView, false, false, 2, null);
                SettingItemView settingItemView2 = t4().f110434k;
                f0.o(settingItemView2, "binding.sivHeadline");
                settingItemView2.setVisibility(8);
                View root = t4().f110426c.getRoot();
                f0.o(root, "binding.dividerSivRoot.root");
                root.setVisibility(8);
                TextView textView = t4().f110441r;
                f0.o(textView, "binding.tvPostPlanDesc");
                textView.setVisibility(8);
                HBLineHeightTextView hBLineHeightTextView = t4().f110440q;
                f0.o(hBLineHeightTextView, "binding.tvIrregularPostPlanTip");
                hBLineHeightTextView.setVisibility(0);
                t4().f110440q.setText(str);
                if (this.f83097k == PostType.Article) {
                    Space space = t4().f110437n;
                    f0.o(space, "binding.spaceNoPostPlan");
                    space.setVisibility(0);
                    return;
                }
                return;
            }
        }
        Space space2 = t4().f110437n;
        f0.o(space2, "binding.spaceNoPostPlan");
        space2.setVisibility(8);
    }

    private final void w4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31016, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = t4().f110433j;
        if (recyclerView.getItemAnimator() instanceof SimpleItemAnimator) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            f0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        List<KeyDescObj> post_plan = this.f83098l.getPost_plan();
        if (post_plan != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
            recyclerView.setAdapter(new g(post_plan, requireActivity()));
        }
    }

    private final void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31027, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f83103q) {
            SettingItemView settingItemView = t4().f110436m;
            f0.o(settingItemView, "binding.sivSchedulePostTime");
            SettingItemView.setChecked$default(settingItemView, false, false, 2, null);
            FrameLayout frameLayout = t4().f110427d;
            f0.o(frameLayout, "binding.flPostTimeSet");
            frameLayout.setVisibility(8);
            return;
        }
        if (!A4()) {
            FrameLayout frameLayout2 = t4().f110427d;
            f0.o(frameLayout2, "binding.flPostTimeSet");
            frameLayout2.setVisibility(0);
        } else {
            if (this.f83104r <= System.currentTimeMillis()) {
                SettingItemView settingItemView2 = t4().f110436m;
                f0.o(settingItemView2, "binding.sivSchedulePostTime");
                SettingItemView.setChecked$default(settingItemView2, false, false, 2, null);
                FrameLayout frameLayout3 = t4().f110427d;
                f0.o(frameLayout3, "binding.flPostTimeSet");
                frameLayout3.setVisibility(8);
                return;
            }
            FrameLayout frameLayout4 = t4().f110427d;
            f0.o(frameLayout4, "binding.flPostTimeSet");
            frameLayout4.setVisibility(0);
        }
        t4().f110427d.setOnClickListener(new h());
        t4().f110436m.setBackground(null);
        t4().f110436m.setOnCheckedChangeListener(new i());
        if (this.f83098l.getSchedulePostTimeMs() > 0) {
            t4().f110436m.setChecked(true, true);
        } else {
            t4().f110436m.setChecked(false, true);
        }
        com.max.xiaoheihe.accelworld.s.a(t4().f110436m.getSb(), 5.0f);
    }

    private final void y4() {
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31026, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t4().f110434k.setChecked(this.f83098l.getHeadLine(), false);
        B4(this.f83098l.getHeadLine());
        F4();
        LinkImageObj thumbImageObj = this.f83098l.getThumbImageObj();
        if (thumbImageObj != null) {
            if (!com.max.hbcommon.utils.c.u(thumbImageObj.getPath())) {
                com.max.hbimage.b.K(thumbImageObj.getPath(), t4().f110444u.f114065c);
            } else if (!com.max.hbcommon.utils.c.u(thumbImageObj.getUrl())) {
                com.max.hbimage.b.K(thumbImageObj.getUrl(), t4().f110444u.f114065c);
            }
        }
        t4().f110444u.f114064b.setText(this.f83098l.getSource());
        t4().f110444u.f114064b.addTextChangedListener(new j());
        SettingItemView settingItemView = t4().f110435l;
        String view_limit = this.f83098l.getView_limit();
        if (f0.g(view_limit, "2")) {
            string = getString(R.string.fans_only);
        } else {
            string = f0.g(view_limit, "3") ? getString(R.string.game_card_self_only) : getString(R.string.game_card_show);
        }
        settingItemView.setRightDesc(string);
        Context context = getContext();
        if (context != null && (string2 = context.getString(R.string.post_plan_desc)) != null) {
            int iR3 = StringsKt__StringsKt.r3(string2, (char) 65288, 0, false, 6, null);
            int iB = fi.u.B(StringsKt__StringsKt.r3(string2, (char) 65289, 0, false, 6, null) + 1, string2.length());
            if (iR3 >= 0 && iB >= 0) {
                SpannableString spannableString = new SpannableString(string2);
                spannableString.setSpan(new ForegroundColorSpan(requireContext().getColor(R.color.text_secondary_2_color)), iR3, iB, 33);
                t4().f110441r.setText(spannableString);
            }
        }
        x4();
    }

    private final void z4() {
        FragmentActivity activity;
        ActivityPostSettingViewModel activityPostSettingViewModel;
        LiveData<PostCompilationItemObj> liveDataR;
        LiveData<PostCompilationItemObj> liveDataR2;
        LiveData<Integer> liveDataS;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31015, new Class[0], Void.TYPE).isSupported || (activity = getActivity()) == null) {
            return;
        }
        this.f83105s = (ActivityPostSettingViewModel) new y0(activity).a(ActivityPostSettingViewModel.class);
        if (ad.a.a(ad.a.I, false)) {
            return;
        }
        ActivityPostSettingViewModel activityPostSettingViewModel2 = this.f83105s;
        if (activityPostSettingViewModel2 != null && (liveDataS = activityPostSettingViewModel2.s()) != null) {
            liveDataS.k(this, new k());
        }
        ActivityPostSettingViewModel activityPostSettingViewModel3 = this.f83105s;
        if (activityPostSettingViewModel3 != null && (liveDataR2 = activityPostSettingViewModel3.r()) != null) {
            liveDataR2.k(this, new l());
        }
        ActivityPostSettingViewModel activityPostSettingViewModel4 = this.f83105s;
        if (((activityPostSettingViewModel4 == null || (liveDataR = activityPostSettingViewModel4.r()) == null) ? null : liveDataR.f()) != null || (activityPostSettingViewModel = this.f83105s) == null) {
            return;
        }
        activityPostSettingViewModel.w(false, new PostSettingDialogFragment$initViewModel$3(this));
    }

    public final void I4(@dl.d f6 f6Var) {
        if (PatchProxy.proxy(new Object[]{f6Var}, this, changeQuickRedirect, false, 31011, new Class[]{f6.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(f6Var, "<set-?>");
        this.f83096j = f6Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31024, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == 69 && i11 == -1 && intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri");
            if (com.max.hbcommon.utils.c.w(parcelableArrayListExtra)) {
                return;
            }
            f0.m(parcelableArrayListExtra);
            r4(new File(((Uri) parcelableArrayListExtra.get(0)).getPath()));
        }
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 31019, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof com.max.xiaoheihe.module.bbs.post_edit.post_setting.a) {
            this.f83101o = (com.max.xiaoheihe.module.bbs.post_edit.post_setting.a) getParentFragment();
        } else if (context instanceof com.max.xiaoheihe.module.bbs.post_edit.post_setting.a) {
            this.f83101o = (com.max.xiaoheihe.module.bbs.post_edit.post_setting.a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 31012, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        f6 f6VarC = f6.c(inflater);
        f0.o(f6VarC, "inflate(inflater)");
        I4(f6VarC);
        return t4().b();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 31039, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        if (!t4().f110436m.c()) {
            this.f83098l.setSchedulePostTimeMs(0L);
        }
        com.max.xiaoheihe.module.bbs.post_edit.post_setting.a aVar = this.f83101o;
        if (aVar != null) {
            aVar.r3(this.f83098l, p4());
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        Serializable serializable;
        LinkImageObj linkImageObj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 31013, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (serializable = arguments.getSerializable(PostTabActivity.f82576x2)) == null) {
            serializable = PostType.Picture;
        }
        this.f83097k = (PostType) serializable;
        Bundle arguments2 = getArguments();
        this.f83100n = arguments2 != null ? arguments2.getBoolean(PostTabActivity.G2) : false;
        Bundle arguments3 = getArguments();
        PostSettingObj postSettingObj = (PostSettingObj) (arguments3 != null ? arguments3.getSerializable(f83091v) : null);
        Bundle arguments4 = getArguments();
        final String string = arguments4 != null ? arguments4.getString(f83092w) : null;
        Bundle arguments5 = getArguments();
        this.f83102p = arguments5 != null ? arguments5.getString(f83093x) : null;
        Bundle arguments6 = getArguments();
        this.f83103q = arguments6 != null ? arguments6.getBoolean(f83095z) : false;
        Bundle arguments7 = getArguments();
        this.f83104r = arguments7 != null ? arguments7.getLong(f83094y) : 0L;
        if (postSettingObj != null) {
            if (!com.max.hbcommon.utils.c.w(postSettingObj.getPost_plan()) && !com.max.hbcommon.utils.c.w(postSettingObj.getSelect_post_plan())) {
                List<KeyDescObj> post_plan = postSettingObj.getPost_plan();
                f0.m(post_plan);
                for (KeyDescObj keyDescObj : post_plan) {
                    List<KeyDescObj> select_post_plan = postSettingObj.getSelect_post_plan();
                    f0.m(select_post_plan);
                    keyDescObj.setChecked(select_post_plan.contains(keyDescObj));
                }
            }
            this.f83098l = postSettingObj;
            LinkImageObj thumbImageObj = postSettingObj.getThumbImageObj();
            if (thumbImageObj != null) {
                LinkImageObj linkImageObj2 = new LinkImageObj();
                linkImageObj2.setId(thumbImageObj.getId());
                linkImageObj = linkImageObj2;
            } else {
                linkImageObj = null;
            }
            ArrayList<BBSTopicObj> checkedTopics = postSettingObj.getCheckedTopics();
            if (checkedTopics != null) {
                ArrayList arrayList4 = new ArrayList();
                for (BBSTopicObj bBSTopicObj : checkedTopics) {
                    BBSTopicObj bBSTopicObj2 = new BBSTopicObj();
                    bBSTopicObj2.setTopic_id(bBSTopicObj != null ? bBSTopicObj.getTopic_id() : null);
                    arrayList4.add(bBSTopicObj2);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            List<KeyDescObj> post_plan2 = postSettingObj.getPost_plan();
            if (post_plan2 != null) {
                ArrayList arrayList5 = new ArrayList();
                for (KeyDescObj keyDescObj2 : post_plan2) {
                    KeyDescObj keyDescObj3 = new KeyDescObj();
                    keyDescObj3.setId(keyDescObj2 != null ? keyDescObj2.getId() : null);
                    keyDescObj3.setDesc(keyDescObj2 != null ? keyDescObj2.getDesc() : null);
                    keyDescObj3.setKey(keyDescObj2 != null ? keyDescObj2.getKey() : null);
                    arrayList5.add(keyDescObj3);
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            List<KeyDescObj> select_post_plan2 = postSettingObj.getSelect_post_plan();
            if (select_post_plan2 != null) {
                ArrayList arrayList6 = new ArrayList();
                for (KeyDescObj keyDescObj4 : select_post_plan2) {
                    KeyDescObj keyDescObj5 = new KeyDescObj();
                    keyDescObj5.setId(keyDescObj4 != null ? keyDescObj4.getId() : null);
                    keyDescObj5.setDesc(keyDescObj4 != null ? keyDescObj4.getDesc() : null);
                    keyDescObj5.setKey(keyDescObj4 != null ? keyDescObj4.getKey() : null);
                    arrayList6.add(keyDescObj5);
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            this.f83099m = PostSettingObj.copy$default(postSettingObj, false, null, linkImageObj, null, null, null, null, arrayList, arrayList2, arrayList3, false, 0L, bb.c.d.wl, null);
        }
        y4();
        t4().f110447x.setVisibility(0);
        PostType postType = this.f83097k;
        int i10 = postType == null ? -1 : b.f83106a[postType.ordinal()];
        if (i10 == 1) {
            t4().f110444u.f114071i.setVisibility(8);
        } else if (i10 != 2) {
            t4().f110444u.f114071i.setVisibility(0);
        } else {
            t4().f110444u.b().setVisibility(8);
            t4().f110445v.setVisibility(8);
            t4().f110427d.setVisibility(8);
        }
        final Context context = getContext();
        if (context != null) {
            if (!(!(string == null || kotlin.text.u.V1(string)))) {
                context = null;
            }
            if (context != null) {
                Drawable drawableB = b0.a.b(context, R.drawable.common_help_line_24x24);
                int iF = ViewUtils.f(context, 13.0f);
                if (drawableB != null) {
                    drawableB.setBounds(0, 0, iF, iF);
                }
                if (drawableB != null) {
                    drawableB.setTint(context.getColor(R.color.text_secondary_1_color));
                }
                int iF2 = ViewUtils.f(context, 4.0f);
                if (drawableB != null) {
                    t4().f110434k.setTitleRightCompoundDrawable(drawableB, iF2);
                    t4().f110434k.setTitleClickListener(new yh.l<View, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostSettingDialogFragment$onViewCreated$3$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@d View view2) {
                            if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 31080, new Class[]{View.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(view2, "<anonymous parameter 0>");
                            Context it = context;
                            f0.o(it, "it");
                            b.j0(it, string);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(View view2) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 31081, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(view2);
                            return b2.f124493a;
                        }
                    });
                }
            }
        }
        t4().f110434k.setOnCheckedChangeListener(new n());
        t4().f110435l.setOnClickListener(new o());
        t4().f110444u.f114066d.setOnClickListener(new p());
        t4().f110444u.f114068f.setOnClickListener(new q());
        t4().f110444u.f114067e.setOnClickListener(new r());
        t4().f110444u.f114074l.setOnClickListener(new s());
        w4();
        v4(postSettingObj != null ? postSettingObj.getPost_plan() : null, this.f83102p);
        u4();
        z4();
    }

    @dl.d
    public final f6 t4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31010, new Class[0], f6.class);
        if (patchProxyResultProxy.isSupported) {
            return (f6) patchProxyResultProxy.result;
        }
        f6 f6Var = this.f83096j;
        if (f6Var != null) {
            return f6Var;
        }
        f0.S("binding");
        return null;
    }
}
