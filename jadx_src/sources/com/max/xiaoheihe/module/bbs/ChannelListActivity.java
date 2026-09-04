package com.max.xiaoheihe.module.bbs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.SearchView;
import com.max.hbcustomview.recyclerview.UpdateInsetsGridLayoutManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptTopicIndex;
import com.max.xiaoheihe.bean.news.TopicsSearchResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131171h1)
@ig.d(path = {lb.d.f131171h1})
public class ChannelListActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static int f79558x2 = 8;
    EditText L;
    ImageView M;
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> T;
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> U;
    private com.max.hbcommon.base.adapter.u<q> V;
    private int W;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private df.k f79559a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f79560b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f79561c0;
    private final int N = 8;
    private List<q> O = new ArrayList();
    private List<BBSTopicCategoryObj> P = new ArrayList();
    private List<BBSTopicCategoryObj> Q = new ArrayList();
    private List<BBSTopicObj> R = new ArrayList();
    private List<BBSTopicObj> S = new ArrayList();
    private boolean X = false;
    private p Y = new p(this);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f79562p1 = 4;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f79564x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f79565y1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f79563p2 = f79558x2;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25803, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListActivity channelListActivity = ChannelListActivity.this;
            ChannelListActivity.X1(channelListActivity, true ^ channelListActivity.X);
            if (ChannelListActivity.this.X) {
                return;
            }
            ChannelListActivity.Y1(ChannelListActivity.this);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25804, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction(lb.a.E);
            ((BaseActivity) ChannelListActivity.this).f66601b.sendBroadcast(intent);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25805, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<ConceptTopicIndex>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25807, new Class[0], Void.TYPE).isSupported && ChannelListActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25806, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelListActivity.this.isActive()) {
                super.onError(th2);
                ChannelListActivity.a2(ChannelListActivity.this);
            }
        }

        public void onNext(Result<ConceptTopicIndex> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25808, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelListActivity.this.isActive()) {
                super.onNext(result);
                ChannelListActivity.c2(ChannelListActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25809, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConceptTopicIndex>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<TopicsSearchResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79569b;

        d(String str) {
            this.f79569b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25811, new Class[0], Void.TYPE).isSupported && this.f79569b.equals(ChannelListActivity.this.Z) && ChannelListActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25810, new Class[]{Throwable.class}, Void.TYPE).isSupported && this.f79569b.equals(ChannelListActivity.this.Z) && ChannelListActivity.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<TopicsSearchResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25812, new Class[]{Result.class}, Void.TYPE).isSupported && this.f79569b.equals(ChannelListActivity.this.Z) && ChannelListActivity.this.isActive()) {
                super.onNext(result);
                if (result.getResult() != null && result.getResult().getTopics() != null) {
                    ChannelListActivity.this.Q.clear();
                    ChannelListActivity.this.Q.addAll(result.getResult().getTopics());
                }
                ChannelListActivity.h2(ChannelListActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25813, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicsSearchResult>) obj);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f79571b;

        e(BBSTopicObj bBSTopicObj) {
            this.f79571b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25814, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - ChannelListActivity.this.f79561c0 >= 500) {
                if (ChannelListActivity.this.X) {
                    ChannelListActivity.k2(ChannelListActivity.this, this.f79571b);
                } else {
                    com.max.xiaoheihe.module.bbs.utils.b.I(((BaseActivity) ChannelListActivity.this).f66601b, this.f79571b, !com.max.hbcommon.utils.c.u(ChannelListActivity.this.f79560b0) ? "news" : "link");
                }
                ChannelListActivity.this.f79561c0 = System.currentTimeMillis();
            }
        }
    }

    public class f implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25815, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (ChannelListActivity.this.X) {
                return false;
            }
            ChannelListActivity.this.f79559a0.f112329k.performClick();
            return true;
        }
    }

    public class g extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 25801, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.adapter.v.f80640a.d(((BaseActivity) ChannelListActivity.this).f66601b, eVar, bBSTopicObj, true, ChannelListActivity.this.X);
            ChannelListActivity.b2(ChannelListActivity.this, eVar.itemView, bBSTopicObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 25802, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    public class h extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 25816, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            com.max.hbcommon.utils.d.b("zzzzrvanim", "getItemOffsets==" + childAdapterPosition);
            if (childAdapterPosition == -1) {
                childAdapterPosition = recyclerView.getChildViewHolder(view).getOldPosition();
                com.max.hbcommon.utils.d.b("zzzzrvanim", "oldPosition==" + childAdapterPosition);
                if (childAdapterPosition == -1) {
                    return;
                }
            }
            if (childAdapterPosition < 0 || childAdapterPosition >= ChannelListActivity.this.O.size()) {
                return;
            }
            int spanIndex = ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanSizeLookup().getSpanIndex(childAdapterPosition, ChannelListActivity.this.f79562p1) % ChannelListActivity.this.f79562p1;
            rect.left = (ChannelListActivity.this.f79564x1 * spanIndex) / ChannelListActivity.this.f79562p1;
            rect.right = ChannelListActivity.this.f79564x1 - (((spanIndex + 1) * ChannelListActivity.this.f79564x1) / ChannelListActivity.this.f79562p1);
        }
    }

    public class i extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 25817, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.adapter.v.f80640a.c(((BaseActivity) ChannelListActivity.this).f66601b, eVar, bBSTopicObj);
            if (ChannelListActivity.this.X) {
                eVar.i(R.id.vg_checked).setVisibility(0);
                eVar.i(R.id.vg_checked).setBackground(ViewUtils.i(ViewUtils.f(((BaseActivity) ChannelListActivity.this).f66601b, 8.0f), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_end_color)));
            } else {
                eVar.i(R.id.vg_checked).setVisibility(4);
            }
            ChannelListActivity.b2(ChannelListActivity.this, eVar.itemView, bBSTopicObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 25818, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    public class j extends GridLayoutManager.SpanSizeLookup {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f79577a;

        j(GridLayoutManager gridLayoutManager) {
            this.f79577a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25819, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if ("title".equals(((q) ChannelListActivity.this.O.get(i10)).c())) {
                return this.f79577a.getSpanCount();
            }
            return 1;
        }
    }

    public class k extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 25820, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            com.max.hbcommon.utils.d.b("zzzzgetItemOffsets2", "view pos==" + childAdapterPosition);
            if (childAdapterPosition == -1) {
                childAdapterPosition = recyclerView.getChildViewHolder(view).getOldPosition();
                com.max.hbcommon.utils.d.b("zzzzrvanim", "oldPosition==" + childAdapterPosition);
                if (childAdapterPosition == -1) {
                    return;
                }
            }
            if (childAdapterPosition < 0 || childAdapterPosition >= ChannelListActivity.this.O.size() || "title".equals(((q) ChannelListActivity.this.O.get(childAdapterPosition)).c())) {
                return;
            }
            int spanIndex = ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanSizeLookup().getSpanIndex(childAdapterPosition, ChannelListActivity.this.f79562p1) % ChannelListActivity.this.f79562p1;
            rect.left = (ChannelListActivity.this.f79564x1 * spanIndex) / ChannelListActivity.this.f79562p1;
            rect.right = ChannelListActivity.this.f79564x1 - (((spanIndex + 1) * ChannelListActivity.this.f79564x1) / ChannelListActivity.this.f79562p1);
        }
    }

    public class l extends com.max.hbcommon.base.adapter.u<q> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, q qVar) {
            Object[] objArr = {new Integer(i10), qVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25823, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, qVar);
        }

        public int n(int i10, q qVar) {
            Object[] objArr = {new Integer(i10), qVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25821, new Class[]{cls, q.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return q.f79586f.equals(qVar.c()) ? R.layout.item_interest_init_topic : R.layout.item_channel_list_title_item;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, q qVar) {
            if (PatchProxy.proxy(new Object[]{eVar, qVar}, this, changeQuickRedirect, false, 25822, new Class[]{com.max.hbcommon.base.adapter.s.e.class, q.class}, Void.TYPE).isSupported) {
                return;
            }
            if (eVar.d() != R.layout.item_channel_list_title_item) {
                BBSTopicObj bBSTopicObjA = qVar.a();
                com.max.xiaoheihe.module.bbs.adapter.v.f80640a.d(((BaseActivity) ChannelListActivity.this).f66601b, eVar, bBSTopicObjA, false, ChannelListActivity.this.X);
                ChannelListActivity.b2(ChannelListActivity.this, eVar.itemView, bBSTopicObjA);
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            eVar.i(R.id.v_space);
            textView2.setVisibility(8);
            textView.setText(qVar.b());
            int adapterPosition = eVar.getAdapterPosition();
            boolean z10 = adapterPosition == getDataList().size() - 1;
            boolean z11 = adapterPosition < getDataList().size() - 1 && "title".equals(getDataList().get(adapterPosition + 1).c());
            if (z10 || z11) {
                eVar.itemView.getLayoutParams().height = 0;
            } else {
                eVar.itemView.getLayoutParams().height = -2;
            }
            ((ViewGroup.MarginLayoutParams) eVar.itemView.getLayoutParams()).bottomMargin = ViewUtils.f(((BaseActivity) ChannelListActivity.this).f66601b, 5.0f);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = ViewUtils.f(((BaseActivity) ChannelListActivity.this).f66601b, 12.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eVar.itemView.getLayoutParams();
            marginLayoutParams.leftMargin = -ChannelListActivity.this.f79565y1;
            marginLayoutParams.rightMargin = -ChannelListActivity.this.f79565y1;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 25824, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (q) obj);
        }
    }

    public class m implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 25825, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 3) {
                String strR = ChannelListActivity.this.r();
                ChannelListActivity channelListActivity = ChannelListActivity.this;
                ChannelListActivity.R1(channelListActivity, channelListActivity.L);
                if (!com.max.hbcommon.utils.c.u(strR)) {
                    ChannelListActivity channelListActivity2 = ChannelListActivity.this;
                    ChannelListActivity.T1(channelListActivity2, channelListActivity2.r());
                    return true;
                }
            }
            return false;
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25826, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListActivity.this.L.setText("");
        }
    }

    public class o implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 25827, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelListActivity.this.Y.removeCallbacksAndMessages(null);
            Message messageObtainMessage = ChannelListActivity.this.Y.obtainMessage();
            messageObtainMessage.obj = editable.toString();
            ChannelListActivity.this.Y.sendMessageDelayed(messageObtainMessage, 100L);
            if (editable.length() > 0) {
                ChannelListActivity.this.M.setVisibility(0);
                ChannelListActivity.W1(ChannelListActivity.this, true);
            } else {
                ChannelListActivity.this.M.setVisibility(8);
                ChannelListActivity.W1(ChannelListActivity.this, false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static class p extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ChannelListActivity> f79584a;

        public p(ChannelListActivity channelListActivity) {
            this.f79584a = new WeakReference<>(channelListActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 25828, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            ChannelListActivity channelListActivity = this.f79584a.get();
            if (channelListActivity != null) {
                int i10 = message.what;
                channelListActivity.H2((String) message.obj);
            }
        }
    }

    public class q {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f79585e = "title";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f79586f = "item";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f79587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BBSTopicObj f79588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f79589c;

        q() {
        }

        public BBSTopicObj a() {
            return this.f79588b;
        }

        public String b() {
            return this.f79589c;
        }

        public String c() {
            return this.f79587a;
        }

        public void d(BBSTopicObj bBSTopicObj) {
            this.f79588b = bBSTopicObj;
        }

        public void e(String str) {
            this.f79589c = str;
        }

        public boolean equals(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25829, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            q qVar = (q) obj;
            String str = this.f79587a;
            if (str == null ? qVar.f79587a != null : !str.equals(qVar.f79587a)) {
                return false;
            }
            BBSTopicObj bBSTopicObj = this.f79588b;
            if (bBSTopicObj == null ? qVar.f79588b != null : !bBSTopicObj.equals(qVar.f79588b)) {
                return false;
            }
            String str2 = this.f79589c;
            String str3 = qVar.f79589c;
            if (str2 != null) {
                return str2.equals(str3);
            }
            return str3 == null;
        }

        public void f(String str) {
            this.f79587a = str;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25830, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            String str = this.f79587a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            BBSTopicObj bBSTopicObj = this.f79588b;
            int iHashCode2 = (iHashCode + (bBSTopicObj != null ? bBSTopicObj.hashCode() : 0)) * 31;
            String str2 = this.f79589c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    private void A2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25785, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.Z = str;
        O2(str);
    }

    private void B2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25775, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().D4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void C2(List<BBSTopicCategoryObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25773, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.O.clear();
        for (BBSTopicCategoryObj bBSTopicCategoryObj : list) {
            q qVar = new q();
            qVar.f("title");
            qVar.e(bBSTopicCategoryObj.getName());
            this.O.add(qVar);
            for (BBSTopicObj bBSTopicObj : bBSTopicCategoryObj.getChildren()) {
                q qVar2 = new q();
                qVar2.f(q.f79586f);
                qVar2.d(bBSTopicObj);
                if (!this.R.contains(bBSTopicObj)) {
                    this.O.add(qVar2);
                }
            }
        }
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25767, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f66601b);
        linearLayoutManager.setOrientation(0);
        this.f79559a0.f112322d.setLayoutManager(linearLayoutManager);
        ((ViewGroup.MarginLayoutParams) this.f79559a0.f112331m.f117149c.getLayoutParams()).leftMargin = ViewUtils.f(this.f66601b, 12.0f);
        i iVar = new i(this.f66601b, this.S, R.layout.item_channel_list_recommend);
        this.T = iVar;
        this.f79559a0.f112322d.setAdapter(iVar);
    }

    private void E2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UpdateInsetsGridLayoutManager updateInsetsGridLayoutManager = new UpdateInsetsGridLayoutManager(this.f66601b, this.f79562p1);
        updateInsetsGridLayoutManager.setSpanSizeLookup(new j(updateInsetsGridLayoutManager));
        this.f79559a0.f112321c.setLayoutManager(updateInsetsGridLayoutManager);
        RecyclerView recyclerView = this.f79559a0.f112321c;
        int i10 = this.f79565y1;
        recyclerView.setPadding(i10, 0, i10, 0);
        this.f79559a0.f112321c.setClipToPadding(false);
        this.f79559a0.f112321c.setClipChildren(false);
        this.f79559a0.f112321c.addItemDecoration(new k());
        l lVar = new l(this.f66601b, this.O);
        this.V = lVar;
        this.f79559a0.f112321c.setAdapter(lVar);
    }

    private void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25766, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.f79559a0.f112323e;
        int i10 = this.f79565y1;
        recyclerView.setPadding(i10, 0, i10, 0);
        this.f79559a0.f112323e.setLayoutManager(new UpdateInsetsGridLayoutManager(this.f66601b, this.f79562p1));
        this.U = new g(this.f66601b, this.R, R.layout.item_interest_init_topic);
        this.f79559a0.f112323e.addItemDecoration(new h());
        this.f79559a0.f112323e.setClipToPadding(false);
    }

    private void I2(ConceptTopicIndex conceptTopicIndex) {
        if (PatchProxy.proxy(new Object[]{conceptTopicIndex}, this, changeQuickRedirect, false, 25776, new Class[]{ConceptTopicIndex.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.R.clear();
        if (conceptTopicIndex.getSubscribed_topics() != null && !com.max.hbcommon.utils.c.w(conceptTopicIndex.getSubscribed_topics().getChildren())) {
            this.R.addAll(conceptTopicIndex.getSubscribed_topics().getChildren());
        }
        L2();
        this.P.clear();
        this.S.clear();
        if (conceptTopicIndex.getFollow_topic_limit() >= 0) {
            this.f79563p2 = conceptTopicIndex.getFollow_topic_limit();
        }
        if (conceptTopicIndex.getRecommend_for_user_topics() != null && conceptTopicIndex.getRecommend_for_user_topics().getChildren() != null) {
            this.S.addAll(conceptTopicIndex.getRecommend_for_user_topics().getChildren());
        }
        if (conceptTopicIndex.getLatest_hot_topics() != null) {
            this.P.add(conceptTopicIndex.getLatest_hot_topics());
        }
        C2(this.P);
        this.V.notifyDataSetChanged();
        this.T.notifyDataSetChanged();
        z2(false);
        y2();
    }

    private void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25787, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C2(this.Q);
        this.V.notifyDataSetChanged();
        y2();
    }

    private void K2(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 25790, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.R.contains(bBSTopicObj)) {
            int iIndexOf = this.R.indexOf(bBSTopicObj);
            this.R.remove(bBSTopicObj);
            this.U.notifyItemRemoved(iIndexOf);
            if (this.O.size() > 0) {
                q qVar = new q();
                qVar.f(q.f79586f);
                qVar.d(bBSTopicObj);
                this.O.add(1, qVar);
                this.V.notifyItemChanged(0);
                this.V.notifyItemInserted(1);
            }
        } else {
            if (this.R.size() >= this.f79563p2) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("偏好已满");
                return;
            }
            this.R.add(bBSTopicObj);
            this.U.notifyItemInserted(this.R.size() - 1);
            if (this.S.contains(bBSTopicObj)) {
                int iIndexOf2 = this.S.indexOf(bBSTopicObj);
                this.S.remove(bBSTopicObj);
                this.T.notifyItemRemoved(iIndexOf2);
                if (com.max.hbcommon.utils.c.w(this.S)) {
                    this.f79559a0.f112322d.setVisibility(8);
                    this.f79559a0.f112331m.b().setVisibility(8);
                }
            }
            q qVar2 = new q();
            qVar2.f(q.f79586f);
            qVar2.d(bBSTopicObj);
            if (this.O.contains(qVar2)) {
                int iIndexOf3 = this.O.indexOf(qVar2);
                boolean z10 = iIndexOf3 > 0 && "title".equals(this.O.get(iIndexOf3 + (-1)).c());
                boolean z11 = iIndexOf3 == this.O.size() - 1;
                boolean z12 = iIndexOf3 < this.O.size() - 1 && "title".equals(this.O.get(iIndexOf3 + 1).c());
                if (z10 && (z11 || z12)) {
                    this.V.notifyItemChanged(iIndexOf3 - 1);
                }
                this.O.remove(qVar2);
                this.V.notifyItemRemoved(iIndexOf3);
            }
        }
        S2();
    }

    private void L2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25777, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V2();
        this.U.notifyDataSetChanged();
    }

    private void O2(@androidx.annotation.n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25786, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h8(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private void P2(View view, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{view, bBSTopicObj}, this, changeQuickRedirect, false, 25789, new Class[]{View.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setOnClickListener(new e(bBSTopicObj));
        view.setOnLongClickListener(new f());
    }

    private void Q2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25770, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            C2(this.Q);
            this.V.notifyDataSetChanged();
        } else {
            C2(this.P);
            this.V.notifyDataSetChanged();
        }
        z2(z10);
        y2();
    }

    static /* synthetic */ void R1(ChannelListActivity channelListActivity, View view) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, view}, null, changeQuickRedirect, true, 25792, new Class[]{ChannelListActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.hideSoftKeyboard(view);
    }

    private void S2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25780, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.R.size() + "/" + this.f79563p2;
        if (this.X) {
            this.f79559a0.f112324f.setText(str);
            this.f79559a0.f112331m.f117148b.setText("点击添加偏好");
        } else {
            this.f79559a0.f112324f.setText("");
            this.f79559a0.f112331m.f117148b.setText("");
        }
    }

    static /* synthetic */ void T1(ChannelListActivity channelListActivity, String str) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, str}, null, changeQuickRedirect, true, 25793, new Class[]{ChannelListActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.A2(str);
    }

    private void T2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25779, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.X = z10;
        this.U.notifyDataSetChanged();
        this.V.notifyDataSetChanged();
        this.T.notifyDataSetChanged();
        if (this.X) {
            this.f79559a0.f112328j.b().setVisibility(8);
            this.f79559a0.f112327i.setVisibility(8);
            this.f79559a0.f112320b.setVisibility(8);
            this.f79559a0.f112326h.setVisibility(0);
        } else {
            if (com.max.hbcommon.utils.c.w(this.R)) {
                this.f79559a0.f112328j.b().setVisibility(0);
            } else {
                this.f79559a0.f112328j.b().setVisibility(8);
            }
            this.f79559a0.f112327i.setVisibility(0);
            this.f79559a0.f112320b.setVisibility(0);
            this.f79559a0.f112326h.setVisibility(8);
        }
        S2();
    }

    private void V2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25778, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.R) || this.X) {
            this.f79559a0.f112328j.b().setVisibility(8);
        } else {
            this.f79559a0.f112328j.b().setVisibility(0);
        }
        S2();
    }

    static /* synthetic */ void W1(ChannelListActivity channelListActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25794, new Class[]{ChannelListActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.Q2(z10);
    }

    private void W2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25774, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(this.R.get(i10).getTopic_id());
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q2(sb2.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    static /* synthetic */ void X1(ChannelListActivity channelListActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25795, new Class[]{ChannelListActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.T2(z10);
    }

    static /* synthetic */ void Y1(ChannelListActivity channelListActivity) {
        if (PatchProxy.proxy(new Object[]{channelListActivity}, null, changeQuickRedirect, true, 25796, new Class[]{ChannelListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.W2();
    }

    static /* synthetic */ void a2(ChannelListActivity channelListActivity) {
        if (PatchProxy.proxy(new Object[]{channelListActivity}, null, changeQuickRedirect, true, 25797, new Class[]{ChannelListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.C1();
    }

    static /* synthetic */ void b2(ChannelListActivity channelListActivity, View view, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, view, bBSTopicObj}, null, changeQuickRedirect, true, 25791, new Class[]{ChannelListActivity.class, View.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.P2(view, bBSTopicObj);
    }

    static /* synthetic */ void c2(ChannelListActivity channelListActivity, ConceptTopicIndex conceptTopicIndex) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, conceptTopicIndex}, null, changeQuickRedirect, true, 25798, new Class[]{ChannelListActivity.class, ConceptTopicIndex.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.I2(conceptTopicIndex);
    }

    static /* synthetic */ void h2(ChannelListActivity channelListActivity) {
        if (PatchProxy.proxy(new Object[]{channelListActivity}, null, changeQuickRedirect, true, 25799, new Class[]{ChannelListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.J2();
    }

    private void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25782, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.f66601b.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    static /* synthetic */ void k2(ChannelListActivity channelListActivity, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{channelListActivity, bBSTopicObj}, null, changeQuickRedirect, true, 25800, new Class[]{ChannelListActivity.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        channelListActivity.K2(bBSTopicObj);
    }

    private void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25772, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.O)) {
            this.f79559a0.f112333o.b().setVisibility(8);
            this.f79559a0.f112321c.setVisibility(0);
        } else {
            this.f79559a0.f112333o.b().setVisibility(0);
            ((TextView) this.f79559a0.f112333o.b().findViewById(R.id.tv_empty)).setText("暂无相关社区");
            this.f79559a0.f112321c.setVisibility(8);
        }
    }

    private void z2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25771, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10 || com.max.hbcommon.utils.c.w(this.S)) {
            this.f79559a0.f112322d.setVisibility(8);
            this.f79559a0.f112331m.b().setVisibility(8);
        } else {
            this.f79559a0.f112322d.setVisibility(0);
            this.f79559a0.f112331m.b().setVisibility(0);
        }
    }

    public void H2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25788, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        A2(str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25765, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.k kVarC = df.k.c(this.f66602c);
        this.f79559a0 = kVarC;
        setContentView(kVarC.b());
        this.f79560b0 = getIntent().getStringExtra("key");
        this.f66616q.setTitle("偏好设置");
        this.W = ViewUtils.f(this.f66601b, 10.0f);
        int iF = ViewUtils.f(this.f66601b, 14.5f);
        this.f79565y1 = iF;
        this.f79562p1 = 4;
        com.max.xiaoheihe.module.bbs.adapter.v vVar = com.max.xiaoheihe.module.bbs.adapter.v.f80640a;
        Activity activity = this.f66601b;
        this.f79564x1 = vVar.a(activity, iF, ViewUtils.f(activity, 70.0f), 4);
        G2();
        this.f79559a0.f112323e.setAdapter(this.U);
        D2();
        E2();
        this.f79559a0.f112332n.setVisibility(0);
        E1();
        B2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25781, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        B2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25783, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Y.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25769, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SearchView searchView = this.f79559a0.f112332n;
        this.L = searchView.f67174d;
        this.M = searchView.f67176f;
        searchView.setSearchIconColor(com.max.hbcommon.utils.l.a(R.color.text_secondary_1_color));
        this.L.setHint("搜索游戏分区");
        this.L.setFocusable(true);
        this.L.setFocusableInTouchMode(true);
        this.L.setImeOptions(3);
        this.L.setOnEditorActionListener(new m());
        this.M.setOnClickListener(new n());
        this.L.addTextChangedListener(new o());
        a aVar = new a();
        this.f79559a0.f112329k.setOnClickListener(aVar);
        this.f79559a0.f112328j.b().setOnClickListener(aVar);
    }

    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25784, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.L;
        return editText != null ? editText.getText().toString() : "";
    }
}
