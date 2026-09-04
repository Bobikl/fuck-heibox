package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BasePuzzleInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public class BasePuzzleInfo implements Serializable {

    @d
    public static final Companion Companion = new Companion(null);

    @d
    public static final String PUZZLE_TYPE_COLOR = "color";

    @d
    public static final String PUZZLE_TYPE_CONTENT_PICTURE = "content_picture";

    @d
    public static final String PUZZLE_TYPE_LABEL = "label";

    @d
    public static final String PUZZLE_TYPE_STATIC_PICTURE = "static_picture";

    @d
    public static final String PUZZLE_TYPE_TEXT = "text";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String can_edit;

    @e
    private HBRectF rect;

    @e
    private String rotation;

    @e
    private String type;

    /* JADX INFO: compiled from: BasePuzzleInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public BasePuzzleInfo() {
        this(null, null, null, null, 15, null);
    }

    public BasePuzzleInfo(@e String str, @e HBRectF hBRectF, @e String str2, @e String str3) {
        this.type = str;
        this.rect = hBRectF;
        this.rotation = str2;
        this.can_edit = str3;
    }

    public /* synthetic */ BasePuzzleInfo(String str, HBRectF hBRectF, String str2, String str3, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : hBRectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50162, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasePuzzleInfo)) {
            return false;
        }
        BasePuzzleInfo basePuzzleInfo = (BasePuzzleInfo) obj;
        return f0.g(basePuzzleInfo.type, this.type) && f0.g(basePuzzleInfo.rect, this.rect) && f0.g(basePuzzleInfo.rotation, this.rotation) && f0.g(basePuzzleInfo.can_edit, this.can_edit);
    }

    @e
    public final String getCan_edit() {
        return this.can_edit;
    }

    @e
    public final HBRectF getRect() {
        return this.rect;
    }

    @e
    public final String getRotation() {
        return this.rotation;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public final void setCan_edit(@e String str) {
        this.can_edit = str;
    }

    public final void setRect(@e HBRectF hBRectF) {
        this.rect = hBRectF;
    }

    public final void setRotation(@e String str) {
        this.rotation = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }
}
