package com.max.xiaoheihe.module.account;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.SearchView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.CheckVersionObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.account.manageraccount.ManagerAccountListActivity;
import com.max.xiaoheihe.utils.AppUpdateManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import com.xiaomi.mipush.sdk.Constants;
import df.a2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131153e4})
public class SettingActivity extends BaseActivity implements View.OnClickListener {
    private static final String V = "https://cdn.max-c.com/app/heybox/heybox-release.apk";
    public static ChangeQuickRedirect changeQuickRedirect;
    private long L;
    private int M;
    private a2 N;
    private m O;
    private SearchView P;
    private com.max.hbcommon.component.i Q;
    private String S;
    private FastTestDemand T;
    private List<String> R = new ArrayList();
    private final BroadcastReceiver U = new BroadcastReceiver() { // from class: com.max.xiaoheihe.module.account.SettingActivity.4
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 24189, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            SettingActivity.e2(SettingActivity.this);
        }
    };

    public enum BranchType {
        web,
        serviceTag,
        fastTestBu,
        fastTestAB;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static BranchType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24208, new Class[]{String.class}, BranchType.class);
            return patchProxyResultProxy.isSupported ? (BranchType) patchProxyResultProxy.result : (BranchType) Enum.valueOf(BranchType.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static BranchType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24207, new Class[0], BranchType[].class);
            return patchProxyResultProxy.isSupported ? (BranchType[]) patchProxyResultProxy.result : (BranchType[]) values().clone();
        }
    }

    public class a extends com.max.hbcommon.network.d<Result<FastTestDemandResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.SettingActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0640a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            RunnableC0640a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24179, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SettingActivity.this.O.getFilter().filter(SettingActivity.this.P.f67174d.getText());
            }
        }

        a() {
        }

        public void onNext(Result<FastTestDemandResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24177, new Class[]{Result.class}, Void.TYPE).isSupported || !SettingActivity.this.isActive() || result == null) {
                return;
            }
            Iterator<FastTestDemand> it = result.getResult().d().iterator();
            while (it.hasNext()) {
                SettingActivity.this.O.f78395b.add(it.next());
            }
            ((BaseActivity) SettingActivity.this).f66601b.runOnUiThread(new RunnableC0640a());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24178, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FastTestDemandResult>) obj);
        }
    }

    public class b implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FastTestDemand f78380a;

        b(FastTestDemand fastTestDemand) {
            this.f78380a = fastTestDemand;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 24181, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            SettingActivity.W1(SettingActivity.this, this.f78380a);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 24180, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            SettingActivity.V1(SettingActivity.this);
            dialog.dismiss();
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<FastTestABTestResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24184, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SettingActivity.this.O.getFilter().filter(SettingActivity.this.P.f67174d.getText());
            }
        }

        c() {
        }

        public void onNext(Result<FastTestABTestResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24182, new Class[]{Result.class}, Void.TYPE).isSupported || !SettingActivity.this.isActive() || result == null) {
                return;
            }
            FastTestABTestResult result2 = result.getResult();
            SettingActivity.this.S = result2.e();
            Iterator<String> it = result2.f().iterator();
            while (it.hasNext()) {
                SettingActivity.this.O.f78395b.add(it.next());
            }
            ((BaseActivity) SettingActivity.this).f66601b.runOnUiThread(new a());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24183, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FastTestABTestResult>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24185, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f("切换实验分组成功");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24186, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78385a;

        static {
            int[] iArr = new int[BranchType.valuesCustom().length];
            f78385a = iArr;
            try {
                iArr[BranchType.web.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78385a[BranchType.serviceTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78385a[BranchType.fastTestBu.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78385a[BranchType.fastTestAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24176, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) SettingActivity.this).f66601b.startActivity(new Intent(((BaseActivity) SettingActivity.this).f66601b, (Class<?>) ManagerAccountListActivity.class));
        }
    }

    public class g implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 24188, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.W0(((BaseActivity) SettingActivity.this).f66601b);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 24187, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class h implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 24191, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable == null || editable.length() <= 0) {
                SettingActivity.this.P.f67176f.setVisibility(8);
            } else {
                SettingActivity.this.P.f67176f.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24190, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            SettingActivity.this.O.getFilter().filter(charSequence.toString());
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24192, new Class[]{View.class}, Void.TYPE).isSupported || SettingActivity.this.P.f67174d.getText() == null) {
                return;
            }
            String string = SettingActivity.this.P.f67174d.getText().toString();
            int i10 = e.f78385a[SettingActivity.this.O.f78396c.ordinal()];
            if (i10 == 1) {
                SettingActivity.i2(SettingActivity.this, string);
            } else if (i10 == 2) {
                SettingActivity.j2(SettingActivity.this, string);
            }
            if (SettingActivity.this.Q != null) {
                SettingActivity.this.Q.dismiss();
            }
        }
    }

    public class j extends com.max.hbcommon.network.d<Result<CheckVersionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        public void onNext(Result<CheckVersionObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24193, new Class[]{Result.class}, Void.TYPE).isSupported || !SettingActivity.this.isActive() || result == null) {
                return;
            }
            CheckVersionObj result2 = result.getResult();
            if (result2.getBeta_test() != null) {
                AppUpdateManager.B((AppCompatActivity) ((BaseActivity) SettingActivity.this).f66601b, result2.getBeta_test());
            } else if ("1".equals(result2.getNeed_update())) {
                AppUpdateManager.v((AppCompatActivity) ((BaseActivity) SettingActivity.this).f66601b, result2);
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(SettingActivity.this.getString(R.string.no_update));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24194, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CheckVersionObj>) obj);
        }
    }

    public class k implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24197, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SettingActivity.this.O.getFilter().filter(SettingActivity.this.P.f67174d.getText());
            }
        }

        k() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@androidx.annotation.p0 Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 24196, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("获取web分支列表失败\n" + exc.getMessage());
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 24195, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                if (SettingActivity.this.isActive() && ITagManager.SUCCESS.equals(jsonObject.get("status").getAsString())) {
                    Iterator<JsonElement> it = jsonObject.getAsJsonObject("result").getAsJsonArray("branchs").iterator();
                    while (it.hasNext()) {
                        SettingActivity.this.O.f78395b.add(it.next().getAsString());
                    }
                    SettingActivity.this.O.f78395b.add("master");
                    ((BaseActivity) SettingActivity.this).f66601b.runOnUiThread(new a());
                }
            } catch (Throwable th2) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("获取web分支列表失败\n" + th2.getMessage());
            }
        }
    }

    public class l implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24200, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SettingActivity.this.O.getFilter().filter(SettingActivity.this.P.f67174d.getText());
            }
        }

        l() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(@androidx.annotation.p0 Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 24199, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("获取servicetag列表失败\n" + exc.getMessage());
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 24198, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                if (SettingActivity.this.isActive() && ITagManager.SUCCESS.equals(jsonObject.get("status").getAsString())) {
                    JsonArray asJsonArray = jsonObject.getAsJsonObject("result").getAsJsonArray("tags");
                    SettingActivity.this.O.f78395b.add("master");
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        SettingActivity.this.O.f78395b.add(it.next().getAsString());
                    }
                    ((BaseActivity) SettingActivity.this).f66601b.runOnUiThread(new a());
                }
            } catch (Throwable th2) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("获取servicetag列表失败\n" + th2.getMessage());
            }
        }
    }

    public class m extends com.max.hbcommon.base.adapter.s<Object> implements Filterable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Object> f78395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BranchType f78396c;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f78398b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f78399c;

            a(String str, Object obj) {
                this.f78398b = str;
                this.f78399c = obj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zA2 = true;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24204, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int i10 = e.f78385a[m.this.f78396c.ordinal()];
                if (i10 == 1) {
                    SettingActivity.i2(SettingActivity.this, this.f78398b);
                } else if (i10 == 2) {
                    SettingActivity.j2(SettingActivity.this, this.f78398b);
                    m.this.notifyDataSetChanged();
                } else if (i10 == 3) {
                    zA2 = SettingActivity.a2(SettingActivity.this, (FastTestDemand) this.f78399c);
                } else if (i10 != 4) {
                    zA2 = false;
                } else {
                    SettingActivity.b2(SettingActivity.this, this.f78398b);
                }
                if (SettingActivity.this.Q == null || !zA2) {
                    return;
                }
                SettingActivity.this.Q.dismiss();
            }
        }

        public class b extends Filter {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 24205, new Class[]{CharSequence.class}, Filter.FilterResults.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Filter.FilterResults) patchProxyResultProxy.result;
                }
                String string = charSequence.toString();
                if (string.isEmpty()) {
                    m mVar = m.this;
                    ((com.max.hbcommon.base.adapter.s) mVar).mDataList = mVar.f78395b;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : m.this.f78395b) {
                        if ((obj instanceof String ? (String) obj : obj instanceof FastTestDemand ? ((FastTestDemand) obj).p() : "").contains(string)) {
                            arrayList.add(obj);
                        }
                    }
                    ((com.max.hbcommon.base.adapter.s) m.this).mDataList = arrayList;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = ((com.max.hbcommon.base.adapter.s) m.this).mDataList;
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (PatchProxy.proxy(new Object[]{charSequence, filterResults}, this, changeQuickRedirect, false, 24206, new Class[]{CharSequence.class, Filter.FilterResults.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((com.max.hbcommon.base.adapter.s) m.this).mDataList = (ArrayList) filterResults.values;
                m.this.notifyDataSetChanged();
            }
        }

        public m(Context context, List<Object> list) {
            super(context, list, R.layout.item_heybox_popup_menu);
            this.f78395b = new ArrayList();
            this.f78396c = BranchType.serviceTag;
            this.f78395b = list;
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24203, new Class[0], Filter.class);
            return patchProxyResultProxy.isSupported ? (Filter) patchProxyResultProxy.result : new b();
        }

        @Override // com.max.hbcommon.base.adapter.s
        public void onBindViewHolder(@androidx.annotation.n0 com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            String strP;
            String str;
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 24202, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            eVar.i(R.id.iv_checked).setVisibility(8);
            TextView textView = (TextView) eVar.i(R.id.tv_desc);
            if (obj instanceof String) {
                String str2 = (String) obj;
                strP = q(str2);
                str = str2;
            } else {
                strP = obj instanceof FastTestDemand ? ((FastTestDemand) obj).p() : "";
                str = strP;
            }
            textView.setText(strP);
            ArrayList arrayList = new ArrayList();
            int i10 = e.f78385a[this.f78396c.ordinal()];
            if (i10 == 1) {
                arrayList.add(com.max.hbcache.c.f(com.max.hbcache.c.f66143q0, "master"));
            } else if (i10 == 2) {
                for (String str3 : com.max.hbcache.c.f(com.max.hbcache.c.f66145r0, "master").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    arrayList.add(str3);
                }
            } else if (i10 == 4 && SettingActivity.this.S != null) {
                arrayList.add(SettingActivity.this.S);
            }
            if (arrayList.contains(str)) {
                textView.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
            } else {
                textView.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_secondary_1_color));
            }
            eVar.itemView.setOnClickListener(new a(str, obj));
        }

        public String q(String str) {
            byte b10 = 1;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24201, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1081267614:
                    b10 = !str.equals("master") ? (byte) -1 : (byte) 0;
                    break;
                case 581910143:
                    if (!str.equals("intranet")) {
                        b10 = -1;
                    }
                    break;
                case 2052125058:
                    b10 = !str.equals("__primary__") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return "自动";
                case 1:
                    return "永远内网";
                case 2:
                    return "永远外网";
                default:
                    return str;
            }
        }
    }

    private void A2(FastTestDemand fastTestDemand) {
        if (PatchProxy.proxy(new Object[]{fastTestDemand}, this, changeQuickRedirect, false, 24158, new Class[]{FastTestDemand.class}, Void.TYPE).isSupported) {
            return;
        }
        new o().c(V0(), fastTestDemand.s(), this);
    }

    private void B2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24162, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = (com.max.hbcommon.utils.c.u(com.max.xiaoheihe.a.f76430g) || !"1".equals(com.max.hbcache.c.j("show_version_code"))) ? "" : ".916";
        this.N.f108316s.setRightDesc(" v" + com.max.xiaoheihe.utils.d.x0() + str);
    }

    private void C2() {
        String username;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24146, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        User userO = com.max.xiaoheihe.utils.i0.o();
        B2();
        this.N.f108307j.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        this.N.f108311n.setVisibility(0);
        this.N.f108321x.setVisibility(0);
        this.N.I.setVisibility(0);
        if (userO.isLoginFlag()) {
            this.N.G.setVisibility(0);
            this.N.f108304g.setVisibility(0);
            this.N.f108308k.setVisibility(0);
            this.N.f108303f.setVisibility(0);
            this.N.R.setVisibility(0);
            this.N.f108315r.setVisibility(0);
            this.N.f108312o.setVisibility(0);
            this.N.f108310m.setVisibility(0);
            String avartar = null;
            if (userO.getAccount_detail() != null) {
                avartar = userO.getAccount_detail().getAvartar();
                username = userO.getAccount_detail().getUsername();
            } else {
                username = null;
            }
            this.N.f108300c.a();
            this.N.f108300c.setAvatar(avartar);
            this.N.f108300c.setDecoration(userO.getAccount_detail().getAvatar_decoration());
            this.N.f108309l.setText(username);
            this.N.f108307j.setText("ID:" + userO.getAccount_detail().getUserid());
            this.N.B.setVisibility(0);
            if (userO.getInvite_info() != null) {
                this.N.C.setVisibility(0);
            } else {
                this.N.C.setVisibility(8);
            }
        } else {
            this.N.G.setVisibility(8);
            this.N.f108304g.setVisibility(8);
            this.N.f108308k.setVisibility(8);
            this.N.f108303f.setVisibility(8);
            this.N.R.setVisibility(8);
            this.N.f108310m.setVisibility(8);
            this.N.f108307j.setText(getString(R.string.not_login));
            this.N.B.setVisibility(8);
            this.N.C.setVisibility(8);
            this.N.f108315r.setVisibility(8);
            this.N.f108312o.setVisibility(8);
        }
        if (com.max.xiaoheihe.utils.d.F0()) {
            this.N.f108316s.setVisibility(8);
        }
        this.N.L.setVisibility(8);
        this.N.P.setVisibility(8);
        this.N.f108319v.setVisibility(8);
    }

    private void D2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24157, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Cb(this.T.l(), str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private boolean E2(FastTestDemand fastTestDemand) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fastTestDemand}, this, changeQuickRedirect, false, 24154, new Class[]{FastTestDemand.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (fastTestDemand.t() != null) {
            H2(fastTestDemand.t());
        }
        if (fastTestDemand.q() != null) {
            G2(fastTestDemand.q());
        }
        this.T = fastTestDemand;
        if (fastTestDemand.r() != null && com.max.xiaoheihe.module.account.utils.c.c(fastTestDemand.r()) == 1) {
            I2();
            return false;
        }
        if (fastTestDemand.s() != null) {
            com.max.xiaoheihe.view.l.D(this.f66601b, "当前需求有测试账号", "是否直接登录测试账号", "登录", "不登录", new b(fastTestDemand));
            return true;
        }
        I2();
        return false;
    }

    private void G2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24160, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.R.clear();
        this.R.add(str);
        com.max.hbcache.c.x(com.max.hbcache.c.f66145r0, str);
        this.N.O.setRightDesc(str);
    }

    private void H2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24159, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.x(com.max.hbcache.c.f66143q0, str);
        this.N.P.setRightDesc(str);
    }

    private void I2() {
        FastTestDemand fastTestDemand;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24155, new Class[0], Void.TYPE).isSupported || (fastTestDemand = this.T) == null) {
            return;
        }
        if (fastTestDemand.l() != null) {
            J2(BranchType.fastTestAB);
        } else {
            com.max.hbutils.utils.c.f("切换测试环境成功");
        }
    }

    private void J2(BranchType branchType) {
        if (PatchProxy.proxy(new Object[]{branchType}, this, changeQuickRedirect, false, 24147, new Class[]{BranchType.class}, Void.TYPE).isSupported) {
            return;
        }
        SearchView searchView = this.P;
        if (searchView != null) {
            searchView.f67174d.setText("");
        }
        this.O.f78395b.clear();
        m mVar = this.O;
        mVar.f78396c = branchType;
        mVar.notifyDataSetChanged();
        K2();
        int i10 = e.f78385a[branchType.ordinal()];
        if (i10 == 1) {
            q2();
            return;
        }
        if (i10 == 2) {
            p2();
        } else if (i10 == 3) {
            o2();
        } else {
            if (i10 != 4) {
                return;
            }
            n2();
        }
    }

    private void K2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24149, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.Q == null) {
            View viewInflate = this.f66602c.inflate(R.layout.layout_branch_select, (ViewGroup) null);
            this.P = (SearchView) viewInflate.findViewById(R.id.v_search);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_use);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
            recyclerView.setAdapter(this.O);
            this.P.f67174d.addTextChangedListener(new h());
            textView.setOnClickListener(new i());
            BranchType branchType = this.O.f78396c;
            textView.setVisibility(branchType == BranchType.web || branchType == BranchType.serviceTag ? 0 : 8);
            this.Q = new com.max.hbcommon.component.i(this.f66601b, viewInflate);
        }
        this.Q.show();
    }

    private void L2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24161, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (String str : com.max.hbcache.c.f(com.max.hbcache.c.f66145r0, "master").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.R.add(str);
        }
    }

    static /* synthetic */ void V1(SettingActivity settingActivity) {
        if (PatchProxy.proxy(new Object[]{settingActivity}, null, changeQuickRedirect, true, 24172, new Class[]{SettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        settingActivity.I2();
    }

    static /* synthetic */ void W1(SettingActivity settingActivity, FastTestDemand fastTestDemand) {
        if (PatchProxy.proxy(new Object[]{settingActivity, fastTestDemand}, null, changeQuickRedirect, true, 24173, new Class[]{SettingActivity.class, FastTestDemand.class}, Void.TYPE).isSupported) {
            return;
        }
        settingActivity.A2(fastTestDemand);
    }

    static /* synthetic */ boolean a2(SettingActivity settingActivity, FastTestDemand fastTestDemand) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{settingActivity, fastTestDemand}, null, changeQuickRedirect, true, 24174, new Class[]{SettingActivity.class, FastTestDemand.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : settingActivity.E2(fastTestDemand);
    }

    static /* synthetic */ void b2(SettingActivity settingActivity, String str) {
        if (PatchProxy.proxy(new Object[]{settingActivity, str}, null, changeQuickRedirect, true, 24175, new Class[]{SettingActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        settingActivity.D2(str);
    }

    static /* synthetic */ void e2(SettingActivity settingActivity) {
        if (PatchProxy.proxy(new Object[]{settingActivity}, null, changeQuickRedirect, true, 24169, new Class[]{SettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        settingActivity.C2();
    }

    static /* synthetic */ void i2(SettingActivity settingActivity, String str) {
        if (PatchProxy.proxy(new Object[]{settingActivity, str}, null, changeQuickRedirect, true, 24170, new Class[]{SettingActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        settingActivity.H2(str);
    }

    static /* synthetic */ void j2(SettingActivity settingActivity, String str) {
        if (PatchProxy.proxy(new Object[]{settingActivity, str}, null, changeQuickRedirect, true, 24171, new Class[]{SettingActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        settingActivity.G2(str);
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24150, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Pb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T5(this.T.l()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24153, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24152, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.f.g(this.f66601b, "https://" + com.max.hbcommon.network.b.d() + "/tag-router/available-tags", new HashMap(), new HashMap(), false, true, new l());
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24151, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.f.g(this.f66601b, "https://" + com.max.hbcommon.network.b.f() + "/app/get_test_web_branch", new HashMap(), new HashMap(), false, true, new k());
    }

    private /* synthetic */ void r2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24168, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        J2(BranchType.web);
    }

    private /* synthetic */ void u2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24167, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        J2(BranchType.serviceTag);
    }

    private /* synthetic */ void v2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24166, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.debug.a.f78923a.d();
        this.N.f108318u.setRightDesc("自动");
        this.N.f108318u.setTitle("当前：自动，点击重置");
    }

    private /* synthetic */ void x2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24165, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        J2(BranchType.fastTestBu);
    }

    private /* synthetic */ void y2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24164, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131181i4);
    }

    private static /* synthetic */ void z2(CompoundButton compoundButton, boolean z10) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24163, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            com.max.hbcache.c.x(com.max.hbcache.c.f66152v, "true");
        } else {
            com.max.hbcache.c.x(com.max.hbcache.c.f66152v, "false");
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24142, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a2 a2VarC = a2.c(getLayoutInflater());
        this.N = a2VarC;
        setContentView(a2VarC.b());
        this.f66616q.setTitle(R.string.setting);
        this.f66616q.P();
        this.f66617r.setVisibility(0);
        this.O = new m(this.f66601b, new ArrayList());
        if (!com.max.xiaoheihe.module.account.accelworld.a.a()) {
            this.N.E.setVisibility(8);
        } else {
            this.N.E.setVisibility(0);
            this.N.E.setOnClickListener(new f());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24144, new Class[]{View.class}, Void.TYPE).isSupported) {
        }
        switch (view.getId()) {
            case R.id.tv_logout_btn /* 2131365239 */:
                com.max.xiaoheihe.view.l.D(this.f66601b, getString(R.string.logout_confirm), "", getString(R.string.confirm), getString(R.string.cancel), new g());
                break;
            case R.id.vg_account_manager /* 2131366203 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131202l4);
                break;
            case R.id.vg_address /* 2131366226 */:
                com.max.xiaoheihe.base.router.b.C(this.f66601b, false).A();
                break;
            case R.id.vg_agreement /* 2131366228 */:
                com.max.xiaoheihe.base.router.b.m0(this.f66601b, "用户协议", lb.a.D1);
                break;
            case R.id.vg_archival_info /* 2131366240 */:
                com.max.xiaoheihe.base.router.b.m0(this.f66601b, "证照信息", lb.a.H1);
                break;
            case R.id.vg_avatar_decor /* 2131366258 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131216n4);
                break;
            case R.id.vg_check_update /* 2131366347 */:
                m2();
                break;
            case R.id.vg_developer_server /* 2131366437 */:
                com.max.xiaoheihe.base.router.b.k0(this.f66601b, lb.a.H4);
                break;
            case R.id.vg_faq /* 2131366495 */:
                com.max.xiaoheihe.base.router.b.m0(this.f66601b, getString(R.string.about_us), lb.a.Z1);
                break;
            case R.id.vg_feedback_suggestions /* 2131366500 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131195k4);
                break;
            case R.id.vg_general_settings /* 2131366579 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131167g4);
                break;
            case R.id.vg_invite /* 2131366646 */:
                com.max.xiaoheihe.base.router.b.k0(this.f66601b, lb.a.f131084z4);
                break;
            case R.id.vg_invite_code /* 2131366647 */:
                com.max.xiaoheihe.base.router.b.u(this.f66601b, com.max.hbcache.c.o("user_account", "ID:" + com.max.xiaoheihe.utils.i0.o().getAccount_detail().getUserid()), com.max.xiaoheihe.utils.i0.o().getInvite_info().getDesc(), null).A();
                break;
            case R.id.vg_logo /* 2131366702 */:
                if (!"1".equals(com.max.hbcache.c.j("show_version_code"))) {
                    if (this.L == 0 || System.currentTimeMillis() - this.L < 300) {
                        this.M++;
                    }
                    this.L = System.currentTimeMillis();
                    if (this.M >= 10) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("已显示第4位版本号");
                        com.max.hbcache.c.z("show_version_code", "1");
                        B2();
                    }
                }
                break;
            case R.id.vg_personal_info /* 2131366861 */:
                com.max.xiaoheihe.base.router.b.m0(this.f66601b, "个人信息收集清单", lb.a.F1);
                break;
            case R.id.vg_privacy /* 2131366905 */:
                com.max.xiaoheihe.base.router.b.m0(this.f66601b, "隐私政策", lb.a.E1);
                break;
            case R.id.vg_privacy_settings /* 2131366907 */:
                if (com.max.xiaoheihe.utils.i0.e(this.f66601b)) {
                    com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131174h4);
                }
                break;
            case R.id.vg_rate /* 2131366965 */:
                try {
                    com.max.xiaoheihe.base.router.b.v(this.f66601b, Uri.parse("market://details?id=" + getPackageName())).A();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case R.id.vg_reset_password /* 2131367001 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131209m4);
                break;
            case R.id.vg_set_push_state /* 2131367063 */:
                if (com.max.xiaoheihe.utils.i0.e(this.f66601b)) {
                    com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131160f4);
                }
                break;
            case R.id.vg_third_party /* 2131367150 */:
                com.max.xiaoheihe.base.router.b.m0(this.f66601b, "第三方信息共享清单", lb.a.G1);
                break;
            case R.id.vg_user_info /* 2131367206 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131223o4);
                break;
            case R.id.vg_user_relations /* 2131367209 */:
                com.max.xiaoheihe.base.router.b.i0(this.f66601b, lb.d.f131188j4);
                break;
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24148, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24145, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        C2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24143, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.f108315r.setOnClickListener(this);
        this.N.f108312o.setOnClickListener(this);
        this.N.K.setOnClickListener(this);
        this.N.f108311n.setOnClickListener(this);
        this.N.N.setOnClickListener(this);
        this.N.A.setOnClickListener(this);
        this.N.I.setOnClickListener(this);
        this.N.J.setOnClickListener(this);
        this.N.f108323z.setOnClickListener(this);
        this.N.f108321x.setOnClickListener(this);
        this.N.H.setOnClickListener(this);
        this.N.f108313p.setOnClickListener(this);
        this.N.F.setOnClickListener(this);
        this.N.Q.setOnClickListener(this);
        this.N.B.setOnClickListener(this);
        this.N.C.setOnClickListener(this);
        this.N.f108308k.setOnClickListener(this);
        this.N.f108316s.setOnClickListener(this);
        this.N.D.b().setOnClickListener(this);
        this.N.f108314q.setOnClickListener(this);
        this.N.f108320w.setOnClickListener(this);
        if (com.max.xiaoheihe.utils.i0.t()) {
            this.N.f108308k.setText("退出游客模式");
            this.N.f108302e.setVisibility(8);
            this.N.f108306i.setVisibility(8);
        } else {
            this.N.R.setOnClickListener(this);
            this.N.f108308k.setText("退出登录");
            this.N.f108302e.setVisibility(0);
            this.N.f108306i.setVisibility(0);
        }
    }
}
