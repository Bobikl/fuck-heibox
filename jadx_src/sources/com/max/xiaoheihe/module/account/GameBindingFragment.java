package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.game.BindInfoObj;
import com.max.xiaoheihe.bean.game.GameBindInfoObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class GameBindingFragment extends com.max.hbcommon.base.d {
    public static final int A = 7;
    public static final String B = "from_game_data";
    public static final String C = "from_user_profile";
    public static final String D = "from_game_account_management";
    public static final String E = "hide_bind_card_";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f77862o = "bind_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f77863p = "from";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f77864q = "orders";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f77865r = "trans";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f77866s = "http_request_failed";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f77867t = "retry_timeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f77868u = "bind_failed";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f77869v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f77870w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f77871x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f77872y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f77873z = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProgressBar f77874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f77875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f77876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f77877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f77878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f77879g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f77880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f77881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f77882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GameBindInfoObj f77883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f77884l;

    @BindView(R.id.ll_game_binding)
    ViewGroup llGameBinding;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f77885m;

    @BindView(R.id.vg_bind_card)
    ViewGroup mBindCardView;

    @BindView(R.id.card_bind_card_games)
    View mBindGamesCardView;

    @BindView(R.id.fl_binding_container)
    FrameLayout mBindingContainerFrameLayout;

    @BindView(R.id.ll_binding_tab)
    LinearLayout mBindingTabLinearLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private UpdateBindStateBroadcastReceiver f77886n;

    public class UpdateBindStateBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UpdateBindStateBroadcastReceiver() {
        }

        /* synthetic */ UpdateBindStateBroadcastReceiver(GameBindingFragment gameBindingFragment, d dVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23133, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.T.equals(intent.getAction())) {
                GameBindingFragment.this.q4(intent.getStringExtra(GameBindingFragment.f77862o), (Map) intent.getSerializableExtra(lb.a.f131026q0));
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f77889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f77890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BindInfoObj f77891e;

        a(String str, TextView textView, EditText editText, BindInfoObj bindInfoObj) {
            this.f77888b = str;
            this.f77889c = textView;
            this.f77890d = editText;
            this.f77891e = bindInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23112, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameBindingFragment.this).mContext)) {
                if (GameBindingFragment.this.f77880h != null && GameBindingFragment.this.f77880h.g2(this.f77888b, this.f77889c, this.f77890d)) {
                    return;
                }
                String string = this.f77890d.getText().toString();
                if (!com.max.hbcommon.utils.c.u(this.f77891e.getProtocol())) {
                    com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameBindingFragment.this).mContext, this.f77891e.getProtocol());
                } else {
                    if (com.max.hbcommon.utils.c.u(string)) {
                        return;
                    }
                    GameBindingFragment.R3(GameBindingFragment.this, this.f77890d);
                    GameBindingFragment.S3(GameBindingFragment.this, string, this.f77888b);
                }
            }
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f77895d;

        b(String str, String str2, String str3) {
            this.f77893b = str;
            this.f77894c = str2;
            this.f77895d = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23113, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameBindingFragment.this.isActive()) {
                super.onError(th2);
                GameBindingFragment.T3(GameBindingFragment.this);
                if (GameBindingFragment.this.f77880h != null) {
                    GameBindingFragment.this.f77880h.C0(this.f77893b, new Exception(GameBindingFragment.f77866s, th2));
                }
            }
        }

        public void onNext(Result<StateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23114, new Class[]{Result.class}, Void.TYPE).isSupported && GameBindingFragment.this.isActive()) {
                if (result == null || result.getResult().getState() == null) {
                    GameBindingFragment.T3(GameBindingFragment.this);
                    if (GameBindingFragment.this.f77880h != null) {
                        GameBindingFragment.this.f77880h.C0(this.f77893b, new Exception(GameBindingFragment.f77868u));
                        return;
                    }
                    return;
                }
                String state = result.getResult().getState();
                state.hashCode();
                switch (state) {
                    case "failed":
                        GameBindingFragment.T3(GameBindingFragment.this);
                        if (GameBindingFragment.this.f77880h != null) {
                            GameBindingFragment.this.f77880h.C0(this.f77893b, new Exception(GameBindingFragment.f77868u));
                            break;
                        }
                        break;
                    case "ok":
                        GameBindingFragment.T3(GameBindingFragment.this);
                        if (GameBindingFragment.this.f77880h != null) {
                            GameBindingFragment.this.f77880h.B1(this.f77893b);
                            break;
                        }
                        break;
                    case "waiting":
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.binding));
                        GameBindingFragment.U3(GameBindingFragment.this, this.f77894c, this.f77893b, this.f77895d, 1, null);
                        break;
                    default:
                        GameBindingFragment.T3(GameBindingFragment.this);
                        if (GameBindingFragment.this.f77880h != null) {
                            GameBindingFragment.this.f77880h.C0(this.f77893b, new Exception(state));
                            break;
                        }
                        break;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23115, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f77898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f77899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f77900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f77901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f77902g;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23120, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23119, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        c(String str, boolean z10, int i10, String str2, String str3, Map map) {
            this.f77897b = str;
            this.f77898c = z10;
            this.f77899d = i10;
            this.f77900e = str2;
            this.f77901f = str3;
            this.f77902g = map;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23116, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameBindingFragment.this.isActive()) {
                super.onError(th2);
                GameBindingFragment.T3(GameBindingFragment.this);
                if (GameBindingFragment.this.f77880h != null) {
                    GameBindingFragment.this.f77880h.C0(this.f77897b, new Exception(GameBindingFragment.f77866s, th2));
                }
            }
        }

        public void onNext(Result<StateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23117, new Class[]{Result.class}, Void.TYPE).isSupported && GameBindingFragment.this.isActive()) {
                if (result == null || result.getResult().getState() == null) {
                    GameBindingFragment.T3(GameBindingFragment.this);
                    if (GameBindingFragment.this.f77880h != null) {
                        GameBindingFragment.this.f77880h.C0(this.f77897b, new Exception(GameBindingFragment.f77868u));
                        return;
                    }
                    return;
                }
                String state = result.getResult().getState();
                state.hashCode();
                switch (state) {
                    case "failed":
                        GameBindingFragment.T3(GameBindingFragment.this);
                        if (GameBindingFragment.this.f77880h != null) {
                            GameBindingFragment.this.f77880h.C0(this.f77897b, new Exception(GameBindingFragment.f77868u));
                            break;
                        }
                        break;
                    case "ok":
                        GameBindingFragment.T3(GameBindingFragment.this);
                        if (GameBindingFragment.this.f77880h != null) {
                            if (!this.f77898c) {
                                GameBindingFragment.this.f77880h.B1(this.f77897b);
                            } else {
                                GameBindingFragment.this.f77880h.m1(this.f77897b);
                            }
                            break;
                        }
                        break;
                    case "waiting":
                        int i10 = this.f77899d;
                        if (i10 > 5) {
                            GameBindingFragment.T3(GameBindingFragment.this);
                            if ("psn".equals(this.f77897b)) {
                                com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) GameBindingFragment.this).mContext, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_psn_time_out_msg), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new a());
                            } else if (GameBindingFragment.this.f77880h != null) {
                                GameBindingFragment.this.f77880h.C0(this.f77897b, new Exception(GameBindingFragment.f77867t));
                            }
                            break;
                        } else {
                            GameBindingFragment.U3(GameBindingFragment.this, this.f77900e, this.f77897b, this.f77901f, i10 + 1, this.f77902g);
                            break;
                        }
                        break;
                    default:
                        GameBindingFragment.T3(GameBindingFragment.this);
                        if (GameBindingFragment.this.f77880h != null) {
                            GameBindingFragment.this.f77880h.C0(this.f77897b, new Exception(state));
                            break;
                        }
                        break;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23118, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77905b;

        d(String str) {
            this.f77905b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23111, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f77905b.equals(GameBindingFragment.this.f77881i)) {
                GameBindingFragment gameBindingFragment = GameBindingFragment.this;
                gameBindingFragment.f77882j = true ^ gameBindingFragment.f77882j;
            } else {
                GameBindingFragment.this.f77882j = false;
            }
            com.max.hbcache.c.C("bind_card_collapsed", GameBindingFragment.this.f77882j ? "true" : "false");
            if (GameBindingFragment.this.f77882j) {
                GameBindingFragment.this.f77881i = null;
            } else {
                GameBindingFragment.this.f77881i = this.f77905b;
            }
            GameBindingFragment.Y3(GameBindingFragment.this, false);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23121, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C(com.max.hbcache.c.Q, "0");
            com.max.xiaoheihe.utils.d.w1(((com.max.hbcommon.base.d) GameBindingFragment.this).mContext);
        }
    }

    public class f implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f77908a;

        f(TextView textView) {
            this.f77908a = textView;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 23122, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameBindingFragment.this.f77884l = keyDescObj.getKey();
            TextView textView = this.f77908a;
            if (textView != null) {
                textView.setText(keyDescObj.getValue());
            }
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77911c;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23125, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcache.c.C(GameBindingFragment.E + g.this.f77911c, "true");
                GameBindingFragment.this.r4();
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23124, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        g(String str, String str2) {
            this.f77910b = str;
            this.f77911c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23123, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) GameBindingFragment.this).mContext, GameBindingFragment.this.getString(R.string.do_not_show_again_confirm), this.f77910b, GameBindingFragment.this.getString(R.string.confirm), GameBindingFragment.this.getString(R.string.cancel), new a());
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f77914b;

        h(View view) {
            this.f77914b = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23126, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameBindingFragment.this.f77882j = true;
            com.max.hbcache.c.C("bind_card_collapsed", "true");
            if (GameBindingFragment.this.mBindingTabLinearLayout.getVisibility() != 0) {
                GameBindingFragment.d4(GameBindingFragment.this, this.f77914b, false);
            } else {
                this.f77914b.setVisibility(8);
                GameBindingFragment.c4(GameBindingFragment.this);
            }
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f77916b;

        i(View view) {
            this.f77916b = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23127, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameBindingFragment.d4(GameBindingFragment.this, this.f77916b, true);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23128, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameBindingFragment.this).mContext);
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f77919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BindInfoObj f77920c;

        k(Context context, BindInfoObj bindInfoObj) {
            this.f77919b = context;
            this.f77920c = bindInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23129, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f77919b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", String.format(lb.a.f131040s2, this.f77920c.getHelp_url_value()));
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.help));
            this.f77919b.startActivity(intent);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BindInfoObj f77922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f77923c;

        l(BindInfoObj bindInfoObj, TextView textView) {
            this.f77922b = bindInfoObj;
            this.f77923c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23130, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameBindingFragment.M3(GameBindingFragment.this, this.f77922b.getServer(), this.f77923c);
        }
    }

    public static class m extends com.max.hbcommon.network.d<GameBindInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<GameBindingFragment> f77925b;

        public m(GameBindingFragment gameBindingFragment) {
            this.f77925b = new WeakReference<>(gameBindingFragment);
        }

        public void a(GameBindInfoObj gameBindInfoObj) {
            if (PatchProxy.proxy(new Object[]{gameBindInfoObj}, this, changeQuickRedirect, false, 23131, new Class[]{GameBindInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(gameBindInfoObj);
            GameBindingFragment gameBindingFragment = this.f77925b.get();
            if (gameBindingFragment == null) {
                return;
            }
            gameBindingFragment.f77883k = gameBindInfoObj;
            if (gameBindingFragment.isActive()) {
                gameBindingFragment.r4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23132, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((GameBindInfoObj) obj);
        }
    }

    public interface n {
        void B1(String str);

        void C0(String str, Throwable th2);

        boolean g2(String str, View view, EditText editText);

        void m1(String str);

        void u1(String str);

        void w2(String str, Throwable th2);
    }

    static /* synthetic */ void M3(GameBindingFragment gameBindingFragment, List list, TextView textView) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment, list, textView}, null, changeQuickRedirect, true, 23106, new Class[]{GameBindingFragment.class, List.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.y4(list, textView);
    }

    static /* synthetic */ void R3(GameBindingFragment gameBindingFragment, View view) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment, view}, null, changeQuickRedirect, true, 23107, new Class[]{GameBindingFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.k4(view);
    }

    static /* synthetic */ void S3(GameBindingFragment gameBindingFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment, str, str2}, null, changeQuickRedirect, true, 23108, new Class[]{GameBindingFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.f4(str, str2);
    }

    static /* synthetic */ void T3(GameBindingFragment gameBindingFragment) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment}, null, changeQuickRedirect, true, 23109, new Class[]{GameBindingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.x4();
    }

    static /* synthetic */ void U3(GameBindingFragment gameBindingFragment, String str, String str2, String str3, int i10, Map map) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment, str, str2, str3, new Integer(i10), map}, null, changeQuickRedirect, true, 23110, new Class[]{GameBindingFragment.class, String.class, String.class, String.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.i4(str, str2, str3, i10, map);
    }

    static /* synthetic */ void Y3(GameBindingFragment gameBindingFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23103, new Class[]{GameBindingFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.t4(z10);
    }

    static /* synthetic */ void c4(GameBindingFragment gameBindingFragment) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment}, null, changeQuickRedirect, true, 23104, new Class[]{GameBindingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.s4();
    }

    static /* synthetic */ void d4(GameBindingFragment gameBindingFragment, View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameBindingFragment, view, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23105, new Class[]{GameBindingFragment.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameBindingFragment.z4(view, z10);
    }

    private void f4(String str, String str2) {
        io.reactivex.z<Result<StateObj>> zVarB0;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 23097, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (l4()) {
            this.f77874b.setVisibility(0);
            this.f77875c.setVisibility(4);
            this.f77876d.setVisibility(4);
        }
        String str3 = null;
        if ("psn".equals(str2)) {
            zVarB0 = com.max.xiaoheihe.network.i.a().Vb(str, str2, null);
        } else if ("xbox".equals(str2)) {
            zVarB0 = com.max.xiaoheihe.network.i.a().fb(str, str2);
        } else {
            str3 = this.f77884l;
            zVarB0 = com.max.xiaoheihe.network.i.a().B0(str, str2, str3);
        }
        addDisposable((io.reactivex.disposables.b) zVarB0.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str2, str, str3)));
    }

    private Drawable g4(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 23093, new Class[]{Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, com.max.hbutils.utils.q.o(this.mContext, R.color.white_alpha50, f10));
        stateListDrawable.addState(new int[0], com.max.hbutils.utils.q.o(this.mContext, R.color.white_alpha25, f10));
        return stateListDrawable;
    }

    private Drawable h4(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 23092, new Class[]{Float.TYPE}, Drawable.class);
        return patchProxyResultProxy.isSupported ? (Drawable) patchProxyResultProxy.result : com.max.hbutils.utils.q.o(this.mContext, R.color.white, f10);
    }

    private void i4(String str, String str2, String str3, int i10, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Integer(i10), map}, this, changeQuickRedirect, false, 23100, new Class[]{String.class, String.class, String.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        String str4 = (map == null || map.isEmpty()) ? str2 : null;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t4(str, str4, str3, map2).w1((i10 - 1) * 2, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str2, "1".equals(map2.get("unbind")), i10, str, str3, map2)));
    }

    private Drawable j4(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 23094, new Class[]{Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, com.max.hbutils.utils.q.o(this.mContext, R.color.white_alpha10, f10));
        stateListDrawable.addState(new int[0], com.max.hbutils.utils.q.o(this.mContext, R.color.white_alpha20, f10));
        return stateListDrawable;
    }

    private void k4(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23102, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.mContext.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private boolean l4() {
        return (this.f77874b == null || this.f77875c == null || this.f77876d == null) ? false : true;
    }

    public static GameBindingFragment m4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 23078, new Class[]{String.class}, GameBindingFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameBindingFragment) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return n4(B, arrayList);
    }

    public static GameBindingFragment n4(String str, ArrayList<String> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, arrayList}, null, changeQuickRedirect, true, 23079, new Class[]{String.class, ArrayList.class}, GameBindingFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameBindingFragment) patchProxyResultProxy.result;
        }
        GameBindingFragment gameBindingFragment = new GameBindingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        bundle.putStringArrayList(f77864q, arrayList);
        gameBindingFragment.setArguments(bundle);
        return gameBindingFragment;
    }

    public static GameBindingFragment o4(String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23077, new Class[]{String.class, Boolean.TYPE}, GameBindingFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameBindingFragment) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        GameBindingFragment gameBindingFragment = new GameBindingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", B);
        bundle.putBoolean(f77865r, z10);
        bundle.putStringArrayList(f77864q, arrayList);
        gameBindingFragment.setArguments(bundle);
        return gameBindingFragment;
    }

    private void s4() {
        int childCount;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23090, new Class[0], Void.TYPE).isSupported && (childCount = this.mBindingTabLinearLayout.getChildCount()) > 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                if (this.mBindingTabLinearLayout.getChildAt(i10) instanceof ImageView) {
                    ImageView imageView = (ImageView) this.mBindingTabLinearLayout.getChildAt(i10);
                    if (!(imageView.getTag(R.id.rb_0) instanceof String)) {
                        return;
                    }
                    String str = (String) imageView.getTag(R.id.rb_0);
                    if (this.f77882j) {
                        imageView.setAlpha(1.0f);
                    } else {
                        imageView.setAlpha(str.equals(this.f77881i) ? 1.0f : 0.3f);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t4(boolean z10) {
        ArrayList<String> arrayList;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23088, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (arrayList = this.f77878f) == null) {
            return;
        }
        int size = arrayList.size();
        if (this.mBindingTabLinearLayout.getChildCount() > 0 && !z10) {
            s4();
        } else if (size > 1) {
            this.mBindingTabLinearLayout.removeAllViews();
            int iL = (int) (ViewUtils.L(this.mContext) * 0.11f);
            int i10 = iL * 2;
            int i11 = 0;
            while (i11 < this.f77878f.size()) {
                QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(this.mContext);
                qMUIRadiusImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, iL);
                layoutParams.leftMargin = i11 == 0 ? 0 : ViewUtils.f(this.mContext, 4.0f);
                qMUIRadiusImageView.setLayoutParams(layoutParams);
                qMUIRadiusImageView.setCornerRadius(ViewUtils.m(this.mContext, i10, iL));
                String str = this.f77878f.get(i11);
                qMUIRadiusImageView.setTag(R.id.rb_0, str);
                this.mBindingTabLinearLayout.addView(qMUIRadiusImageView);
                Drawable drawableD = com.max.xiaoheihe.module.game.n0.d(this.mContext, str);
                if (drawableD != null) {
                    qMUIRadiusImageView.setImageDrawable(drawableD);
                } else {
                    com.max.hbimage.b.K(com.max.xiaoheihe.module.game.n0.c().e(this.mContext, str), qMUIRadiusImageView);
                }
                qMUIRadiusImageView.setAlpha((this.f77882j || str.equals(this.f77881i)) != false ? 1.0f : 0.3f);
                qMUIRadiusImageView.setOnClickListener(new d(str));
                i11++;
            }
            if (this.f77885m) {
                LinearLayout linearLayout = new LinearLayout(this.mContext);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, iL);
                layoutParams2.leftMargin = ViewUtils.f(this.mContext, 4.0f);
                linearLayout.setLayoutParams(layoutParams2);
                linearLayout.setGravity(17);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundResource(R.drawable.topic_bg_2dp);
                linearLayout.setOnClickListener(new e());
                ImageView imageView = new ImageView(this.mContext);
                int iF = ViewUtils.f(this.mContext, 14.0f);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(iF, iF));
                imageView.setImageResource(R.drawable.common_card_42x42);
                imageView.setColorFilter(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                linearLayout.addView(imageView);
                TextView textView = new TextView(this.mContext);
                textView.setText(R.string.change_to_small_card);
                textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                textView.setTextSize(ViewUtils.g(this.mContext, 10.0f));
                textView.setPadding(ViewUtils.f(this.mContext, 4.0f), 0, 0, 0);
                linearLayout.addView(textView);
                this.mBindingTabLinearLayout.addView(linearLayout);
            }
        }
        if (this.f77882j) {
            this.mBindingContainerFrameLayout.setPadding(0, 0, 0, 0);
        } else {
            this.mBindingContainerFrameLayout.setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, 0);
        }
        if ((C.equals(this.f77877e) || D.equals(this.f77877e)) && size <= 1) {
            z11 = true;
        }
        u4(this.mBindCardView, this.f77881i);
        z4(this.mBindCardView, true ^ z11);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x015d  */
    /* JADX WARN: Code duplicated, block: B:24:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:28:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:29:0x0204  */
    /* JADX WARN: Code duplicated, block: B:32:0x0213  */
    /* JADX WARN: Code duplicated, block: B:33:0x023e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0260  */
    /* JADX WARN: Code duplicated, block: B:36:0x0270  */
    /* JADX WARN: Code duplicated, block: B:39:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0314  */
    /* JADX WARN: Code duplicated, block: B:42:0x031f  */
    /* JADX WARN: Code duplicated, block: B:43:0x032f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0340  */
    /* JADX WARN: Code duplicated, block: B:47:0x0349  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    private void u4(View view, String str) {
        String str2;
        int iL;
        int i10;
        ViewGroup.LayoutParams layoutParams;
        float fH0;
        BindInfoObj bindInfoObjA;
        EditText editText;
        int i11;
        com.bumptech.glide.j jVarZ;
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 23095, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        boolean zS = com.max.xiaoheihe.utils.i0.s();
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.vg_expanded_card);
        this.f77874b = (ProgressBar) view.findViewById(R.id.pb_loading);
        this.f77875c = view.findViewById(R.id.vg_edit);
        View viewFindViewById2 = view.findViewById(R.id.vg_servers);
        TextView textView = (TextView) view.findViewById(R.id.tv_server);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_server);
        EditText editText2 = (EditText) view.findViewById(R.id.et_name);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_bind);
        this.f77876d = view.findViewById(R.id.vg_bind);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_dont_display);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_dont_display_tiny);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_game_logo);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_game_name);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_bg_img);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_collapse);
        TextView textView7 = (TextView) view.findViewById(R.id.tv_help);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_slogan_img);
        TextView textView8 = (TextView) view.findViewById(R.id.tv_bind_tips);
        View viewFindViewById3 = view.findViewById(R.id.vg_collapsed_card);
        CardView cardView = (CardView) view;
        editText2.setText("");
        if (!C.equals(this.f77877e)) {
            String str3 = this.f77877e;
            str2 = C;
            if (!D.equals(str3)) {
                textView6.setVisibility(8);
            }
            viewFindViewById3.setOnClickListener(new i(view));
            iL = ViewUtils.L(context) - ViewUtils.f(context, 8.0f);
            i10 = (int) (((iL * 232.0f) / 367.0f) + 0.5f);
            layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams.width == iL || layoutParams.height != i10) {
                layoutParams.width = iL;
                layoutParams.height = i10;
                viewFindViewById.setLayoutParams(layoutParams);
            }
            v4(view, str);
            this.f77875c.setVisibility(0);
            Activity activity = this.mContext;
            cardView.setRadius(ViewUtils.m(activity, ViewUtils.L(activity), ViewUtils.V(viewFindViewById)));
            Activity activity2 = this.mContext;
            float fH1 = ViewUtils.h0(activity2, ViewUtils.m(activity2, ViewUtils.W(textView3), ViewUtils.f(this.mContext, 24.0f)));
            textView3.setBackground(j4(fH1));
            textView6.setBackground(j4(fH1));
            textView7.setBackground(j4(fH1));
            Activity activity3 = this.mContext;
            fH0 = ViewUtils.h0(activity3, ViewUtils.m(activity3, ViewUtils.W(textView2), ViewUtils.V(textView2)));
            bindInfoObjA = com.max.xiaoheihe.module.game.n0.c().a(str);
            if (bindInfoObjA != null) {
                com.max.hbimage.b.K(bindInfoObjA.getShrink_logo_img(), imageView2);
                textView5.setText(bindInfoObjA.getDisplay_text());
                if (com.max.hbcommon.utils.c.u(bindInfoObjA.getTitle_img())) {
                    imageView4.setImageDrawable(null);
                } else {
                    jVarZ = com.max.hbimage.b.z(imageView4);
                    if (jVarZ != null) {
                        jVarZ.load(bindInfoObjA.getTitle_img()).i(new com.bumptech.glide.request.h().B0(Integer.MIN_VALUE, Integer.MIN_VALUE)).C1(imageView4);
                    }
                }
                if ("1".equals(bindInfoObjA.getInput_style())) {
                    this.f77875c.setBackground(g4(fH0));
                    editText = editText2;
                    editText.setHintTextColor(getResources().getColor(R.color.white));
                    editText.setHint(bindInfoObjA.getInput_desc());
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);
                    editText.setOnClickListener(null);
                } else {
                    this.f77875c.setBackground(h4(fH0));
                    editText.setHintTextColor(getResources().getColor(R.color.text_secondary_2_color));
                    editText.setHint(bindInfoObjA.getInput_desc());
                    if (zS) {
                        editText = editText2;
                        editText.setFocusable(true);
                        editText.setFocusableInTouchMode(true);
                        editText.setOnClickListener(null);
                    } else {
                        editText = editText2;
                        editText.setFocusable(false);
                        editText.setFocusableInTouchMode(false);
                        editText.setOnClickListener(new j());
                    }
                }
                textView2.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.mContext, fH0), com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getBind_bg_color()), com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getBind_bg_color())));
                textView2.setTextColor(com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getBind_text_color()));
                textView2.setText(bindInfoObjA.getBind_desc());
                textView8.setTextColor(com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getTips_desc_color()));
                textView8.setText(bindInfoObjA.getTips_desc());
                com.max.hbimage.b.K(bindInfoObjA.getBg_img(), imageView3);
                textView7.setVisibility(0);
                textView7.setOnClickListener(new k(context, bindInfoObjA));
                if (com.max.hbcommon.utils.c.w(bindInfoObjA.getServer())) {
                    i11 = 8;
                    viewFindViewById2.setVisibility(8);
                } else {
                    viewFindViewById2.setVisibility(0);
                    this.f77884l = bindInfoObjA.getServer().get(0).getKey();
                    textView.setText(bindInfoObjA.getServer().get(0).getValue());
                    if (bindInfoObjA.getServer().size() == 1) {
                        i11 = 8;
                        imageView.setVisibility(8);
                        textView.setOnClickListener(null);
                    } else {
                        i11 = 8;
                        imageView.setVisibility(0);
                        viewFindViewById2.setOnClickListener(new l(bindInfoObjA, textView));
                    }
                }
                if (str2.equals(this.f77877e)) {
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                } else {
                    textView3.setVisibility(i11);
                    textView4.setVisibility(i11);
                }
                textView2.setOnClickListener(new a(str, textView2, editText, bindInfoObjA));
            }
        }
        str2 = C;
        textView6.setVisibility(0);
        textView6.setOnClickListener(new h(view));
        viewFindViewById3.setOnClickListener(new i(view));
        iL = ViewUtils.L(context) - ViewUtils.f(context, 8.0f);
        i10 = (int) (((iL * 232.0f) / 367.0f) + 0.5f);
        layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams.width == iL) {
            layoutParams.width = iL;
            layoutParams.height = i10;
            viewFindViewById.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = iL;
            layoutParams.height = i10;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        v4(view, str);
        this.f77875c.setVisibility(0);
        Activity activity4 = this.mContext;
        cardView.setRadius(ViewUtils.m(activity4, ViewUtils.L(activity4), ViewUtils.V(viewFindViewById)));
        Activity activity5 = this.mContext;
        float fH2 = ViewUtils.h0(activity5, ViewUtils.m(activity5, ViewUtils.W(textView3), ViewUtils.f(this.mContext, 24.0f)));
        textView3.setBackground(j4(fH2));
        textView6.setBackground(j4(fH2));
        textView7.setBackground(j4(fH2));
        Activity activity6 = this.mContext;
        fH0 = ViewUtils.h0(activity6, ViewUtils.m(activity6, ViewUtils.W(textView2), ViewUtils.V(textView2)));
        bindInfoObjA = com.max.xiaoheihe.module.game.n0.c().a(str);
        if (bindInfoObjA != null) {
            com.max.hbimage.b.K(bindInfoObjA.getShrink_logo_img(), imageView2);
            textView5.setText(bindInfoObjA.getDisplay_text());
            if (com.max.hbcommon.utils.c.u(bindInfoObjA.getTitle_img())) {
                jVarZ = com.max.hbimage.b.z(imageView4);
                if (jVarZ != null) {
                    jVarZ.load(bindInfoObjA.getTitle_img()).i(new com.bumptech.glide.request.h().B0(Integer.MIN_VALUE, Integer.MIN_VALUE)).C1(imageView4);
                }
            } else {
                imageView4.setImageDrawable(null);
            }
            if ("1".equals(bindInfoObjA.getInput_style())) {
                this.f77875c.setBackground(g4(fH0));
                editText = editText2;
                editText.setHintTextColor(getResources().getColor(R.color.white));
                editText.setHint(bindInfoObjA.getInput_desc());
                editText.setFocusable(false);
                editText.setFocusableInTouchMode(false);
                editText.setOnClickListener(null);
            } else {
                this.f77875c.setBackground(h4(fH0));
                editText.setHintTextColor(getResources().getColor(R.color.text_secondary_2_color));
                editText.setHint(bindInfoObjA.getInput_desc());
                if (zS) {
                    editText = editText2;
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);
                    editText.setOnClickListener(new j());
                } else {
                    editText = editText2;
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.setOnClickListener(null);
                }
            }
            textView2.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.mContext, fH0), com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getBind_bg_color()), com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getBind_bg_color())));
            textView2.setTextColor(com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getBind_text_color()));
            textView2.setText(bindInfoObjA.getBind_desc());
            textView8.setTextColor(com.max.xiaoheihe.utils.d.e1(bindInfoObjA.getTips_desc_color()));
            textView8.setText(bindInfoObjA.getTips_desc());
            com.max.hbimage.b.K(bindInfoObjA.getBg_img(), imageView3);
            textView7.setVisibility(0);
            textView7.setOnClickListener(new k(context, bindInfoObjA));
            if (com.max.hbcommon.utils.c.w(bindInfoObjA.getServer())) {
                viewFindViewById2.setVisibility(0);
                this.f77884l = bindInfoObjA.getServer().get(0).getKey();
                textView.setText(bindInfoObjA.getServer().get(0).getValue());
                if (bindInfoObjA.getServer().size() == 1) {
                    i11 = 8;
                    imageView.setVisibility(8);
                    textView.setOnClickListener(null);
                } else {
                    i11 = 8;
                    imageView.setVisibility(0);
                    viewFindViewById2.setOnClickListener(new l(bindInfoObjA, textView));
                }
            } else {
                i11 = 8;
                viewFindViewById2.setVisibility(8);
            }
            if (str2.equals(this.f77877e)) {
                textView3.setVisibility(0);
                textView4.setVisibility(0);
            } else {
                textView3.setVisibility(i11);
                textView4.setVisibility(i11);
            }
            textView2.setOnClickListener(new a(str, textView2, editText, bindInfoObjA));
        }
    }

    private void v4(View view, String str) {
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 23091, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_dont_display);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_dont_display_tiny);
        g gVar = new g(r1.U(str), str);
        textView.setOnClickListener(gVar);
        textView2.setOnClickListener(gVar);
    }

    private void x4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23101, new Class[0], Void.TYPE).isSupported && l4()) {
            this.f77874b.setVisibility(4);
            this.f77875c.setVisibility(0);
            this.f77876d.setVisibility(0);
        }
    }

    private void y4(List<KeyDescObj> list, TextView textView) {
        if (PatchProxy.proxy(new Object[]{list, textView}, this, changeQuickRedirect, false, 23089, new Class[]{List.class, TextView.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (KeyDescObj keyDescObj : list) {
            String str = this.f77884l;
            keyDescObj.setChecked(str != null && str.equals(keyDescObj.getKey()));
            keyDescObj.setDesc(keyDescObj.getValue());
        }
        if (this.f77884l == null) {
            list.get(0).setChecked(true);
        }
        arrayList.addAll(list);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new f(textView));
        heyBoxPopupMenu.show();
    }

    private void z4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23096, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.vg_collapsed_card);
        View viewFindViewById2 = view.findViewById(R.id.vg_expanded_card);
        if (z10) {
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(0);
            viewFindViewById2.setVisibility(8);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23082, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(getParentFragment() instanceof MehomefragmentV2 ? R.layout.fragment_game_binding_scrollable : R.layout.fragment_game_binding);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f77877e = getArguments().getString("from");
            this.f77878f = getArguments().getStringArrayList(f77864q);
            this.f77879g = getArguments().getBoolean(f77865r, false);
        }
        if (this.f77879g) {
            this.llGameBinding.setBackgroundColor(0);
        }
        com.max.xiaoheihe.module.game.n0.c().f(new m(this));
        if (com.max.hbcommon.utils.c.w(this.f77878f)) {
            return;
        }
        w4(this.f77877e, this.f77878f, false);
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        n nVar;
        n nVar2;
        n nVar3;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23085, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            n nVar4 = this.f77880h;
            if (nVar4 != null) {
                nVar4.B1("steam");
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (i11 != -1 || intent == null || !intent.getBooleanExtra("bind_ow", false) || (nVar3 = this.f77880h) == null) {
                return;
            }
            nVar3.B1(lb.a.M0);
            return;
        }
        if (i10 == 3) {
            if (i11 != -1 || intent == null || !intent.getBooleanExtra(ProxyManager.f91544j, false) || (nVar2 = this.f77880h) == null) {
                return;
            }
            nVar2.B1(lb.a.R0);
            return;
        }
        if (i10 == 5) {
            n nVar5 = this.f77880h;
            if (nVar5 != null) {
                nVar5.B1(lb.a.T0);
                return;
            }
            return;
        }
        if (i10 == 6) {
            n nVar6 = this.f77880h;
            if (nVar6 != null) {
                nVar6.B1("csgo");
                return;
            }
            return;
        }
        if (i10 != 7 || (nVar = this.f77880h) == null) {
            return;
        }
        nVar.B1(lb.a.V0);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 23080, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof n) {
            this.f77880h = (n) getParentFragment();
            return;
        }
        if (context instanceof n) {
            this.f77880h = (n) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement GameBindingListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23081, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f77880h = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23083, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        UpdateBindStateBroadcastReceiver updateBindStateBroadcastReceiver = new UpdateBindStateBroadcastReceiver(this, null);
        this.f77886n = updateBindStateBroadcastReceiver;
        registerReceiver(updateBindStateBroadcastReceiver, lb.a.T);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23084, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f77886n);
    }

    public void p4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23098, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        q4(str, null);
    }

    public void q4(String str, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 23099, new Class[]{String.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        i4(null, str, null, 1, map);
        n nVar = this.f77880h;
        if (nVar != null) {
            nVar.u1(str);
        }
    }

    public void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23087, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f77878f == null) {
            if (isActive()) {
                this.mBindGamesCardView.setVisibility(8);
                return;
            }
            return;
        }
        if (C.equals(this.f77877e)) {
            Iterator<String> it = this.f77878f.iterator();
            while (it.hasNext()) {
                if ("true".equals(com.max.hbcache.c.o(E + it.next(), ""))) {
                    it.remove();
                }
            }
        }
        if (this.f77878f.isEmpty()) {
            this.mBindGamesCardView.setVisibility(8);
            return;
        }
        this.mBindGamesCardView.setVisibility(0);
        if (this.f77878f.size() <= 1) {
            this.mBindingTabLinearLayout.setVisibility(8);
            this.f77882j = false;
        } else {
            this.mBindingTabLinearLayout.setVisibility(0);
            this.f77882j = "true".equals(com.max.hbcache.c.o("bind_card_collapsed", "")) || C.equals(this.f77877e);
        }
        this.f77881i = this.f77882j ? null : this.f77878f.get(0);
        t4(true);
    }

    public void w4(String str, ArrayList<String> arrayList, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, arrayList, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23086, new Class[]{String.class, ArrayList.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f77877e = str;
        this.f77878f = arrayList;
        this.f77885m = z10;
        r4();
    }
}
