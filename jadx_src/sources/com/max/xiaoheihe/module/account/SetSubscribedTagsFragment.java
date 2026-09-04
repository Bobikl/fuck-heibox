package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.news.FavourOptionsResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SetSubscribedTagsFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f78361d = "tag_list";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<BBSTopicObj> f78362b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> f78363c;

    @BindView(R.id.tv_confirm)
    TextView mConfirmTextView;

    @BindView(R.id.vg_container)
    View mContainerView;

    @BindView(R.id.rv_tags)
    RecyclerView mTagsRecyclerView;

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 24128, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            rect.set(0, ViewUtils.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext, 4.0f), 0, 0);
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f78366b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f78367c;

            a(BBSTopicObj bBSTopicObj, ImageView imageView) {
                this.f78366b = bBSTopicObj;
                this.f78367c = imageView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24133, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                BBSTopicObj bBSTopicObj = this.f78366b;
                bBSTopicObj.setChecked(!bBSTopicObj.isChecked());
                b.m(b.this, this.f78366b.isChecked(), this.f78367c);
                SetSubscribedTagsFragment.a4(SetSubscribedTagsFragment.this, true);
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        static /* synthetic */ void m(b bVar, boolean z10, ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{bVar, new Byte(z10 ? (byte) 1 : (byte) 0), imageView}, null, changeQuickRedirect, true, 24132, new Class[]{b.class, Boolean.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            bVar.o(z10, imageView);
        }

        private void o(boolean z10, ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), imageView}, this, changeQuickRedirect, false, 24130, new Class[]{Boolean.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            imageView.setImageDrawable(z10 ? SetSubscribedTagsFragment.this.getResources().getDrawable(R.drawable.common_cb_checked_square_18x18) : SetSubscribedTagsFragment.this.getResources().getDrawable(R.drawable.cb_unchecked_square));
        }

        public void n(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 24129, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            CardView cardView = (CardView) eVar.i(R.id.cv_root);
            int[] iArrQ = com.max.xiaoheihe.module.news.adapter.b.q(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext);
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = iArrQ[0];
            if (i10 != i11) {
                layoutParams.width = i11;
            }
            int i12 = layoutParams.height;
            int i13 = iArrQ[1];
            if (i12 != i13) {
                layoutParams.height = i13;
            }
            com.max.xiaoheihe.module.news.adapter.b.u(eVar, bBSTopicObj);
            ((ImageView) eVar.i(R.id.iv_subscribe)).setVisibility(8);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_checked);
            imageView.setVisibility(0);
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = ViewUtils.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext, 20.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext, 20.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext, 4.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = ViewUtils.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext, 4.0f);
            o(bBSTopicObj.isChecked(), imageView);
            viewB.setOnClickListener(new a(bBSTopicObj, imageView));
            SetSubscribedTagsFragment.this.i4(viewB);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 24131, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, bBSTopicObj);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24135, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (SetSubscribedTagsFragment.this.getParentFragment() instanceof n0) {
                    ((n0) SetSubscribedTagsFragment.this.getParentFragment()).dismiss();
                } else if (SetSubscribedTagsFragment.this.getActivity() instanceof SetSubscribedTagsActivity) {
                    ((SetSubscribedTagsActivity) SetSubscribedTagsFragment.this.getActivity()).finish();
                }
                dialogInterface.dismiss();
            }
        }

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24134, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("");
            StringBuilder sb3 = new StringBuilder("");
            for (BBSTopicObj bBSTopicObj : SetSubscribedTagsFragment.this.f78362b) {
                if (bBSTopicObj.isChecked()) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(bBSTopicObj.getTopic_id());
                } else {
                    if (sb3.length() > 0) {
                        sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb3.append(bBSTopicObj.getTopic_id());
                }
            }
            if (sb2.length() > 0) {
                SetSubscribedTagsFragment.c4(SetSubscribedTagsFragment.this, sb2.toString(), sb3.toString());
                new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext).y(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext.getResources().getString(R.string.set_success)).l(String.format(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext.getResources().getString(R.string.favour_content_desc), "")).u(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext.getResources().getString(R.string.confirm), new a()).F();
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext.getResources().getString(R.string.at_least_one));
            }
        }
    }

    public class d extends com.max.hbcommon.network.d<FavourOptionsResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void a(FavourOptionsResult favourOptionsResult) {
            if (!PatchProxy.proxy(new Object[]{favourOptionsResult}, this, changeQuickRedirect, false, 24136, new Class[]{FavourOptionsResult.class}, Void.TYPE).isSupported && SetSubscribedTagsFragment.this.isActive()) {
                super.onNext(favourOptionsResult);
                SetSubscribedTagsFragment.S3(SetSubscribedTagsFragment.this);
                if (favourOptionsResult == null || favourOptionsResult.getOptions().size() <= 0) {
                    return;
                }
                SetSubscribedTagsFragment.this.f78362b.clear();
                SetSubscribedTagsFragment.this.f78362b.addAll(favourOptionsResult.getOptions());
                for (BBSTopicObj bBSTopicObj : SetSubscribedTagsFragment.this.f78362b) {
                    if (bBSTopicObj.getIs_follow() == 1) {
                        bBSTopicObj.setChecked(true);
                    } else {
                        bBSTopicObj.setChecked(false);
                    }
                }
                SetSubscribedTagsFragment.this.f78363c.notifyDataSetChanged();
                SetSubscribedTagsFragment.a4(SetSubscribedTagsFragment.this, false);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24137, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((FavourOptionsResult) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24138, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C("favour_options_time", System.currentTimeMillis() + "");
            Intent intent = new Intent();
            intent.setAction(lb.a.f131049u);
            if (((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext != null) {
                ((com.max.hbcommon.base.d) SetSubscribedTagsFragment.this).mContext.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24139, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f78373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Rect f78374c = new Rect();

        f() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0061  */
        /* JADX WARN: Code duplicated, block: B:22:0x0065  */
        /* JADX WARN: Code duplicated, block: B:23:0x0069  */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 24140, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                SetSubscribedTagsFragment.h4(view, 0.9f);
            } else if (action == 1) {
                if (this.f78373b) {
                    this.f78373b = false;
                } else {
                    SetSubscribedTagsFragment.h4(view, 1.0f);
                }
            } else if (action == 2) {
                if (this.f78374c.isEmpty()) {
                    view.getDrawingRect(this.f78374c);
                }
                if (!this.f78374c.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    SetSubscribedTagsFragment.h4(view, 1.0f);
                    this.f78373b = true;
                }
            } else if (action == 3) {
                if (this.f78373b) {
                    SetSubscribedTagsFragment.h4(view, 1.0f);
                } else {
                    this.f78373b = false;
                }
            }
            return false;
        }
    }

    static /* synthetic */ void S3(SetSubscribedTagsFragment setSubscribedTagsFragment) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsFragment}, null, changeQuickRedirect, true, 24127, new Class[]{SetSubscribedTagsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsFragment.showContentView();
    }

    static /* synthetic */ void a4(SetSubscribedTagsFragment setSubscribedTagsFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24125, new Class[]{SetSubscribedTagsFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsFragment.g4(z10);
    }

    static /* synthetic */ void c4(SetSubscribedTagsFragment setSubscribedTagsFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{setSubscribedTagsFragment, str, str2}, null, changeQuickRedirect, true, 24126, new Class[]{SetSubscribedTagsFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        setSubscribedTagsFragment.f4(str, str2);
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24121, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ub(null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static SetSubscribedTagsFragment e4(ArrayList<BBSTopicObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 24118, new Class[]{ArrayList.class}, SetSubscribedTagsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (SetSubscribedTagsFragment) patchProxyResultProxy.result;
        }
        SetSubscribedTagsFragment setSubscribedTagsFragment = new SetSubscribedTagsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f78361d, arrayList);
        setSubscribedTagsFragment.setArguments(bundle);
        return setSubscribedTagsFragment;
    }

    private void f4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 24122, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().e2(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new e());
    }

    private void g4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24120, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<BBSTopicObj> it = this.f78362b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().isChecked()) {
                i10++;
            }
        }
        if (i10 <= 0) {
            this.mConfirmTextView.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.color.divider_secondary_2_color));
            this.mConfirmTextView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
            this.mConfirmTextView.setText(this.mContext.getResources().getString(R.string.complete));
            this.mConfirmTextView.setEnabled(false);
            return;
        }
        this.mConfirmTextView.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.color.interactive_color));
        this.mConfirmTextView.setTextColor(this.mContext.getResources().getColor(R.color.white));
        if (z10) {
            this.mConfirmTextView.setText(this.mContext.getResources().getString(R.string.save));
        } else {
            this.mConfirmTextView.setText(String.format(this.mContext.getResources().getString(R.string.chosen_favor_options_format), i10 + ""));
        }
        this.mConfirmTextView.setEnabled(true);
    }

    public static void h4(View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, null, changeQuickRedirect, true, 24124, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public void i4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24123, new Class[]{View.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        view.setOnTouchListener(new f());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24119, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_set_subscribed_tags);
        this.mUnBinder = ButterKnife.f(this, view);
        ArrayList arrayList = getArguments() != null ? (ArrayList) getArguments().getSerializable(f78361d) : null;
        this.f78362b.clear();
        if (arrayList != null) {
            this.f78362b.addAll(arrayList);
        }
        for (BBSTopicObj bBSTopicObj : this.f78362b) {
            if (bBSTopicObj.getIs_follow() == 1) {
                bBSTopicObj.setChecked(true);
            } else {
                bBSTopicObj.setChecked(false);
            }
        }
        RecyclerView recyclerView = this.mTagsRecyclerView;
        Activity activity = this.mContext;
        recyclerView.setLayoutManager(new GridLayoutManager(activity, com.max.xiaoheihe.module.news.adapter.b.r(activity)));
        this.mTagsRecyclerView.setPadding(ViewUtils.f(this.mContext, 12.0f), 0, ViewUtils.f(this.mContext, 4.0f), 0);
        this.mTagsRecyclerView.addItemDecoration(new a());
        b bVar = new b(this.mContext, this.f78362b, R.layout.item_concept_topic);
        this.f78363c = bVar;
        this.mTagsRecyclerView.setAdapter(bVar);
        this.mConfirmTextView.setOnClickListener(new c());
        g4(false);
        if (arrayList == null) {
            showLoading();
            d4();
        }
    }
}
