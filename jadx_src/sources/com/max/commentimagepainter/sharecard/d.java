package com.max.commentimagepainter.sharecard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.commentimagepainter.R;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CardViewHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ImageView f65363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ImageView f65364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ImageView f65365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final CardImageView f65366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final ImageView f65367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final ImageView f65368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final TextView f65369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final TextView f65370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final TextView f65371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final TextView f65372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final TextView f65373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final ImageView f65374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final TextView f65375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final TextView f65376o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d View itemView) {
        super(itemView);
        f0.p(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.iv_background);
        f0.o(viewFindViewById, "findViewById(...)");
        this.f65363b = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R.id.base_card_view);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f65364c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R.id.cover_card_view);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.f65365d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R.id.card_view);
        f0.o(viewFindViewById4, "findViewById(...)");
        this.f65366e = (CardImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R.id.card_gif_view);
        f0.o(viewFindViewById5, "findViewById(...)");
        this.f65367f = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R.id.iv_user_avatar);
        f0.o(viewFindViewById6, "findViewById(...)");
        this.f65368g = (ImageView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R.id.tv_user_name);
        f0.o(viewFindViewById7, "findViewById(...)");
        this.f65369h = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R.id.tv_desc_0);
        f0.o(viewFindViewById8, "findViewById(...)");
        this.f65370i = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R.id.tv_value_0);
        f0.o(viewFindViewById9, "findViewById(...)");
        this.f65371j = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R.id.tv_desc_1);
        f0.o(viewFindViewById10, "findViewById(...)");
        this.f65372k = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R.id.tv_value_1);
        f0.o(viewFindViewById11, "findViewById(...)");
        this.f65373l = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R.id.iv_game_name_background);
        f0.o(viewFindViewById12, "findViewById(...)");
        this.f65374m = (ImageView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R.id.tv_game_name);
        f0.o(viewFindViewById13, "findViewById(...)");
        this.f65375n = (TextView) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R.id.tv_card_id);
        f0.o(viewFindViewById14, "findViewById(...)");
        this.f65376o = (TextView) viewFindViewById14;
    }

    @dl.d
    public final ImageView a() {
        return this.f65364c;
    }

    @dl.d
    public final ImageView b() {
        return this.f65367f;
    }

    @dl.d
    public final CardImageView d() {
        return this.f65366e;
    }

    @dl.d
    public final ImageView g() {
        return this.f65365d;
    }

    @dl.d
    public final ImageView h() {
        return this.f65363b;
    }

    @dl.d
    public final ImageView i() {
        return this.f65374m;
    }

    @dl.d
    public final TextView j() {
        return this.f65376o;
    }

    @dl.d
    public final TextView k() {
        return this.f65370i;
    }

    @dl.d
    public final TextView l() {
        return this.f65372k;
    }

    @dl.d
    public final TextView m() {
        return this.f65375n;
    }

    @dl.d
    public final TextView n() {
        return this.f65371j;
    }

    @dl.d
    public final TextView o() {
        return this.f65373l;
    }

    @dl.d
    public final ImageView p() {
        return this.f65368g;
    }

    @dl.d
    public final TextView q() {
        return this.f65369h;
    }
}
