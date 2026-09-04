package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: compiled from: AppCompatDrawableManager.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2781b = "AppCompatDrawableManag";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f2782c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final PorterDuff.Mode f2783d = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static f f2784e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m0 f2785a;

    /* JADX INFO: compiled from: AppCompatDrawableManager.java */
    public class a implements m0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f2786a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f2787b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f2788c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f2789d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f2790e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f2791f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@androidx.annotation.n0 Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@androidx.annotation.n0 Context context, @androidx.annotation.l int i10) {
            int iD = s0.d(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{s0.f2924c, s0.f2927f, s0.f2925d, s0.f2931j}, new int[]{s0.c(context, R.attr.colorButtonNormal), androidx.core.graphics.f0.t(iD, i10), androidx.core.graphics.f0.t(iD, i10), i10});
        }

        private ColorStateList i(@androidx.annotation.n0 Context context) {
            return h(context, s0.d(context, R.attr.colorAccent));
        }

        private ColorStateList j(@androidx.annotation.n0 Context context) {
            return h(context, s0.d(context, R.attr.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = R.attr.colorSwitchThumbNormal;
            ColorStateList colorStateListF = s0.f(context, i10);
            if (colorStateListF == null || !colorStateListF.isStateful()) {
                iArr[0] = s0.f2924c;
                iArr2[0] = s0.c(context, i10);
                iArr[1] = s0.f2928g;
                iArr2[1] = s0.d(context, R.attr.colorControlActivated);
                iArr[2] = s0.f2931j;
                iArr2[2] = s0.d(context, i10);
            } else {
                int[] iArr3 = s0.f2924c;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListF.getColorForState(iArr3, 0);
                iArr[1] = s0.f2928g;
                iArr2[1] = s0.d(context, R.attr.colorControlActivated);
                iArr[2] = s0.f2931j;
                iArr2[2] = colorStateListF.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@androidx.annotation.n0 m0 m0Var, @androidx.annotation.n0 Context context, @androidx.annotation.q int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableJ = m0Var.j(context, R.drawable.abc_star_black_48dp);
            Drawable drawableJ2 = m0Var.j(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = f.f2783d;
            }
            drawable.setColorFilter(f.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.m0.f
        public Drawable a(@androidx.annotation.n0 m0 m0Var, @androidx.annotation.n0 Context context, int i10) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, R.drawable.abc_cab_background_internal_bg), m0Var.j(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (i10 == R.drawable.abc_ratingbar_material) {
                return l(m0Var, context, R.dimen.abc_star_big);
            }
            if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                return l(m0Var, context, R.dimen.abc_star_medium);
            }
            if (i10 == R.drawable.abc_ratingbar_small_material) {
                return l(m0Var, context, R.dimen.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.f
        public ColorStateList b(@androidx.annotation.n0 Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return b0.a.a(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return b0.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                return k(context);
            }
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return g(context);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return i(context);
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return b0.a.a(context, R.color.abc_tint_spinner);
            }
            if (f(this.f2787b, i10)) {
                return s0.f(context, R.attr.colorControlNormal);
            }
            if (f(this.f2790e, i10)) {
                return b0.a.a(context, R.color.abc_tint_default);
            }
            if (f(this.f2791f, i10)) {
                return b0.a.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return b0.a.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.f
        public PorterDuff.Mode c(int i10) {
            if (i10 == R.drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.f
        public boolean d(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Drawable drawable) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int i11 = R.attr.colorControlNormal;
                m(drawableFindDrawableByLayerId, s0.d(context, i11), f.f2783d);
                m(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), s0.d(context, i11), f.f2783d);
                m(layerDrawable.findDrawableByLayerId(android.R.id.progress), s0.d(context, R.attr.colorControlActivated), f.f2783d);
                return true;
            }
            if (i10 != R.drawable.abc_ratingbar_material && i10 != R.drawable.abc_ratingbar_indicator_material && i10 != R.drawable.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(android.R.id.background), s0.c(context, R.attr.colorControlNormal), f.f2783d);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
            int i12 = R.attr.colorControlActivated;
            m(drawableFindDrawableByLayerId2, s0.d(context, i12), f.f2783d);
            m(layerDrawable2.findDrawableByLayerId(android.R.id.progress), s0.d(context, i12), f.f2783d);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        /* JADX WARN: Code duplicated, block: B:23:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.f
        public boolean e(@androidx.annotation.n0 Context context, int i10, @androidx.annotation.n0 Drawable drawable) {
            int iRound;
            boolean z10;
            PorterDuff.Mode mode = f.f2783d;
            boolean zF = f(this.f2786a, i10);
            int i11 = android.R.attr.colorBackground;
            if (zF) {
                i11 = R.attr.colorControlNormal;
            } else if (f(this.f2788c, i10)) {
                i11 = R.attr.colorControlActivated;
            } else {
                if (!f(this.f2789d, i10)) {
                    if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        i11 = android.R.attr.colorForeground;
                        iRound = Math.round(40.8f);
                        z10 = true;
                    } else if (i10 != R.drawable.abc_dialog_material_background) {
                        iRound = -1;
                        z10 = false;
                        i11 = 0;
                    }
                    if (z10) {
                        return false;
                    }
                    if (b0.a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(f.e(s0.d(context, i11), mode));
                    if (iRound != -1) {
                        drawable.setAlpha(iRound);
                    }
                    return true;
                }
                mode = PorterDuff.Mode.MULTIPLY;
            }
            iRound = -1;
            z10 = true;
            if (z10) {
                return false;
            }
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(f.e(s0.d(context, i11), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }
    }

    public static synchronized f b() {
        if (f2784e == null) {
            i();
        }
        return f2784e;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return m0.l(i10, mode);
    }

    public static synchronized void i() {
        if (f2784e == null) {
            f fVar = new f();
            f2784e = fVar;
            fVar.f2785a = m0.h();
            f2784e.f2785a.u(new a());
        }
    }

    static void j(Drawable drawable, v0 v0Var, int[] iArr) {
        m0.w(drawable, v0Var, iArr);
    }

    public synchronized Drawable c(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        return this.f2785a.j(context, i10);
    }

    synchronized Drawable d(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, boolean z10) {
        return this.f2785a.k(context, i10, z10);
    }

    synchronized ColorStateList f(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        return this.f2785a.m(context, i10);
    }

    public synchronized void g(@androidx.annotation.n0 Context context) {
        this.f2785a.s(context);
    }

    synchronized Drawable h(@androidx.annotation.n0 Context context, @androidx.annotation.n0 g1 g1Var, @androidx.annotation.v int i10) {
        return this.f2785a.t(context, g1Var, i10);
    }

    boolean k(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10, @androidx.annotation.n0 Drawable drawable) {
        return this.f2785a.x(context, i10, drawable);
    }
}
