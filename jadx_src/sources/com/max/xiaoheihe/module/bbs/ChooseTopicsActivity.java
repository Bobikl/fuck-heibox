package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.TopicListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.D0)
public class ChooseTopicsActivity extends BaseActivity implements com.max.xiaoheihe.module.bbs.adapter.w.b {
    public static ChangeQuickRedirect changeQuickRedirect;
    EditText L;
    ImageView M;
    private com.max.xiaoheihe.module.bbs.adapter.w P;
    private int U;
    private String V;
    private String W;

    @BindView(R.id.ll_choosed)
    LinearLayout ll_topic;

    @BindView(R.id.rv_topics)
    RecyclerView rv_topics;

    @BindView(R.id.tv_finish)
    TextView tv_finish;

    @BindView(R.id.vg_et)
    ViewGroup vg_et;
    private ArrayList<BBSTopicCategoryObj> N = new ArrayList<>();
    private ArrayList<BBSTopicCategoryObj> O = new ArrayList<>();
    private ArrayList<BBSTopicObj> Q = new ArrayList<>();
    private BBSTopicCategoryObj R = new BBSTopicCategoryObj();
    private BBSTopicCategoryObj S = new BBSTopicCategoryObj();
    private String T = "";
    Handler X = new i();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26150, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicsActivity.this.onBackPressed();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26151, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicsActivity.this.L.setText("");
        }
    }

    public class c implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 26152, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicsActivity.this.X.removeCallbacksAndMessages(null);
            Message messageObtainMessage = ChooseTopicsActivity.this.X.obtainMessage();
            messageObtainMessage.obj = com.max.xiaoheihe.utils.d.M1(editable.toString());
            ChooseTopicsActivity.this.X.sendMessageDelayed(messageObtainMessage, 100L);
            if (editable.length() > 0) {
                ChooseTopicsActivity.this.M.setVisibility(0);
            } else {
                ChooseTopicsActivity.this.M.setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26153, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicsActivity.this.onBackPressed();
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<TopicListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26154, new Class[0], Void.TYPE).isSupported && ChooseTopicsActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26155, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChooseTopicsActivity.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<TopicListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26156, new Class[]{Result.class}, Void.TYPE).isSupported || !ChooseTopicsActivity.this.isActive() || result == null || result.getResult() == null) {
                return;
            }
            ChooseTopicsActivity.this.R.setChildren(result.getResult().getTopics());
            ChooseTopicsActivity.N1(ChooseTopicsActivity.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26157, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicListObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<BBSTopicIndexObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26158, new Class[0], Void.TYPE).isSupported && ChooseTopicsActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26159, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChooseTopicsActivity.this.isActive()) {
                ChooseTopicsActivity.Q1(ChooseTopicsActivity.this);
                super.onError(th2);
            }
        }

        public void onNext(Result<BBSTopicIndexObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26160, new Class[]{Result.class}, Void.TYPE).isSupported && ChooseTopicsActivity.this.isActive()) {
                super.onNext(result);
                ChooseTopicsActivity.R1(ChooseTopicsActivity.this);
                ArrayList arrayList = new ArrayList();
                if (!com.max.hbcommon.utils.c.u(result.getResult().getNotify())) {
                    com.max.hbcache.c.C("write_post_notify", result.getResult().getNotify());
                }
                if (!com.max.hbcommon.utils.c.u(result.getResult().getTitle_notify())) {
                    com.max.hbcache.c.C("write_post_title_notify", result.getResult().getTitle_notify());
                }
                if (!com.max.hbcommon.utils.c.w(result.getResult().getTopics_list())) {
                    Iterator<BBSTopicCategoryObj> it = result.getResult().getTopics_list().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
                if (arrayList.size() > 0) {
                    ChooseTopicsActivity.this.N.clear();
                    ChooseTopicsActivity.this.N.addAll(arrayList);
                }
                ChooseTopicsActivity.V1(ChooseTopicsActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26161, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicIndexObj>) obj);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f79746b;

        g(BBSTopicObj bBSTopicObj) {
            this.f79746b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26162, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicsActivity.this.Q.remove(this.f79746b);
            ChooseTopicsActivity.V1(ChooseTopicsActivity.this);
            ChooseTopicsActivity.this.P.notifyDataSetChanged();
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<TopicListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79748b;

        h(String str) {
            this.f79748b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26164, new Class[0], Void.TYPE).isSupported && this.f79748b.equals(ChooseTopicsActivity.this.T) && ChooseTopicsActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26163, new Class[]{Throwable.class}, Void.TYPE).isSupported && this.f79748b.equals(ChooseTopicsActivity.this.T) && ChooseTopicsActivity.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<TopicListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26165, new Class[]{Result.class}, Void.TYPE).isSupported && this.f79748b.equals(ChooseTopicsActivity.this.T) && ChooseTopicsActivity.this.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    ChooseTopicsActivity.this.S.setChildren(result.getResult().getTopics());
                    ChooseTopicsActivity.N1(ChooseTopicsActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26166, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicListObj>) obj);
        }
    }

    public class i extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 26167, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicsActivity.this.T = (String) message.obj;
            if (ChooseTopicsActivity.this.P != null && com.max.hbcommon.utils.c.u(ChooseTopicsActivity.this.T)) {
                ChooseTopicsActivity.N1(ChooseTopicsActivity.this);
            } else {
                ChooseTopicsActivity chooseTopicsActivity = ChooseTopicsActivity.this;
                ChooseTopicsActivity.O1(chooseTopicsActivity, chooseTopicsActivity.T);
            }
        }
    }

    static /* synthetic */ void N1(ChooseTopicsActivity chooseTopicsActivity) {
        if (PatchProxy.proxy(new Object[]{chooseTopicsActivity}, null, changeQuickRedirect, true, 26145, new Class[]{ChooseTopicsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicsActivity.k2();
    }

    static /* synthetic */ void O1(ChooseTopicsActivity chooseTopicsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{chooseTopicsActivity, str}, null, changeQuickRedirect, true, 26149, new Class[]{ChooseTopicsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicsActivity.i2(str);
    }

    static /* synthetic */ void Q1(ChooseTopicsActivity chooseTopicsActivity) {
        if (PatchProxy.proxy(new Object[]{chooseTopicsActivity}, null, changeQuickRedirect, true, 26146, new Class[]{ChooseTopicsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicsActivity.C1();
    }

    static /* synthetic */ void R1(ChooseTopicsActivity chooseTopicsActivity) {
        if (PatchProxy.proxy(new Object[]{chooseTopicsActivity}, null, changeQuickRedirect, true, 26147, new Class[]{ChooseTopicsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicsActivity.x1();
    }

    static /* synthetic */ void V1(ChooseTopicsActivity chooseTopicsActivity) {
        if (PatchProxy.proxy(new Object[]{chooseTopicsActivity}, null, changeQuickRedirect, true, 26148, new Class[]{ChooseTopicsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicsActivity.j2();
    }

    public static Intent b2(Context context, String str, ArrayList<BBSTopicObj> arrayList, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, arrayList, new Integer(i10)}, null, changeQuickRedirect, true, 26134, new Class[]{Context.class, String.class, ArrayList.class, Integer.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) ChooseTopicsActivity.class);
        intent.putExtra("type", str);
        intent.putExtra("topics_ids", arrayList);
        intent.putExtra("max_count", i10);
        return intent;
    }

    public static Intent c2(Context context, ArrayList<BBSTopicObj> arrayList, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, arrayList, new Integer(i10)}, null, changeQuickRedirect, true, 26132, new Class[]{Context.class, ArrayList.class, Integer.TYPE}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : e2(context, arrayList, i10, null);
    }

    public static Intent e2(Context context, ArrayList<BBSTopicObj> arrayList, int i10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, arrayList, new Integer(i10), str}, null, changeQuickRedirect, true, 26133, new Class[]{Context.class, ArrayList.class, Integer.TYPE, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intentB2 = b2(context, "list", arrayList, i10);
        intentB2.putExtra("appids", str);
        return intentB2;
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26137, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.Q)) {
            this.R.setChildren(null);
            k2();
            return;
        }
        String str = "";
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            if (i10 != 0) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            str = str + this.Q.get(i10).getTopic_id();
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d5(this.V, null, "1", MainActivity.E4 ? "1" : null, this.W).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void i2(@androidx.annotation.n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26142, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BBSTopicObj> it = this.Q.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTopic_id());
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T4(str, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(str)));
    }

    private void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26140, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.ll_topic.removeAllViews();
        for (BBSTopicObj bBSTopicObj : this.Q) {
            View viewInflate = this.f66602c.inflate(R.layout.item_topics, (ViewGroup) this.ll_topic, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
            ((ImageView) viewInflate.findViewById(R.id.iv_cross)).setVisibility(0);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
            com.max.hbimage.b.d0(bBSTopicObj.getPic_url(), imageView, ViewUtils.f(this.f66601b, 2.0f));
            textView.setText(bBSTopicObj.getName());
            viewInflate.setOnClickListener(new g(bBSTopicObj));
            this.ll_topic.addView(viewInflate);
        }
        if (this.ll_topic.getChildCount() == 0) {
            TextView textView2 = new TextView(this.f66601b);
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView2.setTextSize(1, 14.0f);
            textView2.setText("请选择社区");
            textView2.setPadding(ViewUtils.f(this.f66601b, 5.0f), 0, 0, 0);
            this.ll_topic.addView(textView2);
        }
        f2();
    }

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26144, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.Q)) {
            if (com.max.hbcommon.utils.c.u(this.T)) {
                this.O.clear();
                this.O.addAll(this.N);
            } else {
                this.O.clear();
                this.O.add(this.S);
            }
        } else if (com.max.hbcommon.utils.c.w(this.R.getChildren())) {
            this.O.clear();
        } else {
            this.O.clear();
            this.O.add(this.R);
        }
        this.P.notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.w.b
    public void K(ArrayList<BBSTopicObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 26143, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        this.Q = arrayList;
        j2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26135, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_choose_topics);
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.V = intent.getStringExtra("type");
            this.Q = (ArrayList) intent.getSerializableExtra("topics_ids");
            this.U = intent.getIntExtra("max_count", Integer.MAX_VALUE);
            this.W = intent.getStringExtra("appids");
        }
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.choose_topics);
        this.f66617r.setVisibility(0);
        this.f66616q.getAppbarNavButtonView().setOnClickListener(new a());
        this.R.setName("相关社区");
        this.R.setIs_open("1");
        this.S.setName("社区");
        this.P = new com.max.xiaoheihe.module.bbs.adapter.w(this.f66601b, this.O, this.Q, this.U, this);
        this.rv_topics.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.rv_topics.setAdapter(this.P);
        this.L = (EditText) this.vg_et.findViewById(R.id.et_search);
        this.M = (ImageView) this.vg_et.findViewById(R.id.iv_del);
        this.L.setHint("输入搜索内容");
        this.M.setOnClickListener(new b());
        this.L.addTextChangedListener(new c());
        E1();
        h2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("choosed_topics", this.Q);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26136, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tv_finish.setOnClickListener(new d());
    }
}
