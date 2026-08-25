# HeyBoxHook

小黑盒 LSPosed 模块，使用现代 Xposed API（API 102）开发。

当前版本：`0.7.0`

主要功能：

- 首页隐藏底部发布按钮
- 全局广告净化二级设置（信息流、首页/页内、页面横幅、商城底栏可独立选择）
- 独立开屏广告跳过
- 禁止读取剪贴板口令
- 分享任务自动完成及任务结果提示
- 外部浏览器打开普通网页链接
- 禁止推荐流视频/GIF 自动播放
- 回前台不自动刷新（保留签到同步）
- 全屏图片查看器自动加载原图，可选仅 Wi-Fi 自动加载
- 仅对帖子正文渲染器强制开启文字选择与复制
- 版本号与版本检测相关适配
- 旧版本升级提示弹窗抑制
- 启动后自动任务请求与失败重试
- 多任务静默刷新防抖和热路径缓存
- 小黑盒宿主进程内嵌设置页面与直接 Hook 自检

全部功能默认关闭；修改开关后重启小黑盒生效。关闭的功能不会安装对应 Hook。
设置页面直接运行在小黑盒进程中，不启动模块 Activity，不发生跨应用跳转，也不
注册模块服务或 Provider。配置保存在小黑盒私有 SharedPreferences；首次升级会将
0.6.x 的 LSPosed Remote Preferences 只读迁移一次。自检在同一进程直接读取 Hook
状态，不发送广播、不写心跳、不进行后台轮询；全部功能关闭时，首页启动路径不
安装对应功能 Hook。

## 构建

使用 Android Studio 或已安装的 Gradle 环境执行：

```powershell
gradle :app:assembleRelease --no-daemon
```

生成的 APK 位于：

```text
app/build/outputs/apk/release/app-release.apk
```

本仓库只跟踪源代码、资源和构建配置，不提交 `build`、`.gradle`、本地 SDK 配置和 APK 文件。
