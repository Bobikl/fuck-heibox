package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.HashtagRankingResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AddHashtagActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.xiaoheihe.module.bbs.adapter.t M;
    private String O;

    @BindView(R.id.et_hashtag)
    EditText etHashtag;

    @BindView(R.id.rv_list)
    RecyclerView rvList;
    private List<HashtagObj> L = new ArrayList();
    private d N = new d(this);

    public class a implements com.max.xiaoheihe.module.bbs.adapter.t.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.t.a
        public void a(HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{hashtagObj}, this, changeQuickRedirect, false, 25757, new Class[]{HashtagObj.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("hashtag_name", hashtagObj.getName());
            AddHashtagActivity.this.setResult(-1, intent);
            AddHashtagActivity.this.finish();
        }
    }

    public class b implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 25758, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            AddHashtagActivity.this.O0();
            String string = editable.toString();
            AddHashtagActivity.this.N.removeCallbacksAndMessages(null);
            Message messageObtainMessage = AddHashtagActivity.this.N.obtainMessage();
            messageObtainMessage.obj = string;
            AddHashtagActivity.this.N.sendMessageDelayed(messageObtainMessage, 500L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<HashtagRankingResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79554b;

        c(String str) {
            this.f79554b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25760, new Class[0], Void.TYPE).isSupported && this.f79554b.equals(AddHashtagActivity.this.O) && AddHashtagActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25759, new Class[]{Throwable.class}, Void.TYPE).isSupported && this.f79554b.equals(AddHashtagActivity.this.O) && AddHashtagActivity.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<HashtagRankingResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25761, new Class[]{Result.class}, Void.TYPE).isSupported && this.f79554b.equals(AddHashtagActivity.this.O) && AddHashtagActivity.this.isActive()) {
                if (result.getResult() != null && result.getResult().getHashtags() != null) {
                    AddHashtagActivity.this.L.clear();
                    AddHashtagActivity.this.L.addAll(result.getResult().getHashtags());
                }
                if (com.max.hbcommon.utils.c.w(AddHashtagActivity.this.L)) {
                    HashtagObj hashtagObj = new HashtagObj();
                    hashtagObj.setName(this.f79554b);
                    AddHashtagActivity.this.L.add(hashtagObj);
                } else if (!com.max.hbcommon.utils.c.u(this.f79554b)) {
                    AddHashtagActivity addHashtagActivity = AddHashtagActivity.this;
                    if (!AddHashtagActivity.Q1(addHashtagActivity, addHashtagActivity.L, this.f79554b)) {
                        HashtagObj hashtagObj2 = new HashtagObj();
                        hashtagObj2.setName(this.f79554b);
                        AddHashtagActivity.this.L.add(0, hashtagObj2);
                    }
                }
                AddHashtagActivity.this.M.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25762, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HashtagRankingResultObj>) obj);
        }
    }

    public static class d extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<AddHashtagActivity> f79556a;

        public d(AddHashtagActivity addHashtagActivity) {
            this.f79556a = new WeakReference<>(addHashtagActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 25763, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            AddHashtagActivity addHashtagActivity = this.f79556a.get();
            if (addHashtagActivity != null) {
                addHashtagActivity.X1((String) message.obj);
            }
        }
    }

    static /* synthetic */ boolean Q1(AddHashtagActivity addHashtagActivity, List list, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{addHashtagActivity, list, str}, null, changeQuickRedirect, true, 25756, new Class[]{AddHashtagActivity.class, List.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : addHashtagActivity.W1(list, str);
    }

    private void T1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25753, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        O0();
        if (str != null) {
            this.O = str;
            Y1(str);
        }
    }

    public static Intent V1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25749, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) AddHashtagActivity.class);
    }

    private boolean W1(List<HashtagObj> list, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 25755, new Class[]{List.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<HashtagObj> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getName())) {
                return true;
            }
        }
        return false;
    }

    private void Y1(@androidx.annotation.n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25754, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K3(str, "editor", "2").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
    }

    public void X1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25752, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        T1(str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25750, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_add_hashtag);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle("添加话题");
        this.f66617r.setVisibility(0);
        this.rvList.setLayoutManager(new LinearLayoutManager(this.f66601b));
        com.max.xiaoheihe.module.bbs.adapter.t tVar = new com.max.xiaoheihe.module.bbs.adapter.t(this.f66601b, this.L, new a());
        this.M = tVar;
        this.rvList.setAdapter(tVar);
        T1("");
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25751, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.etHashtag.addTextChangedListener(new b());
    }
}
