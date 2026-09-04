package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.indexbar.IndexBar;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.AreaCodeItemObj;
import com.max.xiaoheihe.bean.account.AreaCodeObj;
import com.max.xiaoheihe.view.callback.OnRecyclerViewOnScrollListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AreaCodeActivity extends BaseActivity {
    private static final String P = "country_code.json";
    public static final String Q = "area_code";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AreaCodeItemObj> L = new ArrayList();
    private com.max.hbcommon.base.adapter.s<AreaCodeItemObj> M;
    private LinearLayoutManager N;
    private int O;

    @BindView(R.id.indexBar)
    IndexBar indexBar;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.v_mask)
    View vMask;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<AreaCodeItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f77483b;

            a(String str) {
                this.f77483b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22408, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra(AreaCodeActivity.Q, this.f77483b);
                AreaCodeActivity.this.setResult(-1, intent);
                AreaCodeActivity.this.finish();
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, AreaCodeItemObj areaCodeItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, areaCodeItemObj}, this, changeQuickRedirect, false, 22406, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AreaCodeItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            String name = areaCodeItemObj.getName();
            eVar.p(R.id.tv_name, name);
            eVar.itemView.setOnClickListener(new a(name.substring(name.indexOf("+"))));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AreaCodeItemObj areaCodeItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, areaCodeItemObj}, this, changeQuickRedirect, false, 22407, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, areaCodeItemObj);
        }
    }

    public class c extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 22411, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
            int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
            if (viewLayoutPosition == 0) {
                rect.set(0, 0, 0, 0);
            } else if (viewLayoutPosition <= 0 || ((AreaCodeItemObj) AreaCodeActivity.this.L.get(viewLayoutPosition)).getTarget() == null || ((AreaCodeItemObj) AreaCodeActivity.this.L.get(viewLayoutPosition)).getTarget().equals(((AreaCodeItemObj) AreaCodeActivity.this.L.get(viewLayoutPosition - 1)).getTarget())) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, AreaCodeActivity.this.O, 0, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 22409, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onDraw(canvas, recyclerView, state);
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                if (viewLayoutPosition != 0 && viewLayoutPosition > 0 && ((AreaCodeItemObj) AreaCodeActivity.this.L.get(viewLayoutPosition)).getTarget() != null && !((AreaCodeItemObj) AreaCodeActivity.this.L.get(viewLayoutPosition)).getTarget().equals(((AreaCodeItemObj) AreaCodeActivity.this.L.get(viewLayoutPosition - 1)).getTarget())) {
                    AreaCodeActivity.N1(AreaCodeActivity.this, canvas, paddingLeft, width, childAt, layoutParams, viewLayoutPosition);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 22410, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onDrawOver(canvas, recyclerView, state);
        }
    }

    public class d extends OnRecyclerViewOnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.view.callback.OnRecyclerViewOnScrollListener, com.max.xiaoheihe.view.callback.c
        public void b(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22412, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("indexbar", "onPosition" + i10);
            AreaCodeActivity areaCodeActivity = AreaCodeActivity.this;
            areaCodeActivity.indexBar.setSelected(((AreaCodeItemObj) areaCodeActivity.L.get(i10)).getTarget());
        }
    }

    static /* synthetic */ void N1(AreaCodeActivity areaCodeActivity, Canvas canvas, int i10, int i11, View view, RecyclerView.LayoutParams layoutParams, int i12) {
        Object[] objArr = {areaCodeActivity, canvas, new Integer(i10), new Integer(i11), view, layoutParams, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 22405, new Class[]{AreaCodeActivity.class, Canvas.class, cls, cls, View.class, RecyclerView.LayoutParams.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        areaCodeActivity.Q1(canvas, i10, i11, view, layoutParams, i12);
    }

    private void Q1(Canvas canvas, int i10, int i11, View view, RecyclerView.LayoutParams layoutParams, int i12) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), view, layoutParams, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22404, new Class[]{Canvas.class, cls, cls, View.class, RecyclerView.LayoutParams.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(this.f66601b, 14.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.divider_color));
        float f10 = i10;
        float f11 = i11;
        canvas.drawRect(f10, (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.O, f11, view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, paint);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.divider_color));
        paint.setStrokeWidth(ViewUtils.f(this.f66601b, 1.0f));
        canvas.drawLine(f10, view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, f11, view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, paint);
        paint.setFakeBoldText(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        paint.setTextSize(com.max.xiaoheihe.utils.d.V(R.dimen.text_size_14));
        Rect rect = new Rect();
        paint.getTextBounds(this.L.get(i12).getTarget(), 0, this.L.get(i12).getTarget().length(), rect);
        canvas.drawText(this.L.get(i12).getTarget(), view.getPaddingLeft() + iF, (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((this.O / 2) - (rect.height() / 2)), paint);
    }

    public static String R1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22403, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(P)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public static Intent T1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22401, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) AreaCodeActivity.class);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_area_code);
        ButterKnife.a(this);
        this.f66616q.setTitle(R.string.choose_area_code);
        this.f66617r.setVisibility(0);
        this.O = ViewUtils.f(this.f66601b, 26.0f);
        this.vMask.setOnClickListener(new a());
        this.M = new b(this.f66601b, this.L, R.layout.item_area_code);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f66601b);
        this.N = linearLayoutManager;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.addItemDecoration(new c());
        this.indexBar.j(false).k(true).l(this.N);
        this.mRecyclerView.setAdapter(this.M);
        this.mRecyclerView.setOnScrollListener(new d());
        String strR1 = R1(this.f66601b);
        if (com.max.hbcommon.utils.c.u(strR1)) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("数据异常");
            finish();
            return;
        }
        List<AreaCodeObj> listB = com.max.hbutils.utils.k.b(strR1, AreaCodeObj.class);
        if (com.max.hbcommon.utils.c.w(listB)) {
            return;
        }
        for (AreaCodeObj areaCodeObj : listB) {
            for (String str : areaCodeObj.getValue()) {
                AreaCodeItemObj areaCodeItemObj = new AreaCodeItemObj();
                areaCodeItemObj.setName(str);
                if ("热门".equals(areaCodeObj.getName())) {
                    areaCodeItemObj.setIndex("#");
                } else {
                    areaCodeItemObj.setIndex(areaCodeObj.getName());
                }
                this.L.add(areaCodeItemObj);
            }
        }
        this.indexBar.n(this.L);
        this.M.notifyDataSetChanged();
    }
}
