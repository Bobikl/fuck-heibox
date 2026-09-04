package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityGameRollCreateRoomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f111141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f111150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f111152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111155p;

    private h0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f111140a = relativeLayout;
        this.f111141b = bottomButtonLeftItemView;
        this.f111142c = editText;
        this.f111143d = editText2;
        this.f111144e = editText3;
        this.f111145f = recyclerView;
        this.f111146g = textView;
        this.f111147h = textView2;
        this.f111148i = textView3;
        this.f111149j = linearLayout;
        this.f111150k = h20Var;
        this.f111151l = linearLayout2;
        this.f111152m = settingItemView;
        this.f111153n = linearLayout3;
        this.f111154o = relativeLayout2;
        this.f111155p = relativeLayout3;
    }

    @androidx.annotation.n0
    public static h0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16372, new Class[]{View.class}, h0.class);
        if (patchProxyResultProxy.isSupported) {
            return (h0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.et_get_prize_user_num;
            EditText editText = (EditText) l3.d.a(view, R.id.et_get_prize_user_num);
            if (editText != null) {
                i10 = R.id.et_roll_need_pwd;
                EditText editText2 = (EditText) l3.d.a(view, R.id.et_roll_need_pwd);
                if (editText2 != null) {
                    i10 = R.id.et_roll_room_desc;
                    EditText editText3 = (EditText) l3.d.a(view, R.id.et_roll_room_desc);
                    if (editText3 != null) {
                        i10 = R.id.rv_item_list;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_item_list);
                        if (recyclerView != null) {
                            i10 = R.id.tv_get_prize_user_num;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_get_prize_user_num);
                            if (textView != null) {
                                i10 = R.id.tv_roll_need_pwd;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_roll_need_pwd);
                                if (textView2 != null) {
                                    i10 = R.id.tv_roll_time;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_roll_time);
                                    if (textView3 != null) {
                                        i10 = R.id.vg_item_container;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item_container);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_item_title;
                                            View viewA = l3.d.a(view, R.id.vg_item_title);
                                            if (viewA != null) {
                                                h20 h20VarA = h20.a(viewA);
                                                i10 = R.id.vg_roll_detail;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_roll_detail);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_roll_encryption_switch;
                                                    SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.vg_roll_encryption_switch);
                                                    if (settingItemView != null) {
                                                        i10 = R.id.vg_roll_limit;
                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_roll_limit);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.vg_roll_need_pwd;
                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_roll_need_pwd);
                                                            if (relativeLayout != null) {
                                                                i10 = R.id.vg_roll_time;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_roll_time);
                                                                if (relativeLayout2 != null) {
                                                                    return new h0((RelativeLayout) view, bottomButtonLeftItemView, editText, editText2, editText3, recyclerView, textView, textView2, textView3, linearLayout, h20VarA, linearLayout2, settingItemView, linearLayout3, relativeLayout, relativeLayout2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16370, new Class[]{LayoutInflater.class}, h0.class);
        return patchProxyResultProxy.isSupported ? (h0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16371, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h0.class);
        if (patchProxyResultProxy.isSupported) {
            return (h0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_roll_create_room, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111140a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16373, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
