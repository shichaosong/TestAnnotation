# TestAnnotation
编译期注解测试 demo. 主要为了在 Android 中使用 AbstractProcessor, 类似 ButterNife 那样的 project.

下面都是网上找到的一些好的博客, 感谢作者们的无私分享. 如有有侵权, 请提醒我, 我马上删除.

http://www.cnblogs.com/peida/archive/2013/04.html

告别繁琐的findViewById，在Activity中使用注解。
http://www.jianshu.com/p/bc70d5d71a61

最新ButterKnife框架原理

https://bxbxbai.github.io/2016/03/12/how-butterknife-works/

github 的地址
http://jakewharton.github.io/butterknife/

如何编写编译时处理 android 注解 ?

https://segmentfault.com/a/1190000002785541

AndroidSutdio 编译时自动生成源代码

http://www.septenary.cn/2015/12/19/AndroidSutdio-%E7%BC%96%E8%AF%91%E6%97%B6%E8%87%AA%E5%8A%A8%E7%94%9F%E6%88%90%E6%BA%90%E4%BB%A3%E7%A0%81/

Eclipse 想下如何编写
http://blog.csdn.net/lmj623565791/article/details/43452969

Android studio 下如何编写
http://www.cnblogs.com/avenwu/p/4173899.html

和上面中文翻译的一样, 都是老外写的例子: PrintMe
http://programmaticallyspeaking.com/playing-with-java-annotation-processing.html

和上面的例子很像, 但是略有不同啊. 但是文章最后说明了如何 build 出一个 jar, 上面的博客中都没有说.
http://yzx41099298.github.io/2015/03/26/apt/

Android公共技术点之二-Annotation Processing Tool
http://yeungeek.com/2016/04/27/Android%E5%85%AC%E5%85%B1%E6%8A%80%E6%9C%AF%E7%82%B9%E4%B9%8B%E4%BA%8C-Annotation-Processing-Tool/?utm_source=itdadao&utm_medium=referral
http://qiushao.net/2015/07/07/Annotation-Processing-Tool%E8%AF%A6%E8%A7%A3/

这个介绍了如何调试 processor
http://brianattwell.com/android-annotation-processing-pojo-string-generator/

介绍的
http://www.race604.com/annotation-processing/

注意, Intellij, Eclipse 都有一个设置项, 需要开启 processing
http://blog.csdn.net/terrytowne/article/details/18214373

[译]注解处理Annotation Processing—如何开发一个依赖注入框架

http://muyaan.com/archives/22.html

http://www.voidcn.com/blog/chuyouyinghe/article/p-5754313.html

介绍了如何把我们自己开发的 jar 包传到 Jcenter 仓库中, 也介绍了 Jcenter 和 MavenCenter 等.
http://www.devtf.cn/?p=760

android 原生使用 AbstractProcess 的工程的实例:
songshichao-OptiPlex-9010:/backup/dev-code/x5-m/frameworks/data-binding