package com.max.xiaoheihe.module.chat;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.chat.MsgSettingObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
@ig.d(path = {lb.d.X4})
public class StrangerMsgSettingActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<KeyDescObj> L = new ArrayList<>();
    private String M;

    @BindView(R.id.rl_msg_level)
    RelativeLayout rlMsgLevel;

    @BindView(R.id.tv_level)
    TextView tvLevel;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31413, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            StrangerMsgSettingActivity.M1(StrangerMsgSettingActivity.this);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<MsgSettingObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31414, new Class[]{Throwable.class}, Void.TYPE).isSupported && StrangerMsgSettingActivity.this.isActive()) {
                super.onError(th2);
                StrangerMsgSettingActivity.N1(StrangerMsgSettingActivity.this);
            }
        }

        public void onNext(Result<MsgSettingObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31415, new Class[]{Result.class}, Void.TYPE).isSupported && StrangerMsgSettingActivity.this.isActive()) {
                StrangerMsgSettingActivity.O1(StrangerMsgSettingActivity.this);
                StrangerMsgSettingActivity.this.M = result.getResult().getLevel();
                if (!com.max.hbcommon.utils.c.w(result.getResult().getList())) {
                    StrangerMsgSettingActivity.this.L.clear();
                    StrangerMsgSettingActivity.this.L.addAll(result.getResult().getList());
                }
                StrangerMsgSettingActivity.T1(StrangerMsgSettingActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31416, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MsgSettingObj>) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<MsgSettingObj>> {
        c() {
        }
    }

    public class d implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 31417, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            StrangerMsgSettingActivity.this.M = keyDescObj.getDesc();
            StrangerMsgSettingActivity.T1(StrangerMsgSettingActivity.this);
            StrangerMsgSettingActivity.V1(StrangerMsgSettingActivity.this, keyDescObj.getKey());
        }
    }

    static /* synthetic */ void M1(StrangerMsgSettingActivity strangerMsgSettingActivity) {
        if (PatchProxy.proxy(new Object[]{strangerMsgSettingActivity}, null, changeQuickRedirect, true, 31408, new Class[]{StrangerMsgSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        strangerMsgSettingActivity.Z1();
    }

    static /* synthetic */ void N1(StrangerMsgSettingActivity strangerMsgSettingActivity) {
        if (PatchProxy.proxy(new Object[]{strangerMsgSettingActivity}, null, changeQuickRedirect, true, 31409, new Class[]{StrangerMsgSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        strangerMsgSettingActivity.C1();
    }

    static /* synthetic */ void O1(StrangerMsgSettingActivity strangerMsgSettingActivity) {
        if (PatchProxy.proxy(new Object[]{strangerMsgSettingActivity}, null, changeQuickRedirect, true, 31410, new Class[]{StrangerMsgSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        strangerMsgSettingActivity.x1();
    }

    static /* synthetic */ void T1(StrangerMsgSettingActivity strangerMsgSettingActivity) {
        if (PatchProxy.proxy(new Object[]{strangerMsgSettingActivity}, null, changeQuickRedirect, true, 31411, new Class[]{StrangerMsgSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        strangerMsgSettingActivity.X1();
    }

    static /* synthetic */ void V1(StrangerMsgSettingActivity strangerMsgSettingActivity, String str) {
        if (PatchProxy.proxy(new Object[]{strangerMsgSettingActivity, str}, null, changeQuickRedirect, true, 31412, new Class[]{StrangerMsgSettingActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        strangerMsgSettingActivity.Y1(str);
    }

    private void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().K0().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31405, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tvLevel.setText(this.M);
    }

    private void Y1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31404, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().H0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31406, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (KeyDescObj keyDescObj : this.L) {
            if (keyDescObj.getDesc().equals(this.M)) {
                keyDescObj.setChecked(true);
            } else {
                keyDescObj.setChecked(false);
            }
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f66601b, this.L);
        heyBoxPopupMenu.R(new d());
        heyBoxPopupMenu.show();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31401, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_stranger_msg_setting);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle("私信设置");
        this.f66617r.setVisibility(0);
        E1();
        W1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31407, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        W1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.rlMsgLevel.setOnClickListener(new a());
    }
}
