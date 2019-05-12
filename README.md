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
    

### 定义的属性有如下： 

    <declare-styleable name="DiscrollView_LayoutParams">
        <attr name="discrollve_alpha" format="boolean"/>
        <attr name="discrollve_scaleX" format="boolean"/>
        <attr name="discrollve_scaleY" format="boolean"/>
        <attr name="discrollve_fromBgColor" format="color"/>
        <attr name="discrollve_toBgColor" format="color"/>
        <attr name="discrollve_translation"/>
    </declare-styleable>

    <attr name="discrollve_translation">
        <flag name="fromTop" value="0x01" />
        <flag name="fromBottom" value="0x02" />
        <flag name="fromLeft" value="0x04" />
        <flag name="fromRight" value="0x08" />
    </attr>

包括透明度渐变， 缩放动画 ， 颜色渐变  以及平衡动画

### 如何去使用

1. scrollView 必须用MyScrollView 
2. MyScrollView 的子控件必须用MyLinearLayout

具体的代码使用如下

    <com.richzjc.library.MyScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent">
    
            <com.richzjc.library.MyLinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">
    
                <ImageView
                    android:layout_width="match_parent"
                    android:layout_height="662dp"
                    android:scaleType="centerCrop"
                    android:src="@mipmap/tb_bg" />
    
                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:background="#007788"
                    android:fontFamily="serif"
                    android:gravity="center"
                    android:padding="25dp"
                    android:text="带上您的行李箱，准备shopping！"
                    android:textColor="@android:color/black"
                    android:textSize="25sp"
                    discrollve:discrollve_alpha="true"
                    discrollve:discrollve_scaleY="true" />
    
                <ImageView
                    android:layout_width="200dp"
                    android:layout_height="120dp"
                    android:layout_gravity="top|right"
                    android:src="@drawable/baggage"
                    discrollve:discrollve_alpha="true"
                    discrollve:discrollve_translation="fromLeft|fromBottom" />
    
                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:fontFamily="serif"
                    android:gravity="center"
                    android:padding="25dp"
                    android:text="准备好相机，这里有你想象不到的惊喜！"
                    android:textColor="@android:color/black"
                    android:textSize="25sp"
                    discrollve:discrollve_fromBgColor="#ff0000"
                    discrollve:discrollve_toBgColor="#88EE66" />
    
    
                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:background="#D97C1F"
                    android:fontFamily="serif"
                    android:gravity="center"
                    android:padding="20dp"
                    android:text="这次淘宝造物节真的来了，我们都在造，你造吗？\n
    							7月22日-7月24日\n
    							上海世博展览馆\n
    							在现场，我们造什么？"
                    android:textSize="23sp"
                    discrollve:discrollve_alpha="true"
                    discrollve:discrollve_translation="fromBottom" />
    
                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:layout_margin="20dp"
                    android:src="@drawable/sweet"
                    discrollve:discrollve_scaleX="true"
                    discrollve:discrollve_scaleY="true" />
    
                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_margin="20dp"
                    android:src="@drawable/shoes"
                    discrollve:discrollve_alpha="true"
                    discrollve:discrollve_scaleX="true"
                    discrollve:discrollve_scaleY="true"
                    discrollve:discrollve_translation="fromLeft|fromBottom" />
            </com.richzjc.library.MyLinearLayout>
    
    </com.richzjc.library.MyScrollView>
    
    
需要用到动画的控件就添加这个属性，不需要用到动画的控件 不添加此自定义属性即可

### 提问

1. android系统的控件是如何识别我们自定义的属性的
