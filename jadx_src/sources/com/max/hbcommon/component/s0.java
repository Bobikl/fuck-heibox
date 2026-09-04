package com.max.hbcommon.component;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SearchView.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class s0 implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: SearchView.kt */
    public static final class a implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchView f67825b;

        a(SearchView searchView) {
            this.f67825b = searchView;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.d.Xe, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable != null) {
                z10 = editable.length() > 0;
            }
            if (z10) {
                this.f67825b.getIv_title_del().setVisibility(0);
            } else {
                this.f67825b.getIv_title_del().setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.We, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        SearchView searchView = new SearchView(context);
        searchView.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(context, 34.0f)));
        searchView.getEt_search().addTextChangedListener(new a(searchView));
        return searchView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/5d57d2d213af1340d25fed5e58cc55d6.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ve, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = SearchView.class.getSimpleName();
        kotlin.jvm.internal.f0.o(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return "search";
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "searchbar";
    }
}
