package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.lzy.okgo.model.Progress;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbcommon.component.card.CardViewGenerator;
import com.max.hbcommon.component.ezcalendarview.EZCalendarView;
import com.max.hbcustomview.Shimmer.ShimmerFrameLayout;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbview.CountDownTextView;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.bean.account.SignAwardInfo;
import com.max.xiaoheihe.bean.account.SignDateObj;
import com.max.xiaoheihe.bean.account.SignInInfo;
import com.max.xiaoheihe.bean.account.TaskAwardInfo;
import com.max.xiaoheihe.bean.account.TaskInfoObj;
import com.max.xiaoheihe.bean.account.TaskLineObj;
import com.max.xiaoheihe.bean.account.TaskListObj;
import com.max.xiaoheihe.bean.account.TaskResultObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.steaminfo.SignListResultObj;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.max.xiaoheihe.module.account.component.AvatarView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.report.RecyclerViewReportManager;
import com.max.xiaoheihe.module.signin.SignInManager;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.SocializeConstants;
import df.b10;
import df.mb0;
import df.ob0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt__StringsKt;
import mb.b1;

/* JADX INFO: compiled from: UserTaskFragmentV2.kt */
/* JADX INFO: loaded from: classes9.dex */
@com.max.hbcommon.analytics.m(path = lb.d.G1)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class UserTaskFragmentV2 extends com.max.hbcommon.base.d {

    @dl.d
    public static final a D = new a(null);
    public static final int E = 8;

    @dl.d
    public static final String F = "heybox_id";
    private static final int G = 4;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private View A;

    @dl.e
    private RecyclerViewReportManager<TaskInfoObj> B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private String f78581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private User f78582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f78583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f78584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f78585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f78586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f78587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private String f78588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f78589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f78590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private LevelInfoObj f78591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f78592m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f78597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private com.max.hbcustomview.e f78598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b1 f78599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b10 f78600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ob0 f78601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f78602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private View f78603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private View f78604y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private View f78605z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final ArrayList<SignDateObj> f78593n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final ArrayList<TaskListObj> f78594o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final ArrayList<TaskInfoObj> f78595p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f78596q = true;

    @dl.d
    private final UMShareListener C = new z();

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final UserTaskFragmentV2 a(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, SocializeConstants.SEND_EMPTY, new Class[]{String.class}, UserTaskFragmentV2.class);
            if (patchProxyResultProxy.isSupported) {
                return (UserTaskFragmentV2) patchProxyResultProxy.result;
            }
            UserTaskFragmentV2 userTaskFragmentV2 = new UserTaskFragmentV2();
            Bundle bundle = new Bundle();
            bundle.putString("heybox_id", str);
            userTaskFragmentV2.setArguments(bundle);
            return userTaskFragmentV2;
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class a0 extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24644, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24645, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24646, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24586, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130945c3);
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.heybox_battery_faq));
            ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public final class c extends com.max.hbcommon.base.adapter.u<TaskInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class a implements CountDownTextView.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f78608a;

            a(String str) {
                this.f78608a = str;
            }

            @Override // com.max.hbview.CountDownTextView.c
            @dl.d
            public String a(long j10) {
                int i10;
                int i11;
                int i12;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 24591, new Class[]{Long.TYPE}, String.class);
                if (patchProxyResultProxy.isSupported) {
                    return (String) patchProxyResultProxy.result;
                }
                if (j10 <= 0) {
                    return "";
                }
                if (j10 > 86400000) {
                    long j11 = j10 % 86400000;
                    return (j10 / 86400000) + "天后" + this.f78608a;
                }
                long j12 = j10 % 86400000;
                if (j12 > 3600000) {
                    i10 = (int) (j12 / 3600000);
                    j12 %= 3600000;
                } else {
                    i10 = 0;
                }
                if (j12 > 60000) {
                    i11 = (int) (j12 / 60000);
                    j12 %= 60000;
                } else {
                    i11 = 0;
                }
                if (j12 > 1000) {
                    i12 = (int) (j12 / 1000);
                    long j13 = j12 % 1000;
                } else {
                    i12 = 0;
                }
                v0 v0Var = v0.f124986a;
                String str = String.format("%02d:%02d:%02d后" + this.f78608a, Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, 3));
                kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                return str;
            }

            @Override // com.max.hbview.CountDownTextView.c
            public void onFinish() {
            }
        }

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f78609b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, SocializeConstants.REGIST_TO_WORK_QUEUE, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                SignInManager.f().d(0L);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.UserTaskFragmentV2$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class ViewOnClickListenerC0645c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78610b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f78611c;

            ViewOnClickListenerC0645c(UserTaskFragmentV2 userTaskFragmentV2, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f78610b = userTaskFragmentV2;
                this.f78611c = eVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, SocializeConstants.BUILD_ENVELOPE, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78610b.f78592m = true;
                view.setVisibility(8);
                View viewI = this.f78611c.i(R.id.vg_calendar_container);
                if (viewI == null) {
                    this.f78610b.f78603x = ((ViewStub) this.f78611c.i(R.id.vs_retroactive_calendar)).inflate();
                    UserTaskFragmentV2.d4(this.f78610b);
                } else {
                    this.f78610b.f78603x = viewI;
                }
                UserTaskFragmentV2.d4(this.f78610b);
            }
        }

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78612b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TaskInfoObj f78613c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f78614d;

            d(UserTaskFragmentV2 userTaskFragmentV2, TaskInfoObj taskInfoObj, String str) {
                this.f78612b = userTaskFragmentV2;
                this.f78613c = taskInfoObj;
                this.f78614d = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, SocializeConstants.AZX_TRIGGER, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserTaskFragmentV2.N3(this.f78612b, this.f78613c);
                com.max.hbshare.d.E(((com.max.hbcommon.base.d) this.f78612b).mContext, new HBShareData(false, true, com.max.xiaoheihe.utils.d.n0(R.string.invite_share_title), com.max.xiaoheihe.utils.d.n0(R.string.invite_share_content), this.f78614d, null, null, this.f78612b.C, null, null, null, null, null, bb.c.k.L0, null));
            }
        }

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class e implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78615b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TaskInfoObj f78616c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f78617d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f78618e;

            e(UserTaskFragmentV2 userTaskFragmentV2, TaskInfoObj taskInfoObj, String str, String str2) {
                this.f78615b = userTaskFragmentV2;
                this.f78616c = taskInfoObj;
                this.f78617d = str;
                this.f78618e = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24595, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserTaskFragmentV2.N3(this.f78615b, this.f78616c);
                Intent intent = new Intent(((com.max.hbcommon.base.d) this.f78615b).mContext, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", this.f78617d);
                intent.putExtra("title", this.f78618e);
                ((com.max.hbcommon.base.d) this.f78615b).mContext.startActivity(intent);
            }
        }

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class f implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78619b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TaskInfoObj f78620c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f78621d;

            f(UserTaskFragmentV2 userTaskFragmentV2, TaskInfoObj taskInfoObj, String str) {
                this.f78619b = userTaskFragmentV2;
                this.f78620c = taskInfoObj;
                this.f78621d = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24596, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserTaskFragmentV2.N3(this.f78619b, this.f78620c);
                ((com.max.hbcommon.base.d) this.f78619b).mContext.startActivity(MainActivity.k3(((com.max.hbcommon.base.d) this.f78619b).mContext, MainActivity.V2(com.max.hbutils.utils.n.q(this.f78621d))));
            }
        }

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class g implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78622b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TaskInfoObj f78623c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f78624d;

            g(UserTaskFragmentV2 userTaskFragmentV2, TaskInfoObj taskInfoObj, String str) {
                this.f78622b = userTaskFragmentV2;
                this.f78623c = taskInfoObj;
                this.f78624d = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24597, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserTaskFragmentV2.N3(this.f78622b, this.f78623c);
                Activity mContext = ((com.max.hbcommon.base.d) this.f78622b).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.k0(mContext, this.f78624d);
            }
        }

        public c() {
            super(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, UserTaskFragmentV2.this.f78595p);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TaskInfoObj taskInfoObj) {
            Object[] objArr = {new Integer(i10), taskInfoObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24589, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, taskInfoObj);
        }

        public int n(int i10, @dl.d TaskInfoObj data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24587, new Class[]{cls, TaskInfoObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            return kotlin.jvm.internal.f0.g("true", data.getIs_band()) ? R.layout.layout_task_group_header : R.layout.table_row_task_v2;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TaskInfoObj data) {
            String str;
            int i10;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 24588, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TaskInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            int iD = viewHolder.d();
            if (iD == R.layout.layout_task_group_header) {
                ((ListSectionHeader) viewHolder.i(R.id.lsh)).setTitleText(data.getTitle());
                return;
            }
            if (iD != R.layout.table_row_task_v2) {
                return;
            }
            RecyclerViewReportManager recyclerViewReportManager = UserTaskFragmentV2.this.B;
            if (recyclerViewReportManager != null) {
                recyclerViewReportManager.a(viewHolder.itemView, data);
            }
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewHolder.i(R.id.sfl_item);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            View viewI = viewHolder.i(R.id.v_divider);
            LinearLayout vgAward = (LinearLayout) viewHolder.i(R.id.vg_award);
            int iIndexOf = getDataList().indexOf(data) + 1;
            TaskInfoObj taskInfoObj = iIndexOf < getDataList().size() ? getDataList().get(iIndexOf) : null;
            ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (taskInfoObj == null) {
                viewI.setVisibility(4);
                layoutParams2.height = ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 4.0f);
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 4.0f);
                viewI.setLayoutParams(layoutParams2);
            } else {
                viewI.setVisibility(0);
                layoutParams2.topMargin = 0;
                if (kotlin.jvm.internal.f0.g("true", taskInfoObj.getIs_band())) {
                    layoutParams2.height = ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 4.0f);
                    layoutParams2.leftMargin = 0;
                    viewI.setLayoutParams(layoutParams2);
                    viewI.setBackgroundColor(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getColor(R.color.divider_secondary_2_color));
                } else {
                    layoutParams2.height = ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getDimensionPixelSize(R.dimen.divider_height);
                    layoutParams2.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 10.0f);
                    viewI.setLayoutParams(layoutParams2);
                    viewI.setBackgroundColor(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getColor(R.color.divider_secondary_1_color));
                }
            }
            com.max.hbimage.b.H(data.getIcon(), imageView);
            if (kotlin.jvm.internal.f0.g("1", data.getIs_new())) {
                imageView.startAnimation(UserTaskFragmentV2.this.f78598s);
                shimmerFrameLayout.d();
            } else {
                imageView.clearAnimation();
                if (shimmerFrameLayout.b()) {
                    shimmerFrameLayout.e();
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(data.getTitle());
            if (!com.max.hbcommon.utils.c.u(data.getDesc())) {
                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) data.getDesc());
                spannableStringBuilder.setSpan(new zd.a(ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 11.0f), UserTaskFragmentV2.this.getResources().getColor(R.color.text_secondary_1_color)), spannableStringBuilder.length() - data.getDesc().length(), spannableStringBuilder.length(), 33);
            }
            textView.setText(spannableStringBuilder);
            ArrayList arrayList = new ArrayList();
            vgAward.removeAllViews();
            if (data.getAward_desc_v2() != null) {
                Iterator<TaskAwardInfo> it = data.getAward_desc_v2().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            int i11 = kotlin.jvm.internal.f0.g(data.getState(), "finish") ? R.color.text_secondary_2_color : R.color.text_primary_2_color;
            if (arrayList.size() > 0) {
                Activity mContext = ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                CardParam cardParamC = new CardParam.a(mContext).j(arrayList).r(i11).p(1).t(2.5f).m(4).g(R.color.background_card_1_color).k(CardParam.DISPLAY_MODE.LIMIT).c();
                CardViewGenerator cardViewGeneratorA = CardViewGenerator.f67433b.a();
                kotlin.jvm.internal.f0.o(vgAward, "vgAward");
                cardViewGeneratorA.c(vgAward, cardParamC);
            }
            View viewI2 = viewHolder.i(R.id.ll_retroactive);
            viewI2.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, R.color.background_card_1_color, ViewUtils.h0(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, ViewUtils.o(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, viewI2))));
            viewI2.setVisibility(8);
            String type = data.getType();
            String title = data.getTitle();
            String url = data.getUrl();
            String tab_id = data.getTab_id();
            String maxjia = data.getMaxjia();
            LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.ll_sign);
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_state);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_state);
            int iH0 = ViewUtils.h0(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, ViewUtils.o(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, viewGroup));
            CountDownTextView countDownTextView = (CountDownTextView) viewHolder.i(R.id.cdtv_state);
            GradientColorObj gradient_color = data.getGradient_color();
            String start_color = gradient_color != null ? gradient_color.getStart_color() : null;
            if (start_color == null || start_color.length() == 0) {
                countDownTextView.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
            } else {
                countDownTextView.setTextColor(Color.parseColor(data.getGradient_color().getStart_color()));
            }
            if (data.getTask_end_time() != null) {
                str = tab_id;
                long jR = com.max.hbutils.utils.n.r(data.getTask_end_time()) * 1000;
                if (jR > 0) {
                    countDownTextView.setVisibility(0);
                    countDownTextView.setTargetTime(jR);
                    countDownTextView.setTimeTransformer(new a("结束"));
                    if (jR - System.currentTimeMillis() <= 86400000) {
                        countDownTextView.i();
                    } else {
                        countDownTextView.setTimeString();
                    }
                    i10 = 8;
                } else {
                    i10 = 8;
                    countDownTextView.setVisibility(8);
                }
            } else {
                str = tab_id;
                i10 = 8;
                countDownTextView.setVisibility(8);
            }
            if (kotlin.jvm.internal.f0.g("sign", type)) {
                if (kotlin.jvm.internal.f0.g("finish", data.getState())) {
                    linearLayout.setVisibility(0);
                    viewGroup.setVisibility(8);
                    viewHolder.p(R.id.tv_days, data.getSign_in_streak() + (char) 22825);
                    linearLayout.setBackgroundDrawable(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, R.color.divider_secondary_2_color, 3.0f));
                } else {
                    linearLayout.setVisibility(i10);
                    viewGroup.setVisibility(0);
                    textView2.setText(data.getState_desc());
                    textView2.setTextColor(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getColor(R.color.background_layer_1_color));
                    viewGroup.setBackground(com.max.hbutils.utils.q.h(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, iH0));
                    textView2.setOnClickListener(b.f78609b);
                }
                UserTaskFragmentV2.this.f78604y = viewI2;
                viewI2.setVisibility((UserTaskFragmentV2.this.f78592m || com.max.hbcommon.utils.c.w(UserTaskFragmentV2.this.f78593n)) ? 8 : 0);
                View viewI3 = viewHolder.i(R.id.vg_calendar_container);
                if (viewI3 != null) {
                    viewI3.setVisibility(viewI2.getVisibility() == 0 ? 8 : 0);
                }
                viewI2.setOnClickListener(new ViewOnClickListenerC0645c(UserTaskFragmentV2.this, viewHolder));
                return;
            }
            linearLayout.setVisibility(i10);
            viewI2.setVisibility(i10);
            View viewI4 = viewHolder.i(R.id.vg_calendar_container);
            if (viewI4 != null) {
                viewI4.setVisibility(i10);
            }
            viewGroup.setVisibility(0);
            textView2.setText(data.getState_desc());
            if (kotlin.jvm.internal.f0.g("finish", data.getState())) {
                textView2.setTextColor(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                viewGroup.setBackground(com.max.hbutils.utils.q.g(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, iH0));
                return;
            }
            if (kotlin.jvm.internal.f0.g("can_reward", data.getState())) {
                textView2.setTextColor(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getColor(R.color.background_layer_1_color));
                if (data.getGradient_color() != null) {
                    viewGroup.setBackgroundDrawable(com.max.xiaoheihe.utils.k.f95676a.c(data.getGradient_color(), ViewUtils.f(UserTaskFragmentV2.this.getContext(), iH0)));
                } else {
                    viewGroup.setBackground(com.max.hbutils.utils.q.h(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, iH0));
                }
            } else {
                textView2.setTextColor(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getResources().getColor(R.color.background_layer_1_color));
                if (data.getGradient_color() != null) {
                    viewGroup.setBackgroundDrawable(com.max.xiaoheihe.utils.k.f95676a.c(data.getGradient_color(), ViewUtils.f(UserTaskFragmentV2.this.getContext(), iH0)));
                } else {
                    viewGroup.setBackground(com.max.hbutils.utils.q.h(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, iH0));
                }
            }
            if (kotlin.jvm.internal.f0.g("share", type)) {
                viewGroup.setOnClickListener(new d(UserTaskFragmentV2.this, data, url));
                return;
            }
            if (kotlin.jvm.internal.f0.g("url", type)) {
                viewGroup.setOnClickListener(new e(UserTaskFragmentV2.this, data, url, title));
                return;
            }
            if (kotlin.jvm.internal.f0.g("goto_tab", type)) {
                viewGroup.setOnClickListener(new f(UserTaskFragmentV2.this, data, str));
                return;
            }
            if (kotlin.jvm.internal.f0.g("open_window", type)) {
                viewGroup.setOnClickListener(new g(UserTaskFragmentV2.this, data, maxjia));
                return;
            }
            if (kotlin.jvm.internal.f0.g("normal", type)) {
                String title2 = data.getTitle();
                kotlin.jvm.internal.f0.o(title2, "data.title");
                if (StringsKt__StringsKt.W2(title2, "推送", false, 2, null)) {
                    UserTaskFragmentV2.this.f78596q = false;
                    UserTaskFragmentV2.M3(UserTaskFragmentV2.this);
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 24590, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TaskInfoObj) obj);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class d extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<TaskInfoObj> f78625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserTaskFragmentV2 f78626c;

        d(ArrayList<TaskInfoObj> arrayList, UserTaskFragmentV2 userTaskFragmentV2) {
            this.f78625b = arrayList;
            this.f78626c = userTaskFragmentV2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 24598, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            if (parent.getChildAdapterPosition(view) == this.f78625b.size() - 1) {
                outRect.set(0, 0, 0, ViewUtils.f(((com.max.hbcommon.base.d) this.f78626c).mContext, 34.0f));
            }
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f78627b;

        e(yh.a<b2> aVar) {
            this.f78627b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24599, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78627b.invoke();
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class f extends com.max.hbcustomview.recyclerview.d<TaskInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<TaskInfoObj> f78628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RecyclerViewReportManager<TaskInfoObj> f78629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ UserTaskFragmentV2 f78630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f78631g;

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f78632b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78633c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TaskInfoObj f78634d;

            a(yh.a<b2> aVar, UserTaskFragmentV2 userTaskFragmentV2, TaskInfoObj taskInfoObj) {
                this.f78632b = aVar;
                this.f78633c = userTaskFragmentV2;
                this.f78634d = taskInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24602, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78632b.invoke();
                UserTaskFragmentV2.N3(this.f78633c, this.f78634d);
                Activity mContext = ((com.max.hbcommon.base.d) this.f78633c).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.k0(mContext, this.f78634d.getMaxjia());
            }
        }

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f78635b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList<TaskInfoObj> arrayList, RecyclerViewReportManager<TaskInfoObj> recyclerViewReportManager, UserTaskFragmentV2 userTaskFragmentV2, yh.a<b2> aVar) {
            super(arrayList, R.layout.item_task_dialog);
            this.f78628d = arrayList;
            this.f78629e = recyclerViewReportManager;
            this.f78630f = userTaskFragmentV2;
            this.f78631g = aVar;
        }

        @Override // dc.a
        public /* bridge */ /* synthetic */ void bindViewHolder(dc.b bVar, Object obj, int i10) {
            if (PatchProxy.proxy(new Object[]{bVar, obj, new Integer(i10)}, this, changeQuickRedirect, false, 24601, new Class[]{dc.b.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            m(bVar, (TaskInfoObj) obj, i10);
        }

        public void m(@dl.d dc.b holder, @dl.d TaskInfoObj data, int i10) {
            if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 24600, new Class[]{dc.b.class, TaskInfoObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(holder, "holder");
            kotlin.jvm.internal.f0.p(data, "data");
            this.f78629e.a(holder.itemView, data);
            TextView textView = (TextView) holder.a(R.id.tv_task_name);
            ImageView imageView = (ImageView) holder.a(R.id.iv_task_icon);
            LinearLayout linearLayout = (LinearLayout) holder.a(R.id.vg_task_award);
            TextView textView2 = (TextView) holder.a(R.id.tv_confirm);
            TextView textView3 = (TextView) holder.a(R.id.tv_confirm_desc);
            View viewA = holder.a(R.id.v_divider);
            com.max.hbimage.b.K(data.getIcon(), imageView);
            textView.setText(data.getTitle());
            if (kotlin.jvm.internal.f0.g(data.getState_desc(), "去完成")) {
                textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            } else {
                textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            }
            textView2.setText(data.getState_desc());
            List<TaskAwardInfo> award_desc_v2 = data.getAward_desc_v2();
            if (award_desc_v2 == null || award_desc_v2.isEmpty()) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                new ArrayList().addAll(data.getAward_desc_v2());
                Activity mContext = ((com.max.hbcommon.base.d) this.f78630f).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                CardParam.a aVar = new CardParam.a(mContext);
                List<TaskAwardInfo> award_desc_v3 = data.getAward_desc_v2();
                kotlin.jvm.internal.f0.m(award_desc_v3);
                CardViewGenerator.f67433b.a().c(linearLayout, aVar.j(award_desc_v3).r(R.color.text_secondary_1_color).p(1).t(2.5f).m(4).g(R.color.divider_color).k(CardParam.DISPLAY_MODE.LIMIT).c());
            }
            String lock_desc = data.getLock_desc();
            if (lock_desc == null || lock_desc.length() == 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(data.getLock_desc());
            }
            if (kotlin.jvm.internal.f0.g("finish", data.getState())) {
                textView2.setTextColor(((com.max.hbcommon.base.d) this.f78630f).mContext.getResources().getColor(R.color.text_secondary_1_color));
                textView2.setBackgroundResource(R.drawable.btn_divider_concept_2dp);
            } else {
                if (kotlin.jvm.internal.f0.g("blocking", data.getState())) {
                    textView2.setTextColor(((com.max.hbcommon.base.d) this.f78630f).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    if (data.getGradient_color() != null) {
                        textView2.setBackgroundDrawable(com.max.xiaoheihe.utils.k.f95676a.c(data.getGradient_color(), ViewUtils.f(this.f78630f.getContext(), 2.0f)));
                    } else {
                        textView2.setBackgroundResource(R.drawable.topic_bg_2dp);
                    }
                } else {
                    textView2.setTextColor(((com.max.hbcommon.base.d) this.f78630f).mContext.getResources().getColor(R.color.white));
                    if (data.getGradient_color() != null) {
                        textView2.setBackgroundDrawable(com.max.xiaoheihe.utils.k.f95676a.c(data.getGradient_color(), ViewUtils.f(this.f78630f.getContext(), 2.0f)));
                    } else {
                        textView2.setBackgroundResource(R.drawable.taskline_item_bg_gradient);
                    }
                }
                if (kotlin.jvm.internal.f0.g("finish", data.getState()) || kotlin.jvm.internal.f0.g("blocking", data.getState())) {
                    textView2.setOnClickListener(b.f78635b);
                } else {
                    String maxjia = data.getMaxjia();
                    if (!(maxjia == null || maxjia.length() == 0)) {
                        textView2.setOnClickListener(new a(this.f78631g, this.f78630f, data));
                    } else if (kotlin.jvm.internal.f0.g("normal", data.getType())) {
                        String title = data.getTitle();
                        kotlin.jvm.internal.f0.o(title, "data.title");
                        if (StringsKt__StringsKt.W2(title, "推送", false, 2, null)) {
                            this.f78630f.f78596q = false;
                            UserTaskFragmentV2.M3(this.f78630f);
                        }
                    }
                }
            }
            if (i10 == this.f78628d.size() - 1) {
                viewA.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(@dl.d Result<?> result) {
            Double d10;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24603, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (UserTaskFragmentV2.this.isActive() && (d10 = (Double) result.getKeyMap().get("cost")) != null) {
                UserTaskFragmentV2.l4(UserTaskFragmentV2.this, (int) d10.doubleValue());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24604, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<SignListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        public void onNext(@dl.d Result<SignListResultObj> signResult) {
            if (PatchProxy.proxy(new Object[]{signResult}, this, changeQuickRedirect, false, 24605, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(signResult, "signResult");
            if (UserTaskFragmentV2.this.isActive()) {
                UserTaskFragmentV2 userTaskFragmentV2 = UserTaskFragmentV2.this;
                SignListResultObj result = signResult.getResult();
                kotlin.jvm.internal.f0.m(result);
                UserTaskFragmentV2.m4(userTaskFragmentV2, result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24606, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SignListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<TaskResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24607, new Class[0], Void.TYPE).isSupported && UserTaskFragmentV2.this.isActive()) {
                b1 b1Var = UserTaskFragmentV2.this.f78599t;
                b1 b1Var2 = null;
                if (b1Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    b1Var = null;
                }
                b1Var.f131496c.A(0);
                b1 b1Var3 = UserTaskFragmentV2.this.f78599t;
                if (b1Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    b1Var2 = b1Var3;
                }
                b1Var2.f131496c.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24608, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (UserTaskFragmentV2.this.isActive()) {
                b1 b1Var = UserTaskFragmentV2.this.f78599t;
                b1 b1Var2 = null;
                if (b1Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    b1Var = null;
                }
                b1Var.f131496c.A(0);
                b1 b1Var3 = UserTaskFragmentV2.this.f78599t;
                if (b1Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    b1Var2 = b1Var3;
                }
                b1Var2.f131496c.p(0);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TaskResultObj> taskresult) {
            if (PatchProxy.proxy(new Object[]{taskresult}, this, changeQuickRedirect, false, 24609, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(taskresult, "taskresult");
            if (UserTaskFragmentV2.this.isActive()) {
                UserTaskFragmentV2.n4(UserTaskFragmentV2.this, taskresult.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24610, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TaskResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class j implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 24613, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 24612, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 24611, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class k extends com.max.hbcommon.base.adapter.t {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(c cVar) {
            super(cVar);
        }

        @Override // com.max.hbcommon.base.adapter.t
        public void B(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e Object obj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, obj}, this, changeQuickRedirect, false, 24615, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            UserTaskFragmentV2.e4(UserTaskFragmentV2.this, viewHolder, (TaskResultObj) obj);
        }

        @Override // com.max.hbcommon.base.adapter.t
        public void C(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e Object obj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, obj}, this, changeQuickRedirect, false, 24614, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            UserTaskFragmentV2.e4(UserTaskFragmentV2.this, viewHolder, (TaskResultObj) obj);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class l implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 24616, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            UserTaskFragmentV2.this.f78592m = false;
            UserTaskFragmentV2.a4(UserTaskFragmentV2.this);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class m implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24617, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.mall.o.l(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    @kotlin.jvm.internal.t0({"SMAP\nUserTaskFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTaskFragmentV2.kt\ncom/max/xiaoheihe/module/account/UserTaskFragmentV2$refreshCalendarView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1608:1\n1#2:1609\n*E\n"})
    public static final class n implements EZCalendarView.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.component.ezcalendarview.EZCalendarView.d
        public final void a(EZCalendarView eZCalendarView, Calendar calendar) {
            Bundle bundleI;
            if (PatchProxy.proxy(new Object[]{eZCalendarView, calendar}, this, changeQuickRedirect, false, 24618, new Class[]{EZCalendarView.class, Calendar.class}, Void.TYPE).isSupported || (bundleI = eZCalendarView.i(calendar)) == null || com.max.hbcommon.utils.c.u(bundleI.getString(Progress.L))) {
                return;
            }
            Calendar.getInstance().set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            UserTaskFragmentV2.this.f78588i = bundleI.getString(Progress.L);
            String str = UserTaskFragmentV2.this.f78588i;
            if (str != null) {
                UserTaskFragmentV2.W3(UserTaskFragmentV2.this, str);
            }
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class o implements EZCalendarView.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f78643a;

        o(TextView textView) {
            this.f78643a = textView;
        }

        @Override // com.max.hbcommon.component.ezcalendarview.EZCalendarView.e
        public final void a(EZCalendarView eZCalendarView, Calendar calendar) {
            if (PatchProxy.proxy(new Object[]{eZCalendarView, calendar}, this, changeQuickRedirect, false, 24619, new Class[]{EZCalendarView.class, Calendar.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78643a.setText(new SimpleDateFormat("yyyy-MM", Locale.getDefault()).format(calendar.getTime()));
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24620, new Class[]{View.class}, Void.TYPE).isSupported && (((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext instanceof UserAchievementActivity)) {
                Activity activity = ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext;
                kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.UserAchievementActivity");
                ((UserAchievementActivity) activity).X1();
            }
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f78645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserTaskFragmentV2 f78646c;

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class a implements com.max.xiaoheihe.utils.l0.h<Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f78648b;

            a(UserTaskFragmentV2 userTaskFragmentV2, View view) {
                this.f78647a = userTaskFragmentV2;
                this.f78648b = view;
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public void a(@dl.e Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24622, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserTaskFragmentV2.a4(this.f78647a);
                this.f78648b.setClickable(true);
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public void b(@dl.e Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24623, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78648b.setClickable(true);
            }
        }

        q(View view, UserTaskFragmentV2 userTaskFragmentV2) {
            this.f78645b = view;
            this.f78646c = userTaskFragmentV2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24621, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78645b.setClickable(false);
            com.max.xiaoheihe.view.l.k(new a(this.f78646c, this.f78645b));
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f78649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserTaskFragmentV2 f78650c;

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class a implements com.max.xiaoheihe.utils.l0.h<Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RelativeLayout f78652b;

            a(UserTaskFragmentV2 userTaskFragmentV2, RelativeLayout relativeLayout) {
                this.f78651a = userTaskFragmentV2;
                this.f78652b = relativeLayout;
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public void a(@dl.e Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24625, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserTaskFragmentV2.a4(this.f78651a);
                this.f78652b.setClickable(true);
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public void b(@dl.e Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24626, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78652b.setClickable(true);
            }
        }

        r(RelativeLayout relativeLayout, UserTaskFragmentV2 userTaskFragmentV2) {
            this.f78649b = relativeLayout;
            this.f78650c = userTaskFragmentV2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24624, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78649b.setClickable(false);
            com.max.xiaoheihe.view.l.k(new a(this.f78650c, this.f78649b));
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class s implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignInInfo f78661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f78662d;

        s(SignInInfo signInInfo, CheckBox checkBox) {
            this.f78661c = signInInfo;
            this.f78662d = checkBox;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24627, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                com.max.xiaoheihe.view.l.x(this.f78661c.getSign_push_state(), "0", this.f78662d, ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mInflater);
                return;
            }
            if (!com.max.xiaoheihe.utils.d.N0(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext)) {
                com.max.xiaoheihe.utils.v.l(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mInflater);
                UserTaskFragmentV2.this.f78597r = true;
            }
            com.max.xiaoheihe.view.l.x(this.f78661c.getSign_push_state(), "1", this.f78662d, ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mInflater);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class t extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList<TaskLineObj> f78664c;

        t(ArrayList<TaskLineObj> arrayList) {
            this.f78664c = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 24628, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            outRect.set(childAdapterPosition == 0 ? ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 12.0f) : ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 4.0f), 0, childAdapterPosition == this.f78664c.size() - 1 ? ViewUtils.f(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, 12.0f) : 0, 0);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24635, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.i0(mContext, lb.d.f131221o2);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24636, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getString(R.string.check_quest_rule));
            intent.putExtra("pageurl", lb.a.O1);
            ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24637, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(UserTaskFragmentV2.this.f78590k)) {
                Activity mContext = ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.k0(mContext, UserTaskFragmentV2.this.f78590k);
            } else {
                Intent intent = new Intent(((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext, (Class<?>) WebActionActivity.class);
                intent.putExtra("title", ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.getString(R.string.exp_rule));
                intent.putExtra("pageurl", lb.a.P1);
                ((com.max.hbcommon.base.d) UserTaskFragmentV2.this).mContext.startActivity(intent);
            }
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class x implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f78668b = new x();
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24638, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class y implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
        public static final class a extends com.max.hbcommon.network.d<Result<?>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserTaskFragmentV2 f78670b;

            a(UserTaskFragmentV2 userTaskFragmentV2) {
                this.f78670b = userTaskFragmentV2;
            }

            public void onNext(@dl.d Result<?> signResult) {
                if (PatchProxy.proxy(new Object[]{signResult}, this, changeQuickRedirect, false, 24640, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(signResult, "signResult");
                if (this.f78670b.isActive()) {
                    if (com.max.hbcommon.utils.c.u(signResult.getMsg())) {
                        com.max.hbutils.utils.c.f(this.f78670b.getString(R.string.success));
                    } else {
                        com.max.hbutils.utils.c.f(signResult.getMsg());
                    }
                    UserTaskFragmentV2.Z3(this.f78670b);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24641, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<?>) obj);
            }
        }

        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24639, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            UserTaskFragmentV2.this.addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U7(UserTaskFragmentV2.this.f78588i).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(UserTaskFragmentV2.this)));
        }
    }

    /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
    public static final class z implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 24643, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(UserTaskFragmentV2.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24642, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(UserTaskFragmentV2.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    private final void A4(com.max.hbcommon.base.adapter.s.e eVar, TaskResultObj taskResultObj) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{eVar, taskResultObj}, this, changeQuickRedirect, false, 24550, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TaskResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(eVar != null && eVar.d() == R.layout.item_user_task_profile_header_v2)) {
            if (eVar != null && eVar.d() == R.layout.fixed_task_line_block) {
                i10 = 1;
            }
            if (i10 != 0) {
                C4(taskResultObj);
                return;
            }
            return;
        }
        b10 b10Var = null;
        LevelInfoObj level_info = (taskResultObj != null ? taskResultObj.getUser() : null) != null ? taskResultObj.getUser().getLevel_info() : null;
        this.f78591l = level_info;
        if (level_info != null) {
            User user = this.f78582c;
            kotlin.jvm.internal.f0.m(user);
            user.getAccount_detail().setLevel_info(this.f78591l);
            LevelInfoObj levelInfoObj = this.f78591l;
            kotlin.jvm.internal.f0.m(levelInfoObj);
            this.f78583d = levelInfoObj.getCoin();
            com.max.xiaoheihe.utils.i0.z(this.f78582c);
            L3();
        }
        if ((taskResultObj != null ? taskResultObj.getUser() : null) != null) {
            AccountDetailObj accountDetailObj = new AccountDetailObj();
            accountDetailObj.setLevel_info(this.f78591l);
            accountDetailObj.setUserid(taskResultObj.getUser().getUserid());
            b10 b10Var2 = this.f78600u;
            if (b10Var2 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var2 = null;
            }
            com.max.xiaoheihe.utils.d.h1(b10Var2.f108718d, accountDetailObj);
            if (com.max.hbcommon.utils.c.w(taskResultObj.getUser().getMedal())) {
                b10 b10Var3 = this.f78600u;
                if (b10Var3 == null) {
                    kotlin.jvm.internal.f0.S("headerBinding");
                    b10Var3 = null;
                }
                b10Var3.f108730p.setVisibility(8);
            } else {
                b10 b10Var4 = this.f78600u;
                if (b10Var4 == null) {
                    kotlin.jvm.internal.f0.S("headerBinding");
                    b10Var4 = null;
                }
                b10Var4.f108730p.setVisibility(0);
                b10 b10Var5 = this.f78600u;
                if (b10Var5 == null) {
                    kotlin.jvm.internal.f0.S("headerBinding");
                    b10Var5 = null;
                }
                b10Var5.f108730p.setOnClickListener(new p());
                b10 b10Var6 = this.f78600u;
                if (b10Var6 == null) {
                    kotlin.jvm.internal.f0.S("headerBinding");
                    b10Var6 = null;
                }
                b10Var6.f108731q.removeAllViews();
                int iB = fi.u.B(taskResultObj.getUser().getMedal().size(), 4);
                while (i10 < iB) {
                    ImageView imageView = new ImageView(this.mContext);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 16.0f), ViewUtils.f(this.mContext, 16.0f));
                    int iF = ViewUtils.f(this.mContext, 3.0f);
                    if (i10 == 0) {
                        layoutParams.leftMargin = iF;
                    }
                    layoutParams.rightMargin = iF;
                    b10 b10Var7 = this.f78600u;
                    if (b10Var7 == null) {
                        kotlin.jvm.internal.f0.S("headerBinding");
                        b10Var7 = null;
                    }
                    b10Var7.f108731q.addView(imageView, layoutParams);
                    com.max.hbimage.b.K(taskResultObj.getUser().getMedal().get(i10).getImg_url(), imageView);
                    i10++;
                }
            }
            b10 b10Var8 = this.f78600u;
            if (b10Var8 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var8 = null;
            }
            b10Var8.f108726l.setText(taskResultObj.getUser().getUsername());
            b10 b10Var9 = this.f78600u;
            if (b10Var9 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var9 = null;
            }
            b10Var9.f108716b.setAvatar(taskResultObj.getUser().getAvartar());
            b10 b10Var10 = this.f78600u;
            if (b10Var10 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var10 = null;
            }
            b10Var10.f108716b.a();
            b10 b10Var11 = this.f78600u;
            if (b10Var11 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
            } else {
                b10Var = b10Var11;
            }
            b10Var.f108716b.setDecoration(taskResultObj.getUser().getAvatar_decoration());
            this.f78587h = taskResultObj.getUser().getBattery();
        }
    }

    private final void B4(SignInInfo signInInfo) {
        View view;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (PatchProxy.proxy(new Object[]{signInInfo}, this, changeQuickRedirect, false, 24556, new Class[]{SignInInfo.class}, Void.TYPE).isSupported || (view = this.f78605z) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(view);
        GridLayout gridLayout = (GridLayout) view.findViewById(R.id.gl_days);
        View view2 = this.f78605z;
        kotlin.jvm.internal.f0.m(view2);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.rl_sunday);
        ArrayList<SignAwardInfo> sign_list = signInInfo.getSign_list();
        if (sign_list == null || sign_list.size() != 7) {
            return;
        }
        gridLayout.removeAllViews();
        boolean z13 = true;
        int i10 = 0;
        while (i10 < 6) {
            SignAwardInfo signAwardInfo = sign_list.get(i10);
            String strComponent2 = signAwardInfo.component2();
            String strComponent3 = signAwardInfo.component3();
            String strComponent4 = signAwardInfo.component4();
            String strComponent5 = signAwardInfo.component5();
            String strComponent6 = signAwardInfo.component6();
            boolean z14 = z13;
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.item_sign_in_v2, gridLayout, z12);
            View viewFindViewById = viewInflate.findViewById(R.id.v_mask);
            View viewFindViewById2 = viewInflate.findViewById(R.id.vg_bg);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_item_desc);
            RelativeLayout relativeLayout2 = relativeLayout;
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
            textView.setText(strComponent4);
            textView2.setText(strComponent2);
            if (kotlin.jvm.internal.f0.g("1", strComponent6)) {
                if (kotlin.jvm.internal.f0.g("1", strComponent5)) {
                    com.max.hbimage.b.L(strComponent3, imageView, R.drawable.ic_heybox_logo_small);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById2.setBackgroundResource(R.color.divider_secondary_2_color);
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
                    textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
                    textView.setBackgroundResource(R.color.divider_secondary_1_color);
                } else {
                    textView.setText("领取");
                    com.max.hbimage.b.c0(this.mContext, strComponent3, imageView);
                    viewFindViewById2.setBackgroundResource(R.drawable.gradient_black_sign_color);
                    textView2.setTextColor(this.mContext.getResources().getColor(R.color.white));
                    textView.setTextColor(this.mContext.getResources().getColor(R.color.white));
                    textView.setBackgroundResource(R.color.text_primary_1_color);
                    viewInflate.setOnClickListener(new q(viewInflate, this));
                }
                z14 = false;
            } else {
                com.max.hbimage.b.L(strComponent3, imageView, R.drawable.ic_heybox_logo_small);
            }
            if (z14) {
                viewFindViewById.setVisibility(0);
                viewFindViewById.setClickable(true);
                viewFindViewById.setFocusable(true);
            }
            if (kotlin.jvm.internal.f0.g("1", strComponent5)) {
                textView.setText("已领取");
            }
            gridLayout.addView(viewInflate);
            i10++;
            z13 = z14;
            relativeLayout = relativeLayout2;
            z12 = false;
        }
        RelativeLayout relativeLayout3 = relativeLayout;
        SignAwardInfo signAwardInfo2 = sign_list.get(6);
        String strComponent7 = signAwardInfo2.component2();
        String strComponent8 = signAwardInfo2.component3();
        String strComponent9 = signAwardInfo2.component4();
        String strComponent10 = signAwardInfo2.component5();
        String strComponent11 = signAwardInfo2.component6();
        View viewFindViewById3 = relativeLayout3.findViewById(R.id.v_mask);
        TextView textView3 = (TextView) relativeLayout3.findViewById(R.id.tv_item_title);
        TextView textView4 = (TextView) relativeLayout3.findViewById(R.id.tv_item_desc);
        ImageView imageView2 = (ImageView) relativeLayout3.findViewById(R.id.iv_img);
        View view3 = this.f78605z;
        kotlin.jvm.internal.f0.m(view3);
        CheckBox checkBox = (CheckBox) view3.findViewById(R.id.cb_check_in_hint);
        View view4 = this.f78605z;
        kotlin.jvm.internal.f0.m(view4);
        TextView textView5 = (TextView) view4.findViewById(R.id.tv_check_in);
        View viewFindViewById4 = relativeLayout3.findViewById(R.id.vg_bg);
        textView3.setText(strComponent9);
        textView4.setText(strComponent7);
        if (!kotlin.jvm.internal.f0.g("1", strComponent11) || kotlin.jvm.internal.f0.g("1", strComponent10)) {
            com.max.hbimage.b.L(strComponent8, imageView2, R.drawable.ic_heybox_logo_small);
            if (kotlin.jvm.internal.f0.g("1", strComponent10)) {
                z10 = false;
                viewFindViewById3.setVisibility(0);
                z11 = true;
                viewFindViewById3.setClickable(true);
                viewFindViewById3.setFocusable(true);
            } else {
                z10 = false;
                z11 = true;
            }
            viewFindViewById4.setBackgroundResource(R.color.divider_secondary_2_color);
            textView4.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            textView3.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            textView3.setBackgroundResource(R.color.divider_secondary_1_color);
        } else {
            com.max.hbimage.b.c0(this.mContext, strComponent8, imageView2);
            viewFindViewById4.setBackgroundResource(R.drawable.gradient_black_sign_color);
            textView4.setTextColor(this.mContext.getResources().getColor(R.color.white));
            textView3.setTextColor(this.mContext.getResources().getColor(R.color.white));
            textView3.setBackgroundResource(R.color.text_primary_1_color);
            relativeLayout3.setOnClickListener(new r(relativeLayout3, this));
            z10 = false;
            z11 = true;
        }
        if (signInInfo.getSign_push_state() != null) {
            checkBox.setOnCheckedChangeListener(null);
            PushStateObj sign_push_state = signInInfo.getSign_push_state();
            kotlin.jvm.internal.f0.m(sign_push_state);
            textView5.setText(sign_push_state.getPush_type_desc());
            PushStateObj sign_push_state2 = signInInfo.getSign_push_state();
            kotlin.jvm.internal.f0.m(sign_push_state2);
            checkBox.setChecked((kotlin.jvm.internal.f0.g("1", sign_push_state2.getPush_state()) && com.max.xiaoheihe.utils.d.N0(this.mContext)) ? z11 : z10);
            checkBox.setOnCheckedChangeListener(new s(signInInfo, checkBox));
        }
    }

    private final void C4(TaskResultObj taskResultObj) {
        if (PatchProxy.proxy(new Object[]{taskResultObj}, this, changeQuickRedirect, false, 24552, new Class[]{TaskResultObj.class}, Void.TYPE).isSupported || taskResultObj == null || taskResultObj.getTask_lines() == null || !(true ^ taskResultObj.getTask_lines().getTask_line_items().isEmpty())) {
            return;
        }
        View view = this.A;
        com.max.hbcommon.base.adapter.t tVar = null;
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.rv_task_line) : null;
        View view2 = this.A;
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.v_divider_top) : null;
        View view3 = this.A;
        View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.v_divider_bottom) : null;
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(taskResultObj.getTask_lines().getTask_line_items());
        com.max.hbcustomview.recyclerview.d<TaskLineObj> dVar = new com.max.hbcustomview.recyclerview.d<TaskLineObj>(arrayList) { // from class: com.max.xiaoheihe.module.account.UserTaskFragmentV2$refreshTaskLine$taskLineAdapter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ UserTaskFragmentV2 f78654b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ TaskLineObj f78655c;

                a(UserTaskFragmentV2 userTaskFragmentV2, TaskLineObj taskLineObj) {
                    this.f78654b = userTaskFragmentV2;
                    this.f78655c = taskLineObj;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24631, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Activity mContext = ((com.max.hbcommon.base.d) this.f78654b).mContext;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.k0(mContext, this.f78655c.getMaxjia());
                }
            }

            /* JADX INFO: compiled from: UserTaskFragmentV2.kt */
            public static final class b implements View.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f78656b = new b();
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }

            @Override // dc.a
            public /* bridge */ /* synthetic */ void bindViewHolder(dc.b bVar, Object obj, int i10) {
                if (PatchProxy.proxy(new Object[]{bVar, obj, new Integer(i10)}, this, changeQuickRedirect, false, 24630, new Class[]{dc.b.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                m(bVar, (TaskLineObj) obj, i10);
            }

            /* JADX WARN: Code duplicated, block: B:55:0x02a6  */
            public void m(@dl.d dc.b holder, @dl.d final TaskLineObj data, int i10) {
                int i11;
                int i12;
                boolean z10;
                boolean z11;
                int i13;
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 24629, new Class[]{dc.b.class, TaskLineObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                TextView textView = (TextView) holder.a(R.id.tv_task_group);
                ImageView imageView = (ImageView) holder.a(R.id.iv_arrow);
                ImageView imageView2 = (ImageView) holder.a(R.id.iv_task_group_icon);
                TextView textView2 = (TextView) holder.a(R.id.tv_current_task_name);
                TextView textView3 = (TextView) holder.a(R.id.tv_award_type);
                LinearLayout linearLayout = (LinearLayout) holder.a(R.id.vg_award_container);
                TextView textView4 = (TextView) holder.a(R.id.tv_confirm);
                int iP = ViewUtils.p(((com.max.hbcommon.base.d) this).mContext, holder.itemView, ViewUtils.ViewType.IMAGE);
                float fH0 = ViewUtils.h0(((com.max.hbcommon.base.d) this).mContext, ViewUtils.o(((com.max.hbcommon.base.d) this).mContext, textView4));
                textView4.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) this).mContext, R.color.white_alpha20, fH0));
                if (kotlin.jvm.internal.f0.g(data.getState(), "finish")) {
                    imageView.setImageTintList(ColorStateList.valueOf(androidx.core.content.res.i.e(((com.max.hbcommon.base.d) this).mContext.getResources(), R.color.text_primary_1_color, null)));
                    textView.setTextColor(androidx.core.content.res.i.e(((com.max.hbcommon.base.d) this).mContext.getResources(), R.color.text_primary_1_color, null));
                    textView2.setTextColor(androidx.core.content.res.i.e(((com.max.hbcommon.base.d) this).mContext.getResources(), R.color.text_primary_1_color, null));
                    List<TaskAwardInfo> award_desc_v2 = data.getAward_desc_v2();
                    if (award_desc_v2 == null || award_desc_v2.isEmpty()) {
                        i13 = 8;
                        textView3.setVisibility(8);
                    } else {
                        textView3.setVisibility(0);
                        i13 = 8;
                    }
                    textView4.setVisibility(i13);
                    i12 = R.color.black_alpha3;
                    holder.itemView.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) this).mContext, R.color.background_card_1_color, ViewUtils.h0(((com.max.hbcommon.base.d) this).mContext, iP)));
                    i11 = R.color.text_secondary_2_color;
                } else {
                    Resources resources = ((com.max.hbcommon.base.d) this).mContext.getResources();
                    i11 = R.color.white;
                    imageView.setImageTintList(ColorStateList.valueOf(androidx.core.content.res.i.e(resources, R.color.white, null)));
                    textView.setTextColor(androidx.core.content.res.i.e(((com.max.hbcommon.base.d) this).mContext.getResources(), R.color.white, null));
                    textView2.setTextColor(androidx.core.content.res.i.e(((com.max.hbcommon.base.d) this).mContext.getResources(), R.color.white, null));
                    textView3.setVisibility(8);
                    textView4.setVisibility(0);
                    if (data.getGradient_color() != null) {
                        holder.itemView.setBackground(com.max.xiaoheihe.utils.k.f95676a.c(data.getGradient_color(), iP));
                    } else {
                        holder.itemView.setBackground(ViewUtils.i(iP, com.max.hbcommon.utils.l.a(R.color.orange_start), com.max.hbcommon.utils.l.a(R.color.orange_end)));
                    }
                    i12 = R.color.white_alpha10;
                }
                textView.setText(data.getTitle() + ' ' + data.getFinish_cnt() + IOUtils.DIR_SEPARATOR_UNIX + data.getTotal_cnt());
                com.max.hbimage.b.K(data.getIcon(), imageView2);
                textView2.setText(data.getDesc());
                textView4.setText(data.getState_desc());
                List<TaskAwardInfo> award_desc_v3 = data.getAward_desc_v2();
                if (!(award_desc_v3 == null || award_desc_v3.isEmpty())) {
                    Activity mContext = ((com.max.hbcommon.base.d) this).mContext;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    CardParam.a aVar = new CardParam.a(mContext);
                    List<TaskAwardInfo> award_desc_v4 = data.getAward_desc_v2();
                    kotlin.jvm.internal.f0.m(award_desc_v4);
                    CardViewGenerator.f67433b.a().c(linearLayout, aVar.j(award_desc_v4).r(i11).p(1).m(4).g(i12).t(0.0f).k(CardParam.DISPLAY_MODE.LIMIT).c());
                }
                if (kotlin.jvm.internal.f0.g("finish", data.getState()) || kotlin.jvm.internal.f0.g("blocking", data.getState())) {
                    textView4.setTextColor(((com.max.hbcommon.base.d) this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    UserTaskFragmentV2 userTaskFragmentV2 = this;
                    stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) userTaskFragmentV2).mContext, R.color.background_card_1_color, fH0));
                    stateListDrawable.addState(new int[0], com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) userTaskFragmentV2).mContext, R.color.divider_secondary_1_color, fH0));
                    textView4.setBackground(stateListDrawable);
                    textView4.setOnClickListener(b.f78656b);
                } else {
                    String maxjia = data.getMaxjia();
                    if (!(maxjia == null || maxjia.length() == 0)) {
                        textView4.setOnClickListener(new a(this, data));
                    } else if (kotlin.jvm.internal.f0.g("normal", data.getType())) {
                        String title = data.getTitle();
                        if (title != null) {
                            z10 = false;
                            if (StringsKt__StringsKt.W2(title, "推送", false, 2, null)) {
                                z11 = true;
                            }
                            if (z11) {
                                this.f78596q = z10;
                                UserTaskFragmentV2.M3(this);
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = z10;
                        if (z11) {
                            this.f78596q = z10;
                            UserTaskFragmentV2.M3(this);
                        }
                    }
                }
                View view4 = holder.itemView;
                final UserTaskFragmentV2 userTaskFragmentV3 = this;
                view4.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.UserTaskFragmentV2$refreshTaskLine$taskLineAdapter$1$bindViewHolder$4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [T, android.app.Dialog, com.max.hbcommon.component.i] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        if (PatchProxy.proxy(new Object[]{view5}, this, changeQuickRedirect, false, 24632, new Class[]{View.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        ?? iVar = new com.max.hbcommon.component.i(((com.max.hbcommon.base.d) userTaskFragmentV3).mContext, UserTaskFragmentV2.O3(userTaskFragmentV3, data, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.account.UserTaskFragmentV2$refreshTaskLine$taskLineAdapter$1$bindViewHolder$4.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24634, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                com.max.hbcommon.component.i iVar2;
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24633, new Class[0], Void.TYPE).isSupported || (iVar2 = objectRef.f124891b) == null) {
                                    return;
                                }
                                iVar2.dismiss();
                            }
                        }));
                        objectRef.f124891b = iVar;
                        if (iVar.isShowing()) {
                            return;
                        }
                        List<TaskInfoObj> tasks = data.getTasks();
                        if ((tasks != null ? tasks.size() : 0) > 0) {
                            ((com.max.hbcommon.component.i) objectRef.f124891b).show();
                        }
                    }
                });
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(dVar);
        }
        if ((recyclerView != null ? recyclerView.getItemDecorationCount() : 0) <= 0 && recyclerView != null) {
            recyclerView.addItemDecoration(new t(arrayList));
        }
        if (kotlin.jvm.internal.f0.g(taskResultObj.getTask_lines().getAll_finish(), Boolean.TRUE)) {
            com.max.hbcommon.base.adapter.t tVar2 = this.f78602w;
            if (tVar2 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar2 = null;
            }
            if (tVar2.A(R.layout.fixed_task_line_block)) {
                com.max.hbcommon.base.adapter.t tVar3 = this.f78602w;
                if (tVar3 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar3 = null;
                }
                tVar3.F(R.layout.fixed_task_line_block);
            }
            com.max.hbcommon.base.adapter.t tVar4 = this.f78602w;
            if (tVar4 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar4 = null;
            }
            if (!tVar4.z(R.layout.fixed_task_line_block)) {
                if (this.A == null) {
                    this.A = this.mInflater.inflate(R.layout.fixed_task_line_block, (ViewGroup) null, false);
                }
                com.max.hbcommon.base.adapter.t tVar5 = this.f78602w;
                if (tVar5 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                } else {
                    tVar = tVar5;
                }
                tVar.o(R.layout.fixed_task_line_block, this.A, taskResultObj, 0);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
        } else {
            com.max.hbcommon.base.adapter.t tVar6 = this.f78602w;
            if (tVar6 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar6 = null;
            }
            if (tVar6.z(R.layout.fixed_task_line_block)) {
                com.max.hbcommon.base.adapter.t tVar7 = this.f78602w;
                if (tVar7 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar7 = null;
                }
                tVar7.E(R.layout.fixed_task_line_block);
            }
            com.max.hbcommon.base.adapter.t tVar8 = this.f78602w;
            if (tVar8 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar8 = null;
            }
            if (!tVar8.A(R.layout.fixed_task_line_block)) {
                if (this.A == null) {
                    this.A = this.mInflater.inflate(R.layout.fixed_task_line_block, (ViewGroup) null, false);
                }
                com.max.hbcommon.base.adapter.t tVar9 = this.f78602w;
                if (tVar9 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                } else {
                    tVar = tVar9;
                }
                tVar.q(R.layout.fixed_task_line_block, this.A, taskResultObj);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(0);
            }
        }
        dVar.notifyDataSetChanged();
    }

    private final void D4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24561, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String coin = com.max.xiaoheihe.utils.i0.o().getAccount_detail().getLevel_info().getCoin();
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.mContext);
        if (i10 > com.max.hbutils.utils.n.q(coin)) {
            String str = getString(R.string.current_h_coin) + ": " + coin + ", 请通过每日签到、活动奖励、赛事竞猜获取更多H币";
            fVar.y("H币不足");
            fVar.l(str);
            fVar.u("我知道了", x.f78668b);
            fVar.F();
            return;
        }
        SpannableString spannableString = new SpannableString(com.max.xiaoheihe.utils.d.n0(R.string.replenish_cost) + i10 + "H币");
        spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), com.max.xiaoheihe.utils.d.n0(R.string.replenish_cost).length(), spannableString.length(), 33);
        fVar.y(spannableString);
        fVar.l(com.max.xiaoheihe.utils.d.n0(R.string.current_mcoin) + coin);
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new y());
        aVarD.show();
    }

    private final void E4(SignListResultObj signListResultObj) {
        if (PatchProxy.proxy(new Object[]{signListResultObj}, this, changeQuickRedirect, false, 24558, new Class[]{SignListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f78589j = signListResultObj.getReplenish_desc();
        this.f78593n.clear();
        if (!com.max.hbcommon.utils.c.w(signListResultObj.getSign_list())) {
            this.f78593n.addAll(signListResultObj.getSign_list());
        }
        View view = this.f78604y;
        if (view != null) {
            kotlin.jvm.internal.f0.m(view);
            view.setVisibility((this.f78592m || com.max.hbcommon.utils.c.w(this.f78593n)) ? 8 : 0);
        }
        z4();
    }

    private final void F4(TaskResultObj taskResultObj) {
        if (PatchProxy.proxy(new Object[]{taskResultObj}, this, changeQuickRedirect, false, 24551, new Class[]{TaskResultObj.class}, Void.TYPE).isSupported || taskResultObj == null) {
            return;
        }
        this.f78590k = taskResultObj.getExp_rule_protocol();
        com.max.hbcommon.base.adapter.t tVar = null;
        this.f78591l = taskResultObj.getUser() != null ? taskResultObj.getUser().getLevel_info() : null;
        List<TaskListObj> task_list = taskResultObj.getTask_list();
        this.f78594o.clear();
        if (!com.max.hbcommon.utils.c.w(task_list)) {
            this.f78594o.addAll(task_list);
        }
        if (taskResultObj.getUser() != null) {
            AccountDetailObj accountDetailObj = new AccountDetailObj();
            accountDetailObj.setLevel_info(this.f78591l);
            accountDetailObj.setBbs_medal(taskResultObj.getUser().getMedal());
            accountDetailObj.setUserid(taskResultObj.getUser().getUserid());
            b10 b10Var = this.f78600u;
            if (b10Var == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var = null;
            }
            com.max.xiaoheihe.utils.d.h1(b10Var.f108718d, accountDetailObj);
            this.f78587h = taskResultObj.getUser().getBattery();
        }
        if (this.f78591l != null) {
            User user = this.f78582c;
            kotlin.jvm.internal.f0.m(user);
            user.getAccount_detail().setLevel_info(this.f78591l);
            LevelInfoObj levelInfoObj = this.f78591l;
            kotlin.jvm.internal.f0.m(levelInfoObj);
            this.f78583d = levelInfoObj.getCoin();
            com.max.xiaoheihe.utils.i0.z(this.f78582c);
            L3();
        }
        if (!com.max.hbcommon.utils.c.w(taskResultObj.getTask_list())) {
            this.f78595p.clear();
            int size = this.f78594o.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!com.max.hbcommon.utils.c.w(this.f78594o.get(i10).getTasks())) {
                    TaskInfoObj taskInfoObj = new TaskInfoObj();
                    taskInfoObj.setIs_band("true");
                    taskInfoObj.setTitle(this.f78594o.get(i10).getTitle());
                    this.f78595p.add(taskInfoObj);
                    this.f78595p.addAll(this.f78594o.get(i10).getTasks());
                }
            }
            com.max.hbcommon.base.adapter.t tVar2 = this.f78602w;
            if (tVar2 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar2 = null;
            }
            tVar2.notifyDataSetChanged();
        }
        if (com.max.hbcommon.utils.c.u(taskResultObj.getDescription())) {
            com.max.hbcommon.base.adapter.t tVar3 = this.f78602w;
            if (tVar3 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar3 = null;
            }
            if (tVar3.A(R.layout.header_user_task_desc)) {
                com.max.hbcommon.base.adapter.t tVar4 = this.f78602w;
                if (tVar4 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar4 = null;
                }
                tVar4.F(R.layout.header_user_task_desc);
            }
        } else {
            LayoutInflater layoutInflater = this.mContext.getLayoutInflater();
            b1 b1Var = this.f78599t;
            if (b1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                b1Var = null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.header_user_task_desc, (ViewGroup) b1Var.f131495b, false);
            com.max.hbcommon.base.adapter.t tVar5 = this.f78602w;
            if (tVar5 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar5 = null;
            }
            if (!tVar5.A(R.layout.header_user_task_desc)) {
                View viewFindViewById = viewInflate.findViewById(R.id.tv_desc);
                kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById).setText(taskResultObj.getDescription());
                com.max.hbcommon.base.adapter.t tVar6 = this.f78602w;
                if (tVar6 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar6 = null;
                }
                tVar6.r(R.layout.header_user_task_desc, viewInflate, null, 1);
            }
        }
        if (kotlin.jvm.internal.f0.g(taskResultObj.getTask_lines().getAll_finish(), Boolean.TRUE)) {
            com.max.hbcommon.base.adapter.t tVar7 = this.f78602w;
            if (tVar7 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar7 = null;
            }
            if (tVar7.A(R.layout.fixed_task_line_block)) {
                com.max.hbcommon.base.adapter.t tVar8 = this.f78602w;
                if (tVar8 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar8 = null;
                }
                tVar8.F(R.layout.fixed_task_line_block);
            }
            com.max.hbcommon.base.adapter.t tVar9 = this.f78602w;
            if (tVar9 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar9 = null;
            }
            if (!tVar9.z(R.layout.fixed_task_line_block)) {
                if (this.A == null) {
                    this.A = this.mInflater.inflate(R.layout.fixed_task_line_block, (ViewGroup) null, false);
                }
                com.max.hbcommon.base.adapter.t tVar10 = this.f78602w;
                if (tVar10 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar10 = null;
                }
                tVar10.o(R.layout.fixed_task_line_block, this.A, taskResultObj, 0);
            }
        } else {
            com.max.hbcommon.base.adapter.t tVar11 = this.f78602w;
            if (tVar11 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar11 = null;
            }
            if (tVar11.z(R.layout.fixed_task_line_block)) {
                com.max.hbcommon.base.adapter.t tVar12 = this.f78602w;
                if (tVar12 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar12 = null;
                }
                tVar12.E(R.layout.fixed_task_line_block);
            }
            com.max.hbcommon.base.adapter.t tVar13 = this.f78602w;
            if (tVar13 == null) {
                kotlin.jvm.internal.f0.S("mAdapter");
                tVar13 = null;
            }
            if (!tVar13.A(R.layout.fixed_task_line_block)) {
                if (this.A == null) {
                    this.A = this.mInflater.inflate(R.layout.fixed_task_line_block, (ViewGroup) null, false);
                }
                com.max.hbcommon.base.adapter.t tVar14 = this.f78602w;
                if (tVar14 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    tVar14 = null;
                }
                tVar14.q(R.layout.fixed_task_line_block, this.A, taskResultObj);
            }
        }
        com.max.hbcommon.base.adapter.t tVar15 = this.f78602w;
        if (tVar15 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            tVar15 = null;
        }
        tVar15.H(R.layout.item_user_task_profile_header_v2, taskResultObj);
        com.max.hbcommon.base.adapter.t tVar16 = this.f78602w;
        if (tVar16 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            tVar = tVar16;
        }
        tVar.H(R.layout.fixed_task_line_block, taskResultObj);
        x4(taskResultObj.getSign_v2_info());
        RecyclerViewReportManager<TaskInfoObj> recyclerViewReportManager = this.B;
        if (recyclerViewReportManager != null) {
            recyclerViewReportManager.b();
        }
        RecyclerViewReportManager<TaskInfoObj> recyclerViewReportManager2 = this.B;
        if (recyclerViewReportManager2 != null) {
            recyclerViewReportManager2.f(100L);
        }
        v4();
        showContentView();
    }

    private final void G4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24548, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("push_open", str);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x8("7", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new a0()));
    }

    private final void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24563, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        User user = this.f78582c;
        kotlin.jvm.internal.f0.m(user);
        this.f78584e = user.getAccount_detail().getLevel_info().getExp();
        User user2 = this.f78582c;
        kotlin.jvm.internal.f0.m(user2);
        this.f78585f = user2.getAccount_detail().getLevel_info().getLevel();
        User user3 = this.f78582c;
        kotlin.jvm.internal.f0.m(user3);
        this.f78586g = user3.getAccount_detail().getLevel_info().getMax_exp();
        b10 b10Var = this.f78600u;
        b10 b10Var2 = null;
        if (b10Var == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var = null;
        }
        b10Var.f108720f.setText(r1.E(this.f78583d));
        if (com.max.hbcommon.utils.c.u(this.f78585f)) {
            b10 b10Var3 = this.f78600u;
            if (b10Var3 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var3 = null;
            }
            b10Var3.f108722h.setText("Lv.1");
        } else {
            b10 b10Var4 = this.f78600u;
            if (b10Var4 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var4 = null;
            }
            b10Var4.f108722h.setText("Lv." + this.f78585f);
        }
        if (com.max.hbcommon.utils.c.u(this.f78587h)) {
            b10 b10Var5 = this.f78600u;
            if (b10Var5 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var5 = null;
            }
            b10Var5.f108719e.setText("0");
        } else {
            b10 b10Var6 = this.f78600u;
            if (b10Var6 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var6 = null;
            }
            b10Var6.f108719e.setText(this.f78587h);
        }
        User user4 = this.f78582c;
        kotlin.jvm.internal.f0.m(user4);
        String next_level_desc = user4.getAccount_detail().getLevel_info().getNext_level_desc();
        if (next_level_desc == null || next_level_desc.length() == 0) {
            b10 b10Var7 = this.f78600u;
            if (b10Var7 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var7 = null;
            }
            b10Var7.f108727m.setVisibility(8);
            b10 b10Var8 = this.f78600u;
            if (b10Var8 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var8 = null;
            }
            b10Var8.f108723i.setVisibility(8);
        } else {
            b10 b10Var9 = this.f78600u;
            if (b10Var9 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var9 = null;
            }
            b10Var9.f108727m.setVisibility(0);
            b10 b10Var10 = this.f78600u;
            if (b10Var10 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var10 = null;
            }
            b10Var10.f108723i.setVisibility(0);
            b10 b10Var11 = this.f78600u;
            if (b10Var11 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var11 = null;
            }
            TextView textView = b10Var11.f108723i;
            User user5 = this.f78582c;
            kotlin.jvm.internal.f0.m(user5);
            textView.setText(user5.getAccount_detail().getLevel_info().getNext_level_desc());
        }
        if (this.f78586g != null && this.f78584e != null) {
            b10 b10Var12 = this.f78600u;
            if (b10Var12 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var12 = null;
            }
            TextView textView2 = b10Var12.f108725k;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("距离升级还需要 ");
            String str = this.f78586g;
            kotlin.jvm.internal.f0.m(str);
            int i10 = Integer.parseInt(str);
            String str2 = this.f78584e;
            kotlin.jvm.internal.f0.m(str2);
            sb2.append(i10 - Integer.parseInt(str2));
            sb2.append(" EXP");
            textView2.setText(sb2.toString());
            b10 b10Var13 = this.f78600u;
            if (b10Var13 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var13 = null;
            }
            b10Var13.f108728n.setOnClickListener(new b());
        }
        if (com.max.hbcommon.utils.c.u(this.f78586g) || com.max.hbcommon.utils.c.u(this.f78584e)) {
            b10 b10Var14 = this.f78600u;
            if (b10Var14 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
                b10Var14 = null;
            }
            b10Var14.f108724j.setText("- / -");
            b10 b10Var15 = this.f78600u;
            if (b10Var15 == null) {
                kotlin.jvm.internal.f0.S("headerBinding");
            } else {
                b10Var2 = b10Var15;
            }
            b10Var2.f108717c.setProgress(0);
            return;
        }
        SpannableString spannableString = new SpannableString(this.f78584e + " / " + this.f78586g);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.white));
        String str3 = this.f78584e;
        kotlin.jvm.internal.f0.m(str3);
        spannableString.setSpan(foregroundColorSpan, 0, str3.length(), 33);
        b10 b10Var16 = this.f78600u;
        if (b10Var16 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var16 = null;
        }
        b10Var16.f108724j.setText(spannableString);
        b10 b10Var17 = this.f78600u;
        if (b10Var17 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var17 = null;
        }
        ProgressBar progressBar = b10Var17.f108717c;
        String str4 = this.f78586g;
        kotlin.jvm.internal.f0.m(str4);
        progressBar.setMax(Integer.parseInt(str4));
        b10 b10Var18 = this.f78600u;
        if (b10Var18 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
        } else {
            b10Var2 = b10Var18;
        }
        ProgressBar progressBar2 = b10Var2.f108717c;
        String str5 = this.f78584e;
        kotlin.jvm.internal.f0.m(str5);
        progressBar2.setProgress(Integer.parseInt(str5));
    }

    public static final /* synthetic */ void M3(UserTaskFragmentV2 userTaskFragmentV2) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2}, null, changeQuickRedirect, true, SocializeConstants.DAU_EVENT, new Class[]{UserTaskFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.p4();
    }

    public static final /* synthetic */ void N3(UserTaskFragmentV2 userTaskFragmentV2, TaskInfoObj taskInfoObj) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2, taskInfoObj}, null, changeQuickRedirect, true, SocializeConstants.AUTH_EVENT, new Class[]{UserTaskFragmentV2.class, TaskInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.q4(taskInfoObj);
    }

    public static final /* synthetic */ View O3(UserTaskFragmentV2 userTaskFragmentV2, TaskLineObj taskLineObj, yh.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userTaskFragmentV2, taskLineObj, aVar}, null, changeQuickRedirect, true, SocializeConstants.SHARE_EVENT, new Class[]{UserTaskFragmentV2.class, TaskLineObj.class, yh.a.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : userTaskFragmentV2.r4(taskLineObj, aVar);
    }

    public static final /* synthetic */ void W3(UserTaskFragmentV2 userTaskFragmentV2, String str) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2, str}, null, changeQuickRedirect, true, SocializeConstants.SEND_DAU_STATS_EVENT, new Class[]{UserTaskFragmentV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.s4(str);
    }

    public static final /* synthetic */ void Z3(UserTaskFragmentV2 userTaskFragmentV2) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2}, null, changeQuickRedirect, true, SocializeConstants.CHECK_STATS_EVENT, new Class[]{UserTaskFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.t4();
    }

    public static final /* synthetic */ void a4(UserTaskFragmentV2 userTaskFragmentV2) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2}, null, changeQuickRedirect, true, 24575, new Class[]{UserTaskFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.u4();
    }

    public static final /* synthetic */ void d4(UserTaskFragmentV2 userTaskFragmentV2) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2}, null, changeQuickRedirect, true, SocializeConstants.RELEASE_DB_CONNECTION, new Class[]{UserTaskFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.z4();
    }

    public static final /* synthetic */ void e4(UserTaskFragmentV2 userTaskFragmentV2, com.max.hbcommon.base.adapter.s.e eVar, TaskResultObj taskResultObj) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2, eVar, taskResultObj}, null, changeQuickRedirect, true, 24574, new Class[]{UserTaskFragmentV2.class, com.max.hbcommon.base.adapter.s.e.class, TaskResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.A4(eVar, taskResultObj);
    }

    public static final /* synthetic */ void l4(UserTaskFragmentV2 userTaskFragmentV2, int i10) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2, new Integer(i10)}, null, changeQuickRedirect, true, SocializeConstants.SAVE_STATS_EVENT, new Class[]{UserTaskFragmentV2.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.D4(i10);
    }

    public static final /* synthetic */ void m4(UserTaskFragmentV2 userTaskFragmentV2, SignListResultObj signListResultObj) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2, signListResultObj}, null, changeQuickRedirect, true, SocializeConstants.GET_EVENT, new Class[]{UserTaskFragmentV2.class, SignListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.E4(signListResultObj);
    }

    public static final /* synthetic */ void n4(UserTaskFragmentV2 userTaskFragmentV2, TaskResultObj taskResultObj) {
        if (PatchProxy.proxy(new Object[]{userTaskFragmentV2, taskResultObj}, null, changeQuickRedirect, true, 24576, new Class[]{UserTaskFragmentV2.class, TaskResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userTaskFragmentV2.F4(taskResultObj);
    }

    private final void o4(SignInInfo signInInfo) {
        if (PatchProxy.proxy(new Object[]{signInInfo}, this, changeQuickRedirect, false, 24557, new Class[]{SignInInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
        b1 b1Var = this.f78599t;
        com.max.hbcommon.base.adapter.t tVar = null;
        if (b1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var = null;
        }
        this.f78605z = layoutInflaterFrom.inflate(R.layout.header_sign_in_v2, (ViewGroup) b1Var.f131495b, false);
        B4(signInInfo);
        com.max.hbcommon.base.adapter.t tVar2 = this.f78602w;
        if (tVar2 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            tVar2 = null;
        }
        tVar2.p(R.layout.header_sign_in_v2, this.f78605z);
        com.max.hbcommon.base.adapter.t tVar3 = this.f78602w;
        if (tVar3 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            tVar = tVar3;
        }
        tVar.notifyDataSetChanged();
    }

    private final void p4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = com.max.xiaoheihe.utils.d.N0(this.mContext) ? "1" : "0";
        if ((this.f78596q || !kotlin.jvm.internal.f0.g("1", str)) && kotlin.jvm.internal.f0.g(str, com.max.hbcache.c.o("push_open_state", ""))) {
            return;
        }
        com.max.hbcache.c.C("push_open_state", str);
        G4(str);
    }

    private final void q4(TaskInfoObj taskInfoObj) {
        JsonObject report_extra;
        JsonObject jsonObjectDeepCopy;
        if (PatchProxy.proxy(new Object[]{taskInfoObj}, this, changeQuickRedirect, false, 24572, new Class[]{TaskInfoObj.class}, Void.TYPE).isSupported || (report_extra = taskInfoObj.getReport_extra()) == null || (jsonObjectDeepCopy = report_extra.deepCopy()) == null) {
            return;
        }
        jsonObjectDeepCopy.addProperty("state", taskInfoObj.getState());
        com.max.hbcommon.analytics.d.d("4", lb.d.H1, null, jsonObjectDeepCopy);
    }

    private final View r4(TaskLineObj taskLineObj, yh.a<b2> aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{taskLineObj, aVar}, this, changeQuickRedirect, false, 24553, new Class[]{TaskLineObj.class, yh.a.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        mb0 mb0VarC = mb0.c(this.mInflater);
        kotlin.jvm.internal.f0.o(mb0VarC, "inflate(mInflater)");
        ArrayList arrayList = new ArrayList();
        if ((taskLineObj != null ? taskLineObj.getTasks() : null) != null) {
            List<TaskInfoObj> tasks = taskLineObj.getTasks();
            kotlin.jvm.internal.f0.m(tasks);
            arrayList.addAll(tasks);
        }
        RecyclerView recyclerView = mb0VarC.f113377b;
        kotlin.jvm.internal.f0.o(recyclerView, "taskDialogBinding.rvDialog");
        RecyclerViewReportManager recyclerViewReportManager = new RecyclerViewReportManager(recyclerView);
        f fVar = new f(arrayList, recyclerViewReportManager, this, aVar);
        mb0VarC.f113377b.setLayoutManager(new LinearLayoutManager(getContext()));
        if (mb0VarC.f113377b.getItemDecorationCount() <= 0) {
            mb0VarC.f113377b.addItemDecoration(new d(arrayList, this));
        }
        mb0VarC.f113377b.setAdapter(fVar);
        mb0VarC.f113378c.setText(taskLineObj != null ? taskLineObj.getTitle() : null);
        fVar.notifyDataSetChanged();
        recyclerViewReportManager.f(100L);
        mb0VarC.f113379d.setOnClickListener(new e(aVar));
        RelativeLayout relativeLayoutB = mb0VarC.b();
        kotlin.jvm.internal.f0.o(relativeLayoutB, "taskDialogBinding.root");
        return relativeLayoutB;
    }

    @SuppressLint({"AutoDispose"})
    private final void s4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24560, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l6(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private final void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24559, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().k5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private final void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24549, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78596q = true;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ib().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private final void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24554, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcustomview.e eVar = new com.max.hbcustomview.e(0.0f, 360.0f, ViewUtils.f(this.mContext, 15.0f), ViewUtils.f(this.mContext, 15.0f), 0, false);
        this.f78598s = eVar;
        kotlin.jvm.internal.f0.m(eVar);
        eVar.setDuration(1000);
        com.max.hbcustomview.e eVar2 = this.f78598s;
        kotlin.jvm.internal.f0.m(eVar2);
        eVar2.setRepeatCount(2);
        com.max.hbcustomview.e eVar3 = this.f78598s;
        kotlin.jvm.internal.f0.m(eVar3);
        eVar3.setFillAfter(true);
        com.max.hbcustomview.e eVar4 = this.f78598s;
        kotlin.jvm.internal.f0.m(eVar4);
        eVar4.setInterpolator(new LinearInterpolator());
        com.max.hbcustomview.e eVar5 = this.f78598s;
        kotlin.jvm.internal.f0.m(eVar5);
        eVar5.setAnimationListener(new j());
    }

    private final void w4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24546, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f78581b = arguments.getString("heybox_id");
        }
        this.f78582c = com.max.xiaoheihe.utils.i0.o();
    }

    private final void x4(SignInInfo signInInfo) {
        if (PatchProxy.proxy(new Object[]{signInInfo}, this, changeQuickRedirect, false, 24555, new Class[]{SignInInfo.class}, Void.TYPE).isSupported || signInInfo == null || !com.max.xiaoheihe.utils.i0.s()) {
            return;
        }
        com.max.hbcommon.base.adapter.t tVar = this.f78602w;
        if (tVar == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            tVar = null;
        }
        if (tVar.A(R.layout.header_sign_in_v2)) {
            B4(signInInfo);
        } else {
            o4(signInInfo);
        }
    }

    @dl.d
    @xh.m
    public static final UserTaskFragmentV2 y4(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24573, new Class[]{String.class}, UserTaskFragmentV2.class);
        return patchProxyResultProxy.isSupported ? (UserTaskFragmentV2) patchProxyResultProxy.result : D.a(str);
    }

    private final void z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24562, new Class[0], Void.TYPE).isSupported || this.f78603x == null || com.max.hbcommon.utils.c.w(this.f78593n)) {
            return;
        }
        View view = this.f78603x;
        kotlin.jvm.internal.f0.m(view);
        view.setVisibility(0);
        View view2 = this.f78603x;
        kotlin.jvm.internal.f0.m(view2);
        View viewFindViewById = view2.findViewById(R.id.calendarView);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type com.max.hbcommon.component.ezcalendarview.EZCalendarView");
        EZCalendarView eZCalendarView = (EZCalendarView) viewFindViewById;
        View view3 = this.f78603x;
        kotlin.jvm.internal.f0.m(view3);
        View viewFindViewById2 = view3.findViewById(R.id.tv_current_month);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View view4 = this.f78603x;
        kotlin.jvm.internal.f0.m(view4);
        View viewFindViewById3 = view4.findViewById(R.id.tv_rule_desc);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        if (!com.max.hbcommon.utils.c.u(this.f78589j)) {
            textView2.setText(this.f78589j);
        }
        long j10 = 1000;
        eZCalendarView.setMinDate(com.max.hbutils.utils.n.r(this.f78593n.get(0).getDate()) * j10);
        eZCalendarView.setMaxDate(System.currentTimeMillis());
        eZCalendarView.setOnDaySelectedListener(new n());
        eZCalendarView.setOnMonthChangedListener(new o(textView));
        eZCalendarView.g();
        for (SignDateObj signDateObj : this.f78593n) {
            Bundle bundle = new Bundle();
            if (kotlin.jvm.internal.f0.g("true", signDateObj.getIs_sign())) {
                bundle.putInt("style", 5);
                bundle.putInt(EZCalendarView.B, this.mContext.getResources().getColor(R.color.nav_bar_active));
            } else {
                bundle.putInt("style", 6);
                bundle.putInt(EZCalendarView.B, this.mContext.getResources().getColor(R.color.nav_bar_active));
                bundle.putString(Progress.L, signDateObj.getDate());
            }
            eZCalendarView.n(com.max.hbutils.utils.n.r(signDateObj.getDate()) * j10, bundle);
        }
        textView.setText(new SimpleDateFormat("yyyy-MM", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.d
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24569, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key", "task");
        String string = jsonObject.toString();
        kotlin.jvm.internal.f0.o(string, "additional.toString()");
        return string;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24565, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        u4();
        t4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        AccountDetailObj account_detail;
        AccountDetailObj account_detail2;
        AccountDetailObj account_detail3;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24547, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        b1 b1VarC = b1.c(this.mInflater);
        kotlin.jvm.internal.f0.o(b1VarC, "inflate(mInflater)");
        this.f78599t = b1VarC;
        if (b1VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1VarC = null;
        }
        setContentView(b1VarC);
        w4();
        b1 b1Var = this.f78599t;
        if (b1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var = null;
        }
        b1Var.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        LayoutInflater layoutInflater = this.mInflater;
        b1 b1Var2 = this.f78599t;
        if (b1Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var2 = null;
        }
        b10 b10VarD = b10.d(layoutInflater, b1Var2.f131495b, false);
        kotlin.jvm.internal.f0.o(b10VarD, "inflate(mInflater, binding.rv, false)");
        this.f78600u = b10VarD;
        LayoutInflater layoutInflater2 = this.mInflater;
        b1 b1Var3 = this.f78599t;
        if (b1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var3 = null;
        }
        ob0 ob0VarD = ob0.d(layoutInflater2, b1Var3.f131495b, false);
        kotlin.jvm.internal.f0.o(ob0VarD, "inflate(mInflater, binding.rv, false)");
        this.f78601v = ob0VarD;
        if (ob0VarD == null) {
            kotlin.jvm.internal.f0.S("footerBinding");
            ob0VarD = null;
        }
        ob0VarD.f114187b.setText(R.string.check_quest_rule);
        k kVar = new k(new c());
        this.f78602w = kVar;
        b10 b10Var = this.f78600u;
        if (b10Var == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var = null;
        }
        kVar.p(R.layout.item_user_task_profile_header_v2, b10Var.b());
        com.max.hbcommon.base.adapter.t tVar = this.f78602w;
        if (tVar == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            tVar = null;
        }
        ob0 ob0Var = this.f78601v;
        if (ob0Var == null) {
            kotlin.jvm.internal.f0.S("footerBinding");
            ob0Var = null;
        }
        tVar.m(R.layout.layout_tasklist_footer, ob0Var.b());
        b1 b1Var4 = this.f78599t;
        if (b1Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var4 = null;
        }
        RecyclerView recyclerView = b1Var4.f131495b;
        com.max.hbcommon.base.adapter.t tVar2 = this.f78602w;
        if (tVar2 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            tVar2 = null;
        }
        recyclerView.setAdapter(tVar2);
        b1 b1Var5 = this.f78599t;
        if (b1Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var5 = null;
        }
        RecyclerView recyclerView2 = b1Var5.f131495b;
        kotlin.jvm.internal.f0.o(recyclerView2, "binding.rv");
        this.B = new RecyclerViewReportManager<>(recyclerView2);
        b1 b1Var6 = this.f78599t;
        if (b1Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var6 = null;
        }
        b1Var6.f131496c.S(new l());
        b1 b1Var7 = this.f78599t;
        if (b1Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            b1Var7 = null;
        }
        b1Var7.f131496c.b0(false);
        b10 b10Var2 = this.f78600u;
        if (b10Var2 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var2 = null;
        }
        TextView textView = b10Var2.f108726l;
        User user = this.f78582c;
        textView.setText((user == null || (account_detail3 = user.getAccount_detail()) == null) ? null : account_detail3.getUsername());
        b10 b10Var3 = this.f78600u;
        if (b10Var3 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var3 = null;
        }
        AvatarView avatarView = b10Var3.f108716b;
        User user2 = this.f78582c;
        avatarView.setAvatar((user2 == null || (account_detail2 = user2.getAccount_detail()) == null) ? null : account_detail2.getAvartar());
        b10 b10Var4 = this.f78600u;
        if (b10Var4 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var4 = null;
        }
        b10Var4.f108716b.a();
        b10 b10Var5 = this.f78600u;
        if (b10Var5 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var5 = null;
        }
        AvatarView avatarView2 = b10Var5.f108716b;
        User user3 = this.f78582c;
        avatarView2.setDecoration((user3 == null || (account_detail = user3.getAccount_detail()) == null) ? null : account_detail.getAvatar_decoration());
        b10 b10Var6 = this.f78600u;
        if (b10Var6 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var6 = null;
        }
        b10Var6.f108721g.setText(R.string.level_heybox);
        b10 b10Var7 = this.f78600u;
        if (b10Var7 == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var7 = null;
        }
        RelativeLayout relativeLayout = b10Var7.f108718d;
        User user4 = this.f78582c;
        com.max.xiaoheihe.utils.d.i1(relativeLayout, user4 != null ? user4.getAccount_detail() : null, 16);
        String str = com.max.xiaoheihe.utils.d.N0(this.mContext) ? "1" : "0";
        if (!kotlin.jvm.internal.f0.g(str, com.max.hbcache.c.o("push_open_state", ""))) {
            com.max.hbcache.c.C("push_open_state", str);
            G4(str);
        }
        L3();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24570, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.mContext).onActivityResult(i10, i11, intent);
        if (i10 == 4 && i11 == -1) {
            b1 b1Var = this.f78599t;
            if (b1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                b1Var = null;
            }
            b1Var.f131496c.postDelayed(new m(), 300L);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24571, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        UMShareAPI.get(this.mContext).release();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24567, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f78592m = false;
        u4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24568, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        p4();
        if (this.f78597r) {
            u4();
            this.f78597r = false;
        }
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24566, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b10 b10Var = this.f78600u;
        ob0 ob0Var = null;
        if (b10Var == null) {
            kotlin.jvm.internal.f0.S("headerBinding");
            b10Var = null;
        }
        b10Var.f108729o.setOnClickListener(new u());
        ob0 ob0Var2 = this.f78601v;
        if (ob0Var2 == null) {
            kotlin.jvm.internal.f0.S("footerBinding");
            ob0Var2 = null;
        }
        ob0Var2.f114187b.setOnClickListener(new v());
        ob0 ob0Var3 = this.f78601v;
        if (ob0Var3 == null) {
            kotlin.jvm.internal.f0.S("footerBinding");
        } else {
            ob0Var = ob0Var3;
        }
        ob0Var.f114188c.setOnClickListener(new w());
    }
}
