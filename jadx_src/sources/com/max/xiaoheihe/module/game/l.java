package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: GameCommentNotifyHelper.java */
/* JADX INFO: loaded from: classes11.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f87787a;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameCommentNotifyHelper.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f87788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f87789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.t f87790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameObj f87791e;

        a(com.max.hbcommon.base.adapter.s.e eVar, List list, com.max.hbcommon.base.adapter.t tVar, GameObj gameObj) {
            this.f87788b = eVar;
            this.f87789c = list;
            this.f87790d = tVar;
            this.f87791e = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32516, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int bindingAdapterPosition = this.f87788b.getBindingAdapterPosition();
            this.f87789c.remove(bindingAdapterPosition);
            com.max.hbcommon.base.adapter.t tVar = this.f87790d;
            tVar.notifyItemRemoved(bindingAdapterPosition + tVar.u());
            com.max.hbcache.c.z("game_comment_notify", r1.Z(this.f87791e));
        }
    }

    /* JADX INFO: compiled from: GameCommentNotifyHelper.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f87793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SliceGradeView f87794d;

        b(Context context, GameObj gameObj, SliceGradeView sliceGradeView) {
            this.f87792b = context;
            this.f87793c = gameObj;
            this.f87794d = sliceGradeView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32517, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - l.f87787a > 1000) {
                long unused = l.f87787a = System.currentTimeMillis();
                com.max.xiaoheihe.base.router.b.k(this.f87792b, r1.Z(this.f87793c), this.f87794d.getGrade(), null, false).A();
            }
        }
    }

    public static void c(RecyclerView recyclerView, List<GameObj> list, com.max.hbcommon.base.adapter.t tVar) {
        Object tag;
        int last = 0;
        if (PatchProxy.proxy(new Object[]{recyclerView, list, tVar}, null, changeQuickRedirect, true, 32514, new Class[]{RecyclerView.class, List.class, com.max.hbcommon.base.adapter.t.class}, Void.TYPE).isSupported) {
            return;
        }
        RvVisiableRangeObj rvVisiableRangeObjK0 = com.max.xiaoheihe.utils.d.k0(recyclerView, 1.0f);
        if (rvVisiableRangeObjK0.getFirst() != -1 && rvVisiableRangeObjK0.getLast() != -1) {
            last = (rvVisiableRangeObjK0.getLast() - rvVisiableRangeObjK0.getFirst()) + 1;
        }
        if (last > 0) {
            for (int first = rvVisiableRangeObjK0.getFirst(); first < rvVisiableRangeObjK0.getLast() + 1; first++) {
                View viewFindViewByPosition = recyclerView.getLayoutManager().findViewByPosition(first);
                if (viewFindViewByPosition != null && (viewFindViewByPosition.getTag() instanceof GameObj) && ViewUtils.f0(viewFindViewByPosition) && (tag = viewFindViewByPosition.getTag()) != null) {
                    f((GameObj) tag, list, tVar);
                }
            }
        }
    }

    public static int d() {
        return R.layout.item_gamecomment_notice;
    }

    public static void e(Context context, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, List<GameObj> list, com.max.hbcommon.base.adapter.t tVar) {
        if (PatchProxy.proxy(new Object[]{context, eVar, gameObj, list, tVar}, null, changeQuickRedirect, true, 32513, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, GameObj.class, List.class, com.max.hbcommon.base.adapter.t.class}, Void.TYPE).isSupported) {
            return;
        }
        SliceGradeView sliceGradeView = (SliceGradeView) eVar.i(R.id.sgv);
        TextView textView = (TextView) eVar.i(R.id.tv_desc);
        GameObj custom_comment_related_game = gameObj.getCustom_comment_related_game();
        textView.setText(gameObj.getNeed_to_comment());
        sliceGradeView.setEnableSlide(false);
        sliceGradeView.setMinGrade(0);
        sliceGradeView.setGrade(0);
        View viewI = eVar.i(R.id.vg_close);
        viewI.setBackgroundDrawable(ViewUtils.C(ViewUtils.f(context, 20.0f), 90, 90, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
        viewI.setOnClickListener(new a(eVar, list, tVar, custom_comment_related_game));
        eVar.itemView.setOnClickListener(new b(context, custom_comment_related_game, sliceGradeView));
    }

    private static void f(GameObj gameObj, List<GameObj> list, com.max.hbcommon.base.adapter.t tVar) {
        if (PatchProxy.proxy(new Object[]{gameObj, list, tVar}, null, changeQuickRedirect, true, 32515, new Class[]{GameObj.class, List.class, com.max.hbcommon.base.adapter.t.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(gameObj.getNeed_to_comment()) || com.max.hbcache.c.j("game_comment_notify").equals(r1.Z(gameObj))) {
            return;
        }
        GameObj gameObj2 = new GameObj();
        gameObj2.setItemType(GameObj.ITEM_TYPE_GAMECOMMENT_TIPS);
        gameObj2.setNeed_to_comment(gameObj.getNeed_to_comment());
        gameObj2.setCustom_comment_related_game(gameObj);
        gameObj.setNeed_to_comment("");
        int iIndexOf = list.indexOf(gameObj) + 1;
        list.add(iIndexOf, gameObj2);
        tVar.notifyItemInserted(iIndexOf + tVar.u());
    }
}
