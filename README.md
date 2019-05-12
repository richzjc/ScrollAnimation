# ScrollAnimation
Scrollview 滑动的时候可以动态的给指定的view添加补间动画

---

### 首先看一下效果图

![](http://g.recordit.co/JnxbxMxrqF.gif)

效果图看起来比较卡顿， 想看实际效果图 可以把项目拉下来自己运行一把看看效果图。

###  具体的使用流程

在项目的根build.gradle文件中添加：
    
     maven { url 'https://dl.bintray.com/richzjc/maven' }
     
然后在需要引用这个库的module的build.gralde文件中添加

    implementation 'com.richzjc:scrollanimation:1.0.0' 
    

### 