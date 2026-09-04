package com.max.hbcommon.analytics;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.entry.common.DataType;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.GeneralSearchReportInfo;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.bean.TimeRangeObj;
import com.max.hbcommon.bean.analytics.AnalyticsEventObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewTimeObj;
import com.max.hbcommon.bean.analytics.GameShowEventObj;
import com.max.hbcommon.bean.analytics.GeneralSearchReportDataWrapper;
import com.max.hbcommon.bean.analytics.PageEventEntity;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PageEventReportObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.network.q;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.analytics.PageEventConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: EventLogManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f66538a = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f66540c = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f66541d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ArrayList<GameShowEventObj> f66542e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ArrayList<GeneralSearchReportInfo> f66543f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static CopyOnWriteArrayList<PageEventObj> f66544g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static BBSLinkViewTimeObj f66545h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f66547j = "duration";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PageEventRepository f66539b = new PageEventRepository();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Map<String, TimeRangeObj> f66546i = new HashMap(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap<String, PageEventConfig> f66548k = null;

    /* JADX INFO: compiled from: EventLogManager.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f66549b;

        a(String str) {
            this.f66549b = str;
        }

        @Override // android.view.View.OnClickListener
        @o
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Ds, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d.a(view.getContext(), this.f66549b);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(view.getContext().getResources().getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: EventLogManager.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f66550b;

        b(String str) {
            this.f66550b = str;
        }

        @Override // android.view.View.OnClickListener
        @o
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Es, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d.a(view.getContext(), this.f66550b);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(view.getContext().getResources().getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: EventLogManager.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RadioGroup f66551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f66552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f66553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f66554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f66555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f66556g;

        c(RadioGroup radioGroup, EditText editText, EditText editText2, String str, String str2, com.max.hbcommon.view.a aVar) {
            this.f66551b = radioGroup;
            this.f66552c = editText;
            this.f66553d = editText2;
            this.f66554e = str;
            this.f66555f = str2;
            this.f66556g = aVar;
        }

        @Override // android.view.View.OnClickListener
        @o
        public void onClick(View view) {
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Fs, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f66551b.getCheckedRadioButtonId() == R.id.rb_type_click) {
                str = "tap";
            } else {
                str = this.f66551b.getCheckedRadioButtonId() == R.id.rb_type_duration ? "duration" : "show";
            }
            d.b(this.f66552c.getText().toString(), str, this.f66553d.getText().toString(), this.f66554e, this.f66555f);
            this.f66556g.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.analytics.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventLogManager.java */
    public class ViewOnClickListenerC0536d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f66557b;

        ViewOnClickListenerC0536d(com.max.hbcommon.view.a aVar) {
            this.f66557b = aVar;
        }

        @Override // android.view.View.OnClickListener
        @o
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Gs, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f66557b.dismiss();
        }
    }

    /* JADX INFO: compiled from: EventLogManager.java */
    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.b.Hs, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("cqtest", "error of report " + th2.toString());
        }
    }

    /* JADX INFO: compiled from: EventLogManager.java */
    public interface f {
        @p0
        String H();

        boolean d2();

        @p0
        PathSrcNode getClickSrc();

        @p0
        String getPageAdditional();

        @p0
        String getPagePath();

        boolean isPageVisited();

        void l1(View view);

        boolean o3();

        void onPageVisitSuccess();

        void setClickSrc(@p0 PathSrcNode pathSrcNode);

        void setPageVisited(boolean z10);

        @p0
        String v3();
    }

    public static boolean A(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.fs, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strS = s(j(view), view);
        String strU = u(view);
        com.max.hbcommon.utils.d.b("zzzzaoptest", "screen==" + strS);
        if (com.max.hbcommon.utils.d.f68238c) {
            View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.dialog_event_log_config, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_screen);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_copy_key);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_view);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_copy_key2);
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_event_id);
            EditText editText2 = (EditText) viewInflate.findViewById(R.id.et_event_desc);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_event_type);
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_confirm);
            TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_cancel);
            textView.setText(strS);
            textView3.setText(strU);
            textView2.setOnClickListener(new a(strS));
            textView4.setOnClickListener(new b(strU));
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(view.getContext());
            fVar.y("").i(viewInflate);
            com.max.hbcommon.view.a aVarD = fVar.d();
            textView5.setOnClickListener(new c(radioGroup, editText, editText2, strS, strU, aVarD));
            textView6.setOnClickListener(new ViewOnClickListenerC0536d(aVarD));
            aVarD.show();
            return false;
        }
        Object objQ = q(view);
        f fVarC = l.f66572a.c();
        if (fVarC != null) {
            fVarC.l1(view);
            if (objQ instanceof g) {
                g gVar = (g) objQ;
                String path = gVar.getPath();
                JsonObject additional = gVar.getAdditional();
                if (com.max.hbcommon.utils.c.u(path)) {
                    fVarC.setClickSrc(null);
                } else {
                    PathSrcNode pathSrcNode = new PathSrcNode();
                    pathSrcNode.setPath(path);
                    pathSrcNode.setAddition(additional);
                    fVarC.setClickSrc(pathSrcNode);
                    com.max.hbcommon.utils.d.b("zzzzgamelibclick", "node" + com.max.hbutils.utils.k.p(pathSrcNode));
                }
            } else {
                fVarC.setClickSrc(null);
            }
        }
        com.max.hbcommon.utils.d.b("zzzzaoptest", "v path=" + u(view));
        return true;
    }

    public static void B() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.ts, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f66540c = UUID.randomUUID().toString();
    }

    public static void C(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.b.ws, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        pageEventObj.setPath(lb.d.f131127b);
        pageEventObj.setType("2");
        pageEventObj.setStay_duration(String.valueOf(j10 / 1000));
        v().add(pageEventObj);
    }

    public static void D() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.zs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f66539b.e();
    }

    public static void E(List<AnalyticsEventObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.b.qs, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.b.k("duration_event_log_list", list);
    }

    public static void F(PageEventEntity pageEventEntity) {
        if (PatchProxy.proxy(new Object[]{pageEventEntity}, null, changeQuickRedirect, true, bb.c.b.ys, new Class[]{PageEventEntity.class}, Void.TYPE).isSupported) {
            return;
        }
        f66539b.g(pageEventEntity);
    }

    public static void G(String str, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{str, viewGroup}, null, changeQuickRedirect, true, bb.c.b.ls, new Class[]{String.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (com.max.hbcommon.utils.c.u(str) || viewGroup == null) {
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof ListView) || (childAt instanceof GridView) || (childAt instanceof RecyclerView)) {
                    childAt.setTag(R.id.auto_track_tag_view_fragment_name, str);
                } else if (childAt instanceof ViewGroup) {
                    G(str, (ViewGroup) childAt);
                } else {
                    childAt.setTag(R.id.auto_track_tag_view_fragment_name, str);
                }
            }
        } catch (Exception e10) {
            try {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static /* synthetic */ void a(Context context, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{context, charSequence}, null, changeQuickRedirect, true, bb.c.b.Bs, new Class[]{Context.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        f(context, charSequence);
    }

    static /* synthetic */ void b(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, bb.c.b.Cs, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        y(str, str2, str3, str4, str5);
    }

    public static void c(PageEventObj pageEventObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{pageEventObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.cs, new Class[]{PageEventObj.class, Boolean.TYPE}, Void.TYPE).isSupported || pageEventObj == null) {
            return;
        }
        if (!"2".equals(pageEventObj.getType()) || com.max.hbutils.utils.n.r(pageEventObj.getStay_duration_ms()) >= 100) {
            if (!"5".equals(pageEventObj.getType()) || com.max.hbutils.utils.n.r(pageEventObj.getTotal_stay_duration_ms()) >= 100) {
                com.max.hbcommon.utils.d.b("zzzzpageevent", "addpageEvent reportEvent:" + new Gson().toJson(pageEventObj));
                if (!z10) {
                    h(Collections.singletonList(pageEventObj));
                    return;
                }
                v().add(pageEventObj);
                if (v().size() >= f66538a) {
                    h(v());
                    v().clear();
                }
            }
        }
    }

    public static void d(String str, String str2, String str3, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, jsonObject}, null, changeQuickRedirect, true, bb.c.b.as, new Class[]{String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        e(str, str2, str3, null, jsonObject, null, true);
    }

    public static void e(String str, String str2, String str3, String str4, JsonObject jsonObject, ArrayList<ArrayList<PathSrcNode>> arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, jsonObject, arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.bs, new Class[]{String.class, String.class, String.class, String.class, JsonObject.class, ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType(str);
        pageEventObj.setPath(str2);
        if (!com.max.hbcommon.utils.c.u(str3)) {
            pageEventObj.setStay_duration(str3);
        }
        if (!com.max.hbcommon.utils.c.u(str4)) {
            pageEventObj.setStay_duration_ms(str4);
        }
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            l lVar = l.f66572a;
            if (!com.max.hbcommon.utils.c.w(lVar.g())) {
                pageEventObj.setSrc(lVar.g());
            }
        } else {
            pageEventObj.setSrc(arrayList);
        }
        c(pageEventObj, z10);
    }

    private static void f(Context context, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{context, charSequence}, null, changeQuickRedirect, true, bb.c.b.es, new Class[]{Context.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        ((ClipboardManager) context.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Label", charSequence));
    }

    public static void g(List<GeneralSearchReportInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.b.us, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        PostEncryptParamsObj postEncryptParamsObjH = com.max.hbcommon.utils.e.h(com.max.hbutils.utils.k.p(new GeneralSearchReportDataWrapper("action_count", list)), true);
        com.max.hbcommon.network.e.a().z(postEncryptParamsObjH.getData(), postEncryptParamsObjH.getSid(), postEncryptParamsObjH.getKey(), postEncryptParamsObjH.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e());
    }

    public static void h(List<PageEventObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.b.rs, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventReportObj pageEventReportObj = new PageEventReportObj();
        pageEventReportObj.setEvents(list);
        com.max.hbcommon.utils.d.b("zzzzaoptest", "dataReportEventlog events ==" + com.max.hbutils.utils.k.p(pageEventReportObj));
        p(com.max.hbutils.utils.k.p(pageEventReportObj), pageEventReportObj.isAppEvent()).g(new com.max.hbcommon.network.p());
    }

    public static Activity i(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.b.os, new Class[]{Context.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    public static Activity j(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.ns, new Class[]{View.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    public static BBSLinkViewTimeObj k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Zr, new Class[0], BBSLinkViewTimeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkViewTimeObj) patchProxyResultProxy.result;
        }
        if (f66545h == null) {
            f66545h = new BBSLinkViewTimeObj();
        }
        return f66545h;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:8:0x002f, B:11:0x0035, B:13:0x003b, B:15:0x0042, B:17:0x0046, B:19:0x004d, B:21:0x0051, B:23:0x0058, B:31:0x0085, B:33:0x008b, B:35:0x00a5, B:46:0x00c0, B:48:0x00c6, B:38:0x00ac, B:40:0x00b2, B:43:0x00b9, B:26:0x007b), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d6, blocks: (B:8:0x002f, B:11:0x0035, B:13:0x003b, B:15:0x0042, B:17:0x0046, B:19:0x004d, B:21:0x0051, B:23:0x0058, B:31:0x0085, B:33:0x008b, B:35:0x00a5, B:46:0x00c0, B:48:0x00c6, B:38:0x00ac, B:40:0x00b2, B:43:0x00b9, B:26:0x007b), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[ADDED_TO_REGION] */
    private static int l(ViewParent viewParent, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewParent, view}, null, changeQuickRedirect, true, bb.c.b.hs, new Class[]{ViewParent.class, View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (viewParent != null) {
            try {
                if (viewParent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    if (viewGroup instanceof RecyclerView) {
                        return ((RecyclerView) viewGroup).getChildAdapterPosition(view);
                    }
                    if (viewGroup instanceof GridView) {
                        return ((GridView) viewGroup).getPositionForView(view);
                    }
                    if (viewGroup instanceof ListView) {
                        return ((ListView) viewGroup).getPositionForView(view);
                    }
                    String strT = t(view);
                    String str = (String) view.getTag(R.id.auto_track_tag_view_fragment_root_view);
                    String str2 = (String) view.getTag(R.id.auto_track_tag_view_dialog_root_view);
                    String canonicalName = view.getClass().getCanonicalName();
                    if (com.max.hbcommon.utils.c.u(str)) {
                        str = !com.max.hbcommon.utils.c.u(str2) ? str2 : canonicalName;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        String str3 = (String) childAt.getTag(R.id.auto_track_tag_view_fragment_root_view);
                        String str4 = (String) childAt.getTag(R.id.auto_track_tag_view_dialog_root_view);
                        if (com.max.hbcommon.utils.c.u(str3)) {
                            if (com.max.hbcommon.utils.c.u(str4)) {
                                if (w(childAt, str)) {
                                    String strT2 = t(childAt);
                                    if (strT == null) {
                                    }
                                    i10++;
                                }
                            } else if (str4.equals(str)) {
                                String strT3 = t(childAt);
                                return strT == null ? i10 : i10;
                                i10++;
                            }
                        } else if (str3.equals(str)) {
                            String strT4 = t(childAt);
                            if ((strT == null && !strT.equals(strT4)) || childAt != view) {
                                i10++;
                            }
                        }
                    }
                    return -1;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return -1;
    }

    public static ArrayList<GameShowEventObj> m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Wr, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        if (f66542e == null) {
            f66542e = new ArrayList<>();
        }
        return f66542e;
    }

    public static ArrayList<GeneralSearchReportInfo> n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Xr, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        if (f66543f == null) {
            f66543f = new ArrayList<>();
        }
        return f66543f;
    }

    public static HashMap<String, PageEventConfig> o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.ps, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        if (f66548k == null) {
            HashMap<String, PageEventConfig> map = new HashMap<>();
            f66548k = map;
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            map.put(lb.d.S, new PageEventConfig(bool, bool2, bool2));
            f66548k.put("/game/recommend", new PageEventConfig(bool2, bool, bool2));
            f66548k.put("/game/recommend_v2", new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131284x2, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.X2, new PageEventConfig(bool, bool2, bool2));
            f66548k.put(lb.d.f131270v2, new PageEventConfig(bool, bool2, bool2));
            f66548k.put(lb.d.V1, new PageEventConfig(bool, bool2, bool2));
            f66548k.put(lb.d.f131172h2, new PageEventConfig(bool, bool, bool2));
            f66548k.put(lb.d.f131246s, new PageEventConfig(bool2, bool, bool2));
            f66548k.put("/home/moment", new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.M, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131164g1, new PageEventConfig(bool, bool2, bool2));
            f66548k.put(lb.d.f131204m, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.J, new PageEventConfig(bool2, bool, bool2));
            f66548k.put("/bbs/list", new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131262u1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131269v1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.K1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131253t, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.U1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131192k1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put("/game/comment_recommend", new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131178i1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131185j1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131276w1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131290y1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.F1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.V2, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.f131145d3, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131173h3, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.G1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put("/home/rank", new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.Q2, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.R2, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131171h1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.Y2, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131138c3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.A0, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.V, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.W, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.X1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.Y1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131144d2, new PageEventConfig(bool2, bool, bool2));
            f66548k.put("/bbs/waterfall", new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131152e3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.D0, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.N0, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.A2, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.D3, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.O0, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.C3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131139c4, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131227p1, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131279w4, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131300z4, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.A4, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.C4, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.G4, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.H4, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.D4, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.f131293y4, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.N4, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.O4, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.T3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.U3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.V3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.Y3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.X3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.Z3, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.f131132b4, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.f131125a4, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.J3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.M3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.S3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.N3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.O3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.Q3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.R3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.P3, new PageEventConfig(bool2, bool, bool2));
            f66548k.put(lb.d.G2, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.f131200l2, new PageEventConfig(bool, bool2, bool));
            f66548k.put(lb.d.f131216n4, new PageEventConfig(bool, bool2, bool));
            f66548k.put(lb.d.f131248s1, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.J1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.A1, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.W3, new PageEventConfig(bool2, bool2, bool2));
            f66548k.put(lb.d.f131189j5, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.f131255t1, new PageEventConfig(bool2, bool2, bool));
            f66548k.put(lb.d.f131247s0, new PageEventConfig(bool2, bool2, bool2));
        }
        return f66548k;
    }

    public static z<Result> p(String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.ss, new Class[]{String.class, Boolean.TYPE}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        boolean z11 = System.currentTimeMillis() - f66541d > 300000;
        if (com.max.hbcommon.utils.c.u(f66540c) || z11) {
            B();
        }
        if (!z10) {
            f66541d = System.currentTimeMillis();
        }
        PostEncryptParamsObj postEncryptParamsObjH = com.max.hbcommon.utils.e.h(str, true);
        return com.max.hbcommon.network.e.a().T7("104", postEncryptParamsObjH.getData(), postEncryptParamsObjH.getKey(), postEncryptParamsObjH.getSid(), postEncryptParamsObjH.getTime(), f66540c).I5(io.reactivex.schedulers.b.d());
    }

    public static Object q(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.ds, new Class[]{View.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object tag = view.getTag();
        for (ViewParent parent = view.getParent(); !(tag instanceof g) && (parent instanceof ViewGroup); parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getId() == R.id.multi_status_view_container) {
                break;
            }
            tag = viewGroup.getTag();
        }
        return tag;
    }

    public static String r(Class cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.b.As, new Class[]{Class.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        m mVar = (m) cls.getAnnotation(m.class);
        String strPath = mVar != null ? mVar.path() : null;
        com.max.hbcommon.utils.d.b("zzzzannotation", "path =" + strPath);
        return strPath;
    }

    public static String s(Activity activity, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, view}, null, changeQuickRedirect, true, bb.c.b.ms, new Class[]{Activity.class, View.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (view != null) {
            try {
                String str = (String) view.getTag(R.id.auto_track_tag_view_fragment_name);
                for (ViewParent parent = view.getParent(); com.max.hbcommon.utils.c.u(str) && (parent instanceof ViewGroup); parent = parent.getParent()) {
                    str = (String) ((View) parent).getTag(R.id.auto_track_tag_view_fragment_name);
                }
                String canonicalName = activity != null ? activity.getClass().getCanonicalName() : null;
                if (!com.max.hbcommon.utils.c.u(str) && !com.max.hbcommon.utils.c.u(canonicalName)) {
                    return String.format(Locale.CHINA, "%s|%s", canonicalName, str);
                }
                if (!com.max.hbcommon.utils.c.u(str)) {
                    return str;
                }
                if (!com.max.hbcommon.utils.c.u(canonicalName)) {
                    return canonicalName;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static String t(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.is, new Class[]{View.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            if (view.getId() != -1) {
                return view.getContext().getResources().getResourceEntryName(view.getId());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String u(View view) {
        ViewParent parent;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.gs, new Class[]{View.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (view == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            do {
                parent = view.getParent();
                int iL = l(parent, view);
                if (view.getId() != -1 && "android".equals(view.getContext().getResources().getResourcePackageName(view.getId()))) {
                    break;
                }
                String str = (String) view.getTag(R.id.auto_track_tag_view_fragment_root_view);
                String str2 = (String) view.getTag(R.id.auto_track_tag_view_dialog_root_view);
                if (!(parent instanceof FrameLayout) || ((View) parent).getId() != R.id.multi_status_view_container) {
                    if (!com.max.hbcommon.utils.c.u(str)) {
                        arrayList.add(str + Constants.ARRAY_TYPE + iL + "]");
                    } else if (com.max.hbcommon.utils.c.u(str2)) {
                        arrayList.add(view.getClass().getSimpleName() + Constants.ARRAY_TYPE + iL + "]");
                    } else {
                        arrayList.add(str2 + Constants.ARRAY_TYPE + iL + "]");
                    }
                }
                if (parent instanceof ViewGroup) {
                    view = (ViewGroup) parent;
                }
            } while (parent instanceof ViewGroup);
            Collections.reverse(arrayList);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                sb2.append((String) arrayList.get(i10));
                if (i10 != arrayList.size() - 1) {
                    sb2.append("/");
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static CopyOnWriteArrayList<PageEventObj> v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Yr, new Class[0], CopyOnWriteArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (CopyOnWriteArrayList) patchProxyResultProxy.result;
        }
        if (f66544g == null) {
            f66544g = new CopyOnWriteArrayList<>();
        }
        return f66544g;
    }

    public static boolean w(Object obj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, str}, null, changeQuickRedirect, true, bb.c.b.js, new Class[]{Object.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (Class<?> superclass = obj.getClass(); superclass.getCanonicalName() != null; superclass = superclass.getSuperclass()) {
            if (superclass.getCanonicalName().equals(str)) {
                return true;
            }
            if (superclass == Object.class) {
                break;
            }
        }
        return false;
    }

    public static boolean x(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.xs, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            if (str.equals(str2)) {
                return true;
            }
            String[] strArrSplit = str.split("/");
            String[] strArrSplit2 = str2.split("/");
            if (strArrSplit.length == strArrSplit2.length) {
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    if (!strArrSplit[i10].equals(strArrSplit2[i10])) {
                        String str3 = strArrSplit[i10];
                        String strSubstring = str3.substring(0, str3.indexOf(Constants.ARRAY_TYPE));
                        String str4 = strArrSplit2[i10];
                        if (!strSubstring.equals(str4.substring(0, str4.indexOf(Constants.ARRAY_TYPE)))) {
                            return false;
                        }
                        String str5 = strArrSplit[i10];
                        String strSubstring2 = str5.substring(str5.indexOf(Constants.ARRAY_TYPE) + 1, strArrSplit[i10].indexOf("]"));
                        String str6 = strArrSplit2[i10];
                        String strSubstring3 = str6.substring(str6.indexOf(Constants.ARRAY_TYPE) + 1, strArrSplit2[i10].indexOf("]"));
                        if (!strSubstring2.equals(strSubstring3) && !strSubstring2.contains(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER) && !strSubstring3.contains(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void y(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, bb.c.b.vs, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.network.e.a().G3(str, str2, str3, str4, str5).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q());
    }

    public static void z(Object obj, View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{obj, view, bundle}, null, changeQuickRedirect, true, bb.c.b.ks, new Class[]{Object.class, View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (obj instanceof Fragment) {
                if (!(obj instanceof com.max.hbcommon.base.d) || ((com.max.hbcommon.base.d) obj).isScreenFragment()) {
                    Fragment fragment = (Fragment) obj;
                    String name = fragment.getClass().getName();
                    if ((obj instanceof com.max.hbcommon.base.d) && !com.max.hbcommon.utils.c.u(((com.max.hbcommon.base.d) obj).getmScreenAlias())) {
                        name = ((com.max.hbcommon.base.d) obj).getmScreenAlias();
                    }
                    view.setTag(R.id.auto_track_tag_view_fragment_name, name);
                    view.setTag(R.id.auto_track_tag_view_fragment_root_view, fragment.getClass().getSimpleName());
                    if (view instanceof ViewGroup) {
                        G(name, (ViewGroup) view);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
