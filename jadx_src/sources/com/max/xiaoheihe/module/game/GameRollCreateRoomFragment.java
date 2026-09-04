package com.max.xiaoheihe.module.game;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.core.view.n3;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.RollCouponListFragment;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameRollItemWrapperObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.cx;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameRollCreateRoomFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f84687z = 10;

    @BindView(R.id.bottom_button)
    BottomButtonLeftItemView bottom_button;

    @BindView(R.id.et_get_prize_user_num)
    EditText mGetPrizeUserNumEditText;

    @BindView(R.id.rv_item_list)
    RecyclerView mItemListRecyclerView;

    @BindView(R.id.vg_item_title)
    View mItemTitleView;

    @BindView(R.id.vg_roll_limit)
    View mRollLimitView;

    @BindView(R.id.et_roll_need_pwd)
    EditText mRollNeedPwdEditText;

    @BindView(R.id.vg_roll_need_pwd)
    View mRollNeedPwdView;

    @BindView(R.id.et_roll_room_desc)
    EditText mRollRoomDescEditText;

    @BindView(R.id.tv_roll_time)
    TextView mRollTimeTextView;

    @BindView(R.id.vg_roll_time)
    View mRollTimeView;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f84688p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<GameRollItemWrapperObj> f84690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView.ItemDecoration f84691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RecyclerView.OnItemTouchListener f84692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Calendar f84693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f84694v;

    @BindView(R.id.vg_roll_encryption_switch)
    SettingItemView vg_roll_encryption_switch;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LoadingDialog f84695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private OnCouponCheckBroadcastReceiver f84696x;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<GameRollItemWrapperObj> f84689q = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f84697y = false;

    public class OnCouponCheckBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private OnCouponCheckBroadcastReceiver() {
        }

        /* synthetic */ OnCouponCheckBroadcastReceiver(GameRollCreateRoomFragment gameRollCreateRoomFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArrayList<MallCouponObj> arrayList;
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 33608, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported || intent == null || (arrayList = (ArrayList) intent.getSerializableExtra(RollCouponListFragment.f74138y)) == null) {
                return;
            }
            GameRollCreateRoomFragment.this.f84689q.clear();
            GameRollItemWrapperObj gameRollItemWrapperObj = new GameRollItemWrapperObj();
            gameRollItemWrapperObj.setItemType(1);
            GameRollCreateRoomFragment.this.f84689q.add(gameRollItemWrapperObj);
            for (MallCouponObj mallCouponObj : arrayList) {
                GameRollItemWrapperObj gameRollItemWrapperObj2 = new GameRollItemWrapperObj();
                gameRollItemWrapperObj2.setItemType(0);
                gameRollItemWrapperObj2.setItem(mallCouponObj);
                GameRollCreateRoomFragment.this.f84689q.add(gameRollItemWrapperObj2);
            }
            GameRollCreateRoomFragment.this.f84690r.notifyDataSetChanged();
            GameRollCreateRoomFragment.X4(GameRollCreateRoomFragment.this);
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33590, new Class[]{View.class}, Void.TYPE).isSupported && GameRollCreateRoomFragment.J4(GameRollCreateRoomFragment.this)) {
                GameRollCreateRoomFragment.K4(GameRollCreateRoomFragment.this);
            }
        }
    }

    public class b extends com.max.hbcommon.base.adapter.u<GameRollItemWrapperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33594, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable(RollCouponListFragment.f74136w, GameRollCreateRoomFragment.S4(GameRollCreateRoomFragment.this));
                bundle.putBoolean(RollCouponListFragment.f74137x, true);
                com.max.xiaoheihe.module.littleprogram.b.p(((com.max.hbcommon.base.d) GameRollCreateRoomFragment.this).mContext, com.max.xiaoheihe.module.littleprogram.b.f88740a.d(), bundle);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameRollCreateRoomFragment$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0750b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            ViewOnClickListenerC0750b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameRollItemWrapperObj f84703b;

            c(GameRollItemWrapperObj gameRollItemWrapperObj) {
                this.f84703b = gameRollItemWrapperObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33595, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int iIndexOf = GameRollCreateRoomFragment.this.f84689q.indexOf(this.f84703b);
                GameRollCreateRoomFragment.this.f84689q.remove(iIndexOf);
                GameRollCreateRoomFragment.this.f84690r.notifyItemRemoved(iIndexOf);
                GameRollCreateRoomFragment.X4(GameRollCreateRoomFragment.this);
            }
        }

        b(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameRollItemWrapperObj gameRollItemWrapperObj) {
            Object[] objArr = {new Integer(i10), gameRollItemWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33592, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameRollItemWrapperObj);
        }

        public int n(int i10, GameRollItemWrapperObj gameRollItemWrapperObj) {
            return R.layout.item_room_create_item;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, GameRollItemWrapperObj gameRollItemWrapperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameRollItemWrapperObj}, this, changeQuickRedirect, false, 33591, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRollItemWrapperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar.b();
            viewB.setTag(gameRollItemWrapperObj);
            cx cxVarA = cx.a(eVar.b());
            if (1 == gameRollItemWrapperObj.getItemType()) {
                cxVarA.f109539c.setImageResource(R.color.background_card_1_color);
                cxVarA.f109538b.setVisibility(0);
                cxVarA.f109542f.setVisibility(8);
                cxVarA.f109540d.setText("");
                cxVarA.f109541e.setText("");
                viewB.setOnClickListener(new a());
                return;
            }
            MallCouponObj item = gameRollItemWrapperObj.getItem();
            cxVarA.f109538b.setVisibility(8);
            cxVarA.f109542f.setVisibility(0);
            com.max.hbimage.b.K(item.getImage_url(), cxVarA.f109539c);
            cxVarA.f109541e.setText(item.getName());
            cxVarA.f109540d.setText(item.getDescription());
            viewB.setOnClickListener(new ViewOnClickListenerC0750b());
            cxVarA.f109542f.setBackgroundDrawable(ViewUtils.j(ViewUtils.f(((com.max.hbcommon.base.d) GameRollCreateRoomFragment.this).mContext, 8.0f), com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_not_change_color)));
            cxVarA.f109542f.setOnClickListener(new c(gameRollItemWrapperObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 33593, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (GameRollItemWrapperObj) obj);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Calendar f84705b;

        public class a implements DatePickerDialog.OnDateSetListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameRollCreateRoomFragment$c$a$a, reason: collision with other inner class name */
            public class C0751a implements TimePickerDialog.OnTimeSetListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0751a() {
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public void onTimeSet(TimePicker timePicker, int i10, int i11) {
                    Object[] objArr = {timePicker, new Integer(i10), new Integer(i11)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    Class cls = Integer.TYPE;
                    if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33598, new Class[]{TimePicker.class, cls, cls}, Void.TYPE).isSupported) {
                        return;
                    }
                    GameRollCreateRoomFragment.this.f84693u.set(11, i10);
                    GameRollCreateRoomFragment.this.f84693u.set(12, i11);
                    if (GameRollCreateRoomFragment.this.f84693u.getTimeInMillis() < System.currentTimeMillis()) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("不能早于当前时间");
                        GameRollCreateRoomFragment.this.f84693u.setTimeInMillis(System.currentTimeMillis());
                        GameRollCreateRoomFragment.this.f84693u.add(11, 1);
                    }
                    GameRollCreateRoomFragment.L4(GameRollCreateRoomFragment.this);
                }
            }

            a() {
            }

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                Object[] objArr = {datePicker, new Integer(i10), new Integer(i11), new Integer(i12)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33597, new Class[]{DatePicker.class, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                GameRollCreateRoomFragment.this.f84693u.set(i10, i11, i12);
                GameRollCreateRoomFragment.L4(GameRollCreateRoomFragment.this);
                new TimePickerDialog(((com.max.hbcommon.base.d) GameRollCreateRoomFragment.this).mContext, new C0751a(), GameRollCreateRoomFragment.this.f84693u.get(11), GameRollCreateRoomFragment.this.f84693u.get(12), true).show();
            }
        }

        c(Calendar calendar) {
            this.f84705b = calendar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33596, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(((com.max.hbcommon.base.d) GameRollCreateRoomFragment.this).mContext, new a(), GameRollCreateRoomFragment.this.f84693u.get(1), GameRollCreateRoomFragment.this.f84693u.get(2), GameRollCreateRoomFragment.this.f84693u.get(5));
            datePickerDialog.getDatePicker().setMinDate(this.f84705b.getTimeInMillis());
            datePickerDialog.show();
        }
    }

    public class d implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33599, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported || z10) {
                return;
            }
            GameRollCreateRoomFragment.J4(GameRollCreateRoomFragment.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33600, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("功能测试中，后续将逐步开放");
        }
    }

    public class f implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33601, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameRollCreateRoomFragment.this.mRollNeedPwdView.setVisibility(z10 ? 0 : 8);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33603, new Class[0], Void.TYPE).isSupported && GameRollCreateRoomFragment.this.isActive()) {
                super.onComplete();
                if (GameRollCreateRoomFragment.this.f84695w != null) {
                    GameRollCreateRoomFragment.this.f84695w.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33602, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameRollCreateRoomFragment.this.isActive()) {
                super.onError(th2);
                if (GameRollCreateRoomFragment.this.f84695w != null) {
                    GameRollCreateRoomFragment.this.f84695w.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33604, new Class[]{Result.class}, Void.TYPE).isSupported && GameRollCreateRoomFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameRollCreateRoomFragment.this.getString(R.string.create_succeed));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ((com.max.hbcommon.base.d) GameRollCreateRoomFragment.this).mContext.sendBroadcast(new Intent(lb.a.f131067x));
                ((com.max.hbcommon.base.d) GameRollCreateRoomFragment.this).mContext.onBackPressed();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33605, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class h extends com.max.hbcommon.network.p {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.p
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33606, new Class[]{Result.class}, Void.TYPE).isSupported && GameRollCreateRoomFragment.this.isActive()) {
                super.onNext(result);
                if (((Boolean) result.getKeyMap().get("acknowledged")).booleanValue()) {
                    GameRollCreateRoomFragment.this.f84697y = true;
                }
                GameRollCreateRoomFragment.R4(GameRollCreateRoomFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.p, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33607, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ boolean J4(GameRollCreateRoomFragment gameRollCreateRoomFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRollCreateRoomFragment}, null, changeQuickRedirect, true, 33584, new Class[]{GameRollCreateRoomFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gameRollCreateRoomFragment.a5();
    }

    static /* synthetic */ void K4(GameRollCreateRoomFragment gameRollCreateRoomFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollCreateRoomFragment}, null, changeQuickRedirect, true, 33585, new Class[]{GameRollCreateRoomFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollCreateRoomFragment.c5();
    }

    static /* synthetic */ void L4(GameRollCreateRoomFragment gameRollCreateRoomFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollCreateRoomFragment}, null, changeQuickRedirect, true, 33588, new Class[]{GameRollCreateRoomFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollCreateRoomFragment.i5();
    }

    static /* synthetic */ void R4(GameRollCreateRoomFragment gameRollCreateRoomFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollCreateRoomFragment}, null, changeQuickRedirect, true, 33589, new Class[]{GameRollCreateRoomFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollCreateRoomFragment.j5();
    }

    static /* synthetic */ ArrayList S4(GameRollCreateRoomFragment gameRollCreateRoomFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRollCreateRoomFragment}, null, changeQuickRedirect, true, 33586, new Class[]{GameRollCreateRoomFragment.class}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : gameRollCreateRoomFragment.d5();
    }

    static /* synthetic */ void X4(GameRollCreateRoomFragment gameRollCreateRoomFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollCreateRoomFragment}, null, changeQuickRedirect, true, 33587, new Class[]{GameRollCreateRoomFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollCreateRoomFragment.h5();
    }

    private boolean a5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33580, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int size = e5().size();
        if (size <= 0) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.add_game_to_jackpot_plz));
            return false;
        }
        int iQ = com.max.hbutils.utils.n.q(this.mGetPrizeUserNumEditText.getText().toString());
        this.f84694v = iQ;
        if (iQ <= 0 || iQ > size) {
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.set_people_less));
            return false;
        }
        if (!this.vg_roll_encryption_switch.c() || !com.max.hbcommon.utils.c.u(this.mRollNeedPwdEditText.getText().toString())) {
            return true;
        }
        com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(getString(R.string.plz_input_room_pwd));
        return false;
    }

    private void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33577, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().M6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33576, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84695w = new LoadingDialog(this.mContext, getString(R.string.commiting), false).r();
        JsonObject jsonObject = new JsonObject();
        String string = this.mRollRoomDescEditText.getText().toString();
        if (!com.max.hbcommon.utils.c.u(string)) {
            jsonObject.addProperty("room_desc", string);
        }
        jsonObject.addProperty("roll_time", Long.valueOf(com.max.hbutils.utils.w.P(this.f84693u.getTimeInMillis())));
        jsonObject.addProperty("get_prize_user_num", Integer.valueOf(this.f84694v));
        String string2 = this.mRollNeedPwdEditText.getText().toString();
        if (!com.max.hbcommon.utils.c.u(string2)) {
            jsonObject.addProperty("passwd", string2);
        }
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = e5().iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.addProperty("coupon_ids", jsonArray.toString());
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.p(jsonObject));
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Bb(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private ArrayList<MallCouponObj> d5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33582, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<MallCouponObj> arrayList = new ArrayList<>();
        for (GameRollItemWrapperObj gameRollItemWrapperObj : this.f84689q) {
            if (gameRollItemWrapperObj.getItemType() == 0) {
                arrayList.add(gameRollItemWrapperObj.getItem());
            }
        }
        return arrayList;
    }

    private ArrayList<String> e5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33581, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (GameRollItemWrapperObj gameRollItemWrapperObj : this.f84689q) {
            if (gameRollItemWrapperObj.getItemType() == 0) {
                arrayList.add(gameRollItemWrapperObj.getItem().getCoupon_id());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n3 f5(View view, n3 n3Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, n3Var}, null, changeQuickRedirect, true, 33583, new Class[]{View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        androidx.core.graphics.h0 h0VarF = n3Var.f(n3.m.d());
        androidx.core.graphics.h0 h0VarF2 = n3Var.f(n3.m.i());
        view.setPadding(view.getPaddingLeft(), h0VarF2.f20743b, view.getPaddingRight(), Math.max(h0VarF2.f20745d, h0VarF.f20745d));
        return n3Var;
    }

    public static GameRollCreateRoomFragment g5(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 33571, new Class[]{Bundle.class}, GameRollCreateRoomFragment.class);
        return patchProxyResultProxy.isSupported ? (GameRollCreateRoomFragment) patchProxyResultProxy.result : new GameRollCreateRoomFragment();
    }

    private void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33579, new Class[0], Void.TYPE).isSupported || this.f84688p == null) {
            return;
        }
        ArrayList<MallCouponObj> arrayListD5 = d5();
        if (arrayListD5.size() <= 0) {
            this.f84688p.setText((CharSequence) null);
            return;
        }
        int size = arrayListD5.size();
        Iterator<MallCouponObj> it = arrayListD5.iterator();
        int iQ = 0;
        while (it.hasNext()) {
            iQ += com.max.hbutils.utils.n.q(it.next().getPrice());
        }
        String str = size + "";
        String str2 = getString(R.string.rmb_symbol) + iQ;
        String str3 = String.format(getString(R.string.roll_price_desc_format), str, str2);
        int iIndexOf = str3.indexOf(str);
        int iIndexOf2 = str3.indexOf(str2);
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.text_primary_2_color)), iIndexOf, str.length() + iIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.text_primary_1_color)), iIndexOf2, str2.length() + iIndexOf2, 33);
        this.f84688p.setText(spannableString);
    }

    private void i5() {
        TextView textView;
        Calendar calendar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33578, new Class[0], Void.TYPE).isSupported || (textView = this.mRollTimeTextView) == null || (calendar = this.f84693u) == null) {
            return;
        }
        textView.setText(com.max.hbutils.utils.w.h(calendar.getTimeInMillis(), com.max.hbutils.utils.w.f73605l));
    }

    private void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33575, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f84697y) {
            this.vg_roll_encryption_switch.setChecked(false, false);
            this.vg_roll_encryption_switch.setSwitchEnable(false);
            this.vg_roll_encryption_switch.setOnClickListener(new e());
        } else {
            this.vg_roll_encryption_switch.setChecked(false, true);
            this.vg_roll_encryption_switch.setEnabled(true);
            this.vg_roll_encryption_switch.setOnClickListener(null);
            this.vg_roll_encryption_switch.setSwitchEnable(true);
            this.vg_roll_encryption_switch.setOnCheckedChangeListener(new f());
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33572, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.activity_game_roll_create_room);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mTitleBar.setTitle(getString(R.string.creatRoom));
        androidx.core.view.j1.a2(view, new androidx.core.view.z0() { // from class: com.max.xiaoheihe.module.game.h0
            @Override // androidx.core.view.z0
            public final n3 a(View view2, n3 n3Var) {
                return GameRollCreateRoomFragment.f5(view2, n3Var);
            }
        });
        b5();
        this.bottom_button.setRightClickListener(new a());
        TextView textView = (TextView) this.mItemTitleView.findViewById(R.id.tv_layout_all_title);
        this.f84688p = (TextView) this.mItemTitleView.findViewById(R.id.tv_layout_all_subtitle);
        this.mItemTitleView.findViewById(R.id.ll_layout_all_action).setVisibility(8);
        textView.setText(getString(R.string.jackpot));
        this.f84688p.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
        this.mItemListRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3));
        this.f84689q.clear();
        GameRollItemWrapperObj gameRollItemWrapperObj = new GameRollItemWrapperObj();
        gameRollItemWrapperObj.setItemType(1);
        this.f84689q.add(gameRollItemWrapperObj);
        ViewUtils.L(this.mContext);
        ViewUtils.f(this.mContext, 18.0f);
        b bVar = new b(this.mContext, this.f84689q);
        this.f84690r = bVar;
        this.mItemListRecyclerView.setAdapter(bVar);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        this.f84693u = calendar2;
        calendar2.add(11, 1);
        i5();
        this.mRollTimeView.setOnClickListener(new c(calendar));
        this.mGetPrizeUserNumEditText.setOnFocusChangeListener(new d());
        j5();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33573, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        OnCouponCheckBroadcastReceiver onCouponCheckBroadcastReceiver = new OnCouponCheckBroadcastReceiver(this, null);
        this.f84696x = onCouponCheckBroadcastReceiver;
        registerReceiver(onCouponCheckBroadcastReceiver, lb.a.f130954e0);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33574, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        OnCouponCheckBroadcastReceiver onCouponCheckBroadcastReceiver = this.f84696x;
        if (onCouponCheckBroadcastReceiver != null) {
            unregisterReceiver(onCouponCheckBroadcastReceiver);
        }
    }
}
