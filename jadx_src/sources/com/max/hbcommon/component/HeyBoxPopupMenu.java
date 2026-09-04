package com.max.hbcommon.component;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.e1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.n3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.hbutils.utils.SystemWindowInsetExtensionsKt;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class HeyBoxPopupMenu extends com.max.hbcustomview.swipebacklayout.a {
    public static final int O = 200;
    private static final int P = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;
    private boolean B;
    private boolean C;
    private CharSequence D;
    private Drawable E;
    boolean F;
    int G;
    private CharSequence H;
    private MenuItemTextSource I;
    private boolean J;
    private e K;
    private boolean L;
    private boolean M;
    private boolean N;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<KeyDescObj> f67018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f67019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f67020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f f67021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f67022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LayoutInflater f67023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f67024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f67025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f67026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f67027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f67028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f67029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i f67030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f67031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f67032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f67033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f67034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f67035z;

    public enum MenuItemTextSource {
        DATA_DESC,
        DATA_TEXT;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static MenuItemTextSource valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.d.X8, new Class[]{String.class}, MenuItemTextSource.class);
            return patchProxyResultProxy.isSupported ? (MenuItemTextSource) patchProxyResultProxy.result : (MenuItemTextSource) Enum.valueOf(MenuItemTextSource.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MenuItemTextSource[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.d.W8, new Class[0], MenuItemTextSource[].class);
            return patchProxyResultProxy.isSupported ? (MenuItemTextSource[]) patchProxyResultProxy.result : (MenuItemTextSource[]) values().clone();
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.S8, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxPopupMenu.k(HeyBoxPopupMenu.this);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.T8, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!HeyBoxPopupMenu.this.f67035z || HeyBoxPopupMenu.this.f67020k == null) {
                HeyBoxPopupMenu.k(HeyBoxPopupMenu.this);
                return;
            }
            if (HeyBoxPopupMenu.this.J) {
                HeyBoxPopupMenu.this.f67020k.a(null);
                HeyBoxPopupMenu.this.dismiss();
                return;
            }
            for (KeyDescObj keyDescObj : HeyBoxPopupMenu.this.f67018i) {
                if (keyDescObj.isChecked()) {
                    HeyBoxPopupMenu.this.f67020k.a(keyDescObj);
                    break;
                }
            }
            HeyBoxPopupMenu.this.dismiss();
        }
    }

    public class c extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.U8, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onScrollStateChanged(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.V8, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onScrolled(recyclerView, i10, i11);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            HeyBoxPopupMenu.this.f67033x = linearLayoutManager.findFirstVisibleItemPosition();
            HeyBoxPopupMenu.this.f67034y = linearLayoutManager.findLastVisibleItemPosition();
            HeyBoxPopupMenu heyBoxPopupMenu = HeyBoxPopupMenu.this;
            View view = heyBoxPopupMenu.f67032w;
            View view2 = HeyBoxPopupMenu.this.f67031v;
            View childAt = recyclerView.getChildAt(0);
            HeyBoxPopupMenu heyBoxPopupMenu2 = HeyBoxPopupMenu.this;
            HeyBoxPopupMenu.z(heyBoxPopupMenu, view, view2, childAt, recyclerView.getChildAt(heyBoxPopupMenu2.f67034y - heyBoxPopupMenu2.f67033x));
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67039a;

        static {
            int[] iArr = new int[MenuItemTextSource.valuesCustom().length];
            f67039a = iArr;
            try {
                iArr[MenuItemTextSource.DATA_DESC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67039a[MenuItemTextSource.DATA_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f67040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f67041b;

        public e(int i10, float f10) {
            this.f67040a = i10;
            this.f67041b = f10;
        }
    }

    public interface f {
        void a();
    }

    public interface g {
        void a(KeyDescObj keyDescObj);
    }

    public interface h {
        void a(View view, KeyDescObj keyDescObj);
    }

    public class i extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public i(HeyBoxPopupMenu heyBoxPopupMenu, Context context, List<KeyDescObj> list) {
            this(context, list, R.layout.item_heybox_popup_menu);
        }

        public i(Context context, List<KeyDescObj> list, int i10) {
            super(context, list, i10);
        }

        private void n(ImageView imageView, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{imageView, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.f31113a9, new Class[]{ImageView.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!keyDescObj.isCanClick()) {
                imageView.setVisibility(8);
                return;
            }
            if (HeyBoxPopupMenu.this.J) {
                imageView.setImageResource(R.drawable.checked_icon_16x16_selector);
                imageView.setSelected(keyDescObj.isChecked());
                return;
            }
            if (HeyBoxPopupMenu.this.F) {
                imageView.setImageResource(R.drawable.checked_icon_white_16x16);
            }
            if (HeyBoxPopupMenu.this.B && keyDescObj.isChecked()) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }

        private void o(TextView textView, TextView textView2, ImageView imageView, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{textView, textView2, imageView, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.Z8, new Class[]{TextView.class, TextView.class, ImageView.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (HeyBoxPopupMenu.this.N) {
                textView2.setVisibility(0);
                textView2.setText(keyDescObj.getDesc());
            } else {
                textView2.setVisibility(8);
            }
            int i10 = d.f67039a[HeyBoxPopupMenu.this.I.ordinal()];
            if (i10 == 1) {
                textView.setText(keyDescObj.getDesc());
                textView2.setVisibility(8);
            } else if (i10 == 2) {
                textView.setText(keyDescObj.getText());
            }
            Resources resources = HeyBoxPopupMenu.this.getContext().getResources();
            int i11 = R.color.text_primary_1_color;
            int color = resources.getColor(i11);
            if (HeyBoxPopupMenu.this.A && !com.max.hbcommon.utils.c.u(keyDescObj.getColor())) {
                color = com.max.hbcommon.utils.l.g(keyDescObj.getColor());
            } else if (HeyBoxPopupMenu.this.M) {
                color = HeyBoxPopupMenu.this.getContext().getResources().getColor(i11);
            } else if (!keyDescObj.isCanClick()) {
                HeyBoxPopupMenu heyBoxPopupMenu = HeyBoxPopupMenu.this;
                color = heyBoxPopupMenu.F ? androidx.core.content.d.f(heyBoxPopupMenu.f67022m, R.color.white_alpha50) : heyBoxPopupMenu.getContext().getResources().getColor(R.color.text_secondary_2_color);
            } else if (HeyBoxPopupMenu.this.B) {
                HeyBoxPopupMenu heyBoxPopupMenu2 = HeyBoxPopupMenu.this;
                color = heyBoxPopupMenu2.F ? -1 : heyBoxPopupMenu2.getContext().getResources().getColor(i11);
            }
            textView.setTextColor(color);
            if (!HeyBoxPopupMenu.this.M || com.max.hbcommon.utils.c.u(keyDescObj.getImg())) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            com.max.hbimage.b.K(keyDescObj.getImg(), imageView);
            imageView.setColorFilter(color);
        }

        private void p(View view, com.max.hbcommon.base.adapter.s.e eVar) {
            if (PatchProxy.proxy(new Object[]{view, eVar}, this, changeQuickRedirect, false, bb.c.d.f31159c9, new Class[]{View.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
                return;
            }
            if (eVar.getAbsoluteAdapterPosition() == this.mDataList.size() - 1 && !HeyBoxPopupMenu.this.L) {
                view.setVisibility(8);
                return;
            }
            if (HeyBoxPopupMenu.this.K != null) {
                view.setBackgroundColor(HeyBoxPopupMenu.this.K.f67040a);
                view.setAlpha(HeyBoxPopupMenu.this.K.f67041b);
            }
            view.setVisibility(0);
        }

        private void q(final View view, final KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.f31136b9, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f67989b.r(keyDescObj, view, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(KeyDescObj keyDescObj, View view, View view2) {
            if (!PatchProxy.proxy(new Object[]{keyDescObj, view, view2}, this, changeQuickRedirect, false, bb.c.d.f31206e9, new Class[]{KeyDescObj.class, View.class, View.class}, Void.TYPE).isSupported && keyDescObj.isCanClick()) {
                if (HeyBoxPopupMenu.this.J) {
                    keyDescObj.setChecked(!keyDescObj.isChecked());
                } else {
                    for (T t10 : this.mDataList) {
                        if (t10 != keyDescObj) {
                            t10.setChecked(false);
                        }
                    }
                    keyDescObj.setChecked(true);
                }
                notifyDataSetChanged();
                if (HeyBoxPopupMenu.this.f67019j != null) {
                    HeyBoxPopupMenu.this.f67019j.a(view, keyDescObj);
                }
                if (HeyBoxPopupMenu.this.f67035z || !HeyBoxPopupMenu.this.C) {
                    return;
                }
                HeyBoxPopupMenu.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.f31183d9, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s(eVar, keyDescObj);
        }

        public void s(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.Y8, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            o((TextView) eVar.i(R.id.tv_desc), (TextView) eVar.i(R.id.tv_sub_desc), (ImageView) eVar.i(R.id.iv_click_arrow), keyDescObj);
            n((ImageView) eVar.i(R.id.iv_checked), keyDescObj);
            q(eVar.b(), keyDescObj);
            p(eVar.i(R.id.divider), eVar);
        }
    }

    public HeyBoxPopupMenu(@androidx.annotation.n0 Context context, @e1 int i10, List<KeyDescObj> list, boolean z10, boolean z11) {
        this(context, i10, list, z10, z11, false);
    }

    public HeyBoxPopupMenu(@androidx.annotation.n0 Context context, @e1 int i10, List<KeyDescObj> list, boolean z10, boolean z11, boolean z12) {
        super(context, i10);
        this.f67024o = true;
        this.f67029t = -1;
        this.f67030u = null;
        this.f67033x = 0;
        this.f67034y = 0;
        this.f67035z = false;
        this.A = false;
        this.B = true;
        this.C = true;
        this.D = "确定";
        this.E = null;
        this.F = false;
        this.G = -1;
        this.H = null;
        this.I = MenuItemTextSource.DATA_DESC;
        this.J = false;
        this.K = null;
        this.L = false;
        this.M = false;
        this.N = false;
        this.f67022m = context;
        this.f67023n = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f67018i = list;
        this.f67035z = z10;
        this.B = z11;
        this.M = z12;
    }

    public HeyBoxPopupMenu(@androidx.annotation.n0 Context context, List<KeyDescObj> list) {
        this(context, true, list, false, true);
    }

    public HeyBoxPopupMenu(@androidx.annotation.n0 Context context, List<KeyDescObj> list, boolean z10) {
        this(context, true, list, false, z10);
    }

    public HeyBoxPopupMenu(@androidx.annotation.n0 Context context, boolean z10, List<KeyDescObj> list, boolean z11, boolean z12) {
        this(context, z10 ? R.style.FullScreenDialog : R.style.HeyBoxDialog, list, z11, z12);
        X(z10);
    }

    private void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.L8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f fVar = this.f67021l;
        if (fVar != null) {
            fVar.a();
        } else {
            dismiss();
        }
    }

    private void D(View view, View view2, View view3, View view4) {
        if (PatchProxy.proxy(new Object[]{view, view2, view3, view4}, this, changeQuickRedirect, false, bb.c.d.J8, new Class[]{View.class, View.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        int size = this.f67018i.size();
        int i10 = this.f67034y;
        int i11 = this.f67033x;
        if (size > (i10 - i11) + 1) {
            if (i11 != 0 || view3 == null) {
                if (view.getAlpha() == 0.0f) {
                    com.max.hbutils.anim.b.c(view, 200, true);
                }
            } else if (!ViewUtils.e0(view3) && view.getAlpha() == 1.0f) {
                com.max.hbutils.anim.b.c(view, 200, false);
            } else if (ViewUtils.e0(view3) && view.getAlpha() == 0.0f) {
                com.max.hbutils.anim.b.c(view, 200, true);
            }
            if (this.f67034y != this.f67018i.size() - 1 || view4 == null) {
                if (view2.getAlpha() == 0.0f) {
                    com.max.hbutils.anim.b.c(view2, 200, true);
                    return;
                }
                return;
            }
            Log.d("fitGradient", "isViewCovered:" + ViewUtils.e0(view4) + "  top.getAlpha():" + view2.getAlpha());
            if (!ViewUtils.e0(view4) && view2.getAlpha() == 1.0f) {
                com.max.hbutils.anim.b.c(view2, 200, false);
            } else if (ViewUtils.e0(view4) && view2.getAlpha() == 0.0f) {
                com.max.hbutils.anim.b.c(view2, 200, true);
            }
        }
    }

    private void F(ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.d.G8, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.rv_data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f67022m));
        i iVar = new i(this, this.f67022m, this.f67018i);
        this.f67030u = iVar;
        recyclerView.setAdapter(iVar);
        recyclerView.post(new Runnable() { // from class: com.max.hbcommon.component.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f67983b.H(recyclerView);
            }
        });
        recyclerView.addOnScrollListener(new c());
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.fl_rv);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.T = (int) ((ViewUtils.J(this.f67022m) * 0.8f) - ViewUtils.f(this.f67022m, 80.0f));
        frameLayout.setLayoutParams(layoutParams);
    }

    @SuppressLint({"WrongConstant"})
    private void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.H8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67027r = (TextView) findViewById(R.id.tv_title);
        this.f67028s = findViewById(R.id.divider);
        if (this.F) {
            this.f67027r.setTextColor(this.f67022m.getResources().getColor(R.color.white_alpha50));
        }
        if (TextUtils.isEmpty(this.H)) {
            return;
        }
        this.f67027r.setVisibility(0);
        this.f67027r.setText(this.H);
        int i10 = this.f67029t;
        if (i10 != -1) {
            this.f67028s.setVisibility(i10);
        } else {
            this.f67028s.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.d.P8, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f67018i)) {
            if (this.f67018i.size() > recyclerView.getChildCount()) {
                this.f67031v.setVisibility(0);
            } else {
                this.f67031v.setVisibility(8);
                this.f67032w.setVisibility(8);
            }
            for (int i10 = 0; i10 < this.f67018i.size(); i10++) {
                if (this.f67018i.get(i10).isChecked()) {
                    int iMin = Math.min(this.f67018i.size() - 1, i10 + 1);
                    if (i10 == 0) {
                        this.f67032w.setVisibility(8);
                    } else if (i10 == this.f67018i.size() - 1) {
                        this.f67031v.setVisibility(8);
                    }
                    recyclerView.scrollToPosition(iMin);
                    break;
                }
            }
        }
        SwipeBackLayout swipeBackLayout = this.f69575b;
        if (swipeBackLayout != null) {
            swipeBackLayout.r();
        }
    }

    static /* synthetic */ void k(HeyBoxPopupMenu heyBoxPopupMenu) {
        if (PatchProxy.proxy(new Object[]{heyBoxPopupMenu}, null, changeQuickRedirect, true, bb.c.d.Q8, new Class[]{HeyBoxPopupMenu.class}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxPopupMenu.C();
    }

    static /* synthetic */ void z(HeyBoxPopupMenu heyBoxPopupMenu, View view, View view2, View view3, View view4) {
        if (PatchProxy.proxy(new Object[]{heyBoxPopupMenu, view, view2, view3, view4}, null, changeQuickRedirect, true, bb.c.d.R8, new Class[]{HeyBoxPopupMenu.class, View.class, View.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxPopupMenu.D(view, view2, view3, view4);
    }

    public h E() {
        return this.f67019j;
    }

    public void I() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.M8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67030u.notifyDataSetChanged();
    }

    public void J(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.O8, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        this.E = drawable;
        TextView textView = this.f67026q;
        if (textView != null) {
            textView.setBackground(drawable);
        }
    }

    public void K(g gVar) {
        this.f67020k = gVar;
    }

    public void L(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.N8, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        this.D = charSequence;
        TextView textView = this.f67026q;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void M(int i10) {
        this.G = i10;
    }

    public void N(f fVar) {
        this.f67021l = fVar;
    }

    public void O(boolean z10) {
        this.C = z10;
    }

    public void P(e eVar) {
        this.K = eVar;
    }

    public void Q(MenuItemTextSource menuItemTextSource) {
        this.I = menuItemTextSource;
    }

    public void R(h hVar) {
        this.f67019j = hVar;
    }

    public void S(boolean z10) {
        this.J = z10;
        this.C = false;
        this.f67035z = true;
    }

    public void T(boolean z10) {
        this.L = z10;
    }

    public void U(boolean z10) {
        this.N = z10;
    }

    public void V(boolean z10) {
        this.F = z10;
    }

    public void W(int i10) {
        this.f67029t = i10;
    }

    public void X(boolean z10) {
        this.f67024o = z10;
    }

    public void Y(boolean z10) {
        this.A = z10;
    }

    @Override // com.max.hbcustomview.swipebacklayout.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.F8, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        ViewGroup viewGroup = (RelativeLayout) this.f67023n.inflate(R.layout.layout_heybox_popup_menu, (ViewGroup) null);
        this.f67025p = viewGroup.findViewById(R.id.view_nav_bar);
        this.f67031v = viewGroup.findViewById(R.id.view_gradient_bottom);
        this.f67032w = viewGroup.findViewById(R.id.view_gradient_top);
        this.f67026q = (TextView) viewGroup.findViewById(R.id.tv_btn);
        if (this.F) {
            ((ConstraintLayout) viewGroup.findViewById(R.id.cl_root)).setBackground(com.max.hbutils.utils.q.w(this.f67022m, this.G, new float[]{8.0f, 8.0f, 8.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
            View view = this.f67032w;
            int i10 = this.G;
            int i11 = R.color.transparent;
            view.setBackground(ViewUtils.P(0, i10, com.max.hbcommon.utils.l.a(i11)));
            this.f67031v.setBackground(ViewUtils.P(0, com.max.hbcommon.utils.l.a(i11), this.G));
            this.f67026q.setBackgroundResource(R.color.divider_secondary_2_not_change_color_alpha6);
            this.f67026q.setTextColor(-1);
            View viewFindViewById = viewGroup.findViewById(R.id.divider);
            Context context = this.f67022m;
            int i12 = R.color.white_alpha5;
            viewFindViewById.setBackgroundColor(androidx.core.content.d.f(context, i12));
            viewGroup.findViewById(R.id.divider2).setBackgroundColor(androidx.core.content.d.f(this.f67022m, i12));
        }
        viewGroup.setOnClickListener(new a());
        if (this.f67035z && !this.F) {
            Drawable drawable = this.E;
            if (drawable != null) {
                this.f67026q.setBackground(drawable);
            } else {
                this.f67026q.setBackgroundResource(R.drawable.text_primary_4dp);
            }
            this.f67026q.setTextColor(com.max.hbcommon.utils.l.a(R.color.white));
            this.f67026q.setText(this.D);
        }
        if (!com.max.hbcommon.utils.c.w(this.f67018i)) {
            F(viewGroup);
            viewGroup.findViewById(R.id.cv_cancel).setOnClickListener(new b());
        }
        setContentView(viewGroup);
        Window window = getWindow();
        if (!this.f67024o && window != null) {
            window.setGravity(17);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        if (this.f67024o) {
            com.max.hbutils.utils.t.h0(window);
            if (this.f67025p != null) {
                if (this.F) {
                    window.setNavigationBarColor(this.G);
                } else {
                    window.setNavigationBarColor(androidx.core.content.res.i.e(this.f67022m.getResources(), R.color.background_layer_2_color, null));
                }
                SystemWindowInsetExtensionsKt.b(this.f67025p, n3.m.i(), false, false, false, true, false, false, false, false);
            }
        }
        G();
    }

    @Override // android.app.Dialog
    public void setTitle(@androidx.annotation.p0 CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.I8, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        this.H = charSequence;
        if (this.f67027r == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f67027r.setVisibility(0);
        this.f67028s.setVisibility(0);
        this.f67027r.setText(this.H);
    }

    @Override // com.max.hbcustomview.swipebacklayout.a, android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.K8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67024o) {
            com.max.hbutils.utils.t.h0(getWindow());
            if (this.f67025p != null) {
                if (this.F) {
                    getWindow().setNavigationBarColor(this.G);
                } else {
                    getWindow().setNavigationBarColor(androidx.core.content.res.i.e(this.f67022m.getResources(), R.color.background_layer_2_color, null));
                }
                SystemWindowInsetExtensionsKt.b(this.f67025p, n3.m.i(), false, false, false, true, false, false, false, false);
            }
        }
        super.show();
    }
}
