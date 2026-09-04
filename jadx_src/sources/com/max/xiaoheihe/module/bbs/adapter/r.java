package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.view.View;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.module.account.component.FollowButton;
import com.max.xiaoheihe.module.bbs.component.RecommendUserView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: RecommendUserListAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class r extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f80618c;

    /* JADX INFO: compiled from: RecommendUserListAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f80621d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RecommendUserListAdapter.java */
        public class C0687a extends com.max.hbcommon.network.d<Result> {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0687a() {
            }

            public void onNext(Result result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27453, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(r.this.f80617b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                if ("1".equals(a.this.f80619b.getIs_follow())) {
                    a.this.f80619b.setIs_follow("0");
                } else {
                    a.this.f80619b.setIs_follow("2");
                }
                r.this.notifyDataSetChanged();
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27454, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result) obj);
            }
        }

        /* JADX INFO: compiled from: RecommendUserListAdapter.java */
        public class b extends com.max.hbcommon.network.d<Result> {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            public void onNext(Result result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27455, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(r.this.f80617b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                int iIndexOf = r.this.getDataList().indexOf(a.this.f80619b);
                r.this.getDataList().remove(a.this.f80619b);
                r.this.notifyItemRemoved(iIndexOf);
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27456, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result) obj);
            }
        }

        a(BBSUserInfoObj bBSUserInfoObj, com.max.hbcommon.base.adapter.s.e eVar, String str) {
            this.f80619b = bBSUserInfoObj;
            this.f80620c = eVar;
            this.f80621d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27452, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (r.this.f80618c == null || !r.this.f80618c.b(this.f80619b)) {
                if ("1".equals(this.f80619b.getIs_follow()) || "3".equals(this.f80619b.getIs_follow())) {
                    com.max.hbcommon.analytics.l.f66572a.o("0", "recommend", this.f80621d);
                    com.max.xiaoheihe.network.i.a().m5(this.f80621d, this.f80619b.getH_src()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0687a());
                    return;
                } else {
                    com.max.hbcommon.analytics.l.f66572a.o("1", "recommend", this.f80621d);
                    com.max.xiaoheihe.network.i.a().V6(this.f80621d, null, this.f80619b.getH_src()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b());
                    return;
                }
            }
            if ("1".equals(this.f80619b.getIs_follow())) {
                this.f80619b.setIs_follow("0");
            } else if ("3".equals(this.f80619b.getIs_follow())) {
                this.f80619b.setIs_follow("2");
            } else if ("0".equals(this.f80619b.getIs_follow())) {
                this.f80619b.setIs_follow("1");
            } else if ("2".equals(this.f80619b.getIs_follow())) {
                this.f80619b.setIs_follow("3");
            }
            r.n(r.this, this.f80620c, this.f80619b.getIs_follow());
        }
    }

    /* JADX INFO: compiled from: RecommendUserListAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80625b;

        b(String str) {
            this.f80625b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27457, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(r.this.f80617b, this.f80625b).A();
        }
    }

    /* JADX INFO: compiled from: RecommendUserListAdapter.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80627b;

        c(BBSUserInfoObj bBSUserInfoObj) {
            this.f80627b = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27458, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIndexOf = r.this.getDataList().indexOf(this.f80627b);
            r.this.getDataList().remove(this.f80627b);
            if (r.this.f80618c != null) {
                r.this.f80618c.a(this.f80627b);
            }
            r.this.notifyItemRemoved(iIndexOf);
            r.p(r.this, this.f80627b.getUserid(), this.f80627b.getH_src());
        }
    }

    /* JADX INFO: compiled from: RecommendUserListAdapter.java */
    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result result) {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27459, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: RecommendUserListAdapter.java */
    public interface e {
        void a(BBSUserInfoObj bBSUserInfoObj);

        boolean b(BBSUserInfoObj bBSUserInfoObj);
    }

    public r(Context context, List<BBSUserInfoObj> list, e eVar) {
        super(context, list, R.layout.item_recommend_user_or_topic);
        this.f80617b = context;
        this.f80618c = eVar;
    }

    static /* synthetic */ void n(r rVar, com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{rVar, eVar, str}, null, changeQuickRedirect, true, 27450, new Class[]{r.class, com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.r(eVar, str);
    }

    static /* synthetic */ void p(r rVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{rVar, str, str2}, null, changeQuickRedirect, true, 27451, new Class[]{r.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        rVar.s(str, str2);
    }

    private void r(com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 27447, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        RecommendUserView recommendUserView = (RecommendUserView) eVar.i(R.id.ru);
        if ("1".equals(str) || "3".equals(str)) {
            recommendUserView.f80915f.setFollowState(FollowButton.FollowState.Followed);
        } else {
            recommendUserView.f80915f.setFollowState(FollowButton.FollowState.Follow);
        }
    }

    private void s(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 27448, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().sa(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new d());
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27449, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        q(eVar, bBSUserInfoObj);
    }

    public void q(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27446, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        RecommendUserView recommendUserView = (RecommendUserView) eVar.i(R.id.ru);
        com.max.hbimage.b.H(bBSUserInfoObj.getAvartar(), recommendUserView.f80912c);
        recommendUserView.f80913d.setText(bBSUserInfoObj.getUsername());
        recommendUserView.f80914e.setText(bBSUserInfoObj.getRec_tag());
        String userid = bBSUserInfoObj.getUserid();
        r(eVar, bBSUserInfoObj.getIs_follow());
        recommendUserView.f80915f.setOnClickListener(new a(bBSUserInfoObj, eVar, userid));
        eVar.b().setOnClickListener(new b(userid));
        recommendUserView.f80911b.setOnClickListener(new c(bBSUserInfoObj));
    }
}
