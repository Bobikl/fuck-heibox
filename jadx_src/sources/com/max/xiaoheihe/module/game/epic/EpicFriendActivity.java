package com.max.xiaoheihe.module.game.epic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.epic.EpicDetailInfo;
import com.max.xiaoheihe.bean.game.epic.EpicFriendInfo;
import com.max.xiaoheihe.bean.game.epic.EpicFriendInfoWrapper;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.v;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ng.j;
import xh.m;

/* JADX INFO: compiled from: EpicFriendActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class EpicFriendActivity extends BaseActivity {

    @dl.d
    public static final a R = new a(null);
    public static final int S = 8;

    @dl.d
    public static final String T = "user_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private v M;

    @e
    private com.max.xiaoheihe.module.game.epic.adapter.a N;
    private int Q;

    @dl.d
    private String L = "-1";

    @dl.d
    private List<EpicFriendInfo> O = new ArrayList();
    private boolean P = true;

    /* JADX INFO: compiled from: EpicFriendActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final Intent a(@dl.d Context context, @dl.d String userId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, userId}, this, changeQuickRedirect, false, 37482, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(userId, "userId");
            Intent intent = new Intent(context, (Class<?>) EpicFriendActivity.class);
            intent.putExtra("user_id", userId);
            return intent;
        }
    }

    /* JADX INFO: compiled from: EpicFriendActivity.kt */
    @t0({"SMAP\nEpicFriendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpicFriendActivity.kt\ncom/max/xiaoheihe/module/game/epic/EpicFriendActivity$getEpicFriends$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class b extends com.max.hbcommon.network.d<Result<EpicDetailInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 37483, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (EpicFriendActivity.this.isActive()) {
                super.onError(e10);
                v vVar = EpicFriendActivity.this.M;
                v vVar2 = null;
                if (vVar == null) {
                    f0.S("mBinding");
                    vVar = null;
                }
                vVar.f116550b.w();
                v vVar3 = EpicFriendActivity.this.M;
                if (vVar3 == null) {
                    f0.S("mBinding");
                } else {
                    vVar2 = vVar3;
                }
                vVar2.f116550b.P();
                EpicFriendActivity.X1(EpicFriendActivity.this);
            }
        }

        public void onNext(@dl.d Result<EpicDetailInfo> t10) {
            ArrayList<EpicFriendInfo> list;
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 37484, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (EpicFriendActivity.this.isActive()) {
                super.onNext(t10);
                v vVar = null;
                if (t10.getResult() != null) {
                    if (EpicFriendActivity.this.Q == 0) {
                        EpicFriendActivity.this.O.clear();
                    }
                    List[] listArr = new List[1];
                    EpicDetailInfo result = t10.getResult();
                    f0.m(result);
                    EpicFriendInfoWrapper friends = result.getFriends();
                    listArr[0] = friends != null ? friends.getList() : null;
                    if (!com.max.hbcommon.utils.c.w(listArr)) {
                        EpicDetailInfo result2 = t10.getResult();
                        f0.m(result2);
                        EpicFriendInfoWrapper friends2 = result2.getFriends();
                        if (friends2 != null && (list = friends2.getList()) != null) {
                            EpicFriendActivity.this.O.addAll(list);
                        }
                        com.max.xiaoheihe.module.game.epic.adapter.a aVar = EpicFriendActivity.this.N;
                        if (aVar != null) {
                            aVar.notifyDataSetChanged();
                        }
                        EpicFriendActivity.V1(EpicFriendActivity.this);
                    } else if (EpicFriendActivity.this.Q == 0) {
                        EpicFriendActivity.W1(EpicFriendActivity.this);
                    }
                }
                v vVar2 = EpicFriendActivity.this.M;
                if (vVar2 == null) {
                    f0.S("mBinding");
                    vVar2 = null;
                }
                vVar2.f116550b.w();
                v vVar3 = EpicFriendActivity.this.M;
                if (vVar3 == null) {
                    f0.S("mBinding");
                } else {
                    vVar = vVar3;
                }
                vVar.f116550b.P();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37485, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<EpicDetailInfo>) obj);
        }
    }

    /* JADX INFO: compiled from: EpicFriendActivity.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37486, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            EpicFriendActivity.this.Q = 0;
            EpicFriendActivity.M1(EpicFriendActivity.this);
        }
    }

    /* JADX INFO: compiled from: EpicFriendActivity.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37487, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            EpicFriendActivity.this.Q += 30;
            EpicFriendActivity.M1(EpicFriendActivity.this);
        }
    }

    public static final /* synthetic */ void M1(EpicFriendActivity epicFriendActivity) {
        if (PatchProxy.proxy(new Object[]{epicFriendActivity}, null, changeQuickRedirect, true, 37478, new Class[]{EpicFriendActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicFriendActivity.Y1();
    }

    public static final /* synthetic */ void V1(EpicFriendActivity epicFriendActivity) {
        if (PatchProxy.proxy(new Object[]{epicFriendActivity}, null, changeQuickRedirect, true, 37480, new Class[]{EpicFriendActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicFriendActivity.x1();
    }

    public static final /* synthetic */ void W1(EpicFriendActivity epicFriendActivity) {
        if (PatchProxy.proxy(new Object[]{epicFriendActivity}, null, changeQuickRedirect, true, 37481, new Class[]{EpicFriendActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicFriendActivity.y1();
    }

    public static final /* synthetic */ void X1(EpicFriendActivity epicFriendActivity) {
        if (PatchProxy.proxy(new Object[]{epicFriendActivity}, null, changeQuickRedirect, true, 37479, new Class[]{EpicFriendActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicFriendActivity.C1();
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37475, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().L2(this.L, this.Q, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    @m
    public static final Intent Z1(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 37477, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : R.a(context, str);
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37474, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v vVar = null;
        if (this.P) {
            c1().setTitle(R.string.my_friend);
            v vVar2 = this.M;
            if (vVar2 == null) {
                f0.S("mBinding");
                vVar2 = null;
            }
            vVar2.f116551c.f111642j.f117277c.setText(R.string.my_friend);
        } else {
            c1().setTitle(R.string.his_friend);
            v vVar3 = this.M;
            if (vVar3 == null) {
                f0.S("mBinding");
                vVar3 = null;
            }
            vVar3.f116551c.f111642j.f117277c.setText(R.string.his_friend);
        }
        v vVar4 = this.M;
        if (vVar4 == null) {
            f0.S("mBinding");
            vVar4 = null;
        }
        vVar4.f116551c.f111637e.setLayoutManager(new LinearLayoutManager(this.f66601b));
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        this.N = new com.max.xiaoheihe.module.game.epic.adapter.a(mContext, this.O);
        v vVar5 = this.M;
        if (vVar5 == null) {
            f0.S("mBinding");
            vVar5 = null;
        }
        vVar5.f116551c.f111637e.setAdapter(this.N);
        v vVar6 = this.M;
        if (vVar6 == null) {
            f0.S("mBinding");
            vVar6 = null;
        }
        vVar6.f116551c.f111640h.f111598e.setVisibility(8);
        v vVar7 = this.M;
        if (vVar7 == null) {
            f0.S("mBinding");
            vVar7 = null;
        }
        vVar7.f116551c.f111641i.setVisibility(8);
        v vVar8 = this.M;
        if (vVar8 == null) {
            f0.S("mBinding");
            vVar8 = null;
        }
        vVar8.f116550b.setBackgroundColor(getResources().getColor(R.color.white));
        v vVar9 = this.M;
        if (vVar9 == null) {
            f0.S("mBinding");
            vVar9 = null;
        }
        vVar9.f116550b.b0(true);
        v vVar10 = this.M;
        if (vVar10 == null) {
            f0.S("mBinding");
            vVar10 = null;
        }
        vVar10.f116550b.S(new c());
        v vVar11 = this.M;
        if (vVar11 == null) {
            f0.S("mBinding");
        } else {
            vVar = vVar11;
        }
        vVar.f116550b.f0(new d());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37473, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        String stringExtra = getIntent().getStringExtra("user_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.L = stringExtra;
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            this.L = "-1";
        }
        v vVarC = v.c(getLayoutInflater());
        f0.o(vVarC, "inflate(layoutInflater)");
        this.M = vVarC;
        this.P = i0.q(this.L);
        v vVar = this.M;
        if (vVar == null) {
            f0.S("mBinding");
            vVar = null;
        }
        setContentView(vVar.b());
        a2();
        E1();
        Y1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37476, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        this.Q = 0;
        E1();
        Y1();
    }
}
