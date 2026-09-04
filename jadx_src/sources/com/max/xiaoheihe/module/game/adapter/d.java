package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: CommonPlayerListAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class d extends com.max.hbcommon.base.adapter.s<PlayerInfoObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f85660b;

    /* JADX INFO: compiled from: CommonPlayerListAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PlayerInfoObj f85661b;

        a(PlayerInfoObj playerInfoObj) {
            this.f85661b = playerInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35532, new Class[]{View.class}, Void.TYPE).isSupported || d.this.f85660b == null) {
                return;
            }
            d.this.f85660b.a(view, this.f85661b);
        }
    }

    /* JADX INFO: compiled from: CommonPlayerListAdapter.java */
    public interface b {
        void a(View view, PlayerInfoObj playerInfoObj);

        List<Integer> b();

        boolean c();
    }

    public d(Context context, List<PlayerInfoObj> list) {
        super(context, list, R.layout.item_search_ratio);
    }

    private String o(Context context, List<String> list, int i10) {
        int i11;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, list, new Integer(i10)}, this, changeQuickRedirect, false, 35525, new Class[]{Context.class, List.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i10 <= 0) {
            return context.getResources().getString(R.string.player);
        }
        if (list == null || (i11 = i10 - 1) >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    private String p(PlayerInfoObj playerInfoObj, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{playerInfoObj, new Integer(i10)}, this, changeQuickRedirect, false, 35524, new Class[]{PlayerInfoObj.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (i10 == 1) {
            return playerInfoObj.getValue1();
        }
        if (i10 == 2) {
            return playerInfoObj.getValue2();
        }
        if (i10 == 3) {
            return playerInfoObj.getValue3();
        }
        if (i10 != 4) {
            return i10 != 5 ? playerInfoObj.getNickname() : playerInfoObj.getValue5();
        }
        return playerInfoObj.getValue4();
    }

    private ImageView q(LinearLayout linearLayout, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linearLayout, str}, this, changeQuickRedirect, false, 35526, new Class[]{LinearLayout.class, String.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        Context context = linearLayout.getContext();
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 30.0f), ViewUtils.f(context, 30.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = ViewUtils.f(context, 10.0f);
        imageView.setLayoutParams(layoutParams);
        t(imageView, str);
        return imageView;
    }

    private TextView r(LinearLayout linearLayout, String str, int i10, int i11, boolean z10) {
        Object[] objArr = {linearLayout, str, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35528, new Class[]{LinearLayout.class, String.class, cls, cls, Boolean.TYPE}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        Context context = linearLayout.getContext();
        TextView textView = new TextView(context);
        textView.setTag(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = i10;
        int iF = ViewUtils.f(context, 2.0f);
        layoutParams.rightMargin = iF;
        layoutParams.leftMargin = iF;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(i11 == 0 ? 19 : 17);
        int i12 = i11 == 0 ? R.dimen.text_size_12 : R.dimen.text_size_14;
        Resources resources = linearLayout.getResources();
        if (z10) {
            i12 = R.dimen.text_size_11;
        }
        textView.setTextSize(0, resources.getDimensionPixelSize(i12));
        textView.setTextColor(linearLayout.getResources().getColor(z10 ? R.color.text_secondary_1_color : R.color.text_primary_1_color));
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v(textView, str);
        return textView;
    }

    private void t(ImageView imageView, String str) {
        if (PatchProxy.proxy(new Object[]{imageView, str}, this, changeQuickRedirect, false, 35527, new Class[]{ImageView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            imageView.setImageDrawable(null);
        } else {
            com.max.hbimage.b.d0(str, imageView, ViewUtils.f(imageView.getContext(), 2.0f));
        }
    }

    private void v(TextView textView, String str) {
        if (PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 35530, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setText(str);
    }

    public b n() {
        return this.f85660b;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PlayerInfoObj playerInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 35531, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        s(eVar, playerInfoObj);
    }

    public void s(com.max.hbcommon.base.adapter.s.e eVar, PlayerInfoObj playerInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 35523, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PlayerInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.divider);
        View viewB = eVar.b();
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_data);
        b bVar = this.f85660b;
        List<Integer> listB = bVar != null ? bVar.b() : null;
        b bVar2 = this.f85660b;
        boolean z10 = bVar2 != null && bVar2.c();
        int size = listB != null ? listB.size() : 0;
        int i10 = z10 ? size + 1 : size;
        int childCount = linearLayout.getChildCount();
        if (childCount != i10) {
            linearLayout.removeAllViews();
            if (z10) {
                linearLayout.addView(q(linearLayout, playerInfoObj.getAvatar()));
            }
            for (int i11 = 0; i11 < size; i11++) {
                linearLayout.addView(r(linearLayout, p(playerInfoObj, i11), listB.get(i11).intValue(), i11, false));
            }
        } else {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = linearLayout.getChildAt(i12);
                if (z10 && i12 == 0) {
                    t((ImageView) childAt, playerInfoObj.getAvatar());
                } else {
                    v((TextView) childAt, p(playerInfoObj, z10 ? i12 - 1 : i12));
                }
            }
        }
        viewB.setOnClickListener(new a(playerInfoObj));
        viewI.setVisibility(playerInfoObj == this.mDataList.get(getItemCount() - 1) ? 8 : 0);
    }

    public void u(View view, List<String> list) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{view, list}, this, changeQuickRedirect, false, 35529, new Class[]{View.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_data);
        Context context = linearLayout.getContext();
        b bVar = this.f85660b;
        List<Integer> listB = bVar != null ? bVar.b() : null;
        b bVar2 = this.f85660b;
        boolean z10 = bVar2 != null && bVar2.c();
        int size = listB != null ? listB.size() : 0;
        int i11 = z10 ? size + 1 : size;
        int childCount = linearLayout.getChildCount();
        if (childCount != i11) {
            linearLayout.removeAllViews();
            if (z10) {
                linearLayout.addView(q(linearLayout, null));
            }
            while (i10 < size) {
                linearLayout.addView(r(linearLayout, o(context, list, i10), listB.get(i10).intValue(), i10, true));
                i10++;
            }
            return;
        }
        while (i10 < childCount) {
            View childAt = linearLayout.getChildAt(i10);
            if (z10 && i10 == 0) {
                t((ImageView) childAt, null);
            } else {
                v((TextView) childAt, o(context, list, z10 ? i10 - 1 : i10));
            }
            i10++;
        }
    }

    public void w(b bVar) {
        this.f85660b = bVar;
    }
}
