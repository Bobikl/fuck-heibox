package com.max.xiaoheihe.module.game;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.GameTagsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131173h3)
@ig.d(path = {lb.d.f131173h3})
public class GameAddTagsActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private GameTagsObj M;
    private boolean N;

    @BindView(R.id.et_add_tag)
    EditText mAddTagEditText;

    @BindView(R.id.tv_add_tag)
    TextView mAddTagTextView;

    @BindView(R.id.ll_my_tags)
    LinearLayout mMyTagsLinearLayout;

    @BindView(R.id.tv_my_tags_num)
    TextView mMyTagsNumTextView;

    @BindView(R.id.vg_my_tags)
    View mMyTagsView;

    @BindView(R.id.ll_recommend_tags)
    LinearLayout mRecommendTagsLinearLayout;

    @BindView(R.id.vg_recommend_tags)
    View mRecommendTagsView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32463, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAddTagsActivity.M1(GameAddTagsActivity.this);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<GameTagsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32465, new Class[0], Void.TYPE).isSupported && GameAddTagsActivity.this.isActive()) {
                super.onComplete();
                GameAddTagsActivity.this.mRefreshLayout.A(0);
                GameAddTagsActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32464, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameAddTagsActivity.this.isActive()) {
                super.onError(th2);
                GameAddTagsActivity.N1(GameAddTagsActivity.this);
                GameAddTagsActivity.this.mRefreshLayout.A(0);
                GameAddTagsActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameTagsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32466, new Class[]{Result.class}, Void.TYPE).isSupported && GameAddTagsActivity.this.isActive()) {
                super.onNext(result);
                GameAddTagsActivity.this.M = result.getResult();
                GameAddTagsActivity.T1(GameAddTagsActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32467, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameTagsObj>) obj);
        }
    }

    public class c extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32468, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            Intent intent = new Intent(lb.a.V);
            intent.putExtra(lb.a.f131038s0, GameAddTagsActivity.this.L);
            HeyBoxApplication.C().sendBroadcast(intent);
        }
    }

    public class d extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32469, new Class[]{Result.class}, Void.TYPE).isSupported && GameAddTagsActivity.this.isActive()) {
                super.onNext(result);
                GameAddTagsActivity.M1(GameAddTagsActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32470, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32471, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAddTagsActivity gameAddTagsActivity = GameAddTagsActivity.this;
            GameAddTagsActivity.W1(gameAddTagsActivity, gameAddTagsActivity.mAddTagEditText.getText().toString());
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f84112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f84113d;

        f(KeyDescObj keyDescObj, View view, TextView textView) {
            this.f84111b = keyDescObj;
            this.f84112c = view;
            this.f84113d = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32472, new Class[]{View.class}, Void.TYPE).isSupported && GameAddTagsActivity.W1(GameAddTagsActivity.this, this.f84111b.getDesc())) {
                GameAddTagsActivity.this.N = true;
                this.f84111b.setChecked(true);
                this.f84112c.setBackgroundResource(R.drawable.text_primary_2dp);
                this.f84113d.setTextColor(((BaseActivity) GameAddTagsActivity.this).f66601b.getResources().getColor(R.color.white));
            }
        }
    }

    public class g implements com.max.xiaoheihe.view.popuplist.a.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84115a;

        g(KeyDescObj keyDescObj) {
            this.f84115a = keyDescObj;
        }

        @Override // com.max.xiaoheihe.view.popuplist.a.h
        public boolean a(View view, View view2, int i10) {
            return true;
        }

        @Override // com.max.xiaoheihe.view.popuplist.a.h
        public void b(View view, int i10, int i11) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32473, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            GameAddTagsActivity.Z1(GameAddTagsActivity.this, this.f84115a.getKey());
        }

        @Override // com.max.xiaoheihe.view.popuplist.a.h
        public /* synthetic */ void onDismiss() {
            com.max.xiaoheihe.view.popuplist.b.a(this);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f84117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84118c;

        h(List list, KeyDescObj keyDescObj) {
            this.f84117b = list;
            this.f84118c = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32474, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAddTagsActivity.this.N = true;
            this.f84117b.remove(this.f84118c);
            GameAddTagsActivity.a2(GameAddTagsActivity.this);
            List<KeyDescObj> recommend_tags = GameAddTagsActivity.this.M != null ? GameAddTagsActivity.this.M.getRecommend_tags() : null;
            if (recommend_tags == null || recommend_tags.size() <= 0 || com.max.hbcommon.utils.c.u(this.f84118c.getDesc())) {
                return;
            }
            for (KeyDescObj keyDescObj : recommend_tags) {
                if (this.f84118c.getDesc().equals(keyDescObj.getDesc())) {
                    keyDescObj.setChecked(false);
                    GameAddTagsActivity.O1(GameAddTagsActivity.this);
                    return;
                }
            }
        }
    }

    static /* synthetic */ void M1(GameAddTagsActivity gameAddTagsActivity) {
        if (PatchProxy.proxy(new Object[]{gameAddTagsActivity}, null, changeQuickRedirect, true, 32456, new Class[]{GameAddTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAddTagsActivity.e2();
    }

    static /* synthetic */ void N1(GameAddTagsActivity gameAddTagsActivity) {
        if (PatchProxy.proxy(new Object[]{gameAddTagsActivity}, null, changeQuickRedirect, true, 32457, new Class[]{GameAddTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAddTagsActivity.C1();
    }

    static /* synthetic */ void O1(GameAddTagsActivity gameAddTagsActivity) {
        if (PatchProxy.proxy(new Object[]{gameAddTagsActivity}, null, changeQuickRedirect, true, 32462, new Class[]{GameAddTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAddTagsActivity.i2();
    }

    static /* synthetic */ void T1(GameAddTagsActivity gameAddTagsActivity) {
        if (PatchProxy.proxy(new Object[]{gameAddTagsActivity}, null, changeQuickRedirect, true, 32458, new Class[]{GameAddTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAddTagsActivity.k2();
    }

    static /* synthetic */ boolean W1(GameAddTagsActivity gameAddTagsActivity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameAddTagsActivity, str}, null, changeQuickRedirect, true, 32459, new Class[]{GameAddTagsActivity.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gameAddTagsActivity.b2(str);
    }

    static /* synthetic */ void Z1(GameAddTagsActivity gameAddTagsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameAddTagsActivity, str}, null, changeQuickRedirect, true, 32460, new Class[]{GameAddTagsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAddTagsActivity.j2(str);
    }

    static /* synthetic */ void a2(GameAddTagsActivity gameAddTagsActivity) {
        if (PatchProxy.proxy(new Object[]{gameAddTagsActivity}, null, changeQuickRedirect, true, 32461, new Class[]{GameAddTagsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAddTagsActivity.h2();
    }

    private boolean b2(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32450, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!l2(str)) {
            return false;
        }
        this.N = true;
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(str);
        GameTagsObj gameTagsObj = this.M;
        List<KeyDescObj> my_tags = gameTagsObj != null ? gameTagsObj.getMy_tags() : null;
        if (my_tags == null) {
            my_tags = new ArrayList<>();
            this.M.setMy_tags(my_tags);
        }
        this.mAddTagEditText.setText((CharSequence) null);
        this.mAddTagEditText.clearFocus();
        my_tags.add(keyDescObj);
        h2();
        return true;
    }

    private void c2(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32446, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            com.max.xiaoheihe.network.i.a().m0(this.L, f2()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new c());
        }
    }

    private void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32445, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n4(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private String f2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32448, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        GameTagsObj gameTagsObj = this.M;
        List<KeyDescObj> my_tags = gameTagsObj != null ? gameTagsObj.getMy_tags() : null;
        if (my_tags == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(Constants.ARRAY_TYPE);
        for (int i10 = 0; i10 < my_tags.size(); i10++) {
            KeyDescObj keyDescObj = my_tags.get(i10);
            if (i10 != 0) {
                sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append("\"");
            sb2.append(keyDescObj.getDesc());
            sb2.append("\"");
        }
        sb2.append("]");
        return sb2.toString();
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32453, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameTagsObj gameTagsObj = this.M;
        List<KeyDescObj> my_tags = gameTagsObj != null ? gameTagsObj.getMy_tags() : null;
        GameTagsObj gameTagsObj2 = this.M;
        int iQ = (gameTagsObj2 == null || com.max.hbcommon.utils.c.u(gameTagsObj2.getLimit())) ? 3 : com.max.hbutils.utils.n.q(this.M.getLimit());
        int size = my_tags != null ? my_tags.size() : 0;
        if (iQ > 0) {
            this.mMyTagsNumTextView.setVisibility(0);
            this.mMyTagsNumTextView.setText(String.format(Locale.US, "%d/%d", Integer.valueOf(size), Integer.valueOf(iQ)));
        } else {
            this.mMyTagsNumTextView.setVisibility(8);
        }
        if (size <= 0) {
            this.mMyTagsLinearLayout.setVisibility(8);
            return;
        }
        this.mMyTagsLinearLayout.setVisibility(0);
        this.mMyTagsLinearLayout.removeAllViews();
        int iF = ViewUtils.f(this.f66601b, 10.0f);
        int iL = ViewUtils.L(this.f66601b) - ViewUtils.f(this.f66601b, 24.0f);
        LinearLayout linearLayout = new LinearLayout(this.f66601b);
        linearLayout.setOrientation(0);
        this.mMyTagsLinearLayout.addView(linearLayout);
        int i10 = 0;
        int iW = 0;
        while (i10 < my_tags.size()) {
            KeyDescObj keyDescObj = my_tags.get(i10);
            View viewInflate = this.f66602c.inflate(R.layout.item_game_tag, (ViewGroup) this.mMyTagsLinearLayout, false);
            viewInflate.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_primary_2dp));
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_add);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_remove);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            textView.setTextColor(getResources().getColor(R.color.white));
            textView.setText(keyDescObj.getDesc());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams.leftMargin = ViewUtils.f(this.f66601b, 8.0f);
            marginLayoutParams.rightMargin = 0;
            textView.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
            marginLayoutParams2.leftMargin = i10 == 0 ? 0 : iF;
            viewInflate.setLayoutParams(marginLayoutParams2);
            viewInflate.setOnClickListener(new h(my_tags, keyDescObj));
            int iW2 = ViewUtils.W(viewInflate);
            if (i10 != 0) {
                iW2 += iF;
            }
            iW += iW2;
            if (iW > iL) {
                linearLayout = new LinearLayout(this.f66601b);
                linearLayout.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, iF, 0, 0);
                linearLayout.setLayoutParams(layoutParams);
                viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(viewInflate);
                this.mMyTagsLinearLayout.addView(linearLayout);
                iW = ViewUtils.W(viewInflate);
            } else {
                linearLayout.addView(viewInflate);
            }
            i10++;
        }
    }

    private void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32452, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameTagsObj gameTagsObj = this.M;
        List<KeyDescObj> recommend_tags = gameTagsObj != null ? gameTagsObj.getRecommend_tags() : null;
        if (recommend_tags == null || recommend_tags.size() <= 0) {
            this.mRecommendTagsView.setVisibility(8);
            return;
        }
        this.mRecommendTagsView.setVisibility(0);
        this.mRecommendTagsLinearLayout.setVisibility(0);
        this.mRecommendTagsLinearLayout.removeAllViews();
        int iF = ViewUtils.f(this.f66601b, 10.0f);
        int iL = ViewUtils.L(this.f66601b) - ViewUtils.f(this.f66601b, 24.0f);
        LinearLayout linearLayout = new LinearLayout(this.f66601b);
        linearLayout.setOrientation(0);
        this.mRecommendTagsLinearLayout.addView(linearLayout);
        int i10 = 0;
        int iW = 0;
        while (i10 < recommend_tags.size()) {
            KeyDescObj keyDescObj = recommend_tags.get(i10);
            View viewInflate = this.f66602c.inflate(R.layout.item_game_tag, (ViewGroup) this.mRecommendTagsLinearLayout, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_add);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
            imageView.setVisibility(8);
            viewInflate.setBackgroundResource(keyDescObj.isChecked() ? R.drawable.text_primary_2dp : R.drawable.btn_divider_concept_2dp);
            textView.setTextColor(this.f66601b.getResources().getColor(keyDescObj.isChecked() ? R.color.background_layer_2_color : R.color.text_secondary_1_color));
            textView.setText(keyDescObj.getDesc());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams.leftMargin = marginLayoutParams.rightMargin;
            textView.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
            marginLayoutParams2.leftMargin = i10 == 0 ? 0 : iF;
            viewInflate.setLayoutParams(marginLayoutParams2);
            viewInflate.setOnClickListener(new f(keyDescObj, viewInflate, textView));
            if ("1".equals(com.max.xiaoheihe.utils.i0.i().getPermission().getBbs_root_permission())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(getString(R.string.delete));
                new com.max.xiaoheihe.view.popuplist.a(this.f66601b).q(viewInflate, arrayList, new g(keyDescObj));
            }
            int iW2 = ViewUtils.W(viewInflate);
            if (i10 != 0) {
                iW2 += iF;
            }
            iW += iW2;
            if (iW > iL) {
                linearLayout = new LinearLayout(this.f66601b);
                linearLayout.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, iF, 0, 0);
                linearLayout.setLayoutParams(layoutParams);
                viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(viewInflate);
                this.mRecommendTagsLinearLayout.addView(linearLayout);
                iW = ViewUtils.W(viewInflate);
            } else {
                linearLayout.addView(viewInflate);
            }
            i10++;
        }
    }

    private void j2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32447, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i(this.L, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (this.M == null) {
            return;
        }
        i2();
        h2();
        this.mAddTagTextView.setOnClickListener(new e());
    }

    private boolean l2(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32451, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(str) || str.length() > 6) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d(getString(R.string.tag_invalid_tips));
            return false;
        }
        GameTagsObj gameTagsObj = this.M;
        List<KeyDescObj> my_tags = gameTagsObj != null ? gameTagsObj.getMy_tags() : null;
        GameTagsObj gameTagsObj2 = this.M;
        int iQ = (gameTagsObj2 == null || com.max.hbcommon.utils.c.u(gameTagsObj2.getLimit())) ? 3 : com.max.hbutils.utils.n.q(this.M.getLimit());
        if (my_tags != null) {
            if (my_tags.size() >= iQ) {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d(getString(R.string.tag_limit_tips));
                return false;
            }
            Iterator<KeyDescObj> it = my_tags.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().getDesc())) {
                    com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.d(getString(R.string.tag_invalid_tips));
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32455, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.L);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32443, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_add_tags);
        ButterKnife.a(this);
        this.L = getIntent().getStringExtra("app_id");
        this.f66616q.setTitle(R.string.add_tag);
        this.f66617r.setVisibility(0);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.b0(false);
        E1();
        e2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32454, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        e2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32444, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c2(this.N);
        super.onDestroy();
    }
}
