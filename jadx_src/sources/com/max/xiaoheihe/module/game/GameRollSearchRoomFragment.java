package com.max.xiaoheihe.module.game;

import android.os.Bundle;
import android.view.View;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class GameRollSearchRoomFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static GameRollSearchRoomFragment I4(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 33691, new Class[]{Bundle.class}, GameRollSearchRoomFragment.class);
        return patchProxyResultProxy.isSupported ? (GameRollSearchRoomFragment) patchProxyResultProxy.result : new GameRollSearchRoomFragment();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33692, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.layout_sample_fragment_container);
        this.mTitleBar.setTitle(getString(R.string.search_room));
        if (((GameRollRoomListFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            GameRollRoomListFragment gameRollRoomListFragmentJ5 = GameRollRoomListFragment.j5("search", null);
            gameRollRoomListFragmentJ5.setUserVisibleHint(true);
            gameRollRoomListFragmentJ5.setMenuVisibility(true);
            getChildFragmentManager().u().b(R.id.fragment_container, gameRollRoomListFragmentJ5).m();
        }
    }
}
