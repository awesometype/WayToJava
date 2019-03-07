# WayToJava

``

* 忽略 */.idea/

```
git忽略的原理： git设置本地忽略必须保证git的远程仓库分支上没有这个要忽略的文件，如果远程分支上存在这个文件，本地在设置ignore

将不起作用。


所以一般是在.gitignore 文件里面加入  .idea/ workspace.xml 即可，但是如果你在这样做之前已经将此文件提交到了git远程仓库，那就需要执行以下命令了：

git  rm -r --cached .idea

```
