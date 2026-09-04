package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6PlayerOverviewObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String download_url;
    private List<R6GameQueuesObj> game_queues;
    private List<R6ContentObj> items;
    private String message;
    private String message_time;
    private R6PlayerInfoObj player;
    private R6BindBoxInfoObj r6_bind_box_info;
    private String show_bind_box;

    public String getDownload_url() {
        return this.download_url;
    }

    public List<R6GameQueuesObj> getGame_queues() {
        return this.game_queues;
    }

    public List<R6ContentObj> getItems() {
        return this.items;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage_time() {
        return this.message_time;
    }

    public R6PlayerInfoObj getPlayer() {
        return this.player;
    }

    public R6BindBoxInfoObj getR6_bind_box_info() {
        return this.r6_bind_box_info;
    }

    public String getShow_bind_box() {
        return this.show_bind_box;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public void setGame_queues(List<R6GameQueuesObj> list) {
        this.game_queues = list;
    }

    public void setItems(List<R6ContentObj> list) {
        this.items = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessage_time(String str) {
        this.message_time = str;
    }

    public void setPlayer(R6PlayerInfoObj r6PlayerInfoObj) {
        this.player = r6PlayerInfoObj;
    }

    public void setR6_bind_box_info(R6BindBoxInfoObj r6BindBoxInfoObj) {
        this.r6_bind_box_info = r6BindBoxInfoObj;
    }

    public void setShow_bind_box(String str) {
        this.show_bind_box = str;
    }
}
