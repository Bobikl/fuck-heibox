package com.max.xiaoheihe.module.game.adapter.dota2;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2HeroObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2PlayerObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.g;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: Dota2DataTeamAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2DataTeamAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2DataTeamAdapter.kt\ncom/max/xiaoheihe/module/game/adapter/dota2/Dota2DataTeamAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1054#2:132\n1054#2:133\n*S KotlinDebug\n*F\n+ 1 Dota2DataTeamAdapter.kt\ncom/max/xiaoheihe/module/game/adapter/dota2/Dota2DataTeamAdapter\n*L\n72#1:132\n73#1:133\n*E\n"})
@o(parameters = 0)
public final class Dota2DataTeamAdapter extends u<Dota2PlayerObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85668f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f85669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private Type f85670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f85671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f85672e;

    /* JADX INFO: compiled from: Dota2DataTeamAdapter.kt */
    public enum Type {
        Damage,
        Fight,
        Rate;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 35705, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 35704, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: Dota2DataTeamAdapter.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85673a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Damage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Fight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.Rate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85673a = iArr;
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @t0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Dota2DataTeamAdapter.kt\ncom/max/xiaoheihe/module/game/adapter/dota2/Dota2DataTeamAdapter\n*L\n1#1,328:1\n72#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, t11}, this, changeQuickRedirect, false, 35706, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : g.l(((Dota2PlayerObj) t11).getCurrent_value(), ((Dota2PlayerObj) t10).getCurrent_value());
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @t0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Dota2DataTeamAdapter.kt\ncom/max/xiaoheihe/module/game/adapter/dota2/Dota2DataTeamAdapter\n*L\n1#1,328:1\n73#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, t11}, this, changeQuickRedirect, false, 35707, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : g.l(((Dota2PlayerObj) t11).getCurrent_value(), ((Dota2PlayerObj) t10).getCurrent_value());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2DataTeamAdapter(@d Context context, @d List<Dota2PlayerObj> list) {
        super(context, list);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f85669b = context;
        this.f85670c = Type.Damage;
    }

    private final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35698, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = getDataList().size() / 2;
        List listY4 = CollectionsKt___CollectionsKt.y4(CollectionsKt___CollectionsKt.p5(getDataList().subList(0, size), new b()), CollectionsKt___CollectionsKt.p5(getDataList().subList(size, getDataList().size()), new c()));
        getDataList().clear();
        getDataList().addAll(listY4);
        notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, Dota2PlayerObj dota2PlayerObj) {
        Object[] objArr = {new Integer(i10), dota2PlayerObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35703, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, dota2PlayerObj);
    }

    @d
    public final Context n() {
        return this.f85669b;
    }

    public int o(int i10, @e Dota2PlayerObj dota2PlayerObj) {
        Object[] objArr = {new Integer(i10), dota2PlayerObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35701, new Class[]{cls, Dota2PlayerObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return i10 < getDataList().size() / 2 ? R.layout.item_dota2_match_data_left : R.layout.item_dota2_match_data_right;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 35702, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, (Dota2PlayerObj) obj);
    }

    public final float p(@e String str) {
        String strL2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35699, new Class[]{String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return n.p((str == null || (strL2 = kotlin.text.u.l2(str, "%", "", false, 4, null)) == null) ? null : StringsKt__StringsKt.F5(strL2).toString());
    }

    public final float q() {
        return this.f85671d;
    }

    @d
    public final Type r() {
        return this.f85670c;
    }

    public final float s() {
        return this.f85672e;
    }

    public void t(@e s.e eVar, @e Dota2PlayerObj dota2PlayerObj) {
        String damage_rate;
        if (PatchProxy.proxy(new Object[]{eVar, dota2PlayerObj}, this, changeQuickRedirect, false, 35700, new Class[]{s.e.class, Dota2PlayerObj.class}, Void.TYPE).isSupported || eVar == null || dota2PlayerObj == null) {
            return;
        }
        int iL = (ViewUtils.L(this.f85669b) - ViewUtils.f(this.f85669b, 33.0f)) / 2;
        ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
        layoutParams.width = iL;
        eVar.itemView.setLayoutParams(layoutParams);
        TextView textView = (TextView) eVar.i(R.id.tv_value);
        ProgressBar progressBar = (ProgressBar) eVar.i(R.id.f76248pb);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        int i10 = a.f85673a[this.f85670c.ordinal()];
        if (i10 == 1) {
            damage_rate = dota2PlayerObj.getDamage_rate();
        } else if (i10 == 2) {
            damage_rate = dota2PlayerObj.getFight_rate();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            damage_rate = dota2PlayerObj.getDamage_gold_rate();
        }
        textView.setText(damage_rate);
        Dota2HeroObj hero_info = dota2PlayerObj.getHero_info();
        com.max.hbimage.b.K(hero_info != null ? hero_info.getHero_image() : null, imageView);
        if (eVar.getAbsoluteAdapterPosition() < getDataList().size() / 2) {
            progressBar.setProgressDrawable(com.max.xiaoheihe.utils.d.X(R.drawable.pb_tianhui));
            progressBar.setMax((int) (this.f85671d * 10));
        } else {
            progressBar.setProgressDrawable(com.max.xiaoheihe.utils.d.X(R.drawable.pb_yeyan));
            progressBar.setMax((int) (this.f85672e * 10));
        }
        progressBar.setProgress((int) (p(damage_rate) * 10));
    }

    public final void u(@d Type type) {
        String damage_rate;
        String damage_rate2;
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 35697, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f85670c = type;
        this.f85671d = 0.0f;
        this.f85672e = 0.0f;
        int size = getDataList().size() / 2;
        for (int i10 = 0; i10 < size; i10++) {
            Dota2PlayerObj dota2PlayerObj = getDataList().get(i10);
            if (dota2PlayerObj != null) {
                int i11 = a.f85673a[type.ordinal()];
                if (i11 == 1) {
                    damage_rate2 = dota2PlayerObj.getDamage_rate();
                } else if (i11 == 2) {
                    damage_rate2 = dota2PlayerObj.getFight_rate();
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    damage_rate2 = dota2PlayerObj.getDamage_gold_rate();
                }
                float fP = p(damage_rate2);
                if (this.f85671d < fP) {
                    this.f85671d = fP;
                }
                dota2PlayerObj.setCurrent_value(Float.valueOf(fP));
            }
        }
        int size2 = getDataList().size();
        for (int size3 = getDataList().size() / 2; size3 < size2; size3++) {
            Dota2PlayerObj dota2PlayerObj2 = getDataList().get(size3);
            if (dota2PlayerObj2 != null) {
                int i12 = a.f85673a[type.ordinal()];
                if (i12 == 1) {
                    damage_rate = dota2PlayerObj2.getDamage_rate();
                } else if (i12 == 2) {
                    damage_rate = dota2PlayerObj2.getFight_rate();
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    damage_rate = dota2PlayerObj2.getDamage_gold_rate();
                }
                float fP2 = p(damage_rate);
                if (this.f85672e < fP2) {
                    this.f85672e = fP2;
                }
                dota2PlayerObj2.setCurrent_value(Float.valueOf(fP2));
            }
        }
        y();
    }

    public final void v(float f10) {
        this.f85671d = f10;
    }

    public final void w(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 35696, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "<set-?>");
        this.f85670c = type;
    }

    public final void x(float f10) {
        this.f85672e = f10;
    }
}
