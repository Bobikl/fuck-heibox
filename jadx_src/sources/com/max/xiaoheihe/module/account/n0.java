package com.max.xiaoheihe.module.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: SetSubscribedTagsDialogFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public class n0 extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f79099f = "tag_list";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<BBSTopicObj> f79100e;

    /* JADX INFO: compiled from: SetSubscribedTagsDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24117, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n0.this.dismiss();
        }
    }

    public static n0 N3(ArrayList<BBSTopicObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 24114, new Class[]{ArrayList.class}, n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        n0 n0Var = new n0();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f79099f, arrayList);
        n0Var.setArguments(bundle);
        return n0Var;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 24115, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f79100e = (ArrayList) getArguments().getSerializable(f79099f);
        }
        return layoutInflater.inflate(R.layout.fragment_set_subscribed_tags_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 24116, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            return;
        }
        setCancelable(false);
        ((TextView) view.findViewById(R.id.tv_skip)).setOnClickListener(new a());
        getChildFragmentManager().u().b(R.id.fragment_container, SetSubscribedTagsFragment.e4(this.f79100e)).m();
    }
}
