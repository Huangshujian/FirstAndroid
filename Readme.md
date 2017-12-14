
### title: Androidstudio 实验一

#### 利用线性布局实现如下界面
##### 实验代码
	<pre><code>
    <?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:background="#000000"
    android:layout_height="match_parent">
    <!--match_parent g跟父类一样 占满整个页面  -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        android:orientation="horizontal">

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="2dp"
            android:text="ONE,ONE"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@drawable/button"
            android:textColor="#fffeee"
            android:layout_margin="2dp"
            android:text="ONE,TWO" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="2dp"
            android:background="@drawable/button"
            android:textColor="#fffeee"
            android:text="ONE,THREE" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="2dp"
            android:background="@drawable/button"
            android:textColor="#fffeee"
            android:text="ONE,FOUR"
            />
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:height="100dp"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="TWO,ONE"
            android:layout_margin="2dp"/>

        <Button
            android:layout_width="90dp"
            android:layout_height="wrap_content"
            android:height="80dp"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="TWO,TWO"
            android:layout_margin="2dp"/>

        <Button
            android:layout_width="110dp"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="TWO,THREE"
            android:layout_margin="2dp"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:height="60dp"
            android:background="@drawable/button"
            android:text="TWO,FOUR"
            android:layout_margin="2dp"/>

    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:height="90dp"
            android:background="@drawable/button"
            android:text="ONE"
            android:layout_margin="2dp"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="two"
            android:layout_margin="2dp"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@drawable/button"
            android:textColor="#fffeee"
            android:height="70dp"
            android:text="THREE"
            android:layout_margin="2dp"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="FOUR"
            android:layout_margin="2dp"/>
    </LinearLayout>
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:height="100dp"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="ONE"
            android:layout_margin="2dp"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:width="100dp"
            android:height="50dp"
            android:background="@drawable/button"
            android:text="two"
            android:layout_margin="2dp"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:height="70dp"
            android:width="100dp"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="THREE"
            android:layout_margin="2dp"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#fffeee"
            android:background="@drawable/button"
            android:text="FOUR"
            android:layout_margin="2dp"/>

    </LinearLayout>
	</LinearLayout>
    </code></pre>
##### 实验结果
![] [https://github.com/Huangshujian/FirstAndroid/blob/master/images/linner.png]
#### 利用相对布局实现如下界面
##### 实验代码
	<pre><code><?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <Button
        android:id="@+id/Left"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:background="#0156FF"
        android:text="BULE" />
    <Button
        android:id="@+id/Right"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:background="#fff000"
        android:text="YELLOW" />
    <Button
        android:id="@+id/Center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:background="#FF0116"
        android:text="RED" />

    <!-- 参照物为Left的按钮-->
    <!-- 以中间小按钮为参照物-->
    <Button
        android:id="@+id/Butten3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="55dp"
        android:layout_below="@+id/Left"
        android:layout_centerHorizontal="true"
        android:text="GREEN"
        android:background="#30FE03"
        />
    <!-- 在中间按钮的左边，并且开始于中间按钮在BULE按钮的下面-->
    <!-- toStratOf要跟toLeftOf一起用？？
         toEndOf要跟toRightOf一起用？？
    -->
    <Button
        android:id="@+id/Butten1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="55dp"
        android:layout_below="@+id/Left"
        android:layout_toLeftOf="@+id/Butten3"
        android:layout_toStartOf="@+id/Butten3"
        android:text="GREY"
        android:background="#8E908E"
        />
    <Button
        android:id="@+id/Butten2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/Left"
        android:layout_marginTop="55dp"
        android:layout_toEndOf="@+id/Butten3"
        android:layout_toRightOf="@+id/Butten3"
        android:background="#12D8EE"
        android:text="WEITH" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="460dp"
        android:text="VIOLET"
        android:background="#FF01EA"
        />
	</RelativeLayout>
	</code></pre>
##### 实验结果
![] [https://github.com/Huangshujian/FirstAndroid/blob/master/images/relative.png]
#### 利用表格布局实现如下界面
##### 实验代码
	<pre><code>
    <?xml version="1.0" encoding="utf-8"?>
	<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"

    android:stretchColumns="1">

    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TextView
            android:layout_gravity="left"
            android:padding="3dp"
            android:text="复制" />

        <TextView
            android:layout_gravity="right"
            android:padding="3dp"
            android:text="Ctrl+C" />
    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TextView
            android:layout_gravity="left"
            android:padding="3dp"
            android:text="打开" />

        <TextView
            android:layout_gravity="right"
            android:padding="3dp"
            android:text="Ctrl+O" />
    </TableRow>
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TextView
            android:layout_gravity="left"
            android:padding="3dp"
            android:text="粘贴" />

        <TextView
            android:layout_gravity="right"
            android:padding="3dp"
            android:text="Ctrl+V" />
    </TableRow>
	</TableLayout>
	</code></pre>
##### 实验结果
![] [https://github.com/Huangshujian/FirstAndroid/blob/master/images/table.png]

