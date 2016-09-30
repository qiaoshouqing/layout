# Android布局
> Layout对于迅速的搭建界面和提高界面在不同分辨率的屏幕上的适应性具有很大的作用。这里简要介绍Android的Layout和研究一下它的实现。

Android有Layout：LinearLayout、TableLayout、RelativeLayout、FrameLayout、GridLayout、AbsoluteLayout


## 共有的XML属性：
* layout_width
* layout_height

> (1)和(2)用来确定放入Layout中的View的宽度和高度.它们的可能取值：fill_parent，wrap_content或者固定的值。

* layout_marginLeft　　 paddingLeft
* layout_marginTop　　 paddingTop
* layout_marginRight　　 paddingRight
* layout_marginBottom　　 paddingBottom
* layout_margin　　 padding

> (3)(4)(5)(6)是放入Layout中的View期望它能够和Layout的边界或者其他View之间能够相距一段距离。

* layout_gravity　　 属性有top、bottom、left、right、center_vertical、fill_vertical、center_horizontal、fill_horizontal、center、fill、clip_vertical、clip_honrizontal。

> 用来确定View在Layout中的停靠位置。

#### paddingLeft与layout_marginLeft的区别：
	padding是控件的内容相对控件的边缘的边距。如果是一个控件的话那么就是，控件内容相对于控件边缘的距离。但是在父控件中设置，那么就是子控件相对于父控件边缘的距离。

	layout_margin是控件边缘相对父空间的边距。这个要分布局，如果是线性布局，里面的空间一个接一个排的话，那么会是和下一个控件的距离。如果是相对布局不设置控件之间的关系会只和父控件产生边距。

#### gravity和layout_gravity区别
	gravity属性是对该view里的内容或者该view的子view关于方向设定。比如一个button里面的text.  你可以设置该text在view的靠左，靠右等位置．该属性就干这个。或者在最外层设置一下水平居中，该view的子view就会全部水平居中。

	layout_gravity是用来设置该view相对与起父view 的位。比如一个button 在linearlayout里，你想把该button放在靠左靠右等位置就可以通过该属性设置。

## FrameLayout
> FrameLayout是最简单的Layout，就只具有这些属性。一层层往上糊的布局。

## LinearLayout
* layout_weight
> 用于在LinearLayout中把所有子View排布之后的剩余空间，按照它们的layout_weight分配给各个拥有这个属性的View。

* orientation
> 设置线性布局的方向，有horizontal、vertical两个属性。

## RelativeLayout
* layout_alignParentBottom    当前控件低端与父控件的低端对齐(重合）
* layout_alignParentLeft        当前控件左端与父控件的左端对齐(重合）
* layout_alignParentRight      当前控件右端与父控件的右端对齐(重合）
* layout_alignParentTop        当前控件上端与父控件的上端对齐(重合）


* layout_centerHorizontal      当前控件位于父控件的横向中间位置（水平方向上的中间）
* layout_centerInParent        当前控件位于父控件的纵横向中间位置（垂直方向上的中间）
* layout_centerVertical          当前控件位于父控件的纵向中间位置（平面上的正中间）


* layout_above             使当前控件位于给出id控件的上方
* layout_below             使当前控件位于给出id控件的下方
* layout_toLeftOf          使当前控件位于给出id控件的左侧
* layout_toRightOf        使当前控件位于给出id控件的右侧


* layout_alignBottom     使当前控件与给出id控件的底部重合(注意可用和给出id控件来对齐）
* layout_alignLeft          使当前控件与给出id控件的左边重合
* layout_alignRight        使当前控件与给出id控件的右边重合
* layout_alignTop          使当前控件与给出id控件的顶部重合
* layout_alignBaseline    使当前控件的BaseLine与给出id控件t的BaseLine重合，这个主要用于Label或者其他包含文本的widgets。

## AbsoluteLayout
* layout_x
* layout_y

## GridLayout
* columnCount          设置该网格的列数量
* rowCount　　          设置该网格的行数量
* layout_column　　     设置该子组件在gridlayout的第几列
* layout_columnSpan   设置该子组件在gridlayout横向上跨几行
* layout_gravity　　     设置该子组件采用何种方式占据该网格的空间
* layout_row                设置该子组件在gridlayout的第几行
* layout_rowSpawn      设置该子组件在gridlayout纵向上跨几行


##  TableLayout
> TableLayout的行TableRow是一个横向的（horizontal）的LinearLayout

* collapseColumns　　设置需要被隐藏的列的列序号
* shrinkColumns        设置允许被收缩的列的列序号
* stretchColumns       设置允许被拉伸的列的列序号

> (35)到(36)是tablelayout为其子控件设置收缩、拉伸以至于完全适应空间。可以设置多个列序号，用逗号分开。


----

#### TableLayout和GridLayout的区别
	TableLayout本身继承于LinearLayout，所以本质还是线性布局，并不能控制显示多少行，显示完后面的就显示不出了。如果单独一个控件会独占一行。如果想在一行里放多个控件，就把多个控件放在TableRow里，一个TableRow是一行。

	GridLayout可以把容器划分为rows*columns个网格，每个网格可以放置一个组件，除此之外还能设置一个组件可以跨越多少行、多少列。

	GridLayout是很自由的。如果说要做一个格子类的页面，GridLayout是优于TableLayout的。

#### 声明

* 转载自http://www.cnblogs.com/playing/archive/2011/04/07/2008620.html 并做少量添加
