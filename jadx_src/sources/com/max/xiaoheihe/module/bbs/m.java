package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ForbidHistoryObj;
import com.max.xiaoheihe.bean.bbs.ForbidInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ForbidHistoryFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class m extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f81219j = "user_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ProgressBar f81221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f81222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<ForbidInfoObj> f81223h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<ForbidInfoObj> f81224i;

    /* JADX INFO: compiled from: ForbidHistoryFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26352, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            m.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ForbidHistoryFragment.java */
    public class b extends com.max.hbcommon.base.adapter.s<ForbidInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f81226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f81227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, List list, int i10, boolean z10, Context context2) {
            super(context, list, i10);
            this.f81226b = z10;
            this.f81227c = context2;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, ForbidInfoObj forbidInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, forbidInfoObj}, this, changeQuickRedirect, false, 26353, new Class[]{com.max.hbcommon.base.adapter.s.e.class, ForbidInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_reason);
            TextView textView2 = (TextView) eVar.i(R.id.tv_time);
            String duration = forbidInfoObj.getDuration();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f81226b && !com.max.hbcommon.utils.c.u(forbidInfoObj.getAdmin_id())) {
                spannableStringBuilder.append((CharSequence) Constants.ARRAY_TYPE).append((CharSequence) forbidInfoObj.getAdmin_id()).append((CharSequence) "]");
            }
            spannableStringBuilder.append((CharSequence) String.format(this.f81227c.getResources().getString(R.string.forbid_reason_format), forbidInfoObj.getReason(), duration));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f81227c.getResources().getColor(R.color.badge_bg_color)), spannableStringBuilder.length() - duration.length(), spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
            textView2.setText(forbidInfoObj.getStart_at());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, ForbidInfoObj forbidInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, forbidInfoObj}, this, changeQuickRedirect, false, 26354, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, forbidInfoObj);
        }
    }

    /* JADX INFO: compiled from: ForbidHistoryFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<ForbidHistoryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26355, new Class[]{Throwable.class}, Void.TYPE).isSupported && m.this.isActive()) {
                super.onError(th2);
                m.this.f81221f.setVisibility(8);
            }
        }

        public void onNext(Result<ForbidHistoryObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26356, new Class[]{Result.class}, Void.TYPE).isSupported && m.this.isActive()) {
                super.onNext(result);
                m.this.f81221f.setVisibility(8);
                if (result.getResult() != null && result.getResult().getForbid_records() != null) {
                    m.this.f81223h.clear();
                    m.this.f81223h.addAll(result.getResult().getForbid_records());
                    m.this.f81224i.notifyDataSetChanged();
                }
                if (m.this.f81223h.isEmpty()) {
                    m.this.f81222g.setVisibility(0);
                } else {
                    m.this.f81222g.setVisibility(8);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26357, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ForbidHistoryObj>) obj);
        }
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26351, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y8(this.f81220e).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static m S3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 26347, new Class[]{String.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        mVar.setArguments(bundle);
        return mVar;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 26348, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f81220e = getArguments().getString("user_id");
        }
        return layoutInflater.inflate(R.layout.fragment_forbid_history, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26350, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        R3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 26349, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        this.f81221f = (ProgressBar) view.findViewById(R.id.progress);
        this.f81222g = view.findViewById(R.id.vg_empty);
        Context context = getContext();
        this.f81224i = new b(context, this.f81223h, R.layout.item_forbid_record, com.max.xiaoheihe.utils.i0.o().getPermission() != null && "1".equals(com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_basic_permission()), context);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(context, ViewUtils.f(context, 20.0f), ViewUtils.f(context, 20.0f)).g(false));
        recyclerView.setAdapter(this.f81224i);
    }
}
