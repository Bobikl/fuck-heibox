package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.AuthorInfoObj;
import com.max.xiaoheihe.bean.account.BBSInfoObj;
import com.max.xiaoheihe.bean.bbs.ForbidListObj;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import df.eb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ReportReasonFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nReportReasonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportReasonFragment.kt\ncom/max/xiaoheihe/module/bbs/ReportReasonFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,531:1\n215#2,2:532\n262#3,2:534\n*S KotlinDebug\n*F\n+ 1 ReportReasonFragment.kt\ncom/max/xiaoheihe/module/bbs/ReportReasonFragment\n*L\n247#1:532,2\n265#1:534,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ReportReasonFragment extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    public static final String A = "link_id";

    @dl.d
    public static final String B = "comment_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final a f80025u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f80026v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f80027w = "params";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    public static final String f80028x = "report_type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final String f80029y = "object_type";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final String f80030z = "user_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private b f80031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private LinearLayout f80032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private BottomButtonLeftItemView f80033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private View f80034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private EditText f80035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private ProgressBar f80036o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f80038q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private REPORT_TYPE f80040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private eb f80041t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final ArrayList<String> f80037p = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private HashMap<String, String> f80039r = new HashMap<>();

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public enum ObjectType {
        link("link"),
        comment("comment"),
        user("user"),
        message("message");

        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        private final String value;

        ObjectType(String str) {
            this.value = str;
        }

        public static ObjectType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 26785, new Class[]{String.class}, ObjectType.class);
            return (ObjectType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ObjectType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ObjectType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26784, new Class[0], ObjectType[].class);
            return (ObjectType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }

        @dl.d
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public enum REPORT_TYPE {
        normal,
        game;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static REPORT_TYPE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 26787, new Class[]{String.class}, REPORT_TYPE.class);
            return (REPORT_TYPE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(REPORT_TYPE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static REPORT_TYPE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26786, new Class[0], REPORT_TYPE[].class);
            return (REPORT_TYPE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final ReportReasonFragment a(@dl.e b bVar, @dl.d ObjectType objectType, @dl.e String str, @dl.e String str2, @dl.e String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, objectType, str, str2, str3}, this, changeQuickRedirect, false, 26782, new Class[]{b.class, ObjectType.class, String.class, String.class, String.class}, ReportReasonFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ReportReasonFragment) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(objectType, "objectType");
            REPORT_TYPE report_type = REPORT_TYPE.normal;
            HashMap<String, String> map = new HashMap<>();
            map.put("object_type", objectType.getValue());
            map.put("user_id", str);
            map.put("link_id", str2);
            map.put("comment_id", str3);
            b2 b2Var = b2.f124493a;
            return b(bVar, report_type, map);
        }

        @dl.d
        public final ReportReasonFragment b(@dl.e b bVar, @dl.d REPORT_TYPE reportType, @dl.e HashMap<String, String> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, reportType, map}, this, changeQuickRedirect, false, 26783, new Class[]{b.class, REPORT_TYPE.class, HashMap.class}, ReportReasonFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ReportReasonFragment) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(reportType, "reportType");
            ReportReasonFragment reportReasonFragment = new ReportReasonFragment();
            reportReasonFragment.f80031j = bVar;
            Bundle bundle = new Bundle();
            bundle.putSerializable("params", map);
            bundle.putSerializable(ReportReasonFragment.f80028x, reportType);
            reportReasonFragment.setArguments(bundle);
            return reportReasonFragment;
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public interface b {
        void a(@dl.d String str, @dl.e String str2);
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80042a;

        static {
            int[] iArr = new int[REPORT_TYPE.valuesCustom().length];
            try {
                iArr[REPORT_TYPE.game.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f80042a = iArr;
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class d extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80044c;

        d(String str) {
            this.f80044c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26788, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (ReportReasonFragment.this.isActive()) {
                super.onError(e10);
                ReportReasonFragment.c4(ReportReasonFragment.this, true, this.f80044c);
            }
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class e<T1, T2, R> implements kh.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e<T1, T2, R> f80045b = new e<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @dl.d
        public final h a(@dl.d ForbidReasonResult<List<String>> response1, @dl.d Result<AuthorInfoObj> response2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{response1, response2}, this, changeQuickRedirect, false, 26789, new Class[]{ForbidReasonResult.class, Result.class}, h.class);
            if (patchProxyResultProxy.isSupported) {
                return (h) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(response1, "response1");
            kotlin.jvm.internal.f0.p(response2, "response2");
            return new h(response1, response2);
        }

        @Override // kh.c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 26790, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((ForbidReasonResult) obj, (Result) obj2);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class f<T> implements kh.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public final void a(h hVar) {
            AuthorInfoObj result;
            List<String> result2;
            if (!PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 26791, new Class[]{h.class}, Void.TYPE).isSupported && ReportReasonFragment.this.isActive()) {
                ForbidReasonResult<List<String>> forbidReasonResultE = hVar.e();
                if (forbidReasonResultE != null && (result2 = forbidReasonResultE.getResult()) != null) {
                    ReportReasonFragment.Z3(ReportReasonFragment.this, result2);
                }
                Result<AuthorInfoObj> resultF = hVar.f();
                if (resultF == null || (result = resultF.getResult()) == null) {
                    return;
                }
                ReportReasonFragment.b4(ReportReasonFragment.this, result);
            }
        }

        @Override // kh.g
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26792, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((h) obj);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class g<T> implements kh.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public final void a(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26793, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.network.a.a(th2, true);
            if (ReportReasonFragment.this.isActive()) {
                ReportReasonFragment.h4(ReportReasonFragment.this);
            }
        }

        @Override // kh.g
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26794, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Throwable) obj);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private ForbidReasonResult<List<String>> f80048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private Result<AuthorInfoObj> f80049b;

        public h(@dl.e ForbidReasonResult<List<String>> forbidReasonResult, @dl.e Result<AuthorInfoObj> result) {
            this.f80048a = forbidReasonResult;
            this.f80049b = result;
        }

        public static /* synthetic */ h d(h hVar, ForbidReasonResult forbidReasonResult, Result result, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, forbidReasonResult, result, new Integer(i10), obj}, null, changeQuickRedirect, true, 26796, new Class[]{h.class, ForbidReasonResult.class, Result.class, Integer.TYPE, Object.class}, h.class);
            if (patchProxyResultProxy.isSupported) {
                return (h) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                forbidReasonResult = hVar.f80048a;
            }
            if ((i10 & 2) != 0) {
                result = hVar.f80049b;
            }
            return hVar.c(forbidReasonResult, result);
        }

        @dl.e
        public final ForbidReasonResult<List<String>> a() {
            return this.f80048a;
        }

        @dl.e
        public final Result<AuthorInfoObj> b() {
            return this.f80049b;
        }

        @dl.d
        public final h c(@dl.e ForbidReasonResult<List<String>> forbidReasonResult, @dl.e Result<AuthorInfoObj> result) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{forbidReasonResult, result}, this, changeQuickRedirect, false, 26795, new Class[]{ForbidReasonResult.class, Result.class}, h.class);
            return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h(forbidReasonResult, result);
        }

        @dl.e
        public final ForbidReasonResult<List<String>> e() {
            return this.f80048a;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26799, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.f0.g(this.f80048a, hVar.f80048a) && kotlin.jvm.internal.f0.g(this.f80049b, hVar.f80049b);
        }

        @dl.e
        public final Result<AuthorInfoObj> f() {
            return this.f80049b;
        }

        public final void g(@dl.e ForbidReasonResult<List<String>> forbidReasonResult) {
            this.f80048a = forbidReasonResult;
        }

        public final void h(@dl.e Result<AuthorInfoObj> result) {
            this.f80049b = result;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26798, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            ForbidReasonResult<List<String>> forbidReasonResult = this.f80048a;
            int iHashCode = (forbidReasonResult == null ? 0 : forbidReasonResult.hashCode()) * 31;
            Result<AuthorInfoObj> result = this.f80049b;
            return iHashCode + (result != null ? result.hashCode() : 0);
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26797, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "AllThing(reasonList=" + this.f80048a + ", userInfo=" + this.f80049b + ')';
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class i<T, R> implements kh.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i<T, R> f80050b = new i<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public final Result<AuthorInfoObj> a(@dl.d Throwable it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 26800, new Class[]{Throwable.class}, Result.class);
            if (patchProxyResultProxy.isSupported) {
                return (Result) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            Result<AuthorInfoObj> result = new Result<>();
            result.setStatus(ITagManager.SUCCESS);
            return result;
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26801, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((Throwable) obj);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class j extends com.max.hbcommon.network.d<ForbidReasonResult<ForbidListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        public void a(@dl.d ForbidReasonResult<ForbidListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26803, new Class[]{ForbidReasonResult.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (ReportReasonFragment.this.isActive()) {
                super.onNext(result);
                ReportReasonFragment reportReasonFragment = ReportReasonFragment.this;
                ForbidListObj result2 = result.getResult();
                ReportReasonFragment.Z3(reportReasonFragment, result2 != null ? result2.getReasons() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26802, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (ReportReasonFragment.this.isActive()) {
                super.onError(e10);
                ReportReasonFragment.h4(ReportReasonFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26804, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((ForbidReasonResult) obj);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26805, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ReportReasonFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26806, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(ReportReasonFragment.this.f80038q)) {
                com.max.hbutils.utils.c.f("请选择举报原因");
                return;
            }
            b bVar = ReportReasonFragment.this.f80031j;
            if (bVar != null) {
                String str = ReportReasonFragment.this.f80038q;
                kotlin.jvm.internal.f0.m(str);
                EditText editText = ReportReasonFragment.this.f80035n;
                bVar.a(str, String.valueOf(editText != null ? editText.getText() : null));
            }
            ReportReasonFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class m implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BottomButtonLeftItemView f80054b;

        m(BottomButtonLeftItemView bottomButtonLeftItemView) {
            this.f80054b = bottomButtonLeftItemView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26807, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            int i10 = com.max.hbutils.utils.t.f73585f;
            int iF = ViewUtils.f(this.f80054b.getContext(), 20.0f);
            if (i10 == 0) {
                this.f80054b.setPadding(0, 0, 0, iF);
            } else {
                this.f80054b.setPadding(0, 0, 0, (int) Math.max(iF - i10, 0.0d));
            }
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class n extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80056c;

        n(String str) {
            this.f80056c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26808, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (ReportReasonFragment.this.isActive()) {
                super.onError(e10);
                ReportReasonFragment.c4(ReportReasonFragment.this, true, this.f80056c);
            }
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80058c;

        o(String str) {
            this.f80058c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26809, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ReportReasonFragment.c4(ReportReasonFragment.this, true, this.f80058c);
            ReportReasonFragment.a4(ReportReasonFragment.this, this.f80058c);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80060c;

        p(String str) {
            this.f80060c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26810, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ReportReasonFragment.c4(ReportReasonFragment.this, false, this.f80060c);
            ReportReasonFragment.V3(ReportReasonFragment.this, this.f80060c);
        }
    }

    /* JADX INFO: compiled from: ReportReasonFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReportReasonFragment f80062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f80063d;

        q(String str, ReportReasonFragment reportReasonFragment, View view) {
            this.f80061b = str;
            this.f80062c = reportReasonFragment;
            this.f80063d = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26811, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(this.f80061b, this.f80062c.f80038q)) {
                this.f80062c.f80038q = null;
            } else {
                this.f80062c.f80038q = this.f80061b;
            }
            ReportReasonFragment.e4(this.f80062c, this.f80063d);
            ReportReasonFragment.d4(this.f80062c);
        }
    }

    public static final /* synthetic */ void V3(ReportReasonFragment reportReasonFragment, String str) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment, str}, null, changeQuickRedirect, true, 26781, new Class[]{ReportReasonFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.j4(str);
    }

    public static final /* synthetic */ void Z3(ReportReasonFragment reportReasonFragment, List list) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment, list}, null, changeQuickRedirect, true, 26774, new Class[]{ReportReasonFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.p4(list);
    }

    public static final /* synthetic */ void a4(ReportReasonFragment reportReasonFragment, String str) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment, str}, null, changeQuickRedirect, true, 26780, new Class[]{ReportReasonFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.q4(str);
    }

    public static final /* synthetic */ void b4(ReportReasonFragment reportReasonFragment, AuthorInfoObj authorInfoObj) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment, authorInfoObj}, null, changeQuickRedirect, true, 26775, new Class[]{ReportReasonFragment.class, AuthorInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.r4(authorInfoObj);
    }

    public static final /* synthetic */ void c4(ReportReasonFragment reportReasonFragment, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 26777, new Class[]{ReportReasonFragment.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.s4(z10, str);
    }

    public static final /* synthetic */ void d4(ReportReasonFragment reportReasonFragment) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment}, null, changeQuickRedirect, true, 26779, new Class[]{ReportReasonFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.t4();
    }

    public static final /* synthetic */ void e4(ReportReasonFragment reportReasonFragment, View view) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment, view}, null, changeQuickRedirect, true, 26778, new Class[]{ReportReasonFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.v4(view);
    }

    public static final /* synthetic */ void h4(ReportReasonFragment reportReasonFragment) {
        if (PatchProxy.proxy(new Object[]{reportReasonFragment}, null, changeQuickRedirect, true, 26776, new Class[]{ReportReasonFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        reportReasonFragment.y4();
    }

    private final void i4(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 26771, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), 12.0f);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
        textView.setText("填写举报描述");
        textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(textView.getContext(), R.color.text_primary_1_color));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = iF;
        if (linearLayout != null) {
            linearLayout.addView(textView, marginLayoutParams);
        }
        int iF2 = ViewUtils.f(getContext(), 62.0f);
        EditText editText = new EditText(getContext());
        editText.setTextSize(1, 14.0f);
        editText.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
        editText.setHintTextColor(com.max.hbcommon.utils.l.a(R.color.text_secondary_2_color));
        editText.setGravity(48);
        editText.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(editText.getContext(), R.color.divider_secondary_2_color, 5.0f), editText.getContext(), R.color.divider_secondary_1_color, 0.5f));
        editText.setHint("请填写更详细的信息，以提高举报成功率");
        editText.setPadding(ViewUtils.f(editText.getContext(), 10.0f), ViewUtils.f(editText.getContext(), 9.0f), ViewUtils.f(editText.getContext(), 10.0f), ViewUtils.f(editText.getContext(), 9.0f));
        this.f80035n = editText;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, iF2);
        marginLayoutParams2.topMargin = ViewUtils.f(getContext(), 8.0f);
        marginLayoutParams2.bottomMargin = iF;
        marginLayoutParams2.rightMargin = iF;
        marginLayoutParams2.leftMargin = iF;
        if (linearLayout != null) {
            linearLayout.addView(this.f80035n, marginLayoutParams2);
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void j4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26766, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R(str, "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private final void k4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26769, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            BottomButtonLeftItemView bottomButtonLeftItemView = this.f80033l;
            kotlin.jvm.internal.f0.m(bottomButtonLeftItemView);
            bottomButtonLeftItemView.setRightButtonEnabled(true);
            BottomButtonLeftItemView bottomButtonLeftItemView2 = this.f80033l;
            kotlin.jvm.internal.f0.m(bottomButtonLeftItemView2);
            bottomButtonLeftItemView2.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
            return;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView3 = this.f80033l;
        kotlin.jvm.internal.f0.m(bottomButtonLeftItemView3);
        bottomButtonLeftItemView3.setRightButtonEnabled(false);
        BottomButtonLeftItemView bottomButtonLeftItemView4 = this.f80033l;
        kotlin.jvm.internal.f0.m(bottomButtonLeftItemView4);
        bottomButtonLeftItemView4.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.Alpha10GrayGray);
    }

    @SuppressLint({"AutoDispose"})
    private final void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26760, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable(io.reactivex.z.W7(com.max.xiaoheihe.network.i.a().q7(this.f80039r.get("object_type"), this.f80039r.get("link_id"), null).I5(io.reactivex.schedulers.b.d()), com.max.xiaoheihe.network.i.a().q5(this.f80039r.get("user_id"), this.f80039r.get("link_id"), this.f80039r.get("comment_id")).g4(i.f80050b).I5(io.reactivex.schedulers.b.d()), e.f80045b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).E5(new f(), new g()));
    }

    private final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26759, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        REPORT_TYPE report_type = this.f80040s;
        if ((report_type == null ? -1 : c.f80042a[report_type.ordinal()]) == 1) {
            n4();
        } else {
            l4();
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26761, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X1(w4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private final void p4(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26763, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        y4();
        if (list != null) {
            this.f80037p.clear();
            this.f80037p.addAll(list);
        }
        u4(this.f80032k);
    }

    @SuppressLint({"AutoDispose"})
    private final void q4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26767, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L6(str, "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n(str)));
    }

    private final void r4(AuthorInfoObj authorInfoObj) {
        AccountDetailObj author_info;
        if (PatchProxy.proxy(new Object[]{authorInfoObj}, this, changeQuickRedirect, false, 26764, new Class[]{AuthorInfoObj.class}, Void.TYPE).isSupported || (author_info = authorInfoObj.getAuthor_info()) == null) {
            return;
        }
        eb ebVar = this.f80041t;
        if (ebVar == null) {
            kotlin.jvm.internal.f0.S("binding");
            ebVar = null;
        }
        LinearLayout linearLayout = ebVar.f110123k;
        kotlin.jvm.internal.f0.o(linearLayout, "binding.vgBlock");
        linearLayout.setVisibility(0);
        eb ebVar2 = this.f80041t;
        if (ebVar2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            ebVar2 = null;
        }
        com.max.xiaoheihe.accelworld.l.q(ebVar2.f110122j, R.color.background_card_1_color, 5.0f);
        String avartar = author_info.getAvartar();
        eb ebVar3 = this.f80041t;
        if (ebVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            ebVar3 = null;
        }
        com.max.hbimage.b.H(avartar, ebVar3.f110116d);
        eb ebVar4 = this.f80041t;
        if (ebVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            ebVar4 = null;
        }
        ebVar4.f110120h.setText(author_info.getUsername());
        BBSInfoObj bbs_info = author_info.getBbs_info();
        boolean zX = com.max.hbcommon.utils.c.x(bbs_info != null ? bbs_info.getBlocking() : null);
        String userid = author_info.getUserid();
        kotlin.jvm.internal.f0.o(userid, "userid");
        s4(zX, userid);
    }

    private final void s4(boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 26765, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eb ebVar = this.f80041t;
        if (ebVar == null) {
            kotlin.jvm.internal.f0.S("binding");
            ebVar = null;
        }
        TextView textView = ebVar.f110121i;
        if (z10) {
            textView.setText("解除拉黑");
            com.max.xiaoheihe.accelworld.l.q(textView, R.color.divider_primary_1_color, 3.0f);
            textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(textView.getContext(), R.color.text_primary_2_color));
            textView.setOnClickListener(new p(str));
            return;
        }
        textView.setText("拉黑用户");
        Context context = textView.getContext();
        kotlin.jvm.internal.f0.o(context, "context");
        textView.setBackground(ViewUtils.i(com.max.xiaoheihe.accelworld.l.c(3.0f, context), com.max.xiaoheihe.accelworld.l.h(textView.getContext(), R.color.dialog_btn_black_color_day_night), com.max.xiaoheihe.accelworld.l.h(textView.getContext(), R.color.text_primary_1_color)));
        textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(textView.getContext(), R.color.background_layer_2_color));
        textView.setOnClickListener(new o(str));
    }

    private final void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f80038q)) {
            k4(false);
        } else {
            k4(true);
        }
    }

    private final void u4(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 26770, new Class[]{LinearLayout.class}, Void.TYPE).isSupported || linearLayout == null) {
            return;
        }
        Context context = linearLayout.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        linearLayout.removeAllViews();
        int iF = ViewUtils.f(context, 12.0f);
        int iF2 = ViewUtils.f(context, 20.0f);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_tag_cate, (ViewGroup) linearLayout, false);
        kotlin.jvm.internal.f0.o(viewInflate, "inflater.inflate(R.layou…g_cate, container, false)");
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = iF;
        marginLayoutParams.bottomMargin = iF2;
        marginLayoutParams.rightMargin = iF;
        marginLayoutParams.leftMargin = iF;
        viewInflate.setLayoutParams(marginLayoutParams);
        linearLayout.addView(viewInflate);
        v4(viewInflate);
        i4(linearLayout);
    }

    private final void v4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26772, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f80037p)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.tv_title);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fl_tags);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewFindViewById2;
        Context context = textView.getContext();
        int iF = ViewUtils.f(context, 12.0f);
        int iL = ((ViewUtils.L(context) - (iF * 2)) - (ViewUtils.f(context, 8.0f) * 1)) / 2;
        textView.setText("请选择举报原因（必选）");
        textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(context, R.color.text_primary_1_color));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        flexboxLayout.removeAllViews();
        float fH0 = ViewUtils.h0(context, ViewUtils.m(context, 0, ViewUtils.f(context, 30.0f)));
        for (String str : this.f80037p) {
            ExpressionTextView expressionTextView = new ExpressionTextView(context);
            expressionTextView.setPadding(iF, 0, iF, 0);
            expressionTextView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            expressionTextView.setTextColor(kotlin.jvm.internal.f0.g(str, this.f80038q) ? context.getResources().getColor(R.color.text_primary_1_color) : context.getResources().getColor(R.color.text_primary_2_color));
            expressionTextView.setText(str);
            expressionTextView.setMaxLines(2);
            expressionTextView.setEllipsize(TextUtils.TruncateAt.END);
            expressionTextView.setGravity(17);
            if (ViewUtils.S(expressionTextView.getPaint(), str) > (ViewUtils.L(context) - ViewUtils.f(context, 84.0f)) / 2) {
                expressionTextView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
            }
            if (kotlin.jvm.internal.f0.g(str, this.f80038q)) {
                expressionTextView.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.divider_secondary_1_color, fH0), context, R.color.text_primary_1_color, 0.5f));
            } else {
                expressionTextView.setBackground(com.max.hbutils.utils.q.o(context, R.color.divider_secondary_1_color, fH0));
            }
            expressionTextView.setOnClickListener(new q(str, this, view));
            flexboxLayout.addView(expressionTextView, new ViewGroup.LayoutParams(iL, ViewUtils.f(context, 30.0f)));
        }
    }

    private final HashMap<String, String> w4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26762, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry<String, String> entry : this.f80039r.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                map.put(key, value);
            }
        }
        return map;
    }

    private final void y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26757, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ProgressBar progressBar = this.f80036o;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = this.f80033l;
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setVisibility(0);
        }
        View view = this.f80034m;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @dl.e
    public final b o4() {
        return this.f80031j;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 26755, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        eb ebVarD = eb.d(inflater, viewGroup, false);
        kotlin.jvm.internal.f0.o(ebVarD, "inflate(inflater, container, false)");
        this.f80041t = ebVarD;
        if (ebVarD == null) {
            kotlin.jvm.internal.f0.S("binding");
            ebVarD = null;
        }
        return ebVarD.b();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26758, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        m4();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 26756, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        HashMap<String, String> map = (HashMap) (arguments != null ? arguments.getSerializable("params") : null);
        if (map != null) {
            this.f80039r = map;
        }
        Bundle arguments2 = getArguments();
        REPORT_TYPE report_type = (REPORT_TYPE) (arguments2 != null ? arguments2.getSerializable(f80028x) : null);
        if (report_type == null) {
            report_type = REPORT_TYPE.normal;
        }
        this.f80040s = report_type;
        this.f80032k = (LinearLayout) view.findViewById(R.id.ll_container);
        this.f80033l = (BottomButtonLeftItemView) view.findViewById(R.id.bottom_button);
        this.f80034m = view.findViewById(R.id.divider_bottom);
        this.f80036o = (ProgressBar) view.findViewById(R.id.progress);
        view.setOnClickListener(new k());
        BottomButtonLeftItemView bottomButtonLeftItemView = this.f80033l;
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setRightClickListener(new l());
            bottomButtonLeftItemView.post(new m(bottomButtonLeftItemView));
        }
        t4();
    }

    public final void x4(@dl.d b reasonClickListener) {
        if (PatchProxy.proxy(new Object[]{reasonClickListener}, this, changeQuickRedirect, false, 26773, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(reasonClickListener, "reasonClickListener");
        this.f80031j = reasonClickListener;
    }
}
