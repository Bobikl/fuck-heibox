package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.HeyboxFriendListObj;
import com.max.xiaoheihe.bean.account.UserFriendObj;
import com.max.xiaoheihe.bean.chat.FriendsChatRoomObj;
import com.max.xiaoheihe.bean.chat.RoomListObj;
import com.max.xiaoheihe.module.chat.component.ChatRoomAvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@com.max.hbcommon.analytics.m(path = lb.d.O4)
public class FriendsFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.h f77805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<UserFriendObj> f77806c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<UserFriendObj> f77807d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<FriendsChatRoomObj> f77808e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f77809f = new i(this);

    @BindView(R.id.iv_del)
    ImageView ivDel;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.et_search)
    EditText mSearchEditText;

    @BindView(R.id.vg_search_header)
    View mSearchHeader;

    @BindView(R.id.rv_chat_room)
    RecyclerView rv_chat_room;

    @BindView(R.id.rv_empty_view)
    View rv_empty_view;

    @BindView(R.id.tv_empty)
    TextView tv_search_empty;

    @BindView(R.id.vg_search_empty)
    ViewGroup vg_search_empty;

    public class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@androidx.annotation.n0 RecyclerView recyclerView, int i10) {
            if (!PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 22972, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported && i10 == 1) {
                FriendsFragment.L3(FriendsFragment.this, recyclerView);
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22973, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FriendsFragment.this.mSearchEditText.setText("");
        }
    }

    public class c implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 22974, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            FriendsFragment.this.f77809f.removeCallbacksAndMessages(null);
            Message messageObtainMessage = FriendsFragment.this.f77809f.obtainMessage();
            messageObtainMessage.obj = editable.toString();
            FriendsFragment.this.f77809f.sendMessageDelayed(messageObtainMessage, 100L);
            if (editable.length() > 0) {
                FriendsFragment.this.ivDel.setVisibility(0);
            } else {
                FriendsFragment.this.ivDel.setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22975, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FriendsFragment.R3(FriendsFragment.this);
            if (((com.max.hbcommon.base.d) FriendsFragment.this).mContext instanceof MessageAndFriendsActivity) {
                ((MessageAndFriendsActivity) ((com.max.hbcommon.base.d) FriendsFragment.this).mContext).a2(false);
            }
        }
    }

    public class e extends com.max.hbcommon.base.adapter.s<FriendsChatRoomObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FriendsChatRoomObj f77815b;

            a(FriendsChatRoomObj friendsChatRoomObj) {
                this.f77815b = friendsChatRoomObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22978, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f77815b.getProtocol())) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) FriendsFragment.this).mContext, this.f77815b.getProtocol());
            }
        }

        e(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, FriendsChatRoomObj friendsChatRoomObj) {
            if (PatchProxy.proxy(new Object[]{eVar, friendsChatRoomObj}, this, changeQuickRedirect, false, 22976, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FriendsChatRoomObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
            if (getDataList().size() == 1) {
                layoutParams.width = ViewUtils.L(((com.max.hbcommon.base.d) FriendsFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) FriendsFragment.this).mContext, 24.0f);
            } else {
                layoutParams.width = ViewUtils.L(((com.max.hbcommon.base.d) FriendsFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) FriendsFragment.this).mContext, 75.0f);
            }
            eVar.itemView.setLayoutParams(layoutParams);
            ChatRoomAvatarView chatRoomAvatarView = (ChatRoomAvatarView) eVar.i(R.id.v_chat_room_avatar);
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            chatRoomAvatarView.setData(friendsChatRoomObj);
            textView.setText(friendsChatRoomObj.getUser_desc());
            textView2.setText(friendsChatRoomObj.getChannel_desc());
            eVar.itemView.setOnClickListener(new a(friendsChatRoomObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, FriendsChatRoomObj friendsChatRoomObj) {
            if (PatchProxy.proxy(new Object[]{eVar, friendsChatRoomObj}, this, changeQuickRedirect, false, 22977, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, friendsChatRoomObj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<HeyboxFriendListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22980, new Class[0], Void.TYPE).isSupported && FriendsFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22979, new Class[]{Throwable.class}, Void.TYPE).isSupported && FriendsFragment.this.isActive()) {
                super.onError(th2);
                FriendsFragment.N3(FriendsFragment.this);
                FriendsFragment.this.mRefreshLayout.A(0);
            }
        }

        public void onNext(Result<HeyboxFriendListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22981, new Class[]{Result.class}, Void.TYPE).isSupported && FriendsFragment.this.isActive()) {
                FriendsFragment.this.mRefreshLayout.A(0);
                FriendsFragment.O3(FriendsFragment.this, result.getResult().getList());
                FriendsFragment.P3(FriendsFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22982, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HeyboxFriendListObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<RoomListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22983, new Class[]{Throwable.class}, Void.TYPE).isSupported && FriendsFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<RoomListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22984, new Class[]{Result.class}, Void.TYPE).isSupported && FriendsFragment.this.isActive()) {
                FriendsFragment.Q3(FriendsFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22985, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RoomListObj>) obj);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22986, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.xiaoheihe.module.account.b().show(FriendsFragment.this.getParentFragmentManager(), "addFriend");
        }
    }

    public static class i extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FriendsFragment> f77820a;

        public i(FriendsFragment friendsFragment) {
            this.f77820a = new WeakReference<>(friendsFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 22987, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            FriendsFragment friendsFragment = this.f77820a.get();
            if (friendsFragment != null) {
                friendsFragment.g4((String) message.obj);
            }
        }
    }

    static /* synthetic */ void L3(FriendsFragment friendsFragment, View view) {
        if (PatchProxy.proxy(new Object[]{friendsFragment, view}, null, changeQuickRedirect, true, 22966, new Class[]{FriendsFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        friendsFragment.d4(view);
    }

    static /* synthetic */ void N3(FriendsFragment friendsFragment) {
        if (PatchProxy.proxy(new Object[]{friendsFragment}, null, changeQuickRedirect, true, 22968, new Class[]{FriendsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        friendsFragment.showError();
    }

    static /* synthetic */ void O3(FriendsFragment friendsFragment, List list) {
        if (PatchProxy.proxy(new Object[]{friendsFragment, list}, null, changeQuickRedirect, true, 22969, new Class[]{FriendsFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        friendsFragment.i4(list);
    }

    static /* synthetic */ void P3(FriendsFragment friendsFragment) {
        if (PatchProxy.proxy(new Object[]{friendsFragment}, null, changeQuickRedirect, true, 22970, new Class[]{FriendsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        friendsFragment.showContentView();
    }

    static /* synthetic */ void Q3(FriendsFragment friendsFragment, RoomListObj roomListObj) {
        if (PatchProxy.proxy(new Object[]{friendsFragment, roomListObj}, null, changeQuickRedirect, true, 22971, new Class[]{FriendsFragment.class, RoomListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        friendsFragment.h4(roomListObj);
    }

    static /* synthetic */ void R3(FriendsFragment friendsFragment) {
        if (PatchProxy.proxy(new Object[]{friendsFragment}, null, changeQuickRedirect, true, 22967, new Class[]{FriendsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        friendsFragment.a4();
    }

    private void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22964, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b4();
        c4();
    }

    @SuppressLint({"AutoDispose"})
    private void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22958, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().hb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    @SuppressLint({"AutoDispose"})
    private void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22959, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Na().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void d4(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22965, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22953, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.rv_chat_room.getItemDecorationCount() == 0) {
            this.rv_chat_room.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 12.0f)));
        }
        new PagerSnapHelper().attachToRecyclerView(this.rv_chat_room);
        this.rv_chat_room.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.rv_chat_room.setAdapter(new e(this.mContext, this.f77808e, R.layout.item_friends_chat_room));
    }

    public static FriendsFragment f4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 22951, new Class[]{String.class, String.class}, FriendsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FriendsFragment) patchProxyResultProxy.result;
        }
        FriendsFragment friendsFragment = new FriendsFragment();
        Bundle bundle = new Bundle();
        friendsFragment.setArguments(bundle);
        bundle.putString("msg", str);
        bundle.putString(SendToFriendActivity.R, str2);
        return friendsFragment;
    }

    private void h4(RoomListObj roomListObj) {
        if (PatchProxy.proxy(new Object[]{roomListObj}, this, changeQuickRedirect, false, 22962, new Class[]{RoomListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (roomListObj == null || com.max.hbcommon.utils.c.w(roomListObj.getRooms())) {
            this.rv_chat_room.setVisibility(8);
            return;
        }
        this.rv_chat_room.setVisibility(0);
        this.f77808e.clear();
        this.f77808e.addAll(roomListObj.getRooms());
        this.rv_chat_room.getAdapter().notifyDataSetChanged();
    }

    private void i4(List<UserFriendObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22961, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null) {
            this.f77806c.clear();
            this.f77806c.addAll(list);
            Z3(r());
            this.f77805b.notifyDataSetChanged();
        }
        j4(this.f77806c);
    }

    private void j4(List list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22960, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!list.isEmpty()) {
            this.rv_empty_view.setVisibility(8);
            return;
        }
        this.mRefreshLayout.A(0);
        this.rv_empty_view.setVisibility(0);
        ((TextView) this.rv_empty_view.findViewById(R.id.tv_add_friend)).setOnClickListener(new h());
    }

    public void Z3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22957, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            this.f77807d.clear();
            this.f77807d.addAll(this.f77806c);
        } else {
            this.f77807d.clear();
            for (UserFriendObj userFriendObj : this.f77806c) {
                if (userFriendObj.getNickname() != null) {
                    String nickname = userFriendObj.getNickname();
                    Locale locale = Locale.US;
                    if (nickname.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                        this.f77807d.add(userFriendObj);
                    }
                }
            }
        }
        this.f77805b.notifyDataSetChanged();
        if (com.max.hbcommon.utils.c.w(this.f77805b.getDataList())) {
            this.vg_search_empty.setVisibility(0);
        } else {
            this.vg_search_empty.setVisibility(8);
        }
    }

    public void g4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22956, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Z3(str);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        String str;
        String string;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22952, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_friends);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            String string2 = getArguments().getString("msg");
            string = getArguments().getString(SendToFriendActivity.R);
            str = string2;
        } else {
            str = null;
            string = null;
        }
        this.f77805b = new com.max.xiaoheihe.module.bbs.adapter.h(this.mContext, this.f77807d, true, str, string);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 4.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.addOnScrollListener(new a());
        this.mSearchHeader.setPadding(ViewUtils.f(this.mContext, 12.0f), 0, ViewUtils.f(this.mContext, 12.0f), 0);
        this.mSearchEditText.setHint(getString(R.string.search_friend));
        this.mSearchEditText.setFocusableInTouchMode(true);
        this.ivDel.setOnClickListener(new b());
        this.mRecyclerView.setAdapter(this.f77805b);
        this.mSearchEditText.addTextChangedListener(new c());
        this.mRefreshLayout.i0(true);
        this.mRefreshLayout.b0(false);
        this.mRefreshLayout.S(new d());
        e4();
        this.tv_search_empty.setText(R.string.empty_content);
        showLoading();
        a4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77809f.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22963, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        a4();
    }

    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22955, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.mSearchEditText;
        return editText != null ? editText.getText().toString() : "";
    }
}
