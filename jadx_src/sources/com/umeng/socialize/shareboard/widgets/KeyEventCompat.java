package com.umeng.socialize.shareboard.widgets;

import android.annotation.TargetApi;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes4.dex */
public class KeyEventCompat {
    private static final KeyEventVersionImpl IMPL = new HoneycombKeyEventVersionImpl();

    public static class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;

        private BaseKeyEventVersionImpl() {
        }

        private static int metaStateFilterDirectionalModifiers(int i10, int i11, int i12, int i13, int i14) {
            int i15;
            boolean z10 = (i11 & i12) != 0;
            int i16 = i13 | i14;
            boolean z11 = (i11 & i16) != 0;
            if (z10) {
                if (z11) {
                    throw new IllegalArgumentException("bad arguments");
                }
                i15 = ~i16;
            } else {
                if (!z11) {
                    return i10;
                }
                i15 = ~i12;
            }
            return i10 & i15;
        }

        private int normalizeMetaState(int i10) {
            if ((i10 & 192) != 0) {
                i10 |= 1;
            }
            if ((i10 & 48) != 0) {
                i10 |= 2;
            }
            return i10 & 247;
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int i10, int i11) {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i10) & 247, i11, 1, 64, 128), i11, 2, 16, 32) == i11;
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int i10) {
            return (normalizeMetaState(i10) & 247) == 0;
        }
    }

    @TargetApi(11)
    public static class HoneycombKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        private HoneycombKeyEventVersionImpl() {
            super();
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl, com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int i10, int i11) {
            return KeyEvent.metaStateHasModifiers(i10, i11);
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl, com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int i10) {
            return KeyEvent.metaStateHasNoModifiers(i10);
        }
    }

    public interface KeyEventVersionImpl {
        boolean metaStateHasModifiers(int i10, int i11);

        boolean metaStateHasNoModifiers(int i10);
    }

    KeyEventCompat() {
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i10) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i10);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }
}
