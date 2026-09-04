package com.max.xiaoheihe.module.video.action;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ed0;
import df.fd0;
import df.k10;
import df.xd0;
import dl.e;
import io.reactivex.disposables.b;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.u;
import yh.l;

/* JADX INFO: compiled from: VideoMoreAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class VideoMoreAction implements com.max.video.ui.widget.f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f93701g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private l<? super Boolean, b2> f93702a = new l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoMoreAction$menuAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void a(boolean z10) {
        }

        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 46410, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(bool.booleanValue());
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private l<? super io.reactivex.disposables.b, b2> f93703b = new l<io.reactivex.disposables.b, b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoMoreAction$registerDisposable$1
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void a(@e b bVar) {
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 46411, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(bVar);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private d2 f93704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private xd0 f93705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ed0 f93706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fd0 f93707f;

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93708b;

        a(VideoCollectAction videoCollectAction) {
            this.f93708b = videoCollectAction;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46398, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoCollectAction.w(this.f93708b, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93709b;

        b(VideoCollectAction videoCollectAction) {
            this.f93709b = videoCollectAction;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46399, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoCollectAction.w(this.f93709b, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f93710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f93711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f93712d;

        /* JADX INFO: compiled from: VideoMoreAction.kt */
        public static final class a implements ReportReasonFragment.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f93713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f93714b;

            a(String str, String str2) {
                this.f93713a = str;
                this.f93714b = str2;
            }

            @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
            public void a(@dl.d String report_reason, @dl.e String str) {
                if (PatchProxy.proxy(new Object[]{report_reason, str}, this, changeQuickRedirect, false, 46401, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(report_reason, "report_reason");
                com.max.xiaoheihe.module.bbs.utils.b.T(this.f93713a, report_reason, str, this.f93714b);
            }
        }

        c(String str, Context context, String str2) {
            this.f93710b = str;
            this.f93711c = context;
            this.f93712d = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46400, new Class[]{View.class}, Void.TYPE).isSupported || (str = this.f93710b) == null) {
                return;
            }
            Context context = this.f93711c;
            String str2 = this.f93712d;
            if (i0.e(context)) {
                ReportReasonFragment reportReasonFragmentA = ReportReasonFragment.f80025u.a(new a(str, str2), ReportReasonFragment.ObjectType.link, null, str, null);
                f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                reportReasonFragmentA.show(((AppCompatActivity) context).getSupportFragmentManager(), "ForbidReasonFragment");
            }
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f93715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f93716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f93717d;

        /* JADX INFO: compiled from: VideoMoreAction.kt */
        public static final class a implements ReportReasonFragment.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f93718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f93719b;

            a(String str, String str2) {
                this.f93718a = str;
                this.f93719b = str2;
            }

            @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
            public void a(@dl.d String report_reason, @dl.e String str) {
                if (PatchProxy.proxy(new Object[]{report_reason, str}, this, changeQuickRedirect, false, 46403, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(report_reason, "report_reason");
                com.max.xiaoheihe.module.bbs.utils.b.T(this.f93718a, report_reason, str, this.f93719b);
            }
        }

        d(String str, Context context, String str2) {
            this.f93715b = str;
            this.f93716c = context;
            this.f93717d = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46402, new Class[]{View.class}, Void.TYPE).isSupported || (str = this.f93715b) == null) {
                return;
            }
            Context context = this.f93716c;
            String str2 = this.f93717d;
            if (i0.e(context)) {
                ReportReasonFragment reportReasonFragmentA = ReportReasonFragment.f80025u.a(new a(str, str2), ReportReasonFragment.ObjectType.link, null, str, null);
                f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                reportReasonFragmentA.show(((AppCompatActivity) context).getSupportFragmentManager(), "ForbidReasonFragment");
            }
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f93720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f93721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<View> f93722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<Float, Integer> f93723e;

        e(AbsVideoView absVideoView, RelativeLayout relativeLayout, ArrayList<View> arrayList, HashMap<Float, Integer> map) {
            this.f93720b = absVideoView;
            this.f93721c = relativeLayout;
            this.f93722d = arrayList;
            this.f93723e = map;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            u<Float> uVarD;
            u<Float> uVarD2;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46404, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.video.player.a player = this.f93720b.getPlayer();
            Float value = null;
            Float value2 = (player == null || (uVarD2 = player.D()) == null) ? null : uVarD2.getValue();
            Object tag = this.f93721c.getTag();
            f0.n(tag, "null cannot be cast to non-null type kotlin.Float");
            if (f0.e(value2, ((Float) tag).floatValue())) {
                return;
            }
            this.f93721c.setBackgroundResource(R.drawable.background_white_alpha20_r4_white_stroke);
            ArrayList<View> arrayList = this.f93722d;
            HashMap<Float, Integer> map = this.f93723e;
            com.max.video.player.a player2 = this.f93720b.getPlayer();
            if (player2 != null && (uVarD = player2.D()) != null) {
                value = uVarD.getValue();
            }
            Integer num = map.get(value);
            arrayList.get(num != null ? num.intValue() : 0).setBackgroundResource(R.drawable.background_white_alpha12_r4);
            com.max.video.player.a player3 = this.f93720b.getPlayer();
            if (player3 != null) {
                Object tag2 = this.f93721c.getTag();
                f0.n(tag2, "null cannot be cast to non-null type kotlin.Float");
                player3.setPlaybackSpeed(((Float) tag2).floatValue());
            }
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46405, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoMoreAction.this.n().invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46406, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoMoreAction.this.n().invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46407, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoMoreAction.this.n().invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46408, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoMoreAction.this.n().invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: VideoMoreAction.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f93732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f93733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<View> f93734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<Float, Integer> f93735e;

        j(AbsVideoView absVideoView, RelativeLayout relativeLayout, ArrayList<View> arrayList, HashMap<Float, Integer> map) {
            this.f93732b = absVideoView;
            this.f93733c = relativeLayout;
            this.f93734d = arrayList;
            this.f93735e = map;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            u<Float> uVarD;
            u<Float> uVarD2;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46409, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.video.player.a player = this.f93732b.getPlayer();
            Float value = null;
            Float value2 = (player == null || (uVarD2 = player.D()) == null) ? null : uVarD2.getValue();
            Object tag = this.f93733c.getTag();
            f0.n(tag, "null cannot be cast to non-null type kotlin.Float");
            if (f0.e(value2, ((Float) tag).floatValue())) {
                return;
            }
            this.f93733c.setBackgroundResource(R.drawable.background_white_alpha20_r4_white_stroke);
            ArrayList<View> arrayList = this.f93734d;
            HashMap<Float, Integer> map = this.f93735e;
            com.max.video.player.a player2 = this.f93732b.getPlayer();
            if (player2 != null && (uVarD = player2.D()) != null) {
                value = uVarD.getValue();
            }
            Integer num = map.get(value);
            arrayList.get(num != null ? num.intValue() : 0).setBackgroundResource(R.drawable.background_white_alpha12_r4);
            com.max.video.player.a player3 = this.f93732b.getPlayer();
            if (player3 != null) {
                Object tag2 = this.f93733c.getTag();
                f0.n(tag2, "null cannot be cast to non-null type kotlin.Float");
                player3.setPlaybackSpeed(((Float) tag2).floatValue());
            }
        }
    }

    private final void r(Context context, AbsVideoView absVideoView) {
        u<Float> uVarD;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{context, absVideoView}, this, changeQuickRedirect, false, 46386, new Class[]{Context.class, AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        p().f110550z.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Float[] fArr = {Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f)};
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < 6; i11++) {
            map.put(fArr[i11], Integer.valueOf(i11));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        p().f110550z.addView(linearLayout);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 6; i10 < i12; i12 = 6) {
            k10 k10VarC = k10.c(layoutInflaterFrom);
            f0.o(k10VarC, "inflate(inflater)");
            RelativeLayout relativeLayoutB = k10VarC.b();
            f0.o(relativeLayoutB, "itemBinding.root");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 57.0f), ViewUtils.f(context, 32.0f));
            if (i10 % 4 != 0) {
                layoutParams.leftMargin = ViewUtils.f(context, 8.0f);
            }
            relativeLayoutB.setLayoutParams(layoutParams);
            k10VarC.f112373b.setText(String.valueOf(fArr[i10].floatValue()));
            relativeLayoutB.setTag(fArr[i10]);
            com.max.video.player.a player = absVideoView.getPlayer();
            Float value = (player == null || (uVarD = player.D()) == null) ? null : uVarD.getValue();
            Object tag = relativeLayoutB.getTag();
            f0.n(tag, "null cannot be cast to non-null type kotlin.Float");
            if (f0.e(value, ((Float) tag).floatValue())) {
                relativeLayoutB.setBackgroundResource(R.drawable.background_white_alpha20_r4_white_stroke);
            }
            relativeLayoutB.setOnClickListener(new e(absVideoView, relativeLayoutB, arrayList, map));
            linearLayout.addView(relativeLayoutB);
            arrayList.add(relativeLayoutB);
            i10++;
            if (i10 % 5 == 4) {
                linearLayout = new LinearLayout(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = ViewUtils.f(context, 6.0f);
                linearLayout.setLayoutParams(layoutParams2);
                p().f110550z.addView(linearLayout);
            }
        }
    }

    private final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46391, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o().f110151h.setOnClickListener(new g());
        o().f110145b.setOnClickListener(new h());
        p().f110527c.setOnClickListener(new i());
    }

    private final void t(Context context, AbsVideoView absVideoView) {
        u<Float> uVarD;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{context, absVideoView}, this, changeQuickRedirect, false, 46385, new Class[]{Context.class, AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        o().f110159p.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Float[] fArr = {Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f)};
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < 6; i11++) {
            map.put(fArr[i11], Integer.valueOf(i11));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        o().f110159p.addView(linearLayout);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 6; i10 < i12; i12 = 6) {
            k10 k10VarC = k10.c(layoutInflaterFrom);
            f0.o(k10VarC, "inflate(inflater)");
            RelativeLayout relativeLayoutB = k10VarC.b();
            f0.o(relativeLayoutB, "itemBinding.root");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 57.0f), ViewUtils.f(context, 32.0f));
            if (i10 % 4 != 0) {
                layoutParams.leftMargin = ViewUtils.f(context, 8.0f);
            }
            relativeLayoutB.setLayoutParams(layoutParams);
            k10VarC.f112373b.setText(String.valueOf(fArr[i10].floatValue()));
            relativeLayoutB.setTag(fArr[i10]);
            com.max.video.player.a player = absVideoView.getPlayer();
            Float value = (player == null || (uVarD = player.D()) == null) ? null : uVarD.getValue();
            Object tag = relativeLayoutB.getTag();
            f0.n(tag, "null cannot be cast to non-null type kotlin.Float");
            if (f0.e(value, ((Float) tag).floatValue())) {
                relativeLayoutB.setBackgroundResource(R.drawable.background_white_alpha20_r4_white_stroke);
            }
            relativeLayoutB.setOnClickListener(new j(absVideoView, relativeLayoutB, arrayList, map));
            linearLayout.addView(relativeLayoutB);
            arrayList.add(relativeLayoutB);
            i10++;
            if (i10 % 5 == 4) {
                linearLayout = new LinearLayout(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = ViewUtils.f(context, 6.0f);
                linearLayout.setLayoutParams(layoutParams2);
                o().f110159p.addView(linearLayout);
            }
        }
    }

    @Override // com.max.video.ui.widget.f
    public void a(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46377, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        xd0 xd0VarC = xd0.c(LayoutInflater.from(context));
        f0.o(xd0VarC, "inflate(LayoutInflater.from(context))");
        this.f93705d = xd0VarC;
        if (xd0VarC == null) {
            f0.S("binding");
            xd0VarC = null;
        }
        xd0VarC.f117538c.setOnClickListener(new f());
        ed0 ed0VarC = ed0.c(LayoutInflater.from(context));
        f0.o(ed0VarC, "inflate(LayoutInflater.from(context))");
        x(ed0VarC);
        fd0 fd0VarC = fd0.c(LayoutInflater.from(context));
        f0.o(fd0VarC, "inflate(LayoutInflater.from(context))");
        y(fd0VarC);
        s();
    }

    @Override // com.max.video.ui.widget.f
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46375, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        xd0 xd0Var = this.f93705d;
        if (xd0Var == null) {
            f0.S("binding");
            xd0Var = null;
        }
        xd0Var.b().setVisibility(8);
    }

    @Override // com.max.video.ui.widget.f
    @dl.d
    public View c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46374, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        xd0 xd0Var = this.f93705d;
        if (xd0Var == null) {
            f0.S("binding");
            xd0Var = null;
        }
        RelativeLayout relativeLayoutB = xd0Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.video.ui.widget.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46376, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        xd0 xd0Var = this.f93705d;
        if (xd0Var == null) {
            f0.S("binding");
            xd0Var = null;
        }
        xd0Var.b().setVisibility(0);
    }

    public final void e(@dl.e PopupWindow popupWindow) {
        if (PatchProxy.proxy(new Object[]{popupWindow}, this, changeQuickRedirect, false, 46379, new Class[]{PopupWindow.class}, Void.TYPE).isSupported) {
            return;
        }
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46389, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o().f110153j.setVisibility(8);
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46381, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d2 d2Var = this.f93704c;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        o().f110155l.setVisibility(8);
        o().f110155l.setOnClickListener(null);
        p().f110544t.setVisibility(8);
        p().f110544t.setOnClickListener(null);
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46383, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o().f110157n.setVisibility(8);
        o().f110157n.setOnClickListener(null);
        p().f110547w.setVisibility(8);
        p().f110547w.setOnClickListener(null);
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46387, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o().f110158o.setVisibility(8);
        o().f110159p.removeAllViews();
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46388, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o().f110153j.setVisibility(0);
    }

    public final void k(@dl.d Context context, @dl.d VideoCollectAction action) {
        if (PatchProxy.proxy(new Object[]{context, action}, this, changeQuickRedirect, false, 46380, new Class[]{Context.class, VideoCollectAction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(action, "action");
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        this.f93704c = lifecycleCoroutineScopeC != null ? lifecycleCoroutineScopeC.f(new VideoMoreAction$enableCollect$1(action, this, null)) : null;
        o().f110155l.setOnClickListener(new a(action));
        o().f110155l.setVisibility(0);
        p().f110544t.setOnClickListener(new b(action));
        p().f110544t.setVisibility(0);
    }

    public final void l(@dl.e String str, @dl.d Context context, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, context, str2}, this, changeQuickRedirect, false, 46382, new Class[]{String.class, Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        o().f110157n.setVisibility(0);
        o().f110157n.setOnClickListener(new c(str, context, str2));
        p().f110547w.setVisibility(0);
        p().f110547w.setOnClickListener(new d(str, context, str2));
    }

    public final void m(@dl.d Context context, @dl.d AbsVideoView videoView) {
        if (PatchProxy.proxy(new Object[]{context, videoView}, this, changeQuickRedirect, false, 46384, new Class[]{Context.class, AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(videoView, "videoView");
        o().f110158o.setVisibility(0);
        p().f110549y.setVisibility(0);
        t(context, videoView);
        r(context, videoView);
    }

    @dl.d
    public final l<Boolean, b2> n() {
        return this.f93702a;
    }

    @dl.d
    public final ed0 o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46370, new Class[0], ed0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ed0) patchProxyResultProxy.result;
        }
        ed0 ed0Var = this.f93706e;
        if (ed0Var != null) {
            return ed0Var;
        }
        f0.S("menuBinding");
        return null;
    }

    @dl.d
    public final fd0 p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46372, new Class[0], fd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fd0) patchProxyResultProxy.result;
        }
        fd0 fd0Var = this.f93707f;
        if (fd0Var != null) {
            return fd0Var;
        }
        f0.S("menuVerticalBinding");
        return null;
    }

    @dl.d
    public final l<io.reactivex.disposables.b, b2> q() {
        return this.f93703b;
    }

    public final void u(@dl.e PopupWindow popupWindow) {
        if (PatchProxy.proxy(new Object[]{popupWindow}, this, changeQuickRedirect, false, 46378, new Class[]{PopupWindow.class}, Void.TYPE).isSupported) {
            return;
        }
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    public final void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46390, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g();
        h();
        i();
        f();
    }

    public final void w(@dl.d l<? super Boolean, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 46368, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f93702a = lVar;
    }

    public final void x(@dl.d ed0 ed0Var) {
        if (PatchProxy.proxy(new Object[]{ed0Var}, this, changeQuickRedirect, false, 46371, new Class[]{ed0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ed0Var, "<set-?>");
        this.f93706e = ed0Var;
    }

    public final void y(@dl.d fd0 fd0Var) {
        if (PatchProxy.proxy(new Object[]{fd0Var}, this, changeQuickRedirect, false, 46373, new Class[]{fd0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fd0Var, "<set-?>");
        this.f93707f = fd0Var;
    }

    public final void z(@dl.d l<? super io.reactivex.disposables.b, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 46369, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f93703b = lVar;
    }
}
