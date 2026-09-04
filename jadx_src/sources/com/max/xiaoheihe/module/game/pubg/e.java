package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.max.hbcommon.base.adapter.h;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameModeFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: PUBGModeFilterAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends h<PUBGGameModeFilter> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f88161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f88162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CompoundButton f88163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f88164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PUBGGameModeFilter f88165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f88166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f88167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f88168l;

    /* JADX INFO: compiled from: PUBGModeFilterAdapter.java */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PUBGGameModeFilter f88169b;

        a(PUBGGameModeFilter pUBGGameModeFilter) {
            this.f88169b = pUBGGameModeFilter;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38312, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            e.d(e.this, compoundButton, z10, this.f88169b.getKey());
            if (z10) {
                if (e.this.f88162f != null) {
                    e.this.f88162f.T1(compoundButton, this.f88169b);
                }
                if (e.this.f88163g != null && e.this.f88163g != compoundButton) {
                    e.this.f88163g.setChecked(false);
                }
                e.this.f88163g = compoundButton;
            }
        }
    }

    /* JADX INFO: compiled from: PUBGModeFilterAdapter.java */
    public interface b {
        void T1(CompoundButton compoundButton, PUBGGameModeFilter pUBGGameModeFilter);
    }

    public e(Context context, String str, List<PUBGGameModeFilter> list, PUBGGameModeFilter pUBGGameModeFilter, b bVar) {
        super(context, list, R.layout.item_filter);
        this.f88168l = 0;
        this.f88161e = context;
        this.f88162f = bVar;
        if (pUBGGameModeFilter != null || list.size() <= 0) {
            this.f88165i = pUBGGameModeFilter;
        } else {
            this.f88165i = list.get(0);
        }
        this.f88164h = true;
        this.f88166j = str;
    }

    public e(Context context, List<PUBGGameModeFilter> list, b bVar) {
        this(context, lb.a.J0, list, null, bVar);
    }

    static /* synthetic */ void d(e eVar, CompoundButton compoundButton, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 38311, new Class[]{e.class, CompoundButton.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.k(compoundButton, z10, str);
    }

    private void k(CompoundButton compoundButton, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 38309, new Class[]{CompoundButton.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f88168l > 0) {
            compoundButton.setTextSize(1, 12.0f);
        }
        if (!z10) {
            int i10 = this.f88168l;
            if (i10 > 0) {
                compoundButton.setBackground(ViewUtils.G(i10, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color)));
                compoundButton.setTextColor(this.f88161e.getResources().getColor(R.color.white_alpha30));
                return;
            } else {
                compoundButton.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color));
                compoundButton.setTextColor(this.f88161e.getResources().getColor(R.color.text_primary_1_color));
                return;
            }
        }
        int i11 = this.f88168l;
        if (i11 > 0) {
            Integer num = this.f88167k;
            compoundButton.setBackground(ViewUtils.G(i11, num != null ? num.intValue() : com.max.xiaoheihe.module.game.pubg.utils.c.b(this.f88166j, str)));
            compoundButton.setTextColor(this.f88161e.getResources().getColor(R.color.black));
        } else {
            Integer num2 = this.f88167k;
            compoundButton.setBackgroundColor(num2 != null ? num2.intValue() : com.max.xiaoheihe.module.game.pubg.utils.c.b(this.f88166j, str));
            compoundButton.setTextColor(this.f88161e.getResources().getColor(R.color.white));
        }
    }

    @Override // com.max.hbcommon.base.adapter.h
    public /* bridge */ /* synthetic */ void b(h.a aVar, PUBGGameModeFilter pUBGGameModeFilter) {
        if (PatchProxy.proxy(new Object[]{aVar, pUBGGameModeFilter}, this, changeQuickRedirect, false, 38310, new Class[]{h.a.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        h(aVar, pUBGGameModeFilter);
    }

    public void h(h.a aVar, PUBGGameModeFilter pUBGGameModeFilter) {
        if (PatchProxy.proxy(new Object[]{aVar, pUBGGameModeFilter}, this, changeQuickRedirect, false, 38308, new Class[]{h.a.class, PUBGGameModeFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        CompoundButton compoundButton = (RadioButton) aVar.e(R.id.rb_filter);
        if (this.f88164h && this.f88165i != null && pUBGGameModeFilter.getKey() != null && pUBGGameModeFilter.getKey().equals(this.f88165i.getKey())) {
            compoundButton.setChecked(true);
            k(compoundButton, true, pUBGGameModeFilter.getKey());
            this.f88163g = compoundButton;
            this.f88164h = false;
        }
        compoundButton.setOnCheckedChangeListener(new a(pUBGGameModeFilter));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pUBGGameModeFilter.getValue());
        String match_count = !com.max.hbcommon.utils.c.u(pUBGGameModeFilter.getMatch_count()) ? pUBGGameModeFilter.getMatch_count() : null;
        if (match_count != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) match_count);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f88161e.getResources().getDimensionPixelSize(R.dimen.text_size_10)), spannableStringBuilder.length() - match_count.length(), spannableStringBuilder.length(), 33);
        }
        compoundButton.setText(spannableStringBuilder);
    }

    public void i(int i10) {
        this.f88168l = i10;
    }

    public void j(Integer num) {
        this.f88167k = num;
    }
}
