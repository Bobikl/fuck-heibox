package dev.heybox.hook;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/** 主线程调用；管理器不通过 Dialog -> Activity 强引用链保留页面。 */
final class DialogSessions<O, D> {
    interface Host<O, D> {
        boolean usable(O owner);
        D create(O owner, Runnable dismissed);
        void show(D dialog);
        void dismiss(D dialog);
        void observe();
        void stopObserving();
    }

    private static final class Session<O, D> {
        final Object token;
        final WeakReference<O> owner;
        final WeakReference<D> dialog;
        Session(Object token, O owner, D dialog) {
            this.token = token;
            this.owner = new WeakReference<>(owner);
            this.dialog = new WeakReference<>(dialog);
        }
    }

    private final Host<O, D> host;
    private final List<Session<O, D>> sessions = new ArrayList<>();
    private boolean observing;

    DialogSessions(Host<O, D> host) {
        this.host = host;
    }

    void open(O owner) {
        prune();
        if (!host.usable(owner)) {
            return;
        }
        for (Session<O, D> session : sessions) {
            if (session.owner.get() == owner) {
                return;
            }
        }
        // 独立 token 防止旧 Dialog 的延迟 onDismiss 删除同一 Activity 的新窗口。
        Object token = new Object();
        D dialog = host.create(owner, () -> removeToken(token));
        sessions.add(new Session<>(token, owner, dialog));
        try {
            if (!observing) {
                host.observe();
                observing = true;
            }
            host.show(dialog);
        } catch (RuntimeException exception) {
            removeToken(token);
            try {
                host.dismiss(dialog);
            } catch (RuntimeException cleanup) {
                exception.addSuppressed(cleanup);
            }
            throw exception;
        }
    }

    private void removeToken(Object token) {
        sessions.removeIf(session -> session.token == token);
        stopIfEmpty();
    }

    void destroyed(O owner) {
        // 先移除关联再 dismiss，避免同步/异步 onDismiss 与迭代发生冲突。
        List<D> dialogs = new ArrayList<>();
        sessions.removeIf(session -> {
            if (session.owner.get() != owner) {
                return false;
            }
            D dialog = session.dialog.get();
            if (dialog != null) {
                dialogs.add(dialog);
            }
            return true;
        });
        prune();
        for (D dialog : dialogs) {
            host.dismiss(dialog);
        }
    }

    private void prune() {
        sessions.removeIf(session -> session.owner.get() == null || session.dialog.get() == null);
        stopIfEmpty();
    }

    private void stopIfEmpty() {
        if (observing && sessions.isEmpty()) {
            observing = false;
            host.stopObserving();
        }
    }
}
