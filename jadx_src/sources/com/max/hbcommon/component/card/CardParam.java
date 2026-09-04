package com.max.hbcommon.component.card;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.n;
import bb.c;
import com.max.hbrouter.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import pb.j;
import xh.e;

/* JADX INFO: compiled from: CardParam.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CardParam<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final Context f67405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f67406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f67407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f67409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f67410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f67411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f67412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f67413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f67414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final DISPLAY_MODE f67415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private final List<T> f67416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final View.OnClickListener f67417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    private final STYLE f67418n;

    /* JADX INFO: compiled from: CardParam.kt */
    public enum DISPLAY_MODE {
        LIMIT,
        INF;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<DISPLAY_MODE> getEntries() {
            return $ENTRIES;
        }

        public static DISPLAY_MODE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.d.Am, new Class[]{String.class}, DISPLAY_MODE.class);
            return (DISPLAY_MODE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(DISPLAY_MODE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static DISPLAY_MODE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.d.zm, new Class[0], DISPLAY_MODE[].class);
            return (DISPLAY_MODE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: CardParam.kt */
    public enum STYLE {
        RECOMMEND,
        NORMAL;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<STYLE> getEntries() {
            return $ENTRIES;
        }

        public static STYLE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.d.Cm, new Class[]{String.class}, STYLE.class);
            return (STYLE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(STYLE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static STYLE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.d.Bm, new Class[0], STYLE[].class);
            return (STYLE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: CardParam.kt */
    public static final class a<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final Context f67419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @e
        public int f67420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @e
        public int f67421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @e
        public int f67422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @e
        public int f67423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @e
        public int f67424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @e
        public int f67425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @e
        public int f67426h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @e
        public int f67427i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @e
        public boolean f67428j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @d
        @e
        public DISPLAY_MODE f67429k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @d
        @e
        public List<? extends T> f67430l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @d
        @e
        public View.OnClickListener f67431m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @d
        @e
        public STYLE f67432n;

        public a(@d Context context) {
            f0.p(context, "context");
            this.f67419a = context;
            this.f67432n = STYLE.NORMAL;
            this.f67424f = f(context) - d(context, 24.0f);
            this.f67420b = d(context, 6.0f);
            this.f67421c = 0;
            this.f67426h = context.getResources().getColor(R.color.text_primary_1_color_router);
            this.f67422d = 0;
            this.f67423e = 0;
            this.f67427i = R.drawable.white_2dp;
            this.f67430l = new ArrayList();
            this.f67428j = false;
            this.f67431m = new View.OnClickListener() { // from class: com.max.hbcommon.component.card.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardParam.a.b(this.f67437b, view);
                }
            };
            this.f67429k = DISPLAY_MODE.LIMIT;
            this.f67425g = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(a this$0, View v10) {
            if (PatchProxy.proxy(new Object[]{this$0, v10}, null, changeQuickRedirect, true, c.d.ym, new Class[]{a.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(this$0, "this$0");
            f0.p(v10, "v");
            j jVarL = ob.a.l();
            Context context = this$0.f67419a;
            Object tag = v10.getTag();
            f0.n(tag, "null cannot be cast to non-null type kotlin.String");
            jVarL.j(context, (String) tag);
        }

        @d
        public final CardParam<T> c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.vm, new Class[0], CardParam.class);
            return patchProxyResultProxy.isSupported ? (CardParam) patchProxyResultProxy.result : new CardParam<>(this, null);
        }

        public final int d(@d Context context, float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, c.d.wm, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(context, "context");
            return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        @d
        public final Context e() {
            return this.f67419a;
        }

        public final int f(@d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.d.xm, new Class[]{Context.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(context, "context");
            Object systemService = context.getSystemService("window");
            f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }

        @d
        public final a<T> g(int i10) {
            this.f67427i = i10;
            return this;
        }

        @d
        public final a<T> h(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.d.qm, new Class[]{Float.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67423e = d(this.f67419a, f10);
            return this;
        }

        @d
        public final a<T> i(@d View.OnClickListener listener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, c.d.tm, new Class[]{View.OnClickListener.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(listener, "listener");
            this.f67431m = listener;
            return this;
        }

        @d
        public final a<T> j(@d List<? extends T> data) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, c.d.sm, new Class[]{List.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(data, "data");
            this.f67430l = data;
            return this;
        }

        @d
        public final a<T> k(@d DISPLAY_MODE displayMode) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{displayMode}, this, changeQuickRedirect, false, c.d.lm, new Class[]{DISPLAY_MODE.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(displayMode, "displayMode");
            this.f67429k = displayMode;
            return this;
        }

        @d
        public final a<T> l(boolean z10) {
            if (!z10) {
                this.f67425g = -1;
            }
            this.f67428j = z10;
            return this;
        }

        @d
        public final a<T> m(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.nm, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67420b = d(this.f67419a, i10);
            return this;
        }

        @d
        public final a<T> n(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.rm, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67424f = d(this.f67419a, i10);
            return this;
        }

        @d
        public final a<T> o(@d View.OnClickListener listener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, c.d.mm, new Class[]{View.OnClickListener.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(listener, "listener");
            this.f67431m = listener;
            return this;
        }

        @d
        public final a<T> p(int i10) {
            if (i10 > 0) {
                this.f67425g = i10;
                this.f67428j = true;
            } else {
                this.f67428j = false;
            }
            return this;
        }

        @d
        public final a<T> q(@d STYLE style) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{style}, this, changeQuickRedirect, false, c.d.um, new Class[]{STYLE.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(style, "style");
            this.f67432n = style;
            return this;
        }

        @d
        public final a<T> r(@n int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.km, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67426h = this.f67419a.getResources().getColor(i10);
            return this;
        }

        @d
        public final a<T> s(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.om, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67421c = d(this.f67419a, i10);
            return this;
        }

        @d
        public final a<T> t(float f10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.d.pm, new Class[]{Float.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67422d = d(this.f67419a, f10);
            return this;
        }
    }

    private CardParam(a<T> aVar) {
        this.f67405a = aVar.e();
        this.f67416l = aVar.f67430l;
        this.f67414j = aVar.f67428j;
        this.f67415k = aVar.f67429k;
        this.f67406b = aVar.f67420b;
        this.f67407c = aVar.f67421c;
        this.f67408d = aVar.f67422d;
        this.f67409e = aVar.f67423e;
        this.f67410f = aVar.f67424f;
        this.f67411g = aVar.f67425g;
        this.f67412h = aVar.f67426h;
        this.f67413i = aVar.f67427i;
        this.f67417m = aVar.f67431m;
        this.f67418n = aVar.f67432n;
    }

    public /* synthetic */ CardParam(a aVar, u uVar) {
        this(aVar);
    }

    public final int a() {
        return this.f67413i;
    }

    public final int b() {
        return this.f67409e;
    }

    @d
    public final Context c() {
        return this.f67405a;
    }

    @d
    public final List<T> d() {
        return this.f67416l;
    }

    @d
    public final DISPLAY_MODE e() {
        return this.f67415k;
    }

    public final int f() {
        return this.f67406b;
    }

    public final int g() {
        return this.f67410f;
    }

    @d
    public final View.OnClickListener h() {
        return this.f67417m;
    }

    public final int i() {
        return this.f67411g;
    }

    @d
    public final STYLE j() {
        return this.f67418n;
    }

    public final int k() {
        return this.f67412h;
    }

    public final int l() {
        return this.f67407c;
    }

    public final int m() {
        return this.f67408d;
    }

    public final boolean n(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.jm, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f67416l.get(i10) == null;
    }

    public final boolean o() {
        return this.f67414j;
    }

    public final boolean p() {
        return this.f67411g > 1 || this.f67415k == DISPLAY_MODE.LIMIT;
    }

    public final boolean q(int i10) {
        return this.f67414j && i10 >= this.f67411g;
    }
}
