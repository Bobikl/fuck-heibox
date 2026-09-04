package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ForbidReasonFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f81414k = "user_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f81415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f81416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ForbidReasonResult<List<String>> f81417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f81418h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<String> f81419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f81420j;

    /* JADX INFO: compiled from: ForbidReasonFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26363, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ForbidReasonFragment.java */
    public class b extends com.max.hbcommon.base.adapter.s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ForbidReasonFragment.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f81423b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f81424c;

            a(int i10, String str) {
                this.f81423b = i10;
                this.f81424c = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26366, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (n.this.f81420j != null) {
                    n.this.f81420j.a(view, this.f81423b, n.this.f81417g, this.f81424c);
                }
                n.this.dismiss();
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 26364, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            int adapterPosition = eVar.getAdapterPosition();
            eVar.p(R.id.tv_reason, str);
            eVar.b().setOnClickListener(new a(adapterPosition, str));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 26365, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: ForbidReasonFragment.java */
    public class c extends com.max.hbcommon.network.d<ForbidReasonResult<List<String>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void a(ForbidReasonResult<List<String>> forbidReasonResult) {
            if (!PatchProxy.proxy(new Object[]{forbidReasonResult}, this, changeQuickRedirect, false, 26368, new Class[]{ForbidReasonResult.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onNext(forbidReasonResult);
                n.this.f81417g = forbidReasonResult;
                n.this.f81415e.setVisibility(8);
                if (forbidReasonResult.getResult() != null) {
                    n.this.f81418h.clear();
                    n.this.f81418h.addAll(forbidReasonResult.getResult());
                    n.this.f81419i.notifyDataSetChanged();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26367, new Class[]{Throwable.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onError(th2);
                n.this.f81415e.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26369, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((ForbidReasonResult) obj);
        }
    }

    /* JADX INFO: compiled from: ForbidReasonFragment.java */
    public interface d {
        void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str);
    }

    @SuppressLint({"AutoDispose"})
    private void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26362, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q7(ReportReasonFragment.ObjectType.user.getValue(), null, this.f81416f).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static n V3(String str, d dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, dVar}, null, changeQuickRedirect, true, 26358, new Class[]{String.class, d.class}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        n nVar = new n();
        nVar.W3(dVar);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        nVar.setArguments(bundle);
        return nVar;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public d U3() {
        return this.f81420j;
    }

    public void W3(d dVar) {
        this.f81420j = dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 26359, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f81416f = getArguments().getString("user_id");
        }
        return layoutInflater.inflate(R.layout.fragment_forbid_reason, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26361, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        T3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 26360, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        this.f81415e = (ProgressBar) view.findViewById(R.id.progress);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_reason);
        this.f81419i = new b(getContext(), this.f81418h, R.layout.item_forbid_reason);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(getContext()));
        recyclerView.setAdapter(this.f81419i);
    }
}
