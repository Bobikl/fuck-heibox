package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class FriendsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FriendsFragment f77821b;

    @i1
    public FriendsFragment_ViewBinding(FriendsFragment friendsFragment, View view) {
        this.f77821b = friendsFragment;
        friendsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        friendsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        friendsFragment.rv_empty_view = butterknife.internal.f.e(view, R.id.rv_empty_view, "field 'rv_empty_view'");
        friendsFragment.mSearchHeader = butterknife.internal.f.e(view, R.id.vg_search_header, "field 'mSearchHeader'");
        friendsFragment.mSearchEditText = (EditText) butterknife.internal.f.f(view, R.id.et_search, "field 'mSearchEditText'", EditText.class);
        friendsFragment.ivDel = (ImageView) butterknife.internal.f.f(view, R.id.iv_del, "field 'ivDel'", ImageView.class);
        friendsFragment.vg_search_empty = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_search_empty, "field 'vg_search_empty'", ViewGroup.class);
        friendsFragment.tv_search_empty = (TextView) butterknife.internal.f.f(view, R.id.tv_empty, "field 'tv_search_empty'", TextView.class);
        friendsFragment.rv_chat_room = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_chat_room, "field 'rv_chat_room'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22988, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FriendsFragment friendsFragment = this.f77821b;
        if (friendsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77821b = null;
        friendsFragment.mRefreshLayout = null;
        friendsFragment.mRecyclerView = null;
        friendsFragment.rv_empty_view = null;
        friendsFragment.mSearchHeader = null;
        friendsFragment.mSearchEditText = null;
        friendsFragment.ivDel = null;
        friendsFragment.vg_search_empty = null;
        friendsFragment.tv_search_empty = null;
        friendsFragment.rv_chat_room = null;
    }
}
