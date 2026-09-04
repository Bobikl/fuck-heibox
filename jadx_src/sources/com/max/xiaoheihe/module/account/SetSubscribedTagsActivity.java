package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.RecommendSettingsObj;
import com.max.xiaoheihe.bean.news.NewsFavourResultObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.ChannelsNewsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131225p})
public class SetSubscribedTagsActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSTopicObj> L = new ArrayList();
    private List<BBSTopicObj> M = new ArrayList();
    private j N;
    private j O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private LoadingDialog S;
    private ItemTouchHelper T;
    private long U;

    @BindView(R.id.lsh1)
    ListSectionHeader lsh1;

    @BindView(R.id.lsh2)
    ListSectionHeader lsh2;

    @BindView(R.id.rv_selected)
    RecyclerView mSelectedRecyclerView;

    @BindView(R.id.rv_unselected)
    RecyclerView mUnSelectedRecyclerView;

    @BindView(R.id.sb_mode)
    Switch sb_mode;

    @BindView(R.id.sb_rec_switch)
    Switch sb_rec_switch;

    @BindView(R.id.tv_mode_desc)
    TextView tv_mode_desc;

    @BindView(R.id.tv_rec_desc)
    TextView tv_rec_desc;

    @BindView(R.id.tv_rec_switch_desc)
    TextView tv_rec_switch_desc;

    @BindView(R.id.tv_rec_title)
    TextView tv_rec_title;

    @BindView(R.id.vg_rec)
    View vg_rec;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24092, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SetSubscribedTagsActivity.this.sb_mode.performClick();
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<NewsFavourResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24093, new Class[]{Throwable.class}, Void.TYPE).isSupported && SetSubscribedTagsActivity.this.isActive()) {
                super.onError(th2);
                SetSubscribedTagsActivity.M1(SetSubscribedTagsActivity.this);
            }
        }

        public void onNext(Result<NewsFavourResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24094, new Class[]{Result.class}, Void.TYPE).isSupported && SetSubscribedTagsActivity.this.isActive()) {
                if (!com.max.hbcommon.utils.c.u(result.getResult().getAuto_rank())) {
                    SetSubscribedTagsActivity.this.Q = "1".equals(result.getResult().getAuto_rank());
                }
                SetSubscribedTagsActivity.b2(SetSubscribedTagsActivity.this, result.getResult().getRecommend_switch());
                if (result.getResult().getOptions() != null) {
                    SetSubscribedTagsActivity.j2(SetSubscribedTagsActivity.this, result.getResult().getOptions());
                } else {
                    SetSubscribedTagsActivity.k2(SetSubscribedTagsActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24095, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<NewsFavourResultObj>) obj);
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24097, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                SetSubscribedTagsActivity.m2(SetSubscribedTagsActivity.this);
                dialogInterface.dismiss();
            }
        }

        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24096, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                SetSubscribedTagsActivity.this.Q = true;
                new com.max.hbcommon.view.a.f(((BaseActivity) SetSubscribedTagsActivity.this).f66601b).l(com.max.xiaoheihe.utils.d.n0(R.string.auto_sort_tips)).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a()).g(true).F();
            } else {
                SetSubscribedTagsActivity.this.Q = false;
                SetSubscribedTagsActivity setSubscribedTagsActivity = SetSubscribedTagsActivity.this;
                setSubscribedTagsActivity.lsh1.setDescText(setSubscribedTagsActivity.getString(R.string.news_favour_edit_desc));
                SetSubscribedTagsActivity.this.T.attachToRecyclerView(SetSubscribedTagsActivity.this.mSelectedRecyclerView);
            }
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24098, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SetSubscribedTagsActivity.this.R = z10;
            SetSubscribedTagsActivity setSubscribedTagsActivity = SetSubscribedTagsActivity.this;
            setSubscribedTagsActivity.tv_rec_switch_desc.setText(setSubscribedTagsActivity.R ? R.string.has_turn_on : R.string.turn_on);
            SetSubscribedTagsActivity.q2(SetSubscribedTagsActivity.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24099, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SetSubscribedTagsActivity setSubscribedTagsActivity = SetSubscribedTagsActivity.this;
            SetSubscribedTagsActivity.Q1(setSubscribedTagsActivity, true ^ setSubscribedTagsActivity.P);
            SetSubscribedTagsActivity.this.N.notifyDataSetChanged();
            SetSubscribedTagsActivity.this.O.notifyDataSetChanged();
            if (SetSubscribedTagsActivity.this.P) {
                return;
            }
            SetSubscribedTagsActivity.m2(SetSubscribedTagsActivity.this);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<RecommendSettingsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(Result<RecommendSettingsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24100, new Class[]{Result.class}, Void.TYPE).isSupported && SetSubscribedTagsActivity.this.isActive()) {
                super.onNext(result);
                if (result == null || result.getResult() == null) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(SetSubscribedTagsActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ChannelsNewsFragment.O = result.getResult().getNews_list_group();
                ChannelsNewsFragment.P = result.getResult().getNews_list_type();
                ((BaseActivity) SetSubscribedTagsActivity.this).f66601b.sendBroadcast(new Intent(lb.a.K));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24101, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RecommendSettingsObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24102, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            if (SetSubscribedTagsActivity.this.S != null) {
                SetSubscribedTagsActivity.this.S.c();
            }
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24103, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            Intent intent = new Intent();
            intent.setAction(lb.a.f131049u);
            ((BaseActivity) SetSubscribedTagsActivity.this).f66601b.sendBroadcast(intent);
            if (SetSubscribedTagsActivity.this.S != null) {
                SetSubscribedTagsActivity.this.S.c();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24104, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class h extends ItemTouchHelper.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f78354a;

        public h(i iVar) {
            this.f78354a = iVar;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 24108, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setBackgroundDrawable(viewHolder.itemView.getContext().getResources().getDrawable(R.drawable.list_item_bg));
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 24105, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return !SetSubscribedTagsActivity.this.P ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(15, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isItemViewSwipeEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 24106, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f78354a.f(viewHolder, viewHolder2);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(@androidx.annotation.p0 RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 24107, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onSelectedChanged(viewHolder, i10);
            if (i10 != 2 || viewHolder == null) {
                return;
            }
            viewHolder.itemView.setBackgroundDrawable(viewHolder.itemView.getContext().getResources().getDrawable(R.color.background_card_1_color));
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@androidx.annotation.n0 RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    public interface i {
        boolean f(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);
    }

    public class j extends com.max.hbcommon.base.adapter.s<BBSTopicObj> implements i {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f78357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f78358c;

            a(BBSTopicObj bBSTopicObj, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f78357b = bBSTopicObj;
                this.f78358c = eVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24112, new Class[]{View.class}, Void.TYPE).isSupported || "-1".equals(this.f78357b.getTopic_id()) || System.currentTimeMillis() - SetSubscribedTagsActivity.this.U < 500) {
                    return;
                }
                if (!SetSubscribedTagsActivity.this.P) {
                    ((BaseActivity) SetSubscribedTagsActivity.this).f66601b.startActivity(ChannelsDetailActivity.l3(((BaseActivity) SetSubscribedTagsActivity.this).f66601b, null, this.f78357b.getTopic_id(), null, null, null, null, null, null, "news"));
                } else if (!SetSubscribedTagsActivity.this.L.contains(this.f78357b)) {
                    SetSubscribedTagsActivity.this.M.remove(this.f78357b);
                    SetSubscribedTagsActivity.this.L.add(this.f78357b);
                    SetSubscribedTagsActivity.this.O.notifyItemRemoved(this.f78358c.getAdapterPosition());
                    SetSubscribedTagsActivity.this.N.notifyItemInserted(SetSubscribedTagsActivity.this.L.size() - 1);
                } else if (SetSubscribedTagsActivity.this.L.size() <= 1) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("至少保留一个");
                    return;
                } else {
                    SetSubscribedTagsActivity.this.L.remove(this.f78357b);
                    SetSubscribedTagsActivity.this.M.add(this.f78357b);
                    SetSubscribedTagsActivity.this.N.notifyItemRemoved(this.f78358c.getAdapterPosition());
                    SetSubscribedTagsActivity.this.O.notifyItemInserted(SetSubscribedTagsActivity.this.M.size() - 1);
                }
                SetSubscribedTagsActivity.this.U = System.currentTimeMillis();
            }
        }

        public j(List<BBSTopicObj> list) {
            super(((BaseActivity) SetSubscribedTagsActivity.this).f66601b, list, R.layout.item_user_preference);
        }

        @Override // com.max.xiaoheihe.module.account.SetSubscribedTagsActivity.i
        public boolean f(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder, viewHolder2}, this, changeQuickRedirect, false, 24110, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if ("-1".equals(getDataList().get(adapterPosition).getTopic_id()) || "-1".equals(getDataList().get(adapterPosition2).getTopic_id())) {
                return false;
            }
            if (adapterPosition < adapterPosition2) {
                int i10 = adapterPosition;
                while (i10 < adapterPosition2) {
                    int i11 = i10 + 1;
                    Collections.swap(this.mDataList, i10, i11);
                    i10 = i11;
                }
            } else {
                for (int i12 = adapterPosition; i12 > adapterPosition2; i12--) {
                    Collections.swap(this.mDataList, i12, i12 - 1);
                }
            }
            notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 24109, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_option);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            com.max.hbimage.b.e0(bBSTopicObj.getPic_url(), imageView, ViewUtils.o(((BaseActivity) SetSubscribedTagsActivity.this).f66601b, imageView), R.drawable.common_default_placeholder_375x210);
            textView.setText(bBSTopicObj.getName());
            imageView2.setVisibility(SetSubscribedTagsActivity.this.P ? 0 : 8);
            if ("-1".equals(bBSTopicObj.getTopic_id())) {
                imageView2.setVisibility(8);
            }
            if (SetSubscribedTagsActivity.this.L.contains(bBSTopicObj)) {
                imageView2.setImageDrawable(SetSubscribedTagsActivity.this.getResources().getDrawable(R.drawable.ic_edit_dlt));
            } else {
                imageView2.setImageDrawable(SetSubscribedTagsActivity.this.getResources().getDrawable(R.drawable.ic_edit_add));
            }
            viewB.setOnClickListener(new a(bBSTopicObj, eVar));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 24111, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    private void A2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24081, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.P = z10;
        this.f66616q.setAction(getString(z10 ? R.string.save : R.string.edit));
        if (this.P) {
            this.f66616q.O();
        }
        this.lsh1.setDescVisible(this.P);
        this.f66616q.setActionOnClickListener(new e());
    }

    static /* synthetic */ void M1(SetSubscribedTagsActivity setSubscribedTagsActivity) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity}, null, changeQuickRedirect, true, 24085, new Class[]{SetSubscribedTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.C1();
    }

    static /* synthetic */ void Q1(SetSubscribedTagsActivity setSubscribedTagsActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24091, new Class[]{SetSubscribedTagsActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.A2(z10);
    }

    static /* synthetic */ void b2(SetSubscribedTagsActivity setSubscribedTagsActivity, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity, keyDescObj}, null, changeQuickRedirect, true, 24086, new Class[]{SetSubscribedTagsActivity.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.x2(keyDescObj);
    }

    static /* synthetic */ void j2(SetSubscribedTagsActivity setSubscribedTagsActivity, List list) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity, list}, null, changeQuickRedirect, true, 24087, new Class[]{SetSubscribedTagsActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.v2(list);
    }

    static /* synthetic */ void k2(SetSubscribedTagsActivity setSubscribedTagsActivity) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity}, null, changeQuickRedirect, true, 24088, new Class[]{SetSubscribedTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.C1();
    }

    static /* synthetic */ void m2(SetSubscribedTagsActivity setSubscribedTagsActivity) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity}, null, changeQuickRedirect, true, 24089, new Class[]{SetSubscribedTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.y2();
    }

    static /* synthetic */ void q2(SetSubscribedTagsActivity setSubscribedTagsActivity) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsActivity}, null, changeQuickRedirect, true, 24090, new Class[]{SetSubscribedTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsActivity.z2();
    }

    public static Intent r2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 24076, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) SetSubscribedTagsActivity.class);
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24078, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C(ChannelsNewsFragment.F4(), ChannelsNewsFragment.G4(), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void v2(List<BBSTopicCategoryObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24079, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (!com.max.hbcommon.utils.c.w(list)) {
            this.L.clear();
            this.L.addAll(list.get(0).getChildren());
            this.lsh1.setTitleText(list.get(0).getName());
            if (list.size() > 1) {
                this.M.clear();
                this.M.addAll(list.get(1).getChildren());
                this.lsh2.setTitleText(list.get(1).getName());
            }
        }
        this.N.notifyDataSetChanged();
        this.O.notifyDataSetChanged();
        if (this.Q) {
            this.sb_mode.setChecked(false);
        } else {
            this.sb_mode.setChecked(true);
            this.lsh1.setDescText(getString(R.string.news_favour_edit_desc));
            this.T.attachToRecyclerView(this.mSelectedRecyclerView);
        }
        this.sb_mode.setOnCheckedChangeListener(new c());
    }

    private void x2(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 24080, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (keyDescObj == null) {
            this.vg_rec.setVisibility(8);
            return;
        }
        this.vg_rec.setVisibility(0);
        this.tv_rec_title.setText(keyDescObj.getText());
        this.tv_rec_desc.setText(keyDescObj.getDesc());
        boolean zEquals = "1".equals(keyDescObj.getEnabled());
        this.R = zEquals;
        this.sb_rec_switch.setChecked(zEquals);
        this.tv_rec_switch_desc.setText(this.R ? R.string.has_turn_on : R.string.turn_on);
        this.sb_rec_switch.setOnCheckedChangeListener(new d());
    }

    private void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24083, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("");
        StringBuilder sb3 = new StringBuilder("");
        for (BBSTopicObj bBSTopicObj : this.L) {
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(bBSTopicObj.getTopic_id());
        }
        for (BBSTopicObj bBSTopicObj2 : this.M) {
            if (sb3.length() > 0) {
                sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb3.append(bBSTopicObj2.getTopic_id());
        }
        LoadingDialog loadingDialog = this.S;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.S = new LoadingDialog(this.f66601b, getString(R.string.commiting), true).r();
        }
        if (sb2.length() > 0) {
            com.max.xiaoheihe.network.i.a().G4(sb2.toString(), sb3.toString(), this.Q ? "1" : "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new g());
        }
    }

    private void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24082, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O8(this.R ? "1" : "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24077, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_news_favour);
        ButterKnife.a(this);
        this.f66616q.setTitle("头条偏好");
        this.f66616q.P();
        this.f66617r.setVisibility(0);
        A2(false);
        int i10 = 4;
        this.mSelectedRecyclerView.setLayoutManager(new GridLayoutManager(this.f66601b, i10) { // from class: com.max.xiaoheihe.module.account.SetSubscribedTagsActivity.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.mUnSelectedRecyclerView.setLayoutManager(new GridLayoutManager(this.f66601b, i10) { // from class: com.max.xiaoheihe.module.account.SetSubscribedTagsActivity.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.N = new j(this.L);
        this.O = new j(this.M);
        this.mSelectedRecyclerView.setAdapter(this.N);
        this.mUnSelectedRecyclerView.setAdapter(this.O);
        this.tv_mode_desc.setOnClickListener(new a());
        E1();
        this.T = new ItemTouchHelper(new h(this.N));
        u2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24084, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        u2();
    }
}
