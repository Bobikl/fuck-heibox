package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.TagDetailObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: GameTagDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d1 extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f87275l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f87276m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f87277n = "title";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f87278o = "tags";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f87279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private ArrayList<TagDetailObj> f87280k = new ArrayList<>();

    /* JADX INFO: compiled from: GameTagDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void c() {
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34553, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : d1.f87278o;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34552, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : d1.f87277n;
        }

        @dl.d
        @xh.m
        public final d1 d(@dl.e String str, @dl.e ArrayList<TagDetailObj> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, arrayList}, this, changeQuickRedirect, false, 34554, new Class[]{String.class, ArrayList.class}, d1.class);
            if (patchProxyResultProxy.isSupported) {
                return (d1) patchProxyResultProxy.result;
            }
            d1 d1Var = new d1();
            Bundle bundle = new Bundle();
            bundle.putString(b(), str);
            bundle.putSerializable(a(), arrayList);
            d1Var.setArguments(bundle);
            return d1Var;
        }
    }

    /* JADX INFO: compiled from: GameTagDialogFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34555, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d1.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameTagDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34556, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d1.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameTagDialogFragment.kt */
    public static final class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f87283b = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: GameTagDialogFragment.kt */
    public static final class e extends com.max.hbcommon.base.adapter.s<TagDetailObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(Context context, ArrayList<TagDetailObj> arrayList) {
            super(context, arrayList, R.layout.item_dialog_game_tag);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e TagDetailObj tagDetailObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tagDetailObj}, this, changeQuickRedirect, false, 34557, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TagDetailObj.class}, Void.TYPE).isSupported || tagDetailObj == null) {
                return;
            }
            d1 d1Var = d1.this;
            TextView textView = eVar != null ? (TextView) eVar.i(R.id.tv_tag_name) : null;
            TextView textView2 = eVar != null ? (TextView) eVar.i(R.id.tv_tag_desc) : null;
            View viewI = eVar != null ? eVar.i(R.id.divider) : null;
            if (textView != null) {
                textView.setText(tagDetailObj.getName());
            }
            ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = (int) ViewUtils.S(textView != null ? textView.getPaint() : null, "支持Steam Deck");
            }
            if (textView2 != null) {
                textView2.setText(tagDetailObj.getDesc());
            }
            if (viewI == null) {
                return;
            }
            Integer numValueOf = eVar != null ? Integer.valueOf(eVar.getPosition()) : null;
            ArrayList arrayList = d1Var.f87280k;
            viewI.setVisibility(kotlin.jvm.internal.f0.g(numValueOf, arrayList != null ? Integer.valueOf(arrayList.size() - 1) : null) ? 8 : 0);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, TagDetailObj tagDetailObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tagDetailObj}, this, changeQuickRedirect, false, 34558, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tagDetailObj);
        }
    }

    @dl.d
    public static final String Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34550, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f87275l.b();
    }

    @dl.d
    @xh.m
    public static final d1 Z3(@dl.e String str, @dl.e ArrayList<TagDetailObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, arrayList}, null, changeQuickRedirect, true, 34551, new Class[]{String.class, ArrayList.class}, d1.class);
        return patchProxyResultProxy.isSupported ? (d1) patchProxyResultProxy.result : f87275l.d(str, arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 34548, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f87279j = arguments.getString(f87277n);
            this.f87280k = (ArrayList) arguments.getSerializable(f87278o);
        }
        return inflater.inflate(R.layout.dialog_fragment_game_tag, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 34549, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.tv_dialog_title)).setText(this.f87279j);
        view.findViewById(R.id.iv_dialog_close).setOnClickListener(new b());
        view.findViewById(R.id.vg_dialog_container).setOnClickListener(new c());
        view.findViewById(R.id.vg_dialog_content).setOnClickListener(d.f87283b);
        ArrayList<TagDetailObj> arrayList = this.f87280k;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new e(getContext(), this.f87280k));
    }
}
